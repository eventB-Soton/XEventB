/*******************************************************************************
 * Copyright (c) 2017,2019 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.xcontext.validation

import org.eclipse.xtext.validation.Check
import org.eventb.emf.core.context.Context

/**
 * <p>
 * XContext validator, provides custom validation rules for the xtext context file.
 * </p>
 *
 * @author dana
 * @version 0.1 
 * @since 1.0
 */


class XContextValidator extends AbstractXContextValidator {
	
   @Check
	def checkMachineName(Context ctx){
		val res = ctx.eResource
		val fileName = res.URI.lastSegment.toString
		val ctxName= fileName.substring(0, fileName.indexOf('.'))
		if (ctxName != ctx.name)
			error('Context name should be the same as the file name', null) 
	}
}
