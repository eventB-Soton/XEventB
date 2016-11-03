/*******************************************************************************
 * Copyright (c) 2016 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.eventb.xtext.context.scoping

import ch.ethz.eventb.utils.EventBUtils
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eventb.core.basis.ContextRoot
import org.eventb.emf.core.context.Context
import org.eventb.emf.core.context.ContextPackage
import org.eventb.emf.persistence.EMFRodinDB

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
class XContextScopeProvider extends AbstractXContextScopeProvider {

	/**
	 * Getting the scope for the a reference feature of an input object.
	 * 
	 * @param context
	 *          the current object.
	 * @param reference
	 *          the reference feature.
	 */
	override getScope(EObject context, EReference reference) {
		
		// The scope for a context extension is the set of all contexts in the
		// current project containing the parent context. 
		if (context instanceof Context && reference == ContextPackage.Literals.CONTEXT__EXTENDS) {
			var emfRodinDB = new EMFRodinDB;
			var prjName = emfRodinDB.getProjectName(context as Context);
			var eBPrj = EventBUtils.getEventBProject(prjName)
			var rdPrj = eBPrj.getRodinProject()
			var ctxRoots = rdPrj.getRootElementsOfType(ContextRoot.ELEMENT_TYPE)

			var ctxs = new ArrayList()
			for (ctxRoot : ctxRoots) {
				var ctx = emfRodinDB.loadEventBComponent(ctxRoot)
				ctxs.add(ctx)
			}
			return Scopes.scopeFor(ctxs);
		}
	}

}
