/*******************************************************************************
 *  Copyright (c) 2016,2017 University of Southampton.
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

package ac.soton.xeventb.xmachine.ui.contentassist

import ac.soton.xeventb.xmachine.ui.contentassist.AbstractXMachineProposalProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import ac.soton.xeventb.common.RodinSymbolsProposalProvider

/**
* @author hson
* See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
* on how to customize the content assistant.
*/

class XMachineProposalProvider extends AbstractXMachineProposalProvider {


	override complete_ML_COMMENT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		RodinSymbolsProposalProvider.completeRodinSymbol(this, context, acceptor)

	}

	override complete_SL_COMMENT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		RodinSymbolsProposalProvider.completeRodinSymbol(this, context, acceptor)

	}

	override complete_STRING(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		super.complete_STRING(model, ruleCall, context, acceptor)

		RodinSymbolsProposalProvider.completeRodinSymbol(this, context, acceptor)

	}

	override complete_XFormula(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		RodinSymbolsProposalProvider.completeRodinSymbol(this, context, acceptor)
	}

}