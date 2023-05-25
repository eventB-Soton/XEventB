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

import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import ac.soton.xeventb.common.UntranslatedFormulaeValidator

/**
 * A common interface for quick fixes.
 * 
 * @since 2.0
 * @version 1.0
 * @author htson - v1.0 - Initial API and implementation.
 */
interface IQuickFix {
	
	/**
	 * Method for fixing the issue raised with a resolution acceptor.
	 * 
	 * @param issue
	 * 			the validation issue
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @param formulaType
	 * 			the type of the formulae, e.g., "predicate", "assignment", etc.
	 * @see UntranslatedFormulaeValidator
	 */
	def void fix(Issue issue, IssueResolutionAcceptor acceptor)
}