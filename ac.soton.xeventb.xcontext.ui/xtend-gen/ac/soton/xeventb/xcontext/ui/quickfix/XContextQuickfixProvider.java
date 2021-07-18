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
import ac.soton.xeventb.common.quickfixes.UntranslatedPredicateQuickFix;
import ac.soton.xeventb.common.quickfixes.UntranslatedTypeQuickFix;
import ac.soton.xeventb.common.quickfixes.UntranslatedValueQuickFix;
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
   * Extension instance of {@link UntranslatedPredicateQuickFix} to use for
   * predicate quick fixes.
   */
  @Extension
  private UntranslatedPredicateQuickFix predicateQuickfix = new UntranslatedPredicateQuickFix();
  
  /**
   * Extension instance of {@link UntranslatedTypeQuickFix} to use for
   * type quick fixes.
   */
  @Extension
  private UntranslatedTypeQuickFix typeQuickfix = new UntranslatedTypeQuickFix();
  
  /**
   * Extension instance of {@link UntranslatedValueQuickFix} to use for
   * value quick fixes.
   */
  @Extension
  private UntranslatedValueQuickFix valueQuickfix = new UntranslatedValueQuickFix();
  
  /**
   * Quick fix for untranslated predicates. Offer to replace the predicate by
   * the translated formula.
   */
  @Fix(IValidationIssueCode.UNTRANSLATED_PREDICATE)
  public void fixUntranslatedPredicate(final Issue issue, final IssueResolutionAcceptor acceptor) {
    this.predicateQuickfix.translatePredicate(issue, acceptor);
  }
  
  /**
   * Quick fix for untranslated types. Offer to replace the type by
   * the translated formula.
   */
  @Fix(IValidationIssueCode.UNTRANSLATED_TYPE)
  public void fixUntranslatedType(final Issue issue, final IssueResolutionAcceptor acceptor) {
    this.typeQuickfix.translateType(issue, acceptor);
  }
  
  /**
   * Quick fix for untranslated types. Offer to replace the type by
   * the translated formula.
   */
  @Fix(IValidationIssueCode.UNTRANSLATED_VALUE)
  public void fixedUntranslatedValue(final Issue issue, final IssueResolutionAcceptor acceptor) {
    this.valueQuickfix.translateValue(issue, acceptor);
  }
}
