/*******************************************************************************
 *  Copyright (c) 2018, 2020 University of Southampton.
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

import java.util.ArrayList
import java.util.Collection
import org.eclipse.xtext.ui.editor.contentassist.AbstractContentProposalProvider
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import ac.soton.xeventb.internal.common.RodinPrefixMatcher

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
class RodinSymbolsProposalProvider {
	/** 
	 * @param provider
	 * @param context
	 * @param acceptor
	 */
	def static void completeRodinSymbol(AbstractContentProposalProvider provider, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		var int priority = provider.getPriorityHelper().getDefaultPriority()
		var ConfigurableCompletionProposal[] proposals = RodinSymbolsProposalProvider.getProposals(context, priority)
		for (ConfigurableCompletionProposal proposal : proposals) {
			acceptor.accept(proposal)
		}
	}

	def static ConfigurableCompletionProposal[] getProposals(ContentAssistContext context, int priority) {
		var Collection<ConfigurableCompletionProposal> result = new ArrayList<ConfigurableCompletionProposal>()
		var int replacementOffset = context.getReplaceRegion().getOffset()
		replacementOffset += context.getReplaceRegion().getLength()
		var int replacementLength = 0
		var String prefix = context.getPrefix()
		var String last_prefix = RodinPrefixMatcher.getLastPrefix(prefix)
		replacementLength = last_prefix.length()
		replacementOffset -= replacementLength
		var String[] proposals = RodinPrefixMatcher.getProposals(last_prefix)
		for (String proposal : proposals) {
			result.add(doCreateProposal(proposal, priority, replacementOffset, replacementLength))
		}
		return result.toArray(newArrayOfSize(result.size()))
	}

	def private static ConfigurableCompletionProposal doCreateProposal(String proposal, int priority,
		int replacementOffset, int replacementLength) {
		var ConfigurableCompletionProposal result = new ConfigurableCompletionProposal(proposal, replacementOffset,
			replacementLength, proposal.length())
		result.setPriority(priority)
		result.setMatcher(new RodinPrefixMatcher())
		result.setReplaceContextLength(replacementLength)
		return result
	}
}
