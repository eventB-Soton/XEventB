/*******************************************************************************
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
 *******************************************************************************/

package ac.soton.xeventb.xcontext.scoping

import ac.soton.eventb.emf.record.Record
import ac.soton.eventb.emf.record.RecordPackage
import ch.ethz.eventb.utils.EventBUtils
import java.io.IOException
import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eventb.core.basis.ContextRoot
import org.eventb.emf.core.EventBElement
import org.eventb.emf.core.EventBObject
import org.eventb.emf.core.context.Context
import org.eventb.emf.core.context.ContextPackage
import org.eventb.emf.core.machine.Machine
import org.rodinp.core.IInternalElement

/**
 * <p>
 * XContext scope provider, in particular the scope for context extensions.
 * </p>
 * 
 * @author htson
 * @version 0.2
 * @since 0.2
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

		val resource = context.eResource
		val resourceSet = resource.resourceSet

		// The scope for a context extension is the set of all contexts in the
		// current project containing the parent context. 
		if (context instanceof Context && reference == ContextPackage.Literals.CONTEXT__EXTENDS) {
			var prjName = getProjectName(context as Context);
			var eBPrj = EventBUtils.getEventBProject(prjName)
			var rdPrj = eBPrj.getRodinProject()
			var ctxRoots = rdPrj.getRootElementsOfType(ContextRoot.ELEMENT_TYPE)

			var ctxs = new ArrayList()
			for (ctxRoot : ctxRoots) {
				var ctx = loadEventBComponent(ctxRoot, resourceSet)
				ctxs.add(ctx)
			}
			return Scopes.scopeFor(ctxs);
		}

		// The scope for record extension is the set of all records in the context/extends context(s)
		if (context instanceof Record && reference == RecordPackage.Literals.RECORD__SUBSETS) {
			val cntx = EcoreUtil2.getRootContainer(context, true) as Context
			val components = getComponentsInScope(cntx)
			val records = EcoreUtil2.getAllContentsOfType(cntx, Record);
			for (c : components)
				records.addAll(EcoreUtil2.getAllContentsOfType(c as EObject, Record));
			return Scopes.scopeFor(records);
		}
	}

	def private List<EventBObject> getComponentsInScope(EventBObject eventBObject) {
		var list = new ArrayList
		if (eventBObject instanceof Machine) {
			var m = eventBObject as Machine;
			list.add(m);
			for (Context c : m.getSees()) {
				list.addAll(getComponentsInScope(c));
			}
		} else if (eventBObject instanceof Context) {
			var c = eventBObject as Context;
			list.add(c);
			for (Context x : c.getExtends()) {
				list.addAll(getComponentsInScope(x));
			}
		}
		return list;
	}

	/**
	 * THESE METHODS WERE COPIED FROM EMFRodinDB
	 */
	def private Resource loadResource(URI fileURI, ResourceSet resourceSet) {
		var resource = resourceSet.getResource(fileURI, false); // n.b. do not load until notifications disabled
		if (resource === null) {
			resource = resourceSet.createResource(fileURI);
		}
		// Try to load the resource
		if (!resource.isLoaded()) {
			val deliver = resource.eDeliver();
			resource.eSetDeliver(false); // turn off notifications while loading
			try {
				resource.load(Collections.emptyMap());
			// TODO throw exception instead (break API)
			} catch (IOException e) {
				return null;
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
	def private String getProjectName(EventBElement element) {
		val uri = EcoreUtil.getURI(element);
		return uri.segment(1);
	}

	/**
	 * loads an Event-B component (URI) into EMF
	 * 
	 * @param root
	 * @return
	 */
	def private EventBElement loadEventBComponent(URI fileURI, ResourceSet resourceSet) {
		val resource = loadResource(fileURI, resourceSet);
		if (resource === null) {
			return null;
		}
		if (resource.isLoaded() && !resource.getContents().isEmpty() &&
			resource.getContents().get(0) instanceof EventBElement) {
			return resource.getContents().get(0) as EventBElement;
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
	def private EventBElement loadEventBComponent(IInternalElement element, ResourceSet resourceSet) {
		val root = element.getRoot();
		if (root === null || !root.exists())
			return null;
		val fileURI = URI.createPlatformResourceURI(root.getResource().getFullPath().toString(), true);
		return loadEventBComponent(fileURI, resourceSet);
	}

}
