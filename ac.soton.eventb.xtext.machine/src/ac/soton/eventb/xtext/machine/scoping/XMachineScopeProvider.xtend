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

package ac.soton.eventb.xtext.machine.scoping

import ch.ethz.eventb.utils.EventBUtils
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eventb.core.basis.ContextRoot
import org.eventb.core.basis.MachineRoot
import org.eventb.emf.core.machine.Event
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.core.machine.MachinePackage
import org.eventb.emf.persistence.EMFRodinDB
//dana update
import ac.soton.eventb.featureinclusion.EventSynchronisation
import ac.soton.eventb.featureinclusion.MachineInclusion
import ac.soton.eventb.featureinclusion.FeatureinclusionPackage
/**
 * <p>
 * XMachine scope provider, in particular the scope for machine refinement,
 * event refinement.
 * </p>
 *
 * @author htson
 * @version 0.2
 * @see EMFRodinDB
 * @since 0.0.1
 * @updated by Dana to include inclusion feature but not completed 
 */
class XMachineScopeProvider extends AbstractXMachineScopeProvider {

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
			
			
	     // Dana test
	/* 	if (context instanceof MachineInclusion && reference == FeatureinclusionPackage.MACHINE_INCLUSION__SEES) {
			var emfRodinDB = new EMFRodinDB;
			var prjName = emfRodinDB.getProjectName(context as MachineInclusion);
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
		if (context instanceof MachineInclusion && reference == FeatureinclusionPackage.MACHINE_INCLUSION__REFINES) {
			var emfRodinDB = new EMFRodinDB;
			var prjName = emfRodinDB.getProjectName(context as MachineInclusion);
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
        if (context instanceof MachineInclusion && reference == FeatureinclusionPackage.MACHINE_INCLUSION__ABSTRACT_MACHINE) {
			var emfRodinDB = new EMFRodinDB;
			var prjName = emfRodinDB.getProjectName(context as MachineInclusion);
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
		
		   if (context instanceof MachineInclusion && reference == MachinePackage.Literals.MACHINE__SEES) {
			var emfRodinDB = new EMFRodinDB;
			var prjName = emfRodinDB.getProjectName(context as MachineInclusion);
			var eBPrj = EventBUtils.getEventBProject(prjName)
			var rdPrj = eBPrj.getRodinProject()
			var ctxRoots = rdPrj.getRootElementsOfType(ContextRoot.ELEMENT_TYPE)

			var ctxs = new ArrayList()
			for (ctxRoot : ctxRoots) {
				var ctx = emfRodinDB.loadEventBComponent(ctxRoot)
				ctxs.add(ctx)
			}
			return Scopes.scopeFor(ctxs);
		}*/
        
		return super.getScope(context, reference);
	}
	
}
