/**
 * Copyright (c) 2018, 2020 University of Southampton.
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

import ac.soton.xeventb.internal.common.RodinPrefixMatcher;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.xtext.ui.editor.contentassist.AbstractContentProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * <p>
 * Rodin symbol proposal provider, allowing to type Rodin symbols via content
 * assist.
 * </p>
 * @author htson - Initial implementation
 * @version 0.1.1
 * @see
 * @since 0.0.1
 */
@SuppressWarnings("all")
public class RodinSymbolsProposalProvider {
  /**
   * @param provider
   * @param context
   * @param acceptor
   */
  public static void completeRodinSymbol(final AbstractContentProposalProvider provider, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    int priority = provider.getPriorityHelper().getDefaultPriority();
    ConfigurableCompletionProposal[] proposals = RodinSymbolsProposalProvider.getProposals(context, priority);
    for (final ConfigurableCompletionProposal proposal : proposals) {
      acceptor.accept(proposal);
    }
  }
  
  public static ConfigurableCompletionProposal[] getProposals(final ContentAssistContext context, final int priority) {
    Collection<ConfigurableCompletionProposal> result = new ArrayList<ConfigurableCompletionProposal>();
    int replacementOffset = context.getReplaceRegion().getOffset();
    int _replacementOffset = replacementOffset;
    int _length = context.getReplaceRegion().getLength();
    replacementOffset = (_replacementOffset + _length);
    int replacementLength = 0;
    String prefix = context.getPrefix();
    String last_prefix = RodinPrefixMatcher.getLastPrefix(prefix);
    replacementLength = last_prefix.length();
    int _replacementOffset_1 = replacementOffset;
    replacementOffset = (_replacementOffset_1 - replacementLength);
    String[] proposals = RodinPrefixMatcher.getProposals(last_prefix);
    for (final String proposal : proposals) {
      result.add(RodinSymbolsProposalProvider.doCreateProposal(proposal, priority, replacementOffset, replacementLength));
    }
    return result.<ConfigurableCompletionProposal>toArray(new ConfigurableCompletionProposal[result.size()]);
  }
  
  private static ConfigurableCompletionProposal doCreateProposal(final String proposal, final int priority, final int replacementOffset, final int replacementLength) {
    int _length = proposal.length();
    ConfigurableCompletionProposal result = new ConfigurableCompletionProposal(proposal, replacementOffset, replacementLength, _length);
    result.setPriority(priority);
    RodinPrefixMatcher _rodinPrefixMatcher = new RodinPrefixMatcher();
    result.setMatcher(_rodinPrefixMatcher);
    result.setReplaceContextLength(replacementLength);
    return result;
  }
}
