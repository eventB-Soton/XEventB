/*
 * generated by Xtext 2.11.0
 */
grammar InternalXStatemachine;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package ac.soton.xeventb.xstatemachine.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package ac.soton.xeventb.xstatemachine.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xeventb.xstatemachine.services.XStatemachineGrammarAccess;

}

@parser::members {

 	private XStatemachineGrammarAccess grammarAccess;

    public InternalXStatemachineParser(TokenStream input, XStatemachineGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Statemachine";
   	}

   	@Override
   	protected XStatemachineGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStatemachine
entryRuleStatemachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatemachineRule()); }
	iv_ruleStatemachine=ruleStatemachine
	{ $current=$iv_ruleStatemachine.current; }
	EOF;

// Rule Statemachine
ruleStatemachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
					$current);
			}
		)
		otherlv_1='Statemachine'
		{
			newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getStatemachineKeyword_1());
		}
		otherlv_2='end'
		{
			newLeafNode(otherlv_2, grammarAccess.getStatemachineAccess().getEndKeyword_2());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
