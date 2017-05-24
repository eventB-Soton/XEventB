/*******************************************************************************
 * Copyright (c) 2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.xmachine.formatting

import com.google.inject.Inject
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess
//import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess.MachineElements
import org.eclipse.xtext.Keyword

/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormatter} as an example
 */
public class XMachineFormatter extends AbstractDeclarativeFormatter {
//	
	@Inject extension XMachineGrammarAccess f
//

	override protected configureFormatting(FormattingConfig c) {
//		for(pair: findKeywordPairs('{', '}')) {
//			c.setIndentation(pair.first, pair.second)
//			c.setLinewrap(1).after(pair.first)
//			c.setLinewrap(1).before(pair.second)
//			c.setLinewrap(1).after(pair.second)
//		}
//		for(comma: findKeywords(',')) {
//			c.setNoLinewrap().before(comma)
//			c.setNoSpace().before(comma)
//			c.setLinewrap().after(comma)
//		}
//		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
//		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
//		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
		
		//----------
		val xMachineElements = f.getMachineAccess()
		// set a maximum size of lines

       c.setAutoLinewrap(80);

      // **machine** clause
      // Start a new line after each multi-line comment for machine.
      c.setLinewrap().after(xMachineElements.getCommentML_COMMENTTerminalRuleCall_1_0_0());
	

		// **refines** clause
		val refinesKeyword = xMachineElements.refinesKeyword_5_0
		
		// Put a blank line before the "refines" keyword.
		c.setLinewrap(2).before(refinesKeyword);
		
		// Start a new line after the "refines" keyword.
		c.setLinewrap(1).after(refinesKeyword);
		
		// Put an empty line before each refined machine.
		c.setLinewrap(2).before(xMachineElements.refinesAssignment_5_1)
		
		// Indent one level before each refined machine.
		c.setIndentationIncrement().before(xMachineElements.refinesAssignment_5_1);
		
		// Start a new line after each refined machine.
		c.setLinewrap().after(xMachineElements.refinesAssignment_5_1);
		
		// Un-indent one level after each refined machine.
		c.setIndentationDecrement().after(xMachineElements.refinesAssignment_5_1);
		
		// **sees** clause
		var seesKeyword = xMachineElements.seesKeyword_6_0;
		
		// Put a blank line before the "sees" keyword.
		c.setLinewrap(2).before(seesKeyword);
		
		// Start a new line after the "sees" keyword.
		c.setLinewrap(1).after(seesKeyword);
		
		// Put an empty line before each seen context.
		c.setLinewrap(2).before(xMachineElements.seesAssignment_6_1);
		
		// Indent one level before each seen context.
		c.setIndentationIncrement().before(xMachineElements.seesAssignment_6_1);
		
		// Start a new line after each seen context.
		c.setLinewrap().after(xMachineElements.seesAssignment_6_1);
		
		// Un-indent one level after each seen context.
		c.setIndentationDecrement().after(xMachineElements.seesAssignment_6_1);
		
		// **variables** clause
		var variablesKeyword = xMachineElements.variablesKeyword_7_0;
		
		// Put a blank line before the "variables" keyword.
		c.setLinewrap(2).before(variablesKeyword);
		
		// Start a new line after the "variables" keyword.
		c.setLinewrap(1).after(variablesKeyword);
		
		// Put an empty line before each variable.
		c.setLinewrap(2).before(f.getXVariableRule());
		
		// Start a new line after each multi-line comment for variables.
		c.setLinewrap().after(f.getXVariableMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
		
		// Indent one level before each variable.
		c.setIndentationIncrement().before(xMachineElements.variablesAssignment_7_1);
		
		// Start a new line after each variable.
		c.setLinewrap().after(f.getXVariableRule());
		
		// Un-indent one level after each variable.
		c.setIndentationDecrement().after(xMachineElements.variablesAssignment_7_1);
		
		// **invariants** clause
		var invariantsKeyword = xMachineElements.invariantsKeyword_8_0;
		
		// Put a blank line before the "invariants" keyword.
		c.setLinewrap(2).before(invariantsKeyword);
		
		// Start a new line after the "invariants" keyword.
		c.setLinewrap(1).after(invariantsKeyword);
		
		// Put an empty line before each invariant.
		c.setLinewrap(2).before(f.getXInvariantRule());
		
		// Start a new line after each multi-line comment for invariants.
		c.setLinewrap().after(f.getXInvariantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
		
		// Indent one level before each invariant.
		c.setIndentationIncrement().before(xMachineElements.invariantsAssignment_8_1);
		
		// Start a new line after each invariant.
		c.setLinewrap().after(f.getXInvariantRule());
		
		// Un-indent one level after each invariant.
		c.setIndentationDecrement().after(xMachineElements.invariantsAssignment_8_1);
		
		// **events** clause
		var eventsKeyword = xMachineElements.eventsKeyword_10_0;
		var xEventNoCommentElements = f.getXEventNoCommentAccess();
		var xEventMLCommentElements = f.getXEventMLCommentAccess();
		var xEventSLCommentElements = f.getXEventSLCommentAccess();
		
		// Put a blank line before the **events** keyword.
		c.setLinewrap(2).before(eventsKeyword);
		
		// Start a new line after the **events** keyword.
		c.setLinewrap(1).after(eventsKeyword);
		
		// Put an empty line before each event.
		c.setLinewrap(2).before(f.getXEventRule());
		
		// Start a new line after each multi-line comment for events.
		c.setLinewrap().after(xEventMLCommentElements.getCommentML_COMMENTTerminalRuleCall_1_0());
		
		// Indent one level before each event.
		c.setIndentationIncrement().before(xMachineElements.eventsAssignment_10_1);
		
		// Indent one level before each event.
		c.setIndentationIncrement().before(xMachineElements.eventsAssignment_10_2);
		
		// Start a new line after each event.
		c.setLinewrap().after(f.getXEventRule());
		
		// Un-indent one level after each event.
		c.setIndentationDecrement().after(xMachineElements.getEventsAssignment_10_1());
		
		// Un-indent one level after each event.
		c.setIndentationDecrement().after(xMachineElements.getEventsAssignment_10_2());
		
		// Start a new line before the **refines** keyword.
		c.setLinewrap().before(xEventNoCommentElements.refinesKeyword_4_0);
		c.setLinewrap().before(xEventMLCommentElements.refinesKeyword_5_0);
		c.setLinewrap().before(xEventSLCommentElements.refinesKeyword_5_0);
		
		// Set no new line for the refined event
		c.setNoLinewrap().before(xEventNoCommentElements.refinesAssignment_4_1);
		c.setNoLinewrap().before(xEventMLCommentElements.refinesAssignment_5_1);
		c.setNoLinewrap().before(xEventSLCommentElements.refinesAssignment_5_1);
		
		// Start a new line before the **with** keyword.
		c.setLinewrap().before(xEventNoCommentElements.withKeyword_5_0_0_0);
		c.setLinewrap().before(xEventMLCommentElements.withKeyword_6_0_0_0);
		c.setLinewrap().before(xEventSLCommentElements.withKeyword_6_0_0_0);
		
		// Start a new line before each witness.
		c.setLinewrap().before(f.getXWitnessRule());
		
		// Start a new line after each multi-line comment for witnesses.
		c.setLinewrap().after(f.getXWitnessMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
		
		// Indent one level before each witness.
		c.setIndentationIncrement().before(xEventNoCommentElements.witnessesAssignment_5_0_0_1);
		c.setIndentationIncrement().before(xEventMLCommentElements.witnessesAssignment_6_0_0_1);
		c.setIndentationIncrement().before(xEventSLCommentElements.witnessesAssignment_6_0_0_1);
		
		// Start a new line after each witness.
		c.setLinewrap().after(f.getXWitnessRule());
		
		// Un-indent one level after each witness.
		c.setIndentationDecrement().after(xEventNoCommentElements.getWitnessesAssignment_5_0_0_1());
		c.setIndentationDecrement().after(xEventMLCommentElements.witnessesAssignment_6_0_0_1);
		c.setIndentationDecrement().after(xEventSLCommentElements.witnessesAssignment_6_0_0_1);
		
		// Start a new line before the **begin** keyword.
		c.setLinewrap().before(xEventNoCommentElements.getBeginKeyword_5_0_1());
		c.setLinewrap().before(xEventMLCommentElements.getBeginKeyword_6_0_1());
		c.setLinewrap().before(xEventSLCommentElements.getBeginKeyword_6_0_1());
		
		// Start a new line before each action.
		c.setLinewrap().before(f.getXActionRule());
		
		// Start a new line after each action.
		c.setLinewrap().after(f.getXActionRule());
		
		// Start a new line after each multi-line comment for actions.
		c.setLinewrap().after(f.getXActionMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
		
		// Indent one level before each action.
		c.setIndentationIncrement().before(xEventNoCommentElements.getActionsAssignment_5_0_2());
		c.setIndentationIncrement().before(xEventMLCommentElements.getActionsAssignment_6_0_2());
		c.setIndentationIncrement().before(xEventSLCommentElements.getActionsAssignment_6_0_2());
		
		// Un-indent one level after each action.
		c.setIndentationDecrement().after(xEventNoCommentElements.getActionsAssignment_5_0_2());
		c.setIndentationDecrement().after(xEventMLCommentElements.getActionsAssignment_6_0_2());
		c.setIndentationDecrement().after(xEventSLCommentElements.getActionsAssignment_6_0_2());
		
		// Start a new line before the **end** keyword.
		c.setLinewrap().before(xEventNoCommentElements.getEndKeyword_6());
		c.setLinewrap().before(xEventMLCommentElements.getEndKeyword_7());
		c.setLinewrap().before(xEventSLCommentElements.getEndKeyword_7());
		
		// Start a new line before the **when** keyword.
		c.setLinewrap().before(xEventNoCommentElements.whenKeyword_5_1_0);
		c.setLinewrap().before(xEventMLCommentElements.getWhenKeyword_6_1_0());
		c.setLinewrap().before(xEventSLCommentElements.getWhenKeyword_6_1_0());
		
		// Start a new line before each guard.
		c.setLinewrap().before(f.getXGuardRule());
		
		// Start a new line after each guard.
		c.setLinewrap().after(f.getXGuardRule());
		
		// Start a new line after each multi-line comment for guards.
		c.setLinewrap().after(f.getXGuardMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
		
		// Indent one level before each guard.
		c.setIndentationIncrement().before(xEventNoCommentElements.getGuardsAssignment_5_1_1());
		
		// Un-indent one level after each guard.
		c.setIndentationDecrement().after(xEventNoCommentElements.getGuardsAssignment_5_1_1());
		c.setIndentationDecrement().after(xEventMLCommentElements.guardsAssignment_6_1_1);
		c.setIndentationDecrement().after(xEventSLCommentElements.guardsAssignment_6_1_1);
		
		// Start a new line before the **with** keyword.
		c.setLinewrap().before(xEventNoCommentElements.getWithKeyword_5_1_2_0());
		c.setLinewrap().before(xEventMLCommentElements.getWithKeyword_6_1_2_0());
		c.setLinewrap().before(xEventSLCommentElements.getWithKeyword_6_1_2_0());
		
		// Indent one level before each witness.
		c.setIndentationIncrement().before(xEventNoCommentElements.getWitnessesAssignment_5_1_2_1());
		c.setIndentationIncrement().before(xEventMLCommentElements.witnessesAssignment_6_1_2_1);
		c.setIndentationIncrement().before(xEventSLCommentElements.witnessesAssignment_6_1_2_1);
		
		// Un-indent one level after each witness.
		c.setIndentationDecrement().after(xEventNoCommentElements.getWitnessesAssignment_5_1_2_1());
		c.setIndentationDecrement().after(xEventMLCommentElements.getWitnessesAssignment_6_1_2_1());
		c.setIndentationDecrement().after(xEventSLCommentElements.getWitnessesAssignment_6_1_2_1());
		
		// Start a new line before the **then** keyword.
		c.setLinewrap().before(xEventNoCommentElements.getThenKeyword_5_1_3_0());
		c.setLinewrap().before(xEventMLCommentElements.getThenKeyword_6_1_3_0());
		c.setLinewrap().before(xEventSLCommentElements.getThenKeyword_6_1_3_0());
		
		// Indent one level before each action.
		c.setIndentationIncrement().before(xEventNoCommentElements.getActionsAssignment_5_1_3_1());
		c.setIndentationIncrement().before(xEventMLCommentElements.getActionsAssignment_6_1_3_1());
		c.setIndentationIncrement().before(xEventSLCommentElements.getActionsAssignment_6_1_3_1());
		
		// Un-indent one level after each action.
		c.setIndentationDecrement().after(xEventNoCommentElements.getActionsAssignment_5_1_3_1());
		c.setIndentationDecrement().after(xEventMLCommentElements.getActionsAssignment_6_1_3_1());
		c.setIndentationDecrement().after(xEventSLCommentElements.getActionsAssignment_6_1_3_1());
		
		// Start a new line before the **end** keyword.
		c.setLinewrap().before(xEventNoCommentElements.getEndKeyword_6());
		c.setLinewrap().before(xEventMLCommentElements.getEndKeyword_7());
		c.setLinewrap().before(xEventSLCommentElements.getEndKeyword_7());
		
		// Start a new line before the **any** keyword.
		c.setLinewrap().before(xEventNoCommentElements.getAnyKeyword_5_2_0());
		c.setLinewrap().before(xEventMLCommentElements.anyKeyword_6_2_0);
		c.setLinewrap().before(xEventSLCommentElements.getAnyKeyword_6_2_0());
		
		// Start a new line before each parameter.
		c.setLinewrap().before(f.getXParameterRule());
		
		// Start a new line after each parameter.
		c.setLinewrap().after(f.getXParameterRule());
		
		// Start a new line after each multi-line comment for parameter.
		c.setLinewrap().after(f.getXParameterMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
		
		// Indent one level before each parameter.
		c.setIndentationIncrement().before(xEventNoCommentElements.getParametersAssignment_5_2_1());
		c.setIndentationIncrement().before(xEventMLCommentElements.getParametersAssignment_6_2_1());
		c.setIndentationIncrement().before(xEventSLCommentElements.getParametersAssignment_6_2_1());
		
		// Un-indent one level after each action.
		c.setIndentationDecrement().after(xEventNoCommentElements.getParametersAssignment_5_2_1());
		c.setIndentationDecrement().after(xEventMLCommentElements.getParametersAssignment_6_2_1());
		c.setIndentationDecrement().after(xEventSLCommentElements.getParametersAssignment_6_2_1());
		
		// Start a new line before the **where** keyword.
		c.setLinewrap().before(xEventNoCommentElements.getWhereKeyword_5_2_2());
		c.setLinewrap().before(xEventMLCommentElements.getWhereKeyword_6_2_2());
		c.setLinewrap().before(xEventSLCommentElements.getWhereKeyword_6_2_2());
		
		// Indent one level before each guard.
		c.setIndentationIncrement().before(xEventNoCommentElements.guardsAssignment_5_2_3);
		c.setIndentationIncrement().before(xEventMLCommentElements.getGuardsAssignment_6_2_3());
		c.setIndentationIncrement().before(xEventSLCommentElements.getGuardsAssignment_6_2_3());
		
		// Un-indent one level after each guard.
		c.setIndentationDecrement().after(xEventNoCommentElements.guardsAssignment_5_2_3);
		c.setIndentationDecrement().after(xEventMLCommentElements.getGuardsAssignment_6_2_3());
		c.setIndentationDecrement().after(xEventSLCommentElements.getGuardsAssignment_6_2_3());
		
		// Start a new line before the **with** keyword.
		c.setLinewrap().before(xEventNoCommentElements.getWithKeyword_5_2_4_0());
		c.setLinewrap().before(xEventMLCommentElements.getWithKeyword_6_2_4_0());
		c.setLinewrap().before(xEventSLCommentElements.getWithKeyword_6_2_4_0());
		
		// Indent one level before each witness.
		c.setIndentationIncrement().before(xEventNoCommentElements.witnessesAssignment_5_2_4_1);
		c.setIndentationIncrement().before(xEventMLCommentElements.witnessesAssignment_6_2_4_1);
		c.setIndentationIncrement().before(xEventSLCommentElements.getWitnessesAssignment_6_2_4_1());
		
		// Un-indent one level after each witness.
		c.setIndentationDecrement().after(xEventNoCommentElements.witnessesAssignment_5_2_4_1);
		c.setIndentationDecrement().after(xEventMLCommentElements.witnessesAssignment_6_2_4_1);
		c.setIndentationDecrement().after(xEventSLCommentElements.witnessesAssignment_6_2_4_1);
		
		// Start a new line before the **then** keyword.
		c.setLinewrap().before(xEventNoCommentElements.getThenKeyword_5_2_5_0());
		c.setLinewrap().before(xEventMLCommentElements.getThenKeyword_6_2_5_0());
		c.setLinewrap().before(xEventSLCommentElements.getThenKeyword_6_2_5_0());
		
		// Indent one level before each action.
		c.setIndentationIncrement().before(xEventNoCommentElements.getActionsAssignment_5_2_5_1());
		c.setIndentationIncrement().before(xEventMLCommentElements.getActionsAssignment_6_2_5_1());
		c.setIndentationIncrement().before(xEventSLCommentElements.getActionsAssignment_6_2_5_1());
		
		// Un-indent one level after each action.
		c.setIndentationDecrement().after(xEventNoCommentElements.getActionsAssignment_5_2_5_1());
		c.setIndentationDecrement().after(xEventMLCommentElements.getActionsAssignment_6_2_5_1());
		c.setIndentationDecrement().after(xEventSLCommentElements.getActionsAssignment_6_2_5_1());
		
		// Start a new line before the **end** keyword.
	    c.setLinewrap().before(xEventNoCommentElements.getEndKeyword_6());
	    c.setLinewrap().before(xEventMLCommentElements.getEndKeyword_7());
	    c.setLinewrap().before(xEventSLCommentElements.getEndKeyword_7());
		
		// No space nor line wrap before **;** keyword.
		
		for (Keyword comma : f.findKeywords(";")) {
		
			c.setNoLinewrap().before(comma);
	        c.setNoSpace().before(comma);
		
		}
		
		// **end** keyword for **machine**
		
		// Put a blank line before the "end" keyword.
		
		c.setLinewrap(2).before(xMachineElements.getEndKeyword_11());
		
	}
}





