package ac.soton.xeventb.xmachine.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'end'", "'includes'", "'to'", "'as'", "'.'", "'theorem'", "'extended'", "'with'", "'begin'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'ordinary'", "'convergent'", "'anticipated'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int RULE_XLABEL=7;
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

        public InternalXMachineParser(TokenStream input, XMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Machine";
       	}

       	@Override
       	protected XMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMachine"
    // InternalXMachine.g:65:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalXMachine.g:65:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalXMachine.g:66:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalXMachine.g:72:1: ruleMachine returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? otherlv_18= 'end' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        EObject lv_extensions_4_0 = null;

        EObject lv_variables_10_0 = null;

        EObject lv_invariants_12_0 = null;

        EObject lv_variant_14_0 = null;

        EObject lv_events_16_0 = null;

        EObject lv_events_17_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:78:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? otherlv_18= 'end' ) )
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? otherlv_18= 'end' )
            {
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? otherlv_18= 'end' )
            // InternalXMachine.g:80:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? otherlv_18= 'end'
            {
            // InternalXMachine.g:80:3: ()
            // InternalXMachine.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMachineAccess().getMachineAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:87:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ML_COMMENT && LA2_0<=RULE_SL_COMMENT)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:88:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:88:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:89:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:89:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
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
                            // InternalXMachine.g:90:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getMachineRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:105:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getMachineRule());
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

            			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getMachineKeyword_2());
            		
            // InternalXMachine.g:126:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:127:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:127:4: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:128:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:144:3: ( (lv_extensions_4_0= ruleMIncludes ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXMachine.g:145:4: (lv_extensions_4_0= ruleMIncludes )
            	    {
            	    // InternalXMachine.g:145:4: (lv_extensions_4_0= ruleMIncludes )
            	    // InternalXMachine.g:146:5: lv_extensions_4_0= ruleMIncludes
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_extensions_4_0=ruleMIncludes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_4_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.MIncludes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalXMachine.g:163:3: (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:164:4: otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRefinesKeyword_5_0());
                    			
                    // InternalXMachine.g:168:4: ( (otherlv_6= RULE_ID ) )
                    // InternalXMachine.g:169:5: (otherlv_6= RULE_ID )
                    {
                    // InternalXMachine.g:169:5: (otherlv_6= RULE_ID )
                    // InternalXMachine.g:170:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMachineRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getRefinesMachineCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:182:3: (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:183:4: otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getSeesKeyword_6_0());
                    			
                    // InternalXMachine.g:187:4: ( (otherlv_8= RULE_ID ) )+
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
                    	    // InternalXMachine.g:188:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:188:5: (otherlv_8= RULE_ID )
                    	    // InternalXMachine.g:189:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMachineRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getSeesContextCrossReference_6_1_0());
                    	    					

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

            // InternalXMachine.g:201:3: (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:202:4: otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getVariablesKeyword_7_0());
                    			
                    // InternalXMachine.g:206:4: ( (lv_variables_10_0= ruleXVariable ) )+
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
                    	    // InternalXMachine.g:207:5: (lv_variables_10_0= ruleXVariable )
                    	    {
                    	    // InternalXMachine.g:207:5: (lv_variables_10_0= ruleXVariable )
                    	    // InternalXMachine.g:208:6: lv_variables_10_0= ruleXVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_variables_10_0=ruleXVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_10_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XVariable");
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

            // InternalXMachine.g:226:3: (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:227:4: otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getInvariantsKeyword_8_0());
                    			
                    // InternalXMachine.g:231:4: ( (lv_invariants_12_0= ruleXInvariant ) )+
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
                    	    // InternalXMachine.g:232:5: (lv_invariants_12_0= ruleXInvariant )
                    	    {
                    	    // InternalXMachine.g:232:5: (lv_invariants_12_0= ruleXInvariant )
                    	    // InternalXMachine.g:233:6: lv_invariants_12_0= ruleXInvariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_invariants_12_0=ruleXInvariant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"invariants",
                    	    							lv_invariants_12_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XInvariant");
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

            // InternalXMachine.g:251:3: (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:252:4: otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) )
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getMachineAccess().getVariantKeyword_9_0());
                    			
                    // InternalXMachine.g:256:4: ( (lv_variant_14_0= ruleXVariant ) )
                    // InternalXMachine.g:257:5: (lv_variant_14_0= ruleXVariant )
                    {
                    // InternalXMachine.g:257:5: (lv_variant_14_0= ruleXVariant )
                    // InternalXMachine.g:258:6: lv_variant_14_0= ruleXVariant
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_variant_14_0=ruleXVariant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						set(
                    							current,
                    							"variant",
                    							lv_variant_14_0,
                    							"ac.soton.xeventb.xmachine.XMachine.XVariant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:276:3: (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:277:4: otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )*
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getMachineAccess().getEventsKeyword_10_0());
                    			
                    // InternalXMachine.g:281:4: ( (lv_events_16_0= ruleXEvent ) )
                    // InternalXMachine.g:282:5: (lv_events_16_0= ruleXEvent )
                    {
                    // InternalXMachine.g:282:5: (lv_events_16_0= ruleXEvent )
                    // InternalXMachine.g:283:6: lv_events_16_0= ruleXEvent
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_events_16_0=ruleXEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_16_0,
                    							"ac.soton.xeventb.xmachine.XMachine.XEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMachine.g:300:4: ( (lv_events_17_0= ruleXEvent ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ML_COMMENT||LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalXMachine.g:301:5: (lv_events_17_0= ruleXEvent )
                    	    {
                    	    // InternalXMachine.g:301:5: (lv_events_17_0= ruleXEvent )
                    	    // InternalXMachine.g:302:6: lv_events_17_0= ruleXEvent
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_events_17_0=ruleXEvent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"events",
                    	    							lv_events_17_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XEvent");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getMachineAccess().getEndKeyword_11());
            		

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleMIncludes"
    // InternalXMachine.g:328:1: entryRuleMIncludes returns [EObject current=null] : iv_ruleMIncludes= ruleMIncludes EOF ;
    public final EObject entryRuleMIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIncludes = null;


        try {
            // InternalXMachine.g:328:50: (iv_ruleMIncludes= ruleMIncludes EOF )
            // InternalXMachine.g:329:2: iv_ruleMIncludes= ruleMIncludes EOF
            {
             newCompositeNode(grammarAccess.getMIncludesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMIncludes=ruleMIncludes();

            state._fsp--;

             current =iv_ruleMIncludes; 
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
    // $ANTLR end "entryRuleMIncludes"


    // $ANTLR start "ruleMIncludes"
    // InternalXMachine.g:335:1: ruleMIncludes returns [EObject current=null] : ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) ;
    public final EObject ruleMIncludes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_prefixes_6_0=null;
        Token lv_prefixes_7_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:341:2: ( ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) )
            // InternalXMachine.g:342:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            {
            // InternalXMachine.g:342:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            // InternalXMachine.g:343:3: () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            {
            // InternalXMachine.g:343:3: ()
            // InternalXMachine.g:344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMIncludesAccess().getMachineInclusionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:350:3: (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:351:4: otherlv_1= 'includes' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0());
            			
            // InternalXMachine.g:355:4: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:356:5: ( ruleQualifiedName )
            {
            // InternalXMachine.g:356:5: ( ruleQualifiedName )
            // InternalXMachine.g:357:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getMIncludesRule());
            						}
            					

            						newCompositeNode(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0());
            					
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalXMachine.g:372:3: (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:373:4: otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getMIncludesAccess().getToKeyword_2_0());
                    			
                    // InternalXMachine.g:377:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXMachine.g:378:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXMachine.g:378:5: (otherlv_4= RULE_ID )
                    // InternalXMachine.g:379:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMIncludesRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_4, grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:391:3: (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:392:4: otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getMIncludesAccess().getAsKeyword_3_0());
                    			
                    // InternalXMachine.g:396:4: ( (lv_prefixes_6_0= RULE_ID ) )
                    // InternalXMachine.g:397:5: (lv_prefixes_6_0= RULE_ID )
                    {
                    // InternalXMachine.g:397:5: (lv_prefixes_6_0= RULE_ID )
                    // InternalXMachine.g:398:6: lv_prefixes_6_0= RULE_ID
                    {
                    lv_prefixes_6_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_prefixes_6_0, grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMIncludesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"prefixes",
                    							lv_prefixes_6_0,
                    							"ac.soton.xeventb.xmachine.XMachine.ID");
                    					

                    }


                    }

                    // InternalXMachine.g:414:4: ( (lv_prefixes_7_0= RULE_ID ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalXMachine.g:415:5: (lv_prefixes_7_0= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:415:5: (lv_prefixes_7_0= RULE_ID )
                    	    // InternalXMachine.g:416:6: lv_prefixes_7_0= RULE_ID
                    	    {
                    	    lv_prefixes_7_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	    						newLeafNode(lv_prefixes_7_0, grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMIncludesRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"prefixes",
                    	    							lv_prefixes_7_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.ID");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


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
    // $ANTLR end "ruleMIncludes"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXMachine.g:437:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXMachine.g:437:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXMachine.g:438:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXMachine.g:444:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:450:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalXMachine.g:451:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalXMachine.g:451:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalXMachine.g:452:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXMachine.g:459:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:460:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,23,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleXVariable"
    // InternalXMachine.g:477:1: entryRuleXVariable returns [EObject current=null] : iv_ruleXVariable= ruleXVariable EOF ;
    public final EObject entryRuleXVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariable = null;


        try {
            // InternalXMachine.g:477:50: (iv_ruleXVariable= ruleXVariable EOF )
            // InternalXMachine.g:478:2: iv_ruleXVariable= ruleXVariable EOF
            {
             newCompositeNode(grammarAccess.getXVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXVariable=ruleXVariable();

            state._fsp--;

             current =iv_ruleXVariable; 
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
    // $ANTLR end "entryRuleXVariable"


    // $ANTLR start "ruleXVariable"
    // InternalXMachine.g:484:1: ruleXVariable returns [EObject current=null] : (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment ) ;
    public final EObject ruleXVariable() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableNoComment_0 = null;

        EObject this_XVariableMLComment_1 = null;

        EObject this_XVariableSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:490:2: ( (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment ) )
            // InternalXMachine.g:491:2: (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment )
            {
            // InternalXMachine.g:491:2: (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||LA18_1==RULE_ML_COMMENT||LA18_1==RULE_ID||(LA18_1>=16 && LA18_1<=19)) ) {
                    alt18=1;
                }
                else if ( (LA18_1==RULE_SL_COMMENT) ) {
                    alt18=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==RULE_ML_COMMENT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:492:3: this_XVariableNoComment_0= ruleXVariableNoComment
                    {

                    			newCompositeNode(grammarAccess.getXVariableAccess().getXVariableNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XVariableNoComment_0=ruleXVariableNoComment();

                    state._fsp--;


                    			current = this_XVariableNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:501:3: this_XVariableMLComment_1= ruleXVariableMLComment
                    {

                    			newCompositeNode(grammarAccess.getXVariableAccess().getXVariableMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XVariableMLComment_1=ruleXVariableMLComment();

                    state._fsp--;


                    			current = this_XVariableMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:510:3: this_XVariableSLComment_2= ruleXVariableSLComment
                    {

                    			newCompositeNode(grammarAccess.getXVariableAccess().getXVariableSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XVariableSLComment_2=ruleXVariableSLComment();

                    state._fsp--;


                    			current = this_XVariableSLComment_2;
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
    // $ANTLR end "ruleXVariable"


    // $ANTLR start "entryRuleXVariableNoComment"
    // InternalXMachine.g:522:1: entryRuleXVariableNoComment returns [EObject current=null] : iv_ruleXVariableNoComment= ruleXVariableNoComment EOF ;
    public final EObject entryRuleXVariableNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableNoComment = null;


        try {
            // InternalXMachine.g:522:59: (iv_ruleXVariableNoComment= ruleXVariableNoComment EOF )
            // InternalXMachine.g:523:2: iv_ruleXVariableNoComment= ruleXVariableNoComment EOF
            {
             newCompositeNode(grammarAccess.getXVariableNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXVariableNoComment=ruleXVariableNoComment();

            state._fsp--;

             current =iv_ruleXVariableNoComment; 
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
    // $ANTLR end "entryRuleXVariableNoComment"


    // $ANTLR start "ruleXVariableNoComment"
    // InternalXMachine.g:529:1: ruleXVariableNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariableNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:535:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:536:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:536:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:537:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:537:3: ()
            // InternalXMachine.g:538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableNoCommentAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:544:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:545:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:545:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:546:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXVariableNoCommentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariableNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

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
    // $ANTLR end "ruleXVariableNoComment"


    // $ANTLR start "entryRuleXVariableMLComment"
    // InternalXMachine.g:566:1: entryRuleXVariableMLComment returns [EObject current=null] : iv_ruleXVariableMLComment= ruleXVariableMLComment EOF ;
    public final EObject entryRuleXVariableMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableMLComment = null;


        try {
            // InternalXMachine.g:566:59: (iv_ruleXVariableMLComment= ruleXVariableMLComment EOF )
            // InternalXMachine.g:567:2: iv_ruleXVariableMLComment= ruleXVariableMLComment EOF
            {
             newCompositeNode(grammarAccess.getXVariableMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXVariableMLComment=ruleXVariableMLComment();

            state._fsp--;

             current =iv_ruleXVariableMLComment; 
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
    // $ANTLR end "entryRuleXVariableMLComment"


    // $ANTLR start "ruleXVariableMLComment"
    // InternalXMachine.g:573:1: ruleXVariableMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariableMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:579:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:580:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:580:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:581:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:581:3: ()
            // InternalXMachine.g:582:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableMLCommentAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:588:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:589:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:589:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:590:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_4); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXVariableMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariableMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXMachine.g:606:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:607:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:607:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:608:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXVariableMLCommentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariableMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

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
    // $ANTLR end "ruleXVariableMLComment"


    // $ANTLR start "entryRuleXVariableSLComment"
    // InternalXMachine.g:628:1: entryRuleXVariableSLComment returns [EObject current=null] : iv_ruleXVariableSLComment= ruleXVariableSLComment EOF ;
    public final EObject entryRuleXVariableSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableSLComment = null;


        try {
            // InternalXMachine.g:628:59: (iv_ruleXVariableSLComment= ruleXVariableSLComment EOF )
            // InternalXMachine.g:629:2: iv_ruleXVariableSLComment= ruleXVariableSLComment EOF
            {
             newCompositeNode(grammarAccess.getXVariableSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXVariableSLComment=ruleXVariableSLComment();

            state._fsp--;

             current =iv_ruleXVariableSLComment; 
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
    // $ANTLR end "entryRuleXVariableSLComment"


    // $ANTLR start "ruleXVariableSLComment"
    // InternalXMachine.g:635:1: ruleXVariableSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXVariableSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:641:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:642:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:642:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:643:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:643:3: ()
            // InternalXMachine.g:644:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableSLCommentAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:650:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:651:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:651:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:652:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXVariableSLCommentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariableSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:668:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:669:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:669:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:670:5: lv_comment_2_0= RULE_SL_COMMENT
            {
            lv_comment_2_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_2_0, grammarAccess.getXVariableSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariableSLCommentRule());
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
    // $ANTLR end "ruleXVariableSLComment"


    // $ANTLR start "entryRuleXInvariant"
    // InternalXMachine.g:690:1: entryRuleXInvariant returns [EObject current=null] : iv_ruleXInvariant= ruleXInvariant EOF ;
    public final EObject entryRuleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariant = null;


        try {
            // InternalXMachine.g:690:51: (iv_ruleXInvariant= ruleXInvariant EOF )
            // InternalXMachine.g:691:2: iv_ruleXInvariant= ruleXInvariant EOF
            {
             newCompositeNode(grammarAccess.getXInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXInvariant=ruleXInvariant();

            state._fsp--;

             current =iv_ruleXInvariant; 
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
    // $ANTLR end "entryRuleXInvariant"


    // $ANTLR start "ruleXInvariant"
    // InternalXMachine.g:697:1: ruleXInvariant returns [EObject current=null] : (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment ) ;
    public final EObject ruleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject this_XInvariantNoComment_0 = null;

        EObject this_XInvariantMLComment_1 = null;

        EObject this_XInvariantSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:703:2: ( (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment ) )
            // InternalXMachine.g:704:2: (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment )
            {
            // InternalXMachine.g:704:2: (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_XLABEL) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        int LA19_4 = input.LA(4);

                        if ( (LA19_4==RULE_SL_COMMENT) ) {
                            alt19=3;
                        }
                        else if ( (LA19_4==EOF||LA19_4==RULE_ML_COMMENT||LA19_4==RULE_XLABEL||(LA19_4>=17 && LA19_4<=19)) ) {
                            alt19=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_SL_COMMENT:
                        {
                        alt19=3;
                        }
                        break;
                    case EOF:
                    case RULE_ML_COMMENT:
                    case RULE_XLABEL:
                    case 17:
                    case 18:
                    case 19:
                        {
                        alt19=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==RULE_ML_COMMENT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:705:3: this_XInvariantNoComment_0= ruleXInvariantNoComment
                    {

                    			newCompositeNode(grammarAccess.getXInvariantAccess().getXInvariantNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XInvariantNoComment_0=ruleXInvariantNoComment();

                    state._fsp--;


                    			current = this_XInvariantNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:714:3: this_XInvariantMLComment_1= ruleXInvariantMLComment
                    {

                    			newCompositeNode(grammarAccess.getXInvariantAccess().getXInvariantMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XInvariantMLComment_1=ruleXInvariantMLComment();

                    state._fsp--;


                    			current = this_XInvariantMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:723:3: this_XInvariantSLComment_2= ruleXInvariantSLComment
                    {

                    			newCompositeNode(grammarAccess.getXInvariantAccess().getXInvariantSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XInvariantSLComment_2=ruleXInvariantSLComment();

                    state._fsp--;


                    			current = this_XInvariantSLComment_2;
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
    // $ANTLR end "ruleXInvariant"


    // $ANTLR start "entryRuleXInvariantNoComment"
    // InternalXMachine.g:735:1: entryRuleXInvariantNoComment returns [EObject current=null] : iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF ;
    public final EObject entryRuleXInvariantNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantNoComment = null;


        try {
            // InternalXMachine.g:735:60: (iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF )
            // InternalXMachine.g:736:2: iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF
            {
             newCompositeNode(grammarAccess.getXInvariantNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXInvariantNoComment=ruleXInvariantNoComment();

            state._fsp--;

             current =iv_ruleXInvariantNoComment; 
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
    // $ANTLR end "entryRuleXInvariantNoComment"


    // $ANTLR start "ruleXInvariantNoComment"
    // InternalXMachine.g:742:1: ruleXInvariantNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariantNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:748:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:749:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:749:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:750:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:750:3: ()
            // InternalXMachine.g:751:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantNoCommentAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:757:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:758:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:758:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:759:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXInvariantNoCommentAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:775:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:776:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:776:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:777:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXInvariantNoCommentAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXInvariantNoCommentRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:794:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:795:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:795:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:796:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXInvariantNoCommentAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXInvariantNoCommentRule());
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
    // $ANTLR end "ruleXInvariantNoComment"


    // $ANTLR start "entryRuleXInvariantMLComment"
    // InternalXMachine.g:812:1: entryRuleXInvariantMLComment returns [EObject current=null] : iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF ;
    public final EObject entryRuleXInvariantMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantMLComment = null;


        try {
            // InternalXMachine.g:812:60: (iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF )
            // InternalXMachine.g:813:2: iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF
            {
             newCompositeNode(grammarAccess.getXInvariantMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXInvariantMLComment=ruleXInvariantMLComment();

            state._fsp--;

             current =iv_ruleXInvariantMLComment; 
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
    // $ANTLR end "entryRuleXInvariantMLComment"


    // $ANTLR start "ruleXInvariantMLComment"
    // InternalXMachine.g:819:1: ruleXInvariantMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariantMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_theorem_4_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:825:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) )
            // InternalXMachine.g:826:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:826:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            // InternalXMachine.g:827:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ( (lv_theorem_4_0= 'theorem' ) )?
            {
            // InternalXMachine.g:827:3: ()
            // InternalXMachine.g:828:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantMLCommentAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:834:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:835:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:835:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:836:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_22); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXInvariantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXMachine.g:852:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:853:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:853:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:854:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXInvariantMLCommentAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:870:3: ( (lv_predicate_3_0= ruleXPredicate ) )
            // InternalXMachine.g:871:4: (lv_predicate_3_0= ruleXPredicate )
            {
            // InternalXMachine.g:871:4: (lv_predicate_3_0= ruleXPredicate )
            // InternalXMachine.g:872:5: lv_predicate_3_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXInvariantMLCommentAccess().getPredicateXPredicateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_predicate_3_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXInvariantMLCommentRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:889:3: ( (lv_theorem_4_0= 'theorem' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:890:4: (lv_theorem_4_0= 'theorem' )
                    {
                    // InternalXMachine.g:890:4: (lv_theorem_4_0= 'theorem' )
                    // InternalXMachine.g:891:5: lv_theorem_4_0= 'theorem'
                    {
                    lv_theorem_4_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_theorem_4_0, grammarAccess.getXInvariantMLCommentAccess().getTheoremTheoremKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXInvariantMLCommentRule());
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
    // $ANTLR end "ruleXInvariantMLComment"


    // $ANTLR start "entryRuleXInvariantSLComment"
    // InternalXMachine.g:907:1: entryRuleXInvariantSLComment returns [EObject current=null] : iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF ;
    public final EObject entryRuleXInvariantSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantSLComment = null;


        try {
            // InternalXMachine.g:907:60: (iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF )
            // InternalXMachine.g:908:2: iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF
            {
             newCompositeNode(grammarAccess.getXInvariantSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXInvariantSLComment=ruleXInvariantSLComment();

            state._fsp--;

             current =iv_ruleXInvariantSLComment; 
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
    // $ANTLR end "entryRuleXInvariantSLComment"


    // $ANTLR start "ruleXInvariantSLComment"
    // InternalXMachine.g:914:1: ruleXInvariantSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXInvariantSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        Token lv_comment_4_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:920:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:921:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:921:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:922:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:922:3: ()
            // InternalXMachine.g:923:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantSLCommentAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:929:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:930:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:930:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:931:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXInvariantSLCommentAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:947:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:948:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:948:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:949:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXInvariantSLCommentAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXInvariantSLCommentRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:966:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:967:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:967:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:968:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,24,FOLLOW_19); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXInvariantSLCommentAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXInvariantSLCommentRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:980:3: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:981:4: (lv_comment_4_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:981:4: (lv_comment_4_0= RULE_SL_COMMENT )
            // InternalXMachine.g:982:5: lv_comment_4_0= RULE_SL_COMMENT
            {
            lv_comment_4_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_4_0, grammarAccess.getXInvariantSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantSLCommentRule());
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
    // $ANTLR end "ruleXInvariantSLComment"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:1002:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:1002:49: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:1003:2: iv_ruleXVariant= ruleXVariant EOF
            {
             newCompositeNode(grammarAccess.getXVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXVariant=ruleXVariant();

            state._fsp--;

             current =iv_ruleXVariant; 
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
    // $ANTLR end "entryRuleXVariant"


    // $ANTLR start "ruleXVariant"
    // InternalXMachine.g:1009:1: ruleXVariant returns [EObject current=null] : (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        EObject this_XVariantNoComment_0 = null;

        EObject this_XVariantMLComment_1 = null;

        EObject this_XVariantSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1015:2: ( (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment ) )
            // InternalXMachine.g:1016:2: (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment )
            {
            // InternalXMachine.g:1016:2: (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||(LA23_1>=18 && LA23_1<=19)) ) {
                    alt23=1;
                }
                else if ( (LA23_1==RULE_SL_COMMENT) ) {
                    alt23=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_ML_COMMENT) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:1017:3: this_XVariantNoComment_0= ruleXVariantNoComment
                    {

                    			newCompositeNode(grammarAccess.getXVariantAccess().getXVariantNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XVariantNoComment_0=ruleXVariantNoComment();

                    state._fsp--;


                    			current = this_XVariantNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1026:3: this_XVariantMLComment_1= ruleXVariantMLComment
                    {

                    			newCompositeNode(grammarAccess.getXVariantAccess().getXVariantMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XVariantMLComment_1=ruleXVariantMLComment();

                    state._fsp--;


                    			current = this_XVariantMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1035:3: this_XVariantSLComment_2= ruleXVariantSLComment
                    {

                    			newCompositeNode(grammarAccess.getXVariantAccess().getXVariantSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XVariantSLComment_2=ruleXVariantSLComment();

                    state._fsp--;


                    			current = this_XVariantSLComment_2;
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
    // $ANTLR end "ruleXVariant"


    // $ANTLR start "entryRuleXVariantNoComment"
    // InternalXMachine.g:1047:1: entryRuleXVariantNoComment returns [EObject current=null] : iv_ruleXVariantNoComment= ruleXVariantNoComment EOF ;
    public final EObject entryRuleXVariantNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantNoComment = null;


        try {
            // InternalXMachine.g:1047:58: (iv_ruleXVariantNoComment= ruleXVariantNoComment EOF )
            // InternalXMachine.g:1048:2: iv_ruleXVariantNoComment= ruleXVariantNoComment EOF
            {
             newCompositeNode(grammarAccess.getXVariantNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXVariantNoComment=ruleXVariantNoComment();

            state._fsp--;

             current =iv_ruleXVariantNoComment; 
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
    // $ANTLR end "entryRuleXVariantNoComment"


    // $ANTLR start "ruleXVariantNoComment"
    // InternalXMachine.g:1054:1: ruleXVariantNoComment returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXVariantNoComment() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1060:2: ( ( () ( (lv_expression_1_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:1061:2: ( () ( (lv_expression_1_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:1061:2: ( () ( (lv_expression_1_0= ruleXPredicate ) ) )
            // InternalXMachine.g:1062:3: () ( (lv_expression_1_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:1062:3: ()
            // InternalXMachine.g:1063:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantNoCommentAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1069:3: ( (lv_expression_1_0= ruleXPredicate ) )
            // InternalXMachine.g:1070:4: (lv_expression_1_0= ruleXPredicate )
            {
            // InternalXMachine.g:1070:4: (lv_expression_1_0= ruleXPredicate )
            // InternalXMachine.g:1071:5: lv_expression_1_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXVariantNoCommentAccess().getExpressionXPredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXVariantNoCommentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleXVariantNoComment"


    // $ANTLR start "entryRuleXVariantMLComment"
    // InternalXMachine.g:1092:1: entryRuleXVariantMLComment returns [EObject current=null] : iv_ruleXVariantMLComment= ruleXVariantMLComment EOF ;
    public final EObject entryRuleXVariantMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantMLComment = null;


        try {
            // InternalXMachine.g:1092:58: (iv_ruleXVariantMLComment= ruleXVariantMLComment EOF )
            // InternalXMachine.g:1093:2: iv_ruleXVariantMLComment= ruleXVariantMLComment EOF
            {
             newCompositeNode(grammarAccess.getXVariantMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXVariantMLComment=ruleXVariantMLComment();

            state._fsp--;

             current =iv_ruleXVariantMLComment; 
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
    // $ANTLR end "entryRuleXVariantMLComment"


    // $ANTLR start "ruleXVariantMLComment"
    // InternalXMachine.g:1099:1: ruleXVariantMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXVariantMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        AntlrDatatypeRuleToken lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1105:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:1106:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:1106:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= ruleXPredicate ) ) )
            // InternalXMachine.g:1107:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:1107:3: ()
            // InternalXMachine.g:1108:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantMLCommentAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1114:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:1115:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:1115:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:1116:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_20); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXVariantMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariantMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXMachine.g:1132:3: ( (lv_expression_2_0= ruleXPredicate ) )
            // InternalXMachine.g:1133:4: (lv_expression_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:1133:4: (lv_expression_2_0= ruleXPredicate )
            // InternalXMachine.g:1134:5: lv_expression_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXVariantMLCommentAccess().getExpressionXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXVariantMLCommentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleXVariantMLComment"


    // $ANTLR start "entryRuleXVariantSLComment"
    // InternalXMachine.g:1155:1: entryRuleXVariantSLComment returns [EObject current=null] : iv_ruleXVariantSLComment= ruleXVariantSLComment EOF ;
    public final EObject entryRuleXVariantSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantSLComment = null;


        try {
            // InternalXMachine.g:1155:58: (iv_ruleXVariantSLComment= ruleXVariantSLComment EOF )
            // InternalXMachine.g:1156:2: iv_ruleXVariantSLComment= ruleXVariantSLComment EOF
            {
             newCompositeNode(grammarAccess.getXVariantSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXVariantSLComment=ruleXVariantSLComment();

            state._fsp--;

             current =iv_ruleXVariantSLComment; 
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
    // $ANTLR end "entryRuleXVariantSLComment"


    // $ANTLR start "ruleXVariantSLComment"
    // InternalXMachine.g:1162:1: ruleXVariantSLComment returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleXPredicate ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXVariantSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_2_0=null;
        AntlrDatatypeRuleToken lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1168:2: ( ( () ( (lv_expression_1_0= ruleXPredicate ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:1169:2: ( () ( (lv_expression_1_0= ruleXPredicate ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:1169:2: ( () ( (lv_expression_1_0= ruleXPredicate ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:1170:3: () ( (lv_expression_1_0= ruleXPredicate ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:1170:3: ()
            // InternalXMachine.g:1171:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantSLCommentAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1177:3: ( (lv_expression_1_0= ruleXPredicate ) )
            // InternalXMachine.g:1178:4: (lv_expression_1_0= ruleXPredicate )
            {
            // InternalXMachine.g:1178:4: (lv_expression_1_0= ruleXPredicate )
            // InternalXMachine.g:1179:5: lv_expression_1_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXVariantSLCommentAccess().getExpressionXPredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_expression_1_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXVariantSLCommentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:1196:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:1197:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:1197:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:1198:5: lv_comment_2_0= RULE_SL_COMMENT
            {
            lv_comment_2_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_2_0, grammarAccess.getXVariantSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariantSLCommentRule());
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
    // $ANTLR end "ruleXVariantSLComment"


    // $ANTLR start "entryRuleXEvent"
    // InternalXMachine.g:1218:1: entryRuleXEvent returns [EObject current=null] : iv_ruleXEvent= ruleXEvent EOF ;
    public final EObject entryRuleXEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEvent = null;


        try {
            // InternalXMachine.g:1218:47: (iv_ruleXEvent= ruleXEvent EOF )
            // InternalXMachine.g:1219:2: iv_ruleXEvent= ruleXEvent EOF
            {
             newCompositeNode(grammarAccess.getXEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXEvent=ruleXEvent();

            state._fsp--;

             current =iv_ruleXEvent; 
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
    // $ANTLR end "entryRuleXEvent"


    // $ANTLR start "ruleXEvent"
    // InternalXMachine.g:1225:1: ruleXEvent returns [EObject current=null] : (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment ) ;
    public final EObject ruleXEvent() throws RecognitionException {
        EObject current = null;

        EObject this_XEventNoComment_0 = null;

        EObject this_XEventMLComment_1 = null;

        EObject this_XEventSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1231:2: ( (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment ) )
            // InternalXMachine.g:1232:2: (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment )
            {
            // InternalXMachine.g:1232:2: (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:1233:3: this_XEventNoComment_0= ruleXEventNoComment
                    {

                    			newCompositeNode(grammarAccess.getXEventAccess().getXEventNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XEventNoComment_0=ruleXEventNoComment();

                    state._fsp--;


                    			current = this_XEventNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1242:3: this_XEventMLComment_1= ruleXEventMLComment
                    {

                    			newCompositeNode(grammarAccess.getXEventAccess().getXEventMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XEventMLComment_1=ruleXEventMLComment();

                    state._fsp--;


                    			current = this_XEventMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1251:3: this_XEventSLComment_2= ruleXEventSLComment
                    {

                    			newCompositeNode(grammarAccess.getXEventAccess().getXEventSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XEventSLComment_2=ruleXEventSLComment();

                    state._fsp--;


                    			current = this_XEventSLComment_2;
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
    // $ANTLR end "ruleXEvent"


    // $ANTLR start "entryRuleXEventNoComment"
    // InternalXMachine.g:1263:1: entryRuleXEventNoComment returns [EObject current=null] : iv_ruleXEventNoComment= ruleXEventNoComment EOF ;
    public final EObject entryRuleXEventNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEventNoComment = null;


        try {
            // InternalXMachine.g:1263:56: (iv_ruleXEventNoComment= ruleXEventNoComment EOF )
            // InternalXMachine.g:1264:2: iv_ruleXEventNoComment= ruleXEventNoComment EOF
            {
             newCompositeNode(grammarAccess.getXEventNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXEventNoComment=ruleXEventNoComment();

            state._fsp--;

             current =iv_ruleXEventNoComment; 
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
    // $ANTLR end "entryRuleXEventNoComment"


    // $ANTLR start "ruleXEventNoComment"
    // InternalXMachine.g:1270:1: ruleXEventNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' ) ;
    public final EObject ruleXEventNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_extended_3_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Enumerator lv_convergence_4_0 = null;

        EObject lv_extensions_5_0 = null;

        EObject lv_witnesses_9_0 = null;

        EObject lv_actions_11_0 = null;

        EObject lv_guards_13_0 = null;

        EObject lv_witnesses_15_0 = null;

        EObject lv_actions_17_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_guards_21_0 = null;

        EObject lv_witnesses_23_0 = null;

        EObject lv_actions_25_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1276:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' ) )
            // InternalXMachine.g:1277:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' )
            {
            // InternalXMachine.g:1277:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' )
            // InternalXMachine.g:1278:3: () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end'
            {
            // InternalXMachine.g:1278:3: ()
            // InternalXMachine.g:1279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventNoCommentAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1285:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:1286:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:1286:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:1287:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXEventNoCommentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:1303:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:1304:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:1304:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:1305:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2());
            				
            // InternalXMachine.g:1308:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:1309:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:1309:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 >= 33 && LA25_0 <= 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXMachine.g:1310:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1310:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    // InternalXMachine.g:1311:5: {...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalXMachine.g:1311:112: ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    // InternalXMachine.g:1312:6: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalXMachine.g:1315:9: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    // InternalXMachine.g:1315:10: {...}? => ( (lv_extended_3_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "true");
            	    }
            	    // InternalXMachine.g:1315:19: ( (lv_extended_3_0= 'extended' ) )
            	    // InternalXMachine.g:1315:20: (lv_extended_3_0= 'extended' )
            	    {
            	    // InternalXMachine.g:1315:20: (lv_extended_3_0= 'extended' )
            	    // InternalXMachine.g:1316:10: lv_extended_3_0= 'extended'
            	    {
            	    lv_extended_3_0=(Token)match(input,25,FOLLOW_24); 

            	    										newLeafNode(lv_extended_3_0, grammarAccess.getXEventNoCommentAccess().getExtendedExtendedKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getXEventNoCommentRule());
            	    										}
            	    										setWithLastConsumed(current, "extended", true, "extended");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:1333:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1333:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:1334:5: {...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalXMachine.g:1334:112: ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:1335:6: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalXMachine.g:1338:9: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:1338:10: {...}? => ( (lv_convergence_4_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "true");
            	    }
            	    // InternalXMachine.g:1338:19: ( (lv_convergence_4_0= ruleXConvergence ) )
            	    // InternalXMachine.g:1338:20: (lv_convergence_4_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:1338:20: (lv_convergence_4_0= ruleXConvergence )
            	    // InternalXMachine.g:1339:10: lv_convergence_4_0= ruleXConvergence
            	    {

            	    										newCompositeNode(grammarAccess.getXEventNoCommentAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_24);
            	    lv_convergence_4_0=ruleXConvergence();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
            	    										}
            	    										set(
            	    											current,
            	    											"convergence",
            	    											lv_convergence_4_0,
            	    											"ac.soton.xeventb.xmachine.XMachine.XConvergence");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2());
            				

            }

            // InternalXMachine.g:1368:3: ( (lv_extensions_5_0= ruleEventSync ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXMachine.g:1369:4: (lv_extensions_5_0= ruleEventSync )
            	    {
            	    // InternalXMachine.g:1369:4: (lv_extensions_5_0= ruleEventSync )
            	    // InternalXMachine.g:1370:5: lv_extensions_5_0= ruleEventSync
            	    {

            	    					newCompositeNode(grammarAccess.getXEventNoCommentAccess().getExtensionsEventSyncParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_extensions_5_0=ruleEventSync();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_5_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.EventSync");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalXMachine.g:1387:3: (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:1388:4: otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getXEventNoCommentAccess().getRefinesKeyword_4_0());
                    			
                    // InternalXMachine.g:1392:4: ( (otherlv_7= RULE_ID ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalXMachine.g:1393:5: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:1393:5: (otherlv_7= RULE_ID )
                    	    // InternalXMachine.g:1394:6: otherlv_7= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXEventNoCommentRule());
                    	    						}
                    	    					
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getXEventNoCommentAccess().getRefinesEventCrossReference_4_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:1406:3: ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )?
            int alt43=4;
            switch ( input.LA(1) ) {
                case 26:
                case 27:
                    {
                    alt43=1;
                    }
                    break;
                case 28:
                    {
                    alt43=2;
                    }
                    break;
                case 30:
                    {
                    alt43=3;
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // InternalXMachine.g:1407:4: ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:1407:4: ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ )
                    // InternalXMachine.g:1408:5: (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:1408:5: (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==26) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalXMachine.g:1409:6: otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+
                            {
                            otherlv_8=(Token)match(input,26,FOLLOW_10); 

                            						newLeafNode(otherlv_8, grammarAccess.getXEventNoCommentAccess().getWithKeyword_5_0_0_0());
                            					
                            // InternalXMachine.g:1413:6: ( (lv_witnesses_9_0= ruleXWitness ) )+
                            int cnt29=0;
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==RULE_ML_COMMENT||LA29_0==RULE_XLABEL) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalXMachine.g:1414:7: (lv_witnesses_9_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1414:7: (lv_witnesses_9_0= ruleXWitness )
                            	    // InternalXMachine.g:1415:8: lv_witnesses_9_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventNoCommentAccess().getWitnessesXWitnessParserRuleCall_5_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_27);
                            	    lv_witnesses_9_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_9_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt29 >= 1 ) break loop29;
                                        EarlyExitException eee =
                                            new EarlyExitException(29, input);
                                        throw eee;
                                }
                                cnt29++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,27,FOLLOW_10); 

                    					newLeafNode(otherlv_10, grammarAccess.getXEventNoCommentAccess().getBeginKeyword_5_0_1());
                    				
                    // InternalXMachine.g:1437:5: ( (lv_actions_11_0= ruleXAction ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ML_COMMENT||LA31_0==RULE_XLABEL) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalXMachine.g:1438:6: (lv_actions_11_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1438:6: (lv_actions_11_0= ruleXAction )
                    	    // InternalXMachine.g:1439:7: lv_actions_11_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventNoCommentAccess().getActionsXActionParserRuleCall_5_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_actions_11_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_11_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XAction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1458:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1458:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1459:5: otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )?
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_10); 

                    					newLeafNode(otherlv_12, grammarAccess.getXEventNoCommentAccess().getWhenKeyword_5_1_0());
                    				
                    // InternalXMachine.g:1463:5: ( (lv_guards_13_0= ruleXGuard ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ML_COMMENT||LA32_0==RULE_XLABEL) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalXMachine.g:1464:6: (lv_guards_13_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1464:6: (lv_guards_13_0= ruleXGuard )
                    	    // InternalXMachine.g:1465:7: lv_guards_13_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventNoCommentAccess().getGuardsXGuardParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_13_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_13_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    // InternalXMachine.g:1482:5: (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==26) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalXMachine.g:1483:6: otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+
                            {
                            otherlv_14=(Token)match(input,26,FOLLOW_10); 

                            						newLeafNode(otherlv_14, grammarAccess.getXEventNoCommentAccess().getWithKeyword_5_1_2_0());
                            					
                            // InternalXMachine.g:1487:6: ( (lv_witnesses_15_0= ruleXWitness ) )+
                            int cnt33=0;
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==RULE_ML_COMMENT||LA33_0==RULE_XLABEL) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalXMachine.g:1488:7: (lv_witnesses_15_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1488:7: (lv_witnesses_15_0= ruleXWitness )
                            	    // InternalXMachine.g:1489:8: lv_witnesses_15_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventNoCommentAccess().getWitnessesXWitnessParserRuleCall_5_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_15_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_15_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt33 >= 1 ) break loop33;
                                        EarlyExitException eee =
                                            new EarlyExitException(33, input);
                                        throw eee;
                                }
                                cnt33++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalXMachine.g:1507:5: (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==29) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalXMachine.g:1508:6: otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+
                            {
                            otherlv_16=(Token)match(input,29,FOLLOW_10); 

                            						newLeafNode(otherlv_16, grammarAccess.getXEventNoCommentAccess().getThenKeyword_5_1_3_0());
                            					
                            // InternalXMachine.g:1512:6: ( (lv_actions_17_0= ruleXAction ) )+
                            int cnt35=0;
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==RULE_ML_COMMENT||LA35_0==RULE_XLABEL) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // InternalXMachine.g:1513:7: (lv_actions_17_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1513:7: (lv_actions_17_0= ruleXAction )
                            	    // InternalXMachine.g:1514:8: lv_actions_17_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventNoCommentAccess().getActionsXActionParserRuleCall_5_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_17_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_17_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XAction");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt35 >= 1 ) break loop35;
                                        EarlyExitException eee =
                                            new EarlyExitException(35, input);
                                        throw eee;
                                }
                                cnt35++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1534:4: (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1534:4: (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1535:5: otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )?
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_8); 

                    					newLeafNode(otherlv_18, grammarAccess.getXEventNoCommentAccess().getAnyKeyword_5_2_0());
                    				
                    // InternalXMachine.g:1539:5: ( (lv_parameters_19_0= ruleXParameter ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ML_COMMENT||LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalXMachine.g:1540:6: (lv_parameters_19_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1540:6: (lv_parameters_19_0= ruleXParameter )
                    	    // InternalXMachine.g:1541:7: lv_parameters_19_0= ruleXParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventNoCommentAccess().getParametersXParameterParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_parameters_19_0=ruleXParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_19_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    otherlv_20=(Token)match(input,31,FOLLOW_10); 

                    					newLeafNode(otherlv_20, grammarAccess.getXEventNoCommentAccess().getWhereKeyword_5_2_2());
                    				
                    // InternalXMachine.g:1562:5: ( (lv_guards_21_0= ruleXGuard ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ML_COMMENT||LA38_0==RULE_XLABEL) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalXMachine.g:1563:6: (lv_guards_21_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1563:6: (lv_guards_21_0= ruleXGuard )
                    	    // InternalXMachine.g:1564:7: lv_guards_21_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventNoCommentAccess().getGuardsXGuardParserRuleCall_5_2_3_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_21_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_21_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);

                    // InternalXMachine.g:1581:5: (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==26) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalXMachine.g:1582:6: otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+
                            {
                            otherlv_22=(Token)match(input,26,FOLLOW_10); 

                            						newLeafNode(otherlv_22, grammarAccess.getXEventNoCommentAccess().getWithKeyword_5_2_4_0());
                            					
                            // InternalXMachine.g:1586:6: ( (lv_witnesses_23_0= ruleXWitness ) )+
                            int cnt39=0;
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==RULE_ML_COMMENT||LA39_0==RULE_XLABEL) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // InternalXMachine.g:1587:7: (lv_witnesses_23_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1587:7: (lv_witnesses_23_0= ruleXWitness )
                            	    // InternalXMachine.g:1588:8: lv_witnesses_23_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventNoCommentAccess().getWitnessesXWitnessParserRuleCall_5_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_23_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_23_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt39 >= 1 ) break loop39;
                                        EarlyExitException eee =
                                            new EarlyExitException(39, input);
                                        throw eee;
                                }
                                cnt39++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalXMachine.g:1606:5: (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==29) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalXMachine.g:1607:6: otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+
                            {
                            otherlv_24=(Token)match(input,29,FOLLOW_10); 

                            						newLeafNode(otherlv_24, grammarAccess.getXEventNoCommentAccess().getThenKeyword_5_2_5_0());
                            					
                            // InternalXMachine.g:1611:6: ( (lv_actions_25_0= ruleXAction ) )+
                            int cnt41=0;
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==RULE_ML_COMMENT||LA41_0==RULE_XLABEL) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // InternalXMachine.g:1612:7: (lv_actions_25_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1612:7: (lv_actions_25_0= ruleXAction )
                            	    // InternalXMachine.g:1613:8: lv_actions_25_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventNoCommentAccess().getActionsXActionParserRuleCall_5_2_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_25_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_25_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XAction");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt41 >= 1 ) break loop41;
                                        EarlyExitException eee =
                                            new EarlyExitException(41, input);
                                        throw eee;
                                }
                                cnt41++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getXEventNoCommentAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleXEventNoComment"


    // $ANTLR start "entryRuleXEventMLComment"
    // InternalXMachine.g:1641:1: entryRuleXEventMLComment returns [EObject current=null] : iv_ruleXEventMLComment= ruleXEventMLComment EOF ;
    public final EObject entryRuleXEventMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEventMLComment = null;


        try {
            // InternalXMachine.g:1641:56: (iv_ruleXEventMLComment= ruleXEventMLComment EOF )
            // InternalXMachine.g:1642:2: iv_ruleXEventMLComment= ruleXEventMLComment EOF
            {
             newCompositeNode(grammarAccess.getXEventMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXEventMLComment=ruleXEventMLComment();

            state._fsp--;

             current =iv_ruleXEventMLComment; 
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
    // $ANTLR end "entryRuleXEventMLComment"


    // $ANTLR start "ruleXEventMLComment"
    // InternalXMachine.g:1648:1: ruleXEventMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) ;
    public final EObject ruleXEventMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_extended_4_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Enumerator lv_convergence_5_0 = null;

        EObject lv_extensions_6_0 = null;

        EObject lv_witnesses_10_0 = null;

        EObject lv_actions_12_0 = null;

        EObject lv_guards_14_0 = null;

        EObject lv_witnesses_16_0 = null;

        EObject lv_actions_18_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_guards_22_0 = null;

        EObject lv_witnesses_24_0 = null;

        EObject lv_actions_26_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1654:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) )
            // InternalXMachine.g:1655:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            {
            // InternalXMachine.g:1655:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            // InternalXMachine.g:1656:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end'
            {
            // InternalXMachine.g:1656:3: ()
            // InternalXMachine.g:1657:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventMLCommentAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1663:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:1664:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:1664:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:1665:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_4); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXEventMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXMachine.g:1681:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:1682:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:1682:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:1683:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXEventMLCommentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:1699:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:1700:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:1700:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:1701:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3());
            				
            // InternalXMachine.g:1704:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:1705:6: ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:1705:6: ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( LA44_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0) ) {
                    alt44=1;
                }
                else if ( LA44_0 >= 33 && LA44_0 <= 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalXMachine.g:1706:4: ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1706:4: ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) )
            	    // InternalXMachine.g:1707:5: {...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalXMachine.g:1707:112: ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) )
            	    // InternalXMachine.g:1708:6: ({...}? => ( (lv_extended_4_0= 'extended' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalXMachine.g:1711:9: ({...}? => ( (lv_extended_4_0= 'extended' ) ) )
            	    // InternalXMachine.g:1711:10: {...}? => ( (lv_extended_4_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "true");
            	    }
            	    // InternalXMachine.g:1711:19: ( (lv_extended_4_0= 'extended' ) )
            	    // InternalXMachine.g:1711:20: (lv_extended_4_0= 'extended' )
            	    {
            	    // InternalXMachine.g:1711:20: (lv_extended_4_0= 'extended' )
            	    // InternalXMachine.g:1712:10: lv_extended_4_0= 'extended'
            	    {
            	    lv_extended_4_0=(Token)match(input,25,FOLLOW_24); 

            	    										newLeafNode(lv_extended_4_0, grammarAccess.getXEventMLCommentAccess().getExtendedExtendedKeyword_3_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getXEventMLCommentRule());
            	    										}
            	    										setWithLastConsumed(current, "extended", true, "extended");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:1729:4: ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1729:4: ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:1730:5: {...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalXMachine.g:1730:112: ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:1731:6: ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalXMachine.g:1734:9: ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:1734:10: {...}? => ( (lv_convergence_5_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "true");
            	    }
            	    // InternalXMachine.g:1734:19: ( (lv_convergence_5_0= ruleXConvergence ) )
            	    // InternalXMachine.g:1734:20: (lv_convergence_5_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:1734:20: (lv_convergence_5_0= ruleXConvergence )
            	    // InternalXMachine.g:1735:10: lv_convergence_5_0= ruleXConvergence
            	    {

            	    										newCompositeNode(grammarAccess.getXEventMLCommentAccess().getConvergenceXConvergenceEnumRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_24);
            	    lv_convergence_5_0=ruleXConvergence();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
            	    										}
            	    										set(
            	    											current,
            	    											"convergence",
            	    											lv_convergence_5_0,
            	    											"ac.soton.xeventb.xmachine.XMachine.XConvergence");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3());
            				

            }

            // InternalXMachine.g:1764:3: ( (lv_extensions_6_0= ruleEventSync ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==32) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalXMachine.g:1765:4: (lv_extensions_6_0= ruleEventSync )
            	    {
            	    // InternalXMachine.g:1765:4: (lv_extensions_6_0= ruleEventSync )
            	    // InternalXMachine.g:1766:5: lv_extensions_6_0= ruleEventSync
            	    {

            	    					newCompositeNode(grammarAccess.getXEventMLCommentAccess().getExtensionsEventSyncParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_extensions_6_0=ruleEventSync();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_6_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.EventSync");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalXMachine.g:1783:3: (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==13) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:1784:4: otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getXEventMLCommentAccess().getRefinesKeyword_5_0());
                    			
                    // InternalXMachine.g:1788:4: ( (otherlv_8= RULE_ID ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_ID) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalXMachine.g:1789:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:1789:5: (otherlv_8= RULE_ID )
                    	    // InternalXMachine.g:1790:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXEventMLCommentRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getXEventMLCommentAccess().getRefinesEventCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:1802:3: ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )?
            int alt62=4;
            switch ( input.LA(1) ) {
                case 26:
                case 27:
                    {
                    alt62=1;
                    }
                    break;
                case 28:
                    {
                    alt62=2;
                    }
                    break;
                case 30:
                    {
                    alt62=3;
                    }
                    break;
            }

            switch (alt62) {
                case 1 :
                    // InternalXMachine.g:1803:4: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:1803:4: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    // InternalXMachine.g:1804:5: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:1804:5: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==26) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalXMachine.g:1805:6: otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+
                            {
                            otherlv_9=(Token)match(input,26,FOLLOW_10); 

                            						newLeafNode(otherlv_9, grammarAccess.getXEventMLCommentAccess().getWithKeyword_6_0_0_0());
                            					
                            // InternalXMachine.g:1809:6: ( (lv_witnesses_10_0= ruleXWitness ) )+
                            int cnt48=0;
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==RULE_ML_COMMENT||LA48_0==RULE_XLABEL) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalXMachine.g:1810:7: (lv_witnesses_10_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1810:7: (lv_witnesses_10_0= ruleXWitness )
                            	    // InternalXMachine.g:1811:8: lv_witnesses_10_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventMLCommentAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_27);
                            	    lv_witnesses_10_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_10_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt48 >= 1 ) break loop48;
                                        EarlyExitException eee =
                                            new EarlyExitException(48, input);
                                        throw eee;
                                }
                                cnt48++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_10); 

                    					newLeafNode(otherlv_11, grammarAccess.getXEventMLCommentAccess().getBeginKeyword_6_0_1());
                    				
                    // InternalXMachine.g:1833:5: ( (lv_actions_12_0= ruleXAction ) )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==RULE_ML_COMMENT||LA50_0==RULE_XLABEL) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalXMachine.g:1834:6: (lv_actions_12_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1834:6: (lv_actions_12_0= ruleXAction )
                    	    // InternalXMachine.g:1835:7: lv_actions_12_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventMLCommentAccess().getActionsXActionParserRuleCall_6_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_actions_12_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_12_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XAction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1854:4: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1854:4: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1855:5: otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_10); 

                    					newLeafNode(otherlv_13, grammarAccess.getXEventMLCommentAccess().getWhenKeyword_6_1_0());
                    				
                    // InternalXMachine.g:1859:5: ( (lv_guards_14_0= ruleXGuard ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_ML_COMMENT||LA51_0==RULE_XLABEL) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalXMachine.g:1860:6: (lv_guards_14_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1860:6: (lv_guards_14_0= ruleXGuard )
                    	    // InternalXMachine.g:1861:7: lv_guards_14_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventMLCommentAccess().getGuardsXGuardParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_14_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_14_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);

                    // InternalXMachine.g:1878:5: (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==26) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalXMachine.g:1879:6: otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+
                            {
                            otherlv_15=(Token)match(input,26,FOLLOW_10); 

                            						newLeafNode(otherlv_15, grammarAccess.getXEventMLCommentAccess().getWithKeyword_6_1_2_0());
                            					
                            // InternalXMachine.g:1883:6: ( (lv_witnesses_16_0= ruleXWitness ) )+
                            int cnt52=0;
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==RULE_ML_COMMENT||LA52_0==RULE_XLABEL) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalXMachine.g:1884:7: (lv_witnesses_16_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1884:7: (lv_witnesses_16_0= ruleXWitness )
                            	    // InternalXMachine.g:1885:8: lv_witnesses_16_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventMLCommentAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_16_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_16_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt52 >= 1 ) break loop52;
                                        EarlyExitException eee =
                                            new EarlyExitException(52, input);
                                        throw eee;
                                }
                                cnt52++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalXMachine.g:1903:5: (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==29) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalXMachine.g:1904:6: otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+
                            {
                            otherlv_17=(Token)match(input,29,FOLLOW_10); 

                            						newLeafNode(otherlv_17, grammarAccess.getXEventMLCommentAccess().getThenKeyword_6_1_3_0());
                            					
                            // InternalXMachine.g:1908:6: ( (lv_actions_18_0= ruleXAction ) )+
                            int cnt54=0;
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==RULE_ML_COMMENT||LA54_0==RULE_XLABEL) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalXMachine.g:1909:7: (lv_actions_18_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1909:7: (lv_actions_18_0= ruleXAction )
                            	    // InternalXMachine.g:1910:8: lv_actions_18_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventMLCommentAccess().getActionsXActionParserRuleCall_6_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_18_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_18_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XAction");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt54 >= 1 ) break loop54;
                                        EarlyExitException eee =
                                            new EarlyExitException(54, input);
                                        throw eee;
                                }
                                cnt54++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1930:4: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1930:4: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1931:5: otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    {
                    otherlv_19=(Token)match(input,30,FOLLOW_8); 

                    					newLeafNode(otherlv_19, grammarAccess.getXEventMLCommentAccess().getAnyKeyword_6_2_0());
                    				
                    // InternalXMachine.g:1935:5: ( (lv_parameters_20_0= ruleXParameter ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_ML_COMMENT||LA56_0==RULE_ID) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalXMachine.g:1936:6: (lv_parameters_20_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1936:6: (lv_parameters_20_0= ruleXParameter )
                    	    // InternalXMachine.g:1937:7: lv_parameters_20_0= ruleXParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventMLCommentAccess().getParametersXParameterParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_parameters_20_0=ruleXParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_20_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);

                    otherlv_21=(Token)match(input,31,FOLLOW_10); 

                    					newLeafNode(otherlv_21, grammarAccess.getXEventMLCommentAccess().getWhereKeyword_6_2_2());
                    				
                    // InternalXMachine.g:1958:5: ( (lv_guards_22_0= ruleXGuard ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_ML_COMMENT||LA57_0==RULE_XLABEL) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalXMachine.g:1959:6: (lv_guards_22_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1959:6: (lv_guards_22_0= ruleXGuard )
                    	    // InternalXMachine.g:1960:7: lv_guards_22_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventMLCommentAccess().getGuardsXGuardParserRuleCall_6_2_3_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_22_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_22_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    // InternalXMachine.g:1977:5: (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==26) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalXMachine.g:1978:6: otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+
                            {
                            otherlv_23=(Token)match(input,26,FOLLOW_10); 

                            						newLeafNode(otherlv_23, grammarAccess.getXEventMLCommentAccess().getWithKeyword_6_2_4_0());
                            					
                            // InternalXMachine.g:1982:6: ( (lv_witnesses_24_0= ruleXWitness ) )+
                            int cnt58=0;
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==RULE_ML_COMMENT||LA58_0==RULE_XLABEL) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // InternalXMachine.g:1983:7: (lv_witnesses_24_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1983:7: (lv_witnesses_24_0= ruleXWitness )
                            	    // InternalXMachine.g:1984:8: lv_witnesses_24_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventMLCommentAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_24_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_24_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt58 >= 1 ) break loop58;
                                        EarlyExitException eee =
                                            new EarlyExitException(58, input);
                                        throw eee;
                                }
                                cnt58++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalXMachine.g:2002:5: (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==29) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalXMachine.g:2003:6: otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+
                            {
                            otherlv_25=(Token)match(input,29,FOLLOW_10); 

                            						newLeafNode(otherlv_25, grammarAccess.getXEventMLCommentAccess().getThenKeyword_6_2_5_0());
                            					
                            // InternalXMachine.g:2007:6: ( (lv_actions_26_0= ruleXAction ) )+
                            int cnt60=0;
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==RULE_ML_COMMENT||LA60_0==RULE_XLABEL) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // InternalXMachine.g:2008:7: (lv_actions_26_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:2008:7: (lv_actions_26_0= ruleXAction )
                            	    // InternalXMachine.g:2009:8: lv_actions_26_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventMLCommentAccess().getActionsXActionParserRuleCall_6_2_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_26_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_26_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XAction");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt60 >= 1 ) break loop60;
                                        EarlyExitException eee =
                                            new EarlyExitException(60, input);
                                        throw eee;
                                }
                                cnt60++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getXEventMLCommentAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "ruleXEventMLComment"


    // $ANTLR start "entryRuleXEventSLComment"
    // InternalXMachine.g:2037:1: entryRuleXEventSLComment returns [EObject current=null] : iv_ruleXEventSLComment= ruleXEventSLComment EOF ;
    public final EObject entryRuleXEventSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEventSLComment = null;


        try {
            // InternalXMachine.g:2037:56: (iv_ruleXEventSLComment= ruleXEventSLComment EOF )
            // InternalXMachine.g:2038:2: iv_ruleXEventSLComment= ruleXEventSLComment EOF
            {
             newCompositeNode(grammarAccess.getXEventSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXEventSLComment=ruleXEventSLComment();

            state._fsp--;

             current =iv_ruleXEventSLComment; 
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
    // $ANTLR end "entryRuleXEventSLComment"


    // $ANTLR start "ruleXEventSLComment"
    // InternalXMachine.g:2044:1: ruleXEventSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) ;
    public final EObject ruleXEventSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_extended_3_0=null;
        Token lv_comment_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Enumerator lv_convergence_4_0 = null;

        EObject lv_extensions_6_0 = null;

        EObject lv_witnesses_10_0 = null;

        EObject lv_actions_12_0 = null;

        EObject lv_guards_14_0 = null;

        EObject lv_witnesses_16_0 = null;

        EObject lv_actions_18_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_guards_22_0 = null;

        EObject lv_witnesses_24_0 = null;

        EObject lv_actions_26_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2050:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) )
            // InternalXMachine.g:2051:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            {
            // InternalXMachine.g:2051:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            // InternalXMachine.g:2052:3: () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end'
            {
            // InternalXMachine.g:2052:3: ()
            // InternalXMachine.g:2053:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventSLCommentAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2059:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:2060:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:2060:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:2061:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXEventSLCommentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:2077:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:2078:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:2078:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:2079:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2());
            				
            // InternalXMachine.g:2082:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:2083:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:2083:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            loop63:
            do {
                int alt63=3;
                int LA63_0 = input.LA(1);

                if ( LA63_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0) ) {
                    alt63=1;
                }
                else if ( LA63_0 >= 33 && LA63_0 <= 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1) ) {
                    alt63=2;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalXMachine.g:2084:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalXMachine.g:2084:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    // InternalXMachine.g:2085:5: {...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalXMachine.g:2085:112: ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    // InternalXMachine.g:2086:6: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalXMachine.g:2089:9: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    // InternalXMachine.g:2089:10: {...}? => ( (lv_extended_3_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "true");
            	    }
            	    // InternalXMachine.g:2089:19: ( (lv_extended_3_0= 'extended' ) )
            	    // InternalXMachine.g:2089:20: (lv_extended_3_0= 'extended' )
            	    {
            	    // InternalXMachine.g:2089:20: (lv_extended_3_0= 'extended' )
            	    // InternalXMachine.g:2090:10: lv_extended_3_0= 'extended'
            	    {
            	    lv_extended_3_0=(Token)match(input,25,FOLLOW_32); 

            	    										newLeafNode(lv_extended_3_0, grammarAccess.getXEventSLCommentAccess().getExtendedExtendedKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getXEventSLCommentRule());
            	    										}
            	    										setWithLastConsumed(current, "extended", true, "extended");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:2107:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:2107:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:2108:5: {...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalXMachine.g:2108:112: ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:2109:6: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalXMachine.g:2112:9: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:2112:10: {...}? => ( (lv_convergence_4_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "true");
            	    }
            	    // InternalXMachine.g:2112:19: ( (lv_convergence_4_0= ruleXConvergence ) )
            	    // InternalXMachine.g:2112:20: (lv_convergence_4_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:2112:20: (lv_convergence_4_0= ruleXConvergence )
            	    // InternalXMachine.g:2113:10: lv_convergence_4_0= ruleXConvergence
            	    {

            	    										newCompositeNode(grammarAccess.getXEventSLCommentAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_32);
            	    lv_convergence_4_0=ruleXConvergence();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
            	    										}
            	    										set(
            	    											current,
            	    											"convergence",
            	    											lv_convergence_4_0,
            	    											"ac.soton.xeventb.xmachine.XMachine.XConvergence");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2());
            				

            }

            // InternalXMachine.g:2142:3: ( (lv_comment_5_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:2143:4: (lv_comment_5_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:2143:4: (lv_comment_5_0= RULE_SL_COMMENT )
            // InternalXMachine.g:2144:5: lv_comment_5_0= RULE_SL_COMMENT
            {
            lv_comment_5_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_25); 

            					newLeafNode(lv_comment_5_0, grammarAccess.getXEventSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_5_0,
            						"org.eclipse.xtext.common.Terminals.SL_COMMENT");
            				

            }


            }

            // InternalXMachine.g:2160:3: ( (lv_extensions_6_0= ruleEventSync ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==32) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalXMachine.g:2161:4: (lv_extensions_6_0= ruleEventSync )
            	    {
            	    // InternalXMachine.g:2161:4: (lv_extensions_6_0= ruleEventSync )
            	    // InternalXMachine.g:2162:5: lv_extensions_6_0= ruleEventSync
            	    {

            	    					newCompositeNode(grammarAccess.getXEventSLCommentAccess().getExtensionsEventSyncParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_extensions_6_0=ruleEventSync();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_6_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.EventSync");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalXMachine.g:2179:3: (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==13) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalXMachine.g:2180:4: otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getXEventSLCommentAccess().getRefinesKeyword_5_0());
                    			
                    // InternalXMachine.g:2184:4: ( (otherlv_8= RULE_ID ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_ID) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalXMachine.g:2185:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:2185:5: (otherlv_8= RULE_ID )
                    	    // InternalXMachine.g:2186:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXEventSLCommentRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getXEventSLCommentAccess().getRefinesEventCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:2198:3: ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )?
            int alt81=4;
            switch ( input.LA(1) ) {
                case 26:
                case 27:
                    {
                    alt81=1;
                    }
                    break;
                case 28:
                    {
                    alt81=2;
                    }
                    break;
                case 30:
                    {
                    alt81=3;
                    }
                    break;
            }

            switch (alt81) {
                case 1 :
                    // InternalXMachine.g:2199:4: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:2199:4: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    // InternalXMachine.g:2200:5: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:2200:5: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==26) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalXMachine.g:2201:6: otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+
                            {
                            otherlv_9=(Token)match(input,26,FOLLOW_10); 

                            						newLeafNode(otherlv_9, grammarAccess.getXEventSLCommentAccess().getWithKeyword_6_0_0_0());
                            					
                            // InternalXMachine.g:2205:6: ( (lv_witnesses_10_0= ruleXWitness ) )+
                            int cnt67=0;
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==RULE_ML_COMMENT||LA67_0==RULE_XLABEL) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // InternalXMachine.g:2206:7: (lv_witnesses_10_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:2206:7: (lv_witnesses_10_0= ruleXWitness )
                            	    // InternalXMachine.g:2207:8: lv_witnesses_10_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventSLCommentAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_27);
                            	    lv_witnesses_10_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_10_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt67 >= 1 ) break loop67;
                                        EarlyExitException eee =
                                            new EarlyExitException(67, input);
                                        throw eee;
                                }
                                cnt67++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_10); 

                    					newLeafNode(otherlv_11, grammarAccess.getXEventSLCommentAccess().getBeginKeyword_6_0_1());
                    				
                    // InternalXMachine.g:2229:5: ( (lv_actions_12_0= ruleXAction ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_ML_COMMENT||LA69_0==RULE_XLABEL) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalXMachine.g:2230:6: (lv_actions_12_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:2230:6: (lv_actions_12_0= ruleXAction )
                    	    // InternalXMachine.g:2231:7: lv_actions_12_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventSLCommentAccess().getActionsXActionParserRuleCall_6_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_actions_12_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_12_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XAction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2250:4: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:2250:4: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:2251:5: otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_10); 

                    					newLeafNode(otherlv_13, grammarAccess.getXEventSLCommentAccess().getWhenKeyword_6_1_0());
                    				
                    // InternalXMachine.g:2255:5: ( (lv_guards_14_0= ruleXGuard ) )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==RULE_ML_COMMENT||LA70_0==RULE_XLABEL) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalXMachine.g:2256:6: (lv_guards_14_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:2256:6: (lv_guards_14_0= ruleXGuard )
                    	    // InternalXMachine.g:2257:7: lv_guards_14_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventSLCommentAccess().getGuardsXGuardParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_14_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_14_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt70 >= 1 ) break loop70;
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);

                    // InternalXMachine.g:2274:5: (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==26) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalXMachine.g:2275:6: otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+
                            {
                            otherlv_15=(Token)match(input,26,FOLLOW_10); 

                            						newLeafNode(otherlv_15, grammarAccess.getXEventSLCommentAccess().getWithKeyword_6_1_2_0());
                            					
                            // InternalXMachine.g:2279:6: ( (lv_witnesses_16_0= ruleXWitness ) )+
                            int cnt71=0;
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==RULE_ML_COMMENT||LA71_0==RULE_XLABEL) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // InternalXMachine.g:2280:7: (lv_witnesses_16_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:2280:7: (lv_witnesses_16_0= ruleXWitness )
                            	    // InternalXMachine.g:2281:8: lv_witnesses_16_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventSLCommentAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_16_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_16_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt71 >= 1 ) break loop71;
                                        EarlyExitException eee =
                                            new EarlyExitException(71, input);
                                        throw eee;
                                }
                                cnt71++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalXMachine.g:2299:5: (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==29) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalXMachine.g:2300:6: otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+
                            {
                            otherlv_17=(Token)match(input,29,FOLLOW_10); 

                            						newLeafNode(otherlv_17, grammarAccess.getXEventSLCommentAccess().getThenKeyword_6_1_3_0());
                            					
                            // InternalXMachine.g:2304:6: ( (lv_actions_18_0= ruleXAction ) )+
                            int cnt73=0;
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==RULE_ML_COMMENT||LA73_0==RULE_XLABEL) ) {
                                    alt73=1;
                                }


                                switch (alt73) {
                            	case 1 :
                            	    // InternalXMachine.g:2305:7: (lv_actions_18_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:2305:7: (lv_actions_18_0= ruleXAction )
                            	    // InternalXMachine.g:2306:8: lv_actions_18_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventSLCommentAccess().getActionsXActionParserRuleCall_6_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_18_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_18_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XAction");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt73 >= 1 ) break loop73;
                                        EarlyExitException eee =
                                            new EarlyExitException(73, input);
                                        throw eee;
                                }
                                cnt73++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2326:4: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:2326:4: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:2327:5: otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    {
                    otherlv_19=(Token)match(input,30,FOLLOW_8); 

                    					newLeafNode(otherlv_19, grammarAccess.getXEventSLCommentAccess().getAnyKeyword_6_2_0());
                    				
                    // InternalXMachine.g:2331:5: ( (lv_parameters_20_0= ruleXParameter ) )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==RULE_ML_COMMENT||LA75_0==RULE_ID) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalXMachine.g:2332:6: (lv_parameters_20_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:2332:6: (lv_parameters_20_0= ruleXParameter )
                    	    // InternalXMachine.g:2333:7: lv_parameters_20_0= ruleXParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventSLCommentAccess().getParametersXParameterParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_parameters_20_0=ruleXParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_20_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);

                    otherlv_21=(Token)match(input,31,FOLLOW_10); 

                    					newLeafNode(otherlv_21, grammarAccess.getXEventSLCommentAccess().getWhereKeyword_6_2_2());
                    				
                    // InternalXMachine.g:2354:5: ( (lv_guards_22_0= ruleXGuard ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==RULE_ML_COMMENT||LA76_0==RULE_XLABEL) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalXMachine.g:2355:6: (lv_guards_22_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:2355:6: (lv_guards_22_0= ruleXGuard )
                    	    // InternalXMachine.g:2356:7: lv_guards_22_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventSLCommentAccess().getGuardsXGuardParserRuleCall_6_2_3_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_22_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_22_0,
                    	    								"ac.soton.xeventb.xmachine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    // InternalXMachine.g:2373:5: (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==26) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalXMachine.g:2374:6: otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+
                            {
                            otherlv_23=(Token)match(input,26,FOLLOW_10); 

                            						newLeafNode(otherlv_23, grammarAccess.getXEventSLCommentAccess().getWithKeyword_6_2_4_0());
                            					
                            // InternalXMachine.g:2378:6: ( (lv_witnesses_24_0= ruleXWitness ) )+
                            int cnt77=0;
                            loop77:
                            do {
                                int alt77=2;
                                int LA77_0 = input.LA(1);

                                if ( (LA77_0==RULE_ML_COMMENT||LA77_0==RULE_XLABEL) ) {
                                    alt77=1;
                                }


                                switch (alt77) {
                            	case 1 :
                            	    // InternalXMachine.g:2379:7: (lv_witnesses_24_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:2379:7: (lv_witnesses_24_0= ruleXWitness )
                            	    // InternalXMachine.g:2380:8: lv_witnesses_24_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventSLCommentAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_24_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_24_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt77 >= 1 ) break loop77;
                                        EarlyExitException eee =
                                            new EarlyExitException(77, input);
                                        throw eee;
                                }
                                cnt77++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalXMachine.g:2398:5: (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==29) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalXMachine.g:2399:6: otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+
                            {
                            otherlv_25=(Token)match(input,29,FOLLOW_10); 

                            						newLeafNode(otherlv_25, grammarAccess.getXEventSLCommentAccess().getThenKeyword_6_2_5_0());
                            					
                            // InternalXMachine.g:2403:6: ( (lv_actions_26_0= ruleXAction ) )+
                            int cnt79=0;
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==RULE_ML_COMMENT||LA79_0==RULE_XLABEL) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // InternalXMachine.g:2404:7: (lv_actions_26_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:2404:7: (lv_actions_26_0= ruleXAction )
                            	    // InternalXMachine.g:2405:8: lv_actions_26_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventSLCommentAccess().getActionsXActionParserRuleCall_6_2_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_26_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_26_0,
                            	    									"ac.soton.xeventb.xmachine.XMachine.XAction");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt79 >= 1 ) break loop79;
                                        EarlyExitException eee =
                                            new EarlyExitException(79, input);
                                        throw eee;
                                }
                                cnt79++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getXEventSLCommentAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "ruleXEventSLComment"


    // $ANTLR start "entryRuleEventSync"
    // InternalXMachine.g:2433:1: entryRuleEventSync returns [EObject current=null] : iv_ruleEventSync= ruleEventSync EOF ;
    public final EObject entryRuleEventSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSync = null;


        try {
            // InternalXMachine.g:2433:50: (iv_ruleEventSync= ruleEventSync EOF )
            // InternalXMachine.g:2434:2: iv_ruleEventSync= ruleEventSync EOF
            {
             newCompositeNode(grammarAccess.getEventSyncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventSync=ruleEventSync();

            state._fsp--;

             current =iv_ruleEventSync; 
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
    // $ANTLR end "entryRuleEventSync"


    // $ANTLR start "ruleEventSync"
    // InternalXMachine.g:2440:1: ruleEventSync returns [EObject current=null] : ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleEventSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXMachine.g:2446:2: ( ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalXMachine.g:2447:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalXMachine.g:2447:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            // InternalXMachine.g:2448:3: () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalXMachine.g:2448:3: ()
            // InternalXMachine.g:2449:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2455:3: (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:2456:4: otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0());
            			
            // InternalXMachine.g:2460:4: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==23) ) {
                    alt82=1;
                }
            }
            switch (alt82) {
                case 1 :
                    // InternalXMachine.g:2461:5: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalXMachine.g:2461:5: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalXMachine.g:2462:6: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalXMachine.g:2462:6: (lv_prefix_2_0= RULE_ID )
                    // InternalXMachine.g:2463:7: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    							newLeafNode(lv_prefix_2_0, grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEventSyncRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"prefix",
                    								lv_prefix_2_0,
                    								"ac.soton.xeventb.xmachine.XMachine.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1());
                    				

                    }
                    break;

            }

            // InternalXMachine.g:2484:4: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:2485:5: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:2485:5: (otherlv_4= RULE_ID )
            // InternalXMachine.g:2486:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEventSyncRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            						newLeafNode(otherlv_4, grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0());
            					

            }


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
    // $ANTLR end "ruleEventSync"


    // $ANTLR start "entryRuleXParameter"
    // InternalXMachine.g:2502:1: entryRuleXParameter returns [EObject current=null] : iv_ruleXParameter= ruleXParameter EOF ;
    public final EObject entryRuleXParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameter = null;


        try {
            // InternalXMachine.g:2502:51: (iv_ruleXParameter= ruleXParameter EOF )
            // InternalXMachine.g:2503:2: iv_ruleXParameter= ruleXParameter EOF
            {
             newCompositeNode(grammarAccess.getXParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXParameter=ruleXParameter();

            state._fsp--;

             current =iv_ruleXParameter; 
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
    // $ANTLR end "entryRuleXParameter"


    // $ANTLR start "ruleXParameter"
    // InternalXMachine.g:2509:1: ruleXParameter returns [EObject current=null] : (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment ) ;
    public final EObject ruleXParameter() throws RecognitionException {
        EObject current = null;

        EObject this_XParameterNoComment_0 = null;

        EObject this_XParameterMLComment_1 = null;

        EObject this_XParameterSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2515:2: ( (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment ) )
            // InternalXMachine.g:2516:2: (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment )
            {
            // InternalXMachine.g:2516:2: (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment )
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==EOF||LA83_1==RULE_ML_COMMENT||LA83_1==RULE_ID||LA83_1==31) ) {
                    alt83=1;
                }
                else if ( (LA83_1==RULE_SL_COMMENT) ) {
                    alt83=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA83_0==RULE_ML_COMMENT) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalXMachine.g:2517:3: this_XParameterNoComment_0= ruleXParameterNoComment
                    {

                    			newCompositeNode(grammarAccess.getXParameterAccess().getXParameterNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XParameterNoComment_0=ruleXParameterNoComment();

                    state._fsp--;


                    			current = this_XParameterNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2526:3: this_XParameterMLComment_1= ruleXParameterMLComment
                    {

                    			newCompositeNode(grammarAccess.getXParameterAccess().getXParameterMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XParameterMLComment_1=ruleXParameterMLComment();

                    state._fsp--;


                    			current = this_XParameterMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2535:3: this_XParameterSLComment_2= ruleXParameterSLComment
                    {

                    			newCompositeNode(grammarAccess.getXParameterAccess().getXParameterSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XParameterSLComment_2=ruleXParameterSLComment();

                    state._fsp--;


                    			current = this_XParameterSLComment_2;
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
    // $ANTLR end "ruleXParameter"


    // $ANTLR start "entryRuleXParameterNoComment"
    // InternalXMachine.g:2547:1: entryRuleXParameterNoComment returns [EObject current=null] : iv_ruleXParameterNoComment= ruleXParameterNoComment EOF ;
    public final EObject entryRuleXParameterNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterNoComment = null;


        try {
            // InternalXMachine.g:2547:60: (iv_ruleXParameterNoComment= ruleXParameterNoComment EOF )
            // InternalXMachine.g:2548:2: iv_ruleXParameterNoComment= ruleXParameterNoComment EOF
            {
             newCompositeNode(grammarAccess.getXParameterNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXParameterNoComment=ruleXParameterNoComment();

            state._fsp--;

             current =iv_ruleXParameterNoComment; 
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
    // $ANTLR end "entryRuleXParameterNoComment"


    // $ANTLR start "ruleXParameterNoComment"
    // InternalXMachine.g:2554:1: ruleXParameterNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameterNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:2560:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:2561:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:2561:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:2562:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:2562:3: ()
            // InternalXMachine.g:2563:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterNoCommentAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2569:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:2570:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:2570:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:2571:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXParameterNoCommentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXParameterNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

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
    // $ANTLR end "ruleXParameterNoComment"


    // $ANTLR start "entryRuleXParameterMLComment"
    // InternalXMachine.g:2591:1: entryRuleXParameterMLComment returns [EObject current=null] : iv_ruleXParameterMLComment= ruleXParameterMLComment EOF ;
    public final EObject entryRuleXParameterMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterMLComment = null;


        try {
            // InternalXMachine.g:2591:60: (iv_ruleXParameterMLComment= ruleXParameterMLComment EOF )
            // InternalXMachine.g:2592:2: iv_ruleXParameterMLComment= ruleXParameterMLComment EOF
            {
             newCompositeNode(grammarAccess.getXParameterMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXParameterMLComment=ruleXParameterMLComment();

            state._fsp--;

             current =iv_ruleXParameterMLComment; 
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
    // $ANTLR end "entryRuleXParameterMLComment"


    // $ANTLR start "ruleXParameterMLComment"
    // InternalXMachine.g:2598:1: ruleXParameterMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameterMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:2604:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:2605:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:2605:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:2606:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:2606:3: ()
            // InternalXMachine.g:2607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterMLCommentAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2613:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:2614:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:2614:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:2615:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_4); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXParameterMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXParameterMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXMachine.g:2631:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:2632:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:2632:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:2633:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXParameterMLCommentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXParameterMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

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
    // $ANTLR end "ruleXParameterMLComment"


    // $ANTLR start "entryRuleXParameterSLComment"
    // InternalXMachine.g:2653:1: entryRuleXParameterSLComment returns [EObject current=null] : iv_ruleXParameterSLComment= ruleXParameterSLComment EOF ;
    public final EObject entryRuleXParameterSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterSLComment = null;


        try {
            // InternalXMachine.g:2653:60: (iv_ruleXParameterSLComment= ruleXParameterSLComment EOF )
            // InternalXMachine.g:2654:2: iv_ruleXParameterSLComment= ruleXParameterSLComment EOF
            {
             newCompositeNode(grammarAccess.getXParameterSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXParameterSLComment=ruleXParameterSLComment();

            state._fsp--;

             current =iv_ruleXParameterSLComment; 
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
    // $ANTLR end "entryRuleXParameterSLComment"


    // $ANTLR start "ruleXParameterSLComment"
    // InternalXMachine.g:2660:1: ruleXParameterSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXParameterSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:2666:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:2667:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:2667:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:2668:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:2668:3: ()
            // InternalXMachine.g:2669:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterSLCommentAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2675:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:2676:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:2676:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:2677:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXParameterSLCommentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXParameterSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:2693:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:2694:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:2694:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:2695:5: lv_comment_2_0= RULE_SL_COMMENT
            {
            lv_comment_2_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_2_0, grammarAccess.getXParameterSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXParameterSLCommentRule());
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
    // $ANTLR end "ruleXParameterSLComment"


    // $ANTLR start "entryRuleXGuard"
    // InternalXMachine.g:2715:1: entryRuleXGuard returns [EObject current=null] : iv_ruleXGuard= ruleXGuard EOF ;
    public final EObject entryRuleXGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuard = null;


        try {
            // InternalXMachine.g:2715:47: (iv_ruleXGuard= ruleXGuard EOF )
            // InternalXMachine.g:2716:2: iv_ruleXGuard= ruleXGuard EOF
            {
             newCompositeNode(grammarAccess.getXGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXGuard=ruleXGuard();

            state._fsp--;

             current =iv_ruleXGuard; 
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
    // $ANTLR end "entryRuleXGuard"


    // $ANTLR start "ruleXGuard"
    // InternalXMachine.g:2722:1: ruleXGuard returns [EObject current=null] : (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment ) ;
    public final EObject ruleXGuard() throws RecognitionException {
        EObject current = null;

        EObject this_XGuardNoComment_0 = null;

        EObject this_XGuardMLComment_1 = null;

        EObject this_XGuardSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2728:2: ( (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment ) )
            // InternalXMachine.g:2729:2: (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment )
            {
            // InternalXMachine.g:2729:2: (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment )
            int alt84=3;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_XLABEL) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        int LA84_4 = input.LA(4);

                        if ( (LA84_4==EOF||LA84_4==RULE_ML_COMMENT||LA84_4==RULE_XLABEL||LA84_4==19||LA84_4==26||LA84_4==29) ) {
                            alt84=1;
                        }
                        else if ( (LA84_4==RULE_SL_COMMENT) ) {
                            alt84=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 84, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_ML_COMMENT:
                    case RULE_XLABEL:
                    case 19:
                    case 26:
                    case 29:
                        {
                        alt84=1;
                        }
                        break;
                    case RULE_SL_COMMENT:
                        {
                        alt84=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA84_0==RULE_ML_COMMENT) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalXMachine.g:2730:3: this_XGuardNoComment_0= ruleXGuardNoComment
                    {

                    			newCompositeNode(grammarAccess.getXGuardAccess().getXGuardNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XGuardNoComment_0=ruleXGuardNoComment();

                    state._fsp--;


                    			current = this_XGuardNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2739:3: this_XGuardMLComment_1= ruleXGuardMLComment
                    {

                    			newCompositeNode(grammarAccess.getXGuardAccess().getXGuardMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XGuardMLComment_1=ruleXGuardMLComment();

                    state._fsp--;


                    			current = this_XGuardMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2748:3: this_XGuardSLComment_2= ruleXGuardSLComment
                    {

                    			newCompositeNode(grammarAccess.getXGuardAccess().getXGuardSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XGuardSLComment_2=ruleXGuardSLComment();

                    state._fsp--;


                    			current = this_XGuardSLComment_2;
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
    // $ANTLR end "ruleXGuard"


    // $ANTLR start "entryRuleXGuardNoComment"
    // InternalXMachine.g:2760:1: entryRuleXGuardNoComment returns [EObject current=null] : iv_ruleXGuardNoComment= ruleXGuardNoComment EOF ;
    public final EObject entryRuleXGuardNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardNoComment = null;


        try {
            // InternalXMachine.g:2760:56: (iv_ruleXGuardNoComment= ruleXGuardNoComment EOF )
            // InternalXMachine.g:2761:2: iv_ruleXGuardNoComment= ruleXGuardNoComment EOF
            {
             newCompositeNode(grammarAccess.getXGuardNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXGuardNoComment=ruleXGuardNoComment();

            state._fsp--;

             current =iv_ruleXGuardNoComment; 
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
    // $ANTLR end "entryRuleXGuardNoComment"


    // $ANTLR start "ruleXGuardNoComment"
    // InternalXMachine.g:2767:1: ruleXGuardNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuardNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2773:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:2774:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:2774:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:2775:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:2775:3: ()
            // InternalXMachine.g:2776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardNoCommentAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2782:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:2783:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:2783:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:2784:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXGuardNoCommentAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:2800:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:2801:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:2801:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:2802:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXGuardNoCommentAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXGuardNoCommentRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:2819:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==24) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalXMachine.g:2820:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:2820:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:2821:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXGuardNoCommentAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardNoCommentRule());
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
    // $ANTLR end "ruleXGuardNoComment"


    // $ANTLR start "entryRuleXGuardMLComment"
    // InternalXMachine.g:2837:1: entryRuleXGuardMLComment returns [EObject current=null] : iv_ruleXGuardMLComment= ruleXGuardMLComment EOF ;
    public final EObject entryRuleXGuardMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardMLComment = null;


        try {
            // InternalXMachine.g:2837:56: (iv_ruleXGuardMLComment= ruleXGuardMLComment EOF )
            // InternalXMachine.g:2838:2: iv_ruleXGuardMLComment= ruleXGuardMLComment EOF
            {
             newCompositeNode(grammarAccess.getXGuardMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXGuardMLComment=ruleXGuardMLComment();

            state._fsp--;

             current =iv_ruleXGuardMLComment; 
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
    // $ANTLR end "entryRuleXGuardMLComment"


    // $ANTLR start "ruleXGuardMLComment"
    // InternalXMachine.g:2844:1: ruleXGuardMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuardMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_theorem_4_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2850:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) )
            // InternalXMachine.g:2851:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:2851:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            // InternalXMachine.g:2852:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ( (lv_theorem_4_0= 'theorem' ) )?
            {
            // InternalXMachine.g:2852:3: ()
            // InternalXMachine.g:2853:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardMLCommentAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2859:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:2860:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:2860:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:2861:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_22); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXGuardMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXMachine.g:2877:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:2878:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:2878:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:2879:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXGuardMLCommentAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:2895:3: ( (lv_predicate_3_0= ruleXPredicate ) )
            // InternalXMachine.g:2896:4: (lv_predicate_3_0= ruleXPredicate )
            {
            // InternalXMachine.g:2896:4: (lv_predicate_3_0= ruleXPredicate )
            // InternalXMachine.g:2897:5: lv_predicate_3_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXGuardMLCommentAccess().getPredicateXPredicateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_predicate_3_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXGuardMLCommentRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:2914:3: ( (lv_theorem_4_0= 'theorem' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==24) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalXMachine.g:2915:4: (lv_theorem_4_0= 'theorem' )
                    {
                    // InternalXMachine.g:2915:4: (lv_theorem_4_0= 'theorem' )
                    // InternalXMachine.g:2916:5: lv_theorem_4_0= 'theorem'
                    {
                    lv_theorem_4_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_theorem_4_0, grammarAccess.getXGuardMLCommentAccess().getTheoremTheoremKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardMLCommentRule());
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
    // $ANTLR end "ruleXGuardMLComment"


    // $ANTLR start "entryRuleXGuardSLComment"
    // InternalXMachine.g:2932:1: entryRuleXGuardSLComment returns [EObject current=null] : iv_ruleXGuardSLComment= ruleXGuardSLComment EOF ;
    public final EObject entryRuleXGuardSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardSLComment = null;


        try {
            // InternalXMachine.g:2932:56: (iv_ruleXGuardSLComment= ruleXGuardSLComment EOF )
            // InternalXMachine.g:2933:2: iv_ruleXGuardSLComment= ruleXGuardSLComment EOF
            {
             newCompositeNode(grammarAccess.getXGuardSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXGuardSLComment=ruleXGuardSLComment();

            state._fsp--;

             current =iv_ruleXGuardSLComment; 
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
    // $ANTLR end "entryRuleXGuardSLComment"


    // $ANTLR start "ruleXGuardSLComment"
    // InternalXMachine.g:2939:1: ruleXGuardSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXGuardSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        Token lv_comment_4_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2945:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:2946:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:2946:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:2947:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:2947:3: ()
            // InternalXMachine.g:2948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardSLCommentAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2954:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:2955:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:2955:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:2956:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXGuardSLCommentAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:2972:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:2973:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:2973:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:2974:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXGuardSLCommentAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXGuardSLCommentRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:2991:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==24) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalXMachine.g:2992:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:2992:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:2993:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,24,FOLLOW_19); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXGuardSLCommentAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardSLCommentRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:3005:3: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:3006:4: (lv_comment_4_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3006:4: (lv_comment_4_0= RULE_SL_COMMENT )
            // InternalXMachine.g:3007:5: lv_comment_4_0= RULE_SL_COMMENT
            {
            lv_comment_4_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_4_0, grammarAccess.getXGuardSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardSLCommentRule());
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
    // $ANTLR end "ruleXGuardSLComment"


    // $ANTLR start "entryRuleXWitness"
    // InternalXMachine.g:3027:1: entryRuleXWitness returns [EObject current=null] : iv_ruleXWitness= ruleXWitness EOF ;
    public final EObject entryRuleXWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitness = null;


        try {
            // InternalXMachine.g:3027:49: (iv_ruleXWitness= ruleXWitness EOF )
            // InternalXMachine.g:3028:2: iv_ruleXWitness= ruleXWitness EOF
            {
             newCompositeNode(grammarAccess.getXWitnessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXWitness=ruleXWitness();

            state._fsp--;

             current =iv_ruleXWitness; 
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
    // $ANTLR end "entryRuleXWitness"


    // $ANTLR start "ruleXWitness"
    // InternalXMachine.g:3034:1: ruleXWitness returns [EObject current=null] : (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment ) ;
    public final EObject ruleXWitness() throws RecognitionException {
        EObject current = null;

        EObject this_XWitnessNoComment_0 = null;

        EObject this_XWitnessMLComment_1 = null;

        EObject this_XWitnessSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3040:2: ( (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment ) )
            // InternalXMachine.g:3041:2: (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment )
            {
            // InternalXMachine.g:3041:2: (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment )
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_XLABEL) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==RULE_STRING) ) {
                    int LA88_3 = input.LA(3);

                    if ( (LA88_3==RULE_SL_COMMENT) ) {
                        alt88=3;
                    }
                    else if ( (LA88_3==EOF||LA88_3==RULE_ML_COMMENT||LA88_3==RULE_XLABEL||LA88_3==19||LA88_3==27||LA88_3==29) ) {
                        alt88=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA88_0==RULE_ML_COMMENT) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalXMachine.g:3042:3: this_XWitnessNoComment_0= ruleXWitnessNoComment
                    {

                    			newCompositeNode(grammarAccess.getXWitnessAccess().getXWitnessNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XWitnessNoComment_0=ruleXWitnessNoComment();

                    state._fsp--;


                    			current = this_XWitnessNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3051:3: this_XWitnessMLComment_1= ruleXWitnessMLComment
                    {

                    			newCompositeNode(grammarAccess.getXWitnessAccess().getXWitnessMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XWitnessMLComment_1=ruleXWitnessMLComment();

                    state._fsp--;


                    			current = this_XWitnessMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:3060:3: this_XWitnessSLComment_2= ruleXWitnessSLComment
                    {

                    			newCompositeNode(grammarAccess.getXWitnessAccess().getXWitnessSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XWitnessSLComment_2=ruleXWitnessSLComment();

                    state._fsp--;


                    			current = this_XWitnessSLComment_2;
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
    // $ANTLR end "ruleXWitness"


    // $ANTLR start "entryRuleXWitnessNoComment"
    // InternalXMachine.g:3072:1: entryRuleXWitnessNoComment returns [EObject current=null] : iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF ;
    public final EObject entryRuleXWitnessNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessNoComment = null;


        try {
            // InternalXMachine.g:3072:58: (iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF )
            // InternalXMachine.g:3073:2: iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF
            {
             newCompositeNode(grammarAccess.getXWitnessNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXWitnessNoComment=ruleXWitnessNoComment();

            state._fsp--;

             current =iv_ruleXWitnessNoComment; 
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
    // $ANTLR end "entryRuleXWitnessNoComment"


    // $ANTLR start "ruleXWitnessNoComment"
    // InternalXMachine.g:3079:1: ruleXWitnessNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXWitnessNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3085:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:3086:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:3086:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) )
            // InternalXMachine.g:3087:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:3087:3: ()
            // InternalXMachine.g:3088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessNoCommentAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3094:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3095:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3095:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3096:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXWitnessNoCommentAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3112:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:3113:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:3113:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:3114:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXWitnessNoCommentAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXWitnessNoCommentRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleXWitnessNoComment"


    // $ANTLR start "entryRuleXWitnessMLComment"
    // InternalXMachine.g:3135:1: entryRuleXWitnessMLComment returns [EObject current=null] : iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF ;
    public final EObject entryRuleXWitnessMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessMLComment = null;


        try {
            // InternalXMachine.g:3135:58: (iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF )
            // InternalXMachine.g:3136:2: iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF
            {
             newCompositeNode(grammarAccess.getXWitnessMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXWitnessMLComment=ruleXWitnessMLComment();

            state._fsp--;

             current =iv_ruleXWitnessMLComment; 
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
    // $ANTLR end "entryRuleXWitnessMLComment"


    // $ANTLR start "ruleXWitnessMLComment"
    // InternalXMachine.g:3142:1: ruleXWitnessMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXWitnessMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3148:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:3149:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:3149:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) ) )
            // InternalXMachine.g:3150:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:3150:3: ()
            // InternalXMachine.g:3151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessMLCommentAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3157:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:3158:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3158:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:3159:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_22); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXWitnessMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXMachine.g:3175:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:3176:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3176:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:3177:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXWitnessMLCommentAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3193:3: ( (lv_predicate_3_0= ruleXPredicate ) )
            // InternalXMachine.g:3194:4: (lv_predicate_3_0= ruleXPredicate )
            {
            // InternalXMachine.g:3194:4: (lv_predicate_3_0= ruleXPredicate )
            // InternalXMachine.g:3195:5: lv_predicate_3_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXWitnessMLCommentAccess().getPredicateXPredicateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_3_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXWitnessMLCommentRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleXWitnessMLComment"


    // $ANTLR start "entryRuleXWitnessSLComment"
    // InternalXMachine.g:3216:1: entryRuleXWitnessSLComment returns [EObject current=null] : iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF ;
    public final EObject entryRuleXWitnessSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessSLComment = null;


        try {
            // InternalXMachine.g:3216:58: (iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF )
            // InternalXMachine.g:3217:2: iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF
            {
             newCompositeNode(grammarAccess.getXWitnessSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXWitnessSLComment=ruleXWitnessSLComment();

            state._fsp--;

             current =iv_ruleXWitnessSLComment; 
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
    // $ANTLR end "entryRuleXWitnessSLComment"


    // $ANTLR start "ruleXWitnessSLComment"
    // InternalXMachine.g:3223:1: ruleXWitnessSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXWitnessSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3229:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:3230:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:3230:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:3231:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:3231:3: ()
            // InternalXMachine.g:3232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessSLCommentAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3238:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3239:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3239:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3240:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXWitnessSLCommentAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3256:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalXMachine.g:3257:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:3257:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalXMachine.g:3258:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXWitnessSLCommentAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXWitnessSLCommentRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:3275:3: ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:3276:4: (lv_comment_3_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3276:4: (lv_comment_3_0= RULE_SL_COMMENT )
            // InternalXMachine.g:3277:5: lv_comment_3_0= RULE_SL_COMMENT
            {
            lv_comment_3_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_3_0, grammarAccess.getXWitnessSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_3_0,
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
    // $ANTLR end "ruleXWitnessSLComment"


    // $ANTLR start "entryRuleXAction"
    // InternalXMachine.g:3297:1: entryRuleXAction returns [EObject current=null] : iv_ruleXAction= ruleXAction EOF ;
    public final EObject entryRuleXAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAction = null;


        try {
            // InternalXMachine.g:3297:48: (iv_ruleXAction= ruleXAction EOF )
            // InternalXMachine.g:3298:2: iv_ruleXAction= ruleXAction EOF
            {
             newCompositeNode(grammarAccess.getXActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXAction=ruleXAction();

            state._fsp--;

             current =iv_ruleXAction; 
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
    // $ANTLR end "entryRuleXAction"


    // $ANTLR start "ruleXAction"
    // InternalXMachine.g:3304:1: ruleXAction returns [EObject current=null] : (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment ) ;
    public final EObject ruleXAction() throws RecognitionException {
        EObject current = null;

        EObject this_XActionNoComment_0 = null;

        EObject this_XActionMLComment_1 = null;

        EObject this_XActionSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3310:2: ( (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment ) )
            // InternalXMachine.g:3311:2: (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment )
            {
            // InternalXMachine.g:3311:2: (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment )
            int alt89=3;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_XLABEL) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==RULE_STRING) ) {
                    int LA89_3 = input.LA(3);

                    if ( (LA89_3==EOF||LA89_3==RULE_ML_COMMENT||LA89_3==RULE_XLABEL||LA89_3==19) ) {
                        alt89=1;
                    }
                    else if ( (LA89_3==RULE_SL_COMMENT) ) {
                        alt89=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA89_0==RULE_ML_COMMENT) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalXMachine.g:3312:3: this_XActionNoComment_0= ruleXActionNoComment
                    {

                    			newCompositeNode(grammarAccess.getXActionAccess().getXActionNoCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XActionNoComment_0=ruleXActionNoComment();

                    state._fsp--;


                    			current = this_XActionNoComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3321:3: this_XActionMLComment_1= ruleXActionMLComment
                    {

                    			newCompositeNode(grammarAccess.getXActionAccess().getXActionMLCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XActionMLComment_1=ruleXActionMLComment();

                    state._fsp--;


                    			current = this_XActionMLComment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:3330:3: this_XActionSLComment_2= ruleXActionSLComment
                    {

                    			newCompositeNode(grammarAccess.getXActionAccess().getXActionSLCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XActionSLComment_2=ruleXActionSLComment();

                    state._fsp--;


                    			current = this_XActionSLComment_2;
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
    // $ANTLR end "ruleXAction"


    // $ANTLR start "entryRuleXActionNoComment"
    // InternalXMachine.g:3342:1: entryRuleXActionNoComment returns [EObject current=null] : iv_ruleXActionNoComment= ruleXActionNoComment EOF ;
    public final EObject entryRuleXActionNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionNoComment = null;


        try {
            // InternalXMachine.g:3342:57: (iv_ruleXActionNoComment= ruleXActionNoComment EOF )
            // InternalXMachine.g:3343:2: iv_ruleXActionNoComment= ruleXActionNoComment EOF
            {
             newCompositeNode(grammarAccess.getXActionNoCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXActionNoComment=ruleXActionNoComment();

            state._fsp--;

             current =iv_ruleXActionNoComment; 
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
    // $ANTLR end "entryRuleXActionNoComment"


    // $ANTLR start "ruleXActionNoComment"
    // InternalXMachine.g:3349:1: ruleXActionNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXActionNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3355:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:3356:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:3356:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) )
            // InternalXMachine.g:3357:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:3357:3: ()
            // InternalXMachine.g:3358:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionNoCommentAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3364:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3365:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3365:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3366:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXActionNoCommentAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3382:3: ( (lv_action_2_0= ruleXPredicate ) )
            // InternalXMachine.g:3383:4: (lv_action_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:3383:4: (lv_action_2_0= ruleXPredicate )
            // InternalXMachine.g:3384:5: lv_action_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXActionNoCommentAccess().getActionXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXActionNoCommentRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleXActionNoComment"


    // $ANTLR start "entryRuleXActionMLComment"
    // InternalXMachine.g:3405:1: entryRuleXActionMLComment returns [EObject current=null] : iv_ruleXActionMLComment= ruleXActionMLComment EOF ;
    public final EObject entryRuleXActionMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionMLComment = null;


        try {
            // InternalXMachine.g:3405:57: (iv_ruleXActionMLComment= ruleXActionMLComment EOF )
            // InternalXMachine.g:3406:2: iv_ruleXActionMLComment= ruleXActionMLComment EOF
            {
             newCompositeNode(grammarAccess.getXActionMLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXActionMLComment=ruleXActionMLComment();

            state._fsp--;

             current =iv_ruleXActionMLComment; 
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
    // $ANTLR end "entryRuleXActionMLComment"


    // $ANTLR start "ruleXActionMLComment"
    // InternalXMachine.g:3412:1: ruleXActionMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXPredicate ) ) ) ;
    public final EObject ruleXActionMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3418:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXPredicate ) ) ) )
            // InternalXMachine.g:3419:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXPredicate ) ) )
            {
            // InternalXMachine.g:3419:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXPredicate ) ) )
            // InternalXMachine.g:3420:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXPredicate ) )
            {
            // InternalXMachine.g:3420:3: ()
            // InternalXMachine.g:3421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionMLCommentAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3427:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:3428:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3428:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:3429:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_22); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getXActionMLCommentAccess().getCommentML_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
            				

            }


            }

            // InternalXMachine.g:3445:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:3446:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3446:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:3447:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXActionMLCommentAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3463:3: ( (lv_action_3_0= ruleXPredicate ) )
            // InternalXMachine.g:3464:4: (lv_action_3_0= ruleXPredicate )
            {
            // InternalXMachine.g:3464:4: (lv_action_3_0= ruleXPredicate )
            // InternalXMachine.g:3465:5: lv_action_3_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXActionMLCommentAccess().getActionXPredicateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_3_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXActionMLCommentRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleXActionMLComment"


    // $ANTLR start "entryRuleXActionSLComment"
    // InternalXMachine.g:3486:1: entryRuleXActionSLComment returns [EObject current=null] : iv_ruleXActionSLComment= ruleXActionSLComment EOF ;
    public final EObject entryRuleXActionSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionSLComment = null;


        try {
            // InternalXMachine.g:3486:57: (iv_ruleXActionSLComment= ruleXActionSLComment EOF )
            // InternalXMachine.g:3487:2: iv_ruleXActionSLComment= ruleXActionSLComment EOF
            {
             newCompositeNode(grammarAccess.getXActionSLCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXActionSLComment=ruleXActionSLComment();

            state._fsp--;

             current =iv_ruleXActionSLComment; 
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
    // $ANTLR end "entryRuleXActionSLComment"


    // $ANTLR start "ruleXActionSLComment"
    // InternalXMachine.g:3493:1: ruleXActionSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXActionSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_3_0=null;
        AntlrDatatypeRuleToken lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3499:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:3500:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:3500:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:3501:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:3501:3: ()
            // InternalXMachine.g:3502:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionSLCommentAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3508:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3509:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3509:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3510:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXActionSLCommentAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3526:3: ( (lv_action_2_0= ruleXPredicate ) )
            // InternalXMachine.g:3527:4: (lv_action_2_0= ruleXPredicate )
            {
            // InternalXMachine.g:3527:4: (lv_action_2_0= ruleXPredicate )
            // InternalXMachine.g:3528:5: lv_action_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getXActionSLCommentAccess().getActionXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_action_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXActionSLCommentRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:3545:3: ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:3546:4: (lv_comment_3_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3546:4: (lv_comment_3_0= RULE_SL_COMMENT )
            // InternalXMachine.g:3547:5: lv_comment_3_0= RULE_SL_COMMENT
            {
            lv_comment_3_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_3_0, grammarAccess.getXActionSLCommentAccess().getCommentSL_COMMENTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_3_0,
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
    // $ANTLR end "ruleXActionSLComment"


    // $ANTLR start "entryRuleXPredicate"
    // InternalXMachine.g:3567:1: entryRuleXPredicate returns [String current=null] : iv_ruleXPredicate= ruleXPredicate EOF ;
    public final String entryRuleXPredicate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXPredicate = null;


        try {
            // InternalXMachine.g:3567:50: (iv_ruleXPredicate= ruleXPredicate EOF )
            // InternalXMachine.g:3568:2: iv_ruleXPredicate= ruleXPredicate EOF
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
    // InternalXMachine.g:3574:1: ruleXPredicate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleXPredicate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:3580:2: (this_STRING_0= RULE_STRING )
            // InternalXMachine.g:3581:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:3591:1: ruleXConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleXConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:3597:2: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalXMachine.g:3598:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalXMachine.g:3598:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt90=1;
                }
                break;
            case 34:
                {
                alt90=2;
                }
                break;
            case 35:
                {
                alt90=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalXMachine.g:3599:3: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalXMachine.g:3599:3: (enumLiteral_0= 'ordinary' )
                    // InternalXMachine.g:3600:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3607:3: (enumLiteral_1= 'convergent' )
                    {
                    // InternalXMachine.g:3607:3: (enumLiteral_1= 'convergent' )
                    // InternalXMachine.g:3608:4: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:3615:3: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalXMachine.g:3615:3: (enumLiteral_2= 'anticipated' )
                    // InternalXMachine.g:3616:4: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleXConvergence"

    // Delegated rules


    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\4\1\5\1\uffff\4\5\2\uffff";
    static final String dfa_3s = "\1\6\1\43\1\uffff\4\43\2\uffff";
    static final String dfa_4s = "\2\uffff\1\2\4\uffff\1\3\1\1";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\1",
            "\1\7\7\uffff\1\10\5\uffff\1\10\5\uffff\1\3\3\10\1\uffff\1\10\1\uffff\1\10\1\4\1\5\1\6",
            "",
            "\1\7\7\uffff\1\10\5\uffff\1\10\5\uffff\1\3\3\10\1\uffff\1\10\1\uffff\1\10\1\4\1\5\1\6",
            "\1\7\7\uffff\1\10\5\uffff\1\10\5\uffff\1\3\3\10\1\uffff\1\10\1\uffff\1\10\1\4\1\5\1\6",
            "\1\7\7\uffff\1\10\5\uffff\1\10\5\uffff\1\3\3\10\1\uffff\1\10\1\uffff\1\10\1\4\1\5\1\6",
            "\1\7\7\uffff\1\10\5\uffff\1\10\5\uffff\1\3\3\10\1\uffff\1\10\1\uffff\1\10\1\4\1\5\1\6",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1232:2: (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001FE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F8040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000F0050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E0090L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000F5E082000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000015C082000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000005C080040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000090L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080090L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000024080090L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020080090L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000050L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000E02000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000800000L});

}
