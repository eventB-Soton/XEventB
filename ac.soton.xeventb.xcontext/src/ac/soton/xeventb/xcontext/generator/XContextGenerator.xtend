/*******************************************************************************
 * Copyright (c) 2016,2021 University of Southampton.
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
package ac.soton.xeventb.xcontext.generator

import ac.soton.emf.translator.TranslatorFactory
import ac.soton.eventb.emf.core.^extension.coreextension.TypedConstant
import ac.soton.xeventb.common.Utils
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
import org.eventb.emf.core.context.Context
import org.eventb.emf.core.context.ContextFactory
import org.eventb.emf.persistence.EMFRodinDB
import org.eventb.emf.persistence.PersistencePlugin
import org.eventb.emf.persistence.SaveResourcesCommand
import org.rodinp.core.RodinCore

/**
 * <p>
 * Generating Rodin Context from the XContext.
 * </p>
 * 
 * @author htson
 * @version 1.0
 * @since 0.1
 */
class XContextGenerator extends AbstractGenerator {

	// htson: (2.0) This is the key for Rodin Machine configuration 
	val static CONFIGURATION = "configuration";

	/* @htson Automatically compile to Rodin files */
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val ctx = resource.contents.get(0) as Context
		var uriString = resource.URI.toString
		uriString = uriString.substring(0, uriString.lastIndexOf('bucx'))
		uriString = uriString + "buc"
		var uri = URI.createURI(uriString)

		// copied from XMachineGenerator: Set the source context (from XText) as the content of the Rodin machine.
		// @htsonImportant: Create the EMF RodinDB with the CURRENT resource set (2.0)
		val emfRodinDB = new EMFRodinDB(resource.resourceSet)
		val editingDomain = emfRodinDB.editingDomain
		val rodinResource = emfRodinDB.getResource(uri)

		// @htson: Use recording command for write transaction (2.0)
		val command = new RecordingCommand(editingDomain, "Set Contents") {
			override doExecute() {
				rodinResource.contents.clear()
				rodinResource.contents.add(0, ctx)
				val rodinInternals = CoreFactory.eINSTANCE.createAnnotation()
				rodinInternals.source = PersistencePlugin.SOURCE_RODIN_INTERNAL_ANNOTATION
				val rodinInternalDetails = rodinInternals.getDetails()
				rodinInternalDetails.put(
					CONFIGURATION,
					"org.eventb.core.fwd;ac.soton.xeventb.xcontext.base"
				)
				ctx.getAnnotations().add(rodinInternals)

				// Translate typed constants
				translateTypedConstants(ctx)
				
				// Translated formulae
				translateFormulae(ctx)

				// Ensure that the resource will be saved
				rodinResource.modified = true;
			}

		}
		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

		val factory = TranslatorFactory.getFactory() as TranslatorFactory

		// records
		var recordCommandId = "ac.soton.eventb.emf.record.generator.translateAllRecords"

		if (factory.canTranslate(recordCommandId, ctx.eClass())) {
			val monitor = new NullProgressMonitor
			factory.translate(editingDomain, ctx, recordCommandId, monitor)
		}

		// copied from XMachineGenerator
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
	}

	/*
	 * Utility method to translate typed constants of a context to constants, typing axioms and definition axioms.
	 * 
	 * @param ctx The input context
	 */
	private def translateTypedConstants(Context ctx) {
		var orderedChildren = ctx.eGet(CorePackage.Literals.EVENT_BELEMENT__ORDERED_CHILDREN) as EList<EventBElement>
		var i = 0
		while (i < orderedChildren.size) {
			val child = orderedChildren.get(i)
			if (child instanceof TypedConstant) {
				val name = child.name
				val type = child.type
				val value = child.value

				// Create the corresponding constant
				var cst = ContextFactory.eINSTANCE.createConstant();
				cst.setName(name);
				orderedChildren.add(i, cst)
				i++

				// Create the typing axiom
				if (type !== null) {
					var axm = ContextFactory.eINSTANCE.createAxiom();
					axm.name = name + "-typeof"
					axm.predicate = name + ":" + type
					axm.theorem = false
					orderedChildren.add(i, axm)
					i++
				}
				// Create the value axiom
				if (value !== null) {
					var axm = ContextFactory.eINSTANCE.createAxiom();
					axm.name = name + "-def"
					axm.predicate = name + "=" + value
					axm.theorem = false
					orderedChildren.add(i, axm)
					i++
				}
			}
			// Move to the next element 
			i++
		}

	}

	// copied from XMachineGenerator	
	def private ISchedulingRule getSchedulingRule(Resource[] resources) {
		if (resources.length == 0) {
			return null;
		} else if (resources.length == 1) {
			return WorkspaceSynchronizer.getFile(resources.get(0));
		} else {
			val project = getProject(resources.get(0));
			for (Resource resource : resources) {
				if (project != getProject(resource)) {
					return ResourcesPlugin.getWorkspace().getRoot();
				}
			}
			return project;
		}
	}

	// copied from XMachineGenerator
	def private IProject getProject(Resource resource) {
		val file = WorkspaceSynchronizer.getFile(resource);
		return file?.getProject() ?: null;
	}

	/**
	 * Utility method to translate formulae in the input context to Event-B
	 * mathematics.
	 * 
	 * @param ctx
	 * 		The input context
	 * @author htson
	 * @since 2.0
	 */
	def private translateFormulae(Context ctx) {
		// Translate all predicates
		val predElements = ctx.getAllContained(
			CorePackage.Literals.EVENT_BPREDICATE,
			false
		)
		Utils.translatePredicates(predElements)
	}

}
