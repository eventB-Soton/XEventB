package ac.soton.eventb.xtext.context.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.eventb.xtext.context.services.XContextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXContextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'extends'", "'sets'", "'constants'", "'axioms'", "'end'", "'theorem'"
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
    // InternalXContext.g:71:1: ruleXContext returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )+ )? (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )? (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )? (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )? otherlv_12= 'end' ) ;
    public final EObject ruleXContext() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_sets_7_0 = null;

        EObject lv_constants_9_0 = null;

        EObject lv_axioms_11_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:77:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )+ )? (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )? (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )? (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )? otherlv_12= 'end' ) )
            // InternalXContext.g:78:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )+ )? (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )? (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )? (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )? otherlv_12= 'end' )
            {
            // InternalXContext.g:78:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )+ )? (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )? (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )? (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )? otherlv_12= 'end' )
            // InternalXContext.g:79:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )+ )? (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )? (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )? (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )? otherlv_12= 'end'
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXContext.g:143:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXContext.g:144:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )+
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getXContextAccess().getExtendsKeyword_4_0());
                    			
                    // InternalXContext.g:148:4: ( (otherlv_5= RULE_ID ) )+
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
                    	    // InternalXContext.g:149:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalXContext.g:149:5: (otherlv_5= RULE_ID )
                    	    // InternalXContext.g:150:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXContextRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0());
                    	    					

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

            // InternalXContext.g:162:3: (otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXContext.g:163:4: otherlv_6= 'sets' ( (lv_sets_7_0= ruleXCarrierSet ) )+
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getXContextAccess().getSetsKeyword_5_0());
                    			
                    // InternalXContext.g:167:4: ( (lv_sets_7_0= ruleXCarrierSet ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ML_COMMENT||LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalXContext.g:168:5: (lv_sets_7_0= ruleXCarrierSet )
                    	    {
                    	    // InternalXContext.g:168:5: (lv_sets_7_0= ruleXCarrierSet )
                    	    // InternalXContext.g:169:6: lv_sets_7_0= ruleXCarrierSet
                    	    {

                    	    						newCompositeNode(grammarAccess.getXContextAccess().getSetsXCarrierSetParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_sets_7_0=ruleXCarrierSet();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sets",
                    	    							lv_sets_7_0,
                    	    							"ac.soton.eventb.xtext.context.XContext.XCarrierSet");
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

            // InternalXContext.g:187:3: (otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXContext.g:188:4: otherlv_8= 'constants' ( (lv_constants_9_0= ruleXConstant ) )+
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getXContextAccess().getConstantsKeyword_6_0());
                    			
                    // InternalXContext.g:192:4: ( (lv_constants_9_0= ruleXConstant ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ML_COMMENT||LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXContext.g:193:5: (lv_constants_9_0= ruleXConstant )
                    	    {
                    	    // InternalXContext.g:193:5: (lv_constants_9_0= ruleXConstant )
                    	    // InternalXContext.g:194:6: lv_constants_9_0= ruleXConstant
                    	    {

                    	    						newCompositeNode(grammarAccess.getXContextAccess().getConstantsXConstantParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_constants_9_0=ruleXConstant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constants",
                    	    							lv_constants_9_0,
                    	    							"ac.soton.eventb.xtext.context.XContext.XConstant");
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

            // InternalXContext.g:212:3: (otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXContext.g:213:4: otherlv_10= 'axioms' ( (lv_axioms_11_0= ruleXAxiom ) )+
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getXContextAccess().getAxiomsKeyword_7_0());
                    			
                    // InternalXContext.g:217:4: ( (lv_axioms_11_0= ruleXAxiom ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ML_COMMENT||LA9_0==RULE_XLABEL) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalXContext.g:218:5: (lv_axioms_11_0= ruleXAxiom )
                    	    {
                    	    // InternalXContext.g:218:5: (lv_axioms_11_0= ruleXAxiom )
                    	    // InternalXContext.g:219:6: lv_axioms_11_0= ruleXAxiom
                    	    {

                    	    						newCompositeNode(grammarAccess.getXContextAccess().getAxiomsXAxiomParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_axioms_11_0=ruleXAxiom();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"axioms",
                    	    							lv_axioms_11_0,
                    	    							"ac.soton.eventb.xtext.context.XContext.XAxiom");
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


    // $ANTLR start "entryRuleXCarrierSet"
    // InternalXContext.g:245:1: entryRuleXCarrierSet returns [EObject current=null] : iv_ruleXCarrierSet= ruleXCarrierSet EOF ;
    public final EObject entryRuleXCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCarrierSet = null;


        try {
            // InternalXContext.g:245:52: (iv_ruleXCarrierSet= ruleXCarrierSet EOF )
            // InternalXContext.g:246:2: iv_ruleXCarrierSet= ruleXCarrierSet EOF
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
    // InternalXContext.g:252:1: ruleXCarrierSet returns [EObject current=null] : (this_XCarrierSetNoComment_0= ruleXCarrierSetNoComment | this_XCarrierSetMLComment_1= ruleXCarrierSetMLComment | this_XCarrierSetSLComment_2= ruleXCarrierSetSLComment ) ;
    public final EObject ruleXCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject this_XCarrierSetNoComment_0 = null;

        EObject this_XCarrierSetMLComment_1 = null;

        EObject this_XCarrierSetSLComment_2 = null;



        	enterRule();

        try {
            // InternalXContext.g:258:2: ( (this_XCarrierSetNoComment_0= ruleXCarrierSetNoComment | this_XCarrierSetMLComment_1= ruleXCarrierSetMLComment | this_XCarrierSetSLComment_2= ruleXCarrierSetSLComment ) )
            // InternalXContext.g:259:2: (this_XCarrierSetNoComment_0= ruleXCarrierSetNoComment | this_XCarrierSetMLComment_1= ruleXCarrierSetMLComment | this_XCarrierSetSLComment_2= ruleXCarrierSetSLComment )
            {
            // InternalXContext.g:259:2: (this_XCarrierSetNoComment_0= ruleXCarrierSetNoComment | this_XCarrierSetMLComment_1= ruleXCarrierSetMLComment | this_XCarrierSetSLComment_2= ruleXCarrierSetSLComment )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_SL_COMMENT) ) {
                    alt11=3;
                }
                else if ( (LA11_1==EOF||LA11_1==RULE_ML_COMMENT||LA11_1==RULE_ID||(LA11_1>=15 && LA11_1<=17)) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_ML_COMMENT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalXContext.g:260:3: this_XCarrierSetNoComment_0= ruleXCarrierSetNoComment
                    {

                    			newCompositeNode(grammarAccess.getXCarrierSetAccess().getXCarrierSetNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XCarrierSetNoComment_0=ruleXCarrierSetNoComment();

                    state._fsp--;


                    			current = this_XCarrierSetNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:269:3: this_XCarrierSetMLComment_1= ruleXCarrierSetMLComment
                    {

                    			newCompositeNode(grammarAccess.getXCarrierSetAccess().getXCarrierSetMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XCarrierSetMLComment_1=ruleXCarrierSetMLComment();

                    state._fsp--;


                    			current = this_XCarrierSetMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:278:3: this_XCarrierSetSLComment_2= ruleXCarrierSetSLComment
                    {

                    			newCompositeNode(grammarAccess.getXCarrierSetAccess().getXCarrierSetSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XCarrierSetSLComment_2=ruleXCarrierSetSLComment();

                    state._fsp--;


                    			current = this_XCarrierSetSLComment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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


    // $ANTLR start "entryRuleXCarrierSetNoComment"
    // InternalXContext.g:290:1: entryRuleXCarrierSetNoComment returns [EObject current=null] : iv_ruleXCarrierSetNoComment= ruleXCarrierSetNoComment EOF ;
    public final EObject entryRuleXCarrierSetNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCarrierSetNoComment = null;


        try {
            // InternalXContext.g:290:61: (iv_ruleXCarrierSetNoComment= ruleXCarrierSetNoComment EOF )
            // InternalXContext.g:291:2: iv_ruleXCarrierSetNoComment= ruleXCarrierSetNoComment EOF
            {
             newCompositeNode(grammarAccess.getXCarrierSetNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXCarrierSetNoComment=ruleXCarrierSetNoComment();

            state._fsp--;

             current =iv_ruleXCarrierSetNoComment; 
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
    // $ANTLR end "entryRuleXCarrierSetNoComment"


    // $ANTLR start "ruleXCarrierSetNoComment"
    // InternalXContext.g:297:1: ruleXCarrierSetNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXCarrierSetNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXContext.g:303:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXContext.g:304:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXContext.g:304:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXContext.g:305:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXContext.g:305:3: ()
            // InternalXContext.g:306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXCarrierSetNoCommentAccess().getCarrierSetAction_0(),
            					current);
            			

            }

            // InternalXContext.g:312:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXContext.g:313:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXContext.g:313:4: (lv_name_1_0= RULE_ID )
            // InternalXContext.g:314:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXCarrierSetNoCommentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXCarrierSetNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleXCarrierSetNoComment"


    // $ANTLR start "entryRuleXCarrierSetMLComment"
    // InternalXContext.g:334:1: entryRuleXCarrierSetMLComment returns [EObject current=null] : iv_ruleXCarrierSetMLComment= ruleXCarrierSetMLComment EOF ;
    public final EObject entryRuleXCarrierSetMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCarrierSetMLComment = null;


        try {
            // InternalXContext.g:334:61: (iv_ruleXCarrierSetMLComment= ruleXCarrierSetMLComment EOF )
            // InternalXContext.g:335:2: iv_ruleXCarrierSetMLComment= ruleXCarrierSetMLComment EOF
            {
             newCompositeNode(grammarAccess.getXCarrierSetMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXCarrierSetMLComment=ruleXCarrierSetMLComment();

            state._fsp--;

             current =iv_ruleXCarrierSetMLComment; 
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
    // $ANTLR end "entryRuleXCarrierSetMLComment"


    // $ANTLR start "ruleXCarrierSetMLComment"
    // InternalXContext.g:341:1: ruleXCarrierSetMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXCarrierSetMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXContext.g:347:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXContext.g:348:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXContext.g:348:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXContext.g:349:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXContext.g:349:3: ()
            // InternalXContext.g:350:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXCarrierSetMLCommentAccess().getCarrierSetAction_0(),
            					current);
            			

            }

            // InternalXContext.g:356:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXContext.g:357:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXContext.g:357:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXContext.g:358:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_4); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXCarrierSetMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXCarrierSetMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXContext.g:374:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:375:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:375:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:376:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXCarrierSetMLCommentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXCarrierSetMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleXCarrierSetMLComment"


    // $ANTLR start "entryRuleXCarrierSetSLComment"
    // InternalXContext.g:396:1: entryRuleXCarrierSetSLComment returns [EObject current=null] : iv_ruleXCarrierSetSLComment= ruleXCarrierSetSLComment EOF ;
    public final EObject entryRuleXCarrierSetSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCarrierSetSLComment = null;


        try {
            // InternalXContext.g:396:61: (iv_ruleXCarrierSetSLComment= ruleXCarrierSetSLComment EOF )
            // InternalXContext.g:397:2: iv_ruleXCarrierSetSLComment= ruleXCarrierSetSLComment EOF
            {
             newCompositeNode(grammarAccess.getXCarrierSetSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXCarrierSetSLComment=ruleXCarrierSetSLComment();

            state._fsp--;

             current =iv_ruleXCarrierSetSLComment; 
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
    // $ANTLR end "entryRuleXCarrierSetSLComment"


    // $ANTLR start "ruleXCarrierSetSLComment"
    // InternalXContext.g:403:1: ruleXCarrierSetSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXCarrierSetSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXContext.g:409:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXContext.g:410:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXContext.g:410:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXContext.g:411:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXContext.g:411:3: ()
            // InternalXContext.g:412:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXCarrierSetSLCommentAccess().getCarrierSetAction_0(),
            					current);
            			

            }

            // InternalXContext.g:418:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXContext.g:419:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXContext.g:419:4: (lv_name_1_0= RULE_ID )
            // InternalXContext.g:420:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXCarrierSetSLCommentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXCarrierSetSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXContext.g:436:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXContext.g:437:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXContext.g:437:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXContext.g:438:5: lv_comment_2_0= RULE_SL_COMMENT
            {
            lv_comment_2_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_2_0, grammarAccess.getXCarrierSetSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXCarrierSetSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_2_0,
            						"org.eclipse.xtext.common.Terminals.SL_COMMENT");
            				

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
    // $ANTLR end "ruleXCarrierSetSLComment"


    // $ANTLR start "entryRuleXConstant"
    // InternalXContext.g:458:1: entryRuleXConstant returns [EObject current=null] : iv_ruleXConstant= ruleXConstant EOF ;
    public final EObject entryRuleXConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstant = null;


        try {
            // InternalXContext.g:458:50: (iv_ruleXConstant= ruleXConstant EOF )
            // InternalXContext.g:459:2: iv_ruleXConstant= ruleXConstant EOF
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
    // InternalXContext.g:465:1: ruleXConstant returns [EObject current=null] : (this_XConstantNoComment_0= ruleXConstantNoComment | this_XConstantMLComment_1= ruleXConstantMLComment | this_XConstantSLComment_2= ruleXConstantSLComment ) ;
    public final EObject ruleXConstant() throws RecognitionException {
        EObject current = null;

        EObject this_XConstantNoComment_0 = null;

        EObject this_XConstantMLComment_1 = null;

        EObject this_XConstantSLComment_2 = null;



        	enterRule();

        try {
            // InternalXContext.g:471:2: ( (this_XConstantNoComment_0= ruleXConstantNoComment | this_XConstantMLComment_1= ruleXConstantMLComment | this_XConstantSLComment_2= ruleXConstantSLComment ) )
            // InternalXContext.g:472:2: (this_XConstantNoComment_0= ruleXConstantNoComment | this_XConstantMLComment_1= ruleXConstantMLComment | this_XConstantSLComment_2= ruleXConstantSLComment )
            {
            // InternalXContext.g:472:2: (this_XConstantNoComment_0= ruleXConstantNoComment | this_XConstantMLComment_1= ruleXConstantMLComment | this_XConstantSLComment_2= ruleXConstantSLComment )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_ML_COMMENT||LA12_1==RULE_ID||(LA12_1>=16 && LA12_1<=17)) ) {
                    alt12=1;
                }
                else if ( (LA12_1==RULE_SL_COMMENT) ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_ML_COMMENT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalXContext.g:473:3: this_XConstantNoComment_0= ruleXConstantNoComment
                    {

                    			newCompositeNode(grammarAccess.getXConstantAccess().getXConstantNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XConstantNoComment_0=ruleXConstantNoComment();

                    state._fsp--;


                    			current = this_XConstantNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:482:3: this_XConstantMLComment_1= ruleXConstantMLComment
                    {

                    			newCompositeNode(grammarAccess.getXConstantAccess().getXConstantMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XConstantMLComment_1=ruleXConstantMLComment();

                    state._fsp--;


                    			current = this_XConstantMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:491:3: this_XConstantSLComment_2= ruleXConstantSLComment
                    {

                    			newCompositeNode(grammarAccess.getXConstantAccess().getXConstantSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XConstantSLComment_2=ruleXConstantSLComment();

                    state._fsp--;


                    			current = this_XConstantSLComment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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


    // $ANTLR start "entryRuleXConstantNoComment"
    // InternalXContext.g:503:1: entryRuleXConstantNoComment returns [EObject current=null] : iv_ruleXConstantNoComment= ruleXConstantNoComment EOF ;
    public final EObject entryRuleXConstantNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstantNoComment = null;


        try {
            // InternalXContext.g:503:59: (iv_ruleXConstantNoComment= ruleXConstantNoComment EOF )
            // InternalXContext.g:504:2: iv_ruleXConstantNoComment= ruleXConstantNoComment EOF
            {
             newCompositeNode(grammarAccess.getXConstantNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXConstantNoComment=ruleXConstantNoComment();

            state._fsp--;

             current =iv_ruleXConstantNoComment; 
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
    // $ANTLR end "entryRuleXConstantNoComment"


    // $ANTLR start "ruleXConstantNoComment"
    // InternalXContext.g:510:1: ruleXConstantNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXConstantNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXContext.g:516:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXContext.g:517:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXContext.g:517:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXContext.g:518:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXContext.g:518:3: ()
            // InternalXContext.g:519:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstantNoCommentAccess().getConstantAction_0(),
            					current);
            			

            }

            // InternalXContext.g:525:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXContext.g:526:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXContext.g:526:4: (lv_name_1_0= RULE_ID )
            // InternalXContext.g:527:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXConstantNoCommentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXConstantNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleXConstantNoComment"


    // $ANTLR start "entryRuleXConstantMLComment"
    // InternalXContext.g:547:1: entryRuleXConstantMLComment returns [EObject current=null] : iv_ruleXConstantMLComment= ruleXConstantMLComment EOF ;
    public final EObject entryRuleXConstantMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstantMLComment = null;


        try {
            // InternalXContext.g:547:59: (iv_ruleXConstantMLComment= ruleXConstantMLComment EOF )
            // InternalXContext.g:548:2: iv_ruleXConstantMLComment= ruleXConstantMLComment EOF
            {
             newCompositeNode(grammarAccess.getXConstantMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXConstantMLComment=ruleXConstantMLComment();

            state._fsp--;

             current =iv_ruleXConstantMLComment; 
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
    // $ANTLR end "entryRuleXConstantMLComment"


    // $ANTLR start "ruleXConstantMLComment"
    // InternalXContext.g:554:1: ruleXConstantMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXConstantMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXContext.g:560:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXContext.g:561:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXContext.g:561:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXContext.g:562:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXContext.g:562:3: ()
            // InternalXContext.g:563:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstantMLCommentAccess().getConstantAction_0(),
            					current);
            			

            }

            // InternalXContext.g:569:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXContext.g:570:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXContext.g:570:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXContext.g:571:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_4); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXConstantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXConstantMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXContext.g:587:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:588:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:588:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:589:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXConstantMLCommentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXConstantMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleXConstantMLComment"


    // $ANTLR start "entryRuleXConstantSLComment"
    // InternalXContext.g:609:1: entryRuleXConstantSLComment returns [EObject current=null] : iv_ruleXConstantSLComment= ruleXConstantSLComment EOF ;
    public final EObject entryRuleXConstantSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstantSLComment = null;


        try {
            // InternalXContext.g:609:59: (iv_ruleXConstantSLComment= ruleXConstantSLComment EOF )
            // InternalXContext.g:610:2: iv_ruleXConstantSLComment= ruleXConstantSLComment EOF
            {
             newCompositeNode(grammarAccess.getXConstantSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXConstantSLComment=ruleXConstantSLComment();

            state._fsp--;

             current =iv_ruleXConstantSLComment; 
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
    // $ANTLR end "entryRuleXConstantSLComment"


    // $ANTLR start "ruleXConstantSLComment"
    // InternalXContext.g:616:1: ruleXConstantSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXConstantSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXContext.g:622:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXContext.g:623:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXContext.g:623:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXContext.g:624:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXContext.g:624:3: ()
            // InternalXContext.g:625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstantSLCommentAccess().getConstantAction_0(),
            					current);
            			

            }

            // InternalXContext.g:631:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXContext.g:632:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXContext.g:632:4: (lv_name_1_0= RULE_ID )
            // InternalXContext.g:633:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXConstantSLCommentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXConstantSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXContext.g:649:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXContext.g:650:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXContext.g:650:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXContext.g:651:5: lv_comment_2_0= RULE_SL_COMMENT
            {
            lv_comment_2_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_2_0, grammarAccess.getXConstantSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXConstantSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_2_0,
            						"org.eclipse.xtext.common.Terminals.SL_COMMENT");
            				

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
    // $ANTLR end "ruleXConstantSLComment"


    // $ANTLR start "entryRuleXAxiom"
    // InternalXContext.g:671:1: entryRuleXAxiom returns [EObject current=null] : iv_ruleXAxiom= ruleXAxiom EOF ;
    public final EObject entryRuleXAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAxiom = null;


        try {
            // InternalXContext.g:671:47: (iv_ruleXAxiom= ruleXAxiom EOF )
            // InternalXContext.g:672:2: iv_ruleXAxiom= ruleXAxiom EOF
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
    // InternalXContext.g:678:1: ruleXAxiom returns [EObject current=null] : (this_XAxiomNoComment_0= ruleXAxiomNoComment | this_XAxiomMLComment_1= ruleXAxiomMLComment | this_XAxiomSLComment_2= ruleXAxiomSLComment ) ;
    public final EObject ruleXAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_XAxiomNoComment_0 = null;

        EObject this_XAxiomMLComment_1 = null;

        EObject this_XAxiomSLComment_2 = null;



        	enterRule();

        try {
            // InternalXContext.g:684:2: ( (this_XAxiomNoComment_0= ruleXAxiomNoComment | this_XAxiomMLComment_1= ruleXAxiomMLComment | this_XAxiomSLComment_2= ruleXAxiomSLComment ) )
            // InternalXContext.g:685:2: (this_XAxiomNoComment_0= ruleXAxiomNoComment | this_XAxiomMLComment_1= ruleXAxiomMLComment | this_XAxiomSLComment_2= ruleXAxiomSLComment )
            {
            // InternalXContext.g:685:2: (this_XAxiomNoComment_0= ruleXAxiomNoComment | this_XAxiomMLComment_1= ruleXAxiomMLComment | this_XAxiomSLComment_2= ruleXAxiomSLComment )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_XLABEL) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        int LA13_4 = input.LA(4);

                        if ( (LA13_4==EOF||LA13_4==RULE_ML_COMMENT||LA13_4==RULE_XLABEL||LA13_4==17) ) {
                            alt13=1;
                        }
                        else if ( (LA13_4==RULE_SL_COMMENT) ) {
                            alt13=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_SL_COMMENT:
                        {
                        alt13=3;
                        }
                        break;
                    case EOF:
                    case RULE_ML_COMMENT:
                    case RULE_XLABEL:
                    case 17:
                        {
                        alt13=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_ML_COMMENT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXContext.g:686:3: this_XAxiomNoComment_0= ruleXAxiomNoComment
                    {

                    			newCompositeNode(grammarAccess.getXAxiomAccess().getXAxiomNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XAxiomNoComment_0=ruleXAxiomNoComment();

                    state._fsp--;


                    			current = this_XAxiomNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:695:3: this_XAxiomMLComment_1= ruleXAxiomMLComment
                    {

                    			newCompositeNode(grammarAccess.getXAxiomAccess().getXAxiomMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XAxiomMLComment_1=ruleXAxiomMLComment();

                    state._fsp--;


                    			current = this_XAxiomMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:704:3: this_XAxiomSLComment_2= ruleXAxiomSLComment
                    {

                    			newCompositeNode(grammarAccess.getXAxiomAccess().getXAxiomSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XAxiomSLComment_2=ruleXAxiomSLComment();

                    state._fsp--;


                    			current = this_XAxiomSLComment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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


    // $ANTLR start "entryRuleXAxiomNoComment"
    // InternalXContext.g:716:1: entryRuleXAxiomNoComment returns [EObject current=null] : iv_ruleXAxiomNoComment= ruleXAxiomNoComment EOF ;
    public final EObject entryRuleXAxiomNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAxiomNoComment = null;


        try {
            // InternalXContext.g:716:56: (iv_ruleXAxiomNoComment= ruleXAxiomNoComment EOF )
            // InternalXContext.g:717:2: iv_ruleXAxiomNoComment= ruleXAxiomNoComment EOF
            {
             newCompositeNode(grammarAccess.getXAxiomNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXAxiomNoComment=ruleXAxiomNoComment();

            state._fsp--;

             current =iv_ruleXAxiomNoComment; 
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
    // $ANTLR end "entryRuleXAxiomNoComment"


    // $ANTLR start "ruleXAxiomNoComment"
    // InternalXContext.g:723:1: ruleXAxiomNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXAxiomNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;


        	enterRule();

        try {
            // InternalXContext.g:729:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXContext.g:730:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXContext.g:730:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXContext.g:731:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXContext.g:731:3: ()
            // InternalXContext.g:732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXAxiomNoCommentAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalXContext.g:738:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXContext.g:739:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXContext.g:739:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXContext.g:740:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXAxiomNoCommentAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXAxiomNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.eventb.xtext.context.XContext.XLABEL");
            				

            }


            }

            // InternalXContext.g:756:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXContext.g:757:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXContext.g:757:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXContext.g:758:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_predicate_2_0, grammarAccess.getXAxiomNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXAxiomNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXContext.g:774:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXContext.g:775:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXContext.g:775:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXContext.g:776:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXAxiomNoCommentAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXAxiomNoCommentRule());
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
    // $ANTLR end "ruleXAxiomNoComment"


    // $ANTLR start "entryRuleXAxiomMLComment"
    // InternalXContext.g:792:1: entryRuleXAxiomMLComment returns [EObject current=null] : iv_ruleXAxiomMLComment= ruleXAxiomMLComment EOF ;
    public final EObject entryRuleXAxiomMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAxiomMLComment = null;


        try {
            // InternalXContext.g:792:56: (iv_ruleXAxiomMLComment= ruleXAxiomMLComment EOF )
            // InternalXContext.g:793:2: iv_ruleXAxiomMLComment= ruleXAxiomMLComment EOF
            {
             newCompositeNode(grammarAccess.getXAxiomMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXAxiomMLComment=ruleXAxiomMLComment();

            state._fsp--;

             current =iv_ruleXAxiomMLComment; 
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
    // $ANTLR end "entryRuleXAxiomMLComment"


    // $ANTLR start "ruleXAxiomMLComment"
    // InternalXContext.g:799:1: ruleXAxiomMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) ;
    public final EObject ruleXAxiomMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_predicate_3_0=null;
        Token lv_theorem_4_0=null;


        	enterRule();

        try {
            // InternalXContext.g:805:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) )
            // InternalXContext.g:806:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            {
            // InternalXContext.g:806:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            // InternalXContext.g:807:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )?
            {
            // InternalXContext.g:807:3: ()
            // InternalXContext.g:808:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXAxiomMLCommentAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalXContext.g:814:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXContext.g:815:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXContext.g:815:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXContext.g:816:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_15); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXAxiomMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXAxiomMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXContext.g:832:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXContext.g:833:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXContext.g:833:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXContext.g:834:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXAxiomMLCommentAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXAxiomMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.eventb.xtext.context.XContext.XLABEL");
            				

            }


            }

            // InternalXContext.g:850:3: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalXContext.g:851:4: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalXContext.g:851:4: (lv_predicate_3_0= RULE_STRING )
            // InternalXContext.g:852:5: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_predicate_3_0, grammarAccess.getXAxiomMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXAxiomMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXContext.g:868:3: ( (lv_theorem_4_0= 'theorem' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXContext.g:869:4: (lv_theorem_4_0= 'theorem' )
                    {
                    // InternalXContext.g:869:4: (lv_theorem_4_0= 'theorem' )
                    // InternalXContext.g:870:5: lv_theorem_4_0= 'theorem'
                    {
                    lv_theorem_4_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_theorem_4_0, grammarAccess.getXAxiomMLCommentAccess().getTheoremTheoremKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXAxiomMLCommentRule());
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
    // $ANTLR end "ruleXAxiomMLComment"


    // $ANTLR start "entryRuleXAxiomSLComment"
    // InternalXContext.g:886:1: entryRuleXAxiomSLComment returns [EObject current=null] : iv_ruleXAxiomSLComment= ruleXAxiomSLComment EOF ;
    public final EObject entryRuleXAxiomSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAxiomSLComment = null;


        try {
            // InternalXContext.g:886:56: (iv_ruleXAxiomSLComment= ruleXAxiomSLComment EOF )
            // InternalXContext.g:887:2: iv_ruleXAxiomSLComment= ruleXAxiomSLComment EOF
            {
             newCompositeNode(grammarAccess.getXAxiomSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXAxiomSLComment=ruleXAxiomSLComment();

            state._fsp--;

             current =iv_ruleXAxiomSLComment; 
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
    // $ANTLR end "entryRuleXAxiomSLComment"


    // $ANTLR start "ruleXAxiomSLComment"
    // InternalXContext.g:893:1: ruleXAxiomSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXAxiomSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;
        Token lv_comment_4_0=null;


        	enterRule();

        try {
            // InternalXContext.g:899:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            // InternalXContext.g:900:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXContext.g:900:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            // InternalXContext.g:901:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            {
            // InternalXContext.g:901:3: ()
            // InternalXContext.g:902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXAxiomSLCommentAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalXContext.g:908:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXContext.g:909:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXContext.g:909:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXContext.g:910:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXAxiomSLCommentAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXAxiomSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.eventb.xtext.context.XContext.XLABEL");
            				

            }


            }

            // InternalXContext.g:926:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXContext.g:927:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXContext.g:927:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXContext.g:928:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_predicate_2_0, grammarAccess.getXAxiomSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXAxiomSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXContext.g:944:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXContext.g:945:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXContext.g:945:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXContext.g:946:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXAxiomSLCommentAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXAxiomSLCommentRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXContext.g:958:3: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            // InternalXContext.g:959:4: (lv_comment_4_0= RULE_SL_COMMENT )
            {
            // InternalXContext.g:959:4: (lv_comment_4_0= RULE_SL_COMMENT )
            // InternalXContext.g:960:5: lv_comment_4_0= RULE_SL_COMMENT
            {
            lv_comment_4_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_4_0, grammarAccess.getXAxiomSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXAxiomSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_4_0,
            						"org.eclipse.xtext.common.Terminals.SL_COMMENT");
            				

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
    // $ANTLR end "ruleXAxiomSLComment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020090L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040020L});

}