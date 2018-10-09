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
package ac.soton.xeventb.internal.camillex.tests

import org.eventb.emf.core.context.Axiom
import org.eventb.emf.core.context.CarrierSet
import org.eventb.emf.core.context.Constant
import org.eventb.emf.core.context.Context
import org.eventb.emf.core.context.ContextPackage
import org.junit.Assert

/**
 * <p>
 * This class contains utility methods for testing EMF {@link Context}'s details.
 * These methods also can be used via Xtend extensions mechanism. 
 * </p>
 * TODO Add more methods for testing individual elements of contexts, e.g.,
 * <code>assertSet(CarrierSet set, String expectedName, String expectedComments)</code>
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
	 *		The expected comments of the context.  This could be
	 * 		<code>null</code> indicating that the input context does not expect
	 *		to have any comment. 
	 * @precondition The input context must not be <code>null</code>
	 */
	def assertContext(Context ctx, String expectedName, String expectedComments) {
		// Assert precondition
		Assert.assertNotNull("Input context must not be null", ctx)
		
		Assert.assertEquals("Incorrect context's name", expectedName, ctx.name)
		Assert.assertEquals("Incorrect context's comments", expectedComments, ctx.comment)
	}

	/**
	 * This method asserts the EXTENDS names of the input context against the
	 * array of expected names. An {@link AssertionError} is thrown if the
	 * number of EXTENDS names does not equal length of the expected names or
	 * any EXTENDS name of the input context does not match the expected names.
	 * The <b>order</b> of the EXTENDS names <b>matters</b>. 
	 * 
	 * @param ctx
	 *		The input context to be analysed.
	 * @param expectedExtendsNames
	 *		The array of expected EXTENDS names.
	 * @precondition The input context must not be <code>null</code>
	 */
	def assertContextExtendsNames(Context ctx, String... expectedExtendsNames) {
		// Assert precondition
		Assert.assertNotNull("Input context must not be null", ctx)
		
		val actualExtendsNames = ctx.extendsNames
		Assert.assertEquals("Incorrect number of EXTENDS names", 
			expectedExtendsNames.length, actualExtendsNames.length
		)
		for (var i = 0; i < expectedExtendsNames.length; i++) {
			Assert.assertEquals("Incorrect EXTENDS name", 
				expectedExtendsNames.get(i), actualExtendsNames.get(i)
			)
		}
	}

	/**
	 * This method asserts the SETS of the input context against the
	 * array of expected (pretty-printed) sets. The pretty print of a carrier
	 * set has the following format <code>name:comments</code> (see
	 * {@link AssertContextExtensions#prettyPrint(CarrierSet)}). An {@link AssertionError}
	 * is thrown if the number of the context's carrier sets does not equal
	 * length of the expected sets or any carrier set of the input context does
	 * not match the expected set. The <b>order</b> of the SETS <b>matters</b>. 
	 * 
	 * @param ctx
	 *		The input context to be analysed.
	 * @param expectedSets
	 *		The array of expected (pretty-printed) sets.
	 * @precondition The input context must not be <code>null</code>
	 */
	def assertContextSets(Context ctx, String... expectedSets) {
		// Assert precondition
		Assert.assertNotNull("Input context must not be null", ctx)
		
		val actualSets = ctx.sets
		Assert.assertEquals("Incorrect number of carrier sets", 
			expectedSets.length, actualSets.length
		)
		for (var i = 0; i < expectedSets.length; i++) {
			Assert.assertEquals("Incorrect carrier set name", 
				expectedSets.get(i), actualSets.get(i).prettyPrint
			)
		}
	}

	/**
	 * Utility method for pretty print a carrier set. It has the following
	 * format <code>name:comments</code>, where <code>name</code> is the name of
	 * the input carrier set and <code>comments</code> are the comments
	 * associated with the carrier set.
	 * 
	 * @param set
	 * 		The input carrier set to be pretty printed.
	 * @return the pretty-print string of the input carrier set.
	 * @precondition the input carrier set must not be <code>null</code>
	 */
	def private prettyPrint(CarrierSet set) {
		set.name + ":" + (set.comment ?: "")
	}

	/**
	 * This method asserts the CONSTANTS of the input context against the
	 * array of expected (pretty-printed) constants. The pretty print of a
	 * constant has the following format <code>name:comments</code> (see
	 * {@link AssertContextExtensions#prettyPrint(Constant)}). An {@link AssertionError}
	 * is thrown if the number of the context's constants does not equal
	 * length of the expected constants or any constant of the input context does
	 * not match the expected constant. The <b>order</b> of the CONSTANTS
	 * <b>matters</b>. 
	 * 
	 * @param ctx
	 *		The input context to be analysed.
	 * @param expectedConstants
	 *		The array of expected (pretty-printed) constants.
	 * @precondition The input context must not be <code>null</code>
	 */
	def assertContextConstants(Context ctx, String... expectedConstants) {
		// Assert precondition
		Assert.assertNotNull("Input context must not be null", ctx)
		
		val actualConstants = ctx.constants
		Assert.assertEquals("Incorrect number of constants", 
			expectedConstants.length, actualConstants.length
		)
		for (var i = 0; i < expectedConstants.length; i++) {
			Assert.assertEquals("Incorrect constant name", 
				expectedConstants.get(i), actualConstants.get(i).prettyPrint
			)
		}
	}

	/**
	 * Utility method for pretty print a constant. It has the following
	 * format <code>name:comments</code>, where <code>name</code> is the name of
	 * the input constant and <code>comments</code> are the comments
	 * associated with the constant.
	 * 
	 * @param cst
	 * 		The input constant to be pretty printed.
	 * @return the pretty-print string of the input constant.
	 * @precondition the input constant must not be <code>null</code>
	 */
	def private prettyPrint(Constant cst) {
		cst.name + ":" + (cst.comment ?: "")
	}
	
	/**
	 * This method asserts the AXIOMS of the input context against the
	 * array of expected (pretty-printed) axioms. The pretty print of an
	 * axiom has the following format <code>name:predicate:comments</code> (see
	 * {@link AssertContextExtensions#prettyPrint(Axiom)}). An {@link AssertionError}
	 * is thrown if the number of the context's axioms does not equal
	 * length of the expected axioms or any axiom of the input context does
	 * not match the expected axiom. The <b>order</b> of the AXIOMS
	 * <b>matters</b>. 
	 * 
	 * @param ctx
	 *		The input context to be analysed.
	 * @param expectedAxioms
	 *		The array of expected (pretty-printed) axioms.
	 * @precondition The input context must not be <code>null</code>
	 */
	def assertContextAxioms(Context ctx, String... expectedAxioms) {
		// Assert precondition
		Assert.assertNotNull("Input context must not be null", ctx)
		
		val actualAxioms = ctx.axioms
		Assert.assertEquals("Incorrect number of constants", 
			expectedAxioms.length, actualAxioms.length
		)
		for (var i = 0; i < expectedAxioms.length; i++) {
			Assert.assertEquals("Incorrect constant name", 
				expectedAxioms.get(i), actualAxioms.get(i).prettyPrint
			)
		}
	}

	/**
	 * Utility method for pretty print an axiom. It has the following
	 * format <code>name:predicate:theorem:comments</code>, where <code>name</code> 
	 * is the name (label) of the input axiom, <code>predicate</code> is the
	 * axiom's predicate, <code>theorem</code> is the boolean flag indicating if
	 * this is an theorem or not and <code>comments</code> are the comments associated
	 * with the axiom.
	 * 
	 * @param axm
	 * 		The input axiom to be pretty printed.
	 * @return the pretty-print string of the input axiom.
	 * @precondition the input axiom must not be <code>null</code>
	 */
	def private prettyPrint(Axiom axm) {
		axm.name + ":" + (axm.predicate ?: "") + ":" + axm.theorem + ":" + (axm.comment ?: "")
	}
}
