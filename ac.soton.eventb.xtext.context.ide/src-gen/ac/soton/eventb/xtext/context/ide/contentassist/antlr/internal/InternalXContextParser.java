package ac.soton.eventb.xtext.context.ide.contentassist.antlr.internal;

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
import ac.soton.eventb.xtext.context.services.XContextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXContextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'end'", "'extends'", "'sets'", "'constants'", "'axioms'", "'theorem'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=5;
    public static final int RULE_XLABEL=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=9;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalXContextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXContextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXContextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXContext.g"; }


    	private XContextGrammarAccess grammarAccess;

    	public void setGrammarAccess(XContextGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleXContext"
    // InternalXContext.g:53:1: entryRuleXContext : ruleXContext EOF ;
    public final void entryRuleXContext() throws RecognitionException {
        try {
            // InternalXContext.g:54:1: ( ruleXContext EOF )
            // InternalXContext.g:55:1: ruleXContext EOF
            {
             before(grammarAccess.getXContextRule()); 
            pushFollow(FOLLOW_1);
            ruleXContext();

            state._fsp--;

             after(grammarAccess.getXContextRule()); 
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
    // $ANTLR end "entryRuleXContext"


    // $ANTLR start "ruleXContext"
    // InternalXContext.g:62:1: ruleXContext : ( ( rule__XContext__Group__0 ) ) ;
    public final void ruleXContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:66:2: ( ( ( rule__XContext__Group__0 ) ) )
            // InternalXContext.g:67:2: ( ( rule__XContext__Group__0 ) )
            {
            // InternalXContext.g:67:2: ( ( rule__XContext__Group__0 ) )
            // InternalXContext.g:68:3: ( rule__XContext__Group__0 )
            {
             before(grammarAccess.getXContextAccess().getGroup()); 
            // InternalXContext.g:69:3: ( rule__XContext__Group__0 )
            // InternalXContext.g:69:4: rule__XContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXContext"


    // $ANTLR start "entryRuleXCarrierSet"
    // InternalXContext.g:78:1: entryRuleXCarrierSet : ruleXCarrierSet EOF ;
    public final void entryRuleXCarrierSet() throws RecognitionException {
        try {
            // InternalXContext.g:79:1: ( ruleXCarrierSet EOF )
            // InternalXContext.g:80:1: ruleXCarrierSet EOF
            {
             before(grammarAccess.getXCarrierSetRule()); 
            pushFollow(FOLLOW_1);
            ruleXCarrierSet();

            state._fsp--;

             after(grammarAccess.getXCarrierSetRule()); 
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
    // $ANTLR end "entryRuleXCarrierSet"


    // $ANTLR start "ruleXCarrierSet"
    // InternalXContext.g:87:1: ruleXCarrierSet : ( ( rule__XCarrierSet__Alternatives ) ) ;
    public final void ruleXCarrierSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:91:2: ( ( ( rule__XCarrierSet__Alternatives ) ) )
            // InternalXContext.g:92:2: ( ( rule__XCarrierSet__Alternatives ) )
            {
            // InternalXContext.g:92:2: ( ( rule__XCarrierSet__Alternatives ) )
            // InternalXContext.g:93:3: ( rule__XCarrierSet__Alternatives )
            {
             before(grammarAccess.getXCarrierSetAccess().getAlternatives()); 
            // InternalXContext.g:94:3: ( rule__XCarrierSet__Alternatives )
            // InternalXContext.g:94:4: rule__XCarrierSet__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSet__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXCarrierSet"


    // $ANTLR start "entryRuleXCarrierSetNoComment"
    // InternalXContext.g:103:1: entryRuleXCarrierSetNoComment : ruleXCarrierSetNoComment EOF ;
    public final void entryRuleXCarrierSetNoComment() throws RecognitionException {
        try {
            // InternalXContext.g:104:1: ( ruleXCarrierSetNoComment EOF )
            // InternalXContext.g:105:1: ruleXCarrierSetNoComment EOF
            {
             before(grammarAccess.getXCarrierSetNoCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXCarrierSetNoComment();

            state._fsp--;

             after(grammarAccess.getXCarrierSetNoCommentRule()); 
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
    // $ANTLR end "entryRuleXCarrierSetNoComment"


    // $ANTLR start "ruleXCarrierSetNoComment"
    // InternalXContext.g:112:1: ruleXCarrierSetNoComment : ( ( rule__XCarrierSetNoComment__Group__0 ) ) ;
    public final void ruleXCarrierSetNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:116:2: ( ( ( rule__XCarrierSetNoComment__Group__0 ) ) )
            // InternalXContext.g:117:2: ( ( rule__XCarrierSetNoComment__Group__0 ) )
            {
            // InternalXContext.g:117:2: ( ( rule__XCarrierSetNoComment__Group__0 ) )
            // InternalXContext.g:118:3: ( rule__XCarrierSetNoComment__Group__0 )
            {
             before(grammarAccess.getXCarrierSetNoCommentAccess().getGroup()); 
            // InternalXContext.g:119:3: ( rule__XCarrierSetNoComment__Group__0 )
            // InternalXContext.g:119:4: rule__XCarrierSetNoComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetNoComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetNoCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXCarrierSetNoComment"


    // $ANTLR start "entryRuleXCarrierSetMLComment"
    // InternalXContext.g:128:1: entryRuleXCarrierSetMLComment : ruleXCarrierSetMLComment EOF ;
    public final void entryRuleXCarrierSetMLComment() throws RecognitionException {
        try {
            // InternalXContext.g:129:1: ( ruleXCarrierSetMLComment EOF )
            // InternalXContext.g:130:1: ruleXCarrierSetMLComment EOF
            {
             before(grammarAccess.getXCarrierSetMLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXCarrierSetMLComment();

            state._fsp--;

             after(grammarAccess.getXCarrierSetMLCommentRule()); 
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
    // $ANTLR end "entryRuleXCarrierSetMLComment"


    // $ANTLR start "ruleXCarrierSetMLComment"
    // InternalXContext.g:137:1: ruleXCarrierSetMLComment : ( ( rule__XCarrierSetMLComment__Group__0 ) ) ;
    public final void ruleXCarrierSetMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:141:2: ( ( ( rule__XCarrierSetMLComment__Group__0 ) ) )
            // InternalXContext.g:142:2: ( ( rule__XCarrierSetMLComment__Group__0 ) )
            {
            // InternalXContext.g:142:2: ( ( rule__XCarrierSetMLComment__Group__0 ) )
            // InternalXContext.g:143:3: ( rule__XCarrierSetMLComment__Group__0 )
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getGroup()); 
            // InternalXContext.g:144:3: ( rule__XCarrierSetMLComment__Group__0 )
            // InternalXContext.g:144:4: rule__XCarrierSetMLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetMLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetMLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXCarrierSetMLComment"


    // $ANTLR start "entryRuleXCarrierSetSLComment"
    // InternalXContext.g:153:1: entryRuleXCarrierSetSLComment : ruleXCarrierSetSLComment EOF ;
    public final void entryRuleXCarrierSetSLComment() throws RecognitionException {
        try {
            // InternalXContext.g:154:1: ( ruleXCarrierSetSLComment EOF )
            // InternalXContext.g:155:1: ruleXCarrierSetSLComment EOF
            {
             before(grammarAccess.getXCarrierSetSLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXCarrierSetSLComment();

            state._fsp--;

             after(grammarAccess.getXCarrierSetSLCommentRule()); 
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
    // $ANTLR end "entryRuleXCarrierSetSLComment"


    // $ANTLR start "ruleXCarrierSetSLComment"
    // InternalXContext.g:162:1: ruleXCarrierSetSLComment : ( ( rule__XCarrierSetSLComment__Group__0 ) ) ;
    public final void ruleXCarrierSetSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:166:2: ( ( ( rule__XCarrierSetSLComment__Group__0 ) ) )
            // InternalXContext.g:167:2: ( ( rule__XCarrierSetSLComment__Group__0 ) )
            {
            // InternalXContext.g:167:2: ( ( rule__XCarrierSetSLComment__Group__0 ) )
            // InternalXContext.g:168:3: ( rule__XCarrierSetSLComment__Group__0 )
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getGroup()); 
            // InternalXContext.g:169:3: ( rule__XCarrierSetSLComment__Group__0 )
            // InternalXContext.g:169:4: rule__XCarrierSetSLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetSLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetSLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXCarrierSetSLComment"


    // $ANTLR start "entryRuleXConstant"
    // InternalXContext.g:178:1: entryRuleXConstant : ruleXConstant EOF ;
    public final void entryRuleXConstant() throws RecognitionException {
        try {
            // InternalXContext.g:179:1: ( ruleXConstant EOF )
            // InternalXContext.g:180:1: ruleXConstant EOF
            {
             before(grammarAccess.getXConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleXConstant();

            state._fsp--;

             after(grammarAccess.getXConstantRule()); 
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
    // $ANTLR end "entryRuleXConstant"


    // $ANTLR start "ruleXConstant"
    // InternalXContext.g:187:1: ruleXConstant : ( ( rule__XConstant__Alternatives ) ) ;
    public final void ruleXConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:191:2: ( ( ( rule__XConstant__Alternatives ) ) )
            // InternalXContext.g:192:2: ( ( rule__XConstant__Alternatives ) )
            {
            // InternalXContext.g:192:2: ( ( rule__XConstant__Alternatives ) )
            // InternalXContext.g:193:3: ( rule__XConstant__Alternatives )
            {
             before(grammarAccess.getXConstantAccess().getAlternatives()); 
            // InternalXContext.g:194:3: ( rule__XConstant__Alternatives )
            // InternalXContext.g:194:4: rule__XConstant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XConstant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXConstant"


    // $ANTLR start "entryRuleXConstantNoComment"
    // InternalXContext.g:203:1: entryRuleXConstantNoComment : ruleXConstantNoComment EOF ;
    public final void entryRuleXConstantNoComment() throws RecognitionException {
        try {
            // InternalXContext.g:204:1: ( ruleXConstantNoComment EOF )
            // InternalXContext.g:205:1: ruleXConstantNoComment EOF
            {
             before(grammarAccess.getXConstantNoCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXConstantNoComment();

            state._fsp--;

             after(grammarAccess.getXConstantNoCommentRule()); 
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
    // $ANTLR end "entryRuleXConstantNoComment"


    // $ANTLR start "ruleXConstantNoComment"
    // InternalXContext.g:212:1: ruleXConstantNoComment : ( ( rule__XConstantNoComment__Group__0 ) ) ;
    public final void ruleXConstantNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:216:2: ( ( ( rule__XConstantNoComment__Group__0 ) ) )
            // InternalXContext.g:217:2: ( ( rule__XConstantNoComment__Group__0 ) )
            {
            // InternalXContext.g:217:2: ( ( rule__XConstantNoComment__Group__0 ) )
            // InternalXContext.g:218:3: ( rule__XConstantNoComment__Group__0 )
            {
             before(grammarAccess.getXConstantNoCommentAccess().getGroup()); 
            // InternalXContext.g:219:3: ( rule__XConstantNoComment__Group__0 )
            // InternalXContext.g:219:4: rule__XConstantNoComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XConstantNoComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXConstantNoCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXConstantNoComment"


    // $ANTLR start "entryRuleXConstantMLComment"
    // InternalXContext.g:228:1: entryRuleXConstantMLComment : ruleXConstantMLComment EOF ;
    public final void entryRuleXConstantMLComment() throws RecognitionException {
        try {
            // InternalXContext.g:229:1: ( ruleXConstantMLComment EOF )
            // InternalXContext.g:230:1: ruleXConstantMLComment EOF
            {
             before(grammarAccess.getXConstantMLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXConstantMLComment();

            state._fsp--;

             after(grammarAccess.getXConstantMLCommentRule()); 
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
    // $ANTLR end "entryRuleXConstantMLComment"


    // $ANTLR start "ruleXConstantMLComment"
    // InternalXContext.g:237:1: ruleXConstantMLComment : ( ( rule__XConstantMLComment__Group__0 ) ) ;
    public final void ruleXConstantMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:241:2: ( ( ( rule__XConstantMLComment__Group__0 ) ) )
            // InternalXContext.g:242:2: ( ( rule__XConstantMLComment__Group__0 ) )
            {
            // InternalXContext.g:242:2: ( ( rule__XConstantMLComment__Group__0 ) )
            // InternalXContext.g:243:3: ( rule__XConstantMLComment__Group__0 )
            {
             before(grammarAccess.getXConstantMLCommentAccess().getGroup()); 
            // InternalXContext.g:244:3: ( rule__XConstantMLComment__Group__0 )
            // InternalXContext.g:244:4: rule__XConstantMLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XConstantMLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXConstantMLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXConstantMLComment"


    // $ANTLR start "entryRuleXConstantSLComment"
    // InternalXContext.g:253:1: entryRuleXConstantSLComment : ruleXConstantSLComment EOF ;
    public final void entryRuleXConstantSLComment() throws RecognitionException {
        try {
            // InternalXContext.g:254:1: ( ruleXConstantSLComment EOF )
            // InternalXContext.g:255:1: ruleXConstantSLComment EOF
            {
             before(grammarAccess.getXConstantSLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXConstantSLComment();

            state._fsp--;

             after(grammarAccess.getXConstantSLCommentRule()); 
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
    // $ANTLR end "entryRuleXConstantSLComment"


    // $ANTLR start "ruleXConstantSLComment"
    // InternalXContext.g:262:1: ruleXConstantSLComment : ( ( rule__XConstantSLComment__Group__0 ) ) ;
    public final void ruleXConstantSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:266:2: ( ( ( rule__XConstantSLComment__Group__0 ) ) )
            // InternalXContext.g:267:2: ( ( rule__XConstantSLComment__Group__0 ) )
            {
            // InternalXContext.g:267:2: ( ( rule__XConstantSLComment__Group__0 ) )
            // InternalXContext.g:268:3: ( rule__XConstantSLComment__Group__0 )
            {
             before(grammarAccess.getXConstantSLCommentAccess().getGroup()); 
            // InternalXContext.g:269:3: ( rule__XConstantSLComment__Group__0 )
            // InternalXContext.g:269:4: rule__XConstantSLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XConstantSLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXConstantSLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXConstantSLComment"


    // $ANTLR start "entryRuleXAxiom"
    // InternalXContext.g:278:1: entryRuleXAxiom : ruleXAxiom EOF ;
    public final void entryRuleXAxiom() throws RecognitionException {
        try {
            // InternalXContext.g:279:1: ( ruleXAxiom EOF )
            // InternalXContext.g:280:1: ruleXAxiom EOF
            {
             before(grammarAccess.getXAxiomRule()); 
            pushFollow(FOLLOW_1);
            ruleXAxiom();

            state._fsp--;

             after(grammarAccess.getXAxiomRule()); 
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
    // $ANTLR end "entryRuleXAxiom"


    // $ANTLR start "ruleXAxiom"
    // InternalXContext.g:287:1: ruleXAxiom : ( ( rule__XAxiom__Alternatives ) ) ;
    public final void ruleXAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:291:2: ( ( ( rule__XAxiom__Alternatives ) ) )
            // InternalXContext.g:292:2: ( ( rule__XAxiom__Alternatives ) )
            {
            // InternalXContext.g:292:2: ( ( rule__XAxiom__Alternatives ) )
            // InternalXContext.g:293:3: ( rule__XAxiom__Alternatives )
            {
             before(grammarAccess.getXAxiomAccess().getAlternatives()); 
            // InternalXContext.g:294:3: ( rule__XAxiom__Alternatives )
            // InternalXContext.g:294:4: rule__XAxiom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XAxiom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXAxiom"


    // $ANTLR start "entryRuleXAxiomNoComment"
    // InternalXContext.g:303:1: entryRuleXAxiomNoComment : ruleXAxiomNoComment EOF ;
    public final void entryRuleXAxiomNoComment() throws RecognitionException {
        try {
            // InternalXContext.g:304:1: ( ruleXAxiomNoComment EOF )
            // InternalXContext.g:305:1: ruleXAxiomNoComment EOF
            {
             before(grammarAccess.getXAxiomNoCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXAxiomNoComment();

            state._fsp--;

             after(grammarAccess.getXAxiomNoCommentRule()); 
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
    // $ANTLR end "entryRuleXAxiomNoComment"


    // $ANTLR start "ruleXAxiomNoComment"
    // InternalXContext.g:312:1: ruleXAxiomNoComment : ( ( rule__XAxiomNoComment__Group__0 ) ) ;
    public final void ruleXAxiomNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:316:2: ( ( ( rule__XAxiomNoComment__Group__0 ) ) )
            // InternalXContext.g:317:2: ( ( rule__XAxiomNoComment__Group__0 ) )
            {
            // InternalXContext.g:317:2: ( ( rule__XAxiomNoComment__Group__0 ) )
            // InternalXContext.g:318:3: ( rule__XAxiomNoComment__Group__0 )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getGroup()); 
            // InternalXContext.g:319:3: ( rule__XAxiomNoComment__Group__0 )
            // InternalXContext.g:319:4: rule__XAxiomNoComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomNoComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomNoCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXAxiomNoComment"


    // $ANTLR start "entryRuleXAxiomMLComment"
    // InternalXContext.g:328:1: entryRuleXAxiomMLComment : ruleXAxiomMLComment EOF ;
    public final void entryRuleXAxiomMLComment() throws RecognitionException {
        try {
            // InternalXContext.g:329:1: ( ruleXAxiomMLComment EOF )
            // InternalXContext.g:330:1: ruleXAxiomMLComment EOF
            {
             before(grammarAccess.getXAxiomMLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXAxiomMLComment();

            state._fsp--;

             after(grammarAccess.getXAxiomMLCommentRule()); 
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
    // $ANTLR end "entryRuleXAxiomMLComment"


    // $ANTLR start "ruleXAxiomMLComment"
    // InternalXContext.g:337:1: ruleXAxiomMLComment : ( ( rule__XAxiomMLComment__Group__0 ) ) ;
    public final void ruleXAxiomMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:341:2: ( ( ( rule__XAxiomMLComment__Group__0 ) ) )
            // InternalXContext.g:342:2: ( ( rule__XAxiomMLComment__Group__0 ) )
            {
            // InternalXContext.g:342:2: ( ( rule__XAxiomMLComment__Group__0 ) )
            // InternalXContext.g:343:3: ( rule__XAxiomMLComment__Group__0 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getGroup()); 
            // InternalXContext.g:344:3: ( rule__XAxiomMLComment__Group__0 )
            // InternalXContext.g:344:4: rule__XAxiomMLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomMLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomMLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXAxiomMLComment"


    // $ANTLR start "entryRuleXAxiomSLComment"
    // InternalXContext.g:353:1: entryRuleXAxiomSLComment : ruleXAxiomSLComment EOF ;
    public final void entryRuleXAxiomSLComment() throws RecognitionException {
        try {
            // InternalXContext.g:354:1: ( ruleXAxiomSLComment EOF )
            // InternalXContext.g:355:1: ruleXAxiomSLComment EOF
            {
             before(grammarAccess.getXAxiomSLCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXAxiomSLComment();

            state._fsp--;

             after(grammarAccess.getXAxiomSLCommentRule()); 
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
    // $ANTLR end "entryRuleXAxiomSLComment"


    // $ANTLR start "ruleXAxiomSLComment"
    // InternalXContext.g:362:1: ruleXAxiomSLComment : ( ( rule__XAxiomSLComment__Group__0 ) ) ;
    public final void ruleXAxiomSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:366:2: ( ( ( rule__XAxiomSLComment__Group__0 ) ) )
            // InternalXContext.g:367:2: ( ( rule__XAxiomSLComment__Group__0 ) )
            {
            // InternalXContext.g:367:2: ( ( rule__XAxiomSLComment__Group__0 ) )
            // InternalXContext.g:368:3: ( rule__XAxiomSLComment__Group__0 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getGroup()); 
            // InternalXContext.g:369:3: ( rule__XAxiomSLComment__Group__0 )
            // InternalXContext.g:369:4: rule__XAxiomSLComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomSLComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomSLCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXAxiomSLComment"


    // $ANTLR start "rule__XContext__CommentAlternatives_1_0"
    // InternalXContext.g:377:1: rule__XContext__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XContext__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:381:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXContext.g:382:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXContext.g:382:2: ( RULE_ML_COMMENT )
                    // InternalXContext.g:383:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:388:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXContext.g:388:2: ( RULE_SL_COMMENT )
                    // InternalXContext.g:389:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXContextAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXContextAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__XContext__CommentAlternatives_1_0"


    // $ANTLR start "rule__XCarrierSet__Alternatives"
    // InternalXContext.g:398:1: rule__XCarrierSet__Alternatives : ( ( ruleXCarrierSetNoComment ) | ( ruleXCarrierSetMLComment ) | ( ruleXCarrierSetSLComment ) );
    public final void rule__XCarrierSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:402:1: ( ( ruleXCarrierSetNoComment ) | ( ruleXCarrierSetMLComment ) | ( ruleXCarrierSetSLComment ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==RULE_ML_COMMENT||LA2_1==RULE_ID||LA2_1==13||(LA2_1>=16 && LA2_1<=17)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_SL_COMMENT) ) {
                    alt2=3;
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
                    // InternalXContext.g:403:2: ( ruleXCarrierSetNoComment )
                    {
                    // InternalXContext.g:403:2: ( ruleXCarrierSetNoComment )
                    // InternalXContext.g:404:3: ruleXCarrierSetNoComment
                    {
                     before(grammarAccess.getXCarrierSetAccess().getXCarrierSetNoCommentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleXCarrierSetNoComment();

                    state._fsp--;

                     after(grammarAccess.getXCarrierSetAccess().getXCarrierSetNoCommentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:409:2: ( ruleXCarrierSetMLComment )
                    {
                    // InternalXContext.g:409:2: ( ruleXCarrierSetMLComment )
                    // InternalXContext.g:410:3: ruleXCarrierSetMLComment
                    {
                     before(grammarAccess.getXCarrierSetAccess().getXCarrierSetMLCommentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXCarrierSetMLComment();

                    state._fsp--;

                     after(grammarAccess.getXCarrierSetAccess().getXCarrierSetMLCommentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:415:2: ( ruleXCarrierSetSLComment )
                    {
                    // InternalXContext.g:415:2: ( ruleXCarrierSetSLComment )
                    // InternalXContext.g:416:3: ruleXCarrierSetSLComment
                    {
                     before(grammarAccess.getXCarrierSetAccess().getXCarrierSetSLCommentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleXCarrierSetSLComment();

                    state._fsp--;

                     after(grammarAccess.getXCarrierSetAccess().getXCarrierSetSLCommentParserRuleCall_2()); 

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
    // $ANTLR end "rule__XCarrierSet__Alternatives"


    // $ANTLR start "rule__XConstant__Alternatives"
    // InternalXContext.g:425:1: rule__XConstant__Alternatives : ( ( ruleXConstantNoComment ) | ( ruleXConstantMLComment ) | ( ruleXConstantSLComment ) );
    public final void rule__XConstant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:429:1: ( ( ruleXConstantNoComment ) | ( ruleXConstantMLComment ) | ( ruleXConstantSLComment ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_SL_COMMENT) ) {
                    alt3=3;
                }
                else if ( (LA3_1==EOF||LA3_1==RULE_ML_COMMENT||LA3_1==RULE_ID||LA3_1==13||LA3_1==17) ) {
                    alt3=1;
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
                    // InternalXContext.g:430:2: ( ruleXConstantNoComment )
                    {
                    // InternalXContext.g:430:2: ( ruleXConstantNoComment )
                    // InternalXContext.g:431:3: ruleXConstantNoComment
                    {
                     before(grammarAccess.getXConstantAccess().getXConstantNoCommentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleXConstantNoComment();

                    state._fsp--;

                     after(grammarAccess.getXConstantAccess().getXConstantNoCommentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:436:2: ( ruleXConstantMLComment )
                    {
                    // InternalXContext.g:436:2: ( ruleXConstantMLComment )
                    // InternalXContext.g:437:3: ruleXConstantMLComment
                    {
                     before(grammarAccess.getXConstantAccess().getXConstantMLCommentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXConstantMLComment();

                    state._fsp--;

                     after(grammarAccess.getXConstantAccess().getXConstantMLCommentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:442:2: ( ruleXConstantSLComment )
                    {
                    // InternalXContext.g:442:2: ( ruleXConstantSLComment )
                    // InternalXContext.g:443:3: ruleXConstantSLComment
                    {
                     before(grammarAccess.getXConstantAccess().getXConstantSLCommentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleXConstantSLComment();

                    state._fsp--;

                     after(grammarAccess.getXConstantAccess().getXConstantSLCommentParserRuleCall_2()); 

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
    // $ANTLR end "rule__XConstant__Alternatives"


    // $ANTLR start "rule__XAxiom__Alternatives"
    // InternalXContext.g:452:1: rule__XAxiom__Alternatives : ( ( ruleXAxiomNoComment ) | ( ruleXAxiomMLComment ) | ( ruleXAxiomSLComment ) );
    public final void rule__XAxiom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:456:1: ( ( ruleXAxiomNoComment ) | ( ruleXAxiomMLComment ) | ( ruleXAxiomSLComment ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_XLABEL) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==EOF||LA4_4==RULE_ML_COMMENT||LA4_4==RULE_XLABEL||LA4_4==13) ) {
                            alt4=1;
                        }
                        else if ( (LA4_4==RULE_SL_COMMENT) ) {
                            alt4=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_ML_COMMENT:
                    case RULE_XLABEL:
                    case 13:
                        {
                        alt4=1;
                        }
                        break;
                    case RULE_SL_COMMENT:
                        {
                        alt4=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }

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
                    // InternalXContext.g:457:2: ( ruleXAxiomNoComment )
                    {
                    // InternalXContext.g:457:2: ( ruleXAxiomNoComment )
                    // InternalXContext.g:458:3: ruleXAxiomNoComment
                    {
                     before(grammarAccess.getXAxiomAccess().getXAxiomNoCommentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleXAxiomNoComment();

                    state._fsp--;

                     after(grammarAccess.getXAxiomAccess().getXAxiomNoCommentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:463:2: ( ruleXAxiomMLComment )
                    {
                    // InternalXContext.g:463:2: ( ruleXAxiomMLComment )
                    // InternalXContext.g:464:3: ruleXAxiomMLComment
                    {
                     before(grammarAccess.getXAxiomAccess().getXAxiomMLCommentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXAxiomMLComment();

                    state._fsp--;

                     after(grammarAccess.getXAxiomAccess().getXAxiomMLCommentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:469:2: ( ruleXAxiomSLComment )
                    {
                    // InternalXContext.g:469:2: ( ruleXAxiomSLComment )
                    // InternalXContext.g:470:3: ruleXAxiomSLComment
                    {
                     before(grammarAccess.getXAxiomAccess().getXAxiomSLCommentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleXAxiomSLComment();

                    state._fsp--;

                     after(grammarAccess.getXAxiomAccess().getXAxiomSLCommentParserRuleCall_2()); 

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
    // $ANTLR end "rule__XAxiom__Alternatives"


    // $ANTLR start "rule__XContext__Group__0"
    // InternalXContext.g:479:1: rule__XContext__Group__0 : rule__XContext__Group__0__Impl rule__XContext__Group__1 ;
    public final void rule__XContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:483:1: ( rule__XContext__Group__0__Impl rule__XContext__Group__1 )
            // InternalXContext.g:484:2: rule__XContext__Group__0__Impl rule__XContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__XContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__0"


    // $ANTLR start "rule__XContext__Group__0__Impl"
    // InternalXContext.g:491:1: rule__XContext__Group__0__Impl : ( () ) ;
    public final void rule__XContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:495:1: ( ( () ) )
            // InternalXContext.g:496:1: ( () )
            {
            // InternalXContext.g:496:1: ( () )
            // InternalXContext.g:497:2: ()
            {
             before(grammarAccess.getXContextAccess().getContextAction_0()); 
            // InternalXContext.g:498:2: ()
            // InternalXContext.g:498:3: 
            {
            }

             after(grammarAccess.getXContextAccess().getContextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__0__Impl"


    // $ANTLR start "rule__XContext__Group__1"
    // InternalXContext.g:506:1: rule__XContext__Group__1 : rule__XContext__Group__1__Impl rule__XContext__Group__2 ;
    public final void rule__XContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:510:1: ( rule__XContext__Group__1__Impl rule__XContext__Group__2 )
            // InternalXContext.g:511:2: rule__XContext__Group__1__Impl rule__XContext__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__XContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__1"


    // $ANTLR start "rule__XContext__Group__1__Impl"
    // InternalXContext.g:518:1: rule__XContext__Group__1__Impl : ( ( rule__XContext__CommentAssignment_1 )? ) ;
    public final void rule__XContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:522:1: ( ( ( rule__XContext__CommentAssignment_1 )? ) )
            // InternalXContext.g:523:1: ( ( rule__XContext__CommentAssignment_1 )? )
            {
            // InternalXContext.g:523:1: ( ( rule__XContext__CommentAssignment_1 )? )
            // InternalXContext.g:524:2: ( rule__XContext__CommentAssignment_1 )?
            {
             before(grammarAccess.getXContextAccess().getCommentAssignment_1()); 
            // InternalXContext.g:525:2: ( rule__XContext__CommentAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ML_COMMENT && LA5_0<=RULE_SL_COMMENT)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXContext.g:525:3: rule__XContext__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__1__Impl"


    // $ANTLR start "rule__XContext__Group__2"
    // InternalXContext.g:533:1: rule__XContext__Group__2 : rule__XContext__Group__2__Impl rule__XContext__Group__3 ;
    public final void rule__XContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:537:1: ( rule__XContext__Group__2__Impl rule__XContext__Group__3 )
            // InternalXContext.g:538:2: rule__XContext__Group__2__Impl rule__XContext__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__XContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__2"


    // $ANTLR start "rule__XContext__Group__2__Impl"
    // InternalXContext.g:545:1: rule__XContext__Group__2__Impl : ( 'context' ) ;
    public final void rule__XContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:549:1: ( ( 'context' ) )
            // InternalXContext.g:550:1: ( 'context' )
            {
            // InternalXContext.g:550:1: ( 'context' )
            // InternalXContext.g:551:2: 'context'
            {
             before(grammarAccess.getXContextAccess().getContextKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getContextKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__2__Impl"


    // $ANTLR start "rule__XContext__Group__3"
    // InternalXContext.g:560:1: rule__XContext__Group__3 : rule__XContext__Group__3__Impl rule__XContext__Group__4 ;
    public final void rule__XContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:564:1: ( rule__XContext__Group__3__Impl rule__XContext__Group__4 )
            // InternalXContext.g:565:2: rule__XContext__Group__3__Impl rule__XContext__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__3"


    // $ANTLR start "rule__XContext__Group__3__Impl"
    // InternalXContext.g:572:1: rule__XContext__Group__3__Impl : ( ( rule__XContext__NameAssignment_3 ) ) ;
    public final void rule__XContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:576:1: ( ( ( rule__XContext__NameAssignment_3 ) ) )
            // InternalXContext.g:577:1: ( ( rule__XContext__NameAssignment_3 ) )
            {
            // InternalXContext.g:577:1: ( ( rule__XContext__NameAssignment_3 ) )
            // InternalXContext.g:578:2: ( rule__XContext__NameAssignment_3 )
            {
             before(grammarAccess.getXContextAccess().getNameAssignment_3()); 
            // InternalXContext.g:579:2: ( rule__XContext__NameAssignment_3 )
            // InternalXContext.g:579:3: rule__XContext__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XContext__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__3__Impl"


    // $ANTLR start "rule__XContext__Group__4"
    // InternalXContext.g:587:1: rule__XContext__Group__4 : rule__XContext__Group__4__Impl rule__XContext__Group__5 ;
    public final void rule__XContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:591:1: ( rule__XContext__Group__4__Impl rule__XContext__Group__5 )
            // InternalXContext.g:592:2: rule__XContext__Group__4__Impl rule__XContext__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__4"


    // $ANTLR start "rule__XContext__Group__4__Impl"
    // InternalXContext.g:599:1: rule__XContext__Group__4__Impl : ( ( rule__XContext__Group_4__0 )? ) ;
    public final void rule__XContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:603:1: ( ( ( rule__XContext__Group_4__0 )? ) )
            // InternalXContext.g:604:1: ( ( rule__XContext__Group_4__0 )? )
            {
            // InternalXContext.g:604:1: ( ( rule__XContext__Group_4__0 )? )
            // InternalXContext.g:605:2: ( rule__XContext__Group_4__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_4()); 
            // InternalXContext.g:606:2: ( rule__XContext__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXContext.g:606:3: rule__XContext__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__4__Impl"


    // $ANTLR start "rule__XContext__Group__5"
    // InternalXContext.g:614:1: rule__XContext__Group__5 : rule__XContext__Group__5__Impl rule__XContext__Group__6 ;
    public final void rule__XContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:618:1: ( rule__XContext__Group__5__Impl rule__XContext__Group__6 )
            // InternalXContext.g:619:2: rule__XContext__Group__5__Impl rule__XContext__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__5"


    // $ANTLR start "rule__XContext__Group__5__Impl"
    // InternalXContext.g:626:1: rule__XContext__Group__5__Impl : ( ( rule__XContext__Group_5__0 )? ) ;
    public final void rule__XContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:630:1: ( ( ( rule__XContext__Group_5__0 )? ) )
            // InternalXContext.g:631:1: ( ( rule__XContext__Group_5__0 )? )
            {
            // InternalXContext.g:631:1: ( ( rule__XContext__Group_5__0 )? )
            // InternalXContext.g:632:2: ( rule__XContext__Group_5__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_5()); 
            // InternalXContext.g:633:2: ( rule__XContext__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXContext.g:633:3: rule__XContext__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__5__Impl"


    // $ANTLR start "rule__XContext__Group__6"
    // InternalXContext.g:641:1: rule__XContext__Group__6 : rule__XContext__Group__6__Impl rule__XContext__Group__7 ;
    public final void rule__XContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:645:1: ( rule__XContext__Group__6__Impl rule__XContext__Group__7 )
            // InternalXContext.g:646:2: rule__XContext__Group__6__Impl rule__XContext__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__6"


    // $ANTLR start "rule__XContext__Group__6__Impl"
    // InternalXContext.g:653:1: rule__XContext__Group__6__Impl : ( ( rule__XContext__Group_6__0 )? ) ;
    public final void rule__XContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:657:1: ( ( ( rule__XContext__Group_6__0 )? ) )
            // InternalXContext.g:658:1: ( ( rule__XContext__Group_6__0 )? )
            {
            // InternalXContext.g:658:1: ( ( rule__XContext__Group_6__0 )? )
            // InternalXContext.g:659:2: ( rule__XContext__Group_6__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_6()); 
            // InternalXContext.g:660:2: ( rule__XContext__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXContext.g:660:3: rule__XContext__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__6__Impl"


    // $ANTLR start "rule__XContext__Group__7"
    // InternalXContext.g:668:1: rule__XContext__Group__7 : rule__XContext__Group__7__Impl rule__XContext__Group__8 ;
    public final void rule__XContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:672:1: ( rule__XContext__Group__7__Impl rule__XContext__Group__8 )
            // InternalXContext.g:673:2: rule__XContext__Group__7__Impl rule__XContext__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__7"


    // $ANTLR start "rule__XContext__Group__7__Impl"
    // InternalXContext.g:680:1: rule__XContext__Group__7__Impl : ( ( rule__XContext__Group_7__0 )? ) ;
    public final void rule__XContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:684:1: ( ( ( rule__XContext__Group_7__0 )? ) )
            // InternalXContext.g:685:1: ( ( rule__XContext__Group_7__0 )? )
            {
            // InternalXContext.g:685:1: ( ( rule__XContext__Group_7__0 )? )
            // InternalXContext.g:686:2: ( rule__XContext__Group_7__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_7()); 
            // InternalXContext.g:687:2: ( rule__XContext__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXContext.g:687:3: rule__XContext__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__7__Impl"


    // $ANTLR start "rule__XContext__Group__8"
    // InternalXContext.g:695:1: rule__XContext__Group__8 : rule__XContext__Group__8__Impl ;
    public final void rule__XContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:699:1: ( rule__XContext__Group__8__Impl )
            // InternalXContext.g:700:2: rule__XContext__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__8"


    // $ANTLR start "rule__XContext__Group__8__Impl"
    // InternalXContext.g:706:1: rule__XContext__Group__8__Impl : ( 'end' ) ;
    public final void rule__XContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:710:1: ( ( 'end' ) )
            // InternalXContext.g:711:1: ( 'end' )
            {
            // InternalXContext.g:711:1: ( 'end' )
            // InternalXContext.g:712:2: 'end'
            {
             before(grammarAccess.getXContextAccess().getEndKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getEndKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__8__Impl"


    // $ANTLR start "rule__XContext__Group_4__0"
    // InternalXContext.g:722:1: rule__XContext__Group_4__0 : rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 ;
    public final void rule__XContext__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:726:1: ( rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 )
            // InternalXContext.g:727:2: rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__XContext__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4__0"


    // $ANTLR start "rule__XContext__Group_4__0__Impl"
    // InternalXContext.g:734:1: rule__XContext__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__XContext__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:738:1: ( ( 'extends' ) )
            // InternalXContext.g:739:1: ( 'extends' )
            {
            // InternalXContext.g:739:1: ( 'extends' )
            // InternalXContext.g:740:2: 'extends'
            {
             before(grammarAccess.getXContextAccess().getExtendsKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4__0__Impl"


    // $ANTLR start "rule__XContext__Group_4__1"
    // InternalXContext.g:749:1: rule__XContext__Group_4__1 : rule__XContext__Group_4__1__Impl ;
    public final void rule__XContext__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:753:1: ( rule__XContext__Group_4__1__Impl )
            // InternalXContext.g:754:2: rule__XContext__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4__1"


    // $ANTLR start "rule__XContext__Group_4__1__Impl"
    // InternalXContext.g:760:1: rule__XContext__Group_4__1__Impl : ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) ;
    public final void rule__XContext__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:764:1: ( ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) )
            // InternalXContext.g:765:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            {
            // InternalXContext.g:765:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            // InternalXContext.g:766:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            {
            // InternalXContext.g:766:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) )
            // InternalXContext.g:767:3: ( rule__XContext__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:768:3: ( rule__XContext__ExtendsAssignment_4_1 )
            // InternalXContext.g:768:4: rule__XContext__ExtendsAssignment_4_1
            {
            pushFollow(FOLLOW_6);
            rule__XContext__ExtendsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 

            }

            // InternalXContext.g:771:2: ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            // InternalXContext.g:772:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:773:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXContext.g:773:4: rule__XContext__ExtendsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__XContext__ExtendsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 

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
    // $ANTLR end "rule__XContext__Group_4__1__Impl"


    // $ANTLR start "rule__XContext__Group_5__0"
    // InternalXContext.g:783:1: rule__XContext__Group_5__0 : rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 ;
    public final void rule__XContext__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:787:1: ( rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 )
            // InternalXContext.g:788:2: rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__XContext__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5__0"


    // $ANTLR start "rule__XContext__Group_5__0__Impl"
    // InternalXContext.g:795:1: rule__XContext__Group_5__0__Impl : ( 'sets' ) ;
    public final void rule__XContext__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:799:1: ( ( 'sets' ) )
            // InternalXContext.g:800:1: ( 'sets' )
            {
            // InternalXContext.g:800:1: ( 'sets' )
            // InternalXContext.g:801:2: 'sets'
            {
             before(grammarAccess.getXContextAccess().getSetsKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getSetsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5__0__Impl"


    // $ANTLR start "rule__XContext__Group_5__1"
    // InternalXContext.g:810:1: rule__XContext__Group_5__1 : rule__XContext__Group_5__1__Impl ;
    public final void rule__XContext__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:814:1: ( rule__XContext__Group_5__1__Impl )
            // InternalXContext.g:815:2: rule__XContext__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5__1"


    // $ANTLR start "rule__XContext__Group_5__1__Impl"
    // InternalXContext.g:821:1: rule__XContext__Group_5__1__Impl : ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) ) ;
    public final void rule__XContext__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:825:1: ( ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) ) )
            // InternalXContext.g:826:1: ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) )
            {
            // InternalXContext.g:826:1: ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) )
            // InternalXContext.g:827:2: ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* )
            {
            // InternalXContext.g:827:2: ( ( rule__XContext__SetsAssignment_5_1 ) )
            // InternalXContext.g:828:3: ( rule__XContext__SetsAssignment_5_1 )
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 
            // InternalXContext.g:829:3: ( rule__XContext__SetsAssignment_5_1 )
            // InternalXContext.g:829:4: rule__XContext__SetsAssignment_5_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__SetsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 

            }

            // InternalXContext.g:832:2: ( ( rule__XContext__SetsAssignment_5_1 )* )
            // InternalXContext.g:833:3: ( rule__XContext__SetsAssignment_5_1 )*
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 
            // InternalXContext.g:834:3: ( rule__XContext__SetsAssignment_5_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ML_COMMENT||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXContext.g:834:4: rule__XContext__SetsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XContext__SetsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 

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
    // $ANTLR end "rule__XContext__Group_5__1__Impl"


    // $ANTLR start "rule__XContext__Group_6__0"
    // InternalXContext.g:844:1: rule__XContext__Group_6__0 : rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 ;
    public final void rule__XContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:848:1: ( rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 )
            // InternalXContext.g:849:2: rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__XContext__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_6__0"


    // $ANTLR start "rule__XContext__Group_6__0__Impl"
    // InternalXContext.g:856:1: rule__XContext__Group_6__0__Impl : ( 'constants' ) ;
    public final void rule__XContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:860:1: ( ( 'constants' ) )
            // InternalXContext.g:861:1: ( 'constants' )
            {
            // InternalXContext.g:861:1: ( 'constants' )
            // InternalXContext.g:862:2: 'constants'
            {
             before(grammarAccess.getXContextAccess().getConstantsKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getConstantsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_6__0__Impl"


    // $ANTLR start "rule__XContext__Group_6__1"
    // InternalXContext.g:871:1: rule__XContext__Group_6__1 : rule__XContext__Group_6__1__Impl ;
    public final void rule__XContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:875:1: ( rule__XContext__Group_6__1__Impl )
            // InternalXContext.g:876:2: rule__XContext__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_6__1"


    // $ANTLR start "rule__XContext__Group_6__1__Impl"
    // InternalXContext.g:882:1: rule__XContext__Group_6__1__Impl : ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) ) ;
    public final void rule__XContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:886:1: ( ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) ) )
            // InternalXContext.g:887:1: ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) )
            {
            // InternalXContext.g:887:1: ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) )
            // InternalXContext.g:888:2: ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* )
            {
            // InternalXContext.g:888:2: ( ( rule__XContext__ConstantsAssignment_6_1 ) )
            // InternalXContext.g:889:3: ( rule__XContext__ConstantsAssignment_6_1 )
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 
            // InternalXContext.g:890:3: ( rule__XContext__ConstantsAssignment_6_1 )
            // InternalXContext.g:890:4: rule__XContext__ConstantsAssignment_6_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__ConstantsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 

            }

            // InternalXContext.g:893:2: ( ( rule__XContext__ConstantsAssignment_6_1 )* )
            // InternalXContext.g:894:3: ( rule__XContext__ConstantsAssignment_6_1 )*
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 
            // InternalXContext.g:895:3: ( rule__XContext__ConstantsAssignment_6_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ML_COMMENT||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXContext.g:895:4: rule__XContext__ConstantsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XContext__ConstantsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 

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
    // $ANTLR end "rule__XContext__Group_6__1__Impl"


    // $ANTLR start "rule__XContext__Group_7__0"
    // InternalXContext.g:905:1: rule__XContext__Group_7__0 : rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 ;
    public final void rule__XContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:909:1: ( rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 )
            // InternalXContext.g:910:2: rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__XContext__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_7__0"


    // $ANTLR start "rule__XContext__Group_7__0__Impl"
    // InternalXContext.g:917:1: rule__XContext__Group_7__0__Impl : ( 'axioms' ) ;
    public final void rule__XContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:921:1: ( ( 'axioms' ) )
            // InternalXContext.g:922:1: ( 'axioms' )
            {
            // InternalXContext.g:922:1: ( 'axioms' )
            // InternalXContext.g:923:2: 'axioms'
            {
             before(grammarAccess.getXContextAccess().getAxiomsKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getAxiomsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_7__0__Impl"


    // $ANTLR start "rule__XContext__Group_7__1"
    // InternalXContext.g:932:1: rule__XContext__Group_7__1 : rule__XContext__Group_7__1__Impl ;
    public final void rule__XContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:936:1: ( rule__XContext__Group_7__1__Impl )
            // InternalXContext.g:937:2: rule__XContext__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_7__1"


    // $ANTLR start "rule__XContext__Group_7__1__Impl"
    // InternalXContext.g:943:1: rule__XContext__Group_7__1__Impl : ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) ;
    public final void rule__XContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:947:1: ( ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) )
            // InternalXContext.g:948:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            {
            // InternalXContext.g:948:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            // InternalXContext.g:949:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            {
            // InternalXContext.g:949:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) )
            // InternalXContext.g:950:3: ( rule__XContext__AxiomsAssignment_7_1 )
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:951:3: ( rule__XContext__AxiomsAssignment_7_1 )
            // InternalXContext.g:951:4: rule__XContext__AxiomsAssignment_7_1
            {
            pushFollow(FOLLOW_10);
            rule__XContext__AxiomsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 

            }

            // InternalXContext.g:954:2: ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            // InternalXContext.g:955:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:956:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ML_COMMENT||LA13_0==RULE_XLABEL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXContext.g:956:4: rule__XContext__AxiomsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XContext__AxiomsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 

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
    // $ANTLR end "rule__XContext__Group_7__1__Impl"


    // $ANTLR start "rule__XCarrierSetNoComment__Group__0"
    // InternalXContext.g:966:1: rule__XCarrierSetNoComment__Group__0 : rule__XCarrierSetNoComment__Group__0__Impl rule__XCarrierSetNoComment__Group__1 ;
    public final void rule__XCarrierSetNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:970:1: ( rule__XCarrierSetNoComment__Group__0__Impl rule__XCarrierSetNoComment__Group__1 )
            // InternalXContext.g:971:2: rule__XCarrierSetNoComment__Group__0__Impl rule__XCarrierSetNoComment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XCarrierSetNoComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCarrierSetNoComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetNoComment__Group__0"


    // $ANTLR start "rule__XCarrierSetNoComment__Group__0__Impl"
    // InternalXContext.g:978:1: rule__XCarrierSetNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSetNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:982:1: ( ( () ) )
            // InternalXContext.g:983:1: ( () )
            {
            // InternalXContext.g:983:1: ( () )
            // InternalXContext.g:984:2: ()
            {
             before(grammarAccess.getXCarrierSetNoCommentAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:985:2: ()
            // InternalXContext.g:985:3: 
            {
            }

             after(grammarAccess.getXCarrierSetNoCommentAccess().getCarrierSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetNoComment__Group__0__Impl"


    // $ANTLR start "rule__XCarrierSetNoComment__Group__1"
    // InternalXContext.g:993:1: rule__XCarrierSetNoComment__Group__1 : rule__XCarrierSetNoComment__Group__1__Impl ;
    public final void rule__XCarrierSetNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:997:1: ( rule__XCarrierSetNoComment__Group__1__Impl )
            // InternalXContext.g:998:2: rule__XCarrierSetNoComment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetNoComment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetNoComment__Group__1"


    // $ANTLR start "rule__XCarrierSetNoComment__Group__1__Impl"
    // InternalXContext.g:1004:1: rule__XCarrierSetNoComment__Group__1__Impl : ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) ) ;
    public final void rule__XCarrierSetNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1008:1: ( ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1009:1: ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1009:1: ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) )
            // InternalXContext.g:1010:2: ( rule__XCarrierSetNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetNoCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1011:2: ( rule__XCarrierSetNoComment__NameAssignment_1 )
            // InternalXContext.g:1011:3: rule__XCarrierSetNoComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetNoComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetNoCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetNoComment__Group__1__Impl"


    // $ANTLR start "rule__XCarrierSetMLComment__Group__0"
    // InternalXContext.g:1020:1: rule__XCarrierSetMLComment__Group__0 : rule__XCarrierSetMLComment__Group__0__Impl rule__XCarrierSetMLComment__Group__1 ;
    public final void rule__XCarrierSetMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1024:1: ( rule__XCarrierSetMLComment__Group__0__Impl rule__XCarrierSetMLComment__Group__1 )
            // InternalXContext.g:1025:2: rule__XCarrierSetMLComment__Group__0__Impl rule__XCarrierSetMLComment__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__XCarrierSetMLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCarrierSetMLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetMLComment__Group__0"


    // $ANTLR start "rule__XCarrierSetMLComment__Group__0__Impl"
    // InternalXContext.g:1032:1: rule__XCarrierSetMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSetMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1036:1: ( ( () ) )
            // InternalXContext.g:1037:1: ( () )
            {
            // InternalXContext.g:1037:1: ( () )
            // InternalXContext.g:1038:2: ()
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:1039:2: ()
            // InternalXContext.g:1039:3: 
            {
            }

             after(grammarAccess.getXCarrierSetMLCommentAccess().getCarrierSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetMLComment__Group__0__Impl"


    // $ANTLR start "rule__XCarrierSetMLComment__Group__1"
    // InternalXContext.g:1047:1: rule__XCarrierSetMLComment__Group__1 : rule__XCarrierSetMLComment__Group__1__Impl rule__XCarrierSetMLComment__Group__2 ;
    public final void rule__XCarrierSetMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1051:1: ( rule__XCarrierSetMLComment__Group__1__Impl rule__XCarrierSetMLComment__Group__2 )
            // InternalXContext.g:1052:2: rule__XCarrierSetMLComment__Group__1__Impl rule__XCarrierSetMLComment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XCarrierSetMLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCarrierSetMLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetMLComment__Group__1"


    // $ANTLR start "rule__XCarrierSetMLComment__Group__1__Impl"
    // InternalXContext.g:1059:1: rule__XCarrierSetMLComment__Group__1__Impl : ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XCarrierSetMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1063:1: ( ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) ) )
            // InternalXContext.g:1064:1: ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) )
            {
            // InternalXContext.g:1064:1: ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) )
            // InternalXContext.g:1065:2: ( rule__XCarrierSetMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1066:2: ( rule__XCarrierSetMLComment__CommentAssignment_1 )
            // InternalXContext.g:1066:3: rule__XCarrierSetMLComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetMLComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetMLCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetMLComment__Group__1__Impl"


    // $ANTLR start "rule__XCarrierSetMLComment__Group__2"
    // InternalXContext.g:1074:1: rule__XCarrierSetMLComment__Group__2 : rule__XCarrierSetMLComment__Group__2__Impl ;
    public final void rule__XCarrierSetMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1078:1: ( rule__XCarrierSetMLComment__Group__2__Impl )
            // InternalXContext.g:1079:2: rule__XCarrierSetMLComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetMLComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetMLComment__Group__2"


    // $ANTLR start "rule__XCarrierSetMLComment__Group__2__Impl"
    // InternalXContext.g:1085:1: rule__XCarrierSetMLComment__Group__2__Impl : ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) ) ;
    public final void rule__XCarrierSetMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1089:1: ( ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) ) )
            // InternalXContext.g:1090:1: ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) )
            {
            // InternalXContext.g:1090:1: ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) )
            // InternalXContext.g:1091:2: ( rule__XCarrierSetMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getNameAssignment_2()); 
            // InternalXContext.g:1092:2: ( rule__XCarrierSetMLComment__NameAssignment_2 )
            // InternalXContext.g:1092:3: rule__XCarrierSetMLComment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetMLComment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetMLCommentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetMLComment__Group__2__Impl"


    // $ANTLR start "rule__XCarrierSetSLComment__Group__0"
    // InternalXContext.g:1101:1: rule__XCarrierSetSLComment__Group__0 : rule__XCarrierSetSLComment__Group__0__Impl rule__XCarrierSetSLComment__Group__1 ;
    public final void rule__XCarrierSetSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1105:1: ( rule__XCarrierSetSLComment__Group__0__Impl rule__XCarrierSetSLComment__Group__1 )
            // InternalXContext.g:1106:2: rule__XCarrierSetSLComment__Group__0__Impl rule__XCarrierSetSLComment__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__XCarrierSetSLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCarrierSetSLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetSLComment__Group__0"


    // $ANTLR start "rule__XCarrierSetSLComment__Group__0__Impl"
    // InternalXContext.g:1113:1: rule__XCarrierSetSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSetSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1117:1: ( ( () ) )
            // InternalXContext.g:1118:1: ( () )
            {
            // InternalXContext.g:1118:1: ( () )
            // InternalXContext.g:1119:2: ()
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:1120:2: ()
            // InternalXContext.g:1120:3: 
            {
            }

             after(grammarAccess.getXCarrierSetSLCommentAccess().getCarrierSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetSLComment__Group__0__Impl"


    // $ANTLR start "rule__XCarrierSetSLComment__Group__1"
    // InternalXContext.g:1128:1: rule__XCarrierSetSLComment__Group__1 : rule__XCarrierSetSLComment__Group__1__Impl rule__XCarrierSetSLComment__Group__2 ;
    public final void rule__XCarrierSetSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1132:1: ( rule__XCarrierSetSLComment__Group__1__Impl rule__XCarrierSetSLComment__Group__2 )
            // InternalXContext.g:1133:2: rule__XCarrierSetSLComment__Group__1__Impl rule__XCarrierSetSLComment__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__XCarrierSetSLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCarrierSetSLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetSLComment__Group__1"


    // $ANTLR start "rule__XCarrierSetSLComment__Group__1__Impl"
    // InternalXContext.g:1140:1: rule__XCarrierSetSLComment__Group__1__Impl : ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) ) ;
    public final void rule__XCarrierSetSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1144:1: ( ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1145:1: ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1145:1: ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) )
            // InternalXContext.g:1146:2: ( rule__XCarrierSetSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1147:2: ( rule__XCarrierSetSLComment__NameAssignment_1 )
            // InternalXContext.g:1147:3: rule__XCarrierSetSLComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetSLComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetSLCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetSLComment__Group__1__Impl"


    // $ANTLR start "rule__XCarrierSetSLComment__Group__2"
    // InternalXContext.g:1155:1: rule__XCarrierSetSLComment__Group__2 : rule__XCarrierSetSLComment__Group__2__Impl ;
    public final void rule__XCarrierSetSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1159:1: ( rule__XCarrierSetSLComment__Group__2__Impl )
            // InternalXContext.g:1160:2: rule__XCarrierSetSLComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetSLComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetSLComment__Group__2"


    // $ANTLR start "rule__XCarrierSetSLComment__Group__2__Impl"
    // InternalXContext.g:1166:1: rule__XCarrierSetSLComment__Group__2__Impl : ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) ) ;
    public final void rule__XCarrierSetSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1170:1: ( ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) ) )
            // InternalXContext.g:1171:1: ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) )
            {
            // InternalXContext.g:1171:1: ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) )
            // InternalXContext.g:1172:2: ( rule__XCarrierSetSLComment__CommentAssignment_2 )
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getCommentAssignment_2()); 
            // InternalXContext.g:1173:2: ( rule__XCarrierSetSLComment__CommentAssignment_2 )
            // InternalXContext.g:1173:3: rule__XCarrierSetSLComment__CommentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSetSLComment__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetSLCommentAccess().getCommentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetSLComment__Group__2__Impl"


    // $ANTLR start "rule__XConstantNoComment__Group__0"
    // InternalXContext.g:1182:1: rule__XConstantNoComment__Group__0 : rule__XConstantNoComment__Group__0__Impl rule__XConstantNoComment__Group__1 ;
    public final void rule__XConstantNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1186:1: ( rule__XConstantNoComment__Group__0__Impl rule__XConstantNoComment__Group__1 )
            // InternalXContext.g:1187:2: rule__XConstantNoComment__Group__0__Impl rule__XConstantNoComment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XConstantNoComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XConstantNoComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantNoComment__Group__0"


    // $ANTLR start "rule__XConstantNoComment__Group__0__Impl"
    // InternalXContext.g:1194:1: rule__XConstantNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XConstantNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1198:1: ( ( () ) )
            // InternalXContext.g:1199:1: ( () )
            {
            // InternalXContext.g:1199:1: ( () )
            // InternalXContext.g:1200:2: ()
            {
             before(grammarAccess.getXConstantNoCommentAccess().getConstantAction_0()); 
            // InternalXContext.g:1201:2: ()
            // InternalXContext.g:1201:3: 
            {
            }

             after(grammarAccess.getXConstantNoCommentAccess().getConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantNoComment__Group__0__Impl"


    // $ANTLR start "rule__XConstantNoComment__Group__1"
    // InternalXContext.g:1209:1: rule__XConstantNoComment__Group__1 : rule__XConstantNoComment__Group__1__Impl ;
    public final void rule__XConstantNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1213:1: ( rule__XConstantNoComment__Group__1__Impl )
            // InternalXContext.g:1214:2: rule__XConstantNoComment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XConstantNoComment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantNoComment__Group__1"


    // $ANTLR start "rule__XConstantNoComment__Group__1__Impl"
    // InternalXContext.g:1220:1: rule__XConstantNoComment__Group__1__Impl : ( ( rule__XConstantNoComment__NameAssignment_1 ) ) ;
    public final void rule__XConstantNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1224:1: ( ( ( rule__XConstantNoComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1225:1: ( ( rule__XConstantNoComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1225:1: ( ( rule__XConstantNoComment__NameAssignment_1 ) )
            // InternalXContext.g:1226:2: ( rule__XConstantNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXConstantNoCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1227:2: ( rule__XConstantNoComment__NameAssignment_1 )
            // InternalXContext.g:1227:3: rule__XConstantNoComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XConstantNoComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXConstantNoCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantNoComment__Group__1__Impl"


    // $ANTLR start "rule__XConstantMLComment__Group__0"
    // InternalXContext.g:1236:1: rule__XConstantMLComment__Group__0 : rule__XConstantMLComment__Group__0__Impl rule__XConstantMLComment__Group__1 ;
    public final void rule__XConstantMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1240:1: ( rule__XConstantMLComment__Group__0__Impl rule__XConstantMLComment__Group__1 )
            // InternalXContext.g:1241:2: rule__XConstantMLComment__Group__0__Impl rule__XConstantMLComment__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__XConstantMLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XConstantMLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantMLComment__Group__0"


    // $ANTLR start "rule__XConstantMLComment__Group__0__Impl"
    // InternalXContext.g:1248:1: rule__XConstantMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XConstantMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1252:1: ( ( () ) )
            // InternalXContext.g:1253:1: ( () )
            {
            // InternalXContext.g:1253:1: ( () )
            // InternalXContext.g:1254:2: ()
            {
             before(grammarAccess.getXConstantMLCommentAccess().getConstantAction_0()); 
            // InternalXContext.g:1255:2: ()
            // InternalXContext.g:1255:3: 
            {
            }

             after(grammarAccess.getXConstantMLCommentAccess().getConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantMLComment__Group__0__Impl"


    // $ANTLR start "rule__XConstantMLComment__Group__1"
    // InternalXContext.g:1263:1: rule__XConstantMLComment__Group__1 : rule__XConstantMLComment__Group__1__Impl rule__XConstantMLComment__Group__2 ;
    public final void rule__XConstantMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1267:1: ( rule__XConstantMLComment__Group__1__Impl rule__XConstantMLComment__Group__2 )
            // InternalXContext.g:1268:2: rule__XConstantMLComment__Group__1__Impl rule__XConstantMLComment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XConstantMLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XConstantMLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantMLComment__Group__1"


    // $ANTLR start "rule__XConstantMLComment__Group__1__Impl"
    // InternalXContext.g:1275:1: rule__XConstantMLComment__Group__1__Impl : ( ( rule__XConstantMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XConstantMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1279:1: ( ( ( rule__XConstantMLComment__CommentAssignment_1 ) ) )
            // InternalXContext.g:1280:1: ( ( rule__XConstantMLComment__CommentAssignment_1 ) )
            {
            // InternalXContext.g:1280:1: ( ( rule__XConstantMLComment__CommentAssignment_1 ) )
            // InternalXContext.g:1281:2: ( rule__XConstantMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXConstantMLCommentAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1282:2: ( rule__XConstantMLComment__CommentAssignment_1 )
            // InternalXContext.g:1282:3: rule__XConstantMLComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XConstantMLComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXConstantMLCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantMLComment__Group__1__Impl"


    // $ANTLR start "rule__XConstantMLComment__Group__2"
    // InternalXContext.g:1290:1: rule__XConstantMLComment__Group__2 : rule__XConstantMLComment__Group__2__Impl ;
    public final void rule__XConstantMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1294:1: ( rule__XConstantMLComment__Group__2__Impl )
            // InternalXContext.g:1295:2: rule__XConstantMLComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XConstantMLComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantMLComment__Group__2"


    // $ANTLR start "rule__XConstantMLComment__Group__2__Impl"
    // InternalXContext.g:1301:1: rule__XConstantMLComment__Group__2__Impl : ( ( rule__XConstantMLComment__NameAssignment_2 ) ) ;
    public final void rule__XConstantMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1305:1: ( ( ( rule__XConstantMLComment__NameAssignment_2 ) ) )
            // InternalXContext.g:1306:1: ( ( rule__XConstantMLComment__NameAssignment_2 ) )
            {
            // InternalXContext.g:1306:1: ( ( rule__XConstantMLComment__NameAssignment_2 ) )
            // InternalXContext.g:1307:2: ( rule__XConstantMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXConstantMLCommentAccess().getNameAssignment_2()); 
            // InternalXContext.g:1308:2: ( rule__XConstantMLComment__NameAssignment_2 )
            // InternalXContext.g:1308:3: rule__XConstantMLComment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XConstantMLComment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXConstantMLCommentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantMLComment__Group__2__Impl"


    // $ANTLR start "rule__XConstantSLComment__Group__0"
    // InternalXContext.g:1317:1: rule__XConstantSLComment__Group__0 : rule__XConstantSLComment__Group__0__Impl rule__XConstantSLComment__Group__1 ;
    public final void rule__XConstantSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1321:1: ( rule__XConstantSLComment__Group__0__Impl rule__XConstantSLComment__Group__1 )
            // InternalXContext.g:1322:2: rule__XConstantSLComment__Group__0__Impl rule__XConstantSLComment__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__XConstantSLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XConstantSLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantSLComment__Group__0"


    // $ANTLR start "rule__XConstantSLComment__Group__0__Impl"
    // InternalXContext.g:1329:1: rule__XConstantSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XConstantSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1333:1: ( ( () ) )
            // InternalXContext.g:1334:1: ( () )
            {
            // InternalXContext.g:1334:1: ( () )
            // InternalXContext.g:1335:2: ()
            {
             before(grammarAccess.getXConstantSLCommentAccess().getConstantAction_0()); 
            // InternalXContext.g:1336:2: ()
            // InternalXContext.g:1336:3: 
            {
            }

             after(grammarAccess.getXConstantSLCommentAccess().getConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantSLComment__Group__0__Impl"


    // $ANTLR start "rule__XConstantSLComment__Group__1"
    // InternalXContext.g:1344:1: rule__XConstantSLComment__Group__1 : rule__XConstantSLComment__Group__1__Impl rule__XConstantSLComment__Group__2 ;
    public final void rule__XConstantSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1348:1: ( rule__XConstantSLComment__Group__1__Impl rule__XConstantSLComment__Group__2 )
            // InternalXContext.g:1349:2: rule__XConstantSLComment__Group__1__Impl rule__XConstantSLComment__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__XConstantSLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XConstantSLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantSLComment__Group__1"


    // $ANTLR start "rule__XConstantSLComment__Group__1__Impl"
    // InternalXContext.g:1356:1: rule__XConstantSLComment__Group__1__Impl : ( ( rule__XConstantSLComment__NameAssignment_1 ) ) ;
    public final void rule__XConstantSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1360:1: ( ( ( rule__XConstantSLComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1361:1: ( ( rule__XConstantSLComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1361:1: ( ( rule__XConstantSLComment__NameAssignment_1 ) )
            // InternalXContext.g:1362:2: ( rule__XConstantSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXConstantSLCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1363:2: ( rule__XConstantSLComment__NameAssignment_1 )
            // InternalXContext.g:1363:3: rule__XConstantSLComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XConstantSLComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXConstantSLCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantSLComment__Group__1__Impl"


    // $ANTLR start "rule__XConstantSLComment__Group__2"
    // InternalXContext.g:1371:1: rule__XConstantSLComment__Group__2 : rule__XConstantSLComment__Group__2__Impl ;
    public final void rule__XConstantSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1375:1: ( rule__XConstantSLComment__Group__2__Impl )
            // InternalXContext.g:1376:2: rule__XConstantSLComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XConstantSLComment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantSLComment__Group__2"


    // $ANTLR start "rule__XConstantSLComment__Group__2__Impl"
    // InternalXContext.g:1382:1: rule__XConstantSLComment__Group__2__Impl : ( ( rule__XConstantSLComment__CommentAssignment_2 ) ) ;
    public final void rule__XConstantSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1386:1: ( ( ( rule__XConstantSLComment__CommentAssignment_2 ) ) )
            // InternalXContext.g:1387:1: ( ( rule__XConstantSLComment__CommentAssignment_2 ) )
            {
            // InternalXContext.g:1387:1: ( ( rule__XConstantSLComment__CommentAssignment_2 ) )
            // InternalXContext.g:1388:2: ( rule__XConstantSLComment__CommentAssignment_2 )
            {
             before(grammarAccess.getXConstantSLCommentAccess().getCommentAssignment_2()); 
            // InternalXContext.g:1389:2: ( rule__XConstantSLComment__CommentAssignment_2 )
            // InternalXContext.g:1389:3: rule__XConstantSLComment__CommentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XConstantSLComment__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXConstantSLCommentAccess().getCommentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantSLComment__Group__2__Impl"


    // $ANTLR start "rule__XAxiomNoComment__Group__0"
    // InternalXContext.g:1398:1: rule__XAxiomNoComment__Group__0 : rule__XAxiomNoComment__Group__0__Impl rule__XAxiomNoComment__Group__1 ;
    public final void rule__XAxiomNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1402:1: ( rule__XAxiomNoComment__Group__0__Impl rule__XAxiomNoComment__Group__1 )
            // InternalXContext.g:1403:2: rule__XAxiomNoComment__Group__0__Impl rule__XAxiomNoComment__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__XAxiomNoComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomNoComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__Group__0"


    // $ANTLR start "rule__XAxiomNoComment__Group__0__Impl"
    // InternalXContext.g:1410:1: rule__XAxiomNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XAxiomNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1414:1: ( ( () ) )
            // InternalXContext.g:1415:1: ( () )
            {
            // InternalXContext.g:1415:1: ( () )
            // InternalXContext.g:1416:2: ()
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getAxiomAction_0()); 
            // InternalXContext.g:1417:2: ()
            // InternalXContext.g:1417:3: 
            {
            }

             after(grammarAccess.getXAxiomNoCommentAccess().getAxiomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__Group__0__Impl"


    // $ANTLR start "rule__XAxiomNoComment__Group__1"
    // InternalXContext.g:1425:1: rule__XAxiomNoComment__Group__1 : rule__XAxiomNoComment__Group__1__Impl rule__XAxiomNoComment__Group__2 ;
    public final void rule__XAxiomNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1429:1: ( rule__XAxiomNoComment__Group__1__Impl rule__XAxiomNoComment__Group__2 )
            // InternalXContext.g:1430:2: rule__XAxiomNoComment__Group__1__Impl rule__XAxiomNoComment__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__XAxiomNoComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomNoComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__Group__1"


    // $ANTLR start "rule__XAxiomNoComment__Group__1__Impl"
    // InternalXContext.g:1437:1: rule__XAxiomNoComment__Group__1__Impl : ( ( rule__XAxiomNoComment__NameAssignment_1 ) ) ;
    public final void rule__XAxiomNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1441:1: ( ( ( rule__XAxiomNoComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1442:1: ( ( rule__XAxiomNoComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1442:1: ( ( rule__XAxiomNoComment__NameAssignment_1 ) )
            // InternalXContext.g:1443:2: ( rule__XAxiomNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1444:2: ( rule__XAxiomNoComment__NameAssignment_1 )
            // InternalXContext.g:1444:3: rule__XAxiomNoComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomNoComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomNoCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__Group__1__Impl"


    // $ANTLR start "rule__XAxiomNoComment__Group__2"
    // InternalXContext.g:1452:1: rule__XAxiomNoComment__Group__2 : rule__XAxiomNoComment__Group__2__Impl rule__XAxiomNoComment__Group__3 ;
    public final void rule__XAxiomNoComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1456:1: ( rule__XAxiomNoComment__Group__2__Impl rule__XAxiomNoComment__Group__3 )
            // InternalXContext.g:1457:2: rule__XAxiomNoComment__Group__2__Impl rule__XAxiomNoComment__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__XAxiomNoComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomNoComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__Group__2"


    // $ANTLR start "rule__XAxiomNoComment__Group__2__Impl"
    // InternalXContext.g:1464:1: rule__XAxiomNoComment__Group__2__Impl : ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) ) ;
    public final void rule__XAxiomNoComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1468:1: ( ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) ) )
            // InternalXContext.g:1469:1: ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) )
            {
            // InternalXContext.g:1469:1: ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) )
            // InternalXContext.g:1470:2: ( rule__XAxiomNoComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getPredicateAssignment_2()); 
            // InternalXContext.g:1471:2: ( rule__XAxiomNoComment__PredicateAssignment_2 )
            // InternalXContext.g:1471:3: rule__XAxiomNoComment__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomNoComment__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomNoCommentAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__Group__2__Impl"


    // $ANTLR start "rule__XAxiomNoComment__Group__3"
    // InternalXContext.g:1479:1: rule__XAxiomNoComment__Group__3 : rule__XAxiomNoComment__Group__3__Impl ;
    public final void rule__XAxiomNoComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1483:1: ( rule__XAxiomNoComment__Group__3__Impl )
            // InternalXContext.g:1484:2: rule__XAxiomNoComment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomNoComment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__Group__3"


    // $ANTLR start "rule__XAxiomNoComment__Group__3__Impl"
    // InternalXContext.g:1490:1: rule__XAxiomNoComment__Group__3__Impl : ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? ) ;
    public final void rule__XAxiomNoComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1494:1: ( ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? ) )
            // InternalXContext.g:1495:1: ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? )
            {
            // InternalXContext.g:1495:1: ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? )
            // InternalXContext.g:1496:2: ( rule__XAxiomNoComment__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getTheoremAssignment_3()); 
            // InternalXContext.g:1497:2: ( rule__XAxiomNoComment__TheoremAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXContext.g:1497:3: rule__XAxiomNoComment__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XAxiomNoComment__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAxiomNoCommentAccess().getTheoremAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__Group__3__Impl"


    // $ANTLR start "rule__XAxiomMLComment__Group__0"
    // InternalXContext.g:1506:1: rule__XAxiomMLComment__Group__0 : rule__XAxiomMLComment__Group__0__Impl rule__XAxiomMLComment__Group__1 ;
    public final void rule__XAxiomMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1510:1: ( rule__XAxiomMLComment__Group__0__Impl rule__XAxiomMLComment__Group__1 )
            // InternalXContext.g:1511:2: rule__XAxiomMLComment__Group__0__Impl rule__XAxiomMLComment__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__XAxiomMLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomMLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__Group__0"


    // $ANTLR start "rule__XAxiomMLComment__Group__0__Impl"
    // InternalXContext.g:1518:1: rule__XAxiomMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XAxiomMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1522:1: ( ( () ) )
            // InternalXContext.g:1523:1: ( () )
            {
            // InternalXContext.g:1523:1: ( () )
            // InternalXContext.g:1524:2: ()
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getAxiomAction_0()); 
            // InternalXContext.g:1525:2: ()
            // InternalXContext.g:1525:3: 
            {
            }

             after(grammarAccess.getXAxiomMLCommentAccess().getAxiomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__Group__0__Impl"


    // $ANTLR start "rule__XAxiomMLComment__Group__1"
    // InternalXContext.g:1533:1: rule__XAxiomMLComment__Group__1 : rule__XAxiomMLComment__Group__1__Impl rule__XAxiomMLComment__Group__2 ;
    public final void rule__XAxiomMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1537:1: ( rule__XAxiomMLComment__Group__1__Impl rule__XAxiomMLComment__Group__2 )
            // InternalXContext.g:1538:2: rule__XAxiomMLComment__Group__1__Impl rule__XAxiomMLComment__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__XAxiomMLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomMLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__Group__1"


    // $ANTLR start "rule__XAxiomMLComment__Group__1__Impl"
    // InternalXContext.g:1545:1: rule__XAxiomMLComment__Group__1__Impl : ( ( rule__XAxiomMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XAxiomMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1549:1: ( ( ( rule__XAxiomMLComment__CommentAssignment_1 ) ) )
            // InternalXContext.g:1550:1: ( ( rule__XAxiomMLComment__CommentAssignment_1 ) )
            {
            // InternalXContext.g:1550:1: ( ( rule__XAxiomMLComment__CommentAssignment_1 ) )
            // InternalXContext.g:1551:2: ( rule__XAxiomMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1552:2: ( rule__XAxiomMLComment__CommentAssignment_1 )
            // InternalXContext.g:1552:3: rule__XAxiomMLComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomMLComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomMLCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__Group__1__Impl"


    // $ANTLR start "rule__XAxiomMLComment__Group__2"
    // InternalXContext.g:1560:1: rule__XAxiomMLComment__Group__2 : rule__XAxiomMLComment__Group__2__Impl rule__XAxiomMLComment__Group__3 ;
    public final void rule__XAxiomMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1564:1: ( rule__XAxiomMLComment__Group__2__Impl rule__XAxiomMLComment__Group__3 )
            // InternalXContext.g:1565:2: rule__XAxiomMLComment__Group__2__Impl rule__XAxiomMLComment__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__XAxiomMLComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomMLComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__Group__2"


    // $ANTLR start "rule__XAxiomMLComment__Group__2__Impl"
    // InternalXContext.g:1572:1: rule__XAxiomMLComment__Group__2__Impl : ( ( rule__XAxiomMLComment__NameAssignment_2 ) ) ;
    public final void rule__XAxiomMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1576:1: ( ( ( rule__XAxiomMLComment__NameAssignment_2 ) ) )
            // InternalXContext.g:1577:1: ( ( rule__XAxiomMLComment__NameAssignment_2 ) )
            {
            // InternalXContext.g:1577:1: ( ( rule__XAxiomMLComment__NameAssignment_2 ) )
            // InternalXContext.g:1578:2: ( rule__XAxiomMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getNameAssignment_2()); 
            // InternalXContext.g:1579:2: ( rule__XAxiomMLComment__NameAssignment_2 )
            // InternalXContext.g:1579:3: rule__XAxiomMLComment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomMLComment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomMLCommentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__Group__2__Impl"


    // $ANTLR start "rule__XAxiomMLComment__Group__3"
    // InternalXContext.g:1587:1: rule__XAxiomMLComment__Group__3 : rule__XAxiomMLComment__Group__3__Impl rule__XAxiomMLComment__Group__4 ;
    public final void rule__XAxiomMLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1591:1: ( rule__XAxiomMLComment__Group__3__Impl rule__XAxiomMLComment__Group__4 )
            // InternalXContext.g:1592:2: rule__XAxiomMLComment__Group__3__Impl rule__XAxiomMLComment__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__XAxiomMLComment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomMLComment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__Group__3"


    // $ANTLR start "rule__XAxiomMLComment__Group__3__Impl"
    // InternalXContext.g:1599:1: rule__XAxiomMLComment__Group__3__Impl : ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) ) ;
    public final void rule__XAxiomMLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1603:1: ( ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) ) )
            // InternalXContext.g:1604:1: ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) )
            {
            // InternalXContext.g:1604:1: ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) )
            // InternalXContext.g:1605:2: ( rule__XAxiomMLComment__PredicateAssignment_3 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getPredicateAssignment_3()); 
            // InternalXContext.g:1606:2: ( rule__XAxiomMLComment__PredicateAssignment_3 )
            // InternalXContext.g:1606:3: rule__XAxiomMLComment__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomMLComment__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomMLCommentAccess().getPredicateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__Group__3__Impl"


    // $ANTLR start "rule__XAxiomMLComment__Group__4"
    // InternalXContext.g:1614:1: rule__XAxiomMLComment__Group__4 : rule__XAxiomMLComment__Group__4__Impl ;
    public final void rule__XAxiomMLComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1618:1: ( rule__XAxiomMLComment__Group__4__Impl )
            // InternalXContext.g:1619:2: rule__XAxiomMLComment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomMLComment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__Group__4"


    // $ANTLR start "rule__XAxiomMLComment__Group__4__Impl"
    // InternalXContext.g:1625:1: rule__XAxiomMLComment__Group__4__Impl : ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? ) ;
    public final void rule__XAxiomMLComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1629:1: ( ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? ) )
            // InternalXContext.g:1630:1: ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? )
            {
            // InternalXContext.g:1630:1: ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? )
            // InternalXContext.g:1631:2: ( rule__XAxiomMLComment__TheoremAssignment_4 )?
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getTheoremAssignment_4()); 
            // InternalXContext.g:1632:2: ( rule__XAxiomMLComment__TheoremAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXContext.g:1632:3: rule__XAxiomMLComment__TheoremAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__XAxiomMLComment__TheoremAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAxiomMLCommentAccess().getTheoremAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__Group__4__Impl"


    // $ANTLR start "rule__XAxiomSLComment__Group__0"
    // InternalXContext.g:1641:1: rule__XAxiomSLComment__Group__0 : rule__XAxiomSLComment__Group__0__Impl rule__XAxiomSLComment__Group__1 ;
    public final void rule__XAxiomSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1645:1: ( rule__XAxiomSLComment__Group__0__Impl rule__XAxiomSLComment__Group__1 )
            // InternalXContext.g:1646:2: rule__XAxiomSLComment__Group__0__Impl rule__XAxiomSLComment__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XAxiomSLComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomSLComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__Group__0"


    // $ANTLR start "rule__XAxiomSLComment__Group__0__Impl"
    // InternalXContext.g:1653:1: rule__XAxiomSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XAxiomSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1657:1: ( ( () ) )
            // InternalXContext.g:1658:1: ( () )
            {
            // InternalXContext.g:1658:1: ( () )
            // InternalXContext.g:1659:2: ()
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getAxiomAction_0()); 
            // InternalXContext.g:1660:2: ()
            // InternalXContext.g:1660:3: 
            {
            }

             after(grammarAccess.getXAxiomSLCommentAccess().getAxiomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__Group__0__Impl"


    // $ANTLR start "rule__XAxiomSLComment__Group__1"
    // InternalXContext.g:1668:1: rule__XAxiomSLComment__Group__1 : rule__XAxiomSLComment__Group__1__Impl rule__XAxiomSLComment__Group__2 ;
    public final void rule__XAxiomSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1672:1: ( rule__XAxiomSLComment__Group__1__Impl rule__XAxiomSLComment__Group__2 )
            // InternalXContext.g:1673:2: rule__XAxiomSLComment__Group__1__Impl rule__XAxiomSLComment__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__XAxiomSLComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomSLComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__Group__1"


    // $ANTLR start "rule__XAxiomSLComment__Group__1__Impl"
    // InternalXContext.g:1680:1: rule__XAxiomSLComment__Group__1__Impl : ( ( rule__XAxiomSLComment__NameAssignment_1 ) ) ;
    public final void rule__XAxiomSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1684:1: ( ( ( rule__XAxiomSLComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1685:1: ( ( rule__XAxiomSLComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1685:1: ( ( rule__XAxiomSLComment__NameAssignment_1 ) )
            // InternalXContext.g:1686:2: ( rule__XAxiomSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1687:2: ( rule__XAxiomSLComment__NameAssignment_1 )
            // InternalXContext.g:1687:3: rule__XAxiomSLComment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomSLComment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomSLCommentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__Group__1__Impl"


    // $ANTLR start "rule__XAxiomSLComment__Group__2"
    // InternalXContext.g:1695:1: rule__XAxiomSLComment__Group__2 : rule__XAxiomSLComment__Group__2__Impl rule__XAxiomSLComment__Group__3 ;
    public final void rule__XAxiomSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1699:1: ( rule__XAxiomSLComment__Group__2__Impl rule__XAxiomSLComment__Group__3 )
            // InternalXContext.g:1700:2: rule__XAxiomSLComment__Group__2__Impl rule__XAxiomSLComment__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__XAxiomSLComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomSLComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__Group__2"


    // $ANTLR start "rule__XAxiomSLComment__Group__2__Impl"
    // InternalXContext.g:1707:1: rule__XAxiomSLComment__Group__2__Impl : ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) ) ;
    public final void rule__XAxiomSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1711:1: ( ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) ) )
            // InternalXContext.g:1712:1: ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) )
            {
            // InternalXContext.g:1712:1: ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) )
            // InternalXContext.g:1713:2: ( rule__XAxiomSLComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getPredicateAssignment_2()); 
            // InternalXContext.g:1714:2: ( rule__XAxiomSLComment__PredicateAssignment_2 )
            // InternalXContext.g:1714:3: rule__XAxiomSLComment__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomSLComment__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomSLCommentAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__Group__2__Impl"


    // $ANTLR start "rule__XAxiomSLComment__Group__3"
    // InternalXContext.g:1722:1: rule__XAxiomSLComment__Group__3 : rule__XAxiomSLComment__Group__3__Impl rule__XAxiomSLComment__Group__4 ;
    public final void rule__XAxiomSLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1726:1: ( rule__XAxiomSLComment__Group__3__Impl rule__XAxiomSLComment__Group__4 )
            // InternalXContext.g:1727:2: rule__XAxiomSLComment__Group__3__Impl rule__XAxiomSLComment__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__XAxiomSLComment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiomSLComment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__Group__3"


    // $ANTLR start "rule__XAxiomSLComment__Group__3__Impl"
    // InternalXContext.g:1734:1: rule__XAxiomSLComment__Group__3__Impl : ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? ) ;
    public final void rule__XAxiomSLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1738:1: ( ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? ) )
            // InternalXContext.g:1739:1: ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? )
            {
            // InternalXContext.g:1739:1: ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? )
            // InternalXContext.g:1740:2: ( rule__XAxiomSLComment__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getTheoremAssignment_3()); 
            // InternalXContext.g:1741:2: ( rule__XAxiomSLComment__TheoremAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXContext.g:1741:3: rule__XAxiomSLComment__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XAxiomSLComment__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAxiomSLCommentAccess().getTheoremAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__Group__3__Impl"


    // $ANTLR start "rule__XAxiomSLComment__Group__4"
    // InternalXContext.g:1749:1: rule__XAxiomSLComment__Group__4 : rule__XAxiomSLComment__Group__4__Impl ;
    public final void rule__XAxiomSLComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1753:1: ( rule__XAxiomSLComment__Group__4__Impl )
            // InternalXContext.g:1754:2: rule__XAxiomSLComment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomSLComment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__Group__4"


    // $ANTLR start "rule__XAxiomSLComment__Group__4__Impl"
    // InternalXContext.g:1760:1: rule__XAxiomSLComment__Group__4__Impl : ( ( rule__XAxiomSLComment__CommentAssignment_4 ) ) ;
    public final void rule__XAxiomSLComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1764:1: ( ( ( rule__XAxiomSLComment__CommentAssignment_4 ) ) )
            // InternalXContext.g:1765:1: ( ( rule__XAxiomSLComment__CommentAssignment_4 ) )
            {
            // InternalXContext.g:1765:1: ( ( rule__XAxiomSLComment__CommentAssignment_4 ) )
            // InternalXContext.g:1766:2: ( rule__XAxiomSLComment__CommentAssignment_4 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getCommentAssignment_4()); 
            // InternalXContext.g:1767:2: ( rule__XAxiomSLComment__CommentAssignment_4 )
            // InternalXContext.g:1767:3: rule__XAxiomSLComment__CommentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XAxiomSLComment__CommentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomSLCommentAccess().getCommentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__Group__4__Impl"


    // $ANTLR start "rule__XContext__CommentAssignment_1"
    // InternalXContext.g:1776:1: rule__XContext__CommentAssignment_1 : ( ( rule__XContext__CommentAlternatives_1_0 ) ) ;
    public final void rule__XContext__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1780:1: ( ( ( rule__XContext__CommentAlternatives_1_0 ) ) )
            // InternalXContext.g:1781:2: ( ( rule__XContext__CommentAlternatives_1_0 ) )
            {
            // InternalXContext.g:1781:2: ( ( rule__XContext__CommentAlternatives_1_0 ) )
            // InternalXContext.g:1782:3: ( rule__XContext__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXContextAccess().getCommentAlternatives_1_0()); 
            // InternalXContext.g:1783:3: ( rule__XContext__CommentAlternatives_1_0 )
            // InternalXContext.g:1783:4: rule__XContext__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XContext__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__CommentAssignment_1"


    // $ANTLR start "rule__XContext__NameAssignment_3"
    // InternalXContext.g:1791:1: rule__XContext__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XContext__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1795:1: ( ( RULE_ID ) )
            // InternalXContext.g:1796:2: ( RULE_ID )
            {
            // InternalXContext.g:1796:2: ( RULE_ID )
            // InternalXContext.g:1797:3: RULE_ID
            {
             before(grammarAccess.getXContextAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__NameAssignment_3"


    // $ANTLR start "rule__XContext__ExtendsAssignment_4_1"
    // InternalXContext.g:1806:1: rule__XContext__ExtendsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XContext__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1810:1: ( ( ( RULE_ID ) ) )
            // InternalXContext.g:1811:2: ( ( RULE_ID ) )
            {
            // InternalXContext.g:1811:2: ( ( RULE_ID ) )
            // InternalXContext.g:1812:3: ( RULE_ID )
            {
             before(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0()); 
            // InternalXContext.g:1813:3: ( RULE_ID )
            // InternalXContext.g:1814:4: RULE_ID
            {
             before(grammarAccess.getXContextAccess().getExtendsContextIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getExtendsContextIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__ExtendsAssignment_4_1"


    // $ANTLR start "rule__XContext__SetsAssignment_5_1"
    // InternalXContext.g:1825:1: rule__XContext__SetsAssignment_5_1 : ( ruleXCarrierSet ) ;
    public final void rule__XContext__SetsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1829:1: ( ( ruleXCarrierSet ) )
            // InternalXContext.g:1830:2: ( ruleXCarrierSet )
            {
            // InternalXContext.g:1830:2: ( ruleXCarrierSet )
            // InternalXContext.g:1831:3: ruleXCarrierSet
            {
             before(grammarAccess.getXContextAccess().getSetsXCarrierSetParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXCarrierSet();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getSetsXCarrierSetParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__SetsAssignment_5_1"


    // $ANTLR start "rule__XContext__ConstantsAssignment_6_1"
    // InternalXContext.g:1840:1: rule__XContext__ConstantsAssignment_6_1 : ( ruleXConstant ) ;
    public final void rule__XContext__ConstantsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1844:1: ( ( ruleXConstant ) )
            // InternalXContext.g:1845:2: ( ruleXConstant )
            {
            // InternalXContext.g:1845:2: ( ruleXConstant )
            // InternalXContext.g:1846:3: ruleXConstant
            {
             before(grammarAccess.getXContextAccess().getConstantsXConstantParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXConstant();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getConstantsXConstantParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__ConstantsAssignment_6_1"


    // $ANTLR start "rule__XContext__AxiomsAssignment_7_1"
    // InternalXContext.g:1855:1: rule__XContext__AxiomsAssignment_7_1 : ( ruleXAxiom ) ;
    public final void rule__XContext__AxiomsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1859:1: ( ( ruleXAxiom ) )
            // InternalXContext.g:1860:2: ( ruleXAxiom )
            {
            // InternalXContext.g:1860:2: ( ruleXAxiom )
            // InternalXContext.g:1861:3: ruleXAxiom
            {
             before(grammarAccess.getXContextAccess().getAxiomsXAxiomParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXAxiom();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getAxiomsXAxiomParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__AxiomsAssignment_7_1"


    // $ANTLR start "rule__XCarrierSetNoComment__NameAssignment_1"
    // InternalXContext.g:1870:1: rule__XCarrierSetNoComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XCarrierSetNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1874:1: ( ( RULE_ID ) )
            // InternalXContext.g:1875:2: ( RULE_ID )
            {
            // InternalXContext.g:1875:2: ( RULE_ID )
            // InternalXContext.g:1876:3: RULE_ID
            {
             before(grammarAccess.getXCarrierSetNoCommentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXCarrierSetNoCommentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetNoComment__NameAssignment_1"


    // $ANTLR start "rule__XCarrierSetMLComment__CommentAssignment_1"
    // InternalXContext.g:1885:1: rule__XCarrierSetMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XCarrierSetMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1889:1: ( ( RULE_ML_COMMENT ) )
            // InternalXContext.g:1890:2: ( RULE_ML_COMMENT )
            {
            // InternalXContext.g:1890:2: ( RULE_ML_COMMENT )
            // InternalXContext.g:1891:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXCarrierSetMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetMLComment__CommentAssignment_1"


    // $ANTLR start "rule__XCarrierSetMLComment__NameAssignment_2"
    // InternalXContext.g:1900:1: rule__XCarrierSetMLComment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XCarrierSetMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1904:1: ( ( RULE_ID ) )
            // InternalXContext.g:1905:2: ( RULE_ID )
            {
            // InternalXContext.g:1905:2: ( RULE_ID )
            // InternalXContext.g:1906:3: RULE_ID
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXCarrierSetMLCommentAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetMLComment__NameAssignment_2"


    // $ANTLR start "rule__XCarrierSetSLComment__NameAssignment_1"
    // InternalXContext.g:1915:1: rule__XCarrierSetSLComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XCarrierSetSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1919:1: ( ( RULE_ID ) )
            // InternalXContext.g:1920:2: ( RULE_ID )
            {
            // InternalXContext.g:1920:2: ( RULE_ID )
            // InternalXContext.g:1921:3: RULE_ID
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXCarrierSetSLCommentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetSLComment__NameAssignment_1"


    // $ANTLR start "rule__XCarrierSetSLComment__CommentAssignment_2"
    // InternalXContext.g:1930:1: rule__XCarrierSetSLComment__CommentAssignment_2 : ( RULE_SL_COMMENT ) ;
    public final void rule__XCarrierSetSLComment__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1934:1: ( ( RULE_SL_COMMENT ) )
            // InternalXContext.g:1935:2: ( RULE_SL_COMMENT )
            {
            // InternalXContext.g:1935:2: ( RULE_SL_COMMENT )
            // InternalXContext.g:1936:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXCarrierSetSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSetSLComment__CommentAssignment_2"


    // $ANTLR start "rule__XConstantNoComment__NameAssignment_1"
    // InternalXContext.g:1945:1: rule__XConstantNoComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XConstantNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1949:1: ( ( RULE_ID ) )
            // InternalXContext.g:1950:2: ( RULE_ID )
            {
            // InternalXContext.g:1950:2: ( RULE_ID )
            // InternalXContext.g:1951:3: RULE_ID
            {
             before(grammarAccess.getXConstantNoCommentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXConstantNoCommentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantNoComment__NameAssignment_1"


    // $ANTLR start "rule__XConstantMLComment__CommentAssignment_1"
    // InternalXContext.g:1960:1: rule__XConstantMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XConstantMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1964:1: ( ( RULE_ML_COMMENT ) )
            // InternalXContext.g:1965:2: ( RULE_ML_COMMENT )
            {
            // InternalXContext.g:1965:2: ( RULE_ML_COMMENT )
            // InternalXContext.g:1966:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getXConstantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXConstantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantMLComment__CommentAssignment_1"


    // $ANTLR start "rule__XConstantMLComment__NameAssignment_2"
    // InternalXContext.g:1975:1: rule__XConstantMLComment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XConstantMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1979:1: ( ( RULE_ID ) )
            // InternalXContext.g:1980:2: ( RULE_ID )
            {
            // InternalXContext.g:1980:2: ( RULE_ID )
            // InternalXContext.g:1981:3: RULE_ID
            {
             before(grammarAccess.getXConstantMLCommentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXConstantMLCommentAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantMLComment__NameAssignment_2"


    // $ANTLR start "rule__XConstantSLComment__NameAssignment_1"
    // InternalXContext.g:1990:1: rule__XConstantSLComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XConstantSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1994:1: ( ( RULE_ID ) )
            // InternalXContext.g:1995:2: ( RULE_ID )
            {
            // InternalXContext.g:1995:2: ( RULE_ID )
            // InternalXContext.g:1996:3: RULE_ID
            {
             before(grammarAccess.getXConstantSLCommentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXConstantSLCommentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantSLComment__NameAssignment_1"


    // $ANTLR start "rule__XConstantSLComment__CommentAssignment_2"
    // InternalXContext.g:2005:1: rule__XConstantSLComment__CommentAssignment_2 : ( RULE_SL_COMMENT ) ;
    public final void rule__XConstantSLComment__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2009:1: ( ( RULE_SL_COMMENT ) )
            // InternalXContext.g:2010:2: ( RULE_SL_COMMENT )
            {
            // InternalXContext.g:2010:2: ( RULE_SL_COMMENT )
            // InternalXContext.g:2011:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getXConstantSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXConstantSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstantSLComment__CommentAssignment_2"


    // $ANTLR start "rule__XAxiomNoComment__NameAssignment_1"
    // InternalXContext.g:2020:1: rule__XAxiomNoComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAxiomNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2024:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:2025:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:2025:2: ( RULE_XLABEL )
            // InternalXContext.g:2026:3: RULE_XLABEL
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXAxiomNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__NameAssignment_1"


    // $ANTLR start "rule__XAxiomNoComment__PredicateAssignment_2"
    // InternalXContext.g:2035:1: rule__XAxiomNoComment__PredicateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XAxiomNoComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2039:1: ( ( RULE_STRING ) )
            // InternalXContext.g:2040:2: ( RULE_STRING )
            {
            // InternalXContext.g:2040:2: ( RULE_STRING )
            // InternalXContext.g:2041:3: RULE_STRING
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXAxiomNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__PredicateAssignment_2"


    // $ANTLR start "rule__XAxiomNoComment__TheoremAssignment_3"
    // InternalXContext.g:2050:1: rule__XAxiomNoComment__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiomNoComment__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2054:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:2055:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:2055:2: ( ( 'theorem' ) )
            // InternalXContext.g:2056:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXContext.g:2057:3: ( 'theorem' )
            // InternalXContext.g:2058:4: 'theorem'
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getXAxiomNoCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXAxiomNoCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomNoComment__TheoremAssignment_3"


    // $ANTLR start "rule__XAxiomMLComment__CommentAssignment_1"
    // InternalXContext.g:2069:1: rule__XAxiomMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XAxiomMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2073:1: ( ( RULE_ML_COMMENT ) )
            // InternalXContext.g:2074:2: ( RULE_ML_COMMENT )
            {
            // InternalXContext.g:2074:2: ( RULE_ML_COMMENT )
            // InternalXContext.g:2075:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXAxiomMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__CommentAssignment_1"


    // $ANTLR start "rule__XAxiomMLComment__NameAssignment_2"
    // InternalXContext.g:2084:1: rule__XAxiomMLComment__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XAxiomMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2088:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:2089:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:2089:2: ( RULE_XLABEL )
            // InternalXContext.g:2090:3: RULE_XLABEL
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXAxiomMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__NameAssignment_2"


    // $ANTLR start "rule__XAxiomMLComment__PredicateAssignment_3"
    // InternalXContext.g:2099:1: rule__XAxiomMLComment__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__XAxiomMLComment__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2103:1: ( ( RULE_STRING ) )
            // InternalXContext.g:2104:2: ( RULE_STRING )
            {
            // InternalXContext.g:2104:2: ( RULE_STRING )
            // InternalXContext.g:2105:3: RULE_STRING
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXAxiomMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__PredicateAssignment_3"


    // $ANTLR start "rule__XAxiomMLComment__TheoremAssignment_4"
    // InternalXContext.g:2114:1: rule__XAxiomMLComment__TheoremAssignment_4 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiomMLComment__TheoremAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2118:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:2119:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:2119:2: ( ( 'theorem' ) )
            // InternalXContext.g:2120:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getTheoremTheoremKeyword_4_0()); 
            // InternalXContext.g:2121:3: ( 'theorem' )
            // InternalXContext.g:2122:4: 'theorem'
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getTheoremTheoremKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getXAxiomMLCommentAccess().getTheoremTheoremKeyword_4_0()); 

            }

             after(grammarAccess.getXAxiomMLCommentAccess().getTheoremTheoremKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomMLComment__TheoremAssignment_4"


    // $ANTLR start "rule__XAxiomSLComment__NameAssignment_1"
    // InternalXContext.g:2133:1: rule__XAxiomSLComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAxiomSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2137:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:2138:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:2138:2: ( RULE_XLABEL )
            // InternalXContext.g:2139:3: RULE_XLABEL
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXAxiomSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__NameAssignment_1"


    // $ANTLR start "rule__XAxiomSLComment__PredicateAssignment_2"
    // InternalXContext.g:2148:1: rule__XAxiomSLComment__PredicateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XAxiomSLComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2152:1: ( ( RULE_STRING ) )
            // InternalXContext.g:2153:2: ( RULE_STRING )
            {
            // InternalXContext.g:2153:2: ( RULE_STRING )
            // InternalXContext.g:2154:3: RULE_STRING
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXAxiomSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__PredicateAssignment_2"


    // $ANTLR start "rule__XAxiomSLComment__TheoremAssignment_3"
    // InternalXContext.g:2163:1: rule__XAxiomSLComment__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiomSLComment__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2167:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:2168:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:2168:2: ( ( 'theorem' ) )
            // InternalXContext.g:2169:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXContext.g:2170:3: ( 'theorem' )
            // InternalXContext.g:2171:4: 'theorem'
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getXAxiomSLCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXAxiomSLCommentAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__TheoremAssignment_3"


    // $ANTLR start "rule__XAxiomSLComment__CommentAssignment_4"
    // InternalXContext.g:2182:1: rule__XAxiomSLComment__CommentAssignment_4 : ( RULE_SL_COMMENT ) ;
    public final void rule__XAxiomSLComment__CommentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2186:1: ( ( RULE_SL_COMMENT ) )
            // InternalXContext.g:2187:2: ( RULE_SL_COMMENT )
            {
            // InternalXContext.g:2187:2: ( RULE_SL_COMMENT )
            // InternalXContext.g:2188:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_4_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getXAxiomSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiomSLComment__CommentAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040020L});

}