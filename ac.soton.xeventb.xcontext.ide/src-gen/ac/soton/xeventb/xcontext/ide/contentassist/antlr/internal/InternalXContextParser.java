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
    // InternalXContext.g:112:1: ruleXCarrierSet : ( ( rule__XCarrierSet__Group__0 ) ) ;
    public final void ruleXCarrierSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:116:2: ( ( ( rule__XCarrierSet__Group__0 ) ) )
            // InternalXContext.g:117:2: ( ( rule__XCarrierSet__Group__0 ) )
            {
            // InternalXContext.g:117:2: ( ( rule__XCarrierSet__Group__0 ) )
            // InternalXContext.g:118:3: ( rule__XCarrierSet__Group__0 )
            {
             before(grammarAccess.getXCarrierSetAccess().getGroup()); 
            // InternalXContext.g:119:3: ( rule__XCarrierSet__Group__0 )
            // InternalXContext.g:119:4: rule__XCarrierSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleXConstant"
    // InternalXContext.g:128:1: entryRuleXConstant : ruleXConstant EOF ;
    public final void entryRuleXConstant() throws RecognitionException {
        try {
            // InternalXContext.g:129:1: ( ruleXConstant EOF )
            // InternalXContext.g:130:1: ruleXConstant EOF
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
    // InternalXContext.g:137:1: ruleXConstant : ( ( rule__XConstant__Group__0 ) ) ;
    public final void ruleXConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:141:2: ( ( ( rule__XConstant__Group__0 ) ) )
            // InternalXContext.g:142:2: ( ( rule__XConstant__Group__0 ) )
            {
            // InternalXContext.g:142:2: ( ( rule__XConstant__Group__0 ) )
            // InternalXContext.g:143:3: ( rule__XConstant__Group__0 )
            {
             before(grammarAccess.getXConstantAccess().getGroup()); 
            // InternalXContext.g:144:3: ( rule__XConstant__Group__0 )
            // InternalXContext.g:144:4: rule__XConstant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XConstant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXConstantAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleXAxiom"
    // InternalXContext.g:153:1: entryRuleXAxiom : ruleXAxiom EOF ;
    public final void entryRuleXAxiom() throws RecognitionException {
        try {
            // InternalXContext.g:154:1: ( ruleXAxiom EOF )
            // InternalXContext.g:155:1: ruleXAxiom EOF
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
    // InternalXContext.g:162:1: ruleXAxiom : ( ( rule__XAxiom__Group__0 ) ) ;
    public final void ruleXAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:166:2: ( ( ( rule__XAxiom__Group__0 ) ) )
            // InternalXContext.g:167:2: ( ( rule__XAxiom__Group__0 ) )
            {
            // InternalXContext.g:167:2: ( ( rule__XAxiom__Group__0 ) )
            // InternalXContext.g:168:3: ( rule__XAxiom__Group__0 )
            {
             before(grammarAccess.getXAxiomAccess().getGroup()); 
            // InternalXContext.g:169:3: ( rule__XAxiom__Group__0 )
            // InternalXContext.g:169:4: rule__XAxiom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XAxiom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleXPredicate"
    // InternalXContext.g:178:1: entryRuleXPredicate : ruleXPredicate EOF ;
    public final void entryRuleXPredicate() throws RecognitionException {
        try {
            // InternalXContext.g:179:1: ( ruleXPredicate EOF )
            // InternalXContext.g:180:1: ruleXPredicate EOF
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
    // InternalXContext.g:187:1: ruleXPredicate : ( RULE_STRING ) ;
    public final void ruleXPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:191:2: ( ( RULE_STRING ) )
            // InternalXContext.g:192:2: ( RULE_STRING )
            {
            // InternalXContext.g:192:2: ( RULE_STRING )
            // InternalXContext.g:193:3: RULE_STRING
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
    // InternalXContext.g:202:1: rule__XContext__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XContext__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:206:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXContext.g:207:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXContext.g:207:2: ( RULE_ML_COMMENT )
                    // InternalXContext.g:208:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:213:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXContext.g:213:2: ( RULE_SL_COMMENT )
                    // InternalXContext.g:214:3: RULE_SL_COMMENT
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


    // $ANTLR start "rule__XContext__Group__0"
    // InternalXContext.g:223:1: rule__XContext__Group__0 : rule__XContext__Group__0__Impl rule__XContext__Group__1 ;
    public final void rule__XContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:227:1: ( rule__XContext__Group__0__Impl rule__XContext__Group__1 )
            // InternalXContext.g:228:2: rule__XContext__Group__0__Impl rule__XContext__Group__1
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
    // InternalXContext.g:235:1: rule__XContext__Group__0__Impl : ( () ) ;
    public final void rule__XContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:239:1: ( ( () ) )
            // InternalXContext.g:240:1: ( () )
            {
            // InternalXContext.g:240:1: ( () )
            // InternalXContext.g:241:2: ()
            {
             before(grammarAccess.getXContextAccess().getContextAction_0()); 
            // InternalXContext.g:242:2: ()
            // InternalXContext.g:242:3: 
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
    // InternalXContext.g:250:1: rule__XContext__Group__1 : rule__XContext__Group__1__Impl rule__XContext__Group__2 ;
    public final void rule__XContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:254:1: ( rule__XContext__Group__1__Impl rule__XContext__Group__2 )
            // InternalXContext.g:255:2: rule__XContext__Group__1__Impl rule__XContext__Group__2
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
    // InternalXContext.g:262:1: rule__XContext__Group__1__Impl : ( ( rule__XContext__CommentAssignment_1 )? ) ;
    public final void rule__XContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:266:1: ( ( ( rule__XContext__CommentAssignment_1 )? ) )
            // InternalXContext.g:267:1: ( ( rule__XContext__CommentAssignment_1 )? )
            {
            // InternalXContext.g:267:1: ( ( rule__XContext__CommentAssignment_1 )? )
            // InternalXContext.g:268:2: ( rule__XContext__CommentAssignment_1 )?
            {
             before(grammarAccess.getXContextAccess().getCommentAssignment_1()); 
            // InternalXContext.g:269:2: ( rule__XContext__CommentAssignment_1 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ML_COMMENT && LA2_0<=RULE_SL_COMMENT)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXContext.g:269:3: rule__XContext__CommentAssignment_1
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
    // InternalXContext.g:277:1: rule__XContext__Group__2 : rule__XContext__Group__2__Impl rule__XContext__Group__3 ;
    public final void rule__XContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:281:1: ( rule__XContext__Group__2__Impl rule__XContext__Group__3 )
            // InternalXContext.g:282:2: rule__XContext__Group__2__Impl rule__XContext__Group__3
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
    // InternalXContext.g:289:1: rule__XContext__Group__2__Impl : ( 'context' ) ;
    public final void rule__XContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:293:1: ( ( 'context' ) )
            // InternalXContext.g:294:1: ( 'context' )
            {
            // InternalXContext.g:294:1: ( 'context' )
            // InternalXContext.g:295:2: 'context'
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
    // InternalXContext.g:304:1: rule__XContext__Group__3 : rule__XContext__Group__3__Impl rule__XContext__Group__4 ;
    public final void rule__XContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:308:1: ( rule__XContext__Group__3__Impl rule__XContext__Group__4 )
            // InternalXContext.g:309:2: rule__XContext__Group__3__Impl rule__XContext__Group__4
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
    // InternalXContext.g:316:1: rule__XContext__Group__3__Impl : ( ( rule__XContext__NameAssignment_3 ) ) ;
    public final void rule__XContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:320:1: ( ( ( rule__XContext__NameAssignment_3 ) ) )
            // InternalXContext.g:321:1: ( ( rule__XContext__NameAssignment_3 ) )
            {
            // InternalXContext.g:321:1: ( ( rule__XContext__NameAssignment_3 ) )
            // InternalXContext.g:322:2: ( rule__XContext__NameAssignment_3 )
            {
             before(grammarAccess.getXContextAccess().getNameAssignment_3()); 
            // InternalXContext.g:323:2: ( rule__XContext__NameAssignment_3 )
            // InternalXContext.g:323:3: rule__XContext__NameAssignment_3
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
    // InternalXContext.g:331:1: rule__XContext__Group__4 : rule__XContext__Group__4__Impl rule__XContext__Group__5 ;
    public final void rule__XContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:335:1: ( rule__XContext__Group__4__Impl rule__XContext__Group__5 )
            // InternalXContext.g:336:2: rule__XContext__Group__4__Impl rule__XContext__Group__5
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
    // InternalXContext.g:343:1: rule__XContext__Group__4__Impl : ( ( rule__XContext__Group_4__0 )? ) ;
    public final void rule__XContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:347:1: ( ( ( rule__XContext__Group_4__0 )? ) )
            // InternalXContext.g:348:1: ( ( rule__XContext__Group_4__0 )? )
            {
            // InternalXContext.g:348:1: ( ( rule__XContext__Group_4__0 )? )
            // InternalXContext.g:349:2: ( rule__XContext__Group_4__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_4()); 
            // InternalXContext.g:350:2: ( rule__XContext__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXContext.g:350:3: rule__XContext__Group_4__0
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
    // InternalXContext.g:358:1: rule__XContext__Group__5 : rule__XContext__Group__5__Impl rule__XContext__Group__6 ;
    public final void rule__XContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:362:1: ( rule__XContext__Group__5__Impl rule__XContext__Group__6 )
            // InternalXContext.g:363:2: rule__XContext__Group__5__Impl rule__XContext__Group__6
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
    // InternalXContext.g:370:1: rule__XContext__Group__5__Impl : ( ( rule__XContext__Group_5__0 )? ) ;
    public final void rule__XContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:374:1: ( ( ( rule__XContext__Group_5__0 )? ) )
            // InternalXContext.g:375:1: ( ( rule__XContext__Group_5__0 )? )
            {
            // InternalXContext.g:375:1: ( ( rule__XContext__Group_5__0 )? )
            // InternalXContext.g:376:2: ( rule__XContext__Group_5__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_5()); 
            // InternalXContext.g:377:2: ( rule__XContext__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXContext.g:377:3: rule__XContext__Group_5__0
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
    // InternalXContext.g:385:1: rule__XContext__Group__6 : rule__XContext__Group__6__Impl rule__XContext__Group__7 ;
    public final void rule__XContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:389:1: ( rule__XContext__Group__6__Impl rule__XContext__Group__7 )
            // InternalXContext.g:390:2: rule__XContext__Group__6__Impl rule__XContext__Group__7
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
    // InternalXContext.g:397:1: rule__XContext__Group__6__Impl : ( ( rule__XContext__Group_6__0 )? ) ;
    public final void rule__XContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:401:1: ( ( ( rule__XContext__Group_6__0 )? ) )
            // InternalXContext.g:402:1: ( ( rule__XContext__Group_6__0 )? )
            {
            // InternalXContext.g:402:1: ( ( rule__XContext__Group_6__0 )? )
            // InternalXContext.g:403:2: ( rule__XContext__Group_6__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_6()); 
            // InternalXContext.g:404:2: ( rule__XContext__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXContext.g:404:3: rule__XContext__Group_6__0
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
    // InternalXContext.g:412:1: rule__XContext__Group__7 : rule__XContext__Group__7__Impl rule__XContext__Group__8 ;
    public final void rule__XContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:416:1: ( rule__XContext__Group__7__Impl rule__XContext__Group__8 )
            // InternalXContext.g:417:2: rule__XContext__Group__7__Impl rule__XContext__Group__8
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
    // InternalXContext.g:424:1: rule__XContext__Group__7__Impl : ( ( rule__XContext__Group_7__0 )? ) ;
    public final void rule__XContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:428:1: ( ( ( rule__XContext__Group_7__0 )? ) )
            // InternalXContext.g:429:1: ( ( rule__XContext__Group_7__0 )? )
            {
            // InternalXContext.g:429:1: ( ( rule__XContext__Group_7__0 )? )
            // InternalXContext.g:430:2: ( rule__XContext__Group_7__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_7()); 
            // InternalXContext.g:431:2: ( rule__XContext__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXContext.g:431:3: rule__XContext__Group_7__0
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
    // InternalXContext.g:439:1: rule__XContext__Group__8 : rule__XContext__Group__8__Impl ;
    public final void rule__XContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:443:1: ( rule__XContext__Group__8__Impl )
            // InternalXContext.g:444:2: rule__XContext__Group__8__Impl
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
    // InternalXContext.g:450:1: rule__XContext__Group__8__Impl : ( 'end' ) ;
    public final void rule__XContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:454:1: ( ( 'end' ) )
            // InternalXContext.g:455:1: ( 'end' )
            {
            // InternalXContext.g:455:1: ( 'end' )
            // InternalXContext.g:456:2: 'end'
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
    // InternalXContext.g:466:1: rule__XContext__Group_4__0 : rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 ;
    public final void rule__XContext__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:470:1: ( rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 )
            // InternalXContext.g:471:2: rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1
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
    // InternalXContext.g:478:1: rule__XContext__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__XContext__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:482:1: ( ( 'extends' ) )
            // InternalXContext.g:483:1: ( 'extends' )
            {
            // InternalXContext.g:483:1: ( 'extends' )
            // InternalXContext.g:484:2: 'extends'
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
    // InternalXContext.g:493:1: rule__XContext__Group_4__1 : rule__XContext__Group_4__1__Impl ;
    public final void rule__XContext__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:497:1: ( rule__XContext__Group_4__1__Impl )
            // InternalXContext.g:498:2: rule__XContext__Group_4__1__Impl
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
    // InternalXContext.g:504:1: rule__XContext__Group_4__1__Impl : ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) ;
    public final void rule__XContext__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:508:1: ( ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) )
            // InternalXContext.g:509:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            {
            // InternalXContext.g:509:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            // InternalXContext.g:510:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            {
            // InternalXContext.g:510:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) )
            // InternalXContext.g:511:3: ( rule__XContext__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:512:3: ( rule__XContext__ExtendsAssignment_4_1 )
            // InternalXContext.g:512:4: rule__XContext__ExtendsAssignment_4_1
            {
            pushFollow(FOLLOW_6);
            rule__XContext__ExtendsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 

            }

            // InternalXContext.g:515:2: ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            // InternalXContext.g:516:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:517:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXContext.g:517:4: rule__XContext__ExtendsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__XContext__ExtendsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalXContext.g:527:1: rule__XContext__Group_5__0 : rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 ;
    public final void rule__XContext__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:531:1: ( rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 )
            // InternalXContext.g:532:2: rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXContext.g:539:1: rule__XContext__Group_5__0__Impl : ( 'sets' ) ;
    public final void rule__XContext__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:543:1: ( ( 'sets' ) )
            // InternalXContext.g:544:1: ( 'sets' )
            {
            // InternalXContext.g:544:1: ( 'sets' )
            // InternalXContext.g:545:2: 'sets'
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
    // InternalXContext.g:554:1: rule__XContext__Group_5__1 : rule__XContext__Group_5__1__Impl ;
    public final void rule__XContext__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:558:1: ( rule__XContext__Group_5__1__Impl )
            // InternalXContext.g:559:2: rule__XContext__Group_5__1__Impl
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
    // InternalXContext.g:565:1: rule__XContext__Group_5__1__Impl : ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) ) ;
    public final void rule__XContext__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:569:1: ( ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) ) )
            // InternalXContext.g:570:1: ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) )
            {
            // InternalXContext.g:570:1: ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) )
            // InternalXContext.g:571:2: ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* )
            {
            // InternalXContext.g:571:2: ( ( rule__XContext__SetsAssignment_5_1 ) )
            // InternalXContext.g:572:3: ( rule__XContext__SetsAssignment_5_1 )
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 
            // InternalXContext.g:573:3: ( rule__XContext__SetsAssignment_5_1 )
            // InternalXContext.g:573:4: rule__XContext__SetsAssignment_5_1
            {
            pushFollow(FOLLOW_6);
            rule__XContext__SetsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 

            }

            // InternalXContext.g:576:2: ( ( rule__XContext__SetsAssignment_5_1 )* )
            // InternalXContext.g:577:3: ( rule__XContext__SetsAssignment_5_1 )*
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 
            // InternalXContext.g:578:3: ( rule__XContext__SetsAssignment_5_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXContext.g:578:4: rule__XContext__SetsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__XContext__SetsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalXContext.g:588:1: rule__XContext__Group_6__0 : rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 ;
    public final void rule__XContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:592:1: ( rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 )
            // InternalXContext.g:593:2: rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalXContext.g:600:1: rule__XContext__Group_6__0__Impl : ( 'constants' ) ;
    public final void rule__XContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:604:1: ( ( 'constants' ) )
            // InternalXContext.g:605:1: ( 'constants' )
            {
            // InternalXContext.g:605:1: ( 'constants' )
            // InternalXContext.g:606:2: 'constants'
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
    // InternalXContext.g:615:1: rule__XContext__Group_6__1 : rule__XContext__Group_6__1__Impl ;
    public final void rule__XContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:619:1: ( rule__XContext__Group_6__1__Impl )
            // InternalXContext.g:620:2: rule__XContext__Group_6__1__Impl
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
    // InternalXContext.g:626:1: rule__XContext__Group_6__1__Impl : ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) ) ;
    public final void rule__XContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:630:1: ( ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) ) )
            // InternalXContext.g:631:1: ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) )
            {
            // InternalXContext.g:631:1: ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) )
            // InternalXContext.g:632:2: ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* )
            {
            // InternalXContext.g:632:2: ( ( rule__XContext__ConstantsAssignment_6_1 ) )
            // InternalXContext.g:633:3: ( rule__XContext__ConstantsAssignment_6_1 )
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 
            // InternalXContext.g:634:3: ( rule__XContext__ConstantsAssignment_6_1 )
            // InternalXContext.g:634:4: rule__XContext__ConstantsAssignment_6_1
            {
            pushFollow(FOLLOW_6);
            rule__XContext__ConstantsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 

            }

            // InternalXContext.g:637:2: ( ( rule__XContext__ConstantsAssignment_6_1 )* )
            // InternalXContext.g:638:3: ( rule__XContext__ConstantsAssignment_6_1 )*
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 
            // InternalXContext.g:639:3: ( rule__XContext__ConstantsAssignment_6_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXContext.g:639:4: rule__XContext__ConstantsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__XContext__ConstantsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalXContext.g:649:1: rule__XContext__Group_7__0 : rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 ;
    public final void rule__XContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:653:1: ( rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 )
            // InternalXContext.g:654:2: rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalXContext.g:661:1: rule__XContext__Group_7__0__Impl : ( 'axioms' ) ;
    public final void rule__XContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:665:1: ( ( 'axioms' ) )
            // InternalXContext.g:666:1: ( 'axioms' )
            {
            // InternalXContext.g:666:1: ( 'axioms' )
            // InternalXContext.g:667:2: 'axioms'
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
    // InternalXContext.g:676:1: rule__XContext__Group_7__1 : rule__XContext__Group_7__1__Impl ;
    public final void rule__XContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:680:1: ( rule__XContext__Group_7__1__Impl )
            // InternalXContext.g:681:2: rule__XContext__Group_7__1__Impl
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
    // InternalXContext.g:687:1: rule__XContext__Group_7__1__Impl : ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) ;
    public final void rule__XContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:691:1: ( ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) )
            // InternalXContext.g:692:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            {
            // InternalXContext.g:692:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            // InternalXContext.g:693:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            {
            // InternalXContext.g:693:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) )
            // InternalXContext.g:694:3: ( rule__XContext__AxiomsAssignment_7_1 )
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:695:3: ( rule__XContext__AxiomsAssignment_7_1 )
            // InternalXContext.g:695:4: rule__XContext__AxiomsAssignment_7_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__AxiomsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 

            }

            // InternalXContext.g:698:2: ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            // InternalXContext.g:699:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:700:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_XLABEL) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXContext.g:700:4: rule__XContext__AxiomsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XContext__AxiomsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalXContext.g:710:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:714:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXContext.g:715:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalXContext.g:722:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:726:1: ( ( RULE_ID ) )
            // InternalXContext.g:727:1: ( RULE_ID )
            {
            // InternalXContext.g:727:1: ( RULE_ID )
            // InternalXContext.g:728:2: RULE_ID
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
    // InternalXContext.g:737:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:741:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXContext.g:742:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXContext.g:748:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:752:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXContext.g:753:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXContext.g:753:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXContext.g:754:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXContext.g:755:2: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXContext.g:755:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalXContext.g:764:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:768:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXContext.g:769:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXContext.g:776:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:780:1: ( ( '.' ) )
            // InternalXContext.g:781:1: ( '.' )
            {
            // InternalXContext.g:781:1: ( '.' )
            // InternalXContext.g:782:2: '.'
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
    // InternalXContext.g:791:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:795:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXContext.g:796:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXContext.g:802:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:806:1: ( ( RULE_ID ) )
            // InternalXContext.g:807:1: ( RULE_ID )
            {
            // InternalXContext.g:807:1: ( RULE_ID )
            // InternalXContext.g:808:2: RULE_ID
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


    // $ANTLR start "rule__XCarrierSet__Group__0"
    // InternalXContext.g:818:1: rule__XCarrierSet__Group__0 : rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 ;
    public final void rule__XCarrierSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:822:1: ( rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 )
            // InternalXContext.g:823:2: rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XCarrierSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCarrierSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__Group__0"


    // $ANTLR start "rule__XCarrierSet__Group__0__Impl"
    // InternalXContext.g:830:1: rule__XCarrierSet__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:834:1: ( ( () ) )
            // InternalXContext.g:835:1: ( () )
            {
            // InternalXContext.g:835:1: ( () )
            // InternalXContext.g:836:2: ()
            {
             before(grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:837:2: ()
            // InternalXContext.g:837:3: 
            {
            }

             after(grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__Group__0__Impl"


    // $ANTLR start "rule__XCarrierSet__Group__1"
    // InternalXContext.g:845:1: rule__XCarrierSet__Group__1 : rule__XCarrierSet__Group__1__Impl ;
    public final void rule__XCarrierSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:849:1: ( rule__XCarrierSet__Group__1__Impl )
            // InternalXContext.g:850:2: rule__XCarrierSet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSet__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__Group__1"


    // $ANTLR start "rule__XCarrierSet__Group__1__Impl"
    // InternalXContext.g:856:1: rule__XCarrierSet__Group__1__Impl : ( ( rule__XCarrierSet__NameAssignment_1 ) ) ;
    public final void rule__XCarrierSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:860:1: ( ( ( rule__XCarrierSet__NameAssignment_1 ) ) )
            // InternalXContext.g:861:1: ( ( rule__XCarrierSet__NameAssignment_1 ) )
            {
            // InternalXContext.g:861:1: ( ( rule__XCarrierSet__NameAssignment_1 ) )
            // InternalXContext.g:862:2: ( rule__XCarrierSet__NameAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetAccess().getNameAssignment_1()); 
            // InternalXContext.g:863:2: ( rule__XCarrierSet__NameAssignment_1 )
            // InternalXContext.g:863:3: rule__XCarrierSet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__Group__1__Impl"


    // $ANTLR start "rule__XConstant__Group__0"
    // InternalXContext.g:872:1: rule__XConstant__Group__0 : rule__XConstant__Group__0__Impl rule__XConstant__Group__1 ;
    public final void rule__XConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:876:1: ( rule__XConstant__Group__0__Impl rule__XConstant__Group__1 )
            // InternalXContext.g:877:2: rule__XConstant__Group__0__Impl rule__XConstant__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XConstant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__Group__0"


    // $ANTLR start "rule__XConstant__Group__0__Impl"
    // InternalXContext.g:884:1: rule__XConstant__Group__0__Impl : ( () ) ;
    public final void rule__XConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:888:1: ( ( () ) )
            // InternalXContext.g:889:1: ( () )
            {
            // InternalXContext.g:889:1: ( () )
            // InternalXContext.g:890:2: ()
            {
             before(grammarAccess.getXConstantAccess().getConstantAction_0()); 
            // InternalXContext.g:891:2: ()
            // InternalXContext.g:891:3: 
            {
            }

             after(grammarAccess.getXConstantAccess().getConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__Group__0__Impl"


    // $ANTLR start "rule__XConstant__Group__1"
    // InternalXContext.g:899:1: rule__XConstant__Group__1 : rule__XConstant__Group__1__Impl ;
    public final void rule__XConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:903:1: ( rule__XConstant__Group__1__Impl )
            // InternalXContext.g:904:2: rule__XConstant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XConstant__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__Group__1"


    // $ANTLR start "rule__XConstant__Group__1__Impl"
    // InternalXContext.g:910:1: rule__XConstant__Group__1__Impl : ( ( rule__XConstant__NameAssignment_1 ) ) ;
    public final void rule__XConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:914:1: ( ( ( rule__XConstant__NameAssignment_1 ) ) )
            // InternalXContext.g:915:1: ( ( rule__XConstant__NameAssignment_1 ) )
            {
            // InternalXContext.g:915:1: ( ( rule__XConstant__NameAssignment_1 ) )
            // InternalXContext.g:916:2: ( rule__XConstant__NameAssignment_1 )
            {
             before(grammarAccess.getXConstantAccess().getNameAssignment_1()); 
            // InternalXContext.g:917:2: ( rule__XConstant__NameAssignment_1 )
            // InternalXContext.g:917:3: rule__XConstant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XConstant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXConstantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__Group__1__Impl"


    // $ANTLR start "rule__XAxiom__Group__0"
    // InternalXContext.g:926:1: rule__XAxiom__Group__0 : rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1 ;
    public final void rule__XAxiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:930:1: ( rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1 )
            // InternalXContext.g:931:2: rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__XAxiom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__0"


    // $ANTLR start "rule__XAxiom__Group__0__Impl"
    // InternalXContext.g:938:1: rule__XAxiom__Group__0__Impl : ( () ) ;
    public final void rule__XAxiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:942:1: ( ( () ) )
            // InternalXContext.g:943:1: ( () )
            {
            // InternalXContext.g:943:1: ( () )
            // InternalXContext.g:944:2: ()
            {
             before(grammarAccess.getXAxiomAccess().getAxiomAction_0()); 
            // InternalXContext.g:945:2: ()
            // InternalXContext.g:945:3: 
            {
            }

             after(grammarAccess.getXAxiomAccess().getAxiomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__0__Impl"


    // $ANTLR start "rule__XAxiom__Group__1"
    // InternalXContext.g:953:1: rule__XAxiom__Group__1 : rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2 ;
    public final void rule__XAxiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:957:1: ( rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2 )
            // InternalXContext.g:958:2: rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XAxiom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__1"


    // $ANTLR start "rule__XAxiom__Group__1__Impl"
    // InternalXContext.g:965:1: rule__XAxiom__Group__1__Impl : ( ( rule__XAxiom__NameAssignment_1 ) ) ;
    public final void rule__XAxiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:969:1: ( ( ( rule__XAxiom__NameAssignment_1 ) ) )
            // InternalXContext.g:970:1: ( ( rule__XAxiom__NameAssignment_1 ) )
            {
            // InternalXContext.g:970:1: ( ( rule__XAxiom__NameAssignment_1 ) )
            // InternalXContext.g:971:2: ( rule__XAxiom__NameAssignment_1 )
            {
             before(grammarAccess.getXAxiomAccess().getNameAssignment_1()); 
            // InternalXContext.g:972:2: ( rule__XAxiom__NameAssignment_1 )
            // InternalXContext.g:972:3: rule__XAxiom__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XAxiom__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__1__Impl"


    // $ANTLR start "rule__XAxiom__Group__2"
    // InternalXContext.g:980:1: rule__XAxiom__Group__2 : rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3 ;
    public final void rule__XAxiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:984:1: ( rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3 )
            // InternalXContext.g:985:2: rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__XAxiom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__2"


    // $ANTLR start "rule__XAxiom__Group__2__Impl"
    // InternalXContext.g:992:1: rule__XAxiom__Group__2__Impl : ( ( rule__XAxiom__PredicateAssignment_2 ) ) ;
    public final void rule__XAxiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:996:1: ( ( ( rule__XAxiom__PredicateAssignment_2 ) ) )
            // InternalXContext.g:997:1: ( ( rule__XAxiom__PredicateAssignment_2 ) )
            {
            // InternalXContext.g:997:1: ( ( rule__XAxiom__PredicateAssignment_2 ) )
            // InternalXContext.g:998:2: ( rule__XAxiom__PredicateAssignment_2 )
            {
             before(grammarAccess.getXAxiomAccess().getPredicateAssignment_2()); 
            // InternalXContext.g:999:2: ( rule__XAxiom__PredicateAssignment_2 )
            // InternalXContext.g:999:3: rule__XAxiom__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAxiom__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__2__Impl"


    // $ANTLR start "rule__XAxiom__Group__3"
    // InternalXContext.g:1007:1: rule__XAxiom__Group__3 : rule__XAxiom__Group__3__Impl ;
    public final void rule__XAxiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1011:1: ( rule__XAxiom__Group__3__Impl )
            // InternalXContext.g:1012:2: rule__XAxiom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAxiom__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__3"


    // $ANTLR start "rule__XAxiom__Group__3__Impl"
    // InternalXContext.g:1018:1: rule__XAxiom__Group__3__Impl : ( ( rule__XAxiom__TheoremAssignment_3 )? ) ;
    public final void rule__XAxiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1022:1: ( ( ( rule__XAxiom__TheoremAssignment_3 )? ) )
            // InternalXContext.g:1023:1: ( ( rule__XAxiom__TheoremAssignment_3 )? )
            {
            // InternalXContext.g:1023:1: ( ( rule__XAxiom__TheoremAssignment_3 )? )
            // InternalXContext.g:1024:2: ( rule__XAxiom__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXAxiomAccess().getTheoremAssignment_3()); 
            // InternalXContext.g:1025:2: ( rule__XAxiom__TheoremAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXContext.g:1025:3: rule__XAxiom__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XAxiom__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAxiomAccess().getTheoremAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__3__Impl"


    // $ANTLR start "rule__XContext__CommentAssignment_1"
    // InternalXContext.g:1034:1: rule__XContext__CommentAssignment_1 : ( ( rule__XContext__CommentAlternatives_1_0 ) ) ;
    public final void rule__XContext__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1038:1: ( ( ( rule__XContext__CommentAlternatives_1_0 ) ) )
            // InternalXContext.g:1039:2: ( ( rule__XContext__CommentAlternatives_1_0 ) )
            {
            // InternalXContext.g:1039:2: ( ( rule__XContext__CommentAlternatives_1_0 ) )
            // InternalXContext.g:1040:3: ( rule__XContext__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXContextAccess().getCommentAlternatives_1_0()); 
            // InternalXContext.g:1041:3: ( rule__XContext__CommentAlternatives_1_0 )
            // InternalXContext.g:1041:4: rule__XContext__CommentAlternatives_1_0
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
    // InternalXContext.g:1049:1: rule__XContext__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XContext__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1053:1: ( ( RULE_ID ) )
            // InternalXContext.g:1054:2: ( RULE_ID )
            {
            // InternalXContext.g:1054:2: ( RULE_ID )
            // InternalXContext.g:1055:3: RULE_ID
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
    // InternalXContext.g:1064:1: rule__XContext__ExtendsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XContext__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1068:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXContext.g:1069:2: ( ( ruleQualifiedName ) )
            {
            // InternalXContext.g:1069:2: ( ( ruleQualifiedName ) )
            // InternalXContext.g:1070:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0()); 
            // InternalXContext.g:1071:3: ( ruleQualifiedName )
            // InternalXContext.g:1072:4: ruleQualifiedName
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
    // InternalXContext.g:1083:1: rule__XContext__SetsAssignment_5_1 : ( ruleXCarrierSet ) ;
    public final void rule__XContext__SetsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1087:1: ( ( ruleXCarrierSet ) )
            // InternalXContext.g:1088:2: ( ruleXCarrierSet )
            {
            // InternalXContext.g:1088:2: ( ruleXCarrierSet )
            // InternalXContext.g:1089:3: ruleXCarrierSet
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
    // InternalXContext.g:1098:1: rule__XContext__ConstantsAssignment_6_1 : ( ruleXConstant ) ;
    public final void rule__XContext__ConstantsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1102:1: ( ( ruleXConstant ) )
            // InternalXContext.g:1103:2: ( ruleXConstant )
            {
            // InternalXContext.g:1103:2: ( ruleXConstant )
            // InternalXContext.g:1104:3: ruleXConstant
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
    // InternalXContext.g:1113:1: rule__XContext__AxiomsAssignment_7_1 : ( ruleXAxiom ) ;
    public final void rule__XContext__AxiomsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1117:1: ( ( ruleXAxiom ) )
            // InternalXContext.g:1118:2: ( ruleXAxiom )
            {
            // InternalXContext.g:1118:2: ( ruleXAxiom )
            // InternalXContext.g:1119:3: ruleXAxiom
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


    // $ANTLR start "rule__XCarrierSet__NameAssignment_1"
    // InternalXContext.g:1128:1: rule__XCarrierSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XCarrierSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1132:1: ( ( RULE_ID ) )
            // InternalXContext.g:1133:2: ( RULE_ID )
            {
            // InternalXContext.g:1133:2: ( RULE_ID )
            // InternalXContext.g:1134:3: RULE_ID
            {
             before(grammarAccess.getXCarrierSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXCarrierSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__NameAssignment_1"


    // $ANTLR start "rule__XConstant__NameAssignment_1"
    // InternalXContext.g:1143:1: rule__XConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1147:1: ( ( RULE_ID ) )
            // InternalXContext.g:1148:2: ( RULE_ID )
            {
            // InternalXContext.g:1148:2: ( RULE_ID )
            // InternalXContext.g:1149:3: RULE_ID
            {
             before(grammarAccess.getXConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXConstantAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__NameAssignment_1"


    // $ANTLR start "rule__XAxiom__NameAssignment_1"
    // InternalXContext.g:1158:1: rule__XAxiom__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAxiom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1162:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:1163:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:1163:2: ( RULE_XLABEL )
            // InternalXContext.g:1164:3: RULE_XLABEL
            {
             before(grammarAccess.getXAxiomAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXAxiomAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__NameAssignment_1"


    // $ANTLR start "rule__XAxiom__PredicateAssignment_2"
    // InternalXContext.g:1173:1: rule__XAxiom__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XAxiom__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1177:1: ( ( ruleXPredicate ) )
            // InternalXContext.g:1178:2: ( ruleXPredicate )
            {
            // InternalXContext.g:1178:2: ( ruleXPredicate )
            // InternalXContext.g:1179:3: ruleXPredicate
            {
             before(grammarAccess.getXAxiomAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXAxiomAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__PredicateAssignment_2"


    // $ANTLR start "rule__XAxiom__TheoremAssignment_3"
    // InternalXContext.g:1188:1: rule__XAxiom__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiom__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1192:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:1193:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:1193:2: ( ( 'theorem' ) )
            // InternalXContext.g:1194:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXContext.g:1195:3: ( 'theorem' )
            // InternalXContext.g:1196:4: 'theorem'
            {
             before(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__TheoremAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});

}