package ac.soton.xeventb.xcontext.ide.contentassist.antlr.internal;

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
import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXContextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'end'", "'extends'", "'sets'", "'constants'", "'axioms'", "'.'", "'theorem'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__19=19;
    public static final int RULE_XLABEL=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=9;
    public static final int RULE_ML_COMMENT=5;

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXContext.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXContext.g:79:1: ( ruleQualifiedName EOF )
            // InternalXContext.g:80:1: ruleQualifiedName EOF
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
    // InternalXContext.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXContext.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXContext.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXContext.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalXContext.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalXContext.g:94:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleXCarrierSet"
    // InternalXContext.g:103:1: entryRuleXCarrierSet : ruleXCarrierSet EOF ;
    public final void entryRuleXCarrierSet() throws RecognitionException {
        try {
            // InternalXContext.g:104:1: ( ruleXCarrierSet EOF )
            // InternalXContext.g:105:1: ruleXCarrierSet EOF
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
    // InternalXContext.g:112:1: ruleXCarrierSet : ( ( rule__XCarrierSet__Alternatives ) ) ;
    public final void ruleXCarrierSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:116:2: ( ( ( rule__XCarrierSet__Alternatives ) ) )
            // InternalXContext.g:117:2: ( ( rule__XCarrierSet__Alternatives ) )
            {
            // InternalXContext.g:117:2: ( ( rule__XCarrierSet__Alternatives ) )
            // InternalXContext.g:118:3: ( rule__XCarrierSet__Alternatives )
            {
             before(grammarAccess.getXCarrierSetAccess().getAlternatives()); 
            // InternalXContext.g:119:3: ( rule__XCarrierSet__Alternatives )
            // InternalXContext.g:119:4: rule__XCarrierSet__Alternatives
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
    // InternalXContext.g:128:1: entryRuleXCarrierSetNoComment : ruleXCarrierSetNoComment EOF ;
    public final void entryRuleXCarrierSetNoComment() throws RecognitionException {
        try {
            // InternalXContext.g:129:1: ( ruleXCarrierSetNoComment EOF )
            // InternalXContext.g:130:1: ruleXCarrierSetNoComment EOF
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
    // InternalXContext.g:137:1: ruleXCarrierSetNoComment : ( ( rule__XCarrierSetNoComment__Group__0 ) ) ;
    public final void ruleXCarrierSetNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:141:2: ( ( ( rule__XCarrierSetNoComment__Group__0 ) ) )
            // InternalXContext.g:142:2: ( ( rule__XCarrierSetNoComment__Group__0 ) )
            {
            // InternalXContext.g:142:2: ( ( rule__XCarrierSetNoComment__Group__0 ) )
            // InternalXContext.g:143:3: ( rule__XCarrierSetNoComment__Group__0 )
            {
             before(grammarAccess.getXCarrierSetNoCommentAccess().getGroup()); 
            // InternalXContext.g:144:3: ( rule__XCarrierSetNoComment__Group__0 )
            // InternalXContext.g:144:4: rule__XCarrierSetNoComment__Group__0
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
    // InternalXContext.g:153:1: entryRuleXCarrierSetMLComment : ruleXCarrierSetMLComment EOF ;
    public final void entryRuleXCarrierSetMLComment() throws RecognitionException {
        try {
            // InternalXContext.g:154:1: ( ruleXCarrierSetMLComment EOF )
            // InternalXContext.g:155:1: ruleXCarrierSetMLComment EOF
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
    // InternalXContext.g:162:1: ruleXCarrierSetMLComment : ( ( rule__XCarrierSetMLComment__Group__0 ) ) ;
    public final void ruleXCarrierSetMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:166:2: ( ( ( rule__XCarrierSetMLComment__Group__0 ) ) )
            // InternalXContext.g:167:2: ( ( rule__XCarrierSetMLComment__Group__0 ) )
            {
            // InternalXContext.g:167:2: ( ( rule__XCarrierSetMLComment__Group__0 ) )
            // InternalXContext.g:168:3: ( rule__XCarrierSetMLComment__Group__0 )
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getGroup()); 
            // InternalXContext.g:169:3: ( rule__XCarrierSetMLComment__Group__0 )
            // InternalXContext.g:169:4: rule__XCarrierSetMLComment__Group__0
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
    // InternalXContext.g:178:1: entryRuleXCarrierSetSLComment : ruleXCarrierSetSLComment EOF ;
    public final void entryRuleXCarrierSetSLComment() throws RecognitionException {
        try {
            // InternalXContext.g:179:1: ( ruleXCarrierSetSLComment EOF )
            // InternalXContext.g:180:1: ruleXCarrierSetSLComment EOF
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
    // InternalXContext.g:187:1: ruleXCarrierSetSLComment : ( ( rule__XCarrierSetSLComment__Group__0 ) ) ;
    public final void ruleXCarrierSetSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:191:2: ( ( ( rule__XCarrierSetSLComment__Group__0 ) ) )
            // InternalXContext.g:192:2: ( ( rule__XCarrierSetSLComment__Group__0 ) )
            {
            // InternalXContext.g:192:2: ( ( rule__XCarrierSetSLComment__Group__0 ) )
            // InternalXContext.g:193:3: ( rule__XCarrierSetSLComment__Group__0 )
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getGroup()); 
            // InternalXContext.g:194:3: ( rule__XCarrierSetSLComment__Group__0 )
            // InternalXContext.g:194:4: rule__XCarrierSetSLComment__Group__0
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
    // InternalXContext.g:203:1: entryRuleXConstant : ruleXConstant EOF ;
    public final void entryRuleXConstant() throws RecognitionException {
        try {
            // InternalXContext.g:204:1: ( ruleXConstant EOF )
            // InternalXContext.g:205:1: ruleXConstant EOF
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
    // InternalXContext.g:212:1: ruleXConstant : ( ( rule__XConstant__Alternatives ) ) ;
    public final void ruleXConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:216:2: ( ( ( rule__XConstant__Alternatives ) ) )
            // InternalXContext.g:217:2: ( ( rule__XConstant__Alternatives ) )
            {
            // InternalXContext.g:217:2: ( ( rule__XConstant__Alternatives ) )
            // InternalXContext.g:218:3: ( rule__XConstant__Alternatives )
            {
             before(grammarAccess.getXConstantAccess().getAlternatives()); 
            // InternalXContext.g:219:3: ( rule__XConstant__Alternatives )
            // InternalXContext.g:219:4: rule__XConstant__Alternatives
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
    // InternalXContext.g:228:1: entryRuleXConstantNoComment : ruleXConstantNoComment EOF ;
    public final void entryRuleXConstantNoComment() throws RecognitionException {
        try {
            // InternalXContext.g:229:1: ( ruleXConstantNoComment EOF )
            // InternalXContext.g:230:1: ruleXConstantNoComment EOF
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
    // InternalXContext.g:237:1: ruleXConstantNoComment : ( ( rule__XConstantNoComment__Group__0 ) ) ;
    public final void ruleXConstantNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:241:2: ( ( ( rule__XConstantNoComment__Group__0 ) ) )
            // InternalXContext.g:242:2: ( ( rule__XConstantNoComment__Group__0 ) )
            {
            // InternalXContext.g:242:2: ( ( rule__XConstantNoComment__Group__0 ) )
            // InternalXContext.g:243:3: ( rule__XConstantNoComment__Group__0 )
            {
             before(grammarAccess.getXConstantNoCommentAccess().getGroup()); 
            // InternalXContext.g:244:3: ( rule__XConstantNoComment__Group__0 )
            // InternalXContext.g:244:4: rule__XConstantNoComment__Group__0
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
    // InternalXContext.g:253:1: entryRuleXConstantMLComment : ruleXConstantMLComment EOF ;
    public final void entryRuleXConstantMLComment() throws RecognitionException {
        try {
            // InternalXContext.g:254:1: ( ruleXConstantMLComment EOF )
            // InternalXContext.g:255:1: ruleXConstantMLComment EOF
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
    // InternalXContext.g:262:1: ruleXConstantMLComment : ( ( rule__XConstantMLComment__Group__0 ) ) ;
    public final void ruleXConstantMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:266:2: ( ( ( rule__XConstantMLComment__Group__0 ) ) )
            // InternalXContext.g:267:2: ( ( rule__XConstantMLComment__Group__0 ) )
            {
            // InternalXContext.g:267:2: ( ( rule__XConstantMLComment__Group__0 ) )
            // InternalXContext.g:268:3: ( rule__XConstantMLComment__Group__0 )
            {
             before(grammarAccess.getXConstantMLCommentAccess().getGroup()); 
            // InternalXContext.g:269:3: ( rule__XConstantMLComment__Group__0 )
            // InternalXContext.g:269:4: rule__XConstantMLComment__Group__0
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
    // InternalXContext.g:278:1: entryRuleXConstantSLComment : ruleXConstantSLComment EOF ;
    public final void entryRuleXConstantSLComment() throws RecognitionException {
        try {
            // InternalXContext.g:279:1: ( ruleXConstantSLComment EOF )
            // InternalXContext.g:280:1: ruleXConstantSLComment EOF
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
    // InternalXContext.g:287:1: ruleXConstantSLComment : ( ( rule__XConstantSLComment__Group__0 ) ) ;
    public final void ruleXConstantSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:291:2: ( ( ( rule__XConstantSLComment__Group__0 ) ) )
            // InternalXContext.g:292:2: ( ( rule__XConstantSLComment__Group__0 ) )
            {
            // InternalXContext.g:292:2: ( ( rule__XConstantSLComment__Group__0 ) )
            // InternalXContext.g:293:3: ( rule__XConstantSLComment__Group__0 )
            {
             before(grammarAccess.getXConstantSLCommentAccess().getGroup()); 
            // InternalXContext.g:294:3: ( rule__XConstantSLComment__Group__0 )
            // InternalXContext.g:294:4: rule__XConstantSLComment__Group__0
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
    // InternalXContext.g:303:1: entryRuleXAxiom : ruleXAxiom EOF ;
    public final void entryRuleXAxiom() throws RecognitionException {
        try {
            // InternalXContext.g:304:1: ( ruleXAxiom EOF )
            // InternalXContext.g:305:1: ruleXAxiom EOF
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
    // InternalXContext.g:312:1: ruleXAxiom : ( ( rule__XAxiom__Alternatives ) ) ;
    public final void ruleXAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:316:2: ( ( ( rule__XAxiom__Alternatives ) ) )
            // InternalXContext.g:317:2: ( ( rule__XAxiom__Alternatives ) )
            {
            // InternalXContext.g:317:2: ( ( rule__XAxiom__Alternatives ) )
            // InternalXContext.g:318:3: ( rule__XAxiom__Alternatives )
            {
             before(grammarAccess.getXAxiomAccess().getAlternatives()); 
            // InternalXContext.g:319:3: ( rule__XAxiom__Alternatives )
            // InternalXContext.g:319:4: rule__XAxiom__Alternatives
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
    // InternalXContext.g:328:1: entryRuleXAxiomNoComment : ruleXAxiomNoComment EOF ;
    public final void entryRuleXAxiomNoComment() throws RecognitionException {
        try {
            // InternalXContext.g:329:1: ( ruleXAxiomNoComment EOF )
            // InternalXContext.g:330:1: ruleXAxiomNoComment EOF
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
    // InternalXContext.g:337:1: ruleXAxiomNoComment : ( ( rule__XAxiomNoComment__Group__0 ) ) ;
    public final void ruleXAxiomNoComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:341:2: ( ( ( rule__XAxiomNoComment__Group__0 ) ) )
            // InternalXContext.g:342:2: ( ( rule__XAxiomNoComment__Group__0 ) )
            {
            // InternalXContext.g:342:2: ( ( rule__XAxiomNoComment__Group__0 ) )
            // InternalXContext.g:343:3: ( rule__XAxiomNoComment__Group__0 )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getGroup()); 
            // InternalXContext.g:344:3: ( rule__XAxiomNoComment__Group__0 )
            // InternalXContext.g:344:4: rule__XAxiomNoComment__Group__0
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
    // InternalXContext.g:353:1: entryRuleXAxiomMLComment : ruleXAxiomMLComment EOF ;
    public final void entryRuleXAxiomMLComment() throws RecognitionException {
        try {
            // InternalXContext.g:354:1: ( ruleXAxiomMLComment EOF )
            // InternalXContext.g:355:1: ruleXAxiomMLComment EOF
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
    // InternalXContext.g:362:1: ruleXAxiomMLComment : ( ( rule__XAxiomMLComment__Group__0 ) ) ;
    public final void ruleXAxiomMLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:366:2: ( ( ( rule__XAxiomMLComment__Group__0 ) ) )
            // InternalXContext.g:367:2: ( ( rule__XAxiomMLComment__Group__0 ) )
            {
            // InternalXContext.g:367:2: ( ( rule__XAxiomMLComment__Group__0 ) )
            // InternalXContext.g:368:3: ( rule__XAxiomMLComment__Group__0 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getGroup()); 
            // InternalXContext.g:369:3: ( rule__XAxiomMLComment__Group__0 )
            // InternalXContext.g:369:4: rule__XAxiomMLComment__Group__0
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
    // InternalXContext.g:378:1: entryRuleXAxiomSLComment : ruleXAxiomSLComment EOF ;
    public final void entryRuleXAxiomSLComment() throws RecognitionException {
        try {
            // InternalXContext.g:379:1: ( ruleXAxiomSLComment EOF )
            // InternalXContext.g:380:1: ruleXAxiomSLComment EOF
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
    // InternalXContext.g:387:1: ruleXAxiomSLComment : ( ( rule__XAxiomSLComment__Group__0 ) ) ;
    public final void ruleXAxiomSLComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:391:2: ( ( ( rule__XAxiomSLComment__Group__0 ) ) )
            // InternalXContext.g:392:2: ( ( rule__XAxiomSLComment__Group__0 ) )
            {
            // InternalXContext.g:392:2: ( ( rule__XAxiomSLComment__Group__0 ) )
            // InternalXContext.g:393:3: ( rule__XAxiomSLComment__Group__0 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getGroup()); 
            // InternalXContext.g:394:3: ( rule__XAxiomSLComment__Group__0 )
            // InternalXContext.g:394:4: rule__XAxiomSLComment__Group__0
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


    // $ANTLR start "entryRuleXPredicate"
    // InternalXContext.g:403:1: entryRuleXPredicate : ruleXPredicate EOF ;
    public final void entryRuleXPredicate() throws RecognitionException {
        try {
            // InternalXContext.g:404:1: ( ruleXPredicate EOF )
            // InternalXContext.g:405:1: ruleXPredicate EOF
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
    // InternalXContext.g:412:1: ruleXPredicate : ( RULE_STRING ) ;
    public final void ruleXPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:416:2: ( ( RULE_STRING ) )
            // InternalXContext.g:417:2: ( RULE_STRING )
            {
            // InternalXContext.g:417:2: ( RULE_STRING )
            // InternalXContext.g:418:3: RULE_STRING
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


    // $ANTLR start "rule__XContext__CommentAlternatives_1_0"
    // InternalXContext.g:427:1: rule__XContext__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XContext__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:431:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXContext.g:432:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXContext.g:432:2: ( RULE_ML_COMMENT )
                    // InternalXContext.g:433:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:438:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXContext.g:438:2: ( RULE_SL_COMMENT )
                    // InternalXContext.g:439:3: RULE_SL_COMMENT
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
    // InternalXContext.g:448:1: rule__XCarrierSet__Alternatives : ( ( ruleXCarrierSetNoComment ) | ( ruleXCarrierSetMLComment ) | ( ruleXCarrierSetSLComment ) );
    public final void rule__XCarrierSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:452:1: ( ( ruleXCarrierSetNoComment ) | ( ruleXCarrierSetMLComment ) | ( ruleXCarrierSetSLComment ) )
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
                    // InternalXContext.g:453:2: ( ruleXCarrierSetNoComment )
                    {
                    // InternalXContext.g:453:2: ( ruleXCarrierSetNoComment )
                    // InternalXContext.g:454:3: ruleXCarrierSetNoComment
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
                    // InternalXContext.g:459:2: ( ruleXCarrierSetMLComment )
                    {
                    // InternalXContext.g:459:2: ( ruleXCarrierSetMLComment )
                    // InternalXContext.g:460:3: ruleXCarrierSetMLComment
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
                    // InternalXContext.g:465:2: ( ruleXCarrierSetSLComment )
                    {
                    // InternalXContext.g:465:2: ( ruleXCarrierSetSLComment )
                    // InternalXContext.g:466:3: ruleXCarrierSetSLComment
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
    // InternalXContext.g:475:1: rule__XConstant__Alternatives : ( ( ruleXConstantNoComment ) | ( ruleXConstantMLComment ) | ( ruleXConstantSLComment ) );
    public final void rule__XConstant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:479:1: ( ( ruleXConstantNoComment ) | ( ruleXConstantMLComment ) | ( ruleXConstantSLComment ) )
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
                    // InternalXContext.g:480:2: ( ruleXConstantNoComment )
                    {
                    // InternalXContext.g:480:2: ( ruleXConstantNoComment )
                    // InternalXContext.g:481:3: ruleXConstantNoComment
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
                    // InternalXContext.g:486:2: ( ruleXConstantMLComment )
                    {
                    // InternalXContext.g:486:2: ( ruleXConstantMLComment )
                    // InternalXContext.g:487:3: ruleXConstantMLComment
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
                    // InternalXContext.g:492:2: ( ruleXConstantSLComment )
                    {
                    // InternalXContext.g:492:2: ( ruleXConstantSLComment )
                    // InternalXContext.g:493:3: ruleXConstantSLComment
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
    // InternalXContext.g:502:1: rule__XAxiom__Alternatives : ( ( ruleXAxiomNoComment ) | ( ruleXAxiomMLComment ) | ( ruleXAxiomSLComment ) );
    public final void rule__XAxiom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:506:1: ( ( ruleXAxiomNoComment ) | ( ruleXAxiomMLComment ) | ( ruleXAxiomSLComment ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_XLABEL) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 19:
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
                    // InternalXContext.g:507:2: ( ruleXAxiomNoComment )
                    {
                    // InternalXContext.g:507:2: ( ruleXAxiomNoComment )
                    // InternalXContext.g:508:3: ruleXAxiomNoComment
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
                    // InternalXContext.g:513:2: ( ruleXAxiomMLComment )
                    {
                    // InternalXContext.g:513:2: ( ruleXAxiomMLComment )
                    // InternalXContext.g:514:3: ruleXAxiomMLComment
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
                    // InternalXContext.g:519:2: ( ruleXAxiomSLComment )
                    {
                    // InternalXContext.g:519:2: ( ruleXAxiomSLComment )
                    // InternalXContext.g:520:3: ruleXAxiomSLComment
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
    // InternalXContext.g:529:1: rule__XContext__Group__0 : rule__XContext__Group__0__Impl rule__XContext__Group__1 ;
    public final void rule__XContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:533:1: ( rule__XContext__Group__0__Impl rule__XContext__Group__1 )
            // InternalXContext.g:534:2: rule__XContext__Group__0__Impl rule__XContext__Group__1
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
    // InternalXContext.g:541:1: rule__XContext__Group__0__Impl : ( () ) ;
    public final void rule__XContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:545:1: ( ( () ) )
            // InternalXContext.g:546:1: ( () )
            {
            // InternalXContext.g:546:1: ( () )
            // InternalXContext.g:547:2: ()
            {
             before(grammarAccess.getXContextAccess().getContextAction_0()); 
            // InternalXContext.g:548:2: ()
            // InternalXContext.g:548:3: 
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
    // InternalXContext.g:556:1: rule__XContext__Group__1 : rule__XContext__Group__1__Impl rule__XContext__Group__2 ;
    public final void rule__XContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:560:1: ( rule__XContext__Group__1__Impl rule__XContext__Group__2 )
            // InternalXContext.g:561:2: rule__XContext__Group__1__Impl rule__XContext__Group__2
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
    // InternalXContext.g:568:1: rule__XContext__Group__1__Impl : ( ( rule__XContext__CommentAssignment_1 )? ) ;
    public final void rule__XContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:572:1: ( ( ( rule__XContext__CommentAssignment_1 )? ) )
            // InternalXContext.g:573:1: ( ( rule__XContext__CommentAssignment_1 )? )
            {
            // InternalXContext.g:573:1: ( ( rule__XContext__CommentAssignment_1 )? )
            // InternalXContext.g:574:2: ( rule__XContext__CommentAssignment_1 )?
            {
             before(grammarAccess.getXContextAccess().getCommentAssignment_1()); 
            // InternalXContext.g:575:2: ( rule__XContext__CommentAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ML_COMMENT && LA5_0<=RULE_SL_COMMENT)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXContext.g:575:3: rule__XContext__CommentAssignment_1
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
    // InternalXContext.g:583:1: rule__XContext__Group__2 : rule__XContext__Group__2__Impl rule__XContext__Group__3 ;
    public final void rule__XContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:587:1: ( rule__XContext__Group__2__Impl rule__XContext__Group__3 )
            // InternalXContext.g:588:2: rule__XContext__Group__2__Impl rule__XContext__Group__3
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
    // InternalXContext.g:595:1: rule__XContext__Group__2__Impl : ( 'context' ) ;
    public final void rule__XContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:599:1: ( ( 'context' ) )
            // InternalXContext.g:600:1: ( 'context' )
            {
            // InternalXContext.g:600:1: ( 'context' )
            // InternalXContext.g:601:2: 'context'
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
    // InternalXContext.g:610:1: rule__XContext__Group__3 : rule__XContext__Group__3__Impl rule__XContext__Group__4 ;
    public final void rule__XContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:614:1: ( rule__XContext__Group__3__Impl rule__XContext__Group__4 )
            // InternalXContext.g:615:2: rule__XContext__Group__3__Impl rule__XContext__Group__4
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
    // InternalXContext.g:622:1: rule__XContext__Group__3__Impl : ( ( rule__XContext__NameAssignment_3 ) ) ;
    public final void rule__XContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:626:1: ( ( ( rule__XContext__NameAssignment_3 ) ) )
            // InternalXContext.g:627:1: ( ( rule__XContext__NameAssignment_3 ) )
            {
            // InternalXContext.g:627:1: ( ( rule__XContext__NameAssignment_3 ) )
            // InternalXContext.g:628:2: ( rule__XContext__NameAssignment_3 )
            {
             before(grammarAccess.getXContextAccess().getNameAssignment_3()); 
            // InternalXContext.g:629:2: ( rule__XContext__NameAssignment_3 )
            // InternalXContext.g:629:3: rule__XContext__NameAssignment_3
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
    // InternalXContext.g:637:1: rule__XContext__Group__4 : rule__XContext__Group__4__Impl rule__XContext__Group__5 ;
    public final void rule__XContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:641:1: ( rule__XContext__Group__4__Impl rule__XContext__Group__5 )
            // InternalXContext.g:642:2: rule__XContext__Group__4__Impl rule__XContext__Group__5
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
    // InternalXContext.g:649:1: rule__XContext__Group__4__Impl : ( ( rule__XContext__Group_4__0 )? ) ;
    public final void rule__XContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:653:1: ( ( ( rule__XContext__Group_4__0 )? ) )
            // InternalXContext.g:654:1: ( ( rule__XContext__Group_4__0 )? )
            {
            // InternalXContext.g:654:1: ( ( rule__XContext__Group_4__0 )? )
            // InternalXContext.g:655:2: ( rule__XContext__Group_4__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_4()); 
            // InternalXContext.g:656:2: ( rule__XContext__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXContext.g:656:3: rule__XContext__Group_4__0
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
    // InternalXContext.g:664:1: rule__XContext__Group__5 : rule__XContext__Group__5__Impl rule__XContext__Group__6 ;
    public final void rule__XContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:668:1: ( rule__XContext__Group__5__Impl rule__XContext__Group__6 )
            // InternalXContext.g:669:2: rule__XContext__Group__5__Impl rule__XContext__Group__6
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
    // InternalXContext.g:676:1: rule__XContext__Group__5__Impl : ( ( rule__XContext__Group_5__0 )? ) ;
    public final void rule__XContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:680:1: ( ( ( rule__XContext__Group_5__0 )? ) )
            // InternalXContext.g:681:1: ( ( rule__XContext__Group_5__0 )? )
            {
            // InternalXContext.g:681:1: ( ( rule__XContext__Group_5__0 )? )
            // InternalXContext.g:682:2: ( rule__XContext__Group_5__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_5()); 
            // InternalXContext.g:683:2: ( rule__XContext__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXContext.g:683:3: rule__XContext__Group_5__0
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
    // InternalXContext.g:691:1: rule__XContext__Group__6 : rule__XContext__Group__6__Impl rule__XContext__Group__7 ;
    public final void rule__XContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:695:1: ( rule__XContext__Group__6__Impl rule__XContext__Group__7 )
            // InternalXContext.g:696:2: rule__XContext__Group__6__Impl rule__XContext__Group__7
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
    // InternalXContext.g:703:1: rule__XContext__Group__6__Impl : ( ( rule__XContext__Group_6__0 )? ) ;
    public final void rule__XContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:707:1: ( ( ( rule__XContext__Group_6__0 )? ) )
            // InternalXContext.g:708:1: ( ( rule__XContext__Group_6__0 )? )
            {
            // InternalXContext.g:708:1: ( ( rule__XContext__Group_6__0 )? )
            // InternalXContext.g:709:2: ( rule__XContext__Group_6__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_6()); 
            // InternalXContext.g:710:2: ( rule__XContext__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXContext.g:710:3: rule__XContext__Group_6__0
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
    // InternalXContext.g:718:1: rule__XContext__Group__7 : rule__XContext__Group__7__Impl rule__XContext__Group__8 ;
    public final void rule__XContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:722:1: ( rule__XContext__Group__7__Impl rule__XContext__Group__8 )
            // InternalXContext.g:723:2: rule__XContext__Group__7__Impl rule__XContext__Group__8
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
    // InternalXContext.g:730:1: rule__XContext__Group__7__Impl : ( ( rule__XContext__Group_7__0 )? ) ;
    public final void rule__XContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:734:1: ( ( ( rule__XContext__Group_7__0 )? ) )
            // InternalXContext.g:735:1: ( ( rule__XContext__Group_7__0 )? )
            {
            // InternalXContext.g:735:1: ( ( rule__XContext__Group_7__0 )? )
            // InternalXContext.g:736:2: ( rule__XContext__Group_7__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_7()); 
            // InternalXContext.g:737:2: ( rule__XContext__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXContext.g:737:3: rule__XContext__Group_7__0
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
    // InternalXContext.g:745:1: rule__XContext__Group__8 : rule__XContext__Group__8__Impl ;
    public final void rule__XContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:749:1: ( rule__XContext__Group__8__Impl )
            // InternalXContext.g:750:2: rule__XContext__Group__8__Impl
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
    // InternalXContext.g:756:1: rule__XContext__Group__8__Impl : ( 'end' ) ;
    public final void rule__XContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:760:1: ( ( 'end' ) )
            // InternalXContext.g:761:1: ( 'end' )
            {
            // InternalXContext.g:761:1: ( 'end' )
            // InternalXContext.g:762:2: 'end'
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
    // InternalXContext.g:772:1: rule__XContext__Group_4__0 : rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 ;
    public final void rule__XContext__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:776:1: ( rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 )
            // InternalXContext.g:777:2: rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1
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
    // InternalXContext.g:784:1: rule__XContext__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__XContext__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:788:1: ( ( 'extends' ) )
            // InternalXContext.g:789:1: ( 'extends' )
            {
            // InternalXContext.g:789:1: ( 'extends' )
            // InternalXContext.g:790:2: 'extends'
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
    // InternalXContext.g:799:1: rule__XContext__Group_4__1 : rule__XContext__Group_4__1__Impl ;
    public final void rule__XContext__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:803:1: ( rule__XContext__Group_4__1__Impl )
            // InternalXContext.g:804:2: rule__XContext__Group_4__1__Impl
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
    // InternalXContext.g:810:1: rule__XContext__Group_4__1__Impl : ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) ;
    public final void rule__XContext__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:814:1: ( ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) )
            // InternalXContext.g:815:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            {
            // InternalXContext.g:815:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            // InternalXContext.g:816:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            {
            // InternalXContext.g:816:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) )
            // InternalXContext.g:817:3: ( rule__XContext__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:818:3: ( rule__XContext__ExtendsAssignment_4_1 )
            // InternalXContext.g:818:4: rule__XContext__ExtendsAssignment_4_1
            {
            pushFollow(FOLLOW_6);
            rule__XContext__ExtendsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 

            }

            // InternalXContext.g:821:2: ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            // InternalXContext.g:822:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:823:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXContext.g:823:4: rule__XContext__ExtendsAssignment_4_1
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
    // InternalXContext.g:833:1: rule__XContext__Group_5__0 : rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 ;
    public final void rule__XContext__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:837:1: ( rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 )
            // InternalXContext.g:838:2: rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1
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
    // InternalXContext.g:845:1: rule__XContext__Group_5__0__Impl : ( 'sets' ) ;
    public final void rule__XContext__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:849:1: ( ( 'sets' ) )
            // InternalXContext.g:850:1: ( 'sets' )
            {
            // InternalXContext.g:850:1: ( 'sets' )
            // InternalXContext.g:851:2: 'sets'
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
    // InternalXContext.g:860:1: rule__XContext__Group_5__1 : rule__XContext__Group_5__1__Impl ;
    public final void rule__XContext__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:864:1: ( rule__XContext__Group_5__1__Impl )
            // InternalXContext.g:865:2: rule__XContext__Group_5__1__Impl
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
    // InternalXContext.g:871:1: rule__XContext__Group_5__1__Impl : ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) ) ;
    public final void rule__XContext__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:875:1: ( ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) ) )
            // InternalXContext.g:876:1: ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) )
            {
            // InternalXContext.g:876:1: ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) )
            // InternalXContext.g:877:2: ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* )
            {
            // InternalXContext.g:877:2: ( ( rule__XContext__SetsAssignment_5_1 ) )
            // InternalXContext.g:878:3: ( rule__XContext__SetsAssignment_5_1 )
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 
            // InternalXContext.g:879:3: ( rule__XContext__SetsAssignment_5_1 )
            // InternalXContext.g:879:4: rule__XContext__SetsAssignment_5_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__SetsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 

            }

            // InternalXContext.g:882:2: ( ( rule__XContext__SetsAssignment_5_1 )* )
            // InternalXContext.g:883:3: ( rule__XContext__SetsAssignment_5_1 )*
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 
            // InternalXContext.g:884:3: ( rule__XContext__SetsAssignment_5_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ML_COMMENT||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXContext.g:884:4: rule__XContext__SetsAssignment_5_1
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
    // InternalXContext.g:894:1: rule__XContext__Group_6__0 : rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 ;
    public final void rule__XContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:898:1: ( rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 )
            // InternalXContext.g:899:2: rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1
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
    // InternalXContext.g:906:1: rule__XContext__Group_6__0__Impl : ( 'constants' ) ;
    public final void rule__XContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:910:1: ( ( 'constants' ) )
            // InternalXContext.g:911:1: ( 'constants' )
            {
            // InternalXContext.g:911:1: ( 'constants' )
            // InternalXContext.g:912:2: 'constants'
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
    // InternalXContext.g:921:1: rule__XContext__Group_6__1 : rule__XContext__Group_6__1__Impl ;
    public final void rule__XContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:925:1: ( rule__XContext__Group_6__1__Impl )
            // InternalXContext.g:926:2: rule__XContext__Group_6__1__Impl
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
    // InternalXContext.g:932:1: rule__XContext__Group_6__1__Impl : ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) ) ;
    public final void rule__XContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:936:1: ( ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) ) )
            // InternalXContext.g:937:1: ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) )
            {
            // InternalXContext.g:937:1: ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) )
            // InternalXContext.g:938:2: ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* )
            {
            // InternalXContext.g:938:2: ( ( rule__XContext__ConstantsAssignment_6_1 ) )
            // InternalXContext.g:939:3: ( rule__XContext__ConstantsAssignment_6_1 )
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 
            // InternalXContext.g:940:3: ( rule__XContext__ConstantsAssignment_6_1 )
            // InternalXContext.g:940:4: rule__XContext__ConstantsAssignment_6_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__ConstantsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 

            }

            // InternalXContext.g:943:2: ( ( rule__XContext__ConstantsAssignment_6_1 )* )
            // InternalXContext.g:944:3: ( rule__XContext__ConstantsAssignment_6_1 )*
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 
            // InternalXContext.g:945:3: ( rule__XContext__ConstantsAssignment_6_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ML_COMMENT||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXContext.g:945:4: rule__XContext__ConstantsAssignment_6_1
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
    // InternalXContext.g:955:1: rule__XContext__Group_7__0 : rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 ;
    public final void rule__XContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:959:1: ( rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 )
            // InternalXContext.g:960:2: rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1
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
    // InternalXContext.g:967:1: rule__XContext__Group_7__0__Impl : ( 'axioms' ) ;
    public final void rule__XContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:971:1: ( ( 'axioms' ) )
            // InternalXContext.g:972:1: ( 'axioms' )
            {
            // InternalXContext.g:972:1: ( 'axioms' )
            // InternalXContext.g:973:2: 'axioms'
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
    // InternalXContext.g:982:1: rule__XContext__Group_7__1 : rule__XContext__Group_7__1__Impl ;
    public final void rule__XContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:986:1: ( rule__XContext__Group_7__1__Impl )
            // InternalXContext.g:987:2: rule__XContext__Group_7__1__Impl
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
    // InternalXContext.g:993:1: rule__XContext__Group_7__1__Impl : ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) ;
    public final void rule__XContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:997:1: ( ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) )
            // InternalXContext.g:998:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            {
            // InternalXContext.g:998:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            // InternalXContext.g:999:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            {
            // InternalXContext.g:999:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) )
            // InternalXContext.g:1000:3: ( rule__XContext__AxiomsAssignment_7_1 )
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:1001:3: ( rule__XContext__AxiomsAssignment_7_1 )
            // InternalXContext.g:1001:4: rule__XContext__AxiomsAssignment_7_1
            {
            pushFollow(FOLLOW_10);
            rule__XContext__AxiomsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 

            }

            // InternalXContext.g:1004:2: ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            // InternalXContext.g:1005:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:1006:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ML_COMMENT||LA13_0==RULE_XLABEL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXContext.g:1006:4: rule__XContext__AxiomsAssignment_7_1
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXContext.g:1016:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1020:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXContext.g:1021:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalXContext.g:1028:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1032:1: ( ( RULE_ID ) )
            // InternalXContext.g:1033:1: ( RULE_ID )
            {
            // InternalXContext.g:1033:1: ( RULE_ID )
            // InternalXContext.g:1034:2: RULE_ID
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
    // InternalXContext.g:1043:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1047:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXContext.g:1048:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXContext.g:1054:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1058:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXContext.g:1059:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXContext.g:1059:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXContext.g:1060:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXContext.g:1061:2: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXContext.g:1061:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

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
    // InternalXContext.g:1070:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1074:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXContext.g:1075:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXContext.g:1082:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1086:1: ( ( '.' ) )
            // InternalXContext.g:1087:1: ( '.' )
            {
            // InternalXContext.g:1087:1: ( '.' )
            // InternalXContext.g:1088:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalXContext.g:1097:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1101:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXContext.g:1102:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXContext.g:1108:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1112:1: ( ( RULE_ID ) )
            // InternalXContext.g:1113:1: ( RULE_ID )
            {
            // InternalXContext.g:1113:1: ( RULE_ID )
            // InternalXContext.g:1114:2: RULE_ID
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


    // $ANTLR start "rule__XCarrierSetNoComment__Group__0"
    // InternalXContext.g:1124:1: rule__XCarrierSetNoComment__Group__0 : rule__XCarrierSetNoComment__Group__0__Impl rule__XCarrierSetNoComment__Group__1 ;
    public final void rule__XCarrierSetNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1128:1: ( rule__XCarrierSetNoComment__Group__0__Impl rule__XCarrierSetNoComment__Group__1 )
            // InternalXContext.g:1129:2: rule__XCarrierSetNoComment__Group__0__Impl rule__XCarrierSetNoComment__Group__1
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
    // InternalXContext.g:1136:1: rule__XCarrierSetNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSetNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1140:1: ( ( () ) )
            // InternalXContext.g:1141:1: ( () )
            {
            // InternalXContext.g:1141:1: ( () )
            // InternalXContext.g:1142:2: ()
            {
             before(grammarAccess.getXCarrierSetNoCommentAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:1143:2: ()
            // InternalXContext.g:1143:3: 
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
    // InternalXContext.g:1151:1: rule__XCarrierSetNoComment__Group__1 : rule__XCarrierSetNoComment__Group__1__Impl ;
    public final void rule__XCarrierSetNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1155:1: ( rule__XCarrierSetNoComment__Group__1__Impl )
            // InternalXContext.g:1156:2: rule__XCarrierSetNoComment__Group__1__Impl
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
    // InternalXContext.g:1162:1: rule__XCarrierSetNoComment__Group__1__Impl : ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) ) ;
    public final void rule__XCarrierSetNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1166:1: ( ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1167:1: ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1167:1: ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) )
            // InternalXContext.g:1168:2: ( rule__XCarrierSetNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetNoCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1169:2: ( rule__XCarrierSetNoComment__NameAssignment_1 )
            // InternalXContext.g:1169:3: rule__XCarrierSetNoComment__NameAssignment_1
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
    // InternalXContext.g:1178:1: rule__XCarrierSetMLComment__Group__0 : rule__XCarrierSetMLComment__Group__0__Impl rule__XCarrierSetMLComment__Group__1 ;
    public final void rule__XCarrierSetMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1182:1: ( rule__XCarrierSetMLComment__Group__0__Impl rule__XCarrierSetMLComment__Group__1 )
            // InternalXContext.g:1183:2: rule__XCarrierSetMLComment__Group__0__Impl rule__XCarrierSetMLComment__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXContext.g:1190:1: rule__XCarrierSetMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSetMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1194:1: ( ( () ) )
            // InternalXContext.g:1195:1: ( () )
            {
            // InternalXContext.g:1195:1: ( () )
            // InternalXContext.g:1196:2: ()
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:1197:2: ()
            // InternalXContext.g:1197:3: 
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
    // InternalXContext.g:1205:1: rule__XCarrierSetMLComment__Group__1 : rule__XCarrierSetMLComment__Group__1__Impl rule__XCarrierSetMLComment__Group__2 ;
    public final void rule__XCarrierSetMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1209:1: ( rule__XCarrierSetMLComment__Group__1__Impl rule__XCarrierSetMLComment__Group__2 )
            // InternalXContext.g:1210:2: rule__XCarrierSetMLComment__Group__1__Impl rule__XCarrierSetMLComment__Group__2
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
    // InternalXContext.g:1217:1: rule__XCarrierSetMLComment__Group__1__Impl : ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XCarrierSetMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1221:1: ( ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) ) )
            // InternalXContext.g:1222:1: ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) )
            {
            // InternalXContext.g:1222:1: ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) )
            // InternalXContext.g:1223:2: ( rule__XCarrierSetMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1224:2: ( rule__XCarrierSetMLComment__CommentAssignment_1 )
            // InternalXContext.g:1224:3: rule__XCarrierSetMLComment__CommentAssignment_1
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
    // InternalXContext.g:1232:1: rule__XCarrierSetMLComment__Group__2 : rule__XCarrierSetMLComment__Group__2__Impl ;
    public final void rule__XCarrierSetMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1236:1: ( rule__XCarrierSetMLComment__Group__2__Impl )
            // InternalXContext.g:1237:2: rule__XCarrierSetMLComment__Group__2__Impl
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
    // InternalXContext.g:1243:1: rule__XCarrierSetMLComment__Group__2__Impl : ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) ) ;
    public final void rule__XCarrierSetMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1247:1: ( ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) ) )
            // InternalXContext.g:1248:1: ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) )
            {
            // InternalXContext.g:1248:1: ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) )
            // InternalXContext.g:1249:2: ( rule__XCarrierSetMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getNameAssignment_2()); 
            // InternalXContext.g:1250:2: ( rule__XCarrierSetMLComment__NameAssignment_2 )
            // InternalXContext.g:1250:3: rule__XCarrierSetMLComment__NameAssignment_2
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
    // InternalXContext.g:1259:1: rule__XCarrierSetSLComment__Group__0 : rule__XCarrierSetSLComment__Group__0__Impl rule__XCarrierSetSLComment__Group__1 ;
    public final void rule__XCarrierSetSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1263:1: ( rule__XCarrierSetSLComment__Group__0__Impl rule__XCarrierSetSLComment__Group__1 )
            // InternalXContext.g:1264:2: rule__XCarrierSetSLComment__Group__0__Impl rule__XCarrierSetSLComment__Group__1
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
    // InternalXContext.g:1271:1: rule__XCarrierSetSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSetSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1275:1: ( ( () ) )
            // InternalXContext.g:1276:1: ( () )
            {
            // InternalXContext.g:1276:1: ( () )
            // InternalXContext.g:1277:2: ()
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:1278:2: ()
            // InternalXContext.g:1278:3: 
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
    // InternalXContext.g:1286:1: rule__XCarrierSetSLComment__Group__1 : rule__XCarrierSetSLComment__Group__1__Impl rule__XCarrierSetSLComment__Group__2 ;
    public final void rule__XCarrierSetSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1290:1: ( rule__XCarrierSetSLComment__Group__1__Impl rule__XCarrierSetSLComment__Group__2 )
            // InternalXContext.g:1291:2: rule__XCarrierSetSLComment__Group__1__Impl rule__XCarrierSetSLComment__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalXContext.g:1298:1: rule__XCarrierSetSLComment__Group__1__Impl : ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) ) ;
    public final void rule__XCarrierSetSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1302:1: ( ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1303:1: ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1303:1: ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) )
            // InternalXContext.g:1304:2: ( rule__XCarrierSetSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1305:2: ( rule__XCarrierSetSLComment__NameAssignment_1 )
            // InternalXContext.g:1305:3: rule__XCarrierSetSLComment__NameAssignment_1
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
    // InternalXContext.g:1313:1: rule__XCarrierSetSLComment__Group__2 : rule__XCarrierSetSLComment__Group__2__Impl ;
    public final void rule__XCarrierSetSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1317:1: ( rule__XCarrierSetSLComment__Group__2__Impl )
            // InternalXContext.g:1318:2: rule__XCarrierSetSLComment__Group__2__Impl
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
    // InternalXContext.g:1324:1: rule__XCarrierSetSLComment__Group__2__Impl : ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) ) ;
    public final void rule__XCarrierSetSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1328:1: ( ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) ) )
            // InternalXContext.g:1329:1: ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) )
            {
            // InternalXContext.g:1329:1: ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) )
            // InternalXContext.g:1330:2: ( rule__XCarrierSetSLComment__CommentAssignment_2 )
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getCommentAssignment_2()); 
            // InternalXContext.g:1331:2: ( rule__XCarrierSetSLComment__CommentAssignment_2 )
            // InternalXContext.g:1331:3: rule__XCarrierSetSLComment__CommentAssignment_2
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
    // InternalXContext.g:1340:1: rule__XConstantNoComment__Group__0 : rule__XConstantNoComment__Group__0__Impl rule__XConstantNoComment__Group__1 ;
    public final void rule__XConstantNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1344:1: ( rule__XConstantNoComment__Group__0__Impl rule__XConstantNoComment__Group__1 )
            // InternalXContext.g:1345:2: rule__XConstantNoComment__Group__0__Impl rule__XConstantNoComment__Group__1
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
    // InternalXContext.g:1352:1: rule__XConstantNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XConstantNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1356:1: ( ( () ) )
            // InternalXContext.g:1357:1: ( () )
            {
            // InternalXContext.g:1357:1: ( () )
            // InternalXContext.g:1358:2: ()
            {
             before(grammarAccess.getXConstantNoCommentAccess().getConstantAction_0()); 
            // InternalXContext.g:1359:2: ()
            // InternalXContext.g:1359:3: 
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
    // InternalXContext.g:1367:1: rule__XConstantNoComment__Group__1 : rule__XConstantNoComment__Group__1__Impl ;
    public final void rule__XConstantNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1371:1: ( rule__XConstantNoComment__Group__1__Impl )
            // InternalXContext.g:1372:2: rule__XConstantNoComment__Group__1__Impl
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
    // InternalXContext.g:1378:1: rule__XConstantNoComment__Group__1__Impl : ( ( rule__XConstantNoComment__NameAssignment_1 ) ) ;
    public final void rule__XConstantNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1382:1: ( ( ( rule__XConstantNoComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1383:1: ( ( rule__XConstantNoComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1383:1: ( ( rule__XConstantNoComment__NameAssignment_1 ) )
            // InternalXContext.g:1384:2: ( rule__XConstantNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXConstantNoCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1385:2: ( rule__XConstantNoComment__NameAssignment_1 )
            // InternalXContext.g:1385:3: rule__XConstantNoComment__NameAssignment_1
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
    // InternalXContext.g:1394:1: rule__XConstantMLComment__Group__0 : rule__XConstantMLComment__Group__0__Impl rule__XConstantMLComment__Group__1 ;
    public final void rule__XConstantMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1398:1: ( rule__XConstantMLComment__Group__0__Impl rule__XConstantMLComment__Group__1 )
            // InternalXContext.g:1399:2: rule__XConstantMLComment__Group__0__Impl rule__XConstantMLComment__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXContext.g:1406:1: rule__XConstantMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XConstantMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1410:1: ( ( () ) )
            // InternalXContext.g:1411:1: ( () )
            {
            // InternalXContext.g:1411:1: ( () )
            // InternalXContext.g:1412:2: ()
            {
             before(grammarAccess.getXConstantMLCommentAccess().getConstantAction_0()); 
            // InternalXContext.g:1413:2: ()
            // InternalXContext.g:1413:3: 
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
    // InternalXContext.g:1421:1: rule__XConstantMLComment__Group__1 : rule__XConstantMLComment__Group__1__Impl rule__XConstantMLComment__Group__2 ;
    public final void rule__XConstantMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1425:1: ( rule__XConstantMLComment__Group__1__Impl rule__XConstantMLComment__Group__2 )
            // InternalXContext.g:1426:2: rule__XConstantMLComment__Group__1__Impl rule__XConstantMLComment__Group__2
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
    // InternalXContext.g:1433:1: rule__XConstantMLComment__Group__1__Impl : ( ( rule__XConstantMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XConstantMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1437:1: ( ( ( rule__XConstantMLComment__CommentAssignment_1 ) ) )
            // InternalXContext.g:1438:1: ( ( rule__XConstantMLComment__CommentAssignment_1 ) )
            {
            // InternalXContext.g:1438:1: ( ( rule__XConstantMLComment__CommentAssignment_1 ) )
            // InternalXContext.g:1439:2: ( rule__XConstantMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXConstantMLCommentAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1440:2: ( rule__XConstantMLComment__CommentAssignment_1 )
            // InternalXContext.g:1440:3: rule__XConstantMLComment__CommentAssignment_1
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
    // InternalXContext.g:1448:1: rule__XConstantMLComment__Group__2 : rule__XConstantMLComment__Group__2__Impl ;
    public final void rule__XConstantMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1452:1: ( rule__XConstantMLComment__Group__2__Impl )
            // InternalXContext.g:1453:2: rule__XConstantMLComment__Group__2__Impl
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
    // InternalXContext.g:1459:1: rule__XConstantMLComment__Group__2__Impl : ( ( rule__XConstantMLComment__NameAssignment_2 ) ) ;
    public final void rule__XConstantMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1463:1: ( ( ( rule__XConstantMLComment__NameAssignment_2 ) ) )
            // InternalXContext.g:1464:1: ( ( rule__XConstantMLComment__NameAssignment_2 ) )
            {
            // InternalXContext.g:1464:1: ( ( rule__XConstantMLComment__NameAssignment_2 ) )
            // InternalXContext.g:1465:2: ( rule__XConstantMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXConstantMLCommentAccess().getNameAssignment_2()); 
            // InternalXContext.g:1466:2: ( rule__XConstantMLComment__NameAssignment_2 )
            // InternalXContext.g:1466:3: rule__XConstantMLComment__NameAssignment_2
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
    // InternalXContext.g:1475:1: rule__XConstantSLComment__Group__0 : rule__XConstantSLComment__Group__0__Impl rule__XConstantSLComment__Group__1 ;
    public final void rule__XConstantSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1479:1: ( rule__XConstantSLComment__Group__0__Impl rule__XConstantSLComment__Group__1 )
            // InternalXContext.g:1480:2: rule__XConstantSLComment__Group__0__Impl rule__XConstantSLComment__Group__1
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
    // InternalXContext.g:1487:1: rule__XConstantSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XConstantSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1491:1: ( ( () ) )
            // InternalXContext.g:1492:1: ( () )
            {
            // InternalXContext.g:1492:1: ( () )
            // InternalXContext.g:1493:2: ()
            {
             before(grammarAccess.getXConstantSLCommentAccess().getConstantAction_0()); 
            // InternalXContext.g:1494:2: ()
            // InternalXContext.g:1494:3: 
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
    // InternalXContext.g:1502:1: rule__XConstantSLComment__Group__1 : rule__XConstantSLComment__Group__1__Impl rule__XConstantSLComment__Group__2 ;
    public final void rule__XConstantSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1506:1: ( rule__XConstantSLComment__Group__1__Impl rule__XConstantSLComment__Group__2 )
            // InternalXContext.g:1507:2: rule__XConstantSLComment__Group__1__Impl rule__XConstantSLComment__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalXContext.g:1514:1: rule__XConstantSLComment__Group__1__Impl : ( ( rule__XConstantSLComment__NameAssignment_1 ) ) ;
    public final void rule__XConstantSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1518:1: ( ( ( rule__XConstantSLComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1519:1: ( ( rule__XConstantSLComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1519:1: ( ( rule__XConstantSLComment__NameAssignment_1 ) )
            // InternalXContext.g:1520:2: ( rule__XConstantSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXConstantSLCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1521:2: ( rule__XConstantSLComment__NameAssignment_1 )
            // InternalXContext.g:1521:3: rule__XConstantSLComment__NameAssignment_1
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
    // InternalXContext.g:1529:1: rule__XConstantSLComment__Group__2 : rule__XConstantSLComment__Group__2__Impl ;
    public final void rule__XConstantSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1533:1: ( rule__XConstantSLComment__Group__2__Impl )
            // InternalXContext.g:1534:2: rule__XConstantSLComment__Group__2__Impl
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
    // InternalXContext.g:1540:1: rule__XConstantSLComment__Group__2__Impl : ( ( rule__XConstantSLComment__CommentAssignment_2 ) ) ;
    public final void rule__XConstantSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1544:1: ( ( ( rule__XConstantSLComment__CommentAssignment_2 ) ) )
            // InternalXContext.g:1545:1: ( ( rule__XConstantSLComment__CommentAssignment_2 ) )
            {
            // InternalXContext.g:1545:1: ( ( rule__XConstantSLComment__CommentAssignment_2 ) )
            // InternalXContext.g:1546:2: ( rule__XConstantSLComment__CommentAssignment_2 )
            {
             before(grammarAccess.getXConstantSLCommentAccess().getCommentAssignment_2()); 
            // InternalXContext.g:1547:2: ( rule__XConstantSLComment__CommentAssignment_2 )
            // InternalXContext.g:1547:3: rule__XConstantSLComment__CommentAssignment_2
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
    // InternalXContext.g:1556:1: rule__XAxiomNoComment__Group__0 : rule__XAxiomNoComment__Group__0__Impl rule__XAxiomNoComment__Group__1 ;
    public final void rule__XAxiomNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1560:1: ( rule__XAxiomNoComment__Group__0__Impl rule__XAxiomNoComment__Group__1 )
            // InternalXContext.g:1561:2: rule__XAxiomNoComment__Group__0__Impl rule__XAxiomNoComment__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalXContext.g:1568:1: rule__XAxiomNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XAxiomNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1572:1: ( ( () ) )
            // InternalXContext.g:1573:1: ( () )
            {
            // InternalXContext.g:1573:1: ( () )
            // InternalXContext.g:1574:2: ()
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getAxiomAction_0()); 
            // InternalXContext.g:1575:2: ()
            // InternalXContext.g:1575:3: 
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
    // InternalXContext.g:1583:1: rule__XAxiomNoComment__Group__1 : rule__XAxiomNoComment__Group__1__Impl rule__XAxiomNoComment__Group__2 ;
    public final void rule__XAxiomNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1587:1: ( rule__XAxiomNoComment__Group__1__Impl rule__XAxiomNoComment__Group__2 )
            // InternalXContext.g:1588:2: rule__XAxiomNoComment__Group__1__Impl rule__XAxiomNoComment__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalXContext.g:1595:1: rule__XAxiomNoComment__Group__1__Impl : ( ( rule__XAxiomNoComment__NameAssignment_1 ) ) ;
    public final void rule__XAxiomNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1599:1: ( ( ( rule__XAxiomNoComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1600:1: ( ( rule__XAxiomNoComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1600:1: ( ( rule__XAxiomNoComment__NameAssignment_1 ) )
            // InternalXContext.g:1601:2: ( rule__XAxiomNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1602:2: ( rule__XAxiomNoComment__NameAssignment_1 )
            // InternalXContext.g:1602:3: rule__XAxiomNoComment__NameAssignment_1
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
    // InternalXContext.g:1610:1: rule__XAxiomNoComment__Group__2 : rule__XAxiomNoComment__Group__2__Impl rule__XAxiomNoComment__Group__3 ;
    public final void rule__XAxiomNoComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1614:1: ( rule__XAxiomNoComment__Group__2__Impl rule__XAxiomNoComment__Group__3 )
            // InternalXContext.g:1615:2: rule__XAxiomNoComment__Group__2__Impl rule__XAxiomNoComment__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalXContext.g:1622:1: rule__XAxiomNoComment__Group__2__Impl : ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) ) ;
    public final void rule__XAxiomNoComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1626:1: ( ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) ) )
            // InternalXContext.g:1627:1: ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) )
            {
            // InternalXContext.g:1627:1: ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) )
            // InternalXContext.g:1628:2: ( rule__XAxiomNoComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getPredicateAssignment_2()); 
            // InternalXContext.g:1629:2: ( rule__XAxiomNoComment__PredicateAssignment_2 )
            // InternalXContext.g:1629:3: rule__XAxiomNoComment__PredicateAssignment_2
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
    // InternalXContext.g:1637:1: rule__XAxiomNoComment__Group__3 : rule__XAxiomNoComment__Group__3__Impl ;
    public final void rule__XAxiomNoComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1641:1: ( rule__XAxiomNoComment__Group__3__Impl )
            // InternalXContext.g:1642:2: rule__XAxiomNoComment__Group__3__Impl
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
    // InternalXContext.g:1648:1: rule__XAxiomNoComment__Group__3__Impl : ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? ) ;
    public final void rule__XAxiomNoComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1652:1: ( ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? ) )
            // InternalXContext.g:1653:1: ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? )
            {
            // InternalXContext.g:1653:1: ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? )
            // InternalXContext.g:1654:2: ( rule__XAxiomNoComment__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getTheoremAssignment_3()); 
            // InternalXContext.g:1655:2: ( rule__XAxiomNoComment__TheoremAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXContext.g:1655:3: rule__XAxiomNoComment__TheoremAssignment_3
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
    // InternalXContext.g:1664:1: rule__XAxiomMLComment__Group__0 : rule__XAxiomMLComment__Group__0__Impl rule__XAxiomMLComment__Group__1 ;
    public final void rule__XAxiomMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1668:1: ( rule__XAxiomMLComment__Group__0__Impl rule__XAxiomMLComment__Group__1 )
            // InternalXContext.g:1669:2: rule__XAxiomMLComment__Group__0__Impl rule__XAxiomMLComment__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXContext.g:1676:1: rule__XAxiomMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XAxiomMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1680:1: ( ( () ) )
            // InternalXContext.g:1681:1: ( () )
            {
            // InternalXContext.g:1681:1: ( () )
            // InternalXContext.g:1682:2: ()
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getAxiomAction_0()); 
            // InternalXContext.g:1683:2: ()
            // InternalXContext.g:1683:3: 
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
    // InternalXContext.g:1691:1: rule__XAxiomMLComment__Group__1 : rule__XAxiomMLComment__Group__1__Impl rule__XAxiomMLComment__Group__2 ;
    public final void rule__XAxiomMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1695:1: ( rule__XAxiomMLComment__Group__1__Impl rule__XAxiomMLComment__Group__2 )
            // InternalXContext.g:1696:2: rule__XAxiomMLComment__Group__1__Impl rule__XAxiomMLComment__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXContext.g:1703:1: rule__XAxiomMLComment__Group__1__Impl : ( ( rule__XAxiomMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XAxiomMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1707:1: ( ( ( rule__XAxiomMLComment__CommentAssignment_1 ) ) )
            // InternalXContext.g:1708:1: ( ( rule__XAxiomMLComment__CommentAssignment_1 ) )
            {
            // InternalXContext.g:1708:1: ( ( rule__XAxiomMLComment__CommentAssignment_1 ) )
            // InternalXContext.g:1709:2: ( rule__XAxiomMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1710:2: ( rule__XAxiomMLComment__CommentAssignment_1 )
            // InternalXContext.g:1710:3: rule__XAxiomMLComment__CommentAssignment_1
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
    // InternalXContext.g:1718:1: rule__XAxiomMLComment__Group__2 : rule__XAxiomMLComment__Group__2__Impl rule__XAxiomMLComment__Group__3 ;
    public final void rule__XAxiomMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1722:1: ( rule__XAxiomMLComment__Group__2__Impl rule__XAxiomMLComment__Group__3 )
            // InternalXContext.g:1723:2: rule__XAxiomMLComment__Group__2__Impl rule__XAxiomMLComment__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalXContext.g:1730:1: rule__XAxiomMLComment__Group__2__Impl : ( ( rule__XAxiomMLComment__NameAssignment_2 ) ) ;
    public final void rule__XAxiomMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1734:1: ( ( ( rule__XAxiomMLComment__NameAssignment_2 ) ) )
            // InternalXContext.g:1735:1: ( ( rule__XAxiomMLComment__NameAssignment_2 ) )
            {
            // InternalXContext.g:1735:1: ( ( rule__XAxiomMLComment__NameAssignment_2 ) )
            // InternalXContext.g:1736:2: ( rule__XAxiomMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getNameAssignment_2()); 
            // InternalXContext.g:1737:2: ( rule__XAxiomMLComment__NameAssignment_2 )
            // InternalXContext.g:1737:3: rule__XAxiomMLComment__NameAssignment_2
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
    // InternalXContext.g:1745:1: rule__XAxiomMLComment__Group__3 : rule__XAxiomMLComment__Group__3__Impl rule__XAxiomMLComment__Group__4 ;
    public final void rule__XAxiomMLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1749:1: ( rule__XAxiomMLComment__Group__3__Impl rule__XAxiomMLComment__Group__4 )
            // InternalXContext.g:1750:2: rule__XAxiomMLComment__Group__3__Impl rule__XAxiomMLComment__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalXContext.g:1757:1: rule__XAxiomMLComment__Group__3__Impl : ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) ) ;
    public final void rule__XAxiomMLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1761:1: ( ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) ) )
            // InternalXContext.g:1762:1: ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) )
            {
            // InternalXContext.g:1762:1: ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) )
            // InternalXContext.g:1763:2: ( rule__XAxiomMLComment__PredicateAssignment_3 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getPredicateAssignment_3()); 
            // InternalXContext.g:1764:2: ( rule__XAxiomMLComment__PredicateAssignment_3 )
            // InternalXContext.g:1764:3: rule__XAxiomMLComment__PredicateAssignment_3
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
    // InternalXContext.g:1772:1: rule__XAxiomMLComment__Group__4 : rule__XAxiomMLComment__Group__4__Impl ;
    public final void rule__XAxiomMLComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1776:1: ( rule__XAxiomMLComment__Group__4__Impl )
            // InternalXContext.g:1777:2: rule__XAxiomMLComment__Group__4__Impl
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
    // InternalXContext.g:1783:1: rule__XAxiomMLComment__Group__4__Impl : ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? ) ;
    public final void rule__XAxiomMLComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1787:1: ( ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? ) )
            // InternalXContext.g:1788:1: ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? )
            {
            // InternalXContext.g:1788:1: ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? )
            // InternalXContext.g:1789:2: ( rule__XAxiomMLComment__TheoremAssignment_4 )?
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getTheoremAssignment_4()); 
            // InternalXContext.g:1790:2: ( rule__XAxiomMLComment__TheoremAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXContext.g:1790:3: rule__XAxiomMLComment__TheoremAssignment_4
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
    // InternalXContext.g:1799:1: rule__XAxiomSLComment__Group__0 : rule__XAxiomSLComment__Group__0__Impl rule__XAxiomSLComment__Group__1 ;
    public final void rule__XAxiomSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1803:1: ( rule__XAxiomSLComment__Group__0__Impl rule__XAxiomSLComment__Group__1 )
            // InternalXContext.g:1804:2: rule__XAxiomSLComment__Group__0__Impl rule__XAxiomSLComment__Group__1
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
    // InternalXContext.g:1811:1: rule__XAxiomSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XAxiomSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1815:1: ( ( () ) )
            // InternalXContext.g:1816:1: ( () )
            {
            // InternalXContext.g:1816:1: ( () )
            // InternalXContext.g:1817:2: ()
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getAxiomAction_0()); 
            // InternalXContext.g:1818:2: ()
            // InternalXContext.g:1818:3: 
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
    // InternalXContext.g:1826:1: rule__XAxiomSLComment__Group__1 : rule__XAxiomSLComment__Group__1__Impl rule__XAxiomSLComment__Group__2 ;
    public final void rule__XAxiomSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1830:1: ( rule__XAxiomSLComment__Group__1__Impl rule__XAxiomSLComment__Group__2 )
            // InternalXContext.g:1831:2: rule__XAxiomSLComment__Group__1__Impl rule__XAxiomSLComment__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalXContext.g:1838:1: rule__XAxiomSLComment__Group__1__Impl : ( ( rule__XAxiomSLComment__NameAssignment_1 ) ) ;
    public final void rule__XAxiomSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1842:1: ( ( ( rule__XAxiomSLComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1843:1: ( ( rule__XAxiomSLComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1843:1: ( ( rule__XAxiomSLComment__NameAssignment_1 ) )
            // InternalXContext.g:1844:2: ( rule__XAxiomSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1845:2: ( rule__XAxiomSLComment__NameAssignment_1 )
            // InternalXContext.g:1845:3: rule__XAxiomSLComment__NameAssignment_1
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
    // InternalXContext.g:1853:1: rule__XAxiomSLComment__Group__2 : rule__XAxiomSLComment__Group__2__Impl rule__XAxiomSLComment__Group__3 ;
    public final void rule__XAxiomSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1857:1: ( rule__XAxiomSLComment__Group__2__Impl rule__XAxiomSLComment__Group__3 )
            // InternalXContext.g:1858:2: rule__XAxiomSLComment__Group__2__Impl rule__XAxiomSLComment__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalXContext.g:1865:1: rule__XAxiomSLComment__Group__2__Impl : ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) ) ;
    public final void rule__XAxiomSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1869:1: ( ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) ) )
            // InternalXContext.g:1870:1: ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) )
            {
            // InternalXContext.g:1870:1: ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) )
            // InternalXContext.g:1871:2: ( rule__XAxiomSLComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getPredicateAssignment_2()); 
            // InternalXContext.g:1872:2: ( rule__XAxiomSLComment__PredicateAssignment_2 )
            // InternalXContext.g:1872:3: rule__XAxiomSLComment__PredicateAssignment_2
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
    // InternalXContext.g:1880:1: rule__XAxiomSLComment__Group__3 : rule__XAxiomSLComment__Group__3__Impl rule__XAxiomSLComment__Group__4 ;
    public final void rule__XAxiomSLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1884:1: ( rule__XAxiomSLComment__Group__3__Impl rule__XAxiomSLComment__Group__4 )
            // InternalXContext.g:1885:2: rule__XAxiomSLComment__Group__3__Impl rule__XAxiomSLComment__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalXContext.g:1892:1: rule__XAxiomSLComment__Group__3__Impl : ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? ) ;
    public final void rule__XAxiomSLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1896:1: ( ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? ) )
            // InternalXContext.g:1897:1: ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? )
            {
            // InternalXContext.g:1897:1: ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? )
            // InternalXContext.g:1898:2: ( rule__XAxiomSLComment__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getTheoremAssignment_3()); 
            // InternalXContext.g:1899:2: ( rule__XAxiomSLComment__TheoremAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXContext.g:1899:3: rule__XAxiomSLComment__TheoremAssignment_3
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
    // InternalXContext.g:1907:1: rule__XAxiomSLComment__Group__4 : rule__XAxiomSLComment__Group__4__Impl ;
    public final void rule__XAxiomSLComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1911:1: ( rule__XAxiomSLComment__Group__4__Impl )
            // InternalXContext.g:1912:2: rule__XAxiomSLComment__Group__4__Impl
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
    // InternalXContext.g:1918:1: rule__XAxiomSLComment__Group__4__Impl : ( ( rule__XAxiomSLComment__CommentAssignment_4 ) ) ;
    public final void rule__XAxiomSLComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1922:1: ( ( ( rule__XAxiomSLComment__CommentAssignment_4 ) ) )
            // InternalXContext.g:1923:1: ( ( rule__XAxiomSLComment__CommentAssignment_4 ) )
            {
            // InternalXContext.g:1923:1: ( ( rule__XAxiomSLComment__CommentAssignment_4 ) )
            // InternalXContext.g:1924:2: ( rule__XAxiomSLComment__CommentAssignment_4 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getCommentAssignment_4()); 
            // InternalXContext.g:1925:2: ( rule__XAxiomSLComment__CommentAssignment_4 )
            // InternalXContext.g:1925:3: rule__XAxiomSLComment__CommentAssignment_4
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
    // InternalXContext.g:1934:1: rule__XContext__CommentAssignment_1 : ( ( rule__XContext__CommentAlternatives_1_0 ) ) ;
    public final void rule__XContext__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1938:1: ( ( ( rule__XContext__CommentAlternatives_1_0 ) ) )
            // InternalXContext.g:1939:2: ( ( rule__XContext__CommentAlternatives_1_0 ) )
            {
            // InternalXContext.g:1939:2: ( ( rule__XContext__CommentAlternatives_1_0 ) )
            // InternalXContext.g:1940:3: ( rule__XContext__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXContextAccess().getCommentAlternatives_1_0()); 
            // InternalXContext.g:1941:3: ( rule__XContext__CommentAlternatives_1_0 )
            // InternalXContext.g:1941:4: rule__XContext__CommentAlternatives_1_0
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
    // InternalXContext.g:1949:1: rule__XContext__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XContext__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1953:1: ( ( RULE_ID ) )
            // InternalXContext.g:1954:2: ( RULE_ID )
            {
            // InternalXContext.g:1954:2: ( RULE_ID )
            // InternalXContext.g:1955:3: RULE_ID
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
    // InternalXContext.g:1964:1: rule__XContext__ExtendsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XContext__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1968:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXContext.g:1969:2: ( ( ruleQualifiedName ) )
            {
            // InternalXContext.g:1969:2: ( ( ruleQualifiedName ) )
            // InternalXContext.g:1970:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0()); 
            // InternalXContext.g:1971:3: ( ruleQualifiedName )
            // InternalXContext.g:1972:4: ruleQualifiedName
            {
             before(grammarAccess.getXContextAccess().getExtendsContextQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getExtendsContextQualifiedNameParserRuleCall_4_1_0_1()); 

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
    // InternalXContext.g:1983:1: rule__XContext__SetsAssignment_5_1 : ( ruleXCarrierSet ) ;
    public final void rule__XContext__SetsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1987:1: ( ( ruleXCarrierSet ) )
            // InternalXContext.g:1988:2: ( ruleXCarrierSet )
            {
            // InternalXContext.g:1988:2: ( ruleXCarrierSet )
            // InternalXContext.g:1989:3: ruleXCarrierSet
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
    // InternalXContext.g:1998:1: rule__XContext__ConstantsAssignment_6_1 : ( ruleXConstant ) ;
    public final void rule__XContext__ConstantsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2002:1: ( ( ruleXConstant ) )
            // InternalXContext.g:2003:2: ( ruleXConstant )
            {
            // InternalXContext.g:2003:2: ( ruleXConstant )
            // InternalXContext.g:2004:3: ruleXConstant
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
    // InternalXContext.g:2013:1: rule__XContext__AxiomsAssignment_7_1 : ( ruleXAxiom ) ;
    public final void rule__XContext__AxiomsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2017:1: ( ( ruleXAxiom ) )
            // InternalXContext.g:2018:2: ( ruleXAxiom )
            {
            // InternalXContext.g:2018:2: ( ruleXAxiom )
            // InternalXContext.g:2019:3: ruleXAxiom
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
    // InternalXContext.g:2028:1: rule__XCarrierSetNoComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XCarrierSetNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2032:1: ( ( RULE_ID ) )
            // InternalXContext.g:2033:2: ( RULE_ID )
            {
            // InternalXContext.g:2033:2: ( RULE_ID )
            // InternalXContext.g:2034:3: RULE_ID
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
    // InternalXContext.g:2043:1: rule__XCarrierSetMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XCarrierSetMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2047:1: ( ( RULE_ML_COMMENT ) )
            // InternalXContext.g:2048:2: ( RULE_ML_COMMENT )
            {
            // InternalXContext.g:2048:2: ( RULE_ML_COMMENT )
            // InternalXContext.g:2049:3: RULE_ML_COMMENT
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
    // InternalXContext.g:2058:1: rule__XCarrierSetMLComment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XCarrierSetMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2062:1: ( ( RULE_ID ) )
            // InternalXContext.g:2063:2: ( RULE_ID )
            {
            // InternalXContext.g:2063:2: ( RULE_ID )
            // InternalXContext.g:2064:3: RULE_ID
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
    // InternalXContext.g:2073:1: rule__XCarrierSetSLComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XCarrierSetSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2077:1: ( ( RULE_ID ) )
            // InternalXContext.g:2078:2: ( RULE_ID )
            {
            // InternalXContext.g:2078:2: ( RULE_ID )
            // InternalXContext.g:2079:3: RULE_ID
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
    // InternalXContext.g:2088:1: rule__XCarrierSetSLComment__CommentAssignment_2 : ( RULE_SL_COMMENT ) ;
    public final void rule__XCarrierSetSLComment__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2092:1: ( ( RULE_SL_COMMENT ) )
            // InternalXContext.g:2093:2: ( RULE_SL_COMMENT )
            {
            // InternalXContext.g:2093:2: ( RULE_SL_COMMENT )
            // InternalXContext.g:2094:3: RULE_SL_COMMENT
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
    // InternalXContext.g:2103:1: rule__XConstantNoComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XConstantNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2107:1: ( ( RULE_ID ) )
            // InternalXContext.g:2108:2: ( RULE_ID )
            {
            // InternalXContext.g:2108:2: ( RULE_ID )
            // InternalXContext.g:2109:3: RULE_ID
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
    // InternalXContext.g:2118:1: rule__XConstantMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XConstantMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2122:1: ( ( RULE_ML_COMMENT ) )
            // InternalXContext.g:2123:2: ( RULE_ML_COMMENT )
            {
            // InternalXContext.g:2123:2: ( RULE_ML_COMMENT )
            // InternalXContext.g:2124:3: RULE_ML_COMMENT
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
    // InternalXContext.g:2133:1: rule__XConstantMLComment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XConstantMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2137:1: ( ( RULE_ID ) )
            // InternalXContext.g:2138:2: ( RULE_ID )
            {
            // InternalXContext.g:2138:2: ( RULE_ID )
            // InternalXContext.g:2139:3: RULE_ID
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
    // InternalXContext.g:2148:1: rule__XConstantSLComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XConstantSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2152:1: ( ( RULE_ID ) )
            // InternalXContext.g:2153:2: ( RULE_ID )
            {
            // InternalXContext.g:2153:2: ( RULE_ID )
            // InternalXContext.g:2154:3: RULE_ID
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
    // InternalXContext.g:2163:1: rule__XConstantSLComment__CommentAssignment_2 : ( RULE_SL_COMMENT ) ;
    public final void rule__XConstantSLComment__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2167:1: ( ( RULE_SL_COMMENT ) )
            // InternalXContext.g:2168:2: ( RULE_SL_COMMENT )
            {
            // InternalXContext.g:2168:2: ( RULE_SL_COMMENT )
            // InternalXContext.g:2169:3: RULE_SL_COMMENT
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
    // InternalXContext.g:2178:1: rule__XAxiomNoComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAxiomNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2182:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:2183:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:2183:2: ( RULE_XLABEL )
            // InternalXContext.g:2184:3: RULE_XLABEL
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
    // InternalXContext.g:2193:1: rule__XAxiomNoComment__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XAxiomNoComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2197:1: ( ( ruleXPredicate ) )
            // InternalXContext.g:2198:2: ( ruleXPredicate )
            {
            // InternalXContext.g:2198:2: ( ruleXPredicate )
            // InternalXContext.g:2199:3: ruleXPredicate
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXAxiomNoCommentAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXContext.g:2208:1: rule__XAxiomNoComment__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiomNoComment__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2212:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:2213:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:2213:2: ( ( 'theorem' ) )
            // InternalXContext.g:2214:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXContext.g:2215:3: ( 'theorem' )
            // InternalXContext.g:2216:4: 'theorem'
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalXContext.g:2227:1: rule__XAxiomMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XAxiomMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2231:1: ( ( RULE_ML_COMMENT ) )
            // InternalXContext.g:2232:2: ( RULE_ML_COMMENT )
            {
            // InternalXContext.g:2232:2: ( RULE_ML_COMMENT )
            // InternalXContext.g:2233:3: RULE_ML_COMMENT
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
    // InternalXContext.g:2242:1: rule__XAxiomMLComment__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XAxiomMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2246:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:2247:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:2247:2: ( RULE_XLABEL )
            // InternalXContext.g:2248:3: RULE_XLABEL
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
    // InternalXContext.g:2257:1: rule__XAxiomMLComment__PredicateAssignment_3 : ( ruleXPredicate ) ;
    public final void rule__XAxiomMLComment__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2261:1: ( ( ruleXPredicate ) )
            // InternalXContext.g:2262:2: ( ruleXPredicate )
            {
            // InternalXContext.g:2262:2: ( ruleXPredicate )
            // InternalXContext.g:2263:3: ruleXPredicate
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getPredicateXPredicateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXAxiomMLCommentAccess().getPredicateXPredicateParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalXContext.g:2272:1: rule__XAxiomMLComment__TheoremAssignment_4 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiomMLComment__TheoremAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2276:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:2277:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:2277:2: ( ( 'theorem' ) )
            // InternalXContext.g:2278:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getTheoremTheoremKeyword_4_0()); 
            // InternalXContext.g:2279:3: ( 'theorem' )
            // InternalXContext.g:2280:4: 'theorem'
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getTheoremTheoremKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalXContext.g:2291:1: rule__XAxiomSLComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAxiomSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2295:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:2296:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:2296:2: ( RULE_XLABEL )
            // InternalXContext.g:2297:3: RULE_XLABEL
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
    // InternalXContext.g:2306:1: rule__XAxiomSLComment__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XAxiomSLComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2310:1: ( ( ruleXPredicate ) )
            // InternalXContext.g:2311:2: ( ruleXPredicate )
            {
            // InternalXContext.g:2311:2: ( ruleXPredicate )
            // InternalXContext.g:2312:3: ruleXPredicate
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXAxiomSLCommentAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXContext.g:2321:1: rule__XAxiomSLComment__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiomSLComment__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2325:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:2326:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:2326:2: ( ( 'theorem' ) )
            // InternalXContext.g:2327:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXContext.g:2328:3: ( 'theorem' )
            // InternalXContext.g:2329:4: 'theorem'
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalXContext.g:2340:1: rule__XAxiomSLComment__CommentAssignment_4 : ( RULE_SL_COMMENT ) ;
    public final void rule__XAxiomSLComment__CommentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2344:1: ( ( RULE_SL_COMMENT ) )
            // InternalXContext.g:2345:2: ( RULE_SL_COMMENT )
            {
            // InternalXContext.g:2345:2: ( RULE_SL_COMMENT )
            // InternalXContext.g:2346:3: RULE_SL_COMMENT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080040L});

}