package ac.soton.xeventb.xcontext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXContextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'extends'", "'sets'", "'constants'", "'axioms'", "'end'", "'.'", "'theorem'"
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

        public InternalXContextParser(TokenStream input, XContextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "XContext";
       	}

       	@Override
       	protected XContextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleXContext"
    // InternalXContext.g:64:1: entryRuleXContext returns [EObject current=null] : iv_ruleXContext= ruleXContext EOF ;
    public final EObject entryRuleXContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXContext = null;


        try {
            // InternalXContext.g:64:49: (iv_ruleXContext= ruleXContext EOF )
            // InternalXContext.g:65:2: iv_ruleXContext= ruleXContext EOF
            {
             newCompositeNode(grammarAccess.getXContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXContext=ruleXContext();

            state._fsp--;

             current =iv_ruleXContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXContext"


    // $ANTLR start "ruleXContext"
    // InternalXContext.g:71:1: ruleXContext returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )? (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )? (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )? otherlv_12= 'end' ) ;
    public final EObject ruleXContext() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_sets_7_0 = null;

        EObject lv_constants_9_0 = null;

        EObject lv_axioms_11_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:77:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )? (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )? (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )? otherlv_12= 'end' ) )
            // InternalXContext.g:78:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )? (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )? (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )? otherlv_12= 'end' )
            {
            // InternalXContext.g:78:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )? (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )? (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )? otherlv_12= 'end' )
            // InternalXContext.g:79:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )? (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )? (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )? otherlv_12= 'end'
            {
            // InternalXContext.g:79:3: ()
            // InternalXContext.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXContextAccess().getContextAction_0(),
            					current);
            			

            }

            // InternalXContext.g:86:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ML_COMMENT && LA2_0<=RULE_SL_COMMENT)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXContext.g:87:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXContext.g:87:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXContext.g:88:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXContext.g:88:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
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
                            // InternalXContext.g:89:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getXContextAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXContextRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXContext.g:104:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getXContextAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXContextRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_2,
                            							"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXContextAccess().getContextKeyword_2());
            		
            // InternalXContext.g:125:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXContext.g:126:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXContext.g:126:4: (lv_name_3_0= RULE_ID )
            // InternalXContext.g:127:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXContextAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xeventb.xcontext.XContext.ID");
            				

            }


            }

            // InternalXContext.g:143:3: (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXContext.g:144:4: otherlv_4= 'extends' ( ( ruleQualifiedName ) )+
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getXContextAccess().getExtendsKeyword_4_0());
                    			
                    // InternalXContext.g:148:4: ( ( ruleQualifiedName ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalXContext.g:149:5: ( ruleQualifiedName )
                    	    {
                    	    // InternalXContext.g:149:5: ( ruleQualifiedName )
                    	    // InternalXContext.g:150:6: ruleQualifiedName
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXContextRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            // InternalXContext.g:165:3: (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXContext.g:166:4: otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getXContextAccess().getSetsKeyword_5_0());
                    			
                    // InternalXContext.g:170:4: ( (lv_sets_7_0= ruleXCarrierSet ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalXContext.g:171:5: (lv_sets_7_0= ruleXCarrierSet )
                    	    {
                    	    // InternalXContext.g:171:5: (lv_sets_7_0= ruleXCarrierSet )
                    	    // InternalXContext.g:172:6: lv_sets_7_0= ruleXCarrierSet
                    	    {

                    	    						newCompositeNode(grammarAccess.getXContextAccess().getSetsXCarrierSetParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_sets_7_0=ruleXCarrierSet();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sets",
                    	    							lv_sets_7_0,
                    	    							"ac.soton.xeventb.xcontext.XContext.XCarrierSet");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // InternalXContext.g:190:3: (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXContext.g:191:4: otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getXContextAccess().getConstantsKeyword_6_0());
                    			
                    // InternalXContext.g:195:4: ( (lv_constants_9_0= ruleXConstant ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXContext.g:196:5: (lv_constants_9_0= ruleXConstant )
                    	    {
                    	    // InternalXContext.g:196:5: (lv_constants_9_0= ruleXConstant )
                    	    // InternalXContext.g:197:6: lv_constants_9_0= ruleXConstant
                    	    {

                    	    						newCompositeNode(grammarAccess.getXContextAccess().getConstantsXConstantParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_constants_9_0=ruleXConstant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constants",
                    	    							lv_constants_9_0,
                    	    							"ac.soton.xeventb.xcontext.XContext.XConstant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }

            // InternalXContext.g:215:3: (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXContext.g:216:4: otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getXContextAccess().getAxiomsKeyword_7_0());
                    			
                    // InternalXContext.g:220:4: ( (lv_axioms_11_0= ruleXAxiom ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_XLABEL) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalXContext.g:221:5: (lv_axioms_11_0= ruleXAxiom )
                    	    {
                    	    // InternalXContext.g:221:5: (lv_axioms_11_0= ruleXAxiom )
                    	    // InternalXContext.g:222:6: lv_axioms_11_0= ruleXAxiom
                    	    {

                    	    						newCompositeNode(grammarAccess.getXContextAccess().getAxiomsXAxiomParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_axioms_11_0=ruleXAxiom();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"axioms",
                    	    							lv_axioms_11_0,
                    	    							"ac.soton.xeventb.xcontext.XContext.XAxiom");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getXContextAccess().getEndKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXContext"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXContext.g:248:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXContext.g:248:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXContext.g:249:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXContext.g:255:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXContext.g:261:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXContext.g:262:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXContext.g:262:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXContext.g:263:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXContext.g:270:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXContext.g:271:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleXCarrierSet"
    // InternalXContext.g:288:1: entryRuleXCarrierSet returns [EObject current=null] : iv_ruleXCarrierSet= ruleXCarrierSet EOF ;
    public final EObject entryRuleXCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCarrierSet = null;


        try {
            // InternalXContext.g:288:52: (iv_ruleXCarrierSet= ruleXCarrierSet EOF )
            // InternalXContext.g:289:2: iv_ruleXCarrierSet= ruleXCarrierSet EOF
            {
             newCompositeNode(grammarAccess.getXCarrierSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXCarrierSet=ruleXCarrierSet();

            state._fsp--;

             current =iv_ruleXCarrierSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCarrierSet"


    // $ANTLR start "ruleXCarrierSet"
    // InternalXContext.g:295:1: ruleXCarrierSet returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXCarrierSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXContext.g:301:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXContext.g:302:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXContext.g:302:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXContext.g:303:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXContext.g:303:3: ()
            // InternalXContext.g:304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0(),
            					current);
            			

            }

            // InternalXContext.g:310:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXContext.g:311:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXContext.g:311:4: (lv_name_1_0= RULE_ID )
            // InternalXContext.g:312:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXCarrierSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXCarrierSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xcontext.XContext.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCarrierSet"


    // $ANTLR start "entryRuleXConstant"
    // InternalXContext.g:332:1: entryRuleXConstant returns [EObject current=null] : iv_ruleXConstant= ruleXConstant EOF ;
    public final EObject entryRuleXConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstant = null;


        try {
            // InternalXContext.g:332:50: (iv_ruleXConstant= ruleXConstant EOF )
            // InternalXContext.g:333:2: iv_ruleXConstant= ruleXConstant EOF
            {
             newCompositeNode(grammarAccess.getXConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXConstant=ruleXConstant();

            state._fsp--;

             current =iv_ruleXConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstant"


    // $ANTLR start "ruleXConstant"
    // InternalXContext.g:339:1: ruleXConstant returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXContext.g:345:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXContext.g:346:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXContext.g:346:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXContext.g:347:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXContext.g:347:3: ()
            // InternalXContext.g:348:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstantAccess().getConstantAction_0(),
            					current);
            			

            }

            // InternalXContext.g:354:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXContext.g:355:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXContext.g:355:4: (lv_name_1_0= RULE_ID )
            // InternalXContext.g:356:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXConstantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xcontext.XContext.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstant"


    // $ANTLR start "entryRuleXAxiom"
    // InternalXContext.g:376:1: entryRuleXAxiom returns [EObject current=null] : iv_ruleXAxiom= ruleXAxiom EOF ;
    public final EObject entryRuleXAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAxiom = null;


        try {
            // InternalXContext.g:376:47: (iv_ruleXAxiom= ruleXAxiom EOF )
            // InternalXContext.g:377:2: iv_ruleXAxiom= ruleXAxiom EOF
            {
             newCompositeNode(grammarAccess.getXAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXAxiom=ruleXAxiom();

            state._fsp--;

             current =iv_ruleXAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAxiom"


    // $ANTLR start "ruleXAxiom"
    // InternalXContext.g:383:1: ruleXAxiom returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:389:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXContext.g:390:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXContext.g:390:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXContext.g:391:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXContext.g:391:3: ()
            // InternalXContext.g:392:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXAxiomAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalXContext.g:398:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXContext.g:399:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXContext.g:399:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXContext.g:400:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXAxiomAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xcontext.XContext.XLABEL");
            				

            }


            }

            // InternalXContext.g:416:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXContext.g:417:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXContext.g:417:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXContext.g:418:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXAxiomAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXAxiomRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xcontext.XContext.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXContext.g:435:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXContext.g:436:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXContext.g:436:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXContext.g:437:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXAxiomRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAxiom"


    // $ANTLR start "entryRuleXPredicate"
    // InternalXContext.g:453:1: entryRuleXPredicate returns [String current=null] : iv_ruleXPredicate= ruleXPredicate EOF ;
    public final String entryRuleXPredicate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXPredicate = null;


        try {
            // InternalXContext.g:453:50: (iv_ruleXPredicate= ruleXPredicate EOF )
            // InternalXContext.g:454:2: iv_ruleXPredicate= ruleXPredicate EOF
            {
             newCompositeNode(grammarAccess.getXPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXPredicate=ruleXPredicate();

            state._fsp--;

             current =iv_ruleXPredicate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPredicate"


    // $ANTLR start "ruleXPredicate"
    // InternalXContext.g:460:1: ruleXPredicate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleXPredicate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalXContext.g:466:2: (this_STRING_0= RULE_STRING )
            // InternalXContext.g:467:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getXPredicateAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPredicate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});

}