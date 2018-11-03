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
	}
	
}
