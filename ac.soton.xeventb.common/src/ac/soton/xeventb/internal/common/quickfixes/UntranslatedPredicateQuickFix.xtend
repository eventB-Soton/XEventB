/*******************************************************************************
 *  Copyright (c) 2021, 2002 University of Southampton.
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
package ac.soton.xeventb.internal.common.quickfixes

import ac.soton.xeventb.common.quickfixes.IQuickFix
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eventb.emf.core.EventBPredicate

/**
 * An implementation of {@link IQuickFix} based on
 * {@link UntranslatedFormulaeQuickFix} to fix untranslated predicates in
 * {@link EventBPredicate} elements.
 * 
 * @since 2.0
 * @version 1.0
 * @author htson - Initial API and implementation.
 */
class UntranslatedPredicateQuickFix
	extends UntranslatedFormulaeQuickFix<EventBPredicate>
	implements IQuickFix {

	// The type of the formulae
	static String FORMULA_TYPE = "predicate"

	/**
	 * Implementation of the abstract method to set the predicate of an Event-B
	 * predicate element to the translated formulae.
	 * 
	 * @param element
	 * 			the {@link EventBPredicate} for containing the predicate
	 * @param translatedFormulae
	 * 			the translated formulae
	 * @throw {@link UnsupportedOperationException} if the input element is not
	 * 			an {@link EventBPredicate}. 
	 */
	override setFormulae(EObject element, String translatedFormula) {
		if (element instanceof EventBPredicate) {
			element.predicate = translatedFormula
		} else {
			exception(element, FORMULA_TYPE)
		}
	}

	/**
	 * Quick fix for untranslated predicates. Offer to replace the predicate
	 * with the translated formulae.
	 * 
	 * @param issue
	 * 			the validation issue for the predicate element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see UntranslatedFormulaeQuickfix#translateFormulae(Issue, IssueResolutionAcceptor, String)
	 */
	override fix(Issue issue, IssueResolutionAcceptor acceptor) {
		translateFormulae(issue, acceptor, FORMULA_TYPE)
	}
}
