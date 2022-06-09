/**
 * Copyright (c) 2020 University of Southampton.
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xcontext.ui.quickfix;

import ac.soton.xeventb.common.IValidationIssueCode;
import ac.soton.xeventb.common.quickfixes.QuickFixFactory;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * <p>
 * This class provides custom quick fixes for the XContexts.
 * </p>
 * 
 * @author htson (v0.1) - Initial API and Implementation
 * @author htson (v0.2) - Refactor common quick fixes with XMachine
 * @version 0.2
 * @since 2.0
 */
@SuppressWarnings("all")
public class XContextQuickfixProvider extends DefaultQuickfixProvider {
  /**
   * Extension instance of {@link QuickFixFactory} to use for getting various
   * quick fixes.
   */
  @Extension
  private QuickFixFactory quickFixFactory = QuickFixFactory.getDefault();
  
  /**
   * Quick fix for untranslated predicates. Offer to replace the predicate by
   * the translated formula.
   * 
   * @param issue
   * 			the validation issue for the predicate element.
   * @param acceptor
   * 			the issue resolution acceptor
   * @see QuickFixFactory#getUntranslatedPredicateQuickFix()
   */
  @Fix(IValidationIssueCode.UNTRANSLATED_PREDICATE)
  public void fixUntranslatedPredicate(final Issue issue, final IssueResolutionAcceptor acceptor) {
    this.quickFixFactory.getUntranslatedPredicateQuickFix().fix(issue, acceptor);
  }
  
  /**
   * Quick fix for untranslated types. Offer to replace the type by
   * the translated formula.
   * 
   * @param issue
   * 			the validation issue for the type element.
   * @param acceptor
   * 			the issue resolution acceptor
   * @see QuickFixFactory#getUntranslatedTypeQuickFix()
   * @since 3.0
   */
  @Fix(IValidationIssueCode.UNTRANSLATED_TYPE)
  public void fixUntranslatedType(final Issue issue, final IssueResolutionAcceptor acceptor) {
    this.quickFixFactory.getUntranslatedTypeQuickFix().fix(issue, acceptor);
  }
  
  /**
   * Quick fix for untranslated types. Offer to replace the type by
   * the translated formula.
   * 
   * @param issue
   * 			the validation issue for the value element.
   * @param acceptor
   * 			the issue resolution acceptor
   * @see QuickFixFactory#getUntranslatedValueQuickFix()
   * @since 3.0
   */
  @Fix(IValidationIssueCode.UNTRANSLATED_VALUE)
  public void fixedUntranslatedValue(final Issue issue, final IssueResolutionAcceptor acceptor) {
    this.quickFixFactory.getUntranslatedValueQuickFix().fix(issue, acceptor);
  }
}
