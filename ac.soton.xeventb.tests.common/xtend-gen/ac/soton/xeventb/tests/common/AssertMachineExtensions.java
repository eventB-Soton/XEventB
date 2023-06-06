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

import org.eclipse.emf.ecore.EClass;
import org.eventb.emf.core.machine.Convergence;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.junit.Assert;

/**
 * <p>
 * This class contains utility methods for testing EMF {@link Machine}'s details.
 * These methods also can be used via Xtend extensions mechanism.
 * </p>
 * TODO Add more methods for testing individual elements of machines, e.g.,
 * <code>assertVariable(Variable vrb, String expectedName, String expectedComments)</code>
 * 
 * @author htson
 * @version 0.1
 * @see Machine
 * @see MachinePackage
 * @since 0.1
 */
@SuppressWarnings("all")
public class AssertMachineExtensions {
  /**
   * Utility method to register the Machine EPackage. This is done by simply
   * access the eClass of the MachinePackage's {@link MachinePackage.eINSTANCE}.
   */
  public EClass registerMachineEPackage() {
    return MachinePackage.eINSTANCE.eClass();
  }

  /**
   * This method asserts the name and the comments of the input machine against
   * the expected name and comments. An {@link AssertionError} is thrown if
   * the machine name does not equal the expected name or the machine's
   * comments does not equal the expected comments.
   * 
   * @param mch
   * 	The input context to be analysed.
   * @param expectedName
   * 	The expected name of the machine.
   * @param expectedComments
   * 	The expected comments of the machine.  This could be
   * 		<code>null</code> indicating that the input machine does not expect
   * 	to have any comment.
   * @precondition The input machine must not be <code>null</code>
   */
  public void assertMachine(final Machine mch, final String expectedName, final String expectedComments) {
    Assert.assertNotNull("Input context must not be null", mch);
    Assert.assertEquals("Incorrect context\'s name", expectedName, mch.getName());
    Assert.assertEquals("Incorrect context\'s comments", expectedComments, mch.getComment());
  }

  /**
   * This method asserts the actual event against
   * the expected content of event. An {@link AssertionError} is thrown if
   * the the actual content is different from the expected content.
   * 
   * @param evt
   * 	The input event to be analysed.
   * @param expected
   *            the expected pretty-print event (only the signature). The
   *            event is "pretty-printed" as follows:
   *            "label:convergent:isExtended".
   * @precondition The input event must not be <code>null</code>
   * @since 0.3
   */
  public void assertEvent(final Event evt, final String expected) {
    Assert.assertNotNull("Input context must not be null", evt);
    String _name = evt.getName();
    String _plus = (_name + ":");
    Convergence _convergence = evt.getConvergence();
    String _plus_1 = (_plus + _convergence);
    String _plus_2 = (_plus_1 + ":");
    boolean _isExtended = evt.isExtended();
    String _plus_3 = (_plus_2 + Boolean.valueOf(_isExtended));
    Assert.assertEquals("Incorrect event ", expected, _plus_3);
  }
}
