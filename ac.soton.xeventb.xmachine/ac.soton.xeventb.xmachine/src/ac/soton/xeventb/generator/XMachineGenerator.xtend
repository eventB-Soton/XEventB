
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
package ac.soton.xeventb.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.persistence.EMFRodinDB
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

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
	var emfRodinDB = new EMFRodinDB
	var uriString = resource.URI.toString
	uriString = uriString.substring(0, uriString.lastIndexOf('bumx'))
	uriString = uriString + "bum"
	var uri = URI.createURI(uriString)
emfRodinDB.saveResource(uri, mch)
}

}