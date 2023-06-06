/**
 * generated by Xtext 2.13.0
 */
package ac.soton.xeventb.xmachine.tests;

import ac.soton.xeventb.tests.common.AssertExtensions;
import ac.soton.xeventb.tests.common.AssertMachineExtensions;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @since 2.0
 */
@RunWith(XtextRunner.class)
@InjectWith(XMachineInjectorProvider.class)
@SuppressWarnings("all")
public class XMachineParsingTest {
  @Inject
  @Extension
  private ParseHelper<Machine> parseHelper;

  @Extension
  private AssertExtensions _assertExtensions = new AssertExtensions();

  @Extension
  private AssertMachineExtensions _assertMachineExtensions = new AssertMachineExtensions();

  /**
   * Manually register any EPackage required for running the tests.
   * @since 2.0
   */
  @Before
  public void registerEPackages() {
    this._assertMachineExtensions.registerMachineEPackage();
  }

  /**
   * Successful test for context clause.
   * 
   * @since 2.0
   */
  @Test
  public void testMachineClauseSuccessful() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("machine m0");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      final Machine result = this.parseHelper.parse(testInput);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      this._assertExtensions.assertEmpty(errors);
      Assert.assertTrue((result instanceof Machine));
      this._assertMachineExtensions.assertMachine(result, "m0", null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Successful test for multi-line comments with context clause.
   * 
   * @since 2.0
   */
  @Test
  public void testMachineClauseSuccessful_ML_COMMENT() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Multi-line");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* comments");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("machine m0");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      final Machine result = this.parseHelper.parse(testInput);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      this._assertExtensions.assertEmpty(errors);
      Assert.assertTrue((result instanceof Machine));
      this._assertMachineExtensions.assertMachine(result, "m0", null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Successful test for single-line comments with context clause.
   * 
   * @since 2.0
   */
  @Test
  public void testMachineClauseSuccessful_SL_COMMENT() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("// Single-line comment");
      _builder.newLine();
      _builder.append("machine m0");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      final Machine result = this.parseHelper.parse(testInput);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      this._assertExtensions.assertEmpty(errors);
      Assert.assertTrue((result instanceof Machine));
      this._assertMachineExtensions.assertMachine(result, "m0", null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Successful test for events clause with multiple event
   * (Issue #76)
   * 
   * @since 2.2
   */
  @Test
  public void testEventsClauseMultipleEventSuccessful() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("// Single-line comment");
      _builder.newLine();
      _builder.append("machine m0");
      _builder.newLine();
      _builder.append("events");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("event e end");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("event f end");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final String testInput = _builder.toString();
      final Machine result = this.parseHelper.parse(testInput);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      this._assertExtensions.assertEmpty(errors);
      Assert.assertTrue((result instanceof Machine));
      this._assertMachineExtensions.assertMachine(result, "m0", null);
      final Event[] events = ((Event[])Conversions.unwrapArray(result.getEvents(), Event.class));
      Assert.assertEquals("There should be 2 events", 2, events.length);
      final Event event0 = events[0];
      this._assertMachineExtensions.assertEvent(event0, "e:ordinary:false");
      final Event event1 = events[1];
      this._assertMachineExtensions.assertEvent(event1, "f:ordinary:false");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
