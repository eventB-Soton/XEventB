/**
 * Copyright (c) 2016 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xcontext.scoping;

import ac.soton.xeventb.xcontext.scoping.AbstractXContextScopeProvider;
import ch.ethz.eventb.utils.EventBUtils;
import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.core.IContextRoot;
import org.eventb.core.IEventBProject;
import org.eventb.core.basis.ContextRoot;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;
import org.eventb.emf.persistence.EMFRodinDB;
import org.rodinp.core.IRodinProject;

/**
 * <p>
 * XContext scope provider, in particular the scope for context extensions.
 * </p>
 * 
 * @author htson
 * @version 0.1
 * @see EMFRodinDB
 * @since 0.0.2
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
      if (((context instanceof Context) && Objects.equal(reference, ContextPackage.Literals.CONTEXT__EXTENDS))) {
        EMFRodinDB emfRodinDB = new EMFRodinDB();
        String prjName = emfRodinDB.getProjectName(((Context) context));
        IEventBProject eBPrj = EventBUtils.getEventBProject(prjName);
        IRodinProject rdPrj = eBPrj.getRodinProject();
        IContextRoot[] ctxRoots = rdPrj.<IContextRoot>getRootElementsOfType(ContextRoot.ELEMENT_TYPE);
        ArrayList<EventBElement> ctxs = new ArrayList<EventBElement>();
        for (final IContextRoot ctxRoot : ctxRoots) {
          {
            EventBElement ctx = emfRodinDB.loadEventBComponent(ctxRoot);
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
}
