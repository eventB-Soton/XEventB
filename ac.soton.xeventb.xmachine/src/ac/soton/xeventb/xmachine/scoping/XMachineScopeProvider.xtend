/*******************************************************************************
 *  Copyright (c) 2016,2020 University of Southampton.
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
 *******************************************************************************/
package ac.soton.xeventb.xmachine.scoping

import ac.soton.eventb.emf.containment.Containment
import ac.soton.eventb.emf.containment.ContainmentPackage
import ac.soton.eventb.emf.diagrams.DiagramOwner
import ac.soton.eventb.emf.inclusion.EventSynchronisation
import ac.soton.eventb.emf.inclusion.InclusionPackage
import ac.soton.eventb.emf.inclusion.MachineInclusion
import ac.soton.xeventb.common.EventBContainerManager
import ac.soton.xeventb.common.EventBQualifiedNameProvider
import ch.ethz.eventb.utils.EventBUtils
import java.io.IOException
import java.util.ArrayList
import java.util.Collections
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eventb.core.basis.ContextRoot
import org.eventb.core.basis.MachineRoot
import org.eventb.emf.core.EventBElement
import org.eventb.emf.core.machine.Event
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.core.machine.MachinePackage
import org.eventb.emf.persistence.EMFRodinDB
import org.rodinp.core.IInternalElement

/**
 * <p>
 * XMachine scope provider, in particular the scope for machine refinement,
 * event refinement and event synchronisation.
 * </p>
 *
 * @author htson
 * @author Dana - updated to include event synchronisation
 * @author asiehsalehi - updated to include record
 * @version 0.3
 * @see EMFRodinDB
 * @since 0.0.1
 */
class XMachineScopeProvider extends AbstractDeclarativeScopeProvider {
//	@Inject ResourceDescriptionsProvider rdp
	

//	@Inject IContainer.Manager cm

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
//       	val emfRodinDB = new EMFRodinDB(resourceSet)
//       	val emfRodinDB = new EMFRodinDB()

		// The scope for a event refinement is the set of all events in refined machine.
  		if (context instanceof Event && reference == MachinePackage.Literals.EVENT__REFINES) {
			val mch = EcoreUtil2.getRootContainer(context, true) as Machine
			val refines = mch.refines
			if (refines.length != 0) {
				val refinedMch = refines.get(0)
				val refinedEvts = EcoreUtil2.getAllContentsOfType(refinedMch, Event)
				return Scopes.scopeFor(refinedEvts)
			}
			return super.getScope(context, reference);
		}
		
		// The scope for a context seeing is the set of all contexts in the
		// current project containing the parent machine. 
		if (context instanceof Machine && reference == MachinePackage.Literals.MACHINE__SEES) {
			var prjName = getProjectName(context as Machine);
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
		
		// The scope for a machine refinement is the set of all machines in the
		// current project containing the parent machine. 
		if (context instanceof Machine && reference == MachinePackage.Literals.MACHINE__REFINES) {
			var prjName = getProjectName(context as Machine);
			var eBPrj = EventBUtils.getEventBProject(prjName)
			var rdPrj = eBPrj.getRodinProject()
			var mchRoots = rdPrj.getRootElementsOfType(MachineRoot.ELEMENT_TYPE)

			var mchs = new ArrayList()
			for (mchRoot : mchRoots) {
				var mch = loadEventBComponent(mchRoot, resourceSet)
				mchs.add(mch)
			}
			return Scopes.scopeFor(mchs);
		}
		     
		    //Dana
			// The scope for a synchronised event is the set of all events 
			// in the included abstract machines.
		if (context instanceof EventSynchronisation && reference == InclusionPackage.Literals.EVENT_SYNCHRONISATION__SYNCHRONISED_EVENT) {
			val mch = EcoreUtil2.getRootContainer(context, true) as Machine
			val mchExt = mch.extensions.filter(MachineInclusion)
			var mchEvts = new ArrayList()
			for(mchInclusion : mchExt){
				var abstractMch= mchInclusion.abstractMachine
				var evtSync = context as EventSynchronisation
				if (!evtSync.prefix.empty){
				 	if(mchInclusion.prefixes.contains(evtSync.prefix))	
				 		mchEvts.addAll(abstractMch.events)
				}
				else
				 mchEvts.addAll(abstractMch.events)	
			}
			return Scopes.scopeFor(mchEvts);		
		}
		
		// Scope for machine inclusion clause
		if (context instanceof MachineInclusion &&
			reference == InclusionPackage.Literals.MACHINE_INCLUSION__ABSTRACT_MACHINE) {
			return scopeForMachineInclusion(context, reference)
		}
		
		// The scope for record extension is the set of all records in the machine/refined machine(s) and sees context(s)
//		if (context instanceof Record && reference == RecordPackage.Literals.RECORD__SUBSETS) {
//			val mch = EcoreUtil2.getRootContainer(context, true) as Machine
//			val components = getComponentsInScope(mch)
//			val records = EcoreUtil2.getAllContentsOfType(mch, Record);
//			records.remove(context);
//			for (c : components) 
//				records.addAll(EcoreUtil2.getAllContentsOfType(c as EObject, Record));
//			return Scopes.scopeFor(records);
//		}
		
		// The scope for a context seeing is the set of all contexts in the
		// current project containing the parent machine. 
		if (context instanceof Containment &&
			reference == ContainmentPackage.Literals.CONTAINMENT__EXTENSION
		) {
			// Get the project
			val machine = context.eContainer as Machine
			val uri = EcoreUtil.getURI(machine);
			val projectName = uri.segment(1)
			val workspace = ResourcesPlugin.getWorkspace();
        	val root = workspace.getRoot();
        	val project = root.getProject(projectName);
        	var diagramOwners = new ArrayList<DiagramOwner>()
        	val members = project.members()
			for (file : members) {
        		if (file instanceof IFile) {
					val fileExtension = file.fileExtension
					if (fileExtension == "umlb") {
						val umlbURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true)
						val umlbResource = loadResource(umlbURI, resourceSet)
						val diagramOwner = umlbResource.contents.get(0) as DiagramOwner
						diagramOwners.add(diagramOwner)
					}
        		}
        	}
			return Scopes.scopeFor(diagramOwners);
			// Return all the DiagramOwners within the project.
			// Load project into EMF?
			// Find all files with .umlb extension
			// EMFUtils to construct URI from file name and project.
			// for each file, load the resource and get the first content.
		}
       return super.getScope(context, reference);
	}
	
	/**
	 * The scope for machine inclusion is the set of all (Rodin) machines 
	 * within the current project (reference using simple names) and the set
	 * of all (XMachine) machines in the workspace (reference using qualified
	 * name).
	 * 
	 * @author htson 
	 * @see EventBQualifiedNameProvider
	 * @see EventBContainerManager
	 * @since 0.0.8
	 */
	def private scopeForMachineInclusion(EObject context, EReference reference) {
			val superScope = super.getScope(context, reference)
			
			var emfRodinDB = new EMFRodinDB
			var prjName = emfRodinDB.getProjectName(context.eContainer as Machine)
			var eBPrj = EventBUtils.getEventBProject(prjName)
			var rdPrj = eBPrj.getRodinProject()
			var mchRoots = rdPrj.getRootElementsOfType(MachineRoot.ELEMENT_TYPE)

			var mchs = new ArrayList()
			for (mchRoot : mchRoots) {
				var mch = emfRodinDB.loadEventBComponent(mchRoot)
				mchs.add(mch)
			}
			return Scopes.scopeFor(mchs, superScope);		
	}
	
//	def private Collection<EventBNamedCommentedComponentElement>
//			getComponentsInScope(EventBObject eventBObject) {
//		var list = new ArrayList
//		if (eventBObject instanceof Machine) {
//			var m = eventBObject as Machine;
//			list.add(m);
//			for (Context c : m.getSees()) {
//				list.addAll(getComponentsInScope(c));
//			}
//		} else if (eventBObject instanceof Context) {
//			var c = eventBObject as Context;
//			list.add(c);
//			for (Context x : c.getExtends()) {
//				list.addAll(getComponentsInScope(x));
//			}
//		}
//		return list;
//	}
	
	/**
	 * THESE METHODS WERE COPIED FROM EMFRodinDB
	 */

	def private Resource loadResource(URI fileURI, ResourceSet resourceSet) {
		var resource = resourceSet.getResource(fileURI, false); //n.b. do not load until notifications disabled
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
		if (resource.isLoaded() && !resource.getContents().isEmpty() && resource.getContents().get(0) instanceof EventBElement) {
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

