/**
 * Copyright (c) 2017,2018 University of Southampton.
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
 */
package ac.soton.xeventb.tests.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;
import org.junit.Assert;

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
@SuppressWarnings("all")
public class AssertContextExtensions {
  /**
   * Utility method to register the Context EPackage. This is done by simply
   * access the eClass of the ContextPackage's {@link ContextPackage.eINSTANCE}.
   */
  public EClass registerContextEPackage() {
    return ContextPackage.eINSTANCE.eClass();
  }
  
  /**
   * This method asserts the name and the comments of the input context against
   * the expected name and comments. An {@link AssertionError} is thrown if
   * the context name does not equal the expected name or the context's
   * comments does not equal the expected comments.
   * 
   * @param ctx
   * 	The input context to be analysed.
   * @param expectedName
   * 	The expected name of the context.
   * @param expectedComments
   * 	The expected comments of the context.  This could be
   * 		<code>null</code> indicating that the input context does not expect
   * 	to have any comment.
   * @precondition The input context must not be <code>null</code>
   */
  public void assertContext(final Context ctx, final String expectedName, final String expectedComments) {
    Assert.assertNotNull("Input context must not be null", ctx);
    Assert.assertEquals("Incorrect context\'s name", expectedName, ctx.getName());
    Assert.assertEquals("Incorrect context\'s comments", expectedComments, ctx.getComment());
  }
  
  /**
   * This method asserts the EXTENDS names of the input context against the
   * array of expected names. An {@link AssertionError} is thrown if the
   * number of EXTENDS names does not equal length of the expected names or
   * any EXTENDS name of the input context does not match the expected names.
   * The <b>order</b> of the EXTENDS names <b>matters</b>.
   * 
   * @param ctx
   * 	The input context to be analysed.
   * @param expectedExtendsNames
   * 	The array of expected EXTENDS names.
   * @precondition The input context must not be <code>null</code>
   */
  public void assertContextExtendsNames(final Context ctx, final String... expectedExtendsNames) {
    Assert.assertNotNull("Input context must not be null", ctx);
    final EList<String> actualExtendsNames = ctx.getExtendsNames();
    Assert.assertEquals(
      "Incorrect number of EXTENDS names", 
      expectedExtendsNames.length, 
      ((Object[])Conversions.unwrapArray(actualExtendsNames, Object.class)).length);
    for (int i = 0; (i < expectedExtendsNames.length); i++) {
      Assert.assertEquals(
        "Incorrect EXTENDS name", 
        expectedExtendsNames[i], 
        actualExtendsNames.get(i));
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
   * 	The input context to be analysed.
   * @param expectedSets
   * 	The array of expected (pretty-printed) sets.
   * @precondition The input context must not be <code>null</code>
   */
  public void assertContextSets(final Context ctx, final String... expectedSets) {
    Assert.assertNotNull("Input context must not be null", ctx);
    final EList<CarrierSet> actualSets = ctx.getSets();
    Assert.assertEquals(
      "Incorrect number of carrier sets", 
      expectedSets.length, 
      ((Object[])Conversions.unwrapArray(actualSets, Object.class)).length);
    for (int i = 0; (i < expectedSets.length); i++) {
      Assert.assertEquals(
        "Incorrect carrier set name", 
        expectedSets[i], 
        this.prettyPrint(actualSets.get(i)));
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
  private String prettyPrint(final CarrierSet set) {
    String _name = set.getName();
    String _plus = (_name + ":");
    String _elvis = null;
    String _comment = set.getComment();
    if (_comment != null) {
      _elvis = _comment;
    } else {
      _elvis = "";
    }
    return (_plus + _elvis);
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
   * 	The input context to be analysed.
   * @param expectedConstants
   * 	The array of expected (pretty-printed) constants.
   * @precondition The input context must not be <code>null</code>
   */
  public void assertContextConstants(final Context ctx, final String... expectedConstants) {
    Assert.assertNotNull("Input context must not be null", ctx);
    final EList<Constant> actualConstants = ctx.getConstants();
    Assert.assertEquals(
      "Incorrect number of constants", 
      expectedConstants.length, 
      ((Object[])Conversions.unwrapArray(actualConstants, Object.class)).length);
    for (int i = 0; (i < expectedConstants.length); i++) {
      Assert.assertEquals(
        "Incorrect constant name", 
        expectedConstants[i], 
        this.prettyPrint(actualConstants.get(i)));
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
  private String prettyPrint(final Constant cst) {
    String _name = cst.getName();
    String _plus = (_name + ":");
    String _elvis = null;
    String _comment = cst.getComment();
    if (_comment != null) {
      _elvis = _comment;
    } else {
      _elvis = "";
    }
    return (_plus + _elvis);
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
   * 	The input context to be analysed.
   * @param expectedAxioms
   * 	The array of expected (pretty-printed) axioms.
   * @precondition The input context must not be <code>null</code>
   */
  public void assertContextAxioms(final Context ctx, final String... expectedAxioms) {
    Assert.assertNotNull("Input context must not be null", ctx);
    final EList<Axiom> actualAxioms = ctx.getAxioms();
    Assert.assertEquals(
      "Incorrect number of constants", 
      expectedAxioms.length, 
      ((Object[])Conversions.unwrapArray(actualAxioms, Object.class)).length);
    for (int i = 0; (i < expectedAxioms.length); i++) {
      Assert.assertEquals(
        "Incorrect constant name", 
        expectedAxioms[i], 
        this.prettyPrint(actualAxioms.get(i)));
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
  private String prettyPrint(final Axiom axm) {
    String _name = axm.getName();
    String _plus = (_name + ":");
    String _elvis = null;
    String _predicate = axm.getPredicate();
    if (_predicate != null) {
      _elvis = _predicate;
    } else {
      _elvis = "";
    }
    String _plus_1 = (_plus + _elvis);
    String _plus_2 = (_plus_1 + ":");
    boolean _isTheorem = axm.isTheorem();
    String _plus_3 = (_plus_2 + Boolean.valueOf(_isTheorem));
    String _plus_4 = (_plus_3 + ":");
    String _elvis_1 = null;
    String _comment = axm.getComment();
    if (_comment != null) {
      _elvis_1 = _comment;
    } else {
      _elvis_1 = "";
    }
    return (_plus_4 + _elvis_1);
  }
}
