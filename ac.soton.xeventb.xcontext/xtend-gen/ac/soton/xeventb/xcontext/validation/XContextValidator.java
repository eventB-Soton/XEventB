/**
 * Copyright (c) 2017,2021 University of Southampton.
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xcontext.validation;

import ac.soton.xeventb.common.IValidationIssueCode;
import ac.soton.xeventb.xcontext.validation.AbstractXContextValidator;
import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.core.IAxiom;
import org.eventb.core.ICarrierSet;
import org.eventb.core.IConstant;
import org.eventb.core.IContextRoot;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.EventBPredicate;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;
import org.eventb.emf.persistence.EventBEMFUtils;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinMarkerUtil;
import org.rodinp.keyboard.core.RodinKeyboardCore;

/**
 * <p>
 * XContext validator, provides custom validation rules for the XContexts.
 * </p>
 * 
 * @author dana - Initial Implementation
 * @author htson - Added support for lifting Rodin issues into XContext
 * @version 1.1
 * @since 1.0
 * @see XContextMarkerModule
 */
@SuppressWarnings("all")
public class XContextValidator extends AbstractXContextValidator {
  /**
   * Check to ensure that the context name match the name of the file.
   * 
   * @author dana
   * @author htson - Renamed from "checkMachineName"
   * @since 2.0
   */
  @Check
  public void checkContextName(final Context ctx) {
    final Resource res = ctx.eResource();
    final String fileName = res.getURI().lastSegment().toString();
    final String ctxName = fileName.substring(0, fileName.indexOf("."));
    String _name = ctx.getName();
    boolean _notEquals = (!Objects.equal(ctxName, _name));
    if (_notEquals) {
      this.error("Context name should be the same as the file name", null);
    }
  }
  
  /**
   * Check for untranslated predicates by comparing the translated string
   * with the predicate. Raise a warning with code
   * {@link IValidationIssueCode#UNTRANSLATE_PREDICATE}. The code is used for
   * providing quick fixes.
   * 
   * @param obj
   * 		an Event-B predicate EObject.
   * @author htson
   * @see IValidationIssueCode
   * @since 2.0
   */
  @Check
  public void untranslatedPredicate(final EventBPredicate obj) {
    final String predicate = obj.getPredicate();
    final String translated = RodinKeyboardCore.translate(predicate);
    boolean _notEquals = (!Objects.equal(predicate, translated));
    if (_notEquals) {
      this.warning(
        ("Untranslated Predicate: " + predicate), obj, 
        CorePackage.Literals.EVENT_BPREDICATE__PREDICATE, 
        IValidationIssueCode.UNTRANSLATED_PREDICATE, predicate, translated);
    }
  }
  
  /**
   * A "Normal" check to clear the markers associated with the Rodin context.
   * This is important as the markers generated as the consequence of
   * @link{#checkRodinMarkers(Context)} are not cleared by when the file is
   * saved (hence they prevent the generator to run).
   * 
   * @author htson
   * @since 2.0
   */
  @Check(CheckType.NORMAL)
  public void clearRodinMarkers(final Context ctx) {
    try {
      final URI uri = ctx.eResource().getURI();
      IWorkspaceRoot _root = ResourcesPlugin.getWorkspace().getRoot();
      String _platformString = uri.toPlatformString(true);
      Path _path = new Path(_platformString);
      final IFile resource = _root.getFile(_path);
      final IMarker[] markers = resource.findMarkers(null, true, IResource.DEPTH_INFINITE);
      for (final IMarker marker : markers) {
        marker.delete();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Empty array of markers.
   * 
   * @since 2.0
   */
  private final IMarker[] NO_MARKER = {};
  
  /**
   * An "expensive" check to convert the Rodin Markers of an input Rodin
   * machine into issues for the corresponding XMachine.
   * 
   * @param mch
   * 			The input Rodini machine
   * 
   * @author htson
   * @since 2.0
   */
  @Check(CheckType.EXPENSIVE)
  public void checkRodinMarkers(final Context ctx) {
    try {
      final IContextRoot ctxRoot = EventBEMFUtils.getRoot(ctx);
      final IMarker[] rodinMarkers = this.findRodinMarkers(ctxRoot);
      for (final IMarker rodinMarker : rodinMarkers) {
        {
          final IRodinElement rodinElement = RodinMarkerUtil.getElement(rodinMarker);
          EObject obj = this.getEObject(ctx, rodinElement);
          if ((obj == null)) {
            obj = ctx;
          }
          this.createIssue(obj, rodinMarker);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Utility method to find all Rodin markers associated with a machine root.
   * @param mchRoot
   * 			The input machine root.
   * 
   * @return An array of the Rodin markers associated with the input machine
   * root.
   * 
   * @author htson
   * @since 2.0
   */
  private IMarker[] findRodinMarkers(final IContextRoot ctxRoot) throws CoreException {
    final IFile resource = ctxRoot.getResource();
    boolean _isAccessible = resource.isAccessible();
    boolean _not = (!_isAccessible);
    if (_not) {
      return this.NO_MARKER;
    }
    return resource.findMarkers(RodinMarkerUtil.RODIN_PROBLEM_MARKER, true, IResource.DEPTH_INFINITE);
  }
  
  /**
   * Method to find the EObject in a machine corresponding to the input Rodin
   * object. This is the "identified" attribute such as "identifier", "label".
   * 
   * @param mch
   * 		The input machine
   * @param rodinElement
   * 			The input Rodin element
   * @return the EObject corresponding to the input Rodin element within the
   *  		input machine or <code>null</code>
   */
  private EObject getEObject(final Context ctx, final IRodinElement rodinElement) {
    try {
      if ((rodinElement instanceof IContextRoot)) {
        return ctx;
      }
      if ((rodinElement instanceof ICarrierSet)) {
        return this.findCarrierSet(ctx, ((ICarrierSet)rodinElement).getIdentifierString());
      }
      if ((rodinElement instanceof IConstant)) {
        return this.findConstant(ctx, ((IConstant)rodinElement).getIdentifierString());
      }
      if ((rodinElement instanceof IAxiom)) {
        return this.findAxiom(ctx, ((IAxiom)rodinElement).getLabel());
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private CarrierSet findCarrierSet(final Context ctx, final String name) {
    final EList<CarrierSet> sets = ctx.getSets();
    for (final CarrierSet set : sets) {
      String _name = set.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        return set;
      }
    }
    return null;
  }
  
  private Constant findConstant(final Context ctx, final String name) {
    final EList<Constant> csts = ctx.getConstants();
    for (final Constant cst : csts) {
      String _name = cst.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        return cst;
      }
    }
    return null;
  }
  
  private Axiom findAxiom(final Context ctx, final String label) {
    final EList<Axiom> axms = ctx.getAxioms();
    for (final Axiom axm : axms) {
      String _name = axm.getName();
      boolean _equals = Objects.equal(_name, label);
      if (_equals) {
        return axm;
      }
    }
    return null;
  }
  
  /**
   * Utility method to create an issue associated with an EObject from a Rodin
   * marker associated with the Rodin element corresponding to the EObject.
   * 
   * @param obj
   * 			The input EObject
   * @param rodinMarker
   * 			The input Rodin marker.
   * @author htson
   * @since 2.0
   */
  private void createIssue(final EObject obj, final IMarker rodinMarker) {
    try {
      final IAttributeType attributeType = RodinMarkerUtil.getAttributeType(rodinMarker);
      final Map<String, Object> attributes = rodinMarker.getAttributes();
      final Object severity = attributes.get(IMarker.SEVERITY);
      Object message = attributes.get(IMarker.MESSAGE);
      EStructuralFeature feature = this.getFeature(obj, attributeType);
      EObject elem = obj;
      if ((feature == null)) {
        elem = this.getContext(obj);
        if ((elem != null)) {
          feature = CorePackage.Literals.EVENT_BNAMED__NAME;
        } else {
          elem = obj;
        }
      } else {
        final int start = RodinMarkerUtil.getCharStart(rodinMarker);
        final int end = RodinMarkerUtil.getCharEnd(rodinMarker);
        if ((start != (-1))) {
          String _plus = (message + " (from ");
          String _plus_1 = (_plus + Integer.valueOf(start));
          String _plus_2 = (_plus_1 + " to ");
          String _plus_3 = (_plus_2 + Integer.valueOf(end));
          String _plus_4 = (_plus_3 + ")");
          message = _plus_4;
        }
      }
      boolean _equals = Objects.equal(severity, Integer.valueOf(IMarker.SEVERITY_ERROR));
      if (_equals) {
        this.error(message.toString(), elem, feature);
      } else {
        boolean _equals_1 = Objects.equal(severity, Integer.valueOf(IMarker.SEVERITY_WARNING));
        if (_equals_1) {
          this.warning(message.toString(), elem, feature);
        } else {
          this.info(message.toString(), elem, feature);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Utility method to get the EStructuralFeature corresponding to an
   * attribute of an input EObject (of some Event-B elements), given the
   * attribute type.
   * 
   * @param obj
   * 			The input EObject
   * @param attributeType
   * 			The input attribute type
   * @return The EStructuralFeature corresponding to the Attribute Type for
   * 			the EObject. If no EStructuralFeature exists, return
   * 			<code>null</code>.
   * 
   * @author htson
   * @since 2.0
   */
  private EStructuralFeature getFeature(final EObject obj, final IAttributeType attributeType) {
    if ((attributeType == null)) {
      return null;
    }
    final String id = attributeType.getId();
    if ((obj instanceof CarrierSet)) {
      boolean _equals = Objects.equal(id, "org.eventb.core.identifier");
      if (_equals) {
        return CorePackage.Literals.EVENT_BNAMED__NAME;
      }
      return null;
    }
    if ((obj instanceof Constant)) {
      boolean _equals_1 = Objects.equal(id, "org.eventb.core.identifier");
      if (_equals_1) {
        return CorePackage.Literals.EVENT_BNAMED__NAME;
      }
      return null;
    }
    if ((obj instanceof Axiom)) {
      boolean _equals_2 = Objects.equal(id, "org.eventb.core.label");
      if (_equals_2) {
        return CorePackage.Literals.EVENT_BNAMED__NAME;
      }
      boolean _equals_3 = Objects.equal(id, "org.eventb.core.predicate");
      if (_equals_3) {
        return CorePackage.Literals.EVENT_BPREDICATE__PREDICATE;
      }
      return null;
    }
    return null;
  }
  
  /**
   * Utility method to get the context of an EObject. Return the Context
   * parent of the input element. Return <code>null</code> if there is no
   * Context containing the input element.
   * 
   * @param obj
   *          The input EObject
   * @author htson
   * @since 2.1
   */
  public EObject getContext(final EObject object) {
    if ((object instanceof EventBObject)) {
      return ((EventBObject)object).getContaining(ContextPackage.Literals.CONTEXT);
    }
    return null;
  }
}
