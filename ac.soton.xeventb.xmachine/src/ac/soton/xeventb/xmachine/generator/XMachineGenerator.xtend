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
package ac.soton.xeventb.xmachine.generator

import ac.soton.emf.translator.TranslatorFactory
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
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.transaction.TransactionalEditingDomain
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.persistence.EMFRodinDB
import org.eventb.emf.persistence.SaveResourcesCommand
import org.rodinp.core.RodinCore
import org.eclipse.core.resources.IFile

/**
 * <p>
 * Generating Rodin Context from the XContext.
 * </p>
 *
 * @author htson
 * @author Dana
 * @version 1.0
 * @since 0.1
 */
class XMachineGenerator extends AbstractGenerator {

	/* @htson Automatically compile to Rodin files */

	// Dana: In 0.0.6 generator is updated to extend AbstractGenerator
	// Save is added after calling the translator 
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
	var mch = resource.contents.get(0) as Machine
	if(mch.extensions.empty){
		var emfRodinDB = new EMFRodinDB
	    var uriString = resource.URI.toString
	    uriString = uriString.substring(0, uriString.lastIndexOf('bumx'))
	    uriString = uriString + "bum"
	    var uri = URI.createURI(uriString)
	    emfRodinDB.saveResource(uri, mch)
	}
	
    // Dana: If machine contains inclusion, call the inclusion translator to generate
    // the event-b machine
    else{
    	
			   var commandId = 'ac.soton.eventb.emf.inclusion.commands.include' 
			   var factory = TranslatorFactory.getFactory() as TranslatorFactory
				if (factory !== null && factory.canTranslate(commandId, mch.eClass())){
	
                var TransactionalEditingDomain editingDomain = null;
				if (mch.eResource !== null && mch.eResource.getResourceSet !== null) {
					editingDomain = TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(
						mch.eResource.getResourceSet);
				}
				if (editingDomain === null) {
					editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
				}    
				
				 val monitor =   new NullProgressMonitor as IProgressMonitor;    
				//factory.translate(editingDomain, mch, commandId, new NullProgressMonitor)
				factory.translate(editingDomain, mch, commandId, monitor)

				// add save

//				try{
//					for (Resource resource2 : editingDomain.getResourceSet().getResources()){
//						if (resource2.isModified()){
//							
//							resource2.save(Collections.emptyMap());
//							monitor.worked(1);
//						
//						}
//					}
//					
//				}
//				catch (Exception e) {
//					//throw this as a CoreException
//					new Exception(e);
//				}
//				monitor.done();

			//--------------
			// save all resources that have been modified	
		val saveCommand = new SaveResourcesCommand(editingDomain)  
		
			val wsRunnable = 
						new IWorkspaceRunnable() {
							
							override  void run(IProgressMonitor monitor)  {
								try {
									saveCommand.execute(monitor, null);
								} catch (ExecutionException e) {
									val status = new Status(IStatus.ERROR, "ac.soton.xeventb.xmachine" , "Nothing" , e);
									throw new CoreException(status);
								}
			
							}
						}
			
		if (saveCommand.canExecute()) {
		val Resource[] emptyResource = #[]
		
		RodinCore.run(wsRunnable
		, getSchedulingRule(editingDomain.getResourceSet().getResources().toArray(emptyResource)), monitor);
		}
		monitor.done();
			//------------
				

				}
			
					
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
}
