/**
 * Copyright (c) 2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xmachine.formatting;

import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormatter} as an example
 */
@SuppressWarnings("all")
public class XMachineFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private XMachineGrammarAccess f;
  
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    final XMachineGrammarAccess.MachineElements xMachineElements = this.f.getMachineAccess();
    c.setAutoLinewrap(80);
    c.setLinewrap().after(xMachineElements.getCommentML_COMMENTTerminalRuleCall_1_0_0());
    final Keyword refinesKeyword = xMachineElements.getRefinesKeyword_5_0();
    c.setLinewrap(2).before(refinesKeyword);
    c.setLinewrap(1).after(refinesKeyword);
    c.setLinewrap(2).before(xMachineElements.getRefinesAssignment_5_1());
    c.setIndentationIncrement().before(xMachineElements.getRefinesAssignment_5_1());
    c.setLinewrap().after(xMachineElements.getRefinesAssignment_5_1());
    c.setIndentationDecrement().after(xMachineElements.getRefinesAssignment_5_1());
    Keyword seesKeyword = xMachineElements.getSeesKeyword_6_0();
    c.setLinewrap(2).before(seesKeyword);
    c.setLinewrap(1).after(seesKeyword);
    c.setLinewrap(2).before(xMachineElements.getSeesAssignment_6_1());
    c.setIndentationIncrement().before(xMachineElements.getSeesAssignment_6_1());
    c.setLinewrap().after(xMachineElements.getSeesAssignment_6_1());
    c.setIndentationDecrement().after(xMachineElements.getSeesAssignment_6_1());
    Keyword variablesKeyword = xMachineElements.getVariablesKeyword_7_0();
    c.setLinewrap(2).before(variablesKeyword);
    c.setLinewrap(1).after(variablesKeyword);
    c.setLinewrap(2).before(this.f.getXVariableRule());
    c.setLinewrap().after(this.f.getXVariableMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
    c.setIndentationIncrement().before(xMachineElements.getVariablesAssignment_7_1());
    c.setLinewrap().after(this.f.getXVariableRule());
    c.setIndentationDecrement().after(xMachineElements.getVariablesAssignment_7_1());
    Keyword invariantsKeyword = xMachineElements.getInvariantsKeyword_8_0();
    c.setLinewrap(2).before(invariantsKeyword);
    c.setLinewrap(1).after(invariantsKeyword);
    c.setLinewrap(2).before(this.f.getXInvariantRule());
    c.setLinewrap().after(this.f.getXInvariantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
    c.setIndentationIncrement().before(xMachineElements.getInvariantsAssignment_8_1());
    c.setLinewrap().after(this.f.getXInvariantRule());
    c.setIndentationDecrement().after(xMachineElements.getInvariantsAssignment_8_1());
    Keyword eventsKeyword = xMachineElements.getEventsKeyword_10_0();
    XMachineGrammarAccess.XEventNoCommentElements xEventNoCommentElements = this.f.getXEventNoCommentAccess();
    XMachineGrammarAccess.XEventMLCommentElements xEventMLCommentElements = this.f.getXEventMLCommentAccess();
    XMachineGrammarAccess.XEventSLCommentElements xEventSLCommentElements = this.f.getXEventSLCommentAccess();
    c.setLinewrap(2).before(eventsKeyword);
    c.setLinewrap(1).after(eventsKeyword);
    c.setLinewrap(2).before(this.f.getXEventRule());
    c.setLinewrap().after(xEventMLCommentElements.getCommentML_COMMENTTerminalRuleCall_1_0());
    c.setIndentationIncrement().before(xMachineElements.getEventsAssignment_10_1());
    c.setIndentationIncrement().before(xMachineElements.getEventsAssignment_10_2());
    c.setLinewrap().after(this.f.getXEventRule());
    c.setIndentationDecrement().after(xMachineElements.getEventsAssignment_10_1());
    c.setIndentationDecrement().after(xMachineElements.getEventsAssignment_10_2());
    c.setLinewrap().before(xEventNoCommentElements.getRefinesKeyword_4_0());
    c.setLinewrap().before(xEventMLCommentElements.getRefinesKeyword_5_0());
    c.setLinewrap().before(xEventSLCommentElements.getRefinesKeyword_5_0());
    c.setNoLinewrap().before(xEventNoCommentElements.getRefinesAssignment_4_1());
    c.setNoLinewrap().before(xEventMLCommentElements.getRefinesAssignment_5_1());
    c.setNoLinewrap().before(xEventSLCommentElements.getRefinesAssignment_5_1());
    c.setLinewrap().before(xEventNoCommentElements.getWithKeyword_5_0_0_0());
    c.setLinewrap().before(xEventMLCommentElements.getWithKeyword_6_0_0_0());
    c.setLinewrap().before(xEventSLCommentElements.getWithKeyword_6_0_0_0());
    c.setLinewrap().before(this.f.getXWitnessRule());
    c.setLinewrap().after(this.f.getXWitnessMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
    c.setIndentationIncrement().before(xEventNoCommentElements.getWitnessesAssignment_5_0_0_1());
    c.setIndentationIncrement().before(xEventMLCommentElements.getWitnessesAssignment_6_0_0_1());
    c.setIndentationIncrement().before(xEventSLCommentElements.getWitnessesAssignment_6_0_0_1());
    c.setLinewrap().after(this.f.getXWitnessRule());
    c.setIndentationDecrement().after(xEventNoCommentElements.getWitnessesAssignment_5_0_0_1());
    c.setIndentationDecrement().after(xEventMLCommentElements.getWitnessesAssignment_6_0_0_1());
    c.setIndentationDecrement().after(xEventSLCommentElements.getWitnessesAssignment_6_0_0_1());
    c.setLinewrap().before(xEventNoCommentElements.getBeginKeyword_5_0_1());
    c.setLinewrap().before(xEventMLCommentElements.getBeginKeyword_6_0_1());
    c.setLinewrap().before(xEventSLCommentElements.getBeginKeyword_6_0_1());
    c.setLinewrap().before(this.f.getXActionRule());
    c.setLinewrap().after(this.f.getXActionRule());
    c.setLinewrap().after(this.f.getXActionMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
    c.setIndentationIncrement().before(xEventNoCommentElements.getActionsAssignment_5_0_2());
    c.setIndentationIncrement().before(xEventMLCommentElements.getActionsAssignment_6_0_2());
    c.setIndentationIncrement().before(xEventSLCommentElements.getActionsAssignment_6_0_2());
    c.setIndentationDecrement().after(xEventNoCommentElements.getActionsAssignment_5_0_2());
    c.setIndentationDecrement().after(xEventMLCommentElements.getActionsAssignment_6_0_2());
    c.setIndentationDecrement().after(xEventSLCommentElements.getActionsAssignment_6_0_2());
    c.setLinewrap().before(xEventNoCommentElements.getEndKeyword_6());
    c.setLinewrap().before(xEventMLCommentElements.getEndKeyword_7());
    c.setLinewrap().before(xEventSLCommentElements.getEndKeyword_7());
    c.setLinewrap().before(xEventNoCommentElements.getWhenKeyword_5_1_0());
    c.setLinewrap().before(xEventMLCommentElements.getWhenKeyword_6_1_0());
    c.setLinewrap().before(xEventSLCommentElements.getWhenKeyword_6_1_0());
    c.setLinewrap().before(this.f.getXGuardRule());
    c.setLinewrap().after(this.f.getXGuardRule());
    c.setLinewrap().after(this.f.getXGuardMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
    c.setIndentationIncrement().before(xEventNoCommentElements.getGuardsAssignment_5_1_1());
    c.setIndentationDecrement().after(xEventNoCommentElements.getGuardsAssignment_5_1_1());
    c.setIndentationDecrement().after(xEventMLCommentElements.getGuardsAssignment_6_1_1());
    c.setIndentationDecrement().after(xEventSLCommentElements.getGuardsAssignment_6_1_1());
    c.setLinewrap().before(xEventNoCommentElements.getWithKeyword_5_1_2_0());
    c.setLinewrap().before(xEventMLCommentElements.getWithKeyword_6_1_2_0());
    c.setLinewrap().before(xEventSLCommentElements.getWithKeyword_6_1_2_0());
    c.setIndentationIncrement().before(xEventNoCommentElements.getWitnessesAssignment_5_1_2_1());
    c.setIndentationIncrement().before(xEventMLCommentElements.getWitnessesAssignment_6_1_2_1());
    c.setIndentationIncrement().before(xEventSLCommentElements.getWitnessesAssignment_6_1_2_1());
    c.setIndentationDecrement().after(xEventNoCommentElements.getWitnessesAssignment_5_1_2_1());
    c.setIndentationDecrement().after(xEventMLCommentElements.getWitnessesAssignment_6_1_2_1());
    c.setIndentationDecrement().after(xEventSLCommentElements.getWitnessesAssignment_6_1_2_1());
    c.setLinewrap().before(xEventNoCommentElements.getThenKeyword_5_1_3_0());
    c.setLinewrap().before(xEventMLCommentElements.getThenKeyword_6_1_3_0());
    c.setLinewrap().before(xEventSLCommentElements.getThenKeyword_6_1_3_0());
    c.setIndentationIncrement().before(xEventNoCommentElements.getActionsAssignment_5_1_3_1());
    c.setIndentationIncrement().before(xEventMLCommentElements.getActionsAssignment_6_1_3_1());
    c.setIndentationIncrement().before(xEventSLCommentElements.getActionsAssignment_6_1_3_1());
    c.setIndentationDecrement().after(xEventNoCommentElements.getActionsAssignment_5_1_3_1());
    c.setIndentationDecrement().after(xEventMLCommentElements.getActionsAssignment_6_1_3_1());
    c.setIndentationDecrement().after(xEventSLCommentElements.getActionsAssignment_6_1_3_1());
    c.setLinewrap().before(xEventNoCommentElements.getEndKeyword_6());
    c.setLinewrap().before(xEventMLCommentElements.getEndKeyword_7());
    c.setLinewrap().before(xEventSLCommentElements.getEndKeyword_7());
    c.setLinewrap().before(xEventNoCommentElements.getAnyKeyword_5_2_0());
    c.setLinewrap().before(xEventMLCommentElements.getAnyKeyword_6_2_0());
    c.setLinewrap().before(xEventSLCommentElements.getAnyKeyword_6_2_0());
    c.setLinewrap().before(this.f.getXParameterRule());
    c.setLinewrap().after(this.f.getXParameterRule());
    c.setLinewrap().after(this.f.getXParameterMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
    c.setIndentationIncrement().before(xEventNoCommentElements.getParametersAssignment_5_2_1());
    c.setIndentationIncrement().before(xEventMLCommentElements.getParametersAssignment_6_2_1());
    c.setIndentationIncrement().before(xEventSLCommentElements.getParametersAssignment_6_2_1());
    c.setIndentationDecrement().after(xEventNoCommentElements.getParametersAssignment_5_2_1());
    c.setIndentationDecrement().after(xEventMLCommentElements.getParametersAssignment_6_2_1());
    c.setIndentationDecrement().after(xEventSLCommentElements.getParametersAssignment_6_2_1());
    c.setLinewrap().before(xEventNoCommentElements.getWhereKeyword_5_2_2());
    c.setLinewrap().before(xEventMLCommentElements.getWhereKeyword_6_2_2());
    c.setLinewrap().before(xEventSLCommentElements.getWhereKeyword_6_2_2());
    c.setIndentationIncrement().before(xEventNoCommentElements.getGuardsAssignment_5_2_3());
    c.setIndentationIncrement().before(xEventMLCommentElements.getGuardsAssignment_6_2_3());
    c.setIndentationIncrement().before(xEventSLCommentElements.getGuardsAssignment_6_2_3());
    c.setIndentationDecrement().after(xEventNoCommentElements.getGuardsAssignment_5_2_3());
    c.setIndentationDecrement().after(xEventMLCommentElements.getGuardsAssignment_6_2_3());
    c.setIndentationDecrement().after(xEventSLCommentElements.getGuardsAssignment_6_2_3());
    c.setLinewrap().before(xEventNoCommentElements.getWithKeyword_5_2_4_0());
    c.setLinewrap().before(xEventMLCommentElements.getWithKeyword_6_2_4_0());
    c.setLinewrap().before(xEventSLCommentElements.getWithKeyword_6_2_4_0());
    c.setIndentationIncrement().before(xEventNoCommentElements.getWitnessesAssignment_5_2_4_1());
    c.setIndentationIncrement().before(xEventMLCommentElements.getWitnessesAssignment_6_2_4_1());
    c.setIndentationIncrement().before(xEventSLCommentElements.getWitnessesAssignment_6_2_4_1());
    c.setIndentationDecrement().after(xEventNoCommentElements.getWitnessesAssignment_5_2_4_1());
    c.setIndentationDecrement().after(xEventMLCommentElements.getWitnessesAssignment_6_2_4_1());
    c.setIndentationDecrement().after(xEventSLCommentElements.getWitnessesAssignment_6_2_4_1());
    c.setLinewrap().before(xEventNoCommentElements.getThenKeyword_5_2_5_0());
    c.setLinewrap().before(xEventMLCommentElements.getThenKeyword_6_2_5_0());
    c.setLinewrap().before(xEventSLCommentElements.getThenKeyword_6_2_5_0());
    c.setIndentationIncrement().before(xEventNoCommentElements.getActionsAssignment_5_2_5_1());
    c.setIndentationIncrement().before(xEventMLCommentElements.getActionsAssignment_6_2_5_1());
    c.setIndentationIncrement().before(xEventSLCommentElements.getActionsAssignment_6_2_5_1());
    c.setIndentationDecrement().after(xEventNoCommentElements.getActionsAssignment_5_2_5_1());
    c.setIndentationDecrement().after(xEventMLCommentElements.getActionsAssignment_6_2_5_1());
    c.setIndentationDecrement().after(xEventSLCommentElements.getActionsAssignment_6_2_5_1());
    c.setLinewrap().before(xEventNoCommentElements.getEndKeyword_6());
    c.setLinewrap().before(xEventMLCommentElements.getEndKeyword_7());
    c.setLinewrap().before(xEventSLCommentElements.getEndKeyword_7());
    List<Keyword> _findKeywords = this.f.findKeywords(";");
    for (final Keyword comma : _findKeywords) {
      {
        c.setNoLinewrap().before(comma);
        c.setNoSpace().before(comma);
      }
    }
    c.setLinewrap(2).before(xMachineElements.getEndKeyword_11());
  }
}
