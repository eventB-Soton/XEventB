/*
 * generated by Xtext 2.11.0
 */
package ac.soton.xeventb.xcontext.tests

import ac.soton.xeventb.tests.common.AssertContextExtensions
import ac.soton.xeventb.tests.common.AssertExtensions
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eventb.emf.core.context.Context
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @since 1.0 
 */
@RunWith(XtextRunner)
@InjectWith(XContextInjectorProvider)
class XContextParsingTest {
	@Inject	extension ParseHelper<Context> parseHelper

	extension AssertExtensions = new AssertExtensions()
	extension AssertContextExtensions = new AssertContextExtensions()
	
	/**
	 * Manually register any EPackage required for running the tests.
	 * @since 1.0
	 */
	@Before
	def void registerEPackages() {
		registerContextEPackage
	}
	
	/**
	 * Successful test for context clause.
	 * 
	 * @since 1.0
	 */
	@Test
	def void testContextClauseSuccessful() {
		val testInput = 
		'''
			context c0
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		result.assertContext("c0", null)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms()
	}

	/**
	 * Successful test for multi-line comments with context clause.
	 * 
	 * @since 1.0
	 */
	@Test
	def void testContextClauseSuccessful_ML_COMMENT() {
		val testInput = 
		'''
			/* 
			 * Multi-line
			 * comments
			 */
			context c0
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		result.assertContext("c0", null)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms()
	}

	/**
	 * Successful test for single-line comments with context clause.
	 * 
	 * @since 1.0
	 */
	@Test
	def void testContextClauseSuccessful_SL_COMMENT() {
		val testInput = 
		'''
			// Single-line comment
			context c0
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		result.assertContext("c0", null)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms()
	}

	/**
	 * Test for erroneous context clause.
	 * 
	 * @since 1.0
	 */
	@Test
	def void testContextClauseFailed_ErrornousName() {
		val testInput = 
		'''
			context 0c
			end
		'''
		val result = testInput.parse()
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertNotEmpty
		errors.assertLength(1)
		errors.get(0).assertErrorDetails(
			"extraneous input '0' expecting RULE_ID", null, 9, 1)
		Assert.assertTrue(result instanceof Context)
	}

	/**
	 * Successful test for for sets clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupSets_OneSet_WithEnd() {
		val testInput = 
		'''
			context c0
			sets S
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets("S:")
		result.assertContextConstants()
		result.assertContextAxioms()
	}

	/**
	 * Successful test for for sets clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupSets_OneSet_NoEnd() {
		val testInput = 
		'''
			context c0
			sets S
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets("S:")
		result.assertContextConstants()
		result.assertContextAxioms()
	}

	/**
	 * Successful test for for sets clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupSets_TwoSets_WithEnd() {
		val testInput = 
		'''
			context c0
			sets S T
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets("S:", "T:")
		result.assertContextConstants()
		result.assertContextAxioms()
	}

	/**
	 * Successful test for for sets clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupSets_TwoSets_NoEnd() {
		val testInput = 
		'''
			context c0
			sets S T
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets("S:", "T:")
		result.assertContextConstants()
		result.assertContextAxioms()
	}

	/**
	 * Successful test for for constants clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupConstants_OneConstant_WithEnd() {
		val testInput = 
		'''
			context c0
			constants a
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants("a:")
		result.assertContextAxioms()
	}

	/**
	 * Successful test for for constants clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupConstants_OneConstant_NoEnd() {
		val testInput = 
		'''
			context c0
			constants a
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants("a:")
		result.assertContextAxioms()
	}

	/**
	 * Successful test for for constants clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupConstants_TwoConstants_WithEnd() {
		val testInput = 
		'''
			context c0
			constants a b
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants("a:", "b:")
		result.assertContextAxioms()
	}

	/**
	 * Successful test for for constants clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupConstants_TwoConstants_NoEnd() {
		val testInput = 
		'''
			context c0
			constants a b
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants("a:", "b:")
		result.assertContextAxioms()
	}

	/**
	 * Successful test for for axioms clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_SingleAxiom_OneAxiom_WithEnd() {
		val testInput = 
		'''
			context c0
			axiom @axm1: a ∈ S
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms("axm1:a ∈ S:false:")
	}

	/**
	 * Successful test for for axioms clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_SingleAxiom_OneAxiom_NoEnd() {
		val testInput = 
		'''
			context c0
			axiom @axm1: a ∈ S
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms("axm1:a ∈ S:false:")
	}

	/**
	 * Successful test for for axioms clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_SingeAxiom_TwoAxioms_WithEnd() {
		val testInput = 
		'''
			context c0
			axiom @axm1: a ∈ S
			axiom @axm2: b ∈ T
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms("axm1:a ∈ S:false:", "axm2:b ∈ T:false:")
	}

	/**
	 * Successful test for for axioms clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_SingeAxiom_TwoAxioms_NoEnd() {
		val testInput = 
		'''
			context c0
			axiom @axm1: a ∈ S
			axiom @axm2: b ∈ T
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms("axm1:a ∈ S:false:", "axm2:b ∈ T:false:")
	}

	/**
	 * Successful test for for axioms clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupAxiom_OneAxiom_WithEnd() {
		val testInput = 
		'''
			context c0
			axioms 
				@axm1: a ∈ S
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms("axm1:a ∈ S:false:")
	}

	/**
	 * Successful test for for axioms clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupAxioms_OneAxiom_NoEnd() {
		val testInput = 
		'''
			context c0
			axioms 
				@axm1: a ∈ S
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms("axm1:a ∈ S:false:")
	}

	/**
	 * Successful test for for axioms clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupAxioms_TwoAxioms_WithEnd() {
		val testInput = 
		'''
			context c0
			axioms 
				@axm1: a ∈ S
				@axm2: b ∈ T
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms("axm1:a ∈ S:false:", "axm2:b ∈ T:false:")
	}

	/**
	 * Successful test for for axioms clause.
	 * 
	 * @since 3.0
	 */
	@Test
	def void testSetsClauseSuccessful_GroupAxioms_TwoAxioms_NoEnd() {
		val testInput = 
		'''
			context c0
			axioms 
				@axm1: a ∈ S
				@axm2: b ∈ T
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Context)
		Assert.assertEquals("c0", result.name)
		result.assertContextExtendsNames()
		result.assertContextSets()
		result.assertContextConstants()
		result.assertContextAxioms("axm1:a ∈ S:false:", "axm2:b ∈ T:false:")
	}
}