/*******************************************************************************
 * Copyright (c) 2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.tests.common

import org.eventb.emf.core.context.Context
import org.eventb.emf.core.context.ContextPackage
import org.junit.Assert

/**
 * <p>
 * This class contains utility methods for testing EMF {@link Context}'s details.
 * These methods also can be used via Xtend extensions mechanism. 
 * </p>
 * 
 * @author htson
 * @version 0.1
 * @see Context
 * @since 0.0.8
 */
class AssertContextExtensions {

	/**
	 * Utility method to register the Context EPackage. This is done by simply
	 * access the eClass of the ContextPackage's {@link ContextPackage.eINSTANCE}. 
	 */
	def registerContextEPackage() {
		ContextPackage.eINSTANCE.eClass() // Register the Context EPackage
	}

	/**
	 * This method asserts the name and the comments of the input context against
	 * the expected name and comments. An {@link AssertionError} is thrown if
	 * the context name does not equal the expected name or the context's
	 * comments does not equal the expected comments. 
	 * 
	 * @param ctx
	 *		The input context to be analysed.
	 * @param expectedName
	 *		The expected name of the context.
	 * @param expectedComments
	 *		The expected comments of the context.
	 */
	def assertContext(Context ctx, String expectedName, String expectedComments) {
		Assert.assertEquals("Incorrect context's name", expectedName, ctx.name)
		Assert.assertEquals("Incorrect context's comments", expectedComments, ctx.comment)
	}

}
