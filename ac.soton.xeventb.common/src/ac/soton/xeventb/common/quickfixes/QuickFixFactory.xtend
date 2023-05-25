/*******************************************************************************
 *  Copyright (c) 2022 University of Southampton.
 * 
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *    University of Southampton - initial API and implementation 
 *******************************************************************************/

package ac.soton.xeventb.common.quickfixes

import ac.soton.xeventb.internal.common.quickfixes.UntranslatedAssignmentQuickFix
import ac.soton.xeventb.internal.common.quickfixes.UntranslatedExpressionQuickFix
import ac.soton.xeventb.internal.common.quickfixes.UntranslatedPredicateQuickFix
import ac.soton.xeventb.internal.common.quickfixes.UntranslatedTypeQuickFix
import ac.soton.xeventb.internal.common.quickfixes.UntranslatedValueQuickFix

/**
 * An singleton implementation for a quick-fix factory
 * 
 * @since 2.0
 * @version 1.0
 * @author htson - v1.0 - Initial API and implementation.
 */
class QuickFixFactory {

	static QuickFixFactory factory;

	/**
	 * Private constructor for singleton class
	 */
	private new() {
		// Initialise various QuickFixes
	}

	/**
	 * Method to return the shared singleton instance of the quick-fix factory.
	 */
	def static QuickFixFactory getDefault() {
		if (factory === null)
			factory = new QuickFixFactory()
		return factory;
	}

	/**
	 * Instance of for untranslated assignment quick fix
	 */
	UntranslatedAssignmentQuickFix untranslatedAssignmentQuickFix;

	/**
	 * Method for returning the untranslated assignment quick fix (creating one
	 * if necessary).
	 * 
	 * @see UntranslatedAssignmentQuickFix
	 */
	def IQuickFix getUntranslatedAssignmentQuickFix() {
		if (untranslatedAssignmentQuickFix === null)
			untranslatedAssignmentQuickFix = new UntranslatedAssignmentQuickFix()
		return untranslatedAssignmentQuickFix
	}

	/**
	 * Instance of for untranslated expression quick fix
	 */
	UntranslatedExpressionQuickFix untranslatedExpressionQuickFix;

	/**
	 * Method for returning the untranslated expression quick fix (creating one
	 * if necessary).
	 * 
	 * @see UntranslatedExpressionQuickFix
	 */
	def IQuickFix getUntranslatedExpressionQuickFix() {
		if (untranslatedExpressionQuickFix === null)
			untranslatedExpressionQuickFix = new UntranslatedExpressionQuickFix()
		return untranslatedExpressionQuickFix
	}

	/**
	 * Instance of for untranslated predicate quick fix
	 */
	UntranslatedPredicateQuickFix untranslatedPredicateQuickFix;

	/**
	 * Method for returning the untranslated predicate quick fix (creating one
	 * if necessary).
	 * 
	 * @see UntranslatedPredicateQuickFix
	 */
	def IQuickFix getUntranslatedPredicateQuickFix() {
		if (untranslatedPredicateQuickFix === null)
			untranslatedPredicateQuickFix = new UntranslatedPredicateQuickFix()
		return untranslatedPredicateQuickFix
	}

	/**
	 * Instance of for untranslated type quick fix
	 */
	UntranslatedTypeQuickFix untranslatedTypeQuickFix;

	/**
	 * Method for returning the untranslated type quick fix (creating one
	 * if necessary).
	 * 
	 * @see UntranslatedTypeQuickFix
	 */
	def IQuickFix getUntranslatedTypeQuickFix() {
		if (untranslatedTypeQuickFix === null)
			untranslatedTypeQuickFix = new UntranslatedTypeQuickFix()
		return untranslatedTypeQuickFix
	}

	/**
	 * Instance of for untranslated value quick fix
	 */
	UntranslatedValueQuickFix untranslatedValueQuickFix;

	/**
	 * Method for returning the untranslated value quick fix (creating one
	 * if necessary).
	 * 
	 * @see UntranslatedValueQuickFix
	 */
	def IQuickFix getUntranslatedValueQuickFix() {
		if (untranslatedValueQuickFix === null)
			untranslatedValueQuickFix = new UntranslatedValueQuickFix()
		return untranslatedValueQuickFix
	}

}
