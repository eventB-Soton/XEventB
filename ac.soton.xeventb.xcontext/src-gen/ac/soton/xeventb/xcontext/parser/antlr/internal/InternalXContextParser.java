package ac.soton.xeventb.xcontext.parser.antlr.internal;

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
import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXContextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_UNTRANSLATED_TOKEN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'extends'", "'sets'", "'constants'", "'constant'", "'cst'", "'axioms'", "'end'", "'.'", "':'", "'='", "'theorem'", "'thm'", "'axiom'", "'axm'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'\\u00D7'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'('", "')'", "'\\u2119'", "'\\u21191'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'%'", "'\\u22C2'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'extended'", "'record'", "'inherits'", "'field'", "'constraint'", "'one'", "'many'", "'opt'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_XLABEL=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int RULE_UNTRANSLATED_TOKEN=8;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // InternalXContext.g:65:1: entryRuleXContext returns [EObject current=null] : iv_ruleXContext= ruleXContext EOF ;
    public final EObject entryRuleXContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXContext = null;


        try {
            // InternalXContext.g:65:49: (iv_ruleXContext= ruleXContext EOF )
            // InternalXContext.g:66:2: iv_ruleXContext= ruleXContext EOF
            {
             newCompositeNode(grammarAccess.getXContextRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXContext=ruleXContext();

            state._fsp--;

             current =iv_ruleXContext; 
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
    // $ANTLR end "entryRuleXContext"


    // $ANTLR start "ruleXContext"
    // InternalXContext.g:72:1: ruleXContext returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | ( (otherlv_10= 'constant' | otherlv_11= 'cst' ) ( (lv_orderedChildren_12_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_13_0= ruleXRecord ) ) | (otherlv_14= 'axioms' ( (lv_orderedChildren_15_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_16_0= ruleXIndividualAxiom ) ) )* otherlv_17= 'end' ) ;
    public final EObject ruleXContext() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        EObject lv_orderedChildren_7_0 = null;

        EObject lv_orderedChildren_9_0 = null;

        EObject lv_orderedChildren_12_0 = null;

        EObject lv_orderedChildren_13_0 = null;

        EObject lv_orderedChildren_15_0 = null;

        EObject lv_orderedChildren_16_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:78:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | ( (otherlv_10= 'constant' | otherlv_11= 'cst' ) ( (lv_orderedChildren_12_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_13_0= ruleXRecord ) ) | (otherlv_14= 'axioms' ( (lv_orderedChildren_15_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_16_0= ruleXIndividualAxiom ) ) )* otherlv_17= 'end' ) )
            // InternalXContext.g:79:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | ( (otherlv_10= 'constant' | otherlv_11= 'cst' ) ( (lv_orderedChildren_12_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_13_0= ruleXRecord ) ) | (otherlv_14= 'axioms' ( (lv_orderedChildren_15_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_16_0= ruleXIndividualAxiom ) ) )* otherlv_17= 'end' )
            {
            // InternalXContext.g:79:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | ( (otherlv_10= 'constant' | otherlv_11= 'cst' ) ( (lv_orderedChildren_12_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_13_0= ruleXRecord ) ) | (otherlv_14= 'axioms' ( (lv_orderedChildren_15_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_16_0= ruleXIndividualAxiom ) ) )* otherlv_17= 'end' )
            // InternalXContext.g:80:3: () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | ( (otherlv_10= 'constant' | otherlv_11= 'cst' ) ( (lv_orderedChildren_12_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_13_0= ruleXRecord ) ) | (otherlv_14= 'axioms' ( (lv_orderedChildren_15_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_16_0= ruleXIndividualAxiom ) ) )* otherlv_17= 'end'
            {
            // InternalXContext.g:80:3: ()
            // InternalXContext.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXContextAccess().getContextAction_0(),
            					current);
            			

            }

            // InternalXContext.g:87:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXContext.g:88:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:88:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:89:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_3); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXContextAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXContextRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xcontext.XContext.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXContextAccess().getContextKeyword_2());
            		
            // InternalXContext.g:109:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXContext.g:110:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXContext.g:110:4: (lv_name_3_0= RULE_ID )
            // InternalXContext.g:111:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

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

            // InternalXContext.g:127:3: (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXContext.g:128:4: otherlv_4= 'extends' ( ( ruleQualifiedName ) )+
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getXContextAccess().getExtendsKeyword_4_0());
                    			
                    // InternalXContext.g:132:4: ( ( ruleQualifiedName ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXContext.g:133:5: ( ruleQualifiedName )
                    	    {
                    	    // InternalXContext.g:133:5: ( ruleQualifiedName )
                    	    // InternalXContext.g:134:6: ruleQualifiedName
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getXContextRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }

            // InternalXContext.g:149:3: ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | ( (otherlv_10= 'constant' | otherlv_11= 'cst' ) ( (lv_orderedChildren_12_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_13_0= ruleXRecord ) ) | (otherlv_14= 'axioms' ( (lv_orderedChildren_15_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_16_0= ruleXIndividualAxiom ) ) )*
            loop8:
            do {
                int alt8=7;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt8=1;
                    }
                    break;
                case 16:
                    {
                    alt8=2;
                    }
                    break;
                case 17:
                case 18:
                    {
                    alt8=3;
                    }
                    break;
                case 125:
                case 126:
                    {
                    alt8=4;
                    }
                    break;
                case 19:
                    {
                    alt8=5;
                    }
                    break;
                case RULE_STRING:
                case 24:
                case 25:
                case 26:
                case 27:
                    {
                    alt8=6;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalXContext.g:150:4: (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ )
            	    {
            	    // InternalXContext.g:150:4: (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ )
            	    // InternalXContext.g:151:5: otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_7); 

            	    					newLeafNode(otherlv_6, grammarAccess.getXContextAccess().getSetsKeyword_5_0_0());
            	    				
            	    // InternalXContext.g:155:5: ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_STRING) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( (LA4_2==RULE_ID) ) {
            	                alt4=1;
            	            }


            	        }
            	        else if ( (LA4_0==RULE_ID) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalXContext.g:156:6: (lv_orderedChildren_7_0= ruleXCarrierSet )
            	    	    {
            	    	    // InternalXContext.g:156:6: (lv_orderedChildren_7_0= ruleXCarrierSet )
            	    	    // InternalXContext.g:157:7: lv_orderedChildren_7_0= ruleXCarrierSet
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXCarrierSetParserRuleCall_5_0_1_0());
            	    	    						
            	    	    pushFollow(FollowSets000.FOLLOW_6);
            	    	    lv_orderedChildren_7_0=ruleXCarrierSet();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getXContextRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"orderedChildren",
            	    	    								lv_orderedChildren_7_0,
            	    	    								"ac.soton.xeventb.xcontext.XContext.XCarrierSet");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

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


            	    }
            	    break;
            	case 2 :
            	    // InternalXContext.g:176:4: (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ )
            	    {
            	    // InternalXContext.g:176:4: (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ )
            	    // InternalXContext.g:177:5: otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+
            	    {
            	    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            	    					newLeafNode(otherlv_8, grammarAccess.getXContextAccess().getConstantsKeyword_5_1_0());
            	    				
            	    // InternalXContext.g:181:5: ( (lv_orderedChildren_9_0= ruleXConstant ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_STRING) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( (LA5_2==RULE_ID) ) {
            	                alt5=1;
            	            }


            	        }
            	        else if ( (LA5_0==RULE_ID) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalXContext.g:182:6: (lv_orderedChildren_9_0= ruleXConstant )
            	    	    {
            	    	    // InternalXContext.g:182:6: (lv_orderedChildren_9_0= ruleXConstant )
            	    	    // InternalXContext.g:183:7: lv_orderedChildren_9_0= ruleXConstant
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXConstantParserRuleCall_5_1_1_0());
            	    	    						
            	    	    pushFollow(FollowSets000.FOLLOW_6);
            	    	    lv_orderedChildren_9_0=ruleXConstant();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getXContextRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"orderedChildren",
            	    	    								lv_orderedChildren_9_0,
            	    	    								"ac.soton.xeventb.xcontext.XContext.XConstant");
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


            	    }
            	    break;
            	case 3 :
            	    // InternalXContext.g:202:4: ( (otherlv_10= 'constant' | otherlv_11= 'cst' ) ( (lv_orderedChildren_12_0= ruleXTypedConstant ) ) )
            	    {
            	    // InternalXContext.g:202:4: ( (otherlv_10= 'constant' | otherlv_11= 'cst' ) ( (lv_orderedChildren_12_0= ruleXTypedConstant ) ) )
            	    // InternalXContext.g:203:5: (otherlv_10= 'constant' | otherlv_11= 'cst' ) ( (lv_orderedChildren_12_0= ruleXTypedConstant ) )
            	    {
            	    // InternalXContext.g:203:5: (otherlv_10= 'constant' | otherlv_11= 'cst' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==17) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==18) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalXContext.g:204:6: otherlv_10= 'constant'
            	            {
            	            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            	            						newLeafNode(otherlv_10, grammarAccess.getXContextAccess().getConstantKeyword_5_2_0_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalXContext.g:209:6: otherlv_11= 'cst'
            	            {
            	            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_7); 

            	            						newLeafNode(otherlv_11, grammarAccess.getXContextAccess().getCstKeyword_5_2_0_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalXContext.g:214:5: ( (lv_orderedChildren_12_0= ruleXTypedConstant ) )
            	    // InternalXContext.g:215:6: (lv_orderedChildren_12_0= ruleXTypedConstant )
            	    {
            	    // InternalXContext.g:215:6: (lv_orderedChildren_12_0= ruleXTypedConstant )
            	    // InternalXContext.g:216:7: lv_orderedChildren_12_0= ruleXTypedConstant
            	    {

            	    							newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXTypedConstantParserRuleCall_5_2_1_0());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_orderedChildren_12_0=ruleXTypedConstant();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getXContextRule());
            	    							}
            	    							add(
            	    								current,
            	    								"orderedChildren",
            	    								lv_orderedChildren_12_0,
            	    								"ac.soton.xeventb.xcontext.XContext.XTypedConstant");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXContext.g:235:4: ( (lv_orderedChildren_13_0= ruleXRecord ) )
            	    {
            	    // InternalXContext.g:235:4: ( (lv_orderedChildren_13_0= ruleXRecord ) )
            	    // InternalXContext.g:236:5: (lv_orderedChildren_13_0= ruleXRecord )
            	    {
            	    // InternalXContext.g:236:5: (lv_orderedChildren_13_0= ruleXRecord )
            	    // InternalXContext.g:237:6: lv_orderedChildren_13_0= ruleXRecord
            	    {

            	    						newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXRecordParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_orderedChildren_13_0=ruleXRecord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_13_0,
            	    							"ac.soton.xeventb.xcontext.XContext.XRecord");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXContext.g:255:4: (otherlv_14= 'axioms' ( (lv_orderedChildren_15_0= ruleXAxiom ) )+ )
            	    {
            	    // InternalXContext.g:255:4: (otherlv_14= 'axioms' ( (lv_orderedChildren_15_0= ruleXAxiom ) )+ )
            	    // InternalXContext.g:256:5: otherlv_14= 'axioms' ( (lv_orderedChildren_15_0= ruleXAxiom ) )+
            	    {
            	    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_9); 

            	    					newLeafNode(otherlv_14, grammarAccess.getXContextAccess().getAxiomsKeyword_5_4_0());
            	    				
            	    // InternalXContext.g:260:5: ( (lv_orderedChildren_15_0= ruleXAxiom ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_STRING) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( (LA7_2==RULE_XLABEL) ) {
            	                alt7=1;
            	            }


            	        }
            	        else if ( (LA7_0==RULE_XLABEL) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalXContext.g:261:6: (lv_orderedChildren_15_0= ruleXAxiom )
            	    	    {
            	    	    // InternalXContext.g:261:6: (lv_orderedChildren_15_0= ruleXAxiom )
            	    	    // InternalXContext.g:262:7: lv_orderedChildren_15_0= ruleXAxiom
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXAxiomParserRuleCall_5_4_1_0());
            	    	    						
            	    	    pushFollow(FollowSets000.FOLLOW_10);
            	    	    lv_orderedChildren_15_0=ruleXAxiom();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getXContextRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"orderedChildren",
            	    	    								lv_orderedChildren_15_0,
            	    	    								"ac.soton.xeventb.xcontext.XContext.XAxiom");
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


            	    }
            	    break;
            	case 6 :
            	    // InternalXContext.g:281:4: ( (lv_orderedChildren_16_0= ruleXIndividualAxiom ) )
            	    {
            	    // InternalXContext.g:281:4: ( (lv_orderedChildren_16_0= ruleXIndividualAxiom ) )
            	    // InternalXContext.g:282:5: (lv_orderedChildren_16_0= ruleXIndividualAxiom )
            	    {
            	    // InternalXContext.g:282:5: (lv_orderedChildren_16_0= ruleXIndividualAxiom )
            	    // InternalXContext.g:283:6: lv_orderedChildren_16_0= ruleXIndividualAxiom
            	    {

            	    						newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualAxiomParserRuleCall_5_5_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_orderedChildren_16_0=ruleXIndividualAxiom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_16_0,
            	    							"ac.soton.xeventb.xcontext.XContext.XIndividualAxiom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getXContextAccess().getEndKeyword_6());
            		

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
    // InternalXContext.g:309:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXContext.g:309:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXContext.g:310:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXContext.g:316:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXContext.g:322:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXContext.g:323:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXContext.g:323:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXContext.g:324:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXContext.g:331:3: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXContext.g:332:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FollowSets000.FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalXContext.g:349:1: entryRuleXCarrierSet returns [EObject current=null] : iv_ruleXCarrierSet= ruleXCarrierSet EOF ;
    public final EObject entryRuleXCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCarrierSet = null;


        try {
            // InternalXContext.g:349:52: (iv_ruleXCarrierSet= ruleXCarrierSet EOF )
            // InternalXContext.g:350:2: iv_ruleXCarrierSet= ruleXCarrierSet EOF
            {
             newCompositeNode(grammarAccess.getXCarrierSetRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXCarrierSet=ruleXCarrierSet();

            state._fsp--;

             current =iv_ruleXCarrierSet; 
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
    // $ANTLR end "entryRuleXCarrierSet"


    // $ANTLR start "ruleXCarrierSet"
    // InternalXContext.g:356:1: ruleXCarrierSet returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXCarrierSet() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXContext.g:362:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXContext.g:363:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXContext.g:363:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXContext.g:364:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXContext.g:364:3: ()
            // InternalXContext.g:365:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0(),
            					current);
            			

            }

            // InternalXContext.g:371:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXContext.g:372:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:372:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:373:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_4); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXCarrierSetAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXCarrierSetRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xcontext.XContext.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXContext.g:389:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:390:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:390:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:391:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXCarrierSetAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXCarrierSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // InternalXContext.g:411:1: entryRuleXConstant returns [EObject current=null] : iv_ruleXConstant= ruleXConstant EOF ;
    public final EObject entryRuleXConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstant = null;


        try {
            // InternalXContext.g:411:50: (iv_ruleXConstant= ruleXConstant EOF )
            // InternalXContext.g:412:2: iv_ruleXConstant= ruleXConstant EOF
            {
             newCompositeNode(grammarAccess.getXConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXConstant=ruleXConstant();

            state._fsp--;

             current =iv_ruleXConstant; 
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
    // $ANTLR end "entryRuleXConstant"


    // $ANTLR start "ruleXConstant"
    // InternalXContext.g:418:1: ruleXConstant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXConstant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXContext.g:424:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXContext.g:425:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXContext.g:425:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXContext.g:426:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXContext.g:426:3: ()
            // InternalXContext.g:427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstantAccess().getConstantAction_0(),
            					current);
            			

            }

            // InternalXContext.g:433:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXContext.g:434:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:434:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:435:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_4); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXConstantAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xcontext.XContext.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXContext.g:451:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:452:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:452:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:453:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXConstantAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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


    // $ANTLR start "entryRuleXTypedConstant"
    // InternalXContext.g:473:1: entryRuleXTypedConstant returns [EObject current=null] : iv_ruleXTypedConstant= ruleXTypedConstant EOF ;
    public final EObject entryRuleXTypedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypedConstant = null;


        try {
            // InternalXContext.g:473:55: (iv_ruleXTypedConstant= ruleXTypedConstant EOF )
            // InternalXContext.g:474:2: iv_ruleXTypedConstant= ruleXTypedConstant EOF
            {
             newCompositeNode(grammarAccess.getXTypedConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXTypedConstant=ruleXTypedConstant();

            state._fsp--;

             current =iv_ruleXTypedConstant; 
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
    // $ANTLR end "entryRuleXTypedConstant"


    // $ANTLR start "ruleXTypedConstant"
    // InternalXContext.g:480:1: ruleXTypedConstant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )? ) ;
    public final EObject ruleXTypedConstant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:486:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )? ) )
            // InternalXContext.g:487:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )? )
            {
            // InternalXContext.g:487:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )? )
            // InternalXContext.g:488:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )?
            {
            // InternalXContext.g:488:3: ()
            // InternalXContext.g:489:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXTypedConstantAccess().getTypedConstantAction_0(),
            					current);
            			

            }

            // InternalXContext.g:495:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXContext.g:496:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:496:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:497:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_4); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXTypedConstantAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXTypedConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xcontext.XContext.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXContext.g:513:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:514:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:514:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:515:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXTypedConstantAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXTypedConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xcontext.XContext.ID");
            				

            }


            }

            // InternalXContext.g:531:3: (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXContext.g:532:4: otherlv_3= ':' ( (lv_type_4_0= ruleXType ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getXTypedConstantAccess().getColonKeyword_3_0());
                    			
                    // InternalXContext.g:536:4: ( (lv_type_4_0= ruleXType ) )
                    // InternalXContext.g:537:5: (lv_type_4_0= ruleXType )
                    {
                    // InternalXContext.g:537:5: (lv_type_4_0= ruleXType )
                    // InternalXContext.g:538:6: lv_type_4_0= ruleXType
                    {

                    						newCompositeNode(grammarAccess.getXTypedConstantAccess().getTypeXTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_type_4_0=ruleXType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXTypedConstantRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"ac.soton.xeventb.xcontext.XContext.XType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXContext.g:556:3: (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXContext.g:557:4: otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) )
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getXTypedConstantAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalXContext.g:561:4: ( (lv_value_6_0= ruleXFormula ) )
                    // InternalXContext.g:562:5: (lv_value_6_0= ruleXFormula )
                    {
                    // InternalXContext.g:562:5: (lv_value_6_0= ruleXFormula )
                    // InternalXContext.g:563:6: lv_value_6_0= ruleXFormula
                    {

                    						newCompositeNode(grammarAccess.getXTypedConstantAccess().getValueXFormulaParserRuleCall_4_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_6_0=ruleXFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXTypedConstantRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"ac.soton.xeventb.xcontext.XContext.XFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleXTypedConstant"


    // $ANTLR start "entryRuleXIndividualAxiom"
    // InternalXContext.g:585:1: entryRuleXIndividualAxiom returns [EObject current=null] : iv_ruleXIndividualAxiom= ruleXIndividualAxiom EOF ;
    public final EObject entryRuleXIndividualAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIndividualAxiom = null;


        try {
            // InternalXContext.g:585:57: (iv_ruleXIndividualAxiom= ruleXIndividualAxiom EOF )
            // InternalXContext.g:586:2: iv_ruleXIndividualAxiom= ruleXIndividualAxiom EOF
            {
             newCompositeNode(grammarAccess.getXIndividualAxiomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXIndividualAxiom=ruleXIndividualAxiom();

            state._fsp--;

             current =iv_ruleXIndividualAxiom; 
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
    // $ANTLR end "entryRuleXIndividualAxiom"


    // $ANTLR start "ruleXIndividualAxiom"
    // InternalXContext.g:592:1: ruleXIndividualAxiom returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) | (otherlv_3= 'axiom' | otherlv_4= 'axm' ) ) ( (lv_name_5_0= RULE_XLABEL ) ) ( (lv_predicate_6_0= ruleXFormula ) ) ) ;
    public final EObject ruleXIndividualAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_theorem_2_1=null;
        Token lv_theorem_2_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        AntlrDatatypeRuleToken lv_predicate_6_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:598:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) | (otherlv_3= 'axiom' | otherlv_4= 'axm' ) ) ( (lv_name_5_0= RULE_XLABEL ) ) ( (lv_predicate_6_0= ruleXFormula ) ) ) )
            // InternalXContext.g:599:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) | (otherlv_3= 'axiom' | otherlv_4= 'axm' ) ) ( (lv_name_5_0= RULE_XLABEL ) ) ( (lv_predicate_6_0= ruleXFormula ) ) )
            {
            // InternalXContext.g:599:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) | (otherlv_3= 'axiom' | otherlv_4= 'axm' ) ) ( (lv_name_5_0= RULE_XLABEL ) ) ( (lv_predicate_6_0= ruleXFormula ) ) )
            // InternalXContext.g:600:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) | (otherlv_3= 'axiom' | otherlv_4= 'axm' ) ) ( (lv_name_5_0= RULE_XLABEL ) ) ( (lv_predicate_6_0= ruleXFormula ) )
            {
            // InternalXContext.g:600:3: ()
            // InternalXContext.g:601:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXIndividualAxiomAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalXContext.g:607:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXContext.g:608:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:608:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:609:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_16); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXIndividualAxiomAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXIndividualAxiomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xcontext.XContext.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXContext.g:625:3: ( ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) | (otherlv_3= 'axiom' | otherlv_4= 'axm' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=24 && LA18_0<=25)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=26 && LA18_0<=27)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalXContext.g:626:4: ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) )
                    {
                    // InternalXContext.g:626:4: ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) )
                    // InternalXContext.g:627:5: ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) )
                    {
                    // InternalXContext.g:627:5: ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) )
                    // InternalXContext.g:628:6: (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' )
                    {
                    // InternalXContext.g:628:6: (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==24) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==25) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalXContext.g:629:7: lv_theorem_2_1= 'theorem'
                            {
                            lv_theorem_2_1=(Token)match(input,24,FollowSets000.FOLLOW_17); 

                            							newLeafNode(lv_theorem_2_1, grammarAccess.getXIndividualAxiomAccess().getTheoremTheoremKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getXIndividualAxiomRule());
                            							}
                            							setWithLastConsumed(current, "theorem", lv_theorem_2_1 != null, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalXContext.g:640:7: lv_theorem_2_2= 'thm'
                            {
                            lv_theorem_2_2=(Token)match(input,25,FollowSets000.FOLLOW_17); 

                            							newLeafNode(lv_theorem_2_2, grammarAccess.getXIndividualAxiomAccess().getTheoremThmKeyword_2_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getXIndividualAxiomRule());
                            							}
                            							setWithLastConsumed(current, "theorem", lv_theorem_2_2 != null, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:654:4: (otherlv_3= 'axiom' | otherlv_4= 'axm' )
                    {
                    // InternalXContext.g:654:4: (otherlv_3= 'axiom' | otherlv_4= 'axm' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==26) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==27) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalXContext.g:655:5: otherlv_3= 'axiom'
                            {
                            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_17); 

                            					newLeafNode(otherlv_3, grammarAccess.getXIndividualAxiomAccess().getAxiomKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXContext.g:660:5: otherlv_4= 'axm'
                            {
                            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_17); 

                            					newLeafNode(otherlv_4, grammarAccess.getXIndividualAxiomAccess().getAxmKeyword_2_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalXContext.g:666:3: ( (lv_name_5_0= RULE_XLABEL ) )
            // InternalXContext.g:667:4: (lv_name_5_0= RULE_XLABEL )
            {
            // InternalXContext.g:667:4: (lv_name_5_0= RULE_XLABEL )
            // InternalXContext.g:668:5: lv_name_5_0= RULE_XLABEL
            {
            lv_name_5_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_15); 

            					newLeafNode(lv_name_5_0, grammarAccess.getXIndividualAxiomAccess().getNameXLABELTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXIndividualAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"ac.soton.xeventb.xcontext.XContext.XLABEL");
            				

            }


            }

            // InternalXContext.g:684:3: ( (lv_predicate_6_0= ruleXFormula ) )
            // InternalXContext.g:685:4: (lv_predicate_6_0= ruleXFormula )
            {
            // InternalXContext.g:685:4: (lv_predicate_6_0= ruleXFormula )
            // InternalXContext.g:686:5: lv_predicate_6_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXIndividualAxiomAccess().getPredicateXFormulaParserRuleCall_4_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_predicate_6_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXIndividualAxiomRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_6_0,
            						"ac.soton.xeventb.xcontext.XContext.XFormula");
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
    // $ANTLR end "ruleXIndividualAxiom"


    // $ANTLR start "entryRuleXAxiom"
    // InternalXContext.g:707:1: entryRuleXAxiom returns [EObject current=null] : iv_ruleXAxiom= ruleXAxiom EOF ;
    public final EObject entryRuleXAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAxiom = null;


        try {
            // InternalXContext.g:707:47: (iv_ruleXAxiom= ruleXAxiom EOF )
            // InternalXContext.g:708:2: iv_ruleXAxiom= ruleXAxiom EOF
            {
             newCompositeNode(grammarAccess.getXAxiomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXAxiom=ruleXAxiom();

            state._fsp--;

             current =iv_ruleXAxiom; 
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
    // $ANTLR end "entryRuleXAxiom"


    // $ANTLR start "ruleXAxiom"
    // InternalXContext.g:714:1: ruleXAxiom returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:720:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXContext.g:721:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXContext.g:721:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXContext.g:722:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXContext.g:722:3: ()
            // InternalXContext.g:723:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXAxiomAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalXContext.g:729:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXContext.g:730:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:730:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:731:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_17); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXAxiomAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXAxiomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xcontext.XContext.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXContext.g:747:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXContext.g:748:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXContext.g:748:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXContext.g:749:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXAxiomAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xcontext.XContext.XLABEL");
            				

            }


            }

            // InternalXContext.g:765:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXContext.g:766:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXContext.g:766:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXContext.g:767:5: lv_predicate_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXAxiomAccess().getPredicateXFormulaParserRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_predicate_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXAxiomRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"ac.soton.xeventb.xcontext.XContext.XFormula");
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
    // $ANTLR end "ruleXAxiom"


    // $ANTLR start "entryRuleXFormula"
    // InternalXContext.g:788:1: entryRuleXFormula returns [String current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final String entryRuleXFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXFormula = null;


        try {
            // InternalXContext.g:788:48: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalXContext.g:789:2: iv_ruleXFormula= ruleXFormula EOF
            {
             newCompositeNode(grammarAccess.getXFormulaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXFormula=ruleXFormula();

            state._fsp--;

             current =iv_ruleXFormula.getText(); 
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
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalXContext.g:795:1: ruleXFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+ ;
    public final AntlrDatatypeRuleToken ruleXFormula() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_3=null;
        Token this_INT_4=null;
        Token this_UNTRANSLATED_TOKEN_5=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_0 = null;

        AntlrDatatypeRuleToken this_EVENTB_PREDICATE_SYMBOLS_1 = null;

        AntlrDatatypeRuleToken this_EVENTB_EXPRESSION_SYMBOLS_2 = null;



        	enterRule();

        try {
            // InternalXContext.g:801:2: ( (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+ )
            // InternalXContext.g:802:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+
            {
            // InternalXContext.g:802:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+
            int cnt20=0;
            loop20:
            do {
                int alt20=7;
                switch ( input.LA(1) ) {
                case 40:
                case 41:
                case 42:
                case 43:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                    {
                    alt20=1;
                    }
                    break;
                case 21:
                case 22:
                case 23:
                case 44:
                case 45:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                    {
                    alt20=2;
                    }
                    break;
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                    {
                    alt20=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt20=4;
                    }
                    break;
                case RULE_INT:
                    {
                    alt20=5;
                    }
                    break;
                case RULE_UNTRANSLATED_TOKEN:
                    {
                    alt20=6;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalXContext.g:803:3: this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0());
            	    		
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    this_EVENTB_IDENTIFIER_KEYWORD_0=ruleEVENTB_IDENTIFIER_KEYWORD();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_IDENTIFIER_KEYWORD_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalXContext.g:814:3: this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1());
            	    		
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    this_EVENTB_PREDICATE_SYMBOLS_1=ruleEVENTB_PREDICATE_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_PREDICATE_SYMBOLS_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalXContext.g:825:3: this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2());
            	    		
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    this_EVENTB_EXPRESSION_SYMBOLS_2=ruleEVENTB_EXPRESSION_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_EXPRESSION_SYMBOLS_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalXContext.g:836:3: this_ID_3= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); 

            	    			current.merge(this_ID_3);
            	    		

            	    			newLeafNode(this_ID_3, grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalXContext.g:844:3: this_INT_4= RULE_INT
            	    {
            	    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_18); 

            	    			current.merge(this_INT_4);
            	    		

            	    			newLeafNode(this_INT_4, grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalXContext.g:852:3: this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN
            	    {
            	    this_UNTRANSLATED_TOKEN_5=(Token)match(input,RULE_UNTRANSLATED_TOKEN,FollowSets000.FOLLOW_18); 

            	    			current.merge(this_UNTRANSLATED_TOKEN_5);
            	    		

            	    			newLeafNode(this_UNTRANSLATED_TOKEN_5, grammarAccess.getXFormulaAccess().getUNTRANSLATED_TOKENTerminalRuleCall_5());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


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
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleXType"
    // InternalXContext.g:863:1: entryRuleXType returns [String current=null] : iv_ruleXType= ruleXType EOF ;
    public final String entryRuleXType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXType = null;


        try {
            // InternalXContext.g:863:45: (iv_ruleXType= ruleXType EOF )
            // InternalXContext.g:864:2: iv_ruleXType= ruleXType EOF
            {
             newCompositeNode(grammarAccess.getXTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXType=ruleXType();

            state._fsp--;

             current =iv_ruleXType.getText(); 
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
    // $ANTLR end "entryRuleXType"


    // $ANTLR start "ruleXType"
    // InternalXContext.g:870:1: ruleXType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* ) ;
    public final AntlrDatatypeRuleToken ruleXType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_XTypePrimitive_0 = null;

        AntlrDatatypeRuleToken this_XTYPEOPERATOR_1 = null;

        AntlrDatatypeRuleToken this_XTypePrimitive_2 = null;



        	enterRule();

        try {
            // InternalXContext.g:876:2: ( (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* ) )
            // InternalXContext.g:877:2: (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* )
            {
            // InternalXContext.g:877:2: (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* )
            // InternalXContext.g:878:3: this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )*
            {

            			newCompositeNode(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_19);
            this_XTypePrimitive_0=ruleXTypePrimitive();

            state._fsp--;


            			current.merge(this_XTypePrimitive_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXContext.g:888:3: (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=28 && LA21_0<=39)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXContext.g:889:4: this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive
            	    {

            	    				newCompositeNode(grammarAccess.getXTypeAccess().getXTYPEOPERATORParserRuleCall_1_0());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    this_XTYPEOPERATOR_1=ruleXTYPEOPERATOR();

            	    state._fsp--;


            	    				current.merge(this_XTYPEOPERATOR_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_1_1());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    this_XTypePrimitive_2=ruleXTypePrimitive();

            	    state._fsp--;


            	    				current.merge(this_XTypePrimitive_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleXType"


    // $ANTLR start "entryRuleXTYPEOPERATOR"
    // InternalXContext.g:914:1: entryRuleXTYPEOPERATOR returns [String current=null] : iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF ;
    public final String entryRuleXTYPEOPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXTYPEOPERATOR = null;


        try {
            // InternalXContext.g:914:53: (iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF )
            // InternalXContext.g:915:2: iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF
            {
             newCompositeNode(grammarAccess.getXTYPEOPERATORRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXTYPEOPERATOR=ruleXTYPEOPERATOR();

            state._fsp--;

             current =iv_ruleXTYPEOPERATOR.getText(); 
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
    // $ANTLR end "entryRuleXTYPEOPERATOR"


    // $ANTLR start "ruleXTYPEOPERATOR"
    // InternalXContext.g:921:1: ruleXTYPEOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' ) ;
    public final AntlrDatatypeRuleToken ruleXTYPEOPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:927:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' ) )
            // InternalXContext.g:928:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' )
            {
            // InternalXContext.g:928:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' )
            int alt22=12;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt22=1;
                }
                break;
            case 29:
                {
                alt22=2;
                }
                break;
            case 30:
                {
                alt22=3;
                }
                break;
            case 31:
                {
                alt22=4;
                }
                break;
            case 32:
                {
                alt22=5;
                }
                break;
            case 33:
                {
                alt22=6;
                }
                break;
            case 34:
                {
                alt22=7;
                }
                break;
            case 35:
                {
                alt22=8;
                }
                break;
            case 36:
                {
                alt22=9;
                }
                break;
            case 37:
                {
                alt22=10;
                }
                break;
            case 38:
                {
                alt22=11;
                }
                break;
            case 39:
                {
                alt22=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalXContext.g:929:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:935:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:941:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:947:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:953:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:959:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:965:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:971:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:977:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:983:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:989:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:995:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_11());
                    		

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
    // $ANTLR end "ruleXTYPEOPERATOR"


    // $ANTLR start "entryRuleXTypePrimitive"
    // InternalXContext.g:1004:1: entryRuleXTypePrimitive returns [String current=null] : iv_ruleXTypePrimitive= ruleXTypePrimitive EOF ;
    public final String entryRuleXTypePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXTypePrimitive = null;


        try {
            // InternalXContext.g:1004:54: (iv_ruleXTypePrimitive= ruleXTypePrimitive EOF )
            // InternalXContext.g:1005:2: iv_ruleXTypePrimitive= ruleXTypePrimitive EOF
            {
             newCompositeNode(grammarAccess.getXTypePrimitiveRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXTypePrimitive=ruleXTypePrimitive();

            state._fsp--;

             current =iv_ruleXTypePrimitive.getText(); 
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
    // $ANTLR end "entryRuleXTypePrimitive"


    // $ANTLR start "ruleXTypePrimitive"
    // InternalXContext.g:1011:1: ruleXTypePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleXTypePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_XType_6 = null;

        AntlrDatatypeRuleToken this_XType_10 = null;

        AntlrDatatypeRuleToken this_XType_14 = null;



        	enterRule();

        try {
            // InternalXContext.g:1017:2: ( (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) ) )
            // InternalXContext.g:1018:2: (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) )
            {
            // InternalXContext.g:1018:2: (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) )
            int alt23=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt23=1;
                }
                break;
            case 40:
                {
                alt23=2;
                }
                break;
            case 41:
                {
                alt23=3;
                }
                break;
            case 42:
                {
                alt23=4;
                }
                break;
            case 43:
                {
                alt23=5;
                }
                break;
            case 44:
                {
                alt23=6;
                }
                break;
            case 46:
                {
                alt23=7;
                }
                break;
            case 47:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalXContext.g:1019:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1027:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1033:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1039:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1045:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1051:3: (kw= '(' this_XType_6= ruleXType kw= ')' )
                    {
                    // InternalXContext.g:1051:3: (kw= '(' this_XType_6= ruleXType kw= ')' )
                    // InternalXContext.g:1052:4: kw= '(' this_XType_6= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_5_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_20);
                    this_XType_6=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:1074:3: (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' )
                    {
                    // InternalXContext.g:1074:3: (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' )
                    // InternalXContext.g:1075:4: kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0());
                    			
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_6_2());
                    			
                    pushFollow(FollowSets000.FOLLOW_20);
                    this_XType_10=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_10);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:1102:3: (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' )
                    {
                    // InternalXContext.g:1102:3: (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' )
                    // InternalXContext.g:1103:4: kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0());
                    			
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_7_2());
                    			
                    pushFollow(FollowSets000.FOLLOW_20);
                    this_XType_14=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_14);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_7_3());
                    			

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
    // $ANTLR end "ruleXTypePrimitive"


    // $ANTLR start "entryRuleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXContext.g:1133:1: entryRuleEVENTB_IDENTIFIER_KEYWORD returns [String current=null] : iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final String entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_IDENTIFIER_KEYWORD = null;


        try {
            // InternalXContext.g:1133:65: (iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXContext.g:1134:2: iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF
            {
             newCompositeNode(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEVENTB_IDENTIFIER_KEYWORD=ruleEVENTB_IDENTIFIER_KEYWORD();

            state._fsp--;

             current =iv_ruleEVENTB_IDENTIFIER_KEYWORD.getText(); 
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
    // $ANTLR end "entryRuleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "ruleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXContext.g:1140:1: ruleEVENTB_IDENTIFIER_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:1146:2: ( (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) )
            // InternalXContext.g:1147:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            {
            // InternalXContext.g:1147:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            int alt24=23;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt24=1;
                }
                break;
            case 48:
                {
                alt24=2;
                }
                break;
            case 49:
                {
                alt24=3;
                }
                break;
            case 50:
                {
                alt24=4;
                }
                break;
            case 51:
                {
                alt24=5;
                }
                break;
            case 52:
                {
                alt24=6;
                }
                break;
            case 53:
                {
                alt24=7;
                }
                break;
            case 54:
                {
                alt24=8;
                }
                break;
            case 55:
                {
                alt24=9;
                }
                break;
            case 56:
                {
                alt24=10;
                }
                break;
            case 57:
                {
                alt24=11;
                }
                break;
            case 58:
                {
                alt24=12;
                }
                break;
            case 59:
                {
                alt24=13;
                }
                break;
            case 60:
                {
                alt24=14;
                }
                break;
            case 61:
                {
                alt24=15;
                }
                break;
            case 62:
                {
                alt24=16;
                }
                break;
            case 63:
                {
                alt24=17;
                }
                break;
            case 64:
                {
                alt24=18;
                }
                break;
            case 41:
                {
                alt24=19;
                }
                break;
            case 42:
                {
                alt24=20;
                }
                break;
            case 47:
                {
                alt24=21;
                }
                break;
            case 46:
                {
                alt24=22;
                }
                break;
            case 43:
                {
                alt24=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalXContext.g:1148:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1154:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1160:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1166:3: kw= 'bool'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1172:3: kw= 'card'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1178:3: kw= 'dom'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:1184:3: kw= 'finite'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:1190:3: kw= 'id'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:1196:3: kw= 'inter'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:1202:3: kw= 'max'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:1208:3: kw= 'min'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:1214:3: kw= 'mod'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXContext.g:1220:3: kw= 'pred'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXContext.g:1226:3: kw= 'prj1'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXContext.g:1232:3: kw= 'prj2'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXContext.g:1238:3: kw= 'ran'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXContext.g:1244:3: kw= 'succ'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXContext.g:1250:3: kw= 'union'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXContext.g:1256:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXContext.g:1262:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXContext.g:1268:3: kw= '\\u21191'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXContext.g:1274:3: kw= '\\u2119'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXContext.g:1280:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22());
                    		

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
    // $ANTLR end "ruleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "entryRuleEVENTB_PREDICATE_SYMBOLS"
    // InternalXContext.g:1289:1: entryRuleEVENTB_PREDICATE_SYMBOLS returns [String current=null] : iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final String entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_PREDICATE_SYMBOLS = null;


        try {
            // InternalXContext.g:1289:64: (iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXContext.g:1290:2: iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF
            {
             newCompositeNode(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEVENTB_PREDICATE_SYMBOLS=ruleEVENTB_PREDICATE_SYMBOLS();

            state._fsp--;

             current =iv_ruleEVENTB_PREDICATE_SYMBOLS.getText(); 
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
    // $ANTLR end "entryRuleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "ruleEVENTB_PREDICATE_SYMBOLS"
    // InternalXContext.g:1296:1: ruleEVENTB_PREDICATE_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:1302:2: ( (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) )
            // InternalXContext.g:1303:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            {
            // InternalXContext.g:1303:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            int alt25=31;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt25=1;
                }
                break;
            case 45:
                {
                alt25=2;
                }
                break;
            case 65:
                {
                alt25=3;
                }
                break;
            case 66:
                {
                alt25=4;
                }
                break;
            case 67:
                {
                alt25=5;
                }
                break;
            case 68:
                {
                alt25=6;
                }
                break;
            case 69:
                {
                alt25=7;
                }
                break;
            case 70:
                {
                alt25=8;
                }
                break;
            case 71:
                {
                alt25=9;
                }
                break;
            case 72:
                {
                alt25=10;
                }
                break;
            case 73:
                {
                alt25=11;
                }
                break;
            case 74:
                {
                alt25=12;
                }
                break;
            case 75:
                {
                alt25=13;
                }
                break;
            case 76:
                {
                alt25=14;
                }
                break;
            case 77:
                {
                alt25=15;
                }
                break;
            case 78:
                {
                alt25=16;
                }
                break;
            case 21:
                {
                alt25=17;
                }
                break;
            case 23:
                {
                alt25=18;
                }
                break;
            case 79:
                {
                alt25=19;
                }
                break;
            case 80:
                {
                alt25=20;
                }
                break;
            case 81:
                {
                alt25=21;
                }
                break;
            case 82:
                {
                alt25=22;
                }
                break;
            case 83:
                {
                alt25=23;
                }
                break;
            case 84:
                {
                alt25=24;
                }
                break;
            case 22:
                {
                alt25=25;
                }
                break;
            case 85:
                {
                alt25=26;
                }
                break;
            case 86:
                {
                alt25=27;
                }
                break;
            case 87:
                {
                alt25=28;
                }
                break;
            case 88:
                {
                alt25=29;
                }
                break;
            case 89:
                {
                alt25=30;
                }
                break;
            case 90:
                {
                alt25=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalXContext.g:1304:3: kw= '('
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1310:3: kw= ')'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1316:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1322:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1328:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1334:3: kw= '&'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:1340:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:1346:3: kw= '\\u00AC'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:1352:3: kw= '\\u22A4'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:1358:3: kw= '\\u22A5'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:1364:3: kw= '\\u2200'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:1370:3: kw= '!'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXContext.g:1376:3: kw= '\\u2203'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXContext.g:1382:3: kw= '#'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXContext.g:1388:3: kw= ','
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXContext.g:1394:3: kw= '\\u00B7'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXContext.g:1400:3: kw= '.'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXContext.g:1406:3: kw= '='
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXContext.g:1412:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXContext.g:1418:3: kw= '\\u2264'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXContext.g:1424:3: kw= '<'
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXContext.g:1430:3: kw= '\\u2265'
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXContext.g:1436:3: kw= '>'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXContext.g:1442:3: kw= '\\u2208'
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXContext.g:1448:3: kw= ':'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXContext.g:1454:3: kw= '\\u2209'
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXContext.g:1460:3: kw= '\\u2282'
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXContext.g:1466:3: kw= '\\u2284'
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXContext.g:1472:3: kw= '\\u2286'
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXContext.g:1478:3: kw= '\\u2288'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXContext.g:1484:3: kw= 'partition'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30());
                    		

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
    // $ANTLR end "ruleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "entryRuleEVENTB_EXPRESSION_SYMBOLS"
    // InternalXContext.g:1493:1: entryRuleEVENTB_EXPRESSION_SYMBOLS returns [String current=null] : iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final String entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_EXPRESSION_SYMBOLS = null;


        try {
            // InternalXContext.g:1493:65: (iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXContext.g:1494:2: iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF
            {
             newCompositeNode(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEVENTB_EXPRESSION_SYMBOLS=ruleEVENTB_EXPRESSION_SYMBOLS();

            state._fsp--;

             current =iv_ruleEVENTB_EXPRESSION_SYMBOLS.getText(); 
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
    // $ANTLR end "entryRuleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "ruleEVENTB_EXPRESSION_SYMBOLS"
    // InternalXContext.g:1500:1: ruleEVENTB_EXPRESSION_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:1506:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) )
            // InternalXContext.g:1507:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            {
            // InternalXContext.g:1507:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            int alt26=45;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt26=1;
                }
                break;
            case 29:
                {
                alt26=2;
                }
                break;
            case 30:
                {
                alt26=3;
                }
                break;
            case 31:
                {
                alt26=4;
                }
                break;
            case 32:
                {
                alt26=5;
                }
                break;
            case 33:
                {
                alt26=6;
                }
                break;
            case 34:
                {
                alt26=7;
                }
                break;
            case 35:
                {
                alt26=8;
                }
                break;
            case 36:
                {
                alt26=9;
                }
                break;
            case 37:
                {
                alt26=10;
                }
                break;
            case 38:
                {
                alt26=11;
                }
                break;
            case 91:
                {
                alt26=12;
                }
                break;
            case 92:
                {
                alt26=13;
                }
                break;
            case 93:
                {
                alt26=14;
                }
                break;
            case 94:
                {
                alt26=15;
                }
                break;
            case 95:
                {
                alt26=16;
                }
                break;
            case 96:
                {
                alt26=17;
                }
                break;
            case 97:
                {
                alt26=18;
                }
                break;
            case 39:
                {
                alt26=19;
                }
                break;
            case 98:
                {
                alt26=20;
                }
                break;
            case 99:
                {
                alt26=21;
                }
                break;
            case 100:
                {
                alt26=22;
                }
                break;
            case 101:
                {
                alt26=23;
                }
                break;
            case 102:
                {
                alt26=24;
                }
                break;
            case 103:
                {
                alt26=25;
                }
                break;
            case 104:
                {
                alt26=26;
                }
                break;
            case 105:
                {
                alt26=27;
                }
                break;
            case 106:
                {
                alt26=28;
                }
                break;
            case 107:
                {
                alt26=29;
                }
                break;
            case 108:
                {
                alt26=30;
                }
                break;
            case 109:
                {
                alt26=31;
                }
                break;
            case 110:
                {
                alt26=32;
                }
                break;
            case 111:
                {
                alt26=33;
                }
                break;
            case 113:
                {
                alt26=34;
                }
                break;
            case 114:
                {
                alt26=35;
                }
                break;
            case 115:
                {
                alt26=36;
                }
                break;
            case 116:
                {
                alt26=37;
                }
                break;
            case 117:
                {
                alt26=38;
                }
                break;
            case 118:
                {
                alt26=39;
                }
                break;
            case 119:
                {
                alt26=40;
                }
                break;
            case 120:
                {
                alt26=41;
                }
                break;
            case 121:
                {
                alt26=42;
                }
                break;
            case 122:
                {
                alt26=43;
                }
                break;
            case 123:
                {
                alt26=44;
                }
                break;
            case 124:
                {
                alt26=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalXContext.g:1508:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1514:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1520:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1526:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1532:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1538:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:1544:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:1550:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:1556:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:1562:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:1568:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:1574:3: kw= '{'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXContext.g:1580:3: kw= '}'
                    {
                    kw=(Token)match(input,92,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXContext.g:1586:3: kw= '\\u21A6'
                    {
                    kw=(Token)match(input,93,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXContext.g:1592:3: kw= '\\u2205'
                    {
                    kw=(Token)match(input,94,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXContext.g:1598:3: kw= '\\u2229'
                    {
                    kw=(Token)match(input,95,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXContext.g:1604:3: kw= '\\u222A'
                    {
                    kw=(Token)match(input,96,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXContext.g:1610:3: kw= '\\u2216'
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXContext.g:1616:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXContext.g:1622:3: kw= '['
                    {
                    kw=(Token)match(input,98,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXContext.g:1628:3: kw= ']'
                    {
                    kw=(Token)match(input,99,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXContext.g:1634:3: kw= '\\uE103'
                    {
                    kw=(Token)match(input,100,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXContext.g:1640:3: kw= '\\u2218'
                    {
                    kw=(Token)match(input,101,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXContext.g:1646:3: kw= ';'
                    {
                    kw=(Token)match(input,102,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXContext.g:1652:3: kw= '\\u2297'
                    {
                    kw=(Token)match(input,103,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXContext.g:1658:3: kw= '\\u2225'
                    {
                    kw=(Token)match(input,104,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXContext.g:1664:3: kw= '\\u223C'
                    {
                    kw=(Token)match(input,105,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXContext.g:1670:3: kw= '\\u25C1'
                    {
                    kw=(Token)match(input,106,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXContext.g:1676:3: kw= '\\u2A64'
                    {
                    kw=(Token)match(input,107,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXContext.g:1682:3: kw= '\\u25B7'
                    {
                    kw=(Token)match(input,108,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXContext.g:1688:3: kw= '\\u2A65'
                    {
                    kw=(Token)match(input,109,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalXContext.g:1694:3: kw= '\\u03BB'
                    {
                    kw=(Token)match(input,110,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalXContext.g:1700:3: (kw= '%' kw= '\\u22C2' )
                    {
                    // InternalXContext.g:1700:3: (kw= '%' kw= '\\u22C2' )
                    // InternalXContext.g:1701:4: kw= '%' kw= '\\u22C2'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0());
                    			
                    kw=(Token)match(input,112,FollowSets000.FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalXContext.g:1713:3: kw= '\\u22C3'
                    {
                    kw=(Token)match(input,113,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalXContext.g:1719:3: kw= '\\u2223'
                    {
                    kw=(Token)match(input,114,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalXContext.g:1725:3: kw= '\\u2025'
                    {
                    kw=(Token)match(input,115,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalXContext.g:1731:3: kw= '+'
                    {
                    kw=(Token)match(input,116,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalXContext.g:1737:3: kw= '\\u2212'
                    {
                    kw=(Token)match(input,117,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalXContext.g:1743:3: kw= '-'
                    {
                    kw=(Token)match(input,118,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalXContext.g:1749:3: kw= '\\u2217'
                    {
                    kw=(Token)match(input,119,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalXContext.g:1755:3: kw= '*'
                    {
                    kw=(Token)match(input,120,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalXContext.g:1761:3: kw= '\\u00F7'
                    {
                    kw=(Token)match(input,121,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalXContext.g:1767:3: kw= '/'
                    {
                    kw=(Token)match(input,122,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalXContext.g:1773:3: kw= '^'
                    {
                    kw=(Token)match(input,123,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalXContext.g:1779:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,124,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44());
                    		

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
    // $ANTLR end "ruleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "entryRuleXRecord"
    // InternalXContext.g:1788:1: entryRuleXRecord returns [EObject current=null] : iv_ruleXRecord= ruleXRecord EOF ;
    public final EObject entryRuleXRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRecord = null;


        try {
            // InternalXContext.g:1788:48: (iv_ruleXRecord= ruleXRecord EOF )
            // InternalXContext.g:1789:2: iv_ruleXRecord= ruleXRecord EOF
            {
             newCompositeNode(grammarAccess.getXRecordRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXRecord=ruleXRecord();

            state._fsp--;

             current =iv_ruleXRecord; 
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
    // $ANTLR end "entryRuleXRecord"


    // $ANTLR start "ruleXRecord"
    // InternalXContext.g:1795:1: ruleXRecord returns [EObject current=null] : ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'record' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )? ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )* otherlv_10= 'end' ) ;
    public final EObject ruleXRecord() throws RecognitionException {
        EObject current = null;

        Token lv_extended_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_inheritsNames_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_fields_7_0 = null;

        EObject lv_constraints_9_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:1801:2: ( ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'record' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )? ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )* otherlv_10= 'end' ) )
            // InternalXContext.g:1802:2: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'record' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )? ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )* otherlv_10= 'end' )
            {
            // InternalXContext.g:1802:2: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'record' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )? ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )* otherlv_10= 'end' )
            // InternalXContext.g:1803:3: () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'record' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )? ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )* otherlv_10= 'end'
            {
            // InternalXContext.g:1803:3: ()
            // InternalXContext.g:1804:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXRecordAccess().getRecordAction_0(),
            					current);
            			

            }

            // InternalXContext.g:1810:3: ( (lv_extended_1_0= 'extended' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==125) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXContext.g:1811:4: (lv_extended_1_0= 'extended' )
                    {
                    // InternalXContext.g:1811:4: (lv_extended_1_0= 'extended' )
                    // InternalXContext.g:1812:5: lv_extended_1_0= 'extended'
                    {
                    lv_extended_1_0=(Token)match(input,125,FollowSets000.FOLLOW_23); 

                    					newLeafNode(lv_extended_1_0, grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXRecordRule());
                    					}
                    					setWithLastConsumed(current, "extended", lv_extended_1_0 != null, "extended");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,126,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXRecordAccess().getRecordKeyword_2());
            		
            // InternalXContext.g:1828:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXContext.g:1829:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXContext.g:1829:4: (lv_name_3_0= RULE_ID )
            // InternalXContext.g:1830:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xeventb.xcontext.XContext.ID");
            				

            }


            }

            // InternalXContext.g:1846:3: (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==127) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXContext.g:1847:4: otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,127,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getXRecordAccess().getInheritsKeyword_4_0());
                    			
                    // InternalXContext.g:1851:4: ( (lv_inheritsNames_5_0= RULE_ID ) )
                    // InternalXContext.g:1852:5: (lv_inheritsNames_5_0= RULE_ID )
                    {
                    // InternalXContext.g:1852:5: (lv_inheritsNames_5_0= RULE_ID )
                    // InternalXContext.g:1853:6: lv_inheritsNames_5_0= RULE_ID
                    {
                    lv_inheritsNames_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); 

                    						newLeafNode(lv_inheritsNames_5_0, grammarAccess.getXRecordAccess().getInheritsNamesIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXRecordRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"inheritsNames",
                    							lv_inheritsNames_5_0,
                    							"ac.soton.xeventb.xcontext.XContext.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXContext.g:1870:3: ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==128) ) {
                    alt29=1;
                }
                else if ( (LA29_0==129) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXContext.g:1871:4: (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) )
            	    {
            	    // InternalXContext.g:1871:4: (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) )
            	    // InternalXContext.g:1872:5: otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) )
            	    {
            	    otherlv_6=(Token)match(input,128,FollowSets000.FOLLOW_7); 

            	    					newLeafNode(otherlv_6, grammarAccess.getXRecordAccess().getFieldKeyword_5_0_0());
            	    				
            	    // InternalXContext.g:1876:5: ( (lv_fields_7_0= ruleField ) )
            	    // InternalXContext.g:1877:6: (lv_fields_7_0= ruleField )
            	    {
            	    // InternalXContext.g:1877:6: (lv_fields_7_0= ruleField )
            	    // InternalXContext.g:1878:7: lv_fields_7_0= ruleField
            	    {

            	    							newCompositeNode(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_5_0_1_0());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_fields_7_0=ruleField();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getXRecordRule());
            	    							}
            	    							add(
            	    								current,
            	    								"fields",
            	    								lv_fields_7_0,
            	    								"ac.soton.xeventb.xcontext.XContext.Field");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXContext.g:1897:4: (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) )
            	    {
            	    // InternalXContext.g:1897:4: (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) )
            	    // InternalXContext.g:1898:5: otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) )
            	    {
            	    otherlv_8=(Token)match(input,129,FollowSets000.FOLLOW_9); 

            	    					newLeafNode(otherlv_8, grammarAccess.getXRecordAccess().getConstraintKeyword_5_1_0());
            	    				
            	    // InternalXContext.g:1902:5: ( (lv_constraints_9_0= ruleXConstraint ) )
            	    // InternalXContext.g:1903:6: (lv_constraints_9_0= ruleXConstraint )
            	    {
            	    // InternalXContext.g:1903:6: (lv_constraints_9_0= ruleXConstraint )
            	    // InternalXContext.g:1904:7: lv_constraints_9_0= ruleXConstraint
            	    {

            	    							newCompositeNode(grammarAccess.getXRecordAccess().getConstraintsXConstraintParserRuleCall_5_1_1_0());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_constraints_9_0=ruleXConstraint();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getXRecordRule());
            	    							}
            	    							add(
            	    								current,
            	    								"constraints",
            	    								lv_constraints_9_0,
            	    								"ac.soton.xeventb.xcontext.XContext.XConstraint");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getXRecordAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleXRecord"


    // $ANTLR start "entryRuleFieldType"
    // InternalXContext.g:1931:1: entryRuleFieldType returns [String current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final String entryRuleFieldType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldType = null;


        try {
            // InternalXContext.g:1931:49: (iv_ruleFieldType= ruleFieldType EOF )
            // InternalXContext.g:1932:2: iv_ruleFieldType= ruleFieldType EOF
            {
             newCompositeNode(grammarAccess.getFieldTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;

             current =iv_ruleFieldType.getText(); 
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
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalXContext.g:1938:1: ruleFieldType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleFieldType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalXContext.g:1944:2: ( (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD ) )
            // InternalXContext.g:1945:2: (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD )
            {
            // InternalXContext.g:1945:2: (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=40 && LA30_0<=43)||(LA30_0>=46 && LA30_0<=64)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalXContext.g:1946:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1954:3: this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EVENTB_IDENTIFIER_KEYWORD_1=ruleEVENTB_IDENTIFIER_KEYWORD();

                    state._fsp--;


                    			current.merge(this_EVENTB_IDENTIFIER_KEYWORD_1);
                    		

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
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleField"
    // InternalXContext.g:1968:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalXContext.g:1968:46: (iv_ruleField= ruleField EOF )
            // InternalXContext.g:1969:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalXContext.g:1975:1: ruleField returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_multiplicity_4_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:1981:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) ) )
            // InternalXContext.g:1982:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) )
            {
            // InternalXContext.g:1982:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) )
            // InternalXContext.g:1983:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) )
            {
            // InternalXContext.g:1983:3: ()
            // InternalXContext.g:1984:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            // InternalXContext.g:1990:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXContext.g:1991:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:1991:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:1992:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_4); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getFieldAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xcontext.XContext.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXContext.g:2008:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:2009:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:2009:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:2010:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xcontext.XContext.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getColonKeyword_3());
            		
            // InternalXContext.g:2030:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=130 && LA32_0<=132)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXContext.g:2031:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalXContext.g:2031:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalXContext.g:2032:5: lv_multiplicity_4_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_4_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_multiplicity_4_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_4_0,
                    						"ac.soton.xeventb.xcontext.XContext.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalXContext.g:2049:3: ( (lv_type_5_0= ruleFieldType ) )
            // InternalXContext.g:2050:4: (lv_type_5_0= ruleFieldType )
            {
            // InternalXContext.g:2050:4: (lv_type_5_0= ruleFieldType )
            // InternalXContext.g:2051:5: lv_type_5_0= ruleFieldType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_5_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_type_5_0=ruleFieldType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"ac.soton.xeventb.xcontext.XContext.FieldType");
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleXConstraint"
    // InternalXContext.g:2072:1: entryRuleXConstraint returns [EObject current=null] : iv_ruleXConstraint= ruleXConstraint EOF ;
    public final EObject entryRuleXConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstraint = null;


        try {
            // InternalXContext.g:2072:52: (iv_ruleXConstraint= ruleXConstraint EOF )
            // InternalXContext.g:2073:2: iv_ruleXConstraint= ruleXConstraint EOF
            {
             newCompositeNode(grammarAccess.getXConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXConstraint=ruleXConstraint();

            state._fsp--;

             current =iv_ruleXConstraint; 
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
    // $ANTLR end "entryRuleXConstraint"


    // $ANTLR start "ruleXConstraint"
    // InternalXContext.g:2079:1: ruleXConstraint returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:2085:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXContext.g:2086:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXContext.g:2086:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXContext.g:2087:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXContext.g:2087:3: ()
            // InternalXContext.g:2088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            // InternalXContext.g:2094:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXContext.g:2095:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:2095:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:2096:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_17); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXConstraintAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xcontext.XContext.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXContext.g:2112:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXContext.g:2113:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXContext.g:2113:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXContext.g:2114:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXConstraintAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xcontext.XContext.XLABEL");
            				

            }


            }

            // InternalXContext.g:2130:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXContext.g:2131:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXContext.g:2131:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXContext.g:2132:5: lv_predicate_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXConstraintAccess().getPredicateXFormulaParserRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_predicate_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXConstraintRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"ac.soton.xeventb.xcontext.XContext.XFormula");
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
    // $ANTLR end "ruleXConstraint"


    // $ANTLR start "ruleMultiplicity"
    // InternalXContext.g:2153:1: ruleMultiplicity returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXContext.g:2159:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) )
            // InternalXContext.g:2160:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            {
            // InternalXContext.g:2160:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt34=1;
                }
                break;
            case 131:
                {
                alt34=2;
                }
                break;
            case 132:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalXContext.g:2161:3: (enumLiteral_0= 'one' )
                    {
                    // InternalXContext.g:2161:3: (enumLiteral_0= 'one' )
                    // InternalXContext.g:2162:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,130,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:2169:3: (enumLiteral_1= 'many' )
                    {
                    // InternalXContext.g:2169:3: (enumLiteral_1= 'many' )
                    // InternalXContext.g:2170:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,131,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:2177:3: (enumLiteral_2= 'opt' )
                    {
                    // InternalXContext.g:2177:3: (enumLiteral_2= 'opt' )
                    // InternalXContext.g:2178:4: enumLiteral_2= 'opt'
                    {
                    enumLiteral_2=(Token)match(input,132,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMultiplicity"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000F1FC010L,0x6000000000000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000F1F8030L,0x6000000000000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000F1F8010L,0x6000000000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000F1F8050L,0x6000000000000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000DF0000000020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFFFFFFFFF0E001A0L,0x1FFEFFFFFFFFFFFFL});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000F000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xFFFFFFFFF0E001A2L,0x1FFEFFFFFFFFFFFFL});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000FFF0000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L,0x8000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xFFFFCF0000000020L,0x0000000000000001L,0x000000000000001CL});
    }


}