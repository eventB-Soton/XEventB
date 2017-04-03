package ac.soton.xeventb.xcontext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;

import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXContextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'end'", "'extends'", "'sets'", "'constants'", "'axioms'", "'.'", "'theorem'"
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


    // $ANTLR start "rule__XContext__CommentAlternatives_1_0"
    // InternalXContext.g:402:1: rule__XContext__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XContext__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:406:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXContext.g:407:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXContext.g:407:2: ( RULE_ML_COMMENT )
                    // InternalXContext.g:408:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:413:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXContext.g:413:2: ( RULE_SL_COMMENT )
                    // InternalXContext.g:414:3: RULE_SL_COMMENT
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
    // InternalXContext.g:423:1: rule__XCarrierSet__Alternatives : ( ( ruleXCarrierSetNoComment ) | ( ruleXCarrierSetMLComment ) | ( ruleXCarrierSetSLComment ) );
    public final void rule__XCarrierSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:427:1: ( ( ruleXCarrierSetNoComment ) | ( ruleXCarrierSetMLComment ) | ( ruleXCarrierSetSLComment ) )
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
                    // InternalXContext.g:428:2: ( ruleXCarrierSetNoComment )
                    {
                    // InternalXContext.g:428:2: ( ruleXCarrierSetNoComment )
                    // InternalXContext.g:429:3: ruleXCarrierSetNoComment
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
                    // InternalXContext.g:434:2: ( ruleXCarrierSetMLComment )
                    {
                    // InternalXContext.g:434:2: ( ruleXCarrierSetMLComment )
                    // InternalXContext.g:435:3: ruleXCarrierSetMLComment
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
                    // InternalXContext.g:440:2: ( ruleXCarrierSetSLComment )
                    {
                    // InternalXContext.g:440:2: ( ruleXCarrierSetSLComment )
                    // InternalXContext.g:441:3: ruleXCarrierSetSLComment
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
    // InternalXContext.g:450:1: rule__XConstant__Alternatives : ( ( ruleXConstantNoComment ) | ( ruleXConstantMLComment ) | ( ruleXConstantSLComment ) );
    public final void rule__XConstant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:454:1: ( ( ruleXConstantNoComment ) | ( ruleXConstantMLComment ) | ( ruleXConstantSLComment ) )
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
                    // InternalXContext.g:455:2: ( ruleXConstantNoComment )
                    {
                    // InternalXContext.g:455:2: ( ruleXConstantNoComment )
                    // InternalXContext.g:456:3: ruleXConstantNoComment
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
                    // InternalXContext.g:461:2: ( ruleXConstantMLComment )
                    {
                    // InternalXContext.g:461:2: ( ruleXConstantMLComment )
                    // InternalXContext.g:462:3: ruleXConstantMLComment
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
                    // InternalXContext.g:467:2: ( ruleXConstantSLComment )
                    {
                    // InternalXContext.g:467:2: ( ruleXConstantSLComment )
                    // InternalXContext.g:468:3: ruleXConstantSLComment
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
    // InternalXContext.g:477:1: rule__XAxiom__Alternatives : ( ( ruleXAxiomNoComment ) | ( ruleXAxiomMLComment ) | ( ruleXAxiomSLComment ) );
    public final void rule__XAxiom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:481:1: ( ( ruleXAxiomNoComment ) | ( ruleXAxiomMLComment ) | ( ruleXAxiomSLComment ) )
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
                    // InternalXContext.g:482:2: ( ruleXAxiomNoComment )
                    {
                    // InternalXContext.g:482:2: ( ruleXAxiomNoComment )
                    // InternalXContext.g:483:3: ruleXAxiomNoComment
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
                    // InternalXContext.g:488:2: ( ruleXAxiomMLComment )
                    {
                    // InternalXContext.g:488:2: ( ruleXAxiomMLComment )
                    // InternalXContext.g:489:3: ruleXAxiomMLComment
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
                    // InternalXContext.g:494:2: ( ruleXAxiomSLComment )
                    {
                    // InternalXContext.g:494:2: ( ruleXAxiomSLComment )
                    // InternalXContext.g:495:3: ruleXAxiomSLComment
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
    // InternalXContext.g:504:1: rule__XContext__Group__0 : rule__XContext__Group__0__Impl rule__XContext__Group__1 ;
    public final void rule__XContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:508:1: ( rule__XContext__Group__0__Impl rule__XContext__Group__1 )
            // InternalXContext.g:509:2: rule__XContext__Group__0__Impl rule__XContext__Group__1
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
    // InternalXContext.g:516:1: rule__XContext__Group__0__Impl : ( () ) ;
    public final void rule__XContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:520:1: ( ( () ) )
            // InternalXContext.g:521:1: ( () )
            {
            // InternalXContext.g:521:1: ( () )
            // InternalXContext.g:522:2: ()
            {
             before(grammarAccess.getXContextAccess().getContextAction_0()); 
            // InternalXContext.g:523:2: ()
            // InternalXContext.g:523:3: 
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
    // InternalXContext.g:531:1: rule__XContext__Group__1 : rule__XContext__Group__1__Impl rule__XContext__Group__2 ;
    public final void rule__XContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:535:1: ( rule__XContext__Group__1__Impl rule__XContext__Group__2 )
            // InternalXContext.g:536:2: rule__XContext__Group__1__Impl rule__XContext__Group__2
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
    // InternalXContext.g:543:1: rule__XContext__Group__1__Impl : ( ( rule__XContext__CommentAssignment_1 )? ) ;
    public final void rule__XContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:547:1: ( ( ( rule__XContext__CommentAssignment_1 )? ) )
            // InternalXContext.g:548:1: ( ( rule__XContext__CommentAssignment_1 )? )
            {
            // InternalXContext.g:548:1: ( ( rule__XContext__CommentAssignment_1 )? )
            // InternalXContext.g:549:2: ( rule__XContext__CommentAssignment_1 )?
            {
             before(grammarAccess.getXContextAccess().getCommentAssignment_1()); 
            // InternalXContext.g:550:2: ( rule__XContext__CommentAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ML_COMMENT && LA5_0<=RULE_SL_COMMENT)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXContext.g:550:3: rule__XContext__CommentAssignment_1
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
    // InternalXContext.g:558:1: rule__XContext__Group__2 : rule__XContext__Group__2__Impl rule__XContext__Group__3 ;
    public final void rule__XContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:562:1: ( rule__XContext__Group__2__Impl rule__XContext__Group__3 )
            // InternalXContext.g:563:2: rule__XContext__Group__2__Impl rule__XContext__Group__3
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
    // InternalXContext.g:570:1: rule__XContext__Group__2__Impl : ( 'context' ) ;
    public final void rule__XContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:574:1: ( ( 'context' ) )
            // InternalXContext.g:575:1: ( 'context' )
            {
            // InternalXContext.g:575:1: ( 'context' )
            // InternalXContext.g:576:2: 'context'
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
    // InternalXContext.g:585:1: rule__XContext__Group__3 : rule__XContext__Group__3__Impl rule__XContext__Group__4 ;
    public final void rule__XContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:589:1: ( rule__XContext__Group__3__Impl rule__XContext__Group__4 )
            // InternalXContext.g:590:2: rule__XContext__Group__3__Impl rule__XContext__Group__4
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
    // InternalXContext.g:597:1: rule__XContext__Group__3__Impl : ( ( rule__XContext__NameAssignment_3 ) ) ;
    public final void rule__XContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:601:1: ( ( ( rule__XContext__NameAssignment_3 ) ) )
            // InternalXContext.g:602:1: ( ( rule__XContext__NameAssignment_3 ) )
            {
            // InternalXContext.g:602:1: ( ( rule__XContext__NameAssignment_3 ) )
            // InternalXContext.g:603:2: ( rule__XContext__NameAssignment_3 )
            {
             before(grammarAccess.getXContextAccess().getNameAssignment_3()); 
            // InternalXContext.g:604:2: ( rule__XContext__NameAssignment_3 )
            // InternalXContext.g:604:3: rule__XContext__NameAssignment_3
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
    // InternalXContext.g:612:1: rule__XContext__Group__4 : rule__XContext__Group__4__Impl rule__XContext__Group__5 ;
    public final void rule__XContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:616:1: ( rule__XContext__Group__4__Impl rule__XContext__Group__5 )
            // InternalXContext.g:617:2: rule__XContext__Group__4__Impl rule__XContext__Group__5
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
    // InternalXContext.g:624:1: rule__XContext__Group__4__Impl : ( ( rule__XContext__Group_4__0 )? ) ;
    public final void rule__XContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:628:1: ( ( ( rule__XContext__Group_4__0 )? ) )
            // InternalXContext.g:629:1: ( ( rule__XContext__Group_4__0 )? )
            {
            // InternalXContext.g:629:1: ( ( rule__XContext__Group_4__0 )? )
            // InternalXContext.g:630:2: ( rule__XContext__Group_4__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_4()); 
            // InternalXContext.g:631:2: ( rule__XContext__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXContext.g:631:3: rule__XContext__Group_4__0
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
    // InternalXContext.g:639:1: rule__XContext__Group__5 : rule__XContext__Group__5__Impl rule__XContext__Group__6 ;
    public final void rule__XContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:643:1: ( rule__XContext__Group__5__Impl rule__XContext__Group__6 )
            // InternalXContext.g:644:2: rule__XContext__Group__5__Impl rule__XContext__Group__6
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
    // InternalXContext.g:651:1: rule__XContext__Group__5__Impl : ( ( rule__XContext__Group_5__0 )? ) ;
    public final void rule__XContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:655:1: ( ( ( rule__XContext__Group_5__0 )? ) )
            // InternalXContext.g:656:1: ( ( rule__XContext__Group_5__0 )? )
            {
            // InternalXContext.g:656:1: ( ( rule__XContext__Group_5__0 )? )
            // InternalXContext.g:657:2: ( rule__XContext__Group_5__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_5()); 
            // InternalXContext.g:658:2: ( rule__XContext__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXContext.g:658:3: rule__XContext__Group_5__0
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
    // InternalXContext.g:666:1: rule__XContext__Group__6 : rule__XContext__Group__6__Impl rule__XContext__Group__7 ;
    public final void rule__XContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:670:1: ( rule__XContext__Group__6__Impl rule__XContext__Group__7 )
            // InternalXContext.g:671:2: rule__XContext__Group__6__Impl rule__XContext__Group__7
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
    // InternalXContext.g:678:1: rule__XContext__Group__6__Impl : ( ( rule__XContext__Group_6__0 )? ) ;
    public final void rule__XContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:682:1: ( ( ( rule__XContext__Group_6__0 )? ) )
            // InternalXContext.g:683:1: ( ( rule__XContext__Group_6__0 )? )
            {
            // InternalXContext.g:683:1: ( ( rule__XContext__Group_6__0 )? )
            // InternalXContext.g:684:2: ( rule__XContext__Group_6__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_6()); 
            // InternalXContext.g:685:2: ( rule__XContext__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXContext.g:685:3: rule__XContext__Group_6__0
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
    // InternalXContext.g:693:1: rule__XContext__Group__7 : rule__XContext__Group__7__Impl rule__XContext__Group__8 ;
    public final void rule__XContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:697:1: ( rule__XContext__Group__7__Impl rule__XContext__Group__8 )
            // InternalXContext.g:698:2: rule__XContext__Group__7__Impl rule__XContext__Group__8
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
    // InternalXContext.g:705:1: rule__XContext__Group__7__Impl : ( ( rule__XContext__Group_7__0 )? ) ;
    public final void rule__XContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:709:1: ( ( ( rule__XContext__Group_7__0 )? ) )
            // InternalXContext.g:710:1: ( ( rule__XContext__Group_7__0 )? )
            {
            // InternalXContext.g:710:1: ( ( rule__XContext__Group_7__0 )? )
            // InternalXContext.g:711:2: ( rule__XContext__Group_7__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_7()); 
            // InternalXContext.g:712:2: ( rule__XContext__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXContext.g:712:3: rule__XContext__Group_7__0
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
    // InternalXContext.g:720:1: rule__XContext__Group__8 : rule__XContext__Group__8__Impl ;
    public final void rule__XContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:724:1: ( rule__XContext__Group__8__Impl )
            // InternalXContext.g:725:2: rule__XContext__Group__8__Impl
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
    // InternalXContext.g:731:1: rule__XContext__Group__8__Impl : ( 'end' ) ;
    public final void rule__XContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:735:1: ( ( 'end' ) )
            // InternalXContext.g:736:1: ( 'end' )
            {
            // InternalXContext.g:736:1: ( 'end' )
            // InternalXContext.g:737:2: 'end'
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
    // InternalXContext.g:747:1: rule__XContext__Group_4__0 : rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 ;
    public final void rule__XContext__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:751:1: ( rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 )
            // InternalXContext.g:752:2: rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1
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
    // InternalXContext.g:759:1: rule__XContext__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__XContext__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:763:1: ( ( 'extends' ) )
            // InternalXContext.g:764:1: ( 'extends' )
            {
            // InternalXContext.g:764:1: ( 'extends' )
            // InternalXContext.g:765:2: 'extends'
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
    // InternalXContext.g:774:1: rule__XContext__Group_4__1 : rule__XContext__Group_4__1__Impl ;
    public final void rule__XContext__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:778:1: ( rule__XContext__Group_4__1__Impl )
            // InternalXContext.g:779:2: rule__XContext__Group_4__1__Impl
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
    // InternalXContext.g:785:1: rule__XContext__Group_4__1__Impl : ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) ;
    public final void rule__XContext__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:789:1: ( ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) )
            // InternalXContext.g:790:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            {
            // InternalXContext.g:790:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            // InternalXContext.g:791:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            {
            // InternalXContext.g:791:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) )
            // InternalXContext.g:792:3: ( rule__XContext__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:793:3: ( rule__XContext__ExtendsAssignment_4_1 )
            // InternalXContext.g:793:4: rule__XContext__ExtendsAssignment_4_1
            {
            pushFollow(FOLLOW_6);
            rule__XContext__ExtendsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 

            }

            // InternalXContext.g:796:2: ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            // InternalXContext.g:797:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:798:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXContext.g:798:4: rule__XContext__ExtendsAssignment_4_1
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
    // InternalXContext.g:808:1: rule__XContext__Group_5__0 : rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 ;
    public final void rule__XContext__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:812:1: ( rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 )
            // InternalXContext.g:813:2: rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1
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
    // InternalXContext.g:820:1: rule__XContext__Group_5__0__Impl : ( 'sets' ) ;
    public final void rule__XContext__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:824:1: ( ( 'sets' ) )
            // InternalXContext.g:825:1: ( 'sets' )
            {
            // InternalXContext.g:825:1: ( 'sets' )
            // InternalXContext.g:826:2: 'sets'
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
    // InternalXContext.g:835:1: rule__XContext__Group_5__1 : rule__XContext__Group_5__1__Impl ;
    public final void rule__XContext__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:839:1: ( rule__XContext__Group_5__1__Impl )
            // InternalXContext.g:840:2: rule__XContext__Group_5__1__Impl
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
    // InternalXContext.g:846:1: rule__XContext__Group_5__1__Impl : ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) ) ;
    public final void rule__XContext__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:850:1: ( ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) ) )
            // InternalXContext.g:851:1: ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) )
            {
            // InternalXContext.g:851:1: ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) )
            // InternalXContext.g:852:2: ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* )
            {
            // InternalXContext.g:852:2: ( ( rule__XContext__SetsAssignment_5_1 ) )
            // InternalXContext.g:853:3: ( rule__XContext__SetsAssignment_5_1 )
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 
            // InternalXContext.g:854:3: ( rule__XContext__SetsAssignment_5_1 )
            // InternalXContext.g:854:4: rule__XContext__SetsAssignment_5_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__SetsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 

            }

            // InternalXContext.g:857:2: ( ( rule__XContext__SetsAssignment_5_1 )* )
            // InternalXContext.g:858:3: ( rule__XContext__SetsAssignment_5_1 )*
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 
            // InternalXContext.g:859:3: ( rule__XContext__SetsAssignment_5_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ML_COMMENT||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXContext.g:859:4: rule__XContext__SetsAssignment_5_1
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
    // InternalXContext.g:869:1: rule__XContext__Group_6__0 : rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 ;
    public final void rule__XContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:873:1: ( rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 )
            // InternalXContext.g:874:2: rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1
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
    // InternalXContext.g:881:1: rule__XContext__Group_6__0__Impl : ( 'constants' ) ;
    public final void rule__XContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:885:1: ( ( 'constants' ) )
            // InternalXContext.g:886:1: ( 'constants' )
            {
            // InternalXContext.g:886:1: ( 'constants' )
            // InternalXContext.g:887:2: 'constants'
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
    // InternalXContext.g:896:1: rule__XContext__Group_6__1 : rule__XContext__Group_6__1__Impl ;
    public final void rule__XContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:900:1: ( rule__XContext__Group_6__1__Impl )
            // InternalXContext.g:901:2: rule__XContext__Group_6__1__Impl
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
    // InternalXContext.g:907:1: rule__XContext__Group_6__1__Impl : ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) ) ;
    public final void rule__XContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:911:1: ( ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) ) )
            // InternalXContext.g:912:1: ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) )
            {
            // InternalXContext.g:912:1: ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) )
            // InternalXContext.g:913:2: ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* )
            {
            // InternalXContext.g:913:2: ( ( rule__XContext__ConstantsAssignment_6_1 ) )
            // InternalXContext.g:914:3: ( rule__XContext__ConstantsAssignment_6_1 )
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 
            // InternalXContext.g:915:3: ( rule__XContext__ConstantsAssignment_6_1 )
            // InternalXContext.g:915:4: rule__XContext__ConstantsAssignment_6_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__ConstantsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 

            }

            // InternalXContext.g:918:2: ( ( rule__XContext__ConstantsAssignment_6_1 )* )
            // InternalXContext.g:919:3: ( rule__XContext__ConstantsAssignment_6_1 )*
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 
            // InternalXContext.g:920:3: ( rule__XContext__ConstantsAssignment_6_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ML_COMMENT||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXContext.g:920:4: rule__XContext__ConstantsAssignment_6_1
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
    // InternalXContext.g:930:1: rule__XContext__Group_7__0 : rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 ;
    public final void rule__XContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:934:1: ( rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 )
            // InternalXContext.g:935:2: rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1
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
    // InternalXContext.g:942:1: rule__XContext__Group_7__0__Impl : ( 'axioms' ) ;
    public final void rule__XContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:946:1: ( ( 'axioms' ) )
            // InternalXContext.g:947:1: ( 'axioms' )
            {
            // InternalXContext.g:947:1: ( 'axioms' )
            // InternalXContext.g:948:2: 'axioms'
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
    // InternalXContext.g:957:1: rule__XContext__Group_7__1 : rule__XContext__Group_7__1__Impl ;
    public final void rule__XContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:961:1: ( rule__XContext__Group_7__1__Impl )
            // InternalXContext.g:962:2: rule__XContext__Group_7__1__Impl
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
    // InternalXContext.g:968:1: rule__XContext__Group_7__1__Impl : ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) ;
    public final void rule__XContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:972:1: ( ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) )
            // InternalXContext.g:973:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            {
            // InternalXContext.g:973:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            // InternalXContext.g:974:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            {
            // InternalXContext.g:974:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) )
            // InternalXContext.g:975:3: ( rule__XContext__AxiomsAssignment_7_1 )
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:976:3: ( rule__XContext__AxiomsAssignment_7_1 )
            // InternalXContext.g:976:4: rule__XContext__AxiomsAssignment_7_1
            {
            pushFollow(FOLLOW_10);
            rule__XContext__AxiomsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 

            }

            // InternalXContext.g:979:2: ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            // InternalXContext.g:980:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:981:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ML_COMMENT||LA13_0==RULE_XLABEL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXContext.g:981:4: rule__XContext__AxiomsAssignment_7_1
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
    // InternalXContext.g:991:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:995:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXContext.g:996:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalXContext.g:1003:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1007:1: ( ( RULE_ID ) )
            // InternalXContext.g:1008:1: ( RULE_ID )
            {
            // InternalXContext.g:1008:1: ( RULE_ID )
            // InternalXContext.g:1009:2: RULE_ID
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
    // InternalXContext.g:1018:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1022:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXContext.g:1023:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXContext.g:1029:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1033:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXContext.g:1034:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXContext.g:1034:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXContext.g:1035:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXContext.g:1036:2: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXContext.g:1036:3: rule__QualifiedName__Group_1__0
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
    // InternalXContext.g:1045:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1049:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXContext.g:1050:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXContext.g:1057:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1061:1: ( ( '.' ) )
            // InternalXContext.g:1062:1: ( '.' )
            {
            // InternalXContext.g:1062:1: ( '.' )
            // InternalXContext.g:1063:2: '.'
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
    // InternalXContext.g:1072:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1076:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXContext.g:1077:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXContext.g:1083:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1087:1: ( ( RULE_ID ) )
            // InternalXContext.g:1088:1: ( RULE_ID )
            {
            // InternalXContext.g:1088:1: ( RULE_ID )
            // InternalXContext.g:1089:2: RULE_ID
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
    // InternalXContext.g:1099:1: rule__XCarrierSetNoComment__Group__0 : rule__XCarrierSetNoComment__Group__0__Impl rule__XCarrierSetNoComment__Group__1 ;
    public final void rule__XCarrierSetNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1103:1: ( rule__XCarrierSetNoComment__Group__0__Impl rule__XCarrierSetNoComment__Group__1 )
            // InternalXContext.g:1104:2: rule__XCarrierSetNoComment__Group__0__Impl rule__XCarrierSetNoComment__Group__1
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
    // InternalXContext.g:1111:1: rule__XCarrierSetNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSetNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1115:1: ( ( () ) )
            // InternalXContext.g:1116:1: ( () )
            {
            // InternalXContext.g:1116:1: ( () )
            // InternalXContext.g:1117:2: ()
            {
             before(grammarAccess.getXCarrierSetNoCommentAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:1118:2: ()
            // InternalXContext.g:1118:3: 
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
    // InternalXContext.g:1126:1: rule__XCarrierSetNoComment__Group__1 : rule__XCarrierSetNoComment__Group__1__Impl ;
    public final void rule__XCarrierSetNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1130:1: ( rule__XCarrierSetNoComment__Group__1__Impl )
            // InternalXContext.g:1131:2: rule__XCarrierSetNoComment__Group__1__Impl
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
    // InternalXContext.g:1137:1: rule__XCarrierSetNoComment__Group__1__Impl : ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) ) ;
    public final void rule__XCarrierSetNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1141:1: ( ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1142:1: ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1142:1: ( ( rule__XCarrierSetNoComment__NameAssignment_1 ) )
            // InternalXContext.g:1143:2: ( rule__XCarrierSetNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetNoCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1144:2: ( rule__XCarrierSetNoComment__NameAssignment_1 )
            // InternalXContext.g:1144:3: rule__XCarrierSetNoComment__NameAssignment_1
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
    // InternalXContext.g:1153:1: rule__XCarrierSetMLComment__Group__0 : rule__XCarrierSetMLComment__Group__0__Impl rule__XCarrierSetMLComment__Group__1 ;
    public final void rule__XCarrierSetMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1157:1: ( rule__XCarrierSetMLComment__Group__0__Impl rule__XCarrierSetMLComment__Group__1 )
            // InternalXContext.g:1158:2: rule__XCarrierSetMLComment__Group__0__Impl rule__XCarrierSetMLComment__Group__1
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
    // InternalXContext.g:1165:1: rule__XCarrierSetMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSetMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1169:1: ( ( () ) )
            // InternalXContext.g:1170:1: ( () )
            {
            // InternalXContext.g:1170:1: ( () )
            // InternalXContext.g:1171:2: ()
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:1172:2: ()
            // InternalXContext.g:1172:3: 
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
    // InternalXContext.g:1180:1: rule__XCarrierSetMLComment__Group__1 : rule__XCarrierSetMLComment__Group__1__Impl rule__XCarrierSetMLComment__Group__2 ;
    public final void rule__XCarrierSetMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1184:1: ( rule__XCarrierSetMLComment__Group__1__Impl rule__XCarrierSetMLComment__Group__2 )
            // InternalXContext.g:1185:2: rule__XCarrierSetMLComment__Group__1__Impl rule__XCarrierSetMLComment__Group__2
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
    // InternalXContext.g:1192:1: rule__XCarrierSetMLComment__Group__1__Impl : ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XCarrierSetMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1196:1: ( ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) ) )
            // InternalXContext.g:1197:1: ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) )
            {
            // InternalXContext.g:1197:1: ( ( rule__XCarrierSetMLComment__CommentAssignment_1 ) )
            // InternalXContext.g:1198:2: ( rule__XCarrierSetMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1199:2: ( rule__XCarrierSetMLComment__CommentAssignment_1 )
            // InternalXContext.g:1199:3: rule__XCarrierSetMLComment__CommentAssignment_1
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
    // InternalXContext.g:1207:1: rule__XCarrierSetMLComment__Group__2 : rule__XCarrierSetMLComment__Group__2__Impl ;
    public final void rule__XCarrierSetMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1211:1: ( rule__XCarrierSetMLComment__Group__2__Impl )
            // InternalXContext.g:1212:2: rule__XCarrierSetMLComment__Group__2__Impl
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
    // InternalXContext.g:1218:1: rule__XCarrierSetMLComment__Group__2__Impl : ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) ) ;
    public final void rule__XCarrierSetMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1222:1: ( ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) ) )
            // InternalXContext.g:1223:1: ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) )
            {
            // InternalXContext.g:1223:1: ( ( rule__XCarrierSetMLComment__NameAssignment_2 ) )
            // InternalXContext.g:1224:2: ( rule__XCarrierSetMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXCarrierSetMLCommentAccess().getNameAssignment_2()); 
            // InternalXContext.g:1225:2: ( rule__XCarrierSetMLComment__NameAssignment_2 )
            // InternalXContext.g:1225:3: rule__XCarrierSetMLComment__NameAssignment_2
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
    // InternalXContext.g:1234:1: rule__XCarrierSetSLComment__Group__0 : rule__XCarrierSetSLComment__Group__0__Impl rule__XCarrierSetSLComment__Group__1 ;
    public final void rule__XCarrierSetSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1238:1: ( rule__XCarrierSetSLComment__Group__0__Impl rule__XCarrierSetSLComment__Group__1 )
            // InternalXContext.g:1239:2: rule__XCarrierSetSLComment__Group__0__Impl rule__XCarrierSetSLComment__Group__1
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
    // InternalXContext.g:1246:1: rule__XCarrierSetSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSetSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1250:1: ( ( () ) )
            // InternalXContext.g:1251:1: ( () )
            {
            // InternalXContext.g:1251:1: ( () )
            // InternalXContext.g:1252:2: ()
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:1253:2: ()
            // InternalXContext.g:1253:3: 
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
    // InternalXContext.g:1261:1: rule__XCarrierSetSLComment__Group__1 : rule__XCarrierSetSLComment__Group__1__Impl rule__XCarrierSetSLComment__Group__2 ;
    public final void rule__XCarrierSetSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1265:1: ( rule__XCarrierSetSLComment__Group__1__Impl rule__XCarrierSetSLComment__Group__2 )
            // InternalXContext.g:1266:2: rule__XCarrierSetSLComment__Group__1__Impl rule__XCarrierSetSLComment__Group__2
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
    // InternalXContext.g:1273:1: rule__XCarrierSetSLComment__Group__1__Impl : ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) ) ;
    public final void rule__XCarrierSetSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1277:1: ( ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1278:1: ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1278:1: ( ( rule__XCarrierSetSLComment__NameAssignment_1 ) )
            // InternalXContext.g:1279:2: ( rule__XCarrierSetSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1280:2: ( rule__XCarrierSetSLComment__NameAssignment_1 )
            // InternalXContext.g:1280:3: rule__XCarrierSetSLComment__NameAssignment_1
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
    // InternalXContext.g:1288:1: rule__XCarrierSetSLComment__Group__2 : rule__XCarrierSetSLComment__Group__2__Impl ;
    public final void rule__XCarrierSetSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1292:1: ( rule__XCarrierSetSLComment__Group__2__Impl )
            // InternalXContext.g:1293:2: rule__XCarrierSetSLComment__Group__2__Impl
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
    // InternalXContext.g:1299:1: rule__XCarrierSetSLComment__Group__2__Impl : ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) ) ;
    public final void rule__XCarrierSetSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1303:1: ( ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) ) )
            // InternalXContext.g:1304:1: ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) )
            {
            // InternalXContext.g:1304:1: ( ( rule__XCarrierSetSLComment__CommentAssignment_2 ) )
            // InternalXContext.g:1305:2: ( rule__XCarrierSetSLComment__CommentAssignment_2 )
            {
             before(grammarAccess.getXCarrierSetSLCommentAccess().getCommentAssignment_2()); 
            // InternalXContext.g:1306:2: ( rule__XCarrierSetSLComment__CommentAssignment_2 )
            // InternalXContext.g:1306:3: rule__XCarrierSetSLComment__CommentAssignment_2
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
    // InternalXContext.g:1315:1: rule__XConstantNoComment__Group__0 : rule__XConstantNoComment__Group__0__Impl rule__XConstantNoComment__Group__1 ;
    public final void rule__XConstantNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1319:1: ( rule__XConstantNoComment__Group__0__Impl rule__XConstantNoComment__Group__1 )
            // InternalXContext.g:1320:2: rule__XConstantNoComment__Group__0__Impl rule__XConstantNoComment__Group__1
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
    // InternalXContext.g:1327:1: rule__XConstantNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XConstantNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1331:1: ( ( () ) )
            // InternalXContext.g:1332:1: ( () )
            {
            // InternalXContext.g:1332:1: ( () )
            // InternalXContext.g:1333:2: ()
            {
             before(grammarAccess.getXConstantNoCommentAccess().getConstantAction_0()); 
            // InternalXContext.g:1334:2: ()
            // InternalXContext.g:1334:3: 
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
    // InternalXContext.g:1342:1: rule__XConstantNoComment__Group__1 : rule__XConstantNoComment__Group__1__Impl ;
    public final void rule__XConstantNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1346:1: ( rule__XConstantNoComment__Group__1__Impl )
            // InternalXContext.g:1347:2: rule__XConstantNoComment__Group__1__Impl
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
    // InternalXContext.g:1353:1: rule__XConstantNoComment__Group__1__Impl : ( ( rule__XConstantNoComment__NameAssignment_1 ) ) ;
    public final void rule__XConstantNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1357:1: ( ( ( rule__XConstantNoComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1358:1: ( ( rule__XConstantNoComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1358:1: ( ( rule__XConstantNoComment__NameAssignment_1 ) )
            // InternalXContext.g:1359:2: ( rule__XConstantNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXConstantNoCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1360:2: ( rule__XConstantNoComment__NameAssignment_1 )
            // InternalXContext.g:1360:3: rule__XConstantNoComment__NameAssignment_1
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
    // InternalXContext.g:1369:1: rule__XConstantMLComment__Group__0 : rule__XConstantMLComment__Group__0__Impl rule__XConstantMLComment__Group__1 ;
    public final void rule__XConstantMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1373:1: ( rule__XConstantMLComment__Group__0__Impl rule__XConstantMLComment__Group__1 )
            // InternalXContext.g:1374:2: rule__XConstantMLComment__Group__0__Impl rule__XConstantMLComment__Group__1
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
    // InternalXContext.g:1381:1: rule__XConstantMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XConstantMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1385:1: ( ( () ) )
            // InternalXContext.g:1386:1: ( () )
            {
            // InternalXContext.g:1386:1: ( () )
            // InternalXContext.g:1387:2: ()
            {
             before(grammarAccess.getXConstantMLCommentAccess().getConstantAction_0()); 
            // InternalXContext.g:1388:2: ()
            // InternalXContext.g:1388:3: 
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
    // InternalXContext.g:1396:1: rule__XConstantMLComment__Group__1 : rule__XConstantMLComment__Group__1__Impl rule__XConstantMLComment__Group__2 ;
    public final void rule__XConstantMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1400:1: ( rule__XConstantMLComment__Group__1__Impl rule__XConstantMLComment__Group__2 )
            // InternalXContext.g:1401:2: rule__XConstantMLComment__Group__1__Impl rule__XConstantMLComment__Group__2
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
    // InternalXContext.g:1408:1: rule__XConstantMLComment__Group__1__Impl : ( ( rule__XConstantMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XConstantMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1412:1: ( ( ( rule__XConstantMLComment__CommentAssignment_1 ) ) )
            // InternalXContext.g:1413:1: ( ( rule__XConstantMLComment__CommentAssignment_1 ) )
            {
            // InternalXContext.g:1413:1: ( ( rule__XConstantMLComment__CommentAssignment_1 ) )
            // InternalXContext.g:1414:2: ( rule__XConstantMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXConstantMLCommentAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1415:2: ( rule__XConstantMLComment__CommentAssignment_1 )
            // InternalXContext.g:1415:3: rule__XConstantMLComment__CommentAssignment_1
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
    // InternalXContext.g:1423:1: rule__XConstantMLComment__Group__2 : rule__XConstantMLComment__Group__2__Impl ;
    public final void rule__XConstantMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1427:1: ( rule__XConstantMLComment__Group__2__Impl )
            // InternalXContext.g:1428:2: rule__XConstantMLComment__Group__2__Impl
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
    // InternalXContext.g:1434:1: rule__XConstantMLComment__Group__2__Impl : ( ( rule__XConstantMLComment__NameAssignment_2 ) ) ;
    public final void rule__XConstantMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1438:1: ( ( ( rule__XConstantMLComment__NameAssignment_2 ) ) )
            // InternalXContext.g:1439:1: ( ( rule__XConstantMLComment__NameAssignment_2 ) )
            {
            // InternalXContext.g:1439:1: ( ( rule__XConstantMLComment__NameAssignment_2 ) )
            // InternalXContext.g:1440:2: ( rule__XConstantMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXConstantMLCommentAccess().getNameAssignment_2()); 
            // InternalXContext.g:1441:2: ( rule__XConstantMLComment__NameAssignment_2 )
            // InternalXContext.g:1441:3: rule__XConstantMLComment__NameAssignment_2
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
    // InternalXContext.g:1450:1: rule__XConstantSLComment__Group__0 : rule__XConstantSLComment__Group__0__Impl rule__XConstantSLComment__Group__1 ;
    public final void rule__XConstantSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1454:1: ( rule__XConstantSLComment__Group__0__Impl rule__XConstantSLComment__Group__1 )
            // InternalXContext.g:1455:2: rule__XConstantSLComment__Group__0__Impl rule__XConstantSLComment__Group__1
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
    // InternalXContext.g:1462:1: rule__XConstantSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XConstantSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1466:1: ( ( () ) )
            // InternalXContext.g:1467:1: ( () )
            {
            // InternalXContext.g:1467:1: ( () )
            // InternalXContext.g:1468:2: ()
            {
             before(grammarAccess.getXConstantSLCommentAccess().getConstantAction_0()); 
            // InternalXContext.g:1469:2: ()
            // InternalXContext.g:1469:3: 
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
    // InternalXContext.g:1477:1: rule__XConstantSLComment__Group__1 : rule__XConstantSLComment__Group__1__Impl rule__XConstantSLComment__Group__2 ;
    public final void rule__XConstantSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1481:1: ( rule__XConstantSLComment__Group__1__Impl rule__XConstantSLComment__Group__2 )
            // InternalXContext.g:1482:2: rule__XConstantSLComment__Group__1__Impl rule__XConstantSLComment__Group__2
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
    // InternalXContext.g:1489:1: rule__XConstantSLComment__Group__1__Impl : ( ( rule__XConstantSLComment__NameAssignment_1 ) ) ;
    public final void rule__XConstantSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1493:1: ( ( ( rule__XConstantSLComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1494:1: ( ( rule__XConstantSLComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1494:1: ( ( rule__XConstantSLComment__NameAssignment_1 ) )
            // InternalXContext.g:1495:2: ( rule__XConstantSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXConstantSLCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1496:2: ( rule__XConstantSLComment__NameAssignment_1 )
            // InternalXContext.g:1496:3: rule__XConstantSLComment__NameAssignment_1
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
    // InternalXContext.g:1504:1: rule__XConstantSLComment__Group__2 : rule__XConstantSLComment__Group__2__Impl ;
    public final void rule__XConstantSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1508:1: ( rule__XConstantSLComment__Group__2__Impl )
            // InternalXContext.g:1509:2: rule__XConstantSLComment__Group__2__Impl
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
    // InternalXContext.g:1515:1: rule__XConstantSLComment__Group__2__Impl : ( ( rule__XConstantSLComment__CommentAssignment_2 ) ) ;
    public final void rule__XConstantSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1519:1: ( ( ( rule__XConstantSLComment__CommentAssignment_2 ) ) )
            // InternalXContext.g:1520:1: ( ( rule__XConstantSLComment__CommentAssignment_2 ) )
            {
            // InternalXContext.g:1520:1: ( ( rule__XConstantSLComment__CommentAssignment_2 ) )
            // InternalXContext.g:1521:2: ( rule__XConstantSLComment__CommentAssignment_2 )
            {
             before(grammarAccess.getXConstantSLCommentAccess().getCommentAssignment_2()); 
            // InternalXContext.g:1522:2: ( rule__XConstantSLComment__CommentAssignment_2 )
            // InternalXContext.g:1522:3: rule__XConstantSLComment__CommentAssignment_2
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
    // InternalXContext.g:1531:1: rule__XAxiomNoComment__Group__0 : rule__XAxiomNoComment__Group__0__Impl rule__XAxiomNoComment__Group__1 ;
    public final void rule__XAxiomNoComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1535:1: ( rule__XAxiomNoComment__Group__0__Impl rule__XAxiomNoComment__Group__1 )
            // InternalXContext.g:1536:2: rule__XAxiomNoComment__Group__0__Impl rule__XAxiomNoComment__Group__1
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
    // InternalXContext.g:1543:1: rule__XAxiomNoComment__Group__0__Impl : ( () ) ;
    public final void rule__XAxiomNoComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1547:1: ( ( () ) )
            // InternalXContext.g:1548:1: ( () )
            {
            // InternalXContext.g:1548:1: ( () )
            // InternalXContext.g:1549:2: ()
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getAxiomAction_0()); 
            // InternalXContext.g:1550:2: ()
            // InternalXContext.g:1550:3: 
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
    // InternalXContext.g:1558:1: rule__XAxiomNoComment__Group__1 : rule__XAxiomNoComment__Group__1__Impl rule__XAxiomNoComment__Group__2 ;
    public final void rule__XAxiomNoComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1562:1: ( rule__XAxiomNoComment__Group__1__Impl rule__XAxiomNoComment__Group__2 )
            // InternalXContext.g:1563:2: rule__XAxiomNoComment__Group__1__Impl rule__XAxiomNoComment__Group__2
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
    // InternalXContext.g:1570:1: rule__XAxiomNoComment__Group__1__Impl : ( ( rule__XAxiomNoComment__NameAssignment_1 ) ) ;
    public final void rule__XAxiomNoComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1574:1: ( ( ( rule__XAxiomNoComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1575:1: ( ( rule__XAxiomNoComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1575:1: ( ( rule__XAxiomNoComment__NameAssignment_1 ) )
            // InternalXContext.g:1576:2: ( rule__XAxiomNoComment__NameAssignment_1 )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1577:2: ( rule__XAxiomNoComment__NameAssignment_1 )
            // InternalXContext.g:1577:3: rule__XAxiomNoComment__NameAssignment_1
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
    // InternalXContext.g:1585:1: rule__XAxiomNoComment__Group__2 : rule__XAxiomNoComment__Group__2__Impl rule__XAxiomNoComment__Group__3 ;
    public final void rule__XAxiomNoComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1589:1: ( rule__XAxiomNoComment__Group__2__Impl rule__XAxiomNoComment__Group__3 )
            // InternalXContext.g:1590:2: rule__XAxiomNoComment__Group__2__Impl rule__XAxiomNoComment__Group__3
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
    // InternalXContext.g:1597:1: rule__XAxiomNoComment__Group__2__Impl : ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) ) ;
    public final void rule__XAxiomNoComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1601:1: ( ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) ) )
            // InternalXContext.g:1602:1: ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) )
            {
            // InternalXContext.g:1602:1: ( ( rule__XAxiomNoComment__PredicateAssignment_2 ) )
            // InternalXContext.g:1603:2: ( rule__XAxiomNoComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getPredicateAssignment_2()); 
            // InternalXContext.g:1604:2: ( rule__XAxiomNoComment__PredicateAssignment_2 )
            // InternalXContext.g:1604:3: rule__XAxiomNoComment__PredicateAssignment_2
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
    // InternalXContext.g:1612:1: rule__XAxiomNoComment__Group__3 : rule__XAxiomNoComment__Group__3__Impl ;
    public final void rule__XAxiomNoComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1616:1: ( rule__XAxiomNoComment__Group__3__Impl )
            // InternalXContext.g:1617:2: rule__XAxiomNoComment__Group__3__Impl
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
    // InternalXContext.g:1623:1: rule__XAxiomNoComment__Group__3__Impl : ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? ) ;
    public final void rule__XAxiomNoComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1627:1: ( ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? ) )
            // InternalXContext.g:1628:1: ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? )
            {
            // InternalXContext.g:1628:1: ( ( rule__XAxiomNoComment__TheoremAssignment_3 )? )
            // InternalXContext.g:1629:2: ( rule__XAxiomNoComment__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getTheoremAssignment_3()); 
            // InternalXContext.g:1630:2: ( rule__XAxiomNoComment__TheoremAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXContext.g:1630:3: rule__XAxiomNoComment__TheoremAssignment_3
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
    // InternalXContext.g:1639:1: rule__XAxiomMLComment__Group__0 : rule__XAxiomMLComment__Group__0__Impl rule__XAxiomMLComment__Group__1 ;
    public final void rule__XAxiomMLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1643:1: ( rule__XAxiomMLComment__Group__0__Impl rule__XAxiomMLComment__Group__1 )
            // InternalXContext.g:1644:2: rule__XAxiomMLComment__Group__0__Impl rule__XAxiomMLComment__Group__1
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
    // InternalXContext.g:1651:1: rule__XAxiomMLComment__Group__0__Impl : ( () ) ;
    public final void rule__XAxiomMLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1655:1: ( ( () ) )
            // InternalXContext.g:1656:1: ( () )
            {
            // InternalXContext.g:1656:1: ( () )
            // InternalXContext.g:1657:2: ()
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getAxiomAction_0()); 
            // InternalXContext.g:1658:2: ()
            // InternalXContext.g:1658:3: 
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
    // InternalXContext.g:1666:1: rule__XAxiomMLComment__Group__1 : rule__XAxiomMLComment__Group__1__Impl rule__XAxiomMLComment__Group__2 ;
    public final void rule__XAxiomMLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1670:1: ( rule__XAxiomMLComment__Group__1__Impl rule__XAxiomMLComment__Group__2 )
            // InternalXContext.g:1671:2: rule__XAxiomMLComment__Group__1__Impl rule__XAxiomMLComment__Group__2
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
    // InternalXContext.g:1678:1: rule__XAxiomMLComment__Group__1__Impl : ( ( rule__XAxiomMLComment__CommentAssignment_1 ) ) ;
    public final void rule__XAxiomMLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1682:1: ( ( ( rule__XAxiomMLComment__CommentAssignment_1 ) ) )
            // InternalXContext.g:1683:1: ( ( rule__XAxiomMLComment__CommentAssignment_1 ) )
            {
            // InternalXContext.g:1683:1: ( ( rule__XAxiomMLComment__CommentAssignment_1 ) )
            // InternalXContext.g:1684:2: ( rule__XAxiomMLComment__CommentAssignment_1 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1685:2: ( rule__XAxiomMLComment__CommentAssignment_1 )
            // InternalXContext.g:1685:3: rule__XAxiomMLComment__CommentAssignment_1
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
    // InternalXContext.g:1693:1: rule__XAxiomMLComment__Group__2 : rule__XAxiomMLComment__Group__2__Impl rule__XAxiomMLComment__Group__3 ;
    public final void rule__XAxiomMLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1697:1: ( rule__XAxiomMLComment__Group__2__Impl rule__XAxiomMLComment__Group__3 )
            // InternalXContext.g:1698:2: rule__XAxiomMLComment__Group__2__Impl rule__XAxiomMLComment__Group__3
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
    // InternalXContext.g:1705:1: rule__XAxiomMLComment__Group__2__Impl : ( ( rule__XAxiomMLComment__NameAssignment_2 ) ) ;
    public final void rule__XAxiomMLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1709:1: ( ( ( rule__XAxiomMLComment__NameAssignment_2 ) ) )
            // InternalXContext.g:1710:1: ( ( rule__XAxiomMLComment__NameAssignment_2 ) )
            {
            // InternalXContext.g:1710:1: ( ( rule__XAxiomMLComment__NameAssignment_2 ) )
            // InternalXContext.g:1711:2: ( rule__XAxiomMLComment__NameAssignment_2 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getNameAssignment_2()); 
            // InternalXContext.g:1712:2: ( rule__XAxiomMLComment__NameAssignment_2 )
            // InternalXContext.g:1712:3: rule__XAxiomMLComment__NameAssignment_2
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
    // InternalXContext.g:1720:1: rule__XAxiomMLComment__Group__3 : rule__XAxiomMLComment__Group__3__Impl rule__XAxiomMLComment__Group__4 ;
    public final void rule__XAxiomMLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1724:1: ( rule__XAxiomMLComment__Group__3__Impl rule__XAxiomMLComment__Group__4 )
            // InternalXContext.g:1725:2: rule__XAxiomMLComment__Group__3__Impl rule__XAxiomMLComment__Group__4
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
    // InternalXContext.g:1732:1: rule__XAxiomMLComment__Group__3__Impl : ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) ) ;
    public final void rule__XAxiomMLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1736:1: ( ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) ) )
            // InternalXContext.g:1737:1: ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) )
            {
            // InternalXContext.g:1737:1: ( ( rule__XAxiomMLComment__PredicateAssignment_3 ) )
            // InternalXContext.g:1738:2: ( rule__XAxiomMLComment__PredicateAssignment_3 )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getPredicateAssignment_3()); 
            // InternalXContext.g:1739:2: ( rule__XAxiomMLComment__PredicateAssignment_3 )
            // InternalXContext.g:1739:3: rule__XAxiomMLComment__PredicateAssignment_3
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
    // InternalXContext.g:1747:1: rule__XAxiomMLComment__Group__4 : rule__XAxiomMLComment__Group__4__Impl ;
    public final void rule__XAxiomMLComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1751:1: ( rule__XAxiomMLComment__Group__4__Impl )
            // InternalXContext.g:1752:2: rule__XAxiomMLComment__Group__4__Impl
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
    // InternalXContext.g:1758:1: rule__XAxiomMLComment__Group__4__Impl : ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? ) ;
    public final void rule__XAxiomMLComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1762:1: ( ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? ) )
            // InternalXContext.g:1763:1: ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? )
            {
            // InternalXContext.g:1763:1: ( ( rule__XAxiomMLComment__TheoremAssignment_4 )? )
            // InternalXContext.g:1764:2: ( rule__XAxiomMLComment__TheoremAssignment_4 )?
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getTheoremAssignment_4()); 
            // InternalXContext.g:1765:2: ( rule__XAxiomMLComment__TheoremAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXContext.g:1765:3: rule__XAxiomMLComment__TheoremAssignment_4
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
    // InternalXContext.g:1774:1: rule__XAxiomSLComment__Group__0 : rule__XAxiomSLComment__Group__0__Impl rule__XAxiomSLComment__Group__1 ;
    public final void rule__XAxiomSLComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1778:1: ( rule__XAxiomSLComment__Group__0__Impl rule__XAxiomSLComment__Group__1 )
            // InternalXContext.g:1779:2: rule__XAxiomSLComment__Group__0__Impl rule__XAxiomSLComment__Group__1
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
    // InternalXContext.g:1786:1: rule__XAxiomSLComment__Group__0__Impl : ( () ) ;
    public final void rule__XAxiomSLComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1790:1: ( ( () ) )
            // InternalXContext.g:1791:1: ( () )
            {
            // InternalXContext.g:1791:1: ( () )
            // InternalXContext.g:1792:2: ()
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getAxiomAction_0()); 
            // InternalXContext.g:1793:2: ()
            // InternalXContext.g:1793:3: 
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
    // InternalXContext.g:1801:1: rule__XAxiomSLComment__Group__1 : rule__XAxiomSLComment__Group__1__Impl rule__XAxiomSLComment__Group__2 ;
    public final void rule__XAxiomSLComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1805:1: ( rule__XAxiomSLComment__Group__1__Impl rule__XAxiomSLComment__Group__2 )
            // InternalXContext.g:1806:2: rule__XAxiomSLComment__Group__1__Impl rule__XAxiomSLComment__Group__2
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
    // InternalXContext.g:1813:1: rule__XAxiomSLComment__Group__1__Impl : ( ( rule__XAxiomSLComment__NameAssignment_1 ) ) ;
    public final void rule__XAxiomSLComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1817:1: ( ( ( rule__XAxiomSLComment__NameAssignment_1 ) ) )
            // InternalXContext.g:1818:1: ( ( rule__XAxiomSLComment__NameAssignment_1 ) )
            {
            // InternalXContext.g:1818:1: ( ( rule__XAxiomSLComment__NameAssignment_1 ) )
            // InternalXContext.g:1819:2: ( rule__XAxiomSLComment__NameAssignment_1 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getNameAssignment_1()); 
            // InternalXContext.g:1820:2: ( rule__XAxiomSLComment__NameAssignment_1 )
            // InternalXContext.g:1820:3: rule__XAxiomSLComment__NameAssignment_1
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
    // InternalXContext.g:1828:1: rule__XAxiomSLComment__Group__2 : rule__XAxiomSLComment__Group__2__Impl rule__XAxiomSLComment__Group__3 ;
    public final void rule__XAxiomSLComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1832:1: ( rule__XAxiomSLComment__Group__2__Impl rule__XAxiomSLComment__Group__3 )
            // InternalXContext.g:1833:2: rule__XAxiomSLComment__Group__2__Impl rule__XAxiomSLComment__Group__3
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
    // InternalXContext.g:1840:1: rule__XAxiomSLComment__Group__2__Impl : ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) ) ;
    public final void rule__XAxiomSLComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1844:1: ( ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) ) )
            // InternalXContext.g:1845:1: ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) )
            {
            // InternalXContext.g:1845:1: ( ( rule__XAxiomSLComment__PredicateAssignment_2 ) )
            // InternalXContext.g:1846:2: ( rule__XAxiomSLComment__PredicateAssignment_2 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getPredicateAssignment_2()); 
            // InternalXContext.g:1847:2: ( rule__XAxiomSLComment__PredicateAssignment_2 )
            // InternalXContext.g:1847:3: rule__XAxiomSLComment__PredicateAssignment_2
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
    // InternalXContext.g:1855:1: rule__XAxiomSLComment__Group__3 : rule__XAxiomSLComment__Group__3__Impl rule__XAxiomSLComment__Group__4 ;
    public final void rule__XAxiomSLComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1859:1: ( rule__XAxiomSLComment__Group__3__Impl rule__XAxiomSLComment__Group__4 )
            // InternalXContext.g:1860:2: rule__XAxiomSLComment__Group__3__Impl rule__XAxiomSLComment__Group__4
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
    // InternalXContext.g:1867:1: rule__XAxiomSLComment__Group__3__Impl : ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? ) ;
    public final void rule__XAxiomSLComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1871:1: ( ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? ) )
            // InternalXContext.g:1872:1: ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? )
            {
            // InternalXContext.g:1872:1: ( ( rule__XAxiomSLComment__TheoremAssignment_3 )? )
            // InternalXContext.g:1873:2: ( rule__XAxiomSLComment__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getTheoremAssignment_3()); 
            // InternalXContext.g:1874:2: ( rule__XAxiomSLComment__TheoremAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXContext.g:1874:3: rule__XAxiomSLComment__TheoremAssignment_3
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
    // InternalXContext.g:1882:1: rule__XAxiomSLComment__Group__4 : rule__XAxiomSLComment__Group__4__Impl ;
    public final void rule__XAxiomSLComment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1886:1: ( rule__XAxiomSLComment__Group__4__Impl )
            // InternalXContext.g:1887:2: rule__XAxiomSLComment__Group__4__Impl
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
    // InternalXContext.g:1893:1: rule__XAxiomSLComment__Group__4__Impl : ( ( rule__XAxiomSLComment__CommentAssignment_4 ) ) ;
    public final void rule__XAxiomSLComment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1897:1: ( ( ( rule__XAxiomSLComment__CommentAssignment_4 ) ) )
            // InternalXContext.g:1898:1: ( ( rule__XAxiomSLComment__CommentAssignment_4 ) )
            {
            // InternalXContext.g:1898:1: ( ( rule__XAxiomSLComment__CommentAssignment_4 ) )
            // InternalXContext.g:1899:2: ( rule__XAxiomSLComment__CommentAssignment_4 )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getCommentAssignment_4()); 
            // InternalXContext.g:1900:2: ( rule__XAxiomSLComment__CommentAssignment_4 )
            // InternalXContext.g:1900:3: rule__XAxiomSLComment__CommentAssignment_4
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
    // InternalXContext.g:1909:1: rule__XContext__CommentAssignment_1 : ( ( rule__XContext__CommentAlternatives_1_0 ) ) ;
    public final void rule__XContext__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1913:1: ( ( ( rule__XContext__CommentAlternatives_1_0 ) ) )
            // InternalXContext.g:1914:2: ( ( rule__XContext__CommentAlternatives_1_0 ) )
            {
            // InternalXContext.g:1914:2: ( ( rule__XContext__CommentAlternatives_1_0 ) )
            // InternalXContext.g:1915:3: ( rule__XContext__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXContextAccess().getCommentAlternatives_1_0()); 
            // InternalXContext.g:1916:3: ( rule__XContext__CommentAlternatives_1_0 )
            // InternalXContext.g:1916:4: rule__XContext__CommentAlternatives_1_0
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
    // InternalXContext.g:1924:1: rule__XContext__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XContext__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1928:1: ( ( RULE_ID ) )
            // InternalXContext.g:1929:2: ( RULE_ID )
            {
            // InternalXContext.g:1929:2: ( RULE_ID )
            // InternalXContext.g:1930:3: RULE_ID
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
    // InternalXContext.g:1939:1: rule__XContext__ExtendsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XContext__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1943:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXContext.g:1944:2: ( ( ruleQualifiedName ) )
            {
            // InternalXContext.g:1944:2: ( ( ruleQualifiedName ) )
            // InternalXContext.g:1945:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0()); 
            // InternalXContext.g:1946:3: ( ruleQualifiedName )
            // InternalXContext.g:1947:4: ruleQualifiedName
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
    // InternalXContext.g:1958:1: rule__XContext__SetsAssignment_5_1 : ( ruleXCarrierSet ) ;
    public final void rule__XContext__SetsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1962:1: ( ( ruleXCarrierSet ) )
            // InternalXContext.g:1963:2: ( ruleXCarrierSet )
            {
            // InternalXContext.g:1963:2: ( ruleXCarrierSet )
            // InternalXContext.g:1964:3: ruleXCarrierSet
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
    // InternalXContext.g:1973:1: rule__XContext__ConstantsAssignment_6_1 : ( ruleXConstant ) ;
    public final void rule__XContext__ConstantsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1977:1: ( ( ruleXConstant ) )
            // InternalXContext.g:1978:2: ( ruleXConstant )
            {
            // InternalXContext.g:1978:2: ( ruleXConstant )
            // InternalXContext.g:1979:3: ruleXConstant
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
    // InternalXContext.g:1988:1: rule__XContext__AxiomsAssignment_7_1 : ( ruleXAxiom ) ;
    public final void rule__XContext__AxiomsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1992:1: ( ( ruleXAxiom ) )
            // InternalXContext.g:1993:2: ( ruleXAxiom )
            {
            // InternalXContext.g:1993:2: ( ruleXAxiom )
            // InternalXContext.g:1994:3: ruleXAxiom
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
    // InternalXContext.g:2003:1: rule__XCarrierSetNoComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XCarrierSetNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2007:1: ( ( RULE_ID ) )
            // InternalXContext.g:2008:2: ( RULE_ID )
            {
            // InternalXContext.g:2008:2: ( RULE_ID )
            // InternalXContext.g:2009:3: RULE_ID
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
    // InternalXContext.g:2018:1: rule__XCarrierSetMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XCarrierSetMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2022:1: ( ( RULE_ML_COMMENT ) )
            // InternalXContext.g:2023:2: ( RULE_ML_COMMENT )
            {
            // InternalXContext.g:2023:2: ( RULE_ML_COMMENT )
            // InternalXContext.g:2024:3: RULE_ML_COMMENT
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
    // InternalXContext.g:2033:1: rule__XCarrierSetMLComment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XCarrierSetMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2037:1: ( ( RULE_ID ) )
            // InternalXContext.g:2038:2: ( RULE_ID )
            {
            // InternalXContext.g:2038:2: ( RULE_ID )
            // InternalXContext.g:2039:3: RULE_ID
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
    // InternalXContext.g:2048:1: rule__XCarrierSetSLComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XCarrierSetSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2052:1: ( ( RULE_ID ) )
            // InternalXContext.g:2053:2: ( RULE_ID )
            {
            // InternalXContext.g:2053:2: ( RULE_ID )
            // InternalXContext.g:2054:3: RULE_ID
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
    // InternalXContext.g:2063:1: rule__XCarrierSetSLComment__CommentAssignment_2 : ( RULE_SL_COMMENT ) ;
    public final void rule__XCarrierSetSLComment__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2067:1: ( ( RULE_SL_COMMENT ) )
            // InternalXContext.g:2068:2: ( RULE_SL_COMMENT )
            {
            // InternalXContext.g:2068:2: ( RULE_SL_COMMENT )
            // InternalXContext.g:2069:3: RULE_SL_COMMENT
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
    // InternalXContext.g:2078:1: rule__XConstantNoComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XConstantNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2082:1: ( ( RULE_ID ) )
            // InternalXContext.g:2083:2: ( RULE_ID )
            {
            // InternalXContext.g:2083:2: ( RULE_ID )
            // InternalXContext.g:2084:3: RULE_ID
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
    // InternalXContext.g:2093:1: rule__XConstantMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XConstantMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2097:1: ( ( RULE_ML_COMMENT ) )
            // InternalXContext.g:2098:2: ( RULE_ML_COMMENT )
            {
            // InternalXContext.g:2098:2: ( RULE_ML_COMMENT )
            // InternalXContext.g:2099:3: RULE_ML_COMMENT
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
    // InternalXContext.g:2108:1: rule__XConstantMLComment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XConstantMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2112:1: ( ( RULE_ID ) )
            // InternalXContext.g:2113:2: ( RULE_ID )
            {
            // InternalXContext.g:2113:2: ( RULE_ID )
            // InternalXContext.g:2114:3: RULE_ID
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
    // InternalXContext.g:2123:1: rule__XConstantSLComment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XConstantSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2127:1: ( ( RULE_ID ) )
            // InternalXContext.g:2128:2: ( RULE_ID )
            {
            // InternalXContext.g:2128:2: ( RULE_ID )
            // InternalXContext.g:2129:3: RULE_ID
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
    // InternalXContext.g:2138:1: rule__XConstantSLComment__CommentAssignment_2 : ( RULE_SL_COMMENT ) ;
    public final void rule__XConstantSLComment__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2142:1: ( ( RULE_SL_COMMENT ) )
            // InternalXContext.g:2143:2: ( RULE_SL_COMMENT )
            {
            // InternalXContext.g:2143:2: ( RULE_SL_COMMENT )
            // InternalXContext.g:2144:3: RULE_SL_COMMENT
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
    // InternalXContext.g:2153:1: rule__XAxiomNoComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAxiomNoComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2157:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:2158:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:2158:2: ( RULE_XLABEL )
            // InternalXContext.g:2159:3: RULE_XLABEL
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
    // InternalXContext.g:2168:1: rule__XAxiomNoComment__PredicateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XAxiomNoComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2172:1: ( ( RULE_STRING ) )
            // InternalXContext.g:2173:2: ( RULE_STRING )
            {
            // InternalXContext.g:2173:2: ( RULE_STRING )
            // InternalXContext.g:2174:3: RULE_STRING
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
    // InternalXContext.g:2183:1: rule__XAxiomNoComment__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiomNoComment__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2187:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:2188:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:2188:2: ( ( 'theorem' ) )
            // InternalXContext.g:2189:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomNoCommentAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXContext.g:2190:3: ( 'theorem' )
            // InternalXContext.g:2191:4: 'theorem'
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
    // InternalXContext.g:2202:1: rule__XAxiomMLComment__CommentAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__XAxiomMLComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2206:1: ( ( RULE_ML_COMMENT ) )
            // InternalXContext.g:2207:2: ( RULE_ML_COMMENT )
            {
            // InternalXContext.g:2207:2: ( RULE_ML_COMMENT )
            // InternalXContext.g:2208:3: RULE_ML_COMMENT
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
    // InternalXContext.g:2217:1: rule__XAxiomMLComment__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XAxiomMLComment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2221:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:2222:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:2222:2: ( RULE_XLABEL )
            // InternalXContext.g:2223:3: RULE_XLABEL
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
    // InternalXContext.g:2232:1: rule__XAxiomMLComment__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__XAxiomMLComment__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2236:1: ( ( RULE_STRING ) )
            // InternalXContext.g:2237:2: ( RULE_STRING )
            {
            // InternalXContext.g:2237:2: ( RULE_STRING )
            // InternalXContext.g:2238:3: RULE_STRING
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
    // InternalXContext.g:2247:1: rule__XAxiomMLComment__TheoremAssignment_4 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiomMLComment__TheoremAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2251:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:2252:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:2252:2: ( ( 'theorem' ) )
            // InternalXContext.g:2253:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomMLCommentAccess().getTheoremTheoremKeyword_4_0()); 
            // InternalXContext.g:2254:3: ( 'theorem' )
            // InternalXContext.g:2255:4: 'theorem'
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
    // InternalXContext.g:2266:1: rule__XAxiomSLComment__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAxiomSLComment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2270:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:2271:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:2271:2: ( RULE_XLABEL )
            // InternalXContext.g:2272:3: RULE_XLABEL
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
    // InternalXContext.g:2281:1: rule__XAxiomSLComment__PredicateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XAxiomSLComment__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2285:1: ( ( RULE_STRING ) )
            // InternalXContext.g:2286:2: ( RULE_STRING )
            {
            // InternalXContext.g:2286:2: ( RULE_STRING )
            // InternalXContext.g:2287:3: RULE_STRING
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
    // InternalXContext.g:2296:1: rule__XAxiomSLComment__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiomSLComment__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2300:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:2301:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:2301:2: ( ( 'theorem' ) )
            // InternalXContext.g:2302:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomSLCommentAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXContext.g:2303:3: ( 'theorem' )
            // InternalXContext.g:2304:4: 'theorem'
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
    // InternalXContext.g:2315:1: rule__XAxiomSLComment__CommentAssignment_4 : ( RULE_SL_COMMENT ) ;
    public final void rule__XAxiomSLComment__CommentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2319:1: ( ( RULE_SL_COMMENT ) )
            // InternalXContext.g:2320:2: ( RULE_SL_COMMENT )
            {
            // InternalXContext.g:2320:2: ( RULE_SL_COMMENT )
            // InternalXContext.g:2321:3: RULE_SL_COMMENT
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080020L});

}