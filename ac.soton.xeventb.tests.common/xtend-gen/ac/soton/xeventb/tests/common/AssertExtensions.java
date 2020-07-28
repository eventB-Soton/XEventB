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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.junit.Assert;

/**
 * <p>
 * This class contains utility methods for testing diagnostic details. These
 * methods also can be used via Xtend extensions mechanism.
 * </p>
 * 
 * @author htson
 * @version 0.1
 * @see Diagnostic
 * @since 0.0.8
 */
@SuppressWarnings("all")
public class AssertExtensions {
  /**
   * This method asserts the input diagnostic against the expected message,
   * the expected location, the expected column and line. An
   * {@link AssertionError} is thrown if the diagnostic details does not match
   * the expected details.
   * 
   * @param diagnostic
   * 		The diagnostic to be analysed.
   * @param expectedMessage
   * 		The expected message associated with the input diagnostic.
   * @param expectedLocation
   * 		The expected location associated with the input diagnostic.
   * @param expectedColumn
   * 		The expected column associated with the input diagnostic.
   * @param expectedLine
   * 		The expected line associated with the input diagnostic.
   */
  public void assertErrorDetails(final Resource.Diagnostic diagnostic, final String expectedMessage, final String expectedLocation, final int expectedColumn, final int expectedLine) {
    Assert.assertEquals("Incorrect error message", expectedMessage, 
      diagnostic.getMessage());
    Assert.assertEquals("Incorrect error location", expectedLocation, 
      diagnostic.getLocation());
    Assert.assertEquals("Incorrect error column", expectedColumn, 
      diagnostic.getColumn());
    Assert.assertEquals("Incorrect error line", expectedLine, 
      diagnostic.getLine());
  }
  
  /**
   * This method asserts the input list of diagnostics to be empty. An
   * {@link AssertionError} is thrown if the input list is not empty.
   * 
   * @param diagnostics
   * 		The input list of diagnostics.
   * @precondition the input list must not be <code>null</code>.
   */
  public void assertEmpty(final EList<Resource.Diagnostic> diagnostics) {
    Assert.assertTrue("The must be no diagnostics", diagnostics.isEmpty());
  }
  
  /**
   * This method asserts the input list of diagnostics to be not empty. An
   * {@link AssertionError} is thrown if the input list is empty.
   * 
   * @param diagnostics
   * 		The input list of diagnostics.
   * @precondition the input list must not be <code>null</code>.
   */
  public void assertNotEmpty(final EList<Resource.Diagnostic> diagnostics) {
    Assert.assertFalse("The must be some diagnostics", diagnostics.isEmpty());
  }
  
  /**
   * This method asserts the length of the input list of diagnostics against
   * the expected length. An {@link AssertionError} is thrown if the length of
   * the input list is not the expected length.
   * 
   * @param diagnostics
   * 		The input list of diagnostics.
   * @param expectedLength
   * 		The expected length of the list of diagnostics.
   * @precondition the input list must not be <code>null</code>.
   */
  public void assertLength(final EList<Resource.Diagnostic> diagnostics, final int expectedLength) {
    Assert.assertEquals("Incorrect number of diagnostics", 
      ((Object[])Conversions.unwrapArray(diagnostics, Object.class)).length, expectedLength);
  }
}
