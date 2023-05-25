/**
 * Copyright (c) 2020 University of Southampton.
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
 */
package ac.soton.xeventb.common;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.EventBAction;
import org.eventb.emf.core.EventBExpression;
import org.eventb.emf.core.EventBPredicate;
import org.rodinp.keyboard.core.RodinKeyboardCore;

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
@SuppressWarnings("all")
public class Utils {
  /**
   * Utility method to translate the list of predicates to Event-B mathematics.
   * 
   * @param predElements
   * 		A list of predicate elements
   * @author htson
   * @since 1.0
   */
  public static void translatePredicates(final EList<EObject> predElements) {
    for (final EObject predElement : predElements) {
      if ((predElement instanceof EventBPredicate)) {
        final String predicate = ((EventBPredicate)predElement).getPredicate();
        final String translated = RodinKeyboardCore.translate(predicate);
        boolean _notEquals = (!Objects.equal(translated, predicate));
        if (_notEquals) {
          ((EventBPredicate)predElement).setPredicate(translated);
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
  public static void translateExpressions(final EList<EObject> exprElements) {
    for (final EObject exprElement : exprElements) {
      if ((exprElement instanceof EventBExpression)) {
        final String expression = ((EventBExpression)exprElement).getExpression();
        final String translated = RodinKeyboardCore.translate(expression);
        boolean _notEquals = (!Objects.equal(translated, expression));
        if (_notEquals) {
          ((EventBExpression)exprElement).setExpression(translated);
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
  public static void translateAssignments(final EList<EObject> asgnElements) {
    for (final EObject asgnElement : asgnElements) {
      if ((asgnElement instanceof EventBAction)) {
        final String expression = ((EventBAction)asgnElement).getAction();
        final String translated = RodinKeyboardCore.translate(expression);
        boolean _notEquals = (!Objects.equal(translated, expression));
        if (_notEquals) {
          ((EventBAction)asgnElement).setAction(translated);
        }
      }
    }
  }
}
