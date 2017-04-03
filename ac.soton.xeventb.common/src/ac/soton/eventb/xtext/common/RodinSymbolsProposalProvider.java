/*******************************************************************************
 * Copyright (c) 2016 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.eventb.xtext.common;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.xtext.ui.editor.contentassist.AbstractContentProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import ac.soton.eventb.xtext.internal.common.RodinPrefixMatcher;

/**
 * <p>
 * Rodin symbol proposal provider, allowing to type Rodin symbols via content
 * assist.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @see
 * @since 0.0.1
 */
public class RodinSymbolsProposalProvider {

	/**
	 * @param provider
	 * @param context
	 * @param acceptor
	 */
	public static void completeRodinSymbol(
			AbstractContentProposalProvider provider,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		int priority = provider.getPriorityHelper().getDefaultPriority();
		ConfigurableCompletionProposal[] proposals = RodinSymbolsProposalProvider
				.getProposals(context, priority);
		for (ConfigurableCompletionProposal proposal : proposals) {
			acceptor.accept(proposal);
		}
	}

	public static ConfigurableCompletionProposal[] getProposals(
			ContentAssistContext context, int priority) {
		Collection<ConfigurableCompletionProposal> result = new ArrayList<ConfigurableCompletionProposal>();
		int replacementOffset = context.getReplaceRegion().getOffset();
		replacementOffset += context.getReplaceRegion().getLength();
		int replacementLength = 0;
		String prefix = context.getPrefix();

		String last_prefix = RodinPrefixMatcher.getLastPrefix(prefix);
		replacementLength = last_prefix.length();
		replacementOffset -= replacementLength;

		String[] proposals = RodinPrefixMatcher.getProposals(last_prefix);

		for (String proposal : proposals) {
			result.add(doCreateProposal(proposal, priority, replacementOffset,
					replacementLength));
		}
		return result
				.toArray(new ConfigurableCompletionProposal[result.size()]);

	}

	private static ConfigurableCompletionProposal doCreateProposal(
			String proposal, int priority, int replacementOffset,
			int replacementLength) {
		ConfigurableCompletionProposal result = new ConfigurableCompletionProposal(
				proposal, replacementOffset, replacementLength,
				proposal.length());
		result.setPriority(priority);
		result.setMatcher(new RodinPrefixMatcher());
		result.setReplaceContextLength(replacementLength);
		return result;
	}

}
