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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'end'", "'id'", "'refines'", "'includes'", "'to'", "'as'", "'theorem'"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=9;
    public static final int RULE_ML_COMMENT=4;

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
    // InternalXMachine.g:87:1: ruleXVariable : ( ( rule__XVariable__Alternatives ) ) ;
    public final void ruleXVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:91:2: ( ( ( rule__XVariable__Alternatives ) ) )
            // InternalXMachine.g:92:2: ( ( rule__XVariable__Alternatives ) )
            {
            // InternalXMachine.g:92:2: ( ( rule__XVariable__Alternatives ) )
            // InternalXMachine.g:93:3: ( rule__XVariable__Alternatives )
            {
             before(grammarAccess.getXVariableAccess().getAlternatives()); 
            // InternalXMachine.g:94:3: ( rule__XVariable__Alternatives )
            // InternalXMachine.g:94:4: rule__XVariable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXVariableAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleXVariableNoComment"
    // InternalXMachine.g:103:1: entryRuleXVariableNoComment : ruleXVariableNoComment EOF ;
    public final void entryRuleXVariableNoComment() throws RecognitionException {
        try {
            // InternalXMachine.g:104:1: ( ruleXVariableNoComment EOF )
            // InternalXMachine.g:105:1: ruleXVariableNoComment EOF
            {
             before(grammarAccess.getXVariableNoCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariableNoComment();

            state._fsp--;

             after(grammarAccess.getXVariableNoCommentRule()); 
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
    // $ANTLR end "entryRuleXVariableNoComment"


    // $ANTLR start "ruleXVariableNoComment"
    // InternalXMachine.g:112:1: ruleXVariableNoComment : ( ( rule__XVariableNoComment__Group__0 ) ) ;
    public final void ruleXVariableNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:116:2: ( ( ( rule__XVariableNoComment__Group__0 ) ) )
            // InternalXMachine.g:117:2: ( ( rule__XVariableNoComment__Group__0 ) )
            {
            // InternalXMachine.g:117:2: ( ( rule__XVariableNoComment__Group__0 ) )
            // InternalXMachine.g:118:3: ( rule__XVariableNoComment__Group__0 )
            {
             before(grammarAccess.getXVariableNoCommentAccess().getGroup()); 
            // InternalXMachine.g:119:3: ( rule__XVariableNoComment__Group__0 )
            // InternalXMachine.g:119:4: rule__XVariableNoComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariableNoComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariableNoCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariableNoComment"


    // $ANTLR start "entryRuleXVariableMLComment"
    // InternalXMachine.g:128:1: entryRuleXVariableMLComment : ruleXVariableMLComment EOF ;
    public final void entryRuleXVariableMLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:129:1: ( ruleXVariableMLComment EOF )
            // InternalXMachine.g:130:1: ruleXVariableMLComment EOF
            {
             before(grammarAccess.getXVariableMLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariableMLComment();

            state._fsp--;

             after(grammarAccess.getXVariableMLCommentRule()); 
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
    // $ANTLR end "entryRuleXVariableMLComment"


    // $ANTLR start "ruleXVariableMLComment"
    // InternalXMachine.g:137:1: ruleXVariableMLComment : ( ( rule__XVariableMLComment__Group__0 ) ) ;
    public final void ruleXVariableMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:141:2: ( ( ( rule__XVariableMLComment__Group__0 ) ) )
            // InternalXMachine.g:142:2: ( ( rule__XVariableMLComment__Group__0 ) )
            {
            // InternalXMachine.g:142:2: ( ( rule__XVariableMLComment__Group__0 ) )
            // InternalXMachine.g:143:3: ( rule__XVariableMLComment__Group__0 )
            {
             before(grammarAccess.getXVariableMLCommentAccess().getGroup()); 
            // InternalXMachine.g:144:3: ( rule__XVariableMLComment__Group__0 )
            // InternalXMachine.g:144:4: rule__XVariableMLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariableMLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariableMLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariableMLComment"


    // $ANTLR start "entryRuleXVariableSLComment"
    // InternalXMachine.g:153:1: entryRuleXVariableSLComment : ruleXVariableSLComment EOF ;
    public final void entryRuleXVariableSLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:154:1: ( ruleXVariableSLComment EOF )
            // InternalXMachine.g:155:1: ruleXVariableSLComment EOF
            {
             before(grammarAccess.getXVariableSLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariableSLComment();

            state._fsp--;

             after(grammarAccess.getXVariableSLCommentRule()); 
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
    // $ANTLR end "entryRuleXVariableSLComment"


    // $ANTLR start "ruleXVariableSLComment"
    // InternalXMachine.g:162:1: ruleXVariableSLComment : ( ( rule__XVariableSLComment__Group__0 ) ) ;
    public final void ruleXVariableSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:166:2: ( ( ( rule__XVariableSLComment__Group__0 ) ) )
            // InternalXMachine.g:167:2: ( ( rule__XVariableSLComment__Group__0 ) )
            {
            // InternalXMachine.g:167:2: ( ( rule__XVariableSLComment__Group__0 ) )
            // InternalXMachine.g:168:3: ( rule__XVariableSLComment__Group__0 )
            {
             before(grammarAccess.getXVariableSLCommentAccess().getGroup()); 
            // InternalXMachine.g:169:3: ( rule__XVariableSLComment__Group__0 )
            // InternalXMachine.g:169:4: rule__XVariableSLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariableSLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariableSLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariableSLComment"


    // $ANTLR start "entryRuleXInvariant"
    // InternalXMachine.g:178:1: entryRuleXInvariant : ruleXInvariant EOF ;
    public final void entryRuleXInvariant() throws RecognitionException {
        try {
            // InternalXMachine.g:179:1: ( ruleXInvariant EOF )
            // InternalXMachine.g:180:1: ruleXInvariant EOF
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
    // InternalXMachine.g:187:1: ruleXInvariant : ( ( rule__XInvariant__Alternatives ) ) ;
    public final void ruleXInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:191:2: ( ( ( rule__XInvariant__Alternatives ) ) )
            // InternalXMachine.g:192:2: ( ( rule__XInvariant__Alternatives ) )
            {
            // InternalXMachine.g:192:2: ( ( rule__XInvariant__Alternatives ) )
            // InternalXMachine.g:193:3: ( rule__XInvariant__Alternatives )
            {
             before(grammarAccess.getXInvariantAccess().getAlternatives()); 
            // InternalXMachine.g:194:3: ( rule__XInvariant__Alternatives )
            // InternalXMachine.g:194:4: rule__XInvariant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleXInvariantNoComment"
    // InternalXMachine.g:203:1: entryRuleXInvariantNoComment : ruleXInvariantNoComment EOF ;
    public final void entryRuleXInvariantNoComment() throws RecognitionException {
        try {
            // InternalXMachine.g:204:1: ( ruleXInvariantNoComment EOF )
            // InternalXMachine.g:205:1: ruleXInvariantNoComment EOF
            {
             before(grammarAccess.getXInvariantNoCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXInvariantNoComment();

            state._fsp--;

             after(grammarAccess.getXInvariantNoCommentRule()); 
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
    // $ANTLR end "entryRuleXInvariantNoComment"


    // $ANTLR start "ruleXInvariantNoComment"
    // InternalXMachine.g:212:1: ruleXInvariantNoComment : ( ( rule__XInvariantNoComment__Group__0 ) ) ;
    public final void ruleXInvariantNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:216:2: ( ( ( rule__XInvariantNoComment__Group__0 ) ) )
            // InternalXMachine.g:217:2: ( ( rule__XInvariantNoComment__Group__0 ) )
            {
            // InternalXMachine.g:217:2: ( ( rule__XInvariantNoComment__Group__0 ) )
            // InternalXMachine.g:218:3: ( rule__XInvariantNoComment__Group__0 )
            {
             before(grammarAccess.getXInvariantNoCommentAccess().getGroup()); 
            // InternalXMachine.g:219:3: ( rule__XInvariantNoComment__Group__0 )
            // InternalXMachine.g:219:4: rule__XInvariantNoComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantNoComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantNoCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXInvariantNoComment"


    // $ANTLR start "entryRuleXInvariantMLComment"
    // InternalXMachine.g:228:1: entryRuleXInvariantMLComment : ruleXInvariantMLComment EOF ;
    public final void entryRuleXInvariantMLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:229:1: ( ruleXInvariantMLComment EOF )
            // InternalXMachine.g:230:1: ruleXInvariantMLComment EOF
            {
             before(grammarAccess.getXInvariantMLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXInvariantMLComment();

            state._fsp--;

             after(grammarAccess.getXInvariantMLCommentRule()); 
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
    // $ANTLR end "entryRuleXInvariantMLComment"


    // $ANTLR start "ruleXInvariantMLComment"
    // InternalXMachine.g:237:1: ruleXInvariantMLComment : ( ( rule__XInvariantMLComment__Group__0 ) ) ;
    public final void ruleXInvariantMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:241:2: ( ( ( rule__XInvariantMLComment__Group__0 ) ) )
            // InternalXMachine.g:242:2: ( ( rule__XInvariantMLComment__Group__0 ) )
            {
            // InternalXMachine.g:242:2: ( ( rule__XInvariantMLComment__Group__0 ) )
            // InternalXMachine.g:243:3: ( rule__XInvariantMLComment__Group__0 )
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getGroup()); 
            // InternalXMachine.g:244:3: ( rule__XInvariantMLComment__Group__0 )
            // InternalXMachine.g:244:4: rule__XInvariantMLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantMLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantMLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXInvariantMLComment"


    // $ANTLR start "entryRuleXInvariantSLComment"
    // InternalXMachine.g:253:1: entryRuleXInvariantSLComment : ruleXInvariantSLComment EOF ;
    public final void entryRuleXInvariantSLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:254:1: ( ruleXInvariantSLComment EOF )
            // InternalXMachine.g:255:1: ruleXInvariantSLComment EOF
            {
             before(grammarAccess.getXInvariantSLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXInvariantSLComment();

            state._fsp--;

             after(grammarAccess.getXInvariantSLCommentRule()); 
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
    // $ANTLR end "entryRuleXInvariantSLComment"


    // $ANTLR start "ruleXInvariantSLComment"
    // InternalXMachine.g:262:1: ruleXInvariantSLComment : ( ( rule__XInvariantSLComment__Group__0 ) ) ;
    public final void ruleXInvariantSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:266:2: ( ( ( rule__XInvariantSLComment__Group__0 ) ) )
            // InternalXMachine.g:267:2: ( ( rule__XInvariantSLComment__Group__0 ) )
            {
            // InternalXMachine.g:267:2: ( ( rule__XInvariantSLComment__Group__0 ) )
            // InternalXMachine.g:268:3: ( rule__XInvariantSLComment__Group__0 )
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getGroup()); 
            // InternalXMachine.g:269:3: ( rule__XInvariantSLComment__Group__0 )
            // InternalXMachine.g:269:4: rule__XInvariantSLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantSLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantSLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXInvariantSLComment"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:278:1: entryRuleXVariant : ruleXVariant EOF ;
    public final void entryRuleXVariant() throws RecognitionException {
        try {
            // InternalXMachine.g:279:1: ( ruleXVariant EOF )
            // InternalXMachine.g:280:1: ruleXVariant EOF
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
    // InternalXMachine.g:287:1: ruleXVariant : ( ( rule__XVariant__Alternatives ) ) ;
    public final void ruleXVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:291:2: ( ( ( rule__XVariant__Alternatives ) ) )
            // InternalXMachine.g:292:2: ( ( rule__XVariant__Alternatives ) )
            {
            // InternalXMachine.g:292:2: ( ( rule__XVariant__Alternatives ) )
            // InternalXMachine.g:293:3: ( rule__XVariant__Alternatives )
            {
             before(grammarAccess.getXVariantAccess().getAlternatives()); 
            // InternalXMachine.g:294:3: ( rule__XVariant__Alternatives )
            // InternalXMachine.g:294:4: rule__XVariant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXVariantAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleXVariantNoComment"
    // InternalXMachine.g:303:1: entryRuleXVariantNoComment : ruleXVariantNoComment EOF ;
    public final void entryRuleXVariantNoComment() throws RecognitionException {
        try {
            // InternalXMachine.g:304:1: ( ruleXVariantNoComment EOF )
            // InternalXMachine.g:305:1: ruleXVariantNoComment EOF
            {
             before(grammarAccess.getXVariantNoCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariantNoComment();

            state._fsp--;

             after(grammarAccess.getXVariantNoCommentRule()); 
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
    // $ANTLR end "entryRuleXVariantNoComment"


    // $ANTLR start "ruleXVariantNoComment"
    // InternalXMachine.g:312:1: ruleXVariantNoComment : ( ( rule__XVariantNoComment__Group__0 ) ) ;
    public final void ruleXVariantNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:316:2: ( ( ( rule__XVariantNoComment__Group__0 ) ) )
            // InternalXMachine.g:317:2: ( ( rule__XVariantNoComment__Group__0 ) )
            {
            // InternalXMachine.g:317:2: ( ( rule__XVariantNoComment__Group__0 ) )
            // InternalXMachine.g:318:3: ( rule__XVariantNoComment__Group__0 )
            {
             before(grammarAccess.getXVariantNoCommentAccess().getGroup()); 
            // InternalXMachine.g:319:3: ( rule__XVariantNoComment__Group__0 )
            // InternalXMachine.g:319:4: rule__XVariantNoComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariantNoComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariantNoCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariantNoComment"


    // $ANTLR start "entryRuleXVariantMLComment"
    // InternalXMachine.g:328:1: entryRuleXVariantMLComment : ruleXVariantMLComment EOF ;
    public final void entryRuleXVariantMLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:329:1: ( ruleXVariantMLComment EOF )
            // InternalXMachine.g:330:1: ruleXVariantMLComment EOF
            {
             before(grammarAccess.getXVariantMLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariantMLComment();

            state._fsp--;

             after(grammarAccess.getXVariantMLCommentRule()); 
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
    // $ANTLR end "entryRuleXVariantMLComment"


    // $ANTLR start "ruleXVariantMLComment"
    // InternalXMachine.g:337:1: ruleXVariantMLComment : ( ( rule__XVariantMLComment__Group__0 ) ) ;
    public final void ruleXVariantMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:341:2: ( ( ( rule__XVariantMLComment__Group__0 ) ) )
            // InternalXMachine.g:342:2: ( ( rule__XVariantMLComment__Group__0 ) )
            {
            // InternalXMachine.g:342:2: ( ( rule__XVariantMLComment__Group__0 ) )
            // InternalXMachine.g:343:3: ( rule__XVariantMLComment__Group__0 )
            {
             before(grammarAccess.getXVariantMLCommentAccess().getGroup()); 
            // InternalXMachine.g:344:3: ( rule__XVariantMLComment__Group__0 )
            // InternalXMachine.g:344:4: rule__XVariantMLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariantMLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariantMLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariantMLComment"


    // $ANTLR start "entryRuleXVariantSLComment"
    // InternalXMachine.g:353:1: entryRuleXVariantSLComment : ruleXVariantSLComment EOF ;
    public final void entryRuleXVariantSLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:354:1: ( ruleXVariantSLComment EOF )
            // InternalXMachine.g:355:1: ruleXVariantSLComment EOF
            {
             before(grammarAccess.getXVariantSLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariantSLComment();

            state._fsp--;

             after(grammarAccess.getXVariantSLCommentRule()); 
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
    // $ANTLR end "entryRuleXVariantSLComment"


    // $ANTLR start "ruleXVariantSLComment"
    // InternalXMachine.g:362:1: ruleXVariantSLComment : ( ( rule__XVariantSLComment__Group__0 ) ) ;
    public final void ruleXVariantSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:366:2: ( ( ( rule__XVariantSLComment__Group__0 ) ) )
            // InternalXMachine.g:367:2: ( ( rule__XVariantSLComment__Group__0 ) )
            {
            // InternalXMachine.g:367:2: ( ( rule__XVariantSLComment__Group__0 ) )
            // InternalXMachine.g:368:3: ( rule__XVariantSLComment__Group__0 )
            {
             before(grammarAccess.getXVariantSLCommentAccess().getGroup()); 
            // InternalXMachine.g:369:3: ( rule__XVariantSLComment__Group__0 )
            // InternalXMachine.g:369:4: rule__XVariantSLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariantSLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariantSLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariantSLComment"


    // $ANTLR start "entryRuleXParameterNoComment"
    // InternalXMachine.g:378:1: entryRuleXParameterNoComment : ruleXParameterNoComment EOF ;
    public final void entryRuleXParameterNoComment() throws RecognitionException {
        try {
            // InternalXMachine.g:379:1: ( ruleXParameterNoComment EOF )
            // InternalXMachine.g:380:1: ruleXParameterNoComment EOF
            {
             before(grammarAccess.getXParameterNoCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXParameterNoComment();

            state._fsp--;

             after(grammarAccess.getXParameterNoCommentRule()); 
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
    // $ANTLR end "entryRuleXParameterNoComment"


    // $ANTLR start "ruleXParameterNoComment"
    // InternalXMachine.g:387:1: ruleXParameterNoComment : ( ( rule__XParameterNoComment__Group__0 ) ) ;
    public final void ruleXParameterNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:391:2: ( ( ( rule__XParameterNoComment__Group__0 ) ) )
            // InternalXMachine.g:392:2: ( ( rule__XParameterNoComment__Group__0 ) )
            {
            // InternalXMachine.g:392:2: ( ( rule__XParameterNoComment__Group__0 ) )
            // InternalXMachine.g:393:3: ( rule__XParameterNoComment__Group__0 )
            {
             before(grammarAccess.getXParameterNoCommentAccess().getGroup()); 
            // InternalXMachine.g:394:3: ( rule__XParameterNoComment__Group__0 )
            // InternalXMachine.g:394:4: rule__XParameterNoComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XParameterNoComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXParameterNoCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXParameterNoComment"


    // $ANTLR start "entryRuleXParameterMLComment"
    // InternalXMachine.g:403:1: entryRuleXParameterMLComment : ruleXParameterMLComment EOF ;
    public final void entryRuleXParameterMLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:404:1: ( ruleXParameterMLComment EOF )
            // InternalXMachine.g:405:1: ruleXParameterMLComment EOF
            {
             before(grammarAccess.getXParameterMLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXParameterMLComment();

            state._fsp--;

             after(grammarAccess.getXParameterMLCommentRule()); 
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
    // $ANTLR end "entryRuleXParameterMLComment"


    // $ANTLR start "ruleXParameterMLComment"
    // InternalXMachine.g:412:1: ruleXParameterMLComment : ( ( rule__XParameterMLComment__Group__0 ) ) ;
    public final void ruleXParameterMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:416:2: ( ( ( rule__XParameterMLComment__Group__0 ) ) )
            // InternalXMachine.g:417:2: ( ( rule__XParameterMLComment__Group__0 ) )
            {
            // InternalXMachine.g:417:2: ( ( rule__XParameterMLComment__Group__0 ) )
            // InternalXMachine.g:418:3: ( rule__XParameterMLComment__Group__0 )
            {
             before(grammarAccess.getXParameterMLCommentAccess().getGroup()); 
            // InternalXMachine.g:419:3: ( rule__XParameterMLComment__Group__0 )
            // InternalXMachine.g:419:4: rule__XParameterMLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XParameterMLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXParameterMLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXParameterMLComment"


    // $ANTLR start "entryRuleXParameterSLComment"
    // InternalXMachine.g:428:1: entryRuleXParameterSLComment : ruleXParameterSLComment EOF ;
    public final void entryRuleXParameterSLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:429:1: ( ruleXParameterSLComment EOF )
            // InternalXMachine.g:430:1: ruleXParameterSLComment EOF
            {
             before(grammarAccess.getXParameterSLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXParameterSLComment();

            state._fsp--;

             after(grammarAccess.getXParameterSLCommentRule()); 
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
    // $ANTLR end "entryRuleXParameterSLComment"


    // $ANTLR start "ruleXParameterSLComment"
    // InternalXMachine.g:437:1: ruleXParameterSLComment : ( ( rule__XParameterSLComment__Group__0 ) ) ;
    public final void ruleXParameterSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:441:2: ( ( ( rule__XParameterSLComment__Group__0 ) ) )
            // InternalXMachine.g:442:2: ( ( rule__XParameterSLComment__Group__0 ) )
            {
            // InternalXMachine.g:442:2: ( ( rule__XParameterSLComment__Group__0 ) )
            // InternalXMachine.g:443:3: ( rule__XParameterSLComment__Group__0 )
            {
             before(grammarAccess.getXParameterSLCommentAccess().getGroup()); 
            // InternalXMachine.g:444:3: ( rule__XParameterSLComment__Group__0 )
            // InternalXMachine.g:444:4: rule__XParameterSLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XParameterSLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXParameterSLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXParameterSLComment"


    // $ANTLR start "entryRuleXGuardNoComment"
    // InternalXMachine.g:453:1: entryRuleXGuardNoComment : ruleXGuardNoComment EOF ;
    public final void entryRuleXGuardNoComment() throws RecognitionException {
        try {
            // InternalXMachine.g:454:1: ( ruleXGuardNoComment EOF )
            // InternalXMachine.g:455:1: ruleXGuardNoComment EOF
            {
             before(grammarAccess.getXGuardNoCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXGuardNoComment();

            state._fsp--;

             after(grammarAccess.getXGuardNoCommentRule()); 
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
    // $ANTLR end "entryRuleXGuardNoComment"


    // $ANTLR start "ruleXGuardNoComment"
    // InternalXMachine.g:462:1: ruleXGuardNoComment : ( ( rule__XGuardNoComment__Group__0 ) ) ;
    public final void ruleXGuardNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:466:2: ( ( ( rule__XGuardNoComment__Group__0 ) ) )
            // InternalXMachine.g:467:2: ( ( rule__XGuardNoComment__Group__0 ) )
            {
            // InternalXMachine.g:467:2: ( ( rule__XGuardNoComment__Group__0 ) )
            // InternalXMachine.g:468:3: ( rule__XGuardNoComment__Group__0 )
            {
             before(grammarAccess.getXGuardNoCommentAccess().getGroup()); 
            // InternalXMachine.g:469:3: ( rule__XGuardNoComment__Group__0 )
            // InternalXMachine.g:469:4: rule__XGuardNoComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGuardNoComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXGuardNoCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGuardNoComment"


    // $ANTLR start "entryRuleXGuardMLComment"
    // InternalXMachine.g:478:1: entryRuleXGuardMLComment : ruleXGuardMLComment EOF ;
    public final void entryRuleXGuardMLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:479:1: ( ruleXGuardMLComment EOF )
            // InternalXMachine.g:480:1: ruleXGuardMLComment EOF
            {
             before(grammarAccess.getXGuardMLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXGuardMLComment();

            state._fsp--;

             after(grammarAccess.getXGuardMLCommentRule()); 
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
    // $ANTLR end "entryRuleXGuardMLComment"


    // $ANTLR start "ruleXGuardMLComment"
    // InternalXMachine.g:487:1: ruleXGuardMLComment : ( ( rule__XGuardMLComment__Group__0 ) ) ;
    public final void ruleXGuardMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:491:2: ( ( ( rule__XGuardMLComment__Group__0 ) ) )
            // InternalXMachine.g:492:2: ( ( rule__XGuardMLComment__Group__0 ) )
            {
            // InternalXMachine.g:492:2: ( ( rule__XGuardMLComment__Group__0 ) )
            // InternalXMachine.g:493:3: ( rule__XGuardMLComment__Group__0 )
            {
             before(grammarAccess.getXGuardMLCommentAccess().getGroup()); 
            // InternalXMachine.g:494:3: ( rule__XGuardMLComment__Group__0 )
            // InternalXMachine.g:494:4: rule__XGuardMLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGuardMLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXGuardMLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGuardMLComment"


    // $ANTLR start "entryRuleXGuardSLComment"
    // InternalXMachine.g:503:1: entryRuleXGuardSLComment : ruleXGuardSLComment EOF ;
    public final void entryRuleXGuardSLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:504:1: ( ruleXGuardSLComment EOF )
            // InternalXMachine.g:505:1: ruleXGuardSLComment EOF
            {
             before(grammarAccess.getXGuardSLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXGuardSLComment();

            state._fsp--;

             after(grammarAccess.getXGuardSLCommentRule()); 
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
    // $ANTLR end "entryRuleXGuardSLComment"


    // $ANTLR start "ruleXGuardSLComment"
    // InternalXMachine.g:512:1: ruleXGuardSLComment : ( ( rule__XGuardSLComment__Group__0 ) ) ;
    public final void ruleXGuardSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:516:2: ( ( ( rule__XGuardSLComment__Group__0 ) ) )
            // InternalXMachine.g:517:2: ( ( rule__XGuardSLComment__Group__0 ) )
            {
            // InternalXMachine.g:517:2: ( ( rule__XGuardSLComment__Group__0 ) )
            // InternalXMachine.g:518:3: ( rule__XGuardSLComment__Group__0 )
            {
             before(grammarAccess.getXGuardSLCommentAccess().getGroup()); 
            // InternalXMachine.g:519:3: ( rule__XGuardSLComment__Group__0 )
            // InternalXMachine.g:519:4: rule__XGuardSLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGuardSLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXGuardSLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGuardSLComment"


    // $ANTLR start "entryRuleXWitnessNoComment"
    // InternalXMachine.g:528:1: entryRuleXWitnessNoComment : ruleXWitnessNoComment EOF ;
    public final void entryRuleXWitnessNoComment() throws RecognitionException {
        try {
            // InternalXMachine.g:529:1: ( ruleXWitnessNoComment EOF )
            // InternalXMachine.g:530:1: ruleXWitnessNoComment EOF
            {
             before(grammarAccess.getXWitnessNoCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXWitnessNoComment();

            state._fsp--;

             after(grammarAccess.getXWitnessNoCommentRule()); 
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
    // $ANTLR end "entryRuleXWitnessNoComment"


    // $ANTLR start "ruleXWitnessNoComment"
    // InternalXMachine.g:537:1: ruleXWitnessNoComment : ( ( rule__XWitnessNoComment__Group__0 ) ) ;
    public final void ruleXWitnessNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:541:2: ( ( ( rule__XWitnessNoComment__Group__0 ) ) )
            // InternalXMachine.g:542:2: ( ( rule__XWitnessNoComment__Group__0 ) )
            {
            // InternalXMachine.g:542:2: ( ( rule__XWitnessNoComment__Group__0 ) )
            // InternalXMachine.g:543:3: ( rule__XWitnessNoComment__Group__0 )
            {
             before(grammarAccess.getXWitnessNoCommentAccess().getGroup()); 
            // InternalXMachine.g:544:3: ( rule__XWitnessNoComment__Group__0 )
            // InternalXMachine.g:544:4: rule__XWitnessNoComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessNoComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessNoCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXWitnessNoComment"


    // $ANTLR start "entryRuleXWitnessMLComment"
    // InternalXMachine.g:553:1: entryRuleXWitnessMLComment : ruleXWitnessMLComment EOF ;
    public final void entryRuleXWitnessMLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:554:1: ( ruleXWitnessMLComment EOF )
            // InternalXMachine.g:555:1: ruleXWitnessMLComment EOF
            {
             before(grammarAccess.getXWitnessMLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXWitnessMLComment();

            state._fsp--;

             after(grammarAccess.getXWitnessMLCommentRule()); 
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
    // $ANTLR end "entryRuleXWitnessMLComment"


    // $ANTLR start "ruleXWitnessMLComment"
    // InternalXMachine.g:562:1: ruleXWitnessMLComment : ( ( rule__XWitnessMLComment__Group__0 ) ) ;
    public final void ruleXWitnessMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:566:2: ( ( ( rule__XWitnessMLComment__Group__0 ) ) )
            // InternalXMachine.g:567:2: ( ( rule__XWitnessMLComment__Group__0 ) )
            {
            // InternalXMachine.g:567:2: ( ( rule__XWitnessMLComment__Group__0 ) )
            // InternalXMachine.g:568:3: ( rule__XWitnessMLComment__Group__0 )
            {
             before(grammarAccess.getXWitnessMLCommentAccess().getGroup()); 
            // InternalXMachine.g:569:3: ( rule__XWitnessMLComment__Group__0 )
            // InternalXMachine.g:569:4: rule__XWitnessMLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessMLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessMLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXWitnessMLComment"


    // $ANTLR start "entryRuleXWitnessSLComment"
    // InternalXMachine.g:578:1: entryRuleXWitnessSLComment : ruleXWitnessSLComment EOF ;
    public final void entryRuleXWitnessSLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:579:1: ( ruleXWitnessSLComment EOF )
            // InternalXMachine.g:580:1: ruleXWitnessSLComment EOF
            {
             before(grammarAccess.getXWitnessSLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXWitnessSLComment();

            state._fsp--;

             after(grammarAccess.getXWitnessSLCommentRule()); 
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
    // $ANTLR end "entryRuleXWitnessSLComment"


    // $ANTLR start "ruleXWitnessSLComment"
    // InternalXMachine.g:587:1: ruleXWitnessSLComment : ( ( rule__XWitnessSLComment__Group__0 ) ) ;
    public final void ruleXWitnessSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:591:2: ( ( ( rule__XWitnessSLComment__Group__0 ) ) )
            // InternalXMachine.g:592:2: ( ( rule__XWitnessSLComment__Group__0 ) )
            {
            // InternalXMachine.g:592:2: ( ( rule__XWitnessSLComment__Group__0 ) )
            // InternalXMachine.g:593:3: ( rule__XWitnessSLComment__Group__0 )
            {
             before(grammarAccess.getXWitnessSLCommentAccess().getGroup()); 
            // InternalXMachine.g:594:3: ( rule__XWitnessSLComment__Group__0 )
            // InternalXMachine.g:594:4: rule__XWitnessSLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessSLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessSLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXWitnessSLComment"


    // $ANTLR start "entryRuleXActionNoComment"
    // InternalXMachine.g:603:1: entryRuleXActionNoComment : ruleXActionNoComment EOF ;
    public final void entryRuleXActionNoComment() throws RecognitionException {
        try {
            // InternalXMachine.g:604:1: ( ruleXActionNoComment EOF )
            // InternalXMachine.g:605:1: ruleXActionNoComment EOF
            {
             before(grammarAccess.getXActionNoCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXActionNoComment();

            state._fsp--;

             after(grammarAccess.getXActionNoCommentRule()); 
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
    // $ANTLR end "entryRuleXActionNoComment"


    // $ANTLR start "ruleXActionNoComment"
    // InternalXMachine.g:612:1: ruleXActionNoComment : ( ( rule__XActionNoComment__Group__0 ) ) ;
    public final void ruleXActionNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:616:2: ( ( ( rule__XActionNoComment__Group__0 ) ) )
            // InternalXMachine.g:617:2: ( ( rule__XActionNoComment__Group__0 ) )
            {
            // InternalXMachine.g:617:2: ( ( rule__XActionNoComment__Group__0 ) )
            // InternalXMachine.g:618:3: ( rule__XActionNoComment__Group__0 )
            {
             before(grammarAccess.getXActionNoCommentAccess().getGroup()); 
            // InternalXMachine.g:619:3: ( rule__XActionNoComment__Group__0 )
            // InternalXMachine.g:619:4: rule__XActionNoComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XActionNoComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXActionNoCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXActionNoComment"


    // $ANTLR start "entryRuleXActionMLComment"
    // InternalXMachine.g:628:1: entryRuleXActionMLComment : ruleXActionMLComment EOF ;
    public final void entryRuleXActionMLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:629:1: ( ruleXActionMLComment EOF )
            // InternalXMachine.g:630:1: ruleXActionMLComment EOF
            {
             before(grammarAccess.getXActionMLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXActionMLComment();

            state._fsp--;

             after(grammarAccess.getXActionMLCommentRule()); 
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
    // $ANTLR end "entryRuleXActionMLComment"


    // $ANTLR start "ruleXActionMLComment"
    // InternalXMachine.g:637:1: ruleXActionMLComment : ( ( rule__XActionMLComment__Group__0 ) ) ;
    public final void ruleXActionMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:641:2: ( ( ( rule__XActionMLComment__Group__0 ) ) )
            // InternalXMachine.g:642:2: ( ( rule__XActionMLComment__Group__0 ) )
            {
            // InternalXMachine.g:642:2: ( ( rule__XActionMLComment__Group__0 ) )
            // InternalXMachine.g:643:3: ( rule__XActionMLComment__Group__0 )
            {
             before(grammarAccess.getXActionMLCommentAccess().getGroup()); 
            // InternalXMachine.g:644:3: ( rule__XActionMLComment__Group__0 )
            // InternalXMachine.g:644:4: rule__XActionMLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XActionMLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXActionMLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXActionMLComment"


    // $ANTLR start "entryRuleXActionSLComment"
    // InternalXMachine.g:653:1: entryRuleXActionSLComment : ruleXActionSLComment EOF ;
    public final void entryRuleXActionSLComment() throws RecognitionException {
        try {
            // InternalXMachine.g:654:1: ( ruleXActionSLComment EOF )
            // InternalXMachine.g:655:1: ruleXActionSLComment EOF
            {
             before(grammarAccess.getXActionSLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXActionSLComment();

            state._fsp--;

             after(grammarAccess.getXActionSLCommentRule()); 
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
    // $ANTLR end "entryRuleXActionSLComment"


    // $ANTLR start "ruleXActionSLComment"
    // InternalXMachine.g:662:1: ruleXActionSLComment : ( ( rule__XActionSLComment__Group__0 ) ) ;
    public final void ruleXActionSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:666:2: ( ( ( rule__XActionSLComment__Group__0 ) ) )
            // InternalXMachine.g:667:2: ( ( rule__XActionSLComment__Group__0 ) )
            {
            // InternalXMachine.g:667:2: ( ( rule__XActionSLComment__Group__0 ) )
            // InternalXMachine.g:668:3: ( rule__XActionSLComment__Group__0 )
            {
             before(grammarAccess.getXActionSLCommentAccess().getGroup()); 
            // InternalXMachine.g:669:3: ( rule__XActionSLComment__Group__0 )
            // InternalXMachine.g:669:4: rule__XActionSLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XActionSLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXActionSLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXActionSLComment"


    // $ANTLR start "rule__XMachine__CommentAlternatives_1_0"
    // InternalXMachine.g:677:1: rule__XMachine__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XMachine__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:681:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXMachine.g:682:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:682:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:683:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:688:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:688:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:689:3: RULE_SL_COMMENT
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


    // $ANTLR start "rule__XVariable__Alternatives"
    // InternalXMachine.g:698:1: rule__XVariable__Alternatives : ( ( ruleXVariableNoComment ) | ( ruleXVariableMLComment ) | ( ruleXVariableSLComment ) );
    public final void rule__XVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:702:1: ( ( ruleXVariableNoComment ) | ( ruleXVariableMLComment ) | ( ruleXVariableSLComment ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_SL_COMMENT) ) {
                    alt2=3;
                }
                else if ( (LA2_1==EOF) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ML_COMMENT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:703:2: ( ruleXVariableNoComment )
                    {
                    // InternalXMachine.g:703:2: ( ruleXVariableNoComment )
                    // InternalXMachine.g:704:3: ruleXVariableNoComment
                    {
                     before(grammarAccess.getXVariableAccess().getXVariableNoCommentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleXVariableNoComment();

                    state._fsp--;

                     after(grammarAccess.getXVariableAccess().getXVariableNoCommentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:709:2: ( ruleXVariableMLComment )
                    {
                    // InternalXMachine.g:709:2: ( ruleXVariableMLComment )
                    // InternalXMachine.g:710:3: ruleXVariableMLComment
                    {
                     before(grammarAccess.getXVariableAccess().getXVariableMLCommentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXVariableMLComment();

                    state._fsp--;

                     after(grammarAccess.getXVariableAccess().getXVariableMLCommentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:715:2: ( ruleXVariableSLComment )
                    {
                    // InternalXMachine.g:715:2: ( ruleXVariableSLComment )
                    // InternalXMachine.g:716:3: ruleXVariableSLComment
                    {
                     before(grammarAccess.getXVariableAccess().getXVariableSLCommentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleXVariableSLComment();

                    state._fsp--;

                     after(grammarAccess.getXVariableAccess().getXVariableSLCommentParserRuleCall_2()); 

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
    // $ANTLR end "rule__XVariable__Alternatives"


    // $ANTLR start "rule__XInvariant__Alternatives"
    // InternalXMachine.g:725:1: rule__XInvariant__Alternatives : ( ( ruleXInvariantNoComment ) | ( ruleXInvariantMLComment ) | ( ruleXInvariantSLComment ) );
    public final void rule__XInvariant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:729:1: ( ( ruleXInvariantNoComment ) | ( ruleXInvariantMLComment ) | ( ruleXInvariantSLComment ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_XLABEL) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 19:
                        {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==EOF) ) {
                            alt3=1;
                        }
                        else if ( (LA3_4==RULE_SL_COMMENT) ) {
                            alt3=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                        {
                        alt3=1;
                        }
                        break;
                    case RULE_SL_COMMENT:
                        {
                        alt3=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ML_COMMENT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:730:2: ( ruleXInvariantNoComment )
                    {
                    // InternalXMachine.g:730:2: ( ruleXInvariantNoComment )
                    // InternalXMachine.g:731:3: ruleXInvariantNoComment
                    {
                     before(grammarAccess.getXInvariantAccess().getXInvariantNoCommentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleXInvariantNoComment();

                    state._fsp--;

                     after(grammarAccess.getXInvariantAccess().getXInvariantNoCommentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:736:2: ( ruleXInvariantMLComment )
                    {
                    // InternalXMachine.g:736:2: ( ruleXInvariantMLComment )
                    // InternalXMachine.g:737:3: ruleXInvariantMLComment
                    {
                     before(grammarAccess.getXInvariantAccess().getXInvariantMLCommentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXInvariantMLComment();

                    state._fsp--;

                     after(grammarAccess.getXInvariantAccess().getXInvariantMLCommentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:742:2: ( ruleXInvariantSLComment )
                    {
                    // InternalXMachine.g:742:2: ( ruleXInvariantSLComment )
                    // InternalXMachine.g:743:3: ruleXInvariantSLComment
                    {
                     before(grammarAccess.getXInvariantAccess().getXInvariantSLCommentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleXInvariantSLComment();

                    state._fsp--;

                     after(grammarAccess.getXInvariantAccess().getXInvariantSLCommentParserRuleCall_2()); 

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
    // $ANTLR end "rule__XInvariant__Alternatives"


    // $ANTLR start "rule__XVariant__Alternatives"
    // InternalXMachine.g:752:1: rule__XVariant__Alternatives : ( ( ruleXVariantNoComment ) | ( ruleXVariantMLComment ) | ( ruleXVariantSLComment ) );
    public final void rule__XVariant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:756:1: ( ( ruleXVariantNoComment ) | ( ruleXVariantMLComment ) | ( ruleXVariantSLComment ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_SL_COMMENT) ) {
                    alt4=3;
                }
                else if ( (LA4_1==EOF) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_ML_COMMENT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:757:2: ( ruleXVariantNoComment )
                    {
                    // InternalXMachine.g:757:2: ( ruleXVariantNoComment )
                    // InternalXMachine.g:758:3: ruleXVariantNoComment
                    {
                     before(grammarAccess.getXVariantAccess().getXVariantNoCommentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleXVariantNoComment();

                    state._fsp--;

                     after(grammarAccess.getXVariantAccess().getXVariantNoCommentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:763:2: ( ruleXVariantMLComment )
                    {
                    // InternalXMachine.g:763:2: ( ruleXVariantMLComment )
                    // InternalXMachine.g:764:3: ruleXVariantMLComment
                    {
                     before(grammarAccess.getXVariantAccess().getXVariantMLCommentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXVariantMLComment();

                    state._fsp--;

                     after(grammarAccess.getXVariantAccess().getXVariantMLCommentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:769:2: ( ruleXVariantSLComment )
                    {
                    // InternalXMachine.g:769:2: ( ruleXVariantSLComment )
                    // InternalXMachine.g:770:3: ruleXVariantSLComment
                    {
                     before(grammarAccess.getXVariantAccess().getXVariantSLCommentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleXVariantSLComment();

                    state._fsp--;

                     after(grammarAccess.getXVariantAccess().getXVariantSLCommentParserRuleCall_2()); 

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
    // $ANTLR end "rule__XVariant__Alternatives"


    // $ANTLR start "rule__XMachine__Group__0"
    // InternalXMachine.g:779:1: rule__XMachine__Group__0 : rule__XMachine__Group__0__Impl rule__XMachine__Group__1 ;
    public final void rule__XMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:783:1: ( rule__XMachine__Group__0__Impl rule__XMachine__Group__1 )
            // InternalXMachine.g:784:2: rule__XMachine__Group__0__Impl rule__XMachine__Group__1
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
    // InternalXMachine.g:791:1: rule__XMachine__Group__0__Impl : ( () ) ;
    public final void rule__XMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:795:1: ( ( () ) )
            // InternalXMachine.g:796:1: ( () )
            {
            // InternalXMachine.g:796:1: ( () )
            // InternalXMachine.g:797:2: ()
            {
             before(grammarAccess.getXMachineAccess().getMachineInclusionAction_0()); 
            // InternalXMachine.g:798:2: ()
            // InternalXMachine.g:798:3: 
            {
            }

             after(grammarAccess.getXMachineAccess().getMachineInclusionAction_0()); 

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
    // InternalXMachine.g:806:1: rule__XMachine__Group__1 : rule__XMachine__Group__1__Impl rule__XMachine__Group__2 ;
    public final void rule__XMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:810:1: ( rule__XMachine__Group__1__Impl rule__XMachine__Group__2 )
            // InternalXMachine.g:811:2: rule__XMachine__Group__1__Impl rule__XMachine__Group__2
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
    // InternalXMachine.g:818:1: rule__XMachine__Group__1__Impl : ( ( rule__XMachine__CommentAssignment_1 )? ) ;
    public final void rule__XMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:822:1: ( ( ( rule__XMachine__CommentAssignment_1 )? ) )
            // InternalXMachine.g:823:1: ( ( rule__XMachine__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:823:1: ( ( rule__XMachine__CommentAssignment_1 )? )
            // InternalXMachine.g:824:2: ( rule__XMachine__CommentAssignment_1 )?
            {
             before(grammarAccess.getXMachineAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:825:2: ( rule__XMachine__CommentAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ML_COMMENT && LA5_0<=RULE_SL_COMMENT)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:825:3: rule__XMachine__CommentAssignment_1
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
    // InternalXMachine.g:833:1: rule__XMachine__Group__2 : rule__XMachine__Group__2__Impl rule__XMachine__Group__3 ;
    public final void rule__XMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:837:1: ( rule__XMachine__Group__2__Impl rule__XMachine__Group__3 )
            // InternalXMachine.g:838:2: rule__XMachine__Group__2__Impl rule__XMachine__Group__3
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
    // InternalXMachine.g:845:1: rule__XMachine__Group__2__Impl : ( ( rule__XMachine__Group_2__0 ) ) ;
    public final void rule__XMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:849:1: ( ( ( rule__XMachine__Group_2__0 ) ) )
            // InternalXMachine.g:850:1: ( ( rule__XMachine__Group_2__0 ) )
            {
            // InternalXMachine.g:850:1: ( ( rule__XMachine__Group_2__0 ) )
            // InternalXMachine.g:851:2: ( rule__XMachine__Group_2__0 )
            {
             before(grammarAccess.getXMachineAccess().getGroup_2()); 
            // InternalXMachine.g:852:2: ( rule__XMachine__Group_2__0 )
            // InternalXMachine.g:852:3: rule__XMachine__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalXMachine.g:860:1: rule__XMachine__Group__3 : rule__XMachine__Group__3__Impl rule__XMachine__Group__4 ;
    public final void rule__XMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:864:1: ( rule__XMachine__Group__3__Impl rule__XMachine__Group__4 )
            // InternalXMachine.g:865:2: rule__XMachine__Group__3__Impl rule__XMachine__Group__4
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
    // InternalXMachine.g:872:1: rule__XMachine__Group__3__Impl : ( 'machine' ) ;
    public final void rule__XMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:876:1: ( ( 'machine' ) )
            // InternalXMachine.g:877:1: ( 'machine' )
            {
            // InternalXMachine.g:877:1: ( 'machine' )
            // InternalXMachine.g:878:2: 'machine'
            {
             before(grammarAccess.getXMachineAccess().getMachineKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getMachineKeyword_3()); 

            }


            }

        }
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
    // InternalXMachine.g:887:1: rule__XMachine__Group__4 : rule__XMachine__Group__4__Impl rule__XMachine__Group__5 ;
    public final void rule__XMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:891:1: ( rule__XMachine__Group__4__Impl rule__XMachine__Group__5 )
            // InternalXMachine.g:892:2: rule__XMachine__Group__4__Impl rule__XMachine__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalXMachine.g:899:1: rule__XMachine__Group__4__Impl : ( ( rule__XMachine__NameAssignment_4 ) ) ;
    public final void rule__XMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:903:1: ( ( ( rule__XMachine__NameAssignment_4 ) ) )
            // InternalXMachine.g:904:1: ( ( rule__XMachine__NameAssignment_4 ) )
            {
            // InternalXMachine.g:904:1: ( ( rule__XMachine__NameAssignment_4 ) )
            // InternalXMachine.g:905:2: ( rule__XMachine__NameAssignment_4 )
            {
             before(grammarAccess.getXMachineAccess().getNameAssignment_4()); 
            // InternalXMachine.g:906:2: ( rule__XMachine__NameAssignment_4 )
            // InternalXMachine.g:906:3: rule__XMachine__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getNameAssignment_4()); 

            }


            }

        }
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
    // InternalXMachine.g:914:1: rule__XMachine__Group__5 : rule__XMachine__Group__5__Impl rule__XMachine__Group__6 ;
    public final void rule__XMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:918:1: ( rule__XMachine__Group__5__Impl rule__XMachine__Group__6 )
            // InternalXMachine.g:919:2: rule__XMachine__Group__5__Impl rule__XMachine__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalXMachine.g:926:1: rule__XMachine__Group__5__Impl : ( ( rule__XMachine__Group_5__0 )? ) ;
    public final void rule__XMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:930:1: ( ( ( rule__XMachine__Group_5__0 )? ) )
            // InternalXMachine.g:931:1: ( ( rule__XMachine__Group_5__0 )? )
            {
            // InternalXMachine.g:931:1: ( ( rule__XMachine__Group_5__0 )? )
            // InternalXMachine.g:932:2: ( rule__XMachine__Group_5__0 )?
            {
             before(grammarAccess.getXMachineAccess().getGroup_5()); 
            // InternalXMachine.g:933:2: ( rule__XMachine__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:933:3: rule__XMachine__Group_5__0
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
    // InternalXMachine.g:941:1: rule__XMachine__Group__6 : rule__XMachine__Group__6__Impl rule__XMachine__Group__7 ;
    public final void rule__XMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:945:1: ( rule__XMachine__Group__6__Impl rule__XMachine__Group__7 )
            // InternalXMachine.g:946:2: rule__XMachine__Group__6__Impl rule__XMachine__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalXMachine.g:953:1: rule__XMachine__Group__6__Impl : ( ( rule__XMachine__Group_6__0 )? ) ;
    public final void rule__XMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:957:1: ( ( ( rule__XMachine__Group_6__0 )? ) )
            // InternalXMachine.g:958:1: ( ( rule__XMachine__Group_6__0 )? )
            {
            // InternalXMachine.g:958:1: ( ( rule__XMachine__Group_6__0 )? )
            // InternalXMachine.g:959:2: ( rule__XMachine__Group_6__0 )?
            {
             before(grammarAccess.getXMachineAccess().getGroup_6()); 
            // InternalXMachine.g:960:2: ( rule__XMachine__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:960:3: rule__XMachine__Group_6__0
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
    // InternalXMachine.g:968:1: rule__XMachine__Group__7 : rule__XMachine__Group__7__Impl rule__XMachine__Group__8 ;
    public final void rule__XMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:972:1: ( rule__XMachine__Group__7__Impl rule__XMachine__Group__8 )
            // InternalXMachine.g:973:2: rule__XMachine__Group__7__Impl rule__XMachine__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalXMachine.g:980:1: rule__XMachine__Group__7__Impl : ( ( rule__XMachine__Group_7__0 )? ) ;
    public final void rule__XMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:984:1: ( ( ( rule__XMachine__Group_7__0 )? ) )
            // InternalXMachine.g:985:1: ( ( rule__XMachine__Group_7__0 )? )
            {
            // InternalXMachine.g:985:1: ( ( rule__XMachine__Group_7__0 )? )
            // InternalXMachine.g:986:2: ( rule__XMachine__Group_7__0 )?
            {
             before(grammarAccess.getXMachineAccess().getGroup_7()); 
            // InternalXMachine.g:987:2: ( rule__XMachine__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:987:3: rule__XMachine__Group_7__0
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
    // InternalXMachine.g:995:1: rule__XMachine__Group__8 : rule__XMachine__Group__8__Impl rule__XMachine__Group__9 ;
    public final void rule__XMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:999:1: ( rule__XMachine__Group__8__Impl rule__XMachine__Group__9 )
            // InternalXMachine.g:1000:2: rule__XMachine__Group__8__Impl rule__XMachine__Group__9
            {
            pushFollow(FOLLOW_6);
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
    // InternalXMachine.g:1007:1: rule__XMachine__Group__8__Impl : ( ( rule__XMachine__Group_8__0 )? ) ;
    public final void rule__XMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1011:1: ( ( ( rule__XMachine__Group_8__0 )? ) )
            // InternalXMachine.g:1012:1: ( ( rule__XMachine__Group_8__0 )? )
            {
            // InternalXMachine.g:1012:1: ( ( rule__XMachine__Group_8__0 )? )
            // InternalXMachine.g:1013:2: ( rule__XMachine__Group_8__0 )?
            {
             before(grammarAccess.getXMachineAccess().getGroup_8()); 
            // InternalXMachine.g:1014:2: ( rule__XMachine__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:1014:3: rule__XMachine__Group_8__0
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
    // InternalXMachine.g:1022:1: rule__XMachine__Group__9 : rule__XMachine__Group__9__Impl ;
    public final void rule__XMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1026:1: ( rule__XMachine__Group__9__Impl )
            // InternalXMachine.g:1027:2: rule__XMachine__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1033:1: rule__XMachine__Group__9__Impl : ( 'end' ) ;
    public final void rule__XMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1037:1: ( ( 'end' ) )
            // InternalXMachine.g:1038:1: ( 'end' )
            {
            // InternalXMachine.g:1038:1: ( 'end' )
            // InternalXMachine.g:1039:2: 'end'
            {
             before(grammarAccess.getXMachineAccess().getEndKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getEndKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__XMachine__Group_2__0"
    // InternalXMachine.g:1049:1: rule__XMachine__Group_2__0 : rule__XMachine__Group_2__0__Impl rule__XMachine__Group_2__1 ;
    public final void rule__XMachine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1053:1: ( rule__XMachine__Group_2__0__Impl rule__XMachine__Group_2__1 )
            // InternalXMachine.g:1054:2: rule__XMachine__Group_2__0__Impl rule__XMachine__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__XMachine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_2__0"


    // $ANTLR start "rule__XMachine__Group_2__0__Impl"
    // InternalXMachine.g:1061:1: rule__XMachine__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__XMachine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1065:1: ( ( 'id' ) )
            // InternalXMachine.g:1066:1: ( 'id' )
            {
            // InternalXMachine.g:1066:1: ( 'id' )
            // InternalXMachine.g:1067:2: 'id'
            {
             before(grammarAccess.getXMachineAccess().getIdKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_2__0__Impl"


    // $ANTLR start "rule__XMachine__Group_2__1"
    // InternalXMachine.g:1076:1: rule__XMachine__Group_2__1 : rule__XMachine__Group_2__1__Impl ;
    public final void rule__XMachine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1080:1: ( rule__XMachine__Group_2__1__Impl )
            // InternalXMachine.g:1081:2: rule__XMachine__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_2__1"


    // $ANTLR start "rule__XMachine__Group_2__1__Impl"
    // InternalXMachine.g:1087:1: rule__XMachine__Group_2__1__Impl : ( ( rule__XMachine__ExtensionIdAssignment_2_1 ) ) ;
    public final void rule__XMachine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1091:1: ( ( ( rule__XMachine__ExtensionIdAssignment_2_1 ) ) )
            // InternalXMachine.g:1092:1: ( ( rule__XMachine__ExtensionIdAssignment_2_1 ) )
            {
            // InternalXMachine.g:1092:1: ( ( rule__XMachine__ExtensionIdAssignment_2_1 ) )
            // InternalXMachine.g:1093:2: ( rule__XMachine__ExtensionIdAssignment_2_1 )
            {
             before(grammarAccess.getXMachineAccess().getExtensionIdAssignment_2_1()); 
            // InternalXMachine.g:1094:2: ( rule__XMachine__ExtensionIdAssignment_2_1 )
            // InternalXMachine.g:1094:3: rule__XMachine__ExtensionIdAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__ExtensionIdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getExtensionIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_2__1__Impl"


    // $ANTLR start "rule__XMachine__Group_5__0"
    // InternalXMachine.g:1103:1: rule__XMachine__Group_5__0 : rule__XMachine__Group_5__0__Impl rule__XMachine__Group_5__1 ;
    public final void rule__XMachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1107:1: ( rule__XMachine__Group_5__0__Impl rule__XMachine__Group_5__1 )
            // InternalXMachine.g:1108:2: rule__XMachine__Group_5__0__Impl rule__XMachine__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:1115:1: rule__XMachine__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__XMachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1119:1: ( ( 'refines' ) )
            // InternalXMachine.g:1120:1: ( 'refines' )
            {
            // InternalXMachine.g:1120:1: ( 'refines' )
            // InternalXMachine.g:1121:2: 'refines'
            {
             before(grammarAccess.getXMachineAccess().getRefinesKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getRefinesKeyword_5_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1130:1: rule__XMachine__Group_5__1 : rule__XMachine__Group_5__1__Impl ;
    public final void rule__XMachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1134:1: ( rule__XMachine__Group_5__1__Impl )
            // InternalXMachine.g:1135:2: rule__XMachine__Group_5__1__Impl
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
    // InternalXMachine.g:1141:1: rule__XMachine__Group_5__1__Impl : ( ( rule__XMachine__RefinesAssignment_5_1 ) ) ;
    public final void rule__XMachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1145:1: ( ( ( rule__XMachine__RefinesAssignment_5_1 ) ) )
            // InternalXMachine.g:1146:1: ( ( rule__XMachine__RefinesAssignment_5_1 ) )
            {
            // InternalXMachine.g:1146:1: ( ( rule__XMachine__RefinesAssignment_5_1 ) )
            // InternalXMachine.g:1147:2: ( rule__XMachine__RefinesAssignment_5_1 )
            {
             before(grammarAccess.getXMachineAccess().getRefinesAssignment_5_1()); 
            // InternalXMachine.g:1148:2: ( rule__XMachine__RefinesAssignment_5_1 )
            // InternalXMachine.g:1148:3: rule__XMachine__RefinesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__RefinesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getRefinesAssignment_5_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1157:1: rule__XMachine__Group_6__0 : rule__XMachine__Group_6__0__Impl rule__XMachine__Group_6__1 ;
    public final void rule__XMachine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1161:1: ( rule__XMachine__Group_6__0__Impl rule__XMachine__Group_6__1 )
            // InternalXMachine.g:1162:2: rule__XMachine__Group_6__0__Impl rule__XMachine__Group_6__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:1169:1: rule__XMachine__Group_6__0__Impl : ( 'includes' ) ;
    public final void rule__XMachine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1173:1: ( ( 'includes' ) )
            // InternalXMachine.g:1174:1: ( 'includes' )
            {
            // InternalXMachine.g:1174:1: ( 'includes' )
            // InternalXMachine.g:1175:2: 'includes'
            {
             before(grammarAccess.getXMachineAccess().getIncludesKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getIncludesKeyword_6_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1184:1: rule__XMachine__Group_6__1 : rule__XMachine__Group_6__1__Impl ;
    public final void rule__XMachine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1188:1: ( rule__XMachine__Group_6__1__Impl )
            // InternalXMachine.g:1189:2: rule__XMachine__Group_6__1__Impl
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
    // InternalXMachine.g:1195:1: rule__XMachine__Group_6__1__Impl : ( ( rule__XMachine__AbstractMachineAssignment_6_1 ) ) ;
    public final void rule__XMachine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1199:1: ( ( ( rule__XMachine__AbstractMachineAssignment_6_1 ) ) )
            // InternalXMachine.g:1200:1: ( ( rule__XMachine__AbstractMachineAssignment_6_1 ) )
            {
            // InternalXMachine.g:1200:1: ( ( rule__XMachine__AbstractMachineAssignment_6_1 ) )
            // InternalXMachine.g:1201:2: ( rule__XMachine__AbstractMachineAssignment_6_1 )
            {
             before(grammarAccess.getXMachineAccess().getAbstractMachineAssignment_6_1()); 
            // InternalXMachine.g:1202:2: ( rule__XMachine__AbstractMachineAssignment_6_1 )
            // InternalXMachine.g:1202:3: rule__XMachine__AbstractMachineAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__AbstractMachineAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getAbstractMachineAssignment_6_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1211:1: rule__XMachine__Group_7__0 : rule__XMachine__Group_7__0__Impl rule__XMachine__Group_7__1 ;
    public final void rule__XMachine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1215:1: ( rule__XMachine__Group_7__0__Impl rule__XMachine__Group_7__1 )
            // InternalXMachine.g:1216:2: rule__XMachine__Group_7__0__Impl rule__XMachine__Group_7__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:1223:1: rule__XMachine__Group_7__0__Impl : ( 'to' ) ;
    public final void rule__XMachine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1227:1: ( ( 'to' ) )
            // InternalXMachine.g:1228:1: ( 'to' )
            {
            // InternalXMachine.g:1228:1: ( 'to' )
            // InternalXMachine.g:1229:2: 'to'
            {
             before(grammarAccess.getXMachineAccess().getToKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getToKeyword_7_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1238:1: rule__XMachine__Group_7__1 : rule__XMachine__Group_7__1__Impl ;
    public final void rule__XMachine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1242:1: ( rule__XMachine__Group_7__1__Impl )
            // InternalXMachine.g:1243:2: rule__XMachine__Group_7__1__Impl
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
    // InternalXMachine.g:1249:1: rule__XMachine__Group_7__1__Impl : ( ( rule__XMachine__ConcreteMachineAssignment_7_1 ) ) ;
    public final void rule__XMachine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1253:1: ( ( ( rule__XMachine__ConcreteMachineAssignment_7_1 ) ) )
            // InternalXMachine.g:1254:1: ( ( rule__XMachine__ConcreteMachineAssignment_7_1 ) )
            {
            // InternalXMachine.g:1254:1: ( ( rule__XMachine__ConcreteMachineAssignment_7_1 ) )
            // InternalXMachine.g:1255:2: ( rule__XMachine__ConcreteMachineAssignment_7_1 )
            {
             before(grammarAccess.getXMachineAccess().getConcreteMachineAssignment_7_1()); 
            // InternalXMachine.g:1256:2: ( rule__XMachine__ConcreteMachineAssignment_7_1 )
            // InternalXMachine.g:1256:3: rule__XMachine__ConcreteMachineAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__ConcreteMachineAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getConcreteMachineAssignment_7_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1265:1: rule__XMachine__Group_8__0 : rule__XMachine__Group_8__0__Impl rule__XMachine__Group_8__1 ;
    public final void rule__XMachine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1269:1: ( rule__XMachine__Group_8__0__Impl rule__XMachine__Group_8__1 )
            // InternalXMachine.g:1270:2: rule__XMachine__Group_8__0__Impl rule__XMachine__Group_8__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:1277:1: rule__XMachine__Group_8__0__Impl : ( 'as' ) ;
    public final void rule__XMachine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1281:1: ( ( 'as' ) )
            // InternalXMachine.g:1282:1: ( 'as' )
            {
            // InternalXMachine.g:1282:1: ( 'as' )
            // InternalXMachine.g:1283:2: 'as'
            {
             before(grammarAccess.getXMachineAccess().getAsKeyword_8_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getAsKeyword_8_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1292:1: rule__XMachine__Group_8__1 : rule__XMachine__Group_8__1__Impl rule__XMachine__Group_8__2 ;
    public final void rule__XMachine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1296:1: ( rule__XMachine__Group_8__1__Impl rule__XMachine__Group_8__2 )
            // InternalXMachine.g:1297:2: rule__XMachine__Group_8__1__Impl rule__XMachine__Group_8__2
            {
            pushFollow(FOLLOW_5);
            rule__XMachine__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMachine__Group_8__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1304:1: rule__XMachine__Group_8__1__Impl : ( ( rule__XMachine__PrefixesAssignment_8_1 ) ) ;
    public final void rule__XMachine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1308:1: ( ( ( rule__XMachine__PrefixesAssignment_8_1 ) ) )
            // InternalXMachine.g:1309:1: ( ( rule__XMachine__PrefixesAssignment_8_1 ) )
            {
            // InternalXMachine.g:1309:1: ( ( rule__XMachine__PrefixesAssignment_8_1 ) )
            // InternalXMachine.g:1310:2: ( rule__XMachine__PrefixesAssignment_8_1 )
            {
             before(grammarAccess.getXMachineAccess().getPrefixesAssignment_8_1()); 
            // InternalXMachine.g:1311:2: ( rule__XMachine__PrefixesAssignment_8_1 )
            // InternalXMachine.g:1311:3: rule__XMachine__PrefixesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__PrefixesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getXMachineAccess().getPrefixesAssignment_8_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XMachine__Group_8__2"
    // InternalXMachine.g:1319:1: rule__XMachine__Group_8__2 : rule__XMachine__Group_8__2__Impl ;
    public final void rule__XMachine__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1323:1: ( rule__XMachine__Group_8__2__Impl )
            // InternalXMachine.g:1324:2: rule__XMachine__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMachine__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_8__2"


    // $ANTLR start "rule__XMachine__Group_8__2__Impl"
    // InternalXMachine.g:1330:1: rule__XMachine__Group_8__2__Impl : ( ( rule__XMachine__PrefixesAssignment_8_2 )* ) ;
    public final void rule__XMachine__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1334:1: ( ( ( rule__XMachine__PrefixesAssignment_8_2 )* ) )
            // InternalXMachine.g:1335:1: ( ( rule__XMachine__PrefixesAssignment_8_2 )* )
            {
            // InternalXMachine.g:1335:1: ( ( rule__XMachine__PrefixesAssignment_8_2 )* )
            // InternalXMachine.g:1336:2: ( rule__XMachine__PrefixesAssignment_8_2 )*
            {
             before(grammarAccess.getXMachineAccess().getPrefixesAssignment_8_2()); 
            // InternalXMachine.g:1337:2: ( rule__XMachine__PrefixesAssignment_8_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXMachine.g:1337:3: rule__XMachine__PrefixesAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__XMachine__PrefixesAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getXMachineAccess().getPrefixesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__Group_8__2__Impl"


    // $ANTLR start "rule__XVariableNoComment__Group__0"
    // InternalXMachine.g:1346:1: rule__XVariableNoComment__Group__0 : rule__XVariableNoComment__Group__0__Impl rule__XVariableNoComment__Group__1 ;
    public final void rule__XVariableNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1350:1: ( rule__XVariableNoComment__Group__0__Impl rule__XVariableNoComment__Group__1 )
            // InternalXMachine.g:1351:2: rule__XVariableNoComment__Group__0__Impl rule__XVariableNoComment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XVariableNoComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariableNoComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableNoComment__Group__0"


    // $ANTLR start "rule__XVariableNoComment__Group__0__Impl"
    // InternalXMachine.g:1358:1: rule__XVariableNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XVariableNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1362:1: ( ( () ) )
            // InternalXMachine.g:1363:1: ( () )
            {
            // InternalXMachine.g:1363:1: ( () )
            // InternalXMachine.g:1364:2: ()
            {
             before(grammarAccess.getXVariableNoCommentAccess().getVariableAction_0()); 
            // InternalXMachine.g:1365:2: ()
            // InternalXMachine.g:1365:3: 
            {
            }

             after(grammarAccess.getXVariableNoCommentAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableNoComment__Group__0__Impl"


    // $ANTLR start "rule__XVariableNoComment__Group__1"
    // InternalXMachine.g:1373:1: rule__XVariableNoComment__Group__1 : rule__XVariableNoComment__Group__1__Impl ;
    public final void rule__XVariableNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1377:1: ( rule__XVariableNoComment__Group__1__Impl )
            // InternalXMachine.g:1378:2: rule__XVariableNoComment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariableNoComment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableNoComment__Group__1"


    // $ANTLR start "rule__XVariableNoComment__Group__1__Impl"
    // InternalXMachine.g:1384:1: rule__XVariableNoComment__Group__1__Impl : ( ( rule__XVariableNoComment__NameAssignment_1 ) ) ;
    public final void rule__XVariableNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1388:1: ( ( ( rule__XVariableNoComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:1389:1: ( ( rule__XVariableNoComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1389:1: ( ( rule__XVariableNoComment__NameAssignment_1 ) )
            // InternalXMachine.g:1390:2: ( rule__XVariableNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXVariableNoCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1391:2: ( rule__XVariableNoComment__NameAssignment_1 )
            // InternalXMachine.g:1391:3: rule__XVariableNoComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariableNoComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariableNoCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableNoComment__Group__1__Impl"


    // $ANTLR start "rule__XVariableMLComment__Group__0"
    // InternalXMachine.g:1400:1: rule__XVariableMLComment__Group__0 : rule__XVariableMLComment__Group__0__Impl rule__XVariableMLComment__Group__1 ;
    public final void rule__XVariableMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1404:1: ( rule__XVariableMLComment__Group__0__Impl rule__XVariableMLComment__Group__1 )
            // InternalXMachine.g:1405:2: rule__XVariableMLComment__Group__0__Impl rule__XVariableMLComment__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__XVariableMLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariableMLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableMLComment__Group__0"


    // $ANTLR start "rule__XVariableMLComment__Group__0__Impl"
    // InternalXMachine.g:1412:1: rule__XVariableMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XVariableMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1416:1: ( ( () ) )
            // InternalXMachine.g:1417:1: ( () )
            {
            // InternalXMachine.g:1417:1: ( () )
            // InternalXMachine.g:1418:2: ()
            {
             before(grammarAccess.getXVariableMLCommentAccess().getVariableAction_0()); 
            // InternalXMachine.g:1419:2: ()
            // InternalXMachine.g:1419:3: 
            {
            }

             after(grammarAccess.getXVariableMLCommentAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableMLComment__Group__0__Impl"


    // $ANTLR start "rule__XVariableMLComment__Group__1"
    // InternalXMachine.g:1427:1: rule__XVariableMLComment__Group__1 : rule__XVariableMLComment__Group__1__Impl rule__XVariableMLComment__Group__2 ;
    public final void rule__XVariableMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1431:1: ( rule__XVariableMLComment__Group__1__Impl rule__XVariableMLComment__Group__2 )
            // InternalXMachine.g:1432:2: rule__XVariableMLComment__Group__1__Impl rule__XVariableMLComment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__XVariableMLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariableMLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableMLComment__Group__1"


    // $ANTLR start "rule__XVariableMLComment__Group__1__Impl"
    // InternalXMachine.g:1439:1: rule__XVariableMLComment__Group__1__Impl : ( ( rule__XVariableMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XVariableMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1443:1: ( ( ( rule__XVariableMLComment__CommentAssignment_1 ) ) )
            // InternalXMachine.g:1444:1: ( ( rule__XVariableMLComment__CommentAssignment_1 ) )
            {
            // InternalXMachine.g:1444:1: ( ( rule__XVariableMLComment__CommentAssignment_1 ) )
            // InternalXMachine.g:1445:2: ( rule__XVariableMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXVariableMLCommentAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1446:2: ( rule__XVariableMLComment__CommentAssignment_1 )
            // InternalXMachine.g:1446:3: rule__XVariableMLComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariableMLComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariableMLCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableMLComment__Group__1__Impl"


    // $ANTLR start "rule__XVariableMLComment__Group__2"
    // InternalXMachine.g:1454:1: rule__XVariableMLComment__Group__2 : rule__XVariableMLComment__Group__2__Impl ;
    public final void rule__XVariableMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1458:1: ( rule__XVariableMLComment__Group__2__Impl )
            // InternalXMachine.g:1459:2: rule__XVariableMLComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariableMLComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableMLComment__Group__2"


    // $ANTLR start "rule__XVariableMLComment__Group__2__Impl"
    // InternalXMachine.g:1465:1: rule__XVariableMLComment__Group__2__Impl : ( ( rule__XVariableMLComment__NameAssignment_2 ) ) ;
    public final void rule__XVariableMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1469:1: ( ( ( rule__XVariableMLComment__NameAssignment_2 ) ) )
            // InternalXMachine.g:1470:1: ( ( rule__XVariableMLComment__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1470:1: ( ( rule__XVariableMLComment__NameAssignment_2 ) )
            // InternalXMachine.g:1471:2: ( rule__XVariableMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXVariableMLCommentAccess().getNameAssignment_2()); 
            // InternalXMachine.g:1472:2: ( rule__XVariableMLComment__NameAssignment_2 )
            // InternalXMachine.g:1472:3: rule__XVariableMLComment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XVariableMLComment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXVariableMLCommentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableMLComment__Group__2__Impl"


    // $ANTLR start "rule__XVariableSLComment__Group__0"
    // InternalXMachine.g:1481:1: rule__XVariableSLComment__Group__0 : rule__XVariableSLComment__Group__0__Impl rule__XVariableSLComment__Group__1 ;
    public final void rule__XVariableSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1485:1: ( rule__XVariableSLComment__Group__0__Impl rule__XVariableSLComment__Group__1 )
            // InternalXMachine.g:1486:2: rule__XVariableSLComment__Group__0__Impl rule__XVariableSLComment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XVariableSLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariableSLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableSLComment__Group__0"


    // $ANTLR start "rule__XVariableSLComment__Group__0__Impl"
    // InternalXMachine.g:1493:1: rule__XVariableSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XVariableSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1497:1: ( ( () ) )
            // InternalXMachine.g:1498:1: ( () )
            {
            // InternalXMachine.g:1498:1: ( () )
            // InternalXMachine.g:1499:2: ()
            {
             before(grammarAccess.getXVariableSLCommentAccess().getVariableAction_0()); 
            // InternalXMachine.g:1500:2: ()
            // InternalXMachine.g:1500:3: 
            {
            }

             after(grammarAccess.getXVariableSLCommentAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableSLComment__Group__0__Impl"


    // $ANTLR start "rule__XVariableSLComment__Group__1"
    // InternalXMachine.g:1508:1: rule__XVariableSLComment__Group__1 : rule__XVariableSLComment__Group__1__Impl rule__XVariableSLComment__Group__2 ;
    public final void rule__XVariableSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1512:1: ( rule__XVariableSLComment__Group__1__Impl rule__XVariableSLComment__Group__2 )
            // InternalXMachine.g:1513:2: rule__XVariableSLComment__Group__1__Impl rule__XVariableSLComment__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__XVariableSLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariableSLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableSLComment__Group__1"


    // $ANTLR start "rule__XVariableSLComment__Group__1__Impl"
    // InternalXMachine.g:1520:1: rule__XVariableSLComment__Group__1__Impl : ( ( rule__XVariableSLComment__NameAssignment_1 ) ) ;
    public final void rule__XVariableSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1524:1: ( ( ( rule__XVariableSLComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:1525:1: ( ( rule__XVariableSLComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1525:1: ( ( rule__XVariableSLComment__NameAssignment_1 ) )
            // InternalXMachine.g:1526:2: ( rule__XVariableSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXVariableSLCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1527:2: ( rule__XVariableSLComment__NameAssignment_1 )
            // InternalXMachine.g:1527:3: rule__XVariableSLComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariableSLComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariableSLCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableSLComment__Group__1__Impl"


    // $ANTLR start "rule__XVariableSLComment__Group__2"
    // InternalXMachine.g:1535:1: rule__XVariableSLComment__Group__2 : rule__XVariableSLComment__Group__2__Impl ;
    public final void rule__XVariableSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1539:1: ( rule__XVariableSLComment__Group__2__Impl )
            // InternalXMachine.g:1540:2: rule__XVariableSLComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariableSLComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableSLComment__Group__2"


    // $ANTLR start "rule__XVariableSLComment__Group__2__Impl"
    // InternalXMachine.g:1546:1: rule__XVariableSLComment__Group__2__Impl : ( ( rule__XVariableSLComment__CommentAssignment_2 ) ) ;
    public final void rule__XVariableSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1550:1: ( ( ( rule__XVariableSLComment__CommentAssignment_2 ) ) )
            // InternalXMachine.g:1551:1: ( ( rule__XVariableSLComment__CommentAssignment_2 ) )
            {
            // InternalXMachine.g:1551:1: ( ( rule__XVariableSLComment__CommentAssignment_2 ) )
            // InternalXMachine.g:1552:2: ( rule__XVariableSLComment__CommentAssignment_2 )
            {
             before(grammarAccess.getXVariableSLCommentAccess().getCommentAssignment_2()); 
            // InternalXMachine.g:1553:2: ( rule__XVariableSLComment__CommentAssignment_2 )
            // InternalXMachine.g:1553:3: rule__XVariableSLComment__CommentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XVariableSLComment__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXVariableSLCommentAccess().getCommentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableSLComment__Group__2__Impl"


    // $ANTLR start "rule__XInvariantNoComment__Group__0"
    // InternalXMachine.g:1562:1: rule__XInvariantNoComment__Group__0 : rule__XInvariantNoComment__Group__0__Impl rule__XInvariantNoComment__Group__1 ;
    public final void rule__XInvariantNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1566:1: ( rule__XInvariantNoComment__Group__0__Impl rule__XInvariantNoComment__Group__1 )
            // InternalXMachine.g:1567:2: rule__XInvariantNoComment__Group__0__Impl rule__XInvariantNoComment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XInvariantNoComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantNoComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__Group__0"


    // $ANTLR start "rule__XInvariantNoComment__Group__0__Impl"
    // InternalXMachine.g:1574:1: rule__XInvariantNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XInvariantNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1578:1: ( ( () ) )
            // InternalXMachine.g:1579:1: ( () )
            {
            // InternalXMachine.g:1579:1: ( () )
            // InternalXMachine.g:1580:2: ()
            {
             before(grammarAccess.getXInvariantNoCommentAccess().getInvariantAction_0()); 
            // InternalXMachine.g:1581:2: ()
            // InternalXMachine.g:1581:3: 
            {
            }

             after(grammarAccess.getXInvariantNoCommentAccess().getInvariantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__Group__0__Impl"


    // $ANTLR start "rule__XInvariantNoComment__Group__1"
    // InternalXMachine.g:1589:1: rule__XInvariantNoComment__Group__1 : rule__XInvariantNoComment__Group__1__Impl rule__XInvariantNoComment__Group__2 ;
    public final void rule__XInvariantNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1593:1: ( rule__XInvariantNoComment__Group__1__Impl rule__XInvariantNoComment__Group__2 )
            // InternalXMachine.g:1594:2: rule__XInvariantNoComment__Group__1__Impl rule__XInvariantNoComment__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XInvariantNoComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantNoComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__Group__1"


    // $ANTLR start "rule__XInvariantNoComment__Group__1__Impl"
    // InternalXMachine.g:1601:1: rule__XInvariantNoComment__Group__1__Impl : ( ( rule__XInvariantNoComment__NameAssignment_1 ) ) ;
    public final void rule__XInvariantNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1605:1: ( ( ( rule__XInvariantNoComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:1606:1: ( ( rule__XInvariantNoComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1606:1: ( ( rule__XInvariantNoComment__NameAssignment_1 ) )
            // InternalXMachine.g:1607:2: ( rule__XInvariantNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXInvariantNoCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1608:2: ( rule__XInvariantNoComment__NameAssignment_1 )
            // InternalXMachine.g:1608:3: rule__XInvariantNoComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantNoComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantNoCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__Group__1__Impl"


    // $ANTLR start "rule__XInvariantNoComment__Group__2"
    // InternalXMachine.g:1616:1: rule__XInvariantNoComment__Group__2 : rule__XInvariantNoComment__Group__2__Impl rule__XInvariantNoComment__Group__3 ;
    public final void rule__XInvariantNoComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1620:1: ( rule__XInvariantNoComment__Group__2__Impl rule__XInvariantNoComment__Group__3 )
            // InternalXMachine.g:1621:2: rule__XInvariantNoComment__Group__2__Impl rule__XInvariantNoComment__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__XInvariantNoComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantNoComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__Group__2"


    // $ANTLR start "rule__XInvariantNoComment__Group__2__Impl"
    // InternalXMachine.g:1628:1: rule__XInvariantNoComment__Group__2__Impl : ( ( rule__XInvariantNoComment__PredicateAssignment_2 ) ) ;
    public final void rule__XInvariantNoComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1632:1: ( ( ( rule__XInvariantNoComment__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:1633:1: ( ( rule__XInvariantNoComment__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:1633:1: ( ( rule__XInvariantNoComment__PredicateAssignment_2 ) )
            // InternalXMachine.g:1634:2: ( rule__XInvariantNoComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXInvariantNoCommentAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:1635:2: ( rule__XInvariantNoComment__PredicateAssignment_2 )
            // InternalXMachine.g:1635:3: rule__XInvariantNoComment__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantNoComment__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantNoCommentAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__Group__2__Impl"


    // $ANTLR start "rule__XInvariantNoComment__Group__3"
    // InternalXMachine.g:1643:1: rule__XInvariantNoComment__Group__3 : rule__XInvariantNoComment__Group__3__Impl ;
    public final void rule__XInvariantNoComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1647:1: ( rule__XInvariantNoComment__Group__3__Impl )
            // InternalXMachine.g:1648:2: rule__XInvariantNoComment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantNoComment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__Group__3"


    // $ANTLR start "rule__XInvariantNoComment__Group__3__Impl"
    // InternalXMachine.g:1654:1: rule__XInvariantNoComment__Group__3__Impl : ( ( rule__XInvariantNoComment__TheoremAssignment_3 )? ) ;
    public final void rule__XInvariantNoComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1658:1: ( ( ( rule__XInvariantNoComment__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:1659:1: ( ( rule__XInvariantNoComment__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:1659:1: ( ( rule__XInvariantNoComment__TheoremAssignment_3 )? )
            // InternalXMachine.g:1660:2: ( rule__XInvariantNoComment__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXInvariantNoCommentAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:1661:2: ( rule__XInvariantNoComment__TheoremAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:1661:3: rule__XInvariantNoComment__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariantNoComment__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXInvariantNoCommentAccess().getTheoremAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__Group__3__Impl"


    // $ANTLR start "rule__XInvariantMLComment__Group__0"
    // InternalXMachine.g:1670:1: rule__XInvariantMLComment__Group__0 : rule__XInvariantMLComment__Group__0__Impl rule__XInvariantMLComment__Group__1 ;
    public final void rule__XInvariantMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1674:1: ( rule__XInvariantMLComment__Group__0__Impl rule__XInvariantMLComment__Group__1 )
            // InternalXMachine.g:1675:2: rule__XInvariantMLComment__Group__0__Impl rule__XInvariantMLComment__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__XInvariantMLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantMLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__Group__0"


    // $ANTLR start "rule__XInvariantMLComment__Group__0__Impl"
    // InternalXMachine.g:1682:1: rule__XInvariantMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XInvariantMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1686:1: ( ( () ) )
            // InternalXMachine.g:1687:1: ( () )
            {
            // InternalXMachine.g:1687:1: ( () )
            // InternalXMachine.g:1688:2: ()
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getInvariantAction_0()); 
            // InternalXMachine.g:1689:2: ()
            // InternalXMachine.g:1689:3: 
            {
            }

             after(grammarAccess.getXInvariantMLCommentAccess().getInvariantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__Group__0__Impl"


    // $ANTLR start "rule__XInvariantMLComment__Group__1"
    // InternalXMachine.g:1697:1: rule__XInvariantMLComment__Group__1 : rule__XInvariantMLComment__Group__1__Impl rule__XInvariantMLComment__Group__2 ;
    public final void rule__XInvariantMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1701:1: ( rule__XInvariantMLComment__Group__1__Impl rule__XInvariantMLComment__Group__2 )
            // InternalXMachine.g:1702:2: rule__XInvariantMLComment__Group__1__Impl rule__XInvariantMLComment__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__XInvariantMLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantMLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__Group__1"


    // $ANTLR start "rule__XInvariantMLComment__Group__1__Impl"
    // InternalXMachine.g:1709:1: rule__XInvariantMLComment__Group__1__Impl : ( ( rule__XInvariantMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XInvariantMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1713:1: ( ( ( rule__XInvariantMLComment__CommentAssignment_1 ) ) )
            // InternalXMachine.g:1714:1: ( ( rule__XInvariantMLComment__CommentAssignment_1 ) )
            {
            // InternalXMachine.g:1714:1: ( ( rule__XInvariantMLComment__CommentAssignment_1 ) )
            // InternalXMachine.g:1715:2: ( rule__XInvariantMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1716:2: ( rule__XInvariantMLComment__CommentAssignment_1 )
            // InternalXMachine.g:1716:3: rule__XInvariantMLComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantMLComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantMLCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__Group__1__Impl"


    // $ANTLR start "rule__XInvariantMLComment__Group__2"
    // InternalXMachine.g:1724:1: rule__XInvariantMLComment__Group__2 : rule__XInvariantMLComment__Group__2__Impl rule__XInvariantMLComment__Group__3 ;
    public final void rule__XInvariantMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1728:1: ( rule__XInvariantMLComment__Group__2__Impl rule__XInvariantMLComment__Group__3 )
            // InternalXMachine.g:1729:2: rule__XInvariantMLComment__Group__2__Impl rule__XInvariantMLComment__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__XInvariantMLComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantMLComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__Group__2"


    // $ANTLR start "rule__XInvariantMLComment__Group__2__Impl"
    // InternalXMachine.g:1736:1: rule__XInvariantMLComment__Group__2__Impl : ( ( rule__XInvariantMLComment__NameAssignment_2 ) ) ;
    public final void rule__XInvariantMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1740:1: ( ( ( rule__XInvariantMLComment__NameAssignment_2 ) ) )
            // InternalXMachine.g:1741:1: ( ( rule__XInvariantMLComment__NameAssignment_2 ) )
            {
            // InternalXMachine.g:1741:1: ( ( rule__XInvariantMLComment__NameAssignment_2 ) )
            // InternalXMachine.g:1742:2: ( rule__XInvariantMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getNameAssignment_2()); 
            // InternalXMachine.g:1743:2: ( rule__XInvariantMLComment__NameAssignment_2 )
            // InternalXMachine.g:1743:3: rule__XInvariantMLComment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantMLComment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantMLCommentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__Group__2__Impl"


    // $ANTLR start "rule__XInvariantMLComment__Group__3"
    // InternalXMachine.g:1751:1: rule__XInvariantMLComment__Group__3 : rule__XInvariantMLComment__Group__3__Impl rule__XInvariantMLComment__Group__4 ;
    public final void rule__XInvariantMLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1755:1: ( rule__XInvariantMLComment__Group__3__Impl rule__XInvariantMLComment__Group__4 )
            // InternalXMachine.g:1756:2: rule__XInvariantMLComment__Group__3__Impl rule__XInvariantMLComment__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__XInvariantMLComment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantMLComment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__Group__3"


    // $ANTLR start "rule__XInvariantMLComment__Group__3__Impl"
    // InternalXMachine.g:1763:1: rule__XInvariantMLComment__Group__3__Impl : ( ( rule__XInvariantMLComment__PredicateAssignment_3 ) ) ;
    public final void rule__XInvariantMLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1767:1: ( ( ( rule__XInvariantMLComment__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:1768:1: ( ( rule__XInvariantMLComment__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:1768:1: ( ( rule__XInvariantMLComment__PredicateAssignment_3 ) )
            // InternalXMachine.g:1769:2: ( rule__XInvariantMLComment__PredicateAssignment_3 )
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getPredicateAssignment_3()); 
            // InternalXMachine.g:1770:2: ( rule__XInvariantMLComment__PredicateAssignment_3 )
            // InternalXMachine.g:1770:3: rule__XInvariantMLComment__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantMLComment__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantMLCommentAccess().getPredicateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__Group__3__Impl"


    // $ANTLR start "rule__XInvariantMLComment__Group__4"
    // InternalXMachine.g:1778:1: rule__XInvariantMLComment__Group__4 : rule__XInvariantMLComment__Group__4__Impl ;
    public final void rule__XInvariantMLComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1782:1: ( rule__XInvariantMLComment__Group__4__Impl )
            // InternalXMachine.g:1783:2: rule__XInvariantMLComment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantMLComment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__Group__4"


    // $ANTLR start "rule__XInvariantMLComment__Group__4__Impl"
    // InternalXMachine.g:1789:1: rule__XInvariantMLComment__Group__4__Impl : ( ( rule__XInvariantMLComment__TheoremAssignment_4 )? ) ;
    public final void rule__XInvariantMLComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1793:1: ( ( ( rule__XInvariantMLComment__TheoremAssignment_4 )? ) )
            // InternalXMachine.g:1794:1: ( ( rule__XInvariantMLComment__TheoremAssignment_4 )? )
            {
            // InternalXMachine.g:1794:1: ( ( rule__XInvariantMLComment__TheoremAssignment_4 )? )
            // InternalXMachine.g:1795:2: ( rule__XInvariantMLComment__TheoremAssignment_4 )?
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getTheoremAssignment_4()); 
            // InternalXMachine.g:1796:2: ( rule__XInvariantMLComment__TheoremAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXMachine.g:1796:3: rule__XInvariantMLComment__TheoremAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariantMLComment__TheoremAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXInvariantMLCommentAccess().getTheoremAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__Group__4__Impl"


    // $ANTLR start "rule__XInvariantSLComment__Group__0"
    // InternalXMachine.g:1805:1: rule__XInvariantSLComment__Group__0 : rule__XInvariantSLComment__Group__0__Impl rule__XInvariantSLComment__Group__1 ;
    public final void rule__XInvariantSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1809:1: ( rule__XInvariantSLComment__Group__0__Impl rule__XInvariantSLComment__Group__1 )
            // InternalXMachine.g:1810:2: rule__XInvariantSLComment__Group__0__Impl rule__XInvariantSLComment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XInvariantSLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantSLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__Group__0"


    // $ANTLR start "rule__XInvariantSLComment__Group__0__Impl"
    // InternalXMachine.g:1817:1: rule__XInvariantSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XInvariantSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1821:1: ( ( () ) )
            // InternalXMachine.g:1822:1: ( () )
            {
            // InternalXMachine.g:1822:1: ( () )
            // InternalXMachine.g:1823:2: ()
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getInvariantAction_0()); 
            // InternalXMachine.g:1824:2: ()
            // InternalXMachine.g:1824:3: 
            {
            }

             after(grammarAccess.getXInvariantSLCommentAccess().getInvariantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__Group__0__Impl"


    // $ANTLR start "rule__XInvariantSLComment__Group__1"
    // InternalXMachine.g:1832:1: rule__XInvariantSLComment__Group__1 : rule__XInvariantSLComment__Group__1__Impl rule__XInvariantSLComment__Group__2 ;
    public final void rule__XInvariantSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1836:1: ( rule__XInvariantSLComment__Group__1__Impl rule__XInvariantSLComment__Group__2 )
            // InternalXMachine.g:1837:2: rule__XInvariantSLComment__Group__1__Impl rule__XInvariantSLComment__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XInvariantSLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantSLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__Group__1"


    // $ANTLR start "rule__XInvariantSLComment__Group__1__Impl"
    // InternalXMachine.g:1844:1: rule__XInvariantSLComment__Group__1__Impl : ( ( rule__XInvariantSLComment__NameAssignment_1 ) ) ;
    public final void rule__XInvariantSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1848:1: ( ( ( rule__XInvariantSLComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:1849:1: ( ( rule__XInvariantSLComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:1849:1: ( ( rule__XInvariantSLComment__NameAssignment_1 ) )
            // InternalXMachine.g:1850:2: ( rule__XInvariantSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:1851:2: ( rule__XInvariantSLComment__NameAssignment_1 )
            // InternalXMachine.g:1851:3: rule__XInvariantSLComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantSLComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantSLCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__Group__1__Impl"


    // $ANTLR start "rule__XInvariantSLComment__Group__2"
    // InternalXMachine.g:1859:1: rule__XInvariantSLComment__Group__2 : rule__XInvariantSLComment__Group__2__Impl rule__XInvariantSLComment__Group__3 ;
    public final void rule__XInvariantSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1863:1: ( rule__XInvariantSLComment__Group__2__Impl rule__XInvariantSLComment__Group__3 )
            // InternalXMachine.g:1864:2: rule__XInvariantSLComment__Group__2__Impl rule__XInvariantSLComment__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__XInvariantSLComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantSLComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__Group__2"


    // $ANTLR start "rule__XInvariantSLComment__Group__2__Impl"
    // InternalXMachine.g:1871:1: rule__XInvariantSLComment__Group__2__Impl : ( ( rule__XInvariantSLComment__PredicateAssignment_2 ) ) ;
    public final void rule__XInvariantSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1875:1: ( ( ( rule__XInvariantSLComment__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:1876:1: ( ( rule__XInvariantSLComment__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:1876:1: ( ( rule__XInvariantSLComment__PredicateAssignment_2 ) )
            // InternalXMachine.g:1877:2: ( rule__XInvariantSLComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:1878:2: ( rule__XInvariantSLComment__PredicateAssignment_2 )
            // InternalXMachine.g:1878:3: rule__XInvariantSLComment__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantSLComment__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantSLCommentAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__Group__2__Impl"


    // $ANTLR start "rule__XInvariantSLComment__Group__3"
    // InternalXMachine.g:1886:1: rule__XInvariantSLComment__Group__3 : rule__XInvariantSLComment__Group__3__Impl rule__XInvariantSLComment__Group__4 ;
    public final void rule__XInvariantSLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1890:1: ( rule__XInvariantSLComment__Group__3__Impl rule__XInvariantSLComment__Group__4 )
            // InternalXMachine.g:1891:2: rule__XInvariantSLComment__Group__3__Impl rule__XInvariantSLComment__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__XInvariantSLComment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariantSLComment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__Group__3"


    // $ANTLR start "rule__XInvariantSLComment__Group__3__Impl"
    // InternalXMachine.g:1898:1: rule__XInvariantSLComment__Group__3__Impl : ( ( rule__XInvariantSLComment__TheoremAssignment_3 )? ) ;
    public final void rule__XInvariantSLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1902:1: ( ( ( rule__XInvariantSLComment__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:1903:1: ( ( rule__XInvariantSLComment__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:1903:1: ( ( rule__XInvariantSLComment__TheoremAssignment_3 )? )
            // InternalXMachine.g:1904:2: ( rule__XInvariantSLComment__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:1905:2: ( rule__XInvariantSLComment__TheoremAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:1905:3: rule__XInvariantSLComment__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariantSLComment__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXInvariantSLCommentAccess().getTheoremAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__Group__3__Impl"


    // $ANTLR start "rule__XInvariantSLComment__Group__4"
    // InternalXMachine.g:1913:1: rule__XInvariantSLComment__Group__4 : rule__XInvariantSLComment__Group__4__Impl ;
    public final void rule__XInvariantSLComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1917:1: ( rule__XInvariantSLComment__Group__4__Impl )
            // InternalXMachine.g:1918:2: rule__XInvariantSLComment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantSLComment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__Group__4"


    // $ANTLR start "rule__XInvariantSLComment__Group__4__Impl"
    // InternalXMachine.g:1924:1: rule__XInvariantSLComment__Group__4__Impl : ( ( rule__XInvariantSLComment__CommentAssignment_4 ) ) ;
    public final void rule__XInvariantSLComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1928:1: ( ( ( rule__XInvariantSLComment__CommentAssignment_4 ) ) )
            // InternalXMachine.g:1929:1: ( ( rule__XInvariantSLComment__CommentAssignment_4 ) )
            {
            // InternalXMachine.g:1929:1: ( ( rule__XInvariantSLComment__CommentAssignment_4 ) )
            // InternalXMachine.g:1930:2: ( rule__XInvariantSLComment__CommentAssignment_4 )
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getCommentAssignment_4()); 
            // InternalXMachine.g:1931:2: ( rule__XInvariantSLComment__CommentAssignment_4 )
            // InternalXMachine.g:1931:3: rule__XInvariantSLComment__CommentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XInvariantSLComment__CommentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantSLCommentAccess().getCommentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__Group__4__Impl"


    // $ANTLR start "rule__XVariantNoComment__Group__0"
    // InternalXMachine.g:1940:1: rule__XVariantNoComment__Group__0 : rule__XVariantNoComment__Group__0__Impl rule__XVariantNoComment__Group__1 ;
    public final void rule__XVariantNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1944:1: ( rule__XVariantNoComment__Group__0__Impl rule__XVariantNoComment__Group__1 )
            // InternalXMachine.g:1945:2: rule__XVariantNoComment__Group__0__Impl rule__XVariantNoComment__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__XVariantNoComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariantNoComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantNoComment__Group__0"


    // $ANTLR start "rule__XVariantNoComment__Group__0__Impl"
    // InternalXMachine.g:1952:1: rule__XVariantNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XVariantNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1956:1: ( ( () ) )
            // InternalXMachine.g:1957:1: ( () )
            {
            // InternalXMachine.g:1957:1: ( () )
            // InternalXMachine.g:1958:2: ()
            {
             before(grammarAccess.getXVariantNoCommentAccess().getVariantAction_0()); 
            // InternalXMachine.g:1959:2: ()
            // InternalXMachine.g:1959:3: 
            {
            }

             after(grammarAccess.getXVariantNoCommentAccess().getVariantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantNoComment__Group__0__Impl"


    // $ANTLR start "rule__XVariantNoComment__Group__1"
    // InternalXMachine.g:1967:1: rule__XVariantNoComment__Group__1 : rule__XVariantNoComment__Group__1__Impl ;
    public final void rule__XVariantNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1971:1: ( rule__XVariantNoComment__Group__1__Impl )
            // InternalXMachine.g:1972:2: rule__XVariantNoComment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariantNoComment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantNoComment__Group__1"


    // $ANTLR start "rule__XVariantNoComment__Group__1__Impl"
    // InternalXMachine.g:1978:1: rule__XVariantNoComment__Group__1__Impl : ( ( rule__XVariantNoComment__ExpressionAssignment_1 ) ) ;
    public final void rule__XVariantNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1982:1: ( ( ( rule__XVariantNoComment__ExpressionAssignment_1 ) ) )
            // InternalXMachine.g:1983:1: ( ( rule__XVariantNoComment__ExpressionAssignment_1 ) )
            {
            // InternalXMachine.g:1983:1: ( ( rule__XVariantNoComment__ExpressionAssignment_1 ) )
            // InternalXMachine.g:1984:2: ( rule__XVariantNoComment__ExpressionAssignment_1 )
            {
             before(grammarAccess.getXVariantNoCommentAccess().getExpressionAssignment_1()); 
            // InternalXMachine.g:1985:2: ( rule__XVariantNoComment__ExpressionAssignment_1 )
            // InternalXMachine.g:1985:3: rule__XVariantNoComment__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariantNoComment__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariantNoCommentAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantNoComment__Group__1__Impl"


    // $ANTLR start "rule__XVariantMLComment__Group__0"
    // InternalXMachine.g:1994:1: rule__XVariantMLComment__Group__0 : rule__XVariantMLComment__Group__0__Impl rule__XVariantMLComment__Group__1 ;
    public final void rule__XVariantMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1998:1: ( rule__XVariantMLComment__Group__0__Impl rule__XVariantMLComment__Group__1 )
            // InternalXMachine.g:1999:2: rule__XVariantMLComment__Group__0__Impl rule__XVariantMLComment__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__XVariantMLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariantMLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantMLComment__Group__0"


    // $ANTLR start "rule__XVariantMLComment__Group__0__Impl"
    // InternalXMachine.g:2006:1: rule__XVariantMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XVariantMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2010:1: ( ( () ) )
            // InternalXMachine.g:2011:1: ( () )
            {
            // InternalXMachine.g:2011:1: ( () )
            // InternalXMachine.g:2012:2: ()
            {
             before(grammarAccess.getXVariantMLCommentAccess().getVariantAction_0()); 
            // InternalXMachine.g:2013:2: ()
            // InternalXMachine.g:2013:3: 
            {
            }

             after(grammarAccess.getXVariantMLCommentAccess().getVariantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantMLComment__Group__0__Impl"


    // $ANTLR start "rule__XVariantMLComment__Group__1"
    // InternalXMachine.g:2021:1: rule__XVariantMLComment__Group__1 : rule__XVariantMLComment__Group__1__Impl rule__XVariantMLComment__Group__2 ;
    public final void rule__XVariantMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2025:1: ( rule__XVariantMLComment__Group__1__Impl rule__XVariantMLComment__Group__2 )
            // InternalXMachine.g:2026:2: rule__XVariantMLComment__Group__1__Impl rule__XVariantMLComment__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XVariantMLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariantMLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantMLComment__Group__1"


    // $ANTLR start "rule__XVariantMLComment__Group__1__Impl"
    // InternalXMachine.g:2033:1: rule__XVariantMLComment__Group__1__Impl : ( ( rule__XVariantMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XVariantMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2037:1: ( ( ( rule__XVariantMLComment__CommentAssignment_1 ) ) )
            // InternalXMachine.g:2038:1: ( ( rule__XVariantMLComment__CommentAssignment_1 ) )
            {
            // InternalXMachine.g:2038:1: ( ( rule__XVariantMLComment__CommentAssignment_1 ) )
            // InternalXMachine.g:2039:2: ( rule__XVariantMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXVariantMLCommentAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2040:2: ( rule__XVariantMLComment__CommentAssignment_1 )
            // InternalXMachine.g:2040:3: rule__XVariantMLComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariantMLComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariantMLCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantMLComment__Group__1__Impl"


    // $ANTLR start "rule__XVariantMLComment__Group__2"
    // InternalXMachine.g:2048:1: rule__XVariantMLComment__Group__2 : rule__XVariantMLComment__Group__2__Impl ;
    public final void rule__XVariantMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2052:1: ( rule__XVariantMLComment__Group__2__Impl )
            // InternalXMachine.g:2053:2: rule__XVariantMLComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariantMLComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantMLComment__Group__2"


    // $ANTLR start "rule__XVariantMLComment__Group__2__Impl"
    // InternalXMachine.g:2059:1: rule__XVariantMLComment__Group__2__Impl : ( ( rule__XVariantMLComment__ExpressionAssignment_2 ) ) ;
    public final void rule__XVariantMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2063:1: ( ( ( rule__XVariantMLComment__ExpressionAssignment_2 ) ) )
            // InternalXMachine.g:2064:1: ( ( rule__XVariantMLComment__ExpressionAssignment_2 ) )
            {
            // InternalXMachine.g:2064:1: ( ( rule__XVariantMLComment__ExpressionAssignment_2 ) )
            // InternalXMachine.g:2065:2: ( rule__XVariantMLComment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getXVariantMLCommentAccess().getExpressionAssignment_2()); 
            // InternalXMachine.g:2066:2: ( rule__XVariantMLComment__ExpressionAssignment_2 )
            // InternalXMachine.g:2066:3: rule__XVariantMLComment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XVariantMLComment__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXVariantMLCommentAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantMLComment__Group__2__Impl"


    // $ANTLR start "rule__XVariantSLComment__Group__0"
    // InternalXMachine.g:2075:1: rule__XVariantSLComment__Group__0 : rule__XVariantSLComment__Group__0__Impl rule__XVariantSLComment__Group__1 ;
    public final void rule__XVariantSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2079:1: ( rule__XVariantSLComment__Group__0__Impl rule__XVariantSLComment__Group__1 )
            // InternalXMachine.g:2080:2: rule__XVariantSLComment__Group__0__Impl rule__XVariantSLComment__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__XVariantSLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariantSLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantSLComment__Group__0"


    // $ANTLR start "rule__XVariantSLComment__Group__0__Impl"
    // InternalXMachine.g:2087:1: rule__XVariantSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XVariantSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2091:1: ( ( () ) )
            // InternalXMachine.g:2092:1: ( () )
            {
            // InternalXMachine.g:2092:1: ( () )
            // InternalXMachine.g:2093:2: ()
            {
             before(grammarAccess.getXVariantSLCommentAccess().getVariantAction_0()); 
            // InternalXMachine.g:2094:2: ()
            // InternalXMachine.g:2094:3: 
            {
            }

             after(grammarAccess.getXVariantSLCommentAccess().getVariantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantSLComment__Group__0__Impl"


    // $ANTLR start "rule__XVariantSLComment__Group__1"
    // InternalXMachine.g:2102:1: rule__XVariantSLComment__Group__1 : rule__XVariantSLComment__Group__1__Impl rule__XVariantSLComment__Group__2 ;
    public final void rule__XVariantSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2106:1: ( rule__XVariantSLComment__Group__1__Impl rule__XVariantSLComment__Group__2 )
            // InternalXMachine.g:2107:2: rule__XVariantSLComment__Group__1__Impl rule__XVariantSLComment__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__XVariantSLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariantSLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantSLComment__Group__1"


    // $ANTLR start "rule__XVariantSLComment__Group__1__Impl"
    // InternalXMachine.g:2114:1: rule__XVariantSLComment__Group__1__Impl : ( ( rule__XVariantSLComment__ExpressionAssignment_1 ) ) ;
    public final void rule__XVariantSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2118:1: ( ( ( rule__XVariantSLComment__ExpressionAssignment_1 ) ) )
            // InternalXMachine.g:2119:1: ( ( rule__XVariantSLComment__ExpressionAssignment_1 ) )
            {
            // InternalXMachine.g:2119:1: ( ( rule__XVariantSLComment__ExpressionAssignment_1 ) )
            // InternalXMachine.g:2120:2: ( rule__XVariantSLComment__ExpressionAssignment_1 )
            {
             before(grammarAccess.getXVariantSLCommentAccess().getExpressionAssignment_1()); 
            // InternalXMachine.g:2121:2: ( rule__XVariantSLComment__ExpressionAssignment_1 )
            // InternalXMachine.g:2121:3: rule__XVariantSLComment__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariantSLComment__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariantSLCommentAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantSLComment__Group__1__Impl"


    // $ANTLR start "rule__XVariantSLComment__Group__2"
    // InternalXMachine.g:2129:1: rule__XVariantSLComment__Group__2 : rule__XVariantSLComment__Group__2__Impl ;
    public final void rule__XVariantSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2133:1: ( rule__XVariantSLComment__Group__2__Impl )
            // InternalXMachine.g:2134:2: rule__XVariantSLComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariantSLComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantSLComment__Group__2"


    // $ANTLR start "rule__XVariantSLComment__Group__2__Impl"
    // InternalXMachine.g:2140:1: rule__XVariantSLComment__Group__2__Impl : ( ( rule__XVariantSLComment__CommentAssignment_2 ) ) ;
    public final void rule__XVariantSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2144:1: ( ( ( rule__XVariantSLComment__CommentAssignment_2 ) ) )
            // InternalXMachine.g:2145:1: ( ( rule__XVariantSLComment__CommentAssignment_2 ) )
            {
            // InternalXMachine.g:2145:1: ( ( rule__XVariantSLComment__CommentAssignment_2 ) )
            // InternalXMachine.g:2146:2: ( rule__XVariantSLComment__CommentAssignment_2 )
            {
             before(grammarAccess.getXVariantSLCommentAccess().getCommentAssignment_2()); 
            // InternalXMachine.g:2147:2: ( rule__XVariantSLComment__CommentAssignment_2 )
            // InternalXMachine.g:2147:3: rule__XVariantSLComment__CommentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XVariantSLComment__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXVariantSLCommentAccess().getCommentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantSLComment__Group__2__Impl"


    // $ANTLR start "rule__XParameterNoComment__Group__0"
    // InternalXMachine.g:2156:1: rule__XParameterNoComment__Group__0 : rule__XParameterNoComment__Group__0__Impl rule__XParameterNoComment__Group__1 ;
    public final void rule__XParameterNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2160:1: ( rule__XParameterNoComment__Group__0__Impl rule__XParameterNoComment__Group__1 )
            // InternalXMachine.g:2161:2: rule__XParameterNoComment__Group__0__Impl rule__XParameterNoComment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XParameterNoComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XParameterNoComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterNoComment__Group__0"


    // $ANTLR start "rule__XParameterNoComment__Group__0__Impl"
    // InternalXMachine.g:2168:1: rule__XParameterNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XParameterNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2172:1: ( ( () ) )
            // InternalXMachine.g:2173:1: ( () )
            {
            // InternalXMachine.g:2173:1: ( () )
            // InternalXMachine.g:2174:2: ()
            {
             before(grammarAccess.getXParameterNoCommentAccess().getParameterAction_0()); 
            // InternalXMachine.g:2175:2: ()
            // InternalXMachine.g:2175:3: 
            {
            }

             after(grammarAccess.getXParameterNoCommentAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterNoComment__Group__0__Impl"


    // $ANTLR start "rule__XParameterNoComment__Group__1"
    // InternalXMachine.g:2183:1: rule__XParameterNoComment__Group__1 : rule__XParameterNoComment__Group__1__Impl ;
    public final void rule__XParameterNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2187:1: ( rule__XParameterNoComment__Group__1__Impl )
            // InternalXMachine.g:2188:2: rule__XParameterNoComment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XParameterNoComment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterNoComment__Group__1"


    // $ANTLR start "rule__XParameterNoComment__Group__1__Impl"
    // InternalXMachine.g:2194:1: rule__XParameterNoComment__Group__1__Impl : ( ( rule__XParameterNoComment__NameAssignment_1 ) ) ;
    public final void rule__XParameterNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2198:1: ( ( ( rule__XParameterNoComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:2199:1: ( ( rule__XParameterNoComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2199:1: ( ( rule__XParameterNoComment__NameAssignment_1 ) )
            // InternalXMachine.g:2200:2: ( rule__XParameterNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXParameterNoCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2201:2: ( rule__XParameterNoComment__NameAssignment_1 )
            // InternalXMachine.g:2201:3: rule__XParameterNoComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XParameterNoComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXParameterNoCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterNoComment__Group__1__Impl"


    // $ANTLR start "rule__XParameterMLComment__Group__0"
    // InternalXMachine.g:2210:1: rule__XParameterMLComment__Group__0 : rule__XParameterMLComment__Group__0__Impl rule__XParameterMLComment__Group__1 ;
    public final void rule__XParameterMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2214:1: ( rule__XParameterMLComment__Group__0__Impl rule__XParameterMLComment__Group__1 )
            // InternalXMachine.g:2215:2: rule__XParameterMLComment__Group__0__Impl rule__XParameterMLComment__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__XParameterMLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XParameterMLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterMLComment__Group__0"


    // $ANTLR start "rule__XParameterMLComment__Group__0__Impl"
    // InternalXMachine.g:2222:1: rule__XParameterMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XParameterMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2226:1: ( ( () ) )
            // InternalXMachine.g:2227:1: ( () )
            {
            // InternalXMachine.g:2227:1: ( () )
            // InternalXMachine.g:2228:2: ()
            {
             before(grammarAccess.getXParameterMLCommentAccess().getParameterAction_0()); 
            // InternalXMachine.g:2229:2: ()
            // InternalXMachine.g:2229:3: 
            {
            }

             after(grammarAccess.getXParameterMLCommentAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterMLComment__Group__0__Impl"


    // $ANTLR start "rule__XParameterMLComment__Group__1"
    // InternalXMachine.g:2237:1: rule__XParameterMLComment__Group__1 : rule__XParameterMLComment__Group__1__Impl rule__XParameterMLComment__Group__2 ;
    public final void rule__XParameterMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2241:1: ( rule__XParameterMLComment__Group__1__Impl rule__XParameterMLComment__Group__2 )
            // InternalXMachine.g:2242:2: rule__XParameterMLComment__Group__1__Impl rule__XParameterMLComment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__XParameterMLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XParameterMLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterMLComment__Group__1"


    // $ANTLR start "rule__XParameterMLComment__Group__1__Impl"
    // InternalXMachine.g:2249:1: rule__XParameterMLComment__Group__1__Impl : ( ( rule__XParameterMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XParameterMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2253:1: ( ( ( rule__XParameterMLComment__CommentAssignment_1 ) ) )
            // InternalXMachine.g:2254:1: ( ( rule__XParameterMLComment__CommentAssignment_1 ) )
            {
            // InternalXMachine.g:2254:1: ( ( rule__XParameterMLComment__CommentAssignment_1 ) )
            // InternalXMachine.g:2255:2: ( rule__XParameterMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXParameterMLCommentAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2256:2: ( rule__XParameterMLComment__CommentAssignment_1 )
            // InternalXMachine.g:2256:3: rule__XParameterMLComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XParameterMLComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXParameterMLCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterMLComment__Group__1__Impl"


    // $ANTLR start "rule__XParameterMLComment__Group__2"
    // InternalXMachine.g:2264:1: rule__XParameterMLComment__Group__2 : rule__XParameterMLComment__Group__2__Impl ;
    public final void rule__XParameterMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2268:1: ( rule__XParameterMLComment__Group__2__Impl )
            // InternalXMachine.g:2269:2: rule__XParameterMLComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XParameterMLComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterMLComment__Group__2"


    // $ANTLR start "rule__XParameterMLComment__Group__2__Impl"
    // InternalXMachine.g:2275:1: rule__XParameterMLComment__Group__2__Impl : ( ( rule__XParameterMLComment__NameAssignment_2 ) ) ;
    public final void rule__XParameterMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2279:1: ( ( ( rule__XParameterMLComment__NameAssignment_2 ) ) )
            // InternalXMachine.g:2280:1: ( ( rule__XParameterMLComment__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2280:1: ( ( rule__XParameterMLComment__NameAssignment_2 ) )
            // InternalXMachine.g:2281:2: ( rule__XParameterMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXParameterMLCommentAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2282:2: ( rule__XParameterMLComment__NameAssignment_2 )
            // InternalXMachine.g:2282:3: rule__XParameterMLComment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XParameterMLComment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXParameterMLCommentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterMLComment__Group__2__Impl"


    // $ANTLR start "rule__XParameterSLComment__Group__0"
    // InternalXMachine.g:2291:1: rule__XParameterSLComment__Group__0 : rule__XParameterSLComment__Group__0__Impl rule__XParameterSLComment__Group__1 ;
    public final void rule__XParameterSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2295:1: ( rule__XParameterSLComment__Group__0__Impl rule__XParameterSLComment__Group__1 )
            // InternalXMachine.g:2296:2: rule__XParameterSLComment__Group__0__Impl rule__XParameterSLComment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XParameterSLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XParameterSLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterSLComment__Group__0"


    // $ANTLR start "rule__XParameterSLComment__Group__0__Impl"
    // InternalXMachine.g:2303:1: rule__XParameterSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XParameterSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2307:1: ( ( () ) )
            // InternalXMachine.g:2308:1: ( () )
            {
            // InternalXMachine.g:2308:1: ( () )
            // InternalXMachine.g:2309:2: ()
            {
             before(grammarAccess.getXParameterSLCommentAccess().getParameterAction_0()); 
            // InternalXMachine.g:2310:2: ()
            // InternalXMachine.g:2310:3: 
            {
            }

             after(grammarAccess.getXParameterSLCommentAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterSLComment__Group__0__Impl"


    // $ANTLR start "rule__XParameterSLComment__Group__1"
    // InternalXMachine.g:2318:1: rule__XParameterSLComment__Group__1 : rule__XParameterSLComment__Group__1__Impl rule__XParameterSLComment__Group__2 ;
    public final void rule__XParameterSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2322:1: ( rule__XParameterSLComment__Group__1__Impl rule__XParameterSLComment__Group__2 )
            // InternalXMachine.g:2323:2: rule__XParameterSLComment__Group__1__Impl rule__XParameterSLComment__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__XParameterSLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XParameterSLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterSLComment__Group__1"


    // $ANTLR start "rule__XParameterSLComment__Group__1__Impl"
    // InternalXMachine.g:2330:1: rule__XParameterSLComment__Group__1__Impl : ( ( rule__XParameterSLComment__NameAssignment_1 ) ) ;
    public final void rule__XParameterSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2334:1: ( ( ( rule__XParameterSLComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:2335:1: ( ( rule__XParameterSLComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2335:1: ( ( rule__XParameterSLComment__NameAssignment_1 ) )
            // InternalXMachine.g:2336:2: ( rule__XParameterSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXParameterSLCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2337:2: ( rule__XParameterSLComment__NameAssignment_1 )
            // InternalXMachine.g:2337:3: rule__XParameterSLComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XParameterSLComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXParameterSLCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterSLComment__Group__1__Impl"


    // $ANTLR start "rule__XParameterSLComment__Group__2"
    // InternalXMachine.g:2345:1: rule__XParameterSLComment__Group__2 : rule__XParameterSLComment__Group__2__Impl ;
    public final void rule__XParameterSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2349:1: ( rule__XParameterSLComment__Group__2__Impl )
            // InternalXMachine.g:2350:2: rule__XParameterSLComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XParameterSLComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterSLComment__Group__2"


    // $ANTLR start "rule__XParameterSLComment__Group__2__Impl"
    // InternalXMachine.g:2356:1: rule__XParameterSLComment__Group__2__Impl : ( ( rule__XParameterSLComment__CommentAssignment_2 ) ) ;
    public final void rule__XParameterSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2360:1: ( ( ( rule__XParameterSLComment__CommentAssignment_2 ) ) )
            // InternalXMachine.g:2361:1: ( ( rule__XParameterSLComment__CommentAssignment_2 ) )
            {
            // InternalXMachine.g:2361:1: ( ( rule__XParameterSLComment__CommentAssignment_2 ) )
            // InternalXMachine.g:2362:2: ( rule__XParameterSLComment__CommentAssignment_2 )
            {
             before(grammarAccess.getXParameterSLCommentAccess().getCommentAssignment_2()); 
            // InternalXMachine.g:2363:2: ( rule__XParameterSLComment__CommentAssignment_2 )
            // InternalXMachine.g:2363:3: rule__XParameterSLComment__CommentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XParameterSLComment__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXParameterSLCommentAccess().getCommentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterSLComment__Group__2__Impl"


    // $ANTLR start "rule__XGuardNoComment__Group__0"
    // InternalXMachine.g:2372:1: rule__XGuardNoComment__Group__0 : rule__XGuardNoComment__Group__0__Impl rule__XGuardNoComment__Group__1 ;
    public final void rule__XGuardNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2376:1: ( rule__XGuardNoComment__Group__0__Impl rule__XGuardNoComment__Group__1 )
            // InternalXMachine.g:2377:2: rule__XGuardNoComment__Group__0__Impl rule__XGuardNoComment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XGuardNoComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardNoComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__Group__0"


    // $ANTLR start "rule__XGuardNoComment__Group__0__Impl"
    // InternalXMachine.g:2384:1: rule__XGuardNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XGuardNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2388:1: ( ( () ) )
            // InternalXMachine.g:2389:1: ( () )
            {
            // InternalXMachine.g:2389:1: ( () )
            // InternalXMachine.g:2390:2: ()
            {
             before(grammarAccess.getXGuardNoCommentAccess().getGuardAction_0()); 
            // InternalXMachine.g:2391:2: ()
            // InternalXMachine.g:2391:3: 
            {
            }

             after(grammarAccess.getXGuardNoCommentAccess().getGuardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__Group__0__Impl"


    // $ANTLR start "rule__XGuardNoComment__Group__1"
    // InternalXMachine.g:2399:1: rule__XGuardNoComment__Group__1 : rule__XGuardNoComment__Group__1__Impl rule__XGuardNoComment__Group__2 ;
    public final void rule__XGuardNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2403:1: ( rule__XGuardNoComment__Group__1__Impl rule__XGuardNoComment__Group__2 )
            // InternalXMachine.g:2404:2: rule__XGuardNoComment__Group__1__Impl rule__XGuardNoComment__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XGuardNoComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardNoComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__Group__1"


    // $ANTLR start "rule__XGuardNoComment__Group__1__Impl"
    // InternalXMachine.g:2411:1: rule__XGuardNoComment__Group__1__Impl : ( ( rule__XGuardNoComment__NameAssignment_1 ) ) ;
    public final void rule__XGuardNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2415:1: ( ( ( rule__XGuardNoComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:2416:1: ( ( rule__XGuardNoComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2416:1: ( ( rule__XGuardNoComment__NameAssignment_1 ) )
            // InternalXMachine.g:2417:2: ( rule__XGuardNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXGuardNoCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2418:2: ( rule__XGuardNoComment__NameAssignment_1 )
            // InternalXMachine.g:2418:3: rule__XGuardNoComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XGuardNoComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXGuardNoCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__Group__1__Impl"


    // $ANTLR start "rule__XGuardNoComment__Group__2"
    // InternalXMachine.g:2426:1: rule__XGuardNoComment__Group__2 : rule__XGuardNoComment__Group__2__Impl rule__XGuardNoComment__Group__3 ;
    public final void rule__XGuardNoComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2430:1: ( rule__XGuardNoComment__Group__2__Impl rule__XGuardNoComment__Group__3 )
            // InternalXMachine.g:2431:2: rule__XGuardNoComment__Group__2__Impl rule__XGuardNoComment__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__XGuardNoComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardNoComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__Group__2"


    // $ANTLR start "rule__XGuardNoComment__Group__2__Impl"
    // InternalXMachine.g:2438:1: rule__XGuardNoComment__Group__2__Impl : ( ( rule__XGuardNoComment__PredicateAssignment_2 ) ) ;
    public final void rule__XGuardNoComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2442:1: ( ( ( rule__XGuardNoComment__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:2443:1: ( ( rule__XGuardNoComment__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:2443:1: ( ( rule__XGuardNoComment__PredicateAssignment_2 ) )
            // InternalXMachine.g:2444:2: ( rule__XGuardNoComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXGuardNoCommentAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:2445:2: ( rule__XGuardNoComment__PredicateAssignment_2 )
            // InternalXMachine.g:2445:3: rule__XGuardNoComment__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGuardNoComment__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXGuardNoCommentAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__Group__2__Impl"


    // $ANTLR start "rule__XGuardNoComment__Group__3"
    // InternalXMachine.g:2453:1: rule__XGuardNoComment__Group__3 : rule__XGuardNoComment__Group__3__Impl ;
    public final void rule__XGuardNoComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2457:1: ( rule__XGuardNoComment__Group__3__Impl )
            // InternalXMachine.g:2458:2: rule__XGuardNoComment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuardNoComment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__Group__3"


    // $ANTLR start "rule__XGuardNoComment__Group__3__Impl"
    // InternalXMachine.g:2464:1: rule__XGuardNoComment__Group__3__Impl : ( ( rule__XGuardNoComment__TheoremAssignment_3 )? ) ;
    public final void rule__XGuardNoComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2468:1: ( ( ( rule__XGuardNoComment__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:2469:1: ( ( rule__XGuardNoComment__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:2469:1: ( ( rule__XGuardNoComment__TheoremAssignment_3 )? )
            // InternalXMachine.g:2470:2: ( rule__XGuardNoComment__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXGuardNoCommentAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:2471:2: ( rule__XGuardNoComment__TheoremAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:2471:3: rule__XGuardNoComment__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuardNoComment__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGuardNoCommentAccess().getTheoremAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__Group__3__Impl"


    // $ANTLR start "rule__XGuardMLComment__Group__0"
    // InternalXMachine.g:2480:1: rule__XGuardMLComment__Group__0 : rule__XGuardMLComment__Group__0__Impl rule__XGuardMLComment__Group__1 ;
    public final void rule__XGuardMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2484:1: ( rule__XGuardMLComment__Group__0__Impl rule__XGuardMLComment__Group__1 )
            // InternalXMachine.g:2485:2: rule__XGuardMLComment__Group__0__Impl rule__XGuardMLComment__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__XGuardMLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardMLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__Group__0"


    // $ANTLR start "rule__XGuardMLComment__Group__0__Impl"
    // InternalXMachine.g:2492:1: rule__XGuardMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XGuardMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2496:1: ( ( () ) )
            // InternalXMachine.g:2497:1: ( () )
            {
            // InternalXMachine.g:2497:1: ( () )
            // InternalXMachine.g:2498:2: ()
            {
             before(grammarAccess.getXGuardMLCommentAccess().getGuardAction_0()); 
            // InternalXMachine.g:2499:2: ()
            // InternalXMachine.g:2499:3: 
            {
            }

             after(grammarAccess.getXGuardMLCommentAccess().getGuardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__Group__0__Impl"


    // $ANTLR start "rule__XGuardMLComment__Group__1"
    // InternalXMachine.g:2507:1: rule__XGuardMLComment__Group__1 : rule__XGuardMLComment__Group__1__Impl rule__XGuardMLComment__Group__2 ;
    public final void rule__XGuardMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2511:1: ( rule__XGuardMLComment__Group__1__Impl rule__XGuardMLComment__Group__2 )
            // InternalXMachine.g:2512:2: rule__XGuardMLComment__Group__1__Impl rule__XGuardMLComment__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__XGuardMLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardMLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__Group__1"


    // $ANTLR start "rule__XGuardMLComment__Group__1__Impl"
    // InternalXMachine.g:2519:1: rule__XGuardMLComment__Group__1__Impl : ( ( rule__XGuardMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XGuardMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2523:1: ( ( ( rule__XGuardMLComment__CommentAssignment_1 ) ) )
            // InternalXMachine.g:2524:1: ( ( rule__XGuardMLComment__CommentAssignment_1 ) )
            {
            // InternalXMachine.g:2524:1: ( ( rule__XGuardMLComment__CommentAssignment_1 ) )
            // InternalXMachine.g:2525:2: ( rule__XGuardMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXGuardMLCommentAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2526:2: ( rule__XGuardMLComment__CommentAssignment_1 )
            // InternalXMachine.g:2526:3: rule__XGuardMLComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XGuardMLComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXGuardMLCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__Group__1__Impl"


    // $ANTLR start "rule__XGuardMLComment__Group__2"
    // InternalXMachine.g:2534:1: rule__XGuardMLComment__Group__2 : rule__XGuardMLComment__Group__2__Impl rule__XGuardMLComment__Group__3 ;
    public final void rule__XGuardMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2538:1: ( rule__XGuardMLComment__Group__2__Impl rule__XGuardMLComment__Group__3 )
            // InternalXMachine.g:2539:2: rule__XGuardMLComment__Group__2__Impl rule__XGuardMLComment__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__XGuardMLComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardMLComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__Group__2"


    // $ANTLR start "rule__XGuardMLComment__Group__2__Impl"
    // InternalXMachine.g:2546:1: rule__XGuardMLComment__Group__2__Impl : ( ( rule__XGuardMLComment__NameAssignment_2 ) ) ;
    public final void rule__XGuardMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2550:1: ( ( ( rule__XGuardMLComment__NameAssignment_2 ) ) )
            // InternalXMachine.g:2551:1: ( ( rule__XGuardMLComment__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2551:1: ( ( rule__XGuardMLComment__NameAssignment_2 ) )
            // InternalXMachine.g:2552:2: ( rule__XGuardMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXGuardMLCommentAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2553:2: ( rule__XGuardMLComment__NameAssignment_2 )
            // InternalXMachine.g:2553:3: rule__XGuardMLComment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGuardMLComment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXGuardMLCommentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__Group__2__Impl"


    // $ANTLR start "rule__XGuardMLComment__Group__3"
    // InternalXMachine.g:2561:1: rule__XGuardMLComment__Group__3 : rule__XGuardMLComment__Group__3__Impl rule__XGuardMLComment__Group__4 ;
    public final void rule__XGuardMLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2565:1: ( rule__XGuardMLComment__Group__3__Impl rule__XGuardMLComment__Group__4 )
            // InternalXMachine.g:2566:2: rule__XGuardMLComment__Group__3__Impl rule__XGuardMLComment__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__XGuardMLComment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardMLComment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__Group__3"


    // $ANTLR start "rule__XGuardMLComment__Group__3__Impl"
    // InternalXMachine.g:2573:1: rule__XGuardMLComment__Group__3__Impl : ( ( rule__XGuardMLComment__PredicateAssignment_3 ) ) ;
    public final void rule__XGuardMLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2577:1: ( ( ( rule__XGuardMLComment__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:2578:1: ( ( rule__XGuardMLComment__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:2578:1: ( ( rule__XGuardMLComment__PredicateAssignment_3 ) )
            // InternalXMachine.g:2579:2: ( rule__XGuardMLComment__PredicateAssignment_3 )
            {
             before(grammarAccess.getXGuardMLCommentAccess().getPredicateAssignment_3()); 
            // InternalXMachine.g:2580:2: ( rule__XGuardMLComment__PredicateAssignment_3 )
            // InternalXMachine.g:2580:3: rule__XGuardMLComment__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XGuardMLComment__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXGuardMLCommentAccess().getPredicateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__Group__3__Impl"


    // $ANTLR start "rule__XGuardMLComment__Group__4"
    // InternalXMachine.g:2588:1: rule__XGuardMLComment__Group__4 : rule__XGuardMLComment__Group__4__Impl ;
    public final void rule__XGuardMLComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2592:1: ( rule__XGuardMLComment__Group__4__Impl )
            // InternalXMachine.g:2593:2: rule__XGuardMLComment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuardMLComment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__Group__4"


    // $ANTLR start "rule__XGuardMLComment__Group__4__Impl"
    // InternalXMachine.g:2599:1: rule__XGuardMLComment__Group__4__Impl : ( ( rule__XGuardMLComment__TheoremAssignment_4 )? ) ;
    public final void rule__XGuardMLComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2603:1: ( ( ( rule__XGuardMLComment__TheoremAssignment_4 )? ) )
            // InternalXMachine.g:2604:1: ( ( rule__XGuardMLComment__TheoremAssignment_4 )? )
            {
            // InternalXMachine.g:2604:1: ( ( rule__XGuardMLComment__TheoremAssignment_4 )? )
            // InternalXMachine.g:2605:2: ( rule__XGuardMLComment__TheoremAssignment_4 )?
            {
             before(grammarAccess.getXGuardMLCommentAccess().getTheoremAssignment_4()); 
            // InternalXMachine.g:2606:2: ( rule__XGuardMLComment__TheoremAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:2606:3: rule__XGuardMLComment__TheoremAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuardMLComment__TheoremAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGuardMLCommentAccess().getTheoremAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__Group__4__Impl"


    // $ANTLR start "rule__XGuardSLComment__Group__0"
    // InternalXMachine.g:2615:1: rule__XGuardSLComment__Group__0 : rule__XGuardSLComment__Group__0__Impl rule__XGuardSLComment__Group__1 ;
    public final void rule__XGuardSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2619:1: ( rule__XGuardSLComment__Group__0__Impl rule__XGuardSLComment__Group__1 )
            // InternalXMachine.g:2620:2: rule__XGuardSLComment__Group__0__Impl rule__XGuardSLComment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XGuardSLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardSLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__Group__0"


    // $ANTLR start "rule__XGuardSLComment__Group__0__Impl"
    // InternalXMachine.g:2627:1: rule__XGuardSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XGuardSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2631:1: ( ( () ) )
            // InternalXMachine.g:2632:1: ( () )
            {
            // InternalXMachine.g:2632:1: ( () )
            // InternalXMachine.g:2633:2: ()
            {
             before(grammarAccess.getXGuardSLCommentAccess().getGuardAction_0()); 
            // InternalXMachine.g:2634:2: ()
            // InternalXMachine.g:2634:3: 
            {
            }

             after(grammarAccess.getXGuardSLCommentAccess().getGuardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__Group__0__Impl"


    // $ANTLR start "rule__XGuardSLComment__Group__1"
    // InternalXMachine.g:2642:1: rule__XGuardSLComment__Group__1 : rule__XGuardSLComment__Group__1__Impl rule__XGuardSLComment__Group__2 ;
    public final void rule__XGuardSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2646:1: ( rule__XGuardSLComment__Group__1__Impl rule__XGuardSLComment__Group__2 )
            // InternalXMachine.g:2647:2: rule__XGuardSLComment__Group__1__Impl rule__XGuardSLComment__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XGuardSLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardSLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__Group__1"


    // $ANTLR start "rule__XGuardSLComment__Group__1__Impl"
    // InternalXMachine.g:2654:1: rule__XGuardSLComment__Group__1__Impl : ( ( rule__XGuardSLComment__NameAssignment_1 ) ) ;
    public final void rule__XGuardSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2658:1: ( ( ( rule__XGuardSLComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:2659:1: ( ( rule__XGuardSLComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2659:1: ( ( rule__XGuardSLComment__NameAssignment_1 ) )
            // InternalXMachine.g:2660:2: ( rule__XGuardSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXGuardSLCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2661:2: ( rule__XGuardSLComment__NameAssignment_1 )
            // InternalXMachine.g:2661:3: rule__XGuardSLComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XGuardSLComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXGuardSLCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__Group__1__Impl"


    // $ANTLR start "rule__XGuardSLComment__Group__2"
    // InternalXMachine.g:2669:1: rule__XGuardSLComment__Group__2 : rule__XGuardSLComment__Group__2__Impl rule__XGuardSLComment__Group__3 ;
    public final void rule__XGuardSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2673:1: ( rule__XGuardSLComment__Group__2__Impl rule__XGuardSLComment__Group__3 )
            // InternalXMachine.g:2674:2: rule__XGuardSLComment__Group__2__Impl rule__XGuardSLComment__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__XGuardSLComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardSLComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__Group__2"


    // $ANTLR start "rule__XGuardSLComment__Group__2__Impl"
    // InternalXMachine.g:2681:1: rule__XGuardSLComment__Group__2__Impl : ( ( rule__XGuardSLComment__PredicateAssignment_2 ) ) ;
    public final void rule__XGuardSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2685:1: ( ( ( rule__XGuardSLComment__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:2686:1: ( ( rule__XGuardSLComment__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:2686:1: ( ( rule__XGuardSLComment__PredicateAssignment_2 ) )
            // InternalXMachine.g:2687:2: ( rule__XGuardSLComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXGuardSLCommentAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:2688:2: ( rule__XGuardSLComment__PredicateAssignment_2 )
            // InternalXMachine.g:2688:3: rule__XGuardSLComment__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGuardSLComment__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXGuardSLCommentAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__Group__2__Impl"


    // $ANTLR start "rule__XGuardSLComment__Group__3"
    // InternalXMachine.g:2696:1: rule__XGuardSLComment__Group__3 : rule__XGuardSLComment__Group__3__Impl rule__XGuardSLComment__Group__4 ;
    public final void rule__XGuardSLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2700:1: ( rule__XGuardSLComment__Group__3__Impl rule__XGuardSLComment__Group__4 )
            // InternalXMachine.g:2701:2: rule__XGuardSLComment__Group__3__Impl rule__XGuardSLComment__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__XGuardSLComment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuardSLComment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__Group__3"


    // $ANTLR start "rule__XGuardSLComment__Group__3__Impl"
    // InternalXMachine.g:2708:1: rule__XGuardSLComment__Group__3__Impl : ( ( rule__XGuardSLComment__TheoremAssignment_3 )? ) ;
    public final void rule__XGuardSLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2712:1: ( ( ( rule__XGuardSLComment__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:2713:1: ( ( rule__XGuardSLComment__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:2713:1: ( ( rule__XGuardSLComment__TheoremAssignment_3 )? )
            // InternalXMachine.g:2714:2: ( rule__XGuardSLComment__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXGuardSLCommentAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:2715:2: ( rule__XGuardSLComment__TheoremAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:2715:3: rule__XGuardSLComment__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuardSLComment__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGuardSLCommentAccess().getTheoremAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__Group__3__Impl"


    // $ANTLR start "rule__XGuardSLComment__Group__4"
    // InternalXMachine.g:2723:1: rule__XGuardSLComment__Group__4 : rule__XGuardSLComment__Group__4__Impl ;
    public final void rule__XGuardSLComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2727:1: ( rule__XGuardSLComment__Group__4__Impl )
            // InternalXMachine.g:2728:2: rule__XGuardSLComment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuardSLComment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__Group__4"


    // $ANTLR start "rule__XGuardSLComment__Group__4__Impl"
    // InternalXMachine.g:2734:1: rule__XGuardSLComment__Group__4__Impl : ( ( rule__XGuardSLComment__CommentAssignment_4 ) ) ;
    public final void rule__XGuardSLComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2738:1: ( ( ( rule__XGuardSLComment__CommentAssignment_4 ) ) )
            // InternalXMachine.g:2739:1: ( ( rule__XGuardSLComment__CommentAssignment_4 ) )
            {
            // InternalXMachine.g:2739:1: ( ( rule__XGuardSLComment__CommentAssignment_4 ) )
            // InternalXMachine.g:2740:2: ( rule__XGuardSLComment__CommentAssignment_4 )
            {
             before(grammarAccess.getXGuardSLCommentAccess().getCommentAssignment_4()); 
            // InternalXMachine.g:2741:2: ( rule__XGuardSLComment__CommentAssignment_4 )
            // InternalXMachine.g:2741:3: rule__XGuardSLComment__CommentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XGuardSLComment__CommentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXGuardSLCommentAccess().getCommentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__Group__4__Impl"


    // $ANTLR start "rule__XWitnessNoComment__Group__0"
    // InternalXMachine.g:2750:1: rule__XWitnessNoComment__Group__0 : rule__XWitnessNoComment__Group__0__Impl rule__XWitnessNoComment__Group__1 ;
    public final void rule__XWitnessNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2754:1: ( rule__XWitnessNoComment__Group__0__Impl rule__XWitnessNoComment__Group__1 )
            // InternalXMachine.g:2755:2: rule__XWitnessNoComment__Group__0__Impl rule__XWitnessNoComment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XWitnessNoComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitnessNoComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessNoComment__Group__0"


    // $ANTLR start "rule__XWitnessNoComment__Group__0__Impl"
    // InternalXMachine.g:2762:1: rule__XWitnessNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XWitnessNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2766:1: ( ( () ) )
            // InternalXMachine.g:2767:1: ( () )
            {
            // InternalXMachine.g:2767:1: ( () )
            // InternalXMachine.g:2768:2: ()
            {
             before(grammarAccess.getXWitnessNoCommentAccess().getWitnessAction_0()); 
            // InternalXMachine.g:2769:2: ()
            // InternalXMachine.g:2769:3: 
            {
            }

             after(grammarAccess.getXWitnessNoCommentAccess().getWitnessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessNoComment__Group__0__Impl"


    // $ANTLR start "rule__XWitnessNoComment__Group__1"
    // InternalXMachine.g:2777:1: rule__XWitnessNoComment__Group__1 : rule__XWitnessNoComment__Group__1__Impl rule__XWitnessNoComment__Group__2 ;
    public final void rule__XWitnessNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2781:1: ( rule__XWitnessNoComment__Group__1__Impl rule__XWitnessNoComment__Group__2 )
            // InternalXMachine.g:2782:2: rule__XWitnessNoComment__Group__1__Impl rule__XWitnessNoComment__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XWitnessNoComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitnessNoComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessNoComment__Group__1"


    // $ANTLR start "rule__XWitnessNoComment__Group__1__Impl"
    // InternalXMachine.g:2789:1: rule__XWitnessNoComment__Group__1__Impl : ( ( rule__XWitnessNoComment__NameAssignment_1 ) ) ;
    public final void rule__XWitnessNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2793:1: ( ( ( rule__XWitnessNoComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:2794:1: ( ( rule__XWitnessNoComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2794:1: ( ( rule__XWitnessNoComment__NameAssignment_1 ) )
            // InternalXMachine.g:2795:2: ( rule__XWitnessNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXWitnessNoCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2796:2: ( rule__XWitnessNoComment__NameAssignment_1 )
            // InternalXMachine.g:2796:3: rule__XWitnessNoComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessNoComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessNoCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessNoComment__Group__1__Impl"


    // $ANTLR start "rule__XWitnessNoComment__Group__2"
    // InternalXMachine.g:2804:1: rule__XWitnessNoComment__Group__2 : rule__XWitnessNoComment__Group__2__Impl ;
    public final void rule__XWitnessNoComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2808:1: ( rule__XWitnessNoComment__Group__2__Impl )
            // InternalXMachine.g:2809:2: rule__XWitnessNoComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessNoComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessNoComment__Group__2"


    // $ANTLR start "rule__XWitnessNoComment__Group__2__Impl"
    // InternalXMachine.g:2815:1: rule__XWitnessNoComment__Group__2__Impl : ( ( rule__XWitnessNoComment__PredicateAssignment_2 ) ) ;
    public final void rule__XWitnessNoComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2819:1: ( ( ( rule__XWitnessNoComment__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:2820:1: ( ( rule__XWitnessNoComment__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:2820:1: ( ( rule__XWitnessNoComment__PredicateAssignment_2 ) )
            // InternalXMachine.g:2821:2: ( rule__XWitnessNoComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXWitnessNoCommentAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:2822:2: ( rule__XWitnessNoComment__PredicateAssignment_2 )
            // InternalXMachine.g:2822:3: rule__XWitnessNoComment__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessNoComment__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessNoCommentAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessNoComment__Group__2__Impl"


    // $ANTLR start "rule__XWitnessMLComment__Group__0"
    // InternalXMachine.g:2831:1: rule__XWitnessMLComment__Group__0 : rule__XWitnessMLComment__Group__0__Impl rule__XWitnessMLComment__Group__1 ;
    public final void rule__XWitnessMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2835:1: ( rule__XWitnessMLComment__Group__0__Impl rule__XWitnessMLComment__Group__1 )
            // InternalXMachine.g:2836:2: rule__XWitnessMLComment__Group__0__Impl rule__XWitnessMLComment__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__XWitnessMLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitnessMLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__Group__0"


    // $ANTLR start "rule__XWitnessMLComment__Group__0__Impl"
    // InternalXMachine.g:2843:1: rule__XWitnessMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XWitnessMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2847:1: ( ( () ) )
            // InternalXMachine.g:2848:1: ( () )
            {
            // InternalXMachine.g:2848:1: ( () )
            // InternalXMachine.g:2849:2: ()
            {
             before(grammarAccess.getXWitnessMLCommentAccess().getWitnessAction_0()); 
            // InternalXMachine.g:2850:2: ()
            // InternalXMachine.g:2850:3: 
            {
            }

             after(grammarAccess.getXWitnessMLCommentAccess().getWitnessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__Group__0__Impl"


    // $ANTLR start "rule__XWitnessMLComment__Group__1"
    // InternalXMachine.g:2858:1: rule__XWitnessMLComment__Group__1 : rule__XWitnessMLComment__Group__1__Impl rule__XWitnessMLComment__Group__2 ;
    public final void rule__XWitnessMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2862:1: ( rule__XWitnessMLComment__Group__1__Impl rule__XWitnessMLComment__Group__2 )
            // InternalXMachine.g:2863:2: rule__XWitnessMLComment__Group__1__Impl rule__XWitnessMLComment__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__XWitnessMLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitnessMLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__Group__1"


    // $ANTLR start "rule__XWitnessMLComment__Group__1__Impl"
    // InternalXMachine.g:2870:1: rule__XWitnessMLComment__Group__1__Impl : ( ( rule__XWitnessMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XWitnessMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2874:1: ( ( ( rule__XWitnessMLComment__CommentAssignment_1 ) ) )
            // InternalXMachine.g:2875:1: ( ( rule__XWitnessMLComment__CommentAssignment_1 ) )
            {
            // InternalXMachine.g:2875:1: ( ( rule__XWitnessMLComment__CommentAssignment_1 ) )
            // InternalXMachine.g:2876:2: ( rule__XWitnessMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXWitnessMLCommentAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:2877:2: ( rule__XWitnessMLComment__CommentAssignment_1 )
            // InternalXMachine.g:2877:3: rule__XWitnessMLComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessMLComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessMLCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__Group__1__Impl"


    // $ANTLR start "rule__XWitnessMLComment__Group__2"
    // InternalXMachine.g:2885:1: rule__XWitnessMLComment__Group__2 : rule__XWitnessMLComment__Group__2__Impl rule__XWitnessMLComment__Group__3 ;
    public final void rule__XWitnessMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2889:1: ( rule__XWitnessMLComment__Group__2__Impl rule__XWitnessMLComment__Group__3 )
            // InternalXMachine.g:2890:2: rule__XWitnessMLComment__Group__2__Impl rule__XWitnessMLComment__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__XWitnessMLComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitnessMLComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__Group__2"


    // $ANTLR start "rule__XWitnessMLComment__Group__2__Impl"
    // InternalXMachine.g:2897:1: rule__XWitnessMLComment__Group__2__Impl : ( ( rule__XWitnessMLComment__NameAssignment_2 ) ) ;
    public final void rule__XWitnessMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2901:1: ( ( ( rule__XWitnessMLComment__NameAssignment_2 ) ) )
            // InternalXMachine.g:2902:1: ( ( rule__XWitnessMLComment__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2902:1: ( ( rule__XWitnessMLComment__NameAssignment_2 ) )
            // InternalXMachine.g:2903:2: ( rule__XWitnessMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXWitnessMLCommentAccess().getNameAssignment_2()); 
            // InternalXMachine.g:2904:2: ( rule__XWitnessMLComment__NameAssignment_2 )
            // InternalXMachine.g:2904:3: rule__XWitnessMLComment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessMLComment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessMLCommentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__Group__2__Impl"


    // $ANTLR start "rule__XWitnessMLComment__Group__3"
    // InternalXMachine.g:2912:1: rule__XWitnessMLComment__Group__3 : rule__XWitnessMLComment__Group__3__Impl ;
    public final void rule__XWitnessMLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2916:1: ( rule__XWitnessMLComment__Group__3__Impl )
            // InternalXMachine.g:2917:2: rule__XWitnessMLComment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessMLComment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__Group__3"


    // $ANTLR start "rule__XWitnessMLComment__Group__3__Impl"
    // InternalXMachine.g:2923:1: rule__XWitnessMLComment__Group__3__Impl : ( ( rule__XWitnessMLComment__PredicateAssignment_3 ) ) ;
    public final void rule__XWitnessMLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2927:1: ( ( ( rule__XWitnessMLComment__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:2928:1: ( ( rule__XWitnessMLComment__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:2928:1: ( ( rule__XWitnessMLComment__PredicateAssignment_3 ) )
            // InternalXMachine.g:2929:2: ( rule__XWitnessMLComment__PredicateAssignment_3 )
            {
             before(grammarAccess.getXWitnessMLCommentAccess().getPredicateAssignment_3()); 
            // InternalXMachine.g:2930:2: ( rule__XWitnessMLComment__PredicateAssignment_3 )
            // InternalXMachine.g:2930:3: rule__XWitnessMLComment__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessMLComment__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessMLCommentAccess().getPredicateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__Group__3__Impl"


    // $ANTLR start "rule__XWitnessSLComment__Group__0"
    // InternalXMachine.g:2939:1: rule__XWitnessSLComment__Group__0 : rule__XWitnessSLComment__Group__0__Impl rule__XWitnessSLComment__Group__1 ;
    public final void rule__XWitnessSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2943:1: ( rule__XWitnessSLComment__Group__0__Impl rule__XWitnessSLComment__Group__1 )
            // InternalXMachine.g:2944:2: rule__XWitnessSLComment__Group__0__Impl rule__XWitnessSLComment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XWitnessSLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitnessSLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__Group__0"


    // $ANTLR start "rule__XWitnessSLComment__Group__0__Impl"
    // InternalXMachine.g:2951:1: rule__XWitnessSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XWitnessSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2955:1: ( ( () ) )
            // InternalXMachine.g:2956:1: ( () )
            {
            // InternalXMachine.g:2956:1: ( () )
            // InternalXMachine.g:2957:2: ()
            {
             before(grammarAccess.getXWitnessSLCommentAccess().getWitnessAction_0()); 
            // InternalXMachine.g:2958:2: ()
            // InternalXMachine.g:2958:3: 
            {
            }

             after(grammarAccess.getXWitnessSLCommentAccess().getWitnessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__Group__0__Impl"


    // $ANTLR start "rule__XWitnessSLComment__Group__1"
    // InternalXMachine.g:2966:1: rule__XWitnessSLComment__Group__1 : rule__XWitnessSLComment__Group__1__Impl rule__XWitnessSLComment__Group__2 ;
    public final void rule__XWitnessSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2970:1: ( rule__XWitnessSLComment__Group__1__Impl rule__XWitnessSLComment__Group__2 )
            // InternalXMachine.g:2971:2: rule__XWitnessSLComment__Group__1__Impl rule__XWitnessSLComment__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XWitnessSLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitnessSLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__Group__1"


    // $ANTLR start "rule__XWitnessSLComment__Group__1__Impl"
    // InternalXMachine.g:2978:1: rule__XWitnessSLComment__Group__1__Impl : ( ( rule__XWitnessSLComment__NameAssignment_1 ) ) ;
    public final void rule__XWitnessSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2982:1: ( ( ( rule__XWitnessSLComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:2983:1: ( ( rule__XWitnessSLComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2983:1: ( ( rule__XWitnessSLComment__NameAssignment_1 ) )
            // InternalXMachine.g:2984:2: ( rule__XWitnessSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXWitnessSLCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2985:2: ( rule__XWitnessSLComment__NameAssignment_1 )
            // InternalXMachine.g:2985:3: rule__XWitnessSLComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessSLComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessSLCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__Group__1__Impl"


    // $ANTLR start "rule__XWitnessSLComment__Group__2"
    // InternalXMachine.g:2993:1: rule__XWitnessSLComment__Group__2 : rule__XWitnessSLComment__Group__2__Impl rule__XWitnessSLComment__Group__3 ;
    public final void rule__XWitnessSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2997:1: ( rule__XWitnessSLComment__Group__2__Impl rule__XWitnessSLComment__Group__3 )
            // InternalXMachine.g:2998:2: rule__XWitnessSLComment__Group__2__Impl rule__XWitnessSLComment__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__XWitnessSLComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitnessSLComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__Group__2"


    // $ANTLR start "rule__XWitnessSLComment__Group__2__Impl"
    // InternalXMachine.g:3005:1: rule__XWitnessSLComment__Group__2__Impl : ( ( rule__XWitnessSLComment__PredicateAssignment_2 ) ) ;
    public final void rule__XWitnessSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3009:1: ( ( ( rule__XWitnessSLComment__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:3010:1: ( ( rule__XWitnessSLComment__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:3010:1: ( ( rule__XWitnessSLComment__PredicateAssignment_2 ) )
            // InternalXMachine.g:3011:2: ( rule__XWitnessSLComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXWitnessSLCommentAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:3012:2: ( rule__XWitnessSLComment__PredicateAssignment_2 )
            // InternalXMachine.g:3012:3: rule__XWitnessSLComment__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessSLComment__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessSLCommentAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__Group__2__Impl"


    // $ANTLR start "rule__XWitnessSLComment__Group__3"
    // InternalXMachine.g:3020:1: rule__XWitnessSLComment__Group__3 : rule__XWitnessSLComment__Group__3__Impl ;
    public final void rule__XWitnessSLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3024:1: ( rule__XWitnessSLComment__Group__3__Impl )
            // InternalXMachine.g:3025:2: rule__XWitnessSLComment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessSLComment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__Group__3"


    // $ANTLR start "rule__XWitnessSLComment__Group__3__Impl"
    // InternalXMachine.g:3031:1: rule__XWitnessSLComment__Group__3__Impl : ( ( rule__XWitnessSLComment__CommentAssignment_3 ) ) ;
    public final void rule__XWitnessSLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3035:1: ( ( ( rule__XWitnessSLComment__CommentAssignment_3 ) ) )
            // InternalXMachine.g:3036:1: ( ( rule__XWitnessSLComment__CommentAssignment_3 ) )
            {
            // InternalXMachine.g:3036:1: ( ( rule__XWitnessSLComment__CommentAssignment_3 ) )
            // InternalXMachine.g:3037:2: ( rule__XWitnessSLComment__CommentAssignment_3 )
            {
             before(grammarAccess.getXWitnessSLCommentAccess().getCommentAssignment_3()); 
            // InternalXMachine.g:3038:2: ( rule__XWitnessSLComment__CommentAssignment_3 )
            // InternalXMachine.g:3038:3: rule__XWitnessSLComment__CommentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XWitnessSLComment__CommentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessSLCommentAccess().getCommentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__Group__3__Impl"


    // $ANTLR start "rule__XActionNoComment__Group__0"
    // InternalXMachine.g:3047:1: rule__XActionNoComment__Group__0 : rule__XActionNoComment__Group__0__Impl rule__XActionNoComment__Group__1 ;
    public final void rule__XActionNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3051:1: ( rule__XActionNoComment__Group__0__Impl rule__XActionNoComment__Group__1 )
            // InternalXMachine.g:3052:2: rule__XActionNoComment__Group__0__Impl rule__XActionNoComment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XActionNoComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XActionNoComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionNoComment__Group__0"


    // $ANTLR start "rule__XActionNoComment__Group__0__Impl"
    // InternalXMachine.g:3059:1: rule__XActionNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XActionNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3063:1: ( ( () ) )
            // InternalXMachine.g:3064:1: ( () )
            {
            // InternalXMachine.g:3064:1: ( () )
            // InternalXMachine.g:3065:2: ()
            {
             before(grammarAccess.getXActionNoCommentAccess().getActionAction_0()); 
            // InternalXMachine.g:3066:2: ()
            // InternalXMachine.g:3066:3: 
            {
            }

             after(grammarAccess.getXActionNoCommentAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionNoComment__Group__0__Impl"


    // $ANTLR start "rule__XActionNoComment__Group__1"
    // InternalXMachine.g:3074:1: rule__XActionNoComment__Group__1 : rule__XActionNoComment__Group__1__Impl rule__XActionNoComment__Group__2 ;
    public final void rule__XActionNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3078:1: ( rule__XActionNoComment__Group__1__Impl rule__XActionNoComment__Group__2 )
            // InternalXMachine.g:3079:2: rule__XActionNoComment__Group__1__Impl rule__XActionNoComment__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XActionNoComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XActionNoComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionNoComment__Group__1"


    // $ANTLR start "rule__XActionNoComment__Group__1__Impl"
    // InternalXMachine.g:3086:1: rule__XActionNoComment__Group__1__Impl : ( ( rule__XActionNoComment__NameAssignment_1 ) ) ;
    public final void rule__XActionNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3090:1: ( ( ( rule__XActionNoComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:3091:1: ( ( rule__XActionNoComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3091:1: ( ( rule__XActionNoComment__NameAssignment_1 ) )
            // InternalXMachine.g:3092:2: ( rule__XActionNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXActionNoCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:3093:2: ( rule__XActionNoComment__NameAssignment_1 )
            // InternalXMachine.g:3093:3: rule__XActionNoComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XActionNoComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXActionNoCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionNoComment__Group__1__Impl"


    // $ANTLR start "rule__XActionNoComment__Group__2"
    // InternalXMachine.g:3101:1: rule__XActionNoComment__Group__2 : rule__XActionNoComment__Group__2__Impl ;
    public final void rule__XActionNoComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3105:1: ( rule__XActionNoComment__Group__2__Impl )
            // InternalXMachine.g:3106:2: rule__XActionNoComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XActionNoComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionNoComment__Group__2"


    // $ANTLR start "rule__XActionNoComment__Group__2__Impl"
    // InternalXMachine.g:3112:1: rule__XActionNoComment__Group__2__Impl : ( ( rule__XActionNoComment__ActionAssignment_2 ) ) ;
    public final void rule__XActionNoComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3116:1: ( ( ( rule__XActionNoComment__ActionAssignment_2 ) ) )
            // InternalXMachine.g:3117:1: ( ( rule__XActionNoComment__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:3117:1: ( ( rule__XActionNoComment__ActionAssignment_2 ) )
            // InternalXMachine.g:3118:2: ( rule__XActionNoComment__ActionAssignment_2 )
            {
             before(grammarAccess.getXActionNoCommentAccess().getActionAssignment_2()); 
            // InternalXMachine.g:3119:2: ( rule__XActionNoComment__ActionAssignment_2 )
            // InternalXMachine.g:3119:3: rule__XActionNoComment__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XActionNoComment__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXActionNoCommentAccess().getActionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionNoComment__Group__2__Impl"


    // $ANTLR start "rule__XActionMLComment__Group__0"
    // InternalXMachine.g:3128:1: rule__XActionMLComment__Group__0 : rule__XActionMLComment__Group__0__Impl rule__XActionMLComment__Group__1 ;
    public final void rule__XActionMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3132:1: ( rule__XActionMLComment__Group__0__Impl rule__XActionMLComment__Group__1 )
            // InternalXMachine.g:3133:2: rule__XActionMLComment__Group__0__Impl rule__XActionMLComment__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__XActionMLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XActionMLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__Group__0"


    // $ANTLR start "rule__XActionMLComment__Group__0__Impl"
    // InternalXMachine.g:3140:1: rule__XActionMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XActionMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3144:1: ( ( () ) )
            // InternalXMachine.g:3145:1: ( () )
            {
            // InternalXMachine.g:3145:1: ( () )
            // InternalXMachine.g:3146:2: ()
            {
             before(grammarAccess.getXActionMLCommentAccess().getActionAction_0()); 
            // InternalXMachine.g:3147:2: ()
            // InternalXMachine.g:3147:3: 
            {
            }

             after(grammarAccess.getXActionMLCommentAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__Group__0__Impl"


    // $ANTLR start "rule__XActionMLComment__Group__1"
    // InternalXMachine.g:3155:1: rule__XActionMLComment__Group__1 : rule__XActionMLComment__Group__1__Impl rule__XActionMLComment__Group__2 ;
    public final void rule__XActionMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3159:1: ( rule__XActionMLComment__Group__1__Impl rule__XActionMLComment__Group__2 )
            // InternalXMachine.g:3160:2: rule__XActionMLComment__Group__1__Impl rule__XActionMLComment__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__XActionMLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XActionMLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__Group__1"


    // $ANTLR start "rule__XActionMLComment__Group__1__Impl"
    // InternalXMachine.g:3167:1: rule__XActionMLComment__Group__1__Impl : ( ( rule__XActionMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XActionMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3171:1: ( ( ( rule__XActionMLComment__CommentAssignment_1 ) ) )
            // InternalXMachine.g:3172:1: ( ( rule__XActionMLComment__CommentAssignment_1 ) )
            {
            // InternalXMachine.g:3172:1: ( ( rule__XActionMLComment__CommentAssignment_1 ) )
            // InternalXMachine.g:3173:2: ( rule__XActionMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXActionMLCommentAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:3174:2: ( rule__XActionMLComment__CommentAssignment_1 )
            // InternalXMachine.g:3174:3: rule__XActionMLComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XActionMLComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXActionMLCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__Group__1__Impl"


    // $ANTLR start "rule__XActionMLComment__Group__2"
    // InternalXMachine.g:3182:1: rule__XActionMLComment__Group__2 : rule__XActionMLComment__Group__2__Impl rule__XActionMLComment__Group__3 ;
    public final void rule__XActionMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3186:1: ( rule__XActionMLComment__Group__2__Impl rule__XActionMLComment__Group__3 )
            // InternalXMachine.g:3187:2: rule__XActionMLComment__Group__2__Impl rule__XActionMLComment__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__XActionMLComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XActionMLComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__Group__2"


    // $ANTLR start "rule__XActionMLComment__Group__2__Impl"
    // InternalXMachine.g:3194:1: rule__XActionMLComment__Group__2__Impl : ( ( rule__XActionMLComment__NameAssignment_2 ) ) ;
    public final void rule__XActionMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3198:1: ( ( ( rule__XActionMLComment__NameAssignment_2 ) ) )
            // InternalXMachine.g:3199:1: ( ( rule__XActionMLComment__NameAssignment_2 ) )
            {
            // InternalXMachine.g:3199:1: ( ( rule__XActionMLComment__NameAssignment_2 ) )
            // InternalXMachine.g:3200:2: ( rule__XActionMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXActionMLCommentAccess().getNameAssignment_2()); 
            // InternalXMachine.g:3201:2: ( rule__XActionMLComment__NameAssignment_2 )
            // InternalXMachine.g:3201:3: rule__XActionMLComment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XActionMLComment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXActionMLCommentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__Group__2__Impl"


    // $ANTLR start "rule__XActionMLComment__Group__3"
    // InternalXMachine.g:3209:1: rule__XActionMLComment__Group__3 : rule__XActionMLComment__Group__3__Impl ;
    public final void rule__XActionMLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3213:1: ( rule__XActionMLComment__Group__3__Impl )
            // InternalXMachine.g:3214:2: rule__XActionMLComment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XActionMLComment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__Group__3"


    // $ANTLR start "rule__XActionMLComment__Group__3__Impl"
    // InternalXMachine.g:3220:1: rule__XActionMLComment__Group__3__Impl : ( ( rule__XActionMLComment__ActionAssignment_3 ) ) ;
    public final void rule__XActionMLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3224:1: ( ( ( rule__XActionMLComment__ActionAssignment_3 ) ) )
            // InternalXMachine.g:3225:1: ( ( rule__XActionMLComment__ActionAssignment_3 ) )
            {
            // InternalXMachine.g:3225:1: ( ( rule__XActionMLComment__ActionAssignment_3 ) )
            // InternalXMachine.g:3226:2: ( rule__XActionMLComment__ActionAssignment_3 )
            {
             before(grammarAccess.getXActionMLCommentAccess().getActionAssignment_3()); 
            // InternalXMachine.g:3227:2: ( rule__XActionMLComment__ActionAssignment_3 )
            // InternalXMachine.g:3227:3: rule__XActionMLComment__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XActionMLComment__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXActionMLCommentAccess().getActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__Group__3__Impl"


    // $ANTLR start "rule__XActionSLComment__Group__0"
    // InternalXMachine.g:3236:1: rule__XActionSLComment__Group__0 : rule__XActionSLComment__Group__0__Impl rule__XActionSLComment__Group__1 ;
    public final void rule__XActionSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3240:1: ( rule__XActionSLComment__Group__0__Impl rule__XActionSLComment__Group__1 )
            // InternalXMachine.g:3241:2: rule__XActionSLComment__Group__0__Impl rule__XActionSLComment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XActionSLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XActionSLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__Group__0"


    // $ANTLR start "rule__XActionSLComment__Group__0__Impl"
    // InternalXMachine.g:3248:1: rule__XActionSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XActionSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3252:1: ( ( () ) )
            // InternalXMachine.g:3253:1: ( () )
            {
            // InternalXMachine.g:3253:1: ( () )
            // InternalXMachine.g:3254:2: ()
            {
             before(grammarAccess.getXActionSLCommentAccess().getActionAction_0()); 
            // InternalXMachine.g:3255:2: ()
            // InternalXMachine.g:3255:3: 
            {
            }

             after(grammarAccess.getXActionSLCommentAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__Group__0__Impl"


    // $ANTLR start "rule__XActionSLComment__Group__1"
    // InternalXMachine.g:3263:1: rule__XActionSLComment__Group__1 : rule__XActionSLComment__Group__1__Impl rule__XActionSLComment__Group__2 ;
    public final void rule__XActionSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3267:1: ( rule__XActionSLComment__Group__1__Impl rule__XActionSLComment__Group__2 )
            // InternalXMachine.g:3268:2: rule__XActionSLComment__Group__1__Impl rule__XActionSLComment__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XActionSLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XActionSLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__Group__1"


    // $ANTLR start "rule__XActionSLComment__Group__1__Impl"
    // InternalXMachine.g:3275:1: rule__XActionSLComment__Group__1__Impl : ( ( rule__XActionSLComment__NameAssignment_1 ) ) ;
    public final void rule__XActionSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3279:1: ( ( ( rule__XActionSLComment__NameAssignment_1 ) ) )
            // InternalXMachine.g:3280:1: ( ( rule__XActionSLComment__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3280:1: ( ( rule__XActionSLComment__NameAssignment_1 ) )
            // InternalXMachine.g:3281:2: ( rule__XActionSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXActionSLCommentAccess().getNameAssignment_1()); 
            // InternalXMachine.g:3282:2: ( rule__XActionSLComment__NameAssignment_1 )
            // InternalXMachine.g:3282:3: rule__XActionSLComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XActionSLComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXActionSLCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__Group__1__Impl"


    // $ANTLR start "rule__XActionSLComment__Group__2"
    // InternalXMachine.g:3290:1: rule__XActionSLComment__Group__2 : rule__XActionSLComment__Group__2__Impl rule__XActionSLComment__Group__3 ;
    public final void rule__XActionSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3294:1: ( rule__XActionSLComment__Group__2__Impl rule__XActionSLComment__Group__3 )
            // InternalXMachine.g:3295:2: rule__XActionSLComment__Group__2__Impl rule__XActionSLComment__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__XActionSLComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XActionSLComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__Group__2"


    // $ANTLR start "rule__XActionSLComment__Group__2__Impl"
    // InternalXMachine.g:3302:1: rule__XActionSLComment__Group__2__Impl : ( ( rule__XActionSLComment__ActionAssignment_2 ) ) ;
    public final void rule__XActionSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3306:1: ( ( ( rule__XActionSLComment__ActionAssignment_2 ) ) )
            // InternalXMachine.g:3307:1: ( ( rule__XActionSLComment__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:3307:1: ( ( rule__XActionSLComment__ActionAssignment_2 ) )
            // InternalXMachine.g:3308:2: ( rule__XActionSLComment__ActionAssignment_2 )
            {
             before(grammarAccess.getXActionSLCommentAccess().getActionAssignment_2()); 
            // InternalXMachine.g:3309:2: ( rule__XActionSLComment__ActionAssignment_2 )
            // InternalXMachine.g:3309:3: rule__XActionSLComment__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XActionSLComment__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXActionSLCommentAccess().getActionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__Group__2__Impl"


    // $ANTLR start "rule__XActionSLComment__Group__3"
    // InternalXMachine.g:3317:1: rule__XActionSLComment__Group__3 : rule__XActionSLComment__Group__3__Impl ;
    public final void rule__XActionSLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3321:1: ( rule__XActionSLComment__Group__3__Impl )
            // InternalXMachine.g:3322:2: rule__XActionSLComment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XActionSLComment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__Group__3"


    // $ANTLR start "rule__XActionSLComment__Group__3__Impl"
    // InternalXMachine.g:3328:1: rule__XActionSLComment__Group__3__Impl : ( ( rule__XActionSLComment__CommentAssignment_3 ) ) ;
    public final void rule__XActionSLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3332:1: ( ( ( rule__XActionSLComment__CommentAssignment_3 ) ) )
            // InternalXMachine.g:3333:1: ( ( rule__XActionSLComment__CommentAssignment_3 ) )
            {
            // InternalXMachine.g:3333:1: ( ( rule__XActionSLComment__CommentAssignment_3 ) )
            // InternalXMachine.g:3334:2: ( rule__XActionSLComment__CommentAssignment_3 )
            {
             before(grammarAccess.getXActionSLCommentAccess().getCommentAssignment_3()); 
            // InternalXMachine.g:3335:2: ( rule__XActionSLComment__CommentAssignment_3 )
            // InternalXMachine.g:3335:3: rule__XActionSLComment__CommentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XActionSLComment__CommentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXActionSLCommentAccess().getCommentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__Group__3__Impl"


    // $ANTLR start "rule__XMachine__CommentAssignment_1"
    // InternalXMachine.g:3344:1: rule__XMachine__CommentAssignment_1 : ( ( rule__XMachine__CommentAlternatives_1_0 ) ) ;
    public final void rule__XMachine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3348:1: ( ( ( rule__XMachine__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:3349:2: ( ( rule__XMachine__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:3349:2: ( ( rule__XMachine__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:3350:3: ( rule__XMachine__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXMachineAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:3351:3: ( rule__XMachine__CommentAlternatives_1_0 )
            // InternalXMachine.g:3351:4: rule__XMachine__CommentAlternatives_1_0
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


    // $ANTLR start "rule__XMachine__ExtensionIdAssignment_2_1"
    // InternalXMachine.g:3359:1: rule__XMachine__ExtensionIdAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__XMachine__ExtensionIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3363:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3364:2: ( RULE_ID )
            {
            // InternalXMachine.g:3364:2: ( RULE_ID )
            // InternalXMachine.g:3365:3: RULE_ID
            {
             before(grammarAccess.getXMachineAccess().getExtensionIdIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getExtensionIdIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__ExtensionIdAssignment_2_1"


    // $ANTLR start "rule__XMachine__NameAssignment_4"
    // InternalXMachine.g:3374:1: rule__XMachine__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__XMachine__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3378:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3379:2: ( RULE_ID )
            {
            // InternalXMachine.g:3379:2: ( RULE_ID )
            // InternalXMachine.g:3380:3: RULE_ID
            {
             before(grammarAccess.getXMachineAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__NameAssignment_4"


    // $ANTLR start "rule__XMachine__RefinesAssignment_5_1"
    // InternalXMachine.g:3389:1: rule__XMachine__RefinesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__XMachine__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3393:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3394:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3394:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3395:3: ( RULE_ID )
            {
             before(grammarAccess.getXMachineAccess().getRefinesMachineInclusionCrossReference_5_1_0()); 
            // InternalXMachine.g:3396:3: ( RULE_ID )
            // InternalXMachine.g:3397:4: RULE_ID
            {
             before(grammarAccess.getXMachineAccess().getRefinesMachineInclusionIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getRefinesMachineInclusionIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getXMachineAccess().getRefinesMachineInclusionCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__RefinesAssignment_5_1"


    // $ANTLR start "rule__XMachine__AbstractMachineAssignment_6_1"
    // InternalXMachine.g:3408:1: rule__XMachine__AbstractMachineAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__XMachine__AbstractMachineAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3412:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3413:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3413:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3414:3: ( RULE_ID )
            {
             before(grammarAccess.getXMachineAccess().getAbstractMachineMachineInclusionCrossReference_6_1_0()); 
            // InternalXMachine.g:3415:3: ( RULE_ID )
            // InternalXMachine.g:3416:4: RULE_ID
            {
             before(grammarAccess.getXMachineAccess().getAbstractMachineMachineInclusionIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getAbstractMachineMachineInclusionIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getXMachineAccess().getAbstractMachineMachineInclusionCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__AbstractMachineAssignment_6_1"


    // $ANTLR start "rule__XMachine__ConcreteMachineAssignment_7_1"
    // InternalXMachine.g:3427:1: rule__XMachine__ConcreteMachineAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__XMachine__ConcreteMachineAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3431:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:3432:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:3432:2: ( ( RULE_ID ) )
            // InternalXMachine.g:3433:3: ( RULE_ID )
            {
             before(grammarAccess.getXMachineAccess().getConcreteMachineMachineInclusionCrossReference_7_1_0()); 
            // InternalXMachine.g:3434:3: ( RULE_ID )
            // InternalXMachine.g:3435:4: RULE_ID
            {
             before(grammarAccess.getXMachineAccess().getConcreteMachineMachineInclusionIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getConcreteMachineMachineInclusionIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getXMachineAccess().getConcreteMachineMachineInclusionCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__ConcreteMachineAssignment_7_1"


    // $ANTLR start "rule__XMachine__PrefixesAssignment_8_1"
    // InternalXMachine.g:3446:1: rule__XMachine__PrefixesAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__XMachine__PrefixesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3450:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3451:2: ( RULE_ID )
            {
            // InternalXMachine.g:3451:2: ( RULE_ID )
            // InternalXMachine.g:3452:3: RULE_ID
            {
             before(grammarAccess.getXMachineAccess().getPrefixesIDTerminalRuleCall_8_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getPrefixesIDTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__PrefixesAssignment_8_1"


    // $ANTLR start "rule__XMachine__PrefixesAssignment_8_2"
    // InternalXMachine.g:3461:1: rule__XMachine__PrefixesAssignment_8_2 : ( RULE_ID ) ;
    public final void rule__XMachine__PrefixesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3465:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3466:2: ( RULE_ID )
            {
            // InternalXMachine.g:3466:2: ( RULE_ID )
            // InternalXMachine.g:3467:3: RULE_ID
            {
             before(grammarAccess.getXMachineAccess().getPrefixesIDTerminalRuleCall_8_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMachineAccess().getPrefixesIDTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMachine__PrefixesAssignment_8_2"


    // $ANTLR start "rule__XVariableNoComment__NameAssignment_1"
    // InternalXMachine.g:3476:1: rule__XVariableNoComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariableNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3480:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3481:2: ( RULE_ID )
            {
            // InternalXMachine.g:3481:2: ( RULE_ID )
            // InternalXMachine.g:3482:3: RULE_ID
            {
             before(grammarAccess.getXVariableNoCommentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXVariableNoCommentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableNoComment__NameAssignment_1"


    // $ANTLR start "rule__XVariableMLComment__CommentAssignment_1"
    // InternalXMachine.g:3491:1: rule__XVariableMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XVariableMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3495:1: ( ( RULE_ML_COMMENT ) )
            // InternalXMachine.g:3496:2: ( RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3496:2: ( RULE_ML_COMMENT )
            // InternalXMachine.g:3497:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getXVariableMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXVariableMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableMLComment__CommentAssignment_1"


    // $ANTLR start "rule__XVariableMLComment__NameAssignment_2"
    // InternalXMachine.g:3506:1: rule__XVariableMLComment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XVariableMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3510:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3511:2: ( RULE_ID )
            {
            // InternalXMachine.g:3511:2: ( RULE_ID )
            // InternalXMachine.g:3512:3: RULE_ID
            {
             before(grammarAccess.getXVariableMLCommentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXVariableMLCommentAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableMLComment__NameAssignment_2"


    // $ANTLR start "rule__XVariableSLComment__NameAssignment_1"
    // InternalXMachine.g:3521:1: rule__XVariableSLComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariableSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3525:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3526:2: ( RULE_ID )
            {
            // InternalXMachine.g:3526:2: ( RULE_ID )
            // InternalXMachine.g:3527:3: RULE_ID
            {
             before(grammarAccess.getXVariableSLCommentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXVariableSLCommentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableSLComment__NameAssignment_1"


    // $ANTLR start "rule__XVariableSLComment__CommentAssignment_2"
    // InternalXMachine.g:3536:1: rule__XVariableSLComment__CommentAssignment_2 : ( RULE_SL_COMMENT ) ;
    public final void rule__XVariableSLComment__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3540:1: ( ( RULE_SL_COMMENT ) )
            // InternalXMachine.g:3541:2: ( RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3541:2: ( RULE_SL_COMMENT )
            // InternalXMachine.g:3542:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getXVariableSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXVariableSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariableSLComment__CommentAssignment_2"


    // $ANTLR start "rule__XInvariantNoComment__NameAssignment_1"
    // InternalXMachine.g:3551:1: rule__XInvariantNoComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XInvariantNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3555:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3556:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3556:2: ( RULE_XLABEL )
            // InternalXMachine.g:3557:3: RULE_XLABEL
            {
             before(grammarAccess.getXInvariantNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXInvariantNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__NameAssignment_1"


    // $ANTLR start "rule__XInvariantNoComment__PredicateAssignment_2"
    // InternalXMachine.g:3566:1: rule__XInvariantNoComment__PredicateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XInvariantNoComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3570:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3571:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3571:2: ( RULE_STRING )
            // InternalXMachine.g:3572:3: RULE_STRING
            {
             before(grammarAccess.getXInvariantNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXInvariantNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__PredicateAssignment_2"


    // $ANTLR start "rule__XInvariantNoComment__TheoremAssignment_3"
    // InternalXMachine.g:3581:1: rule__XInvariantNoComment__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariantNoComment__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3585:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3586:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3586:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3587:3: ( 'theorem' )
            {
             before(grammarAccess.getXInvariantNoCommentAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:3588:3: ( 'theorem' )
            // InternalXMachine.g:3589:4: 'theorem'
            {
             before(grammarAccess.getXInvariantNoCommentAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXInvariantNoCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXInvariantNoCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantNoComment__TheoremAssignment_3"


    // $ANTLR start "rule__XInvariantMLComment__CommentAssignment_1"
    // InternalXMachine.g:3600:1: rule__XInvariantMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XInvariantMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3604:1: ( ( RULE_ML_COMMENT ) )
            // InternalXMachine.g:3605:2: ( RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3605:2: ( RULE_ML_COMMENT )
            // InternalXMachine.g:3606:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXInvariantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__CommentAssignment_1"


    // $ANTLR start "rule__XInvariantMLComment__NameAssignment_2"
    // InternalXMachine.g:3615:1: rule__XInvariantMLComment__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XInvariantMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3619:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3620:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3620:2: ( RULE_XLABEL )
            // InternalXMachine.g:3621:3: RULE_XLABEL
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXInvariantMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__NameAssignment_2"


    // $ANTLR start "rule__XInvariantMLComment__PredicateAssignment_3"
    // InternalXMachine.g:3630:1: rule__XInvariantMLComment__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__XInvariantMLComment__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3634:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3635:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3635:2: ( RULE_STRING )
            // InternalXMachine.g:3636:3: RULE_STRING
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXInvariantMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__PredicateAssignment_3"


    // $ANTLR start "rule__XInvariantMLComment__TheoremAssignment_4"
    // InternalXMachine.g:3645:1: rule__XInvariantMLComment__TheoremAssignment_4 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariantMLComment__TheoremAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3649:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3650:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3650:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3651:3: ( 'theorem' )
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getTheoremTheoremKeyword_4_0()); 
            // InternalXMachine.g:3652:3: ( 'theorem' )
            // InternalXMachine.g:3653:4: 'theorem'
            {
             before(grammarAccess.getXInvariantMLCommentAccess().getTheoremTheoremKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXInvariantMLCommentAccess().getTheoremTheoremKeyword_4_0()); 

            }

             after(grammarAccess.getXInvariantMLCommentAccess().getTheoremTheoremKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantMLComment__TheoremAssignment_4"


    // $ANTLR start "rule__XInvariantSLComment__NameAssignment_1"
    // InternalXMachine.g:3664:1: rule__XInvariantSLComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XInvariantSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3668:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3669:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3669:2: ( RULE_XLABEL )
            // InternalXMachine.g:3670:3: RULE_XLABEL
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXInvariantSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__NameAssignment_1"


    // $ANTLR start "rule__XInvariantSLComment__PredicateAssignment_2"
    // InternalXMachine.g:3679:1: rule__XInvariantSLComment__PredicateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XInvariantSLComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3683:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3684:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3684:2: ( RULE_STRING )
            // InternalXMachine.g:3685:3: RULE_STRING
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXInvariantSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__PredicateAssignment_2"


    // $ANTLR start "rule__XInvariantSLComment__TheoremAssignment_3"
    // InternalXMachine.g:3694:1: rule__XInvariantSLComment__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariantSLComment__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3698:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3699:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3699:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3700:3: ( 'theorem' )
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:3701:3: ( 'theorem' )
            // InternalXMachine.g:3702:4: 'theorem'
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXInvariantSLCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXInvariantSLCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__TheoremAssignment_3"


    // $ANTLR start "rule__XInvariantSLComment__CommentAssignment_4"
    // InternalXMachine.g:3713:1: rule__XInvariantSLComment__CommentAssignment_4 : ( RULE_SL_COMMENT ) ;
    public final void rule__XInvariantSLComment__CommentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3717:1: ( ( RULE_SL_COMMENT ) )
            // InternalXMachine.g:3718:2: ( RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3718:2: ( RULE_SL_COMMENT )
            // InternalXMachine.g:3719:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getXInvariantSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_4_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXInvariantSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariantSLComment__CommentAssignment_4"


    // $ANTLR start "rule__XVariantNoComment__ExpressionAssignment_1"
    // InternalXMachine.g:3728:1: rule__XVariantNoComment__ExpressionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XVariantNoComment__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3732:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3733:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3733:2: ( RULE_STRING )
            // InternalXMachine.g:3734:3: RULE_STRING
            {
             before(grammarAccess.getXVariantNoCommentAccess().getExpressionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXVariantNoCommentAccess().getExpressionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantNoComment__ExpressionAssignment_1"


    // $ANTLR start "rule__XVariantMLComment__CommentAssignment_1"
    // InternalXMachine.g:3743:1: rule__XVariantMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XVariantMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3747:1: ( ( RULE_ML_COMMENT ) )
            // InternalXMachine.g:3748:2: ( RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3748:2: ( RULE_ML_COMMENT )
            // InternalXMachine.g:3749:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getXVariantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXVariantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantMLComment__CommentAssignment_1"


    // $ANTLR start "rule__XVariantMLComment__ExpressionAssignment_2"
    // InternalXMachine.g:3758:1: rule__XVariantMLComment__ExpressionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XVariantMLComment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3762:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3763:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3763:2: ( RULE_STRING )
            // InternalXMachine.g:3764:3: RULE_STRING
            {
             before(grammarAccess.getXVariantMLCommentAccess().getExpressionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXVariantMLCommentAccess().getExpressionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantMLComment__ExpressionAssignment_2"


    // $ANTLR start "rule__XVariantSLComment__ExpressionAssignment_1"
    // InternalXMachine.g:3773:1: rule__XVariantSLComment__ExpressionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XVariantSLComment__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3777:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3778:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3778:2: ( RULE_STRING )
            // InternalXMachine.g:3779:3: RULE_STRING
            {
             before(grammarAccess.getXVariantSLCommentAccess().getExpressionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXVariantSLCommentAccess().getExpressionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantSLComment__ExpressionAssignment_1"


    // $ANTLR start "rule__XVariantSLComment__CommentAssignment_2"
    // InternalXMachine.g:3788:1: rule__XVariantSLComment__CommentAssignment_2 : ( RULE_SL_COMMENT ) ;
    public final void rule__XVariantSLComment__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3792:1: ( ( RULE_SL_COMMENT ) )
            // InternalXMachine.g:3793:2: ( RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3793:2: ( RULE_SL_COMMENT )
            // InternalXMachine.g:3794:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getXVariantSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXVariantSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariantSLComment__CommentAssignment_2"


    // $ANTLR start "rule__XParameterNoComment__NameAssignment_1"
    // InternalXMachine.g:3803:1: rule__XParameterNoComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameterNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3807:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3808:2: ( RULE_ID )
            {
            // InternalXMachine.g:3808:2: ( RULE_ID )
            // InternalXMachine.g:3809:3: RULE_ID
            {
             before(grammarAccess.getXParameterNoCommentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXParameterNoCommentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterNoComment__NameAssignment_1"


    // $ANTLR start "rule__XParameterMLComment__CommentAssignment_1"
    // InternalXMachine.g:3818:1: rule__XParameterMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XParameterMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3822:1: ( ( RULE_ML_COMMENT ) )
            // InternalXMachine.g:3823:2: ( RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3823:2: ( RULE_ML_COMMENT )
            // InternalXMachine.g:3824:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getXParameterMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXParameterMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterMLComment__CommentAssignment_1"


    // $ANTLR start "rule__XParameterMLComment__NameAssignment_2"
    // InternalXMachine.g:3833:1: rule__XParameterMLComment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XParameterMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3837:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3838:2: ( RULE_ID )
            {
            // InternalXMachine.g:3838:2: ( RULE_ID )
            // InternalXMachine.g:3839:3: RULE_ID
            {
             before(grammarAccess.getXParameterMLCommentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXParameterMLCommentAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterMLComment__NameAssignment_2"


    // $ANTLR start "rule__XParameterSLComment__NameAssignment_1"
    // InternalXMachine.g:3848:1: rule__XParameterSLComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameterSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3852:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3853:2: ( RULE_ID )
            {
            // InternalXMachine.g:3853:2: ( RULE_ID )
            // InternalXMachine.g:3854:3: RULE_ID
            {
             before(grammarAccess.getXParameterSLCommentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXParameterSLCommentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterSLComment__NameAssignment_1"


    // $ANTLR start "rule__XParameterSLComment__CommentAssignment_2"
    // InternalXMachine.g:3863:1: rule__XParameterSLComment__CommentAssignment_2 : ( RULE_SL_COMMENT ) ;
    public final void rule__XParameterSLComment__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3867:1: ( ( RULE_SL_COMMENT ) )
            // InternalXMachine.g:3868:2: ( RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3868:2: ( RULE_SL_COMMENT )
            // InternalXMachine.g:3869:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getXParameterSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXParameterSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameterSLComment__CommentAssignment_2"


    // $ANTLR start "rule__XGuardNoComment__NameAssignment_1"
    // InternalXMachine.g:3878:1: rule__XGuardNoComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XGuardNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3882:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3883:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3883:2: ( RULE_XLABEL )
            // InternalXMachine.g:3884:3: RULE_XLABEL
            {
             before(grammarAccess.getXGuardNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXGuardNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__NameAssignment_1"


    // $ANTLR start "rule__XGuardNoComment__PredicateAssignment_2"
    // InternalXMachine.g:3893:1: rule__XGuardNoComment__PredicateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XGuardNoComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3897:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3898:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3898:2: ( RULE_STRING )
            // InternalXMachine.g:3899:3: RULE_STRING
            {
             before(grammarAccess.getXGuardNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXGuardNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__PredicateAssignment_2"


    // $ANTLR start "rule__XGuardNoComment__TheoremAssignment_3"
    // InternalXMachine.g:3908:1: rule__XGuardNoComment__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XGuardNoComment__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3912:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3913:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3913:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3914:3: ( 'theorem' )
            {
             before(grammarAccess.getXGuardNoCommentAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:3915:3: ( 'theorem' )
            // InternalXMachine.g:3916:4: 'theorem'
            {
             before(grammarAccess.getXGuardNoCommentAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXGuardNoCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXGuardNoCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardNoComment__TheoremAssignment_3"


    // $ANTLR start "rule__XGuardMLComment__CommentAssignment_1"
    // InternalXMachine.g:3927:1: rule__XGuardMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XGuardMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3931:1: ( ( RULE_ML_COMMENT ) )
            // InternalXMachine.g:3932:2: ( RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3932:2: ( RULE_ML_COMMENT )
            // InternalXMachine.g:3933:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getXGuardMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXGuardMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__CommentAssignment_1"


    // $ANTLR start "rule__XGuardMLComment__NameAssignment_2"
    // InternalXMachine.g:3942:1: rule__XGuardMLComment__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XGuardMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3946:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3947:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3947:2: ( RULE_XLABEL )
            // InternalXMachine.g:3948:3: RULE_XLABEL
            {
             before(grammarAccess.getXGuardMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXGuardMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__NameAssignment_2"


    // $ANTLR start "rule__XGuardMLComment__PredicateAssignment_3"
    // InternalXMachine.g:3957:1: rule__XGuardMLComment__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__XGuardMLComment__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3961:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:3962:2: ( RULE_STRING )
            {
            // InternalXMachine.g:3962:2: ( RULE_STRING )
            // InternalXMachine.g:3963:3: RULE_STRING
            {
             before(grammarAccess.getXGuardMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXGuardMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__PredicateAssignment_3"


    // $ANTLR start "rule__XGuardMLComment__TheoremAssignment_4"
    // InternalXMachine.g:3972:1: rule__XGuardMLComment__TheoremAssignment_4 : ( ( 'theorem' ) ) ;
    public final void rule__XGuardMLComment__TheoremAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3976:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:3977:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:3977:2: ( ( 'theorem' ) )
            // InternalXMachine.g:3978:3: ( 'theorem' )
            {
             before(grammarAccess.getXGuardMLCommentAccess().getTheoremTheoremKeyword_4_0()); 
            // InternalXMachine.g:3979:3: ( 'theorem' )
            // InternalXMachine.g:3980:4: 'theorem'
            {
             before(grammarAccess.getXGuardMLCommentAccess().getTheoremTheoremKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXGuardMLCommentAccess().getTheoremTheoremKeyword_4_0()); 

            }

             after(grammarAccess.getXGuardMLCommentAccess().getTheoremTheoremKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardMLComment__TheoremAssignment_4"


    // $ANTLR start "rule__XGuardSLComment__NameAssignment_1"
    // InternalXMachine.g:3991:1: rule__XGuardSLComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XGuardSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3995:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:3996:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:3996:2: ( RULE_XLABEL )
            // InternalXMachine.g:3997:3: RULE_XLABEL
            {
             before(grammarAccess.getXGuardSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXGuardSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__NameAssignment_1"


    // $ANTLR start "rule__XGuardSLComment__PredicateAssignment_2"
    // InternalXMachine.g:4006:1: rule__XGuardSLComment__PredicateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XGuardSLComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4010:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:4011:2: ( RULE_STRING )
            {
            // InternalXMachine.g:4011:2: ( RULE_STRING )
            // InternalXMachine.g:4012:3: RULE_STRING
            {
             before(grammarAccess.getXGuardSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXGuardSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__PredicateAssignment_2"


    // $ANTLR start "rule__XGuardSLComment__TheoremAssignment_3"
    // InternalXMachine.g:4021:1: rule__XGuardSLComment__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XGuardSLComment__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4025:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:4026:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:4026:2: ( ( 'theorem' ) )
            // InternalXMachine.g:4027:3: ( 'theorem' )
            {
             before(grammarAccess.getXGuardSLCommentAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:4028:3: ( 'theorem' )
            // InternalXMachine.g:4029:4: 'theorem'
            {
             before(grammarAccess.getXGuardSLCommentAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXGuardSLCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXGuardSLCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__TheoremAssignment_3"


    // $ANTLR start "rule__XGuardSLComment__CommentAssignment_4"
    // InternalXMachine.g:4040:1: rule__XGuardSLComment__CommentAssignment_4 : ( RULE_SL_COMMENT ) ;
    public final void rule__XGuardSLComment__CommentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4044:1: ( ( RULE_SL_COMMENT ) )
            // InternalXMachine.g:4045:2: ( RULE_SL_COMMENT )
            {
            // InternalXMachine.g:4045:2: ( RULE_SL_COMMENT )
            // InternalXMachine.g:4046:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getXGuardSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_4_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXGuardSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuardSLComment__CommentAssignment_4"


    // $ANTLR start "rule__XWitnessNoComment__NameAssignment_1"
    // InternalXMachine.g:4055:1: rule__XWitnessNoComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitnessNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4059:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4060:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4060:2: ( RULE_XLABEL )
            // InternalXMachine.g:4061:3: RULE_XLABEL
            {
             before(grammarAccess.getXWitnessNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXWitnessNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessNoComment__NameAssignment_1"


    // $ANTLR start "rule__XWitnessNoComment__PredicateAssignment_2"
    // InternalXMachine.g:4070:1: rule__XWitnessNoComment__PredicateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XWitnessNoComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4074:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:4075:2: ( RULE_STRING )
            {
            // InternalXMachine.g:4075:2: ( RULE_STRING )
            // InternalXMachine.g:4076:3: RULE_STRING
            {
             before(grammarAccess.getXWitnessNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXWitnessNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessNoComment__PredicateAssignment_2"


    // $ANTLR start "rule__XWitnessMLComment__CommentAssignment_1"
    // InternalXMachine.g:4085:1: rule__XWitnessMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XWitnessMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4089:1: ( ( RULE_ML_COMMENT ) )
            // InternalXMachine.g:4090:2: ( RULE_ML_COMMENT )
            {
            // InternalXMachine.g:4090:2: ( RULE_ML_COMMENT )
            // InternalXMachine.g:4091:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getXWitnessMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXWitnessMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__CommentAssignment_1"


    // $ANTLR start "rule__XWitnessMLComment__NameAssignment_2"
    // InternalXMachine.g:4100:1: rule__XWitnessMLComment__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XWitnessMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4104:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4105:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4105:2: ( RULE_XLABEL )
            // InternalXMachine.g:4106:3: RULE_XLABEL
            {
             before(grammarAccess.getXWitnessMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXWitnessMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__NameAssignment_2"


    // $ANTLR start "rule__XWitnessMLComment__PredicateAssignment_3"
    // InternalXMachine.g:4115:1: rule__XWitnessMLComment__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__XWitnessMLComment__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4119:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:4120:2: ( RULE_STRING )
            {
            // InternalXMachine.g:4120:2: ( RULE_STRING )
            // InternalXMachine.g:4121:3: RULE_STRING
            {
             before(grammarAccess.getXWitnessMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXWitnessMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessMLComment__PredicateAssignment_3"


    // $ANTLR start "rule__XWitnessSLComment__NameAssignment_1"
    // InternalXMachine.g:4130:1: rule__XWitnessSLComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitnessSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4134:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4135:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4135:2: ( RULE_XLABEL )
            // InternalXMachine.g:4136:3: RULE_XLABEL
            {
             before(grammarAccess.getXWitnessSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXWitnessSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__NameAssignment_1"


    // $ANTLR start "rule__XWitnessSLComment__PredicateAssignment_2"
    // InternalXMachine.g:4145:1: rule__XWitnessSLComment__PredicateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XWitnessSLComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4149:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:4150:2: ( RULE_STRING )
            {
            // InternalXMachine.g:4150:2: ( RULE_STRING )
            // InternalXMachine.g:4151:3: RULE_STRING
            {
             before(grammarAccess.getXWitnessSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXWitnessSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__PredicateAssignment_2"


    // $ANTLR start "rule__XWitnessSLComment__CommentAssignment_3"
    // InternalXMachine.g:4160:1: rule__XWitnessSLComment__CommentAssignment_3 : ( RULE_SL_COMMENT ) ;
    public final void rule__XWitnessSLComment__CommentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4164:1: ( ( RULE_SL_COMMENT ) )
            // InternalXMachine.g:4165:2: ( RULE_SL_COMMENT )
            {
            // InternalXMachine.g:4165:2: ( RULE_SL_COMMENT )
            // InternalXMachine.g:4166:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getXWitnessSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_3_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXWitnessSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitnessSLComment__CommentAssignment_3"


    // $ANTLR start "rule__XActionNoComment__NameAssignment_1"
    // InternalXMachine.g:4175:1: rule__XActionNoComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XActionNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4179:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4180:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4180:2: ( RULE_XLABEL )
            // InternalXMachine.g:4181:3: RULE_XLABEL
            {
             before(grammarAccess.getXActionNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXActionNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionNoComment__NameAssignment_1"


    // $ANTLR start "rule__XActionNoComment__ActionAssignment_2"
    // InternalXMachine.g:4190:1: rule__XActionNoComment__ActionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XActionNoComment__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4194:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:4195:2: ( RULE_STRING )
            {
            // InternalXMachine.g:4195:2: ( RULE_STRING )
            // InternalXMachine.g:4196:3: RULE_STRING
            {
             before(grammarAccess.getXActionNoCommentAccess().getActionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXActionNoCommentAccess().getActionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionNoComment__ActionAssignment_2"


    // $ANTLR start "rule__XActionMLComment__CommentAssignment_1"
    // InternalXMachine.g:4205:1: rule__XActionMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XActionMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4209:1: ( ( RULE_ML_COMMENT ) )
            // InternalXMachine.g:4210:2: ( RULE_ML_COMMENT )
            {
            // InternalXMachine.g:4210:2: ( RULE_ML_COMMENT )
            // InternalXMachine.g:4211:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getXActionMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXActionMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__CommentAssignment_1"


    // $ANTLR start "rule__XActionMLComment__NameAssignment_2"
    // InternalXMachine.g:4220:1: rule__XActionMLComment__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XActionMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4224:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4225:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4225:2: ( RULE_XLABEL )
            // InternalXMachine.g:4226:3: RULE_XLABEL
            {
             before(grammarAccess.getXActionMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXActionMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__NameAssignment_2"


    // $ANTLR start "rule__XActionMLComment__ActionAssignment_3"
    // InternalXMachine.g:4235:1: rule__XActionMLComment__ActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__XActionMLComment__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4239:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:4240:2: ( RULE_STRING )
            {
            // InternalXMachine.g:4240:2: ( RULE_STRING )
            // InternalXMachine.g:4241:3: RULE_STRING
            {
             before(grammarAccess.getXActionMLCommentAccess().getActionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXActionMLCommentAccess().getActionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionMLComment__ActionAssignment_3"


    // $ANTLR start "rule__XActionSLComment__NameAssignment_1"
    // InternalXMachine.g:4250:1: rule__XActionSLComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XActionSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4254:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4255:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4255:2: ( RULE_XLABEL )
            // InternalXMachine.g:4256:3: RULE_XLABEL
            {
             before(grammarAccess.getXActionSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXActionSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__NameAssignment_1"


    // $ANTLR start "rule__XActionSLComment__ActionAssignment_2"
    // InternalXMachine.g:4265:1: rule__XActionSLComment__ActionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XActionSLComment__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4269:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:4270:2: ( RULE_STRING )
            {
            // InternalXMachine.g:4270:2: ( RULE_STRING )
            // InternalXMachine.g:4271:3: RULE_STRING
            {
             before(grammarAccess.getXActionSLCommentAccess().getActionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXActionSLCommentAccess().getActionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__ActionAssignment_2"


    // $ANTLR start "rule__XActionSLComment__CommentAssignment_3"
    // InternalXMachine.g:4280:1: rule__XActionSLComment__CommentAssignment_3 : ( RULE_SL_COMMENT ) ;
    public final void rule__XActionSLComment__CommentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4284:1: ( ( RULE_SL_COMMENT ) )
            // InternalXMachine.g:4285:2: ( RULE_SL_COMMENT )
            {
            // InternalXMachine.g:4285:2: ( RULE_SL_COMMENT )
            // InternalXMachine.g:4286:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getXActionSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_3_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXActionSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XActionSLComment__CommentAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080020L});

}