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

package ac.soton.eventb.xtext.context.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

import ac.soton.eventb.xtext.context.services.XContextGrammarAccess;
import ac.soton.eventb.xtext.context.services.XContextGrammarAccess.XContextElements;

/**
 * <p>
 * XContext formatter based on abstract declarative formatter.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @see XContextGrammarAccess
 * @since 0.0.2
 */
public class XContextFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
        XContextGrammarAccess f = (XContextGrammarAccess) getGrammarAccess();
        XContextElements xContextElements = f.getXContextAccess();

        // set a maximum size of lines
        c.setAutoLinewrap(80);
        
		// **context** clause
        // Start a new line after each multi-line comment for context.
		c.setLinewrap().after(xContextElements.getCommentML_COMMENTTerminalRuleCall_1_0_0());

		// **extends** clause.
        Keyword extendsKeyword = xContextElements.getExtendsKeyword_4_0();
        // Put a blank line before the "extends" keyword.
		c.setLinewrap(2).before(extendsKeyword);
		// Start a new line after the "extends" keyword.
		c.setLinewrap(1).after(extendsKeyword);
		// Put an empty line before each extended context.
		c.setLinewrap(2).before(xContextElements.getExtendsAssignment_4_1());
		// Indent one level before each extended context.
		c.setIndentationIncrement().before(xContextElements.getExtendsAssignment_4_1());
		// Start a new line after each extended context.
		c.setLinewrap().after(xContextElements.getExtendsAssignment_4_1());
		// Un-indent one level after each extended context.
		c.setIndentationDecrement().after(xContextElements.getExtendsAssignment_4_1());

		
		// **sets** clause.
		Keyword setsKeyword = xContextElements.getSetsKeyword_5_0();
		// Put a blank line before the **sets** keyword.
		c.setLinewrap(2).before(setsKeyword);
		// Start a new line after the **sets** keyword.
		c.setLinewrap(1).after(setsKeyword);
		// Put an empty line before each set.
		c.setLinewrap(2).before(f.getXCarrierSetRule());
		// Start a new line after each set.
		c.setLinewrap().after(f.getXCarrierSetRule());
		// Start a new line after each multi-line comment for sets.
		c.setLinewrap().after(f.getXCarrierSetMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
		// Indent one level before each set.
		c.setIndentationIncrement().before(xContextElements.getSetsAssignment_5_1());
		// Un-indent one level after each variable.
		c.setIndentationDecrement().after(xContextElements.getSetsAssignment_5_1());

		// **constants** clause
		Keyword constantsKeyword = xContextElements.getConstantsKeyword_6_0();
		// Put a blank line before the **constants** keyword.
		c.setLinewrap(2).before(constantsKeyword);
		// Start a new line after the **constants** keyword.
		c.setLinewrap(1).after(constantsKeyword);
		// Put an empty line before each constant.
		c.setLinewrap(2).before(f.getXConstantRule());
		// Start a new line after each constant.
		c.setLinewrap().after(f.getXConstantRule());
		// Start a new line after each multi-line comment for constants.
		c.setLinewrap().after(f.getXConstantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
		// Indent one level before each constant.
		c.setIndentationIncrement().before(xContextElements.getConstantsAssignment_6_1());
		// Un-indent one level after each constant.
		c.setIndentationDecrement().after(xContextElements.getConstantsAssignment_6_1());

		// **axioms** clause
		Keyword axiomsKeyword = xContextElements.getAxiomsKeyword_7_0();
		// Put a blank line before the **axioms** keyword.
		c.setLinewrap(2).before(axiomsKeyword);
		// Start a new line after the **axioms** keyword.
		c.setLinewrap(1).after(axiomsKeyword);
		// Put an empty line before each axiom.
		c.setLinewrap(2).before(f.getXAxiomRule());
		// Start a new line after each axiom.
		c.setLinewrap().after(f.getXAxiomRule());
		// Start a new line after each multi-line comment for axioms.
		c.setLinewrap().after(f.getXAxiomMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
		// Indent one level before each axiom.
		c.setIndentationIncrement().before(xContextElements.getAxiomsAssignment_7_1());
		// Un-indent one level after each axiom.
		c.setIndentationDecrement().after(xContextElements.getAxiomsAssignment_7_1());
		
		// **end** keyword for **context**
		// Put a blank line before the "end" keyword.
		c.setLinewrap(2).before(xContextElements.getEndKeyword_8());
		
	}
}
