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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'id'", "'machine'", "'refines'", "'includes'", "'to'", "'as'", "'end'", "'theorem'"
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
    // InternalXMachine.g:72:1: ruleXMachine returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? (otherlv_2= 'id' ( (lv_extensionId_3_0= RULE_ID ) ) ) otherlv_4= 'machine' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'includes' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'as' ( (lv_prefixes_13_0= RULE_ID ) ) ( (lv_prefixes_14_0= RULE_ID ) )* )? otherlv_15= 'end' ) ;
    public final EObject ruleXMachine() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_extensionId_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_prefixes_13_0=null;
        Token lv_prefixes_14_0=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalXMachine.g:78:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? (otherlv_2= 'id' ( (lv_extensionId_3_0= RULE_ID ) ) ) otherlv_4= 'machine' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'includes' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'as' ( (lv_prefixes_13_0= RULE_ID ) ) ( (lv_prefixes_14_0= RULE_ID ) )* )? otherlv_15= 'end' ) )
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? (otherlv_2= 'id' ( (lv_extensionId_3_0= RULE_ID ) ) ) otherlv_4= 'machine' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'includes' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'as' ( (lv_prefixes_13_0= RULE_ID ) ) ( (lv_prefixes_14_0= RULE_ID ) )* )? otherlv_15= 'end' )
            {
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? (otherlv_2= 'id' ( (lv_extensionId_3_0= RULE_ID ) ) ) otherlv_4= 'machine' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'includes' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'as' ( (lv_prefixes_13_0= RULE_ID ) ) ( (lv_prefixes_14_0= RULE_ID ) )* )? otherlv_15= 'end' )
            // InternalXMachine.g:80:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? (otherlv_2= 'id' ( (lv_extensionId_3_0= RULE_ID ) ) ) otherlv_4= 'machine' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'includes' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'as' ( (lv_prefixes_13_0= RULE_ID ) ) ( (lv_prefixes_14_0= RULE_ID ) )* )? otherlv_15= 'end'
            {
            // InternalXMachine.g:80:3: ()
            // InternalXMachine.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXMachineAccess().getMachineInclusionAction_0(),
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

            // InternalXMachine.g:122:3: (otherlv_2= 'id' ( (lv_extensionId_3_0= RULE_ID ) ) )
            // InternalXMachine.g:123:4: otherlv_2= 'id' ( (lv_extensionId_3_0= RULE_ID ) )
            {
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getXMachineAccess().getIdKeyword_2_0());
            			
            // InternalXMachine.g:127:4: ( (lv_extensionId_3_0= RULE_ID ) )
            // InternalXMachine.g:128:5: (lv_extensionId_3_0= RULE_ID )
            {
            // InternalXMachine.g:128:5: (lv_extensionId_3_0= RULE_ID )
            // InternalXMachine.g:129:6: lv_extensionId_3_0= RULE_ID
            {
            lv_extensionId_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            						newLeafNode(lv_extensionId_3_0, grammarAccess.getXMachineAccess().getExtensionIdIDTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getXMachineRule());
            						}
            						setWithLastConsumed(
            							current,
            							"extensionId",
            							lv_extensionId_3_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getXMachineAccess().getMachineKeyword_3());
            		
            // InternalXMachine.g:150:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalXMachine.g:151:4: (lv_name_5_0= RULE_ID )
            {
            // InternalXMachine.g:151:4: (lv_name_5_0= RULE_ID )
            // InternalXMachine.g:152:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_5_0, grammarAccess.getXMachineAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXMachine.g:168:3: (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:169:4: otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getXMachineAccess().getRefinesKeyword_5_0());
                    			
                    // InternalXMachine.g:173:4: ( (otherlv_7= RULE_ID ) )
                    // InternalXMachine.g:174:5: (otherlv_7= RULE_ID )
                    {
                    // InternalXMachine.g:174:5: (otherlv_7= RULE_ID )
                    // InternalXMachine.g:175:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXMachineRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_7, grammarAccess.getXMachineAccess().getRefinesMachineInclusionCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:187:3: (otherlv_8= 'includes' ( (otherlv_9= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:188:4: otherlv_8= 'includes' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getXMachineAccess().getIncludesKeyword_6_0());
                    			
                    // InternalXMachine.g:192:4: ( (otherlv_9= RULE_ID ) )
                    // InternalXMachine.g:193:5: (otherlv_9= RULE_ID )
                    {
                    // InternalXMachine.g:193:5: (otherlv_9= RULE_ID )
                    // InternalXMachine.g:194:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXMachineRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_9, grammarAccess.getXMachineAccess().getAbstractMachineMachineInclusionCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:206:3: (otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:207:4: otherlv_10= 'to' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getXMachineAccess().getToKeyword_7_0());
                    			
                    // InternalXMachine.g:211:4: ( (otherlv_11= RULE_ID ) )
                    // InternalXMachine.g:212:5: (otherlv_11= RULE_ID )
                    {
                    // InternalXMachine.g:212:5: (otherlv_11= RULE_ID )
                    // InternalXMachine.g:213:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXMachineRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_11, grammarAccess.getXMachineAccess().getConcreteMachineMachineInclusionCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:225:3: (otherlv_12= 'as' ( (lv_prefixes_13_0= RULE_ID ) ) ( (lv_prefixes_14_0= RULE_ID ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:226:4: otherlv_12= 'as' ( (lv_prefixes_13_0= RULE_ID ) ) ( (lv_prefixes_14_0= RULE_ID ) )*
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getXMachineAccess().getAsKeyword_8_0());
                    			
                    // InternalXMachine.g:230:4: ( (lv_prefixes_13_0= RULE_ID ) )
                    // InternalXMachine.g:231:5: (lv_prefixes_13_0= RULE_ID )
                    {
                    // InternalXMachine.g:231:5: (lv_prefixes_13_0= RULE_ID )
                    // InternalXMachine.g:232:6: lv_prefixes_13_0= RULE_ID
                    {
                    lv_prefixes_13_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_prefixes_13_0, grammarAccess.getXMachineAccess().getPrefixesIDTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXMachineRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"prefixes",
                    							lv_prefixes_13_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalXMachine.g:248:4: ( (lv_prefixes_14_0= RULE_ID ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXMachine.g:249:5: (lv_prefixes_14_0= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:249:5: (lv_prefixes_14_0= RULE_ID )
                    	    // InternalXMachine.g:250:6: lv_prefixes_14_0= RULE_ID
                    	    {
                    	    lv_prefixes_14_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    						newLeafNode(lv_prefixes_14_0, grammarAccess.getXMachineAccess().getPrefixesIDTerminalRuleCall_8_2_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXMachineRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"prefixes",
                    	    							lv_prefixes_14_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getXMachineAccess().getEndKeyword_9());
            		

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
    // InternalXMachine.g:275:1: entryRuleXVariable returns [EObject current=null] : iv_ruleXVariable= ruleXVariable EOF ;
    public final EObject entryRuleXVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariable = null;


        try {
            // InternalXMachine.g:275:50: (iv_ruleXVariable= ruleXVariable EOF )
            // InternalXMachine.g:276:2: iv_ruleXVariable= ruleXVariable EOF
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
    // InternalXMachine.g:282:1: ruleXVariable returns [EObject current=null] : (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment ) ;
    public final EObject ruleXVariable() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableNoComment_0 = null;

        EObject this_XVariableMLComment_1 = null;

        EObject this_XVariableSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:288:2: ( (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment ) )
            // InternalXMachine.g:289:2: (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment )
            {
            // InternalXMachine.g:289:2: (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF) ) {
                    alt8=1;
                }
                else if ( (LA8_1==RULE_SL_COMMENT) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ML_COMMENT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:290:3: this_XVariableNoComment_0= ruleXVariableNoComment
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
                    // InternalXMachine.g:299:3: this_XVariableMLComment_1= ruleXVariableMLComment
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
                    // InternalXMachine.g:308:3: this_XVariableSLComment_2= ruleXVariableSLComment
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
    // InternalXMachine.g:320:1: entryRuleXVariableNoComment returns [EObject current=null] : iv_ruleXVariableNoComment= ruleXVariableNoComment EOF ;
    public final EObject entryRuleXVariableNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableNoComment = null;


        try {
            // InternalXMachine.g:320:59: (iv_ruleXVariableNoComment= ruleXVariableNoComment EOF )
            // InternalXMachine.g:321:2: iv_ruleXVariableNoComment= ruleXVariableNoComment EOF
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
    // InternalXMachine.g:327:1: ruleXVariableNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariableNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:333:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:334:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:334:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:335:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:335:3: ()
            // InternalXMachine.g:336:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableNoCommentAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:342:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:343:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:343:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:344:5: lv_name_1_0= RULE_ID
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
    // InternalXMachine.g:364:1: entryRuleXVariableMLComment returns [EObject current=null] : iv_ruleXVariableMLComment= ruleXVariableMLComment EOF ;
    public final EObject entryRuleXVariableMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableMLComment = null;


        try {
            // InternalXMachine.g:364:59: (iv_ruleXVariableMLComment= ruleXVariableMLComment EOF )
            // InternalXMachine.g:365:2: iv_ruleXVariableMLComment= ruleXVariableMLComment EOF
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
    // InternalXMachine.g:371:1: ruleXVariableMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariableMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:377:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:378:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:378:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:379:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:379:3: ()
            // InternalXMachine.g:380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableMLCommentAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:386:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:387:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:387:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:388:5: lv_comment_1_0= RULE_ML_COMMENT
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

            // InternalXMachine.g:404:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:405:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:405:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:406:5: lv_name_2_0= RULE_ID
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
    // InternalXMachine.g:426:1: entryRuleXVariableSLComment returns [EObject current=null] : iv_ruleXVariableSLComment= ruleXVariableSLComment EOF ;
    public final EObject entryRuleXVariableSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableSLComment = null;


        try {
            // InternalXMachine.g:426:59: (iv_ruleXVariableSLComment= ruleXVariableSLComment EOF )
            // InternalXMachine.g:427:2: iv_ruleXVariableSLComment= ruleXVariableSLComment EOF
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
    // InternalXMachine.g:433:1: ruleXVariableSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXVariableSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:439:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:440:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:440:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:441:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:441:3: ()
            // InternalXMachine.g:442:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableSLCommentAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:448:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:449:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:449:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:450:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalXMachine.g:466:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:467:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:467:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:468:5: lv_comment_2_0= RULE_SL_COMMENT
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
    // InternalXMachine.g:488:1: entryRuleXInvariant returns [EObject current=null] : iv_ruleXInvariant= ruleXInvariant EOF ;
    public final EObject entryRuleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariant = null;


        try {
            // InternalXMachine.g:488:51: (iv_ruleXInvariant= ruleXInvariant EOF )
            // InternalXMachine.g:489:2: iv_ruleXInvariant= ruleXInvariant EOF
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
    // InternalXMachine.g:495:1: ruleXInvariant returns [EObject current=null] : (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment ) ;
    public final EObject ruleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject this_XInvariantNoComment_0 = null;

        EObject this_XInvariantMLComment_1 = null;

        EObject this_XInvariantSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:501:2: ( (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment ) )
            // InternalXMachine.g:502:2: (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment )
            {
            // InternalXMachine.g:502:2: (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_XLABEL) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 19:
                        {
                        int LA9_4 = input.LA(4);

                        if ( (LA9_4==EOF) ) {
                            alt9=1;
                        }
                        else if ( (LA9_4==RULE_SL_COMMENT) ) {
                            alt9=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_SL_COMMENT:
                        {
                        alt9=3;
                        }
                        break;
                    case EOF:
                        {
                        alt9=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_ML_COMMENT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:503:3: this_XInvariantNoComment_0= ruleXInvariantNoComment
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
                    // InternalXMachine.g:512:3: this_XInvariantMLComment_1= ruleXInvariantMLComment
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
                    // InternalXMachine.g:521:3: this_XInvariantSLComment_2= ruleXInvariantSLComment
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
    // InternalXMachine.g:533:1: entryRuleXInvariantNoComment returns [EObject current=null] : iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF ;
    public final EObject entryRuleXInvariantNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantNoComment = null;


        try {
            // InternalXMachine.g:533:60: (iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF )
            // InternalXMachine.g:534:2: iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF
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
    // InternalXMachine.g:540:1: ruleXInvariantNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariantNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:546:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:547:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:547:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:548:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:548:3: ()
            // InternalXMachine.g:549:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantNoCommentAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:555:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:556:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:556:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:557:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:573:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:574:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:574:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:575:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            // InternalXMachine.g:591:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:592:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:592:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:593:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,19,FOLLOW_2); 

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
    // InternalXMachine.g:609:1: entryRuleXInvariantMLComment returns [EObject current=null] : iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF ;
    public final EObject entryRuleXInvariantMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantMLComment = null;


        try {
            // InternalXMachine.g:609:60: (iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF )
            // InternalXMachine.g:610:2: iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF
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
    // InternalXMachine.g:616:1: ruleXInvariantMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariantMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_predicate_3_0=null;
        Token lv_theorem_4_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:622:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) )
            // InternalXMachine.g:623:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:623:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            // InternalXMachine.g:624:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )?
            {
            // InternalXMachine.g:624:3: ()
            // InternalXMachine.g:625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantMLCommentAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:631:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:632:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:632:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:633:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_14); 

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

            // InternalXMachine.g:649:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:650:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:650:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:651:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:667:3: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalXMachine.g:668:4: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalXMachine.g:668:4: (lv_predicate_3_0= RULE_STRING )
            // InternalXMachine.g:669:5: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            // InternalXMachine.g:685:3: ( (lv_theorem_4_0= 'theorem' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:686:4: (lv_theorem_4_0= 'theorem' )
                    {
                    // InternalXMachine.g:686:4: (lv_theorem_4_0= 'theorem' )
                    // InternalXMachine.g:687:5: lv_theorem_4_0= 'theorem'
                    {
                    lv_theorem_4_0=(Token)match(input,19,FOLLOW_2); 

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
    // InternalXMachine.g:703:1: entryRuleXInvariantSLComment returns [EObject current=null] : iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF ;
    public final EObject entryRuleXInvariantSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantSLComment = null;


        try {
            // InternalXMachine.g:703:60: (iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF )
            // InternalXMachine.g:704:2: iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF
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
    // InternalXMachine.g:710:1: ruleXInvariantSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXInvariantSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;
        Token lv_comment_4_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:716:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:717:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:717:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:718:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:718:3: ()
            // InternalXMachine.g:719:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantSLCommentAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:725:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:726:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:726:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:727:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:743:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:744:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:744:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:745:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            // InternalXMachine.g:761:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXMachine.g:762:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:762:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:763:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,19,FOLLOW_11); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXInvariantSLCommentAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXInvariantSLCommentRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:775:3: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:776:4: (lv_comment_4_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:776:4: (lv_comment_4_0= RULE_SL_COMMENT )
            // InternalXMachine.g:777:5: lv_comment_4_0= RULE_SL_COMMENT
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
    // InternalXMachine.g:797:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:797:49: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:798:2: iv_ruleXVariant= ruleXVariant EOF
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
    // InternalXMachine.g:804:1: ruleXVariant returns [EObject current=null] : (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        EObject this_XVariantNoComment_0 = null;

        EObject this_XVariantMLComment_1 = null;

        EObject this_XVariantSLComment_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:810:2: ( (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment ) )
            // InternalXMachine.g:811:2: (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment )
            {
            // InternalXMachine.g:811:2: (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF) ) {
                    alt13=1;
                }
                else if ( (LA13_1==RULE_SL_COMMENT) ) {
                    alt13=3;
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
                    // InternalXMachine.g:812:3: this_XVariantNoComment_0= ruleXVariantNoComment
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
                    // InternalXMachine.g:821:3: this_XVariantMLComment_1= ruleXVariantMLComment
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
                    // InternalXMachine.g:830:3: this_XVariantSLComment_2= ruleXVariantSLComment
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
    // InternalXMachine.g:842:1: entryRuleXVariantNoComment returns [EObject current=null] : iv_ruleXVariantNoComment= ruleXVariantNoComment EOF ;
    public final EObject entryRuleXVariantNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantNoComment = null;


        try {
            // InternalXMachine.g:842:58: (iv_ruleXVariantNoComment= ruleXVariantNoComment EOF )
            // InternalXMachine.g:843:2: iv_ruleXVariantNoComment= ruleXVariantNoComment EOF
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
    // InternalXMachine.g:849:1: ruleXVariantNoComment returns [EObject current=null] : ( () ( (lv_expression_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXVariantNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_expression_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:855:2: ( ( () ( (lv_expression_1_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:856:2: ( () ( (lv_expression_1_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:856:2: ( () ( (lv_expression_1_0= RULE_STRING ) ) )
            // InternalXMachine.g:857:3: () ( (lv_expression_1_0= RULE_STRING ) )
            {
            // InternalXMachine.g:857:3: ()
            // InternalXMachine.g:858:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantNoCommentAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:864:3: ( (lv_expression_1_0= RULE_STRING ) )
            // InternalXMachine.g:865:4: (lv_expression_1_0= RULE_STRING )
            {
            // InternalXMachine.g:865:4: (lv_expression_1_0= RULE_STRING )
            // InternalXMachine.g:866:5: lv_expression_1_0= RULE_STRING
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
    // InternalXMachine.g:886:1: entryRuleXVariantMLComment returns [EObject current=null] : iv_ruleXVariantMLComment= ruleXVariantMLComment EOF ;
    public final EObject entryRuleXVariantMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantMLComment = null;


        try {
            // InternalXMachine.g:886:58: (iv_ruleXVariantMLComment= ruleXVariantMLComment EOF )
            // InternalXMachine.g:887:2: iv_ruleXVariantMLComment= ruleXVariantMLComment EOF
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
    // InternalXMachine.g:893:1: ruleXVariantMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXVariantMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_expression_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:899:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:900:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:900:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) )
            // InternalXMachine.g:901:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) )
            {
            // InternalXMachine.g:901:3: ()
            // InternalXMachine.g:902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantMLCommentAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:908:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:909:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:909:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:910:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_12); 

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

            // InternalXMachine.g:926:3: ( (lv_expression_2_0= RULE_STRING ) )
            // InternalXMachine.g:927:4: (lv_expression_2_0= RULE_STRING )
            {
            // InternalXMachine.g:927:4: (lv_expression_2_0= RULE_STRING )
            // InternalXMachine.g:928:5: lv_expression_2_0= RULE_STRING
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
    // InternalXMachine.g:948:1: entryRuleXVariantSLComment returns [EObject current=null] : iv_ruleXVariantSLComment= ruleXVariantSLComment EOF ;
    public final EObject entryRuleXVariantSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantSLComment = null;


        try {
            // InternalXMachine.g:948:58: (iv_ruleXVariantSLComment= ruleXVariantSLComment EOF )
            // InternalXMachine.g:949:2: iv_ruleXVariantSLComment= ruleXVariantSLComment EOF
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
    // InternalXMachine.g:955:1: ruleXVariantSLComment returns [EObject current=null] : ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXVariantSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_expression_1_0=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:961:2: ( ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:962:2: ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:962:2: ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:963:3: () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:963:3: ()
            // InternalXMachine.g:964:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantSLCommentAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:970:3: ( (lv_expression_1_0= RULE_STRING ) )
            // InternalXMachine.g:971:4: (lv_expression_1_0= RULE_STRING )
            {
            // InternalXMachine.g:971:4: (lv_expression_1_0= RULE_STRING )
            // InternalXMachine.g:972:5: lv_expression_1_0= RULE_STRING
            {
            lv_expression_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            // InternalXMachine.g:988:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:989:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:989:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:990:5: lv_comment_2_0= RULE_SL_COMMENT
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


    // $ANTLR start "entryRuleXParameterNoComment"
    // InternalXMachine.g:1010:1: entryRuleXParameterNoComment returns [EObject current=null] : iv_ruleXParameterNoComment= ruleXParameterNoComment EOF ;
    public final EObject entryRuleXParameterNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterNoComment = null;


        try {
            // InternalXMachine.g:1010:60: (iv_ruleXParameterNoComment= ruleXParameterNoComment EOF )
            // InternalXMachine.g:1011:2: iv_ruleXParameterNoComment= ruleXParameterNoComment EOF
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
    // InternalXMachine.g:1017:1: ruleXParameterNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameterNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1023:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:1024:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:1024:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:1025:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:1025:3: ()
            // InternalXMachine.g:1026:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterNoCommentAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1032:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:1033:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:1033:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:1034:5: lv_name_1_0= RULE_ID
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
    // InternalXMachine.g:1054:1: entryRuleXParameterMLComment returns [EObject current=null] : iv_ruleXParameterMLComment= ruleXParameterMLComment EOF ;
    public final EObject entryRuleXParameterMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterMLComment = null;


        try {
            // InternalXMachine.g:1054:60: (iv_ruleXParameterMLComment= ruleXParameterMLComment EOF )
            // InternalXMachine.g:1055:2: iv_ruleXParameterMLComment= ruleXParameterMLComment EOF
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
    // InternalXMachine.g:1061:1: ruleXParameterMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameterMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1067:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:1068:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:1068:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:1069:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:1069:3: ()
            // InternalXMachine.g:1070:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterMLCommentAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1076:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:1077:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:1077:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:1078:5: lv_comment_1_0= RULE_ML_COMMENT
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

            // InternalXMachine.g:1094:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:1095:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:1095:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:1096:5: lv_name_2_0= RULE_ID
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
    // InternalXMachine.g:1116:1: entryRuleXParameterSLComment returns [EObject current=null] : iv_ruleXParameterSLComment= ruleXParameterSLComment EOF ;
    public final EObject entryRuleXParameterSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterSLComment = null;


        try {
            // InternalXMachine.g:1116:60: (iv_ruleXParameterSLComment= ruleXParameterSLComment EOF )
            // InternalXMachine.g:1117:2: iv_ruleXParameterSLComment= ruleXParameterSLComment EOF
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
    // InternalXMachine.g:1123:1: ruleXParameterSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXParameterSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1129:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:1130:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:1130:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:1131:3: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:1131:3: ()
            // InternalXMachine.g:1132:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterSLCommentAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1138:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:1139:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:1139:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:1140:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalXMachine.g:1156:3: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:1157:4: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:1157:4: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:1158:5: lv_comment_2_0= RULE_SL_COMMENT
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


    // $ANTLR start "entryRuleXGuardNoComment"
    // InternalXMachine.g:1178:1: entryRuleXGuardNoComment returns [EObject current=null] : iv_ruleXGuardNoComment= ruleXGuardNoComment EOF ;
    public final EObject entryRuleXGuardNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardNoComment = null;


        try {
            // InternalXMachine.g:1178:56: (iv_ruleXGuardNoComment= ruleXGuardNoComment EOF )
            // InternalXMachine.g:1179:2: iv_ruleXGuardNoComment= ruleXGuardNoComment EOF
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
    // InternalXMachine.g:1185:1: ruleXGuardNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuardNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1191:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:1192:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:1192:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:1193:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:1193:3: ()
            // InternalXMachine.g:1194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardNoCommentAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1200:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1201:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1201:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1202:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:1218:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:1219:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:1219:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:1220:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            // InternalXMachine.g:1236:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:1237:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:1237:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:1238:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,19,FOLLOW_2); 

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
    // InternalXMachine.g:1254:1: entryRuleXGuardMLComment returns [EObject current=null] : iv_ruleXGuardMLComment= ruleXGuardMLComment EOF ;
    public final EObject entryRuleXGuardMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardMLComment = null;


        try {
            // InternalXMachine.g:1254:56: (iv_ruleXGuardMLComment= ruleXGuardMLComment EOF )
            // InternalXMachine.g:1255:2: iv_ruleXGuardMLComment= ruleXGuardMLComment EOF
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
    // InternalXMachine.g:1261:1: ruleXGuardMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuardMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_predicate_3_0=null;
        Token lv_theorem_4_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1267:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) )
            // InternalXMachine.g:1268:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:1268:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            // InternalXMachine.g:1269:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )?
            {
            // InternalXMachine.g:1269:3: ()
            // InternalXMachine.g:1270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardMLCommentAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1276:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:1277:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:1277:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:1278:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_14); 

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

            // InternalXMachine.g:1294:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:1295:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1295:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:1296:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:1312:3: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalXMachine.g:1313:4: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalXMachine.g:1313:4: (lv_predicate_3_0= RULE_STRING )
            // InternalXMachine.g:1314:5: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            // InternalXMachine.g:1330:3: ( (lv_theorem_4_0= 'theorem' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:1331:4: (lv_theorem_4_0= 'theorem' )
                    {
                    // InternalXMachine.g:1331:4: (lv_theorem_4_0= 'theorem' )
                    // InternalXMachine.g:1332:5: lv_theorem_4_0= 'theorem'
                    {
                    lv_theorem_4_0=(Token)match(input,19,FOLLOW_2); 

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
    // InternalXMachine.g:1348:1: entryRuleXGuardSLComment returns [EObject current=null] : iv_ruleXGuardSLComment= ruleXGuardSLComment EOF ;
    public final EObject entryRuleXGuardSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardSLComment = null;


        try {
            // InternalXMachine.g:1348:56: (iv_ruleXGuardSLComment= ruleXGuardSLComment EOF )
            // InternalXMachine.g:1349:2: iv_ruleXGuardSLComment= ruleXGuardSLComment EOF
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
    // InternalXMachine.g:1355:1: ruleXGuardSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXGuardSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;
        Token lv_comment_4_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1361:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:1362:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:1362:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:1363:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:1363:3: ()
            // InternalXMachine.g:1364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardSLCommentAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1370:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1371:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1371:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1372:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:1388:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:1389:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:1389:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:1390:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            // InternalXMachine.g:1406:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:1407:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:1407:4: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:1408:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,19,FOLLOW_11); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getXGuardSLCommentAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardSLCommentRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1420:3: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:1421:4: (lv_comment_4_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:1421:4: (lv_comment_4_0= RULE_SL_COMMENT )
            // InternalXMachine.g:1422:5: lv_comment_4_0= RULE_SL_COMMENT
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


    // $ANTLR start "entryRuleXWitnessNoComment"
    // InternalXMachine.g:1442:1: entryRuleXWitnessNoComment returns [EObject current=null] : iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF ;
    public final EObject entryRuleXWitnessNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessNoComment = null;


        try {
            // InternalXMachine.g:1442:58: (iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF )
            // InternalXMachine.g:1443:2: iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF
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
    // InternalXMachine.g:1449:1: ruleXWitnessNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXWitnessNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1455:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:1456:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:1456:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) )
            // InternalXMachine.g:1457:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) )
            {
            // InternalXMachine.g:1457:3: ()
            // InternalXMachine.g:1458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessNoCommentAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1464:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1465:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1465:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1466:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:1482:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:1483:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:1483:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:1484:5: lv_predicate_2_0= RULE_STRING
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
    // InternalXMachine.g:1504:1: entryRuleXWitnessMLComment returns [EObject current=null] : iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF ;
    public final EObject entryRuleXWitnessMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessMLComment = null;


        try {
            // InternalXMachine.g:1504:58: (iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF )
            // InternalXMachine.g:1505:2: iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF
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
    // InternalXMachine.g:1511:1: ruleXWitnessMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleXWitnessMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_predicate_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1517:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:1518:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:1518:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) )
            // InternalXMachine.g:1519:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) )
            {
            // InternalXMachine.g:1519:3: ()
            // InternalXMachine.g:1520:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessMLCommentAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1526:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:1527:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:1527:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:1528:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_14); 

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

            // InternalXMachine.g:1544:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:1545:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1545:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:1546:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:1562:3: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalXMachine.g:1563:4: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalXMachine.g:1563:4: (lv_predicate_3_0= RULE_STRING )
            // InternalXMachine.g:1564:5: lv_predicate_3_0= RULE_STRING
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
    // InternalXMachine.g:1584:1: entryRuleXWitnessSLComment returns [EObject current=null] : iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF ;
    public final EObject entryRuleXWitnessSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessSLComment = null;


        try {
            // InternalXMachine.g:1584:58: (iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF )
            // InternalXMachine.g:1585:2: iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF
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
    // InternalXMachine.g:1591:1: ruleXWitnessSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXWitnessSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_comment_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1597:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:1598:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:1598:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:1599:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:1599:3: ()
            // InternalXMachine.g:1600:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessSLCommentAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1606:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1607:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1607:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1608:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:1624:3: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:1625:4: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:1625:4: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:1626:5: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            // InternalXMachine.g:1642:3: ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:1643:4: (lv_comment_3_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:1643:4: (lv_comment_3_0= RULE_SL_COMMENT )
            // InternalXMachine.g:1644:5: lv_comment_3_0= RULE_SL_COMMENT
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


    // $ANTLR start "entryRuleXActionNoComment"
    // InternalXMachine.g:1664:1: entryRuleXActionNoComment returns [EObject current=null] : iv_ruleXActionNoComment= ruleXActionNoComment EOF ;
    public final EObject entryRuleXActionNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionNoComment = null;


        try {
            // InternalXMachine.g:1664:57: (iv_ruleXActionNoComment= ruleXActionNoComment EOF )
            // InternalXMachine.g:1665:2: iv_ruleXActionNoComment= ruleXActionNoComment EOF
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
    // InternalXMachine.g:1671:1: ruleXActionNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXActionNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_action_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1677:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:1678:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:1678:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) )
            // InternalXMachine.g:1679:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) )
            {
            // InternalXMachine.g:1679:3: ()
            // InternalXMachine.g:1680:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionNoCommentAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1686:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1687:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1687:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1688:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:1704:3: ( (lv_action_2_0= RULE_STRING ) )
            // InternalXMachine.g:1705:4: (lv_action_2_0= RULE_STRING )
            {
            // InternalXMachine.g:1705:4: (lv_action_2_0= RULE_STRING )
            // InternalXMachine.g:1706:5: lv_action_2_0= RULE_STRING
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
    // InternalXMachine.g:1726:1: entryRuleXActionMLComment returns [EObject current=null] : iv_ruleXActionMLComment= ruleXActionMLComment EOF ;
    public final EObject entryRuleXActionMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionMLComment = null;


        try {
            // InternalXMachine.g:1726:57: (iv_ruleXActionMLComment= ruleXActionMLComment EOF )
            // InternalXMachine.g:1727:2: iv_ruleXActionMLComment= ruleXActionMLComment EOF
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
    // InternalXMachine.g:1733:1: ruleXActionMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleXActionMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_action_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1739:2: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:1740:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:1740:2: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) )
            // InternalXMachine.g:1741:3: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) )
            {
            // InternalXMachine.g:1741:3: ()
            // InternalXMachine.g:1742:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionMLCommentAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1748:3: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:1749:4: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:1749:4: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:1750:5: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_14); 

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

            // InternalXMachine.g:1766:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:1767:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1767:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:1768:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:1784:3: ( (lv_action_3_0= RULE_STRING ) )
            // InternalXMachine.g:1785:4: (lv_action_3_0= RULE_STRING )
            {
            // InternalXMachine.g:1785:4: (lv_action_3_0= RULE_STRING )
            // InternalXMachine.g:1786:5: lv_action_3_0= RULE_STRING
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
    // InternalXMachine.g:1806:1: entryRuleXActionSLComment returns [EObject current=null] : iv_ruleXActionSLComment= ruleXActionSLComment EOF ;
    public final EObject entryRuleXActionSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionSLComment = null;


        try {
            // InternalXMachine.g:1806:57: (iv_ruleXActionSLComment= ruleXActionSLComment EOF )
            // InternalXMachine.g:1807:2: iv_ruleXActionSLComment= ruleXActionSLComment EOF
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
    // InternalXMachine.g:1813:1: ruleXActionSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXActionSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_action_2_0=null;
        Token lv_comment_3_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1819:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:1820:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:1820:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:1821:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:1821:3: ()
            // InternalXMachine.g:1822:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionSLCommentAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1828:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1829:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1829:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1830:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_12); 

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

            // InternalXMachine.g:1846:3: ( (lv_action_2_0= RULE_STRING ) )
            // InternalXMachine.g:1847:4: (lv_action_2_0= RULE_STRING )
            {
            // InternalXMachine.g:1847:4: (lv_action_2_0= RULE_STRING )
            // InternalXMachine.g:1848:5: lv_action_2_0= RULE_STRING
            {
            lv_action_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            // InternalXMachine.g:1864:3: ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:1865:4: (lv_comment_3_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:1865:4: (lv_comment_3_0= RULE_SL_COMMENT )
            // InternalXMachine.g:1866:5: lv_comment_3_0= RULE_SL_COMMENT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080020L});

}