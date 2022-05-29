/*******************************************************************************
 *  Copyright (c) 2021, 2022 University of Southampton.
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

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eventb.emf.core.EventBAction
import ac.soton.xeventb.common.quickfixes.IQuickFix

/**
 * An implementation of {@link IQuickFix} based on
 * {@link UntranslatedFormulaeQuickFix} to fix untranslated assignments in
 * {@link EventBAction} elements.
 * 
 * @since 2.0
 * @version 1.0
 * @author htson - v1.0 - Initial API and implementation.
 */
class UntranslatedAssignmentQuickFix
	extends UntranslatedFormulaeQuickFix<EventBAction>
	implements IQuickFix {

	// The type of the formulae
	static String FORMULAE_TYPE = "assignment"

	/**
	 * Implementation of the abstract method to set the assignment of an Event-B
	 * action to the translated formulae.
	 * 
	 * @param element
	 * 			the {@link EventBAction} for containing the assignment
	 * @param translatedFormulae
	 * 			the translated formulae
	 * @throw {@link UnsupportedOperationException} if the input element is not
	 * 			an {@link EventBAction}. 
	 */
	override setFormulae(EObject element, String translatedFormulae) {
		if (element instanceof EventBAction) {
			element.action = translatedFormulae
		} else {
			exception(element, FORMULAE_TYPE)
		}
	}

	/**
	 * Quick fix for untranslated assignments. Offer to replace the assignment
	 * with the translated formulae.
	 * 
	 * @param issue
	 * 			the validation issue for the assignment.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see UntranslatedFormulaeQuickfix#translateFormulae(Issue, IssueResolutionAcceptor, String)
	 */
	override fix(Issue issue, IssueResolutionAcceptor acceptor) {
		translateFormulae(issue, acceptor, FORMULAE_TYPE)
	}
}
