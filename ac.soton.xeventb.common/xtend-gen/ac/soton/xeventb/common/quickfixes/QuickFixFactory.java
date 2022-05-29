/**
 * Copyright (c) 2022 University of Southampton.
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
package ac.soton.xeventb.common.quickfixes;

import ac.soton.xeventb.internal.common.quickfixes.UntranslatedAssignmentQuickFix;
import ac.soton.xeventb.internal.common.quickfixes.UntranslatedExpressionQuickFix;
import ac.soton.xeventb.internal.common.quickfixes.UntranslatedPredicateQuickFix;
import ac.soton.xeventb.internal.common.quickfixes.UntranslatedTypeQuickFix;
import ac.soton.xeventb.internal.common.quickfixes.UntranslatedValueQuickFix;

/**
 * An singleton implementation for a quick-fix factory
 * 
 * @since 2.0
 * @version 1.0
 * @author htson - v1.0 - Initial API and implementation.
 */
@SuppressWarnings("all")
public class QuickFixFactory {
  private static QuickFixFactory factory;
  
  /**
   * Private constructor for singleton class
   */
  private QuickFixFactory() {
  }
  
  /**
   * Method to return the shared singleton instance of the quick-fix factory.
   */
  public static QuickFixFactory getDefault() {
    if ((QuickFixFactory.factory == null)) {
      QuickFixFactory _quickFixFactory = new QuickFixFactory();
      QuickFixFactory.factory = _quickFixFactory;
    }
    return QuickFixFactory.factory;
  }
  
  /**
   * Instance of for untranslated assignment quick fix
   */
  private UntranslatedAssignmentQuickFix untranslatedAssignmentQuickFix;
  
  /**
   * Method for returning the untranslated assignment quick fix (creating one
   * if necessary).
   * 
   * @see UntranslatedAssignmentQuickFix
   */
  public IQuickFix getUntranslatedAssignmentQuickFix() {
    if ((this.untranslatedAssignmentQuickFix == null)) {
      UntranslatedAssignmentQuickFix _untranslatedAssignmentQuickFix = new UntranslatedAssignmentQuickFix();
      this.untranslatedAssignmentQuickFix = _untranslatedAssignmentQuickFix;
    }
    return this.untranslatedAssignmentQuickFix;
  }
  
  /**
   * Instance of for untranslated expression quick fix
   */
  private UntranslatedExpressionQuickFix untranslatedExpressionQuickFix;
  
  /**
   * Method for returning the untranslated expression quick fix (creating one
   * if necessary).
   * 
   * @see UntranslatedExpressionQuickFix
   */
  public IQuickFix getUntranslatedExpressionQuickFix() {
    if ((this.untranslatedExpressionQuickFix == null)) {
      UntranslatedExpressionQuickFix _untranslatedExpressionQuickFix = new UntranslatedExpressionQuickFix();
      this.untranslatedExpressionQuickFix = _untranslatedExpressionQuickFix;
    }
    return this.untranslatedExpressionQuickFix;
  }
  
  /**
   * Instance of for untranslated predicate quick fix
   */
  private UntranslatedPredicateQuickFix untranslatedPredicateQuickFix;
  
  /**
   * Method for returning the untranslated predicate quick fix (creating one
   * if necessary).
   * 
   * @see UntranslatedPredicateQuickFix
   */
  public IQuickFix getUntranslatedPredicateQuickFix() {
    if ((this.untranslatedPredicateQuickFix == null)) {
      UntranslatedPredicateQuickFix _untranslatedPredicateQuickFix = new UntranslatedPredicateQuickFix();
      this.untranslatedPredicateQuickFix = _untranslatedPredicateQuickFix;
    }
    return this.untranslatedPredicateQuickFix;
  }
  
  /**
   * Instance of for untranslated type quick fix
   */
  private UntranslatedTypeQuickFix untranslatedTypeQuickFix;
  
  /**
   * Method for returning the untranslated type quick fix (creating one
   * if necessary).
   * 
   * @see UntranslatedTypeQuickFix
   */
  public IQuickFix getUntranslatedTypeQuickFix() {
    if ((this.untranslatedTypeQuickFix == null)) {
      UntranslatedTypeQuickFix _untranslatedTypeQuickFix = new UntranslatedTypeQuickFix();
      this.untranslatedTypeQuickFix = _untranslatedTypeQuickFix;
    }
    return this.untranslatedTypeQuickFix;
  }
  
  /**
   * Instance of for untranslated value quick fix
   */
  private UntranslatedValueQuickFix untranslatedValueQuickFix;
  
  /**
   * Method for returning the untranslated value quick fix (creating one
   * if necessary).
   * 
   * @see UntranslatedValueQuickFix
   */
  public IQuickFix getUntranslatedValueQuickFix() {
    if ((this.untranslatedValueQuickFix == null)) {
      UntranslatedValueQuickFix _untranslatedValueQuickFix = new UntranslatedValueQuickFix();
      this.untranslatedValueQuickFix = _untranslatedValueQuickFix;
    }
    return this.untranslatedValueQuickFix;
  }
}
