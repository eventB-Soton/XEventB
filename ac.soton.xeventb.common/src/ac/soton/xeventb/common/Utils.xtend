/*******************************************************************************
 *  Copyright (c) 2020 University of Southampton.
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

package ac.soton.xeventb.common

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eventb.emf.core.EventBAction
import org.eventb.emf.core.EventBExpression
import org.eventb.emf.core.EventBPredicate
import org.rodinp.keyboard.core.RodinKeyboardCore

/**
 * <p>
 * Class to provide utility methods.
 * </p>
 *
 * @author htson - Initial Implementation
 * @version 0.1
 * @see RodinKeyboardCore
 * @since 1.0
 */
class Utils {
	
	/**
	 * Utility method to translate the list of predicates to Event-B mathematics.
	 * 
	 * @param predElements
	 * 		A list of predicate elements
	 * @author htson
	 * @since 1.0
	 */
	def static translatePredicates(EList<EObject> predElements) {
		for (predElement : predElements) {
			if (predElement instanceof EventBPredicate) {
				val predicate = predElement.predicate
				val translated = RodinKeyboardCore.translate(predicate)
				if (translated != predicate) {
					predElement.predicate = translated
				}
			}
		}		
	}

	/**
	 * Utility method to translate the list of expressions to Event-B mathematics.
	 * 
	 * @param exprElements
	 * 		A list of expression elements
	 * @author htson
	 * @since 1.0
	 */
	def static translateExpressions(EList<EObject> exprElements) {
		for (exprElement : exprElements) {
			if (exprElement instanceof EventBExpression) {
				val expression = exprElement.expression
				val translated = RodinKeyboardCore.translate(expression)
				if (translated != expression) {
					exprElement.expression = translated
				}
			}
		}		
	}

	/**
	 * Utility method to translate the list of assignments to Event-B mathematics.
	 * 
	 * @param asgnElements
	 * 		A list of assignment elements
	 * @author htson
	 * @since 1.0
	 */
	def static translateAssignments(EList<EObject> asgnElements) {
		for (asgnElement : asgnElements) {
			if (asgnElement instanceof EventBAction) {
				val expression = asgnElement.action
				val translated = RodinKeyboardCore.translate(expression)
				if (translated != expression) {
					asgnElement.action = translated
				}
			}
		}		
	}

}