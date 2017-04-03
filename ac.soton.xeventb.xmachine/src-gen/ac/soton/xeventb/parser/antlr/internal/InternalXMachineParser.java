package ac.soton.xeventb.parser.antlr.internal; 

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
import ac.soton.xeventb.services.XMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'end'", "'includes'", "'to'", "'as'", "'theorem'", "'extended'", "'with'", "'begin'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'.'", "'ordinary'", "'convergent'", "'anticipated'"
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
    // InternalXMachine.g:68:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalXMachine.g:69:2: (iv_ruleMachine= ruleMachine EOF )
            // InternalXMachine.g:70:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:77:1: ruleMachine returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? otherlv_18= 'end' ) ;
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
            // InternalXMachine.g:80:28: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? otherlv_18= 'end' ) )
            // InternalXMachine.g:81:1: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? otherlv_18= 'end' )
            {
            // InternalXMachine.g:81:1: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? otherlv_18= 'end' )
            // InternalXMachine.g:81:2: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( (lv_extensions_4_0= ruleMIncludes ) )* (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )? (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )? (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )? (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )? otherlv_18= 'end'
            {
            // InternalXMachine.g:81:2: ()
            // InternalXMachine.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMachineAccess().getMachineAction_0(),
                        current);
                

            }

            // InternalXMachine.g:87:2: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ML_COMMENT && LA2_0<=RULE_SL_COMMENT)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:88:1: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalXMachine.g:88:1: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalXMachine.g:89:1: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:89:1: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
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
                            // InternalXMachine.g:90:3: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_3); 

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
                            // InternalXMachine.g:105:8: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_3); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getMachineKeyword_2());
                
            // InternalXMachine.g:127:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:128:1: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:128:1: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:129:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            			newLeafNode(lv_name_3_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMachineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalXMachine.g:145:2: ( (lv_extensions_4_0= ruleMIncludes ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXMachine.g:146:1: (lv_extensions_4_0= ruleMIncludes )
            	    {
            	    // InternalXMachine.g:146:1: (lv_extensions_4_0= ruleMIncludes )
            	    // InternalXMachine.g:147:3: lv_extensions_4_0= ruleMIncludes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_extensions_4_0=ruleMIncludes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extensions",
            	            		lv_extensions_4_0, 
            	            		"ac.soton.xeventb.XMachine.MIncludes");
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
                    // InternalXMachine.g:163:5: otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRefinesKeyword_5_0());
                        
                    // InternalXMachine.g:167:1: ( (otherlv_6= RULE_ID ) )
                    // InternalXMachine.g:168:1: (otherlv_6= RULE_ID )
                    {
                    // InternalXMachine.g:168:1: (otherlv_6= RULE_ID )
                    // InternalXMachine.g:169:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMachineRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    		newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getRefinesMachineCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:180:4: (otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:180:6: otherlv_7= 'sees' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getSeesKeyword_6_0());
                        
                    // InternalXMachine.g:184:1: ( (otherlv_8= RULE_ID ) )+
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
                    	    // InternalXMachine.g:185:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:185:1: (otherlv_8= RULE_ID )
                    	    // InternalXMachine.g:186:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMachineRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

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

            // InternalXMachine.g:197:5: (otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:197:7: otherlv_9= 'variables' ( (lv_variables_10_0= ruleXVariable ) )+
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_8); 

                        	newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getVariablesKeyword_7_0());
                        
                    // InternalXMachine.g:201:1: ( (lv_variables_10_0= ruleXVariable ) )+
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
                    	    // InternalXMachine.g:202:1: (lv_variables_10_0= ruleXVariable )
                    	    {
                    	    // InternalXMachine.g:202:1: (lv_variables_10_0= ruleXVariable )
                    	    // InternalXMachine.g:203:3: lv_variables_10_0= ruleXVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_9);
                    	    lv_variables_10_0=ruleXVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_10_0, 
                    	            		"ac.soton.xeventb.XMachine.XVariable");
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

            // InternalXMachine.g:219:5: (otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:219:7: otherlv_11= 'invariants' ( (lv_invariants_12_0= ruleXInvariant ) )+
                    {
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getInvariantsKeyword_8_0());
                        
                    // InternalXMachine.g:223:1: ( (lv_invariants_12_0= ruleXInvariant ) )+
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
                    	    // InternalXMachine.g:224:1: (lv_invariants_12_0= ruleXInvariant )
                    	    {
                    	    // InternalXMachine.g:224:1: (lv_invariants_12_0= ruleXInvariant )
                    	    // InternalXMachine.g:225:3: lv_invariants_12_0= ruleXInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_invariants_12_0=ruleXInvariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_12_0, 
                    	            		"ac.soton.xeventb.XMachine.XInvariant");
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

            // InternalXMachine.g:241:5: (otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:241:7: otherlv_13= 'variant' ( (lv_variant_14_0= ruleXVariant ) )
                    {
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_12); 

                        	newLeafNode(otherlv_13, grammarAccess.getMachineAccess().getVariantKeyword_9_0());
                        
                    // InternalXMachine.g:245:1: ( (lv_variant_14_0= ruleXVariant ) )
                    // InternalXMachine.g:246:1: (lv_variant_14_0= ruleXVariant )
                    {
                    // InternalXMachine.g:246:1: (lv_variant_14_0= ruleXVariant )
                    // InternalXMachine.g:247:3: lv_variant_14_0= ruleXVariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_variant_14_0=ruleXVariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		set(
                           			current, 
                           			"variant",
                            		lv_variant_14_0, 
                            		"ac.soton.xeventb.XMachine.XVariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:263:4: (otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:263:6: otherlv_15= 'events' ( (lv_events_16_0= ruleXEvent ) ) ( (lv_events_17_0= ruleXEvent ) )*
                    {
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_8); 

                        	newLeafNode(otherlv_15, grammarAccess.getMachineAccess().getEventsKeyword_10_0());
                        
                    // InternalXMachine.g:267:1: ( (lv_events_16_0= ruleXEvent ) )
                    // InternalXMachine.g:268:1: (lv_events_16_0= ruleXEvent )
                    {
                    // InternalXMachine.g:268:1: (lv_events_16_0= ruleXEvent )
                    // InternalXMachine.g:269:3: lv_events_16_0= ruleXEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_events_16_0=ruleXEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"events",
                            		lv_events_16_0, 
                            		"ac.soton.xeventb.XMachine.XEvent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalXMachine.g:285:2: ( (lv_events_17_0= ruleXEvent ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ML_COMMENT||LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalXMachine.g:286:1: (lv_events_17_0= ruleXEvent )
                    	    {
                    	    // InternalXMachine.g:286:1: (lv_events_17_0= ruleXEvent )
                    	    // InternalXMachine.g:287:3: lv_events_17_0= ruleXEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    lv_events_17_0=ruleXEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_17_0, 
                    	            		"ac.soton.xeventb.XMachine.XEvent");
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

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:315:1: entryRuleMIncludes returns [EObject current=null] : iv_ruleMIncludes= ruleMIncludes EOF ;
    public final EObject entryRuleMIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIncludes = null;


        try {
            // InternalXMachine.g:316:2: (iv_ruleMIncludes= ruleMIncludes EOF )
            // InternalXMachine.g:317:2: iv_ruleMIncludes= ruleMIncludes EOF
            {
             newCompositeNode(grammarAccess.getMIncludesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMIncludes=ruleMIncludes();

            state._fsp--;

             current =iv_ruleMIncludes; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:324:1: ruleMIncludes returns [EObject current=null] : ( () ( (lv_extensionId_1_0= 'includes' ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) ;
    public final EObject ruleMIncludes() throws RecognitionException {
        EObject current = null;

        Token lv_extensionId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_prefixes_6_0=null;
        Token lv_prefixes_7_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:327:28: ( ( () ( (lv_extensionId_1_0= 'includes' ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) )
            // InternalXMachine.g:328:1: ( () ( (lv_extensionId_1_0= 'includes' ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            {
            // InternalXMachine.g:328:1: ( () ( (lv_extensionId_1_0= 'includes' ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            // InternalXMachine.g:328:2: () ( (lv_extensionId_1_0= 'includes' ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            {
            // InternalXMachine.g:328:2: ()
            // InternalXMachine.g:329:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMIncludesAccess().getMachineInclusionAction_0(),
                        current);
                

            }

            // InternalXMachine.g:334:2: ( (lv_extensionId_1_0= 'includes' ) )
            // InternalXMachine.g:335:1: (lv_extensionId_1_0= 'includes' )
            {
            // InternalXMachine.g:335:1: (lv_extensionId_1_0= 'includes' )
            // InternalXMachine.g:336:3: lv_extensionId_1_0= 'includes'
            {
            lv_extensionId_1_0=(Token)match(input,20,FollowSets000.FOLLOW_4); 

                    newLeafNode(lv_extensionId_1_0, grammarAccess.getMIncludesAccess().getExtensionIdIncludesKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMIncludesRule());
            	        }
                   		setWithLastConsumed(current, "extensionId", lv_extensionId_1_0, "includes");
            	    

            }


            }

            // InternalXMachine.g:349:2: ( (otherlv_2= RULE_ID ) )
            // InternalXMachine.g:350:1: (otherlv_2= RULE_ID )
            {
            // InternalXMachine.g:350:1: (otherlv_2= RULE_ID )
            // InternalXMachine.g:351:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMIncludesRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); 

            		newLeafNode(otherlv_2, grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_2_0()); 
            	

            }


            }

            // InternalXMachine.g:362:2: (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:362:4: otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_3, grammarAccess.getMIncludesAccess().getToKeyword_3_0());
                        
                    // InternalXMachine.g:366:1: ( (otherlv_4= RULE_ID ) )
                    // InternalXMachine.g:367:1: (otherlv_4= RULE_ID )
                    {
                    // InternalXMachine.g:367:1: (otherlv_4= RULE_ID )
                    // InternalXMachine.g:368:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMIncludesRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); 

                    		newLeafNode(otherlv_4, grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:379:4: (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:379:6: otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_5, grammarAccess.getMIncludesAccess().getAsKeyword_4_0());
                        
                    // InternalXMachine.g:383:1: ( (lv_prefixes_6_0= RULE_ID ) )
                    // InternalXMachine.g:384:1: (lv_prefixes_6_0= RULE_ID )
                    {
                    // InternalXMachine.g:384:1: (lv_prefixes_6_0= RULE_ID )
                    // InternalXMachine.g:385:3: lv_prefixes_6_0= RULE_ID
                    {
                    lv_prefixes_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

                    			newLeafNode(lv_prefixes_6_0, grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMIncludesRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"prefixes",
                            		lv_prefixes_6_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }

                    // InternalXMachine.g:401:2: ( (lv_prefixes_7_0= RULE_ID ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalXMachine.g:402:1: (lv_prefixes_7_0= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:402:1: (lv_prefixes_7_0= RULE_ID )
                    	    // InternalXMachine.g:403:3: lv_prefixes_7_0= RULE_ID
                    	    {
                    	    lv_prefixes_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

                    	    			newLeafNode(lv_prefixes_7_0, grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_4_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMIncludesRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"prefixes",
                    	            		lv_prefixes_7_0, 
                    	            		"org.eclipse.xtext.common.Terminals.ID");
                    	    	    

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


    // $ANTLR start "entryRuleXVariable"
    // InternalXMachine.g:427:1: entryRuleXVariable returns [EObject current=null] : iv_ruleXVariable= ruleXVariable EOF ;
    public final EObject entryRuleXVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariable = null;


        try {
            // InternalXMachine.g:428:2: (iv_ruleXVariable= ruleXVariable EOF )
            // InternalXMachine.g:429:2: iv_ruleXVariable= ruleXVariable EOF
            {
             newCompositeNode(grammarAccess.getXVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXVariable=ruleXVariable();

            state._fsp--;

             current =iv_ruleXVariable; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:436:1: ruleXVariable returns [EObject current=null] : (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment ) ;
    public final EObject ruleXVariable() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableNoComment_0 = null;

        EObject this_XVariableMLComment_1 = null;

        EObject this_XVariableSLComment_2 = null;


         enterRule(); 
            
        try {
            // InternalXMachine.g:439:28: ( (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment ) )
            // InternalXMachine.g:440:1: (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment )
            {
            // InternalXMachine.g:440:1: (this_XVariableNoComment_0= ruleXVariableNoComment | this_XVariableMLComment_1= ruleXVariableMLComment | this_XVariableSLComment_2= ruleXVariableSLComment )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==EOF||LA17_1==RULE_ML_COMMENT||LA17_1==RULE_ID||(LA17_1>=16 && LA17_1<=19)) ) {
                    alt17=1;
                }
                else if ( (LA17_1==RULE_SL_COMMENT) ) {
                    alt17=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==RULE_ML_COMMENT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:441:5: this_XVariableNoComment_0= ruleXVariableNoComment
                    {
                     
                            newCompositeNode(grammarAccess.getXVariableAccess().getXVariableNoCommentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XVariableNoComment_0=ruleXVariableNoComment();

                    state._fsp--;

                     
                            current = this_XVariableNoComment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:451:5: this_XVariableMLComment_1= ruleXVariableMLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXVariableAccess().getXVariableMLCommentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XVariableMLComment_1=ruleXVariableMLComment();

                    state._fsp--;

                     
                            current = this_XVariableMLComment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:461:5: this_XVariableSLComment_2= ruleXVariableSLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXVariableAccess().getXVariableSLCommentParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXMachine.g:477:1: entryRuleXVariableNoComment returns [EObject current=null] : iv_ruleXVariableNoComment= ruleXVariableNoComment EOF ;
    public final EObject entryRuleXVariableNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableNoComment = null;


        try {
            // InternalXMachine.g:478:2: (iv_ruleXVariableNoComment= ruleXVariableNoComment EOF )
            // InternalXMachine.g:479:2: iv_ruleXVariableNoComment= ruleXVariableNoComment EOF
            {
             newCompositeNode(grammarAccess.getXVariableNoCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXVariableNoComment=ruleXVariableNoComment();

            state._fsp--;

             current =iv_ruleXVariableNoComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:486:1: ruleXVariableNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariableNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:489:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:490:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:490:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:490:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:490:2: ()
            // InternalXMachine.g:491:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXVariableNoCommentAccess().getVariableAction_0(),
                        current);
                

            }

            // InternalXMachine.g:496:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:497:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:497:1: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:498:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:522:1: entryRuleXVariableMLComment returns [EObject current=null] : iv_ruleXVariableMLComment= ruleXVariableMLComment EOF ;
    public final EObject entryRuleXVariableMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableMLComment = null;


        try {
            // InternalXMachine.g:523:2: (iv_ruleXVariableMLComment= ruleXVariableMLComment EOF )
            // InternalXMachine.g:524:2: iv_ruleXVariableMLComment= ruleXVariableMLComment EOF
            {
             newCompositeNode(grammarAccess.getXVariableMLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXVariableMLComment=ruleXVariableMLComment();

            state._fsp--;

             current =iv_ruleXVariableMLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:531:1: ruleXVariableMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariableMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:534:28: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:535:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:535:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:535:2: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:535:2: ()
            // InternalXMachine.g:536:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXVariableMLCommentAccess().getVariableAction_0(),
                        current);
                

            }

            // InternalXMachine.g:541:2: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:542:1: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:542:1: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:543:3: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_4); 

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

            // InternalXMachine.g:559:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:560:1: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:560:1: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:561:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:585:1: entryRuleXVariableSLComment returns [EObject current=null] : iv_ruleXVariableSLComment= ruleXVariableSLComment EOF ;
    public final EObject entryRuleXVariableSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableSLComment = null;


        try {
            // InternalXMachine.g:586:2: (iv_ruleXVariableSLComment= ruleXVariableSLComment EOF )
            // InternalXMachine.g:587:2: iv_ruleXVariableSLComment= ruleXVariableSLComment EOF
            {
             newCompositeNode(grammarAccess.getXVariableSLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXVariableSLComment=ruleXVariableSLComment();

            state._fsp--;

             current =iv_ruleXVariableSLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:594:1: ruleXVariableSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXVariableSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_2_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:597:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:598:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:598:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:598:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:598:2: ()
            // InternalXMachine.g:599:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXVariableSLCommentAccess().getVariableAction_0(),
                        current);
                

            }

            // InternalXMachine.g:604:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:605:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:605:1: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:606:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); 

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

            // InternalXMachine.g:622:2: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:623:1: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:623:1: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:624:3: lv_comment_2_0= RULE_SL_COMMENT
            {
            lv_comment_2_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:648:1: entryRuleXInvariant returns [EObject current=null] : iv_ruleXInvariant= ruleXInvariant EOF ;
    public final EObject entryRuleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariant = null;


        try {
            // InternalXMachine.g:649:2: (iv_ruleXInvariant= ruleXInvariant EOF )
            // InternalXMachine.g:650:2: iv_ruleXInvariant= ruleXInvariant EOF
            {
             newCompositeNode(grammarAccess.getXInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXInvariant=ruleXInvariant();

            state._fsp--;

             current =iv_ruleXInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:657:1: ruleXInvariant returns [EObject current=null] : (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment ) ;
    public final EObject ruleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject this_XInvariantNoComment_0 = null;

        EObject this_XInvariantMLComment_1 = null;

        EObject this_XInvariantSLComment_2 = null;


         enterRule(); 
            
        try {
            // InternalXMachine.g:660:28: ( (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment ) )
            // InternalXMachine.g:661:1: (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment )
            {
            // InternalXMachine.g:661:1: (this_XInvariantNoComment_0= ruleXInvariantNoComment | this_XInvariantMLComment_1= ruleXInvariantMLComment | this_XInvariantSLComment_2= ruleXInvariantSLComment )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_XLABEL) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 23:
                        {
                        int LA18_4 = input.LA(4);

                        if ( (LA18_4==EOF||LA18_4==RULE_ML_COMMENT||LA18_4==RULE_XLABEL||(LA18_4>=17 && LA18_4<=19)) ) {
                            alt18=1;
                        }
                        else if ( (LA18_4==RULE_SL_COMMENT) ) {
                            alt18=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_SL_COMMENT:
                        {
                        alt18=3;
                        }
                        break;
                    case EOF:
                    case RULE_ML_COMMENT:
                    case RULE_XLABEL:
                    case 17:
                    case 18:
                    case 19:
                        {
                        alt18=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;
                    }

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
                    // InternalXMachine.g:662:5: this_XInvariantNoComment_0= ruleXInvariantNoComment
                    {
                     
                            newCompositeNode(grammarAccess.getXInvariantAccess().getXInvariantNoCommentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XInvariantNoComment_0=ruleXInvariantNoComment();

                    state._fsp--;

                     
                            current = this_XInvariantNoComment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:672:5: this_XInvariantMLComment_1= ruleXInvariantMLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXInvariantAccess().getXInvariantMLCommentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XInvariantMLComment_1=ruleXInvariantMLComment();

                    state._fsp--;

                     
                            current = this_XInvariantMLComment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:682:5: this_XInvariantSLComment_2= ruleXInvariantSLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXInvariantAccess().getXInvariantSLCommentParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXMachine.g:698:1: entryRuleXInvariantNoComment returns [EObject current=null] : iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF ;
    public final EObject entryRuleXInvariantNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantNoComment = null;


        try {
            // InternalXMachine.g:699:2: (iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF )
            // InternalXMachine.g:700:2: iv_ruleXInvariantNoComment= ruleXInvariantNoComment EOF
            {
             newCompositeNode(grammarAccess.getXInvariantNoCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXInvariantNoComment=ruleXInvariantNoComment();

            state._fsp--;

             current =iv_ruleXInvariantNoComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:707:1: ruleXInvariantNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariantNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:710:28: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:711:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:711:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:711:2: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:711:2: ()
            // InternalXMachine.g:712:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXInvariantNoCommentAccess().getInvariantAction_0(),
                        current);
                

            }

            // InternalXMachine.g:717:2: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:718:1: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:718:1: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:719:3: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXInvariantNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXInvariantNoCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:735:2: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:736:1: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:736:1: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:737:3: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); 

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

            // InternalXMachine.g:753:2: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:754:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:754:1: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:755:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:776:1: entryRuleXInvariantMLComment returns [EObject current=null] : iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF ;
    public final EObject entryRuleXInvariantMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantMLComment = null;


        try {
            // InternalXMachine.g:777:2: (iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF )
            // InternalXMachine.g:778:2: iv_ruleXInvariantMLComment= ruleXInvariantMLComment EOF
            {
             newCompositeNode(grammarAccess.getXInvariantMLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXInvariantMLComment=ruleXInvariantMLComment();

            state._fsp--;

             current =iv_ruleXInvariantMLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:785:1: ruleXInvariantMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) ;
    public final EObject ruleXInvariantMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_predicate_3_0=null;
        Token lv_theorem_4_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:788:28: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) )
            // InternalXMachine.g:789:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:789:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            // InternalXMachine.g:789:2: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )?
            {
            // InternalXMachine.g:789:2: ()
            // InternalXMachine.g:790:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXInvariantMLCommentAccess().getInvariantAction_0(),
                        current);
                

            }

            // InternalXMachine.g:795:2: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:796:1: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:796:1: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:797:3: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_21); 

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

            // InternalXMachine.g:813:2: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:814:1: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:814:1: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:815:3: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_2_0, grammarAccess.getXInvariantMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXInvariantMLCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:831:2: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalXMachine.g:832:1: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalXMachine.g:832:1: (lv_predicate_3_0= RULE_STRING )
            // InternalXMachine.g:833:3: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); 

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

            // InternalXMachine.g:849:2: ( (lv_theorem_4_0= 'theorem' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:850:1: (lv_theorem_4_0= 'theorem' )
                    {
                    // InternalXMachine.g:850:1: (lv_theorem_4_0= 'theorem' )
                    // InternalXMachine.g:851:3: lv_theorem_4_0= 'theorem'
                    {
                    lv_theorem_4_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:872:1: entryRuleXInvariantSLComment returns [EObject current=null] : iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF ;
    public final EObject entryRuleXInvariantSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariantSLComment = null;


        try {
            // InternalXMachine.g:873:2: (iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF )
            // InternalXMachine.g:874:2: iv_ruleXInvariantSLComment= ruleXInvariantSLComment EOF
            {
             newCompositeNode(grammarAccess.getXInvariantSLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXInvariantSLComment=ruleXInvariantSLComment();

            state._fsp--;

             current =iv_ruleXInvariantSLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:881:1: ruleXInvariantSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXInvariantSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;
        Token lv_comment_4_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:884:28: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:885:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:885:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:885:2: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:885:2: ()
            // InternalXMachine.g:886:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXInvariantSLCommentAccess().getInvariantAction_0(),
                        current);
                

            }

            // InternalXMachine.g:891:2: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:892:1: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:892:1: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:893:3: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXInvariantSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXInvariantSLCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:909:2: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:910:1: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:910:1: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:911:3: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_22); 

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

            // InternalXMachine.g:927:2: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:928:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:928:1: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:929:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,23,FollowSets000.FOLLOW_18); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getXInvariantSLCommentAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXInvariantSLCommentRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // InternalXMachine.g:942:3: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:943:1: (lv_comment_4_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:943:1: (lv_comment_4_0= RULE_SL_COMMENT )
            // InternalXMachine.g:944:3: lv_comment_4_0= RULE_SL_COMMENT
            {
            lv_comment_4_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:968:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:969:2: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:970:2: iv_ruleXVariant= ruleXVariant EOF
            {
             newCompositeNode(grammarAccess.getXVariantRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXVariant=ruleXVariant();

            state._fsp--;

             current =iv_ruleXVariant; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:977:1: ruleXVariant returns [EObject current=null] : (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        EObject this_XVariantNoComment_0 = null;

        EObject this_XVariantMLComment_1 = null;

        EObject this_XVariantSLComment_2 = null;


         enterRule(); 
            
        try {
            // InternalXMachine.g:980:28: ( (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment ) )
            // InternalXMachine.g:981:1: (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment )
            {
            // InternalXMachine.g:981:1: (this_XVariantNoComment_0= ruleXVariantNoComment | this_XVariantMLComment_1= ruleXVariantMLComment | this_XVariantSLComment_2= ruleXVariantSLComment )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||(LA22_1>=18 && LA22_1<=19)) ) {
                    alt22=1;
                }
                else if ( (LA22_1==RULE_SL_COMMENT) ) {
                    alt22=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0==RULE_ML_COMMENT) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:982:5: this_XVariantNoComment_0= ruleXVariantNoComment
                    {
                     
                            newCompositeNode(grammarAccess.getXVariantAccess().getXVariantNoCommentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XVariantNoComment_0=ruleXVariantNoComment();

                    state._fsp--;

                     
                            current = this_XVariantNoComment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:992:5: this_XVariantMLComment_1= ruleXVariantMLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXVariantAccess().getXVariantMLCommentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XVariantMLComment_1=ruleXVariantMLComment();

                    state._fsp--;

                     
                            current = this_XVariantMLComment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1002:5: this_XVariantSLComment_2= ruleXVariantSLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXVariantAccess().getXVariantSLCommentParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXMachine.g:1018:1: entryRuleXVariantNoComment returns [EObject current=null] : iv_ruleXVariantNoComment= ruleXVariantNoComment EOF ;
    public final EObject entryRuleXVariantNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantNoComment = null;


        try {
            // InternalXMachine.g:1019:2: (iv_ruleXVariantNoComment= ruleXVariantNoComment EOF )
            // InternalXMachine.g:1020:2: iv_ruleXVariantNoComment= ruleXVariantNoComment EOF
            {
             newCompositeNode(grammarAccess.getXVariantNoCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXVariantNoComment=ruleXVariantNoComment();

            state._fsp--;

             current =iv_ruleXVariantNoComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1027:1: ruleXVariantNoComment returns [EObject current=null] : ( () ( (lv_expression_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXVariantNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_expression_1_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:1030:28: ( ( () ( (lv_expression_1_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:1031:1: ( () ( (lv_expression_1_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:1031:1: ( () ( (lv_expression_1_0= RULE_STRING ) ) )
            // InternalXMachine.g:1031:2: () ( (lv_expression_1_0= RULE_STRING ) )
            {
            // InternalXMachine.g:1031:2: ()
            // InternalXMachine.g:1032:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXVariantNoCommentAccess().getVariantAction_0(),
                        current);
                

            }

            // InternalXMachine.g:1037:2: ( (lv_expression_1_0= RULE_STRING ) )
            // InternalXMachine.g:1038:1: (lv_expression_1_0= RULE_STRING )
            {
            // InternalXMachine.g:1038:1: (lv_expression_1_0= RULE_STRING )
            // InternalXMachine.g:1039:3: lv_expression_1_0= RULE_STRING
            {
            lv_expression_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1063:1: entryRuleXVariantMLComment returns [EObject current=null] : iv_ruleXVariantMLComment= ruleXVariantMLComment EOF ;
    public final EObject entryRuleXVariantMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantMLComment = null;


        try {
            // InternalXMachine.g:1064:2: (iv_ruleXVariantMLComment= ruleXVariantMLComment EOF )
            // InternalXMachine.g:1065:2: iv_ruleXVariantMLComment= ruleXVariantMLComment EOF
            {
             newCompositeNode(grammarAccess.getXVariantMLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXVariantMLComment=ruleXVariantMLComment();

            state._fsp--;

             current =iv_ruleXVariantMLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1072:1: ruleXVariantMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXVariantMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_expression_2_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:1075:28: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:1076:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:1076:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) ) )
            // InternalXMachine.g:1076:2: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_expression_2_0= RULE_STRING ) )
            {
            // InternalXMachine.g:1076:2: ()
            // InternalXMachine.g:1077:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXVariantMLCommentAccess().getVariantAction_0(),
                        current);
                

            }

            // InternalXMachine.g:1082:2: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:1083:1: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:1083:1: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:1084:3: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_19); 

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

            // InternalXMachine.g:1100:2: ( (lv_expression_2_0= RULE_STRING ) )
            // InternalXMachine.g:1101:1: (lv_expression_2_0= RULE_STRING )
            {
            // InternalXMachine.g:1101:1: (lv_expression_2_0= RULE_STRING )
            // InternalXMachine.g:1102:3: lv_expression_2_0= RULE_STRING
            {
            lv_expression_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1126:1: entryRuleXVariantSLComment returns [EObject current=null] : iv_ruleXVariantSLComment= ruleXVariantSLComment EOF ;
    public final EObject entryRuleXVariantSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariantSLComment = null;


        try {
            // InternalXMachine.g:1127:2: (iv_ruleXVariantSLComment= ruleXVariantSLComment EOF )
            // InternalXMachine.g:1128:2: iv_ruleXVariantSLComment= ruleXVariantSLComment EOF
            {
             newCompositeNode(grammarAccess.getXVariantSLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXVariantSLComment=ruleXVariantSLComment();

            state._fsp--;

             current =iv_ruleXVariantSLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1135:1: ruleXVariantSLComment returns [EObject current=null] : ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXVariantSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_expression_1_0=null;
        Token lv_comment_2_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:1138:28: ( ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:1139:1: ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:1139:1: ( () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:1139:2: () ( (lv_expression_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:1139:2: ()
            // InternalXMachine.g:1140:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXVariantSLCommentAccess().getVariantAction_0(),
                        current);
                

            }

            // InternalXMachine.g:1145:2: ( (lv_expression_1_0= RULE_STRING ) )
            // InternalXMachine.g:1146:1: (lv_expression_1_0= RULE_STRING )
            {
            // InternalXMachine.g:1146:1: (lv_expression_1_0= RULE_STRING )
            // InternalXMachine.g:1147:3: lv_expression_1_0= RULE_STRING
            {
            lv_expression_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_18); 

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

            // InternalXMachine.g:1163:2: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:1164:1: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:1164:1: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:1165:3: lv_comment_2_0= RULE_SL_COMMENT
            {
            lv_comment_2_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1189:1: entryRuleXEvent returns [EObject current=null] : iv_ruleXEvent= ruleXEvent EOF ;
    public final EObject entryRuleXEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEvent = null;


        try {
            // InternalXMachine.g:1190:2: (iv_ruleXEvent= ruleXEvent EOF )
            // InternalXMachine.g:1191:2: iv_ruleXEvent= ruleXEvent EOF
            {
             newCompositeNode(grammarAccess.getXEventRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXEvent=ruleXEvent();

            state._fsp--;

             current =iv_ruleXEvent; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1198:1: ruleXEvent returns [EObject current=null] : (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment ) ;
    public final EObject ruleXEvent() throws RecognitionException {
        EObject current = null;

        EObject this_XEventNoComment_0 = null;

        EObject this_XEventMLComment_1 = null;

        EObject this_XEventSLComment_2 = null;


         enterRule(); 
            
        try {
            // InternalXMachine.g:1201:28: ( (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment ) )
            // InternalXMachine.g:1202:1: (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment )
            {
            // InternalXMachine.g:1202:1: (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:1203:5: this_XEventNoComment_0= ruleXEventNoComment
                    {
                     
                            newCompositeNode(grammarAccess.getXEventAccess().getXEventNoCommentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XEventNoComment_0=ruleXEventNoComment();

                    state._fsp--;

                     
                            current = this_XEventNoComment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1213:5: this_XEventMLComment_1= ruleXEventMLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXEventAccess().getXEventMLCommentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XEventMLComment_1=ruleXEventMLComment();

                    state._fsp--;

                     
                            current = this_XEventMLComment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1223:5: this_XEventSLComment_2= ruleXEventSLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXEventAccess().getXEventSLCommentParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXMachine.g:1239:1: entryRuleXEventNoComment returns [EObject current=null] : iv_ruleXEventNoComment= ruleXEventNoComment EOF ;
    public final EObject entryRuleXEventNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEventNoComment = null;


        try {
            // InternalXMachine.g:1240:2: (iv_ruleXEventNoComment= ruleXEventNoComment EOF )
            // InternalXMachine.g:1241:2: iv_ruleXEventNoComment= ruleXEventNoComment EOF
            {
             newCompositeNode(grammarAccess.getXEventNoCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXEventNoComment=ruleXEventNoComment();

            state._fsp--;

             current =iv_ruleXEventNoComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1248:1: ruleXEventNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' ) ;
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
            // InternalXMachine.g:1251:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' ) )
            // InternalXMachine.g:1252:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' )
            {
            // InternalXMachine.g:1252:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end' )
            // InternalXMachine.g:1252:2: () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )? otherlv_26= 'end'
            {
            // InternalXMachine.g:1252:2: ()
            // InternalXMachine.g:1253:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXEventNoCommentAccess().getEventAction_0(),
                        current);
                

            }

            // InternalXMachine.g:1258:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:1259:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:1259:1: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:1260:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

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

            // InternalXMachine.g:1276:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:1278:1: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:1278:1: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:1279:2: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2());
            	
            // InternalXMachine.g:1282:2: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:1283:3: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:1283:3: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 >= 33 && LA24_0 <= 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1) ) {
                    alt24=2;
                }


                switch (alt24) {
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
            	    	 				
            	    // InternalXMachine.g:1290:6: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    // InternalXMachine.g:1290:7: {...}? => ( (lv_extended_3_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "true");
            	    }
            	    // InternalXMachine.g:1290:16: ( (lv_extended_3_0= 'extended' ) )
            	    // InternalXMachine.g:1291:1: (lv_extended_3_0= 'extended' )
            	    {
            	    // InternalXMachine.g:1291:1: (lv_extended_3_0= 'extended' )
            	    // InternalXMachine.g:1292:3: lv_extended_3_0= 'extended'
            	    {
            	    lv_extended_3_0=(Token)match(input,24,FollowSets000.FOLLOW_23); 

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
            	    // InternalXMachine.g:1312:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1312:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:1313:5: {...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalXMachine.g:1313:112: ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:1314:6: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // InternalXMachine.g:1317:6: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:1317:7: {...}? => ( (lv_convergence_4_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventNoComment", "true");
            	    }
            	    // InternalXMachine.g:1317:16: ( (lv_convergence_4_0= ruleXConvergence ) )
            	    // InternalXMachine.g:1318:1: (lv_convergence_4_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:1318:1: (lv_convergence_4_0= ruleXConvergence )
            	    // InternalXMachine.g:1319:3: lv_convergence_4_0= ruleXConvergence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_convergence_4_0=ruleXConvergence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"convergence",
            	            		lv_convergence_4_0, 
            	            		"ac.soton.xeventb.XMachine.XConvergence");
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
            	    break loop24;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getXEventNoCommentAccess().getUnorderedGroup_2());
            	

            }

            // InternalXMachine.g:1349:2: ( (lv_extensions_5_0= ruleEventSync ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXMachine.g:1350:1: (lv_extensions_5_0= ruleEventSync )
            	    {
            	    // InternalXMachine.g:1350:1: (lv_extensions_5_0= ruleEventSync )
            	    // InternalXMachine.g:1351:3: lv_extensions_5_0= ruleEventSync
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getExtensionsEventSyncParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    lv_extensions_5_0=ruleEventSync();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extensions",
            	            		lv_extensions_5_0, 
            	            		"ac.soton.xeventb.XMachine.EventSync");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalXMachine.g:1367:3: (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:1367:5: otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+
                    {
                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_6, grammarAccess.getXEventNoCommentAccess().getRefinesKeyword_4_0());
                        
                    // InternalXMachine.g:1371:1: ( (otherlv_7= RULE_ID ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalXMachine.g:1372:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:1372:1: (otherlv_7= RULE_ID )
                    	    // InternalXMachine.g:1373:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getXEventNoCommentRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getXEventNoCommentAccess().getRefinesEventCrossReference_4_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:1384:5: ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? ) )?
            int alt42=4;
            switch ( input.LA(1) ) {
                case 25:
                case 26:
                    {
                    alt42=1;
                    }
                    break;
                case 27:
                    {
                    alt42=2;
                    }
                    break;
                case 29:
                    {
                    alt42=3;
                    }
                    break;
            }

            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:1384:6: ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:1384:6: ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+ )
                    // InternalXMachine.g:1384:7: (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:1384:7: (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+ )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==25) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalXMachine.g:1384:9: otherlv_8= 'with' ( (lv_witnesses_9_0= ruleXWitness ) )+
                            {
                            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_8, grammarAccess.getXEventNoCommentAccess().getWithKeyword_5_0_0_0());
                                
                            // InternalXMachine.g:1388:1: ( (lv_witnesses_9_0= ruleXWitness ) )+
                            int cnt28=0;
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==RULE_ML_COMMENT||LA28_0==RULE_XLABEL) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // InternalXMachine.g:1389:1: (lv_witnesses_9_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1389:1: (lv_witnesses_9_0= ruleXWitness )
                            	    // InternalXMachine.g:1390:3: lv_witnesses_9_0= ruleXWitness
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getWitnessesXWitnessParserRuleCall_5_0_0_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_26);
                            	    lv_witnesses_9_0=ruleXWitness();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"witnesses",
                            	            		lv_witnesses_9_0, 
                            	            		"ac.soton.xeventb.XMachine.XWitness");
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


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_10, grammarAccess.getXEventNoCommentAccess().getBeginKeyword_5_0_1());
                        
                    // InternalXMachine.g:1410:1: ( (lv_actions_11_0= ruleXAction ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ML_COMMENT||LA30_0==RULE_XLABEL) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalXMachine.g:1411:1: (lv_actions_11_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1411:1: (lv_actions_11_0= ruleXAction )
                    	    // InternalXMachine.g:1412:3: lv_actions_11_0= ruleXAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getActionsXActionParserRuleCall_5_0_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_actions_11_0=ruleXAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_11_0, 
                    	            		"ac.soton.xeventb.XMachine.XAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1429:6: (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1429:6: (otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1429:8: otherlv_12= 'when' ( (lv_guards_13_0= ruleXGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )?
                    {
                    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_12, grammarAccess.getXEventNoCommentAccess().getWhenKeyword_5_1_0());
                        
                    // InternalXMachine.g:1433:1: ( (lv_guards_13_0= ruleXGuard ) )+
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
                    	    // InternalXMachine.g:1434:1: (lv_guards_13_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1434:1: (lv_guards_13_0= ruleXGuard )
                    	    // InternalXMachine.g:1435:3: lv_guards_13_0= ruleXGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getGuardsXGuardParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_guards_13_0=ruleXGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_13_0, 
                    	            		"ac.soton.xeventb.XMachine.XGuard");
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

                    // InternalXMachine.g:1451:3: (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+ )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==25) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalXMachine.g:1451:5: otherlv_14= 'with' ( (lv_witnesses_15_0= ruleXWitness ) )+
                            {
                            otherlv_14=(Token)match(input,25,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_14, grammarAccess.getXEventNoCommentAccess().getWithKeyword_5_1_2_0());
                                
                            // InternalXMachine.g:1455:1: ( (lv_witnesses_15_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1456:1: (lv_witnesses_15_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1456:1: (lv_witnesses_15_0= ruleXWitness )
                            	    // InternalXMachine.g:1457:3: lv_witnesses_15_0= ruleXWitness
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getWitnessesXWitnessParserRuleCall_5_1_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_29);
                            	    lv_witnesses_15_0=ruleXWitness();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"witnesses",
                            	            		lv_witnesses_15_0, 
                            	            		"ac.soton.xeventb.XMachine.XWitness");
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


                            }
                            break;

                    }

                    // InternalXMachine.g:1473:5: (otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+ )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==28) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalXMachine.g:1473:7: otherlv_16= 'then' ( (lv_actions_17_0= ruleXAction ) )+
                            {
                            otherlv_16=(Token)match(input,28,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_16, grammarAccess.getXEventNoCommentAccess().getThenKeyword_5_1_3_0());
                                
                            // InternalXMachine.g:1477:1: ( (lv_actions_17_0= ruleXAction ) )+
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
                            	    // InternalXMachine.g:1478:1: (lv_actions_17_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1478:1: (lv_actions_17_0= ruleXAction )
                            	    // InternalXMachine.g:1479:3: lv_actions_17_0= ruleXAction
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getActionsXActionParserRuleCall_5_1_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_27);
                            	    lv_actions_17_0=ruleXAction();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"actions",
                            	            		lv_actions_17_0, 
                            	            		"ac.soton.xeventb.XMachine.XAction");
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


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1496:6: (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1496:6: (otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1496:8: otherlv_18= 'any' ( (lv_parameters_19_0= ruleXParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleXGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )?
                    {
                    otherlv_18=(Token)match(input,29,FollowSets000.FOLLOW_8); 

                        	newLeafNode(otherlv_18, grammarAccess.getXEventNoCommentAccess().getAnyKeyword_5_2_0());
                        
                    // InternalXMachine.g:1500:1: ( (lv_parameters_19_0= ruleXParameter ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ML_COMMENT||LA36_0==RULE_ID) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalXMachine.g:1501:1: (lv_parameters_19_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1501:1: (lv_parameters_19_0= ruleXParameter )
                    	    // InternalXMachine.g:1502:3: lv_parameters_19_0= ruleXParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getParametersXParameterParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_30);
                    	    lv_parameters_19_0=ruleXParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_19_0, 
                    	            		"ac.soton.xeventb.XMachine.XParameter");
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

                    otherlv_20=(Token)match(input,30,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_20, grammarAccess.getXEventNoCommentAccess().getWhereKeyword_5_2_2());
                        
                    // InternalXMachine.g:1522:1: ( (lv_guards_21_0= ruleXGuard ) )+
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
                    	    // InternalXMachine.g:1523:1: (lv_guards_21_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1523:1: (lv_guards_21_0= ruleXGuard )
                    	    // InternalXMachine.g:1524:3: lv_guards_21_0= ruleXGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getGuardsXGuardParserRuleCall_5_2_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_guards_21_0=ruleXGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_21_0, 
                    	            		"ac.soton.xeventb.XMachine.XGuard");
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

                    // InternalXMachine.g:1540:3: (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+ )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==25) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalXMachine.g:1540:5: otherlv_22= 'with' ( (lv_witnesses_23_0= ruleXWitness ) )+
                            {
                            otherlv_22=(Token)match(input,25,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_22, grammarAccess.getXEventNoCommentAccess().getWithKeyword_5_2_4_0());
                                
                            // InternalXMachine.g:1544:1: ( (lv_witnesses_23_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1545:1: (lv_witnesses_23_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1545:1: (lv_witnesses_23_0= ruleXWitness )
                            	    // InternalXMachine.g:1546:3: lv_witnesses_23_0= ruleXWitness
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getWitnessesXWitnessParserRuleCall_5_2_4_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_29);
                            	    lv_witnesses_23_0=ruleXWitness();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"witnesses",
                            	            		lv_witnesses_23_0, 
                            	            		"ac.soton.xeventb.XMachine.XWitness");
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


                            }
                            break;

                    }

                    // InternalXMachine.g:1562:5: (otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+ )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==28) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalXMachine.g:1562:7: otherlv_24= 'then' ( (lv_actions_25_0= ruleXAction ) )+
                            {
                            otherlv_24=(Token)match(input,28,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_24, grammarAccess.getXEventNoCommentAccess().getThenKeyword_5_2_5_0());
                                
                            // InternalXMachine.g:1566:1: ( (lv_actions_25_0= ruleXAction ) )+
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
                            	    // InternalXMachine.g:1567:1: (lv_actions_25_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1567:1: (lv_actions_25_0= ruleXAction )
                            	    // InternalXMachine.g:1568:3: lv_actions_25_0= ruleXAction
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventNoCommentAccess().getActionsXActionParserRuleCall_5_2_5_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_27);
                            	    lv_actions_25_0=ruleXAction();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventNoCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"actions",
                            	            		lv_actions_25_0, 
                            	            		"ac.soton.xeventb.XMachine.XAction");
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


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,19,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1596:1: entryRuleXEventMLComment returns [EObject current=null] : iv_ruleXEventMLComment= ruleXEventMLComment EOF ;
    public final EObject entryRuleXEventMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEventMLComment = null;


        try {
            // InternalXMachine.g:1597:2: (iv_ruleXEventMLComment= ruleXEventMLComment EOF )
            // InternalXMachine.g:1598:2: iv_ruleXEventMLComment= ruleXEventMLComment EOF
            {
             newCompositeNode(grammarAccess.getXEventMLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXEventMLComment=ruleXEventMLComment();

            state._fsp--;

             current =iv_ruleXEventMLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1605:1: ruleXEventMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) ;
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
            // InternalXMachine.g:1608:28: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) )
            // InternalXMachine.g:1609:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            {
            // InternalXMachine.g:1609:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            // InternalXMachine.g:1609:2: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end'
            {
            // InternalXMachine.g:1609:2: ()
            // InternalXMachine.g:1610:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXEventMLCommentAccess().getEventAction_0(),
                        current);
                

            }

            // InternalXMachine.g:1615:2: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:1616:1: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:1616:1: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:1617:3: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_4); 

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

            // InternalXMachine.g:1633:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:1634:1: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:1634:1: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:1635:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

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

            // InternalXMachine.g:1651:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:1653:1: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:1653:1: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:1654:2: ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3());
            	
            // InternalXMachine.g:1657:2: ( ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:1658:3: ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:1658:3: ( ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) ) )*
            loop43:
            do {
                int alt43=3;
                int LA43_0 = input.LA(1);

                if ( LA43_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0) ) {
                    alt43=1;
                }
                else if ( LA43_0 >= 33 && LA43_0 <= 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1) ) {
                    alt43=2;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXMachine.g:1660:4: ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1660:4: ({...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) ) )
            	    // InternalXMachine.g:1661:5: {...}? => ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalXMachine.g:1661:112: ( ({...}? => ( (lv_extended_4_0= 'extended' ) ) ) )
            	    // InternalXMachine.g:1662:6: ({...}? => ( (lv_extended_4_0= 'extended' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // InternalXMachine.g:1665:6: ({...}? => ( (lv_extended_4_0= 'extended' ) ) )
            	    // InternalXMachine.g:1665:7: {...}? => ( (lv_extended_4_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "true");
            	    }
            	    // InternalXMachine.g:1665:16: ( (lv_extended_4_0= 'extended' ) )
            	    // InternalXMachine.g:1666:1: (lv_extended_4_0= 'extended' )
            	    {
            	    // InternalXMachine.g:1666:1: (lv_extended_4_0= 'extended' )
            	    // InternalXMachine.g:1667:3: lv_extended_4_0= 'extended'
            	    {
            	    lv_extended_4_0=(Token)match(input,24,FollowSets000.FOLLOW_23); 

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
            	    // InternalXMachine.g:1687:4: ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:1687:4: ({...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:1688:5: {...}? => ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalXMachine.g:1688:112: ( ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:1689:6: ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // InternalXMachine.g:1692:6: ({...}? => ( (lv_convergence_5_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:1692:7: {...}? => ( (lv_convergence_5_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventMLComment", "true");
            	    }
            	    // InternalXMachine.g:1692:16: ( (lv_convergence_5_0= ruleXConvergence ) )
            	    // InternalXMachine.g:1693:1: (lv_convergence_5_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:1693:1: (lv_convergence_5_0= ruleXConvergence )
            	    // InternalXMachine.g:1694:3: lv_convergence_5_0= ruleXConvergence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getConvergenceXConvergenceEnumRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_convergence_5_0=ruleXConvergence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"convergence",
            	            		lv_convergence_5_0, 
            	            		"ac.soton.xeventb.XMachine.XConvergence");
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
            	    break loop43;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getXEventMLCommentAccess().getUnorderedGroup_3());
            	

            }

            // InternalXMachine.g:1724:2: ( (lv_extensions_6_0= ruleEventSync ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==31) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalXMachine.g:1725:1: (lv_extensions_6_0= ruleEventSync )
            	    {
            	    // InternalXMachine.g:1725:1: (lv_extensions_6_0= ruleEventSync )
            	    // InternalXMachine.g:1726:3: lv_extensions_6_0= ruleEventSync
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getExtensionsEventSyncParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    lv_extensions_6_0=ruleEventSync();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extensions",
            	            		lv_extensions_6_0, 
            	            		"ac.soton.xeventb.XMachine.EventSync");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalXMachine.g:1742:3: (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==13) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:1742:5: otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_7, grammarAccess.getXEventMLCommentAccess().getRefinesKeyword_5_0());
                        
                    // InternalXMachine.g:1746:1: ( (otherlv_8= RULE_ID ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalXMachine.g:1747:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:1747:1: (otherlv_8= RULE_ID )
                    	    // InternalXMachine.g:1748:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getXEventMLCommentRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getXEventMLCommentAccess().getRefinesEventCrossReference_5_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:1759:5: ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )?
            int alt61=4;
            switch ( input.LA(1) ) {
                case 25:
                case 26:
                    {
                    alt61=1;
                    }
                    break;
                case 27:
                    {
                    alt61=2;
                    }
                    break;
                case 29:
                    {
                    alt61=3;
                    }
                    break;
            }

            switch (alt61) {
                case 1 :
                    // InternalXMachine.g:1759:6: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:1759:6: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    // InternalXMachine.g:1759:7: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:1759:7: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==25) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalXMachine.g:1759:9: otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+
                            {
                            otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_9, grammarAccess.getXEventMLCommentAccess().getWithKeyword_6_0_0_0());
                                
                            // InternalXMachine.g:1763:1: ( (lv_witnesses_10_0= ruleXWitness ) )+
                            int cnt47=0;
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==RULE_ML_COMMENT||LA47_0==RULE_XLABEL) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // InternalXMachine.g:1764:1: (lv_witnesses_10_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1764:1: (lv_witnesses_10_0= ruleXWitness )
                            	    // InternalXMachine.g:1765:3: lv_witnesses_10_0= ruleXWitness
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_26);
                            	    lv_witnesses_10_0=ruleXWitness();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"witnesses",
                            	            		lv_witnesses_10_0, 
                            	            		"ac.soton.xeventb.XMachine.XWitness");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


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

                    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_11, grammarAccess.getXEventMLCommentAccess().getBeginKeyword_6_0_1());
                        
                    // InternalXMachine.g:1785:1: ( (lv_actions_12_0= ruleXAction ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ML_COMMENT||LA49_0==RULE_XLABEL) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalXMachine.g:1786:1: (lv_actions_12_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1786:1: (lv_actions_12_0= ruleXAction )
                    	    // InternalXMachine.g:1787:3: lv_actions_12_0= ruleXAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getActionsXActionParserRuleCall_6_0_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_actions_12_0=ruleXAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_12_0, 
                    	            		"ac.soton.xeventb.XMachine.XAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1804:6: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1804:6: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1804:8: otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    {
                    otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_13, grammarAccess.getXEventMLCommentAccess().getWhenKeyword_6_1_0());
                        
                    // InternalXMachine.g:1808:1: ( (lv_guards_14_0= ruleXGuard ) )+
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
                    	    // InternalXMachine.g:1809:1: (lv_guards_14_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1809:1: (lv_guards_14_0= ruleXGuard )
                    	    // InternalXMachine.g:1810:3: lv_guards_14_0= ruleXGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getGuardsXGuardParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_guards_14_0=ruleXGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_14_0, 
                    	            		"ac.soton.xeventb.XMachine.XGuard");
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

                    // InternalXMachine.g:1826:3: (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==25) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalXMachine.g:1826:5: otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+
                            {
                            otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_15, grammarAccess.getXEventMLCommentAccess().getWithKeyword_6_1_2_0());
                                
                            // InternalXMachine.g:1830:1: ( (lv_witnesses_16_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1831:1: (lv_witnesses_16_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1831:1: (lv_witnesses_16_0= ruleXWitness )
                            	    // InternalXMachine.g:1832:3: lv_witnesses_16_0= ruleXWitness
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_29);
                            	    lv_witnesses_16_0=ruleXWitness();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"witnesses",
                            	            		lv_witnesses_16_0, 
                            	            		"ac.soton.xeventb.XMachine.XWitness");
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

                    // InternalXMachine.g:1848:5: (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==28) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalXMachine.g:1848:7: otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+
                            {
                            otherlv_17=(Token)match(input,28,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_17, grammarAccess.getXEventMLCommentAccess().getThenKeyword_6_1_3_0());
                                
                            // InternalXMachine.g:1852:1: ( (lv_actions_18_0= ruleXAction ) )+
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
                            	    // InternalXMachine.g:1853:1: (lv_actions_18_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1853:1: (lv_actions_18_0= ruleXAction )
                            	    // InternalXMachine.g:1854:3: lv_actions_18_0= ruleXAction
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getActionsXActionParserRuleCall_6_1_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_27);
                            	    lv_actions_18_0=ruleXAction();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"actions",
                            	            		lv_actions_18_0, 
                            	            		"ac.soton.xeventb.XMachine.XAction");
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
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1871:6: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:1871:6: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:1871:8: otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    {
                    otherlv_19=(Token)match(input,29,FollowSets000.FOLLOW_8); 

                        	newLeafNode(otherlv_19, grammarAccess.getXEventMLCommentAccess().getAnyKeyword_6_2_0());
                        
                    // InternalXMachine.g:1875:1: ( (lv_parameters_20_0= ruleXParameter ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==RULE_ML_COMMENT||LA55_0==RULE_ID) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalXMachine.g:1876:1: (lv_parameters_20_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1876:1: (lv_parameters_20_0= ruleXParameter )
                    	    // InternalXMachine.g:1877:3: lv_parameters_20_0= ruleXParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getParametersXParameterParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_30);
                    	    lv_parameters_20_0=ruleXParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_20_0, 
                    	            		"ac.soton.xeventb.XMachine.XParameter");
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

                    otherlv_21=(Token)match(input,30,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_21, grammarAccess.getXEventMLCommentAccess().getWhereKeyword_6_2_2());
                        
                    // InternalXMachine.g:1897:1: ( (lv_guards_22_0= ruleXGuard ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_ML_COMMENT||LA56_0==RULE_XLABEL) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalXMachine.g:1898:1: (lv_guards_22_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1898:1: (lv_guards_22_0= ruleXGuard )
                    	    // InternalXMachine.g:1899:3: lv_guards_22_0= ruleXGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getGuardsXGuardParserRuleCall_6_2_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_guards_22_0=ruleXGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_22_0, 
                    	            		"ac.soton.xeventb.XMachine.XGuard");
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

                    // InternalXMachine.g:1915:3: (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==25) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalXMachine.g:1915:5: otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+
                            {
                            otherlv_23=(Token)match(input,25,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_23, grammarAccess.getXEventMLCommentAccess().getWithKeyword_6_2_4_0());
                                
                            // InternalXMachine.g:1919:1: ( (lv_witnesses_24_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:1920:1: (lv_witnesses_24_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:1920:1: (lv_witnesses_24_0= ruleXWitness )
                            	    // InternalXMachine.g:1921:3: lv_witnesses_24_0= ruleXWitness
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_29);
                            	    lv_witnesses_24_0=ruleXWitness();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"witnesses",
                            	            		lv_witnesses_24_0, 
                            	            		"ac.soton.xeventb.XMachine.XWitness");
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

                    // InternalXMachine.g:1937:5: (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==28) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalXMachine.g:1937:7: otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+
                            {
                            otherlv_25=(Token)match(input,28,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_25, grammarAccess.getXEventMLCommentAccess().getThenKeyword_6_2_5_0());
                                
                            // InternalXMachine.g:1941:1: ( (lv_actions_26_0= ruleXAction ) )+
                            int cnt59=0;
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==RULE_ML_COMMENT||LA59_0==RULE_XLABEL) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // InternalXMachine.g:1942:1: (lv_actions_26_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:1942:1: (lv_actions_26_0= ruleXAction )
                            	    // InternalXMachine.g:1943:3: lv_actions_26_0= ruleXAction
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventMLCommentAccess().getActionsXActionParserRuleCall_6_2_5_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_27);
                            	    lv_actions_26_0=ruleXAction();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventMLCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"actions",
                            	            		lv_actions_26_0, 
                            	            		"ac.soton.xeventb.XMachine.XAction");
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


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1971:1: entryRuleXEventSLComment returns [EObject current=null] : iv_ruleXEventSLComment= ruleXEventSLComment EOF ;
    public final EObject entryRuleXEventSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEventSLComment = null;


        try {
            // InternalXMachine.g:1972:2: (iv_ruleXEventSLComment= ruleXEventSLComment EOF )
            // InternalXMachine.g:1973:2: iv_ruleXEventSLComment= ruleXEventSLComment EOF
            {
             newCompositeNode(grammarAccess.getXEventSLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXEventSLComment=ruleXEventSLComment();

            state._fsp--;

             current =iv_ruleXEventSLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:1980:1: ruleXEventSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) ;
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
            // InternalXMachine.g:1983:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' ) )
            // InternalXMachine.g:1984:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            {
            // InternalXMachine.g:1984:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end' )
            // InternalXMachine.g:1984:2: () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) ) ( (lv_comment_5_0= RULE_SL_COMMENT ) ) ( (lv_extensions_6_0= ruleEventSync ) )* (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )? ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )? otherlv_27= 'end'
            {
            // InternalXMachine.g:1984:2: ()
            // InternalXMachine.g:1985:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXEventSLCommentAccess().getEventAction_0(),
                        current);
                

            }

            // InternalXMachine.g:1990:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:1991:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:1991:1: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:1992:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_31); 

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

            // InternalXMachine.g:2008:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) ) )
            // InternalXMachine.g:2010:1: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            {
            // InternalXMachine.g:2010:1: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* ) )
            // InternalXMachine.g:2011:2: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2());
            	
            // InternalXMachine.g:2014:2: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )* )
            // InternalXMachine.g:2015:3: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            {
            // InternalXMachine.g:2015:3: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) ) )*
            loop62:
            do {
                int alt62=3;
                int LA62_0 = input.LA(1);

                if ( LA62_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0) ) {
                    alt62=1;
                }
                else if ( LA62_0 >= 33 && LA62_0 <= 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1) ) {
                    alt62=2;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalXMachine.g:2017:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalXMachine.g:2017:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    // InternalXMachine.g:2018:5: {...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalXMachine.g:2018:112: ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    // InternalXMachine.g:2019:6: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // InternalXMachine.g:2022:6: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    // InternalXMachine.g:2022:7: {...}? => ( (lv_extended_3_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "true");
            	    }
            	    // InternalXMachine.g:2022:16: ( (lv_extended_3_0= 'extended' ) )
            	    // InternalXMachine.g:2023:1: (lv_extended_3_0= 'extended' )
            	    {
            	    // InternalXMachine.g:2023:1: (lv_extended_3_0= 'extended' )
            	    // InternalXMachine.g:2024:3: lv_extended_3_0= 'extended'
            	    {
            	    lv_extended_3_0=(Token)match(input,24,FollowSets000.FOLLOW_31); 

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
            	    // InternalXMachine.g:2044:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    {
            	    // InternalXMachine.g:2044:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) ) )
            	    // InternalXMachine.g:2045:5: {...}? => ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalXMachine.g:2045:112: ( ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) ) )
            	    // InternalXMachine.g:2046:6: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // InternalXMachine.g:2049:6: ({...}? => ( (lv_convergence_4_0= ruleXConvergence ) ) )
            	    // InternalXMachine.g:2049:7: {...}? => ( (lv_convergence_4_0= ruleXConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleXEventSLComment", "true");
            	    }
            	    // InternalXMachine.g:2049:16: ( (lv_convergence_4_0= ruleXConvergence ) )
            	    // InternalXMachine.g:2050:1: (lv_convergence_4_0= ruleXConvergence )
            	    {
            	    // InternalXMachine.g:2050:1: (lv_convergence_4_0= ruleXConvergence )
            	    // InternalXMachine.g:2051:3: lv_convergence_4_0= ruleXConvergence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    lv_convergence_4_0=ruleXConvergence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"convergence",
            	            		lv_convergence_4_0, 
            	            		"ac.soton.xeventb.XMachine.XConvergence");
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
            	    break loop62;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getXEventSLCommentAccess().getUnorderedGroup_2());
            	

            }

            // InternalXMachine.g:2081:2: ( (lv_comment_5_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:2082:1: (lv_comment_5_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:2082:1: (lv_comment_5_0= RULE_SL_COMMENT )
            // InternalXMachine.g:2083:3: lv_comment_5_0= RULE_SL_COMMENT
            {
            lv_comment_5_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_24); 

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

            // InternalXMachine.g:2099:2: ( (lv_extensions_6_0= ruleEventSync ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==31) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalXMachine.g:2100:1: (lv_extensions_6_0= ruleEventSync )
            	    {
            	    // InternalXMachine.g:2100:1: (lv_extensions_6_0= ruleEventSync )
            	    // InternalXMachine.g:2101:3: lv_extensions_6_0= ruleEventSync
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getExtensionsEventSyncParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    lv_extensions_6_0=ruleEventSync();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extensions",
            	            		lv_extensions_6_0, 
            	            		"ac.soton.xeventb.XMachine.EventSync");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // InternalXMachine.g:2117:3: (otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+ )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==13) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXMachine.g:2117:5: otherlv_7= 'refines' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_7, grammarAccess.getXEventSLCommentAccess().getRefinesKeyword_5_0());
                        
                    // InternalXMachine.g:2121:1: ( (otherlv_8= RULE_ID ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==RULE_ID) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalXMachine.g:2122:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:2122:1: (otherlv_8= RULE_ID )
                    	    // InternalXMachine.g:2123:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getXEventSLCommentRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getXEventSLCommentAccess().getRefinesEventCrossReference_5_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:2134:5: ( ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ ) | (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? ) | (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? ) )?
            int alt80=4;
            switch ( input.LA(1) ) {
                case 25:
                case 26:
                    {
                    alt80=1;
                    }
                    break;
                case 27:
                    {
                    alt80=2;
                    }
                    break;
                case 29:
                    {
                    alt80=3;
                    }
                    break;
            }

            switch (alt80) {
                case 1 :
                    // InternalXMachine.g:2134:6: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    {
                    // InternalXMachine.g:2134:6: ( (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+ )
                    // InternalXMachine.g:2134:7: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )? otherlv_11= 'begin' ( (lv_actions_12_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:2134:7: (otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+ )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==25) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalXMachine.g:2134:9: otherlv_9= 'with' ( (lv_witnesses_10_0= ruleXWitness ) )+
                            {
                            otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_9, grammarAccess.getXEventSLCommentAccess().getWithKeyword_6_0_0_0());
                                
                            // InternalXMachine.g:2138:1: ( (lv_witnesses_10_0= ruleXWitness ) )+
                            int cnt66=0;
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==RULE_ML_COMMENT||LA66_0==RULE_XLABEL) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // InternalXMachine.g:2139:1: (lv_witnesses_10_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:2139:1: (lv_witnesses_10_0= ruleXWitness )
                            	    // InternalXMachine.g:2140:3: lv_witnesses_10_0= ruleXWitness
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getWitnessesXWitnessParserRuleCall_6_0_0_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_26);
                            	    lv_witnesses_10_0=ruleXWitness();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"witnesses",
                            	            		lv_witnesses_10_0, 
                            	            		"ac.soton.xeventb.XMachine.XWitness");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt66 >= 1 ) break loop66;
                                        EarlyExitException eee =
                                            new EarlyExitException(66, input);
                                        throw eee;
                                }
                                cnt66++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_11, grammarAccess.getXEventSLCommentAccess().getBeginKeyword_6_0_1());
                        
                    // InternalXMachine.g:2160:1: ( (lv_actions_12_0= ruleXAction ) )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==RULE_ML_COMMENT||LA68_0==RULE_XLABEL) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalXMachine.g:2161:1: (lv_actions_12_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:2161:1: (lv_actions_12_0= ruleXAction )
                    	    // InternalXMachine.g:2162:3: lv_actions_12_0= ruleXAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getActionsXActionParserRuleCall_6_0_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_actions_12_0=ruleXAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_12_0, 
                    	            		"ac.soton.xeventb.XMachine.XAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2179:6: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:2179:6: (otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:2179:8: otherlv_13= 'when' ( (lv_guards_14_0= ruleXGuard ) )+ (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )? (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    {
                    otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_13, grammarAccess.getXEventSLCommentAccess().getWhenKeyword_6_1_0());
                        
                    // InternalXMachine.g:2183:1: ( (lv_guards_14_0= ruleXGuard ) )+
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
                    	    // InternalXMachine.g:2184:1: (lv_guards_14_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:2184:1: (lv_guards_14_0= ruleXGuard )
                    	    // InternalXMachine.g:2185:3: lv_guards_14_0= ruleXGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getGuardsXGuardParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_guards_14_0=ruleXGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_14_0, 
                    	            		"ac.soton.xeventb.XMachine.XGuard");
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

                    // InternalXMachine.g:2201:3: (otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+ )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==25) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalXMachine.g:2201:5: otherlv_15= 'with' ( (lv_witnesses_16_0= ruleXWitness ) )+
                            {
                            otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_15, grammarAccess.getXEventSLCommentAccess().getWithKeyword_6_1_2_0());
                                
                            // InternalXMachine.g:2205:1: ( (lv_witnesses_16_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:2206:1: (lv_witnesses_16_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:2206:1: (lv_witnesses_16_0= ruleXWitness )
                            	    // InternalXMachine.g:2207:3: lv_witnesses_16_0= ruleXWitness
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getWitnessesXWitnessParserRuleCall_6_1_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_29);
                            	    lv_witnesses_16_0=ruleXWitness();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"witnesses",
                            	            		lv_witnesses_16_0, 
                            	            		"ac.soton.xeventb.XMachine.XWitness");
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


                            }
                            break;

                    }

                    // InternalXMachine.g:2223:5: (otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+ )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==28) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalXMachine.g:2223:7: otherlv_17= 'then' ( (lv_actions_18_0= ruleXAction ) )+
                            {
                            otherlv_17=(Token)match(input,28,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_17, grammarAccess.getXEventSLCommentAccess().getThenKeyword_6_1_3_0());
                                
                            // InternalXMachine.g:2227:1: ( (lv_actions_18_0= ruleXAction ) )+
                            int cnt72=0;
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==RULE_ML_COMMENT||LA72_0==RULE_XLABEL) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // InternalXMachine.g:2228:1: (lv_actions_18_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:2228:1: (lv_actions_18_0= ruleXAction )
                            	    // InternalXMachine.g:2229:3: lv_actions_18_0= ruleXAction
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getActionsXActionParserRuleCall_6_1_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_27);
                            	    lv_actions_18_0=ruleXAction();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"actions",
                            	            		lv_actions_18_0, 
                            	            		"ac.soton.xeventb.XMachine.XAction");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt72 >= 1 ) break loop72;
                                        EarlyExitException eee =
                                            new EarlyExitException(72, input);
                                        throw eee;
                                }
                                cnt72++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2246:6: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    {
                    // InternalXMachine.g:2246:6: (otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )? )
                    // InternalXMachine.g:2246:8: otherlv_19= 'any' ( (lv_parameters_20_0= ruleXParameter ) )+ otherlv_21= 'where' ( (lv_guards_22_0= ruleXGuard ) )+ (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )? (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    {
                    otherlv_19=(Token)match(input,29,FollowSets000.FOLLOW_8); 

                        	newLeafNode(otherlv_19, grammarAccess.getXEventSLCommentAccess().getAnyKeyword_6_2_0());
                        
                    // InternalXMachine.g:2250:1: ( (lv_parameters_20_0= ruleXParameter ) )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==RULE_ML_COMMENT||LA74_0==RULE_ID) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalXMachine.g:2251:1: (lv_parameters_20_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:2251:1: (lv_parameters_20_0= ruleXParameter )
                    	    // InternalXMachine.g:2252:3: lv_parameters_20_0= ruleXParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getParametersXParameterParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_30);
                    	    lv_parameters_20_0=ruleXParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_20_0, 
                    	            		"ac.soton.xeventb.XMachine.XParameter");
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

                    otherlv_21=(Token)match(input,30,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_21, grammarAccess.getXEventSLCommentAccess().getWhereKeyword_6_2_2());
                        
                    // InternalXMachine.g:2272:1: ( (lv_guards_22_0= ruleXGuard ) )+
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
                    	    // InternalXMachine.g:2273:1: (lv_guards_22_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:2273:1: (lv_guards_22_0= ruleXGuard )
                    	    // InternalXMachine.g:2274:3: lv_guards_22_0= ruleXGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getGuardsXGuardParserRuleCall_6_2_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_guards_22_0=ruleXGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_22_0, 
                    	            		"ac.soton.xeventb.XMachine.XGuard");
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

                    // InternalXMachine.g:2290:3: (otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+ )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==25) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalXMachine.g:2290:5: otherlv_23= 'with' ( (lv_witnesses_24_0= ruleXWitness ) )+
                            {
                            otherlv_23=(Token)match(input,25,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_23, grammarAccess.getXEventSLCommentAccess().getWithKeyword_6_2_4_0());
                                
                            // InternalXMachine.g:2294:1: ( (lv_witnesses_24_0= ruleXWitness ) )+
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
                            	    // InternalXMachine.g:2295:1: (lv_witnesses_24_0= ruleXWitness )
                            	    {
                            	    // InternalXMachine.g:2295:1: (lv_witnesses_24_0= ruleXWitness )
                            	    // InternalXMachine.g:2296:3: lv_witnesses_24_0= ruleXWitness
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getWitnessesXWitnessParserRuleCall_6_2_4_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_29);
                            	    lv_witnesses_24_0=ruleXWitness();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"witnesses",
                            	            		lv_witnesses_24_0, 
                            	            		"ac.soton.xeventb.XMachine.XWitness");
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


                            }
                            break;

                    }

                    // InternalXMachine.g:2312:5: (otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+ )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==28) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalXMachine.g:2312:7: otherlv_25= 'then' ( (lv_actions_26_0= ruleXAction ) )+
                            {
                            otherlv_25=(Token)match(input,28,FollowSets000.FOLLOW_10); 

                                	newLeafNode(otherlv_25, grammarAccess.getXEventSLCommentAccess().getThenKeyword_6_2_5_0());
                                
                            // InternalXMachine.g:2316:1: ( (lv_actions_26_0= ruleXAction ) )+
                            int cnt78=0;
                            loop78:
                            do {
                                int alt78=2;
                                int LA78_0 = input.LA(1);

                                if ( (LA78_0==RULE_ML_COMMENT||LA78_0==RULE_XLABEL) ) {
                                    alt78=1;
                                }


                                switch (alt78) {
                            	case 1 :
                            	    // InternalXMachine.g:2317:1: (lv_actions_26_0= ruleXAction )
                            	    {
                            	    // InternalXMachine.g:2317:1: (lv_actions_26_0= ruleXAction )
                            	    // InternalXMachine.g:2318:3: lv_actions_26_0= ruleXAction
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getXEventSLCommentAccess().getActionsXActionParserRuleCall_6_2_5_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_27);
                            	    lv_actions_26_0=ruleXAction();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getXEventSLCommentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"actions",
                            	            		lv_actions_26_0, 
                            	            		"ac.soton.xeventb.XMachine.XAction");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt78 >= 1 ) break loop78;
                                        EarlyExitException eee =
                                            new EarlyExitException(78, input);
                                        throw eee;
                                }
                                cnt78++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2346:1: entryRuleEventSync returns [EObject current=null] : iv_ruleEventSync= ruleEventSync EOF ;
    public final EObject entryRuleEventSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSync = null;


        try {
            // InternalXMachine.g:2347:2: (iv_ruleEventSync= ruleEventSync EOF )
            // InternalXMachine.g:2348:2: iv_ruleEventSync= ruleEventSync EOF
            {
             newCompositeNode(grammarAccess.getEventSyncRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEventSync=ruleEventSync();

            state._fsp--;

             current =iv_ruleEventSync; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2355:1: ruleEventSync returns [EObject current=null] : ( () ( (lv_extensionId_1_0= 'synchronises' ) ) ( ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleEventSync() throws RecognitionException {
        EObject current = null;

        Token lv_extensionId_1_0=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:2358:28: ( ( () ( (lv_extensionId_1_0= 'synchronises' ) ) ( ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalXMachine.g:2359:1: ( () ( (lv_extensionId_1_0= 'synchronises' ) ) ( ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalXMachine.g:2359:1: ( () ( (lv_extensionId_1_0= 'synchronises' ) ) ( ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            // InternalXMachine.g:2359:2: () ( (lv_extensionId_1_0= 'synchronises' ) ) ( ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalXMachine.g:2359:2: ()
            // InternalXMachine.g:2360:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0(),
                        current);
                

            }

            // InternalXMachine.g:2365:2: ( (lv_extensionId_1_0= 'synchronises' ) )
            // InternalXMachine.g:2366:1: (lv_extensionId_1_0= 'synchronises' )
            {
            // InternalXMachine.g:2366:1: (lv_extensionId_1_0= 'synchronises' )
            // InternalXMachine.g:2367:3: lv_extensionId_1_0= 'synchronises'
            {
            lv_extensionId_1_0=(Token)match(input,31,FollowSets000.FOLLOW_4); 

                    newLeafNode(lv_extensionId_1_0, grammarAccess.getEventSyncAccess().getExtensionIdSynchronisesKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventSyncRule());
            	        }
                   		setWithLastConsumed(current, "extensionId", lv_extensionId_1_0, "synchronises");
            	    

            }


            }

            // InternalXMachine.g:2380:2: ( ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:2380:3: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            // InternalXMachine.g:2380:3: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                int LA81_1 = input.LA(2);

                if ( (LA81_1==32) ) {
                    alt81=1;
                }
            }
            switch (alt81) {
                case 1 :
                    // InternalXMachine.g:2380:4: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalXMachine.g:2380:4: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalXMachine.g:2381:1: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalXMachine.g:2381:1: (lv_prefix_2_0= RULE_ID )
                    // InternalXMachine.g:2382:3: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); 

                    			newLeafNode(lv_prefix_2_0, grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_2_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventSyncRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"prefix",
                            		lv_prefix_2_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_3, grammarAccess.getEventSyncAccess().getFullStopKeyword_2_0_1());
                        

                    }
                    break;

            }

            // InternalXMachine.g:2402:3: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:2403:1: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:2403:1: (otherlv_4= RULE_ID )
            // InternalXMachine.g:2404:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEventSyncRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_4, grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_2_1_0()); 
            	

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
    // InternalXMachine.g:2423:1: entryRuleXParameter returns [EObject current=null] : iv_ruleXParameter= ruleXParameter EOF ;
    public final EObject entryRuleXParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameter = null;


        try {
            // InternalXMachine.g:2424:2: (iv_ruleXParameter= ruleXParameter EOF )
            // InternalXMachine.g:2425:2: iv_ruleXParameter= ruleXParameter EOF
            {
             newCompositeNode(grammarAccess.getXParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXParameter=ruleXParameter();

            state._fsp--;

             current =iv_ruleXParameter; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2432:1: ruleXParameter returns [EObject current=null] : (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment ) ;
    public final EObject ruleXParameter() throws RecognitionException {
        EObject current = null;

        EObject this_XParameterNoComment_0 = null;

        EObject this_XParameterMLComment_1 = null;

        EObject this_XParameterSLComment_2 = null;


         enterRule(); 
            
        try {
            // InternalXMachine.g:2435:28: ( (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment ) )
            // InternalXMachine.g:2436:1: (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment )
            {
            // InternalXMachine.g:2436:1: (this_XParameterNoComment_0= ruleXParameterNoComment | this_XParameterMLComment_1= ruleXParameterMLComment | this_XParameterSLComment_2= ruleXParameterSLComment )
            int alt82=3;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==EOF||LA82_1==RULE_ML_COMMENT||LA82_1==RULE_ID||LA82_1==30) ) {
                    alt82=1;
                }
                else if ( (LA82_1==RULE_SL_COMMENT) ) {
                    alt82=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA82_0==RULE_ML_COMMENT) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalXMachine.g:2437:5: this_XParameterNoComment_0= ruleXParameterNoComment
                    {
                     
                            newCompositeNode(grammarAccess.getXParameterAccess().getXParameterNoCommentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XParameterNoComment_0=ruleXParameterNoComment();

                    state._fsp--;

                     
                            current = this_XParameterNoComment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2447:5: this_XParameterMLComment_1= ruleXParameterMLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXParameterAccess().getXParameterMLCommentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XParameterMLComment_1=ruleXParameterMLComment();

                    state._fsp--;

                     
                            current = this_XParameterMLComment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2457:5: this_XParameterSLComment_2= ruleXParameterSLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXParameterAccess().getXParameterSLCommentParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXMachine.g:2473:1: entryRuleXParameterNoComment returns [EObject current=null] : iv_ruleXParameterNoComment= ruleXParameterNoComment EOF ;
    public final EObject entryRuleXParameterNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterNoComment = null;


        try {
            // InternalXMachine.g:2474:2: (iv_ruleXParameterNoComment= ruleXParameterNoComment EOF )
            // InternalXMachine.g:2475:2: iv_ruleXParameterNoComment= ruleXParameterNoComment EOF
            {
             newCompositeNode(grammarAccess.getXParameterNoCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXParameterNoComment=ruleXParameterNoComment();

            state._fsp--;

             current =iv_ruleXParameterNoComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2482:1: ruleXParameterNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameterNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:2485:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:2486:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:2486:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:2486:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:2486:2: ()
            // InternalXMachine.g:2487:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXParameterNoCommentAccess().getParameterAction_0(),
                        current);
                

            }

            // InternalXMachine.g:2492:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:2493:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:2493:1: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:2494:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2518:1: entryRuleXParameterMLComment returns [EObject current=null] : iv_ruleXParameterMLComment= ruleXParameterMLComment EOF ;
    public final EObject entryRuleXParameterMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterMLComment = null;


        try {
            // InternalXMachine.g:2519:2: (iv_ruleXParameterMLComment= ruleXParameterMLComment EOF )
            // InternalXMachine.g:2520:2: iv_ruleXParameterMLComment= ruleXParameterMLComment EOF
            {
             newCompositeNode(grammarAccess.getXParameterMLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXParameterMLComment=ruleXParameterMLComment();

            state._fsp--;

             current =iv_ruleXParameterMLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2527:1: ruleXParameterMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameterMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:2530:28: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:2531:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:2531:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:2531:2: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:2531:2: ()
            // InternalXMachine.g:2532:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXParameterMLCommentAccess().getParameterAction_0(),
                        current);
                

            }

            // InternalXMachine.g:2537:2: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:2538:1: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:2538:1: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:2539:3: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_4); 

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

            // InternalXMachine.g:2555:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:2556:1: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:2556:1: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:2557:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2581:1: entryRuleXParameterSLComment returns [EObject current=null] : iv_ruleXParameterSLComment= ruleXParameterSLComment EOF ;
    public final EObject entryRuleXParameterSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameterSLComment = null;


        try {
            // InternalXMachine.g:2582:2: (iv_ruleXParameterSLComment= ruleXParameterSLComment EOF )
            // InternalXMachine.g:2583:2: iv_ruleXParameterSLComment= ruleXParameterSLComment EOF
            {
             newCompositeNode(grammarAccess.getXParameterSLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXParameterSLComment=ruleXParameterSLComment();

            state._fsp--;

             current =iv_ruleXParameterSLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2590:1: ruleXParameterSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXParameterSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_comment_2_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:2593:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:2594:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:2594:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:2594:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:2594:2: ()
            // InternalXMachine.g:2595:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXParameterSLCommentAccess().getParameterAction_0(),
                        current);
                

            }

            // InternalXMachine.g:2600:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:2601:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:2601:1: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:2602:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); 

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

            // InternalXMachine.g:2618:2: ( (lv_comment_2_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:2619:1: (lv_comment_2_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:2619:1: (lv_comment_2_0= RULE_SL_COMMENT )
            // InternalXMachine.g:2620:3: lv_comment_2_0= RULE_SL_COMMENT
            {
            lv_comment_2_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2644:1: entryRuleXGuard returns [EObject current=null] : iv_ruleXGuard= ruleXGuard EOF ;
    public final EObject entryRuleXGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuard = null;


        try {
            // InternalXMachine.g:2645:2: (iv_ruleXGuard= ruleXGuard EOF )
            // InternalXMachine.g:2646:2: iv_ruleXGuard= ruleXGuard EOF
            {
             newCompositeNode(grammarAccess.getXGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXGuard=ruleXGuard();

            state._fsp--;

             current =iv_ruleXGuard; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2653:1: ruleXGuard returns [EObject current=null] : (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment ) ;
    public final EObject ruleXGuard() throws RecognitionException {
        EObject current = null;

        EObject this_XGuardNoComment_0 = null;

        EObject this_XGuardMLComment_1 = null;

        EObject this_XGuardSLComment_2 = null;


         enterRule(); 
            
        try {
            // InternalXMachine.g:2656:28: ( (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment ) )
            // InternalXMachine.g:2657:1: (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment )
            {
            // InternalXMachine.g:2657:1: (this_XGuardNoComment_0= ruleXGuardNoComment | this_XGuardMLComment_1= ruleXGuardMLComment | this_XGuardSLComment_2= ruleXGuardSLComment )
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_XLABEL) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 23:
                        {
                        int LA83_4 = input.LA(4);

                        if ( (LA83_4==EOF||LA83_4==RULE_ML_COMMENT||LA83_4==RULE_XLABEL||LA83_4==19||LA83_4==25||LA83_4==28) ) {
                            alt83=1;
                        }
                        else if ( (LA83_4==RULE_SL_COMMENT) ) {
                            alt83=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 83, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_SL_COMMENT:
                        {
                        alt83=3;
                        }
                        break;
                    case EOF:
                    case RULE_ML_COMMENT:
                    case RULE_XLABEL:
                    case 19:
                    case 25:
                    case 28:
                        {
                        alt83=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 3, input);

                        throw nvae;
                    }

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
                    // InternalXMachine.g:2658:5: this_XGuardNoComment_0= ruleXGuardNoComment
                    {
                     
                            newCompositeNode(grammarAccess.getXGuardAccess().getXGuardNoCommentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XGuardNoComment_0=ruleXGuardNoComment();

                    state._fsp--;

                     
                            current = this_XGuardNoComment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2668:5: this_XGuardMLComment_1= ruleXGuardMLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXGuardAccess().getXGuardMLCommentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XGuardMLComment_1=ruleXGuardMLComment();

                    state._fsp--;

                     
                            current = this_XGuardMLComment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2678:5: this_XGuardSLComment_2= ruleXGuardSLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXGuardAccess().getXGuardSLCommentParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
            // InternalXMachine.g:2695:2: (iv_ruleXGuardNoComment= ruleXGuardNoComment EOF )
            // InternalXMachine.g:2696:2: iv_ruleXGuardNoComment= ruleXGuardNoComment EOF
            {
             newCompositeNode(grammarAccess.getXGuardNoCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXGuardNoComment=ruleXGuardNoComment();

            state._fsp--;

             current =iv_ruleXGuardNoComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2703:1: ruleXGuardNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuardNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:2706:28: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalXMachine.g:2707:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:2707:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalXMachine.g:2707:2: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalXMachine.g:2707:2: ()
            // InternalXMachine.g:2708:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXGuardNoCommentAccess().getGuardAction_0(),
                        current);
                

            }

            // InternalXMachine.g:2713:2: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:2714:1: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:2714:1: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:2715:3: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXGuardNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXGuardNoCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:2731:2: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:2732:1: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:2732:1: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:2733:3: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); 

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

            // InternalXMachine.g:2749:2: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==23) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalXMachine.g:2750:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:2750:1: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:2751:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2772:1: entryRuleXGuardMLComment returns [EObject current=null] : iv_ruleXGuardMLComment= ruleXGuardMLComment EOF ;
    public final EObject entryRuleXGuardMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardMLComment = null;


        try {
            // InternalXMachine.g:2773:2: (iv_ruleXGuardMLComment= ruleXGuardMLComment EOF )
            // InternalXMachine.g:2774:2: iv_ruleXGuardMLComment= ruleXGuardMLComment EOF
            {
             newCompositeNode(grammarAccess.getXGuardMLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXGuardMLComment=ruleXGuardMLComment();

            state._fsp--;

             current =iv_ruleXGuardMLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2781:1: ruleXGuardMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) ;
    public final EObject ruleXGuardMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_predicate_3_0=null;
        Token lv_theorem_4_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:2784:28: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? ) )
            // InternalXMachine.g:2785:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            {
            // InternalXMachine.g:2785:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )? )
            // InternalXMachine.g:2785:2: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ( (lv_theorem_4_0= 'theorem' ) )?
            {
            // InternalXMachine.g:2785:2: ()
            // InternalXMachine.g:2786:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXGuardMLCommentAccess().getGuardAction_0(),
                        current);
                

            }

            // InternalXMachine.g:2791:2: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:2792:1: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:2792:1: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:2793:3: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_21); 

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

            // InternalXMachine.g:2809:2: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:2810:1: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:2810:1: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:2811:3: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_2_0, grammarAccess.getXGuardMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXGuardMLCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:2827:2: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalXMachine.g:2828:1: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalXMachine.g:2828:1: (lv_predicate_3_0= RULE_STRING )
            // InternalXMachine.g:2829:3: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); 

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

            // InternalXMachine.g:2845:2: ( (lv_theorem_4_0= 'theorem' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==23) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalXMachine.g:2846:1: (lv_theorem_4_0= 'theorem' )
                    {
                    // InternalXMachine.g:2846:1: (lv_theorem_4_0= 'theorem' )
                    // InternalXMachine.g:2847:3: lv_theorem_4_0= 'theorem'
                    {
                    lv_theorem_4_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2868:1: entryRuleXGuardSLComment returns [EObject current=null] : iv_ruleXGuardSLComment= ruleXGuardSLComment EOF ;
    public final EObject entryRuleXGuardSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuardSLComment = null;


        try {
            // InternalXMachine.g:2869:2: (iv_ruleXGuardSLComment= ruleXGuardSLComment EOF )
            // InternalXMachine.g:2870:2: iv_ruleXGuardSLComment= ruleXGuardSLComment EOF
            {
             newCompositeNode(grammarAccess.getXGuardSLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXGuardSLComment=ruleXGuardSLComment();

            state._fsp--;

             current =iv_ruleXGuardSLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2877:1: ruleXGuardSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXGuardSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_theorem_3_0=null;
        Token lv_comment_4_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:2880:28: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:2881:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:2881:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:2881:2: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:2881:2: ()
            // InternalXMachine.g:2882:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXGuardSLCommentAccess().getGuardAction_0(),
                        current);
                

            }

            // InternalXMachine.g:2887:2: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:2888:1: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:2888:1: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:2889:3: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXGuardSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXGuardSLCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:2905:2: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:2906:1: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:2906:1: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:2907:3: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_22); 

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

            // InternalXMachine.g:2923:2: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==23) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalXMachine.g:2924:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalXMachine.g:2924:1: (lv_theorem_3_0= 'theorem' )
                    // InternalXMachine.g:2925:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,23,FollowSets000.FOLLOW_18); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getXGuardSLCommentAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXGuardSLCommentRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // InternalXMachine.g:2938:3: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:2939:1: (lv_comment_4_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:2939:1: (lv_comment_4_0= RULE_SL_COMMENT )
            // InternalXMachine.g:2940:3: lv_comment_4_0= RULE_SL_COMMENT
            {
            lv_comment_4_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2964:1: entryRuleXWitness returns [EObject current=null] : iv_ruleXWitness= ruleXWitness EOF ;
    public final EObject entryRuleXWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitness = null;


        try {
            // InternalXMachine.g:2965:2: (iv_ruleXWitness= ruleXWitness EOF )
            // InternalXMachine.g:2966:2: iv_ruleXWitness= ruleXWitness EOF
            {
             newCompositeNode(grammarAccess.getXWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXWitness=ruleXWitness();

            state._fsp--;

             current =iv_ruleXWitness; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:2973:1: ruleXWitness returns [EObject current=null] : (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment ) ;
    public final EObject ruleXWitness() throws RecognitionException {
        EObject current = null;

        EObject this_XWitnessNoComment_0 = null;

        EObject this_XWitnessMLComment_1 = null;

        EObject this_XWitnessSLComment_2 = null;


         enterRule(); 
            
        try {
            // InternalXMachine.g:2976:28: ( (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment ) )
            // InternalXMachine.g:2977:1: (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment )
            {
            // InternalXMachine.g:2977:1: (this_XWitnessNoComment_0= ruleXWitnessNoComment | this_XWitnessMLComment_1= ruleXWitnessMLComment | this_XWitnessSLComment_2= ruleXWitnessSLComment )
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_XLABEL) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==RULE_STRING) ) {
                    int LA87_3 = input.LA(3);

                    if ( (LA87_3==EOF||LA87_3==RULE_ML_COMMENT||LA87_3==RULE_XLABEL||LA87_3==19||LA87_3==26||LA87_3==28) ) {
                        alt87=1;
                    }
                    else if ( (LA87_3==RULE_SL_COMMENT) ) {
                        alt87=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 3, input);

                        throw nvae;
                    }
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
                    // InternalXMachine.g:2978:5: this_XWitnessNoComment_0= ruleXWitnessNoComment
                    {
                     
                            newCompositeNode(grammarAccess.getXWitnessAccess().getXWitnessNoCommentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XWitnessNoComment_0=ruleXWitnessNoComment();

                    state._fsp--;

                     
                            current = this_XWitnessNoComment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2988:5: this_XWitnessMLComment_1= ruleXWitnessMLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXWitnessAccess().getXWitnessMLCommentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XWitnessMLComment_1=ruleXWitnessMLComment();

                    state._fsp--;

                     
                            current = this_XWitnessMLComment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2998:5: this_XWitnessSLComment_2= ruleXWitnessSLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXWitnessAccess().getXWitnessSLCommentParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXMachine.g:3014:1: entryRuleXWitnessNoComment returns [EObject current=null] : iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF ;
    public final EObject entryRuleXWitnessNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessNoComment = null;


        try {
            // InternalXMachine.g:3015:2: (iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF )
            // InternalXMachine.g:3016:2: iv_ruleXWitnessNoComment= ruleXWitnessNoComment EOF
            {
             newCompositeNode(grammarAccess.getXWitnessNoCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXWitnessNoComment=ruleXWitnessNoComment();

            state._fsp--;

             current =iv_ruleXWitnessNoComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3023:1: ruleXWitnessNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXWitnessNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:3026:28: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:3027:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:3027:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) )
            // InternalXMachine.g:3027:2: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) )
            {
            // InternalXMachine.g:3027:2: ()
            // InternalXMachine.g:3028:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXWitnessNoCommentAccess().getWitnessAction_0(),
                        current);
                

            }

            // InternalXMachine.g:3033:2: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3034:1: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3034:1: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3035:3: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXWitnessNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXWitnessNoCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:3051:2: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:3052:1: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:3052:1: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:3053:3: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3077:1: entryRuleXWitnessMLComment returns [EObject current=null] : iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF ;
    public final EObject entryRuleXWitnessMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessMLComment = null;


        try {
            // InternalXMachine.g:3078:2: (iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF )
            // InternalXMachine.g:3079:2: iv_ruleXWitnessMLComment= ruleXWitnessMLComment EOF
            {
             newCompositeNode(grammarAccess.getXWitnessMLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXWitnessMLComment=ruleXWitnessMLComment();

            state._fsp--;

             current =iv_ruleXWitnessMLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3086:1: ruleXWitnessMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleXWitnessMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_predicate_3_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:3089:28: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:3090:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:3090:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) ) )
            // InternalXMachine.g:3090:2: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= RULE_STRING ) )
            {
            // InternalXMachine.g:3090:2: ()
            // InternalXMachine.g:3091:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXWitnessMLCommentAccess().getWitnessAction_0(),
                        current);
                

            }

            // InternalXMachine.g:3096:2: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:3097:1: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3097:1: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:3098:3: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_21); 

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

            // InternalXMachine.g:3114:2: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:3115:1: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3115:1: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:3116:3: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_2_0, grammarAccess.getXWitnessMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXWitnessMLCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:3132:2: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalXMachine.g:3133:1: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalXMachine.g:3133:1: (lv_predicate_3_0= RULE_STRING )
            // InternalXMachine.g:3134:3: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3158:1: entryRuleXWitnessSLComment returns [EObject current=null] : iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF ;
    public final EObject entryRuleXWitnessSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitnessSLComment = null;


        try {
            // InternalXMachine.g:3159:2: (iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF )
            // InternalXMachine.g:3160:2: iv_ruleXWitnessSLComment= ruleXWitnessSLComment EOF
            {
             newCompositeNode(grammarAccess.getXWitnessSLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXWitnessSLComment=ruleXWitnessSLComment();

            state._fsp--;

             current =iv_ruleXWitnessSLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3167:1: ruleXWitnessSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXWitnessSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_predicate_2_0=null;
        Token lv_comment_3_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:3170:28: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:3171:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:3171:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:3171:2: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:3171:2: ()
            // InternalXMachine.g:3172:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXWitnessSLCommentAccess().getWitnessAction_0(),
                        current);
                

            }

            // InternalXMachine.g:3177:2: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3178:1: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3178:1: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3179:3: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXWitnessSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXWitnessSLCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:3195:2: ( (lv_predicate_2_0= RULE_STRING ) )
            // InternalXMachine.g:3196:1: (lv_predicate_2_0= RULE_STRING )
            {
            // InternalXMachine.g:3196:1: (lv_predicate_2_0= RULE_STRING )
            // InternalXMachine.g:3197:3: lv_predicate_2_0= RULE_STRING
            {
            lv_predicate_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_18); 

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

            // InternalXMachine.g:3213:2: ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:3214:1: (lv_comment_3_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3214:1: (lv_comment_3_0= RULE_SL_COMMENT )
            // InternalXMachine.g:3215:3: lv_comment_3_0= RULE_SL_COMMENT
            {
            lv_comment_3_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3239:1: entryRuleXAction returns [EObject current=null] : iv_ruleXAction= ruleXAction EOF ;
    public final EObject entryRuleXAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAction = null;


        try {
            // InternalXMachine.g:3240:2: (iv_ruleXAction= ruleXAction EOF )
            // InternalXMachine.g:3241:2: iv_ruleXAction= ruleXAction EOF
            {
             newCompositeNode(grammarAccess.getXActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXAction=ruleXAction();

            state._fsp--;

             current =iv_ruleXAction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3248:1: ruleXAction returns [EObject current=null] : (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment ) ;
    public final EObject ruleXAction() throws RecognitionException {
        EObject current = null;

        EObject this_XActionNoComment_0 = null;

        EObject this_XActionMLComment_1 = null;

        EObject this_XActionSLComment_2 = null;


         enterRule(); 
            
        try {
            // InternalXMachine.g:3251:28: ( (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment ) )
            // InternalXMachine.g:3252:1: (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment )
            {
            // InternalXMachine.g:3252:1: (this_XActionNoComment_0= ruleXActionNoComment | this_XActionMLComment_1= ruleXActionMLComment | this_XActionSLComment_2= ruleXActionSLComment )
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_XLABEL) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==RULE_STRING) ) {
                    int LA88_3 = input.LA(3);

                    if ( (LA88_3==RULE_SL_COMMENT) ) {
                        alt88=3;
                    }
                    else if ( (LA88_3==EOF||LA88_3==RULE_ML_COMMENT||LA88_3==RULE_XLABEL||LA88_3==19) ) {
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
                    // InternalXMachine.g:3253:5: this_XActionNoComment_0= ruleXActionNoComment
                    {
                     
                            newCompositeNode(grammarAccess.getXActionAccess().getXActionNoCommentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XActionNoComment_0=ruleXActionNoComment();

                    state._fsp--;

                     
                            current = this_XActionNoComment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3263:5: this_XActionMLComment_1= ruleXActionMLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXActionAccess().getXActionMLCommentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XActionMLComment_1=ruleXActionMLComment();

                    state._fsp--;

                     
                            current = this_XActionMLComment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:3273:5: this_XActionSLComment_2= ruleXActionSLComment
                    {
                     
                            newCompositeNode(grammarAccess.getXActionAccess().getXActionSLCommentParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXMachine.g:3289:1: entryRuleXActionNoComment returns [EObject current=null] : iv_ruleXActionNoComment= ruleXActionNoComment EOF ;
    public final EObject entryRuleXActionNoComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionNoComment = null;


        try {
            // InternalXMachine.g:3290:2: (iv_ruleXActionNoComment= ruleXActionNoComment EOF )
            // InternalXMachine.g:3291:2: iv_ruleXActionNoComment= ruleXActionNoComment EOF
            {
             newCompositeNode(grammarAccess.getXActionNoCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXActionNoComment=ruleXActionNoComment();

            state._fsp--;

             current =iv_ruleXActionNoComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3298:1: ruleXActionNoComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXActionNoComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_action_2_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:3301:28: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:3302:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:3302:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) )
            // InternalXMachine.g:3302:2: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) )
            {
            // InternalXMachine.g:3302:2: ()
            // InternalXMachine.g:3303:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXActionNoCommentAccess().getActionAction_0(),
                        current);
                

            }

            // InternalXMachine.g:3308:2: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3309:1: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3309:1: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3310:3: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXActionNoCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXActionNoCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:3326:2: ( (lv_action_2_0= RULE_STRING ) )
            // InternalXMachine.g:3327:1: (lv_action_2_0= RULE_STRING )
            {
            // InternalXMachine.g:3327:1: (lv_action_2_0= RULE_STRING )
            // InternalXMachine.g:3328:3: lv_action_2_0= RULE_STRING
            {
            lv_action_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3352:1: entryRuleXActionMLComment returns [EObject current=null] : iv_ruleXActionMLComment= ruleXActionMLComment EOF ;
    public final EObject entryRuleXActionMLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionMLComment = null;


        try {
            // InternalXMachine.g:3353:2: (iv_ruleXActionMLComment= ruleXActionMLComment EOF )
            // InternalXMachine.g:3354:2: iv_ruleXActionMLComment= ruleXActionMLComment EOF
            {
             newCompositeNode(grammarAccess.getXActionMLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXActionMLComment=ruleXActionMLComment();

            state._fsp--;

             current =iv_ruleXActionMLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3361:1: ruleXActionMLComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleXActionMLComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_action_3_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:3364:28: ( ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) ) )
            // InternalXMachine.g:3365:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) )
            {
            // InternalXMachine.g:3365:1: ( () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) ) )
            // InternalXMachine.g:3365:2: () ( (lv_comment_1_0= RULE_ML_COMMENT ) ) ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= RULE_STRING ) )
            {
            // InternalXMachine.g:3365:2: ()
            // InternalXMachine.g:3366:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXActionMLCommentAccess().getActionAction_0(),
                        current);
                

            }

            // InternalXMachine.g:3371:2: ( (lv_comment_1_0= RULE_ML_COMMENT ) )
            // InternalXMachine.g:3372:1: (lv_comment_1_0= RULE_ML_COMMENT )
            {
            // InternalXMachine.g:3372:1: (lv_comment_1_0= RULE_ML_COMMENT )
            // InternalXMachine.g:3373:3: lv_comment_1_0= RULE_ML_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_21); 

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

            // InternalXMachine.g:3389:2: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:3390:1: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3390:1: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:3391:3: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_2_0, grammarAccess.getXActionMLCommentAccess().getNameXLABELTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXActionMLCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:3407:2: ( (lv_action_3_0= RULE_STRING ) )
            // InternalXMachine.g:3408:1: (lv_action_3_0= RULE_STRING )
            {
            // InternalXMachine.g:3408:1: (lv_action_3_0= RULE_STRING )
            // InternalXMachine.g:3409:3: lv_action_3_0= RULE_STRING
            {
            lv_action_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3433:1: entryRuleXActionSLComment returns [EObject current=null] : iv_ruleXActionSLComment= ruleXActionSLComment EOF ;
    public final EObject entryRuleXActionSLComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXActionSLComment = null;


        try {
            // InternalXMachine.g:3434:2: (iv_ruleXActionSLComment= ruleXActionSLComment EOF )
            // InternalXMachine.g:3435:2: iv_ruleXActionSLComment= ruleXActionSLComment EOF
            {
             newCompositeNode(grammarAccess.getXActionSLCommentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXActionSLComment=ruleXActionSLComment();

            state._fsp--;

             current =iv_ruleXActionSLComment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3442:1: ruleXActionSLComment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) ;
    public final EObject ruleXActionSLComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_action_2_0=null;
        Token lv_comment_3_0=null;

         enterRule(); 
            
        try {
            // InternalXMachine.g:3445:28: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) ) )
            // InternalXMachine.g:3446:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            {
            // InternalXMachine.g:3446:1: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) ) )
            // InternalXMachine.g:3446:2: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= RULE_STRING ) ) ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            {
            // InternalXMachine.g:3446:2: ()
            // InternalXMachine.g:3447:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXActionSLCommentAccess().getActionAction_0(),
                        current);
                

            }

            // InternalXMachine.g:3452:2: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:3453:1: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3453:1: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:3454:3: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_19); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXActionSLCommentAccess().getNameXLABELTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXActionSLCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ac.soton.xeventb.XMachine.XLABEL");
            	    

            }


            }

            // InternalXMachine.g:3470:2: ( (lv_action_2_0= RULE_STRING ) )
            // InternalXMachine.g:3471:1: (lv_action_2_0= RULE_STRING )
            {
            // InternalXMachine.g:3471:1: (lv_action_2_0= RULE_STRING )
            // InternalXMachine.g:3472:3: lv_action_2_0= RULE_STRING
            {
            lv_action_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_18); 

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

            // InternalXMachine.g:3488:2: ( (lv_comment_3_0= RULE_SL_COMMENT ) )
            // InternalXMachine.g:3489:1: (lv_comment_3_0= RULE_SL_COMMENT )
            {
            // InternalXMachine.g:3489:1: (lv_comment_3_0= RULE_SL_COMMENT )
            // InternalXMachine.g:3490:3: lv_comment_3_0= RULE_SL_COMMENT
            {
            lv_comment_3_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_2); 

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
    // InternalXMachine.g:3514:1: ruleXConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleXConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalXMachine.g:3516:28: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalXMachine.g:3517:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalXMachine.g:3517:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt89=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt89=1;
                }
                break;
            case 34:
                {
                alt89=2;
                }
                break;
            case 35:
                {
                alt89=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalXMachine.g:3517:2: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalXMachine.g:3517:2: (enumLiteral_0= 'ordinary' )
                    // InternalXMachine.g:3517:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3523:6: (enumLiteral_1= 'convergent' )
                    {
                    // InternalXMachine.g:3523:6: (enumLiteral_1= 'convergent' )
                    // InternalXMachine.g:3523:8: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:3529:6: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalXMachine.g:3529:6: (enumLiteral_2= 'anticipated' )
                    // InternalXMachine.g:3529:8: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_2); 

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


    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\4\1\5\1\uffff\4\5\2\uffff";
    static final String dfa_3s = "\1\6\1\43\1\uffff\4\43\2\uffff";
    static final String dfa_4s = "\2\uffff\1\2\4\uffff\1\1\1\3";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\1",
            "\1\10\7\uffff\1\7\5\uffff\1\7\4\uffff\1\3\3\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\4\1\5\1\6",
            "",
            "\1\10\7\uffff\1\7\5\uffff\1\7\4\uffff\1\3\3\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\4\1\5\1\6",
            "\1\10\7\uffff\1\7\5\uffff\1\7\4\uffff\1\3\3\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\4\1\5\1\6",
            "\1\10\7\uffff\1\7\5\uffff\1\7\4\uffff\1\3\3\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\4\1\5\1\6",
            "\1\10\7\uffff\1\7\5\uffff\1\7\4\uffff\1\3\3\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\4\1\5\1\6",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1202:1: (this_XEventNoComment_0= ruleXEventNoComment | this_XEventMLComment_1= ruleXEventMLComment | this_XEventSLComment_2= ruleXEventSLComment )";
        }
    }
 

    
    private static class FollowSets000 {
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
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800020L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000EAF082000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000AE082000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000002E080040L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000090L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080090L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000012080090L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010080090L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000050L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000E01000020L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    }


}