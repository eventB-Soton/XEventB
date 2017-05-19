
/*******************************************************************************
* Copyright (c) 2016-2017 University of Southampton.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* University of Southampton - initial API and implementation
*******************************************************************************/
package ac.soton.xeventb.xmachine.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.persistence.EMFRodinDB
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import ac.soton.emf.translator.TranslatorFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress
import java.lang.reflect.InvocationTargetException
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.runtime.NullProgressMonitor

/**
* Generates code from your model files on save.
* 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
*/
class XMachineGenerator implements IGenerator {
//extends AbstractGenerator {

	/* @htson Automatically compile to Rodin files */
override void doGenerate(Resource resource, IFileSystemAccess fsa) {
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
    	
    	 	  // IWorkbenchWindow activeWorkbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
		       //final Shell shell = activeWorkbenchWindow.getShell();
			   var commandId = 'ac.soton.eventb.emf.inclusion.commands.include' 
			   var factory = TranslatorFactory.getFactory()as TranslatorFactory
				if (factory !== null && factory.canTranslate(commandId, mch.eClass())){
					//ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
//				 try{
//			run(IProgressMonitor monitor) 
//								try {
                                  
									factory.translate(mch, commandId, new NullProgressMonitor)
//								} catch (ExecutionException e) {
//									throw new InvocationTargetException(e);
//								}

							}
			
					
		}
		}
}