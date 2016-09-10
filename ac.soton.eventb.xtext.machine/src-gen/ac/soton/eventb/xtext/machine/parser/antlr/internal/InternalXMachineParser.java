package ac.soton.eventb.xtext.machine.parser.antlr.internal;

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
import ac.soton.eventb.xtext.machine.services.XMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'end'", "'@'", "'theorem'", "'extended'", "'with'", "'begin'", "'when'", "'then'", "'any'", "'where'", "'ordinary'", "'convergent'", "'anticipated'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
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
        	return "XMachine";
       	}

       	@Override
       	protected XMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleXMachine"
    // InternalXMachine.g:65:1: entryRuleXMachine returns [EObject current=null] : iv_ruleXMachine= ruleXMachine EOF ;
    public final EObject entryRuleXMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMachine = null;


        try {
            // InternalXMachine.g:65:49: (iv_ruleXMachine= ruleXMachine EOF )
            // InternalXMachine.g:66:2: iv_ruleXMachine= ruleXMachine EOF
            {
             newCompositeNode(grammarAccess.getXMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXMachine=ruleXMachine();

            state._fsp--;

             current =iv_ruleXMachine; 
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
    // $ANTLR end "entryRuleXMachine"


    // $ANTLR start "ruleXMachine"
    // InternalXMachine.g:72:1: ruleXMachine returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) )+ )? otherlv_16= 'end' ) ;
    public final EObject ruleXMachine() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_variables_9_0 = null;

        EObject lv_invariants_11_0 = null;

        EObject lv_variant_13_0 = null;

        EObject lv_events_15_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:78:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) )+ )? otherlv_16= 'end' ) )
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) )+ )? otherlv_16= 'end' )
            {
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) )+ )? otherlv_16= 'end' )
            // InternalXMachine.g:80:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) )+ )? otherlv_16= 'end'
            {
            // InternalXMachine.g:80:3: ()
            // InternalXMachine.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXMachineAccess().getMachineAction_0(),
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

                            						newLeafNode(lv_comment_1_1, grammarAccess.getXMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXMachineRule());
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

                            						newLeafNode(lv_comment_1_2, grammarAccess.getXMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXMachineRule());
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

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXMachineAccess().getMachineKeyword_2());
            		
            // InternalXMachine.g:126:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:127:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:127:4: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:128:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXMachineAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:144:3: (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:145:4: otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getXMachineAccess().getRefinesKeyword_4_0());
                    			
                    // InternalXMachine.g:149:4: ( (otherlv_5= RULE_ID ) )
                    // InternalXMachine.g:150:5: (otherlv_5= RULE_ID )
                    {
                    // InternalXMachine.g:150:5: (otherlv_5= RULE_ID )
                    // InternalXMachine.g:151:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXMachineRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_5, grammarAccess.getXMachineAccess().getRefinesMachineCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:163:3: (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:164:4: otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getXMachineAccess().getSeesKeyword_5_0());
                    			
                    // InternalXMachine.g:168:4: ( (otherlv_7= RULE_ID ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalXMachine.g:169:5: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:169:5: (otherlv_7= RULE_ID )
                    	    // InternalXMachine.g:170:6: otherlv_7= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXMachineRule());
                    	    						}
                    	    					
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getXMachineAccess().getSeesContextCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:182:3: (otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:183:4: otherlv_8= 'variables' ( (lv_variables_9_0= ruleXVariable ) )+
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getXMachineAccess().getVariablesKeyword_6_0());
                    			
                    // InternalXMachine.g:187:4: ( (lv_variables_9_0= ruleXVariable ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_ML_COMMENT && LA6_0<=RULE_ID)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXMachine.g:188:5: (lv_variables_9_0= ruleXVariable )
                    	    {
                    	    // InternalXMachine.g:188:5: (lv_variables_9_0= ruleXVariable )
                    	    // InternalXMachine.g:189:6: lv_variables_9_0= ruleXVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getXMachineAccess().getVariablesXVariableParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_variables_9_0=ruleXVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_9_0,
                    	    							"ac.soton.eventb.xtext.machine.XMachine.XVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:207:3: (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:208:4: otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleXInvariant ) )+
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getXMachineAccess().getInvariantsKeyword_7_0());
                    			
                    // InternalXMachine.g:212:4: ( (lv_invariants_11_0= ruleXInvariant ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_ML_COMMENT && LA8_0<=RULE_SL_COMMENT)||LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalXMachine.g:213:5: (lv_invariants_11_0= ruleXInvariant )
                    	    {
                    	    // InternalXMachine.g:213:5: (lv_invariants_11_0= ruleXInvariant )
                    	    // InternalXMachine.g:214:6: lv_invariants_11_0= ruleXInvariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getXMachineAccess().getInvariantsXInvariantParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_invariants_11_0=ruleXInvariant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"invariants",
                    	    							lv_invariants_11_0,
                    	    							"ac.soton.eventb.xtext.machine.XMachine.XInvariant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:232:3: (otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:233:4: otherlv_12= 'variant' ( (lv_variant_13_0= ruleXVariant ) )
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getXMachineAccess().getVariantKeyword_8_0());
                    			
                    // InternalXMachine.g:237:4: ( (lv_variant_13_0= ruleXVariant ) )
                    // InternalXMachine.g:238:5: (lv_variant_13_0= ruleXVariant )
                    {
                    // InternalXMachine.g:238:5: (lv_variant_13_0= ruleXVariant )
                    // InternalXMachine.g:239:6: lv_variant_13_0= ruleXVariant
                    {

                    						newCompositeNode(grammarAccess.getXMachineAccess().getVariantXVariantParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_variant_13_0=ruleXVariant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXMachineRule());
                    						}
                    						set(
                    							current,
                    							"variant",
                    							lv_variant_13_0,
                    							"ac.soton.eventb.xtext.machine.XMachine.XVariant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:257:3: (otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) )+ )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXMachine.g:258:4: otherlv_14= 'events' ( (lv_events_15_0= ruleXEvent ) )+
                    {
                    otherlv_14=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getXMachineAccess().getEventsKeyword_9_0());
                    			
                    // InternalXMachine.g:262:4: ( (lv_events_15_0= ruleXEvent ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_ML_COMMENT && LA11_0<=RULE_ID)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalXMachine.g:263:5: (lv_events_15_0= ruleXEvent )
                    	    {
                    	    // InternalXMachine.g:263:5: (lv_events_15_0= ruleXEvent )
                    	    // InternalXMachine.g:264:6: lv_events_15_0= ruleXEvent
                    	    {

                    	    						newCompositeNode(grammarAccess.getXMachineAccess().getEventsXEventParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_events_15_0=ruleXEvent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"events",
                    	    							lv_events_15_0,
                    	    							"ac.soton.eventb.xtext.machine.XMachine.XEvent");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getXMachineAccess().getEndKeyword_10());
            		

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
    // $ANTLR end "ruleXMachine"


    // $ANTLR start "entryRuleXVariable"
    // InternalXMachine.g:290:1: entryRuleXVariable returns [EObject current=null] : iv_ruleXVariable= ruleXVariable EOF ;
    public final EObject entryRuleXVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariable = null;


        try {
            // InternalXMachine.g:290:50: (iv_ruleXVariable= ruleXVariable EOF )
            // InternalXMachine.g:291:2: iv_ruleXVariable= ruleXVariable EOF
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
    // InternalXMachine.g:297:1: ruleXVariable returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariable() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:303:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:304:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:304:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:305:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:305:3: ()
            // InternalXMachine.g:306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:312:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ML_COMMENT && LA14_0<=RULE_SL_COMMENT)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:313:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:313:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:314:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:314:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ML_COMMENT) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_SL_COMMENT) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalXMachine.g:315:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_4); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getXVariableAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXVariableRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:330:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_4); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getXVariableAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXVariableRule());
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

            // InternalXMachine.g:347:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:348:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:348:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:349:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariableRule());
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
    // $ANTLR end "ruleXVariable"


    // $ANTLR start "entryRuleXInvariant"
    // InternalXMachine.g:369:1: entryRuleXInvariant returns [EObject current=null] : iv_ruleXInvariant= ruleXInvariant EOF ;
    public final EObject entryRuleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariant = null;


        try {
            // InternalXMachine.g:369:51: (iv_ruleXInvariant= ruleXInvariant EOF )
            // InternalXMachine.g:370:2: iv_ruleXInvariant= ruleXInvariant EOF
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
    // InternalXMachine.g:376:1: ruleXInvariant returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_theorem_5_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_predicate_4_0=null;
        Token lv_theorem_5_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:382:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_theorem_5_0= 'theorem' ) )? ) )
            // InternalXMachine.g:383:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_theorem_5_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:383:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_theorem_5_0= 'theorem' ) )? )
            // InternalXMachine.g:384:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_theorem_5_0= 'theorem' ) )?
            {
            // InternalXMachine.g:384:3: ()
            // InternalXMachine.g:385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:391:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ML_COMMENT && LA16_0<=RULE_SL_COMMENT)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:392:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:392:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:393:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:393:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ML_COMMENT) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_SL_COMMENT) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalXMachine.g:394:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_15); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getXInvariantAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXInvariantRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:409:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_15); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getXInvariantAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXInvariantRule());
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

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXInvariantAccess().getCommercialAtKeyword_2());
            		
            // InternalXMachine.g:430:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:431:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:431:4: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:432:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXInvariantAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:448:3: ( (lv_predicate_4_0= RULE_STRING ) )
            // InternalXMachine.g:449:4: (lv_predicate_4_0= RULE_STRING )
            {
            // InternalXMachine.g:449:4: (lv_predicate_4_0= RULE_STRING )
            // InternalXMachine.g:450:5: lv_predicate_4_0= RULE_STRING
            {
            lv_predicate_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_predicate_4_0, grammarAccess.getXInvariantAccess().getPredicateSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:466:3: ( (lv_theorem_5_0= 'theorem' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:467:4: (lv_theorem_5_0= 'theorem' )
                    {
                    // InternalXMachine.g:467:4: (lv_theorem_5_0= 'theorem' )
                    // InternalXMachine.g:468:5: lv_theorem_5_0= 'theorem'
                    {
                    lv_theorem_5_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_theorem_5_0, grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXInvariantRule());
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
    // $ANTLR end "ruleXInvariant"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:484:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:484:49: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:485:2: iv_ruleXVariant= ruleXVariant EOF
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
    // InternalXMachine.g:491:1: ruleXVariant returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_expression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token lv_expression_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:497:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_expression_2_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:498:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_expression_2_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:498:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_expression_2_0= RULE_STRING ) ) )
            // InternalXMachine.g:499:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_expression_2_0= RULE_STRING ) )
            {
            // InternalXMachine.g:499:3: ()
            // InternalXMachine.g:500:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:506:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ML_COMMENT && LA19_0<=RULE_SL_COMMENT)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:507:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:507:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:508:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:508:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ML_COMMENT) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==RULE_SL_COMMENT) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalXMachine.g:509:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_16); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getXVariantAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXVariantRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:524:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_16); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getXVariantAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXVariantRule());
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

            // InternalXMachine.g:541:3: ( (lv_expression_2_0= RULE_STRING ) )
            // InternalXMachine.g:542:4: (lv_expression_2_0= RULE_STRING )
            {
            // InternalXMachine.g:542:4: (lv_expression_2_0= RULE_STRING )
            // InternalXMachine.g:543:5: lv_expression_2_0= RULE_STRING
            {
            lv_expression_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_expression_2_0, grammarAccess.getXVariantAccess().getExpressionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleXVariant"


    // $ANTLR start "entryRuleXEvent"
    // InternalXMachine.g:563:1: entryRuleXEvent returns [EObject current=null] : iv_ruleXEvent= ruleXEvent EOF ;
    public final EObject entryRuleXEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEvent = null;


        try {
            // InternalXMachine.g:563:47: (iv_ruleXEvent= ruleXEvent EOF )
            // InternalXMachine.g:564:2: iv_ruleXEvent= ruleXEvent EOF
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
    // InternalXMachine.g:570:1: ruleXEvent returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleXConvergence ) ) (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ )? ( ( (otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+ )? otherlv_9= 'begin' ( (lv_actions_10_0= ruleXAction ) )+ otherlv_11= 'end' ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ otherlv_18= 'end' ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ otherlv_27= 'end' ) )? ) ;
    public final EObject ruleXEvent() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token lv_name_2_0=null;
        Token lv_extended_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Enumerator lv_convergence_4_0 = null;

        EObject lv_witnesses_8_0 = null;

        EObject lv_actions_10_0 = null;

        EObject lv_guards_13_0 = null;

        EObject lv_witnesses_15_0 = null;

        EObject lv_actions_17_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_guards_22_0 = null;

        EObject lv_witnesses_24_0 = null;

        EObject lv_actions_26_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:576:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleXConvergence ) ) (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ )? ( ( (otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+ )? otherlv_9= 'begin' ( (lv_actions_10_0= ruleXAction ) )+ otherlv_11= 'end' ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ otherlv_18= 'end' ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ otherlv_27= 'end' ) )? ) )
            // InternalXMachine.g:577:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleXConvergence ) ) (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ )? ( ( (otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+ )? otherlv_9= 'begin' ( (lv_actions_10_0= ruleXAction ) )+ otherlv_11= 'end' ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ otherlv_18= 'end' ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ otherlv_27= 'end' ) )? )
            {
            // InternalXMachine.g:577:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleXConvergence ) ) (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ )? ( ( (otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+ )? otherlv_9= 'begin' ( (lv_actions_10_0= ruleXAction ) )+ otherlv_11= 'end' ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ otherlv_18= 'end' ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ otherlv_27= 'end' ) )? )
            // InternalXMachine.g:578:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleXConvergence ) ) (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ )? ( ( (otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+ )? otherlv_9= 'begin' ( (lv_actions_10_0= ruleXAction ) )+ otherlv_11= 'end' ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ otherlv_18= 'end' ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ otherlv_27= 'end' ) )?
            {
            // InternalXMachine.g:578:3: ()
            // InternalXMachine.g:579:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:585:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ML_COMMENT && LA21_0<=RULE_SL_COMMENT)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:586:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:586:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:587:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:587:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ML_COMMENT) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_SL_COMMENT) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalXMachine.g:588:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_4); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getXEventAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXEventRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:603:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_4); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getXEventAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXEventRule());
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

            // InternalXMachine.g:620:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:621:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:621:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:622:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:638:3: ( (lv_extended_3_0= 'extended' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:639:4: (lv_extended_3_0= 'extended' )
                    {
                    // InternalXMachine.g:639:4: (lv_extended_3_0= 'extended' )
                    // InternalXMachine.g:640:5: lv_extended_3_0= 'extended'
                    {
                    lv_extended_3_0=(Token)match(input,21,FOLLOW_18); 

                    					newLeafNode(lv_extended_3_0, grammarAccess.getXEventAccess().getExtendedExtendedKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXEventRule());
                    					}
                    					setWithLastConsumed(current, "extended", true, "extended");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:652:3: ( (lv_convergence_4_0= ruleXConvergence ) )
            // InternalXMachine.g:653:4: (lv_convergence_4_0= ruleXConvergence )
            {
            // InternalXMachine.g:653:4: (lv_convergence_4_0= ruleXConvergence )
            // InternalXMachine.g:654:5: lv_convergence_4_0= ruleXConvergence
            {

            					newCompositeNode(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_convergence_4_0=ruleXConvergence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXEventRule());
            					}
            					set(
            						current,
            						"convergence",
            						lv_convergence_4_0,
            						"ac.soton.eventb.xtext.machine.XMachine.XConvergence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMachine.g:671:3: (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:672:4: otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getXEventAccess().getRefinesKeyword_5_0());
                    			
                    // InternalXMachine.g:676:4: ( (otherlv_6= RULE_ID ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            int LA23_2 = input.LA(2);

                            if ( (LA23_2==EOF||(LA23_2>=RULE_ML_COMMENT && LA23_2<=RULE_ID)||LA23_2==18||(LA23_2>=22 && LA23_2<=24)||LA23_2==26) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalXMachine.g:677:5: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:677:5: (otherlv_6= RULE_ID )
                    	    // InternalXMachine.g:678:6: otherlv_6= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXEventRule());
                    	    						}
                    	    					
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:690:3: ( ( (otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+ )? otherlv_9= 'begin' ( (lv_actions_10_0= ruleXAction ) )+ otherlv_11= 'end' ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ otherlv_18= 'end' ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ otherlv_27= 'end' ) )?
            int alt37=4;
            switch ( input.LA(1) ) {
                case 22:
                case 23:
                    {
                    alt37=1;
                    }
                    break;
                case 24:
                    {
                    alt37=2;
                    }
                    break;
                case 26:
                    {
                    alt37=3;
                    }
                    break;
            }

            switch (alt37) {
                case 1 :
                    // InternalXMachine.g:691:4: ( (otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+ )? otherlv_9= 'begin' ( (lv_actions_10_0= ruleXAction ) )+ otherlv_11= 'end' )
                    {
                    // InternalXMachine.g:691:4: ( (otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+ )? otherlv_9= 'begin' ( (lv_actions_10_0= ruleXAction ) )+ otherlv_11= 'end' )
                    // InternalXMachine.g:692:5: (otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+ )? otherlv_9= 'begin' ( (lv_actions_10_0= ruleXAction ) )+ otherlv_11= 'end'
                    {
                    // InternalXMachine.g:692:5: (otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+ )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==22) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalXMachine.g:693:6: otherlv_7= 'with' ( (lv_witnesses_8_0= ruleXWitness ) )+
                            {
                            otherlv_7=(Token)match(input,22,FOLLOW_10); 

                            						newLeafNode(otherlv_7, grammarAccess.getXEventAccess().getWithKeyword_6_0_0_0());
                            					
                            // InternalXMachine.g:697:6: ( (lv_witnesses_8_0= ruleXWitness ) )+
                            int cnt25=0;
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( ((LA25_0>=RULE_ML_COMMENT && LA25_0<=RULE_SL_COMMENT)||LA25_0==19) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalXMachine.g:698:7: (lv_witnesses_8_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:698:7: (lv_witnesses_8_0= ruleXWitness )
                            	    // InternalXMachine.g:699:8: lv_witnesses_8_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_21);
                            	    lv_witnesses_8_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_8_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt25 >= 1 ) break loop25;
                                        EarlyExitException eee =
                                            new EarlyExitException(25, input);
                                        throw eee;
                                }
                                cnt25++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_10); 

                    					newLeafNode(otherlv_9, grammarAccess.getXEventAccess().getBeginKeyword_6_0_1());
                    				
                    // InternalXMachine.g:721:5: ( (lv_actions_10_0= ruleXAction ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=RULE_ML_COMMENT && LA27_0<=RULE_SL_COMMENT)||LA27_0==19) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalXMachine.g:722:6: (lv_actions_10_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:722:6: (lv_actions_10_0= ruleXAction )
                    	    // InternalXMachine.g:723:7: lv_actions_10_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_actions_10_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_10_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XAction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getXEventAccess().getEndKeyword_6_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:746:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ otherlv_18= 'end' )
                    {
                    // InternalXMachine.g:746:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ otherlv_18= 'end' )
                    // InternalXMachine.g:747:5: otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ otherlv_18= 'end'
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_10); 

                    					newLeafNode(otherlv_12, grammarAccess.getXEventAccess().getWhenKeyword_6_1_0());
                    				
                    // InternalXMachine.g:751:5: ( (lv_guards_13_0= ruleXGuard ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_ML_COMMENT && LA28_0<=RULE_SL_COMMENT)||LA28_0==19) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalXMachine.g:752:6: (lv_guards_13_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:752:6: (lv_guards_13_0= ruleXGuard )
                    	    // InternalXMachine.g:753:7: lv_guards_13_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_guards_13_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_13_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    // InternalXMachine.g:770:5: (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==22) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalXMachine.g:771:6: otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+
                            {
                            otherlv_14=(Token)match(input,22,FOLLOW_10); 

                            						newLeafNode(otherlv_14, grammarAccess.getXEventAccess().getWithKeyword_6_1_2_0());
                            					
                            // InternalXMachine.g:775:6: ( (lv_witnesses_15_0= ruleXWitness ) )+
                            int cnt29=0;
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( ((LA29_0>=RULE_ML_COMMENT && LA29_0<=RULE_SL_COMMENT)||LA29_0==19) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalXMachine.g:776:7: (lv_witnesses_15_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:776:7: (lv_witnesses_15_0= ruleXWitness )
                            	    // InternalXMachine.g:777:8: lv_witnesses_15_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_24);
                            	    lv_witnesses_15_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_15_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
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

                    otherlv_16=(Token)match(input,25,FOLLOW_10); 

                    					newLeafNode(otherlv_16, grammarAccess.getXEventAccess().getThenKeyword_6_1_3());
                    				
                    // InternalXMachine.g:799:5: ( (lv_actions_17_0= ruleXAction ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=RULE_ML_COMMENT && LA31_0<=RULE_SL_COMMENT)||LA31_0==19) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalXMachine.g:800:6: (lv_actions_17_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:800:6: (lv_actions_17_0= ruleXAction )
                    	    // InternalXMachine.g:801:7: lv_actions_17_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_1_4_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_actions_17_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_17_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XAction");
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

                    otherlv_18=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_18, grammarAccess.getXEventAccess().getEndKeyword_6_1_5());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:824:4: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ otherlv_27= 'end' )
                    {
                    // InternalXMachine.g:824:4: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ otherlv_27= 'end' )
                    // InternalXMachine.g:825:5: otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ otherlv_27= 'end'
                    {
                    otherlv_19=(Token)match(input,26,FOLLOW_8); 

                    					newLeafNode(otherlv_19, grammarAccess.getXEventAccess().getAnyKeyword_6_2_0());
                    				
                    // InternalXMachine.g:829:5: ( (lv_parameters_20_0= ruleXParameter ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=RULE_ML_COMMENT && LA32_0<=RULE_ID)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalXMachine.g:830:6: (lv_parameters_20_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:830:6: (lv_parameters_20_0= ruleXParameter )
                    	    // InternalXMachine.g:831:7: lv_parameters_20_0= ruleXParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_parameters_20_0=ruleXParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_20_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XParameter");
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

                    otherlv_21=(Token)match(input,27,FOLLOW_10); 

                    					newLeafNode(otherlv_21, grammarAccess.getXEventAccess().getWhereKeyword_6_2_2());
                    				
                    // InternalXMachine.g:852:5: ( (lv_guards_22_0= ruleXGuard ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=RULE_ML_COMMENT && LA33_0<=RULE_SL_COMMENT)||LA33_0==19) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalXMachine.g:853:6: (lv_guards_22_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:853:6: (lv_guards_22_0= ruleXGuard )
                    	    // InternalXMachine.g:854:7: lv_guards_22_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_6_2_3_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_guards_22_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_22_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XGuard");
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

                    // InternalXMachine.g:871:5: (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==22) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalXMachine.g:872:6: otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+
                            {
                            otherlv_23=(Token)match(input,22,FOLLOW_10); 

                            						newLeafNode(otherlv_23, grammarAccess.getXEventAccess().getWithKeyword_6_2_4_0());
                            					
                            // InternalXMachine.g:876:6: ( (lv_witnesses_24_0= ruleXWitness ) )+
                            int cnt34=0;
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( ((LA34_0>=RULE_ML_COMMENT && LA34_0<=RULE_SL_COMMENT)||LA34_0==19) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalXMachine.g:877:7: (lv_witnesses_24_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:877:7: (lv_witnesses_24_0= ruleXWitness )
                            	    // InternalXMachine.g:878:8: lv_witnesses_24_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_24);
                            	    lv_witnesses_24_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_24_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt34 >= 1 ) break loop34;
                                        EarlyExitException eee =
                                            new EarlyExitException(34, input);
                                        throw eee;
                                }
                                cnt34++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_25=(Token)match(input,25,FOLLOW_10); 

                    					newLeafNode(otherlv_25, grammarAccess.getXEventAccess().getThenKeyword_6_2_5());
                    				
                    // InternalXMachine.g:900:5: ( (lv_actions_26_0= ruleXAction ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=RULE_ML_COMMENT && LA36_0<=RULE_SL_COMMENT)||LA36_0==19) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalXMachine.g:901:6: (lv_actions_26_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:901:6: (lv_actions_26_0= ruleXAction )
                    	    // InternalXMachine.g:902:7: lv_actions_26_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_6_2_6_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_actions_26_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_26_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XAction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    otherlv_27=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_27, grammarAccess.getXEventAccess().getEndKeyword_6_2_7());
                    				

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
    // $ANTLR end "ruleXEvent"


    // $ANTLR start "entryRuleXParameter"
    // InternalXMachine.g:929:1: entryRuleXParameter returns [EObject current=null] : iv_ruleXParameter= ruleXParameter EOF ;
    public final EObject entryRuleXParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameter = null;


        try {
            // InternalXMachine.g:929:51: (iv_ruleXParameter= ruleXParameter EOF )
            // InternalXMachine.g:930:2: iv_ruleXParameter= ruleXParameter EOF
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
    // InternalXMachine.g:936:1: ruleXParameter returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameter() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:942:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:943:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:943:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:944:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:944:3: ()
            // InternalXMachine.g:945:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:951:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ML_COMMENT && LA39_0<=RULE_SL_COMMENT)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXMachine.g:952:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:952:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:953:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:953:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ML_COMMENT) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==RULE_SL_COMMENT) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalXMachine.g:954:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_4); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getXParameterAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXParameterRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:969:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_4); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getXParameterAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXParameterRule());
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

            // InternalXMachine.g:986:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:987:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:987:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:988:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXParameterRule());
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
    // $ANTLR end "ruleXParameter"


    // $ANTLR start "entryRuleXGuard"
    // InternalXMachine.g:1008:1: entryRuleXGuard returns [EObject current=null] : iv_ruleXGuard= ruleXGuard EOF ;
    public final EObject entryRuleXGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuard = null;


        try {
            // InternalXMachine.g:1008:47: (iv_ruleXGuard= ruleXGuard EOF )
            // InternalXMachine.g:1009:2: iv_ruleXGuard= ruleXGuard EOF
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
    // InternalXMachine.g:1015:1: ruleXGuard returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_theorem_5_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuard() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_predicate_4_0=null;
        Token lv_theorem_5_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1021:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_theorem_5_0= 'theorem' ) )? ) )
            // InternalXMachine.g:1022:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_theorem_5_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:1022:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_theorem_5_0= 'theorem' ) )? )
            // InternalXMachine.g:1023:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ( (lv_theorem_5_0= 'theorem' ) )?
            {
            // InternalXMachine.g:1023:3: ()
            // InternalXMachine.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1030:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ML_COMMENT && LA41_0<=RULE_SL_COMMENT)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:1031:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:1031:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:1032:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:1032:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ML_COMMENT) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==RULE_SL_COMMENT) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalXMachine.g:1033:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_15); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getXGuardAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXGuardRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:1048:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_15); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getXGuardAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXGuardRule());
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

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXGuardAccess().getCommercialAtKeyword_2());
            		
            // InternalXMachine.g:1069:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:1070:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:1070:4: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:1071:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXGuardAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:1087:3: ( (lv_predicate_4_0= RULE_STRING ) )
            // InternalXMachine.g:1088:4: (lv_predicate_4_0= RULE_STRING )
            {
            // InternalXMachine.g:1088:4: (lv_predicate_4_0= RULE_STRING )
            // InternalXMachine.g:1089:5: lv_predicate_4_0= RULE_STRING
            {
            lv_predicate_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_predicate_4_0, grammarAccess.getXGuardAccess().getPredicateSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:1105:3: ( (lv_theorem_5_0= 'theorem' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:1106:4: (lv_theorem_5_0= 'theorem' )
                    {
                    // InternalXMachine.g:1106:4: (lv_theorem_5_0= 'theorem' )
                    // InternalXMachine.g:1107:5: lv_theorem_5_0= 'theorem'
                    {
                    lv_theorem_5_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_theorem_5_0, grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardRule());
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
    // $ANTLR end "ruleXGuard"


    // $ANTLR start "entryRuleXWitness"
    // InternalXMachine.g:1123:1: entryRuleXWitness returns [EObject current=null] : iv_ruleXWitness= ruleXWitness EOF ;
    public final EObject entryRuleXWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitness = null;


        try {
            // InternalXMachine.g:1123:49: (iv_ruleXWitness= ruleXWitness EOF )
            // InternalXMachine.g:1124:2: iv_ruleXWitness= ruleXWitness EOF
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
    // InternalXMachine.g:1130:1: ruleXWitness returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleXWitness() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_predicate_4_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1136:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:1137:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:1137:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) ) )
            // InternalXMachine.g:1138:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_predicate_4_0= RULE_STRING ) )
            {
            // InternalXMachine.g:1138:3: ()
            // InternalXMachine.g:1139:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1145:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ML_COMMENT && LA44_0<=RULE_SL_COMMENT)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:1146:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:1146:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:1147:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:1147:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ML_COMMENT) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==RULE_SL_COMMENT) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalXMachine.g:1148:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_15); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getXWitnessAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXWitnessRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:1163:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_15); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getXWitnessAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXWitnessRule());
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

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXWitnessAccess().getCommercialAtKeyword_2());
            		
            // InternalXMachine.g:1184:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:1185:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:1185:4: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:1186:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXWitnessAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:1202:3: ( (lv_predicate_4_0= RULE_STRING ) )
            // InternalXMachine.g:1203:4: (lv_predicate_4_0= RULE_STRING )
            {
            // InternalXMachine.g:1203:4: (lv_predicate_4_0= RULE_STRING )
            // InternalXMachine.g:1204:5: lv_predicate_4_0= RULE_STRING
            {
            lv_predicate_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_predicate_4_0, grammarAccess.getXWitnessAccess().getPredicateSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleXWitness"


    // $ANTLR start "entryRuleXAction"
    // InternalXMachine.g:1224:1: entryRuleXAction returns [EObject current=null] : iv_ruleXAction= ruleXAction EOF ;
    public final EObject entryRuleXAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAction = null;


        try {
            // InternalXMachine.g:1224:48: (iv_ruleXAction= ruleXAction EOF )
            // InternalXMachine.g:1225:2: iv_ruleXAction= ruleXAction EOF
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
    // InternalXMachine.g:1231:1: ruleXAction returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_action_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleXAction() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_action_4_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1237:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_action_4_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:1238:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_action_4_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:1238:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_action_4_0= RULE_STRING ) ) )
            // InternalXMachine.g:1239:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) ( (lv_action_4_0= RULE_STRING ) )
            {
            // InternalXMachine.g:1239:3: ()
            // InternalXMachine.g:1240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1246:3: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ML_COMMENT && LA46_0<=RULE_SL_COMMENT)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:1247:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:1247:4: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:1248:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:1248:5: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ML_COMMENT) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==RULE_SL_COMMENT) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalXMachine.g:1249:6: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_15); 

                            						newLeafNode(lv_comment_1_1, grammarAccess.getXActionAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXActionRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"comment",
                            							lv_comment_1_1,
                            							"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                            					

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:1264:6: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_15); 

                            						newLeafNode(lv_comment_1_2, grammarAccess.getXActionAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getXActionRule());
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

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXActionAccess().getCommercialAtKeyword_2());
            		
            // InternalXMachine.g:1285:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:1286:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:1286:4: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:1287:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXActionAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:1303:3: ( (lv_action_4_0= RULE_STRING ) )
            // InternalXMachine.g:1304:4: (lv_action_4_0= RULE_STRING )
            {
            // InternalXMachine.g:1304:4: (lv_action_4_0= RULE_STRING )
            // InternalXMachine.g:1305:5: lv_action_4_0= RULE_STRING
            {
            lv_action_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_action_4_0, grammarAccess.getXActionAccess().getActionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleXAction"


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:1325:1: ruleXConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleXConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:1331:2: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalXMachine.g:1332:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalXMachine.g:1332:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt47=1;
                }
                break;
            case 29:
                {
                alt47=2;
                }
                break;
            case 30:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:1333:3: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalXMachine.g:1333:3: (enumLiteral_0= 'ordinary' )
                    // InternalXMachine.g:1334:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1341:3: (enumLiteral_1= 'convergent' )
                    {
                    // InternalXMachine.g:1341:3: (enumLiteral_1= 'convergent' )
                    // InternalXMachine.g:1342:4: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1349:3: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalXMachine.g:1349:3: (enumLiteral_2= 'anticipated' )
                    // InternalXMachine.g:1350:4: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000007C040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000078070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000F0030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000070200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000005C01002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000005C00042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000880030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000C0030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002480030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002080030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000070L});

}