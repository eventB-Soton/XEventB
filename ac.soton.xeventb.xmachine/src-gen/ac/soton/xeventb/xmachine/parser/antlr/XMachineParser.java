/*
 * generated by Xtext 2.24.0
 */
package ac.soton.xeventb.xmachine.parser.antlr;

import ac.soton.xeventb.xmachine.parser.antlr.internal.InternalXMachineParser;
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class XMachineParser extends AbstractAntlrParser {

	@Inject
	private XMachineGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalXMachineParser createParser(XtextTokenStream stream) {
		return new InternalXMachineParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Machine";
	}

	public XMachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
