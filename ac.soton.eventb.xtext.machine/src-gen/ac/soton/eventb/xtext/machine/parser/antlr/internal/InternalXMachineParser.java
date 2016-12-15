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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'refines'", "'sees'", "'includes'", "'variables'", "'invariants'", "'variant'", "'events'", "'end'", "'as'", "'to'", "'theorem'", "'extended'", "'synchronises'", "'with'", "'begin'", "'when'", "'then'", "'any'", "'where'", "'.'", "'ordinary'", "'convergent'", "'anticipated'"
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
    // InternalXMachine.g:72:1: ruleXMachine returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'includes' ruleXIncludedMachine )? (otherlv_10= 'variables' ( (lv_variables_11_0= ruleXVariable ) )+ )? (otherlv_12= 'invariants' ( (lv_invariants_13_0= ruleXInvariant ) )+ )? (otherlv_14= 'variant' ( (lv_variant_15_0= ruleXVariant ) ) )? (otherlv_16= 'events' ( (lv_events_17_0= ruleXEvent ) ) ( (lv_events_18_0= ruleXEvent ) )* )? otherlv_19= 'end' ) ;
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
        Token otherlv_19=null;
        EObject lv_variables_11_0 = null;

        EObject lv_invariants_13_0 = null;

        EObject lv_variant_15_0 = null;

        EObject lv_events_17_0 = null;

        EObject lv_events_18_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:78:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'includes' ruleXIncludedMachine )? (otherlv_10= 'variables' ( (lv_variables_11_0= ruleXVariable ) )+ )? (otherlv_12= 'invariants' ( (lv_invariants_13_0= ruleXInvariant ) )+ )? (otherlv_14= 'variant' ( (lv_variant_15_0= ruleXVariant ) ) )? (otherlv_16= 'events' ( (lv_events_17_0= ruleXEvent ) ) ( (lv_events_18_0= ruleXEvent ) )* )? otherlv_19= 'end' ) )
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'includes' ruleXIncludedMachine )? (otherlv_10= 'variables' ( (lv_variables_11_0= ruleXVariable ) )+ )? (otherlv_12= 'invariants' ( (lv_invariants_13_0= ruleXInvariant ) )+ )? (otherlv_14= 'variant' ( (lv_variant_15_0= ruleXVariant ) ) )? (otherlv_16= 'events' ( (lv_events_17_0= ruleXEvent ) ) ( (lv_events_18_0= ruleXEvent ) )* )? otherlv_19= 'end' )
            {
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'includes' ruleXIncludedMachine )? (otherlv_10= 'variables' ( (lv_variables_11_0= ruleXVariable ) )+ )? (otherlv_12= 'invariants' ( (lv_invariants_13_0= ruleXInvariant ) )+ )? (otherlv_14= 'variant' ( (lv_variant_15_0= ruleXVariant ) ) )? (otherlv_16= 'events' ( (lv_events_17_0= ruleXEvent ) ) ( (lv_events_18_0= ruleXEvent ) )* )? otherlv_19= 'end' )
            // InternalXMachine.g:80:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'includes' ruleXIncludedMachine )? (otherlv_10= 'variables' ( (lv_variables_11_0= ruleXVariable ) )+ )? (otherlv_12= 'invariants' ( (lv_invariants_13_0= ruleXInvariant ) )+ )? (otherlv_14= 'variant' ( (lv_variant_15_0= ruleXVariant ) ) )? (otherlv_16= 'events' ( (lv_events_17_0= ruleXEvent ) ) ( (lv_events_18_0= ruleXEvent ) )* )? otherlv_19= 'end'
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

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

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

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:145:4: otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

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

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:164:4: otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

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

            // InternalXMachine.g:182:3: (otherlv_8= 'includes' ruleXIncludedMachine )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:183:4: otherlv_8= 'includes' ruleXIncludedMachine
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getXMachineAccess().getIncludesKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getXMachineAccess().getXIncludedMachineParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_8);
                    ruleXIncludedMachine();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalXMachine.g:195:3: (otherlv_10= 'variables' ( (lv_variables_11_0= ruleXVariable ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:196:4: otherlv_10= 'variables' ( (lv_variables_11_0= ruleXVariable ) )+
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getXMachineAccess().getVariablesKeyword_7_0());
                    			
                    // InternalXMachine.g:200:4: ( (lv_variables_11_0= ruleXVariable ) )+
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
                    	    // InternalXMachine.g:201:5: (lv_variables_11_0= ruleXVariable )
                    	    {
                    	    // InternalXMachine.g:201:5: (lv_variables_11_0= ruleXVariable )
                    	    // InternalXMachine.g:202:6: lv_variables_11_0= ruleXVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getXMachineAccess().getVariablesXVariableParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_variables_11_0=ruleXVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_11_0,
                    	    							"ac.soton.eventb.xtext.machine.XMachine.XVariable");
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

            // InternalXMachine.g:220:3: (otherlv_12= 'invariants' ( (lv_invariants_13_0= ruleXInvariant ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:221:4: otherlv_12= 'invariants' ( (lv_invariants_13_0= ruleXInvariant ) )+
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getXMachineAccess().getInvariantsKeyword_8_0());
                    			
                    // InternalXMachine.g:225:4: ( (lv_invariants_13_0= ruleXInvariant ) )+
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
                    	    // InternalXMachine.g:226:5: (lv_invariants_13_0= ruleXInvariant )
                    	    {
                    	    // InternalXMachine.g:226:5: (lv_invariants_13_0= ruleXInvariant )
                    	    // InternalXMachine.g:227:6: lv_invariants_13_0= ruleXInvariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getXMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_invariants_13_0=ruleXInvariant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"invariants",
                    	    							lv_invariants_13_0,
                    	    							"ac.soton.eventb.xtext.machine.XMachine.XInvariant");
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

            // InternalXMachine.g:245:3: (otherlv_14= 'variant' ( (lv_variant_15_0= ruleXVariant ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:246:4: otherlv_14= 'variant' ( (lv_variant_15_0= ruleXVariant ) )
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getXMachineAccess().getVariantKeyword_9_0());
                    			
                    // InternalXMachine.g:250:4: ( (lv_variant_15_0= ruleXVariant ) )
                    // InternalXMachine.g:251:5: (lv_variant_15_0= ruleXVariant )
                    {
                    // InternalXMachine.g:251:5: (lv_variant_15_0= ruleXVariant )
                    // InternalXMachine.g:252:6: lv_variant_15_0= ruleXVariant
                    {

                    						newCompositeNode(grammarAccess.getXMachineAccess().getVariantXVariantParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_variant_15_0=ruleXVariant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXMachineRule());
                    						}
                    						set(
                    							current,
                    							"variant",
                    							lv_variant_15_0,
                    							"ac.soton.eventb.xtext.machine.XMachine.XVariant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:270:3: (otherlv_16= 'events' ( (lv_events_17_0= ruleXEvent ) ) ( (lv_events_18_0= ruleXEvent ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:271:4: otherlv_16= 'events' ( (lv_events_17_0= ruleXEvent ) ) ( (lv_events_18_0= ruleXEvent ) )*
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getXMachineAccess().getEventsKeyword_10_0());
                    			
                    // InternalXMachine.g:275:4: ( (lv_events_17_0= ruleXEvent ) )
                    // InternalXMachine.g:276:5: (lv_events_17_0= ruleXEvent )
                    {
                    // InternalXMachine.g:276:5: (lv_events_17_0= ruleXEvent )
                    // InternalXMachine.g:277:6: lv_events_17_0= ruleXEvent
                    {

                    						newCompositeNode(grammarAccess.getXMachineAccess().getEventsXEventParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_events_17_0=ruleXEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXMachineRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_17_0,
                    							"ac.soton.eventb.xtext.machine.XMachine.XEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMachine.g:294:4: ( (lv_events_18_0= ruleXEvent ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ML_COMMENT||LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalXMachine.g:295:5: (lv_events_18_0= ruleXEvent )
                    	    {
                    	    // InternalXMachine.g:295:5: (lv_events_18_0= ruleXEvent )
                    	    // InternalXMachine.g:296:6: lv_events_18_0= ruleXEvent
                    	    {

                    	    						newCompositeNode(grammarAccess.getXMachineAccess().getEventsXEventParserRuleCall_10_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_events_18_0=ruleXEvent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"events",
                    	    							lv_events_18_0,
                    	    							"ac.soton.eventb.xtext.machine.XMachine.XEvent");
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

            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getXMachineAccess().getEndKeyword_11());
            		

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


    // $ANTLR start "entryRuleXIncludedMachine"
    // InternalXMachine.g:322:1: entryRuleXIncludedMachine returns [String current=null] : iv_ruleXIncludedMachine= ruleXIncludedMachine EOF ;
    public final String entryRuleXIncludedMachine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXIncludedMachine = null;


        try {
            // InternalXMachine.g:322:56: (iv_ruleXIncludedMachine= ruleXIncludedMachine EOF )
            // InternalXMachine.g:323:2: iv_ruleXIncludedMachine= ruleXIncludedMachine EOF
            {
             newCompositeNode(grammarAccess.getXIncludedMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXIncludedMachine=ruleXIncludedMachine();

            state._fsp--;

             current =iv_ruleXIncludedMachine.getText(); 
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
    // $ANTLR end "entryRuleXIncludedMachine"


    // $ANTLR start "ruleXIncludedMachine"
    // InternalXMachine.g:329:1: ruleXIncludedMachine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XAbstractMachine_0= ruleXAbstractMachine | this_XMachineChain_1= ruleXMachineChain ) ;
    public final AntlrDatatypeRuleToken ruleXIncludedMachine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_XAbstractMachine_0 = null;

        AntlrDatatypeRuleToken this_XMachineChain_1 = null;



        	enterRule();

        try {
            // InternalXMachine.g:335:2: ( (this_XAbstractMachine_0= ruleXAbstractMachine | this_XMachineChain_1= ruleXMachineChain ) )
            // InternalXMachine.g:336:2: (this_XAbstractMachine_0= ruleXAbstractMachine | this_XMachineChain_1= ruleXMachineChain )
            {
            // InternalXMachine.g:336:2: (this_XAbstractMachine_0= ruleXAbstractMachine | this_XMachineChain_1= ruleXMachineChain )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==22) ) {
                    alt14=2;
                }
                else if ( (LA14_1==EOF||(LA14_1>=16 && LA14_1<=21)) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:337:3: this_XAbstractMachine_0= ruleXAbstractMachine
                    {

                    			newCompositeNode(grammarAccess.getXIncludedMachineAccess().getXAbstractMachineParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XAbstractMachine_0=ruleXAbstractMachine();

                    state._fsp--;


                    			current.merge(this_XAbstractMachine_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:348:3: this_XMachineChain_1= ruleXMachineChain
                    {

                    			newCompositeNode(grammarAccess.getXIncludedMachineAccess().getXMachineChainParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XMachineChain_1=ruleXMachineChain();

                    state._fsp--;


                    			current.merge(this_XMachineChain_1);
                    		

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
    // $ANTLR end "ruleXIncludedMachine"


    // $ANTLR start "entryRuleXAbstractMachine"
    // InternalXMachine.g:362:1: entryRuleXAbstractMachine returns [String current=null] : iv_ruleXAbstractMachine= ruleXAbstractMachine EOF ;
    public final String entryRuleXAbstractMachine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXAbstractMachine = null;


        try {
            // InternalXMachine.g:362:56: (iv_ruleXAbstractMachine= ruleXAbstractMachine EOF )
            // InternalXMachine.g:363:2: iv_ruleXAbstractMachine= ruleXAbstractMachine EOF
            {
             newCompositeNode(grammarAccess.getXAbstractMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXAbstractMachine=ruleXAbstractMachine();

            state._fsp--;

             current =iv_ruleXAbstractMachine.getText(); 
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
    // $ANTLR end "entryRuleXAbstractMachine"


    // $ANTLR start "ruleXAbstractMachine"
    // InternalXMachine.g:369:1: ruleXAbstractMachine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= 'as' (this_ID_2= RULE_ID )+ )? ) ;
    public final AntlrDatatypeRuleToken ruleXAbstractMachine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:375:2: ( (this_ID_0= RULE_ID (kw= 'as' (this_ID_2= RULE_ID )+ )? ) )
            // InternalXMachine.g:376:2: (this_ID_0= RULE_ID (kw= 'as' (this_ID_2= RULE_ID )+ )? )
            {
            // InternalXMachine.g:376:2: (this_ID_0= RULE_ID (kw= 'as' (this_ID_2= RULE_ID )+ )? )
            // InternalXMachine.g:377:3: this_ID_0= RULE_ID (kw= 'as' (this_ID_2= RULE_ID )+ )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getXAbstractMachineAccess().getIDTerminalRuleCall_0());
            		
            // InternalXMachine.g:384:3: (kw= 'as' (this_ID_2= RULE_ID )+ )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:385:4: kw= 'as' (this_ID_2= RULE_ID )+
                    {
                    kw=(Token)match(input,21,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXAbstractMachineAccess().getAsKeyword_1_0());
                    			
                    // InternalXMachine.g:390:4: (this_ID_2= RULE_ID )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalXMachine.g:391:5: this_ID_2= RULE_ID
                    	    {
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	    					current.merge(this_ID_2);
                    	    				

                    	    					newLeafNode(this_ID_2, grammarAccess.getXAbstractMachineAccess().getIDTerminalRuleCall_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
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
    // $ANTLR end "ruleXAbstractMachine"


    // $ANTLR start "entryRuleXMachineChain"
    // InternalXMachine.g:404:1: entryRuleXMachineChain returns [String current=null] : iv_ruleXMachineChain= ruleXMachineChain EOF ;
    public final String entryRuleXMachineChain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXMachineChain = null;


        try {
            // InternalXMachine.g:404:53: (iv_ruleXMachineChain= ruleXMachineChain EOF )
            // InternalXMachine.g:405:2: iv_ruleXMachineChain= ruleXMachineChain EOF
            {
             newCompositeNode(grammarAccess.getXMachineChainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXMachineChain=ruleXMachineChain();

            state._fsp--;

             current =iv_ruleXMachineChain.getText(); 
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
    // $ANTLR end "entryRuleXMachineChain"


    // $ANTLR start "ruleXMachineChain"
    // InternalXMachine.g:411:1: ruleXMachineChain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= 'to' this_ID_2= RULE_ID (kw= 'as' (this_ID_4= RULE_ID )+ )? ) ;
    public final AntlrDatatypeRuleToken ruleXMachineChain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalXMachine.g:417:2: ( (this_ID_0= RULE_ID kw= 'to' this_ID_2= RULE_ID (kw= 'as' (this_ID_4= RULE_ID )+ )? ) )
            // InternalXMachine.g:418:2: (this_ID_0= RULE_ID kw= 'to' this_ID_2= RULE_ID (kw= 'as' (this_ID_4= RULE_ID )+ )? )
            {
            // InternalXMachine.g:418:2: (this_ID_0= RULE_ID kw= 'to' this_ID_2= RULE_ID (kw= 'as' (this_ID_4= RULE_ID )+ )? )
            // InternalXMachine.g:419:3: this_ID_0= RULE_ID kw= 'to' this_ID_2= RULE_ID (kw= 'as' (this_ID_4= RULE_ID )+ )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getXMachineChainAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,22,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getXMachineChainAccess().getToKeyword_1());
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getXMachineChainAccess().getIDTerminalRuleCall_2());
            		
            // InternalXMachine.g:438:3: (kw= 'as' (this_ID_4= RULE_ID )+ )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:439:4: kw= 'as' (this_ID_4= RULE_ID )+
                    {
                    kw=(Token)match(input,21,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXMachineChainAccess().getAsKeyword_3_0());
                    			
                    // InternalXMachine.g:444:4: (this_ID_4= RULE_ID )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalXMachine.g:445:5: this_ID_4= RULE_ID
                    	    {
                    	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	    					current.merge(this_ID_4);
                    	    				

                    	    					newLeafNode(this_ID_4, grammarAccess.getXMachineChainAccess().getIDTerminalRuleCall_3_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
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
    // $ANTLR end "ruleXMachineChain"


    // $ANTLR start "entryRuleXVariable"
    // InternalXMachine.g:458:1: entryRuleXVariable returns [EObject current=null] : iv_ruleXVariable= ruleXVariable EOF ;
    public final EObject entryRuleXVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariable = null;


        try {
            // InternalXMachine.g:458:50: (iv_ruleXVariable= ruleXVariable EOF )
            // InternalXMachine.g:459:2: iv_ruleXVariable= ruleXVariable EOF
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
    // InternalXMachine.g:465:1: ruleXVariable returns [EObject current=null] : (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment ) ;
    public final EObject ruleXVariable() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableNoComment_0 = null;

        EObject this_XVariableMLComment_1 = null;

        EObject this_XVariableSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:471:2: ( (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment ) )
            // InternalXMachine.g:472:2: (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment )
            {
            // InternalXMachine.g:472:2: (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||LA19_1==RULE_ML_COMMENT||LA19_1==RULE_ID||(LA19_1>=17 && LA19_1<=20)) ) {
                    alt19=1;
                }
                else if ( (LA19_1==RULE_SL_COMMENT) ) {
                    alt19=3;
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
                    // InternalXMachine.g:473:3: this_XVariableNoComment_0= ruleXVariableNoComment
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
                    // InternalXMachine.g:482:3: this_XVariableMLComment_1= ruleXVariableMLComment
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
                    // InternalXMachine.g:491:3: this_XVariableSLComment_2= ruleXVariableSLComment
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
    // InternalXMachine.g:503:1: entryRuleXVariableNoComment returns [EObject current=null] : iv_ruleXVariableNoComment= ruleXVariableNoComment EOF ;
    public final EObject entryRuleXVariableNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableNoComment = null;


        try {
            // InternalXMachine.g:503:59: (iv_ruleXVariableNoComment= ruleXVariableNoComment EOF )
            // InternalXMachine.g:504:2: iv_ruleXVariableNoComment= ruleXVariableNoComment EOF
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
    // InternalXMachine.g:510:1: ruleXVariableNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariableNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:516:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:517:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:517:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:518:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:518:3: ()
            // InternalXMachine.g:519:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableNoCommentAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:525:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:526:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:526:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:527:5: lv_name_1_0= RULE_ID
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
    // $ANTLR end "ruleXVariableNoComment"


    // $ANTLR start "entryRuleXVariableMLComment"
    // InternalXMachine.g:547:1: entryRuleXVariableMLComment returns [EObject current=null] : iv_ruleXVariableMLComment= ruleXVariableMLComment EOF ;
    public final EObject entryRuleXVariableMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableMLComment = null;


        try {
            // InternalXMachine.g:547:59: (iv_ruleXVariableMLComment= ruleXVariableMLComment EOF )
            // InternalXMachine.g:548:2: iv_ruleXVariableMLComment= ruleXVariableMLComment EOF
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
    // InternalXMachine.g:554:1: ruleXVariableMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariableMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:560:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:561:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:561:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:562:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:562:3: ()
            // InternalXMachine.g:563:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableMLCommentAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:569:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:570:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:570:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:571:5: lv_comment_1_0= RULE_ML_COMMENT
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

            // InternalXMachine.g:587:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:588:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:588:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:589:5: lv_name_2_0= RULE_ID
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
    // $ANTLR end "ruleXVariableMLComment"


    // $ANTLR start "entryRuleXVariableSLComment"
    // InternalXMachine.g:609:1: entryRuleXVariableSLComment returns [EObject current=null] : iv_ruleXVariableSLComment= ruleXVariableSLComment EOF ;
    public final EObject entryRuleXVariableSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableSLComment = null;


        try {
            // InternalXMachine.g:609:59: (iv_ruleXVariableSLComment= ruleXVariableSLComment EOF )
            // InternalXMachine.g:610:2: iv_ruleXVariableSLComment= ruleXVariableSLComment EOF
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
    // InternalXMachine.g:616:1: ruleXVariableSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXVariableSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:622:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:623:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:623:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:624:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:624:3: ()
            // InternalXMachine.g:625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableSLCommentAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:631:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:632:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:632:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:633:5: lv_name_1_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:649:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:650:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:650:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:651:5: lv_comment_2_0= RULE_SL_COMMENT
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
    // InternalXMachine.g:671:1: entryRuleXInvariant returns [EObject current=null] : iv_ruleXInvariant= ruleXInvariant EOF ;
    public final EObject entryRuleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariant = null;


        try {
            // InternalXMachine.g:671:51: (iv_ruleXInvariant= ruleXInvariant EOF )
            // InternalXMachine.g:672:2: iv_ruleXInvariant= ruleXInvariant EOF
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
    // InternalXMachine.g:678:1: ruleXInvariant returns [EObject current=null] : (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment ) ;
    public final EObject ruleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject this_XInvariantNoComment_0 = null;

        EObject this_XInvariantMLComment_1 = null;

        EObject this_XInvariantSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:684:2: ( (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment ) )
            // InternalXMachine.g:685:2: (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment )
            {
            // InternalXMachine.g:685:2: (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_XLABEL) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 23:
                        {
                        int LA20_4 = input.LA(4);

                        if ( (LA20_4==RULE_SL_COMMENT) ) {
                            alt20=3;
                        }
                        else if ( (LA20_4==EOF||LA20_4==RULE_ML_COMMENT||LA20_4==RULE_XLABEL||(LA20_4>=18 && LA20_4<=20)) ) {
                            alt20=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_ML_COMMENT:
                    case RULE_XLABEL:
                    case 18:
                    case 19:
                    case 20:
                        {
                        alt20=1;
                        }
                        break;
                    case RULE_SL_COMMENT:
                        {
                        alt20=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==RULE_ML_COMMENT) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:686:3: this_XInvariantNoComment_0= ruleXInvariantNoComment
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
                    // InternalXMachine.g:695:3: this_XInvariantMLComment_1= ruleXInvariantMLComment
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
                    // InternalXMachine.g:704:3: this_XInvariantSLComment_2= ruleXInvariantSLComment
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
    // InternalXMachine.g:716:1: entryRuleXInvariantNoComment returns [EObject current=null] : iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF ;
    public final EObject entryRuleXInvariantNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantNoComment = null;


        try {
            // InternalXMachine.g:716:60: (iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF )
            // InternalXMachine.g:717:2: iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF
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
    // InternalXMachine.g:723:1: ruleXInvariantNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariantNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:729:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:730:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:730:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:731:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:731:3: ()
            // InternalXMachine.g:732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantNoCommentAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:738:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:739:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:739:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:740:5: lv_name_1_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:756:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:757:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:757:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:758:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_predicate_2_0, grammarAccess.getXInvariantNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:774:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:775:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:775:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:776:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,23,FOLLOW_2); 

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
    // InternalXMachine.g:792:1: entryRuleXInvariantMLComment returns [EObject current=null] : iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF ;
    public final EObject entryRuleXInvariantMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantMLComment = null;


        try {
            // InternalXMachine.g:792:60: (iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF )
            // InternalXMachine.g:793:2: iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF
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
    // InternalXMachine.g:799:1: ruleXInvariantMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariantMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_predicate_3_0=null;
        Token lv_theorem_4_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:805:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) )
            // InternalXMachine.g:806:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:806:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            // InternalXMachine.g:807:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )?
            {
            // InternalXMachine.g:807:3: ()
            // InternalXMachine.g:808:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantMLCommentAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:814:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:815:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:815:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:816:5: lv_comment_1_0= RULE_ML_COMMENT
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

            // InternalXMachine.g:832:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:833:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:833:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:834:5: lv_name_2_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:850:3: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalXMachine.g:851:4: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalXMachine.g:851:4: (lv_predicate_3_0= RULE_STRING )
            // InternalXMachine.g:852:5: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_predicate_3_0, grammarAccess.getXInvariantMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:868:3: ( (lv_theorem_4_0= 'theorem' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:869:4: (lv_theorem_4_0= 'theorem' )
                    {
                    // InternalXMachine.g:869:4: (lv_theorem_4_0= 'theorem' )
                    // InternalXMachine.g:870:5: lv_theorem_4_0= 'theorem'
                    {
                    lv_theorem_4_0=(Token)match(input,23,FOLLOW_2); 

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
    // InternalXMachine.g:886:1: entryRuleXInvariantSLComment returns [EObject current=null] : iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF ;
    public final EObject entryRuleXInvariantSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantSLComment = null;


        try {
            // InternalXMachine.g:886:60: (iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF )
            // InternalXMachine.g:887:2: iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF
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
    // InternalXMachine.g:893:1: ruleXInvariantSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXInvariantSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;
        Token lv_comment_4_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:899:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:900:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:900:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:901:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:901:3: ()
            // InternalXMachine.g:902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantSLCommentAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:908:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:909:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:909:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:910:5: lv_name_1_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:926:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:927:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:927:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:928:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_predicate_2_0, grammarAccess.getXInvariantSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:944:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:945:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:945:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:946:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,23,FOLLOW_19); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXInvariantSLCommentAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXInvariantSLCommentRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:958:3: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:959:4: (lv_comment_4_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:959:4: (lv_comment_4_0= RULE_SL_COMMENT )
            // InternalXMachine.g:960:5: lv_comment_4_0= RULE_SL_COMMENT
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
    // InternalXMachine.g:980:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:980:49: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:981:2: iv_ruleXVariant= ruleXVariant EOF
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
    // InternalXMachine.g:987:1: ruleXVariant returns [EObject current=null] : (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        EObject this_XVariantNoComment_0 = null;

        EObject this_XVariantMLComment_1 = null;

        EObject this_XVariantSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:993:2: ( (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment ) )
            // InternalXMachine.g:994:2: (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment )
            {
            // InternalXMachine.g:994:2: (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==EOF||(LA24_1>=19 && LA24_1<=20)) ) {
                    alt24=1;
                }
                else if ( (LA24_1==RULE_SL_COMMENT) ) {
                    alt24=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==RULE_ML_COMMENT) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:995:3: this_XVariantNoComment_0= ruleXVariantNoComment
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
                    // InternalXMachine.g:1004:3: this_XVariantMLComment_1= ruleXVariantMLComment
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
                    // InternalXMachine.g:1013:3: this_XVariantSLComment_2= ruleXVariantSLComment
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
    // InternalXMachine.g:1025:1: entryRuleXVariantNoComment returns [EObject current=null] : iv_ruleXVariantNoComment= ruleXVariantNoComment EOF ;
    public final EObject entryRuleXVariantNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantNoComment = null;


        try {
            // InternalXMachine.g:1025:58: (iv_ruleXVariantNoComment= ruleXVariantNoComment EOF )
            // InternalXMachine.g:1026:2: iv_ruleXVariantNoComment= ruleXVariantNoComment EOF
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
    // InternalXMachine.g:1032:1: ruleXVariantNoComment returns [EObject current=null] : ( () ( (lv_expression_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXVariantNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_expression_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1038:2: ( ( () ( (lv_expression_1_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:1039:2: ( () ( (lv_expression_1_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:1039:2: ( () ( (lv_expression_1_0= RULE_STRING ) ) )
            // InternalXMachine.g:1040:3: () ( (lv_expression_1_0= RULE_STRING ) )
            {
            // InternalXMachine.g:1040:3: ()
            // InternalXMachine.g:1041:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantNoCommentAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1047:3: ( (lv_expression_1_0= RULE_STRING ) )
            // InternalXMachine.g:1048:4: (lv_expression_1_0= RULE_STRING )
            {
            // InternalXMachine.g:1048:4: (lv_expression_1_0= RULE_STRING )
            // InternalXMachine.g:1049:5: lv_expression_1_0= RULE_STRING
            {
            lv_expression_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_expression_1_0, grammarAccess.getXVariantNoCommentAccess().getExpressionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariantNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_1_0,
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
    // $ANTLR end "ruleXVariantNoComment"


    // $ANTLR start "entryRuleXVariantMLComment"
    // InternalXMachine.g:1069:1: entryRuleXVariantMLComment returns [EObject current=null] : iv_ruleXVariantMLComment= ruleXVariantMLComment EOF ;
    public final EObject entryRuleXVariantMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantMLComment = null;


        try {
            // InternalXMachine.g:1069:58: (iv_ruleXVariantMLComment= ruleXVariantMLComment EOF )
            // InternalXMachine.g:1070:2: iv_ruleXVariantMLComment= ruleXVariantMLComment EOF
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
    // InternalXMachine.g:1076:1: ruleXVariantMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXVariantMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_expression_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1082:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:1083:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:1083:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) )
            // InternalXMachine.g:1084:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) )
            {
            // InternalXMachine.g:1084:3: ()
            // InternalXMachine.g:1085:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantMLCommentAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1091:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:1092:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:1092:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:1093:5: lv_comment_1_0= RULE_ML_COMMENT
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

            // InternalXMachine.g:1109:3: ( (lv_expression_2_0= RULE_STRING ) )
            // InternalXMachine.g:1110:4: (lv_expression_2_0= RULE_STRING )
            {
            // InternalXMachine.g:1110:4: (lv_expression_2_0= RULE_STRING )
            // InternalXMachine.g:1111:5: lv_expression_2_0= RULE_STRING
            {
            lv_expression_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_expression_2_0, grammarAccess.getXVariantMLCommentAccess().getExpressionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariantMLCommentRule());
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
    // $ANTLR end "ruleXVariantMLComment"


    // $ANTLR start "entryRuleXVariantSLComment"
    // InternalXMachine.g:1131:1: entryRuleXVariantSLComment returns [EObject current=null] : iv_ruleXVariantSLComment= ruleXVariantSLComment EOF ;
    public final EObject entryRuleXVariantSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantSLComment = null;


        try {
            // InternalXMachine.g:1131:58: (iv_ruleXVariantSLComment= ruleXVariantSLComment EOF )
            // InternalXMachine.g:1132:2: iv_ruleXVariantSLComment= ruleXVariantSLComment EOF
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
    // InternalXMachine.g:1138:1: ruleXVariantSLComment returns [EObject current=null] : ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXVariantSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_expression_1_0=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1144:2: ( ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:1145:2: ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:1145:2: ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:1146:3: () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:1146:3: ()
            // InternalXMachine.g:1147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantSLCommentAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1153:3: ( (lv_expression_1_0= RULE_STRING ) )
            // InternalXMachine.g:1154:4: (lv_expression_1_0= RULE_STRING )
            {
            // InternalXMachine.g:1154:4: (lv_expression_1_0= RULE_STRING )
            // InternalXMachine.g:1155:5: lv_expression_1_0= RULE_STRING
            {
            lv_expression_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_expression_1_0, grammarAccess.getXVariantSLCommentAccess().getExpressionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariantSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:1171:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:1172:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:1172:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:1173:5: lv_comment_2_0= RULE_SL_COMMENT
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
    // InternalXMachine.g:1193:1: entryRuleXEvent returns [EObject current=null] : iv_ruleXEvent= ruleXEvent EOF ;
    public final EObject entryRuleXEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEvent = null;


        try {
            // InternalXMachine.g:1193:47: (iv_ruleXEvent= ruleXEvent EOF )
            // InternalXMachine.g:1194:2: iv_ruleXEvent= ruleXEvent EOF
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
    // InternalXMachine.g:1200:1: ruleXEvent returns [EObject current=null] : (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment ) ;
    public final EObject ruleXEvent() throws RecognitionException {
        EObject current = null;

        EObject this_XEventNoComment_0 = null;

        EObject this_XEventMLComment_1 = null;

        EObject this_XEventSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1206:2: ( (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment ) )
            // InternalXMachine.g:1207:2: (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment )
            {
            // InternalXMachine.g:1207:2: (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:1208:3: this_XEventNoComment_0= ruleXEventNoComment
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
                    // InternalXMachine.g:1217:3: this_XEventMLComment_1= ruleXEventMLComment
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
                    // InternalXMachine.g:1226:3: this_XEventSLComment_2= ruleXEventSLComment
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
    // InternalXMachine.g:1238:1: entryRuleXEventNoComment returns [EObject current=null] : iv_ruleXEventNoComment= ruleXEventNoComment EOF ;
    public final EObject entryRuleXEventNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEventNoComment = null;


        try {
            // InternalXMachine.g:1238:56: (iv_ruleXEventNoComment= ruleXEventNoComment EOF )
            // InternalXMachine.g:1239:2: iv_ruleXEventNoComment= ruleXEventNoComment EOF
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
    // InternalXMachine.g:1245:1: ruleXEventNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) (otherlv_5= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) ;
    public final EObject ruleXEventNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_extended_3_0=null;
        Token otherlv_5=null;
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
            // InternalXMachine.g:1251:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) (otherlv_5= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) )
            // InternalXMachine.g:1252:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) (otherlv_5= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            {
            // InternalXMachine.g:1252:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) (otherlv_5= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            // InternalXMachine.g:1253:3: () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) (otherlv_5= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end'
            {
            // InternalXMachine.g:1253:3: ()
            // InternalXMachine.g:1254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventNoCommentAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1260:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:1261:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:1261:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:1262:5: lv_name_1_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:1278:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:1279:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:1279:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:1280:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2());
            				
            // InternalXMachine.g:1283:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:1284:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:1284:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 >= 33 && LA26_0 <= 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXMachine.g:1285:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1285:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    // InternalXMachine.g:1286:5: {...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalXMachine.g:1286:112: ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    // InternalXMachine.g:1287:6: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalXMachine.g:1290:9: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    // InternalXMachine.g:1290:10: {...}? => ( (lv_extended_3_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "true");
            	    }
            	    // InternalXMachine.g:1290:19: ( (lv_extended_3_0= 'extended' ) )
            	    // InternalXMachine.g:1290:20: (lv_extended_3_0= 'extended' )
            	    {
            	    // InternalXMachine.g:1290:20: (lv_extended_3_0= 'extended' )
            	    // InternalXMachine.g:1291:10: lv_extended_3_0= 'extended'
            	    {
            	    lv_extended_3_0=(Token)match(input,24,FOLLOW_24); 

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
            	    // InternalXMachine.g:1308:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1308:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:1309:5: {...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalXMachine.g:1309:112: ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:1310:6: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalXMachine.g:1313:9: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:1313:10: {...}? => ( (lv_convergence_4_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "true");
            	    }
            	    // InternalXMachine.g:1313:19: ( (lv_convergence_4_0= ruleXConvergence ) )
            	    // InternalXMachine.g:1313:20: (lv_convergence_4_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:1313:20: (lv_convergence_4_0= ruleXConvergence )
            	    // InternalXMachine.g:1314:10: lv_convergence_4_0= ruleXConvergence
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
            	    											"ac.soton.eventb.xtext.machine.XMachine.XConvergence");
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
            	    break loop26;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2());
            				

            }

            // InternalXMachine.g:1343:3: (otherlv_5= 'synchronises' ( ruleXSynchronisedEvent )+ )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:1344:4: otherlv_5= 'synchronises' ( ruleXSynchronisedEvent )+
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getXEventNoCommentAccess().getSynchronisesKeyword_3_0());
                    			
                    // InternalXMachine.g:1348:4: ( ruleXSynchronisedEvent )+
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
                    	    // InternalXMachine.g:1349:5: ruleXSynchronisedEvent
                    	    {

                    	    					newCompositeNode(grammarAccess.getXEventNoCommentAccess().getXSynchronisedEventParserRuleCall_3_1());
                    	    				
                    	    pushFollow(FOLLOW_25);
                    	    ruleXSynchronisedEvent();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

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

            // InternalXMachine.g:1358:3: (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:1359:4: otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getXEventNoCommentAccess().getRefinesKeyword_4_0());
                    			
                    // InternalXMachine.g:1363:4: ( (otherlv_8= RULE_ID ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalXMachine.g:1364:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:1364:5: (otherlv_8= RULE_ID )
                    	    // InternalXMachine.g:1365:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXEventNoCommentRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getXEventNoCommentAccess().getRefinesEventCrossReference_4_1_0());
                    	    					

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

            // InternalXMachine.g:1377:3: ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )?
            int alt45=4;
            switch ( input.LA(1) ) {
                case 26:
                case 27:
                    {
                    alt45=1;
                    }
                    break;
                case 28:
                    {
                    alt45=2;
                    }
                    break;
                case 30:
                    {
                    alt45=3;
                    }
                    break;
            }

            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:1378:4: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:1378:4: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    // InternalXMachine.g:1379:5: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:1379:5: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==26) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalXMachine.g:1380:6: otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+
                            {
                            otherlv_9=(Token)match(input,26,FOLLOW_11); 

                            						newLeafNode(otherlv_9, grammarAccess.getXEventNoCommentAccess().getWithKeyword_5_0_0_0());
                            					
                            // InternalXMachine.g:1384:6: ( (lv_witnesses_10_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1385:7: (lv_witnesses_10_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1385:7: (lv_witnesses_10_0= ruleXWitness )
                            	    // InternalXMachine.g:1386:8: lv_witnesses_10_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventNoCommentAccess().getWitnessesXWitnessParserRuleCall_5_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_27);
                            	    lv_witnesses_10_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_10_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
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
                            break;

                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_11); 

                    					newLeafNode(otherlv_11, grammarAccess.getXEventNoCommentAccess().getBeginKeyword_5_0_1());
                    				
                    // InternalXMachine.g:1408:5: ( (lv_actions_12_0= ruleXAction ) )+
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
                    	    // InternalXMachine.g:1409:6: (lv_actions_12_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1409:6: (lv_actions_12_0= ruleXAction )
                    	    // InternalXMachine.g:1410:7: lv_actions_12_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventNoCommentAccess().getActionsXActionParserRuleCall_5_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_actions_12_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_12_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XAction");
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


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1429:4: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1429:4: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1430:5: otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_11); 

                    					newLeafNode(otherlv_13, grammarAccess.getXEventNoCommentAccess().getWhenKeyword_5_1_0());
                    				
                    // InternalXMachine.g:1434:5: ( (lv_guards_14_0= ruleXGuard ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ML_COMMENT||LA34_0==RULE_XLABEL) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalXMachine.g:1435:6: (lv_guards_14_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1435:6: (lv_guards_14_0= ruleXGuard )
                    	    // InternalXMachine.g:1436:7: lv_guards_14_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventNoCommentAccess().getGuardsXGuardParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_14_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_14_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XGuard");
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

                    // InternalXMachine.g:1453:5: (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==26) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalXMachine.g:1454:6: otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+
                            {
                            otherlv_15=(Token)match(input,26,FOLLOW_11); 

                            						newLeafNode(otherlv_15, grammarAccess.getXEventNoCommentAccess().getWithKeyword_5_1_2_0());
                            					
                            // InternalXMachine.g:1458:6: ( (lv_witnesses_16_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1459:7: (lv_witnesses_16_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1459:7: (lv_witnesses_16_0= ruleXWitness )
                            	    // InternalXMachine.g:1460:8: lv_witnesses_16_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventNoCommentAccess().getWitnessesXWitnessParserRuleCall_5_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_16_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_16_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
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

                    // InternalXMachine.g:1478:5: (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==29) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalXMachine.g:1479:6: otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+
                            {
                            otherlv_17=(Token)match(input,29,FOLLOW_11); 

                            						newLeafNode(otherlv_17, grammarAccess.getXEventNoCommentAccess().getThenKeyword_5_1_3_0());
                            					
                            // InternalXMachine.g:1483:6: ( (lv_actions_18_0= ruleXAction ) )+
                            int cnt37=0;
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==RULE_ML_COMMENT||LA37_0==RULE_XLABEL) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalXMachine.g:1484:7: (lv_actions_18_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1484:7: (lv_actions_18_0= ruleXAction )
                            	    // InternalXMachine.g:1485:8: lv_actions_18_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventNoCommentAccess().getActionsXActionParserRuleCall_5_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_18_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_18_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XAction");
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


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1505:4: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1505:4: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1506:5: otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    {
                    otherlv_19=(Token)match(input,30,FOLLOW_9); 

                    					newLeafNode(otherlv_19, grammarAccess.getXEventNoCommentAccess().getAnyKeyword_5_2_0());
                    				
                    // InternalXMachine.g:1510:5: ( (lv_parameters_20_0= ruleXParameter ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ML_COMMENT||LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalXMachine.g:1511:6: (lv_parameters_20_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1511:6: (lv_parameters_20_0= ruleXParameter )
                    	    // InternalXMachine.g:1512:7: lv_parameters_20_0= ruleXParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventNoCommentAccess().getParametersXParameterParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_parameters_20_0=ruleXParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
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
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    otherlv_21=(Token)match(input,31,FOLLOW_11); 

                    					newLeafNode(otherlv_21, grammarAccess.getXEventNoCommentAccess().getWhereKeyword_5_2_2());
                    				
                    // InternalXMachine.g:1533:5: ( (lv_guards_22_0= ruleXGuard ) )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_ML_COMMENT||LA40_0==RULE_XLABEL) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalXMachine.g:1534:6: (lv_guards_22_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1534:6: (lv_guards_22_0= ruleXGuard )
                    	    // InternalXMachine.g:1535:7: lv_guards_22_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventNoCommentAccess().getGuardsXGuardParserRuleCall_5_2_3_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_22_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
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
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);

                    // InternalXMachine.g:1552:5: (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==26) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalXMachine.g:1553:6: otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+
                            {
                            otherlv_23=(Token)match(input,26,FOLLOW_11); 

                            						newLeafNode(otherlv_23, grammarAccess.getXEventNoCommentAccess().getWithKeyword_5_2_4_0());
                            					
                            // InternalXMachine.g:1557:6: ( (lv_witnesses_24_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1558:7: (lv_witnesses_24_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1558:7: (lv_witnesses_24_0= ruleXWitness )
                            	    // InternalXMachine.g:1559:8: lv_witnesses_24_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventNoCommentAccess().getWitnessesXWitnessParserRuleCall_5_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_24_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
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

                    // InternalXMachine.g:1577:5: (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==29) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalXMachine.g:1578:6: otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+
                            {
                            otherlv_25=(Token)match(input,29,FOLLOW_11); 

                            						newLeafNode(otherlv_25, grammarAccess.getXEventNoCommentAccess().getThenKeyword_5_2_5_0());
                            					
                            // InternalXMachine.g:1582:6: ( (lv_actions_26_0= ruleXAction ) )+
                            int cnt43=0;
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==RULE_ML_COMMENT||LA43_0==RULE_XLABEL) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // InternalXMachine.g:1583:7: (lv_actions_26_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1583:7: (lv_actions_26_0= ruleXAction )
                            	    // InternalXMachine.g:1584:8: lv_actions_26_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventNoCommentAccess().getActionsXActionParserRuleCall_5_2_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_26_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
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
                            	    if ( cnt43 >= 1 ) break loop43;
                                        EarlyExitException eee =
                                            new EarlyExitException(43, input);
                                        throw eee;
                                }
                                cnt43++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getXEventNoCommentAccess().getEndKeyword_6());
            		

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
    // InternalXMachine.g:1612:1: entryRuleXEventMLComment returns [EObject current=null] : iv_ruleXEventMLComment= ruleXEventMLComment EOF ;
    public final EObject entryRuleXEventMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEventMLComment = null;


        try {
            // InternalXMachine.g:1612:56: (iv_ruleXEventMLComment= ruleXEventMLComment EOF )
            // InternalXMachine.g:1613:2: iv_ruleXEventMLComment= ruleXEventMLComment EOF
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
    // InternalXMachine.g:1619:1: ruleXEventMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )? ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )? otherlv_28= 'end' ) ;
    public final EObject ruleXEventMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_extended_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Enumerator lv_convergence_5_0 = null;

        EObject lv_witnesses_11_0 = null;

        EObject lv_actions_13_0 = null;

        EObject lv_guards_15_0 = null;

        EObject lv_witnesses_17_0 = null;

        EObject lv_actions_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_guards_23_0 = null;

        EObject lv_witnesses_25_0 = null;

        EObject lv_actions_27_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1625:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )? ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )? otherlv_28= 'end' ) )
            // InternalXMachine.g:1626:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )? ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )? otherlv_28= 'end' )
            {
            // InternalXMachine.g:1626:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )? ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )? otherlv_28= 'end' )
            // InternalXMachine.g:1627:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )? ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )? otherlv_28= 'end'
            {
            // InternalXMachine.g:1627:3: ()
            // InternalXMachine.g:1628:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventMLCommentAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1634:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:1635:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:1635:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:1636:5: lv_comment_1_0= RULE_ML_COMMENT
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

            // InternalXMachine.g:1652:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:1653:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:1653:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:1654:5: lv_name_2_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:1670:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:1671:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:1671:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:1672:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3());
            				
            // InternalXMachine.g:1675:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:1676:6: ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:1676:6: ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )*
            loop46:
            do {
                int alt46=3;
                int LA46_0 = input.LA(1);

                if ( LA46_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 >= 33 && LA46_0 <= 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1) ) {
                    alt46=2;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalXMachine.g:1677:4: ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1677:4: ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) )
            	    // InternalXMachine.g:1678:5: {...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalXMachine.g:1678:112: ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) )
            	    // InternalXMachine.g:1679:6: ({...}? => ( (lv_extended_4_0= 'extended' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalXMachine.g:1682:9: ({...}? => ( (lv_extended_4_0= 'extended' ) ) )
            	    // InternalXMachine.g:1682:10: {...}? => ( (lv_extended_4_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "true");
            	    }
            	    // InternalXMachine.g:1682:19: ( (lv_extended_4_0= 'extended' ) )
            	    // InternalXMachine.g:1682:20: (lv_extended_4_0= 'extended' )
            	    {
            	    // InternalXMachine.g:1682:20: (lv_extended_4_0= 'extended' )
            	    // InternalXMachine.g:1683:10: lv_extended_4_0= 'extended'
            	    {
            	    lv_extended_4_0=(Token)match(input,24,FOLLOW_24); 

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
            	    // InternalXMachine.g:1700:4: ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1700:4: ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:1701:5: {...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalXMachine.g:1701:112: ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:1702:6: ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalXMachine.g:1705:9: ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:1705:10: {...}? => ( (lv_convergence_5_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "true");
            	    }
            	    // InternalXMachine.g:1705:19: ( (lv_convergence_5_0= ruleXConvergence ) )
            	    // InternalXMachine.g:1705:20: (lv_convergence_5_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:1705:20: (lv_convergence_5_0= ruleXConvergence )
            	    // InternalXMachine.g:1706:10: lv_convergence_5_0= ruleXConvergence
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
            	    											"ac.soton.eventb.xtext.machine.XMachine.XConvergence");
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
            	    break loop46;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3());
            				

            }

            // InternalXMachine.g:1735:3: (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:1736:4: otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getXEventMLCommentAccess().getSynchronisesKeyword_4_0());
                    			
                    // InternalXMachine.g:1740:4: ( ruleXSynchronisedEvent )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalXMachine.g:1741:5: ruleXSynchronisedEvent
                    	    {

                    	    					newCompositeNode(grammarAccess.getXEventMLCommentAccess().getXSynchronisedEventParserRuleCall_4_1());
                    	    				
                    	    pushFollow(FOLLOW_25);
                    	    ruleXSynchronisedEvent();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:1750:3: (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==13) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXMachine.g:1751:4: otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getXEventMLCommentAccess().getRefinesKeyword_5_0());
                    			
                    // InternalXMachine.g:1755:4: ( (otherlv_9= RULE_ID ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ID) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalXMachine.g:1756:5: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:1756:5: (otherlv_9= RULE_ID )
                    	    // InternalXMachine.g:1757:6: otherlv_9= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXEventMLCommentRule());
                    	    						}
                    	    					
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getXEventMLCommentAccess().getRefinesEventCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:1769:3: ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )?
            int alt65=4;
            switch ( input.LA(1) ) {
                case 26:
                case 27:
                    {
                    alt65=1;
                    }
                    break;
                case 28:
                    {
                    alt65=2;
                    }
                    break;
                case 30:
                    {
                    alt65=3;
                    }
                    break;
            }

            switch (alt65) {
                case 1 :
                    // InternalXMachine.g:1770:4: ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:1770:4: ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ )
                    // InternalXMachine.g:1771:5: (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:1771:5: (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==26) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalXMachine.g:1772:6: otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+
                            {
                            otherlv_10=(Token)match(input,26,FOLLOW_11); 

                            						newLeafNode(otherlv_10, grammarAccess.getXEventMLCommentAccess().getWithKeyword_6_0_0_0());
                            					
                            // InternalXMachine.g:1776:6: ( (lv_witnesses_11_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1777:7: (lv_witnesses_11_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1777:7: (lv_witnesses_11_0= ruleXWitness )
                            	    // InternalXMachine.g:1778:8: lv_witnesses_11_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventMLCommentAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_27);
                            	    lv_witnesses_11_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_11_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
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


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,27,FOLLOW_11); 

                    					newLeafNode(otherlv_12, grammarAccess.getXEventMLCommentAccess().getBeginKeyword_6_0_1());
                    				
                    // InternalXMachine.g:1800:5: ( (lv_actions_13_0= ruleXAction ) )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_ML_COMMENT||LA53_0==RULE_XLABEL) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalXMachine.g:1801:6: (lv_actions_13_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1801:6: (lv_actions_13_0= ruleXAction )
                    	    // InternalXMachine.g:1802:7: lv_actions_13_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventMLCommentAccess().getActionsXActionParserRuleCall_6_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_actions_13_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_13_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XAction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1821:4: (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1821:4: (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1822:5: otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )?
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_11); 

                    					newLeafNode(otherlv_14, grammarAccess.getXEventMLCommentAccess().getWhenKeyword_6_1_0());
                    				
                    // InternalXMachine.g:1826:5: ( (lv_guards_15_0= ruleXGuard ) )+
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
                    	    // InternalXMachine.g:1827:6: (lv_guards_15_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1827:6: (lv_guards_15_0= ruleXGuard )
                    	    // InternalXMachine.g:1828:7: lv_guards_15_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventMLCommentAccess().getGuardsXGuardParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_15_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_15_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XGuard");
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

                    // InternalXMachine.g:1845:5: (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==26) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalXMachine.g:1846:6: otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+
                            {
                            otherlv_16=(Token)match(input,26,FOLLOW_11); 

                            						newLeafNode(otherlv_16, grammarAccess.getXEventMLCommentAccess().getWithKeyword_6_1_2_0());
                            					
                            // InternalXMachine.g:1850:6: ( (lv_witnesses_17_0= ruleXWitness ) )+
                            int cnt55=0;
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==RULE_ML_COMMENT||LA55_0==RULE_XLABEL) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // InternalXMachine.g:1851:7: (lv_witnesses_17_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1851:7: (lv_witnesses_17_0= ruleXWitness )
                            	    // InternalXMachine.g:1852:8: lv_witnesses_17_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventMLCommentAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_17_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_17_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt55 >= 1 ) break loop55;
                                        EarlyExitException eee =
                                            new EarlyExitException(55, input);
                                        throw eee;
                                }
                                cnt55++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalXMachine.g:1870:5: (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==29) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalXMachine.g:1871:6: otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+
                            {
                            otherlv_18=(Token)match(input,29,FOLLOW_11); 

                            						newLeafNode(otherlv_18, grammarAccess.getXEventMLCommentAccess().getThenKeyword_6_1_3_0());
                            					
                            // InternalXMachine.g:1875:6: ( (lv_actions_19_0= ruleXAction ) )+
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
                            	    // InternalXMachine.g:1876:7: (lv_actions_19_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1876:7: (lv_actions_19_0= ruleXAction )
                            	    // InternalXMachine.g:1877:8: lv_actions_19_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventMLCommentAccess().getActionsXActionParserRuleCall_6_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_19_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_19_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XAction");
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


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1897:4: (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1897:4: (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1898:5: otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )?
                    {
                    otherlv_20=(Token)match(input,30,FOLLOW_9); 

                    					newLeafNode(otherlv_20, grammarAccess.getXEventMLCommentAccess().getAnyKeyword_6_2_0());
                    				
                    // InternalXMachine.g:1902:5: ( (lv_parameters_21_0= ruleXParameter ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ML_COMMENT||LA59_0==RULE_ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalXMachine.g:1903:6: (lv_parameters_21_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1903:6: (lv_parameters_21_0= ruleXParameter )
                    	    // InternalXMachine.g:1904:7: lv_parameters_21_0= ruleXParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventMLCommentAccess().getParametersXParameterParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_parameters_21_0=ruleXParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    otherlv_22=(Token)match(input,31,FOLLOW_11); 

                    					newLeafNode(otherlv_22, grammarAccess.getXEventMLCommentAccess().getWhereKeyword_6_2_2());
                    				
                    // InternalXMachine.g:1925:5: ( (lv_guards_23_0= ruleXGuard ) )+
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
                    	    // InternalXMachine.g:1926:6: (lv_guards_23_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1926:6: (lv_guards_23_0= ruleXGuard )
                    	    // InternalXMachine.g:1927:7: lv_guards_23_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventMLCommentAccess().getGuardsXGuardParserRuleCall_6_2_3_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_23_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_23_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XGuard");
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

                    // InternalXMachine.g:1944:5: (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==26) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalXMachine.g:1945:6: otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+
                            {
                            otherlv_24=(Token)match(input,26,FOLLOW_11); 

                            						newLeafNode(otherlv_24, grammarAccess.getXEventMLCommentAccess().getWithKeyword_6_2_4_0());
                            					
                            // InternalXMachine.g:1949:6: ( (lv_witnesses_25_0= ruleXWitness ) )+
                            int cnt61=0;
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==RULE_ML_COMMENT||LA61_0==RULE_XLABEL) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // InternalXMachine.g:1950:7: (lv_witnesses_25_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1950:7: (lv_witnesses_25_0= ruleXWitness )
                            	    // InternalXMachine.g:1951:8: lv_witnesses_25_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventMLCommentAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_25_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_25_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt61 >= 1 ) break loop61;
                                        EarlyExitException eee =
                                            new EarlyExitException(61, input);
                                        throw eee;
                                }
                                cnt61++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalXMachine.g:1969:5: (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==29) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalXMachine.g:1970:6: otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+
                            {
                            otherlv_26=(Token)match(input,29,FOLLOW_11); 

                            						newLeafNode(otherlv_26, grammarAccess.getXEventMLCommentAccess().getThenKeyword_6_2_5_0());
                            					
                            // InternalXMachine.g:1974:6: ( (lv_actions_27_0= ruleXAction ) )+
                            int cnt63=0;
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==RULE_ML_COMMENT||LA63_0==RULE_XLABEL) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // InternalXMachine.g:1975:7: (lv_actions_27_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1975:7: (lv_actions_27_0= ruleXAction )
                            	    // InternalXMachine.g:1976:8: lv_actions_27_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventMLCommentAccess().getActionsXActionParserRuleCall_6_2_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_27_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_27_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XAction");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt63 >= 1 ) break loop63;
                                        EarlyExitException eee =
                                            new EarlyExitException(63, input);
                                        throw eee;
                                }
                                cnt63++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_28=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getXEventMLCommentAccess().getEndKeyword_7());
            		

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
    // InternalXMachine.g:2004:1: entryRuleXEventSLComment returns [EObject current=null] : iv_ruleXEventSLComment= ruleXEventSLComment EOF ;
    public final EObject entryRuleXEventSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEventSLComment = null;


        try {
            // InternalXMachine.g:2004:56: (iv_ruleXEventSLComment= ruleXEventSLComment EOF )
            // InternalXMachine.g:2005:2: iv_ruleXEventSLComment= ruleXEventSLComment EOF
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
    // InternalXMachine.g:2011:1: ruleXEventSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )? ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )? otherlv_28= 'end' ) ;
    public final EObject ruleXEventSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_extended_3_0=null;
        Token lv_comment_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Enumerator lv_convergence_4_0 = null;

        EObject lv_witnesses_11_0 = null;

        EObject lv_actions_13_0 = null;

        EObject lv_guards_15_0 = null;

        EObject lv_witnesses_17_0 = null;

        EObject lv_actions_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_guards_23_0 = null;

        EObject lv_witnesses_25_0 = null;

        EObject lv_actions_27_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2017:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )? ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )? otherlv_28= 'end' ) )
            // InternalXMachine.g:2018:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )? ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )? otherlv_28= 'end' )
            {
            // InternalXMachine.g:2018:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )? ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )? otherlv_28= 'end' )
            // InternalXMachine.g:2019:3: () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )? (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )? ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )? otherlv_28= 'end'
            {
            // InternalXMachine.g:2019:3: ()
            // InternalXMachine.g:2020:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventSLCommentAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2026:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:2027:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:2027:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:2028:5: lv_name_1_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:2044:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:2045:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:2045:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:2046:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2());
            				
            // InternalXMachine.g:2049:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:2050:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:2050:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            loop66:
            do {
                int alt66=3;
                int LA66_0 = input.LA(1);

                if ( LA66_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0) ) {
                    alt66=1;
                }
                else if ( LA66_0 >= 33 && LA66_0 <= 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1) ) {
                    alt66=2;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalXMachine.g:2051:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalXMachine.g:2051:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    // InternalXMachine.g:2052:5: {...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalXMachine.g:2052:112: ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    // InternalXMachine.g:2053:6: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalXMachine.g:2056:9: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    // InternalXMachine.g:2056:10: {...}? => ( (lv_extended_3_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "true");
            	    }
            	    // InternalXMachine.g:2056:19: ( (lv_extended_3_0= 'extended' ) )
            	    // InternalXMachine.g:2056:20: (lv_extended_3_0= 'extended' )
            	    {
            	    // InternalXMachine.g:2056:20: (lv_extended_3_0= 'extended' )
            	    // InternalXMachine.g:2057:10: lv_extended_3_0= 'extended'
            	    {
            	    lv_extended_3_0=(Token)match(input,24,FOLLOW_32); 

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
            	    // InternalXMachine.g:2074:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:2074:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:2075:5: {...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalXMachine.g:2075:112: ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:2076:6: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalXMachine.g:2079:9: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:2079:10: {...}? => ( (lv_convergence_4_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "true");
            	    }
            	    // InternalXMachine.g:2079:19: ( (lv_convergence_4_0= ruleXConvergence ) )
            	    // InternalXMachine.g:2079:20: (lv_convergence_4_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:2079:20: (lv_convergence_4_0= ruleXConvergence )
            	    // InternalXMachine.g:2080:10: lv_convergence_4_0= ruleXConvergence
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
            	    											"ac.soton.eventb.xtext.machine.XMachine.XConvergence");
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
            	    break loop66;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2());
            				

            }

            // InternalXMachine.g:2109:3: ( (lv_comment_5_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:2110:4: (lv_comment_5_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:2110:4: (lv_comment_5_0= RULE_SL_COMMENT )
            // InternalXMachine.g:2111:5: lv_comment_5_0= RULE_SL_COMMENT
            {
            lv_comment_5_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_33); 

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

            // InternalXMachine.g:2127:3: (otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+ )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==25) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXMachine.g:2128:4: otherlv_6= 'synchronises' ( ruleXSynchronisedEvent )+
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getXEventSLCommentAccess().getSynchronisesKeyword_4_0());
                    			
                    // InternalXMachine.g:2132:4: ( ruleXSynchronisedEvent )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_ID) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalXMachine.g:2133:5: ruleXSynchronisedEvent
                    	    {

                    	    					newCompositeNode(grammarAccess.getXEventSLCommentAccess().getXSynchronisedEventParserRuleCall_4_1());
                    	    				
                    	    pushFollow(FOLLOW_25);
                    	    ruleXSynchronisedEvent();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

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

            // InternalXMachine.g:2142:3: (otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+ )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==13) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXMachine.g:2143:4: otherlv_8= 'refines' ( (otherlv_9= RULE_ID ) )+
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getXEventSLCommentAccess().getRefinesKeyword_5_0());
                    			
                    // InternalXMachine.g:2147:4: ( (otherlv_9= RULE_ID ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_ID) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalXMachine.g:2148:5: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:2148:5: (otherlv_9= RULE_ID )
                    	    // InternalXMachine.g:2149:6: otherlv_9= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXEventSLCommentRule());
                    	    						}
                    	    					
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getXEventSLCommentAccess().getRefinesEventCrossReference_5_1_0());
                    	    					

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
                    break;

            }

            // InternalXMachine.g:2161:3: ( ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ ) | (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? ) | (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? ) )?
            int alt85=4;
            switch ( input.LA(1) ) {
                case 26:
                case 27:
                    {
                    alt85=1;
                    }
                    break;
                case 28:
                    {
                    alt85=2;
                    }
                    break;
                case 30:
                    {
                    alt85=3;
                    }
                    break;
            }

            switch (alt85) {
                case 1 :
                    // InternalXMachine.g:2162:4: ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:2162:4: ( (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+ )
                    // InternalXMachine.g:2163:5: (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )? otherlv_12= 'begin' ( (lv_actions_13_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:2163:5: (otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+ )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==26) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalXMachine.g:2164:6: otherlv_10= 'with' ( (lv_witnesses_11_0= ruleXWitness ) )+
                            {
                            otherlv_10=(Token)match(input,26,FOLLOW_11); 

                            						newLeafNode(otherlv_10, grammarAccess.getXEventSLCommentAccess().getWithKeyword_6_0_0_0());
                            					
                            // InternalXMachine.g:2168:6: ( (lv_witnesses_11_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:2169:7: (lv_witnesses_11_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:2169:7: (lv_witnesses_11_0= ruleXWitness )
                            	    // InternalXMachine.g:2170:8: lv_witnesses_11_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventSLCommentAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_27);
                            	    lv_witnesses_11_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_11_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
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

                    otherlv_12=(Token)match(input,27,FOLLOW_11); 

                    					newLeafNode(otherlv_12, grammarAccess.getXEventSLCommentAccess().getBeginKeyword_6_0_1());
                    				
                    // InternalXMachine.g:2192:5: ( (lv_actions_13_0= ruleXAction ) )+
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
                    	    // InternalXMachine.g:2193:6: (lv_actions_13_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:2193:6: (lv_actions_13_0= ruleXAction )
                    	    // InternalXMachine.g:2194:7: lv_actions_13_0= ruleXAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventSLCommentAccess().getActionsXActionParserRuleCall_6_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_actions_13_0=ruleXAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_13_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XAction");
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


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2213:4: (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:2213:4: (otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:2214:5: otherlv_14= 'when' ( (lv_guards_15_0= ruleXGuard ) )+ (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )? (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )?
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_11); 

                    					newLeafNode(otherlv_14, grammarAccess.getXEventSLCommentAccess().getWhenKeyword_6_1_0());
                    				
                    // InternalXMachine.g:2218:5: ( (lv_guards_15_0= ruleXGuard ) )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==RULE_ML_COMMENT||LA74_0==RULE_XLABEL) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalXMachine.g:2219:6: (lv_guards_15_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:2219:6: (lv_guards_15_0= ruleXGuard )
                    	    // InternalXMachine.g:2220:7: lv_guards_15_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventSLCommentAccess().getGuardsXGuardParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_15_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_15_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt74 >= 1 ) break loop74;
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
                    } while (true);

                    // InternalXMachine.g:2237:5: (otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+ )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==26) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalXMachine.g:2238:6: otherlv_16= 'with' ( (lv_witnesses_17_0= ruleXWitness ) )+
                            {
                            otherlv_16=(Token)match(input,26,FOLLOW_11); 

                            						newLeafNode(otherlv_16, grammarAccess.getXEventSLCommentAccess().getWithKeyword_6_1_2_0());
                            					
                            // InternalXMachine.g:2242:6: ( (lv_witnesses_17_0= ruleXWitness ) )+
                            int cnt75=0;
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==RULE_ML_COMMENT||LA75_0==RULE_XLABEL) ) {
                                    alt75=1;
                                }


                                switch (alt75) {
                            	case 1 :
                            	    // InternalXMachine.g:2243:7: (lv_witnesses_17_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:2243:7: (lv_witnesses_17_0= ruleXWitness )
                            	    // InternalXMachine.g:2244:8: lv_witnesses_17_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventSLCommentAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_17_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_17_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
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


                            }
                            break;

                    }

                    // InternalXMachine.g:2262:5: (otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+ )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==29) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalXMachine.g:2263:6: otherlv_18= 'then' ( (lv_actions_19_0= ruleXAction ) )+
                            {
                            otherlv_18=(Token)match(input,29,FOLLOW_11); 

                            						newLeafNode(otherlv_18, grammarAccess.getXEventSLCommentAccess().getThenKeyword_6_1_3_0());
                            					
                            // InternalXMachine.g:2267:6: ( (lv_actions_19_0= ruleXAction ) )+
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
                            	    // InternalXMachine.g:2268:7: (lv_actions_19_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:2268:7: (lv_actions_19_0= ruleXAction )
                            	    // InternalXMachine.g:2269:8: lv_actions_19_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventSLCommentAccess().getActionsXActionParserRuleCall_6_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_19_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_19_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XAction");
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


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2289:4: (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:2289:4: (otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:2290:5: otherlv_20= 'any' ( (lv_parameters_21_0= ruleXParameter ) )+ otherlv_22= 'where' ( (lv_guards_23_0= ruleXGuard ) )+ (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )? (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )?
                    {
                    otherlv_20=(Token)match(input,30,FOLLOW_9); 

                    					newLeafNode(otherlv_20, grammarAccess.getXEventSLCommentAccess().getAnyKeyword_6_2_0());
                    				
                    // InternalXMachine.g:2294:5: ( (lv_parameters_21_0= ruleXParameter ) )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==RULE_ML_COMMENT||LA79_0==RULE_ID) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalXMachine.g:2295:6: (lv_parameters_21_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:2295:6: (lv_parameters_21_0= ruleXParameter )
                    	    // InternalXMachine.g:2296:7: lv_parameters_21_0= ruleXParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventSLCommentAccess().getParametersXParameterParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_parameters_21_0=ruleXParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_21_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XParameter");
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

                    otherlv_22=(Token)match(input,31,FOLLOW_11); 

                    					newLeafNode(otherlv_22, grammarAccess.getXEventSLCommentAccess().getWhereKeyword_6_2_2());
                    				
                    // InternalXMachine.g:2317:5: ( (lv_guards_23_0= ruleXGuard ) )+
                    int cnt80=0;
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==RULE_ML_COMMENT||LA80_0==RULE_XLABEL) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalXMachine.g:2318:6: (lv_guards_23_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:2318:6: (lv_guards_23_0= ruleXGuard )
                    	    // InternalXMachine.g:2319:7: lv_guards_23_0= ruleXGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getXEventSLCommentAccess().getGuardsXGuardParserRuleCall_6_2_3_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_23_0=ruleXGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_23_0,
                    	    								"ac.soton.eventb.xtext.machine.XMachine.XGuard");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt80 >= 1 ) break loop80;
                                EarlyExitException eee =
                                    new EarlyExitException(80, input);
                                throw eee;
                        }
                        cnt80++;
                    } while (true);

                    // InternalXMachine.g:2336:5: (otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+ )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==26) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalXMachine.g:2337:6: otherlv_24= 'with' ( (lv_witnesses_25_0= ruleXWitness ) )+
                            {
                            otherlv_24=(Token)match(input,26,FOLLOW_11); 

                            						newLeafNode(otherlv_24, grammarAccess.getXEventSLCommentAccess().getWithKeyword_6_2_4_0());
                            					
                            // InternalXMachine.g:2341:6: ( (lv_witnesses_25_0= ruleXWitness ) )+
                            int cnt81=0;
                            loop81:
                            do {
                                int alt81=2;
                                int LA81_0 = input.LA(1);

                                if ( (LA81_0==RULE_ML_COMMENT||LA81_0==RULE_XLABEL) ) {
                                    alt81=1;
                                }


                                switch (alt81) {
                            	case 1 :
                            	    // InternalXMachine.g:2342:7: (lv_witnesses_25_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:2342:7: (lv_witnesses_25_0= ruleXWitness )
                            	    // InternalXMachine.g:2343:8: lv_witnesses_25_0= ruleXWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventSLCommentAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_30);
                            	    lv_witnesses_25_0=ruleXWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_25_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XWitness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt81 >= 1 ) break loop81;
                                        EarlyExitException eee =
                                            new EarlyExitException(81, input);
                                        throw eee;
                                }
                                cnt81++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalXMachine.g:2361:5: (otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+ )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==29) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalXMachine.g:2362:6: otherlv_26= 'then' ( (lv_actions_27_0= ruleXAction ) )+
                            {
                            otherlv_26=(Token)match(input,29,FOLLOW_11); 

                            						newLeafNode(otherlv_26, grammarAccess.getXEventSLCommentAccess().getThenKeyword_6_2_5_0());
                            					
                            // InternalXMachine.g:2366:6: ( (lv_actions_27_0= ruleXAction ) )+
                            int cnt83=0;
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==RULE_ML_COMMENT||LA83_0==RULE_XLABEL) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // InternalXMachine.g:2367:7: (lv_actions_27_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:2367:7: (lv_actions_27_0= ruleXAction )
                            	    // InternalXMachine.g:2368:8: lv_actions_27_0= ruleXAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getXEventSLCommentAccess().getActionsXActionParserRuleCall_6_2_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_actions_27_0=ruleXAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_27_0,
                            	    									"ac.soton.eventb.xtext.machine.XMachine.XAction");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt83 >= 1 ) break loop83;
                                        EarlyExitException eee =
                                            new EarlyExitException(83, input);
                                        throw eee;
                                }
                                cnt83++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_28=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getXEventSLCommentAccess().getEndKeyword_7());
            		

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


    // $ANTLR start "entryRuleXSynchronisedEvent"
    // InternalXMachine.g:2396:1: entryRuleXSynchronisedEvent returns [String current=null] : iv_ruleXSynchronisedEvent= ruleXSynchronisedEvent EOF ;
    public final String entryRuleXSynchronisedEvent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXSynchronisedEvent = null;


        try {
            // InternalXMachine.g:2396:58: (iv_ruleXSynchronisedEvent= ruleXSynchronisedEvent EOF )
            // InternalXMachine.g:2397:2: iv_ruleXSynchronisedEvent= ruleXSynchronisedEvent EOF
            {
             newCompositeNode(grammarAccess.getXSynchronisedEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXSynchronisedEvent=ruleXSynchronisedEvent();

            state._fsp--;

             current =iv_ruleXSynchronisedEvent.getText(); 
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
    // $ANTLR end "entryRuleXSynchronisedEvent"


    // $ANTLR start "ruleXSynchronisedEvent"
    // InternalXMachine.g:2403:1: ruleXSynchronisedEvent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleXSynchronisedEvent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:2409:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalXMachine.g:2410:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalXMachine.g:2410:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalXMachine.g:2411:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getXSynchronisedEventAccess().getIDTerminalRuleCall_0());
            		
            // InternalXMachine.g:2418:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==32) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalXMachine.g:2419:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,32,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXSynchronisedEventAccess().getFullStopKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getXSynchronisedEventAccess().getIDTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleXSynchronisedEvent"


    // $ANTLR start "entryRuleXParameter"
    // InternalXMachine.g:2436:1: entryRuleXParameter returns [EObject current=null] : iv_ruleXParameter= ruleXParameter EOF ;
    public final EObject entryRuleXParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameter = null;


        try {
            // InternalXMachine.g:2436:51: (iv_ruleXParameter= ruleXParameter EOF )
            // InternalXMachine.g:2437:2: iv_ruleXParameter= ruleXParameter EOF
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
    // InternalXMachine.g:2443:1: ruleXParameter returns [EObject current=null] : (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment ) ;
    public final EObject ruleXParameter() throws RecognitionException {
        EObject current = null;

        EObject this_XParameterNoComment_0 = null;

        EObject this_XParameterMLComment_1 = null;

        EObject this_XParameterSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2449:2: ( (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment ) )
            // InternalXMachine.g:2450:2: (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment )
            {
            // InternalXMachine.g:2450:2: (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment )
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==EOF||LA87_1==RULE_ML_COMMENT||LA87_1==RULE_ID||LA87_1==31) ) {
                    alt87=1;
                }
                else if ( (LA87_1==RULE_SL_COMMENT) ) {
                    alt87=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA87_0==RULE_ML_COMMENT) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalXMachine.g:2451:3: this_XParameterNoComment_0= ruleXParameterNoComment
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
                    // InternalXMachine.g:2460:3: this_XParameterMLComment_1= ruleXParameterMLComment
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
                    // InternalXMachine.g:2469:3: this_XParameterSLComment_2= ruleXParameterSLComment
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
    // InternalXMachine.g:2481:1: entryRuleXParameterNoComment returns [EObject current=null] : iv_ruleXParameterNoComment= ruleXParameterNoComment EOF ;
    public final EObject entryRuleXParameterNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterNoComment = null;


        try {
            // InternalXMachine.g:2481:60: (iv_ruleXParameterNoComment= ruleXParameterNoComment EOF )
            // InternalXMachine.g:2482:2: iv_ruleXParameterNoComment= ruleXParameterNoComment EOF
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
    // InternalXMachine.g:2488:1: ruleXParameterNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameterNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:2494:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:2495:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:2495:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:2496:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:2496:3: ()
            // InternalXMachine.g:2497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterNoCommentAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2503:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:2504:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:2504:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:2505:5: lv_name_1_0= RULE_ID
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
    // $ANTLR end "ruleXParameterNoComment"


    // $ANTLR start "entryRuleXParameterMLComment"
    // InternalXMachine.g:2525:1: entryRuleXParameterMLComment returns [EObject current=null] : iv_ruleXParameterMLComment= ruleXParameterMLComment EOF ;
    public final EObject entryRuleXParameterMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterMLComment = null;


        try {
            // InternalXMachine.g:2525:60: (iv_ruleXParameterMLComment= ruleXParameterMLComment EOF )
            // InternalXMachine.g:2526:2: iv_ruleXParameterMLComment= ruleXParameterMLComment EOF
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
    // InternalXMachine.g:2532:1: ruleXParameterMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameterMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:2538:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:2539:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:2539:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:2540:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:2540:3: ()
            // InternalXMachine.g:2541:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterMLCommentAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2547:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:2548:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:2548:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:2549:5: lv_comment_1_0= RULE_ML_COMMENT
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

            // InternalXMachine.g:2565:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:2566:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:2566:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:2567:5: lv_name_2_0= RULE_ID
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
    // $ANTLR end "ruleXParameterMLComment"


    // $ANTLR start "entryRuleXParameterSLComment"
    // InternalXMachine.g:2587:1: entryRuleXParameterSLComment returns [EObject current=null] : iv_ruleXParameterSLComment= ruleXParameterSLComment EOF ;
    public final EObject entryRuleXParameterSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterSLComment = null;


        try {
            // InternalXMachine.g:2587:60: (iv_ruleXParameterSLComment= ruleXParameterSLComment EOF )
            // InternalXMachine.g:2588:2: iv_ruleXParameterSLComment= ruleXParameterSLComment EOF
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
    // InternalXMachine.g:2594:1: ruleXParameterSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXParameterSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:2600:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:2601:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:2601:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:2602:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:2602:3: ()
            // InternalXMachine.g:2603:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterSLCommentAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2609:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:2610:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:2610:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:2611:5: lv_name_1_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:2627:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:2628:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:2628:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:2629:5: lv_comment_2_0= RULE_SL_COMMENT
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
    // InternalXMachine.g:2649:1: entryRuleXGuard returns [EObject current=null] : iv_ruleXGuard= ruleXGuard EOF ;
    public final EObject entryRuleXGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuard = null;


        try {
            // InternalXMachine.g:2649:47: (iv_ruleXGuard= ruleXGuard EOF )
            // InternalXMachine.g:2650:2: iv_ruleXGuard= ruleXGuard EOF
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
    // InternalXMachine.g:2656:1: ruleXGuard returns [EObject current=null] : (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment ) ;
    public final EObject ruleXGuard() throws RecognitionException {
        EObject current = null;

        EObject this_XGuardNoComment_0 = null;

        EObject this_XGuardMLComment_1 = null;

        EObject this_XGuardSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2662:2: ( (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment ) )
            // InternalXMachine.g:2663:2: (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment )
            {
            // InternalXMachine.g:2663:2: (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment )
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_XLABEL) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 23:
                        {
                        int LA88_4 = input.LA(4);

                        if ( (LA88_4==RULE_SL_COMMENT) ) {
                            alt88=3;
                        }
                        else if ( (LA88_4==EOF||LA88_4==RULE_ML_COMMENT||LA88_4==RULE_XLABEL||LA88_4==20||LA88_4==26||LA88_4==29) ) {
                            alt88=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 88, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_ML_COMMENT:
                    case RULE_XLABEL:
                    case 20:
                    case 26:
                    case 29:
                        {
                        alt88=1;
                        }
                        break;
                    case RULE_SL_COMMENT:
                        {
                        alt88=3;
                        }
                        break;
                    default:
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
                    // InternalXMachine.g:2664:3: this_XGuardNoComment_0= ruleXGuardNoComment
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
                    // InternalXMachine.g:2673:3: this_XGuardMLComment_1= ruleXGuardMLComment
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
                    // InternalXMachine.g:2682:3: this_XGuardSLComment_2= ruleXGuardSLComment
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
    // InternalXMachine.g:2694:1: entryRuleXGuardNoComment returns [EObject current=null] : iv_ruleXGuardNoComment= ruleXGuardNoComment EOF ;
    public final EObject entryRuleXGuardNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardNoComment = null;


        try {
            // InternalXMachine.g:2694:56: (iv_ruleXGuardNoComment= ruleXGuardNoComment EOF )
            // InternalXMachine.g:2695:2: iv_ruleXGuardNoComment= ruleXGuardNoComment EOF
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
    // InternalXMachine.g:2701:1: ruleXGuardNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuardNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:2707:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:2708:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:2708:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:2709:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:2709:3: ()
            // InternalXMachine.g:2710:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardNoCommentAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2716:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:2717:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:2717:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:2718:5: lv_name_1_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:2734:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:2735:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:2735:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:2736:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_predicate_2_0, grammarAccess.getXGuardNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:2752:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==23) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalXMachine.g:2753:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:2753:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:2754:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,23,FOLLOW_2); 

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
    // InternalXMachine.g:2770:1: entryRuleXGuardMLComment returns [EObject current=null] : iv_ruleXGuardMLComment= ruleXGuardMLComment EOF ;
    public final EObject entryRuleXGuardMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardMLComment = null;


        try {
            // InternalXMachine.g:2770:56: (iv_ruleXGuardMLComment= ruleXGuardMLComment EOF )
            // InternalXMachine.g:2771:2: iv_ruleXGuardMLComment= ruleXGuardMLComment EOF
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
    // InternalXMachine.g:2777:1: ruleXGuardMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuardMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_predicate_3_0=null;
        Token lv_theorem_4_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:2783:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) )
            // InternalXMachine.g:2784:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:2784:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            // InternalXMachine.g:2785:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )?
            {
            // InternalXMachine.g:2785:3: ()
            // InternalXMachine.g:2786:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardMLCommentAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2792:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:2793:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:2793:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:2794:5: lv_comment_1_0= RULE_ML_COMMENT
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

            // InternalXMachine.g:2810:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:2811:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:2811:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:2812:5: lv_name_2_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:2828:3: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalXMachine.g:2829:4: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalXMachine.g:2829:4: (lv_predicate_3_0= RULE_STRING )
            // InternalXMachine.g:2830:5: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_predicate_3_0, grammarAccess.getXGuardMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:2846:3: ( (lv_theorem_4_0= 'theorem' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==23) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalXMachine.g:2847:4: (lv_theorem_4_0= 'theorem' )
                    {
                    // InternalXMachine.g:2847:4: (lv_theorem_4_0= 'theorem' )
                    // InternalXMachine.g:2848:5: lv_theorem_4_0= 'theorem'
                    {
                    lv_theorem_4_0=(Token)match(input,23,FOLLOW_2); 

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
    // InternalXMachine.g:2864:1: entryRuleXGuardSLComment returns [EObject current=null] : iv_ruleXGuardSLComment= ruleXGuardSLComment EOF ;
    public final EObject entryRuleXGuardSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardSLComment = null;


        try {
            // InternalXMachine.g:2864:56: (iv_ruleXGuardSLComment= ruleXGuardSLComment EOF )
            // InternalXMachine.g:2865:2: iv_ruleXGuardSLComment= ruleXGuardSLComment EOF
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
    // InternalXMachine.g:2871:1: ruleXGuardSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXGuardSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;
        Token lv_comment_4_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:2877:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:2878:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:2878:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:2879:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:2879:3: ()
            // InternalXMachine.g:2880:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardSLCommentAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2886:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:2887:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:2887:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:2888:5: lv_name_1_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:2904:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:2905:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:2905:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:2906:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_predicate_2_0, grammarAccess.getXGuardSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:2922:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==23) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalXMachine.g:2923:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:2923:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:2924:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,23,FOLLOW_19); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXGuardSLCommentAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardSLCommentRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:2936:3: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:2937:4: (lv_comment_4_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:2937:4: (lv_comment_4_0= RULE_SL_COMMENT )
            // InternalXMachine.g:2938:5: lv_comment_4_0= RULE_SL_COMMENT
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
    // InternalXMachine.g:2958:1: entryRuleXWitness returns [EObject current=null] : iv_ruleXWitness= ruleXWitness EOF ;
    public final EObject entryRuleXWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitness = null;


        try {
            // InternalXMachine.g:2958:49: (iv_ruleXWitness= ruleXWitness EOF )
            // InternalXMachine.g:2959:2: iv_ruleXWitness= ruleXWitness EOF
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
    // InternalXMachine.g:2965:1: ruleXWitness returns [EObject current=null] : (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment ) ;
    public final EObject ruleXWitness() throws RecognitionException {
        EObject current = null;

        EObject this_XWitnessNoComment_0 = null;

        EObject this_XWitnessMLComment_1 = null;

        EObject this_XWitnessSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2971:2: ( (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment ) )
            // InternalXMachine.g:2972:2: (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment )
            {
            // InternalXMachine.g:2972:2: (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment )
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_XLABEL) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==RULE_STRING) ) {
                    int LA92_3 = input.LA(3);

                    if ( (LA92_3==RULE_SL_COMMENT) ) {
                        alt92=3;
                    }
                    else if ( (LA92_3==EOF||LA92_3==RULE_ML_COMMENT||LA92_3==RULE_XLABEL||LA92_3==20||LA92_3==27||LA92_3==29) ) {
                        alt92=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA92_0==RULE_ML_COMMENT) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalXMachine.g:2973:3: this_XWitnessNoComment_0= ruleXWitnessNoComment
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
                    // InternalXMachine.g:2982:3: this_XWitnessMLComment_1= ruleXWitnessMLComment
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
                    // InternalXMachine.g:2991:3: this_XWitnessSLComment_2= ruleXWitnessSLComment
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
    // InternalXMachine.g:3003:1: entryRuleXWitnessNoComment returns [EObject current=null] : iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF ;
    public final EObject entryRuleXWitnessNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessNoComment = null;


        try {
            // InternalXMachine.g:3003:58: (iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF )
            // InternalXMachine.g:3004:2: iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF
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
    // InternalXMachine.g:3010:1: ruleXWitnessNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXWitnessNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:3016:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:3017:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:3017:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) )
            // InternalXMachine.g:3018:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) )
            {
            // InternalXMachine.g:3018:3: ()
            // InternalXMachine.g:3019:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessNoCommentAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3025:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3026:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3026:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3027:5: lv_name_1_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3043:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:3044:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:3044:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:3045:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_predicate_2_0, grammarAccess.getXWitnessNoCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_2_0,
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
    // $ANTLR end "ruleXWitnessNoComment"


    // $ANTLR start "entryRuleXWitnessMLComment"
    // InternalXMachine.g:3065:1: entryRuleXWitnessMLComment returns [EObject current=null] : iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF ;
    public final EObject entryRuleXWitnessMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessMLComment = null;


        try {
            // InternalXMachine.g:3065:58: (iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF )
            // InternalXMachine.g:3066:2: iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF
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
    // InternalXMachine.g:3072:1: ruleXWitnessMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleXWitnessMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_predicate_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:3078:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:3079:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:3079:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) )
            // InternalXMachine.g:3080:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) )
            {
            // InternalXMachine.g:3080:3: ()
            // InternalXMachine.g:3081:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessMLCommentAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3087:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:3088:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3088:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:3089:5: lv_comment_1_0= RULE_ML_COMMENT
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

            // InternalXMachine.g:3105:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:3106:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3106:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:3107:5: lv_name_2_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3123:3: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalXMachine.g:3124:4: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalXMachine.g:3124:4: (lv_predicate_3_0= RULE_STRING )
            // InternalXMachine.g:3125:5: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_predicate_3_0, grammarAccess.getXWitnessMLCommentAccess().getPredicateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_3_0,
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
    // $ANTLR end "ruleXWitnessMLComment"


    // $ANTLR start "entryRuleXWitnessSLComment"
    // InternalXMachine.g:3145:1: entryRuleXWitnessSLComment returns [EObject current=null] : iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF ;
    public final EObject entryRuleXWitnessSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessSLComment = null;


        try {
            // InternalXMachine.g:3145:58: (iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF )
            // InternalXMachine.g:3146:2: iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF
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
    // InternalXMachine.g:3152:1: ruleXWitnessSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXWitnessSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_comment_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:3158:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:3159:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:3159:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:3160:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:3160:3: ()
            // InternalXMachine.g:3161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessSLCommentAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3167:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3168:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3168:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3169:5: lv_name_1_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3185:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:3186:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:3186:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:3187:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_predicate_2_0, grammarAccess.getXWitnessSLCommentAccess().getPredicateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:3203:3: ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:3204:4: (lv_comment_3_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3204:4: (lv_comment_3_0= RULE_SL_COMMENT )
            // InternalXMachine.g:3205:5: lv_comment_3_0= RULE_SL_COMMENT
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
    // InternalXMachine.g:3225:1: entryRuleXAction returns [EObject current=null] : iv_ruleXAction= ruleXAction EOF ;
    public final EObject entryRuleXAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAction = null;


        try {
            // InternalXMachine.g:3225:48: (iv_ruleXAction= ruleXAction EOF )
            // InternalXMachine.g:3226:2: iv_ruleXAction= ruleXAction EOF
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
    // InternalXMachine.g:3232:1: ruleXAction returns [EObject current=null] : (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment ) ;
    public final EObject ruleXAction() throws RecognitionException {
        EObject current = null;

        EObject this_XActionNoComment_0 = null;

        EObject this_XActionMLComment_1 = null;

        EObject this_XActionSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3238:2: ( (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment ) )
            // InternalXMachine.g:3239:2: (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment )
            {
            // InternalXMachine.g:3239:2: (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment )
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_XLABEL) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==RULE_STRING) ) {
                    int LA93_3 = input.LA(3);

                    if ( (LA93_3==EOF||LA93_3==RULE_ML_COMMENT||LA93_3==RULE_XLABEL||LA93_3==20) ) {
                        alt93=1;
                    }
                    else if ( (LA93_3==RULE_SL_COMMENT) ) {
                        alt93=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA93_0==RULE_ML_COMMENT) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalXMachine.g:3240:3: this_XActionNoComment_0= ruleXActionNoComment
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
                    // InternalXMachine.g:3249:3: this_XActionMLComment_1= ruleXActionMLComment
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
                    // InternalXMachine.g:3258:3: this_XActionSLComment_2= ruleXActionSLComment
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
    // InternalXMachine.g:3270:1: entryRuleXActionNoComment returns [EObject current=null] : iv_ruleXActionNoComment= ruleXActionNoComment EOF ;
    public final EObject entryRuleXActionNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionNoComment = null;


        try {
            // InternalXMachine.g:3270:57: (iv_ruleXActionNoComment= ruleXActionNoComment EOF )
            // InternalXMachine.g:3271:2: iv_ruleXActionNoComment= ruleXActionNoComment EOF
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
    // InternalXMachine.g:3277:1: ruleXActionNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXActionNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_action_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:3283:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:3284:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:3284:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) )
            // InternalXMachine.g:3285:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) )
            {
            // InternalXMachine.g:3285:3: ()
            // InternalXMachine.g:3286:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionNoCommentAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3292:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3293:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3293:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3294:5: lv_name_1_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3310:3: ( (lv_action_2_0= RULE_STRING ) )
            // InternalXMachine.g:3311:4: (lv_action_2_0= RULE_STRING )
            {
            // InternalXMachine.g:3311:4: (lv_action_2_0= RULE_STRING )
            // InternalXMachine.g:3312:5: lv_action_2_0= RULE_STRING
            {
            lv_action_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_action_2_0, grammarAccess.getXActionNoCommentAccess().getActionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionNoCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_2_0,
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
    // $ANTLR end "ruleXActionNoComment"


    // $ANTLR start "entryRuleXActionMLComment"
    // InternalXMachine.g:3332:1: entryRuleXActionMLComment returns [EObject current=null] : iv_ruleXActionMLComment= ruleXActionMLComment EOF ;
    public final EObject entryRuleXActionMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionMLComment = null;


        try {
            // InternalXMachine.g:3332:57: (iv_ruleXActionMLComment= ruleXActionMLComment EOF )
            // InternalXMachine.g:3333:2: iv_ruleXActionMLComment= ruleXActionMLComment EOF
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
    // InternalXMachine.g:3339:1: ruleXActionMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleXActionMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_action_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:3345:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:3346:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:3346:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) )
            // InternalXMachine.g:3347:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) )
            {
            // InternalXMachine.g:3347:3: ()
            // InternalXMachine.g:3348:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionMLCommentAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3354:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:3355:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3355:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:3356:5: lv_comment_1_0= RULE_ML_COMMENT
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

            // InternalXMachine.g:3372:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:3373:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3373:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:3374:5: lv_name_2_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3390:3: ( (lv_action_3_0= RULE_STRING ) )
            // InternalXMachine.g:3391:4: (lv_action_3_0= RULE_STRING )
            {
            // InternalXMachine.g:3391:4: (lv_action_3_0= RULE_STRING )
            // InternalXMachine.g:3392:5: lv_action_3_0= RULE_STRING
            {
            lv_action_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_action_3_0, grammarAccess.getXActionMLCommentAccess().getActionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionMLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_3_0,
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
    // $ANTLR end "ruleXActionMLComment"


    // $ANTLR start "entryRuleXActionSLComment"
    // InternalXMachine.g:3412:1: entryRuleXActionSLComment returns [EObject current=null] : iv_ruleXActionSLComment= ruleXActionSLComment EOF ;
    public final EObject entryRuleXActionSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionSLComment = null;


        try {
            // InternalXMachine.g:3412:57: (iv_ruleXActionSLComment= ruleXActionSLComment EOF )
            // InternalXMachine.g:3413:2: iv_ruleXActionSLComment= ruleXActionSLComment EOF
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
    // InternalXMachine.g:3419:1: ruleXActionSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXActionSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_action_2_0=null;
        Token lv_comment_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:3425:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:3426:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:3426:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:3427:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:3427:3: ()
            // InternalXMachine.g:3428:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionSLCommentAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3434:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3435:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3435:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3436:5: lv_name_1_0= RULE_XLABEL
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
            						"ac.soton.eventb.xtext.machine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3452:3: ( (lv_action_2_0= RULE_STRING ) )
            // InternalXMachine.g:3453:4: (lv_action_2_0= RULE_STRING )
            {
            // InternalXMachine.g:3453:4: (lv_action_2_0= RULE_STRING )
            // InternalXMachine.g:3454:5: lv_action_2_0= RULE_STRING
            {
            lv_action_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_action_2_0, grammarAccess.getXActionSLCommentAccess().getActionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionSLCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXMachine.g:3470:3: ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:3471:4: (lv_comment_3_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3471:4: (lv_comment_3_0= RULE_SL_COMMENT )
            // InternalXMachine.g:3472:5: lv_comment_3_0= RULE_SL_COMMENT
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


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:3492:1: ruleXConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleXConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:3498:2: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalXMachine.g:3499:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalXMachine.g:3499:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt94=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt94=1;
                }
                break;
            case 34:
                {
                alt94=2;
                }
                break;
            case 35:
                {
                alt94=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalXMachine.g:3500:3: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalXMachine.g:3500:3: (enumLiteral_0= 'ordinary' )
                    // InternalXMachine.g:3501:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3508:3: (enumLiteral_1= 'convergent' )
                    {
                    // InternalXMachine.g:3508:3: (enumLiteral_1= 'convergent' )
                    // InternalXMachine.g:3509:4: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:3516:3: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalXMachine.g:3516:3: (enumLiteral_2= 'anticipated' )
                    // InternalXMachine.g:3517:4: enumLiteral_2= 'anticipated'
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


    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\4\1\5\1\uffff\4\5\2\uffff";
    static final String dfa_3s = "\1\6\1\43\1\uffff\4\43\2\uffff";
    static final String dfa_4s = "\2\uffff\1\2\4\uffff\1\3\1\1";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\1",
            "\1\7\7\uffff\1\10\6\uffff\1\10\3\uffff\1\3\4\10\1\uffff\1\10\2\uffff\1\4\1\5\1\6",
            "",
            "\1\7\7\uffff\1\10\6\uffff\1\10\3\uffff\1\3\4\10\1\uffff\1\10\2\uffff\1\4\1\5\1\6",
            "\1\7\7\uffff\1\10\6\uffff\1\10\3\uffff\1\3\4\10\1\uffff\1\10\2\uffff\1\4\1\5\1\6",
            "\1\7\7\uffff\1\10\6\uffff\1\10\3\uffff\1\3\4\10\1\uffff\1\10\2\uffff\1\4\1\5\1\6",
            "\1\7\7\uffff\1\10\6\uffff\1\10\3\uffff\1\3\4\10\1\uffff\1\10\2\uffff\1\4\1\5\1\6",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1207:2: (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001FE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001F8040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001C0090L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100050L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000E5F102000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000005C102040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000005C100040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000090L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100090L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000024100090L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020100090L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000050L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000E01000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000005E102000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000002L});

}
