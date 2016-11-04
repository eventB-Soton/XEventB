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

package ac.soton.eventb.xtext.machine.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

import ac.soton.eventb.xtext.machine.services.XMachineGrammarAccess;
import ac.soton.eventb.xtext.machine.services.XMachineGrammarAccess.XEventElements;
import ac.soton.eventb.xtext.machine.services.XMachineGrammarAccess.XMachineElements;

/**
 * <p>
 * XMachine formatter based on abstract declarative formatter.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @see XMachineGrammarAccess
 * @since 0.0.2
 */
public class XMachineFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		XMachineGrammarAccess f = (XMachineGrammarAccess) getGrammarAccess();
		XMachineElements xMachineElements = f.getXMachineAccess();

        // set a maximum size of lines
        c.setAutoLinewrap(80);
        
		// **machine** clause
        // Start a new line after each multi-line comment for machine.
		c.setLinewrap().after(xMachineElements.getCommentML_COMMENTTerminalRuleCall_1_0_0());

		// **refines** clause
		Keyword refinesKeyword = xMachineElements.getRefinesKeyword_4_0();
 		// Put a blank line before the "refines" keyword.
		c.setLinewrap(2).before(refinesKeyword);
		// Start a new line after the "refines" keyword.
		c.setLinewrap(1).after(refinesKeyword);
		// Put an empty line before each refined machine.
		c.setLinewrap(2).before(xMachineElements.getRefinesAssignment_4_1());
		// Indent one level before each refined machine.
		c.setIndentationIncrement().before(xMachineElements.getRefinesAssignment_4_1());
		// Start a new line after each refined machine.
		c.setLinewrap().after(xMachineElements.getRefinesAssignment_4_1());
		// Un-indent one level after each refined machine.
		c.setIndentationDecrement().after(xMachineElements.getRefinesAssignment_4_1());
		
		// **sees** clause
		Keyword seesKeyword = xMachineElements.getSeesKeyword_5_0();
		// Put a blank line before the "sees" keyword.
		c.setLinewrap(2).before(seesKeyword);
		// Start a new line after the "sees" keyword.
		c.setLinewrap(1).after(seesKeyword);
		// Put an empty line before each seen context.
		c.setLinewrap(2).before(xMachineElements.getSeesAssignment_5_1());
		// Indent one level before each seen context.
		c.setIndentationIncrement().before(xMachineElements.getSeesAssignment_5_1());
		// Start a new line after each seen context.
		c.setLinewrap().after(xMachineElements.getSeesAssignment_5_1());
		// Un-indent one level after each seen context.
		c.setIndentationDecrement().after(xMachineElements.getSeesAssignment_5_1());

		// **variables** clause
		Keyword variablesKeyword = xMachineElements.getVariablesKeyword_6_0();
		// Put a blank line before the "variables" keyword.
		c.setLinewrap(2).before(variablesKeyword);
		// Start a new line after the "variables" keyword.
		c.setLinewrap(1).after(variablesKeyword);
		// Put an empty line before each variable.
		c.setLinewrap(2).before(f.getXVariableRule());
		// Start a new line after each multi-line comment for variables.
		c.setLinewrap().after(f.getXVariableAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
		// Indent one level before each variable.
		c.setIndentationIncrement().before(xMachineElements.getVariablesAssignment_6_1());
		// Start a new line after each variable.
		c.setLinewrap().after(f.getXVariableRule());
		// Un-indent one level after each variable.
		c.setIndentationDecrement().after(xMachineElements.getVariablesAssignment_6_1());
		
		// **invariants** clause
		Keyword invariantsKeyword = xMachineElements.getInvariantsKeyword_7_0();
		// Put a blank line before the "invariants" keyword.
		c.setLinewrap(2).before(invariantsKeyword);
		// Start a new line after the "invariants" keyword.
		c.setLinewrap(1).after(invariantsKeyword);
		// Put an empty line before each invariant.
		c.setLinewrap(2).before(f.getXInvariantRule());
		// Start a new line after each multi-line comment for invariants.
		c.setLinewrap().after(f.getXInvariantAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
		// Indent one level before each invariant.
		c.setIndentationIncrement().before(xMachineElements.getInvariantsAssignment_7_1());
		// Start a new line after each invariant.
		c.setLinewrap().after(f.getXInvariantRule());
		// Un-indent one level after each invariant.
		c.setIndentationDecrement().after(xMachineElements.getInvariantsAssignment_7_1());

		// **events** clause
		Keyword eventsKeyword = xMachineElements.getEventsKeyword_9_0();
		XEventElements xEventElements = f.getXEventAccess();
		// Put a blank line before the **events** keyword.
		c.setLinewrap(2).before(eventsKeyword);
		// Start a new line after the **events** keyword.
		c.setLinewrap(1).after(eventsKeyword);
		// Put an empty line before each event.
		c.setLinewrap(2).before(f.getXEventRule());
		// Start a new line after each multi-line comment for events.
		c.setLinewrap().after(xEventElements.getCommentML_COMMENTTerminalRuleCall_1_0_0());
		// Indent one level before each event.
		c.setIndentationIncrement().before(xMachineElements.getEventsAssignment_9_1());
		// Indent one level before each event.
		c.setIndentationIncrement().before(xMachineElements.getEventsAssignment_9_2_1());
		// Start a new line after each event.
		c.setLinewrap().after(f.getXEventRule());
		// Un-indent one level after each event.
		c.setIndentationDecrement().after(xMachineElements.getEventsAssignment_9_1());
		// Un-indent one level after each event.
		c.setIndentationDecrement().after(xMachineElements.getEventsAssignment_9_2_1());

		
		// Start a new line before the **refines** keyword.
		c.setLinewrap().before(xEventElements.getRefinesKeyword_4_0());
		// Set no new line for the refined event
		c.setNoLinewrap().before(xEventElements.getRefinesAssignment_4_1());
		
		// Start a new line before the **with** keyword.
		c.setLinewrap().before(xEventElements.getWithKeyword_5_0_0_0());
		// Start a new line before each witness.
		c.setLinewrap().before(f.getXWitnessRule());
		// Start a new line after each multi-line comment for witnesses.
		c.setLinewrap().after(f.getXWitnessAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
		// Indent one level before each witness.
		c.setIndentationIncrement().before(xEventElements.getWitnessesAssignment_5_0_0_1());
		// Start a new line after each witness.
		c.setLinewrap().after(f.getXWitnessRule());
		// Un-indent one level after each witness.
		c.setIndentationDecrement().after(xEventElements.getWitnessesAssignment_5_0_0_1());
		
		// Start a new line before the **begin** keyword.
		c.setLinewrap().before(xEventElements.getBeginKeyword_5_0_1());
		// Start a new line before each action.
		c.setLinewrap().before(f.getXActionRule());
		// Start a new line after each action.
		c.setLinewrap().after(f.getXActionRule());
		// Start a new line after each multi-line comment for actions.
		c.setLinewrap().after(f.getXActionAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
		// Indent one level before each action.
		c.setIndentationIncrement().before(xEventElements.getActionsAssignment_5_0_2());
		// Un-indent one level after each action.
		c.setIndentationDecrement().after(xEventElements.getActionsAssignment_5_0_2());

		// Start a new line before the **end** keyword.
		c.setLinewrap().before(xEventElements.getEndKeyword_5_0_3());

		// Start a new line before the **when** keyword.
		c.setLinewrap().before(xEventElements.getWhenKeyword_5_1_0());
		// Start a new line before each guard.
		c.setLinewrap().before(f.getXGuardRule());
		// Start a new line after each guard.
		c.setLinewrap().after(f.getXGuardRule());
		// Start a new line after each multi-line comment for guards.
		c.setLinewrap().after(f.getXGuardAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
		// Indent one level before each guard.
		c.setIndentationIncrement().before(xEventElements.getGuardsAssignment_5_1_1());
		// Un-indent one level after each guard.
		c.setIndentationDecrement().after(xEventElements.getGuardsAssignment_5_1_1());

		// Start a new line before the **with** keyword.
		c.setLinewrap().before(xEventElements.getWithKeyword_5_1_2_0());
		// Indent one level before each witness.
		c.setIndentationIncrement().before(xEventElements.getWitnessesAssignment_5_1_2_1());
		// Un-indent one level after each witness.
		c.setIndentationDecrement().after(xEventElements.getWitnessesAssignment_5_1_2_1());

		// Start a new line before the **then** keyword.
		c.setLinewrap().before(xEventElements.getThenKeyword_5_1_3_0());
		// Indent one level before each action.
		c.setIndentationIncrement().before(xEventElements.getActionsAssignment_5_1_3_1());
		// Un-indent one level after each action.
		c.setIndentationDecrement().after(xEventElements.getActionsAssignment_5_1_3_1());

		// Start a new line before the **end** keyword.
		c.setLinewrap().before(xEventElements.getEndKeyword_5_1_4());

		// Start a new line before the **any** keyword.
		c.setLinewrap().before(xEventElements.getAnyKeyword_5_2_0());
		// Start a new line before each parameter.
		c.setLinewrap().before(f.getXParameterRule());
		// Start a new line after each parameter.
		c.setLinewrap().after(f.getXParameterRule());
		// Start a new line after each multi-line comment for parameter.
		c.setLinewrap().after(f.getXParameterAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
		// Indent one level before each parameter.
		c.setIndentationIncrement().before(xEventElements.getParametersAssignment_5_2_1());
		// Un-indent one level after each action.
		c.setIndentationDecrement().after(xEventElements.getParametersAssignment_5_2_1());

		// Start a new line before the **where** keyword.
		c.setLinewrap().before(xEventElements.getWhereKeyword_5_2_2());
		// Indent one level before each guard.
		c.setIndentationIncrement().before(xEventElements.getGuardsAssignment_5_2_3());
		// Un-indent one level after each guard.
		c.setIndentationDecrement().after(xEventElements.getGuardsAssignment_5_2_3());

		// Start a new line before the **with** keyword.
		c.setLinewrap().before(xEventElements.getWithKeyword_5_2_4_0());
		// Indent one level before each witness.
		c.setIndentationIncrement().before(xEventElements.getWitnessesAssignment_5_2_4_1());
		// Un-indent one level after each witness.
		c.setIndentationDecrement().after(xEventElements.getWitnessesAssignment_5_2_4_1());

		// Start a new line before the **then** keyword.
		c.setLinewrap().before(xEventElements.getThenKeyword_5_2_5_0());
		// Indent one level before each action.
		c.setIndentationIncrement().before(xEventElements.getActionsAssignment_5_2_5_1());
		// Un-indent one level after each action.
		c.setIndentationDecrement().after(xEventElements.getActionsAssignment_5_2_5_1());

		// Start a new line before the **end** keyword.
		c.setLinewrap().before(xEventElements.getEndKeyword_5_2_6());

		// No space nor line wrap before **;** keyword.
		for (Keyword comma : f.findKeywords(";")) {
			c.setNoLinewrap().before(comma);
			c.setNoSpace().before(comma);
		}
		
		// **end** keyword for **machine**
		// Put a blank line before the "end" keyword.
		c.setLinewrap(2).before(xMachineElements.getEndKeyword_10());
	}
}
