/*******************************************************************************
 * Copyright (c) 2016-2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.xmachine.scoping

import ac.soton.eventb.emf.inclusion.EventSynchronisation
import ac.soton.eventb.emf.inclusion.InclusionPackage
import ac.soton.eventb.emf.inclusion.MachineInclusion
import ch.ethz.eventb.utils.EventBUtils
import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eventb.core.basis.ContextRoot
import org.eventb.core.basis.MachineRoot
import org.eventb.emf.core.machine.Event
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.core.machine.MachinePackage
import org.eventb.emf.persistence.EMFRodinDB
import ac.soton.xeventb.common.EventBQualifiedNameProvider
import ac.soton.xeventb.common.EventBContainerManager

/**
 * <p>
 * XMachine scope provider, in particular the scope for machine refinement,
 * event refinement and event synchronisation.
 * </p>
 *
 * @author htson
 * @author Dana - updated to include event synchronisation
 * @version 0.2
 * @see EMFRodinDB
 * @since 0.0.1
 */
class XMachineScopeProvider extends AbstractDeclarativeScopeProvider {
	@Inject ResourceDescriptionsProvider rdp

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
			var emfRodinDB = new EMFRodinDB;
			var prjName = emfRodinDB.getProjectName(context as Machine);
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
		
		// The scope for a machine refinement is the set of all machines in the
		// current project containing the parent machine. 
		if (context instanceof Machine && reference == MachinePackage.Literals.MACHINE__REFINES) {
			var emfRodinDB = new EMFRodinDB;
			var prjName = emfRodinDB.getProjectName(context as Machine);
			var eBPrj = EventBUtils.getEventBProject(prjName)
			var rdPrj = eBPrj.getRodinProject()
			var mchRoots = rdPrj.getRootElementsOfType(MachineRoot.ELEMENT_TYPE)

			var mchs = new ArrayList()
			for (mchRoot : mchRoots) {
				var mch = emfRodinDB.loadEventBComponent(mchRoot)
				mchs.add(mch)
			}
			return Scopes.scopeFor(mchs);
		}
		     
		// The scope for a machine inclusion is the set of all machines in the
		// current project containing the parent machine. 
		if (context instanceof Machine && reference == InclusionPackage.Literals.MACHINE_INCLUSION__ABSTRACT_MACHINE) {
			var emfRodinDB = new EMFRodinDB;
			var prjName = emfRodinDB.getProjectName(context as Machine);
			var eBPrj = EventBUtils.getEventBProject(prjName)
			var rdPrj = eBPrj.getRodinProject()
			var mchRoots = rdPrj.getRootElementsOfType(MachineRoot.ELEMENT_TYPE)

			var mchs = new ArrayList()
			for (mchRoot : mchRoots) {
				var mch = emfRodinDB.loadEventBComponent(mchRoot)
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
	
	
	
}	

