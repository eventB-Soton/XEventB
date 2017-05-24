/**
 * Copyright (c) 2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xcontext.validation

import ac.soton.xeventb.xcontext.validation.AbstractXContextValidator;
import com.google.common.base.Objects;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eventb.emf.core.context.Context;

/**
 * <p>
 * XContext validator, provides custom validation rules for the xtext context file.
 * </p>
 *
 * @author dana
 * @version 
 * @see
 * @since 
 */


class XContextValidator extends AbstractXContextValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					XContextPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
   @Check
	def checkMachineName(Context ctx){
		val res = ctx.eResource
		val fileName = res.URI.lastSegment.toString
		val ctxName= fileName.substring(0, fileName.indexOf('.'))
		if (ctxName != ctx.name)
			error('Context name should be the same as the file name', null) 
	}
}
