/*
 * generated by Xtext 2.11.0
 */
package ac.soton.xeventb.xstatemachine.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class XStatemachineGrammarAccess extends AbstractGrammarElementFinder {
	
	public class StatemachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ac.soton.xeventb.xstatemachine.XStatemachine.Statemachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStatemachineAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStatemachineKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Statemachine estatemachine::Statemachine:
		//	{estatemachine::Statemachine}
		//	'Statemachine'
		//	'end';
		@Override public ParserRule getRule() { return rule; }
		
		//{estatemachine::Statemachine} 'Statemachine' 'end'
		public Group getGroup() { return cGroup; }
		
		//{estatemachine::Statemachine}
		public Action getStatemachineAction_0() { return cStatemachineAction_0; }
		
		//'Statemachine'
		public Keyword getStatemachineKeyword_1() { return cStatemachineKeyword_1; }
		
		//'end'
		public Keyword getEndKeyword_2() { return cEndKeyword_2; }
	}
	
	
	private final StatemachineElements pStatemachine;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public XStatemachineGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pStatemachine = new StatemachineElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("ac.soton.xeventb.xstatemachine.XStatemachine".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Statemachine estatemachine::Statemachine:
	//	{estatemachine::Statemachine}
	//	'Statemachine'
	//	'end';
	public StatemachineElements getStatemachineAccess() {
		return pStatemachine;
	}
	
	public ParserRule getStatemachineRule() {
		return getStatemachineAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
