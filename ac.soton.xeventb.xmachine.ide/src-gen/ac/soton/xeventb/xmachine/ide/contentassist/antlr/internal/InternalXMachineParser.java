package ac.soton.xeventb.xmachine.ide.contentassist.antlr.internal;

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
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXMachineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'includes'", "'to'", "'as'", "'.'", "'begin'", "'with'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'theorem'", "'extended'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__19=19;
    public static final int RULE_XLABEL=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=5;
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



    // $ANTLR start "entryRuleMachine"
    // InternalXMachine.g:53:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // InternalXMachine.g:54:1: ( ruleMachine EOF )
            // InternalXMachine.g:55:1: ruleMachine EOF
            {
             before(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getMachineRule()); 
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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalXMachine.g:62:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:66:2: ( ( ( rule__Machine__Group__0 ) ) )
            // InternalXMachine.g:67:2: ( ( rule__Machine__Group__0 ) )
            {
            // InternalXMachine.g:67:2: ( ( rule__Machine__Group__0 ) )
            // InternalXMachine.g:68:3: ( rule__Machine__Group__0 )
            {
             before(grammarAccess.getMachineAccess().getGroup()); 
            // InternalXMachine.g:69:3: ( rule__Machine__Group__0 )
            // InternalXMachine.g:69:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleMIncludes"
    // InternalXMachine.g:78:1: entryRuleMIncludes : ruleMIncludes EOF ;
    public final void entryRuleMIncludes() throws RecognitionException {
        try {
            // InternalXMachine.g:79:1: ( ruleMIncludes EOF )
            // InternalXMachine.g:80:1: ruleMIncludes EOF
            {
             before(grammarAccess.getMIncludesRule()); 
            pushFollow(FOLLOW_1);
            ruleMIncludes();

            state._fsp--;

             after(grammarAccess.getMIncludesRule()); 
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
    // $ANTLR end "entryRuleMIncludes"


    // $ANTLR start "ruleMIncludes"
    // InternalXMachine.g:87:1: ruleMIncludes : ( ( rule__MIncludes__Group__0 ) ) ;
    public final void ruleMIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:91:2: ( ( ( rule__MIncludes__Group__0 ) ) )
            // InternalXMachine.g:92:2: ( ( rule__MIncludes__Group__0 ) )
            {
            // InternalXMachine.g:92:2: ( ( rule__MIncludes__Group__0 ) )
            // InternalXMachine.g:93:3: ( rule__MIncludes__Group__0 )
            {
             before(grammarAccess.getMIncludesAccess().getGroup()); 
            // InternalXMachine.g:94:3: ( rule__MIncludes__Group__0 )
            // InternalXMachine.g:94:4: rule__MIncludes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMIncludes"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXMachine.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXMachine.g:104:1: ( ruleQualifiedName EOF )
            // InternalXMachine.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXMachine.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXMachine.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXMachine.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXMachine.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalXMachine.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalXMachine.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleXVariable"
    // InternalXMachine.g:128:1: entryRuleXVariable : ruleXVariable EOF ;
    public final void entryRuleXVariable() throws RecognitionException {
        try {
            // InternalXMachine.g:129:1: ( ruleXVariable EOF )
            // InternalXMachine.g:130:1: ruleXVariable EOF
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
    // InternalXMachine.g:137:1: ruleXVariable : ( ( rule__XVariable__Group__0 ) ) ;
    public final void ruleXVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:141:2: ( ( ( rule__XVariable__Group__0 ) ) )
            // InternalXMachine.g:142:2: ( ( rule__XVariable__Group__0 ) )
            {
            // InternalXMachine.g:142:2: ( ( rule__XVariable__Group__0 ) )
            // InternalXMachine.g:143:3: ( rule__XVariable__Group__0 )
            {
             before(grammarAccess.getXVariableAccess().getGroup()); 
            // InternalXMachine.g:144:3: ( rule__XVariable__Group__0 )
            // InternalXMachine.g:144:4: rule__XVariable__Group__0
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
    // InternalXMachine.g:153:1: entryRuleXInvariant : ruleXInvariant EOF ;
    public final void entryRuleXInvariant() throws RecognitionException {
        try {
            // InternalXMachine.g:154:1: ( ruleXInvariant EOF )
            // InternalXMachine.g:155:1: ruleXInvariant EOF
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
    // InternalXMachine.g:162:1: ruleXInvariant : ( ( rule__XInvariant__Group__0 ) ) ;
    public final void ruleXInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:166:2: ( ( ( rule__XInvariant__Group__0 ) ) )
            // InternalXMachine.g:167:2: ( ( rule__XInvariant__Group__0 ) )
            {
            // InternalXMachine.g:167:2: ( ( rule__XInvariant__Group__0 ) )
            // InternalXMachine.g:168:3: ( rule__XInvariant__Group__0 )
            {
             before(grammarAccess.getXInvariantAccess().getGroup()); 
            // InternalXMachine.g:169:3: ( rule__XInvariant__Group__0 )
            // InternalXMachine.g:169:4: rule__XInvariant__Group__0
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
    // InternalXMachine.g:178:1: entryRuleXVariant : ruleXVariant EOF ;
    public final void entryRuleXVariant() throws RecognitionException {
        try {
            // InternalXMachine.g:179:1: ( ruleXVariant EOF )
            // InternalXMachine.g:180:1: ruleXVariant EOF
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
    // InternalXMachine.g:187:1: ruleXVariant : ( ( rule__XVariant__Group__0 ) ) ;
    public final void ruleXVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:191:2: ( ( ( rule__XVariant__Group__0 ) ) )
            // InternalXMachine.g:192:2: ( ( rule__XVariant__Group__0 ) )
            {
            // InternalXMachine.g:192:2: ( ( rule__XVariant__Group__0 ) )
            // InternalXMachine.g:193:3: ( rule__XVariant__Group__0 )
            {
             before(grammarAccess.getXVariantAccess().getGroup()); 
            // InternalXMachine.g:194:3: ( rule__XVariant__Group__0 )
            // InternalXMachine.g:194:4: rule__XVariant__Group__0
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
    // InternalXMachine.g:203:1: entryRuleXEvent : ruleXEvent EOF ;
    public final void entryRuleXEvent() throws RecognitionException {
        try {
            // InternalXMachine.g:204:1: ( ruleXEvent EOF )
            // InternalXMachine.g:205:1: ruleXEvent EOF
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
    // InternalXMachine.g:212:1: ruleXEvent : ( ( rule__XEvent__Group__0 ) ) ;
    public final void ruleXEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:216:2: ( ( ( rule__XEvent__Group__0 ) ) )
            // InternalXMachine.g:217:2: ( ( rule__XEvent__Group__0 ) )
            {
            // InternalXMachine.g:217:2: ( ( rule__XEvent__Group__0 ) )
            // InternalXMachine.g:218:3: ( rule__XEvent__Group__0 )
            {
             before(grammarAccess.getXEventAccess().getGroup()); 
            // InternalXMachine.g:219:3: ( rule__XEvent__Group__0 )
            // InternalXMachine.g:219:4: rule__XEvent__Group__0
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


    // $ANTLR start "entryRuleEventSync"
    // InternalXMachine.g:228:1: entryRuleEventSync : ruleEventSync EOF ;
    public final void entryRuleEventSync() throws RecognitionException {
        try {
            // InternalXMachine.g:229:1: ( ruleEventSync EOF )
            // InternalXMachine.g:230:1: ruleEventSync EOF
            {
             before(grammarAccess.getEventSyncRule()); 
            pushFollow(FOLLOW_1);
            ruleEventSync();

            state._fsp--;

             after(grammarAccess.getEventSyncRule()); 
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
    // $ANTLR end "entryRuleEventSync"


    // $ANTLR start "ruleEventSync"
    // InternalXMachine.g:237:1: ruleEventSync : ( ( rule__EventSync__Group__0 ) ) ;
    public final void ruleEventSync() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:241:2: ( ( ( rule__EventSync__Group__0 ) ) )
            // InternalXMachine.g:242:2: ( ( rule__EventSync__Group__0 ) )
            {
            // InternalXMachine.g:242:2: ( ( rule__EventSync__Group__0 ) )
            // InternalXMachine.g:243:3: ( rule__EventSync__Group__0 )
            {
             before(grammarAccess.getEventSyncAccess().getGroup()); 
            // InternalXMachine.g:244:3: ( rule__EventSync__Group__0 )
            // InternalXMachine.g:244:4: rule__EventSync__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventSync"


    // $ANTLR start "entryRuleXParameter"
    // InternalXMachine.g:253:1: entryRuleXParameter : ruleXParameter EOF ;
    public final void entryRuleXParameter() throws RecognitionException {
        try {
            // InternalXMachine.g:254:1: ( ruleXParameter EOF )
            // InternalXMachine.g:255:1: ruleXParameter EOF
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
    // InternalXMachine.g:262:1: ruleXParameter : ( ( rule__XParameter__Group__0 ) ) ;
    public final void ruleXParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:266:2: ( ( ( rule__XParameter__Group__0 ) ) )
            // InternalXMachine.g:267:2: ( ( rule__XParameter__Group__0 ) )
            {
            // InternalXMachine.g:267:2: ( ( rule__XParameter__Group__0 ) )
            // InternalXMachine.g:268:3: ( rule__XParameter__Group__0 )
            {
             before(grammarAccess.getXParameterAccess().getGroup()); 
            // InternalXMachine.g:269:3: ( rule__XParameter__Group__0 )
            // InternalXMachine.g:269:4: rule__XParameter__Group__0
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
    // InternalXMachine.g:278:1: entryRuleXGuard : ruleXGuard EOF ;
    public final void entryRuleXGuard() throws RecognitionException {
        try {
            // InternalXMachine.g:279:1: ( ruleXGuard EOF )
            // InternalXMachine.g:280:1: ruleXGuard EOF
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
    // InternalXMachine.g:287:1: ruleXGuard : ( ( rule__XGuard__Group__0 ) ) ;
    public final void ruleXGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:291:2: ( ( ( rule__XGuard__Group__0 ) ) )
            // InternalXMachine.g:292:2: ( ( rule__XGuard__Group__0 ) )
            {
            // InternalXMachine.g:292:2: ( ( rule__XGuard__Group__0 ) )
            // InternalXMachine.g:293:3: ( rule__XGuard__Group__0 )
            {
             before(grammarAccess.getXGuardAccess().getGroup()); 
            // InternalXMachine.g:294:3: ( rule__XGuard__Group__0 )
            // InternalXMachine.g:294:4: rule__XGuard__Group__0
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
    // InternalXMachine.g:303:1: entryRuleXWitness : ruleXWitness EOF ;
    public final void entryRuleXWitness() throws RecognitionException {
        try {
            // InternalXMachine.g:304:1: ( ruleXWitness EOF )
            // InternalXMachine.g:305:1: ruleXWitness EOF
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
    // InternalXMachine.g:312:1: ruleXWitness : ( ( rule__XWitness__Group__0 ) ) ;
    public final void ruleXWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:316:2: ( ( ( rule__XWitness__Group__0 ) ) )
            // InternalXMachine.g:317:2: ( ( rule__XWitness__Group__0 ) )
            {
            // InternalXMachine.g:317:2: ( ( rule__XWitness__Group__0 ) )
            // InternalXMachine.g:318:3: ( rule__XWitness__Group__0 )
            {
             before(grammarAccess.getXWitnessAccess().getGroup()); 
            // InternalXMachine.g:319:3: ( rule__XWitness__Group__0 )
            // InternalXMachine.g:319:4: rule__XWitness__Group__0
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
    // InternalXMachine.g:328:1: entryRuleXAction : ruleXAction EOF ;
    public final void entryRuleXAction() throws RecognitionException {
        try {
            // InternalXMachine.g:329:1: ( ruleXAction EOF )
            // InternalXMachine.g:330:1: ruleXAction EOF
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
    // InternalXMachine.g:337:1: ruleXAction : ( ( rule__XAction__Group__0 ) ) ;
    public final void ruleXAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:341:2: ( ( ( rule__XAction__Group__0 ) ) )
            // InternalXMachine.g:342:2: ( ( rule__XAction__Group__0 ) )
            {
            // InternalXMachine.g:342:2: ( ( rule__XAction__Group__0 ) )
            // InternalXMachine.g:343:3: ( rule__XAction__Group__0 )
            {
             before(grammarAccess.getXActionAccess().getGroup()); 
            // InternalXMachine.g:344:3: ( rule__XAction__Group__0 )
            // InternalXMachine.g:344:4: rule__XAction__Group__0
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


    // $ANTLR start "entryRuleXPredicate"
    // InternalXMachine.g:353:1: entryRuleXPredicate : ruleXPredicate EOF ;
    public final void entryRuleXPredicate() throws RecognitionException {
        try {
            // InternalXMachine.g:354:1: ( ruleXPredicate EOF )
            // InternalXMachine.g:355:1: ruleXPredicate EOF
            {
             before(grammarAccess.getXPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXPredicateRule()); 
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
    // $ANTLR end "entryRuleXPredicate"


    // $ANTLR start "ruleXPredicate"
    // InternalXMachine.g:362:1: ruleXPredicate : ( RULE_STRING ) ;
    public final void ruleXPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:366:2: ( ( RULE_STRING ) )
            // InternalXMachine.g:367:2: ( RULE_STRING )
            {
            // InternalXMachine.g:367:2: ( RULE_STRING )
            // InternalXMachine.g:368:3: RULE_STRING
            {
             before(grammarAccess.getXPredicateAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXPredicateAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXPredicate"


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:378:1: ruleXConvergence : ( ( rule__XConvergence__Alternatives ) ) ;
    public final void ruleXConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:382:1: ( ( ( rule__XConvergence__Alternatives ) ) )
            // InternalXMachine.g:383:2: ( ( rule__XConvergence__Alternatives ) )
            {
            // InternalXMachine.g:383:2: ( ( rule__XConvergence__Alternatives ) )
            // InternalXMachine.g:384:3: ( rule__XConvergence__Alternatives )
            {
             before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            // InternalXMachine.g:385:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:385:4: rule__XConvergence__Alternatives
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


    // $ANTLR start "rule__Machine__CommentAlternatives_1_0"
    // InternalXMachine.g:393:1: rule__Machine__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Machine__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:397:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXMachine.g:398:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:398:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:399:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:404:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:404:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:405:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Machine__CommentAlternatives_1_0"


    // $ANTLR start "rule__XEvent__Alternatives_5"
    // InternalXMachine.g:414:1: rule__XEvent__Alternatives_5 : ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) | ( ( rule__XEvent__Group_5_2__0 ) ) );
    public final void rule__XEvent__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:418:1: ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) | ( ( rule__XEvent__Group_5_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:419:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    {
                    // InternalXMachine.g:419:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    // InternalXMachine.g:420:3: ( rule__XEvent__Group_5_0__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_0()); 
                    // InternalXMachine.g:421:3: ( rule__XEvent__Group_5_0__0 )
                    // InternalXMachine.g:421:4: rule__XEvent__Group_5_0__0
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
                    // InternalXMachine.g:425:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    {
                    // InternalXMachine.g:425:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    // InternalXMachine.g:426:3: ( rule__XEvent__Group_5_1__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_1()); 
                    // InternalXMachine.g:427:3: ( rule__XEvent__Group_5_1__0 )
                    // InternalXMachine.g:427:4: rule__XEvent__Group_5_1__0
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
                    // InternalXMachine.g:431:2: ( ( rule__XEvent__Group_5_2__0 ) )
                    {
                    // InternalXMachine.g:431:2: ( ( rule__XEvent__Group_5_2__0 ) )
                    // InternalXMachine.g:432:3: ( rule__XEvent__Group_5_2__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_2()); 
                    // InternalXMachine.g:433:3: ( rule__XEvent__Group_5_2__0 )
                    // InternalXMachine.g:433:4: rule__XEvent__Group_5_2__0
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


    // $ANTLR start "rule__XConvergence__Alternatives"
    // InternalXMachine.g:441:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:445:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:446:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:446:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:447:3: ( 'ordinary' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    // InternalXMachine.g:448:3: ( 'ordinary' )
                    // InternalXMachine.g:448:4: 'ordinary'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:452:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:452:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:453:3: ( 'convergent' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    // InternalXMachine.g:454:3: ( 'convergent' )
                    // InternalXMachine.g:454:4: 'convergent'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:458:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:458:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:459:3: ( 'anticipated' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    // InternalXMachine.g:460:3: ( 'anticipated' )
                    // InternalXMachine.g:460:4: 'anticipated'
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


    // $ANTLR start "rule__Machine__Group__0"
    // InternalXMachine.g:468:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:472:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:473:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

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
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // InternalXMachine.g:480:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:484:1: ( ( () ) )
            // InternalXMachine.g:485:1: ( () )
            {
            // InternalXMachine.g:485:1: ( () )
            // InternalXMachine.g:486:2: ()
            {
             before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            // InternalXMachine.g:487:2: ()
            // InternalXMachine.g:487:3: 
            {
            }

             after(grammarAccess.getMachineAccess().getMachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // InternalXMachine.g:495:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:499:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:500:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

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
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // InternalXMachine.g:507:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__CommentAssignment_1 )? ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:511:1: ( ( ( rule__Machine__CommentAssignment_1 )? ) )
            // InternalXMachine.g:512:1: ( ( rule__Machine__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:512:1: ( ( rule__Machine__CommentAssignment_1 )? )
            // InternalXMachine.g:513:2: ( rule__Machine__CommentAssignment_1 )?
            {
             before(grammarAccess.getMachineAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:514:2: ( rule__Machine__CommentAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ML_COMMENT && LA4_0<=RULE_SL_COMMENT)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:514:3: rule__Machine__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // InternalXMachine.g:522:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:526:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:527:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

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
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // InternalXMachine.g:534:1: rule__Machine__Group__2__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:538:1: ( ( 'machine' ) )
            // InternalXMachine.g:539:1: ( 'machine' )
            {
            // InternalXMachine.g:539:1: ( 'machine' )
            // InternalXMachine.g:540:2: 'machine'
            {
             before(grammarAccess.getMachineAccess().getMachineKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getMachineKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // InternalXMachine.g:549:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:553:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:554:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__4();

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
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // InternalXMachine.g:561:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__NameAssignment_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:565:1: ( ( ( rule__Machine__NameAssignment_3 ) ) )
            // InternalXMachine.g:566:1: ( ( rule__Machine__NameAssignment_3 ) )
            {
            // InternalXMachine.g:566:1: ( ( rule__Machine__NameAssignment_3 ) )
            // InternalXMachine.g:567:2: ( rule__Machine__NameAssignment_3 )
            {
             before(grammarAccess.getMachineAccess().getNameAssignment_3()); 
            // InternalXMachine.g:568:2: ( rule__Machine__NameAssignment_3 )
            // InternalXMachine.g:568:3: rule__Machine__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__4"
    // InternalXMachine.g:576:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:580:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:581:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__5();

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
    // $ANTLR end "rule__Machine__Group__4"


    // $ANTLR start "rule__Machine__Group__4__Impl"
    // InternalXMachine.g:588:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__ExtensionsAssignment_4 )* ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:592:1: ( ( ( rule__Machine__ExtensionsAssignment_4 )* ) )
            // InternalXMachine.g:593:1: ( ( rule__Machine__ExtensionsAssignment_4 )* )
            {
            // InternalXMachine.g:593:1: ( ( rule__Machine__ExtensionsAssignment_4 )* )
            // InternalXMachine.g:594:2: ( rule__Machine__ExtensionsAssignment_4 )*
            {
             before(grammarAccess.getMachineAccess().getExtensionsAssignment_4()); 
            // InternalXMachine.g:595:2: ( rule__Machine__ExtensionsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXMachine.g:595:3: rule__Machine__ExtensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Machine__ExtensionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getExtensionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4__Impl"


    // $ANTLR start "rule__Machine__Group__5"
    // InternalXMachine.g:603:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:607:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:608:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__6();

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
    // $ANTLR end "rule__Machine__Group__5"


    // $ANTLR start "rule__Machine__Group__5__Impl"
    // InternalXMachine.g:615:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:619:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:620:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:620:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:621:2: ( rule__Machine__Group_5__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_5()); 
            // InternalXMachine.g:622:2: ( rule__Machine__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:622:3: rule__Machine__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5__Impl"


    // $ANTLR start "rule__Machine__Group__6"
    // InternalXMachine.g:630:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:634:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXMachine.g:635:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__7();

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
    // $ANTLR end "rule__Machine__Group__6"


    // $ANTLR start "rule__Machine__Group__6__Impl"
    // InternalXMachine.g:642:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:646:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // InternalXMachine.g:647:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // InternalXMachine.g:647:1: ( ( rule__Machine__Group_6__0 )? )
            // InternalXMachine.g:648:2: ( rule__Machine__Group_6__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_6()); 
            // InternalXMachine.g:649:2: ( rule__Machine__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:649:3: rule__Machine__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6__Impl"


    // $ANTLR start "rule__Machine__Group__7"
    // InternalXMachine.g:657:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:661:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXMachine.g:662:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__8();

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
    // $ANTLR end "rule__Machine__Group__7"


    // $ANTLR start "rule__Machine__Group__7__Impl"
    // InternalXMachine.g:669:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:673:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // InternalXMachine.g:674:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // InternalXMachine.g:674:1: ( ( rule__Machine__Group_7__0 )? )
            // InternalXMachine.g:675:2: ( rule__Machine__Group_7__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_7()); 
            // InternalXMachine.g:676:2: ( rule__Machine__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:676:3: rule__Machine__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7__Impl"


    // $ANTLR start "rule__Machine__Group__8"
    // InternalXMachine.g:684:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:688:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // InternalXMachine.g:689:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__9();

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
    // $ANTLR end "rule__Machine__Group__8"


    // $ANTLR start "rule__Machine__Group__8__Impl"
    // InternalXMachine.g:696:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__Group_8__0 )? ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:700:1: ( ( ( rule__Machine__Group_8__0 )? ) )
            // InternalXMachine.g:701:1: ( ( rule__Machine__Group_8__0 )? )
            {
            // InternalXMachine.g:701:1: ( ( rule__Machine__Group_8__0 )? )
            // InternalXMachine.g:702:2: ( rule__Machine__Group_8__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_8()); 
            // InternalXMachine.g:703:2: ( rule__Machine__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:703:3: rule__Machine__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8__Impl"


    // $ANTLR start "rule__Machine__Group__9"
    // InternalXMachine.g:711:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl rule__Machine__Group__10 ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:715:1: ( rule__Machine__Group__9__Impl rule__Machine__Group__10 )
            // InternalXMachine.g:716:2: rule__Machine__Group__9__Impl rule__Machine__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__10();

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
    // $ANTLR end "rule__Machine__Group__9"


    // $ANTLR start "rule__Machine__Group__9__Impl"
    // InternalXMachine.g:723:1: rule__Machine__Group__9__Impl : ( ( rule__Machine__Group_9__0 )? ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:727:1: ( ( ( rule__Machine__Group_9__0 )? ) )
            // InternalXMachine.g:728:1: ( ( rule__Machine__Group_9__0 )? )
            {
            // InternalXMachine.g:728:1: ( ( rule__Machine__Group_9__0 )? )
            // InternalXMachine.g:729:2: ( rule__Machine__Group_9__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_9()); 
            // InternalXMachine.g:730:2: ( rule__Machine__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:730:3: rule__Machine__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__9__Impl"


    // $ANTLR start "rule__Machine__Group__10"
    // InternalXMachine.g:738:1: rule__Machine__Group__10 : rule__Machine__Group__10__Impl rule__Machine__Group__11 ;
    public final void rule__Machine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:742:1: ( rule__Machine__Group__10__Impl rule__Machine__Group__11 )
            // InternalXMachine.g:743:2: rule__Machine__Group__10__Impl rule__Machine__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__11();

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
    // $ANTLR end "rule__Machine__Group__10"


    // $ANTLR start "rule__Machine__Group__10__Impl"
    // InternalXMachine.g:750:1: rule__Machine__Group__10__Impl : ( ( rule__Machine__Group_10__0 )? ) ;
    public final void rule__Machine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:754:1: ( ( ( rule__Machine__Group_10__0 )? ) )
            // InternalXMachine.g:755:1: ( ( rule__Machine__Group_10__0 )? )
            {
            // InternalXMachine.g:755:1: ( ( rule__Machine__Group_10__0 )? )
            // InternalXMachine.g:756:2: ( rule__Machine__Group_10__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_10()); 
            // InternalXMachine.g:757:2: ( rule__Machine__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:757:3: rule__Machine__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__10__Impl"


    // $ANTLR start "rule__Machine__Group__11"
    // InternalXMachine.g:765:1: rule__Machine__Group__11 : rule__Machine__Group__11__Impl ;
    public final void rule__Machine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:769:1: ( rule__Machine__Group__11__Impl )
            // InternalXMachine.g:770:2: rule__Machine__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__11__Impl();

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
    // $ANTLR end "rule__Machine__Group__11"


    // $ANTLR start "rule__Machine__Group__11__Impl"
    // InternalXMachine.g:776:1: rule__Machine__Group__11__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:780:1: ( ( 'end' ) )
            // InternalXMachine.g:781:1: ( 'end' )
            {
            // InternalXMachine.g:781:1: ( 'end' )
            // InternalXMachine.g:782:2: 'end'
            {
             before(grammarAccess.getMachineAccess().getEndKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getEndKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__11__Impl"


    // $ANTLR start "rule__Machine__Group_5__0"
    // InternalXMachine.g:792:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:796:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:797:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1();

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
    // $ANTLR end "rule__Machine__Group_5__0"


    // $ANTLR start "rule__Machine__Group_5__0__Impl"
    // InternalXMachine.g:804:1: rule__Machine__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:808:1: ( ( 'refines' ) )
            // InternalXMachine.g:809:1: ( 'refines' )
            {
            // InternalXMachine.g:809:1: ( 'refines' )
            // InternalXMachine.g:810:2: 'refines'
            {
             before(grammarAccess.getMachineAccess().getRefinesKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRefinesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__0__Impl"


    // $ANTLR start "rule__Machine__Group_5__1"
    // InternalXMachine.g:819:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:823:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:824:2: rule__Machine__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1__Impl();

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
    // $ANTLR end "rule__Machine__Group_5__1"


    // $ANTLR start "rule__Machine__Group_5__1__Impl"
    // InternalXMachine.g:830:1: rule__Machine__Group_5__1__Impl : ( ( rule__Machine__RefinesAssignment_5_1 ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:834:1: ( ( ( rule__Machine__RefinesAssignment_5_1 ) ) )
            // InternalXMachine.g:835:1: ( ( rule__Machine__RefinesAssignment_5_1 ) )
            {
            // InternalXMachine.g:835:1: ( ( rule__Machine__RefinesAssignment_5_1 ) )
            // InternalXMachine.g:836:2: ( rule__Machine__RefinesAssignment_5_1 )
            {
             before(grammarAccess.getMachineAccess().getRefinesAssignment_5_1()); 
            // InternalXMachine.g:837:2: ( rule__Machine__RefinesAssignment_5_1 )
            // InternalXMachine.g:837:3: rule__Machine__RefinesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__RefinesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getRefinesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__1__Impl"


    // $ANTLR start "rule__Machine__Group_6__0"
    // InternalXMachine.g:846:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:850:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalXMachine.g:851:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1();

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
    // $ANTLR end "rule__Machine__Group_6__0"


    // $ANTLR start "rule__Machine__Group_6__0__Impl"
    // InternalXMachine.g:858:1: rule__Machine__Group_6__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:862:1: ( ( 'sees' ) )
            // InternalXMachine.g:863:1: ( 'sees' )
            {
            // InternalXMachine.g:863:1: ( 'sees' )
            // InternalXMachine.g:864:2: 'sees'
            {
             before(grammarAccess.getMachineAccess().getSeesKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getSeesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0__Impl"


    // $ANTLR start "rule__Machine__Group_6__1"
    // InternalXMachine.g:873:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:877:1: ( rule__Machine__Group_6__1__Impl )
            // InternalXMachine.g:878:2: rule__Machine__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1__Impl();

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
    // $ANTLR end "rule__Machine__Group_6__1"


    // $ANTLR start "rule__Machine__Group_6__1__Impl"
    // InternalXMachine.g:884:1: rule__Machine__Group_6__1__Impl : ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:888:1: ( ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) ) )
            // InternalXMachine.g:889:1: ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:889:1: ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) )
            // InternalXMachine.g:890:2: ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* )
            {
            // InternalXMachine.g:890:2: ( ( rule__Machine__SeesAssignment_6_1 ) )
            // InternalXMachine.g:891:3: ( rule__Machine__SeesAssignment_6_1 )
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 
            // InternalXMachine.g:892:3: ( rule__Machine__SeesAssignment_6_1 )
            // InternalXMachine.g:892:4: rule__Machine__SeesAssignment_6_1
            {
            pushFollow(FOLLOW_7);
            rule__Machine__SeesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 

            }

            // InternalXMachine.g:895:2: ( ( rule__Machine__SeesAssignment_6_1 )* )
            // InternalXMachine.g:896:3: ( rule__Machine__SeesAssignment_6_1 )*
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 
            // InternalXMachine.g:897:3: ( rule__Machine__SeesAssignment_6_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXMachine.g:897:4: rule__Machine__SeesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Machine__SeesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 

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
    // $ANTLR end "rule__Machine__Group_6__1__Impl"


    // $ANTLR start "rule__Machine__Group_7__0"
    // InternalXMachine.g:907:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:911:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:912:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1();

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
    // $ANTLR end "rule__Machine__Group_7__0"


    // $ANTLR start "rule__Machine__Group_7__0__Impl"
    // InternalXMachine.g:919:1: rule__Machine__Group_7__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:923:1: ( ( 'variables' ) )
            // InternalXMachine.g:924:1: ( 'variables' )
            {
            // InternalXMachine.g:924:1: ( 'variables' )
            // InternalXMachine.g:925:2: 'variables'
            {
             before(grammarAccess.getMachineAccess().getVariablesKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getVariablesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__0__Impl"


    // $ANTLR start "rule__Machine__Group_7__1"
    // InternalXMachine.g:934:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:938:1: ( rule__Machine__Group_7__1__Impl )
            // InternalXMachine.g:939:2: rule__Machine__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1__Impl();

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
    // $ANTLR end "rule__Machine__Group_7__1"


    // $ANTLR start "rule__Machine__Group_7__1__Impl"
    // InternalXMachine.g:945:1: rule__Machine__Group_7__1__Impl : ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:949:1: ( ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) ) )
            // InternalXMachine.g:950:1: ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:950:1: ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) )
            // InternalXMachine.g:951:2: ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* )
            {
            // InternalXMachine.g:951:2: ( ( rule__Machine__VariablesAssignment_7_1 ) )
            // InternalXMachine.g:952:3: ( rule__Machine__VariablesAssignment_7_1 )
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 
            // InternalXMachine.g:953:3: ( rule__Machine__VariablesAssignment_7_1 )
            // InternalXMachine.g:953:4: rule__Machine__VariablesAssignment_7_1
            {
            pushFollow(FOLLOW_7);
            rule__Machine__VariablesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 

            }

            // InternalXMachine.g:956:2: ( ( rule__Machine__VariablesAssignment_7_1 )* )
            // InternalXMachine.g:957:3: ( rule__Machine__VariablesAssignment_7_1 )*
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 
            // InternalXMachine.g:958:3: ( rule__Machine__VariablesAssignment_7_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXMachine.g:958:4: rule__Machine__VariablesAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Machine__VariablesAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 

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
    // $ANTLR end "rule__Machine__Group_7__1__Impl"


    // $ANTLR start "rule__Machine__Group_8__0"
    // InternalXMachine.g:968:1: rule__Machine__Group_8__0 : rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 ;
    public final void rule__Machine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:972:1: ( rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 )
            // InternalXMachine.g:973:2: rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_8__1();

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
    // $ANTLR end "rule__Machine__Group_8__0"


    // $ANTLR start "rule__Machine__Group_8__0__Impl"
    // InternalXMachine.g:980:1: rule__Machine__Group_8__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:984:1: ( ( 'invariants' ) )
            // InternalXMachine.g:985:1: ( 'invariants' )
            {
            // InternalXMachine.g:985:1: ( 'invariants' )
            // InternalXMachine.g:986:2: 'invariants'
            {
             before(grammarAccess.getMachineAccess().getInvariantsKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getInvariantsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__0__Impl"


    // $ANTLR start "rule__Machine__Group_8__1"
    // InternalXMachine.g:995:1: rule__Machine__Group_8__1 : rule__Machine__Group_8__1__Impl ;
    public final void rule__Machine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:999:1: ( rule__Machine__Group_8__1__Impl )
            // InternalXMachine.g:1000:2: rule__Machine__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_8__1__Impl();

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
    // $ANTLR end "rule__Machine__Group_8__1"


    // $ANTLR start "rule__Machine__Group_8__1__Impl"
    // InternalXMachine.g:1006:1: rule__Machine__Group_8__1__Impl : ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) ) ;
    public final void rule__Machine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1010:1: ( ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) ) )
            // InternalXMachine.g:1011:1: ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:1011:1: ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) )
            // InternalXMachine.g:1012:2: ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* )
            {
            // InternalXMachine.g:1012:2: ( ( rule__Machine__InvariantsAssignment_8_1 ) )
            // InternalXMachine.g:1013:3: ( rule__Machine__InvariantsAssignment_8_1 )
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 
            // InternalXMachine.g:1014:3: ( rule__Machine__InvariantsAssignment_8_1 )
            // InternalXMachine.g:1014:4: rule__Machine__InvariantsAssignment_8_1
            {
            pushFollow(FOLLOW_9);
            rule__Machine__InvariantsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 

            }

            // InternalXMachine.g:1017:2: ( ( rule__Machine__InvariantsAssignment_8_1 )* )
            // InternalXMachine.g:1018:3: ( rule__Machine__InvariantsAssignment_8_1 )*
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 
            // InternalXMachine.g:1019:3: ( rule__Machine__InvariantsAssignment_8_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_XLABEL) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXMachine.g:1019:4: rule__Machine__InvariantsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Machine__InvariantsAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 

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
    // $ANTLR end "rule__Machine__Group_8__1__Impl"


    // $ANTLR start "rule__Machine__Group_9__0"
    // InternalXMachine.g:1029:1: rule__Machine__Group_9__0 : rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 ;
    public final void rule__Machine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1033:1: ( rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 )
            // InternalXMachine.g:1034:2: rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1
            {
            pushFollow(FOLLOW_10);
            rule__Machine__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_9__1();

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
    // $ANTLR end "rule__Machine__Group_9__0"


    // $ANTLR start "rule__Machine__Group_9__0__Impl"
    // InternalXMachine.g:1041:1: rule__Machine__Group_9__0__Impl : ( 'variant' ) ;
    public final void rule__Machine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1045:1: ( ( 'variant' ) )
            // InternalXMachine.g:1046:1: ( 'variant' )
            {
            // InternalXMachine.g:1046:1: ( 'variant' )
            // InternalXMachine.g:1047:2: 'variant'
            {
             before(grammarAccess.getMachineAccess().getVariantKeyword_9_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getVariantKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__0__Impl"


    // $ANTLR start "rule__Machine__Group_9__1"
    // InternalXMachine.g:1056:1: rule__Machine__Group_9__1 : rule__Machine__Group_9__1__Impl ;
    public final void rule__Machine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1060:1: ( rule__Machine__Group_9__1__Impl )
            // InternalXMachine.g:1061:2: rule__Machine__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_9__1__Impl();

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
    // $ANTLR end "rule__Machine__Group_9__1"


    // $ANTLR start "rule__Machine__Group_9__1__Impl"
    // InternalXMachine.g:1067:1: rule__Machine__Group_9__1__Impl : ( ( rule__Machine__VariantAssignment_9_1 ) ) ;
    public final void rule__Machine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1071:1: ( ( ( rule__Machine__VariantAssignment_9_1 ) ) )
            // InternalXMachine.g:1072:1: ( ( rule__Machine__VariantAssignment_9_1 ) )
            {
            // InternalXMachine.g:1072:1: ( ( rule__Machine__VariantAssignment_9_1 ) )
            // InternalXMachine.g:1073:2: ( rule__Machine__VariantAssignment_9_1 )
            {
             before(grammarAccess.getMachineAccess().getVariantAssignment_9_1()); 
            // InternalXMachine.g:1074:2: ( rule__Machine__VariantAssignment_9_1 )
            // InternalXMachine.g:1074:3: rule__Machine__VariantAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__VariantAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariantAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__1__Impl"


    // $ANTLR start "rule__Machine__Group_10__0"
    // InternalXMachine.g:1083:1: rule__Machine__Group_10__0 : rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1 ;
    public final void rule__Machine__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1087:1: ( rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1 )
            // InternalXMachine.g:1088:2: rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__1();

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
    // $ANTLR end "rule__Machine__Group_10__0"


    // $ANTLR start "rule__Machine__Group_10__0__Impl"
    // InternalXMachine.g:1095:1: rule__Machine__Group_10__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1099:1: ( ( 'events' ) )
            // InternalXMachine.g:1100:1: ( 'events' )
            {
            // InternalXMachine.g:1100:1: ( 'events' )
            // InternalXMachine.g:1101:2: 'events'
            {
             before(grammarAccess.getMachineAccess().getEventsKeyword_10_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getEventsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__0__Impl"


    // $ANTLR start "rule__Machine__Group_10__1"
    // InternalXMachine.g:1110:1: rule__Machine__Group_10__1 : rule__Machine__Group_10__1__Impl rule__Machine__Group_10__2 ;
    public final void rule__Machine__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1114:1: ( rule__Machine__Group_10__1__Impl rule__Machine__Group_10__2 )
            // InternalXMachine.g:1115:2: rule__Machine__Group_10__1__Impl rule__Machine__Group_10__2
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__2();

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
    // $ANTLR end "rule__Machine__Group_10__1"


    // $ANTLR start "rule__Machine__Group_10__1__Impl"
    // InternalXMachine.g:1122:1: rule__Machine__Group_10__1__Impl : ( ( rule__Machine__EventsAssignment_10_1 ) ) ;
    public final void rule__Machine__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1126:1: ( ( ( rule__Machine__EventsAssignment_10_1 ) ) )
            // InternalXMachine.g:1127:1: ( ( rule__Machine__EventsAssignment_10_1 ) )
            {
            // InternalXMachine.g:1127:1: ( ( rule__Machine__EventsAssignment_10_1 ) )
            // InternalXMachine.g:1128:2: ( rule__Machine__EventsAssignment_10_1 )
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_10_1()); 
            // InternalXMachine.g:1129:2: ( rule__Machine__EventsAssignment_10_1 )
            // InternalXMachine.g:1129:3: rule__Machine__EventsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__EventsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getEventsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__1__Impl"


    // $ANTLR start "rule__Machine__Group_10__2"
    // InternalXMachine.g:1137:1: rule__Machine__Group_10__2 : rule__Machine__Group_10__2__Impl ;
    public final void rule__Machine__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1141:1: ( rule__Machine__Group_10__2__Impl )
            // InternalXMachine.g:1142:2: rule__Machine__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__2__Impl();

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
    // $ANTLR end "rule__Machine__Group_10__2"


    // $ANTLR start "rule__Machine__Group_10__2__Impl"
    // InternalXMachine.g:1148:1: rule__Machine__Group_10__2__Impl : ( ( rule__Machine__EventsAssignment_10_2 )* ) ;
    public final void rule__Machine__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1152:1: ( ( ( rule__Machine__EventsAssignment_10_2 )* ) )
            // InternalXMachine.g:1153:1: ( ( rule__Machine__EventsAssignment_10_2 )* )
            {
            // InternalXMachine.g:1153:1: ( ( rule__Machine__EventsAssignment_10_2 )* )
            // InternalXMachine.g:1154:2: ( rule__Machine__EventsAssignment_10_2 )*
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_10_2()); 
            // InternalXMachine.g:1155:2: ( rule__Machine__EventsAssignment_10_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXMachine.g:1155:3: rule__Machine__EventsAssignment_10_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Machine__EventsAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getEventsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__2__Impl"


    // $ANTLR start "rule__MIncludes__Group__0"
    // InternalXMachine.g:1164:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1168:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:1169:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MIncludes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__1();

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
    // $ANTLR end "rule__MIncludes__Group__0"


    // $ANTLR start "rule__MIncludes__Group__0__Impl"
    // InternalXMachine.g:1176:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1180:1: ( ( () ) )
            // InternalXMachine.g:1181:1: ( () )
            {
            // InternalXMachine.g:1181:1: ( () )
            // InternalXMachine.g:1182:2: ()
            {
             before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            // InternalXMachine.g:1183:2: ()
            // InternalXMachine.g:1183:3: 
            {
            }

             after(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__0__Impl"


    // $ANTLR start "rule__MIncludes__Group__1"
    // InternalXMachine.g:1191:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1195:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:1196:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MIncludes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__2();

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
    // $ANTLR end "rule__MIncludes__Group__1"


    // $ANTLR start "rule__MIncludes__Group__1__Impl"
    // InternalXMachine.g:1203:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1207:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:1208:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:1208:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:1209:2: ( rule__MIncludes__Group_1__0 )
            {
             before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            // InternalXMachine.g:1210:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:1210:3: rule__MIncludes__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__1__Impl"


    // $ANTLR start "rule__MIncludes__Group__2"
    // InternalXMachine.g:1218:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1222:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:1223:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__MIncludes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__3();

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
    // $ANTLR end "rule__MIncludes__Group__2"


    // $ANTLR start "rule__MIncludes__Group__2__Impl"
    // InternalXMachine.g:1230:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1234:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:1235:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:1235:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:1236:2: ( rule__MIncludes__Group_2__0 )?
            {
             before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            // InternalXMachine.g:1237:2: ( rule__MIncludes__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:1237:3: rule__MIncludes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MIncludes__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMIncludesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__2__Impl"


    // $ANTLR start "rule__MIncludes__Group__3"
    // InternalXMachine.g:1245:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1249:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:1250:2: rule__MIncludes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__3__Impl();

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
    // $ANTLR end "rule__MIncludes__Group__3"


    // $ANTLR start "rule__MIncludes__Group__3__Impl"
    // InternalXMachine.g:1256:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1260:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:1261:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:1261:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:1262:2: ( rule__MIncludes__Group_3__0 )?
            {
             before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            // InternalXMachine.g:1263:2: ( rule__MIncludes__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:1263:3: rule__MIncludes__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MIncludes__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMIncludesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__3__Impl"


    // $ANTLR start "rule__MIncludes__Group_1__0"
    // InternalXMachine.g:1272:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1276:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:1277:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__1();

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
    // $ANTLR end "rule__MIncludes__Group_1__0"


    // $ANTLR start "rule__MIncludes__Group_1__0__Impl"
    // InternalXMachine.g:1284:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1288:1: ( ( 'includes' ) )
            // InternalXMachine.g:1289:1: ( 'includes' )
            {
            // InternalXMachine.g:1289:1: ( 'includes' )
            // InternalXMachine.g:1290:2: 'includes'
            {
             before(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_1__0__Impl"


    // $ANTLR start "rule__MIncludes__Group_1__1"
    // InternalXMachine.g:1299:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1303:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:1304:2: rule__MIncludes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__1__Impl();

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
    // $ANTLR end "rule__MIncludes__Group_1__1"


    // $ANTLR start "rule__MIncludes__Group_1__1__Impl"
    // InternalXMachine.g:1310:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1314:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:1315:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:1315:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:1316:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            // InternalXMachine.g:1317:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:1317:3: rule__MIncludes__AbstractMachineAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__AbstractMachineAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_1__1__Impl"


    // $ANTLR start "rule__MIncludes__Group_2__0"
    // InternalXMachine.g:1326:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1330:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:1331:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_2__1();

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
    // $ANTLR end "rule__MIncludes__Group_2__0"


    // $ANTLR start "rule__MIncludes__Group_2__0__Impl"
    // InternalXMachine.g:1338:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1342:1: ( ( 'to' ) )
            // InternalXMachine.g:1343:1: ( 'to' )
            {
            // InternalXMachine.g:1343:1: ( 'to' )
            // InternalXMachine.g:1344:2: 'to'
            {
             before(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_2__0__Impl"


    // $ANTLR start "rule__MIncludes__Group_2__1"
    // InternalXMachine.g:1353:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1357:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:1358:2: rule__MIncludes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_2__1__Impl();

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
    // $ANTLR end "rule__MIncludes__Group_2__1"


    // $ANTLR start "rule__MIncludes__Group_2__1__Impl"
    // InternalXMachine.g:1364:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1368:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:1369:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:1369:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:1370:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            // InternalXMachine.g:1371:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:1371:3: rule__MIncludes__ConcreteMachineAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__ConcreteMachineAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_2__1__Impl"


    // $ANTLR start "rule__MIncludes__Group_3__0"
    // InternalXMachine.g:1380:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1384:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:1385:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__1();

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
    // $ANTLR end "rule__MIncludes__Group_3__0"


    // $ANTLR start "rule__MIncludes__Group_3__0__Impl"
    // InternalXMachine.g:1392:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1396:1: ( ( 'as' ) )
            // InternalXMachine.g:1397:1: ( 'as' )
            {
            // InternalXMachine.g:1397:1: ( 'as' )
            // InternalXMachine.g:1398:2: 'as'
            {
             before(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__0__Impl"


    // $ANTLR start "rule__MIncludes__Group_3__1"
    // InternalXMachine.g:1407:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1411:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:1412:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__MIncludes__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__2();

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
    // $ANTLR end "rule__MIncludes__Group_3__1"


    // $ANTLR start "rule__MIncludes__Group_3__1__Impl"
    // InternalXMachine.g:1419:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1423:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:1424:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:1424:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:1425:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            // InternalXMachine.g:1426:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:1426:3: rule__MIncludes__PrefixesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__PrefixesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__1__Impl"


    // $ANTLR start "rule__MIncludes__Group_3__2"
    // InternalXMachine.g:1434:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1438:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:1439:2: rule__MIncludes__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__2__Impl();

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
    // $ANTLR end "rule__MIncludes__Group_3__2"


    // $ANTLR start "rule__MIncludes__Group_3__2__Impl"
    // InternalXMachine.g:1445:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1449:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:1450:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:1450:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:1451:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            // InternalXMachine.g:1452:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXMachine.g:1452:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__MIncludes__PrefixesAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXMachine.g:1461:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1465:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:1466:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalXMachine.g:1473:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1477:1: ( ( RULE_ID ) )
            // InternalXMachine.g:1478:1: ( RULE_ID )
            {
            // InternalXMachine.g:1478:1: ( RULE_ID )
            // InternalXMachine.g:1479:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalXMachine.g:1488:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1492:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:1493:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalXMachine.g:1499:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1503:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:1504:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:1504:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:1505:2: ( rule__QualifiedName__Group_1__0 )?
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXMachine.g:1506:2: ( rule__QualifiedName__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:1506:3: rule__QualifiedName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalXMachine.g:1515:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1519:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:1520:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalXMachine.g:1527:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1531:1: ( ( '.' ) )
            // InternalXMachine.g:1532:1: ( '.' )
            {
            // InternalXMachine.g:1532:1: ( '.' )
            // InternalXMachine.g:1533:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalXMachine.g:1542:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1546:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:1547:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalXMachine.g:1553:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1557:1: ( ( RULE_ID ) )
            // InternalXMachine.g:1558:1: ( RULE_ID )
            {
            // InternalXMachine.g:1558:1: ( RULE_ID )
            // InternalXMachine.g:1559:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__XVariable__Group__0"
    // InternalXMachine.g:1569:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1573:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:1574:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXMachine.g:1581:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1585:1: ( ( () ) )
            // InternalXMachine.g:1586:1: ( () )
            {
            // InternalXMachine.g:1586:1: ( () )
            // InternalXMachine.g:1587:2: ()
            {
             before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            // InternalXMachine.g:1588:2: ()
            // InternalXMachine.g:1588:3: 
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
    // InternalXMachine.g:1596:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1600:1: ( rule__XVariable__Group__1__Impl )
            // InternalXMachine.g:1601:2: rule__XVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__1__Impl();

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
    // InternalXMachine.g:1607:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__NameAssignment_1 ) ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1611:1: ( ( ( rule__XVariable__NameAssignment_1 ) ) )
            // InternalXMachine.g:1612:1: ( ( rule__XVariable__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1612:1: ( ( rule__XVariable__NameAssignment_1 ) )
            // InternalXMachine.g:1613:2: ( rule__XVariable__NameAssignment_1 )
            {
             before(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1614:2: ( rule__XVariable__NameAssignment_1 )
            // InternalXMachine.g:1614:3: rule__XVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariableAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XInvariant__Group__0"
    // InternalXMachine.g:1623:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1627:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:1628:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:1635:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1639:1: ( ( () ) )
            // InternalXMachine.g:1640:1: ( () )
            {
            // InternalXMachine.g:1640:1: ( () )
            // InternalXMachine.g:1641:2: ()
            {
             before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            // InternalXMachine.g:1642:2: ()
            // InternalXMachine.g:1642:3: 
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
    // InternalXMachine.g:1650:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1654:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:1655:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXMachine.g:1662:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__NameAssignment_1 ) ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1666:1: ( ( ( rule__XInvariant__NameAssignment_1 ) ) )
            // InternalXMachine.g:1667:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1667:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            // InternalXMachine.g:1668:2: ( rule__XInvariant__NameAssignment_1 )
            {
             before(grammarAccess.getXInvariantAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1669:2: ( rule__XInvariant__NameAssignment_1 )
            // InternalXMachine.g:1669:3: rule__XInvariant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1677:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1681:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:1682:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
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
    // InternalXMachine.g:1689:1: rule__XInvariant__Group__2__Impl : ( ( rule__XInvariant__PredicateAssignment_2 ) ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1693:1: ( ( ( rule__XInvariant__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:1694:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:1694:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            // InternalXMachine.g:1695:2: ( rule__XInvariant__PredicateAssignment_2 )
            {
             before(grammarAccess.getXInvariantAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:1696:2: ( rule__XInvariant__PredicateAssignment_2 )
            // InternalXMachine.g:1696:3: rule__XInvariant__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getPredicateAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:1704:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1708:1: ( rule__XInvariant__Group__3__Impl )
            // InternalXMachine.g:1709:2: rule__XInvariant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__3__Impl();

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
    // InternalXMachine.g:1715:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__TheoremAssignment_3 )? ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1719:1: ( ( ( rule__XInvariant__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:1720:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:1720:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            // InternalXMachine.g:1721:2: ( rule__XInvariant__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXInvariantAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:1722:2: ( rule__XInvariant__TheoremAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:1722:3: rule__XInvariant__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariant__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXInvariantAccess().getTheoremAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__XVariant__Group__0"
    // InternalXMachine.g:1731:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1735:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:1736:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalXMachine.g:1743:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1747:1: ( ( () ) )
            // InternalXMachine.g:1748:1: ( () )
            {
            // InternalXMachine.g:1748:1: ( () )
            // InternalXMachine.g:1749:2: ()
            {
             before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            // InternalXMachine.g:1750:2: ()
            // InternalXMachine.g:1750:3: 
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
    // InternalXMachine.g:1758:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1762:1: ( rule__XVariant__Group__1__Impl )
            // InternalXMachine.g:1763:2: rule__XVariant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__1__Impl();

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
    // InternalXMachine.g:1769:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__ExpressionAssignment_1 ) ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1773:1: ( ( ( rule__XVariant__ExpressionAssignment_1 ) ) )
            // InternalXMachine.g:1774:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            {
            // InternalXMachine.g:1774:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            // InternalXMachine.g:1775:2: ( rule__XVariant__ExpressionAssignment_1 )
            {
             before(grammarAccess.getXVariantAccess().getExpressionAssignment_1()); 
            // InternalXMachine.g:1776:2: ( rule__XVariant__ExpressionAssignment_1 )
            // InternalXMachine.g:1776:3: rule__XVariant__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariantAccess().getExpressionAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__Group__0"
    // InternalXMachine.g:1785:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1789:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:1790:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXMachine.g:1797:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1801:1: ( ( () ) )
            // InternalXMachine.g:1802:1: ( () )
            {
            // InternalXMachine.g:1802:1: ( () )
            // InternalXMachine.g:1803:2: ()
            {
             before(grammarAccess.getXEventAccess().getEventAction_0()); 
            // InternalXMachine.g:1804:2: ()
            // InternalXMachine.g:1804:3: 
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
    // InternalXMachine.g:1812:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1816:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:1817:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXMachine.g:1824:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__NameAssignment_1 ) ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1828:1: ( ( ( rule__XEvent__NameAssignment_1 ) ) )
            // InternalXMachine.g:1829:1: ( ( rule__XEvent__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1829:1: ( ( rule__XEvent__NameAssignment_1 ) )
            // InternalXMachine.g:1830:2: ( rule__XEvent__NameAssignment_1 )
            {
             before(grammarAccess.getXEventAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1831:2: ( rule__XEvent__NameAssignment_1 )
            // InternalXMachine.g:1831:3: rule__XEvent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1839:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1843:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:1844:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
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
    // InternalXMachine.g:1851:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__UnorderedGroup_2 ) ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1855:1: ( ( ( rule__XEvent__UnorderedGroup_2 ) ) )
            // InternalXMachine.g:1856:1: ( ( rule__XEvent__UnorderedGroup_2 ) )
            {
            // InternalXMachine.g:1856:1: ( ( rule__XEvent__UnorderedGroup_2 ) )
            // InternalXMachine.g:1857:2: ( rule__XEvent__UnorderedGroup_2 )
            {
             before(grammarAccess.getXEventAccess().getUnorderedGroup_2()); 
            // InternalXMachine.g:1858:2: ( rule__XEvent__UnorderedGroup_2 )
            // InternalXMachine.g:1858:3: rule__XEvent__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getUnorderedGroup_2()); 

            }


            }

        }
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
    // InternalXMachine.g:1866:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1870:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:1871:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalXMachine.g:1878:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__ExtensionsAssignment_3 )* ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1882:1: ( ( ( rule__XEvent__ExtensionsAssignment_3 )* ) )
            // InternalXMachine.g:1883:1: ( ( rule__XEvent__ExtensionsAssignment_3 )* )
            {
            // InternalXMachine.g:1883:1: ( ( rule__XEvent__ExtensionsAssignment_3 )* )
            // InternalXMachine.g:1884:2: ( rule__XEvent__ExtensionsAssignment_3 )*
            {
             before(grammarAccess.getXEventAccess().getExtensionsAssignment_3()); 
            // InternalXMachine.g:1885:2: ( rule__XEvent__ExtensionsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXMachine.g:1885:3: rule__XEvent__ExtensionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__XEvent__ExtensionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getExtensionsAssignment_3()); 

            }


            }

        }
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
    // InternalXMachine.g:1893:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1897:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:1898:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalXMachine.g:1905:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__Group_4__0 )? ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1909:1: ( ( ( rule__XEvent__Group_4__0 )? ) )
            // InternalXMachine.g:1910:1: ( ( rule__XEvent__Group_4__0 )? )
            {
            // InternalXMachine.g:1910:1: ( ( rule__XEvent__Group_4__0 )? )
            // InternalXMachine.g:1911:2: ( rule__XEvent__Group_4__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_4()); 
            // InternalXMachine.g:1912:2: ( rule__XEvent__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:1912:3: rule__XEvent__Group_4__0
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
    // InternalXMachine.g:1920:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1924:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:1925:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalXMachine.g:1932:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Alternatives_5 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1936:1: ( ( ( rule__XEvent__Alternatives_5 )? ) )
            // InternalXMachine.g:1937:1: ( ( rule__XEvent__Alternatives_5 )? )
            {
            // InternalXMachine.g:1937:1: ( ( rule__XEvent__Alternatives_5 )? )
            // InternalXMachine.g:1938:2: ( rule__XEvent__Alternatives_5 )?
            {
             before(grammarAccess.getXEventAccess().getAlternatives_5()); 
            // InternalXMachine.g:1939:2: ( rule__XEvent__Alternatives_5 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=27 && LA23_0<=29)||LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:1939:3: rule__XEvent__Alternatives_5
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


    // $ANTLR start "rule__XEvent__Group__6"
    // InternalXMachine.g:1947:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1951:1: ( rule__XEvent__Group__6__Impl )
            // InternalXMachine.g:1952:2: rule__XEvent__Group__6__Impl
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
    // InternalXMachine.g:1958:1: rule__XEvent__Group__6__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1962:1: ( ( 'end' ) )
            // InternalXMachine.g:1963:1: ( 'end' )
            {
            // InternalXMachine.g:1963:1: ( 'end' )
            // InternalXMachine.g:1964:2: 'end'
            {
             before(grammarAccess.getXEventAccess().getEndKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEndKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__Group_4__0"
    // InternalXMachine.g:1974:1: rule__XEvent__Group_4__0 : rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1 ;
    public final void rule__XEvent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1978:1: ( rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1 )
            // InternalXMachine.g:1979:2: rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1
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
    // InternalXMachine.g:1986:1: rule__XEvent__Group_4__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1990:1: ( ( 'refines' ) )
            // InternalXMachine.g:1991:1: ( 'refines' )
            {
            // InternalXMachine.g:1991:1: ( 'refines' )
            // InternalXMachine.g:1992:2: 'refines'
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
    // InternalXMachine.g:2001:1: rule__XEvent__Group_4__1 : rule__XEvent__Group_4__1__Impl ;
    public final void rule__XEvent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2005:1: ( rule__XEvent__Group_4__1__Impl )
            // InternalXMachine.g:2006:2: rule__XEvent__Group_4__1__Impl
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
    // InternalXMachine.g:2012:1: rule__XEvent__Group_4__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) ) ;
    public final void rule__XEvent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2016:1: ( ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) ) )
            // InternalXMachine.g:2017:1: ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) )
            {
            // InternalXMachine.g:2017:1: ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) )
            // InternalXMachine.g:2018:2: ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* )
            {
            // InternalXMachine.g:2018:2: ( ( rule__XEvent__RefinesAssignment_4_1 ) )
            // InternalXMachine.g:2019:3: ( rule__XEvent__RefinesAssignment_4_1 )
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 
            // InternalXMachine.g:2020:3: ( rule__XEvent__RefinesAssignment_4_1 )
            // InternalXMachine.g:2020:4: rule__XEvent__RefinesAssignment_4_1
            {
            pushFollow(FOLLOW_7);
            rule__XEvent__RefinesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 

            }

            // InternalXMachine.g:2023:2: ( ( rule__XEvent__RefinesAssignment_4_1 )* )
            // InternalXMachine.g:2024:3: ( rule__XEvent__RefinesAssignment_4_1 )*
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 
            // InternalXMachine.g:2025:3: ( rule__XEvent__RefinesAssignment_4_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXMachine.g:2025:4: rule__XEvent__RefinesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__XEvent__RefinesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalXMachine.g:2035:1: rule__XEvent__Group_5_0__0 : rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 ;
    public final void rule__XEvent__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2039:1: ( rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 )
            // InternalXMachine.g:2040:2: rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1
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
    // InternalXMachine.g:2047:1: rule__XEvent__Group_5_0__0__Impl : ( ( rule__XEvent__Group_5_0_0__0 )? ) ;
    public final void rule__XEvent__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2051:1: ( ( ( rule__XEvent__Group_5_0_0__0 )? ) )
            // InternalXMachine.g:2052:1: ( ( rule__XEvent__Group_5_0_0__0 )? )
            {
            // InternalXMachine.g:2052:1: ( ( rule__XEvent__Group_5_0_0__0 )? )
            // InternalXMachine.g:2053:2: ( rule__XEvent__Group_5_0_0__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_0_0()); 
            // InternalXMachine.g:2054:2: ( rule__XEvent__Group_5_0_0__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:2054:3: rule__XEvent__Group_5_0_0__0
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
    // InternalXMachine.g:2062:1: rule__XEvent__Group_5_0__1 : rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2 ;
    public final void rule__XEvent__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2066:1: ( rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2 )
            // InternalXMachine.g:2067:2: rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:2074:1: rule__XEvent__Group_5_0__1__Impl : ( 'begin' ) ;
    public final void rule__XEvent__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2078:1: ( ( 'begin' ) )
            // InternalXMachine.g:2079:1: ( 'begin' )
            {
            // InternalXMachine.g:2079:1: ( 'begin' )
            // InternalXMachine.g:2080:2: 'begin'
            {
             before(grammarAccess.getXEventAccess().getBeginKeyword_5_0_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalXMachine.g:2089:1: rule__XEvent__Group_5_0__2 : rule__XEvent__Group_5_0__2__Impl ;
    public final void rule__XEvent__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2093:1: ( rule__XEvent__Group_5_0__2__Impl )
            // InternalXMachine.g:2094:2: rule__XEvent__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__2__Impl();

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
    // InternalXMachine.g:2100:1: rule__XEvent__Group_5_0__2__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) ) ;
    public final void rule__XEvent__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2104:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) ) )
            // InternalXMachine.g:2105:1: ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) )
            {
            // InternalXMachine.g:2105:1: ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) )
            // InternalXMachine.g:2106:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* )
            {
            // InternalXMachine.g:2106:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 ) )
            // InternalXMachine.g:2107:3: ( rule__XEvent__ActionsAssignment_5_0_2 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 
            // InternalXMachine.g:2108:3: ( rule__XEvent__ActionsAssignment_5_0_2 )
            // InternalXMachine.g:2108:4: rule__XEvent__ActionsAssignment_5_0_2
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__ActionsAssignment_5_0_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 

            }

            // InternalXMachine.g:2111:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 )* )
            // InternalXMachine.g:2112:3: ( rule__XEvent__ActionsAssignment_5_0_2 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 
            // InternalXMachine.g:2113:3: ( rule__XEvent__ActionsAssignment_5_0_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_XLABEL) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXMachine.g:2113:4: rule__XEvent__ActionsAssignment_5_0_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__ActionsAssignment_5_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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


    // $ANTLR start "rule__XEvent__Group_5_0_0__0"
    // InternalXMachine.g:2123:1: rule__XEvent__Group_5_0_0__0 : rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1 ;
    public final void rule__XEvent__Group_5_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2127:1: ( rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1 )
            // InternalXMachine.g:2128:2: rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:2135:1: rule__XEvent__Group_5_0_0__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2139:1: ( ( 'with' ) )
            // InternalXMachine.g:2140:1: ( 'with' )
            {
            // InternalXMachine.g:2140:1: ( 'with' )
            // InternalXMachine.g:2141:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_0_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalXMachine.g:2150:1: rule__XEvent__Group_5_0_0__1 : rule__XEvent__Group_5_0_0__1__Impl ;
    public final void rule__XEvent__Group_5_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2154:1: ( rule__XEvent__Group_5_0_0__1__Impl )
            // InternalXMachine.g:2155:2: rule__XEvent__Group_5_0_0__1__Impl
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
    // InternalXMachine.g:2161:1: rule__XEvent__Group_5_0_0__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) ) ;
    public final void rule__XEvent__Group_5_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2165:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) ) )
            // InternalXMachine.g:2166:1: ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) )
            {
            // InternalXMachine.g:2166:1: ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) )
            // InternalXMachine.g:2167:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* )
            {
            // InternalXMachine.g:2167:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) )
            // InternalXMachine.g:2168:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 
            // InternalXMachine.g:2169:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )
            // InternalXMachine.g:2169:4: rule__XEvent__WitnessesAssignment_5_0_0_1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__WitnessesAssignment_5_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 

            }

            // InternalXMachine.g:2172:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* )
            // InternalXMachine.g:2173:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 
            // InternalXMachine.g:2174:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_XLABEL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalXMachine.g:2174:4: rule__XEvent__WitnessesAssignment_5_0_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__WitnessesAssignment_5_0_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalXMachine.g:2184:1: rule__XEvent__Group_5_1__0 : rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 ;
    public final void rule__XEvent__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2188:1: ( rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 )
            // InternalXMachine.g:2189:2: rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:2196:1: rule__XEvent__Group_5_1__0__Impl : ( 'when' ) ;
    public final void rule__XEvent__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2200:1: ( ( 'when' ) )
            // InternalXMachine.g:2201:1: ( 'when' )
            {
            // InternalXMachine.g:2201:1: ( 'when' )
            // InternalXMachine.g:2202:2: 'when'
            {
             before(grammarAccess.getXEventAccess().getWhenKeyword_5_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalXMachine.g:2211:1: rule__XEvent__Group_5_1__1 : rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2 ;
    public final void rule__XEvent__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2215:1: ( rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2 )
            // InternalXMachine.g:2216:2: rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2223:1: rule__XEvent__Group_5_1__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2227:1: ( ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) ) )
            // InternalXMachine.g:2228:1: ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) )
            {
            // InternalXMachine.g:2228:1: ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) )
            // InternalXMachine.g:2229:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* )
            {
            // InternalXMachine.g:2229:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 ) )
            // InternalXMachine.g:2230:3: ( rule__XEvent__GuardsAssignment_5_1_1 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 
            // InternalXMachine.g:2231:3: ( rule__XEvent__GuardsAssignment_5_1_1 )
            // InternalXMachine.g:2231:4: rule__XEvent__GuardsAssignment_5_1_1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__GuardsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 

            }

            // InternalXMachine.g:2234:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 )* )
            // InternalXMachine.g:2235:3: ( rule__XEvent__GuardsAssignment_5_1_1 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 
            // InternalXMachine.g:2236:3: ( rule__XEvent__GuardsAssignment_5_1_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_XLABEL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalXMachine.g:2236:4: rule__XEvent__GuardsAssignment_5_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__GuardsAssignment_5_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalXMachine.g:2245:1: rule__XEvent__Group_5_1__2 : rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3 ;
    public final void rule__XEvent__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2249:1: ( rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3 )
            // InternalXMachine.g:2250:2: rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2257:1: rule__XEvent__Group_5_1__2__Impl : ( ( rule__XEvent__Group_5_1_2__0 )? ) ;
    public final void rule__XEvent__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2261:1: ( ( ( rule__XEvent__Group_5_1_2__0 )? ) )
            // InternalXMachine.g:2262:1: ( ( rule__XEvent__Group_5_1_2__0 )? )
            {
            // InternalXMachine.g:2262:1: ( ( rule__XEvent__Group_5_1_2__0 )? )
            // InternalXMachine.g:2263:2: ( rule__XEvent__Group_5_1_2__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_1_2()); 
            // InternalXMachine.g:2264:2: ( rule__XEvent__Group_5_1_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXMachine.g:2264:3: rule__XEvent__Group_5_1_2__0
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
    // InternalXMachine.g:2272:1: rule__XEvent__Group_5_1__3 : rule__XEvent__Group_5_1__3__Impl ;
    public final void rule__XEvent__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2276:1: ( rule__XEvent__Group_5_1__3__Impl )
            // InternalXMachine.g:2277:2: rule__XEvent__Group_5_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__3__Impl();

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
    // InternalXMachine.g:2283:1: rule__XEvent__Group_5_1__3__Impl : ( ( rule__XEvent__Group_5_1_3__0 )? ) ;
    public final void rule__XEvent__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2287:1: ( ( ( rule__XEvent__Group_5_1_3__0 )? ) )
            // InternalXMachine.g:2288:1: ( ( rule__XEvent__Group_5_1_3__0 )? )
            {
            // InternalXMachine.g:2288:1: ( ( rule__XEvent__Group_5_1_3__0 )? )
            // InternalXMachine.g:2289:2: ( rule__XEvent__Group_5_1_3__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_1_3()); 
            // InternalXMachine.g:2290:2: ( rule__XEvent__Group_5_1_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:2290:3: rule__XEvent__Group_5_1_3__0
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


    // $ANTLR start "rule__XEvent__Group_5_1_2__0"
    // InternalXMachine.g:2299:1: rule__XEvent__Group_5_1_2__0 : rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1 ;
    public final void rule__XEvent__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2303:1: ( rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1 )
            // InternalXMachine.g:2304:2: rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:2311:1: rule__XEvent__Group_5_1_2__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2315:1: ( ( 'with' ) )
            // InternalXMachine.g:2316:1: ( 'with' )
            {
            // InternalXMachine.g:2316:1: ( 'with' )
            // InternalXMachine.g:2317:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_1_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalXMachine.g:2326:1: rule__XEvent__Group_5_1_2__1 : rule__XEvent__Group_5_1_2__1__Impl ;
    public final void rule__XEvent__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2330:1: ( rule__XEvent__Group_5_1_2__1__Impl )
            // InternalXMachine.g:2331:2: rule__XEvent__Group_5_1_2__1__Impl
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
    // InternalXMachine.g:2337:1: rule__XEvent__Group_5_1_2__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2341:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) ) )
            // InternalXMachine.g:2342:1: ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) )
            {
            // InternalXMachine.g:2342:1: ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) )
            // InternalXMachine.g:2343:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* )
            {
            // InternalXMachine.g:2343:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) )
            // InternalXMachine.g:2344:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 
            // InternalXMachine.g:2345:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )
            // InternalXMachine.g:2345:4: rule__XEvent__WitnessesAssignment_5_1_2_1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__WitnessesAssignment_5_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 

            }

            // InternalXMachine.g:2348:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* )
            // InternalXMachine.g:2349:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 
            // InternalXMachine.g:2350:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_XLABEL) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXMachine.g:2350:4: rule__XEvent__WitnessesAssignment_5_1_2_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__WitnessesAssignment_5_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalXMachine.g:2360:1: rule__XEvent__Group_5_1_3__0 : rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1 ;
    public final void rule__XEvent__Group_5_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2364:1: ( rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1 )
            // InternalXMachine.g:2365:2: rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:2372:1: rule__XEvent__Group_5_1_3__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_5_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2376:1: ( ( 'then' ) )
            // InternalXMachine.g:2377:1: ( 'then' )
            {
            // InternalXMachine.g:2377:1: ( 'then' )
            // InternalXMachine.g:2378:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_5_1_3_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalXMachine.g:2387:1: rule__XEvent__Group_5_1_3__1 : rule__XEvent__Group_5_1_3__1__Impl ;
    public final void rule__XEvent__Group_5_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2391:1: ( rule__XEvent__Group_5_1_3__1__Impl )
            // InternalXMachine.g:2392:2: rule__XEvent__Group_5_1_3__1__Impl
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
    // InternalXMachine.g:2398:1: rule__XEvent__Group_5_1_3__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2402:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) ) )
            // InternalXMachine.g:2403:1: ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) )
            {
            // InternalXMachine.g:2403:1: ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) )
            // InternalXMachine.g:2404:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* )
            {
            // InternalXMachine.g:2404:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) )
            // InternalXMachine.g:2405:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 
            // InternalXMachine.g:2406:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )
            // InternalXMachine.g:2406:4: rule__XEvent__ActionsAssignment_5_1_3_1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__ActionsAssignment_5_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 

            }

            // InternalXMachine.g:2409:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* )
            // InternalXMachine.g:2410:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 
            // InternalXMachine.g:2411:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_XLABEL) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXMachine.g:2411:4: rule__XEvent__ActionsAssignment_5_1_3_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__ActionsAssignment_5_1_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalXMachine.g:2421:1: rule__XEvent__Group_5_2__0 : rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1 ;
    public final void rule__XEvent__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2425:1: ( rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1 )
            // InternalXMachine.g:2426:2: rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXMachine.g:2433:1: rule__XEvent__Group_5_2__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2437:1: ( ( 'any' ) )
            // InternalXMachine.g:2438:1: ( 'any' )
            {
            // InternalXMachine.g:2438:1: ( 'any' )
            // InternalXMachine.g:2439:2: 'any'
            {
             before(grammarAccess.getXEventAccess().getAnyKeyword_5_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalXMachine.g:2448:1: rule__XEvent__Group_5_2__1 : rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2 ;
    public final void rule__XEvent__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2452:1: ( rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2 )
            // InternalXMachine.g:2453:2: rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2460:1: rule__XEvent__Group_5_2__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2464:1: ( ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) ) )
            // InternalXMachine.g:2465:1: ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) )
            {
            // InternalXMachine.g:2465:1: ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) )
            // InternalXMachine.g:2466:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* )
            {
            // InternalXMachine.g:2466:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 ) )
            // InternalXMachine.g:2467:3: ( rule__XEvent__ParametersAssignment_5_2_1 )
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 
            // InternalXMachine.g:2468:3: ( rule__XEvent__ParametersAssignment_5_2_1 )
            // InternalXMachine.g:2468:4: rule__XEvent__ParametersAssignment_5_2_1
            {
            pushFollow(FOLLOW_7);
            rule__XEvent__ParametersAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 

            }

            // InternalXMachine.g:2471:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 )* )
            // InternalXMachine.g:2472:3: ( rule__XEvent__ParametersAssignment_5_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 
            // InternalXMachine.g:2473:3: ( rule__XEvent__ParametersAssignment_5_2_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXMachine.g:2473:4: rule__XEvent__ParametersAssignment_5_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__XEvent__ParametersAssignment_5_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalXMachine.g:2482:1: rule__XEvent__Group_5_2__2 : rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3 ;
    public final void rule__XEvent__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2486:1: ( rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3 )
            // InternalXMachine.g:2487:2: rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:2494:1: rule__XEvent__Group_5_2__2__Impl : ( 'where' ) ;
    public final void rule__XEvent__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2498:1: ( ( 'where' ) )
            // InternalXMachine.g:2499:1: ( 'where' )
            {
            // InternalXMachine.g:2499:1: ( 'where' )
            // InternalXMachine.g:2500:2: 'where'
            {
             before(grammarAccess.getXEventAccess().getWhereKeyword_5_2_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXMachine.g:2509:1: rule__XEvent__Group_5_2__3 : rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4 ;
    public final void rule__XEvent__Group_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2513:1: ( rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4 )
            // InternalXMachine.g:2514:2: rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2521:1: rule__XEvent__Group_5_2__3__Impl : ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) ) ;
    public final void rule__XEvent__Group_5_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2525:1: ( ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) ) )
            // InternalXMachine.g:2526:1: ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) )
            {
            // InternalXMachine.g:2526:1: ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) )
            // InternalXMachine.g:2527:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* )
            {
            // InternalXMachine.g:2527:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 ) )
            // InternalXMachine.g:2528:3: ( rule__XEvent__GuardsAssignment_5_2_3 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 
            // InternalXMachine.g:2529:3: ( rule__XEvent__GuardsAssignment_5_2_3 )
            // InternalXMachine.g:2529:4: rule__XEvent__GuardsAssignment_5_2_3
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__GuardsAssignment_5_2_3();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 

            }

            // InternalXMachine.g:2532:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 )* )
            // InternalXMachine.g:2533:3: ( rule__XEvent__GuardsAssignment_5_2_3 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 
            // InternalXMachine.g:2534:3: ( rule__XEvent__GuardsAssignment_5_2_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_XLABEL) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXMachine.g:2534:4: rule__XEvent__GuardsAssignment_5_2_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__GuardsAssignment_5_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalXMachine.g:2543:1: rule__XEvent__Group_5_2__4 : rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5 ;
    public final void rule__XEvent__Group_5_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2547:1: ( rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5 )
            // InternalXMachine.g:2548:2: rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2555:1: rule__XEvent__Group_5_2__4__Impl : ( ( rule__XEvent__Group_5_2_4__0 )? ) ;
    public final void rule__XEvent__Group_5_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2559:1: ( ( ( rule__XEvent__Group_5_2_4__0 )? ) )
            // InternalXMachine.g:2560:1: ( ( rule__XEvent__Group_5_2_4__0 )? )
            {
            // InternalXMachine.g:2560:1: ( ( rule__XEvent__Group_5_2_4__0 )? )
            // InternalXMachine.g:2561:2: ( rule__XEvent__Group_5_2_4__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_2_4()); 
            // InternalXMachine.g:2562:2: ( rule__XEvent__Group_5_2_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXMachine.g:2562:3: rule__XEvent__Group_5_2_4__0
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
    // InternalXMachine.g:2570:1: rule__XEvent__Group_5_2__5 : rule__XEvent__Group_5_2__5__Impl ;
    public final void rule__XEvent__Group_5_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2574:1: ( rule__XEvent__Group_5_2__5__Impl )
            // InternalXMachine.g:2575:2: rule__XEvent__Group_5_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__5__Impl();

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
    // InternalXMachine.g:2581:1: rule__XEvent__Group_5_2__5__Impl : ( ( rule__XEvent__Group_5_2_5__0 )? ) ;
    public final void rule__XEvent__Group_5_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2585:1: ( ( ( rule__XEvent__Group_5_2_5__0 )? ) )
            // InternalXMachine.g:2586:1: ( ( rule__XEvent__Group_5_2_5__0 )? )
            {
            // InternalXMachine.g:2586:1: ( ( rule__XEvent__Group_5_2_5__0 )? )
            // InternalXMachine.g:2587:2: ( rule__XEvent__Group_5_2_5__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_2_5()); 
            // InternalXMachine.g:2588:2: ( rule__XEvent__Group_5_2_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXMachine.g:2588:3: rule__XEvent__Group_5_2_5__0
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


    // $ANTLR start "rule__XEvent__Group_5_2_4__0"
    // InternalXMachine.g:2597:1: rule__XEvent__Group_5_2_4__0 : rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1 ;
    public final void rule__XEvent__Group_5_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2601:1: ( rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1 )
            // InternalXMachine.g:2602:2: rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:2609:1: rule__XEvent__Group_5_2_4__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2613:1: ( ( 'with' ) )
            // InternalXMachine.g:2614:1: ( 'with' )
            {
            // InternalXMachine.g:2614:1: ( 'with' )
            // InternalXMachine.g:2615:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_2_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalXMachine.g:2624:1: rule__XEvent__Group_5_2_4__1 : rule__XEvent__Group_5_2_4__1__Impl ;
    public final void rule__XEvent__Group_5_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2628:1: ( rule__XEvent__Group_5_2_4__1__Impl )
            // InternalXMachine.g:2629:2: rule__XEvent__Group_5_2_4__1__Impl
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
    // InternalXMachine.g:2635:1: rule__XEvent__Group_5_2_4__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2639:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) ) )
            // InternalXMachine.g:2640:1: ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) )
            {
            // InternalXMachine.g:2640:1: ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) )
            // InternalXMachine.g:2641:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* )
            {
            // InternalXMachine.g:2641:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) )
            // InternalXMachine.g:2642:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 
            // InternalXMachine.g:2643:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )
            // InternalXMachine.g:2643:4: rule__XEvent__WitnessesAssignment_5_2_4_1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__WitnessesAssignment_5_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 

            }

            // InternalXMachine.g:2646:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* )
            // InternalXMachine.g:2647:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 
            // InternalXMachine.g:2648:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_XLABEL) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXMachine.g:2648:4: rule__XEvent__WitnessesAssignment_5_2_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__WitnessesAssignment_5_2_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalXMachine.g:2658:1: rule__XEvent__Group_5_2_5__0 : rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1 ;
    public final void rule__XEvent__Group_5_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2662:1: ( rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1 )
            // InternalXMachine.g:2663:2: rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:2670:1: rule__XEvent__Group_5_2_5__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_5_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2674:1: ( ( 'then' ) )
            // InternalXMachine.g:2675:1: ( 'then' )
            {
            // InternalXMachine.g:2675:1: ( 'then' )
            // InternalXMachine.g:2676:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_5_2_5_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalXMachine.g:2685:1: rule__XEvent__Group_5_2_5__1 : rule__XEvent__Group_5_2_5__1__Impl ;
    public final void rule__XEvent__Group_5_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2689:1: ( rule__XEvent__Group_5_2_5__1__Impl )
            // InternalXMachine.g:2690:2: rule__XEvent__Group_5_2_5__1__Impl
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
    // InternalXMachine.g:2696:1: rule__XEvent__Group_5_2_5__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2700:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) ) )
            // InternalXMachine.g:2701:1: ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) )
            {
            // InternalXMachine.g:2701:1: ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) )
            // InternalXMachine.g:2702:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* )
            {
            // InternalXMachine.g:2702:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) )
            // InternalXMachine.g:2703:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 
            // InternalXMachine.g:2704:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )
            // InternalXMachine.g:2704:4: rule__XEvent__ActionsAssignment_5_2_5_1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__ActionsAssignment_5_2_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 

            }

            // InternalXMachine.g:2707:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* )
            // InternalXMachine.g:2708:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 
            // InternalXMachine.g:2709:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_XLABEL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalXMachine.g:2709:4: rule__XEvent__ActionsAssignment_5_2_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__ActionsAssignment_5_2_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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


    // $ANTLR start "rule__EventSync__Group__0"
    // InternalXMachine.g:2719:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2723:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:2724:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__EventSync__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group__1();

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
    // $ANTLR end "rule__EventSync__Group__0"


    // $ANTLR start "rule__EventSync__Group__0__Impl"
    // InternalXMachine.g:2731:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2735:1: ( ( () ) )
            // InternalXMachine.g:2736:1: ( () )
            {
            // InternalXMachine.g:2736:1: ( () )
            // InternalXMachine.g:2737:2: ()
            {
             before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            // InternalXMachine.g:2738:2: ()
            // InternalXMachine.g:2738:3: 
            {
            }

             after(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group__0__Impl"


    // $ANTLR start "rule__EventSync__Group__1"
    // InternalXMachine.g:2746:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2750:1: ( rule__EventSync__Group__1__Impl )
            // InternalXMachine.g:2751:2: rule__EventSync__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__1__Impl();

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
    // $ANTLR end "rule__EventSync__Group__1"


    // $ANTLR start "rule__EventSync__Group__1__Impl"
    // InternalXMachine.g:2757:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2761:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:2762:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:2762:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:2763:2: ( rule__EventSync__Group_1__0 )
            {
             before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            // InternalXMachine.g:2764:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:2764:3: rule__EventSync__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group__1__Impl"


    // $ANTLR start "rule__EventSync__Group_1__0"
    // InternalXMachine.g:2773:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2777:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:2778:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__EventSync__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__1();

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
    // $ANTLR end "rule__EventSync__Group_1__0"


    // $ANTLR start "rule__EventSync__Group_1__0__Impl"
    // InternalXMachine.g:2785:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2789:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:2790:1: ( 'synchronises' )
            {
            // InternalXMachine.g:2790:1: ( 'synchronises' )
            // InternalXMachine.g:2791:2: 'synchronises'
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__0__Impl"


    // $ANTLR start "rule__EventSync__Group_1__1"
    // InternalXMachine.g:2800:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2804:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:2805:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__EventSync__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__2();

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
    // $ANTLR end "rule__EventSync__Group_1__1"


    // $ANTLR start "rule__EventSync__Group_1__1__Impl"
    // InternalXMachine.g:2812:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2816:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:2817:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:2817:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:2818:2: ( rule__EventSync__Group_1_1__0 )?
            {
             before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            // InternalXMachine.g:2819:2: ( rule__EventSync__Group_1_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==26) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalXMachine.g:2819:3: rule__EventSync__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventSync__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventSyncAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__1__Impl"


    // $ANTLR start "rule__EventSync__Group_1__2"
    // InternalXMachine.g:2827:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2831:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:2832:2: rule__EventSync__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__2__Impl();

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
    // $ANTLR end "rule__EventSync__Group_1__2"


    // $ANTLR start "rule__EventSync__Group_1__2__Impl"
    // InternalXMachine.g:2838:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2842:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:2843:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:2843:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:2844:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            // InternalXMachine.g:2845:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:2845:3: rule__EventSync__SynchronisedEventAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__SynchronisedEventAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__2__Impl"


    // $ANTLR start "rule__EventSync__Group_1_1__0"
    // InternalXMachine.g:2854:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2858:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:2859:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__EventSync__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_1__1();

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
    // $ANTLR end "rule__EventSync__Group_1_1__0"


    // $ANTLR start "rule__EventSync__Group_1_1__0__Impl"
    // InternalXMachine.g:2866:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2870:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:2871:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:2871:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:2872:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
             before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            // InternalXMachine.g:2873:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:2873:3: rule__EventSync__PrefixAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__PrefixAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_1__0__Impl"


    // $ANTLR start "rule__EventSync__Group_1_1__1"
    // InternalXMachine.g:2881:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2885:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:2886:2: rule__EventSync__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__EventSync__Group_1_1__1"


    // $ANTLR start "rule__EventSync__Group_1_1__1__Impl"
    // InternalXMachine.g:2892:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2896:1: ( ( '.' ) )
            // InternalXMachine.g:2897:1: ( '.' )
            {
            // InternalXMachine.g:2897:1: ( '.' )
            // InternalXMachine.g:2898:2: '.'
            {
             before(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_1__1__Impl"


    // $ANTLR start "rule__XParameter__Group__0"
    // InternalXMachine.g:2908:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2912:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:2913:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXMachine.g:2920:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2924:1: ( ( () ) )
            // InternalXMachine.g:2925:1: ( () )
            {
            // InternalXMachine.g:2925:1: ( () )
            // InternalXMachine.g:2926:2: ()
            {
             before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            // InternalXMachine.g:2927:2: ()
            // InternalXMachine.g:2927:3: 
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
    // InternalXMachine.g:2935:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2939:1: ( rule__XParameter__Group__1__Impl )
            // InternalXMachine.g:2940:2: rule__XParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__1__Impl();

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
    // InternalXMachine.g:2946:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__NameAssignment_1 ) ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2950:1: ( ( ( rule__XParameter__NameAssignment_1 ) ) )
            // InternalXMachine.g:2951:1: ( ( rule__XParameter__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2951:1: ( ( rule__XParameter__NameAssignment_1 ) )
            // InternalXMachine.g:2952:2: ( rule__XParameter__NameAssignment_1 )
            {
             before(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2953:2: ( rule__XParameter__NameAssignment_1 )
            // InternalXMachine.g:2953:3: rule__XParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXParameterAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XGuard__Group__0"
    // InternalXMachine.g:2962:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2966:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:2967:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:2974:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2978:1: ( ( () ) )
            // InternalXMachine.g:2979:1: ( () )
            {
            // InternalXMachine.g:2979:1: ( () )
            // InternalXMachine.g:2980:2: ()
            {
             before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            // InternalXMachine.g:2981:2: ()
            // InternalXMachine.g:2981:3: 
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
    // InternalXMachine.g:2989:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2993:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:2994:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXMachine.g:3001:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__NameAssignment_1 ) ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3005:1: ( ( ( rule__XGuard__NameAssignment_1 ) ) )
            // InternalXMachine.g:3006:1: ( ( rule__XGuard__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3006:1: ( ( rule__XGuard__NameAssignment_1 ) )
            // InternalXMachine.g:3007:2: ( rule__XGuard__NameAssignment_1 )
            {
             before(grammarAccess.getXGuardAccess().getNameAssignment_1()); 
            // InternalXMachine.g:3008:2: ( rule__XGuard__NameAssignment_1 )
            // InternalXMachine.g:3008:3: rule__XGuard__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3016:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3020:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:3021:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
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
    // InternalXMachine.g:3028:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__PredicateAssignment_2 ) ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3032:1: ( ( ( rule__XGuard__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:3033:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:3033:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            // InternalXMachine.g:3034:2: ( rule__XGuard__PredicateAssignment_2 )
            {
             before(grammarAccess.getXGuardAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:3035:2: ( rule__XGuard__PredicateAssignment_2 )
            // InternalXMachine.g:3035:3: rule__XGuard__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getPredicateAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:3043:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3047:1: ( rule__XGuard__Group__3__Impl )
            // InternalXMachine.g:3048:2: rule__XGuard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__3__Impl();

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
    // InternalXMachine.g:3054:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__TheoremAssignment_3 )? ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3058:1: ( ( ( rule__XGuard__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:3059:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:3059:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            // InternalXMachine.g:3060:2: ( rule__XGuard__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXGuardAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:3061:2: ( rule__XGuard__TheoremAssignment_3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:3061:3: rule__XGuard__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGuardAccess().getTheoremAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__XWitness__Group__0"
    // InternalXMachine.g:3070:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3074:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:3075:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:3082:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3086:1: ( ( () ) )
            // InternalXMachine.g:3087:1: ( () )
            {
            // InternalXMachine.g:3087:1: ( () )
            // InternalXMachine.g:3088:2: ()
            {
             before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            // InternalXMachine.g:3089:2: ()
            // InternalXMachine.g:3089:3: 
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
    // InternalXMachine.g:3097:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3101:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:3102:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXMachine.g:3109:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__NameAssignment_1 ) ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3113:1: ( ( ( rule__XWitness__NameAssignment_1 ) ) )
            // InternalXMachine.g:3114:1: ( ( rule__XWitness__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3114:1: ( ( rule__XWitness__NameAssignment_1 ) )
            // InternalXMachine.g:3115:2: ( rule__XWitness__NameAssignment_1 )
            {
             before(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            // InternalXMachine.g:3116:2: ( rule__XWitness__NameAssignment_1 )
            // InternalXMachine.g:3116:3: rule__XWitness__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3124:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3128:1: ( rule__XWitness__Group__2__Impl )
            // InternalXMachine.g:3129:2: rule__XWitness__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__2__Impl();

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
    // InternalXMachine.g:3135:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__PredicateAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3139:1: ( ( ( rule__XWitness__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:3140:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:3140:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            // InternalXMachine.g:3141:2: ( rule__XWitness__PredicateAssignment_2 )
            {
             before(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:3142:2: ( rule__XWitness__PredicateAssignment_2 )
            // InternalXMachine.g:3142:3: rule__XWitness__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__XAction__Group__0"
    // InternalXMachine.g:3151:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3155:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:3156:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:3163:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3167:1: ( ( () ) )
            // InternalXMachine.g:3168:1: ( () )
            {
            // InternalXMachine.g:3168:1: ( () )
            // InternalXMachine.g:3169:2: ()
            {
             before(grammarAccess.getXActionAccess().getActionAction_0()); 
            // InternalXMachine.g:3170:2: ()
            // InternalXMachine.g:3170:3: 
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
    // InternalXMachine.g:3178:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3182:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:3183:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXMachine.g:3190:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__NameAssignment_1 ) ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3194:1: ( ( ( rule__XAction__NameAssignment_1 ) ) )
            // InternalXMachine.g:3195:1: ( ( rule__XAction__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3195:1: ( ( rule__XAction__NameAssignment_1 ) )
            // InternalXMachine.g:3196:2: ( rule__XAction__NameAssignment_1 )
            {
             before(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            // InternalXMachine.g:3197:2: ( rule__XAction__NameAssignment_1 )
            // InternalXMachine.g:3197:3: rule__XAction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XAction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3205:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3209:1: ( rule__XAction__Group__2__Impl )
            // InternalXMachine.g:3210:2: rule__XAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__2__Impl();

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
    // InternalXMachine.g:3216:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__ActionAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3220:1: ( ( ( rule__XAction__ActionAssignment_2 ) ) )
            // InternalXMachine.g:3221:1: ( ( rule__XAction__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:3221:1: ( ( rule__XAction__ActionAssignment_2 ) )
            // InternalXMachine.g:3222:2: ( rule__XAction__ActionAssignment_2 )
            {
             before(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            // InternalXMachine.g:3223:2: ( rule__XAction__ActionAssignment_2 )
            // InternalXMachine.g:3223:3: rule__XAction__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAction__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getActionAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__UnorderedGroup_2"
    // InternalXMachine.g:3232:1: rule__XEvent__UnorderedGroup_2 : ( rule__XEvent__UnorderedGroup_2__0 )? ;
    public final void rule__XEvent__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getXEventAccess().getUnorderedGroup_2());
        	
        try {
            // InternalXMachine.g:3237:1: ( ( rule__XEvent__UnorderedGroup_2__0 )? )
            // InternalXMachine.g:3238:2: ( rule__XEvent__UnorderedGroup_2__0 )?
            {
            // InternalXMachine.g:3238:2: ( rule__XEvent__UnorderedGroup_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 >= 12 && LA41_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:3238:2: rule__XEvent__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_2__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getXEventAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_2"


    // $ANTLR start "rule__XEvent__UnorderedGroup_2__Impl"
    // InternalXMachine.g:3246:1: rule__XEvent__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) ) ;
    public final void rule__XEvent__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:3251:1: ( ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) ) )
            // InternalXMachine.g:3252:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) )
            {
            // InternalXMachine.g:3252:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 >= 12 && LA42_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:3253:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) )
                    {
                    // InternalXMachine.g:3253:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) )
                    // InternalXMachine.g:3254:4: {...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalXMachine.g:3254:102: ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) )
                    // InternalXMachine.g:3255:5: ( ( rule__XEvent__ExtendedAssignment_2_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXMachine.g:3261:5: ( ( rule__XEvent__ExtendedAssignment_2_0 ) )
                    // InternalXMachine.g:3262:6: ( rule__XEvent__ExtendedAssignment_2_0 )
                    {
                     before(grammarAccess.getXEventAccess().getExtendedAssignment_2_0()); 
                    // InternalXMachine.g:3263:6: ( rule__XEvent__ExtendedAssignment_2_0 )
                    // InternalXMachine.g:3263:7: rule__XEvent__ExtendedAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ExtendedAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getExtendedAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3268:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) )
                    {
                    // InternalXMachine.g:3268:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) )
                    // InternalXMachine.g:3269:4: {...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalXMachine.g:3269:102: ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) )
                    // InternalXMachine.g:3270:5: ( ( rule__XEvent__ConvergenceAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXMachine.g:3276:5: ( ( rule__XEvent__ConvergenceAssignment_2_1 ) )
                    // InternalXMachine.g:3277:6: ( rule__XEvent__ConvergenceAssignment_2_1 )
                    {
                     before(grammarAccess.getXEventAccess().getConvergenceAssignment_2_1()); 
                    // InternalXMachine.g:3278:6: ( rule__XEvent__ConvergenceAssignment_2_1 )
                    // InternalXMachine.g:3278:7: rule__XEvent__ConvergenceAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ConvergenceAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getConvergenceAssignment_2_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__XEvent__UnorderedGroup_2__0"
    // InternalXMachine.g:3291:1: rule__XEvent__UnorderedGroup_2__0 : rule__XEvent__UnorderedGroup_2__Impl ( rule__XEvent__UnorderedGroup_2__1 )? ;
    public final void rule__XEvent__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3295:1: ( rule__XEvent__UnorderedGroup_2__Impl ( rule__XEvent__UnorderedGroup_2__1 )? )
            // InternalXMachine.g:3296:2: rule__XEvent__UnorderedGroup_2__Impl ( rule__XEvent__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_22);
            rule__XEvent__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalXMachine.g:3297:2: ( rule__XEvent__UnorderedGroup_2__1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 >= 12 && LA43_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXMachine.g:3297:2: rule__XEvent__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_2__1();

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
    // $ANTLR end "rule__XEvent__UnorderedGroup_2__0"


    // $ANTLR start "rule__XEvent__UnorderedGroup_2__1"
    // InternalXMachine.g:3303:1: rule__XEvent__UnorderedGroup_2__1 : rule__XEvent__UnorderedGroup_2__Impl ;
    public final void rule__XEvent__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3307:1: ( rule__XEvent__UnorderedGroup_2__Impl )
            // InternalXMachine.g:3308:2: rule__XEvent__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_2__Impl();

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
    // $ANTLR end "rule__XEvent__UnorderedGroup_2__1"


    // $ANTLR start "rule__Machine__CommentAssignment_1"
    // InternalXMachine.g:3315:1: rule__Machine__CommentAssignment_1 : ( ( rule__Machine__CommentAlternatives_1_0 ) ) ;
    public final void rule__Machine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3319:1: ( ( ( rule__Machine__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3320:2: ( ( rule__Machine__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3320:2: ( ( rule__Machine__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3321:3: ( rule__Machine__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getMachineAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3322:3: ( rule__Machine__CommentAlternatives_1_0 )
            // InternalXMachine.g:3322:4: rule__Machine__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__CommentAssignment_1"


    // $ANTLR start "rule__Machine__NameAssignment_3"
    // InternalXMachine.g:3330:1: rule__Machine__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3334:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3335:2: ( RULE_ID )
            {
            // InternalXMachine.g:3335:2: ( RULE_ID )
            // InternalXMachine.g:3336:3: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__NameAssignment_3"


    // $ANTLR start "rule__Machine__ExtensionsAssignment_4"
    // InternalXMachine.g:3345:1: rule__Machine__ExtensionsAssignment_4 : ( ruleMIncludes ) ;
    public final void rule__Machine__ExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3349:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:3350:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:3350:2: ( ruleMIncludes )
            // InternalXMachine.g:3351:3: ruleMIncludes
            {
             before(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMIncludes();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_4"


    // $ANTLR start "rule__Machine__RefinesAssignment_5_1"
    // InternalXMachine.g:3360:1: rule__Machine__RefinesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3364:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3365:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3365:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3366:3: ( RULE_ID )
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_5_1_0()); 
            // InternalXMachine.g:3367:3: ( RULE_ID )
            // InternalXMachine.g:3368:4: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__RefinesAssignment_5_1"


    // $ANTLR start "rule__Machine__SeesAssignment_6_1"
    // InternalXMachine.g:3379:1: rule__Machine__SeesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3383:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3384:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3384:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3385:3: ( RULE_ID )
            {
             before(grammarAccess.getMachineAccess().getSeesContextCrossReference_6_1_0()); 
            // InternalXMachine.g:3386:3: ( RULE_ID )
            // InternalXMachine.g:3387:4: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getSeesContextCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__SeesAssignment_6_1"


    // $ANTLR start "rule__Machine__VariablesAssignment_7_1"
    // InternalXMachine.g:3398:1: rule__Machine__VariablesAssignment_7_1 : ( ruleXVariable ) ;
    public final void rule__Machine__VariablesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3402:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:3403:2: ( ruleXVariable )
            {
            // InternalXMachine.g:3403:2: ( ruleXVariable )
            // InternalXMachine.g:3404:3: ruleXVariable
            {
             before(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXVariable();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariablesAssignment_7_1"


    // $ANTLR start "rule__Machine__InvariantsAssignment_8_1"
    // InternalXMachine.g:3413:1: rule__Machine__InvariantsAssignment_8_1 : ( ruleXInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3417:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:3418:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:3418:2: ( ruleXInvariant )
            // InternalXMachine.g:3419:3: ruleXInvariant
            {
             before(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXInvariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__InvariantsAssignment_8_1"


    // $ANTLR start "rule__Machine__VariantAssignment_9_1"
    // InternalXMachine.g:3428:1: rule__Machine__VariantAssignment_9_1 : ( ruleXVariant ) ;
    public final void rule__Machine__VariantAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3432:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:3433:2: ( ruleXVariant )
            {
            // InternalXMachine.g:3433:2: ( ruleXVariant )
            // InternalXMachine.g:3434:3: ruleXVariant
            {
             before(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXVariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariantAssignment_9_1"


    // $ANTLR start "rule__Machine__EventsAssignment_10_1"
    // InternalXMachine.g:3443:1: rule__Machine__EventsAssignment_10_1 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3447:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:3448:2: ( ruleXEvent )
            {
            // InternalXMachine.g:3448:2: ( ruleXEvent )
            // InternalXMachine.g:3449:3: ruleXEvent
            {
             before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_10_1"


    // $ANTLR start "rule__Machine__EventsAssignment_10_2"
    // InternalXMachine.g:3458:1: rule__Machine__EventsAssignment_10_2 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3462:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:3463:2: ( ruleXEvent )
            {
            // InternalXMachine.g:3463:2: ( ruleXEvent )
            // InternalXMachine.g:3464:3: ruleXEvent
            {
             before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_10_2"


    // $ANTLR start "rule__MIncludes__AbstractMachineAssignment_1_1"
    // InternalXMachine.g:3473:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3477:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:3478:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:3478:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:3479:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            // InternalXMachine.g:3480:3: ( ruleQualifiedName )
            // InternalXMachine.g:3481:4: ruleQualifiedName
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMIncludesAccess().getAbstractMachineMachineQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__AbstractMachineAssignment_1_1"


    // $ANTLR start "rule__MIncludes__ConcreteMachineAssignment_2_1"
    // InternalXMachine.g:3492:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3496:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3497:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3497:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3498:3: ( RULE_ID )
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            // InternalXMachine.g:3499:3: ( RULE_ID )
            // InternalXMachine.g:3500:4: RULE_ID
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getConcreteMachineMachineIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__ConcreteMachineAssignment_2_1"


    // $ANTLR start "rule__MIncludes__PrefixesAssignment_3_1"
    // InternalXMachine.g:3511:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3515:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3516:2: ( RULE_ID )
            {
            // InternalXMachine.g:3516:2: ( RULE_ID )
            // InternalXMachine.g:3517:3: RULE_ID
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__PrefixesAssignment_3_1"


    // $ANTLR start "rule__MIncludes__PrefixesAssignment_3_2"
    // InternalXMachine.g:3526:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3530:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3531:2: ( RULE_ID )
            {
            // InternalXMachine.g:3531:2: ( RULE_ID )
            // InternalXMachine.g:3532:3: RULE_ID
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__PrefixesAssignment_3_2"


    // $ANTLR start "rule__XVariable__NameAssignment_1"
    // InternalXMachine.g:3541:1: rule__XVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3545:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3546:2: ( RULE_ID )
            {
            // InternalXMachine.g:3546:2: ( RULE_ID )
            // InternalXMachine.g:3547:3: RULE_ID
            {
             before(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__NameAssignment_1"


    // $ANTLR start "rule__XInvariant__NameAssignment_1"
    // InternalXMachine.g:3556:1: rule__XInvariant__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XInvariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3560:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3561:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3561:2: ( RULE_XLABEL )
            // InternalXMachine.g:3562:3: RULE_XLABEL
            {
             before(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__NameAssignment_1"


    // $ANTLR start "rule__XInvariant__PredicateAssignment_2"
    // InternalXMachine.g:3571:1: rule__XInvariant__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XInvariant__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3575:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:3576:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:3576:2: ( ruleXPredicate )
            // InternalXMachine.g:3577:3: ruleXPredicate
            {
             before(grammarAccess.getXInvariantAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXInvariantAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__PredicateAssignment_2"


    // $ANTLR start "rule__XInvariant__TheoremAssignment_3"
    // InternalXMachine.g:3586:1: rule__XInvariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3590:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3591:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3591:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3592:3: ( 'theorem' )
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:3593:3: ( 'theorem' )
            // InternalXMachine.g:3594:4: 'theorem'
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__TheoremAssignment_3"


    // $ANTLR start "rule__XVariant__ExpressionAssignment_1"
    // InternalXMachine.g:3605:1: rule__XVariant__ExpressionAssignment_1 : ( ruleXPredicate ) ;
    public final void rule__XVariant__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3609:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:3610:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:3610:2: ( ruleXPredicate )
            // InternalXMachine.g:3611:3: ruleXPredicate
            {
             before(grammarAccess.getXVariantAccess().getExpressionXPredicateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXVariantAccess().getExpressionXPredicateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__ExpressionAssignment_1"


    // $ANTLR start "rule__XEvent__NameAssignment_1"
    // InternalXMachine.g:3620:1: rule__XEvent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3624:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3625:2: ( RULE_ID )
            {
            // InternalXMachine.g:3625:2: ( RULE_ID )
            // InternalXMachine.g:3626:3: RULE_ID
            {
             before(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__NameAssignment_1"


    // $ANTLR start "rule__XEvent__ExtendedAssignment_2_0"
    // InternalXMachine.g:3635:1: rule__XEvent__ExtendedAssignment_2_0 : ( ( 'extended' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3639:1: ( ( ( 'extended' ) ) )
            // InternalXMachine.g:3640:2: ( ( 'extended' ) )
            {
            // InternalXMachine.g:3640:2: ( ( 'extended' ) )
            // InternalXMachine.g:3641:3: ( 'extended' )
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 
            // InternalXMachine.g:3642:3: ( 'extended' )
            // InternalXMachine.g:3643:4: 'extended'
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 

            }

             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtendedAssignment_2_0"


    // $ANTLR start "rule__XEvent__ConvergenceAssignment_2_1"
    // InternalXMachine.g:3654:1: rule__XEvent__ConvergenceAssignment_2_1 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3658:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:3659:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:3659:2: ( ruleXConvergence )
            // InternalXMachine.g:3660:3: ruleXConvergence
            {
             before(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXConvergence();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ConvergenceAssignment_2_1"


    // $ANTLR start "rule__XEvent__ExtensionsAssignment_3"
    // InternalXMachine.g:3669:1: rule__XEvent__ExtensionsAssignment_3 : ( ruleEventSync ) ;
    public final void rule__XEvent__ExtensionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3673:1: ( ( ruleEventSync ) )
            // InternalXMachine.g:3674:2: ( ruleEventSync )
            {
            // InternalXMachine.g:3674:2: ( ruleEventSync )
            // InternalXMachine.g:3675:3: ruleEventSync
            {
             before(grammarAccess.getXEventAccess().getExtensionsEventSyncParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEventSync();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getExtensionsEventSyncParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtensionsAssignment_3"


    // $ANTLR start "rule__XEvent__RefinesAssignment_4_1"
    // InternalXMachine.g:3684:1: rule__XEvent__RefinesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3688:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3689:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3689:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3690:3: ( RULE_ID )
            {
             before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_0()); 
            // InternalXMachine.g:3691:3: ( RULE_ID )
            // InternalXMachine.g:3692:4: RULE_ID
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
    // InternalXMachine.g:3703:1: rule__XEvent__WitnessesAssignment_5_0_0_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3707:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:3708:2: ( ruleXWitness )
            {
            // InternalXMachine.g:3708:2: ( ruleXWitness )
            // InternalXMachine.g:3709:3: ruleXWitness
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
    // InternalXMachine.g:3718:1: rule__XEvent__ActionsAssignment_5_0_2 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3722:1: ( ( ruleXAction ) )
            // InternalXMachine.g:3723:2: ( ruleXAction )
            {
            // InternalXMachine.g:3723:2: ( ruleXAction )
            // InternalXMachine.g:3724:3: ruleXAction
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
    // InternalXMachine.g:3733:1: rule__XEvent__GuardsAssignment_5_1_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3737:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:3738:2: ( ruleXGuard )
            {
            // InternalXMachine.g:3738:2: ( ruleXGuard )
            // InternalXMachine.g:3739:3: ruleXGuard
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
    // InternalXMachine.g:3748:1: rule__XEvent__WitnessesAssignment_5_1_2_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3752:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:3753:2: ( ruleXWitness )
            {
            // InternalXMachine.g:3753:2: ( ruleXWitness )
            // InternalXMachine.g:3754:3: ruleXWitness
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
    // InternalXMachine.g:3763:1: rule__XEvent__ActionsAssignment_5_1_3_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3767:1: ( ( ruleXAction ) )
            // InternalXMachine.g:3768:2: ( ruleXAction )
            {
            // InternalXMachine.g:3768:2: ( ruleXAction )
            // InternalXMachine.g:3769:3: ruleXAction
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
    // InternalXMachine.g:3778:1: rule__XEvent__ParametersAssignment_5_2_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3782:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:3783:2: ( ruleXParameter )
            {
            // InternalXMachine.g:3783:2: ( ruleXParameter )
            // InternalXMachine.g:3784:3: ruleXParameter
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
    // InternalXMachine.g:3793:1: rule__XEvent__GuardsAssignment_5_2_3 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_5_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3797:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:3798:2: ( ruleXGuard )
            {
            // InternalXMachine.g:3798:2: ( ruleXGuard )
            // InternalXMachine.g:3799:3: ruleXGuard
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
    // InternalXMachine.g:3808:1: rule__XEvent__WitnessesAssignment_5_2_4_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3812:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:3813:2: ( ruleXWitness )
            {
            // InternalXMachine.g:3813:2: ( ruleXWitness )
            // InternalXMachine.g:3814:3: ruleXWitness
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
    // InternalXMachine.g:3823:1: rule__XEvent__ActionsAssignment_5_2_5_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3827:1: ( ( ruleXAction ) )
            // InternalXMachine.g:3828:2: ( ruleXAction )
            {
            // InternalXMachine.g:3828:2: ( ruleXAction )
            // InternalXMachine.g:3829:3: ruleXAction
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


    // $ANTLR start "rule__EventSync__PrefixAssignment_1_1_0"
    // InternalXMachine.g:3838:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3842:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3843:2: ( RULE_ID )
            {
            // InternalXMachine.g:3843:2: ( RULE_ID )
            // InternalXMachine.g:3844:3: RULE_ID
            {
             before(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__PrefixAssignment_1_1_0"


    // $ANTLR start "rule__EventSync__SynchronisedEventAssignment_1_2"
    // InternalXMachine.g:3853:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3857:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3858:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3858:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3859:3: ( RULE_ID )
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            // InternalXMachine.g:3860:3: ( RULE_ID )
            // InternalXMachine.g:3861:4: RULE_ID
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__SynchronisedEventAssignment_1_2"


    // $ANTLR start "rule__XParameter__NameAssignment_1"
    // InternalXMachine.g:3872:1: rule__XParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3876:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3877:2: ( RULE_ID )
            {
            // InternalXMachine.g:3877:2: ( RULE_ID )
            // InternalXMachine.g:3878:3: RULE_ID
            {
             before(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__NameAssignment_1"


    // $ANTLR start "rule__XGuard__NameAssignment_1"
    // InternalXMachine.g:3887:1: rule__XGuard__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3891:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3892:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3892:2: ( RULE_XLABEL )
            // InternalXMachine.g:3893:3: RULE_XLABEL
            {
             before(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__NameAssignment_1"


    // $ANTLR start "rule__XGuard__PredicateAssignment_2"
    // InternalXMachine.g:3902:1: rule__XGuard__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XGuard__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3906:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:3907:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:3907:2: ( ruleXPredicate )
            // InternalXMachine.g:3908:3: ruleXPredicate
            {
             before(grammarAccess.getXGuardAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXGuardAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__PredicateAssignment_2"


    // $ANTLR start "rule__XGuard__TheoremAssignment_3"
    // InternalXMachine.g:3917:1: rule__XGuard__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3921:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3922:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3922:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3923:3: ( 'theorem' )
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:3924:3: ( 'theorem' )
            // InternalXMachine.g:3925:4: 'theorem'
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__TheoremAssignment_3"


    // $ANTLR start "rule__XWitness__NameAssignment_1"
    // InternalXMachine.g:3936:1: rule__XWitness__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3940:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3941:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3941:2: ( RULE_XLABEL )
            // InternalXMachine.g:3942:3: RULE_XLABEL
            {
             before(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__NameAssignment_1"


    // $ANTLR start "rule__XWitness__PredicateAssignment_2"
    // InternalXMachine.g:3951:1: rule__XWitness__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XWitness__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3955:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:3956:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:3956:2: ( ruleXPredicate )
            // InternalXMachine.g:3957:3: ruleXPredicate
            {
             before(grammarAccess.getXWitnessAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXWitnessAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__PredicateAssignment_2"


    // $ANTLR start "rule__XAction__NameAssignment_1"
    // InternalXMachine.g:3966:1: rule__XAction__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3970:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3971:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3971:2: ( RULE_XLABEL )
            // InternalXMachine.g:3972:3: RULE_XLABEL
            {
             before(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__NameAssignment_1"


    // $ANTLR start "rule__XAction__ActionAssignment_2"
    // InternalXMachine.g:3981:1: rule__XAction__ActionAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XAction__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3985:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:3986:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:3986:2: ( ruleXPredicate )
            // InternalXMachine.g:3987:3: ruleXPredicate
            {
             before(grammarAccess.getXActionAccess().getActionXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXActionAccess().getActionXPredicateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__ActionAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000FF0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800007000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000002B8030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800007002L});

}
