package ac.soton.eventb.xtext.machine.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ac.soton.eventb.xtext.machine.services.XMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXMachineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'@'", "'begin'", "'with'", "'when'", "'then'", "'any'", "'where'", "'theorem'", "'extended'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXMachine.g"; }


    	private XMachineGrammarAccess grammarAccess;

    	public void setGrammarAccess(XMachineGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleXMachine"
    // InternalXMachine.g:53:1: entryRuleXMachine : ruleXMachine EOF ;
    public final void entryRuleXMachine() throws RecognitionException {
        try {
            // InternalXMachine.g:54:1: ( ruleXMachine EOF )
            // InternalXMachine.g:55:1: ruleXMachine EOF
            {
             before(grammarAccess.getXMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleXMachine();

            state._fsp--;

             after(grammarAccess.getXMachineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXMachine"


    // $ANTLR start "ruleXMachine"
    // InternalXMachine.g:62:1: ruleXMachine : ( ( rule__XMachine__Group__0 ) ) ;
    public final void ruleXMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:66:2: ( ( ( rule__XMachine__Group__0 ) ) )
            // InternalXMachine.g:67:2: ( ( rule__XMachine__Group__0 ) )
            {
            // InternalXMachine.g:67:2: ( ( rule__XMachine__Group__0 ) )
            // InternalXMachine.g:68:3: ( rule__XMachine__Group__0 )
            {
             before(grammarAccess.getXMachineAccess().getGroup()); 
            // InternalXMachine.g:69:3: ( rule__XMachine__Group__0 )
            // InternalXMachine.g:69:4: rule__XMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXMachine"


    // $ANTLR start "entryRuleXVariable"
    // InternalXMachine.g:78:1: entryRuleXVariable : ruleXVariable EOF ;
    public final void entryRuleXVariable() throws RecognitionException {
        try {
            // InternalXMachine.g:79:1: ( ruleXVariable EOF )
            // InternalXMachine.g:80:1: ruleXVariable EOF
            {
             before(grammarAccess.getXVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariable();

            state._fsp--;

             after(grammarAccess.getXVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXVariable"


    // $ANTLR start "ruleXVariable"
    // InternalXMachine.g:87:1: ruleXVariable : ( ( rule__XVariable__Group__0 ) ) ;
    public final void ruleXVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:91:2: ( ( ( rule__XVariable__Group__0 ) ) )
            // InternalXMachine.g:92:2: ( ( rule__XVariable__Group__0 ) )
            {
            // InternalXMachine.g:92:2: ( ( rule__XVariable__Group__0 ) )
            // InternalXMachine.g:93:3: ( rule__XVariable__Group__0 )
            {
             before(grammarAccess.getXVariableAccess().getGroup()); 
            // InternalXMachine.g:94:3: ( rule__XVariable__Group__0 )
            // InternalXMachine.g:94:4: rule__XVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariable"


    // $ANTLR start "entryRuleXInvariant"
    // InternalXMachine.g:103:1: entryRuleXInvariant : ruleXInvariant EOF ;
    public final void entryRuleXInvariant() throws RecognitionException {
        try {
            // InternalXMachine.g:104:1: ( ruleXInvariant EOF )
            // InternalXMachine.g:105:1: ruleXInvariant EOF
            {
             before(grammarAccess.getXInvariantRule()); 
            pushFollow(FOLLOW_1);
            ruleXInvariant();

            state._fsp--;

             after(grammarAccess.getXInvariantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXInvariant"


    // $ANTLR start "ruleXInvariant"
    // InternalXMachine.g:112:1: ruleXInvariant : ( ( rule__XInvariant__Group__0 ) ) ;
    public final void ruleXInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:116:2: ( ( ( rule__XInvariant__Group__0 ) ) )
            // InternalXMachine.g:117:2: ( ( rule__XInvariant__Group__0 ) )
            {
            // InternalXMachine.g:117:2: ( ( rule__XInvariant__Group__0 ) )
            // InternalXMachine.g:118:3: ( rule__XInvariant__Group__0 )
            {
             before(grammarAccess.getXInvariantAccess().getGroup()); 
            // InternalXMachine.g:119:3: ( rule__XInvariant__Group__0 )
            // InternalXMachine.g:119:4: rule__XInvariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXInvariant"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:128:1: entryRuleXVariant : ruleXVariant EOF ;
    public final void entryRuleXVariant() throws RecognitionException {
        try {
            // InternalXMachine.g:129:1: ( ruleXVariant EOF )
            // InternalXMachine.g:130:1: ruleXVariant EOF
            {
             before(grammarAccess.getXVariantRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariant();

            state._fsp--;

             after(grammarAccess.getXVariantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXVariant"


    // $ANTLR start "ruleXVariant"
    // InternalXMachine.g:137:1: ruleXVariant : ( ( rule__XVariant__Group__0 ) ) ;
    public final void ruleXVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:141:2: ( ( ( rule__XVariant__Group__0 ) ) )
            // InternalXMachine.g:142:2: ( ( rule__XVariant__Group__0 ) )
            {
            // InternalXMachine.g:142:2: ( ( rule__XVariant__Group__0 ) )
            // InternalXMachine.g:143:3: ( rule__XVariant__Group__0 )
            {
             before(grammarAccess.getXVariantAccess().getGroup()); 
            // InternalXMachine.g:144:3: ( rule__XVariant__Group__0 )
            // InternalXMachine.g:144:4: rule__XVariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariant"


    // $ANTLR start "entryRuleXEvent"
    // InternalXMachine.g:153:1: entryRuleXEvent : ruleXEvent EOF ;
    public final void entryRuleXEvent() throws RecognitionException {
        try {
            // InternalXMachine.g:154:1: ( ruleXEvent EOF )
            // InternalXMachine.g:155:1: ruleXEvent EOF
            {
             before(grammarAccess.getXEventRule()); 
            pushFollow(FOLLOW_1);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getXEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXEvent"


    // $ANTLR start "ruleXEvent"
    // InternalXMachine.g:162:1: ruleXEvent : ( ( rule__XEvent__Group__0 ) ) ;
    public final void ruleXEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:166:2: ( ( ( rule__XEvent__Group__0 ) ) )
            // InternalXMachine.g:167:2: ( ( rule__XEvent__Group__0 ) )
            {
            // InternalXMachine.g:167:2: ( ( rule__XEvent__Group__0 ) )
            // InternalXMachine.g:168:3: ( rule__XEvent__Group__0 )
            {
             before(grammarAccess.getXEventAccess().getGroup()); 
            // InternalXMachine.g:169:3: ( rule__XEvent__Group__0 )
            // InternalXMachine.g:169:4: rule__XEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXEvent"


    // $ANTLR start "entryRuleXParameter"
    // InternalXMachine.g:178:1: entryRuleXParameter : ruleXParameter EOF ;
    public final void entryRuleXParameter() throws RecognitionException {
        try {
            // InternalXMachine.g:179:1: ( ruleXParameter EOF )
            // InternalXMachine.g:180:1: ruleXParameter EOF
            {
             before(grammarAccess.getXParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleXParameter();

            state._fsp--;

             after(grammarAccess.getXParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXParameter"


    // $ANTLR start "ruleXParameter"
    // InternalXMachine.g:187:1: ruleXParameter : ( ( rule__XParameter__Group__0 ) ) ;
    public final void ruleXParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:191:2: ( ( ( rule__XParameter__Group__0 ) ) )
            // InternalXMachine.g:192:2: ( ( rule__XParameter__Group__0 ) )
            {
            // InternalXMachine.g:192:2: ( ( rule__XParameter__Group__0 ) )
            // InternalXMachine.g:193:3: ( rule__XParameter__Group__0 )
            {
             before(grammarAccess.getXParameterAccess().getGroup()); 
            // InternalXMachine.g:194:3: ( rule__XParameter__Group__0 )
            // InternalXMachine.g:194:4: rule__XParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXParameter"


    // $ANTLR start "entryRuleXGuard"
    // InternalXMachine.g:203:1: entryRuleXGuard : ruleXGuard EOF ;
    public final void entryRuleXGuard() throws RecognitionException {
        try {
            // InternalXMachine.g:204:1: ( ruleXGuard EOF )
            // InternalXMachine.g:205:1: ruleXGuard EOF
            {
             before(grammarAccess.getXGuardRule()); 
            pushFollow(FOLLOW_1);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXGuardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXGuard"


    // $ANTLR start "ruleXGuard"
    // InternalXMachine.g:212:1: ruleXGuard : ( ( rule__XGuard__Group__0 ) ) ;
    public final void ruleXGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:216:2: ( ( ( rule__XGuard__Group__0 ) ) )
            // InternalXMachine.g:217:2: ( ( rule__XGuard__Group__0 ) )
            {
            // InternalXMachine.g:217:2: ( ( rule__XGuard__Group__0 ) )
            // InternalXMachine.g:218:3: ( rule__XGuard__Group__0 )
            {
             before(grammarAccess.getXGuardAccess().getGroup()); 
            // InternalXMachine.g:219:3: ( rule__XGuard__Group__0 )
            // InternalXMachine.g:219:4: rule__XGuard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGuard"


    // $ANTLR start "entryRuleXWitness"
    // InternalXMachine.g:228:1: entryRuleXWitness : ruleXWitness EOF ;
    public final void entryRuleXWitness() throws RecognitionException {
        try {
            // InternalXMachine.g:229:1: ( ruleXWitness EOF )
            // InternalXMachine.g:230:1: ruleXWitness EOF
            {
             before(grammarAccess.getXWitnessRule()); 
            pushFollow(FOLLOW_1);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXWitnessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXWitness"


    // $ANTLR start "ruleXWitness"
    // InternalXMachine.g:237:1: ruleXWitness : ( ( rule__XWitness__Group__0 ) ) ;
    public final void ruleXWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:241:2: ( ( ( rule__XWitness__Group__0 ) ) )
            // InternalXMachine.g:242:2: ( ( rule__XWitness__Group__0 ) )
            {
            // InternalXMachine.g:242:2: ( ( rule__XWitness__Group__0 ) )
            // InternalXMachine.g:243:3: ( rule__XWitness__Group__0 )
            {
             before(grammarAccess.getXWitnessAccess().getGroup()); 
            // InternalXMachine.g:244:3: ( rule__XWitness__Group__0 )
            // InternalXMachine.g:244:4: rule__XWitness__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXWitness"


    // $ANTLR start "entryRuleXAction"
    // InternalXMachine.g:253:1: entryRuleXAction : ruleXAction EOF ;
    public final void entryRuleXAction() throws RecognitionException {
        try {
            // InternalXMachine.g:254:1: ( ruleXAction EOF )
            // InternalXMachine.g:255:1: ruleXAction EOF
            {
             before(grammarAccess.getXActionRule()); 
            pushFollow(FOLLOW_1);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXAction"


    // $ANTLR start "ruleXAction"
    // InternalXMachine.g:262:1: ruleXAction : ( ( rule__XAction__Group__0 ) ) ;
    public final void ruleXAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:266:2: ( ( ( rule__XAction__Group__0 ) ) )
            // InternalXMachine.g:267:2: ( ( rule__XAction__Group__0 ) )
            {
            // InternalXMachine.g:267:2: ( ( rule__XAction__Group__0 ) )
            // InternalXMachine.g:268:3: ( rule__XAction__Group__0 )
            {
             before(grammarAccess.getXActionAccess().getGroup()); 
            // InternalXMachine.g:269:3: ( rule__XAction__Group__0 )
            // InternalXMachine.g:269:4: rule__XAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXAction"


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:278:1: ruleXConvergence : ( ( rule__XConvergence__Alternatives ) ) ;
    public final void ruleXConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:282:1: ( ( ( rule__XConvergence__Alternatives ) ) )
            // InternalXMachine.g:283:2: ( ( rule__XConvergence__Alternatives ) )
            {
            // InternalXMachine.g:283:2: ( ( rule__XConvergence__Alternatives ) )
            // InternalXMachine.g:284:3: ( rule__XConvergence__Alternatives )
            {
             before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            // InternalXMachine.g:285:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:285:4: rule__XConvergence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XConvergence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXConvergenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXConvergence"


    // $ANTLR start "rule__XMachine__CommentAlternatives_1_0"
    // InternalXMachine.g:293:1: rule__XMachine__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XMachine__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:297:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ML_COMMENT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_SL_COMMENT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalXMachine.g:298:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:298:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:299:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:304:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:304:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:305:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__CommentAlternatives_1_0"


    // $ANTLR start "rule__XVariable__CommentAlternatives_1_0"
    // InternalXMachine.g:314:1: rule__XVariable__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XVariable__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:318:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ML_COMMENT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:319:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:319:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:320:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXVariableAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXVariableAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:325:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:325:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:326:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXVariableAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXVariableAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__CommentAlternatives_1_0"


    // $ANTLR start "rule__XInvariant__CommentAlternatives_1_0"
    // InternalXMachine.g:335:1: rule__XInvariant__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XInvariant__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:339:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ML_COMMENT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_SL_COMMENT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:340:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:340:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:341:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXInvariantAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXInvariantAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:346:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:346:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:347:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXInvariantAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXInvariantAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__CommentAlternatives_1_0"


    // $ANTLR start "rule__XVariant__CommentAlternatives_1_0"
    // InternalXMachine.g:356:1: rule__XVariant__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XVariant__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:360:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ML_COMMENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_SL_COMMENT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:361:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:361:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:362:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXVariantAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXVariantAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:367:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:367:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:368:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXVariantAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXVariantAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__CommentAlternatives_1_0"


    // $ANTLR start "rule__XEvent__CommentAlternatives_1_0"
    // InternalXMachine.g:377:1: rule__XEvent__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XEvent__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:381:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ML_COMMENT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_SL_COMMENT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:382:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:382:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:383:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXEventAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXEventAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:388:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:388:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:389:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXEventAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXEventAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__CommentAlternatives_1_0"


    // $ANTLR start "rule__XEvent__Alternatives_6"
    // InternalXMachine.g:398:1: rule__XEvent__Alternatives_6 : ( ( ( rule__XEvent__Group_6_0__0 ) ) | ( ( rule__XEvent__Group_6_1__0 ) ) | ( ( rule__XEvent__Group_6_2__0 ) ) );
    public final void rule__XEvent__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:402:1: ( ( ( rule__XEvent__Group_6_0__0 ) ) | ( ( rule__XEvent__Group_6_1__0 ) ) | ( ( rule__XEvent__Group_6_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:403:2: ( ( rule__XEvent__Group_6_0__0 ) )
                    {
                    // InternalXMachine.g:403:2: ( ( rule__XEvent__Group_6_0__0 ) )
                    // InternalXMachine.g:404:3: ( rule__XEvent__Group_6_0__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_6_0()); 
                    // InternalXMachine.g:405:3: ( rule__XEvent__Group_6_0__0 )
                    // InternalXMachine.g:405:4: rule__XEvent__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:409:2: ( ( rule__XEvent__Group_6_1__0 ) )
                    {
                    // InternalXMachine.g:409:2: ( ( rule__XEvent__Group_6_1__0 ) )
                    // InternalXMachine.g:410:3: ( rule__XEvent__Group_6_1__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_6_1()); 
                    // InternalXMachine.g:411:3: ( rule__XEvent__Group_6_1__0 )
                    // InternalXMachine.g:411:4: rule__XEvent__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_6_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:415:2: ( ( rule__XEvent__Group_6_2__0 ) )
                    {
                    // InternalXMachine.g:415:2: ( ( rule__XEvent__Group_6_2__0 ) )
                    // InternalXMachine.g:416:3: ( rule__XEvent__Group_6_2__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_6_2()); 
                    // InternalXMachine.g:417:3: ( rule__XEvent__Group_6_2__0 )
                    // InternalXMachine.g:417:4: rule__XEvent__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_6_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Alternatives_6"


    // $ANTLR start "rule__XParameter__CommentAlternatives_1_0"
    // InternalXMachine.g:425:1: rule__XParameter__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XParameter__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:429:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ML_COMMENT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_SL_COMMENT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:430:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:430:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:431:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXParameterAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXParameterAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:436:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:436:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:437:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXParameterAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXParameterAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__CommentAlternatives_1_0"


    // $ANTLR start "rule__XGuard__CommentAlternatives_1_0"
    // InternalXMachine.g:446:1: rule__XGuard__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XGuard__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:450:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ML_COMMENT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_SL_COMMENT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:451:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:451:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:452:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXGuardAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXGuardAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:457:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:457:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:458:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXGuardAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXGuardAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__CommentAlternatives_1_0"


    // $ANTLR start "rule__XWitness__CommentAlternatives_1_0"
    // InternalXMachine.g:467:1: rule__XWitness__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XWitness__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:471:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ML_COMMENT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_SL_COMMENT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:472:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:472:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:473:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXWitnessAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXWitnessAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:478:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:478:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:479:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXWitnessAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXWitnessAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__CommentAlternatives_1_0"


    // $ANTLR start "rule__XAction__CommentAlternatives_1_0"
    // InternalXMachine.g:488:1: rule__XAction__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XAction__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:492:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ML_COMMENT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_SL_COMMENT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:493:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:493:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:494:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXActionAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXActionAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:499:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:499:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:500:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXActionAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXActionAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__CommentAlternatives_1_0"


    // $ANTLR start "rule__XConvergence__Alternatives"
    // InternalXMachine.g:509:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:513:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt11=1;
                }
                break;
            case 12:
                {
                alt11=2;
                }
                break;
            case 13:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:514:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:514:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:515:3: ( 'ordinary' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    // InternalXMachine.g:516:3: ( 'ordinary' )
                    // InternalXMachine.g:516:4: 'ordinary'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:520:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:520:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:521:3: ( 'convergent' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    // InternalXMachine.g:522:3: ( 'convergent' )
                    // InternalXMachine.g:522:4: 'convergent'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:526:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:526:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:527:3: ( 'anticipated' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    // InternalXMachine.g:528:3: ( 'anticipated' )
                    // InternalXMachine.g:528:4: 'anticipated'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConvergence__Alternatives"


    // $ANTLR start "rule__XMachine__Group__0"
    // InternalXMachine.g:536:1: rule__XMachine__Group__0 : rule__XMachine__Group__0__Impl rule__XMachine__Group__1 ;
    public final void rule__XMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:540:1: ( rule__XMachine__Group__0__Impl rule__XMachine__Group__1 )
            // InternalXMachine.g:541:2: rule__XMachine__Group__0__Impl rule__XMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__XMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__0"


    // $ANTLR start "rule__XMachine__Group__0__Impl"
    // InternalXMachine.g:548:1: rule__XMachine__Group__0__Impl : ( () ) ;
    public final void rule__XMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:552:1: ( ( () ) )
            // InternalXMachine.g:553:1: ( () )
            {
            // InternalXMachine.g:553:1: ( () )
            // InternalXMachine.g:554:2: ()
            {
             before(grammarAccess.getXMachineAccess().getMachineAction_0()); 
            // InternalXMachine.g:555:2: ()
            // InternalXMachine.g:555:3: 
            {
            }

             after(grammarAccess.getXMachineAccess().getMachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__0__Impl"


    // $ANTLR start "rule__XMachine__Group__1"
    // InternalXMachine.g:563:1: rule__XMachine__Group__1 : rule__XMachine__Group__1__Impl rule__XMachine__Group__2 ;
    public final void rule__XMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:567:1: ( rule__XMachine__Group__1__Impl rule__XMachine__Group__2 )
            // InternalXMachine.g:568:2: rule__XMachine__Group__1__Impl rule__XMachine__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__XMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__1"


    // $ANTLR start "rule__XMachine__Group__1__Impl"
    // InternalXMachine.g:575:1: rule__XMachine__Group__1__Impl : ( ( rule__XMachine__CommentAssignment_1 )? ) ;
    public final void rule__XMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:579:1: ( ( ( rule__XMachine__CommentAssignment_1 )? ) )
            // InternalXMachine.g:580:1: ( ( rule__XMachine__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:580:1: ( ( rule__XMachine__CommentAssignment_1 )? )
            // InternalXMachine.g:581:2: ( rule__XMachine__CommentAssignment_1 )?
            {
             before(grammarAccess.getXMachineAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:582:2: ( rule__XMachine__CommentAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ML_COMMENT && LA12_0<=RULE_SL_COMMENT)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXMachine.g:582:3: rule__XMachine__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XMachine__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXMachineAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__1__Impl"


    // $ANTLR start "rule__XMachine__Group__2"
    // InternalXMachine.g:590:1: rule__XMachine__Group__2 : rule__XMachine__Group__2__Impl rule__XMachine__Group__3 ;
    public final void rule__XMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:594:1: ( rule__XMachine__Group__2__Impl rule__XMachine__Group__3 )
            // InternalXMachine.g:595:2: rule__XMachine__Group__2__Impl rule__XMachine__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__XMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__2"


    // $ANTLR start "rule__XMachine__Group__2__Impl"
    // InternalXMachine.g:602:1: rule__XMachine__Group__2__Impl : ( 'machine' ) ;
    public final void rule__XMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:606:1: ( ( 'machine' ) )
            // InternalXMachine.g:607:1: ( 'machine' )
            {
            // InternalXMachine.g:607:1: ( 'machine' )
            // InternalXMachine.g:608:2: 'machine'
            {
             before(grammarAccess.getXMachineAccess().getMachineKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getMachineKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__2__Impl"


    // $ANTLR start "rule__XMachine__Group__3"
    // InternalXMachine.g:617:1: rule__XMachine__Group__3 : rule__XMachine__Group__3__Impl rule__XMachine__Group__4 ;
    public final void rule__XMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:621:1: ( rule__XMachine__Group__3__Impl rule__XMachine__Group__4 )
            // InternalXMachine.g:622:2: rule__XMachine__Group__3__Impl rule__XMachine__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__XMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__3"


    // $ANTLR start "rule__XMachine__Group__3__Impl"
    // InternalXMachine.g:629:1: rule__XMachine__Group__3__Impl : ( ( rule__XMachine__NameAssignment_3 ) ) ;
    public final void rule__XMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:633:1: ( ( ( rule__XMachine__NameAssignment_3 ) ) )
            // InternalXMachine.g:634:1: ( ( rule__XMachine__NameAssignment_3 ) )
            {
            // InternalXMachine.g:634:1: ( ( rule__XMachine__NameAssignment_3 ) )
            // InternalXMachine.g:635:2: ( rule__XMachine__NameAssignment_3 )
            {
             before(grammarAccess.getXMachineAccess().getNameAssignment_3()); 
            // InternalXMachine.g:636:2: ( rule__XMachine__NameAssignment_3 )
            // InternalXMachine.g:636:3: rule__XMachine__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__3__Impl"


    // $ANTLR start "rule__XMachine__Group__4"
    // InternalXMachine.g:644:1: rule__XMachine__Group__4 : rule__XMachine__Group__4__Impl rule__XMachine__Group__5 ;
    public final void rule__XMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:648:1: ( rule__XMachine__Group__4__Impl rule__XMachine__Group__5 )
            // InternalXMachine.g:649:2: rule__XMachine__Group__4__Impl rule__XMachine__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__XMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__4"


    // $ANTLR start "rule__XMachine__Group__4__Impl"
    // InternalXMachine.g:656:1: rule__XMachine__Group__4__Impl : ( ( rule__XMachine__Group_4__0 )? ) ;
    public final void rule__XMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:660:1: ( ( ( rule__XMachine__Group_4__0 )? ) )
            // InternalXMachine.g:661:1: ( ( rule__XMachine__Group_4__0 )? )
            {
            // InternalXMachine.g:661:1: ( ( rule__XMachine__Group_4__0 )? )
            // InternalXMachine.g:662:2: ( rule__XMachine__Group_4__0 )?
            {
             before(grammarAccess.getXMachineAccess().getGroup_4()); 
            // InternalXMachine.g:663:2: ( rule__XMachine__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:663:3: rule__XMachine__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XMachine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXMachineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__4__Impl"


    // $ANTLR start "rule__XMachine__Group__5"
    // InternalXMachine.g:671:1: rule__XMachine__Group__5 : rule__XMachine__Group__5__Impl rule__XMachine__Group__6 ;
    public final void rule__XMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:675:1: ( rule__XMachine__Group__5__Impl rule__XMachine__Group__6 )
            // InternalXMachine.g:676:2: rule__XMachine__Group__5__Impl rule__XMachine__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__XMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__5"


    // $ANTLR start "rule__XMachine__Group__5__Impl"
    // InternalXMachine.g:683:1: rule__XMachine__Group__5__Impl : ( ( rule__XMachine__Group_5__0 )? ) ;
    public final void rule__XMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:687:1: ( ( ( rule__XMachine__Group_5__0 )? ) )
            // InternalXMachine.g:688:1: ( ( rule__XMachine__Group_5__0 )? )
            {
            // InternalXMachine.g:688:1: ( ( rule__XMachine__Group_5__0 )? )
            // InternalXMachine.g:689:2: ( rule__XMachine__Group_5__0 )?
            {
             before(grammarAccess.getXMachineAccess().getGroup_5()); 
            // InternalXMachine.g:690:2: ( rule__XMachine__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:690:3: rule__XMachine__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XMachine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXMachineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__5__Impl"


    // $ANTLR start "rule__XMachine__Group__6"
    // InternalXMachine.g:698:1: rule__XMachine__Group__6 : rule__XMachine__Group__6__Impl rule__XMachine__Group__7 ;
    public final void rule__XMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:702:1: ( rule__XMachine__Group__6__Impl rule__XMachine__Group__7 )
            // InternalXMachine.g:703:2: rule__XMachine__Group__6__Impl rule__XMachine__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__XMachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__6"


    // $ANTLR start "rule__XMachine__Group__6__Impl"
    // InternalXMachine.g:710:1: rule__XMachine__Group__6__Impl : ( ( rule__XMachine__Group_6__0 )? ) ;
    public final void rule__XMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:714:1: ( ( ( rule__XMachine__Group_6__0 )? ) )
            // InternalXMachine.g:715:1: ( ( rule__XMachine__Group_6__0 )? )
            {
            // InternalXMachine.g:715:1: ( ( rule__XMachine__Group_6__0 )? )
            // InternalXMachine.g:716:2: ( rule__XMachine__Group_6__0 )?
            {
             before(grammarAccess.getXMachineAccess().getGroup_6()); 
            // InternalXMachine.g:717:2: ( rule__XMachine__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:717:3: rule__XMachine__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XMachine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXMachineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__6__Impl"


    // $ANTLR start "rule__XMachine__Group__7"
    // InternalXMachine.g:725:1: rule__XMachine__Group__7 : rule__XMachine__Group__7__Impl rule__XMachine__Group__8 ;
    public final void rule__XMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:729:1: ( rule__XMachine__Group__7__Impl rule__XMachine__Group__8 )
            // InternalXMachine.g:730:2: rule__XMachine__Group__7__Impl rule__XMachine__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__XMachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__7"


    // $ANTLR start "rule__XMachine__Group__7__Impl"
    // InternalXMachine.g:737:1: rule__XMachine__Group__7__Impl : ( ( rule__XMachine__Group_7__0 )? ) ;
    public final void rule__XMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:741:1: ( ( ( rule__XMachine__Group_7__0 )? ) )
            // InternalXMachine.g:742:1: ( ( rule__XMachine__Group_7__0 )? )
            {
            // InternalXMachine.g:742:1: ( ( rule__XMachine__Group_7__0 )? )
            // InternalXMachine.g:743:2: ( rule__XMachine__Group_7__0 )?
            {
             before(grammarAccess.getXMachineAccess().getGroup_7()); 
            // InternalXMachine.g:744:2: ( rule__XMachine__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:744:3: rule__XMachine__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XMachine__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXMachineAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__7__Impl"


    // $ANTLR start "rule__XMachine__Group__8"
    // InternalXMachine.g:752:1: rule__XMachine__Group__8 : rule__XMachine__Group__8__Impl rule__XMachine__Group__9 ;
    public final void rule__XMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:756:1: ( rule__XMachine__Group__8__Impl rule__XMachine__Group__9 )
            // InternalXMachine.g:757:2: rule__XMachine__Group__8__Impl rule__XMachine__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__XMachine__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__8"


    // $ANTLR start "rule__XMachine__Group__8__Impl"
    // InternalXMachine.g:764:1: rule__XMachine__Group__8__Impl : ( ( rule__XMachine__Group_8__0 )? ) ;
    public final void rule__XMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:768:1: ( ( ( rule__XMachine__Group_8__0 )? ) )
            // InternalXMachine.g:769:1: ( ( rule__XMachine__Group_8__0 )? )
            {
            // InternalXMachine.g:769:1: ( ( rule__XMachine__Group_8__0 )? )
            // InternalXMachine.g:770:2: ( rule__XMachine__Group_8__0 )?
            {
             before(grammarAccess.getXMachineAccess().getGroup_8()); 
            // InternalXMachine.g:771:2: ( rule__XMachine__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:771:3: rule__XMachine__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XMachine__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXMachineAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__8__Impl"


    // $ANTLR start "rule__XMachine__Group__9"
    // InternalXMachine.g:779:1: rule__XMachine__Group__9 : rule__XMachine__Group__9__Impl rule__XMachine__Group__10 ;
    public final void rule__XMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:783:1: ( rule__XMachine__Group__9__Impl rule__XMachine__Group__10 )
            // InternalXMachine.g:784:2: rule__XMachine__Group__9__Impl rule__XMachine__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__XMachine__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__9"


    // $ANTLR start "rule__XMachine__Group__9__Impl"
    // InternalXMachine.g:791:1: rule__XMachine__Group__9__Impl : ( ( rule__XMachine__Group_9__0 )? ) ;
    public final void rule__XMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:795:1: ( ( ( rule__XMachine__Group_9__0 )? ) )
            // InternalXMachine.g:796:1: ( ( rule__XMachine__Group_9__0 )? )
            {
            // InternalXMachine.g:796:1: ( ( rule__XMachine__Group_9__0 )? )
            // InternalXMachine.g:797:2: ( rule__XMachine__Group_9__0 )?
            {
             before(grammarAccess.getXMachineAccess().getGroup_9()); 
            // InternalXMachine.g:798:2: ( rule__XMachine__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:798:3: rule__XMachine__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XMachine__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXMachineAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__9__Impl"


    // $ANTLR start "rule__XMachine__Group__10"
    // InternalXMachine.g:806:1: rule__XMachine__Group__10 : rule__XMachine__Group__10__Impl ;
    public final void rule__XMachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:810:1: ( rule__XMachine__Group__10__Impl )
            // InternalXMachine.g:811:2: rule__XMachine__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__10"


    // $ANTLR start "rule__XMachine__Group__10__Impl"
    // InternalXMachine.g:817:1: rule__XMachine__Group__10__Impl : ( 'end' ) ;
    public final void rule__XMachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:821:1: ( ( 'end' ) )
            // InternalXMachine.g:822:1: ( 'end' )
            {
            // InternalXMachine.g:822:1: ( 'end' )
            // InternalXMachine.g:823:2: 'end'
            {
             before(grammarAccess.getXMachineAccess().getEndKeyword_10()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getEndKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group__10__Impl"


    // $ANTLR start "rule__XMachine__Group_4__0"
    // InternalXMachine.g:833:1: rule__XMachine__Group_4__0 : rule__XMachine__Group_4__0__Impl rule__XMachine__Group_4__1 ;
    public final void rule__XMachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:837:1: ( rule__XMachine__Group_4__0__Impl rule__XMachine__Group_4__1 )
            // InternalXMachine.g:838:2: rule__XMachine__Group_4__0__Impl rule__XMachine__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__XMachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_4__0"


    // $ANTLR start "rule__XMachine__Group_4__0__Impl"
    // InternalXMachine.g:845:1: rule__XMachine__Group_4__0__Impl : ( 'refines' ) ;
    public final void rule__XMachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:849:1: ( ( 'refines' ) )
            // InternalXMachine.g:850:1: ( 'refines' )
            {
            // InternalXMachine.g:850:1: ( 'refines' )
            // InternalXMachine.g:851:2: 'refines'
            {
             before(grammarAccess.getXMachineAccess().getRefinesKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getRefinesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_4__0__Impl"


    // $ANTLR start "rule__XMachine__Group_4__1"
    // InternalXMachine.g:860:1: rule__XMachine__Group_4__1 : rule__XMachine__Group_4__1__Impl ;
    public final void rule__XMachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:864:1: ( rule__XMachine__Group_4__1__Impl )
            // InternalXMachine.g:865:2: rule__XMachine__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_4__1"


    // $ANTLR start "rule__XMachine__Group_4__1__Impl"
    // InternalXMachine.g:871:1: rule__XMachine__Group_4__1__Impl : ( ( rule__XMachine__RefinesAssignment_4_1 ) ) ;
    public final void rule__XMachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:875:1: ( ( ( rule__XMachine__RefinesAssignment_4_1 ) ) )
            // InternalXMachine.g:876:1: ( ( rule__XMachine__RefinesAssignment_4_1 ) )
            {
            // InternalXMachine.g:876:1: ( ( rule__XMachine__RefinesAssignment_4_1 ) )
            // InternalXMachine.g:877:2: ( rule__XMachine__RefinesAssignment_4_1 )
            {
             before(grammarAccess.getXMachineAccess().getRefinesAssignment_4_1()); 
            // InternalXMachine.g:878:2: ( rule__XMachine__RefinesAssignment_4_1 )
            // InternalXMachine.g:878:3: rule__XMachine__RefinesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__RefinesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getRefinesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_4__1__Impl"


    // $ANTLR start "rule__XMachine__Group_5__0"
    // InternalXMachine.g:887:1: rule__XMachine__Group_5__0 : rule__XMachine__Group_5__0__Impl rule__XMachine__Group_5__1 ;
    public final void rule__XMachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:891:1: ( rule__XMachine__Group_5__0__Impl rule__XMachine__Group_5__1 )
            // InternalXMachine.g:892:2: rule__XMachine__Group_5__0__Impl rule__XMachine__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__XMachine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_5__0"


    // $ANTLR start "rule__XMachine__Group_5__0__Impl"
    // InternalXMachine.g:899:1: rule__XMachine__Group_5__0__Impl : ( 'sees' ) ;
    public final void rule__XMachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:903:1: ( ( 'sees' ) )
            // InternalXMachine.g:904:1: ( 'sees' )
            {
            // InternalXMachine.g:904:1: ( 'sees' )
            // InternalXMachine.g:905:2: 'sees'
            {
             before(grammarAccess.getXMachineAccess().getSeesKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getSeesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_5__0__Impl"


    // $ANTLR start "rule__XMachine__Group_5__1"
    // InternalXMachine.g:914:1: rule__XMachine__Group_5__1 : rule__XMachine__Group_5__1__Impl ;
    public final void rule__XMachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:918:1: ( rule__XMachine__Group_5__1__Impl )
            // InternalXMachine.g:919:2: rule__XMachine__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_5__1"


    // $ANTLR start "rule__XMachine__Group_5__1__Impl"
    // InternalXMachine.g:925:1: rule__XMachine__Group_5__1__Impl : ( ( ( rule__XMachine__SeesAssignment_5_1 ) ) ( ( rule__XMachine__SeesAssignment_5_1 )* ) ) ;
    public final void rule__XMachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:929:1: ( ( ( ( rule__XMachine__SeesAssignment_5_1 ) ) ( ( rule__XMachine__SeesAssignment_5_1 )* ) ) )
            // InternalXMachine.g:930:1: ( ( ( rule__XMachine__SeesAssignment_5_1 ) ) ( ( rule__XMachine__SeesAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:930:1: ( ( ( rule__XMachine__SeesAssignment_5_1 ) ) ( ( rule__XMachine__SeesAssignment_5_1 )* ) )
            // InternalXMachine.g:931:2: ( ( rule__XMachine__SeesAssignment_5_1 ) ) ( ( rule__XMachine__SeesAssignment_5_1 )* )
            {
            // InternalXMachine.g:931:2: ( ( rule__XMachine__SeesAssignment_5_1 ) )
            // InternalXMachine.g:932:3: ( rule__XMachine__SeesAssignment_5_1 )
            {
             before(grammarAccess.getXMachineAccess().getSeesAssignment_5_1()); 
            // InternalXMachine.g:933:3: ( rule__XMachine__SeesAssignment_5_1 )
            // InternalXMachine.g:933:4: rule__XMachine__SeesAssignment_5_1
            {
            pushFollow(FOLLOW_6);
            rule__XMachine__SeesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getSeesAssignment_5_1()); 

            }

            // InternalXMachine.g:936:2: ( ( rule__XMachine__SeesAssignment_5_1 )* )
            // InternalXMachine.g:937:3: ( rule__XMachine__SeesAssignment_5_1 )*
            {
             before(grammarAccess.getXMachineAccess().getSeesAssignment_5_1()); 
            // InternalXMachine.g:938:3: ( rule__XMachine__SeesAssignment_5_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXMachine.g:938:4: rule__XMachine__SeesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__XMachine__SeesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getXMachineAccess().getSeesAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_5__1__Impl"


    // $ANTLR start "rule__XMachine__Group_6__0"
    // InternalXMachine.g:948:1: rule__XMachine__Group_6__0 : rule__XMachine__Group_6__0__Impl rule__XMachine__Group_6__1 ;
    public final void rule__XMachine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:952:1: ( rule__XMachine__Group_6__0__Impl rule__XMachine__Group_6__1 )
            // InternalXMachine.g:953:2: rule__XMachine__Group_6__0__Impl rule__XMachine__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__XMachine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_6__0"


    // $ANTLR start "rule__XMachine__Group_6__0__Impl"
    // InternalXMachine.g:960:1: rule__XMachine__Group_6__0__Impl : ( 'variables' ) ;
    public final void rule__XMachine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:964:1: ( ( 'variables' ) )
            // InternalXMachine.g:965:1: ( 'variables' )
            {
            // InternalXMachine.g:965:1: ( 'variables' )
            // InternalXMachine.g:966:2: 'variables'
            {
             before(grammarAccess.getXMachineAccess().getVariablesKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getVariablesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_6__0__Impl"


    // $ANTLR start "rule__XMachine__Group_6__1"
    // InternalXMachine.g:975:1: rule__XMachine__Group_6__1 : rule__XMachine__Group_6__1__Impl ;
    public final void rule__XMachine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:979:1: ( rule__XMachine__Group_6__1__Impl )
            // InternalXMachine.g:980:2: rule__XMachine__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_6__1"


    // $ANTLR start "rule__XMachine__Group_6__1__Impl"
    // InternalXMachine.g:986:1: rule__XMachine__Group_6__1__Impl : ( ( ( rule__XMachine__VariablesAssignment_6_1 ) ) ( ( rule__XMachine__VariablesAssignment_6_1 )* ) ) ;
    public final void rule__XMachine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:990:1: ( ( ( ( rule__XMachine__VariablesAssignment_6_1 ) ) ( ( rule__XMachine__VariablesAssignment_6_1 )* ) ) )
            // InternalXMachine.g:991:1: ( ( ( rule__XMachine__VariablesAssignment_6_1 ) ) ( ( rule__XMachine__VariablesAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:991:1: ( ( ( rule__XMachine__VariablesAssignment_6_1 ) ) ( ( rule__XMachine__VariablesAssignment_6_1 )* ) )
            // InternalXMachine.g:992:2: ( ( rule__XMachine__VariablesAssignment_6_1 ) ) ( ( rule__XMachine__VariablesAssignment_6_1 )* )
            {
            // InternalXMachine.g:992:2: ( ( rule__XMachine__VariablesAssignment_6_1 ) )
            // InternalXMachine.g:993:3: ( rule__XMachine__VariablesAssignment_6_1 )
            {
             before(grammarAccess.getXMachineAccess().getVariablesAssignment_6_1()); 
            // InternalXMachine.g:994:3: ( rule__XMachine__VariablesAssignment_6_1 )
            // InternalXMachine.g:994:4: rule__XMachine__VariablesAssignment_6_1
            {
            pushFollow(FOLLOW_8);
            rule__XMachine__VariablesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getVariablesAssignment_6_1()); 

            }

            // InternalXMachine.g:997:2: ( ( rule__XMachine__VariablesAssignment_6_1 )* )
            // InternalXMachine.g:998:3: ( rule__XMachine__VariablesAssignment_6_1 )*
            {
             before(grammarAccess.getXMachineAccess().getVariablesAssignment_6_1()); 
            // InternalXMachine.g:999:3: ( rule__XMachine__VariablesAssignment_6_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ML_COMMENT && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXMachine.g:999:4: rule__XMachine__VariablesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XMachine__VariablesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getXMachineAccess().getVariablesAssignment_6_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_6__1__Impl"


    // $ANTLR start "rule__XMachine__Group_7__0"
    // InternalXMachine.g:1009:1: rule__XMachine__Group_7__0 : rule__XMachine__Group_7__0__Impl rule__XMachine__Group_7__1 ;
    public final void rule__XMachine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1013:1: ( rule__XMachine__Group_7__0__Impl rule__XMachine__Group_7__1 )
            // InternalXMachine.g:1014:2: rule__XMachine__Group_7__0__Impl rule__XMachine__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__XMachine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_7__0"


    // $ANTLR start "rule__XMachine__Group_7__0__Impl"
    // InternalXMachine.g:1021:1: rule__XMachine__Group_7__0__Impl : ( 'invariants' ) ;
    public final void rule__XMachine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1025:1: ( ( 'invariants' ) )
            // InternalXMachine.g:1026:1: ( 'invariants' )
            {
            // InternalXMachine.g:1026:1: ( 'invariants' )
            // InternalXMachine.g:1027:2: 'invariants'
            {
             before(grammarAccess.getXMachineAccess().getInvariantsKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getInvariantsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_7__0__Impl"


    // $ANTLR start "rule__XMachine__Group_7__1"
    // InternalXMachine.g:1036:1: rule__XMachine__Group_7__1 : rule__XMachine__Group_7__1__Impl ;
    public final void rule__XMachine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1040:1: ( rule__XMachine__Group_7__1__Impl )
            // InternalXMachine.g:1041:2: rule__XMachine__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_7__1"


    // $ANTLR start "rule__XMachine__Group_7__1__Impl"
    // InternalXMachine.g:1047:1: rule__XMachine__Group_7__1__Impl : ( ( ( rule__XMachine__InvariantsAssignment_7_1 ) ) ( ( rule__XMachine__InvariantsAssignment_7_1 )* ) ) ;
    public final void rule__XMachine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1051:1: ( ( ( ( rule__XMachine__InvariantsAssignment_7_1 ) ) ( ( rule__XMachine__InvariantsAssignment_7_1 )* ) ) )
            // InternalXMachine.g:1052:1: ( ( ( rule__XMachine__InvariantsAssignment_7_1 ) ) ( ( rule__XMachine__InvariantsAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:1052:1: ( ( ( rule__XMachine__InvariantsAssignment_7_1 ) ) ( ( rule__XMachine__InvariantsAssignment_7_1 )* ) )
            // InternalXMachine.g:1053:2: ( ( rule__XMachine__InvariantsAssignment_7_1 ) ) ( ( rule__XMachine__InvariantsAssignment_7_1 )* )
            {
            // InternalXMachine.g:1053:2: ( ( rule__XMachine__InvariantsAssignment_7_1 ) )
            // InternalXMachine.g:1054:3: ( rule__XMachine__InvariantsAssignment_7_1 )
            {
             before(grammarAccess.getXMachineAccess().getInvariantsAssignment_7_1()); 
            // InternalXMachine.g:1055:3: ( rule__XMachine__InvariantsAssignment_7_1 )
            // InternalXMachine.g:1055:4: rule__XMachine__InvariantsAssignment_7_1
            {
            pushFollow(FOLLOW_10);
            rule__XMachine__InvariantsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getInvariantsAssignment_7_1()); 

            }

            // InternalXMachine.g:1058:2: ( ( rule__XMachine__InvariantsAssignment_7_1 )* )
            // InternalXMachine.g:1059:3: ( rule__XMachine__InvariantsAssignment_7_1 )*
            {
             before(grammarAccess.getXMachineAccess().getInvariantsAssignment_7_1()); 
            // InternalXMachine.g:1060:3: ( rule__XMachine__InvariantsAssignment_7_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ML_COMMENT && LA21_0<=RULE_SL_COMMENT)||LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXMachine.g:1060:4: rule__XMachine__InvariantsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XMachine__InvariantsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getXMachineAccess().getInvariantsAssignment_7_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_7__1__Impl"


    // $ANTLR start "rule__XMachine__Group_8__0"
    // InternalXMachine.g:1070:1: rule__XMachine__Group_8__0 : rule__XMachine__Group_8__0__Impl rule__XMachine__Group_8__1 ;
    public final void rule__XMachine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1074:1: ( rule__XMachine__Group_8__0__Impl rule__XMachine__Group_8__1 )
            // InternalXMachine.g:1075:2: rule__XMachine__Group_8__0__Impl rule__XMachine__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__XMachine__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_8__0"


    // $ANTLR start "rule__XMachine__Group_8__0__Impl"
    // InternalXMachine.g:1082:1: rule__XMachine__Group_8__0__Impl : ( 'variant' ) ;
    public final void rule__XMachine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1086:1: ( ( 'variant' ) )
            // InternalXMachine.g:1087:1: ( 'variant' )
            {
            // InternalXMachine.g:1087:1: ( 'variant' )
            // InternalXMachine.g:1088:2: 'variant'
            {
             before(grammarAccess.getXMachineAccess().getVariantKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getVariantKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_8__0__Impl"


    // $ANTLR start "rule__XMachine__Group_8__1"
    // InternalXMachine.g:1097:1: rule__XMachine__Group_8__1 : rule__XMachine__Group_8__1__Impl ;
    public final void rule__XMachine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1101:1: ( rule__XMachine__Group_8__1__Impl )
            // InternalXMachine.g:1102:2: rule__XMachine__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_8__1"


    // $ANTLR start "rule__XMachine__Group_8__1__Impl"
    // InternalXMachine.g:1108:1: rule__XMachine__Group_8__1__Impl : ( ( rule__XMachine__VariantAssignment_8_1 ) ) ;
    public final void rule__XMachine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1112:1: ( ( ( rule__XMachine__VariantAssignment_8_1 ) ) )
            // InternalXMachine.g:1113:1: ( ( rule__XMachine__VariantAssignment_8_1 ) )
            {
            // InternalXMachine.g:1113:1: ( ( rule__XMachine__VariantAssignment_8_1 ) )
            // InternalXMachine.g:1114:2: ( rule__XMachine__VariantAssignment_8_1 )
            {
             before(grammarAccess.getXMachineAccess().getVariantAssignment_8_1()); 
            // InternalXMachine.g:1115:2: ( rule__XMachine__VariantAssignment_8_1 )
            // InternalXMachine.g:1115:3: rule__XMachine__VariantAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__VariantAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getVariantAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_8__1__Impl"


    // $ANTLR start "rule__XMachine__Group_9__0"
    // InternalXMachine.g:1124:1: rule__XMachine__Group_9__0 : rule__XMachine__Group_9__0__Impl rule__XMachine__Group_9__1 ;
    public final void rule__XMachine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1128:1: ( rule__XMachine__Group_9__0__Impl rule__XMachine__Group_9__1 )
            // InternalXMachine.g:1129:2: rule__XMachine__Group_9__0__Impl rule__XMachine__Group_9__1
            {
            pushFollow(FOLLOW_7);
            rule__XMachine__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_9__0"


    // $ANTLR start "rule__XMachine__Group_9__0__Impl"
    // InternalXMachine.g:1136:1: rule__XMachine__Group_9__0__Impl : ( 'events' ) ;
    public final void rule__XMachine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1140:1: ( ( 'events' ) )
            // InternalXMachine.g:1141:1: ( 'events' )
            {
            // InternalXMachine.g:1141:1: ( 'events' )
            // InternalXMachine.g:1142:2: 'events'
            {
             before(grammarAccess.getXMachineAccess().getEventsKeyword_9_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getEventsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_9__0__Impl"


    // $ANTLR start "rule__XMachine__Group_9__1"
    // InternalXMachine.g:1151:1: rule__XMachine__Group_9__1 : rule__XMachine__Group_9__1__Impl ;
    public final void rule__XMachine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1155:1: ( rule__XMachine__Group_9__1__Impl )
            // InternalXMachine.g:1156:2: rule__XMachine__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_9__1"


    // $ANTLR start "rule__XMachine__Group_9__1__Impl"
    // InternalXMachine.g:1162:1: rule__XMachine__Group_9__1__Impl : ( ( ( rule__XMachine__EventsAssignment_9_1 ) ) ( ( rule__XMachine__EventsAssignment_9_1 )* ) ) ;
    public final void rule__XMachine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1166:1: ( ( ( ( rule__XMachine__EventsAssignment_9_1 ) ) ( ( rule__XMachine__EventsAssignment_9_1 )* ) ) )
            // InternalXMachine.g:1167:1: ( ( ( rule__XMachine__EventsAssignment_9_1 ) ) ( ( rule__XMachine__EventsAssignment_9_1 )* ) )
            {
            // InternalXMachine.g:1167:1: ( ( ( rule__XMachine__EventsAssignment_9_1 ) ) ( ( rule__XMachine__EventsAssignment_9_1 )* ) )
            // InternalXMachine.g:1168:2: ( ( rule__XMachine__EventsAssignment_9_1 ) ) ( ( rule__XMachine__EventsAssignment_9_1 )* )
            {
            // InternalXMachine.g:1168:2: ( ( rule__XMachine__EventsAssignment_9_1 ) )
            // InternalXMachine.g:1169:3: ( rule__XMachine__EventsAssignment_9_1 )
            {
             before(grammarAccess.getXMachineAccess().getEventsAssignment_9_1()); 
            // InternalXMachine.g:1170:3: ( rule__XMachine__EventsAssignment_9_1 )
            // InternalXMachine.g:1170:4: rule__XMachine__EventsAssignment_9_1
            {
            pushFollow(FOLLOW_8);
            rule__XMachine__EventsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getEventsAssignment_9_1()); 

            }

            // InternalXMachine.g:1173:2: ( ( rule__XMachine__EventsAssignment_9_1 )* )
            // InternalXMachine.g:1174:3: ( rule__XMachine__EventsAssignment_9_1 )*
            {
             before(grammarAccess.getXMachineAccess().getEventsAssignment_9_1()); 
            // InternalXMachine.g:1175:3: ( rule__XMachine__EventsAssignment_9_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ML_COMMENT && LA22_0<=RULE_ID)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXMachine.g:1175:4: rule__XMachine__EventsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XMachine__EventsAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getXMachineAccess().getEventsAssignment_9_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_9__1__Impl"


    // $ANTLR start "rule__XVariable__Group__0"
    // InternalXMachine.g:1185:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1189:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:1190:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__XVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__0"


    // $ANTLR start "rule__XVariable__Group__0__Impl"
    // InternalXMachine.g:1197:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1201:1: ( ( () ) )
            // InternalXMachine.g:1202:1: ( () )
            {
            // InternalXMachine.g:1202:1: ( () )
            // InternalXMachine.g:1203:2: ()
            {
             before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            // InternalXMachine.g:1204:2: ()
            // InternalXMachine.g:1204:3: 
            {
            }

             after(grammarAccess.getXVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__0__Impl"


    // $ANTLR start "rule__XVariable__Group__1"
    // InternalXMachine.g:1212:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl rule__XVariable__Group__2 ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1216:1: ( rule__XVariable__Group__1__Impl rule__XVariable__Group__2 )
            // InternalXMachine.g:1217:2: rule__XVariable__Group__1__Impl rule__XVariable__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__XVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__1"


    // $ANTLR start "rule__XVariable__Group__1__Impl"
    // InternalXMachine.g:1224:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__CommentAssignment_1 )? ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1228:1: ( ( ( rule__XVariable__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1229:1: ( ( rule__XVariable__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1229:1: ( ( rule__XVariable__CommentAssignment_1 )? )
            // InternalXMachine.g:1230:2: ( rule__XVariable__CommentAssignment_1 )?
            {
             before(grammarAccess.getXVariableAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1231:2: ( rule__XVariable__CommentAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ML_COMMENT && LA23_0<=RULE_SL_COMMENT)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:1231:3: rule__XVariable__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XVariable__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXVariableAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__1__Impl"


    // $ANTLR start "rule__XVariable__Group__2"
    // InternalXMachine.g:1239:1: rule__XVariable__Group__2 : rule__XVariable__Group__2__Impl ;
    public final void rule__XVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1243:1: ( rule__XVariable__Group__2__Impl )
            // InternalXMachine.g:1244:2: rule__XVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__2"


    // $ANTLR start "rule__XVariable__Group__2__Impl"
    // InternalXMachine.g:1250:1: rule__XVariable__Group__2__Impl : ( ( rule__XVariable__NameAssignment_2 ) ) ;
    public final void rule__XVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1254:1: ( ( ( rule__XVariable__NameAssignment_2 ) ) )
            // InternalXMachine.g:1255:1: ( ( rule__XVariable__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1255:1: ( ( rule__XVariable__NameAssignment_2 ) )
            // InternalXMachine.g:1256:2: ( rule__XVariable__NameAssignment_2 )
            {
             before(grammarAccess.getXVariableAccess().getNameAssignment_2()); 
            // InternalXMachine.g:1257:2: ( rule__XVariable__NameAssignment_2 )
            // InternalXMachine.g:1257:3: rule__XVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__2__Impl"


    // $ANTLR start "rule__XInvariant__Group__0"
    // InternalXMachine.g:1266:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1270:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:1271:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XInvariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__0"


    // $ANTLR start "rule__XInvariant__Group__0__Impl"
    // InternalXMachine.g:1278:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1282:1: ( ( () ) )
            // InternalXMachine.g:1283:1: ( () )
            {
            // InternalXMachine.g:1283:1: ( () )
            // InternalXMachine.g:1284:2: ()
            {
             before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            // InternalXMachine.g:1285:2: ()
            // InternalXMachine.g:1285:3: 
            {
            }

             after(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__0__Impl"


    // $ANTLR start "rule__XInvariant__Group__1"
    // InternalXMachine.g:1293:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1297:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:1298:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__XInvariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__1"


    // $ANTLR start "rule__XInvariant__Group__1__Impl"
    // InternalXMachine.g:1305:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__CommentAssignment_1 )? ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1309:1: ( ( ( rule__XInvariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1310:1: ( ( rule__XInvariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1310:1: ( ( rule__XInvariant__CommentAssignment_1 )? )
            // InternalXMachine.g:1311:2: ( rule__XInvariant__CommentAssignment_1 )?
            {
             before(grammarAccess.getXInvariantAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1312:2: ( rule__XInvariant__CommentAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ML_COMMENT && LA24_0<=RULE_SL_COMMENT)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:1312:3: rule__XInvariant__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariant__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXInvariantAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__1__Impl"


    // $ANTLR start "rule__XInvariant__Group__2"
    // InternalXMachine.g:1320:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1324:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:1325:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__XInvariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__2"


    // $ANTLR start "rule__XInvariant__Group__2__Impl"
    // InternalXMachine.g:1332:1: rule__XInvariant__Group__2__Impl : ( '@' ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1336:1: ( ( '@' ) )
            // InternalXMachine.g:1337:1: ( '@' )
            {
            // InternalXMachine.g:1337:1: ( '@' )
            // InternalXMachine.g:1338:2: '@'
            {
             before(grammarAccess.getXInvariantAccess().getCommercialAtKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getCommercialAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__2__Impl"


    // $ANTLR start "rule__XInvariant__Group__3"
    // InternalXMachine.g:1347:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl rule__XInvariant__Group__4 ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1351:1: ( rule__XInvariant__Group__3__Impl rule__XInvariant__Group__4 )
            // InternalXMachine.g:1352:2: rule__XInvariant__Group__3__Impl rule__XInvariant__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__XInvariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__3"


    // $ANTLR start "rule__XInvariant__Group__3__Impl"
    // InternalXMachine.g:1359:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__NameAssignment_3 ) ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1363:1: ( ( ( rule__XInvariant__NameAssignment_3 ) ) )
            // InternalXMachine.g:1364:1: ( ( rule__XInvariant__NameAssignment_3 ) )
            {
            // InternalXMachine.g:1364:1: ( ( rule__XInvariant__NameAssignment_3 ) )
            // InternalXMachine.g:1365:2: ( rule__XInvariant__NameAssignment_3 )
            {
             before(grammarAccess.getXInvariantAccess().getNameAssignment_3()); 
            // InternalXMachine.g:1366:2: ( rule__XInvariant__NameAssignment_3 )
            // InternalXMachine.g:1366:3: rule__XInvariant__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__3__Impl"


    // $ANTLR start "rule__XInvariant__Group__4"
    // InternalXMachine.g:1374:1: rule__XInvariant__Group__4 : rule__XInvariant__Group__4__Impl rule__XInvariant__Group__5 ;
    public final void rule__XInvariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1378:1: ( rule__XInvariant__Group__4__Impl rule__XInvariant__Group__5 )
            // InternalXMachine.g:1379:2: rule__XInvariant__Group__4__Impl rule__XInvariant__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__XInvariant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__4"


    // $ANTLR start "rule__XInvariant__Group__4__Impl"
    // InternalXMachine.g:1386:1: rule__XInvariant__Group__4__Impl : ( ( rule__XInvariant__PredicateAssignment_4 ) ) ;
    public final void rule__XInvariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1390:1: ( ( ( rule__XInvariant__PredicateAssignment_4 ) ) )
            // InternalXMachine.g:1391:1: ( ( rule__XInvariant__PredicateAssignment_4 ) )
            {
            // InternalXMachine.g:1391:1: ( ( rule__XInvariant__PredicateAssignment_4 ) )
            // InternalXMachine.g:1392:2: ( rule__XInvariant__PredicateAssignment_4 )
            {
             before(grammarAccess.getXInvariantAccess().getPredicateAssignment_4()); 
            // InternalXMachine.g:1393:2: ( rule__XInvariant__PredicateAssignment_4 )
            // InternalXMachine.g:1393:3: rule__XInvariant__PredicateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__4__Impl"


    // $ANTLR start "rule__XInvariant__Group__5"
    // InternalXMachine.g:1401:1: rule__XInvariant__Group__5 : rule__XInvariant__Group__5__Impl ;
    public final void rule__XInvariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1405:1: ( rule__XInvariant__Group__5__Impl )
            // InternalXMachine.g:1406:2: rule__XInvariant__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__5"


    // $ANTLR start "rule__XInvariant__Group__5__Impl"
    // InternalXMachine.g:1412:1: rule__XInvariant__Group__5__Impl : ( ( rule__XInvariant__TheoremAssignment_5 )? ) ;
    public final void rule__XInvariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1416:1: ( ( ( rule__XInvariant__TheoremAssignment_5 )? ) )
            // InternalXMachine.g:1417:1: ( ( rule__XInvariant__TheoremAssignment_5 )? )
            {
            // InternalXMachine.g:1417:1: ( ( rule__XInvariant__TheoremAssignment_5 )? )
            // InternalXMachine.g:1418:2: ( rule__XInvariant__TheoremAssignment_5 )?
            {
             before(grammarAccess.getXInvariantAccess().getTheoremAssignment_5()); 
            // InternalXMachine.g:1419:2: ( rule__XInvariant__TheoremAssignment_5 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:1419:3: rule__XInvariant__TheoremAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariant__TheoremAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXInvariantAccess().getTheoremAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__5__Impl"


    // $ANTLR start "rule__XVariant__Group__0"
    // InternalXMachine.g:1428:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1432:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:1433:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__XVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__0"


    // $ANTLR start "rule__XVariant__Group__0__Impl"
    // InternalXMachine.g:1440:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1444:1: ( ( () ) )
            // InternalXMachine.g:1445:1: ( () )
            {
            // InternalXMachine.g:1445:1: ( () )
            // InternalXMachine.g:1446:2: ()
            {
             before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            // InternalXMachine.g:1447:2: ()
            // InternalXMachine.g:1447:3: 
            {
            }

             after(grammarAccess.getXVariantAccess().getVariantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__0__Impl"


    // $ANTLR start "rule__XVariant__Group__1"
    // InternalXMachine.g:1455:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl rule__XVariant__Group__2 ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1459:1: ( rule__XVariant__Group__1__Impl rule__XVariant__Group__2 )
            // InternalXMachine.g:1460:2: rule__XVariant__Group__1__Impl rule__XVariant__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XVariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__1"


    // $ANTLR start "rule__XVariant__Group__1__Impl"
    // InternalXMachine.g:1467:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__CommentAssignment_1 )? ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1471:1: ( ( ( rule__XVariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1472:1: ( ( rule__XVariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1472:1: ( ( rule__XVariant__CommentAssignment_1 )? )
            // InternalXMachine.g:1473:2: ( rule__XVariant__CommentAssignment_1 )?
            {
             before(grammarAccess.getXVariantAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1474:2: ( rule__XVariant__CommentAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ML_COMMENT && LA26_0<=RULE_SL_COMMENT)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXMachine.g:1474:3: rule__XVariant__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XVariant__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXVariantAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__1__Impl"


    // $ANTLR start "rule__XVariant__Group__2"
    // InternalXMachine.g:1482:1: rule__XVariant__Group__2 : rule__XVariant__Group__2__Impl ;
    public final void rule__XVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1486:1: ( rule__XVariant__Group__2__Impl )
            // InternalXMachine.g:1487:2: rule__XVariant__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__2"


    // $ANTLR start "rule__XVariant__Group__2__Impl"
    // InternalXMachine.g:1493:1: rule__XVariant__Group__2__Impl : ( ( rule__XVariant__ExpressionAssignment_2 ) ) ;
    public final void rule__XVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1497:1: ( ( ( rule__XVariant__ExpressionAssignment_2 ) ) )
            // InternalXMachine.g:1498:1: ( ( rule__XVariant__ExpressionAssignment_2 ) )
            {
            // InternalXMachine.g:1498:1: ( ( rule__XVariant__ExpressionAssignment_2 ) )
            // InternalXMachine.g:1499:2: ( rule__XVariant__ExpressionAssignment_2 )
            {
             before(grammarAccess.getXVariantAccess().getExpressionAssignment_2()); 
            // InternalXMachine.g:1500:2: ( rule__XVariant__ExpressionAssignment_2 )
            // InternalXMachine.g:1500:3: rule__XVariant__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXVariantAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__2__Impl"


    // $ANTLR start "rule__XEvent__Group__0"
    // InternalXMachine.g:1509:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1513:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:1514:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__XEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__0"


    // $ANTLR start "rule__XEvent__Group__0__Impl"
    // InternalXMachine.g:1521:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1525:1: ( ( () ) )
            // InternalXMachine.g:1526:1: ( () )
            {
            // InternalXMachine.g:1526:1: ( () )
            // InternalXMachine.g:1527:2: ()
            {
             before(grammarAccess.getXEventAccess().getEventAction_0()); 
            // InternalXMachine.g:1528:2: ()
            // InternalXMachine.g:1528:3: 
            {
            }

             after(grammarAccess.getXEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__0__Impl"


    // $ANTLR start "rule__XEvent__Group__1"
    // InternalXMachine.g:1536:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1540:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:1541:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__XEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__1"


    // $ANTLR start "rule__XEvent__Group__1__Impl"
    // InternalXMachine.g:1548:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__CommentAssignment_1 )? ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1552:1: ( ( ( rule__XEvent__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1553:1: ( ( rule__XEvent__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1553:1: ( ( rule__XEvent__CommentAssignment_1 )? )
            // InternalXMachine.g:1554:2: ( rule__XEvent__CommentAssignment_1 )?
            {
             before(grammarAccess.getXEventAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1555:2: ( rule__XEvent__CommentAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ML_COMMENT && LA27_0<=RULE_SL_COMMENT)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:1555:3: rule__XEvent__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__1__Impl"


    // $ANTLR start "rule__XEvent__Group__2"
    // InternalXMachine.g:1563:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1567:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:1568:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__XEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__2"


    // $ANTLR start "rule__XEvent__Group__2__Impl"
    // InternalXMachine.g:1575:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__NameAssignment_2 ) ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1579:1: ( ( ( rule__XEvent__NameAssignment_2 ) ) )
            // InternalXMachine.g:1580:1: ( ( rule__XEvent__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1580:1: ( ( rule__XEvent__NameAssignment_2 ) )
            // InternalXMachine.g:1581:2: ( rule__XEvent__NameAssignment_2 )
            {
             before(grammarAccess.getXEventAccess().getNameAssignment_2()); 
            // InternalXMachine.g:1582:2: ( rule__XEvent__NameAssignment_2 )
            // InternalXMachine.g:1582:3: rule__XEvent__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__2__Impl"


    // $ANTLR start "rule__XEvent__Group__3"
    // InternalXMachine.g:1590:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1594:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:1595:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__XEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__3"


    // $ANTLR start "rule__XEvent__Group__3__Impl"
    // InternalXMachine.g:1602:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__ExtendedAssignment_3 )? ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1606:1: ( ( ( rule__XEvent__ExtendedAssignment_3 )? ) )
            // InternalXMachine.g:1607:1: ( ( rule__XEvent__ExtendedAssignment_3 )? )
            {
            // InternalXMachine.g:1607:1: ( ( rule__XEvent__ExtendedAssignment_3 )? )
            // InternalXMachine.g:1608:2: ( rule__XEvent__ExtendedAssignment_3 )?
            {
             before(grammarAccess.getXEventAccess().getExtendedAssignment_3()); 
            // InternalXMachine.g:1609:2: ( rule__XEvent__ExtendedAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:1609:3: rule__XEvent__ExtendedAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ExtendedAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getExtendedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__3__Impl"


    // $ANTLR start "rule__XEvent__Group__4"
    // InternalXMachine.g:1617:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1621:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:1622:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__XEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__4"


    // $ANTLR start "rule__XEvent__Group__4__Impl"
    // InternalXMachine.g:1629:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__ConvergenceAssignment_4 ) ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1633:1: ( ( ( rule__XEvent__ConvergenceAssignment_4 ) ) )
            // InternalXMachine.g:1634:1: ( ( rule__XEvent__ConvergenceAssignment_4 ) )
            {
            // InternalXMachine.g:1634:1: ( ( rule__XEvent__ConvergenceAssignment_4 ) )
            // InternalXMachine.g:1635:2: ( rule__XEvent__ConvergenceAssignment_4 )
            {
             before(grammarAccess.getXEventAccess().getConvergenceAssignment_4()); 
            // InternalXMachine.g:1636:2: ( rule__XEvent__ConvergenceAssignment_4 )
            // InternalXMachine.g:1636:3: rule__XEvent__ConvergenceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__ConvergenceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getConvergenceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__4__Impl"


    // $ANTLR start "rule__XEvent__Group__5"
    // InternalXMachine.g:1644:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1648:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:1649:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__XEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__5"


    // $ANTLR start "rule__XEvent__Group__5__Impl"
    // InternalXMachine.g:1656:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Group_5__0 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1660:1: ( ( ( rule__XEvent__Group_5__0 )? ) )
            // InternalXMachine.g:1661:1: ( ( rule__XEvent__Group_5__0 )? )
            {
            // InternalXMachine.g:1661:1: ( ( rule__XEvent__Group_5__0 )? )
            // InternalXMachine.g:1662:2: ( rule__XEvent__Group_5__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5()); 
            // InternalXMachine.g:1663:2: ( rule__XEvent__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==16) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXMachine.g:1663:3: rule__XEvent__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__5__Impl"


    // $ANTLR start "rule__XEvent__Group__6"
    // InternalXMachine.g:1671:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1675:1: ( rule__XEvent__Group__6__Impl )
            // InternalXMachine.g:1676:2: rule__XEvent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__6"


    // $ANTLR start "rule__XEvent__Group__6__Impl"
    // InternalXMachine.g:1682:1: rule__XEvent__Group__6__Impl : ( ( rule__XEvent__Alternatives_6 )? ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1686:1: ( ( ( rule__XEvent__Alternatives_6 )? ) )
            // InternalXMachine.g:1687:1: ( ( rule__XEvent__Alternatives_6 )? )
            {
            // InternalXMachine.g:1687:1: ( ( rule__XEvent__Alternatives_6 )? )
            // InternalXMachine.g:1688:2: ( rule__XEvent__Alternatives_6 )?
            {
             before(grammarAccess.getXEventAccess().getAlternatives_6()); 
            // InternalXMachine.g:1689:2: ( rule__XEvent__Alternatives_6 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=23 && LA30_0<=25)||LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:1689:3: rule__XEvent__Alternatives_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Alternatives_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__6__Impl"


    // $ANTLR start "rule__XEvent__Group_5__0"
    // InternalXMachine.g:1698:1: rule__XEvent__Group_5__0 : rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 ;
    public final void rule__XEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1702:1: ( rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 )
            // InternalXMachine.g:1703:2: rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__XEvent__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__0"


    // $ANTLR start "rule__XEvent__Group_5__0__Impl"
    // InternalXMachine.g:1710:1: rule__XEvent__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1714:1: ( ( 'refines' ) )
            // InternalXMachine.g:1715:1: ( 'refines' )
            {
            // InternalXMachine.g:1715:1: ( 'refines' )
            // InternalXMachine.g:1716:2: 'refines'
            {
             before(grammarAccess.getXEventAccess().getRefinesKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getRefinesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5__1"
    // InternalXMachine.g:1725:1: rule__XEvent__Group_5__1 : rule__XEvent__Group_5__1__Impl ;
    public final void rule__XEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1729:1: ( rule__XEvent__Group_5__1__Impl )
            // InternalXMachine.g:1730:2: rule__XEvent__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__1"


    // $ANTLR start "rule__XEvent__Group_5__1__Impl"
    // InternalXMachine.g:1736:1: rule__XEvent__Group_5__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1740:1: ( ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) ) )
            // InternalXMachine.g:1741:1: ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:1741:1: ( ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* ) )
            // InternalXMachine.g:1742:2: ( ( rule__XEvent__RefinesAssignment_5_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_1 )* )
            {
            // InternalXMachine.g:1742:2: ( ( rule__XEvent__RefinesAssignment_5_1 ) )
            // InternalXMachine.g:1743:3: ( rule__XEvent__RefinesAssignment_5_1 )
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 
            // InternalXMachine.g:1744:3: ( rule__XEvent__RefinesAssignment_5_1 )
            // InternalXMachine.g:1744:4: rule__XEvent__RefinesAssignment_5_1
            {
            pushFollow(FOLLOW_6);
            rule__XEvent__RefinesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 

            }

            // InternalXMachine.g:1747:2: ( ( rule__XEvent__RefinesAssignment_5_1 )* )
            // InternalXMachine.g:1748:3: ( rule__XEvent__RefinesAssignment_5_1 )*
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 
            // InternalXMachine.g:1749:3: ( rule__XEvent__RefinesAssignment_5_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==EOF||(LA31_2>=RULE_ML_COMMENT && LA31_2<=RULE_ID)||LA31_2==15||(LA31_2>=23 && LA31_2<=25)||LA31_2==27) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalXMachine.g:1749:4: rule__XEvent__RefinesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__XEvent__RefinesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getRefinesAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0__0"
    // InternalXMachine.g:1759:1: rule__XEvent__Group_6_0__0 : rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1 ;
    public final void rule__XEvent__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1763:1: ( rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1 )
            // InternalXMachine.g:1764:2: rule__XEvent__Group_6_0__0__Impl rule__XEvent__Group_6_0__1
            {
            pushFollow(FOLLOW_16);
            rule__XEvent__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__0"


    // $ANTLR start "rule__XEvent__Group_6_0__0__Impl"
    // InternalXMachine.g:1771:1: rule__XEvent__Group_6_0__0__Impl : ( ( rule__XEvent__Group_6_0_0__0 )? ) ;
    public final void rule__XEvent__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1775:1: ( ( ( rule__XEvent__Group_6_0_0__0 )? ) )
            // InternalXMachine.g:1776:1: ( ( rule__XEvent__Group_6_0_0__0 )? )
            {
            // InternalXMachine.g:1776:1: ( ( rule__XEvent__Group_6_0_0__0 )? )
            // InternalXMachine.g:1777:2: ( rule__XEvent__Group_6_0_0__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_6_0_0()); 
            // InternalXMachine.g:1778:2: ( rule__XEvent__Group_6_0_0__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXMachine.g:1778:3: rule__XEvent__Group_6_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0__1"
    // InternalXMachine.g:1786:1: rule__XEvent__Group_6_0__1 : rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2 ;
    public final void rule__XEvent__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1790:1: ( rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2 )
            // InternalXMachine.g:1791:2: rule__XEvent__Group_6_0__1__Impl rule__XEvent__Group_6_0__2
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__1"


    // $ANTLR start "rule__XEvent__Group_6_0__1__Impl"
    // InternalXMachine.g:1798:1: rule__XEvent__Group_6_0__1__Impl : ( 'begin' ) ;
    public final void rule__XEvent__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1802:1: ( ( 'begin' ) )
            // InternalXMachine.g:1803:1: ( 'begin' )
            {
            // InternalXMachine.g:1803:1: ( 'begin' )
            // InternalXMachine.g:1804:2: 'begin'
            {
             before(grammarAccess.getXEventAccess().getBeginKeyword_6_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getBeginKeyword_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0__2"
    // InternalXMachine.g:1813:1: rule__XEvent__Group_6_0__2 : rule__XEvent__Group_6_0__2__Impl rule__XEvent__Group_6_0__3 ;
    public final void rule__XEvent__Group_6_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1817:1: ( rule__XEvent__Group_6_0__2__Impl rule__XEvent__Group_6_0__3 )
            // InternalXMachine.g:1818:2: rule__XEvent__Group_6_0__2__Impl rule__XEvent__Group_6_0__3
            {
            pushFollow(FOLLOW_17);
            rule__XEvent__Group_6_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__2"


    // $ANTLR start "rule__XEvent__Group_6_0__2__Impl"
    // InternalXMachine.g:1825:1: rule__XEvent__Group_6_0__2__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) ) ;
    public final void rule__XEvent__Group_6_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1829:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) ) )
            // InternalXMachine.g:1830:1: ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) )
            {
            // InternalXMachine.g:1830:1: ( ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* ) )
            // InternalXMachine.g:1831:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_6_0_2 )* )
            {
            // InternalXMachine.g:1831:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 ) )
            // InternalXMachine.g:1832:3: ( rule__XEvent__ActionsAssignment_6_0_2 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 
            // InternalXMachine.g:1833:3: ( rule__XEvent__ActionsAssignment_6_0_2 )
            // InternalXMachine.g:1833:4: rule__XEvent__ActionsAssignment_6_0_2
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_6_0_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 

            }

            // InternalXMachine.g:1836:2: ( ( rule__XEvent__ActionsAssignment_6_0_2 )* )
            // InternalXMachine.g:1837:3: ( rule__XEvent__ActionsAssignment_6_0_2 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 
            // InternalXMachine.g:1838:3: ( rule__XEvent__ActionsAssignment_6_0_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ML_COMMENT && LA33_0<=RULE_SL_COMMENT)||LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXMachine.g:1838:4: rule__XEvent__ActionsAssignment_6_0_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_6_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_0_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__2__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0__3"
    // InternalXMachine.g:1847:1: rule__XEvent__Group_6_0__3 : rule__XEvent__Group_6_0__3__Impl ;
    public final void rule__XEvent__Group_6_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1851:1: ( rule__XEvent__Group_6_0__3__Impl )
            // InternalXMachine.g:1852:2: rule__XEvent__Group_6_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__3"


    // $ANTLR start "rule__XEvent__Group_6_0__3__Impl"
    // InternalXMachine.g:1858:1: rule__XEvent__Group_6_0__3__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group_6_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1862:1: ( ( 'end' ) )
            // InternalXMachine.g:1863:1: ( 'end' )
            {
            // InternalXMachine.g:1863:1: ( 'end' )
            // InternalXMachine.g:1864:2: 'end'
            {
             before(grammarAccess.getXEventAccess().getEndKeyword_6_0_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEndKeyword_6_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0__3__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0_0__0"
    // InternalXMachine.g:1874:1: rule__XEvent__Group_6_0_0__0 : rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1 ;
    public final void rule__XEvent__Group_6_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1878:1: ( rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1 )
            // InternalXMachine.g:1879:2: rule__XEvent__Group_6_0_0__0__Impl rule__XEvent__Group_6_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0_0__0"


    // $ANTLR start "rule__XEvent__Group_6_0_0__0__Impl"
    // InternalXMachine.g:1886:1: rule__XEvent__Group_6_0_0__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1890:1: ( ( 'with' ) )
            // InternalXMachine.g:1891:1: ( 'with' )
            {
            // InternalXMachine.g:1891:1: ( 'with' )
            // InternalXMachine.g:1892:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_6_0_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_0_0__1"
    // InternalXMachine.g:1901:1: rule__XEvent__Group_6_0_0__1 : rule__XEvent__Group_6_0_0__1__Impl ;
    public final void rule__XEvent__Group_6_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1905:1: ( rule__XEvent__Group_6_0_0__1__Impl )
            // InternalXMachine.g:1906:2: rule__XEvent__Group_6_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0_0__1"


    // $ANTLR start "rule__XEvent__Group_6_0_0__1__Impl"
    // InternalXMachine.g:1912:1: rule__XEvent__Group_6_0_0__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) ) ;
    public final void rule__XEvent__Group_6_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1916:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) ) )
            // InternalXMachine.g:1917:1: ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) )
            {
            // InternalXMachine.g:1917:1: ( ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* ) )
            // InternalXMachine.g:1918:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* )
            {
            // InternalXMachine.g:1918:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 ) )
            // InternalXMachine.g:1919:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 
            // InternalXMachine.g:1920:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )
            // InternalXMachine.g:1920:4: rule__XEvent__WitnessesAssignment_6_0_0_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_6_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 

            }

            // InternalXMachine.g:1923:2: ( ( rule__XEvent__WitnessesAssignment_6_0_0_1 )* )
            // InternalXMachine.g:1924:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 
            // InternalXMachine.g:1925:3: ( rule__XEvent__WitnessesAssignment_6_0_0_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ML_COMMENT && LA34_0<=RULE_SL_COMMENT)||LA34_0==22) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXMachine.g:1925:4: rule__XEvent__WitnessesAssignment_6_0_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_6_0_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_0_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_0_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1__0"
    // InternalXMachine.g:1935:1: rule__XEvent__Group_6_1__0 : rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1 ;
    public final void rule__XEvent__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1939:1: ( rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1 )
            // InternalXMachine.g:1940:2: rule__XEvent__Group_6_1__0__Impl rule__XEvent__Group_6_1__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__0"


    // $ANTLR start "rule__XEvent__Group_6_1__0__Impl"
    // InternalXMachine.g:1947:1: rule__XEvent__Group_6_1__0__Impl : ( 'when' ) ;
    public final void rule__XEvent__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1951:1: ( ( 'when' ) )
            // InternalXMachine.g:1952:1: ( 'when' )
            {
            // InternalXMachine.g:1952:1: ( 'when' )
            // InternalXMachine.g:1953:2: 'when'
            {
             before(grammarAccess.getXEventAccess().getWhenKeyword_6_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWhenKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1__1"
    // InternalXMachine.g:1962:1: rule__XEvent__Group_6_1__1 : rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2 ;
    public final void rule__XEvent__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1966:1: ( rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2 )
            // InternalXMachine.g:1967:2: rule__XEvent__Group_6_1__1__Impl rule__XEvent__Group_6_1__2
            {
            pushFollow(FOLLOW_18);
            rule__XEvent__Group_6_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__1"


    // $ANTLR start "rule__XEvent__Group_6_1__1__Impl"
    // InternalXMachine.g:1974:1: rule__XEvent__Group_6_1__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1978:1: ( ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) ) )
            // InternalXMachine.g:1979:1: ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) )
            {
            // InternalXMachine.g:1979:1: ( ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* ) )
            // InternalXMachine.g:1980:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_6_1_1 )* )
            {
            // InternalXMachine.g:1980:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 ) )
            // InternalXMachine.g:1981:3: ( rule__XEvent__GuardsAssignment_6_1_1 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 
            // InternalXMachine.g:1982:3: ( rule__XEvent__GuardsAssignment_6_1_1 )
            // InternalXMachine.g:1982:4: rule__XEvent__GuardsAssignment_6_1_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 

            }

            // InternalXMachine.g:1985:2: ( ( rule__XEvent__GuardsAssignment_6_1_1 )* )
            // InternalXMachine.g:1986:3: ( rule__XEvent__GuardsAssignment_6_1_1 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 
            // InternalXMachine.g:1987:3: ( rule__XEvent__GuardsAssignment_6_1_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_ML_COMMENT && LA35_0<=RULE_SL_COMMENT)||LA35_0==22) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXMachine.g:1987:4: rule__XEvent__GuardsAssignment_6_1_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_6_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getGuardsAssignment_6_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1__2"
    // InternalXMachine.g:1996:1: rule__XEvent__Group_6_1__2 : rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3 ;
    public final void rule__XEvent__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2000:1: ( rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3 )
            // InternalXMachine.g:2001:2: rule__XEvent__Group_6_1__2__Impl rule__XEvent__Group_6_1__3
            {
            pushFollow(FOLLOW_18);
            rule__XEvent__Group_6_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__2"


    // $ANTLR start "rule__XEvent__Group_6_1__2__Impl"
    // InternalXMachine.g:2008:1: rule__XEvent__Group_6_1__2__Impl : ( ( rule__XEvent__Group_6_1_2__0 )? ) ;
    public final void rule__XEvent__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2012:1: ( ( ( rule__XEvent__Group_6_1_2__0 )? ) )
            // InternalXMachine.g:2013:1: ( ( rule__XEvent__Group_6_1_2__0 )? )
            {
            // InternalXMachine.g:2013:1: ( ( rule__XEvent__Group_6_1_2__0 )? )
            // InternalXMachine.g:2014:2: ( rule__XEvent__Group_6_1_2__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_6_1_2()); 
            // InternalXMachine.g:2015:2: ( rule__XEvent__Group_6_1_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXMachine.g:2015:3: rule__XEvent__Group_6_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_6_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__2__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1__3"
    // InternalXMachine.g:2023:1: rule__XEvent__Group_6_1__3 : rule__XEvent__Group_6_1__3__Impl rule__XEvent__Group_6_1__4 ;
    public final void rule__XEvent__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2027:1: ( rule__XEvent__Group_6_1__3__Impl rule__XEvent__Group_6_1__4 )
            // InternalXMachine.g:2028:2: rule__XEvent__Group_6_1__3__Impl rule__XEvent__Group_6_1__4
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__3"


    // $ANTLR start "rule__XEvent__Group_6_1__3__Impl"
    // InternalXMachine.g:2035:1: rule__XEvent__Group_6_1__3__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2039:1: ( ( 'then' ) )
            // InternalXMachine.g:2040:1: ( 'then' )
            {
            // InternalXMachine.g:2040:1: ( 'then' )
            // InternalXMachine.g:2041:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_6_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getThenKeyword_6_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__3__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1__4"
    // InternalXMachine.g:2050:1: rule__XEvent__Group_6_1__4 : rule__XEvent__Group_6_1__4__Impl rule__XEvent__Group_6_1__5 ;
    public final void rule__XEvent__Group_6_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2054:1: ( rule__XEvent__Group_6_1__4__Impl rule__XEvent__Group_6_1__5 )
            // InternalXMachine.g:2055:2: rule__XEvent__Group_6_1__4__Impl rule__XEvent__Group_6_1__5
            {
            pushFollow(FOLLOW_17);
            rule__XEvent__Group_6_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__4"


    // $ANTLR start "rule__XEvent__Group_6_1__4__Impl"
    // InternalXMachine.g:2062:1: rule__XEvent__Group_6_1__4__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_1_4 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_4 )* ) ) ;
    public final void rule__XEvent__Group_6_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2066:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_1_4 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_4 )* ) ) )
            // InternalXMachine.g:2067:1: ( ( ( rule__XEvent__ActionsAssignment_6_1_4 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_4 )* ) )
            {
            // InternalXMachine.g:2067:1: ( ( ( rule__XEvent__ActionsAssignment_6_1_4 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_4 )* ) )
            // InternalXMachine.g:2068:2: ( ( rule__XEvent__ActionsAssignment_6_1_4 ) ) ( ( rule__XEvent__ActionsAssignment_6_1_4 )* )
            {
            // InternalXMachine.g:2068:2: ( ( rule__XEvent__ActionsAssignment_6_1_4 ) )
            // InternalXMachine.g:2069:3: ( rule__XEvent__ActionsAssignment_6_1_4 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_1_4()); 
            // InternalXMachine.g:2070:3: ( rule__XEvent__ActionsAssignment_6_1_4 )
            // InternalXMachine.g:2070:4: rule__XEvent__ActionsAssignment_6_1_4
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_6_1_4();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_1_4()); 

            }

            // InternalXMachine.g:2073:2: ( ( rule__XEvent__ActionsAssignment_6_1_4 )* )
            // InternalXMachine.g:2074:3: ( rule__XEvent__ActionsAssignment_6_1_4 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_1_4()); 
            // InternalXMachine.g:2075:3: ( rule__XEvent__ActionsAssignment_6_1_4 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_ML_COMMENT && LA37_0<=RULE_SL_COMMENT)||LA37_0==22) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXMachine.g:2075:4: rule__XEvent__ActionsAssignment_6_1_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_6_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_1_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__4__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1__5"
    // InternalXMachine.g:2084:1: rule__XEvent__Group_6_1__5 : rule__XEvent__Group_6_1__5__Impl ;
    public final void rule__XEvent__Group_6_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2088:1: ( rule__XEvent__Group_6_1__5__Impl )
            // InternalXMachine.g:2089:2: rule__XEvent__Group_6_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__5"


    // $ANTLR start "rule__XEvent__Group_6_1__5__Impl"
    // InternalXMachine.g:2095:1: rule__XEvent__Group_6_1__5__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group_6_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2099:1: ( ( 'end' ) )
            // InternalXMachine.g:2100:1: ( 'end' )
            {
            // InternalXMachine.g:2100:1: ( 'end' )
            // InternalXMachine.g:2101:2: 'end'
            {
             before(grammarAccess.getXEventAccess().getEndKeyword_6_1_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEndKeyword_6_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1__5__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1_2__0"
    // InternalXMachine.g:2111:1: rule__XEvent__Group_6_1_2__0 : rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1 ;
    public final void rule__XEvent__Group_6_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2115:1: ( rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1 )
            // InternalXMachine.g:2116:2: rule__XEvent__Group_6_1_2__0__Impl rule__XEvent__Group_6_1_2__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_2__0"


    // $ANTLR start "rule__XEvent__Group_6_1_2__0__Impl"
    // InternalXMachine.g:2123:1: rule__XEvent__Group_6_1_2__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2127:1: ( ( 'with' ) )
            // InternalXMachine.g:2128:1: ( 'with' )
            {
            // InternalXMachine.g:2128:1: ( 'with' )
            // InternalXMachine.g:2129:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_6_1_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_6_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_2__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_1_2__1"
    // InternalXMachine.g:2138:1: rule__XEvent__Group_6_1_2__1 : rule__XEvent__Group_6_1_2__1__Impl ;
    public final void rule__XEvent__Group_6_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2142:1: ( rule__XEvent__Group_6_1_2__1__Impl )
            // InternalXMachine.g:2143:2: rule__XEvent__Group_6_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_2__1"


    // $ANTLR start "rule__XEvent__Group_6_1_2__1__Impl"
    // InternalXMachine.g:2149:1: rule__XEvent__Group_6_1_2__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) ) ;
    public final void rule__XEvent__Group_6_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2153:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) ) )
            // InternalXMachine.g:2154:1: ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) )
            {
            // InternalXMachine.g:2154:1: ( ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* ) )
            // InternalXMachine.g:2155:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* )
            {
            // InternalXMachine.g:2155:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 ) )
            // InternalXMachine.g:2156:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 
            // InternalXMachine.g:2157:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )
            // InternalXMachine.g:2157:4: rule__XEvent__WitnessesAssignment_6_1_2_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_6_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 

            }

            // InternalXMachine.g:2160:2: ( ( rule__XEvent__WitnessesAssignment_6_1_2_1 )* )
            // InternalXMachine.g:2161:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 
            // InternalXMachine.g:2162:3: ( rule__XEvent__WitnessesAssignment_6_1_2_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_ML_COMMENT && LA38_0<=RULE_SL_COMMENT)||LA38_0==22) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalXMachine.g:2162:4: rule__XEvent__WitnessesAssignment_6_1_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_6_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_1_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_1_2__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__0"
    // InternalXMachine.g:2172:1: rule__XEvent__Group_6_2__0 : rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1 ;
    public final void rule__XEvent__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2176:1: ( rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1 )
            // InternalXMachine.g:2177:2: rule__XEvent__Group_6_2__0__Impl rule__XEvent__Group_6_2__1
            {
            pushFollow(FOLLOW_7);
            rule__XEvent__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__0"


    // $ANTLR start "rule__XEvent__Group_6_2__0__Impl"
    // InternalXMachine.g:2184:1: rule__XEvent__Group_6_2__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2188:1: ( ( 'any' ) )
            // InternalXMachine.g:2189:1: ( 'any' )
            {
            // InternalXMachine.g:2189:1: ( 'any' )
            // InternalXMachine.g:2190:2: 'any'
            {
             before(grammarAccess.getXEventAccess().getAnyKeyword_6_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getAnyKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__1"
    // InternalXMachine.g:2199:1: rule__XEvent__Group_6_2__1 : rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2 ;
    public final void rule__XEvent__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2203:1: ( rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2 )
            // InternalXMachine.g:2204:2: rule__XEvent__Group_6_2__1__Impl rule__XEvent__Group_6_2__2
            {
            pushFollow(FOLLOW_19);
            rule__XEvent__Group_6_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__1"


    // $ANTLR start "rule__XEvent__Group_6_2__1__Impl"
    // InternalXMachine.g:2211:1: rule__XEvent__Group_6_2__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2215:1: ( ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) ) )
            // InternalXMachine.g:2216:1: ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) )
            {
            // InternalXMachine.g:2216:1: ( ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* ) )
            // InternalXMachine.g:2217:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_6_2_1 )* )
            {
            // InternalXMachine.g:2217:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 ) )
            // InternalXMachine.g:2218:3: ( rule__XEvent__ParametersAssignment_6_2_1 )
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 
            // InternalXMachine.g:2219:3: ( rule__XEvent__ParametersAssignment_6_2_1 )
            // InternalXMachine.g:2219:4: rule__XEvent__ParametersAssignment_6_2_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__ParametersAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 

            }

            // InternalXMachine.g:2222:2: ( ( rule__XEvent__ParametersAssignment_6_2_1 )* )
            // InternalXMachine.g:2223:3: ( rule__XEvent__ParametersAssignment_6_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 
            // InternalXMachine.g:2224:3: ( rule__XEvent__ParametersAssignment_6_2_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_ML_COMMENT && LA39_0<=RULE_ID)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:2224:4: rule__XEvent__ParametersAssignment_6_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__ParametersAssignment_6_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getParametersAssignment_6_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__2"
    // InternalXMachine.g:2233:1: rule__XEvent__Group_6_2__2 : rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3 ;
    public final void rule__XEvent__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2237:1: ( rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3 )
            // InternalXMachine.g:2238:2: rule__XEvent__Group_6_2__2__Impl rule__XEvent__Group_6_2__3
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__2"


    // $ANTLR start "rule__XEvent__Group_6_2__2__Impl"
    // InternalXMachine.g:2245:1: rule__XEvent__Group_6_2__2__Impl : ( 'where' ) ;
    public final void rule__XEvent__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2249:1: ( ( 'where' ) )
            // InternalXMachine.g:2250:1: ( 'where' )
            {
            // InternalXMachine.g:2250:1: ( 'where' )
            // InternalXMachine.g:2251:2: 'where'
            {
             before(grammarAccess.getXEventAccess().getWhereKeyword_6_2_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWhereKeyword_6_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__2__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__3"
    // InternalXMachine.g:2260:1: rule__XEvent__Group_6_2__3 : rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4 ;
    public final void rule__XEvent__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2264:1: ( rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4 )
            // InternalXMachine.g:2265:2: rule__XEvent__Group_6_2__3__Impl rule__XEvent__Group_6_2__4
            {
            pushFollow(FOLLOW_18);
            rule__XEvent__Group_6_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__3"


    // $ANTLR start "rule__XEvent__Group_6_2__3__Impl"
    // InternalXMachine.g:2272:1: rule__XEvent__Group_6_2__3__Impl : ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) ) ;
    public final void rule__XEvent__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2276:1: ( ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) ) )
            // InternalXMachine.g:2277:1: ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) )
            {
            // InternalXMachine.g:2277:1: ( ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* ) )
            // InternalXMachine.g:2278:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_6_2_3 )* )
            {
            // InternalXMachine.g:2278:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 ) )
            // InternalXMachine.g:2279:3: ( rule__XEvent__GuardsAssignment_6_2_3 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 
            // InternalXMachine.g:2280:3: ( rule__XEvent__GuardsAssignment_6_2_3 )
            // InternalXMachine.g:2280:4: rule__XEvent__GuardsAssignment_6_2_3
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_6_2_3();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 

            }

            // InternalXMachine.g:2283:2: ( ( rule__XEvent__GuardsAssignment_6_2_3 )* )
            // InternalXMachine.g:2284:3: ( rule__XEvent__GuardsAssignment_6_2_3 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 
            // InternalXMachine.g:2285:3: ( rule__XEvent__GuardsAssignment_6_2_3 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_ML_COMMENT && LA40_0<=RULE_SL_COMMENT)||LA40_0==22) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalXMachine.g:2285:4: rule__XEvent__GuardsAssignment_6_2_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_6_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getGuardsAssignment_6_2_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__3__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__4"
    // InternalXMachine.g:2294:1: rule__XEvent__Group_6_2__4 : rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5 ;
    public final void rule__XEvent__Group_6_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2298:1: ( rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5 )
            // InternalXMachine.g:2299:2: rule__XEvent__Group_6_2__4__Impl rule__XEvent__Group_6_2__5
            {
            pushFollow(FOLLOW_18);
            rule__XEvent__Group_6_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__4"


    // $ANTLR start "rule__XEvent__Group_6_2__4__Impl"
    // InternalXMachine.g:2306:1: rule__XEvent__Group_6_2__4__Impl : ( ( rule__XEvent__Group_6_2_4__0 )? ) ;
    public final void rule__XEvent__Group_6_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2310:1: ( ( ( rule__XEvent__Group_6_2_4__0 )? ) )
            // InternalXMachine.g:2311:1: ( ( rule__XEvent__Group_6_2_4__0 )? )
            {
            // InternalXMachine.g:2311:1: ( ( rule__XEvent__Group_6_2_4__0 )? )
            // InternalXMachine.g:2312:2: ( rule__XEvent__Group_6_2_4__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_6_2_4()); 
            // InternalXMachine.g:2313:2: ( rule__XEvent__Group_6_2_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:2313:3: rule__XEvent__Group_6_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_6_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__4__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__5"
    // InternalXMachine.g:2321:1: rule__XEvent__Group_6_2__5 : rule__XEvent__Group_6_2__5__Impl rule__XEvent__Group_6_2__6 ;
    public final void rule__XEvent__Group_6_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2325:1: ( rule__XEvent__Group_6_2__5__Impl rule__XEvent__Group_6_2__6 )
            // InternalXMachine.g:2326:2: rule__XEvent__Group_6_2__5__Impl rule__XEvent__Group_6_2__6
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__5"


    // $ANTLR start "rule__XEvent__Group_6_2__5__Impl"
    // InternalXMachine.g:2333:1: rule__XEvent__Group_6_2__5__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_6_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2337:1: ( ( 'then' ) )
            // InternalXMachine.g:2338:1: ( 'then' )
            {
            // InternalXMachine.g:2338:1: ( 'then' )
            // InternalXMachine.g:2339:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_6_2_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getThenKeyword_6_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__5__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__6"
    // InternalXMachine.g:2348:1: rule__XEvent__Group_6_2__6 : rule__XEvent__Group_6_2__6__Impl rule__XEvent__Group_6_2__7 ;
    public final void rule__XEvent__Group_6_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2352:1: ( rule__XEvent__Group_6_2__6__Impl rule__XEvent__Group_6_2__7 )
            // InternalXMachine.g:2353:2: rule__XEvent__Group_6_2__6__Impl rule__XEvent__Group_6_2__7
            {
            pushFollow(FOLLOW_17);
            rule__XEvent__Group_6_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__6"


    // $ANTLR start "rule__XEvent__Group_6_2__6__Impl"
    // InternalXMachine.g:2360:1: rule__XEvent__Group_6_2__6__Impl : ( ( ( rule__XEvent__ActionsAssignment_6_2_6 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_6 )* ) ) ;
    public final void rule__XEvent__Group_6_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2364:1: ( ( ( ( rule__XEvent__ActionsAssignment_6_2_6 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_6 )* ) ) )
            // InternalXMachine.g:2365:1: ( ( ( rule__XEvent__ActionsAssignment_6_2_6 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_6 )* ) )
            {
            // InternalXMachine.g:2365:1: ( ( ( rule__XEvent__ActionsAssignment_6_2_6 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_6 )* ) )
            // InternalXMachine.g:2366:2: ( ( rule__XEvent__ActionsAssignment_6_2_6 ) ) ( ( rule__XEvent__ActionsAssignment_6_2_6 )* )
            {
            // InternalXMachine.g:2366:2: ( ( rule__XEvent__ActionsAssignment_6_2_6 ) )
            // InternalXMachine.g:2367:3: ( rule__XEvent__ActionsAssignment_6_2_6 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_2_6()); 
            // InternalXMachine.g:2368:3: ( rule__XEvent__ActionsAssignment_6_2_6 )
            // InternalXMachine.g:2368:4: rule__XEvent__ActionsAssignment_6_2_6
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_6_2_6();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_2_6()); 

            }

            // InternalXMachine.g:2371:2: ( ( rule__XEvent__ActionsAssignment_6_2_6 )* )
            // InternalXMachine.g:2372:3: ( rule__XEvent__ActionsAssignment_6_2_6 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_6_2_6()); 
            // InternalXMachine.g:2373:3: ( rule__XEvent__ActionsAssignment_6_2_6 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ML_COMMENT && LA42_0<=RULE_SL_COMMENT)||LA42_0==22) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalXMachine.g:2373:4: rule__XEvent__ActionsAssignment_6_2_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_6_2_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_6_2_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__6__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2__7"
    // InternalXMachine.g:2382:1: rule__XEvent__Group_6_2__7 : rule__XEvent__Group_6_2__7__Impl ;
    public final void rule__XEvent__Group_6_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2386:1: ( rule__XEvent__Group_6_2__7__Impl )
            // InternalXMachine.g:2387:2: rule__XEvent__Group_6_2__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__7"


    // $ANTLR start "rule__XEvent__Group_6_2__7__Impl"
    // InternalXMachine.g:2393:1: rule__XEvent__Group_6_2__7__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group_6_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2397:1: ( ( 'end' ) )
            // InternalXMachine.g:2398:1: ( 'end' )
            {
            // InternalXMachine.g:2398:1: ( 'end' )
            // InternalXMachine.g:2399:2: 'end'
            {
             before(grammarAccess.getXEventAccess().getEndKeyword_6_2_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEndKeyword_6_2_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2__7__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2_4__0"
    // InternalXMachine.g:2409:1: rule__XEvent__Group_6_2_4__0 : rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1 ;
    public final void rule__XEvent__Group_6_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2413:1: ( rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1 )
            // InternalXMachine.g:2414:2: rule__XEvent__Group_6_2_4__0__Impl rule__XEvent__Group_6_2_4__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_6_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_4__0"


    // $ANTLR start "rule__XEvent__Group_6_2_4__0__Impl"
    // InternalXMachine.g:2421:1: rule__XEvent__Group_6_2_4__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_6_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2425:1: ( ( 'with' ) )
            // InternalXMachine.g:2426:1: ( 'with' )
            {
            // InternalXMachine.g:2426:1: ( 'with' )
            // InternalXMachine.g:2427:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_6_2_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_6_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_4__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6_2_4__1"
    // InternalXMachine.g:2436:1: rule__XEvent__Group_6_2_4__1 : rule__XEvent__Group_6_2_4__1__Impl ;
    public final void rule__XEvent__Group_6_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2440:1: ( rule__XEvent__Group_6_2_4__1__Impl )
            // InternalXMachine.g:2441:2: rule__XEvent__Group_6_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6_2_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_4__1"


    // $ANTLR start "rule__XEvent__Group_6_2_4__1__Impl"
    // InternalXMachine.g:2447:1: rule__XEvent__Group_6_2_4__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) ) ;
    public final void rule__XEvent__Group_6_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2451:1: ( ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) ) )
            // InternalXMachine.g:2452:1: ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) )
            {
            // InternalXMachine.g:2452:1: ( ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* ) )
            // InternalXMachine.g:2453:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* )
            {
            // InternalXMachine.g:2453:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 ) )
            // InternalXMachine.g:2454:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 
            // InternalXMachine.g:2455:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )
            // InternalXMachine.g:2455:4: rule__XEvent__WitnessesAssignment_6_2_4_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_6_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 

            }

            // InternalXMachine.g:2458:2: ( ( rule__XEvent__WitnessesAssignment_6_2_4_1 )* )
            // InternalXMachine.g:2459:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 
            // InternalXMachine.g:2460:3: ( rule__XEvent__WitnessesAssignment_6_2_4_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_ML_COMMENT && LA43_0<=RULE_SL_COMMENT)||LA43_0==22) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXMachine.g:2460:4: rule__XEvent__WitnessesAssignment_6_2_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_6_2_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_6_2_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6_2_4__1__Impl"


    // $ANTLR start "rule__XParameter__Group__0"
    // InternalXMachine.g:2470:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2474:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:2475:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__XParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__0"


    // $ANTLR start "rule__XParameter__Group__0__Impl"
    // InternalXMachine.g:2482:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2486:1: ( ( () ) )
            // InternalXMachine.g:2487:1: ( () )
            {
            // InternalXMachine.g:2487:1: ( () )
            // InternalXMachine.g:2488:2: ()
            {
             before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            // InternalXMachine.g:2489:2: ()
            // InternalXMachine.g:2489:3: 
            {
            }

             after(grammarAccess.getXParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__0__Impl"


    // $ANTLR start "rule__XParameter__Group__1"
    // InternalXMachine.g:2497:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl rule__XParameter__Group__2 ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2501:1: ( rule__XParameter__Group__1__Impl rule__XParameter__Group__2 )
            // InternalXMachine.g:2502:2: rule__XParameter__Group__1__Impl rule__XParameter__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__XParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__1"


    // $ANTLR start "rule__XParameter__Group__1__Impl"
    // InternalXMachine.g:2509:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__CommentAssignment_1 )? ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2513:1: ( ( ( rule__XParameter__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2514:1: ( ( rule__XParameter__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2514:1: ( ( rule__XParameter__CommentAssignment_1 )? )
            // InternalXMachine.g:2515:2: ( rule__XParameter__CommentAssignment_1 )?
            {
             before(grammarAccess.getXParameterAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2516:2: ( rule__XParameter__CommentAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ML_COMMENT && LA44_0<=RULE_SL_COMMENT)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:2516:3: rule__XParameter__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XParameter__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXParameterAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__1__Impl"


    // $ANTLR start "rule__XParameter__Group__2"
    // InternalXMachine.g:2524:1: rule__XParameter__Group__2 : rule__XParameter__Group__2__Impl ;
    public final void rule__XParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2528:1: ( rule__XParameter__Group__2__Impl )
            // InternalXMachine.g:2529:2: rule__XParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__2"


    // $ANTLR start "rule__XParameter__Group__2__Impl"
    // InternalXMachine.g:2535:1: rule__XParameter__Group__2__Impl : ( ( rule__XParameter__NameAssignment_2 ) ) ;
    public final void rule__XParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2539:1: ( ( ( rule__XParameter__NameAssignment_2 ) ) )
            // InternalXMachine.g:2540:1: ( ( rule__XParameter__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2540:1: ( ( rule__XParameter__NameAssignment_2 ) )
            // InternalXMachine.g:2541:2: ( rule__XParameter__NameAssignment_2 )
            {
             before(grammarAccess.getXParameterAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2542:2: ( rule__XParameter__NameAssignment_2 )
            // InternalXMachine.g:2542:3: rule__XParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__2__Impl"


    // $ANTLR start "rule__XGuard__Group__0"
    // InternalXMachine.g:2551:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2555:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:2556:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XGuard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__0"


    // $ANTLR start "rule__XGuard__Group__0__Impl"
    // InternalXMachine.g:2563:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2567:1: ( ( () ) )
            // InternalXMachine.g:2568:1: ( () )
            {
            // InternalXMachine.g:2568:1: ( () )
            // InternalXMachine.g:2569:2: ()
            {
             before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            // InternalXMachine.g:2570:2: ()
            // InternalXMachine.g:2570:3: 
            {
            }

             after(grammarAccess.getXGuardAccess().getGuardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__0__Impl"


    // $ANTLR start "rule__XGuard__Group__1"
    // InternalXMachine.g:2578:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2582:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:2583:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__XGuard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__1"


    // $ANTLR start "rule__XGuard__Group__1__Impl"
    // InternalXMachine.g:2590:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__CommentAssignment_1 )? ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2594:1: ( ( ( rule__XGuard__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2595:1: ( ( rule__XGuard__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2595:1: ( ( rule__XGuard__CommentAssignment_1 )? )
            // InternalXMachine.g:2596:2: ( rule__XGuard__CommentAssignment_1 )?
            {
             before(grammarAccess.getXGuardAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2597:2: ( rule__XGuard__CommentAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ML_COMMENT && LA45_0<=RULE_SL_COMMENT)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:2597:3: rule__XGuard__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGuardAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__1__Impl"


    // $ANTLR start "rule__XGuard__Group__2"
    // InternalXMachine.g:2605:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2609:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:2610:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__XGuard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__2"


    // $ANTLR start "rule__XGuard__Group__2__Impl"
    // InternalXMachine.g:2617:1: rule__XGuard__Group__2__Impl : ( '@' ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2621:1: ( ( '@' ) )
            // InternalXMachine.g:2622:1: ( '@' )
            {
            // InternalXMachine.g:2622:1: ( '@' )
            // InternalXMachine.g:2623:2: '@'
            {
             before(grammarAccess.getXGuardAccess().getCommercialAtKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getCommercialAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__2__Impl"


    // $ANTLR start "rule__XGuard__Group__3"
    // InternalXMachine.g:2632:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl rule__XGuard__Group__4 ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2636:1: ( rule__XGuard__Group__3__Impl rule__XGuard__Group__4 )
            // InternalXMachine.g:2637:2: rule__XGuard__Group__3__Impl rule__XGuard__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__XGuard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__3"


    // $ANTLR start "rule__XGuard__Group__3__Impl"
    // InternalXMachine.g:2644:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__NameAssignment_3 ) ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2648:1: ( ( ( rule__XGuard__NameAssignment_3 ) ) )
            // InternalXMachine.g:2649:1: ( ( rule__XGuard__NameAssignment_3 ) )
            {
            // InternalXMachine.g:2649:1: ( ( rule__XGuard__NameAssignment_3 ) )
            // InternalXMachine.g:2650:2: ( rule__XGuard__NameAssignment_3 )
            {
             before(grammarAccess.getXGuardAccess().getNameAssignment_3()); 
            // InternalXMachine.g:2651:2: ( rule__XGuard__NameAssignment_3 )
            // InternalXMachine.g:2651:3: rule__XGuard__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__3__Impl"


    // $ANTLR start "rule__XGuard__Group__4"
    // InternalXMachine.g:2659:1: rule__XGuard__Group__4 : rule__XGuard__Group__4__Impl rule__XGuard__Group__5 ;
    public final void rule__XGuard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2663:1: ( rule__XGuard__Group__4__Impl rule__XGuard__Group__5 )
            // InternalXMachine.g:2664:2: rule__XGuard__Group__4__Impl rule__XGuard__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__XGuard__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__4"


    // $ANTLR start "rule__XGuard__Group__4__Impl"
    // InternalXMachine.g:2671:1: rule__XGuard__Group__4__Impl : ( ( rule__XGuard__PredicateAssignment_4 ) ) ;
    public final void rule__XGuard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2675:1: ( ( ( rule__XGuard__PredicateAssignment_4 ) ) )
            // InternalXMachine.g:2676:1: ( ( rule__XGuard__PredicateAssignment_4 ) )
            {
            // InternalXMachine.g:2676:1: ( ( rule__XGuard__PredicateAssignment_4 ) )
            // InternalXMachine.g:2677:2: ( rule__XGuard__PredicateAssignment_4 )
            {
             before(grammarAccess.getXGuardAccess().getPredicateAssignment_4()); 
            // InternalXMachine.g:2678:2: ( rule__XGuard__PredicateAssignment_4 )
            // InternalXMachine.g:2678:3: rule__XGuard__PredicateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__4__Impl"


    // $ANTLR start "rule__XGuard__Group__5"
    // InternalXMachine.g:2686:1: rule__XGuard__Group__5 : rule__XGuard__Group__5__Impl ;
    public final void rule__XGuard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2690:1: ( rule__XGuard__Group__5__Impl )
            // InternalXMachine.g:2691:2: rule__XGuard__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__5"


    // $ANTLR start "rule__XGuard__Group__5__Impl"
    // InternalXMachine.g:2697:1: rule__XGuard__Group__5__Impl : ( ( rule__XGuard__TheoremAssignment_5 )? ) ;
    public final void rule__XGuard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2701:1: ( ( ( rule__XGuard__TheoremAssignment_5 )? ) )
            // InternalXMachine.g:2702:1: ( ( rule__XGuard__TheoremAssignment_5 )? )
            {
            // InternalXMachine.g:2702:1: ( ( rule__XGuard__TheoremAssignment_5 )? )
            // InternalXMachine.g:2703:2: ( rule__XGuard__TheoremAssignment_5 )?
            {
             before(grammarAccess.getXGuardAccess().getTheoremAssignment_5()); 
            // InternalXMachine.g:2704:2: ( rule__XGuard__TheoremAssignment_5 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==29) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:2704:3: rule__XGuard__TheoremAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__TheoremAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGuardAccess().getTheoremAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__5__Impl"


    // $ANTLR start "rule__XWitness__Group__0"
    // InternalXMachine.g:2713:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2717:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:2718:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XWitness__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitness__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__0"


    // $ANTLR start "rule__XWitness__Group__0__Impl"
    // InternalXMachine.g:2725:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2729:1: ( ( () ) )
            // InternalXMachine.g:2730:1: ( () )
            {
            // InternalXMachine.g:2730:1: ( () )
            // InternalXMachine.g:2731:2: ()
            {
             before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            // InternalXMachine.g:2732:2: ()
            // InternalXMachine.g:2732:3: 
            {
            }

             after(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__0__Impl"


    // $ANTLR start "rule__XWitness__Group__1"
    // InternalXMachine.g:2740:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2744:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:2745:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__XWitness__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitness__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__1"


    // $ANTLR start "rule__XWitness__Group__1__Impl"
    // InternalXMachine.g:2752:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__CommentAssignment_1 )? ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2756:1: ( ( ( rule__XWitness__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2757:1: ( ( rule__XWitness__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2757:1: ( ( rule__XWitness__CommentAssignment_1 )? )
            // InternalXMachine.g:2758:2: ( rule__XWitness__CommentAssignment_1 )?
            {
             before(grammarAccess.getXWitnessAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2759:2: ( rule__XWitness__CommentAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ML_COMMENT && LA47_0<=RULE_SL_COMMENT)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:2759:3: rule__XWitness__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XWitness__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXWitnessAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__1__Impl"


    // $ANTLR start "rule__XWitness__Group__2"
    // InternalXMachine.g:2767:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl rule__XWitness__Group__3 ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2771:1: ( rule__XWitness__Group__2__Impl rule__XWitness__Group__3 )
            // InternalXMachine.g:2772:2: rule__XWitness__Group__2__Impl rule__XWitness__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__XWitness__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitness__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__2"


    // $ANTLR start "rule__XWitness__Group__2__Impl"
    // InternalXMachine.g:2779:1: rule__XWitness__Group__2__Impl : ( '@' ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2783:1: ( ( '@' ) )
            // InternalXMachine.g:2784:1: ( '@' )
            {
            // InternalXMachine.g:2784:1: ( '@' )
            // InternalXMachine.g:2785:2: '@'
            {
             before(grammarAccess.getXWitnessAccess().getCommercialAtKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getXWitnessAccess().getCommercialAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__2__Impl"


    // $ANTLR start "rule__XWitness__Group__3"
    // InternalXMachine.g:2794:1: rule__XWitness__Group__3 : rule__XWitness__Group__3__Impl rule__XWitness__Group__4 ;
    public final void rule__XWitness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2798:1: ( rule__XWitness__Group__3__Impl rule__XWitness__Group__4 )
            // InternalXMachine.g:2799:2: rule__XWitness__Group__3__Impl rule__XWitness__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__XWitness__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitness__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__3"


    // $ANTLR start "rule__XWitness__Group__3__Impl"
    // InternalXMachine.g:2806:1: rule__XWitness__Group__3__Impl : ( ( rule__XWitness__NameAssignment_3 ) ) ;
    public final void rule__XWitness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2810:1: ( ( ( rule__XWitness__NameAssignment_3 ) ) )
            // InternalXMachine.g:2811:1: ( ( rule__XWitness__NameAssignment_3 ) )
            {
            // InternalXMachine.g:2811:1: ( ( rule__XWitness__NameAssignment_3 ) )
            // InternalXMachine.g:2812:2: ( rule__XWitness__NameAssignment_3 )
            {
             before(grammarAccess.getXWitnessAccess().getNameAssignment_3()); 
            // InternalXMachine.g:2813:2: ( rule__XWitness__NameAssignment_3 )
            // InternalXMachine.g:2813:3: rule__XWitness__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__3__Impl"


    // $ANTLR start "rule__XWitness__Group__4"
    // InternalXMachine.g:2821:1: rule__XWitness__Group__4 : rule__XWitness__Group__4__Impl ;
    public final void rule__XWitness__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2825:1: ( rule__XWitness__Group__4__Impl )
            // InternalXMachine.g:2826:2: rule__XWitness__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__4"


    // $ANTLR start "rule__XWitness__Group__4__Impl"
    // InternalXMachine.g:2832:1: rule__XWitness__Group__4__Impl : ( ( rule__XWitness__PredicateAssignment_4 ) ) ;
    public final void rule__XWitness__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2836:1: ( ( ( rule__XWitness__PredicateAssignment_4 ) ) )
            // InternalXMachine.g:2837:1: ( ( rule__XWitness__PredicateAssignment_4 ) )
            {
            // InternalXMachine.g:2837:1: ( ( rule__XWitness__PredicateAssignment_4 ) )
            // InternalXMachine.g:2838:2: ( rule__XWitness__PredicateAssignment_4 )
            {
             before(grammarAccess.getXWitnessAccess().getPredicateAssignment_4()); 
            // InternalXMachine.g:2839:2: ( rule__XWitness__PredicateAssignment_4 )
            // InternalXMachine.g:2839:3: rule__XWitness__PredicateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__4__Impl"


    // $ANTLR start "rule__XAction__Group__0"
    // InternalXMachine.g:2848:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2852:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:2853:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__0"


    // $ANTLR start "rule__XAction__Group__0__Impl"
    // InternalXMachine.g:2860:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2864:1: ( ( () ) )
            // InternalXMachine.g:2865:1: ( () )
            {
            // InternalXMachine.g:2865:1: ( () )
            // InternalXMachine.g:2866:2: ()
            {
             before(grammarAccess.getXActionAccess().getActionAction_0()); 
            // InternalXMachine.g:2867:2: ()
            // InternalXMachine.g:2867:3: 
            {
            }

             after(grammarAccess.getXActionAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__0__Impl"


    // $ANTLR start "rule__XAction__Group__1"
    // InternalXMachine.g:2875:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2879:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:2880:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__XAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__1"


    // $ANTLR start "rule__XAction__Group__1__Impl"
    // InternalXMachine.g:2887:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__CommentAssignment_1 )? ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2891:1: ( ( ( rule__XAction__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2892:1: ( ( rule__XAction__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2892:1: ( ( rule__XAction__CommentAssignment_1 )? )
            // InternalXMachine.g:2893:2: ( rule__XAction__CommentAssignment_1 )?
            {
             before(grammarAccess.getXActionAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2894:2: ( rule__XAction__CommentAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ML_COMMENT && LA48_0<=RULE_SL_COMMENT)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:2894:3: rule__XAction__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XAction__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXActionAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__1__Impl"


    // $ANTLR start "rule__XAction__Group__2"
    // InternalXMachine.g:2902:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl rule__XAction__Group__3 ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2906:1: ( rule__XAction__Group__2__Impl rule__XAction__Group__3 )
            // InternalXMachine.g:2907:2: rule__XAction__Group__2__Impl rule__XAction__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__XAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__2"


    // $ANTLR start "rule__XAction__Group__2__Impl"
    // InternalXMachine.g:2914:1: rule__XAction__Group__2__Impl : ( '@' ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2918:1: ( ( '@' ) )
            // InternalXMachine.g:2919:1: ( '@' )
            {
            // InternalXMachine.g:2919:1: ( '@' )
            // InternalXMachine.g:2920:2: '@'
            {
             before(grammarAccess.getXActionAccess().getCommercialAtKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getXActionAccess().getCommercialAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__2__Impl"


    // $ANTLR start "rule__XAction__Group__3"
    // InternalXMachine.g:2929:1: rule__XAction__Group__3 : rule__XAction__Group__3__Impl rule__XAction__Group__4 ;
    public final void rule__XAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2933:1: ( rule__XAction__Group__3__Impl rule__XAction__Group__4 )
            // InternalXMachine.g:2934:2: rule__XAction__Group__3__Impl rule__XAction__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__XAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__3"


    // $ANTLR start "rule__XAction__Group__3__Impl"
    // InternalXMachine.g:2941:1: rule__XAction__Group__3__Impl : ( ( rule__XAction__NameAssignment_3 ) ) ;
    public final void rule__XAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2945:1: ( ( ( rule__XAction__NameAssignment_3 ) ) )
            // InternalXMachine.g:2946:1: ( ( rule__XAction__NameAssignment_3 ) )
            {
            // InternalXMachine.g:2946:1: ( ( rule__XAction__NameAssignment_3 ) )
            // InternalXMachine.g:2947:2: ( rule__XAction__NameAssignment_3 )
            {
             before(grammarAccess.getXActionAccess().getNameAssignment_3()); 
            // InternalXMachine.g:2948:2: ( rule__XAction__NameAssignment_3 )
            // InternalXMachine.g:2948:3: rule__XAction__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XAction__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__3__Impl"


    // $ANTLR start "rule__XAction__Group__4"
    // InternalXMachine.g:2956:1: rule__XAction__Group__4 : rule__XAction__Group__4__Impl ;
    public final void rule__XAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2960:1: ( rule__XAction__Group__4__Impl )
            // InternalXMachine.g:2961:2: rule__XAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__4"


    // $ANTLR start "rule__XAction__Group__4__Impl"
    // InternalXMachine.g:2967:1: rule__XAction__Group__4__Impl : ( ( rule__XAction__ActionAssignment_4 ) ) ;
    public final void rule__XAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2971:1: ( ( ( rule__XAction__ActionAssignment_4 ) ) )
            // InternalXMachine.g:2972:1: ( ( rule__XAction__ActionAssignment_4 ) )
            {
            // InternalXMachine.g:2972:1: ( ( rule__XAction__ActionAssignment_4 ) )
            // InternalXMachine.g:2973:2: ( rule__XAction__ActionAssignment_4 )
            {
             before(grammarAccess.getXActionAccess().getActionAssignment_4()); 
            // InternalXMachine.g:2974:2: ( rule__XAction__ActionAssignment_4 )
            // InternalXMachine.g:2974:3: rule__XAction__ActionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XAction__ActionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getActionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__4__Impl"


    // $ANTLR start "rule__XMachine__CommentAssignment_1"
    // InternalXMachine.g:2983:1: rule__XMachine__CommentAssignment_1 : ( ( rule__XMachine__CommentAlternatives_1_0 ) ) ;
    public final void rule__XMachine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2987:1: ( ( ( rule__XMachine__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:2988:2: ( ( rule__XMachine__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:2988:2: ( ( rule__XMachine__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:2989:3: ( rule__XMachine__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXMachineAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:2990:3: ( rule__XMachine__CommentAlternatives_1_0 )
            // InternalXMachine.g:2990:4: rule__XMachine__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__CommentAssignment_1"


    // $ANTLR start "rule__XMachine__NameAssignment_3"
    // InternalXMachine.g:2998:1: rule__XMachine__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XMachine__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3002:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3003:2: ( RULE_ID )
            {
            // InternalXMachine.g:3003:2: ( RULE_ID )
            // InternalXMachine.g:3004:3: RULE_ID
            {
             before(grammarAccess.getXMachineAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__NameAssignment_3"


    // $ANTLR start "rule__XMachine__RefinesAssignment_4_1"
    // InternalXMachine.g:3013:1: rule__XMachine__RefinesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XMachine__RefinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3017:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3018:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3018:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3019:3: ( RULE_ID )
            {
             before(grammarAccess.getXMachineAccess().getRefinesMachineCrossReference_4_1_0()); 
            // InternalXMachine.g:3020:3: ( RULE_ID )
            // InternalXMachine.g:3021:4: RULE_ID
            {
             before(grammarAccess.getXMachineAccess().getRefinesMachineIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getRefinesMachineIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getXMachineAccess().getRefinesMachineCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__RefinesAssignment_4_1"


    // $ANTLR start "rule__XMachine__SeesAssignment_5_1"
    // InternalXMachine.g:3032:1: rule__XMachine__SeesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__XMachine__SeesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3036:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3037:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3037:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3038:3: ( RULE_ID )
            {
             before(grammarAccess.getXMachineAccess().getSeesContextCrossReference_5_1_0()); 
            // InternalXMachine.g:3039:3: ( RULE_ID )
            // InternalXMachine.g:3040:4: RULE_ID
            {
             before(grammarAccess.getXMachineAccess().getSeesContextIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getSeesContextIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getXMachineAccess().getSeesContextCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__SeesAssignment_5_1"


    // $ANTLR start "rule__XMachine__VariablesAssignment_6_1"
    // InternalXMachine.g:3051:1: rule__XMachine__VariablesAssignment_6_1 : ( ruleXVariable ) ;
    public final void rule__XMachine__VariablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3055:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:3056:2: ( ruleXVariable )
            {
            // InternalXMachine.g:3056:2: ( ruleXVariable )
            // InternalXMachine.g:3057:3: ruleXVariable
            {
             before(grammarAccess.getXMachineAccess().getVariablesXVariableParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXVariable();

            state._fsp--;

             after(grammarAccess.getXMachineAccess().getVariablesXVariableParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__VariablesAssignment_6_1"


    // $ANTLR start "rule__XMachine__InvariantsAssignment_7_1"
    // InternalXMachine.g:3066:1: rule__XMachine__InvariantsAssignment_7_1 : ( ruleXInvariant ) ;
    public final void rule__XMachine__InvariantsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3070:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:3071:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:3071:2: ( ruleXInvariant )
            // InternalXMachine.g:3072:3: ruleXInvariant
            {
             before(grammarAccess.getXMachineAccess().getInvariantsXInvariantParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXInvariant();

            state._fsp--;

             after(grammarAccess.getXMachineAccess().getInvariantsXInvariantParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__InvariantsAssignment_7_1"


    // $ANTLR start "rule__XMachine__VariantAssignment_8_1"
    // InternalXMachine.g:3081:1: rule__XMachine__VariantAssignment_8_1 : ( ruleXVariant ) ;
    public final void rule__XMachine__VariantAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3085:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:3086:2: ( ruleXVariant )
            {
            // InternalXMachine.g:3086:2: ( ruleXVariant )
            // InternalXMachine.g:3087:3: ruleXVariant
            {
             before(grammarAccess.getXMachineAccess().getVariantXVariantParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXVariant();

            state._fsp--;

             after(grammarAccess.getXMachineAccess().getVariantXVariantParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__VariantAssignment_8_1"


    // $ANTLR start "rule__XMachine__EventsAssignment_9_1"
    // InternalXMachine.g:3096:1: rule__XMachine__EventsAssignment_9_1 : ( ruleXEvent ) ;
    public final void rule__XMachine__EventsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3100:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:3101:2: ( ruleXEvent )
            {
            // InternalXMachine.g:3101:2: ( ruleXEvent )
            // InternalXMachine.g:3102:3: ruleXEvent
            {
             before(grammarAccess.getXMachineAccess().getEventsXEventParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getXMachineAccess().getEventsXEventParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__EventsAssignment_9_1"


    // $ANTLR start "rule__XVariable__CommentAssignment_1"
    // InternalXMachine.g:3111:1: rule__XVariable__CommentAssignment_1 : ( ( rule__XVariable__CommentAlternatives_1_0 ) ) ;
    public final void rule__XVariable__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3115:1: ( ( ( rule__XVariable__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3116:2: ( ( rule__XVariable__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3116:2: ( ( rule__XVariable__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3117:3: ( rule__XVariable__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXVariableAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3118:3: ( rule__XVariable__CommentAlternatives_1_0 )
            // InternalXMachine.g:3118:4: rule__XVariable__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXVariableAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__CommentAssignment_1"


    // $ANTLR start "rule__XVariable__NameAssignment_2"
    // InternalXMachine.g:3126:1: rule__XVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3130:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3131:2: ( RULE_ID )
            {
            // InternalXMachine.g:3131:2: ( RULE_ID )
            // InternalXMachine.g:3132:3: RULE_ID
            {
             before(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__NameAssignment_2"


    // $ANTLR start "rule__XInvariant__CommentAssignment_1"
    // InternalXMachine.g:3141:1: rule__XInvariant__CommentAssignment_1 : ( ( rule__XInvariant__CommentAlternatives_1_0 ) ) ;
    public final void rule__XInvariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3145:1: ( ( ( rule__XInvariant__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3146:2: ( ( rule__XInvariant__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3146:2: ( ( rule__XInvariant__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3147:3: ( rule__XInvariant__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXInvariantAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3148:3: ( rule__XInvariant__CommentAlternatives_1_0 )
            // InternalXMachine.g:3148:4: rule__XInvariant__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__CommentAssignment_1"


    // $ANTLR start "rule__XInvariant__NameAssignment_3"
    // InternalXMachine.g:3156:1: rule__XInvariant__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XInvariant__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3160:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3161:2: ( RULE_ID )
            {
            // InternalXMachine.g:3161:2: ( RULE_ID )
            // InternalXMachine.g:3162:3: RULE_ID
            {
             before(grammarAccess.getXInvariantAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__NameAssignment_3"


    // $ANTLR start "rule__XInvariant__PredicateAssignment_4"
    // InternalXMachine.g:3171:1: rule__XInvariant__PredicateAssignment_4 : ( RULE_STRING ) ;
    public final void rule__XInvariant__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3175:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3176:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3176:2: ( RULE_STRING )
            // InternalXMachine.g:3177:3: RULE_STRING
            {
             before(grammarAccess.getXInvariantAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__PredicateAssignment_4"


    // $ANTLR start "rule__XInvariant__TheoremAssignment_5"
    // InternalXMachine.g:3186:1: rule__XInvariant__TheoremAssignment_5 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3190:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3191:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3191:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3192:3: ( 'theorem' )
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_5_0()); 
            // InternalXMachine.g:3193:3: ( 'theorem' )
            // InternalXMachine.g:3194:4: 'theorem'
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_5_0()); 

            }

             after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__TheoremAssignment_5"


    // $ANTLR start "rule__XVariant__CommentAssignment_1"
    // InternalXMachine.g:3205:1: rule__XVariant__CommentAssignment_1 : ( ( rule__XVariant__CommentAlternatives_1_0 ) ) ;
    public final void rule__XVariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3209:1: ( ( ( rule__XVariant__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3210:2: ( ( rule__XVariant__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3210:2: ( ( rule__XVariant__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3211:3: ( rule__XVariant__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXVariantAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3212:3: ( rule__XVariant__CommentAlternatives_1_0 )
            // InternalXMachine.g:3212:4: rule__XVariant__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXVariantAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__CommentAssignment_1"


    // $ANTLR start "rule__XVariant__ExpressionAssignment_2"
    // InternalXMachine.g:3220:1: rule__XVariant__ExpressionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XVariant__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3224:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3225:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3225:2: ( RULE_STRING )
            // InternalXMachine.g:3226:3: RULE_STRING
            {
             before(grammarAccess.getXVariantAccess().getExpressionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXVariantAccess().getExpressionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__ExpressionAssignment_2"


    // $ANTLR start "rule__XEvent__CommentAssignment_1"
    // InternalXMachine.g:3235:1: rule__XEvent__CommentAssignment_1 : ( ( rule__XEvent__CommentAlternatives_1_0 ) ) ;
    public final void rule__XEvent__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3239:1: ( ( ( rule__XEvent__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3240:2: ( ( rule__XEvent__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3240:2: ( ( rule__XEvent__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3241:3: ( rule__XEvent__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXEventAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3242:3: ( rule__XEvent__CommentAlternatives_1_0 )
            // InternalXMachine.g:3242:4: rule__XEvent__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__CommentAssignment_1"


    // $ANTLR start "rule__XEvent__NameAssignment_2"
    // InternalXMachine.g:3250:1: rule__XEvent__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3254:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3255:2: ( RULE_ID )
            {
            // InternalXMachine.g:3255:2: ( RULE_ID )
            // InternalXMachine.g:3256:3: RULE_ID
            {
             before(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__NameAssignment_2"


    // $ANTLR start "rule__XEvent__ExtendedAssignment_3"
    // InternalXMachine.g:3265:1: rule__XEvent__ExtendedAssignment_3 : ( ( 'extended' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3269:1: ( ( ( 'extended' ) ) )
            // InternalXMachine.g:3270:2: ( ( 'extended' ) )
            {
            // InternalXMachine.g:3270:2: ( ( 'extended' ) )
            // InternalXMachine.g:3271:3: ( 'extended' )
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0()); 
            // InternalXMachine.g:3272:3: ( 'extended' )
            // InternalXMachine.g:3273:4: 'extended'
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0()); 

            }

             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtendedAssignment_3"


    // $ANTLR start "rule__XEvent__ConvergenceAssignment_4"
    // InternalXMachine.g:3284:1: rule__XEvent__ConvergenceAssignment_4 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3288:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:3289:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:3289:2: ( ruleXConvergence )
            // InternalXMachine.g:3290:3: ruleXConvergence
            {
             before(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleXConvergence();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ConvergenceAssignment_4"


    // $ANTLR start "rule__XEvent__RefinesAssignment_5_1"
    // InternalXMachine.g:3299:1: rule__XEvent__RefinesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3303:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3304:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3304:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3305:3: ( RULE_ID )
            {
             before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_0()); 
            // InternalXMachine.g:3306:3: ( RULE_ID )
            // InternalXMachine.g:3307:4: RULE_ID
            {
             before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__RefinesAssignment_5_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_6_0_0_1"
    // InternalXMachine.g:3318:1: rule__XEvent__WitnessesAssignment_6_0_0_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3322:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:3323:2: ( ruleXWitness )
            {
            // InternalXMachine.g:3323:2: ( ruleXWitness )
            // InternalXMachine.g:3324:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_6_0_0_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_6_0_2"
    // InternalXMachine.g:3333:1: rule__XEvent__ActionsAssignment_6_0_2 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3337:1: ( ( ruleXAction ) )
            // InternalXMachine.g:3338:2: ( ruleXAction )
            {
            // InternalXMachine.g:3338:2: ( ruleXAction )
            // InternalXMachine.g:3339:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_6_0_2"


    // $ANTLR start "rule__XEvent__GuardsAssignment_6_1_1"
    // InternalXMachine.g:3348:1: rule__XEvent__GuardsAssignment_6_1_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3352:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:3353:2: ( ruleXGuard )
            {
            // InternalXMachine.g:3353:2: ( ruleXGuard )
            // InternalXMachine.g:3354:3: ruleXGuard
            {
             before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__GuardsAssignment_6_1_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_6_1_2_1"
    // InternalXMachine.g:3363:1: rule__XEvent__WitnessesAssignment_6_1_2_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3367:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:3368:2: ( ruleXWitness )
            {
            // InternalXMachine.g:3368:2: ( ruleXWitness )
            // InternalXMachine.g:3369:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_6_1_2_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_6_1_4"
    // InternalXMachine.g:3378:1: rule__XEvent__ActionsAssignment_6_1_4 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3382:1: ( ( ruleXAction ) )
            // InternalXMachine.g:3383:2: ( ruleXAction )
            {
            // InternalXMachine.g:3383:2: ( ruleXAction )
            // InternalXMachine.g:3384:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_6_1_4"


    // $ANTLR start "rule__XEvent__ParametersAssignment_6_2_1"
    // InternalXMachine.g:3393:1: rule__XEvent__ParametersAssignment_6_2_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3397:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:3398:2: ( ruleXParameter )
            {
            // InternalXMachine.g:3398:2: ( ruleXParameter )
            // InternalXMachine.g:3399:3: ruleXParameter
            {
             before(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXParameter();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ParametersAssignment_6_2_1"


    // $ANTLR start "rule__XEvent__GuardsAssignment_6_2_3"
    // InternalXMachine.g:3408:1: rule__XEvent__GuardsAssignment_6_2_3 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_6_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3412:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:3413:2: ( ruleXGuard )
            {
            // InternalXMachine.g:3413:2: ( ruleXGuard )
            // InternalXMachine.g:3414:3: ruleXGuard
            {
             before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__GuardsAssignment_6_2_3"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_6_2_4_1"
    // InternalXMachine.g:3423:1: rule__XEvent__WitnessesAssignment_6_2_4_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_6_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3427:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:3428:2: ( ruleXWitness )
            {
            // InternalXMachine.g:3428:2: ( ruleXWitness )
            // InternalXMachine.g:3429:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_6_2_4_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_6_2_6"
    // InternalXMachine.g:3438:1: rule__XEvent__ActionsAssignment_6_2_6 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_6_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3442:1: ( ( ruleXAction ) )
            // InternalXMachine.g:3443:2: ( ruleXAction )
            {
            // InternalXMachine.g:3443:2: ( ruleXAction )
            // InternalXMachine.g:3444:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_2_6_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_2_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_6_2_6"


    // $ANTLR start "rule__XParameter__CommentAssignment_1"
    // InternalXMachine.g:3453:1: rule__XParameter__CommentAssignment_1 : ( ( rule__XParameter__CommentAlternatives_1_0 ) ) ;
    public final void rule__XParameter__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3457:1: ( ( ( rule__XParameter__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3458:2: ( ( rule__XParameter__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3458:2: ( ( rule__XParameter__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3459:3: ( rule__XParameter__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXParameterAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3460:3: ( rule__XParameter__CommentAlternatives_1_0 )
            // InternalXMachine.g:3460:4: rule__XParameter__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXParameterAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__CommentAssignment_1"


    // $ANTLR start "rule__XParameter__NameAssignment_2"
    // InternalXMachine.g:3468:1: rule__XParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3472:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3473:2: ( RULE_ID )
            {
            // InternalXMachine.g:3473:2: ( RULE_ID )
            // InternalXMachine.g:3474:3: RULE_ID
            {
             before(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__NameAssignment_2"


    // $ANTLR start "rule__XGuard__CommentAssignment_1"
    // InternalXMachine.g:3483:1: rule__XGuard__CommentAssignment_1 : ( ( rule__XGuard__CommentAlternatives_1_0 ) ) ;
    public final void rule__XGuard__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3487:1: ( ( ( rule__XGuard__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3488:2: ( ( rule__XGuard__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3488:2: ( ( rule__XGuard__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3489:3: ( rule__XGuard__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXGuardAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3490:3: ( rule__XGuard__CommentAlternatives_1_0 )
            // InternalXMachine.g:3490:4: rule__XGuard__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__CommentAssignment_1"


    // $ANTLR start "rule__XGuard__NameAssignment_3"
    // InternalXMachine.g:3498:1: rule__XGuard__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XGuard__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3502:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3503:2: ( RULE_ID )
            {
            // InternalXMachine.g:3503:2: ( RULE_ID )
            // InternalXMachine.g:3504:3: RULE_ID
            {
             before(grammarAccess.getXGuardAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__NameAssignment_3"


    // $ANTLR start "rule__XGuard__PredicateAssignment_4"
    // InternalXMachine.g:3513:1: rule__XGuard__PredicateAssignment_4 : ( RULE_STRING ) ;
    public final void rule__XGuard__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3517:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3518:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3518:2: ( RULE_STRING )
            // InternalXMachine.g:3519:3: RULE_STRING
            {
             before(grammarAccess.getXGuardAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__PredicateAssignment_4"


    // $ANTLR start "rule__XGuard__TheoremAssignment_5"
    // InternalXMachine.g:3528:1: rule__XGuard__TheoremAssignment_5 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3532:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3533:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3533:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3534:3: ( 'theorem' )
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_5_0()); 
            // InternalXMachine.g:3535:3: ( 'theorem' )
            // InternalXMachine.g:3536:4: 'theorem'
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_5_0()); 

            }

             after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__TheoremAssignment_5"


    // $ANTLR start "rule__XWitness__CommentAssignment_1"
    // InternalXMachine.g:3547:1: rule__XWitness__CommentAssignment_1 : ( ( rule__XWitness__CommentAlternatives_1_0 ) ) ;
    public final void rule__XWitness__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3551:1: ( ( ( rule__XWitness__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3552:2: ( ( rule__XWitness__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3552:2: ( ( rule__XWitness__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3553:3: ( rule__XWitness__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXWitnessAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3554:3: ( rule__XWitness__CommentAlternatives_1_0 )
            // InternalXMachine.g:3554:4: rule__XWitness__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__CommentAssignment_1"


    // $ANTLR start "rule__XWitness__NameAssignment_3"
    // InternalXMachine.g:3562:1: rule__XWitness__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XWitness__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3566:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3567:2: ( RULE_ID )
            {
            // InternalXMachine.g:3567:2: ( RULE_ID )
            // InternalXMachine.g:3568:3: RULE_ID
            {
             before(grammarAccess.getXWitnessAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXWitnessAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__NameAssignment_3"


    // $ANTLR start "rule__XWitness__PredicateAssignment_4"
    // InternalXMachine.g:3577:1: rule__XWitness__PredicateAssignment_4 : ( RULE_STRING ) ;
    public final void rule__XWitness__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3581:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3582:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3582:2: ( RULE_STRING )
            // InternalXMachine.g:3583:3: RULE_STRING
            {
             before(grammarAccess.getXWitnessAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXWitnessAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__PredicateAssignment_4"


    // $ANTLR start "rule__XAction__CommentAssignment_1"
    // InternalXMachine.g:3592:1: rule__XAction__CommentAssignment_1 : ( ( rule__XAction__CommentAlternatives_1_0 ) ) ;
    public final void rule__XAction__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3596:1: ( ( ( rule__XAction__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3597:2: ( ( rule__XAction__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3597:2: ( ( rule__XAction__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3598:3: ( rule__XAction__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXActionAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3599:3: ( rule__XAction__CommentAlternatives_1_0 )
            // InternalXMachine.g:3599:4: rule__XAction__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XAction__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__CommentAssignment_1"


    // $ANTLR start "rule__XAction__NameAssignment_3"
    // InternalXMachine.g:3607:1: rule__XAction__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XAction__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3611:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3612:2: ( RULE_ID )
            {
            // InternalXMachine.g:3612:2: ( RULE_ID )
            // InternalXMachine.g:3613:3: RULE_ID
            {
             before(grammarAccess.getXActionAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXActionAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__NameAssignment_3"


    // $ANTLR start "rule__XAction__ActionAssignment_4"
    // InternalXMachine.g:3622:1: rule__XAction__ActionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__XAction__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3626:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3627:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3627:2: ( RULE_STRING )
            // InternalXMachine.g:3628:3: RULE_STRING
            {
             before(grammarAccess.getXActionAccess().getActionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXActionAccess().getActionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__ActionAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003F8000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000B810000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});

}