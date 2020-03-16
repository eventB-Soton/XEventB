/*******************************************************************************
 * Copyright (c) 2016,2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.xcontext.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eventb.emf.core.context.Context
import org.eventb.emf.persistence.EMFRodinDB
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.transaction.TransactionalEditingDomain
import ac.soton.emf.translator.TranslatorFactory
import org.eventb.emf.persistence.SaveResourcesCommand
import org.eclipse.core.resources.IWorkspaceRunnable
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.CoreException
import org.rodinp.core.RodinCore
import org.eclipse.core.runtime.jobs.ISchedulingRule
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer

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

	/* @htson Automatically compile to Rodin files */
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var ctx = resource.contents.get(0) as Context
		var emfRodinDB = new EMFRodinDB
		var uriString = resource.URI.toString
		uriString = uriString.substring(0, uriString.lastIndexOf('bucx'))
		uriString = uriString + "buc"
		var uri = URI.createURI(uriString)
		emfRodinDB.saveResource(uri, ctx)
		
		//copied from XMachineGenerator: Set the source context (from XText) as the content of the Rodin machine.
		var editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain()
		var rodinResource = editingDomain.resourceSet.createResource(uri)
		rodinResource.eSetDeliver(false)
		rodinResource.contents.add(0, ctx)
		// Set modified resource to be true (otherwise, saving might ignore this).
		rodinResource.modified = true
		rodinResource.eSetDeliver(true)

		
			val factory = TranslatorFactory.getFactory() as TranslatorFactory
			
			//records
			var recordCommandId = "ac.soton.eventb.records.commands.record"
			
			if (factory.canTranslate(recordCommandId, ctx.eClass())) {
				val monitor = new NullProgressMonitor
				factory.translate(editingDomain, ctx, recordCommandId, monitor)
			}
			
		//copied from XMachineGenerator
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
		
	//copied from XMachineGenerator	
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
	//copied from XMachineGenerator
	def private IProject getProject(Resource resource) {
		val file = WorkspaceSynchronizer.getFile(resource);
		return file?.getProject()?:null;
	}
	
	
}
