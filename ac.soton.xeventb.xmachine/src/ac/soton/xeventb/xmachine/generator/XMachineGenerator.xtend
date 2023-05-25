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

package ac.soton.xeventb.xmachine.generator

import ac.soton.emf.translator.TranslatorFactory
import ac.soton.eventb.emf.containment.Containment
import ac.soton.eventb.emf.core.^extension.coreextension.TypedVariable
import ac.soton.xeventb.common.Utils
import ac.soton.xeventb.xmachine.IContainmentGenerator
import java.util.Collection
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRunnable
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.ISchedulingRule
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eventb.emf.core.CoreFactory
import org.eventb.emf.core.CorePackage
import org.eventb.emf.core.EventBElement
import org.eventb.emf.core.machine.Event
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.core.machine.MachineFactory
import org.eventb.emf.persistence.EMFRodinDB
import org.eventb.emf.persistence.PersistencePlugin
import org.eventb.emf.persistence.SaveResourcesCommand
import org.rodinp.core.RodinCore

/**
 * <p>
 * Generating Rodin Machine from the XMachine.
 * </p>
 *
 * @author htson - Initial implementation
 * @author Dana (0.0.6) - Implementation for machine inclusion (0.0.6)
 * @author asiehsalehi (2.0) - Implementation for record extension (2.0)
 * @author htson (2.0) - Introduce generator for containment via extension points (2.0)
 * @author htson (2.0) - Serialised the configuration ac.soton.xeventb.xmachine.base (2.0)
 * @author htson (2.1) - Serialisation for typed variables
 * @version 2.0
 * @since 2.1
 */
class XMachineGenerator extends AbstractGenerator {

	// htson: (2.0) This is the key for Rodin Machine configuration 
	val String CONFIGURATION = "configuration";

	// Dana: In 0.0.6 generator is updated to extend AbstractGenerator
	// Save is added after calling the translator 
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val mch = resource.contents.get(0) as Machine
		
		var uriString = resource.URI.toString
		uriString = uriString.substring(0, uriString.lastIndexOf('bumx'))
		uriString = uriString + "bum"
		val uri = URI.createURI(uriString)

		// @htson: Set the source machine (from XText) as the content of the Rodin machine.
		// @htsonImportant: Create the EMF RodinDB with the CURRENT resource set (2.0)
		val emfRodinDB = new EMFRodinDB(resource.resourceSet)
	    val editingDomain = emfRodinDB.editingDomain
		val rodinResource = emfRodinDB.getResource(uri)
		// @htson: Use recording command for write transaction (2.0)
		val command = new RecordingCommand(editingDomain, "Set Contents") {
			override doExecute() {
				rodinResource.contents.clear()
				rodinResource.contents.add(0, mch)
				val rodinInternals = CoreFactory.eINSTANCE.createAnnotation()
				rodinInternals.source = PersistencePlugin.SOURCE_RODIN_INTERNAL_ANNOTATION
				val rodinInternalDetails = rodinInternals.getDetails()
				rodinInternalDetails.put(CONFIGURATION,
					"org.eventb.core.fwd;ac.soton.xeventb.xmachine.base"
				)
				mch.getAnnotations().add(rodinInternals)

				// Translate typed variables
				translateTypedVariables(mch)

				// Translate formulae
				translateFormulae(mch)

				// Ensure that the resource will be saved
				rodinResource.modified = true;
			}
		}
		if (command.canExecute()){
			editingDomain.getCommandStack().execute(command);
		}
		
		if (!mch.extensions.empty) {
			val factory = TranslatorFactory.getFactory() as TranslatorFactory

			// @Dana: deal with inclusion
			var commandId = 'ac.soton.eventb.emf.inclusion.commands.include'

			if (factory.canTranslate(commandId, mch.eClass())) {
				val monitor = new NullProgressMonitor;
				factory.translate(editingDomain, mch, commandId, monitor)
			}
			
			// @Asieh: record (2.0)
			var recordCommandId = "ac.soton.eventb.emf.record.generator.translateAllRecords"
			
			if (factory.canTranslate(recordCommandId, mch.eClass())) {
				val monitor = new NullProgressMonitor;
				factory.translate(editingDomain, mch, recordCommandId, monitor)
			}


		}

		// --------------
		// save all resources that have been modified	
		val saveCommand = new SaveResourcesCommand(editingDomain)
		val wsRunnable = new IWorkspaceRunnable() {
			override void run(IProgressMonitor monitor) {
				try {
					saveCommand.execute(monitor, null);
				} catch (ExecutionException e) {
					val status = new Status(IStatus.ERROR, "ac.soton.xeventb.xmachine", "Nothing", e);
					throw new CoreException(status);
				}
			}
		}
		val monitor = new NullProgressMonitor
		// TODO [--> cfs] Why this can not be execute (i.e. no resource change initially?)
		if (saveCommand.canExecute()) {
			val Resource[] emptyResource = #[]

			RodinCore.run(wsRunnable,
				getSchedulingRule(editingDomain.getResourceSet().getResources().toArray(emptyResource)), monitor);
		}
		monitor.done();
			// ------------

//		editingDomain.resourceSet.resources.remove(rodinResource)
//		TransactionUtil.disconnectFromEditingDomain(rodinResource)
		
		// @htson: Containment are generated by extension (2.0)
		val registry = ContainmentRegistry.^default
		for (ex : mch.extensions) {
			// Containment
			if (ex instanceof Containment) {
				val ctmt = ex as Containment;
				val owner = ctmt.getExtension();
					
				val Collection<IContainmentGenerator> generators = registry.getGenerators(owner)
				for (generator : generators) {
					generator.generate(mch, owner, editingDomain)
				}
			}
		}
	}

	/*
	 * Utility method to translate typed variables of a machine to variables,
	 * typing invariants and initialisation action.
	 * 
	 * @param ctx The input machine
	 */
	private def translateTypedVariables(Machine mch) {
		var orderedChildren = mch.eGet(
			CorePackage.Literals.EVENT_BELEMENT__ORDERED_CHILDREN
		) as EList<EventBElement>
		var i = 0
		while (i < orderedChildren.size) {
			val child = orderedChildren.get(i)
			if (child instanceof TypedVariable) {
				val name = child.name
				val type = child.type
				val value = child.value

				// Create the corresponding variable
				var vrb = MachineFactory.eINSTANCE.createVariable
				vrb.setName(name);
				orderedChildren.add(i, vrb)
				i++

				// Create the typing invariant
				if (type !== null) {
					var inv = MachineFactory.eINSTANCE.createInvariant
					inv.name = name + "-typeof"
					inv.predicate = name + " ∈ " + type
					inv.theorem = false
					orderedChildren.add(i, inv)
					i++
				}
				// Create the value initialisation action
				if (value !== null) {
					// Find the Initialisation event
					var Event initialisation = null
					for (event : mch.events) {
						if (event.name == "INITIALISATION") {
							initialisation = event
						}
					}
					if (initialisation === null) {
						initialisation = MachineFactory.eINSTANCE.createEvent
						initialisation.name = "INITIALISATION"
						orderedChildren.add(i, initialisation)
						i++
					}
					
					var act = MachineFactory.eINSTANCE.createAction();
					act.name = name + "-init"
					act.action = name + " := " + value
					initialisation.orderedChildren.add(act)
				}
			}
			// Move to the next element 
			i++
		}

	}

	def private ISchedulingRule getSchedulingRule(Resource[] resources) {
		if (resources.length==0){	
			return null;
		}else if (resources.length==1){
			return WorkspaceSynchronizer.getFile(resources.get(0));
		}else {
			val project = getProject(resources.get(0));
			for (Resource resource : resources) {
				if (project != getProject(resource)){
					return  ResourcesPlugin.getWorkspace().getRoot();
				}
			}
			return project;
		}
	}
	
	def private IProject getProject(Resource resource) {
		val file = WorkspaceSynchronizer.getFile(resource);
		return file?.getProject()?:null;
	}
	
	/**
	 * Utility method to translate formulae in the input machine to Event-B
	 * mathematics.
	 * 
	 * @param mch
	 * 		The input machine
	 * @author htson
	 * @since 2.0
	 */
	def private translateFormulae(Machine mch) {
		// Translate all predicates
		val predElements = mch.getAllContained(
			CorePackage.Literals.EVENT_BPREDICATE, false
		)
		Utils.translatePredicates(predElements)

		// Translate all expressions
		val exprElements = mch.getAllContained(
			CorePackage.Literals.EVENT_BEXPRESSION, false
		)
		Utils.translateExpressions(exprElements)

		// Translate all assignments
		val asgnElements = mch.getAllContained(
			CorePackage.Literals.EVENT_BACTION, false
		)
		Utils.translateAssignments(asgnElements)
	}
	
}
