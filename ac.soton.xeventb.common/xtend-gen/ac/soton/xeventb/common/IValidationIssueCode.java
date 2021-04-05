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

/**
 * <p>
 * This interface provides validation issue codes
 * </p>
 * <p>
 * This interface is not intended to implement by clients.
 * </p>
 * 
 * @author htson - Initial API
 * @version 0.1
 * @since 1.0
 */
@SuppressWarnings("all")
public interface IValidationIssueCode {
  /**
   * Issue code for Untranslated predicates.
   */
  static final String UNTRANSLATED_PREDICATE = "ac.soton.xeventb.quickfix.UntranslatedPredicate";
  
  /**
   * Issue code for Untranslated expressions.
   */
  static final String UNTRANSLATED_EXPRESSION = "ac.soton.xeventb.quickfix.UntranslatedExpression";
  
  /**
   * Issue code for Untranslated assignments.
   */
  static final String UNTRANSLATED_ASSIGNMENT = "ac.soton.xeventb.quickfix.UntranslatedAssignment";
  
  /**
   * Issue code for Untranslated types.
   */
  static final String UNTRANSLATED_TYPE = "ac.soton.xeventb.quickfix.UntranslatedType";
  
  /**
   * Issue code for Untranslated types.
   */
  static final String UNTRANSLATED_VALUE = "ac.soton.xeventb.quickfix.UntranslatedValue";
}
