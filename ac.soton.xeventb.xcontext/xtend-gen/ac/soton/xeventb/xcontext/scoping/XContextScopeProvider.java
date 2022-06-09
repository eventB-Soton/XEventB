/**
 * Copyright (c) 2016,2020 University of Southampton.
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
package ac.soton.xeventb.xcontext.scoping;

import ch.ethz.eventb.utils.EventBUtils;
import com.google.common.base.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.core.IContextRoot;
import org.eventb.core.IEventBProject;
import org.eventb.core.basis.ContextRoot;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IRodinProject;

/**
 * <p>
 * XContext scope provider, in particular the scope for context extensions.
 * </p>
 * 
 * @author htson
 * @version 0.2
 * @since 0.2
 */
@SuppressWarnings("all")
public class XContextScopeProvider extends AbstractXContextScopeProvider {
  /**
   * Getting the scope for the a reference feature of an input object.
   * 
   * @param context
   *          the current object.
   * @param reference
   *          the reference feature.
   */
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    try {
      final Resource resource = context.eResource();
      final ResourceSet resourceSet = resource.getResourceSet();
      if (((context instanceof Context) && Objects.equal(reference, ContextPackage.Literals.CONTEXT__EXTENDS))) {
        String prjName = this.getProjectName(((Context) context));
        IEventBProject eBPrj = EventBUtils.getEventBProject(prjName);
        IRodinProject rdPrj = eBPrj.getRodinProject();
        IContextRoot[] ctxRoots = rdPrj.<IContextRoot>getRootElementsOfType(ContextRoot.ELEMENT_TYPE);
        ArrayList<EventBElement> ctxs = new ArrayList<EventBElement>();
        for (final IContextRoot ctxRoot : ctxRoots) {
          {
            EventBElement ctx = this.loadEventBComponent(ctxRoot, resourceSet);
            ctxs.add(ctx);
          }
        }
        return Scopes.scopeFor(ctxs);
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * THESE METHODS WERE COPIED FROM EMFRodinDB
   */
  private Resource loadResource(final URI fileURI, final ResourceSet resourceSet) {
    Resource resource = resourceSet.getResource(fileURI, false);
    if ((resource == null)) {
      resource = resourceSet.createResource(fileURI);
    }
    boolean _isLoaded = resource.isLoaded();
    boolean _not = (!_isLoaded);
    if (_not) {
      final boolean deliver = resource.eDeliver();
      resource.eSetDeliver(false);
      try {
        resource.load(Collections.<Object, Object>emptyMap());
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          return null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      } finally {
        resource.eSetDeliver(deliver);
      }
    }
    return resource;
  }
  
  /**
   * this returns the project name by checking the uri of the given element
   * The element must be loaded or an npe will occur
   * 
   * @param element
   * @return
   */
  private String getProjectName(final EventBElement element) {
    final URI uri = EcoreUtil.getURI(element);
    return uri.segment(1);
  }
  
  /**
   * loads an Event-B component (URI) into EMF
   * 
   * @param root
   * @return
   */
  private EventBElement loadEventBComponent(final URI fileURI, final ResourceSet resourceSet) {
    final Resource resource = this.loadResource(fileURI, resourceSet);
    if ((resource == null)) {
      return null;
    }
    if (((resource.isLoaded() && (!resource.getContents().isEmpty())) && 
      (resource.getContents().get(0) instanceof EventBElement))) {
      EObject _get = resource.getContents().get(0);
      return ((EventBElement) _get);
    } else {
      return null;
    }
  }
  
  /**
   * loads an Event-B component (root) into EMF
   * 
   * @param root
   * @return
   */
  private EventBElement loadEventBComponent(final IInternalElement element, final ResourceSet resourceSet) {
    final IInternalElement root = element.getRoot();
    if (((root == null) || (!root.exists()))) {
      return null;
    }
    final URI fileURI = URI.createPlatformResourceURI(root.getResource().getFullPath().toString(), true);
    return this.loadEventBComponent(fileURI, resourceSet);
  }
}
