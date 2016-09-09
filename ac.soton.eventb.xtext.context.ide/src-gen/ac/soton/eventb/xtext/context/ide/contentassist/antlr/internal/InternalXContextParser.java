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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'end'", "'extends'", "'sets'", "'constants'", "'axioms'", "'@'", "'theorem'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=8;
    public static final int T__18=18;
    public static final int T__11=11;
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
    // InternalXContext.g:87:1: ruleXCarrierSet : ( ( rule__XCarrierSet__Group__0 ) ) ;
    public final void ruleXCarrierSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:91:2: ( ( ( rule__XCarrierSet__Group__0 ) ) )
            // InternalXContext.g:92:2: ( ( rule__XCarrierSet__Group__0 ) )
            {
            // InternalXContext.g:92:2: ( ( rule__XCarrierSet__Group__0 ) )
            // InternalXContext.g:93:3: ( rule__XCarrierSet__Group__0 )
            {
             before(grammarAccess.getXCarrierSetAccess().getGroup()); 
            // InternalXContext.g:94:3: ( rule__XCarrierSet__Group__0 )
            // InternalXContext.g:94:4: rule__XCarrierSet__Group__0
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
    // InternalXContext.g:103:1: entryRuleXConstant : ruleXConstant EOF ;
    public final void entryRuleXConstant() throws RecognitionException {
        try {
            // InternalXContext.g:104:1: ( ruleXConstant EOF )
            // InternalXContext.g:105:1: ruleXConstant EOF
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
    // InternalXContext.g:112:1: ruleXConstant : ( ( rule__XConstant__Group__0 ) ) ;
    public final void ruleXConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:116:2: ( ( ( rule__XConstant__Group__0 ) ) )
            // InternalXContext.g:117:2: ( ( rule__XConstant__Group__0 ) )
            {
            // InternalXContext.g:117:2: ( ( rule__XConstant__Group__0 ) )
            // InternalXContext.g:118:3: ( rule__XConstant__Group__0 )
            {
             before(grammarAccess.getXConstantAccess().getGroup()); 
            // InternalXContext.g:119:3: ( rule__XConstant__Group__0 )
            // InternalXContext.g:119:4: rule__XConstant__Group__0
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
    // InternalXContext.g:128:1: entryRuleXAxiom : ruleXAxiom EOF ;
    public final void entryRuleXAxiom() throws RecognitionException {
        try {
            // InternalXContext.g:129:1: ( ruleXAxiom EOF )
            // InternalXContext.g:130:1: ruleXAxiom EOF
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
    // InternalXContext.g:137:1: ruleXAxiom : ( ( rule__XAxiom__Group__0 ) ) ;
    public final void ruleXAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:141:2: ( ( ( rule__XAxiom__Group__0 ) ) )
            // InternalXContext.g:142:2: ( ( rule__XAxiom__Group__0 ) )
            {
            // InternalXContext.g:142:2: ( ( rule__XAxiom__Group__0 ) )
            // InternalXContext.g:143:3: ( rule__XAxiom__Group__0 )
            {
             before(grammarAccess.getXAxiomAccess().getGroup()); 
            // InternalXContext.g:144:3: ( rule__XAxiom__Group__0 )
            // InternalXContext.g:144:4: rule__XAxiom__Group__0
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


    // $ANTLR start "rule__XContext__CommentAlternatives_1_0"
    // InternalXContext.g:152:1: rule__XContext__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XContext__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:156:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXContext.g:157:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXContext.g:157:2: ( RULE_ML_COMMENT )
                    // InternalXContext.g:158:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:163:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXContext.g:163:2: ( RULE_SL_COMMENT )
                    // InternalXContext.g:164:3: RULE_SL_COMMENT
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


    // $ANTLR start "rule__XCarrierSet__CommentAlternatives_1_0"
    // InternalXContext.g:173:1: rule__XCarrierSet__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XCarrierSet__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:177:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXContext.g:178:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXContext.g:178:2: ( RULE_ML_COMMENT )
                    // InternalXContext.g:179:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXCarrierSetAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXCarrierSetAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:184:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXContext.g:184:2: ( RULE_SL_COMMENT )
                    // InternalXContext.g:185:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXCarrierSetAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXCarrierSetAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__XCarrierSet__CommentAlternatives_1_0"


    // $ANTLR start "rule__XConstant__CommentAlternatives_1_0"
    // InternalXContext.g:194:1: rule__XConstant__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XConstant__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:198:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXContext.g:199:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXContext.g:199:2: ( RULE_ML_COMMENT )
                    // InternalXContext.g:200:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXConstantAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXConstantAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:205:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXContext.g:205:2: ( RULE_SL_COMMENT )
                    // InternalXContext.g:206:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXConstantAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXConstantAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__XConstant__CommentAlternatives_1_0"


    // $ANTLR start "rule__XAxiom__CommentAlternatives_1_0"
    // InternalXContext.g:215:1: rule__XAxiom__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__XAxiom__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:219:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXContext.g:220:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXContext.g:220:2: ( RULE_ML_COMMENT )
                    // InternalXContext.g:221:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getXAxiomAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXAxiomAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:226:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXContext.g:226:2: ( RULE_SL_COMMENT )
                    // InternalXContext.g:227:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getXAxiomAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getXAxiomAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__XAxiom__CommentAlternatives_1_0"


    // $ANTLR start "rule__XContext__Group__0"
    // InternalXContext.g:236:1: rule__XContext__Group__0 : rule__XContext__Group__0__Impl rule__XContext__Group__1 ;
    public final void rule__XContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:240:1: ( rule__XContext__Group__0__Impl rule__XContext__Group__1 )
            // InternalXContext.g:241:2: rule__XContext__Group__0__Impl rule__XContext__Group__1
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
    // InternalXContext.g:248:1: rule__XContext__Group__0__Impl : ( () ) ;
    public final void rule__XContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:252:1: ( ( () ) )
            // InternalXContext.g:253:1: ( () )
            {
            // InternalXContext.g:253:1: ( () )
            // InternalXContext.g:254:2: ()
            {
             before(grammarAccess.getXContextAccess().getContextAction_0()); 
            // InternalXContext.g:255:2: ()
            // InternalXContext.g:255:3: 
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
    // InternalXContext.g:263:1: rule__XContext__Group__1 : rule__XContext__Group__1__Impl rule__XContext__Group__2 ;
    public final void rule__XContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:267:1: ( rule__XContext__Group__1__Impl rule__XContext__Group__2 )
            // InternalXContext.g:268:2: rule__XContext__Group__1__Impl rule__XContext__Group__2
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
    // InternalXContext.g:275:1: rule__XContext__Group__1__Impl : ( ( rule__XContext__CommentAssignment_1 )? ) ;
    public final void rule__XContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:279:1: ( ( ( rule__XContext__CommentAssignment_1 )? ) )
            // InternalXContext.g:280:1: ( ( rule__XContext__CommentAssignment_1 )? )
            {
            // InternalXContext.g:280:1: ( ( rule__XContext__CommentAssignment_1 )? )
            // InternalXContext.g:281:2: ( rule__XContext__CommentAssignment_1 )?
            {
             before(grammarAccess.getXContextAccess().getCommentAssignment_1()); 
            // InternalXContext.g:282:2: ( rule__XContext__CommentAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ML_COMMENT && LA5_0<=RULE_SL_COMMENT)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXContext.g:282:3: rule__XContext__CommentAssignment_1
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
    // InternalXContext.g:290:1: rule__XContext__Group__2 : rule__XContext__Group__2__Impl rule__XContext__Group__3 ;
    public final void rule__XContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:294:1: ( rule__XContext__Group__2__Impl rule__XContext__Group__3 )
            // InternalXContext.g:295:2: rule__XContext__Group__2__Impl rule__XContext__Group__3
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
    // InternalXContext.g:302:1: rule__XContext__Group__2__Impl : ( 'context' ) ;
    public final void rule__XContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:306:1: ( ( 'context' ) )
            // InternalXContext.g:307:1: ( 'context' )
            {
            // InternalXContext.g:307:1: ( 'context' )
            // InternalXContext.g:308:2: 'context'
            {
             before(grammarAccess.getXContextAccess().getContextKeyword_2()); 
            match(input,11,FOLLOW_2); 
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
    // InternalXContext.g:317:1: rule__XContext__Group__3 : rule__XContext__Group__3__Impl rule__XContext__Group__4 ;
    public final void rule__XContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:321:1: ( rule__XContext__Group__3__Impl rule__XContext__Group__4 )
            // InternalXContext.g:322:2: rule__XContext__Group__3__Impl rule__XContext__Group__4
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
    // InternalXContext.g:329:1: rule__XContext__Group__3__Impl : ( ( rule__XContext__NameAssignment_3 ) ) ;
    public final void rule__XContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:333:1: ( ( ( rule__XContext__NameAssignment_3 ) ) )
            // InternalXContext.g:334:1: ( ( rule__XContext__NameAssignment_3 ) )
            {
            // InternalXContext.g:334:1: ( ( rule__XContext__NameAssignment_3 ) )
            // InternalXContext.g:335:2: ( rule__XContext__NameAssignment_3 )
            {
             before(grammarAccess.getXContextAccess().getNameAssignment_3()); 
            // InternalXContext.g:336:2: ( rule__XContext__NameAssignment_3 )
            // InternalXContext.g:336:3: rule__XContext__NameAssignment_3
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
    // InternalXContext.g:344:1: rule__XContext__Group__4 : rule__XContext__Group__4__Impl rule__XContext__Group__5 ;
    public final void rule__XContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:348:1: ( rule__XContext__Group__4__Impl rule__XContext__Group__5 )
            // InternalXContext.g:349:2: rule__XContext__Group__4__Impl rule__XContext__Group__5
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
    // InternalXContext.g:356:1: rule__XContext__Group__4__Impl : ( ( rule__XContext__Group_4__0 )? ) ;
    public final void rule__XContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:360:1: ( ( ( rule__XContext__Group_4__0 )? ) )
            // InternalXContext.g:361:1: ( ( rule__XContext__Group_4__0 )? )
            {
            // InternalXContext.g:361:1: ( ( rule__XContext__Group_4__0 )? )
            // InternalXContext.g:362:2: ( rule__XContext__Group_4__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_4()); 
            // InternalXContext.g:363:2: ( rule__XContext__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXContext.g:363:3: rule__XContext__Group_4__0
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
    // InternalXContext.g:371:1: rule__XContext__Group__5 : rule__XContext__Group__5__Impl rule__XContext__Group__6 ;
    public final void rule__XContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:375:1: ( rule__XContext__Group__5__Impl rule__XContext__Group__6 )
            // InternalXContext.g:376:2: rule__XContext__Group__5__Impl rule__XContext__Group__6
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
    // InternalXContext.g:383:1: rule__XContext__Group__5__Impl : ( ( rule__XContext__Group_5__0 )? ) ;
    public final void rule__XContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:387:1: ( ( ( rule__XContext__Group_5__0 )? ) )
            // InternalXContext.g:388:1: ( ( rule__XContext__Group_5__0 )? )
            {
            // InternalXContext.g:388:1: ( ( rule__XContext__Group_5__0 )? )
            // InternalXContext.g:389:2: ( rule__XContext__Group_5__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_5()); 
            // InternalXContext.g:390:2: ( rule__XContext__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXContext.g:390:3: rule__XContext__Group_5__0
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
    // InternalXContext.g:398:1: rule__XContext__Group__6 : rule__XContext__Group__6__Impl rule__XContext__Group__7 ;
    public final void rule__XContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:402:1: ( rule__XContext__Group__6__Impl rule__XContext__Group__7 )
            // InternalXContext.g:403:2: rule__XContext__Group__6__Impl rule__XContext__Group__7
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
    // InternalXContext.g:410:1: rule__XContext__Group__6__Impl : ( ( rule__XContext__Group_6__0 )? ) ;
    public final void rule__XContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:414:1: ( ( ( rule__XContext__Group_6__0 )? ) )
            // InternalXContext.g:415:1: ( ( rule__XContext__Group_6__0 )? )
            {
            // InternalXContext.g:415:1: ( ( rule__XContext__Group_6__0 )? )
            // InternalXContext.g:416:2: ( rule__XContext__Group_6__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_6()); 
            // InternalXContext.g:417:2: ( rule__XContext__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXContext.g:417:3: rule__XContext__Group_6__0
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
    // InternalXContext.g:425:1: rule__XContext__Group__7 : rule__XContext__Group__7__Impl rule__XContext__Group__8 ;
    public final void rule__XContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:429:1: ( rule__XContext__Group__7__Impl rule__XContext__Group__8 )
            // InternalXContext.g:430:2: rule__XContext__Group__7__Impl rule__XContext__Group__8
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
    // InternalXContext.g:437:1: rule__XContext__Group__7__Impl : ( ( rule__XContext__Group_7__0 )? ) ;
    public final void rule__XContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:441:1: ( ( ( rule__XContext__Group_7__0 )? ) )
            // InternalXContext.g:442:1: ( ( rule__XContext__Group_7__0 )? )
            {
            // InternalXContext.g:442:1: ( ( rule__XContext__Group_7__0 )? )
            // InternalXContext.g:443:2: ( rule__XContext__Group_7__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_7()); 
            // InternalXContext.g:444:2: ( rule__XContext__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXContext.g:444:3: rule__XContext__Group_7__0
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
    // InternalXContext.g:452:1: rule__XContext__Group__8 : rule__XContext__Group__8__Impl ;
    public final void rule__XContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:456:1: ( rule__XContext__Group__8__Impl )
            // InternalXContext.g:457:2: rule__XContext__Group__8__Impl
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
    // InternalXContext.g:463:1: rule__XContext__Group__8__Impl : ( 'end' ) ;
    public final void rule__XContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:467:1: ( ( 'end' ) )
            // InternalXContext.g:468:1: ( 'end' )
            {
            // InternalXContext.g:468:1: ( 'end' )
            // InternalXContext.g:469:2: 'end'
            {
             before(grammarAccess.getXContextAccess().getEndKeyword_8()); 
            match(input,12,FOLLOW_2); 
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
    // InternalXContext.g:479:1: rule__XContext__Group_4__0 : rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 ;
    public final void rule__XContext__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:483:1: ( rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 )
            // InternalXContext.g:484:2: rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1
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
    // InternalXContext.g:491:1: rule__XContext__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__XContext__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:495:1: ( ( 'extends' ) )
            // InternalXContext.g:496:1: ( 'extends' )
            {
            // InternalXContext.g:496:1: ( 'extends' )
            // InternalXContext.g:497:2: 'extends'
            {
             before(grammarAccess.getXContextAccess().getExtendsKeyword_4_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalXContext.g:506:1: rule__XContext__Group_4__1 : rule__XContext__Group_4__1__Impl ;
    public final void rule__XContext__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:510:1: ( rule__XContext__Group_4__1__Impl )
            // InternalXContext.g:511:2: rule__XContext__Group_4__1__Impl
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
    // InternalXContext.g:517:1: rule__XContext__Group_4__1__Impl : ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) ;
    public final void rule__XContext__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:521:1: ( ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) )
            // InternalXContext.g:522:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            {
            // InternalXContext.g:522:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            // InternalXContext.g:523:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            {
            // InternalXContext.g:523:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) )
            // InternalXContext.g:524:3: ( rule__XContext__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:525:3: ( rule__XContext__ExtendsAssignment_4_1 )
            // InternalXContext.g:525:4: rule__XContext__ExtendsAssignment_4_1
            {
            pushFollow(FOLLOW_6);
            rule__XContext__ExtendsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 

            }

            // InternalXContext.g:528:2: ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            // InternalXContext.g:529:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:530:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXContext.g:530:4: rule__XContext__ExtendsAssignment_4_1
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
    // InternalXContext.g:540:1: rule__XContext__Group_5__0 : rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 ;
    public final void rule__XContext__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:544:1: ( rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 )
            // InternalXContext.g:545:2: rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1
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
    // InternalXContext.g:552:1: rule__XContext__Group_5__0__Impl : ( 'sets' ) ;
    public final void rule__XContext__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:556:1: ( ( 'sets' ) )
            // InternalXContext.g:557:1: ( 'sets' )
            {
            // InternalXContext.g:557:1: ( 'sets' )
            // InternalXContext.g:558:2: 'sets'
            {
             before(grammarAccess.getXContextAccess().getSetsKeyword_5_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalXContext.g:567:1: rule__XContext__Group_5__1 : rule__XContext__Group_5__1__Impl ;
    public final void rule__XContext__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:571:1: ( rule__XContext__Group_5__1__Impl )
            // InternalXContext.g:572:2: rule__XContext__Group_5__1__Impl
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
    // InternalXContext.g:578:1: rule__XContext__Group_5__1__Impl : ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) ) ;
    public final void rule__XContext__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:582:1: ( ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) ) )
            // InternalXContext.g:583:1: ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) )
            {
            // InternalXContext.g:583:1: ( ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* ) )
            // InternalXContext.g:584:2: ( ( rule__XContext__SetsAssignment_5_1 ) ) ( ( rule__XContext__SetsAssignment_5_1 )* )
            {
            // InternalXContext.g:584:2: ( ( rule__XContext__SetsAssignment_5_1 ) )
            // InternalXContext.g:585:3: ( rule__XContext__SetsAssignment_5_1 )
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 
            // InternalXContext.g:586:3: ( rule__XContext__SetsAssignment_5_1 )
            // InternalXContext.g:586:4: rule__XContext__SetsAssignment_5_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__SetsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 

            }

            // InternalXContext.g:589:2: ( ( rule__XContext__SetsAssignment_5_1 )* )
            // InternalXContext.g:590:3: ( rule__XContext__SetsAssignment_5_1 )*
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_5_1()); 
            // InternalXContext.g:591:3: ( rule__XContext__SetsAssignment_5_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ML_COMMENT && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXContext.g:591:4: rule__XContext__SetsAssignment_5_1
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
    // InternalXContext.g:601:1: rule__XContext__Group_6__0 : rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 ;
    public final void rule__XContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:605:1: ( rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 )
            // InternalXContext.g:606:2: rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1
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
    // InternalXContext.g:613:1: rule__XContext__Group_6__0__Impl : ( 'constants' ) ;
    public final void rule__XContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:617:1: ( ( 'constants' ) )
            // InternalXContext.g:618:1: ( 'constants' )
            {
            // InternalXContext.g:618:1: ( 'constants' )
            // InternalXContext.g:619:2: 'constants'
            {
             before(grammarAccess.getXContextAccess().getConstantsKeyword_6_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalXContext.g:628:1: rule__XContext__Group_6__1 : rule__XContext__Group_6__1__Impl ;
    public final void rule__XContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:632:1: ( rule__XContext__Group_6__1__Impl )
            // InternalXContext.g:633:2: rule__XContext__Group_6__1__Impl
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
    // InternalXContext.g:639:1: rule__XContext__Group_6__1__Impl : ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) ) ;
    public final void rule__XContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:643:1: ( ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) ) )
            // InternalXContext.g:644:1: ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) )
            {
            // InternalXContext.g:644:1: ( ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* ) )
            // InternalXContext.g:645:2: ( ( rule__XContext__ConstantsAssignment_6_1 ) ) ( ( rule__XContext__ConstantsAssignment_6_1 )* )
            {
            // InternalXContext.g:645:2: ( ( rule__XContext__ConstantsAssignment_6_1 ) )
            // InternalXContext.g:646:3: ( rule__XContext__ConstantsAssignment_6_1 )
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 
            // InternalXContext.g:647:3: ( rule__XContext__ConstantsAssignment_6_1 )
            // InternalXContext.g:647:4: rule__XContext__ConstantsAssignment_6_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__ConstantsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 

            }

            // InternalXContext.g:650:2: ( ( rule__XContext__ConstantsAssignment_6_1 )* )
            // InternalXContext.g:651:3: ( rule__XContext__ConstantsAssignment_6_1 )*
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_6_1()); 
            // InternalXContext.g:652:3: ( rule__XContext__ConstantsAssignment_6_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ML_COMMENT && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXContext.g:652:4: rule__XContext__ConstantsAssignment_6_1
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
    // InternalXContext.g:662:1: rule__XContext__Group_7__0 : rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 ;
    public final void rule__XContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:666:1: ( rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 )
            // InternalXContext.g:667:2: rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1
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
    // InternalXContext.g:674:1: rule__XContext__Group_7__0__Impl : ( 'axioms' ) ;
    public final void rule__XContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:678:1: ( ( 'axioms' ) )
            // InternalXContext.g:679:1: ( 'axioms' )
            {
            // InternalXContext.g:679:1: ( 'axioms' )
            // InternalXContext.g:680:2: 'axioms'
            {
             before(grammarAccess.getXContextAccess().getAxiomsKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalXContext.g:689:1: rule__XContext__Group_7__1 : rule__XContext__Group_7__1__Impl ;
    public final void rule__XContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:693:1: ( rule__XContext__Group_7__1__Impl )
            // InternalXContext.g:694:2: rule__XContext__Group_7__1__Impl
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
    // InternalXContext.g:700:1: rule__XContext__Group_7__1__Impl : ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) ;
    public final void rule__XContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:704:1: ( ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) )
            // InternalXContext.g:705:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            {
            // InternalXContext.g:705:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            // InternalXContext.g:706:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            {
            // InternalXContext.g:706:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) )
            // InternalXContext.g:707:3: ( rule__XContext__AxiomsAssignment_7_1 )
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:708:3: ( rule__XContext__AxiomsAssignment_7_1 )
            // InternalXContext.g:708:4: rule__XContext__AxiomsAssignment_7_1
            {
            pushFollow(FOLLOW_10);
            rule__XContext__AxiomsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 

            }

            // InternalXContext.g:711:2: ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            // InternalXContext.g:712:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:713:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ML_COMMENT && LA13_0<=RULE_SL_COMMENT)||LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXContext.g:713:4: rule__XContext__AxiomsAssignment_7_1
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


    // $ANTLR start "rule__XCarrierSet__Group__0"
    // InternalXContext.g:723:1: rule__XCarrierSet__Group__0 : rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 ;
    public final void rule__XCarrierSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:727:1: ( rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 )
            // InternalXContext.g:728:2: rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalXContext.g:735:1: rule__XCarrierSet__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:739:1: ( ( () ) )
            // InternalXContext.g:740:1: ( () )
            {
            // InternalXContext.g:740:1: ( () )
            // InternalXContext.g:741:2: ()
            {
             before(grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:742:2: ()
            // InternalXContext.g:742:3: 
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
    // InternalXContext.g:750:1: rule__XCarrierSet__Group__1 : rule__XCarrierSet__Group__1__Impl rule__XCarrierSet__Group__2 ;
    public final void rule__XCarrierSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:754:1: ( rule__XCarrierSet__Group__1__Impl rule__XCarrierSet__Group__2 )
            // InternalXContext.g:755:2: rule__XCarrierSet__Group__1__Impl rule__XCarrierSet__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__XCarrierSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCarrierSet__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:762:1: rule__XCarrierSet__Group__1__Impl : ( ( rule__XCarrierSet__CommentAssignment_1 )? ) ;
    public final void rule__XCarrierSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:766:1: ( ( ( rule__XCarrierSet__CommentAssignment_1 )? ) )
            // InternalXContext.g:767:1: ( ( rule__XCarrierSet__CommentAssignment_1 )? )
            {
            // InternalXContext.g:767:1: ( ( rule__XCarrierSet__CommentAssignment_1 )? )
            // InternalXContext.g:768:2: ( rule__XCarrierSet__CommentAssignment_1 )?
            {
             before(grammarAccess.getXCarrierSetAccess().getCommentAssignment_1()); 
            // InternalXContext.g:769:2: ( rule__XCarrierSet__CommentAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ML_COMMENT && LA14_0<=RULE_SL_COMMENT)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXContext.g:769:3: rule__XCarrierSet__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XCarrierSet__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXCarrierSetAccess().getCommentAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XCarrierSet__Group__2"
    // InternalXContext.g:777:1: rule__XCarrierSet__Group__2 : rule__XCarrierSet__Group__2__Impl ;
    public final void rule__XCarrierSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:781:1: ( rule__XCarrierSet__Group__2__Impl )
            // InternalXContext.g:782:2: rule__XCarrierSet__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSet__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__Group__2"


    // $ANTLR start "rule__XCarrierSet__Group__2__Impl"
    // InternalXContext.g:788:1: rule__XCarrierSet__Group__2__Impl : ( ( rule__XCarrierSet__NameAssignment_2 ) ) ;
    public final void rule__XCarrierSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:792:1: ( ( ( rule__XCarrierSet__NameAssignment_2 ) ) )
            // InternalXContext.g:793:1: ( ( rule__XCarrierSet__NameAssignment_2 ) )
            {
            // InternalXContext.g:793:1: ( ( rule__XCarrierSet__NameAssignment_2 ) )
            // InternalXContext.g:794:2: ( rule__XCarrierSet__NameAssignment_2 )
            {
             before(grammarAccess.getXCarrierSetAccess().getNameAssignment_2()); 
            // InternalXContext.g:795:2: ( rule__XCarrierSet__NameAssignment_2 )
            // InternalXContext.g:795:3: rule__XCarrierSet__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSet__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__Group__2__Impl"


    // $ANTLR start "rule__XConstant__Group__0"
    // InternalXContext.g:804:1: rule__XConstant__Group__0 : rule__XConstant__Group__0__Impl rule__XConstant__Group__1 ;
    public final void rule__XConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:808:1: ( rule__XConstant__Group__0__Impl rule__XConstant__Group__1 )
            // InternalXContext.g:809:2: rule__XConstant__Group__0__Impl rule__XConstant__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalXContext.g:816:1: rule__XConstant__Group__0__Impl : ( () ) ;
    public final void rule__XConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:820:1: ( ( () ) )
            // InternalXContext.g:821:1: ( () )
            {
            // InternalXContext.g:821:1: ( () )
            // InternalXContext.g:822:2: ()
            {
             before(grammarAccess.getXConstantAccess().getConstantAction_0()); 
            // InternalXContext.g:823:2: ()
            // InternalXContext.g:823:3: 
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
    // InternalXContext.g:831:1: rule__XConstant__Group__1 : rule__XConstant__Group__1__Impl rule__XConstant__Group__2 ;
    public final void rule__XConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:835:1: ( rule__XConstant__Group__1__Impl rule__XConstant__Group__2 )
            // InternalXContext.g:836:2: rule__XConstant__Group__1__Impl rule__XConstant__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__XConstant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XConstant__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:843:1: rule__XConstant__Group__1__Impl : ( ( rule__XConstant__CommentAssignment_1 )? ) ;
    public final void rule__XConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:847:1: ( ( ( rule__XConstant__CommentAssignment_1 )? ) )
            // InternalXContext.g:848:1: ( ( rule__XConstant__CommentAssignment_1 )? )
            {
            // InternalXContext.g:848:1: ( ( rule__XConstant__CommentAssignment_1 )? )
            // InternalXContext.g:849:2: ( rule__XConstant__CommentAssignment_1 )?
            {
             before(grammarAccess.getXConstantAccess().getCommentAssignment_1()); 
            // InternalXContext.g:850:2: ( rule__XConstant__CommentAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ML_COMMENT && LA15_0<=RULE_SL_COMMENT)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXContext.g:850:3: rule__XConstant__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XConstant__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXConstantAccess().getCommentAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XConstant__Group__2"
    // InternalXContext.g:858:1: rule__XConstant__Group__2 : rule__XConstant__Group__2__Impl ;
    public final void rule__XConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:862:1: ( rule__XConstant__Group__2__Impl )
            // InternalXContext.g:863:2: rule__XConstant__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XConstant__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__Group__2"


    // $ANTLR start "rule__XConstant__Group__2__Impl"
    // InternalXContext.g:869:1: rule__XConstant__Group__2__Impl : ( ( rule__XConstant__NameAssignment_2 ) ) ;
    public final void rule__XConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:873:1: ( ( ( rule__XConstant__NameAssignment_2 ) ) )
            // InternalXContext.g:874:1: ( ( rule__XConstant__NameAssignment_2 ) )
            {
            // InternalXContext.g:874:1: ( ( rule__XConstant__NameAssignment_2 ) )
            // InternalXContext.g:875:2: ( rule__XConstant__NameAssignment_2 )
            {
             before(grammarAccess.getXConstantAccess().getNameAssignment_2()); 
            // InternalXContext.g:876:2: ( rule__XConstant__NameAssignment_2 )
            // InternalXContext.g:876:3: rule__XConstant__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XConstant__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXConstantAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__Group__2__Impl"


    // $ANTLR start "rule__XAxiom__Group__0"
    // InternalXContext.g:885:1: rule__XAxiom__Group__0 : rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1 ;
    public final void rule__XAxiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:889:1: ( rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1 )
            // InternalXContext.g:890:2: rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalXContext.g:897:1: rule__XAxiom__Group__0__Impl : ( () ) ;
    public final void rule__XAxiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:901:1: ( ( () ) )
            // InternalXContext.g:902:1: ( () )
            {
            // InternalXContext.g:902:1: ( () )
            // InternalXContext.g:903:2: ()
            {
             before(grammarAccess.getXAxiomAccess().getAxiomAction_0()); 
            // InternalXContext.g:904:2: ()
            // InternalXContext.g:904:3: 
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
    // InternalXContext.g:912:1: rule__XAxiom__Group__1 : rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2 ;
    public final void rule__XAxiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:916:1: ( rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2 )
            // InternalXContext.g:917:2: rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalXContext.g:924:1: rule__XAxiom__Group__1__Impl : ( ( rule__XAxiom__CommentAssignment_1 )? ) ;
    public final void rule__XAxiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:928:1: ( ( ( rule__XAxiom__CommentAssignment_1 )? ) )
            // InternalXContext.g:929:1: ( ( rule__XAxiom__CommentAssignment_1 )? )
            {
            // InternalXContext.g:929:1: ( ( rule__XAxiom__CommentAssignment_1 )? )
            // InternalXContext.g:930:2: ( rule__XAxiom__CommentAssignment_1 )?
            {
             before(grammarAccess.getXAxiomAccess().getCommentAssignment_1()); 
            // InternalXContext.g:931:2: ( rule__XAxiom__CommentAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ML_COMMENT && LA16_0<=RULE_SL_COMMENT)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXContext.g:931:3: rule__XAxiom__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XAxiom__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAxiomAccess().getCommentAssignment_1()); 

            }


            }

        }
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
    // InternalXContext.g:939:1: rule__XAxiom__Group__2 : rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3 ;
    public final void rule__XAxiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:943:1: ( rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3 )
            // InternalXContext.g:944:2: rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalXContext.g:951:1: rule__XAxiom__Group__2__Impl : ( '@' ) ;
    public final void rule__XAxiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:955:1: ( ( '@' ) )
            // InternalXContext.g:956:1: ( '@' )
            {
            // InternalXContext.g:956:1: ( '@' )
            // InternalXContext.g:957:2: '@'
            {
             before(grammarAccess.getXAxiomAccess().getCommercialAtKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getXAxiomAccess().getCommercialAtKeyword_2()); 

            }


            }

        }
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
    // InternalXContext.g:966:1: rule__XAxiom__Group__3 : rule__XAxiom__Group__3__Impl rule__XAxiom__Group__4 ;
    public final void rule__XAxiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:970:1: ( rule__XAxiom__Group__3__Impl rule__XAxiom__Group__4 )
            // InternalXContext.g:971:2: rule__XAxiom__Group__3__Impl rule__XAxiom__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__XAxiom__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiom__Group__4();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:978:1: rule__XAxiom__Group__3__Impl : ( ( rule__XAxiom__NameAssignment_3 ) ) ;
    public final void rule__XAxiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:982:1: ( ( ( rule__XAxiom__NameAssignment_3 ) ) )
            // InternalXContext.g:983:1: ( ( rule__XAxiom__NameAssignment_3 ) )
            {
            // InternalXContext.g:983:1: ( ( rule__XAxiom__NameAssignment_3 ) )
            // InternalXContext.g:984:2: ( rule__XAxiom__NameAssignment_3 )
            {
             before(grammarAccess.getXAxiomAccess().getNameAssignment_3()); 
            // InternalXContext.g:985:2: ( rule__XAxiom__NameAssignment_3 )
            // InternalXContext.g:985:3: rule__XAxiom__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XAxiom__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomAccess().getNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__XAxiom__Group__4"
    // InternalXContext.g:993:1: rule__XAxiom__Group__4 : rule__XAxiom__Group__4__Impl rule__XAxiom__Group__5 ;
    public final void rule__XAxiom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:997:1: ( rule__XAxiom__Group__4__Impl rule__XAxiom__Group__5 )
            // InternalXContext.g:998:2: rule__XAxiom__Group__4__Impl rule__XAxiom__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__XAxiom__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAxiom__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__4"


    // $ANTLR start "rule__XAxiom__Group__4__Impl"
    // InternalXContext.g:1005:1: rule__XAxiom__Group__4__Impl : ( ( rule__XAxiom__PredicateAssignment_4 ) ) ;
    public final void rule__XAxiom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1009:1: ( ( ( rule__XAxiom__PredicateAssignment_4 ) ) )
            // InternalXContext.g:1010:1: ( ( rule__XAxiom__PredicateAssignment_4 ) )
            {
            // InternalXContext.g:1010:1: ( ( rule__XAxiom__PredicateAssignment_4 ) )
            // InternalXContext.g:1011:2: ( rule__XAxiom__PredicateAssignment_4 )
            {
             before(grammarAccess.getXAxiomAccess().getPredicateAssignment_4()); 
            // InternalXContext.g:1012:2: ( rule__XAxiom__PredicateAssignment_4 )
            // InternalXContext.g:1012:3: rule__XAxiom__PredicateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XAxiom__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__4__Impl"


    // $ANTLR start "rule__XAxiom__Group__5"
    // InternalXContext.g:1020:1: rule__XAxiom__Group__5 : rule__XAxiom__Group__5__Impl ;
    public final void rule__XAxiom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1024:1: ( rule__XAxiom__Group__5__Impl )
            // InternalXContext.g:1025:2: rule__XAxiom__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAxiom__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__5"


    // $ANTLR start "rule__XAxiom__Group__5__Impl"
    // InternalXContext.g:1031:1: rule__XAxiom__Group__5__Impl : ( ( rule__XAxiom__TheoremAssignment_5 )? ) ;
    public final void rule__XAxiom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1035:1: ( ( ( rule__XAxiom__TheoremAssignment_5 )? ) )
            // InternalXContext.g:1036:1: ( ( rule__XAxiom__TheoremAssignment_5 )? )
            {
            // InternalXContext.g:1036:1: ( ( rule__XAxiom__TheoremAssignment_5 )? )
            // InternalXContext.g:1037:2: ( rule__XAxiom__TheoremAssignment_5 )?
            {
             before(grammarAccess.getXAxiomAccess().getTheoremAssignment_5()); 
            // InternalXContext.g:1038:2: ( rule__XAxiom__TheoremAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXContext.g:1038:3: rule__XAxiom__TheoremAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__XAxiom__TheoremAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAxiomAccess().getTheoremAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__5__Impl"


    // $ANTLR start "rule__XContext__CommentAssignment_1"
    // InternalXContext.g:1047:1: rule__XContext__CommentAssignment_1 : ( ( rule__XContext__CommentAlternatives_1_0 ) ) ;
    public final void rule__XContext__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1051:1: ( ( ( rule__XContext__CommentAlternatives_1_0 ) ) )
            // InternalXContext.g:1052:2: ( ( rule__XContext__CommentAlternatives_1_0 ) )
            {
            // InternalXContext.g:1052:2: ( ( rule__XContext__CommentAlternatives_1_0 ) )
            // InternalXContext.g:1053:3: ( rule__XContext__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXContextAccess().getCommentAlternatives_1_0()); 
            // InternalXContext.g:1054:3: ( rule__XContext__CommentAlternatives_1_0 )
            // InternalXContext.g:1054:4: rule__XContext__CommentAlternatives_1_0
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
    // InternalXContext.g:1062:1: rule__XContext__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XContext__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1066:1: ( ( RULE_ID ) )
            // InternalXContext.g:1067:2: ( RULE_ID )
            {
            // InternalXContext.g:1067:2: ( RULE_ID )
            // InternalXContext.g:1068:3: RULE_ID
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
    // InternalXContext.g:1077:1: rule__XContext__ExtendsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XContext__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1081:1: ( ( ( RULE_ID ) ) )
            // InternalXContext.g:1082:2: ( ( RULE_ID ) )
            {
            // InternalXContext.g:1082:2: ( ( RULE_ID ) )
            // InternalXContext.g:1083:3: ( RULE_ID )
            {
             before(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0()); 
            // InternalXContext.g:1084:3: ( RULE_ID )
            // InternalXContext.g:1085:4: RULE_ID
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
    // InternalXContext.g:1096:1: rule__XContext__SetsAssignment_5_1 : ( ruleXCarrierSet ) ;
    public final void rule__XContext__SetsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1100:1: ( ( ruleXCarrierSet ) )
            // InternalXContext.g:1101:2: ( ruleXCarrierSet )
            {
            // InternalXContext.g:1101:2: ( ruleXCarrierSet )
            // InternalXContext.g:1102:3: ruleXCarrierSet
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
    // InternalXContext.g:1111:1: rule__XContext__ConstantsAssignment_6_1 : ( ruleXConstant ) ;
    public final void rule__XContext__ConstantsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1115:1: ( ( ruleXConstant ) )
            // InternalXContext.g:1116:2: ( ruleXConstant )
            {
            // InternalXContext.g:1116:2: ( ruleXConstant )
            // InternalXContext.g:1117:3: ruleXConstant
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
    // InternalXContext.g:1126:1: rule__XContext__AxiomsAssignment_7_1 : ( ruleXAxiom ) ;
    public final void rule__XContext__AxiomsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1130:1: ( ( ruleXAxiom ) )
            // InternalXContext.g:1131:2: ( ruleXAxiom )
            {
            // InternalXContext.g:1131:2: ( ruleXAxiom )
            // InternalXContext.g:1132:3: ruleXAxiom
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


    // $ANTLR start "rule__XCarrierSet__CommentAssignment_1"
    // InternalXContext.g:1141:1: rule__XCarrierSet__CommentAssignment_1 : ( ( rule__XCarrierSet__CommentAlternatives_1_0 ) ) ;
    public final void rule__XCarrierSet__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1145:1: ( ( ( rule__XCarrierSet__CommentAlternatives_1_0 ) ) )
            // InternalXContext.g:1146:2: ( ( rule__XCarrierSet__CommentAlternatives_1_0 ) )
            {
            // InternalXContext.g:1146:2: ( ( rule__XCarrierSet__CommentAlternatives_1_0 ) )
            // InternalXContext.g:1147:3: ( rule__XCarrierSet__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXCarrierSetAccess().getCommentAlternatives_1_0()); 
            // InternalXContext.g:1148:3: ( rule__XCarrierSet__CommentAlternatives_1_0 )
            // InternalXContext.g:1148:4: rule__XCarrierSet__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSet__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__CommentAssignment_1"


    // $ANTLR start "rule__XCarrierSet__NameAssignment_2"
    // InternalXContext.g:1156:1: rule__XCarrierSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XCarrierSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1160:1: ( ( RULE_ID ) )
            // InternalXContext.g:1161:2: ( RULE_ID )
            {
            // InternalXContext.g:1161:2: ( RULE_ID )
            // InternalXContext.g:1162:3: RULE_ID
            {
             before(grammarAccess.getXCarrierSetAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXCarrierSetAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__NameAssignment_2"


    // $ANTLR start "rule__XConstant__CommentAssignment_1"
    // InternalXContext.g:1171:1: rule__XConstant__CommentAssignment_1 : ( ( rule__XConstant__CommentAlternatives_1_0 ) ) ;
    public final void rule__XConstant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1175:1: ( ( ( rule__XConstant__CommentAlternatives_1_0 ) ) )
            // InternalXContext.g:1176:2: ( ( rule__XConstant__CommentAlternatives_1_0 ) )
            {
            // InternalXContext.g:1176:2: ( ( rule__XConstant__CommentAlternatives_1_0 ) )
            // InternalXContext.g:1177:3: ( rule__XConstant__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXConstantAccess().getCommentAlternatives_1_0()); 
            // InternalXContext.g:1178:3: ( rule__XConstant__CommentAlternatives_1_0 )
            // InternalXContext.g:1178:4: rule__XConstant__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XConstant__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXConstantAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__CommentAssignment_1"


    // $ANTLR start "rule__XConstant__NameAssignment_2"
    // InternalXContext.g:1186:1: rule__XConstant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XConstant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1190:1: ( ( RULE_ID ) )
            // InternalXContext.g:1191:2: ( RULE_ID )
            {
            // InternalXContext.g:1191:2: ( RULE_ID )
            // InternalXContext.g:1192:3: RULE_ID
            {
             before(grammarAccess.getXConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXConstantAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__NameAssignment_2"


    // $ANTLR start "rule__XAxiom__CommentAssignment_1"
    // InternalXContext.g:1201:1: rule__XAxiom__CommentAssignment_1 : ( ( rule__XAxiom__CommentAlternatives_1_0 ) ) ;
    public final void rule__XAxiom__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1205:1: ( ( ( rule__XAxiom__CommentAlternatives_1_0 ) ) )
            // InternalXContext.g:1206:2: ( ( rule__XAxiom__CommentAlternatives_1_0 ) )
            {
            // InternalXContext.g:1206:2: ( ( rule__XAxiom__CommentAlternatives_1_0 ) )
            // InternalXContext.g:1207:3: ( rule__XAxiom__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getXAxiomAccess().getCommentAlternatives_1_0()); 
            // InternalXContext.g:1208:3: ( rule__XAxiom__CommentAlternatives_1_0 )
            // InternalXContext.g:1208:4: rule__XAxiom__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XAxiom__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__CommentAssignment_1"


    // $ANTLR start "rule__XAxiom__NameAssignment_3"
    // InternalXContext.g:1216:1: rule__XAxiom__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XAxiom__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1220:1: ( ( RULE_ID ) )
            // InternalXContext.g:1221:2: ( RULE_ID )
            {
            // InternalXContext.g:1221:2: ( RULE_ID )
            // InternalXContext.g:1222:3: RULE_ID
            {
             before(grammarAccess.getXAxiomAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXAxiomAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__NameAssignment_3"


    // $ANTLR start "rule__XAxiom__PredicateAssignment_4"
    // InternalXContext.g:1231:1: rule__XAxiom__PredicateAssignment_4 : ( RULE_STRING ) ;
    public final void rule__XAxiom__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1235:1: ( ( RULE_STRING ) )
            // InternalXContext.g:1236:2: ( RULE_STRING )
            {
            // InternalXContext.g:1236:2: ( RULE_STRING )
            // InternalXContext.g:1237:3: RULE_STRING
            {
             before(grammarAccess.getXAxiomAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXAxiomAccess().getPredicateSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__PredicateAssignment_4"


    // $ANTLR start "rule__XAxiom__TheoremAssignment_5"
    // InternalXContext.g:1246:1: rule__XAxiom__TheoremAssignment_5 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiom__TheoremAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1250:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:1251:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:1251:2: ( ( 'theorem' ) )
            // InternalXContext.g:1252:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_5_0()); 
            // InternalXContext.g:1253:3: ( 'theorem' )
            // InternalXContext.g:1254:4: 'theorem'
            {
             before(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_5_0()); 

            }

             after(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__TheoremAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});

}