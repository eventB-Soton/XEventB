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

        // set a maximum size of lines
        c.setAutoLinewrap(80);
        
 		for (Keyword keyword: f.findKeywords("extends")) {
 	        // Put a blank line before the "extends" keyword.
			c.setLinewrap(2).before(keyword);

			// Start a new line after the "extends" keyword.
			c.setLinewrap(1).after(keyword);

			// Indent one level after the "extends" keyword.
			c.setIndentationIncrement().after(keyword);
		}
 		
		for (Keyword keyword: f.findKeywords("sets")) {
	        // Un-indent one level before the "sets" keyword.
			c.setIndentationDecrement().before(keyword);
			
			// Put a blank line before the "sets" keyword.
			c.setLinewrap(2).before(keyword);
			
			// Start a new line after the "sets" keyword.
			c.setLinewrap(1).after(keyword);
			
			// Indent one level after the "sets" keyword.
			c.setIndentationIncrement().after(keyword);
		}

		for (Keyword keyword: f.findKeywords("constants")) {
	        // Un-indent one level before the "constants" keyword.
			c.setIndentationDecrement().before(keyword);

			// Put a blank line before the "constants" keyword.
			c.setLinewrap(2).before(keyword);

			// Start a new line after the "constants" keyword.
			c.setLinewrap(1).after(keyword);
			
			// Indent one level after the "constants" keyword.
			c.setIndentationIncrement().after(keyword);
		}

		for (Keyword keyword: f.findKeywords("axioms")) {
	        // Un-indent one level before the "axioms" keyword.
			c.setIndentationDecrement().before(keyword);

			// Put a blank line before the "axioms" keyword.
			c.setLinewrap(2).before(keyword);
			
			// Start a new line after the "axioms" keyword.
			c.setLinewrap(1).after(keyword);

			// Indent one level after the "axioms" keyword.
			c.setIndentationIncrement().after(keyword);
		}
		
		for (Keyword keyword: f.findKeywords("end")) {
	        // Un-indent one level before the "end" keyword.
			c.setIndentationDecrement().before(keyword);

			// Put a blank line before the "end" keyword.
			c.setLinewrap(2).before(keyword);
		}
		
		// Start a new line after each carrier set.
		c.setLinewrap().after(f.getXCarrierSetRule());
		
		// Start a new line after each multiline comment for carrier set.
		c.setLinewrap().after(f.getXCarrierSetAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
		
		// Start a new line after each constant.
		c.setLinewrap().after(f.getXConstantRule());
		
		// Start a new line after each multiline comment for constant.
		c.setLinewrap().after(f.getXConstantAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
		
		// Start a new line after each axiom.
		c.setLinewrap(2).after(f.getXAxiomRule());

		// Start a new line after each multiline comment for axiom.
		c.setLinewrap().after(f.getXAxiomAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
	}
}
