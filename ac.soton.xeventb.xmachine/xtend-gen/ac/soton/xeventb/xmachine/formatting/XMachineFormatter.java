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
import org.eclipse.xtext.util.Pair;
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
  private XMachineGrammarAccess _xMachineGrammarAccess;
  
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    List<Pair<Keyword, Keyword>> _findKeywordPairs = this._xMachineGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword, Keyword> pair : _findKeywordPairs) {
      {
        c.setIndentation(pair.getFirst(), pair.getSecond());
        c.setLinewrap(1).after(pair.getFirst());
        c.setLinewrap(1).before(pair.getSecond());
        c.setLinewrap(1).after(pair.getSecond());
      }
    }
    List<Keyword> _findKeywords = this._xMachineGrammarAccess.findKeywords(",");
    for (final Keyword comma : _findKeywords) {
      {
        c.setNoLinewrap().before(comma);
        c.setNoSpace().before(comma);
        c.setLinewrap().after(comma);
      }
    }
    c.setLinewrap(0, 1, 2).before(this._xMachineGrammarAccess.getSL_COMMENTRule());
    c.setLinewrap(0, 1, 2).before(this._xMachineGrammarAccess.getML_COMMENTRule());
    c.setLinewrap(0, 1, 1).after(this._xMachineGrammarAccess.getML_COMMENTRule());
  }
}
