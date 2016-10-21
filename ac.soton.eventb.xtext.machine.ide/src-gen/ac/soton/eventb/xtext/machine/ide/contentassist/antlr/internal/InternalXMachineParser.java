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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "';'", "'begin'", "'with'", "'when'", "'then'", "'any'", "'where'", "'theorem'", "'extended'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int RULE_XLABEL=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
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


    // $ANTLR start "rule__XEvent__Alternatives_5"
    // InternalXMachine.g:398:1: rule__XEvent__Alternatives_5 : ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) | ( ( rule__XEvent__Group_5_2__0 ) ) );
    public final void rule__XEvent__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:402:1: ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) | ( ( rule__XEvent__Group_5_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 24:
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 28:
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
                    // InternalXMachine.g:403:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    {
                    // InternalXMachine.g:403:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    // InternalXMachine.g:404:3: ( rule__XEvent__Group_5_0__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_0()); 
                    // InternalXMachine.g:405:3: ( rule__XEvent__Group_5_0__0 )
                    // InternalXMachine.g:405:4: rule__XEvent__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:409:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    {
                    // InternalXMachine.g:409:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    // InternalXMachine.g:410:3: ( rule__XEvent__Group_5_1__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_1()); 
                    // InternalXMachine.g:411:3: ( rule__XEvent__Group_5_1__0 )
                    // InternalXMachine.g:411:4: rule__XEvent__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:415:2: ( ( rule__XEvent__Group_5_2__0 ) )
                    {
                    // InternalXMachine.g:415:2: ( ( rule__XEvent__Group_5_2__0 ) )
                    // InternalXMachine.g:416:3: ( rule__XEvent__Group_5_2__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_2()); 
                    // InternalXMachine.g:417:3: ( rule__XEvent__Group_5_2__0 )
                    // InternalXMachine.g:417:4: rule__XEvent__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__XEvent__Alternatives_5"


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
            case 12:
                {
                alt11=1;
                }
                break;
            case 13:
                {
                alt11=2;
                }
                break;
            case 14:
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
                    match(input,12,FOLLOW_2); 

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
                    match(input,13,FOLLOW_2); 

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
                    match(input,14,FOLLOW_2); 

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
            match(input,15,FOLLOW_2); 
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

            if ( (LA13_0==17) ) {
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

            if ( (LA14_0==18) ) {
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

            if ( (LA15_0==19) ) {
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

            if ( (LA16_0==20) ) {
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

            if ( (LA17_0==21) ) {
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

            if ( (LA18_0==22) ) {
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
            match(input,16,FOLLOW_2); 
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
            match(input,17,FOLLOW_2); 
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
            match(input,18,FOLLOW_2); 
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
            match(input,19,FOLLOW_2); 
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
            match(input,20,FOLLOW_2); 
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

                if ( ((LA21_0>=RULE_ML_COMMENT && LA21_0<=RULE_SL_COMMENT)||LA21_0==RULE_XLABEL) ) {
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
            match(input,21,FOLLOW_2); 
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
            match(input,22,FOLLOW_2); 
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
    // InternalXMachine.g:1151:1: rule__XMachine__Group_9__1 : rule__XMachine__Group_9__1__Impl rule__XMachine__Group_9__2 ;
    public final void rule__XMachine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1155:1: ( rule__XMachine__Group_9__1__Impl rule__XMachine__Group_9__2 )
            // InternalXMachine.g:1156:2: rule__XMachine__Group_9__1__Impl rule__XMachine__Group_9__2
            {
            pushFollow(FOLLOW_12);
            rule__XMachine__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group_9__2();

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
    // InternalXMachine.g:1163:1: rule__XMachine__Group_9__1__Impl : ( ( rule__XMachine__EventsAssignment_9_1 ) ) ;
    public final void rule__XMachine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1167:1: ( ( ( rule__XMachine__EventsAssignment_9_1 ) ) )
            // InternalXMachine.g:1168:1: ( ( rule__XMachine__EventsAssignment_9_1 ) )
            {
            // InternalXMachine.g:1168:1: ( ( rule__XMachine__EventsAssignment_9_1 ) )
            // InternalXMachine.g:1169:2: ( rule__XMachine__EventsAssignment_9_1 )
            {
             before(grammarAccess.getXMachineAccess().getEventsAssignment_9_1()); 
            // InternalXMachine.g:1170:2: ( rule__XMachine__EventsAssignment_9_1 )
            // InternalXMachine.g:1170:3: rule__XMachine__EventsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__EventsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getEventsAssignment_9_1()); 

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


    // $ANTLR start "rule__XMachine__Group_9__2"
    // InternalXMachine.g:1178:1: rule__XMachine__Group_9__2 : rule__XMachine__Group_9__2__Impl ;
    public final void rule__XMachine__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1182:1: ( rule__XMachine__Group_9__2__Impl )
            // InternalXMachine.g:1183:2: rule__XMachine__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_9__2__Impl();

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
    // $ANTLR end "rule__XMachine__Group_9__2"


    // $ANTLR start "rule__XMachine__Group_9__2__Impl"
    // InternalXMachine.g:1189:1: rule__XMachine__Group_9__2__Impl : ( ( rule__XMachine__Group_9_2__0 )* ) ;
    public final void rule__XMachine__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1193:1: ( ( ( rule__XMachine__Group_9_2__0 )* ) )
            // InternalXMachine.g:1194:1: ( ( rule__XMachine__Group_9_2__0 )* )
            {
            // InternalXMachine.g:1194:1: ( ( rule__XMachine__Group_9_2__0 )* )
            // InternalXMachine.g:1195:2: ( rule__XMachine__Group_9_2__0 )*
            {
             before(grammarAccess.getXMachineAccess().getGroup_9_2()); 
            // InternalXMachine.g:1196:2: ( rule__XMachine__Group_9_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXMachine.g:1196:3: rule__XMachine__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XMachine__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getXMachineAccess().getGroup_9_2()); 

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
    // $ANTLR end "rule__XMachine__Group_9__2__Impl"


    // $ANTLR start "rule__XMachine__Group_9_2__0"
    // InternalXMachine.g:1205:1: rule__XMachine__Group_9_2__0 : rule__XMachine__Group_9_2__0__Impl rule__XMachine__Group_9_2__1 ;
    public final void rule__XMachine__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1209:1: ( rule__XMachine__Group_9_2__0__Impl rule__XMachine__Group_9_2__1 )
            // InternalXMachine.g:1210:2: rule__XMachine__Group_9_2__0__Impl rule__XMachine__Group_9_2__1
            {
            pushFollow(FOLLOW_7);
            rule__XMachine__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group_9_2__1();

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
    // $ANTLR end "rule__XMachine__Group_9_2__0"


    // $ANTLR start "rule__XMachine__Group_9_2__0__Impl"
    // InternalXMachine.g:1217:1: rule__XMachine__Group_9_2__0__Impl : ( ';' ) ;
    public final void rule__XMachine__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1221:1: ( ( ';' ) )
            // InternalXMachine.g:1222:1: ( ';' )
            {
            // InternalXMachine.g:1222:1: ( ';' )
            // InternalXMachine.g:1223:2: ';'
            {
             before(grammarAccess.getXMachineAccess().getSemicolonKeyword_9_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getSemicolonKeyword_9_2_0()); 

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
    // $ANTLR end "rule__XMachine__Group_9_2__0__Impl"


    // $ANTLR start "rule__XMachine__Group_9_2__1"
    // InternalXMachine.g:1232:1: rule__XMachine__Group_9_2__1 : rule__XMachine__Group_9_2__1__Impl ;
    public final void rule__XMachine__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1236:1: ( rule__XMachine__Group_9_2__1__Impl )
            // InternalXMachine.g:1237:2: rule__XMachine__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_9_2__1__Impl();

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
    // $ANTLR end "rule__XMachine__Group_9_2__1"


    // $ANTLR start "rule__XMachine__Group_9_2__1__Impl"
    // InternalXMachine.g:1243:1: rule__XMachine__Group_9_2__1__Impl : ( ( rule__XMachine__EventsAssignment_9_2_1 ) ) ;
    public final void rule__XMachine__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1247:1: ( ( ( rule__XMachine__EventsAssignment_9_2_1 ) ) )
            // InternalXMachine.g:1248:1: ( ( rule__XMachine__EventsAssignment_9_2_1 ) )
            {
            // InternalXMachine.g:1248:1: ( ( rule__XMachine__EventsAssignment_9_2_1 ) )
            // InternalXMachine.g:1249:2: ( rule__XMachine__EventsAssignment_9_2_1 )
            {
             before(grammarAccess.getXMachineAccess().getEventsAssignment_9_2_1()); 
            // InternalXMachine.g:1250:2: ( rule__XMachine__EventsAssignment_9_2_1 )
            // InternalXMachine.g:1250:3: rule__XMachine__EventsAssignment_9_2_1
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__EventsAssignment_9_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getEventsAssignment_9_2_1()); 

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
    // $ANTLR end "rule__XMachine__Group_9_2__1__Impl"


    // $ANTLR start "rule__XVariable__Group__0"
    // InternalXMachine.g:1259:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1263:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:1264:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
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
    // InternalXMachine.g:1271:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1275:1: ( ( () ) )
            // InternalXMachine.g:1276:1: ( () )
            {
            // InternalXMachine.g:1276:1: ( () )
            // InternalXMachine.g:1277:2: ()
            {
             before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            // InternalXMachine.g:1278:2: ()
            // InternalXMachine.g:1278:3: 
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
    // InternalXMachine.g:1286:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl rule__XVariable__Group__2 ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1290:1: ( rule__XVariable__Group__1__Impl rule__XVariable__Group__2 )
            // InternalXMachine.g:1291:2: rule__XVariable__Group__1__Impl rule__XVariable__Group__2
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
    // InternalXMachine.g:1298:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__CommentAssignment_1 )? ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1302:1: ( ( ( rule__XVariable__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1303:1: ( ( rule__XVariable__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1303:1: ( ( rule__XVariable__CommentAssignment_1 )? )
            // InternalXMachine.g:1304:2: ( rule__XVariable__CommentAssignment_1 )?
            {
             before(grammarAccess.getXVariableAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1305:2: ( rule__XVariable__CommentAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ML_COMMENT && LA23_0<=RULE_SL_COMMENT)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:1305:3: rule__XVariable__CommentAssignment_1
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
    // InternalXMachine.g:1313:1: rule__XVariable__Group__2 : rule__XVariable__Group__2__Impl ;
    public final void rule__XVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1317:1: ( rule__XVariable__Group__2__Impl )
            // InternalXMachine.g:1318:2: rule__XVariable__Group__2__Impl
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
    // InternalXMachine.g:1324:1: rule__XVariable__Group__2__Impl : ( ( rule__XVariable__NameAssignment_2 ) ) ;
    public final void rule__XVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1328:1: ( ( ( rule__XVariable__NameAssignment_2 ) ) )
            // InternalXMachine.g:1329:1: ( ( rule__XVariable__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1329:1: ( ( rule__XVariable__NameAssignment_2 ) )
            // InternalXMachine.g:1330:2: ( rule__XVariable__NameAssignment_2 )
            {
             before(grammarAccess.getXVariableAccess().getNameAssignment_2()); 
            // InternalXMachine.g:1331:2: ( rule__XVariable__NameAssignment_2 )
            // InternalXMachine.g:1331:3: rule__XVariable__NameAssignment_2
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
    // InternalXMachine.g:1340:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1344:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:1345:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
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
    // InternalXMachine.g:1352:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1356:1: ( ( () ) )
            // InternalXMachine.g:1357:1: ( () )
            {
            // InternalXMachine.g:1357:1: ( () )
            // InternalXMachine.g:1358:2: ()
            {
             before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            // InternalXMachine.g:1359:2: ()
            // InternalXMachine.g:1359:3: 
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
    // InternalXMachine.g:1367:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1371:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:1372:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
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
    // InternalXMachine.g:1379:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__CommentAssignment_1 )? ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1383:1: ( ( ( rule__XInvariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1384:1: ( ( rule__XInvariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1384:1: ( ( rule__XInvariant__CommentAssignment_1 )? )
            // InternalXMachine.g:1385:2: ( rule__XInvariant__CommentAssignment_1 )?
            {
             before(grammarAccess.getXInvariantAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1386:2: ( rule__XInvariant__CommentAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ML_COMMENT && LA24_0<=RULE_SL_COMMENT)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:1386:3: rule__XInvariant__CommentAssignment_1
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
    // InternalXMachine.g:1394:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1398:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:1399:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:1406:1: rule__XInvariant__Group__2__Impl : ( ( rule__XInvariant__NameAssignment_2 ) ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1410:1: ( ( ( rule__XInvariant__NameAssignment_2 ) ) )
            // InternalXMachine.g:1411:1: ( ( rule__XInvariant__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1411:1: ( ( rule__XInvariant__NameAssignment_2 ) )
            // InternalXMachine.g:1412:2: ( rule__XInvariant__NameAssignment_2 )
            {
             before(grammarAccess.getXInvariantAccess().getNameAssignment_2()); 
            // InternalXMachine.g:1413:2: ( rule__XInvariant__NameAssignment_2 )
            // InternalXMachine.g:1413:3: rule__XInvariant__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getNameAssignment_2()); 

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
    // InternalXMachine.g:1421:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl rule__XInvariant__Group__4 ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1425:1: ( rule__XInvariant__Group__3__Impl rule__XInvariant__Group__4 )
            // InternalXMachine.g:1426:2: rule__XInvariant__Group__3__Impl rule__XInvariant__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalXMachine.g:1433:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__PredicateAssignment_3 ) ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1437:1: ( ( ( rule__XInvariant__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:1438:1: ( ( rule__XInvariant__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:1438:1: ( ( rule__XInvariant__PredicateAssignment_3 ) )
            // InternalXMachine.g:1439:2: ( rule__XInvariant__PredicateAssignment_3 )
            {
             before(grammarAccess.getXInvariantAccess().getPredicateAssignment_3()); 
            // InternalXMachine.g:1440:2: ( rule__XInvariant__PredicateAssignment_3 )
            // InternalXMachine.g:1440:3: rule__XInvariant__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getPredicateAssignment_3()); 

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
    // InternalXMachine.g:1448:1: rule__XInvariant__Group__4 : rule__XInvariant__Group__4__Impl ;
    public final void rule__XInvariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1452:1: ( rule__XInvariant__Group__4__Impl )
            // InternalXMachine.g:1453:2: rule__XInvariant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__4__Impl();

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
    // InternalXMachine.g:1459:1: rule__XInvariant__Group__4__Impl : ( ( rule__XInvariant__TheoremAssignment_4 )? ) ;
    public final void rule__XInvariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1463:1: ( ( ( rule__XInvariant__TheoremAssignment_4 )? ) )
            // InternalXMachine.g:1464:1: ( ( rule__XInvariant__TheoremAssignment_4 )? )
            {
            // InternalXMachine.g:1464:1: ( ( rule__XInvariant__TheoremAssignment_4 )? )
            // InternalXMachine.g:1465:2: ( rule__XInvariant__TheoremAssignment_4 )?
            {
             before(grammarAccess.getXInvariantAccess().getTheoremAssignment_4()); 
            // InternalXMachine.g:1466:2: ( rule__XInvariant__TheoremAssignment_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:1466:3: rule__XInvariant__TheoremAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariant__TheoremAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXInvariantAccess().getTheoremAssignment_4()); 

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


    // $ANTLR start "rule__XVariant__Group__0"
    // InternalXMachine.g:1475:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1479:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:1480:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
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
    // InternalXMachine.g:1487:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1491:1: ( ( () ) )
            // InternalXMachine.g:1492:1: ( () )
            {
            // InternalXMachine.g:1492:1: ( () )
            // InternalXMachine.g:1493:2: ()
            {
             before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            // InternalXMachine.g:1494:2: ()
            // InternalXMachine.g:1494:3: 
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
    // InternalXMachine.g:1502:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl rule__XVariant__Group__2 ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1506:1: ( rule__XVariant__Group__1__Impl rule__XVariant__Group__2 )
            // InternalXMachine.g:1507:2: rule__XVariant__Group__1__Impl rule__XVariant__Group__2
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
    // InternalXMachine.g:1514:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__CommentAssignment_1 )? ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1518:1: ( ( ( rule__XVariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1519:1: ( ( rule__XVariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1519:1: ( ( rule__XVariant__CommentAssignment_1 )? )
            // InternalXMachine.g:1520:2: ( rule__XVariant__CommentAssignment_1 )?
            {
             before(grammarAccess.getXVariantAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1521:2: ( rule__XVariant__CommentAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ML_COMMENT && LA26_0<=RULE_SL_COMMENT)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXMachine.g:1521:3: rule__XVariant__CommentAssignment_1
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
    // InternalXMachine.g:1529:1: rule__XVariant__Group__2 : rule__XVariant__Group__2__Impl ;
    public final void rule__XVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1533:1: ( rule__XVariant__Group__2__Impl )
            // InternalXMachine.g:1534:2: rule__XVariant__Group__2__Impl
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
    // InternalXMachine.g:1540:1: rule__XVariant__Group__2__Impl : ( ( rule__XVariant__ExpressionAssignment_2 ) ) ;
    public final void rule__XVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1544:1: ( ( ( rule__XVariant__ExpressionAssignment_2 ) ) )
            // InternalXMachine.g:1545:1: ( ( rule__XVariant__ExpressionAssignment_2 ) )
            {
            // InternalXMachine.g:1545:1: ( ( rule__XVariant__ExpressionAssignment_2 ) )
            // InternalXMachine.g:1546:2: ( rule__XVariant__ExpressionAssignment_2 )
            {
             before(grammarAccess.getXVariantAccess().getExpressionAssignment_2()); 
            // InternalXMachine.g:1547:2: ( rule__XVariant__ExpressionAssignment_2 )
            // InternalXMachine.g:1547:3: rule__XVariant__ExpressionAssignment_2
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
    // InternalXMachine.g:1556:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1560:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:1561:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
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
    // InternalXMachine.g:1568:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1572:1: ( ( () ) )
            // InternalXMachine.g:1573:1: ( () )
            {
            // InternalXMachine.g:1573:1: ( () )
            // InternalXMachine.g:1574:2: ()
            {
             before(grammarAccess.getXEventAccess().getEventAction_0()); 
            // InternalXMachine.g:1575:2: ()
            // InternalXMachine.g:1575:3: 
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
    // InternalXMachine.g:1583:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1587:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:1588:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
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
    // InternalXMachine.g:1595:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__CommentAssignment_1 )? ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1599:1: ( ( ( rule__XEvent__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1600:1: ( ( rule__XEvent__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1600:1: ( ( rule__XEvent__CommentAssignment_1 )? )
            // InternalXMachine.g:1601:2: ( rule__XEvent__CommentAssignment_1 )?
            {
             before(grammarAccess.getXEventAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1602:2: ( rule__XEvent__CommentAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ML_COMMENT && LA27_0<=RULE_SL_COMMENT)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:1602:3: rule__XEvent__CommentAssignment_1
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
    // InternalXMachine.g:1610:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1614:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:1615:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalXMachine.g:1622:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__NameAssignment_2 ) ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1626:1: ( ( ( rule__XEvent__NameAssignment_2 ) ) )
            // InternalXMachine.g:1627:1: ( ( rule__XEvent__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1627:1: ( ( rule__XEvent__NameAssignment_2 ) )
            // InternalXMachine.g:1628:2: ( rule__XEvent__NameAssignment_2 )
            {
             before(grammarAccess.getXEventAccess().getNameAssignment_2()); 
            // InternalXMachine.g:1629:2: ( rule__XEvent__NameAssignment_2 )
            // InternalXMachine.g:1629:3: rule__XEvent__NameAssignment_2
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
    // InternalXMachine.g:1637:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1641:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:1642:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalXMachine.g:1649:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__UnorderedGroup_3 ) ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1653:1: ( ( ( rule__XEvent__UnorderedGroup_3 ) ) )
            // InternalXMachine.g:1654:1: ( ( rule__XEvent__UnorderedGroup_3 ) )
            {
            // InternalXMachine.g:1654:1: ( ( rule__XEvent__UnorderedGroup_3 ) )
            // InternalXMachine.g:1655:2: ( rule__XEvent__UnorderedGroup_3 )
            {
             before(grammarAccess.getXEventAccess().getUnorderedGroup_3()); 
            // InternalXMachine.g:1656:2: ( rule__XEvent__UnorderedGroup_3 )
            // InternalXMachine.g:1656:3: rule__XEvent__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getUnorderedGroup_3()); 

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
    // InternalXMachine.g:1664:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1668:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:1669:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalXMachine.g:1676:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__Group_4__0 )? ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1680:1: ( ( ( rule__XEvent__Group_4__0 )? ) )
            // InternalXMachine.g:1681:1: ( ( rule__XEvent__Group_4__0 )? )
            {
            // InternalXMachine.g:1681:1: ( ( rule__XEvent__Group_4__0 )? )
            // InternalXMachine.g:1682:2: ( rule__XEvent__Group_4__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_4()); 
            // InternalXMachine.g:1683:2: ( rule__XEvent__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:1683:3: rule__XEvent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_4()); 

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
    // InternalXMachine.g:1691:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1695:1: ( rule__XEvent__Group__5__Impl )
            // InternalXMachine.g:1696:2: rule__XEvent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__5__Impl();

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
    // InternalXMachine.g:1702:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Alternatives_5 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1706:1: ( ( ( rule__XEvent__Alternatives_5 )? ) )
            // InternalXMachine.g:1707:1: ( ( rule__XEvent__Alternatives_5 )? )
            {
            // InternalXMachine.g:1707:1: ( ( rule__XEvent__Alternatives_5 )? )
            // InternalXMachine.g:1708:2: ( rule__XEvent__Alternatives_5 )?
            {
             before(grammarAccess.getXEventAccess().getAlternatives_5()); 
            // InternalXMachine.g:1709:2: ( rule__XEvent__Alternatives_5 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=24 && LA29_0<=26)||LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXMachine.g:1709:3: rule__XEvent__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getAlternatives_5()); 

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


    // $ANTLR start "rule__XEvent__Group_4__0"
    // InternalXMachine.g:1718:1: rule__XEvent__Group_4__0 : rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1 ;
    public final void rule__XEvent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1722:1: ( rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1 )
            // InternalXMachine.g:1723:2: rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__XEvent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4__1();

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
    // $ANTLR end "rule__XEvent__Group_4__0"


    // $ANTLR start "rule__XEvent__Group_4__0__Impl"
    // InternalXMachine.g:1730:1: rule__XEvent__Group_4__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1734:1: ( ( 'refines' ) )
            // InternalXMachine.g:1735:1: ( 'refines' )
            {
            // InternalXMachine.g:1735:1: ( 'refines' )
            // InternalXMachine.g:1736:2: 'refines'
            {
             before(grammarAccess.getXEventAccess().getRefinesKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getRefinesKeyword_4_0()); 

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
    // $ANTLR end "rule__XEvent__Group_4__0__Impl"


    // $ANTLR start "rule__XEvent__Group_4__1"
    // InternalXMachine.g:1745:1: rule__XEvent__Group_4__1 : rule__XEvent__Group_4__1__Impl ;
    public final void rule__XEvent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1749:1: ( rule__XEvent__Group_4__1__Impl )
            // InternalXMachine.g:1750:2: rule__XEvent__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_4__1"


    // $ANTLR start "rule__XEvent__Group_4__1__Impl"
    // InternalXMachine.g:1756:1: rule__XEvent__Group_4__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) ) ;
    public final void rule__XEvent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1760:1: ( ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) ) )
            // InternalXMachine.g:1761:1: ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) )
            {
            // InternalXMachine.g:1761:1: ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) )
            // InternalXMachine.g:1762:2: ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* )
            {
            // InternalXMachine.g:1762:2: ( ( rule__XEvent__RefinesAssignment_4_1 ) )
            // InternalXMachine.g:1763:3: ( rule__XEvent__RefinesAssignment_4_1 )
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 
            // InternalXMachine.g:1764:3: ( rule__XEvent__RefinesAssignment_4_1 )
            // InternalXMachine.g:1764:4: rule__XEvent__RefinesAssignment_4_1
            {
            pushFollow(FOLLOW_6);
            rule__XEvent__RefinesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 

            }

            // InternalXMachine.g:1767:2: ( ( rule__XEvent__RefinesAssignment_4_1 )* )
            // InternalXMachine.g:1768:3: ( rule__XEvent__RefinesAssignment_4_1 )*
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 
            // InternalXMachine.g:1769:3: ( rule__XEvent__RefinesAssignment_4_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalXMachine.g:1769:4: rule__XEvent__RefinesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__XEvent__RefinesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 

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
    // $ANTLR end "rule__XEvent__Group_4__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0__0"
    // InternalXMachine.g:1779:1: rule__XEvent__Group_5_0__0 : rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 ;
    public final void rule__XEvent__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1783:1: ( rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 )
            // InternalXMachine.g:1784:2: rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1
            {
            pushFollow(FOLLOW_18);
            rule__XEvent__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__1();

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
    // $ANTLR end "rule__XEvent__Group_5_0__0"


    // $ANTLR start "rule__XEvent__Group_5_0__0__Impl"
    // InternalXMachine.g:1791:1: rule__XEvent__Group_5_0__0__Impl : ( ( rule__XEvent__Group_5_0_0__0 )? ) ;
    public final void rule__XEvent__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1795:1: ( ( ( rule__XEvent__Group_5_0_0__0 )? ) )
            // InternalXMachine.g:1796:1: ( ( rule__XEvent__Group_5_0_0__0 )? )
            {
            // InternalXMachine.g:1796:1: ( ( rule__XEvent__Group_5_0_0__0 )? )
            // InternalXMachine.g:1797:2: ( rule__XEvent__Group_5_0_0__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_0_0()); 
            // InternalXMachine.g:1798:2: ( rule__XEvent__Group_5_0_0__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXMachine.g:1798:3: rule__XEvent__Group_5_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_0_0()); 

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
    // $ANTLR end "rule__XEvent__Group_5_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0__1"
    // InternalXMachine.g:1806:1: rule__XEvent__Group_5_0__1 : rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2 ;
    public final void rule__XEvent__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1810:1: ( rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2 )
            // InternalXMachine.g:1811:2: rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__2();

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
    // $ANTLR end "rule__XEvent__Group_5_0__1"


    // $ANTLR start "rule__XEvent__Group_5_0__1__Impl"
    // InternalXMachine.g:1818:1: rule__XEvent__Group_5_0__1__Impl : ( 'begin' ) ;
    public final void rule__XEvent__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1822:1: ( ( 'begin' ) )
            // InternalXMachine.g:1823:1: ( 'begin' )
            {
            // InternalXMachine.g:1823:1: ( 'begin' )
            // InternalXMachine.g:1824:2: 'begin'
            {
             before(grammarAccess.getXEventAccess().getBeginKeyword_5_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getBeginKeyword_5_0_1()); 

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
    // $ANTLR end "rule__XEvent__Group_5_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0__2"
    // InternalXMachine.g:1833:1: rule__XEvent__Group_5_0__2 : rule__XEvent__Group_5_0__2__Impl rule__XEvent__Group_5_0__3 ;
    public final void rule__XEvent__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1837:1: ( rule__XEvent__Group_5_0__2__Impl rule__XEvent__Group_5_0__3 )
            // InternalXMachine.g:1838:2: rule__XEvent__Group_5_0__2__Impl rule__XEvent__Group_5_0__3
            {
            pushFollow(FOLLOW_19);
            rule__XEvent__Group_5_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__3();

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
    // $ANTLR end "rule__XEvent__Group_5_0__2"


    // $ANTLR start "rule__XEvent__Group_5_0__2__Impl"
    // InternalXMachine.g:1845:1: rule__XEvent__Group_5_0__2__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) ) ;
    public final void rule__XEvent__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1849:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) ) )
            // InternalXMachine.g:1850:1: ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) )
            {
            // InternalXMachine.g:1850:1: ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) )
            // InternalXMachine.g:1851:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* )
            {
            // InternalXMachine.g:1851:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 ) )
            // InternalXMachine.g:1852:3: ( rule__XEvent__ActionsAssignment_5_0_2 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 
            // InternalXMachine.g:1853:3: ( rule__XEvent__ActionsAssignment_5_0_2 )
            // InternalXMachine.g:1853:4: rule__XEvent__ActionsAssignment_5_0_2
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_5_0_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 

            }

            // InternalXMachine.g:1856:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 )* )
            // InternalXMachine.g:1857:3: ( rule__XEvent__ActionsAssignment_5_0_2 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 
            // InternalXMachine.g:1858:3: ( rule__XEvent__ActionsAssignment_5_0_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_ML_COMMENT && LA32_0<=RULE_SL_COMMENT)||LA32_0==RULE_XLABEL) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXMachine.g:1858:4: rule__XEvent__ActionsAssignment_5_0_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_5_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 

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
    // $ANTLR end "rule__XEvent__Group_5_0__2__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0__3"
    // InternalXMachine.g:1867:1: rule__XEvent__Group_5_0__3 : rule__XEvent__Group_5_0__3__Impl ;
    public final void rule__XEvent__Group_5_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1871:1: ( rule__XEvent__Group_5_0__3__Impl )
            // InternalXMachine.g:1872:2: rule__XEvent__Group_5_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__3__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_0__3"


    // $ANTLR start "rule__XEvent__Group_5_0__3__Impl"
    // InternalXMachine.g:1878:1: rule__XEvent__Group_5_0__3__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group_5_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1882:1: ( ( 'end' ) )
            // InternalXMachine.g:1883:1: ( 'end' )
            {
            // InternalXMachine.g:1883:1: ( 'end' )
            // InternalXMachine.g:1884:2: 'end'
            {
             before(grammarAccess.getXEventAccess().getEndKeyword_5_0_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEndKeyword_5_0_3()); 

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
    // $ANTLR end "rule__XEvent__Group_5_0__3__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0_0__0"
    // InternalXMachine.g:1894:1: rule__XEvent__Group_5_0_0__0 : rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1 ;
    public final void rule__XEvent__Group_5_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1898:1: ( rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1 )
            // InternalXMachine.g:1899:2: rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0_0__1();

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
    // $ANTLR end "rule__XEvent__Group_5_0_0__0"


    // $ANTLR start "rule__XEvent__Group_5_0_0__0__Impl"
    // InternalXMachine.g:1906:1: rule__XEvent__Group_5_0_0__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1910:1: ( ( 'with' ) )
            // InternalXMachine.g:1911:1: ( 'with' )
            {
            // InternalXMachine.g:1911:1: ( 'with' )
            // InternalXMachine.g:1912:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_0_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_5_0_0_0()); 

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
    // $ANTLR end "rule__XEvent__Group_5_0_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0_0__1"
    // InternalXMachine.g:1921:1: rule__XEvent__Group_5_0_0__1 : rule__XEvent__Group_5_0_0__1__Impl ;
    public final void rule__XEvent__Group_5_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1925:1: ( rule__XEvent__Group_5_0_0__1__Impl )
            // InternalXMachine.g:1926:2: rule__XEvent__Group_5_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0_0__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_0_0__1"


    // $ANTLR start "rule__XEvent__Group_5_0_0__1__Impl"
    // InternalXMachine.g:1932:1: rule__XEvent__Group_5_0_0__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) ) ;
    public final void rule__XEvent__Group_5_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1936:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) ) )
            // InternalXMachine.g:1937:1: ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) )
            {
            // InternalXMachine.g:1937:1: ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) )
            // InternalXMachine.g:1938:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* )
            {
            // InternalXMachine.g:1938:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) )
            // InternalXMachine.g:1939:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 
            // InternalXMachine.g:1940:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )
            // InternalXMachine.g:1940:4: rule__XEvent__WitnessesAssignment_5_0_0_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_5_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 

            }

            // InternalXMachine.g:1943:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* )
            // InternalXMachine.g:1944:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 
            // InternalXMachine.g:1945:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ML_COMMENT && LA33_0<=RULE_SL_COMMENT)||LA33_0==RULE_XLABEL) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXMachine.g:1945:4: rule__XEvent__WitnessesAssignment_5_0_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_5_0_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 

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
    // $ANTLR end "rule__XEvent__Group_5_0_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__0"
    // InternalXMachine.g:1955:1: rule__XEvent__Group_5_1__0 : rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 ;
    public final void rule__XEvent__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1959:1: ( rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 )
            // InternalXMachine.g:1960:2: rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__1();

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
    // $ANTLR end "rule__XEvent__Group_5_1__0"


    // $ANTLR start "rule__XEvent__Group_5_1__0__Impl"
    // InternalXMachine.g:1967:1: rule__XEvent__Group_5_1__0__Impl : ( 'when' ) ;
    public final void rule__XEvent__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1971:1: ( ( 'when' ) )
            // InternalXMachine.g:1972:1: ( 'when' )
            {
            // InternalXMachine.g:1972:1: ( 'when' )
            // InternalXMachine.g:1973:2: 'when'
            {
             before(grammarAccess.getXEventAccess().getWhenKeyword_5_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWhenKeyword_5_1_0()); 

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
    // $ANTLR end "rule__XEvent__Group_5_1__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__1"
    // InternalXMachine.g:1982:1: rule__XEvent__Group_5_1__1 : rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2 ;
    public final void rule__XEvent__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1986:1: ( rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2 )
            // InternalXMachine.g:1987:2: rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2
            {
            pushFollow(FOLLOW_20);
            rule__XEvent__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__2();

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
    // $ANTLR end "rule__XEvent__Group_5_1__1"


    // $ANTLR start "rule__XEvent__Group_5_1__1__Impl"
    // InternalXMachine.g:1994:1: rule__XEvent__Group_5_1__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1998:1: ( ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) ) )
            // InternalXMachine.g:1999:1: ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) )
            {
            // InternalXMachine.g:1999:1: ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) )
            // InternalXMachine.g:2000:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* )
            {
            // InternalXMachine.g:2000:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 ) )
            // InternalXMachine.g:2001:3: ( rule__XEvent__GuardsAssignment_5_1_1 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 
            // InternalXMachine.g:2002:3: ( rule__XEvent__GuardsAssignment_5_1_1 )
            // InternalXMachine.g:2002:4: rule__XEvent__GuardsAssignment_5_1_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 

            }

            // InternalXMachine.g:2005:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 )* )
            // InternalXMachine.g:2006:3: ( rule__XEvent__GuardsAssignment_5_1_1 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 
            // InternalXMachine.g:2007:3: ( rule__XEvent__GuardsAssignment_5_1_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ML_COMMENT && LA34_0<=RULE_SL_COMMENT)||LA34_0==RULE_XLABEL) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXMachine.g:2007:4: rule__XEvent__GuardsAssignment_5_1_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_5_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 

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
    // $ANTLR end "rule__XEvent__Group_5_1__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__2"
    // InternalXMachine.g:2016:1: rule__XEvent__Group_5_1__2 : rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3 ;
    public final void rule__XEvent__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2020:1: ( rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3 )
            // InternalXMachine.g:2021:2: rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3
            {
            pushFollow(FOLLOW_20);
            rule__XEvent__Group_5_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__3();

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
    // $ANTLR end "rule__XEvent__Group_5_1__2"


    // $ANTLR start "rule__XEvent__Group_5_1__2__Impl"
    // InternalXMachine.g:2028:1: rule__XEvent__Group_5_1__2__Impl : ( ( rule__XEvent__Group_5_1_2__0 )? ) ;
    public final void rule__XEvent__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2032:1: ( ( ( rule__XEvent__Group_5_1_2__0 )? ) )
            // InternalXMachine.g:2033:1: ( ( rule__XEvent__Group_5_1_2__0 )? )
            {
            // InternalXMachine.g:2033:1: ( ( rule__XEvent__Group_5_1_2__0 )? )
            // InternalXMachine.g:2034:2: ( rule__XEvent__Group_5_1_2__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_1_2()); 
            // InternalXMachine.g:2035:2: ( rule__XEvent__Group_5_1_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXMachine.g:2035:3: rule__XEvent__Group_5_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_1_2()); 

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
    // $ANTLR end "rule__XEvent__Group_5_1__2__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__3"
    // InternalXMachine.g:2043:1: rule__XEvent__Group_5_1__3 : rule__XEvent__Group_5_1__3__Impl rule__XEvent__Group_5_1__4 ;
    public final void rule__XEvent__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2047:1: ( rule__XEvent__Group_5_1__3__Impl rule__XEvent__Group_5_1__4 )
            // InternalXMachine.g:2048:2: rule__XEvent__Group_5_1__3__Impl rule__XEvent__Group_5_1__4
            {
            pushFollow(FOLLOW_20);
            rule__XEvent__Group_5_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__4();

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
    // $ANTLR end "rule__XEvent__Group_5_1__3"


    // $ANTLR start "rule__XEvent__Group_5_1__3__Impl"
    // InternalXMachine.g:2055:1: rule__XEvent__Group_5_1__3__Impl : ( ( rule__XEvent__Group_5_1_3__0 )? ) ;
    public final void rule__XEvent__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2059:1: ( ( ( rule__XEvent__Group_5_1_3__0 )? ) )
            // InternalXMachine.g:2060:1: ( ( rule__XEvent__Group_5_1_3__0 )? )
            {
            // InternalXMachine.g:2060:1: ( ( rule__XEvent__Group_5_1_3__0 )? )
            // InternalXMachine.g:2061:2: ( rule__XEvent__Group_5_1_3__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_1_3()); 
            // InternalXMachine.g:2062:2: ( rule__XEvent__Group_5_1_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXMachine.g:2062:3: rule__XEvent__Group_5_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_1_3()); 

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
    // $ANTLR end "rule__XEvent__Group_5_1__3__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__4"
    // InternalXMachine.g:2070:1: rule__XEvent__Group_5_1__4 : rule__XEvent__Group_5_1__4__Impl ;
    public final void rule__XEvent__Group_5_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2074:1: ( rule__XEvent__Group_5_1__4__Impl )
            // InternalXMachine.g:2075:2: rule__XEvent__Group_5_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__4__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_1__4"


    // $ANTLR start "rule__XEvent__Group_5_1__4__Impl"
    // InternalXMachine.g:2081:1: rule__XEvent__Group_5_1__4__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group_5_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2085:1: ( ( 'end' ) )
            // InternalXMachine.g:2086:1: ( 'end' )
            {
            // InternalXMachine.g:2086:1: ( 'end' )
            // InternalXMachine.g:2087:2: 'end'
            {
             before(grammarAccess.getXEventAccess().getEndKeyword_5_1_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEndKeyword_5_1_4()); 

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
    // $ANTLR end "rule__XEvent__Group_5_1__4__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_2__0"
    // InternalXMachine.g:2097:1: rule__XEvent__Group_5_1_2__0 : rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1 ;
    public final void rule__XEvent__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2101:1: ( rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1 )
            // InternalXMachine.g:2102:2: rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_2__1();

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
    // $ANTLR end "rule__XEvent__Group_5_1_2__0"


    // $ANTLR start "rule__XEvent__Group_5_1_2__0__Impl"
    // InternalXMachine.g:2109:1: rule__XEvent__Group_5_1_2__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2113:1: ( ( 'with' ) )
            // InternalXMachine.g:2114:1: ( 'with' )
            {
            // InternalXMachine.g:2114:1: ( 'with' )
            // InternalXMachine.g:2115:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_1_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_5_1_2_0()); 

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
    // $ANTLR end "rule__XEvent__Group_5_1_2__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_2__1"
    // InternalXMachine.g:2124:1: rule__XEvent__Group_5_1_2__1 : rule__XEvent__Group_5_1_2__1__Impl ;
    public final void rule__XEvent__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2128:1: ( rule__XEvent__Group_5_1_2__1__Impl )
            // InternalXMachine.g:2129:2: rule__XEvent__Group_5_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_2__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_1_2__1"


    // $ANTLR start "rule__XEvent__Group_5_1_2__1__Impl"
    // InternalXMachine.g:2135:1: rule__XEvent__Group_5_1_2__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2139:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) ) )
            // InternalXMachine.g:2140:1: ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) )
            {
            // InternalXMachine.g:2140:1: ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) )
            // InternalXMachine.g:2141:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* )
            {
            // InternalXMachine.g:2141:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) )
            // InternalXMachine.g:2142:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 
            // InternalXMachine.g:2143:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )
            // InternalXMachine.g:2143:4: rule__XEvent__WitnessesAssignment_5_1_2_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_5_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 

            }

            // InternalXMachine.g:2146:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* )
            // InternalXMachine.g:2147:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 
            // InternalXMachine.g:2148:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_ML_COMMENT && LA37_0<=RULE_SL_COMMENT)||LA37_0==RULE_XLABEL) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXMachine.g:2148:4: rule__XEvent__WitnessesAssignment_5_1_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_5_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 

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
    // $ANTLR end "rule__XEvent__Group_5_1_2__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_3__0"
    // InternalXMachine.g:2158:1: rule__XEvent__Group_5_1_3__0 : rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1 ;
    public final void rule__XEvent__Group_5_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2162:1: ( rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1 )
            // InternalXMachine.g:2163:2: rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_3__1();

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
    // $ANTLR end "rule__XEvent__Group_5_1_3__0"


    // $ANTLR start "rule__XEvent__Group_5_1_3__0__Impl"
    // InternalXMachine.g:2170:1: rule__XEvent__Group_5_1_3__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_5_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2174:1: ( ( 'then' ) )
            // InternalXMachine.g:2175:1: ( 'then' )
            {
            // InternalXMachine.g:2175:1: ( 'then' )
            // InternalXMachine.g:2176:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_5_1_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getThenKeyword_5_1_3_0()); 

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
    // $ANTLR end "rule__XEvent__Group_5_1_3__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_3__1"
    // InternalXMachine.g:2185:1: rule__XEvent__Group_5_1_3__1 : rule__XEvent__Group_5_1_3__1__Impl ;
    public final void rule__XEvent__Group_5_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2189:1: ( rule__XEvent__Group_5_1_3__1__Impl )
            // InternalXMachine.g:2190:2: rule__XEvent__Group_5_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_3__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_1_3__1"


    // $ANTLR start "rule__XEvent__Group_5_1_3__1__Impl"
    // InternalXMachine.g:2196:1: rule__XEvent__Group_5_1_3__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2200:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) ) )
            // InternalXMachine.g:2201:1: ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) )
            {
            // InternalXMachine.g:2201:1: ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) )
            // InternalXMachine.g:2202:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* )
            {
            // InternalXMachine.g:2202:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) )
            // InternalXMachine.g:2203:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 
            // InternalXMachine.g:2204:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )
            // InternalXMachine.g:2204:4: rule__XEvent__ActionsAssignment_5_1_3_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_5_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 

            }

            // InternalXMachine.g:2207:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* )
            // InternalXMachine.g:2208:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 
            // InternalXMachine.g:2209:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_ML_COMMENT && LA38_0<=RULE_SL_COMMENT)||LA38_0==RULE_XLABEL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalXMachine.g:2209:4: rule__XEvent__ActionsAssignment_5_1_3_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_5_1_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 

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
    // $ANTLR end "rule__XEvent__Group_5_1_3__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__0"
    // InternalXMachine.g:2219:1: rule__XEvent__Group_5_2__0 : rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1 ;
    public final void rule__XEvent__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2223:1: ( rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1 )
            // InternalXMachine.g:2224:2: rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1
            {
            pushFollow(FOLLOW_7);
            rule__XEvent__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__1();

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
    // $ANTLR end "rule__XEvent__Group_5_2__0"


    // $ANTLR start "rule__XEvent__Group_5_2__0__Impl"
    // InternalXMachine.g:2231:1: rule__XEvent__Group_5_2__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2235:1: ( ( 'any' ) )
            // InternalXMachine.g:2236:1: ( 'any' )
            {
            // InternalXMachine.g:2236:1: ( 'any' )
            // InternalXMachine.g:2237:2: 'any'
            {
             before(grammarAccess.getXEventAccess().getAnyKeyword_5_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getAnyKeyword_5_2_0()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__1"
    // InternalXMachine.g:2246:1: rule__XEvent__Group_5_2__1 : rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2 ;
    public final void rule__XEvent__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2250:1: ( rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2 )
            // InternalXMachine.g:2251:2: rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2
            {
            pushFollow(FOLLOW_21);
            rule__XEvent__Group_5_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__2();

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
    // $ANTLR end "rule__XEvent__Group_5_2__1"


    // $ANTLR start "rule__XEvent__Group_5_2__1__Impl"
    // InternalXMachine.g:2258:1: rule__XEvent__Group_5_2__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2262:1: ( ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) ) )
            // InternalXMachine.g:2263:1: ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) )
            {
            // InternalXMachine.g:2263:1: ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) )
            // InternalXMachine.g:2264:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* )
            {
            // InternalXMachine.g:2264:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 ) )
            // InternalXMachine.g:2265:3: ( rule__XEvent__ParametersAssignment_5_2_1 )
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 
            // InternalXMachine.g:2266:3: ( rule__XEvent__ParametersAssignment_5_2_1 )
            // InternalXMachine.g:2266:4: rule__XEvent__ParametersAssignment_5_2_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__ParametersAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 

            }

            // InternalXMachine.g:2269:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 )* )
            // InternalXMachine.g:2270:3: ( rule__XEvent__ParametersAssignment_5_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 
            // InternalXMachine.g:2271:3: ( rule__XEvent__ParametersAssignment_5_2_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_ML_COMMENT && LA39_0<=RULE_ID)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:2271:4: rule__XEvent__ParametersAssignment_5_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__ParametersAssignment_5_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__2"
    // InternalXMachine.g:2280:1: rule__XEvent__Group_5_2__2 : rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3 ;
    public final void rule__XEvent__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2284:1: ( rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3 )
            // InternalXMachine.g:2285:2: rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__3();

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
    // $ANTLR end "rule__XEvent__Group_5_2__2"


    // $ANTLR start "rule__XEvent__Group_5_2__2__Impl"
    // InternalXMachine.g:2292:1: rule__XEvent__Group_5_2__2__Impl : ( 'where' ) ;
    public final void rule__XEvent__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2296:1: ( ( 'where' ) )
            // InternalXMachine.g:2297:1: ( 'where' )
            {
            // InternalXMachine.g:2297:1: ( 'where' )
            // InternalXMachine.g:2298:2: 'where'
            {
             before(grammarAccess.getXEventAccess().getWhereKeyword_5_2_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWhereKeyword_5_2_2()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2__2__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__3"
    // InternalXMachine.g:2307:1: rule__XEvent__Group_5_2__3 : rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4 ;
    public final void rule__XEvent__Group_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2311:1: ( rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4 )
            // InternalXMachine.g:2312:2: rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4
            {
            pushFollow(FOLLOW_20);
            rule__XEvent__Group_5_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__4();

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
    // $ANTLR end "rule__XEvent__Group_5_2__3"


    // $ANTLR start "rule__XEvent__Group_5_2__3__Impl"
    // InternalXMachine.g:2319:1: rule__XEvent__Group_5_2__3__Impl : ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) ) ;
    public final void rule__XEvent__Group_5_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2323:1: ( ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) ) )
            // InternalXMachine.g:2324:1: ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) )
            {
            // InternalXMachine.g:2324:1: ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) )
            // InternalXMachine.g:2325:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* )
            {
            // InternalXMachine.g:2325:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 ) )
            // InternalXMachine.g:2326:3: ( rule__XEvent__GuardsAssignment_5_2_3 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 
            // InternalXMachine.g:2327:3: ( rule__XEvent__GuardsAssignment_5_2_3 )
            // InternalXMachine.g:2327:4: rule__XEvent__GuardsAssignment_5_2_3
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_5_2_3();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 

            }

            // InternalXMachine.g:2330:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 )* )
            // InternalXMachine.g:2331:3: ( rule__XEvent__GuardsAssignment_5_2_3 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 
            // InternalXMachine.g:2332:3: ( rule__XEvent__GuardsAssignment_5_2_3 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_ML_COMMENT && LA40_0<=RULE_SL_COMMENT)||LA40_0==RULE_XLABEL) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalXMachine.g:2332:4: rule__XEvent__GuardsAssignment_5_2_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_5_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2__3__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__4"
    // InternalXMachine.g:2341:1: rule__XEvent__Group_5_2__4 : rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5 ;
    public final void rule__XEvent__Group_5_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2345:1: ( rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5 )
            // InternalXMachine.g:2346:2: rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5
            {
            pushFollow(FOLLOW_20);
            rule__XEvent__Group_5_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__5();

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
    // $ANTLR end "rule__XEvent__Group_5_2__4"


    // $ANTLR start "rule__XEvent__Group_5_2__4__Impl"
    // InternalXMachine.g:2353:1: rule__XEvent__Group_5_2__4__Impl : ( ( rule__XEvent__Group_5_2_4__0 )? ) ;
    public final void rule__XEvent__Group_5_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2357:1: ( ( ( rule__XEvent__Group_5_2_4__0 )? ) )
            // InternalXMachine.g:2358:1: ( ( rule__XEvent__Group_5_2_4__0 )? )
            {
            // InternalXMachine.g:2358:1: ( ( rule__XEvent__Group_5_2_4__0 )? )
            // InternalXMachine.g:2359:2: ( rule__XEvent__Group_5_2_4__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_2_4()); 
            // InternalXMachine.g:2360:2: ( rule__XEvent__Group_5_2_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:2360:3: rule__XEvent__Group_5_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_2_4()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2__4__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__5"
    // InternalXMachine.g:2368:1: rule__XEvent__Group_5_2__5 : rule__XEvent__Group_5_2__5__Impl rule__XEvent__Group_5_2__6 ;
    public final void rule__XEvent__Group_5_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2372:1: ( rule__XEvent__Group_5_2__5__Impl rule__XEvent__Group_5_2__6 )
            // InternalXMachine.g:2373:2: rule__XEvent__Group_5_2__5__Impl rule__XEvent__Group_5_2__6
            {
            pushFollow(FOLLOW_20);
            rule__XEvent__Group_5_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__6();

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
    // $ANTLR end "rule__XEvent__Group_5_2__5"


    // $ANTLR start "rule__XEvent__Group_5_2__5__Impl"
    // InternalXMachine.g:2380:1: rule__XEvent__Group_5_2__5__Impl : ( ( rule__XEvent__Group_5_2_5__0 )? ) ;
    public final void rule__XEvent__Group_5_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2384:1: ( ( ( rule__XEvent__Group_5_2_5__0 )? ) )
            // InternalXMachine.g:2385:1: ( ( rule__XEvent__Group_5_2_5__0 )? )
            {
            // InternalXMachine.g:2385:1: ( ( rule__XEvent__Group_5_2_5__0 )? )
            // InternalXMachine.g:2386:2: ( rule__XEvent__Group_5_2_5__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_2_5()); 
            // InternalXMachine.g:2387:2: ( rule__XEvent__Group_5_2_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:2387:3: rule__XEvent__Group_5_2_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_2_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_2_5()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2__5__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__6"
    // InternalXMachine.g:2395:1: rule__XEvent__Group_5_2__6 : rule__XEvent__Group_5_2__6__Impl ;
    public final void rule__XEvent__Group_5_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2399:1: ( rule__XEvent__Group_5_2__6__Impl )
            // InternalXMachine.g:2400:2: rule__XEvent__Group_5_2__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__6__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_2__6"


    // $ANTLR start "rule__XEvent__Group_5_2__6__Impl"
    // InternalXMachine.g:2406:1: rule__XEvent__Group_5_2__6__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group_5_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2410:1: ( ( 'end' ) )
            // InternalXMachine.g:2411:1: ( 'end' )
            {
            // InternalXMachine.g:2411:1: ( 'end' )
            // InternalXMachine.g:2412:2: 'end'
            {
             before(grammarAccess.getXEventAccess().getEndKeyword_5_2_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEndKeyword_5_2_6()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2__6__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_4__0"
    // InternalXMachine.g:2422:1: rule__XEvent__Group_5_2_4__0 : rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1 ;
    public final void rule__XEvent__Group_5_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2426:1: ( rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1 )
            // InternalXMachine.g:2427:2: rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_4__1();

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
    // $ANTLR end "rule__XEvent__Group_5_2_4__0"


    // $ANTLR start "rule__XEvent__Group_5_2_4__0__Impl"
    // InternalXMachine.g:2434:1: rule__XEvent__Group_5_2_4__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2438:1: ( ( 'with' ) )
            // InternalXMachine.g:2439:1: ( 'with' )
            {
            // InternalXMachine.g:2439:1: ( 'with' )
            // InternalXMachine.g:2440:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_2_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_5_2_4_0()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2_4__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_4__1"
    // InternalXMachine.g:2449:1: rule__XEvent__Group_5_2_4__1 : rule__XEvent__Group_5_2_4__1__Impl ;
    public final void rule__XEvent__Group_5_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2453:1: ( rule__XEvent__Group_5_2_4__1__Impl )
            // InternalXMachine.g:2454:2: rule__XEvent__Group_5_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_4__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_2_4__1"


    // $ANTLR start "rule__XEvent__Group_5_2_4__1__Impl"
    // InternalXMachine.g:2460:1: rule__XEvent__Group_5_2_4__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2464:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) ) )
            // InternalXMachine.g:2465:1: ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) )
            {
            // InternalXMachine.g:2465:1: ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) )
            // InternalXMachine.g:2466:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* )
            {
            // InternalXMachine.g:2466:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) )
            // InternalXMachine.g:2467:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 
            // InternalXMachine.g:2468:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )
            // InternalXMachine.g:2468:4: rule__XEvent__WitnessesAssignment_5_2_4_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_5_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 

            }

            // InternalXMachine.g:2471:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* )
            // InternalXMachine.g:2472:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 
            // InternalXMachine.g:2473:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_ML_COMMENT && LA43_0<=RULE_SL_COMMENT)||LA43_0==RULE_XLABEL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXMachine.g:2473:4: rule__XEvent__WitnessesAssignment_5_2_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_5_2_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2_4__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_5__0"
    // InternalXMachine.g:2483:1: rule__XEvent__Group_5_2_5__0 : rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1 ;
    public final void rule__XEvent__Group_5_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2487:1: ( rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1 )
            // InternalXMachine.g:2488:2: rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_5__1();

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
    // $ANTLR end "rule__XEvent__Group_5_2_5__0"


    // $ANTLR start "rule__XEvent__Group_5_2_5__0__Impl"
    // InternalXMachine.g:2495:1: rule__XEvent__Group_5_2_5__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_5_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2499:1: ( ( 'then' ) )
            // InternalXMachine.g:2500:1: ( 'then' )
            {
            // InternalXMachine.g:2500:1: ( 'then' )
            // InternalXMachine.g:2501:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_5_2_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getThenKeyword_5_2_5_0()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2_5__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_5__1"
    // InternalXMachine.g:2510:1: rule__XEvent__Group_5_2_5__1 : rule__XEvent__Group_5_2_5__1__Impl ;
    public final void rule__XEvent__Group_5_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2514:1: ( rule__XEvent__Group_5_2_5__1__Impl )
            // InternalXMachine.g:2515:2: rule__XEvent__Group_5_2_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_5__1__Impl();

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
    // $ANTLR end "rule__XEvent__Group_5_2_5__1"


    // $ANTLR start "rule__XEvent__Group_5_2_5__1__Impl"
    // InternalXMachine.g:2521:1: rule__XEvent__Group_5_2_5__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2525:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) ) )
            // InternalXMachine.g:2526:1: ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) )
            {
            // InternalXMachine.g:2526:1: ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) )
            // InternalXMachine.g:2527:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* )
            {
            // InternalXMachine.g:2527:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) )
            // InternalXMachine.g:2528:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 
            // InternalXMachine.g:2529:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )
            // InternalXMachine.g:2529:4: rule__XEvent__ActionsAssignment_5_2_5_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_5_2_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 

            }

            // InternalXMachine.g:2532:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* )
            // InternalXMachine.g:2533:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 
            // InternalXMachine.g:2534:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ML_COMMENT && LA44_0<=RULE_SL_COMMENT)||LA44_0==RULE_XLABEL) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalXMachine.g:2534:4: rule__XEvent__ActionsAssignment_5_2_5_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_5_2_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 

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
    // $ANTLR end "rule__XEvent__Group_5_2_5__1__Impl"


    // $ANTLR start "rule__XParameter__Group__0"
    // InternalXMachine.g:2544:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2548:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:2549:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
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
    // InternalXMachine.g:2556:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2560:1: ( ( () ) )
            // InternalXMachine.g:2561:1: ( () )
            {
            // InternalXMachine.g:2561:1: ( () )
            // InternalXMachine.g:2562:2: ()
            {
             before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            // InternalXMachine.g:2563:2: ()
            // InternalXMachine.g:2563:3: 
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
    // InternalXMachine.g:2571:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl rule__XParameter__Group__2 ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2575:1: ( rule__XParameter__Group__1__Impl rule__XParameter__Group__2 )
            // InternalXMachine.g:2576:2: rule__XParameter__Group__1__Impl rule__XParameter__Group__2
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
    // InternalXMachine.g:2583:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__CommentAssignment_1 )? ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2587:1: ( ( ( rule__XParameter__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2588:1: ( ( rule__XParameter__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2588:1: ( ( rule__XParameter__CommentAssignment_1 )? )
            // InternalXMachine.g:2589:2: ( rule__XParameter__CommentAssignment_1 )?
            {
             before(grammarAccess.getXParameterAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2590:2: ( rule__XParameter__CommentAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ML_COMMENT && LA45_0<=RULE_SL_COMMENT)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:2590:3: rule__XParameter__CommentAssignment_1
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
    // InternalXMachine.g:2598:1: rule__XParameter__Group__2 : rule__XParameter__Group__2__Impl ;
    public final void rule__XParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2602:1: ( rule__XParameter__Group__2__Impl )
            // InternalXMachine.g:2603:2: rule__XParameter__Group__2__Impl
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
    // InternalXMachine.g:2609:1: rule__XParameter__Group__2__Impl : ( ( rule__XParameter__NameAssignment_2 ) ) ;
    public final void rule__XParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2613:1: ( ( ( rule__XParameter__NameAssignment_2 ) ) )
            // InternalXMachine.g:2614:1: ( ( rule__XParameter__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2614:1: ( ( rule__XParameter__NameAssignment_2 ) )
            // InternalXMachine.g:2615:2: ( rule__XParameter__NameAssignment_2 )
            {
             before(grammarAccess.getXParameterAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2616:2: ( rule__XParameter__NameAssignment_2 )
            // InternalXMachine.g:2616:3: rule__XParameter__NameAssignment_2
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
    // InternalXMachine.g:2625:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2629:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:2630:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
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
    // InternalXMachine.g:2637:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2641:1: ( ( () ) )
            // InternalXMachine.g:2642:1: ( () )
            {
            // InternalXMachine.g:2642:1: ( () )
            // InternalXMachine.g:2643:2: ()
            {
             before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            // InternalXMachine.g:2644:2: ()
            // InternalXMachine.g:2644:3: 
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
    // InternalXMachine.g:2652:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2656:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:2657:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
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
    // InternalXMachine.g:2664:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__CommentAssignment_1 )? ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2668:1: ( ( ( rule__XGuard__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2669:1: ( ( rule__XGuard__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2669:1: ( ( rule__XGuard__CommentAssignment_1 )? )
            // InternalXMachine.g:2670:2: ( rule__XGuard__CommentAssignment_1 )?
            {
             before(grammarAccess.getXGuardAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2671:2: ( rule__XGuard__CommentAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ML_COMMENT && LA46_0<=RULE_SL_COMMENT)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:2671:3: rule__XGuard__CommentAssignment_1
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
    // InternalXMachine.g:2679:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2683:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:2684:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:2691:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__NameAssignment_2 ) ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2695:1: ( ( ( rule__XGuard__NameAssignment_2 ) ) )
            // InternalXMachine.g:2696:1: ( ( rule__XGuard__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2696:1: ( ( rule__XGuard__NameAssignment_2 ) )
            // InternalXMachine.g:2697:2: ( rule__XGuard__NameAssignment_2 )
            {
             before(grammarAccess.getXGuardAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2698:2: ( rule__XGuard__NameAssignment_2 )
            // InternalXMachine.g:2698:3: rule__XGuard__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getNameAssignment_2()); 

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
    // InternalXMachine.g:2706:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl rule__XGuard__Group__4 ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2710:1: ( rule__XGuard__Group__3__Impl rule__XGuard__Group__4 )
            // InternalXMachine.g:2711:2: rule__XGuard__Group__3__Impl rule__XGuard__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalXMachine.g:2718:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__PredicateAssignment_3 ) ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2722:1: ( ( ( rule__XGuard__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:2723:1: ( ( rule__XGuard__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:2723:1: ( ( rule__XGuard__PredicateAssignment_3 ) )
            // InternalXMachine.g:2724:2: ( rule__XGuard__PredicateAssignment_3 )
            {
             before(grammarAccess.getXGuardAccess().getPredicateAssignment_3()); 
            // InternalXMachine.g:2725:2: ( rule__XGuard__PredicateAssignment_3 )
            // InternalXMachine.g:2725:3: rule__XGuard__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getPredicateAssignment_3()); 

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
    // InternalXMachine.g:2733:1: rule__XGuard__Group__4 : rule__XGuard__Group__4__Impl ;
    public final void rule__XGuard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2737:1: ( rule__XGuard__Group__4__Impl )
            // InternalXMachine.g:2738:2: rule__XGuard__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__4__Impl();

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
    // InternalXMachine.g:2744:1: rule__XGuard__Group__4__Impl : ( ( rule__XGuard__TheoremAssignment_4 )? ) ;
    public final void rule__XGuard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2748:1: ( ( ( rule__XGuard__TheoremAssignment_4 )? ) )
            // InternalXMachine.g:2749:1: ( ( rule__XGuard__TheoremAssignment_4 )? )
            {
            // InternalXMachine.g:2749:1: ( ( rule__XGuard__TheoremAssignment_4 )? )
            // InternalXMachine.g:2750:2: ( rule__XGuard__TheoremAssignment_4 )?
            {
             before(grammarAccess.getXGuardAccess().getTheoremAssignment_4()); 
            // InternalXMachine.g:2751:2: ( rule__XGuard__TheoremAssignment_4 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:2751:3: rule__XGuard__TheoremAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__TheoremAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGuardAccess().getTheoremAssignment_4()); 

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


    // $ANTLR start "rule__XWitness__Group__0"
    // InternalXMachine.g:2760:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2764:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:2765:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
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
    // InternalXMachine.g:2772:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2776:1: ( ( () ) )
            // InternalXMachine.g:2777:1: ( () )
            {
            // InternalXMachine.g:2777:1: ( () )
            // InternalXMachine.g:2778:2: ()
            {
             before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            // InternalXMachine.g:2779:2: ()
            // InternalXMachine.g:2779:3: 
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
    // InternalXMachine.g:2787:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2791:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:2792:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
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
    // InternalXMachine.g:2799:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__CommentAssignment_1 )? ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2803:1: ( ( ( rule__XWitness__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2804:1: ( ( rule__XWitness__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2804:1: ( ( rule__XWitness__CommentAssignment_1 )? )
            // InternalXMachine.g:2805:2: ( rule__XWitness__CommentAssignment_1 )?
            {
             before(grammarAccess.getXWitnessAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2806:2: ( rule__XWitness__CommentAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ML_COMMENT && LA48_0<=RULE_SL_COMMENT)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:2806:3: rule__XWitness__CommentAssignment_1
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
    // InternalXMachine.g:2814:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl rule__XWitness__Group__3 ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2818:1: ( rule__XWitness__Group__2__Impl rule__XWitness__Group__3 )
            // InternalXMachine.g:2819:2: rule__XWitness__Group__2__Impl rule__XWitness__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:2826:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__NameAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2830:1: ( ( ( rule__XWitness__NameAssignment_2 ) ) )
            // InternalXMachine.g:2831:1: ( ( rule__XWitness__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2831:1: ( ( rule__XWitness__NameAssignment_2 ) )
            // InternalXMachine.g:2832:2: ( rule__XWitness__NameAssignment_2 )
            {
             before(grammarAccess.getXWitnessAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2833:2: ( rule__XWitness__NameAssignment_2 )
            // InternalXMachine.g:2833:3: rule__XWitness__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getNameAssignment_2()); 

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
    // InternalXMachine.g:2841:1: rule__XWitness__Group__3 : rule__XWitness__Group__3__Impl ;
    public final void rule__XWitness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2845:1: ( rule__XWitness__Group__3__Impl )
            // InternalXMachine.g:2846:2: rule__XWitness__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__3__Impl();

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
    // InternalXMachine.g:2852:1: rule__XWitness__Group__3__Impl : ( ( rule__XWitness__PredicateAssignment_3 ) ) ;
    public final void rule__XWitness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2856:1: ( ( ( rule__XWitness__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:2857:1: ( ( rule__XWitness__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:2857:1: ( ( rule__XWitness__PredicateAssignment_3 ) )
            // InternalXMachine.g:2858:2: ( rule__XWitness__PredicateAssignment_3 )
            {
             before(grammarAccess.getXWitnessAccess().getPredicateAssignment_3()); 
            // InternalXMachine.g:2859:2: ( rule__XWitness__PredicateAssignment_3 )
            // InternalXMachine.g:2859:3: rule__XWitness__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getPredicateAssignment_3()); 

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


    // $ANTLR start "rule__XAction__Group__0"
    // InternalXMachine.g:2868:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2872:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:2873:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
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
    // InternalXMachine.g:2880:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2884:1: ( ( () ) )
            // InternalXMachine.g:2885:1: ( () )
            {
            // InternalXMachine.g:2885:1: ( () )
            // InternalXMachine.g:2886:2: ()
            {
             before(grammarAccess.getXActionAccess().getActionAction_0()); 
            // InternalXMachine.g:2887:2: ()
            // InternalXMachine.g:2887:3: 
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
    // InternalXMachine.g:2895:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2899:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:2900:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
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
    // InternalXMachine.g:2907:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__CommentAssignment_1 )? ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2911:1: ( ( ( rule__XAction__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2912:1: ( ( rule__XAction__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2912:1: ( ( rule__XAction__CommentAssignment_1 )? )
            // InternalXMachine.g:2913:2: ( rule__XAction__CommentAssignment_1 )?
            {
             before(grammarAccess.getXActionAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2914:2: ( rule__XAction__CommentAssignment_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ML_COMMENT && LA49_0<=RULE_SL_COMMENT)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXMachine.g:2914:3: rule__XAction__CommentAssignment_1
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
    // InternalXMachine.g:2922:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl rule__XAction__Group__3 ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2926:1: ( rule__XAction__Group__2__Impl rule__XAction__Group__3 )
            // InternalXMachine.g:2927:2: rule__XAction__Group__2__Impl rule__XAction__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:2934:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__NameAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2938:1: ( ( ( rule__XAction__NameAssignment_2 ) ) )
            // InternalXMachine.g:2939:1: ( ( rule__XAction__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2939:1: ( ( rule__XAction__NameAssignment_2 ) )
            // InternalXMachine.g:2940:2: ( rule__XAction__NameAssignment_2 )
            {
             before(grammarAccess.getXActionAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2941:2: ( rule__XAction__NameAssignment_2 )
            // InternalXMachine.g:2941:3: rule__XAction__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAction__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getNameAssignment_2()); 

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
    // InternalXMachine.g:2949:1: rule__XAction__Group__3 : rule__XAction__Group__3__Impl ;
    public final void rule__XAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2953:1: ( rule__XAction__Group__3__Impl )
            // InternalXMachine.g:2954:2: rule__XAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__3__Impl();

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
    // InternalXMachine.g:2960:1: rule__XAction__Group__3__Impl : ( ( rule__XAction__ActionAssignment_3 ) ) ;
    public final void rule__XAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2964:1: ( ( ( rule__XAction__ActionAssignment_3 ) ) )
            // InternalXMachine.g:2965:1: ( ( rule__XAction__ActionAssignment_3 ) )
            {
            // InternalXMachine.g:2965:1: ( ( rule__XAction__ActionAssignment_3 ) )
            // InternalXMachine.g:2966:2: ( rule__XAction__ActionAssignment_3 )
            {
             before(grammarAccess.getXActionAccess().getActionAssignment_3()); 
            // InternalXMachine.g:2967:2: ( rule__XAction__ActionAssignment_3 )
            // InternalXMachine.g:2967:3: rule__XAction__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XAction__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getActionAssignment_3()); 

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


    // $ANTLR start "rule__XEvent__UnorderedGroup_3"
    // InternalXMachine.g:2976:1: rule__XEvent__UnorderedGroup_3 : ( rule__XEvent__UnorderedGroup_3__0 )? ;
    public final void rule__XEvent__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getXEventAccess().getUnorderedGroup_3());
        	
        try {
            // InternalXMachine.g:2981:1: ( ( rule__XEvent__UnorderedGroup_3__0 )? )
            // InternalXMachine.g:2982:2: ( rule__XEvent__UnorderedGroup_3__0 )?
            {
            // InternalXMachine.g:2982:2: ( rule__XEvent__UnorderedGroup_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 >= 12 && LA50_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXMachine.g:2982:2: rule__XEvent__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_3__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getXEventAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_3"


    // $ANTLR start "rule__XEvent__UnorderedGroup_3__Impl"
    // InternalXMachine.g:2990:1: rule__XEvent__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) ) ;
    public final void rule__XEvent__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:2995:1: ( ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) ) )
            // InternalXMachine.g:2996:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) )
            {
            // InternalXMachine.g:2996:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 >= 12 && LA51_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalXMachine.g:2997:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) )
                    {
                    // InternalXMachine.g:2997:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) ) )
                    // InternalXMachine.g:2998:4: {...}? => ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalXMachine.g:2998:102: ( ( ( rule__XEvent__ExtendedAssignment_3_0 ) ) )
                    // InternalXMachine.g:2999:5: ( ( rule__XEvent__ExtendedAssignment_3_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXMachine.g:3005:5: ( ( rule__XEvent__ExtendedAssignment_3_0 ) )
                    // InternalXMachine.g:3006:6: ( rule__XEvent__ExtendedAssignment_3_0 )
                    {
                     before(grammarAccess.getXEventAccess().getExtendedAssignment_3_0()); 
                    // InternalXMachine.g:3007:6: ( rule__XEvent__ExtendedAssignment_3_0 )
                    // InternalXMachine.g:3007:7: rule__XEvent__ExtendedAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ExtendedAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getExtendedAssignment_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3012:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) )
                    {
                    // InternalXMachine.g:3012:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) ) )
                    // InternalXMachine.g:3013:4: {...}? => ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalXMachine.g:3013:102: ( ( ( rule__XEvent__ConvergenceAssignment_3_1 ) ) )
                    // InternalXMachine.g:3014:5: ( ( rule__XEvent__ConvergenceAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXMachine.g:3020:5: ( ( rule__XEvent__ConvergenceAssignment_3_1 ) )
                    // InternalXMachine.g:3021:6: ( rule__XEvent__ConvergenceAssignment_3_1 )
                    {
                     before(grammarAccess.getXEventAccess().getConvergenceAssignment_3_1()); 
                    // InternalXMachine.g:3022:6: ( rule__XEvent__ConvergenceAssignment_3_1 )
                    // InternalXMachine.g:3022:7: rule__XEvent__ConvergenceAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ConvergenceAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getConvergenceAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__XEvent__UnorderedGroup_3__0"
    // InternalXMachine.g:3035:1: rule__XEvent__UnorderedGroup_3__0 : rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )? ;
    public final void rule__XEvent__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3039:1: ( rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )? )
            // InternalXMachine.g:3040:2: rule__XEvent__UnorderedGroup_3__Impl ( rule__XEvent__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_22);
            rule__XEvent__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalXMachine.g:3041:2: ( rule__XEvent__UnorderedGroup_3__1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 >= 12 && LA52_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_3(), 1) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXMachine.g:3041:2: rule__XEvent__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__XEvent__UnorderedGroup_3__0"


    // $ANTLR start "rule__XEvent__UnorderedGroup_3__1"
    // InternalXMachine.g:3047:1: rule__XEvent__UnorderedGroup_3__1 : rule__XEvent__UnorderedGroup_3__Impl ;
    public final void rule__XEvent__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3051:1: ( rule__XEvent__UnorderedGroup_3__Impl )
            // InternalXMachine.g:3052:2: rule__XEvent__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__XEvent__UnorderedGroup_3__1"


    // $ANTLR start "rule__XMachine__CommentAssignment_1"
    // InternalXMachine.g:3059:1: rule__XMachine__CommentAssignment_1 : ( ( rule__XMachine__CommentAlternatives_1_0 ) ) ;
    public final void rule__XMachine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3063:1: ( ( ( rule__XMachine__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3064:2: ( ( rule__XMachine__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3064:2: ( ( rule__XMachine__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3065:3: ( rule__XMachine__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXMachineAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3066:3: ( rule__XMachine__CommentAlternatives_1_0 )
            // InternalXMachine.g:3066:4: rule__XMachine__CommentAlternatives_1_0
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
    // InternalXMachine.g:3074:1: rule__XMachine__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XMachine__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3078:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3079:2: ( RULE_ID )
            {
            // InternalXMachine.g:3079:2: ( RULE_ID )
            // InternalXMachine.g:3080:3: RULE_ID
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
    // InternalXMachine.g:3089:1: rule__XMachine__RefinesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XMachine__RefinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3093:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3094:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3094:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3095:3: ( RULE_ID )
            {
             before(grammarAccess.getXMachineAccess().getRefinesMachineCrossReference_4_1_0()); 
            // InternalXMachine.g:3096:3: ( RULE_ID )
            // InternalXMachine.g:3097:4: RULE_ID
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
    // InternalXMachine.g:3108:1: rule__XMachine__SeesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__XMachine__SeesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3112:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3113:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3113:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3114:3: ( RULE_ID )
            {
             before(grammarAccess.getXMachineAccess().getSeesContextCrossReference_5_1_0()); 
            // InternalXMachine.g:3115:3: ( RULE_ID )
            // InternalXMachine.g:3116:4: RULE_ID
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
    // InternalXMachine.g:3127:1: rule__XMachine__VariablesAssignment_6_1 : ( ruleXVariable ) ;
    public final void rule__XMachine__VariablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3131:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:3132:2: ( ruleXVariable )
            {
            // InternalXMachine.g:3132:2: ( ruleXVariable )
            // InternalXMachine.g:3133:3: ruleXVariable
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
    // InternalXMachine.g:3142:1: rule__XMachine__InvariantsAssignment_7_1 : ( ruleXInvariant ) ;
    public final void rule__XMachine__InvariantsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3146:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:3147:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:3147:2: ( ruleXInvariant )
            // InternalXMachine.g:3148:3: ruleXInvariant
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
    // InternalXMachine.g:3157:1: rule__XMachine__VariantAssignment_8_1 : ( ruleXVariant ) ;
    public final void rule__XMachine__VariantAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3161:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:3162:2: ( ruleXVariant )
            {
            // InternalXMachine.g:3162:2: ( ruleXVariant )
            // InternalXMachine.g:3163:3: ruleXVariant
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
    // InternalXMachine.g:3172:1: rule__XMachine__EventsAssignment_9_1 : ( ruleXEvent ) ;
    public final void rule__XMachine__EventsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3176:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:3177:2: ( ruleXEvent )
            {
            // InternalXMachine.g:3177:2: ( ruleXEvent )
            // InternalXMachine.g:3178:3: ruleXEvent
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


    // $ANTLR start "rule__XMachine__EventsAssignment_9_2_1"
    // InternalXMachine.g:3187:1: rule__XMachine__EventsAssignment_9_2_1 : ( ruleXEvent ) ;
    public final void rule__XMachine__EventsAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3191:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:3192:2: ( ruleXEvent )
            {
            // InternalXMachine.g:3192:2: ( ruleXEvent )
            // InternalXMachine.g:3193:3: ruleXEvent
            {
             before(grammarAccess.getXMachineAccess().getEventsXEventParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getXMachineAccess().getEventsXEventParserRuleCall_9_2_1_0()); 

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
    // $ANTLR end "rule__XMachine__EventsAssignment_9_2_1"


    // $ANTLR start "rule__XVariable__CommentAssignment_1"
    // InternalXMachine.g:3202:1: rule__XVariable__CommentAssignment_1 : ( ( rule__XVariable__CommentAlternatives_1_0 ) ) ;
    public final void rule__XVariable__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3206:1: ( ( ( rule__XVariable__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3207:2: ( ( rule__XVariable__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3207:2: ( ( rule__XVariable__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3208:3: ( rule__XVariable__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXVariableAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3209:3: ( rule__XVariable__CommentAlternatives_1_0 )
            // InternalXMachine.g:3209:4: rule__XVariable__CommentAlternatives_1_0
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
    // InternalXMachine.g:3217:1: rule__XVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3221:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3222:2: ( RULE_ID )
            {
            // InternalXMachine.g:3222:2: ( RULE_ID )
            // InternalXMachine.g:3223:3: RULE_ID
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
    // InternalXMachine.g:3232:1: rule__XInvariant__CommentAssignment_1 : ( ( rule__XInvariant__CommentAlternatives_1_0 ) ) ;
    public final void rule__XInvariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3236:1: ( ( ( rule__XInvariant__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3237:2: ( ( rule__XInvariant__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3237:2: ( ( rule__XInvariant__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3238:3: ( rule__XInvariant__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXInvariantAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3239:3: ( rule__XInvariant__CommentAlternatives_1_0 )
            // InternalXMachine.g:3239:4: rule__XInvariant__CommentAlternatives_1_0
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


    // $ANTLR start "rule__XInvariant__NameAssignment_2"
    // InternalXMachine.g:3247:1: rule__XInvariant__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XInvariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3251:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3252:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3252:2: ( RULE_XLABEL )
            // InternalXMachine.g:3253:3: RULE_XLABEL
            {
             before(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__XInvariant__NameAssignment_2"


    // $ANTLR start "rule__XInvariant__PredicateAssignment_3"
    // InternalXMachine.g:3262:1: rule__XInvariant__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__XInvariant__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3266:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3267:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3267:2: ( RULE_STRING )
            // InternalXMachine.g:3268:3: RULE_STRING
            {
             before(grammarAccess.getXInvariantAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__XInvariant__PredicateAssignment_3"


    // $ANTLR start "rule__XInvariant__TheoremAssignment_4"
    // InternalXMachine.g:3277:1: rule__XInvariant__TheoremAssignment_4 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3281:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3282:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3282:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3283:3: ( 'theorem' )
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_4_0()); 
            // InternalXMachine.g:3284:3: ( 'theorem' )
            // InternalXMachine.g:3285:4: 'theorem'
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_4_0()); 

            }

             after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_4_0()); 

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
    // $ANTLR end "rule__XInvariant__TheoremAssignment_4"


    // $ANTLR start "rule__XVariant__CommentAssignment_1"
    // InternalXMachine.g:3296:1: rule__XVariant__CommentAssignment_1 : ( ( rule__XVariant__CommentAlternatives_1_0 ) ) ;
    public final void rule__XVariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3300:1: ( ( ( rule__XVariant__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3301:2: ( ( rule__XVariant__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3301:2: ( ( rule__XVariant__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3302:3: ( rule__XVariant__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXVariantAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3303:3: ( rule__XVariant__CommentAlternatives_1_0 )
            // InternalXMachine.g:3303:4: rule__XVariant__CommentAlternatives_1_0
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
    // InternalXMachine.g:3311:1: rule__XVariant__ExpressionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XVariant__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3315:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3316:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3316:2: ( RULE_STRING )
            // InternalXMachine.g:3317:3: RULE_STRING
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
    // InternalXMachine.g:3326:1: rule__XEvent__CommentAssignment_1 : ( ( rule__XEvent__CommentAlternatives_1_0 ) ) ;
    public final void rule__XEvent__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3330:1: ( ( ( rule__XEvent__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3331:2: ( ( rule__XEvent__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3331:2: ( ( rule__XEvent__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3332:3: ( rule__XEvent__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXEventAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3333:3: ( rule__XEvent__CommentAlternatives_1_0 )
            // InternalXMachine.g:3333:4: rule__XEvent__CommentAlternatives_1_0
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
    // InternalXMachine.g:3341:1: rule__XEvent__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3345:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3346:2: ( RULE_ID )
            {
            // InternalXMachine.g:3346:2: ( RULE_ID )
            // InternalXMachine.g:3347:3: RULE_ID
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


    // $ANTLR start "rule__XEvent__ExtendedAssignment_3_0"
    // InternalXMachine.g:3356:1: rule__XEvent__ExtendedAssignment_3_0 : ( ( 'extended' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3360:1: ( ( ( 'extended' ) ) )
            // InternalXMachine.g:3361:2: ( ( 'extended' ) )
            {
            // InternalXMachine.g:3361:2: ( ( 'extended' ) )
            // InternalXMachine.g:3362:3: ( 'extended' )
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 
            // InternalXMachine.g:3363:3: ( 'extended' )
            // InternalXMachine.g:3364:4: 'extended'
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 

            }

             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0_0()); 

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
    // $ANTLR end "rule__XEvent__ExtendedAssignment_3_0"


    // $ANTLR start "rule__XEvent__ConvergenceAssignment_3_1"
    // InternalXMachine.g:3375:1: rule__XEvent__ConvergenceAssignment_3_1 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3379:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:3380:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:3380:2: ( ruleXConvergence )
            // InternalXMachine.g:3381:3: ruleXConvergence
            {
             before(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXConvergence();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__XEvent__ConvergenceAssignment_3_1"


    // $ANTLR start "rule__XEvent__RefinesAssignment_4_1"
    // InternalXMachine.g:3390:1: rule__XEvent__RefinesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3394:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3395:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3395:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3396:3: ( RULE_ID )
            {
             before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_0()); 
            // InternalXMachine.g:3397:3: ( RULE_ID )
            // InternalXMachine.g:3398:4: RULE_ID
            {
             before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__XEvent__RefinesAssignment_4_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_5_0_0_1"
    // InternalXMachine.g:3409:1: rule__XEvent__WitnessesAssignment_5_0_0_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3413:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:3414:2: ( ruleXWitness )
            {
            // InternalXMachine.g:3414:2: ( ruleXWitness )
            // InternalXMachine.g:3415:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_0_0_1_0()); 

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
    // $ANTLR end "rule__XEvent__WitnessesAssignment_5_0_0_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_5_0_2"
    // InternalXMachine.g:3424:1: rule__XEvent__ActionsAssignment_5_0_2 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3428:1: ( ( ruleXAction ) )
            // InternalXMachine.g:3429:2: ( ruleXAction )
            {
            // InternalXMachine.g:3429:2: ( ruleXAction )
            // InternalXMachine.g:3430:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_0_2_0()); 

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
    // $ANTLR end "rule__XEvent__ActionsAssignment_5_0_2"


    // $ANTLR start "rule__XEvent__GuardsAssignment_5_1_1"
    // InternalXMachine.g:3439:1: rule__XEvent__GuardsAssignment_5_1_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3443:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:3444:2: ( ruleXGuard )
            {
            // InternalXMachine.g:3444:2: ( ruleXGuard )
            // InternalXMachine.g:3445:3: ruleXGuard
            {
             before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_1_1_0()); 

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
    // $ANTLR end "rule__XEvent__GuardsAssignment_5_1_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_5_1_2_1"
    // InternalXMachine.g:3454:1: rule__XEvent__WitnessesAssignment_5_1_2_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3458:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:3459:2: ( ruleXWitness )
            {
            // InternalXMachine.g:3459:2: ( ruleXWitness )
            // InternalXMachine.g:3460:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_1_2_1_0()); 

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
    // $ANTLR end "rule__XEvent__WitnessesAssignment_5_1_2_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_5_1_3_1"
    // InternalXMachine.g:3469:1: rule__XEvent__ActionsAssignment_5_1_3_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3473:1: ( ( ruleXAction ) )
            // InternalXMachine.g:3474:2: ( ruleXAction )
            {
            // InternalXMachine.g:3474:2: ( ruleXAction )
            // InternalXMachine.g:3475:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_1_3_1_0()); 

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
    // $ANTLR end "rule__XEvent__ActionsAssignment_5_1_3_1"


    // $ANTLR start "rule__XEvent__ParametersAssignment_5_2_1"
    // InternalXMachine.g:3484:1: rule__XEvent__ParametersAssignment_5_2_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3488:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:3489:2: ( ruleXParameter )
            {
            // InternalXMachine.g:3489:2: ( ruleXParameter )
            // InternalXMachine.g:3490:3: ruleXParameter
            {
             before(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXParameter();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_2_1_0()); 

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
    // $ANTLR end "rule__XEvent__ParametersAssignment_5_2_1"


    // $ANTLR start "rule__XEvent__GuardsAssignment_5_2_3"
    // InternalXMachine.g:3499:1: rule__XEvent__GuardsAssignment_5_2_3 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_5_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3503:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:3504:2: ( ruleXGuard )
            {
            // InternalXMachine.g:3504:2: ( ruleXGuard )
            // InternalXMachine.g:3505:3: ruleXGuard
            {
             before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_2_3_0()); 

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
    // $ANTLR end "rule__XEvent__GuardsAssignment_5_2_3"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_5_2_4_1"
    // InternalXMachine.g:3514:1: rule__XEvent__WitnessesAssignment_5_2_4_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3518:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:3519:2: ( ruleXWitness )
            {
            // InternalXMachine.g:3519:2: ( ruleXWitness )
            // InternalXMachine.g:3520:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_2_4_1_0()); 

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
    // $ANTLR end "rule__XEvent__WitnessesAssignment_5_2_4_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_5_2_5_1"
    // InternalXMachine.g:3529:1: rule__XEvent__ActionsAssignment_5_2_5_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3533:1: ( ( ruleXAction ) )
            // InternalXMachine.g:3534:2: ( ruleXAction )
            {
            // InternalXMachine.g:3534:2: ( ruleXAction )
            // InternalXMachine.g:3535:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_2_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_2_5_1_0()); 

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
    // $ANTLR end "rule__XEvent__ActionsAssignment_5_2_5_1"


    // $ANTLR start "rule__XParameter__CommentAssignment_1"
    // InternalXMachine.g:3544:1: rule__XParameter__CommentAssignment_1 : ( ( rule__XParameter__CommentAlternatives_1_0 ) ) ;
    public final void rule__XParameter__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3548:1: ( ( ( rule__XParameter__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3549:2: ( ( rule__XParameter__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3549:2: ( ( rule__XParameter__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3550:3: ( rule__XParameter__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXParameterAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3551:3: ( rule__XParameter__CommentAlternatives_1_0 )
            // InternalXMachine.g:3551:4: rule__XParameter__CommentAlternatives_1_0
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
    // InternalXMachine.g:3559:1: rule__XParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3563:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3564:2: ( RULE_ID )
            {
            // InternalXMachine.g:3564:2: ( RULE_ID )
            // InternalXMachine.g:3565:3: RULE_ID
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
    // InternalXMachine.g:3574:1: rule__XGuard__CommentAssignment_1 : ( ( rule__XGuard__CommentAlternatives_1_0 ) ) ;
    public final void rule__XGuard__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3578:1: ( ( ( rule__XGuard__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3579:2: ( ( rule__XGuard__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3579:2: ( ( rule__XGuard__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3580:3: ( rule__XGuard__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXGuardAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3581:3: ( rule__XGuard__CommentAlternatives_1_0 )
            // InternalXMachine.g:3581:4: rule__XGuard__CommentAlternatives_1_0
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


    // $ANTLR start "rule__XGuard__NameAssignment_2"
    // InternalXMachine.g:3589:1: rule__XGuard__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3593:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3594:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3594:2: ( RULE_XLABEL )
            // InternalXMachine.g:3595:3: RULE_XLABEL
            {
             before(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__XGuard__NameAssignment_2"


    // $ANTLR start "rule__XGuard__PredicateAssignment_3"
    // InternalXMachine.g:3604:1: rule__XGuard__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__XGuard__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3608:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3609:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3609:2: ( RULE_STRING )
            // InternalXMachine.g:3610:3: RULE_STRING
            {
             before(grammarAccess.getXGuardAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__XGuard__PredicateAssignment_3"


    // $ANTLR start "rule__XGuard__TheoremAssignment_4"
    // InternalXMachine.g:3619:1: rule__XGuard__TheoremAssignment_4 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3623:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3624:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3624:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3625:3: ( 'theorem' )
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_4_0()); 
            // InternalXMachine.g:3626:3: ( 'theorem' )
            // InternalXMachine.g:3627:4: 'theorem'
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_4_0()); 

            }

             after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_4_0()); 

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
    // $ANTLR end "rule__XGuard__TheoremAssignment_4"


    // $ANTLR start "rule__XWitness__CommentAssignment_1"
    // InternalXMachine.g:3638:1: rule__XWitness__CommentAssignment_1 : ( ( rule__XWitness__CommentAlternatives_1_0 ) ) ;
    public final void rule__XWitness__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3642:1: ( ( ( rule__XWitness__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3643:2: ( ( rule__XWitness__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3643:2: ( ( rule__XWitness__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3644:3: ( rule__XWitness__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXWitnessAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3645:3: ( rule__XWitness__CommentAlternatives_1_0 )
            // InternalXMachine.g:3645:4: rule__XWitness__CommentAlternatives_1_0
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


    // $ANTLR start "rule__XWitness__NameAssignment_2"
    // InternalXMachine.g:3653:1: rule__XWitness__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3657:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3658:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3658:2: ( RULE_XLABEL )
            // InternalXMachine.g:3659:3: RULE_XLABEL
            {
             before(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__XWitness__NameAssignment_2"


    // $ANTLR start "rule__XWitness__PredicateAssignment_3"
    // InternalXMachine.g:3668:1: rule__XWitness__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__XWitness__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3672:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3673:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3673:2: ( RULE_STRING )
            // InternalXMachine.g:3674:3: RULE_STRING
            {
             before(grammarAccess.getXWitnessAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXWitnessAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__XWitness__PredicateAssignment_3"


    // $ANTLR start "rule__XAction__CommentAssignment_1"
    // InternalXMachine.g:3683:1: rule__XAction__CommentAssignment_1 : ( ( rule__XAction__CommentAlternatives_1_0 ) ) ;
    public final void rule__XAction__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3687:1: ( ( ( rule__XAction__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3688:2: ( ( rule__XAction__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3688:2: ( ( rule__XAction__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3689:3: ( rule__XAction__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXActionAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3690:3: ( rule__XAction__CommentAlternatives_1_0 )
            // InternalXMachine.g:3690:4: rule__XAction__CommentAlternatives_1_0
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


    // $ANTLR start "rule__XAction__NameAssignment_2"
    // InternalXMachine.g:3698:1: rule__XAction__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3702:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3703:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3703:2: ( RULE_XLABEL )
            // InternalXMachine.g:3704:3: RULE_XLABEL
            {
             before(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__XAction__NameAssignment_2"


    // $ANTLR start "rule__XAction__ActionAssignment_3"
    // InternalXMachine.g:3713:1: rule__XAction__ActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__XAction__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3717:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3718:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3718:2: ( RULE_STRING )
            // InternalXMachine.g:3719:3: RULE_STRING
            {
             before(grammarAccess.getXActionAccess().getActionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXActionAccess().getActionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__XAction__ActionAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000B2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080007000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000017020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000A010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080007002L});

}
