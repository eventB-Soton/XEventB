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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_UNTRANSLATED_TOKEN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'extends'", "'sets'", "'constants'", "'constant'", "'end'", "'.'", "':'", "'='", "'theorem'", "'axiom'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'\\u00D7'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'('", "')'", "'\\u2119'", "'\\u21191'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'%'", "'\\u22C2'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'record'", "'inherits'", "'one'", "'many'", "'opt'"
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__65=65;
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
    // InternalXContext.g:72:1: ruleXContext returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | (otherlv_10= 'constant' ( (lv_orderedChildren_11_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_12_0= ruleXRecord ) ) | ( (lv_orderedChildren_13_0= ruleXSingleAxiom ) ) )* otherlv_14= 'end' ) ;
    public final EObject ruleXContext() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        EObject lv_orderedChildren_7_0 = null;

        EObject lv_orderedChildren_9_0 = null;

        EObject lv_orderedChildren_11_0 = null;

        EObject lv_orderedChildren_12_0 = null;

        EObject lv_orderedChildren_13_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:78:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | (otherlv_10= 'constant' ( (lv_orderedChildren_11_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_12_0= ruleXRecord ) ) | ( (lv_orderedChildren_13_0= ruleXSingleAxiom ) ) )* otherlv_14= 'end' ) )
            // InternalXContext.g:79:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | (otherlv_10= 'constant' ( (lv_orderedChildren_11_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_12_0= ruleXRecord ) ) | ( (lv_orderedChildren_13_0= ruleXSingleAxiom ) ) )* otherlv_14= 'end' )
            {
            // InternalXContext.g:79:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | (otherlv_10= 'constant' ( (lv_orderedChildren_11_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_12_0= ruleXRecord ) ) | ( (lv_orderedChildren_13_0= ruleXSingleAxiom ) ) )* otherlv_14= 'end' )
            // InternalXContext.g:80:3: () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )? ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | (otherlv_10= 'constant' ( (lv_orderedChildren_11_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_12_0= ruleXRecord ) ) | ( (lv_orderedChildren_13_0= ruleXSingleAxiom ) ) )* otherlv_14= 'end'
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
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXContextAccess().getContextKeyword_2());
            		
            // InternalXContext.g:109:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXContext.g:110:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXContext.g:110:4: (lv_name_3_0= RULE_ID )
            // InternalXContext.g:111:5: lv_name_3_0= RULE_ID
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
                    otherlv_4=(Token)match(input,14,FOLLOW_4); 

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
                    	    					
                    	    pushFollow(FOLLOW_6);
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

            // InternalXContext.g:149:3: ( (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ ) | (otherlv_8= 'constants' ( (lv_orderedChildren_9_0= ruleXConstant ) )+ ) | (otherlv_10= 'constant' ( (lv_orderedChildren_11_0= ruleXTypedConstant ) ) ) | ( (lv_orderedChildren_12_0= ruleXRecord ) ) | ( (lv_orderedChildren_13_0= ruleXSingleAxiom ) ) )*
            loop6:
            do {
                int alt6=6;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt6=1;
                    }
                    break;
                case 16:
                    {
                    alt6=2;
                    }
                    break;
                case 17:
                    {
                    alt6=3;
                    }
                    break;
                case 121:
                    {
                    alt6=4;
                    }
                    break;
                case RULE_STRING:
                case 22:
                case 23:
                    {
                    alt6=5;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalXContext.g:150:4: (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ )
            	    {
            	    // InternalXContext.g:150:4: (otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+ )
            	    // InternalXContext.g:151:5: otherlv_6= 'sets' ( (lv_orderedChildren_7_0= ruleXCarrierSet ) )+
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

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
            	    	    						
            	    	    pushFollow(FOLLOW_6);
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
            	    otherlv_8=(Token)match(input,16,FOLLOW_7); 

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
            	    	    						
            	    	    pushFollow(FOLLOW_6);
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
            	    // InternalXContext.g:202:4: (otherlv_10= 'constant' ( (lv_orderedChildren_11_0= ruleXTypedConstant ) ) )
            	    {
            	    // InternalXContext.g:202:4: (otherlv_10= 'constant' ( (lv_orderedChildren_11_0= ruleXTypedConstant ) ) )
            	    // InternalXContext.g:203:5: otherlv_10= 'constant' ( (lv_orderedChildren_11_0= ruleXTypedConstant ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_7); 

            	    					newLeafNode(otherlv_10, grammarAccess.getXContextAccess().getConstantKeyword_5_2_0());
            	    				
            	    // InternalXContext.g:207:5: ( (lv_orderedChildren_11_0= ruleXTypedConstant ) )
            	    // InternalXContext.g:208:6: (lv_orderedChildren_11_0= ruleXTypedConstant )
            	    {
            	    // InternalXContext.g:208:6: (lv_orderedChildren_11_0= ruleXTypedConstant )
            	    // InternalXContext.g:209:7: lv_orderedChildren_11_0= ruleXTypedConstant
            	    {

            	    							newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXTypedConstantParserRuleCall_5_2_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_orderedChildren_11_0=ruleXTypedConstant();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getXContextRule());
            	    							}
            	    							add(
            	    								current,
            	    								"orderedChildren",
            	    								lv_orderedChildren_11_0,
            	    								"ac.soton.xeventb.xcontext.XContext.XTypedConstant");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXContext.g:228:4: ( (lv_orderedChildren_12_0= ruleXRecord ) )
            	    {
            	    // InternalXContext.g:228:4: ( (lv_orderedChildren_12_0= ruleXRecord ) )
            	    // InternalXContext.g:229:5: (lv_orderedChildren_12_0= ruleXRecord )
            	    {
            	    // InternalXContext.g:229:5: (lv_orderedChildren_12_0= ruleXRecord )
            	    // InternalXContext.g:230:6: lv_orderedChildren_12_0= ruleXRecord
            	    {

            	    						newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXRecordParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_orderedChildren_12_0=ruleXRecord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_12_0,
            	    							"ac.soton.xeventb.xcontext.XContext.XRecord");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXContext.g:248:4: ( (lv_orderedChildren_13_0= ruleXSingleAxiom ) )
            	    {
            	    // InternalXContext.g:248:4: ( (lv_orderedChildren_13_0= ruleXSingleAxiom ) )
            	    // InternalXContext.g:249:5: (lv_orderedChildren_13_0= ruleXSingleAxiom )
            	    {
            	    // InternalXContext.g:249:5: (lv_orderedChildren_13_0= ruleXSingleAxiom )
            	    // InternalXContext.g:250:6: lv_orderedChildren_13_0= ruleXSingleAxiom
            	    {

            	    						newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXSingleAxiomParserRuleCall_5_4_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_orderedChildren_13_0=ruleXSingleAxiom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_13_0,
            	    							"ac.soton.xeventb.xcontext.XContext.XSingleAxiom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getXContextAccess().getEndKeyword_6());
            		

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
    // InternalXContext.g:276:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXContext.g:276:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXContext.g:277:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXContext.g:283:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXContext.g:289:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXContext.g:290:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXContext.g:290:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXContext.g:291:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXContext.g:298:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXContext.g:299:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalXContext.g:316:1: entryRuleXCarrierSet returns [EObject current=null] : iv_ruleXCarrierSet= ruleXCarrierSet EOF ;
    public final EObject entryRuleXCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCarrierSet = null;


        try {
            // InternalXContext.g:316:52: (iv_ruleXCarrierSet= ruleXCarrierSet EOF )
            // InternalXContext.g:317:2: iv_ruleXCarrierSet= ruleXCarrierSet EOF
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
    // InternalXContext.g:323:1: ruleXCarrierSet returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXCarrierSet() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXContext.g:329:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXContext.g:330:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXContext.g:330:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXContext.g:331:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXContext.g:331:3: ()
            // InternalXContext.g:332:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0(),
            					current);
            			

            }

            // InternalXContext.g:338:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXContext.g:339:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:339:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:340:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

            // InternalXContext.g:356:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:357:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:357:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:358:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalXContext.g:378:1: entryRuleXConstant returns [EObject current=null] : iv_ruleXConstant= ruleXConstant EOF ;
    public final EObject entryRuleXConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstant = null;


        try {
            // InternalXContext.g:378:50: (iv_ruleXConstant= ruleXConstant EOF )
            // InternalXContext.g:379:2: iv_ruleXConstant= ruleXConstant EOF
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
    // InternalXContext.g:385:1: ruleXConstant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXConstant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXContext.g:391:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXContext.g:392:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXContext.g:392:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXContext.g:393:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXContext.g:393:3: ()
            // InternalXContext.g:394:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstantAccess().getConstantAction_0(),
            					current);
            			

            }

            // InternalXContext.g:400:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXContext.g:401:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:401:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:402:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

            // InternalXContext.g:418:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:419:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:419:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:420:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalXContext.g:440:1: entryRuleXTypedConstant returns [EObject current=null] : iv_ruleXTypedConstant= ruleXTypedConstant EOF ;
    public final EObject entryRuleXTypedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypedConstant = null;


        try {
            // InternalXContext.g:440:55: (iv_ruleXTypedConstant= ruleXTypedConstant EOF )
            // InternalXContext.g:441:2: iv_ruleXTypedConstant= ruleXTypedConstant EOF
            {
             newCompositeNode(grammarAccess.getXTypedConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXTypedConstant=ruleXTypedConstant();

            state._fsp--;

             current =iv_ruleXTypedConstant; 
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
    // $ANTLR end "entryRuleXTypedConstant"


    // $ANTLR start "ruleXTypedConstant"
    // InternalXContext.g:447:1: ruleXTypedConstant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )? ) ;
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
            // InternalXContext.g:453:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )? ) )
            // InternalXContext.g:454:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )? )
            {
            // InternalXContext.g:454:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )? )
            // InternalXContext.g:455:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )? (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )?
            {
            // InternalXContext.g:455:3: ()
            // InternalXContext.g:456:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXTypedConstantAccess().getTypedConstantAction_0(),
            					current);
            			

            }

            // InternalXContext.g:462:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXContext.g:463:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:463:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:464:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

            // InternalXContext.g:480:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:481:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:481:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:482:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalXContext.g:498:3: (otherlv_3= ':' ( (lv_type_4_0= ruleXType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXContext.g:499:4: otherlv_3= ':' ( (lv_type_4_0= ruleXType ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getXTypedConstantAccess().getColonKeyword_3_0());
                    			
                    // InternalXContext.g:503:4: ( (lv_type_4_0= ruleXType ) )
                    // InternalXContext.g:504:5: (lv_type_4_0= ruleXType )
                    {
                    // InternalXContext.g:504:5: (lv_type_4_0= ruleXType )
                    // InternalXContext.g:505:6: lv_type_4_0= ruleXType
                    {

                    						newCompositeNode(grammarAccess.getXTypedConstantAccess().getTypeXTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

            // InternalXContext.g:523:3: (otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXContext.g:524:4: otherlv_5= '=' ( (lv_value_6_0= ruleXFormula ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getXTypedConstantAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalXContext.g:528:4: ( (lv_value_6_0= ruleXFormula ) )
                    // InternalXContext.g:529:5: (lv_value_6_0= ruleXFormula )
                    {
                    // InternalXContext.g:529:5: (lv_value_6_0= ruleXFormula )
                    // InternalXContext.g:530:6: lv_value_6_0= ruleXFormula
                    {

                    						newCompositeNode(grammarAccess.getXTypedConstantAccess().getValueXFormulaParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleXSingleAxiom"
    // InternalXContext.g:552:1: entryRuleXSingleAxiom returns [EObject current=null] : iv_ruleXSingleAxiom= ruleXSingleAxiom EOF ;
    public final EObject entryRuleXSingleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSingleAxiom = null;


        try {
            // InternalXContext.g:552:53: (iv_ruleXSingleAxiom= ruleXSingleAxiom EOF )
            // InternalXContext.g:553:2: iv_ruleXSingleAxiom= ruleXSingleAxiom EOF
            {
             newCompositeNode(grammarAccess.getXSingleAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXSingleAxiom=ruleXSingleAxiom();

            state._fsp--;

             current =iv_ruleXSingleAxiom; 
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
    // $ANTLR end "entryRuleXSingleAxiom"


    // $ANTLR start "ruleXSingleAxiom"
    // InternalXContext.g:559:1: ruleXSingleAxiom returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'axiom' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) ) ;
    public final EObject ruleXSingleAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_theorem_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        AntlrDatatypeRuleToken lv_predicate_5_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:565:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'axiom' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) ) )
            // InternalXContext.g:566:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'axiom' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) )
            {
            // InternalXContext.g:566:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'axiom' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) )
            // InternalXContext.g:567:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'axiom' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) )
            {
            // InternalXContext.g:567:3: ()
            // InternalXContext.g:568:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXSingleAxiomAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalXContext.g:574:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXContext.g:575:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:575:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:576:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXSingleAxiomAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXSingleAxiomRule());
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

            // InternalXContext.g:592:3: ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'axiom' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            else if ( (LA14_0==23) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXContext.g:593:4: ( (lv_theorem_2_0= 'theorem' ) )
                    {
                    // InternalXContext.g:593:4: ( (lv_theorem_2_0= 'theorem' ) )
                    // InternalXContext.g:594:5: (lv_theorem_2_0= 'theorem' )
                    {
                    // InternalXContext.g:594:5: (lv_theorem_2_0= 'theorem' )
                    // InternalXContext.g:595:6: lv_theorem_2_0= 'theorem'
                    {
                    lv_theorem_2_0=(Token)match(input,22,FOLLOW_15); 

                    						newLeafNode(lv_theorem_2_0, grammarAccess.getXSingleAxiomAccess().getTheoremTheoremKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXSingleAxiomRule());
                    						}
                    						setWithLastConsumed(current, "theorem", lv_theorem_2_0 != null, "theorem");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:608:4: otherlv_3= 'axiom'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getXSingleAxiomAccess().getAxiomKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalXContext.g:613:3: ( (lv_name_4_0= RULE_XLABEL ) )
            // InternalXContext.g:614:4: (lv_name_4_0= RULE_XLABEL )
            {
            // InternalXContext.g:614:4: (lv_name_4_0= RULE_XLABEL )
            // InternalXContext.g:615:5: lv_name_4_0= RULE_XLABEL
            {
            lv_name_4_0=(Token)match(input,RULE_XLABEL,FOLLOW_13); 

            					newLeafNode(lv_name_4_0, grammarAccess.getXSingleAxiomAccess().getNameXLABELTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXSingleAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"ac.soton.xeventb.xcontext.XContext.XLABEL");
            				

            }


            }

            // InternalXContext.g:631:3: ( (lv_predicate_5_0= ruleXFormula ) )
            // InternalXContext.g:632:4: (lv_predicate_5_0= ruleXFormula )
            {
            // InternalXContext.g:632:4: (lv_predicate_5_0= ruleXFormula )
            // InternalXContext.g:633:5: lv_predicate_5_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXSingleAxiomAccess().getPredicateXFormulaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_5_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXSingleAxiomRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_5_0,
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
    // $ANTLR end "ruleXSingleAxiom"


    // $ANTLR start "entryRuleXFormula"
    // InternalXContext.g:654:1: entryRuleXFormula returns [String current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final String entryRuleXFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXFormula = null;


        try {
            // InternalXContext.g:654:48: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalXContext.g:655:2: iv_ruleXFormula= ruleXFormula EOF
            {
             newCompositeNode(grammarAccess.getXFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXFormula=ruleXFormula();

            state._fsp--;

             current =iv_ruleXFormula.getText(); 
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
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalXContext.g:661:1: ruleXFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+ ;
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
            // InternalXContext.g:667:2: ( (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+ )
            // InternalXContext.g:668:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+
            {
            // InternalXContext.g:668:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+
            int cnt15=0;
            loop15:
            do {
                int alt15=7;
                switch ( input.LA(1) ) {
                case 36:
                case 37:
                case 38:
                case 39:
                case 42:
                case 43:
                case 44:
                case 45:
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
                    {
                    alt15=1;
                    }
                    break;
                case 19:
                case 20:
                case 21:
                case 40:
                case 41:
                case 61:
                case 62:
                case 63:
                case 64:
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
                    {
                    alt15=2;
                    }
                    break;
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 87:
                case 88:
                case 89:
                case 90:
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
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                    {
                    alt15=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt15=4;
                    }
                    break;
                case RULE_INT:
                    {
                    alt15=5;
                    }
                    break;
                case RULE_UNTRANSLATED_TOKEN:
                    {
                    alt15=6;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalXContext.g:669:3: this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_16);
            	    this_EVENTB_IDENTIFIER_KEYWORD_0=ruleEVENTB_IDENTIFIER_KEYWORD();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_IDENTIFIER_KEYWORD_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalXContext.g:680:3: this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1());
            	    		
            	    pushFollow(FOLLOW_16);
            	    this_EVENTB_PREDICATE_SYMBOLS_1=ruleEVENTB_PREDICATE_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_PREDICATE_SYMBOLS_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalXContext.g:691:3: this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_16);
            	    this_EVENTB_EXPRESSION_SYMBOLS_2=ruleEVENTB_EXPRESSION_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_EXPRESSION_SYMBOLS_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalXContext.g:702:3: this_ID_3= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    			current.merge(this_ID_3);
            	    		

            	    			newLeafNode(this_ID_3, grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalXContext.g:710:3: this_INT_4= RULE_INT
            	    {
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_16); 

            	    			current.merge(this_INT_4);
            	    		

            	    			newLeafNode(this_INT_4, grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalXContext.g:718:3: this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN
            	    {
            	    this_UNTRANSLATED_TOKEN_5=(Token)match(input,RULE_UNTRANSLATED_TOKEN,FOLLOW_16); 

            	    			current.merge(this_UNTRANSLATED_TOKEN_5);
            	    		

            	    			newLeafNode(this_UNTRANSLATED_TOKEN_5, grammarAccess.getXFormulaAccess().getUNTRANSLATED_TOKENTerminalRuleCall_5());
            	    		

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
    // InternalXContext.g:729:1: entryRuleXType returns [String current=null] : iv_ruleXType= ruleXType EOF ;
    public final String entryRuleXType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXType = null;


        try {
            // InternalXContext.g:729:45: (iv_ruleXType= ruleXType EOF )
            // InternalXContext.g:730:2: iv_ruleXType= ruleXType EOF
            {
             newCompositeNode(grammarAccess.getXTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXType=ruleXType();

            state._fsp--;

             current =iv_ruleXType.getText(); 
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
    // $ANTLR end "entryRuleXType"


    // $ANTLR start "ruleXType"
    // InternalXContext.g:736:1: ruleXType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* ) ;
    public final AntlrDatatypeRuleToken ruleXType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_XTypePrimitive_0 = null;

        AntlrDatatypeRuleToken this_XTYPEOPERATOR_1 = null;

        AntlrDatatypeRuleToken this_XTypePrimitive_2 = null;



        	enterRule();

        try {
            // InternalXContext.g:742:2: ( (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* ) )
            // InternalXContext.g:743:2: (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* )
            {
            // InternalXContext.g:743:2: (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* )
            // InternalXContext.g:744:3: this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )*
            {

            			newCompositeNode(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_XTypePrimitive_0=ruleXTypePrimitive();

            state._fsp--;


            			current.merge(this_XTypePrimitive_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXContext.g:754:3: (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=24 && LA16_0<=35)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXContext.g:755:4: this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive
            	    {

            	    				newCompositeNode(grammarAccess.getXTypeAccess().getXTYPEOPERATORParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_11);
            	    this_XTYPEOPERATOR_1=ruleXTYPEOPERATOR();

            	    state._fsp--;


            	    				current.merge(this_XTYPEOPERATOR_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_17);
            	    this_XTypePrimitive_2=ruleXTypePrimitive();

            	    state._fsp--;


            	    				current.merge(this_XTypePrimitive_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalXContext.g:780:1: entryRuleXTYPEOPERATOR returns [String current=null] : iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF ;
    public final String entryRuleXTYPEOPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXTYPEOPERATOR = null;


        try {
            // InternalXContext.g:780:53: (iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF )
            // InternalXContext.g:781:2: iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF
            {
             newCompositeNode(grammarAccess.getXTYPEOPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXTYPEOPERATOR=ruleXTYPEOPERATOR();

            state._fsp--;

             current =iv_ruleXTYPEOPERATOR.getText(); 
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
    // $ANTLR end "entryRuleXTYPEOPERATOR"


    // $ANTLR start "ruleXTYPEOPERATOR"
    // InternalXContext.g:787:1: ruleXTYPEOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' ) ;
    public final AntlrDatatypeRuleToken ruleXTYPEOPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:793:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' ) )
            // InternalXContext.g:794:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' )
            {
            // InternalXContext.g:794:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' )
            int alt17=12;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt17=1;
                }
                break;
            case 25:
                {
                alt17=2;
                }
                break;
            case 26:
                {
                alt17=3;
                }
                break;
            case 27:
                {
                alt17=4;
                }
                break;
            case 28:
                {
                alt17=5;
                }
                break;
            case 29:
                {
                alt17=6;
                }
                break;
            case 30:
                {
                alt17=7;
                }
                break;
            case 31:
                {
                alt17=8;
                }
                break;
            case 32:
                {
                alt17=9;
                }
                break;
            case 33:
                {
                alt17=10;
                }
                break;
            case 34:
                {
                alt17=11;
                }
                break;
            case 35:
                {
                alt17=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalXContext.g:795:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:801:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:807:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:813:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:819:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:825:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:831:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:837:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:843:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:849:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:855:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:861:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

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
    // InternalXContext.g:870:1: entryRuleXTypePrimitive returns [String current=null] : iv_ruleXTypePrimitive= ruleXTypePrimitive EOF ;
    public final String entryRuleXTypePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXTypePrimitive = null;


        try {
            // InternalXContext.g:870:54: (iv_ruleXTypePrimitive= ruleXTypePrimitive EOF )
            // InternalXContext.g:871:2: iv_ruleXTypePrimitive= ruleXTypePrimitive EOF
            {
             newCompositeNode(grammarAccess.getXTypePrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXTypePrimitive=ruleXTypePrimitive();

            state._fsp--;

             current =iv_ruleXTypePrimitive.getText(); 
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
    // $ANTLR end "entryRuleXTypePrimitive"


    // $ANTLR start "ruleXTypePrimitive"
    // InternalXContext.g:877:1: ruleXTypePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleXTypePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_XType_6 = null;

        AntlrDatatypeRuleToken this_XType_10 = null;

        AntlrDatatypeRuleToken this_XType_14 = null;



        	enterRule();

        try {
            // InternalXContext.g:883:2: ( (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) ) )
            // InternalXContext.g:884:2: (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) )
            {
            // InternalXContext.g:884:2: (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) )
            int alt18=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
                {
                alt18=3;
                }
                break;
            case 38:
                {
                alt18=4;
                }
                break;
            case 39:
                {
                alt18=5;
                }
                break;
            case 40:
                {
                alt18=6;
                }
                break;
            case 42:
                {
                alt18=7;
                }
                break;
            case 43:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalXContext.g:885:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:893:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:899:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:905:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:911:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:917:3: (kw= '(' this_XType_6= ruleXType kw= ')' )
                    {
                    // InternalXContext.g:917:3: (kw= '(' this_XType_6= ruleXType kw= ')' )
                    // InternalXContext.g:918:4: kw= '(' this_XType_6= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,40,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_XType_6=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,41,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:940:3: (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' )
                    {
                    // InternalXContext.g:940:3: (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' )
                    // InternalXContext.g:941:4: kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,42,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0());
                    			
                    kw=(Token)match(input,40,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_6_2());
                    			
                    pushFollow(FOLLOW_18);
                    this_XType_10=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_10);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,41,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:968:3: (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' )
                    {
                    // InternalXContext.g:968:3: (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' )
                    // InternalXContext.g:969:4: kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,43,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0());
                    			
                    kw=(Token)match(input,40,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_7_2());
                    			
                    pushFollow(FOLLOW_18);
                    this_XType_14=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_14);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalXContext.g:999:1: entryRuleEVENTB_IDENTIFIER_KEYWORD returns [String current=null] : iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final String entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_IDENTIFIER_KEYWORD = null;


        try {
            // InternalXContext.g:999:65: (iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXContext.g:1000:2: iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF
            {
             newCompositeNode(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVENTB_IDENTIFIER_KEYWORD=ruleEVENTB_IDENTIFIER_KEYWORD();

            state._fsp--;

             current =iv_ruleEVENTB_IDENTIFIER_KEYWORD.getText(); 
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
    // $ANTLR end "entryRuleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "ruleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXContext.g:1006:1: ruleEVENTB_IDENTIFIER_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:1012:2: ( (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) )
            // InternalXContext.g:1013:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            {
            // InternalXContext.g:1013:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            int alt19=23;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt19=1;
                }
                break;
            case 44:
                {
                alt19=2;
                }
                break;
            case 45:
                {
                alt19=3;
                }
                break;
            case 46:
                {
                alt19=4;
                }
                break;
            case 47:
                {
                alt19=5;
                }
                break;
            case 48:
                {
                alt19=6;
                }
                break;
            case 49:
                {
                alt19=7;
                }
                break;
            case 50:
                {
                alt19=8;
                }
                break;
            case 51:
                {
                alt19=9;
                }
                break;
            case 52:
                {
                alt19=10;
                }
                break;
            case 53:
                {
                alt19=11;
                }
                break;
            case 54:
                {
                alt19=12;
                }
                break;
            case 55:
                {
                alt19=13;
                }
                break;
            case 56:
                {
                alt19=14;
                }
                break;
            case 57:
                {
                alt19=15;
                }
                break;
            case 58:
                {
                alt19=16;
                }
                break;
            case 59:
                {
                alt19=17;
                }
                break;
            case 60:
                {
                alt19=18;
                }
                break;
            case 37:
                {
                alt19=19;
                }
                break;
            case 38:
                {
                alt19=20;
                }
                break;
            case 43:
                {
                alt19=21;
                }
                break;
            case 42:
                {
                alt19=22;
                }
                break;
            case 39:
                {
                alt19=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalXContext.g:1014:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1020:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1026:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1032:3: kw= 'bool'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1038:3: kw= 'card'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1044:3: kw= 'dom'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:1050:3: kw= 'finite'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:1056:3: kw= 'id'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:1062:3: kw= 'inter'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:1068:3: kw= 'max'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:1074:3: kw= 'min'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:1080:3: kw= 'mod'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXContext.g:1086:3: kw= 'pred'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXContext.g:1092:3: kw= 'prj1'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXContext.g:1098:3: kw= 'prj2'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXContext.g:1104:3: kw= 'ran'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXContext.g:1110:3: kw= 'succ'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXContext.g:1116:3: kw= 'union'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXContext.g:1122:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXContext.g:1128:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXContext.g:1134:3: kw= '\\u21191'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXContext.g:1140:3: kw= '\\u2119'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXContext.g:1146:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalXContext.g:1155:1: entryRuleEVENTB_PREDICATE_SYMBOLS returns [String current=null] : iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final String entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_PREDICATE_SYMBOLS = null;


        try {
            // InternalXContext.g:1155:64: (iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXContext.g:1156:2: iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF
            {
             newCompositeNode(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVENTB_PREDICATE_SYMBOLS=ruleEVENTB_PREDICATE_SYMBOLS();

            state._fsp--;

             current =iv_ruleEVENTB_PREDICATE_SYMBOLS.getText(); 
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
    // $ANTLR end "entryRuleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "ruleEVENTB_PREDICATE_SYMBOLS"
    // InternalXContext.g:1162:1: ruleEVENTB_PREDICATE_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:1168:2: ( (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) )
            // InternalXContext.g:1169:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            {
            // InternalXContext.g:1169:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            int alt20=31;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt20=1;
                }
                break;
            case 41:
                {
                alt20=2;
                }
                break;
            case 61:
                {
                alt20=3;
                }
                break;
            case 62:
                {
                alt20=4;
                }
                break;
            case 63:
                {
                alt20=5;
                }
                break;
            case 64:
                {
                alt20=6;
                }
                break;
            case 65:
                {
                alt20=7;
                }
                break;
            case 66:
                {
                alt20=8;
                }
                break;
            case 67:
                {
                alt20=9;
                }
                break;
            case 68:
                {
                alt20=10;
                }
                break;
            case 69:
                {
                alt20=11;
                }
                break;
            case 70:
                {
                alt20=12;
                }
                break;
            case 71:
                {
                alt20=13;
                }
                break;
            case 72:
                {
                alt20=14;
                }
                break;
            case 73:
                {
                alt20=15;
                }
                break;
            case 74:
                {
                alt20=16;
                }
                break;
            case 19:
                {
                alt20=17;
                }
                break;
            case 21:
                {
                alt20=18;
                }
                break;
            case 75:
                {
                alt20=19;
                }
                break;
            case 76:
                {
                alt20=20;
                }
                break;
            case 77:
                {
                alt20=21;
                }
                break;
            case 78:
                {
                alt20=22;
                }
                break;
            case 79:
                {
                alt20=23;
                }
                break;
            case 80:
                {
                alt20=24;
                }
                break;
            case 20:
                {
                alt20=25;
                }
                break;
            case 81:
                {
                alt20=26;
                }
                break;
            case 82:
                {
                alt20=27;
                }
                break;
            case 83:
                {
                alt20=28;
                }
                break;
            case 84:
                {
                alt20=29;
                }
                break;
            case 85:
                {
                alt20=30;
                }
                break;
            case 86:
                {
                alt20=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalXContext.g:1170:3: kw= '('
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1176:3: kw= ')'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1182:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1188:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1194:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1200:3: kw= '&'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:1206:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:1212:3: kw= '\\u00AC'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:1218:3: kw= '\\u22A4'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:1224:3: kw= '\\u22A5'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:1230:3: kw= '\\u2200'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:1236:3: kw= '!'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXContext.g:1242:3: kw= '\\u2203'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXContext.g:1248:3: kw= '#'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXContext.g:1254:3: kw= ','
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXContext.g:1260:3: kw= '\\u00B7'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXContext.g:1266:3: kw= '.'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXContext.g:1272:3: kw= '='
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXContext.g:1278:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXContext.g:1284:3: kw= '\\u2264'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXContext.g:1290:3: kw= '<'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXContext.g:1296:3: kw= '\\u2265'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXContext.g:1302:3: kw= '>'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXContext.g:1308:3: kw= '\\u2208'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXContext.g:1314:3: kw= ':'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXContext.g:1320:3: kw= '\\u2209'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXContext.g:1326:3: kw= '\\u2282'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXContext.g:1332:3: kw= '\\u2284'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXContext.g:1338:3: kw= '\\u2286'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXContext.g:1344:3: kw= '\\u2288'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXContext.g:1350:3: kw= 'partition'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

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
    // InternalXContext.g:1359:1: entryRuleEVENTB_EXPRESSION_SYMBOLS returns [String current=null] : iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final String entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_EXPRESSION_SYMBOLS = null;


        try {
            // InternalXContext.g:1359:65: (iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXContext.g:1360:2: iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF
            {
             newCompositeNode(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVENTB_EXPRESSION_SYMBOLS=ruleEVENTB_EXPRESSION_SYMBOLS();

            state._fsp--;

             current =iv_ruleEVENTB_EXPRESSION_SYMBOLS.getText(); 
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
    // $ANTLR end "entryRuleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "ruleEVENTB_EXPRESSION_SYMBOLS"
    // InternalXContext.g:1366:1: ruleEVENTB_EXPRESSION_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:1372:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) )
            // InternalXContext.g:1373:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            {
            // InternalXContext.g:1373:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            int alt21=45;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt21=1;
                }
                break;
            case 25:
                {
                alt21=2;
                }
                break;
            case 26:
                {
                alt21=3;
                }
                break;
            case 27:
                {
                alt21=4;
                }
                break;
            case 28:
                {
                alt21=5;
                }
                break;
            case 29:
                {
                alt21=6;
                }
                break;
            case 30:
                {
                alt21=7;
                }
                break;
            case 31:
                {
                alt21=8;
                }
                break;
            case 32:
                {
                alt21=9;
                }
                break;
            case 33:
                {
                alt21=10;
                }
                break;
            case 34:
                {
                alt21=11;
                }
                break;
            case 87:
                {
                alt21=12;
                }
                break;
            case 88:
                {
                alt21=13;
                }
                break;
            case 89:
                {
                alt21=14;
                }
                break;
            case 90:
                {
                alt21=15;
                }
                break;
            case 91:
                {
                alt21=16;
                }
                break;
            case 92:
                {
                alt21=17;
                }
                break;
            case 93:
                {
                alt21=18;
                }
                break;
            case 35:
                {
                alt21=19;
                }
                break;
            case 94:
                {
                alt21=20;
                }
                break;
            case 95:
                {
                alt21=21;
                }
                break;
            case 96:
                {
                alt21=22;
                }
                break;
            case 97:
                {
                alt21=23;
                }
                break;
            case 98:
                {
                alt21=24;
                }
                break;
            case 99:
                {
                alt21=25;
                }
                break;
            case 100:
                {
                alt21=26;
                }
                break;
            case 101:
                {
                alt21=27;
                }
                break;
            case 102:
                {
                alt21=28;
                }
                break;
            case 103:
                {
                alt21=29;
                }
                break;
            case 104:
                {
                alt21=30;
                }
                break;
            case 105:
                {
                alt21=31;
                }
                break;
            case 106:
                {
                alt21=32;
                }
                break;
            case 107:
                {
                alt21=33;
                }
                break;
            case 109:
                {
                alt21=34;
                }
                break;
            case 110:
                {
                alt21=35;
                }
                break;
            case 111:
                {
                alt21=36;
                }
                break;
            case 112:
                {
                alt21=37;
                }
                break;
            case 113:
                {
                alt21=38;
                }
                break;
            case 114:
                {
                alt21=39;
                }
                break;
            case 115:
                {
                alt21=40;
                }
                break;
            case 116:
                {
                alt21=41;
                }
                break;
            case 117:
                {
                alt21=42;
                }
                break;
            case 118:
                {
                alt21=43;
                }
                break;
            case 119:
                {
                alt21=44;
                }
                break;
            case 120:
                {
                alt21=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalXContext.g:1374:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1380:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1386:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1392:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1398:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1404:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:1410:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:1416:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:1422:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:1428:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:1434:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:1440:3: kw= '{'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXContext.g:1446:3: kw= '}'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXContext.g:1452:3: kw= '\\u21A6'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXContext.g:1458:3: kw= '\\u2205'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXContext.g:1464:3: kw= '\\u2229'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXContext.g:1470:3: kw= '\\u222A'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXContext.g:1476:3: kw= '\\u2216'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXContext.g:1482:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXContext.g:1488:3: kw= '['
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXContext.g:1494:3: kw= ']'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXContext.g:1500:3: kw= '\\uE103'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXContext.g:1506:3: kw= '\\u2218'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXContext.g:1512:3: kw= ';'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXContext.g:1518:3: kw= '\\u2297'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXContext.g:1524:3: kw= '\\u2225'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXContext.g:1530:3: kw= '\\u223C'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXContext.g:1536:3: kw= '\\u25C1'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXContext.g:1542:3: kw= '\\u2A64'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXContext.g:1548:3: kw= '\\u25B7'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXContext.g:1554:3: kw= '\\u2A65'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalXContext.g:1560:3: kw= '\\u03BB'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalXContext.g:1566:3: (kw= '%' kw= '\\u22C2' )
                    {
                    // InternalXContext.g:1566:3: (kw= '%' kw= '\\u22C2' )
                    // InternalXContext.g:1567:4: kw= '%' kw= '\\u22C2'
                    {
                    kw=(Token)match(input,107,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0());
                    			
                    kw=(Token)match(input,108,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalXContext.g:1579:3: kw= '\\u22C3'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalXContext.g:1585:3: kw= '\\u2223'
                    {
                    kw=(Token)match(input,110,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalXContext.g:1591:3: kw= '\\u2025'
                    {
                    kw=(Token)match(input,111,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalXContext.g:1597:3: kw= '+'
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalXContext.g:1603:3: kw= '\\u2212'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalXContext.g:1609:3: kw= '-'
                    {
                    kw=(Token)match(input,114,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalXContext.g:1615:3: kw= '\\u2217'
                    {
                    kw=(Token)match(input,115,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalXContext.g:1621:3: kw= '*'
                    {
                    kw=(Token)match(input,116,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalXContext.g:1627:3: kw= '\\u00F7'
                    {
                    kw=(Token)match(input,117,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalXContext.g:1633:3: kw= '/'
                    {
                    kw=(Token)match(input,118,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalXContext.g:1639:3: kw= '^'
                    {
                    kw=(Token)match(input,119,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalXContext.g:1645:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,120,FOLLOW_2); 

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
    // InternalXContext.g:1654:1: entryRuleXRecord returns [EObject current=null] : iv_ruleXRecord= ruleXRecord EOF ;
    public final EObject entryRuleXRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRecord = null;


        try {
            // InternalXContext.g:1654:48: (iv_ruleXRecord= ruleXRecord EOF )
            // InternalXContext.g:1655:2: iv_ruleXRecord= ruleXRecord EOF
            {
             newCompositeNode(grammarAccess.getXRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXRecord=ruleXRecord();

            state._fsp--;

             current =iv_ruleXRecord; 
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
    // $ANTLR end "entryRuleXRecord"


    // $ANTLR start "ruleXRecord"
    // InternalXContext.g:1661:1: ruleXRecord returns [EObject current=null] : ( () otherlv_1= 'record' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inherits' ( (otherlv_4= RULE_ID ) ) )? ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )? ) ;
    public final EObject ruleXRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_fields_5_0 = null;

        EObject lv_fields_6_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:1667:2: ( ( () otherlv_1= 'record' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inherits' ( (otherlv_4= RULE_ID ) ) )? ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )? ) )
            // InternalXContext.g:1668:2: ( () otherlv_1= 'record' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inherits' ( (otherlv_4= RULE_ID ) ) )? ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )? )
            {
            // InternalXContext.g:1668:2: ( () otherlv_1= 'record' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inherits' ( (otherlv_4= RULE_ID ) ) )? ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )? )
            // InternalXContext.g:1669:3: () otherlv_1= 'record' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inherits' ( (otherlv_4= RULE_ID ) ) )? ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )?
            {
            // InternalXContext.g:1669:3: ()
            // InternalXContext.g:1670:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXRecordAccess().getRecordAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,121,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getXRecordAccess().getRecordKeyword_1());
            		
            // InternalXContext.g:1680:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:1681:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:1681:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:1682:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xcontext.XContext.ID");
            				

            }


            }

            // InternalXContext.g:1698:3: (otherlv_3= 'inherits' ( (otherlv_4= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==122) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXContext.g:1699:4: otherlv_3= 'inherits' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,122,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getXRecordAccess().getInheritsKeyword_3_0());
                    			
                    // InternalXContext.g:1703:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXContext.g:1704:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXContext.g:1704:5: (otherlv_4= RULE_ID )
                    // InternalXContext.g:1705:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXRecordRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_4, grammarAccess.getXRecordAccess().getSubsetsRecordCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXContext.g:1717:3: ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXContext.g:1718:4: ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )*
                    {
                    // InternalXContext.g:1718:4: ( (lv_fields_5_0= ruleField ) )
                    // InternalXContext.g:1719:5: (lv_fields_5_0= ruleField )
                    {
                    // InternalXContext.g:1719:5: (lv_fields_5_0= ruleField )
                    // InternalXContext.g:1720:6: lv_fields_5_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_fields_5_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXRecordRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_5_0,
                    							"ac.soton.xeventb.xcontext.XContext.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXContext.g:1737:4: ( (lv_fields_6_0= ruleField ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalXContext.g:1738:5: (lv_fields_6_0= ruleField )
                    	    {
                    	    // InternalXContext.g:1738:5: (lv_fields_6_0= ruleField )
                    	    // InternalXContext.g:1739:6: lv_fields_6_0= ruleField
                    	    {

                    	    						newCompositeNode(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_fields_6_0=ruleField();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXRecordRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fields",
                    	    							lv_fields_6_0,
                    	    							"ac.soton.xeventb.xcontext.XContext.Field");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
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
    // $ANTLR end "ruleXRecord"


    // $ANTLR start "entryRuleFieldType"
    // InternalXContext.g:1761:1: entryRuleFieldType returns [String current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final String entryRuleFieldType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldType = null;


        try {
            // InternalXContext.g:1761:49: (iv_ruleFieldType= ruleFieldType EOF )
            // InternalXContext.g:1762:2: iv_ruleFieldType= ruleFieldType EOF
            {
             newCompositeNode(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;

             current =iv_ruleFieldType.getText(); 
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
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalXContext.g:1768:1: ruleFieldType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleFieldType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalXContext.g:1774:2: ( (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD ) )
            // InternalXContext.g:1775:2: (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD )
            {
            // InternalXContext.g:1775:2: (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=36 && LA25_0<=39)||(LA25_0>=42 && LA25_0<=60)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalXContext.g:1776:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1784:3: this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1798:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalXContext.g:1798:46: (iv_ruleField= ruleField EOF )
            // InternalXContext.g:1799:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalXContext.g:1805:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_type_3_0= ruleFieldType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_multiplicity_2_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:1811:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_type_3_0= ruleFieldType ) ) ) )
            // InternalXContext.g:1812:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_type_3_0= ruleFieldType ) ) )
            {
            // InternalXContext.g:1812:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_type_3_0= ruleFieldType ) ) )
            // InternalXContext.g:1813:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_type_3_0= ruleFieldType ) )
            {
            // InternalXContext.g:1813:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXContext.g:1814:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXContext.g:1814:4: (lv_name_0_0= RULE_ID )
            // InternalXContext.g:1815:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.xeventb.xcontext.XContext.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalXContext.g:1835:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=123 && LA26_0<=125)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXContext.g:1836:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    {
                    // InternalXContext.g:1836:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    // InternalXContext.g:1837:5: lv_multiplicity_2_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_multiplicity_2_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_2_0,
                    						"ac.soton.xeventb.xcontext.XContext.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalXContext.g:1854:3: ( (lv_type_3_0= ruleFieldType ) )
            // InternalXContext.g:1855:4: (lv_type_3_0= ruleFieldType )
            {
            // InternalXContext.g:1855:4: (lv_type_3_0= ruleFieldType )
            // InternalXContext.g:1856:5: lv_type_3_0= ruleFieldType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleFieldType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
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


    // $ANTLR start "ruleMultiplicity"
    // InternalXContext.g:1877:1: ruleMultiplicity returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXContext.g:1883:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) )
            // InternalXContext.g:1884:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            {
            // InternalXContext.g:1884:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt27=1;
                }
                break;
            case 124:
                {
                alt27=2;
                }
                break;
            case 125:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalXContext.g:1885:3: (enumLiteral_0= 'one' )
                    {
                    // InternalXContext.g:1885:3: (enumLiteral_0= 'one' )
                    // InternalXContext.g:1886:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1893:3: (enumLiteral_1= 'many' )
                    {
                    // InternalXContext.g:1893:3: (enumLiteral_1= 'many' )
                    // InternalXContext.g:1894:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:1901:3: (enumLiteral_2= 'opt' )
                    {
                    // InternalXContext.g:1901:3: (enumLiteral_2= 'opt' )
                    // InternalXContext.g:1902:4: enumLiteral_2= 'opt'
                    {
                    enumLiteral_2=(Token)match(input,125,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000C7C010L,0x0200000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C78030L,0x0200000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000C78010L,0x0200000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000DF000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFFFFFFFFF3801A0L,0x01FFEFFFFFFFFFFFL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xFFFFFFFFFF3801A2L,0x01FFEFFFFFFFFFFFL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000FFF000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000022L,0x0400000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x1FFFFCF000000020L,0x3800000000000000L});

}