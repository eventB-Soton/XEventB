/**
 * Copyright (c) 2017,2020 University of Southampton.
 * 
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *    University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xmachine.validation;

import ac.soton.eventb.emf.core.extension.coreextension.Type;
import ac.soton.eventb.emf.core.extension.coreextension.Value;
import ac.soton.eventb.emf.inclusion.EventSynchronisation;
import ac.soton.eventb.emf.inclusion.MachineInclusion;
import ac.soton.xeventb.common.UntranslatedFormulaeValidator;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
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
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eventb.core.IAction;
import org.eventb.core.IEvent;
import org.eventb.core.IGuard;
import org.eventb.core.IInvariant;
import org.eventb.core.IMachineRoot;
import org.eventb.core.IParameter;
import org.eventb.core.IVariable;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBAction;
import org.eventb.emf.core.EventBExpression;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.EventBPredicate;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Parameter;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.core.machine.Variant;
import org.eventb.emf.core.machine.Witness;
import org.eventb.emf.persistence.EventBEMFUtils;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinMarkerUtil;

/**
 * <p>
 * XMachine validator, provides custom validation rules for the xtext machine file.
 * </p>
 * 
 * @author dana - Initial implementation
 * @author htson - Added support for lifting Rodin issues into XMachine
 * @version 1.1
 * @since 1.0
 * @see XMachineMarkerModule
 */
@SuppressWarnings("all")
public class XMachineValidator extends AbstractXMachineValidator {
  /**
   * Object for validating untranslated formulae. This is an implementation of
   * {@link ValidateUntranslatedFormulae} which redirect raising warnings to
   * the method provided by {@link XContextValidator#warning(String, EObject,
   * EStructuralFeature, String, String[])}.
   * 
   * @since 3.0
   */
  @Extension
  private UntranslatedFormulaeValidator validator = new UntranslatedFormulaeValidator() {
    @Override
    protected void warning(final String message, final EObject source, final EStructuralFeature feature, final String code, final String... issueData) {
      XMachineValidator.this.warning(message, source, feature, code, issueData);
    }
  };

  @Check
  public void checkMachineName(final Machine mch) {
    final Resource res = mch.eResource();
    final String fileName = res.getURI().lastSegment().toString();
    final String mchName = fileName.substring(0, fileName.indexOf("."));
    String _name = mch.getName();
    boolean _notEquals = (!Objects.equal(mchName, _name));
    if (_notEquals) {
      this.error("Machine name should be the same as the file name", null);
    }
  }

  /**
   * check the prefix of the event must be one of the prefixes of the included machine
   * that contains the synchronised event
   * 
   * @since 1.0
   */
  @Check
  public void checkEventPrefix(final EventSynchronisation evt) {
    boolean _isEmpty = evt.getPrefix().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final String prefix = evt.getPrefix();
      EObject _eContainer = evt.eContainer().eContainer();
      final Machine mchContainer = ((Machine) _eContainer);
      EList<AbstractExtension> _extensions = mchContainer.getExtensions();
      for (final AbstractExtension ext : _extensions) {
        if ((ext instanceof MachineInclusion)) {
          final EList<Event> events = ((MachineInclusion) ext).getAbstractMachine().getEvents();
          boolean _contains = events.contains(evt.getSynchronisedEvent());
          if (_contains) {
            boolean _contains_1 = ((MachineInclusion) ext).getPrefixes().contains(prefix);
            if (_contains_1) {
              return;
            }
          }
        }
      }
      this.error("Event prefix must be one of the included machine prefixes", null);
    }
  }

  /**
   * Add Prefixing warning if more than one machine is inlcuded
   * the  reason is to avoid event synchronisation problems if machines have the same event name e.g. INITIALISATION
   * 
   * @since 1.0
   */
  @Check
  public void checkMachinePrefix(final Machine mch) {
    final Iterable<MachineInclusion> mchExtensions = Iterables.<MachineInclusion>filter(mch.getExtensions(), MachineInclusion.class);
    int _size = IterableExtensions.size(mchExtensions);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      for (final MachineInclusion inc : mchExtensions) {
        boolean _isEmpty = inc.getPrefixes().isEmpty();
        if (_isEmpty) {
          String _name = inc.getAbstractMachine().getName();
          String _plus = ("Prefixing is not defined for " + _name);
          String _plus_1 = (_plus + 
            ". Possible synchronisation ambiguity. ");
          this.warning(_plus_1, null);
        }
      }
    }
  }

  /**
   * Check the prefix of the event must be one of the prefixes of the included machine
   * that contains the synchronised event
   * 
   * @since 1.0
   */
  @Check
  public void checkEventPrefixEmpty(final EventSynchronisation evt) {
    boolean _isEmpty = evt.getPrefix().isEmpty();
    if (_isEmpty) {
      EObject _eContainer = evt.eContainer().eContainer();
      final Machine mchContainer = ((Machine) _eContainer);
      final Iterable<MachineInclusion> mchIncExtensions = Iterables.<MachineInclusion>filter(mchContainer.getExtensions(), MachineInclusion.class);
      for (final MachineInclusion ext : mchIncExtensions) {
        boolean _contains = ext.getAbstractMachine().getEvents().contains(evt.getSynchronisedEvent());
        if (_contains) {
          boolean _isEmpty_1 = ext.getPrefixes().isEmpty();
          if (_isEmpty_1) {
            return;
          } else {
            this.warning("Prefixing should be applied to the synchronised event.", null);
          }
        }
      }
    }
  }

  /**
   * Empty array of markers.
   * 
   * @since 2.0
   */
  private final IMarker[] NO_MARKER = {};

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
  private IMarker[] findRodinMarkers(final IMachineRoot mchRoot) throws CoreException {
    final IFile resource = mchRoot.getResource();
    boolean _isAccessible = resource.isAccessible();
    boolean _not = (!_isAccessible);
    if (_not) {
      return this.NO_MARKER;
    }
    return resource.findMarkers(RodinMarkerUtil.RODIN_PROBLEM_MARKER, true, IResource.DEPTH_INFINITE);
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
    if ((obj instanceof Variable)) {
      boolean _equals = Objects.equal(id, "org.eventb.core.identifier");
      if (_equals) {
        return CorePackage.Literals.EVENT_BNAMED__NAME;
      }
      return null;
    }
    if ((obj instanceof Invariant)) {
      boolean _equals_1 = Objects.equal(id, "org.eventb.core.label");
      if (_equals_1) {
        return CorePackage.Literals.EVENT_BNAMED__NAME;
      }
      boolean _equals_2 = Objects.equal(id, "org.eventb.core.predicate");
      if (_equals_2) {
        return CorePackage.Literals.EVENT_BPREDICATE__PREDICATE;
      }
      return null;
    }
    if ((obj instanceof Event)) {
      boolean _equals_3 = Objects.equal(id, "org.eventb.core.label");
      if (_equals_3) {
        return CorePackage.Literals.EVENT_BNAMED__NAME;
      }
      return null;
    }
    if ((obj instanceof Parameter)) {
      boolean _equals_4 = Objects.equal(id, "org.eventb.core.identifier");
      if (_equals_4) {
        return CorePackage.Literals.EVENT_BNAMED__NAME;
      }
      return null;
    }
    if ((obj instanceof Guard)) {
      boolean _equals_5 = Objects.equal(id, "org.eventb.core.label");
      if (_equals_5) {
        return CorePackage.Literals.EVENT_BNAMED__NAME;
      }
      boolean _equals_6 = Objects.equal(id, "org.eventb.core.predicate");
      if (_equals_6) {
        return CorePackage.Literals.EVENT_BPREDICATE__PREDICATE;
      }
      return null;
    }
    if ((obj instanceof Action)) {
      boolean _equals_7 = Objects.equal(id, "org.eventb.core.label");
      if (_equals_7) {
        return CorePackage.Literals.EVENT_BNAMED__NAME;
      }
      boolean _equals_8 = Objects.equal(id, "org.eventb.core.assignment");
      if (_equals_8) {
        return CorePackage.Literals.EVENT_BACTION__ACTION;
      }
      return null;
    }
    if ((obj instanceof Witness)) {
      boolean _equals_9 = Objects.equal(id, "org.eventb.core.label");
      if (_equals_9) {
        return CorePackage.Literals.EVENT_BNAMED__NAME;
      }
      boolean _equals_10 = Objects.equal(id, "org.eventb.core.predicate");
      if (_equals_10) {
        return CorePackage.Literals.EVENT_BPREDICATE__PREDICATE;
      }
      return null;
    }
    if ((obj instanceof Variant)) {
      boolean _equals_11 = Objects.equal(id, "org.eventb.core.expression");
      if (_equals_11) {
        return CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION;
      }
      return null;
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
        elem = this.getMachine(obj);
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
   * Utility method to get the machine of an EObject. Return the Machine
   * parent of the input element. Return <code>null</code> if there is no
   * Machine containing the input element.
   * 
   * @param obj
   *          The input EObject
   * @author htson
   * @since 2.1
   */
  public EObject getMachine(final EObject object) {
    if ((object instanceof EventBObject)) {
      return ((EventBObject)object).getContaining(MachinePackage.Literals.MACHINE);
    }
    return null;
  }

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
  public void checkRodinMarkers(final Machine mch) {
    try {
      final IMachineRoot mchRoot = EventBEMFUtils.getRoot(mch);
      final IMarker[] rodinMarkers = this.findRodinMarkers(mchRoot);
      for (final IMarker rodinMarker : rodinMarkers) {
        {
          final IRodinElement rodinElement = RodinMarkerUtil.getElement(rodinMarker);
          EObject obj = this.getEObject(mch, rodinElement);
          if ((obj == null)) {
            obj = mch;
          }
          this.createIssue(obj, rodinMarker);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * A "Normal" check to clear the markers associated with the Rodin machine.
   * This is important as the markers generated as the consequence of
   * @link{#checkRodinMarkers(Machine)} are not cleared by when the file is
   * saved (hence they prevent the generator to run).
   * 
   * @author htson
   * @since 2.0
   */
  @Check(CheckType.NORMAL)
  public void clearRodinMarkers(final Machine mch) {
    try {
      final URI uri = mch.eResource().getURI();
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
  private EObject getEObject(final Machine mch, final IRodinElement rodinElement) {
    try {
      if ((rodinElement instanceof IMachineRoot)) {
        return mch;
      }
      if ((rodinElement instanceof IVariable)) {
        return this.findVariable(mch, ((IVariable)rodinElement).getIdentifierString());
      }
      if ((rodinElement instanceof IInvariant)) {
        return this.findInvariant(mch, ((IInvariant)rodinElement).getLabel());
      }
      if ((rodinElement instanceof IEvent)) {
        return this.findEvent(mch, ((IEvent)rodinElement).getLabel());
      }
      if ((rodinElement instanceof IParameter)) {
        IRodinElement _parent = ((IParameter)rodinElement).getParent();
        final IEvent event = ((IEvent) _parent);
        return this.findParameter(mch, event.getLabel(), ((IParameter)rodinElement).getIdentifierString());
      }
      if ((rodinElement instanceof IGuard)) {
        IRodinElement _parent_1 = ((IGuard)rodinElement).getParent();
        final IEvent event_1 = ((IEvent) _parent_1);
        return this.findGuard(mch, event_1.getLabel(), ((IGuard)rodinElement).getLabel());
      }
      if ((rodinElement instanceof IAction)) {
        IRodinElement _parent_2 = ((IAction)rodinElement).getParent();
        final IEvent event_2 = ((IEvent) _parent_2);
        return this.findAction(mch, event_2.getLabel(), ((IAction)rodinElement).getLabel());
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  private Variable findVariable(final Machine mch, final String name) {
    final EList<Variable> variables = mch.getVariables();
    for (final Variable variable : variables) {
      String _name = variable.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        return variable;
      }
    }
    return null;
  }

  private Invariant findInvariant(final Machine mch, final String label) {
    final EList<Invariant> invariants = mch.getInvariants();
    for (final Invariant invariant : invariants) {
      String _name = invariant.getName();
      boolean _equals = Objects.equal(_name, label);
      if (_equals) {
        return invariant;
      }
    }
    return null;
  }

  private Event findEvent(final Machine mch, final String label) {
    final EList<Event> events = mch.getEvents();
    for (final Event event : events) {
      String _name = event.getName();
      boolean _equals = Objects.equal(_name, label);
      if (_equals) {
        return event;
      }
    }
    return null;
  }

  private Parameter findParameter(final Machine mch, final String eventLabel, final String parameterName) {
    final Event event = this.findEvent(mch, eventLabel);
    if ((event == null)) {
      return null;
    }
    final EList<Parameter> parameters = event.getParameters();
    for (final Parameter parameter : parameters) {
      String _name = parameter.getName();
      boolean _equals = Objects.equal(_name, parameterName);
      if (_equals) {
        return parameter;
      }
    }
    return null;
  }

  private Guard findGuard(final Machine mch, final String eventLabel, final String guardLabel) {
    final Event event = this.findEvent(mch, eventLabel);
    if ((event == null)) {
      return null;
    }
    final EList<Guard> guards = event.getGuards();
    for (final Guard guard : guards) {
      String _name = guard.getName();
      boolean _equals = Objects.equal(_name, guardLabel);
      if (_equals) {
        return guard;
      }
    }
    return null;
  }

  private Action findAction(final Machine mch, final String eventLabel, final String actionLabel) {
    final Event event = this.findEvent(mch, eventLabel);
    if ((event == null)) {
      return null;
    }
    final EList<Action> actions = event.getActions();
    for (final Action action : actions) {
      String _name = action.getName();
      boolean _equals = Objects.equal(_name, actionLabel);
      if (_equals) {
        return action;
      }
    }
    return null;
  }

  @Check
  public void checkUntranslatedFormulae(final EventBPredicate predicate) {
    this.validator.validatePredicate(predicate);
  }

  @Check
  public void checkUntranslatedFormulae(final EventBExpression expression) {
    this.validator.validateExpression(expression);
  }

  @Check
  public void checkUntranslatedFormulae(final EventBAction action) {
    this.validator.validateAssignment(action);
  }

  @Check
  public void checkUntranslatedFormulae(final Value value) {
    this.validator.validateValue(value);
  }

  @Check
  public void checkUntranslatedFormulae(final Type type) {
    this.validator.validateType(type);
  }
}
