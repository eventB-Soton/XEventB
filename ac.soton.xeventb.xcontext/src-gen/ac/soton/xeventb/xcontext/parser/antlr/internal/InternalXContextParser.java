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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_UNTRANSLATED_TOKEN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'extends'", "'extend'", "'ext'", "'sets'", "'constants'", "'axioms'", "'.'", "'set'", "'constant'", "'cst'", "':'", "'='", "'axiom'", "'axm'", "'theorem'", "'thm'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'\\u00D7'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'('", "')'", "'\\u2119'", "'\\u21191'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'%'", "'\\u22C2'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'extended'", "'record'", "'inherits'", "'field'", "'constraint'", "'end'", "'one'", "'many'", "'opt'"
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
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
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
    // InternalXContext.g:72:1: ruleXContext returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ ) | ( (otherlv_6= 'extend' | otherlv_7= 'ext' ) ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'sets' ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+ ) | ( (lv_orderedChildren_11_0= ruleXIndividualCarrierSet ) ) | (otherlv_12= 'constants' ( (lv_orderedChildren_13_0= ruleXConstant ) )+ ) | ( (lv_orderedChildren_14_0= ruleXIndividualConstant ) ) | ( (lv_orderedChildren_15_0= ruleXRecord ) ) | (otherlv_16= 'axioms' ( (lv_orderedChildren_17_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_18_0= ruleXIndividualAxiom ) ) | ( (lv_orderedChildren_19_0= ruleXIndividualTheorem ) ) )* ) ;
    public final EObject ruleXContext() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_orderedChildren_10_0 = null;

        EObject lv_orderedChildren_11_0 = null;

        EObject lv_orderedChildren_13_0 = null;

        EObject lv_orderedChildren_14_0 = null;

        EObject lv_orderedChildren_15_0 = null;

        EObject lv_orderedChildren_17_0 = null;

        EObject lv_orderedChildren_18_0 = null;

        EObject lv_orderedChildren_19_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:78:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ ) | ( (otherlv_6= 'extend' | otherlv_7= 'ext' ) ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'sets' ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+ ) | ( (lv_orderedChildren_11_0= ruleXIndividualCarrierSet ) ) | (otherlv_12= 'constants' ( (lv_orderedChildren_13_0= ruleXConstant ) )+ ) | ( (lv_orderedChildren_14_0= ruleXIndividualConstant ) ) | ( (lv_orderedChildren_15_0= ruleXRecord ) ) | (otherlv_16= 'axioms' ( (lv_orderedChildren_17_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_18_0= ruleXIndividualAxiom ) ) | ( (lv_orderedChildren_19_0= ruleXIndividualTheorem ) ) )* ) )
            // InternalXContext.g:79:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ ) | ( (otherlv_6= 'extend' | otherlv_7= 'ext' ) ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'sets' ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+ ) | ( (lv_orderedChildren_11_0= ruleXIndividualCarrierSet ) ) | (otherlv_12= 'constants' ( (lv_orderedChildren_13_0= ruleXConstant ) )+ ) | ( (lv_orderedChildren_14_0= ruleXIndividualConstant ) ) | ( (lv_orderedChildren_15_0= ruleXRecord ) ) | (otherlv_16= 'axioms' ( (lv_orderedChildren_17_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_18_0= ruleXIndividualAxiom ) ) | ( (lv_orderedChildren_19_0= ruleXIndividualTheorem ) ) )* )
            {
            // InternalXContext.g:79:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ ) | ( (otherlv_6= 'extend' | otherlv_7= 'ext' ) ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'sets' ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+ ) | ( (lv_orderedChildren_11_0= ruleXIndividualCarrierSet ) ) | (otherlv_12= 'constants' ( (lv_orderedChildren_13_0= ruleXConstant ) )+ ) | ( (lv_orderedChildren_14_0= ruleXIndividualConstant ) ) | ( (lv_orderedChildren_15_0= ruleXRecord ) ) | (otherlv_16= 'axioms' ( (lv_orderedChildren_17_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_18_0= ruleXIndividualAxiom ) ) | ( (lv_orderedChildren_19_0= ruleXIndividualTheorem ) ) )* )
            // InternalXContext.g:80:3: () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'context' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ ) | ( (otherlv_6= 'extend' | otherlv_7= 'ext' ) ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'sets' ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+ ) | ( (lv_orderedChildren_11_0= ruleXIndividualCarrierSet ) ) | (otherlv_12= 'constants' ( (lv_orderedChildren_13_0= ruleXConstant ) )+ ) | ( (lv_orderedChildren_14_0= ruleXIndividualConstant ) ) | ( (lv_orderedChildren_15_0= ruleXRecord ) ) | (otherlv_16= 'axioms' ( (lv_orderedChildren_17_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_18_0= ruleXIndividualAxiom ) ) | ( (lv_orderedChildren_19_0= ruleXIndividualTheorem ) ) )*
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

            // InternalXContext.g:127:3: ( (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ ) | ( (otherlv_6= 'extend' | otherlv_7= 'ext' ) ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'sets' ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+ ) | ( (lv_orderedChildren_11_0= ruleXIndividualCarrierSet ) ) | (otherlv_12= 'constants' ( (lv_orderedChildren_13_0= ruleXConstant ) )+ ) | ( (lv_orderedChildren_14_0= ruleXIndividualConstant ) ) | ( (lv_orderedChildren_15_0= ruleXRecord ) ) | (otherlv_16= 'axioms' ( (lv_orderedChildren_17_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_18_0= ruleXIndividualAxiom ) ) | ( (lv_orderedChildren_19_0= ruleXIndividualTheorem ) ) )*
            loop7:
            do {
                int alt7=11;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalXContext.g:128:4: (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )
            	    {
            	    // InternalXContext.g:128:4: (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ )
            	    // InternalXContext.g:129:5: otherlv_4= 'extends' ( ( ruleQualifiedName ) )+
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_4); 

            	    					newLeafNode(otherlv_4, grammarAccess.getXContextAccess().getExtendsKeyword_4_0_0());
            	    				
            	    // InternalXContext.g:133:5: ( ( ruleQualifiedName ) )+
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
            	    	    // InternalXContext.g:134:6: ( ruleQualifiedName )
            	    	    {
            	    	    // InternalXContext.g:134:6: ( ruleQualifiedName )
            	    	    // InternalXContext.g:135:7: ruleQualifiedName
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getXContextRule());
            	    	    							}
            	    	    						

            	    	    							newCompositeNode(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_0_1_0());
            	    	    						
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


            	    }
            	    break;
            	case 2 :
            	    // InternalXContext.g:151:4: ( (otherlv_6= 'extend' | otherlv_7= 'ext' ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // InternalXContext.g:151:4: ( (otherlv_6= 'extend' | otherlv_7= 'ext' ) ( ( ruleQualifiedName ) ) )
            	    // InternalXContext.g:152:5: (otherlv_6= 'extend' | otherlv_7= 'ext' ) ( ( ruleQualifiedName ) )
            	    {
            	    // InternalXContext.g:152:5: (otherlv_6= 'extend' | otherlv_7= 'ext' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==16) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalXContext.g:153:6: otherlv_6= 'extend'
            	            {
            	            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_4); 

            	            						newLeafNode(otherlv_6, grammarAccess.getXContextAccess().getExtendKeyword_4_1_0_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalXContext.g:158:6: otherlv_7= 'ext'
            	            {
            	            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_4); 

            	            						newLeafNode(otherlv_7, grammarAccess.getXContextAccess().getExtKeyword_4_1_0_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalXContext.g:163:5: ( ( ruleQualifiedName ) )
            	    // InternalXContext.g:164:6: ( ruleQualifiedName )
            	    {
            	    // InternalXContext.g:164:6: ( ruleQualifiedName )
            	    // InternalXContext.g:165:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getXContextRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_1_0());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXContext.g:181:4: (otherlv_9= 'sets' ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+ )
            	    {
            	    // InternalXContext.g:181:4: (otherlv_9= 'sets' ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+ )
            	    // InternalXContext.g:182:5: otherlv_9= 'sets' ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+
            	    {
            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            	    					newLeafNode(otherlv_9, grammarAccess.getXContextAccess().getSetsKeyword_4_2_0());
            	    				
            	    // InternalXContext.g:186:5: ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+
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
            	    	    // InternalXContext.g:187:6: (lv_orderedChildren_10_0= ruleXCarrierSet )
            	    	    {
            	    	    // InternalXContext.g:187:6: (lv_orderedChildren_10_0= ruleXCarrierSet )
            	    	    // InternalXContext.g:188:7: lv_orderedChildren_10_0= ruleXCarrierSet
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXCarrierSetParserRuleCall_4_2_1_0());
            	    	    						
            	    	    pushFollow(FollowSets000.FOLLOW_6);
            	    	    lv_orderedChildren_10_0=ruleXCarrierSet();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getXContextRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"orderedChildren",
            	    	    								lv_orderedChildren_10_0,
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
            	case 4 :
            	    // InternalXContext.g:207:4: ( (lv_orderedChildren_11_0= ruleXIndividualCarrierSet ) )
            	    {
            	    // InternalXContext.g:207:4: ( (lv_orderedChildren_11_0= ruleXIndividualCarrierSet ) )
            	    // InternalXContext.g:208:5: (lv_orderedChildren_11_0= ruleXIndividualCarrierSet )
            	    {
            	    // InternalXContext.g:208:5: (lv_orderedChildren_11_0= ruleXIndividualCarrierSet )
            	    // InternalXContext.g:209:6: lv_orderedChildren_11_0= ruleXIndividualCarrierSet
            	    {

            	    						newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualCarrierSetParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_orderedChildren_11_0=ruleXIndividualCarrierSet();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_11_0,
            	    							"ac.soton.xeventb.xcontext.XContext.XIndividualCarrierSet");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXContext.g:227:4: (otherlv_12= 'constants' ( (lv_orderedChildren_13_0= ruleXConstant ) )+ )
            	    {
            	    // InternalXContext.g:227:4: (otherlv_12= 'constants' ( (lv_orderedChildren_13_0= ruleXConstant ) )+ )
            	    // InternalXContext.g:228:5: otherlv_12= 'constants' ( (lv_orderedChildren_13_0= ruleXConstant ) )+
            	    {
            	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_7); 

            	    					newLeafNode(otherlv_12, grammarAccess.getXContextAccess().getConstantsKeyword_4_4_0());
            	    				
            	    // InternalXContext.g:232:5: ( (lv_orderedChildren_13_0= ruleXConstant ) )+
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
            	    	    // InternalXContext.g:233:6: (lv_orderedChildren_13_0= ruleXConstant )
            	    	    {
            	    	    // InternalXContext.g:233:6: (lv_orderedChildren_13_0= ruleXConstant )
            	    	    // InternalXContext.g:234:7: lv_orderedChildren_13_0= ruleXConstant
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXConstantParserRuleCall_4_4_1_0());
            	    	    						
            	    	    pushFollow(FollowSets000.FOLLOW_6);
            	    	    lv_orderedChildren_13_0=ruleXConstant();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getXContextRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"orderedChildren",
            	    	    								lv_orderedChildren_13_0,
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
            	case 6 :
            	    // InternalXContext.g:253:4: ( (lv_orderedChildren_14_0= ruleXIndividualConstant ) )
            	    {
            	    // InternalXContext.g:253:4: ( (lv_orderedChildren_14_0= ruleXIndividualConstant ) )
            	    // InternalXContext.g:254:5: (lv_orderedChildren_14_0= ruleXIndividualConstant )
            	    {
            	    // InternalXContext.g:254:5: (lv_orderedChildren_14_0= ruleXIndividualConstant )
            	    // InternalXContext.g:255:6: lv_orderedChildren_14_0= ruleXIndividualConstant
            	    {

            	    						newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualConstantParserRuleCall_4_5_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_orderedChildren_14_0=ruleXIndividualConstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_14_0,
            	    							"ac.soton.xeventb.xcontext.XContext.XIndividualConstant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalXContext.g:273:4: ( (lv_orderedChildren_15_0= ruleXRecord ) )
            	    {
            	    // InternalXContext.g:273:4: ( (lv_orderedChildren_15_0= ruleXRecord ) )
            	    // InternalXContext.g:274:5: (lv_orderedChildren_15_0= ruleXRecord )
            	    {
            	    // InternalXContext.g:274:5: (lv_orderedChildren_15_0= ruleXRecord )
            	    // InternalXContext.g:275:6: lv_orderedChildren_15_0= ruleXRecord
            	    {

            	    						newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXRecordParserRuleCall_4_6_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_orderedChildren_15_0=ruleXRecord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_15_0,
            	    							"ac.soton.xeventb.xcontext.XContext.XRecord");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalXContext.g:293:4: (otherlv_16= 'axioms' ( (lv_orderedChildren_17_0= ruleXAxiom ) )+ )
            	    {
            	    // InternalXContext.g:293:4: (otherlv_16= 'axioms' ( (lv_orderedChildren_17_0= ruleXAxiom ) )+ )
            	    // InternalXContext.g:294:5: otherlv_16= 'axioms' ( (lv_orderedChildren_17_0= ruleXAxiom ) )+
            	    {
            	    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_8); 

            	    					newLeafNode(otherlv_16, grammarAccess.getXContextAccess().getAxiomsKeyword_4_7_0());
            	    				
            	    // InternalXContext.g:298:5: ( (lv_orderedChildren_17_0= ruleXAxiom ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_STRING) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( (LA6_2==RULE_XLABEL) ) {
            	                alt6=1;
            	            }


            	        }
            	        else if ( (LA6_0==RULE_XLABEL) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalXContext.g:299:6: (lv_orderedChildren_17_0= ruleXAxiom )
            	    	    {
            	    	    // InternalXContext.g:299:6: (lv_orderedChildren_17_0= ruleXAxiom )
            	    	    // InternalXContext.g:300:7: lv_orderedChildren_17_0= ruleXAxiom
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXAxiomParserRuleCall_4_7_1_0());
            	    	    						
            	    	    pushFollow(FollowSets000.FOLLOW_9);
            	    	    lv_orderedChildren_17_0=ruleXAxiom();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getXContextRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"orderedChildren",
            	    	    								lv_orderedChildren_17_0,
            	    	    								"ac.soton.xeventb.xcontext.XContext.XAxiom");
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


            	    }
            	    break;
            	case 9 :
            	    // InternalXContext.g:319:4: ( (lv_orderedChildren_18_0= ruleXIndividualAxiom ) )
            	    {
            	    // InternalXContext.g:319:4: ( (lv_orderedChildren_18_0= ruleXIndividualAxiom ) )
            	    // InternalXContext.g:320:5: (lv_orderedChildren_18_0= ruleXIndividualAxiom )
            	    {
            	    // InternalXContext.g:320:5: (lv_orderedChildren_18_0= ruleXIndividualAxiom )
            	    // InternalXContext.g:321:6: lv_orderedChildren_18_0= ruleXIndividualAxiom
            	    {

            	    						newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualAxiomParserRuleCall_4_8_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_orderedChildren_18_0=ruleXIndividualAxiom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_18_0,
            	    							"ac.soton.xeventb.xcontext.XContext.XIndividualAxiom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalXContext.g:339:4: ( (lv_orderedChildren_19_0= ruleXIndividualTheorem ) )
            	    {
            	    // InternalXContext.g:339:4: ( (lv_orderedChildren_19_0= ruleXIndividualTheorem ) )
            	    // InternalXContext.g:340:5: (lv_orderedChildren_19_0= ruleXIndividualTheorem )
            	    {
            	    // InternalXContext.g:340:5: (lv_orderedChildren_19_0= ruleXIndividualTheorem )
            	    // InternalXContext.g:341:6: lv_orderedChildren_19_0= ruleXIndividualTheorem
            	    {

            	    						newCompositeNode(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualTheoremParserRuleCall_4_9_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_orderedChildren_19_0=ruleXIndividualTheorem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_19_0,
            	    							"ac.soton.xeventb.xcontext.XContext.XIndividualTheorem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // $ANTLR end "ruleXContext"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXContext.g:363:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXContext.g:363:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXContext.g:364:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXContext.g:370:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXContext.g:376:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXContext.g:377:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXContext.g:377:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXContext.g:378:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXContext.g:385:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXContext.g:386:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FollowSets000.FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalXContext.g:403:1: entryRuleXCarrierSet returns [EObject current=null] : iv_ruleXCarrierSet= ruleXCarrierSet EOF ;
    public final EObject entryRuleXCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCarrierSet = null;


        try {
            // InternalXContext.g:403:52: (iv_ruleXCarrierSet= ruleXCarrierSet EOF )
            // InternalXContext.g:404:2: iv_ruleXCarrierSet= ruleXCarrierSet EOF
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
    // InternalXContext.g:410:1: ruleXCarrierSet returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXCarrierSet() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXContext.g:416:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXContext.g:417:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXContext.g:417:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXContext.g:418:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXContext.g:418:3: ()
            // InternalXContext.g:419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0(),
            					current);
            			

            }

            // InternalXContext.g:425:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXContext.g:426:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:426:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:427:5: lv_comment_1_0= RULE_STRING
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

            // InternalXContext.g:443:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:444:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:444:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:445:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRuleXIndividualCarrierSet"
    // InternalXContext.g:465:1: entryRuleXIndividualCarrierSet returns [EObject current=null] : iv_ruleXIndividualCarrierSet= ruleXIndividualCarrierSet EOF ;
    public final EObject entryRuleXIndividualCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIndividualCarrierSet = null;


        try {
            // InternalXContext.g:465:62: (iv_ruleXIndividualCarrierSet= ruleXIndividualCarrierSet EOF )
            // InternalXContext.g:466:2: iv_ruleXIndividualCarrierSet= ruleXIndividualCarrierSet EOF
            {
             newCompositeNode(grammarAccess.getXIndividualCarrierSetRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXIndividualCarrierSet=ruleXIndividualCarrierSet();

            state._fsp--;

             current =iv_ruleXIndividualCarrierSet; 
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
    // $ANTLR end "entryRuleXIndividualCarrierSet"


    // $ANTLR start "ruleXIndividualCarrierSet"
    // InternalXContext.g:472:1: ruleXIndividualCarrierSet returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'set' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleXIndividualCarrierSet() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalXContext.g:478:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'set' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalXContext.g:479:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'set' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalXContext.g:479:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'set' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalXContext.g:480:3: () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'set' ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalXContext.g:480:3: ()
            // InternalXContext.g:481:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXIndividualCarrierSetAccess().getCarrierSetAction_0(),
            					current);
            			

            }

            // InternalXContext.g:487:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXContext.g:488:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:488:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:489:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_11); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXIndividualCarrierSetAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXIndividualCarrierSetRule());
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

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXIndividualCarrierSetAccess().getSetKeyword_2());
            		
            // InternalXContext.g:509:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXContext.g:510:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXContext.g:510:4: (lv_name_3_0= RULE_ID )
            // InternalXContext.g:511:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXIndividualCarrierSetAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXIndividualCarrierSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
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
    // $ANTLR end "ruleXIndividualCarrierSet"


    // $ANTLR start "entryRuleXConstant"
    // InternalXContext.g:531:1: entryRuleXConstant returns [EObject current=null] : iv_ruleXConstant= ruleXConstant EOF ;
    public final EObject entryRuleXConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstant = null;


        try {
            // InternalXContext.g:531:50: (iv_ruleXConstant= ruleXConstant EOF )
            // InternalXContext.g:532:2: iv_ruleXConstant= ruleXConstant EOF
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
    // InternalXContext.g:538:1: ruleXConstant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXConstant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXContext.g:544:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXContext.g:545:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXContext.g:545:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXContext.g:546:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXContext.g:546:3: ()
            // InternalXContext.g:547:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstantAccess().getConstantAction_0(),
            					current);
            			

            }

            // InternalXContext.g:553:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXContext.g:554:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:554:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:555:5: lv_comment_1_0= RULE_STRING
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

            // InternalXContext.g:571:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:572:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:572:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:573:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRuleXIndividualConstant"
    // InternalXContext.g:593:1: entryRuleXIndividualConstant returns [EObject current=null] : iv_ruleXIndividualConstant= ruleXIndividualConstant EOF ;
    public final EObject entryRuleXIndividualConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIndividualConstant = null;


        try {
            // InternalXContext.g:593:60: (iv_ruleXIndividualConstant= ruleXIndividualConstant EOF )
            // InternalXContext.g:594:2: iv_ruleXIndividualConstant= ruleXIndividualConstant EOF
            {
             newCompositeNode(grammarAccess.getXIndividualConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXIndividualConstant=ruleXIndividualConstant();

            state._fsp--;

             current =iv_ruleXIndividualConstant; 
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
    // $ANTLR end "entryRuleXIndividualConstant"


    // $ANTLR start "ruleXIndividualConstant"
    // InternalXContext.g:600:1: ruleXIndividualConstant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'constant' | otherlv_3= 'cst' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? ) ;
    public final EObject ruleXIndividualConstant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:606:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'constant' | otherlv_3= 'cst' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? ) )
            // InternalXContext.g:607:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'constant' | otherlv_3= 'cst' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? )
            {
            // InternalXContext.g:607:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'constant' | otherlv_3= 'cst' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? )
            // InternalXContext.g:608:3: () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'constant' | otherlv_3= 'cst' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )?
            {
            // InternalXContext.g:608:3: ()
            // InternalXContext.g:609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXIndividualConstantAccess().getTypedConstantAction_0(),
            					current);
            			

            }

            // InternalXContext.g:615:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXContext.g:616:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:616:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:617:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXIndividualConstantAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXIndividualConstantRule());
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

            // InternalXContext.g:633:3: (otherlv_2= 'constant' | otherlv_3= 'cst' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==23) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXContext.g:634:4: otherlv_2= 'constant'
                    {
                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getXIndividualConstantAccess().getConstantKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXContext.g:639:4: otherlv_3= 'cst'
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getXIndividualConstantAccess().getCstKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalXContext.g:644:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalXContext.g:645:4: (lv_name_4_0= RULE_ID )
            {
            // InternalXContext.g:645:4: (lv_name_4_0= RULE_ID )
            // InternalXContext.g:646:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

            					newLeafNode(lv_name_4_0, grammarAccess.getXIndividualConstantAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXIndividualConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"ac.soton.xeventb.xcontext.XContext.ID");
            				

            }


            }

            // InternalXContext.g:662:3: (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXContext.g:663:4: otherlv_5= ':' ( (lv_type_6_0= ruleXType ) )
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getXIndividualConstantAccess().getColonKeyword_4_0());
                    			
                    // InternalXContext.g:667:4: ( (lv_type_6_0= ruleXType ) )
                    // InternalXContext.g:668:5: (lv_type_6_0= ruleXType )
                    {
                    // InternalXContext.g:668:5: (lv_type_6_0= ruleXType )
                    // InternalXContext.g:669:6: lv_type_6_0= ruleXType
                    {

                    						newCompositeNode(grammarAccess.getXIndividualConstantAccess().getTypeXTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_type_6_0=ruleXType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXIndividualConstantRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"ac.soton.xeventb.xcontext.XContext.XType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXContext.g:687:3: (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXContext.g:688:4: otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) )
                    {
                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getXIndividualConstantAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalXContext.g:692:4: ( (lv_value_8_0= ruleXFormula ) )
                    // InternalXContext.g:693:5: (lv_value_8_0= ruleXFormula )
                    {
                    // InternalXContext.g:693:5: (lv_value_8_0= ruleXFormula )
                    // InternalXContext.g:694:6: lv_value_8_0= ruleXFormula
                    {

                    						newCompositeNode(grammarAccess.getXIndividualConstantAccess().getValueXFormulaParserRuleCall_5_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_8_0=ruleXFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXIndividualConstantRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
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
    // $ANTLR end "ruleXIndividualConstant"


    // $ANTLR start "entryRuleXAxiom"
    // InternalXContext.g:716:1: entryRuleXAxiom returns [EObject current=null] : iv_ruleXAxiom= ruleXAxiom EOF ;
    public final EObject entryRuleXAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAxiom = null;


        try {
            // InternalXContext.g:716:47: (iv_ruleXAxiom= ruleXAxiom EOF )
            // InternalXContext.g:717:2: iv_ruleXAxiom= ruleXAxiom EOF
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
    // InternalXContext.g:723:1: ruleXAxiom returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:729:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXContext.g:730:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXContext.g:730:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXContext.g:731:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXContext.g:731:3: ()
            // InternalXContext.g:732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXAxiomAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalXContext.g:738:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXContext.g:739:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:739:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:740:5: lv_comment_1_0= RULE_STRING
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

            // InternalXContext.g:756:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXContext.g:757:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXContext.g:757:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXContext.g:758:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_16); 

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

            // InternalXContext.g:774:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXContext.g:775:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXContext.g:775:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXContext.g:776:5: lv_predicate_3_0= ruleXFormula
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


    // $ANTLR start "entryRuleXIndividualAxiom"
    // InternalXContext.g:797:1: entryRuleXIndividualAxiom returns [EObject current=null] : iv_ruleXIndividualAxiom= ruleXIndividualAxiom EOF ;
    public final EObject entryRuleXIndividualAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIndividualAxiom = null;


        try {
            // InternalXContext.g:797:57: (iv_ruleXIndividualAxiom= ruleXIndividualAxiom EOF )
            // InternalXContext.g:798:2: iv_ruleXIndividualAxiom= ruleXIndividualAxiom EOF
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
    // InternalXContext.g:804:1: ruleXIndividualAxiom returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'axiom' | otherlv_3= 'axm' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) ) ;
    public final EObject ruleXIndividualAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        AntlrDatatypeRuleToken lv_predicate_5_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:810:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'axiom' | otherlv_3= 'axm' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) ) )
            // InternalXContext.g:811:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'axiom' | otherlv_3= 'axm' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) )
            {
            // InternalXContext.g:811:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'axiom' | otherlv_3= 'axm' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) )
            // InternalXContext.g:812:3: () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'axiom' | otherlv_3= 'axm' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) )
            {
            // InternalXContext.g:812:3: ()
            // InternalXContext.g:813:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXIndividualAxiomAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalXContext.g:819:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXContext.g:820:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:820:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:821:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_18); 

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

            // InternalXContext.g:837:3: (otherlv_2= 'axiom' | otherlv_3= 'axm' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            else if ( (LA18_0==27) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalXContext.g:838:4: otherlv_2= 'axiom'
                    {
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getXIndividualAxiomAccess().getAxiomKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXContext.g:843:4: otherlv_3= 'axm'
                    {
                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getXIndividualAxiomAccess().getAxmKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalXContext.g:848:3: ( (lv_name_4_0= RULE_XLABEL ) )
            // InternalXContext.g:849:4: (lv_name_4_0= RULE_XLABEL )
            {
            // InternalXContext.g:849:4: (lv_name_4_0= RULE_XLABEL )
            // InternalXContext.g:850:5: lv_name_4_0= RULE_XLABEL
            {
            lv_name_4_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_16); 

            					newLeafNode(lv_name_4_0, grammarAccess.getXIndividualAxiomAccess().getNameXLABELTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXIndividualAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"ac.soton.xeventb.xcontext.XContext.XLABEL");
            				

            }


            }

            // InternalXContext.g:866:3: ( (lv_predicate_5_0= ruleXFormula ) )
            // InternalXContext.g:867:4: (lv_predicate_5_0= ruleXFormula )
            {
            // InternalXContext.g:867:4: (lv_predicate_5_0= ruleXFormula )
            // InternalXContext.g:868:5: lv_predicate_5_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXIndividualAxiomAccess().getPredicateXFormulaParserRuleCall_4_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_predicate_5_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXIndividualAxiomRule());
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
    // $ANTLR end "ruleXIndividualAxiom"


    // $ANTLR start "entryRuleXIndividualTheorem"
    // InternalXContext.g:889:1: entryRuleXIndividualTheorem returns [EObject current=null] : iv_ruleXIndividualTheorem= ruleXIndividualTheorem EOF ;
    public final EObject entryRuleXIndividualTheorem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIndividualTheorem = null;


        try {
            // InternalXContext.g:889:59: (iv_ruleXIndividualTheorem= ruleXIndividualTheorem EOF )
            // InternalXContext.g:890:2: iv_ruleXIndividualTheorem= ruleXIndividualTheorem EOF
            {
             newCompositeNode(grammarAccess.getXIndividualTheoremRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXIndividualTheorem=ruleXIndividualTheorem();

            state._fsp--;

             current =iv_ruleXIndividualTheorem; 
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
    // $ANTLR end "entryRuleXIndividualTheorem"


    // $ANTLR start "ruleXIndividualTheorem"
    // InternalXContext.g:896:1: ruleXIndividualTheorem returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) ) ;
    public final EObject ruleXIndividualTheorem() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_theorem_2_1=null;
        Token lv_theorem_2_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_4_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:902:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) ) )
            // InternalXContext.g:903:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) )
            {
            // InternalXContext.g:903:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) )
            // InternalXContext.g:904:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) ) ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) )
            {
            // InternalXContext.g:904:3: ()
            // InternalXContext.g:905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXIndividualTheoremAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalXContext.g:911:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXContext.g:912:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:912:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:913:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_19); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXIndividualTheoremAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXIndividualTheoremRule());
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

            // InternalXContext.g:929:3: ( ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) ) )
            // InternalXContext.g:930:4: ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) )
            {
            // InternalXContext.g:930:4: ( (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' ) )
            // InternalXContext.g:931:5: (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' )
            {
            // InternalXContext.g:931:5: (lv_theorem_2_1= 'theorem' | lv_theorem_2_2= 'thm' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            else if ( (LA20_0==29) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalXContext.g:932:6: lv_theorem_2_1= 'theorem'
                    {
                    lv_theorem_2_1=(Token)match(input,28,FollowSets000.FOLLOW_17); 

                    						newLeafNode(lv_theorem_2_1, grammarAccess.getXIndividualTheoremAccess().getTheoremTheoremKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXIndividualTheoremRule());
                    						}
                    						setWithLastConsumed(current, "theorem", lv_theorem_2_1 != null, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalXContext.g:943:6: lv_theorem_2_2= 'thm'
                    {
                    lv_theorem_2_2=(Token)match(input,29,FollowSets000.FOLLOW_17); 

                    						newLeafNode(lv_theorem_2_2, grammarAccess.getXIndividualTheoremAccess().getTheoremThmKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXIndividualTheoremRule());
                    						}
                    						setWithLastConsumed(current, "theorem", lv_theorem_2_2 != null, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalXContext.g:956:3: ( (lv_name_3_0= RULE_XLABEL ) )
            // InternalXContext.g:957:4: (lv_name_3_0= RULE_XLABEL )
            {
            // InternalXContext.g:957:4: (lv_name_3_0= RULE_XLABEL )
            // InternalXContext.g:958:5: lv_name_3_0= RULE_XLABEL
            {
            lv_name_3_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_16); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXIndividualTheoremAccess().getNameXLABELTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXIndividualTheoremRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xeventb.xcontext.XContext.XLABEL");
            				

            }


            }

            // InternalXContext.g:974:3: ( (lv_predicate_4_0= ruleXFormula ) )
            // InternalXContext.g:975:4: (lv_predicate_4_0= ruleXFormula )
            {
            // InternalXContext.g:975:4: (lv_predicate_4_0= ruleXFormula )
            // InternalXContext.g:976:5: lv_predicate_4_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXIndividualTheoremAccess().getPredicateXFormulaParserRuleCall_4_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_predicate_4_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXIndividualTheoremRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_4_0,
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
    // $ANTLR end "ruleXIndividualTheorem"


    // $ANTLR start "entryRuleXFormula"
    // InternalXContext.g:997:1: entryRuleXFormula returns [String current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final String entryRuleXFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXFormula = null;


        try {
            // InternalXContext.g:997:48: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalXContext.g:998:2: iv_ruleXFormula= ruleXFormula EOF
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
    // InternalXContext.g:1004:1: ruleXFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+ ;
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
            // InternalXContext.g:1010:2: ( (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+ )
            // InternalXContext.g:1011:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+
            {
            // InternalXContext.g:1011:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+
            int cnt21=0;
            loop21:
            do {
                int alt21=7;
                switch ( input.LA(1) ) {
                case 42:
                case 43:
                case 44:
                case 45:
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
                case 65:
                case 66:
                    {
                    alt21=1;
                    }
                    break;
                case 20:
                case 24:
                case 25:
                case 46:
                case 47:
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
                case 91:
                case 92:
                    {
                    alt21=2;
                    }
                    break;
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
                case 40:
                case 41:
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
                case 112:
                case 113:
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
                case 125:
                case 126:
                    {
                    alt21=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt21=4;
                    }
                    break;
                case RULE_INT:
                    {
                    alt21=5;
                    }
                    break;
                case RULE_UNTRANSLATED_TOKEN:
                    {
                    alt21=6;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalXContext.g:1012:3: this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0());
            	    		
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    this_EVENTB_IDENTIFIER_KEYWORD_0=ruleEVENTB_IDENTIFIER_KEYWORD();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_IDENTIFIER_KEYWORD_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalXContext.g:1023:3: this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1());
            	    		
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    this_EVENTB_PREDICATE_SYMBOLS_1=ruleEVENTB_PREDICATE_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_PREDICATE_SYMBOLS_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalXContext.g:1034:3: this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2());
            	    		
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    this_EVENTB_EXPRESSION_SYMBOLS_2=ruleEVENTB_EXPRESSION_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_EXPRESSION_SYMBOLS_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalXContext.g:1045:3: this_ID_3= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); 

            	    			current.merge(this_ID_3);
            	    		

            	    			newLeafNode(this_ID_3, grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalXContext.g:1053:3: this_INT_4= RULE_INT
            	    {
            	    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_20); 

            	    			current.merge(this_INT_4);
            	    		

            	    			newLeafNode(this_INT_4, grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalXContext.g:1061:3: this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN
            	    {
            	    this_UNTRANSLATED_TOKEN_5=(Token)match(input,RULE_UNTRANSLATED_TOKEN,FollowSets000.FOLLOW_20); 

            	    			current.merge(this_UNTRANSLATED_TOKEN_5);
            	    		

            	    			newLeafNode(this_UNTRANSLATED_TOKEN_5, grammarAccess.getXFormulaAccess().getUNTRANSLATED_TOKENTerminalRuleCall_5());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // InternalXContext.g:1072:1: entryRuleXType returns [String current=null] : iv_ruleXType= ruleXType EOF ;
    public final String entryRuleXType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXType = null;


        try {
            // InternalXContext.g:1072:45: (iv_ruleXType= ruleXType EOF )
            // InternalXContext.g:1073:2: iv_ruleXType= ruleXType EOF
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
    // InternalXContext.g:1079:1: ruleXType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* ) ;
    public final AntlrDatatypeRuleToken ruleXType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_XTypePrimitive_0 = null;

        AntlrDatatypeRuleToken this_XTYPEOPERATOR_1 = null;

        AntlrDatatypeRuleToken this_XTypePrimitive_2 = null;



        	enterRule();

        try {
            // InternalXContext.g:1085:2: ( (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* ) )
            // InternalXContext.g:1086:2: (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* )
            {
            // InternalXContext.g:1086:2: (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* )
            // InternalXContext.g:1087:3: this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )*
            {

            			newCompositeNode(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_21);
            this_XTypePrimitive_0=ruleXTypePrimitive();

            state._fsp--;


            			current.merge(this_XTypePrimitive_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXContext.g:1097:3: (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=30 && LA22_0<=41)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXContext.g:1098:4: this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive
            	    {

            	    				newCompositeNode(grammarAccess.getXTypeAccess().getXTYPEOPERATORParserRuleCall_1_0());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    this_XTYPEOPERATOR_1=ruleXTYPEOPERATOR();

            	    state._fsp--;


            	    				current.merge(this_XTYPEOPERATOR_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_1_1());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    this_XTypePrimitive_2=ruleXTypePrimitive();

            	    state._fsp--;


            	    				current.merge(this_XTypePrimitive_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalXContext.g:1123:1: entryRuleXTYPEOPERATOR returns [String current=null] : iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF ;
    public final String entryRuleXTYPEOPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXTYPEOPERATOR = null;


        try {
            // InternalXContext.g:1123:53: (iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF )
            // InternalXContext.g:1124:2: iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF
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
    // InternalXContext.g:1130:1: ruleXTYPEOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' ) ;
    public final AntlrDatatypeRuleToken ruleXTYPEOPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:1136:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' ) )
            // InternalXContext.g:1137:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' )
            {
            // InternalXContext.g:1137:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' )
            int alt23=12;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt23=1;
                }
                break;
            case 31:
                {
                alt23=2;
                }
                break;
            case 32:
                {
                alt23=3;
                }
                break;
            case 33:
                {
                alt23=4;
                }
                break;
            case 34:
                {
                alt23=5;
                }
                break;
            case 35:
                {
                alt23=6;
                }
                break;
            case 36:
                {
                alt23=7;
                }
                break;
            case 37:
                {
                alt23=8;
                }
                break;
            case 38:
                {
                alt23=9;
                }
                break;
            case 39:
                {
                alt23=10;
                }
                break;
            case 40:
                {
                alt23=11;
                }
                break;
            case 41:
                {
                alt23=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalXContext.g:1138:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1144:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1150:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1156:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1162:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1168:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:1174:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:1180:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:1186:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:1192:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:1198:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:1204:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:1213:1: entryRuleXTypePrimitive returns [String current=null] : iv_ruleXTypePrimitive= ruleXTypePrimitive EOF ;
    public final String entryRuleXTypePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXTypePrimitive = null;


        try {
            // InternalXContext.g:1213:54: (iv_ruleXTypePrimitive= ruleXTypePrimitive EOF )
            // InternalXContext.g:1214:2: iv_ruleXTypePrimitive= ruleXTypePrimitive EOF
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
    // InternalXContext.g:1220:1: ruleXTypePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleXTypePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_XType_6 = null;

        AntlrDatatypeRuleToken this_XType_10 = null;

        AntlrDatatypeRuleToken this_XType_14 = null;



        	enterRule();

        try {
            // InternalXContext.g:1226:2: ( (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) ) )
            // InternalXContext.g:1227:2: (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) )
            {
            // InternalXContext.g:1227:2: (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) )
            int alt24=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt24=1;
                }
                break;
            case 42:
                {
                alt24=2;
                }
                break;
            case 43:
                {
                alt24=3;
                }
                break;
            case 44:
                {
                alt24=4;
                }
                break;
            case 45:
                {
                alt24=5;
                }
                break;
            case 46:
                {
                alt24=6;
                }
                break;
            case 48:
                {
                alt24=7;
                }
                break;
            case 49:
                {
                alt24=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalXContext.g:1228:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1236:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1242:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1248:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1254:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1260:3: (kw= '(' this_XType_6= ruleXType kw= ')' )
                    {
                    // InternalXContext.g:1260:3: (kw= '(' this_XType_6= ruleXType kw= ')' )
                    // InternalXContext.g:1261:4: kw= '(' this_XType_6= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_5_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_XType_6=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:1283:3: (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' )
                    {
                    // InternalXContext.g:1283:3: (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' )
                    // InternalXContext.g:1284:4: kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0());
                    			
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_6_2());
                    			
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_XType_10=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_10);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:1311:3: (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' )
                    {
                    // InternalXContext.g:1311:3: (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' )
                    // InternalXContext.g:1312:4: kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0());
                    			
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_7_2());
                    			
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_XType_14=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_14);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:1342:1: entryRuleEVENTB_IDENTIFIER_KEYWORD returns [String current=null] : iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final String entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_IDENTIFIER_KEYWORD = null;


        try {
            // InternalXContext.g:1342:65: (iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXContext.g:1343:2: iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF
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
    // InternalXContext.g:1349:1: ruleEVENTB_IDENTIFIER_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:1355:2: ( (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) )
            // InternalXContext.g:1356:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            {
            // InternalXContext.g:1356:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            int alt25=23;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt25=1;
                }
                break;
            case 50:
                {
                alt25=2;
                }
                break;
            case 51:
                {
                alt25=3;
                }
                break;
            case 52:
                {
                alt25=4;
                }
                break;
            case 53:
                {
                alt25=5;
                }
                break;
            case 54:
                {
                alt25=6;
                }
                break;
            case 55:
                {
                alt25=7;
                }
                break;
            case 56:
                {
                alt25=8;
                }
                break;
            case 57:
                {
                alt25=9;
                }
                break;
            case 58:
                {
                alt25=10;
                }
                break;
            case 59:
                {
                alt25=11;
                }
                break;
            case 60:
                {
                alt25=12;
                }
                break;
            case 61:
                {
                alt25=13;
                }
                break;
            case 62:
                {
                alt25=14;
                }
                break;
            case 63:
                {
                alt25=15;
                }
                break;
            case 64:
                {
                alt25=16;
                }
                break;
            case 65:
                {
                alt25=17;
                }
                break;
            case 66:
                {
                alt25=18;
                }
                break;
            case 43:
                {
                alt25=19;
                }
                break;
            case 44:
                {
                alt25=20;
                }
                break;
            case 49:
                {
                alt25=21;
                }
                break;
            case 48:
                {
                alt25=22;
                }
                break;
            case 45:
                {
                alt25=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalXContext.g:1357:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1363:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1369:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1375:3: kw= 'bool'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1381:3: kw= 'card'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1387:3: kw= 'dom'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:1393:3: kw= 'finite'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:1399:3: kw= 'id'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:1405:3: kw= 'inter'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:1411:3: kw= 'max'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:1417:3: kw= 'min'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:1423:3: kw= 'mod'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXContext.g:1429:3: kw= 'pred'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXContext.g:1435:3: kw= 'prj1'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXContext.g:1441:3: kw= 'prj2'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXContext.g:1447:3: kw= 'ran'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXContext.g:1453:3: kw= 'succ'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXContext.g:1459:3: kw= 'union'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXContext.g:1465:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXContext.g:1471:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXContext.g:1477:3: kw= '\\u21191'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXContext.g:1483:3: kw= '\\u2119'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXContext.g:1489:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:1498:1: entryRuleEVENTB_PREDICATE_SYMBOLS returns [String current=null] : iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final String entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_PREDICATE_SYMBOLS = null;


        try {
            // InternalXContext.g:1498:64: (iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXContext.g:1499:2: iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF
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
    // InternalXContext.g:1505:1: ruleEVENTB_PREDICATE_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:1511:2: ( (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) )
            // InternalXContext.g:1512:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            {
            // InternalXContext.g:1512:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            int alt26=31;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt26=1;
                }
                break;
            case 47:
                {
                alt26=2;
                }
                break;
            case 67:
                {
                alt26=3;
                }
                break;
            case 68:
                {
                alt26=4;
                }
                break;
            case 69:
                {
                alt26=5;
                }
                break;
            case 70:
                {
                alt26=6;
                }
                break;
            case 71:
                {
                alt26=7;
                }
                break;
            case 72:
                {
                alt26=8;
                }
                break;
            case 73:
                {
                alt26=9;
                }
                break;
            case 74:
                {
                alt26=10;
                }
                break;
            case 75:
                {
                alt26=11;
                }
                break;
            case 76:
                {
                alt26=12;
                }
                break;
            case 77:
                {
                alt26=13;
                }
                break;
            case 78:
                {
                alt26=14;
                }
                break;
            case 79:
                {
                alt26=15;
                }
                break;
            case 80:
                {
                alt26=16;
                }
                break;
            case 20:
                {
                alt26=17;
                }
                break;
            case 25:
                {
                alt26=18;
                }
                break;
            case 81:
                {
                alt26=19;
                }
                break;
            case 82:
                {
                alt26=20;
                }
                break;
            case 83:
                {
                alt26=21;
                }
                break;
            case 84:
                {
                alt26=22;
                }
                break;
            case 85:
                {
                alt26=23;
                }
                break;
            case 86:
                {
                alt26=24;
                }
                break;
            case 24:
                {
                alt26=25;
                }
                break;
            case 87:
                {
                alt26=26;
                }
                break;
            case 88:
                {
                alt26=27;
                }
                break;
            case 89:
                {
                alt26=28;
                }
                break;
            case 90:
                {
                alt26=29;
                }
                break;
            case 91:
                {
                alt26=30;
                }
                break;
            case 92:
                {
                alt26=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalXContext.g:1513:3: kw= '('
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1519:3: kw= ')'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1525:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1531:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1537:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1543:3: kw= '&'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:1549:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:1555:3: kw= '\\u00AC'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:1561:3: kw= '\\u22A4'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:1567:3: kw= '\\u22A5'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:1573:3: kw= '\\u2200'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:1579:3: kw= '!'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXContext.g:1585:3: kw= '\\u2203'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXContext.g:1591:3: kw= '#'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXContext.g:1597:3: kw= ','
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXContext.g:1603:3: kw= '\\u00B7'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXContext.g:1609:3: kw= '.'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXContext.g:1615:3: kw= '='
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXContext.g:1621:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXContext.g:1627:3: kw= '\\u2264'
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXContext.g:1633:3: kw= '<'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXContext.g:1639:3: kw= '\\u2265'
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXContext.g:1645:3: kw= '>'
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXContext.g:1651:3: kw= '\\u2208'
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXContext.g:1657:3: kw= ':'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXContext.g:1663:3: kw= '\\u2209'
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXContext.g:1669:3: kw= '\\u2282'
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXContext.g:1675:3: kw= '\\u2284'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXContext.g:1681:3: kw= '\\u2286'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXContext.g:1687:3: kw= '\\u2288'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXContext.g:1693:3: kw= 'partition'
                    {
                    kw=(Token)match(input,92,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:1702:1: entryRuleEVENTB_EXPRESSION_SYMBOLS returns [String current=null] : iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final String entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_EXPRESSION_SYMBOLS = null;


        try {
            // InternalXContext.g:1702:65: (iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXContext.g:1703:2: iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF
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
    // InternalXContext.g:1709:1: ruleEVENTB_EXPRESSION_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXContext.g:1715:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) )
            // InternalXContext.g:1716:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            {
            // InternalXContext.g:1716:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            int alt27=45;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt27=1;
                }
                break;
            case 31:
                {
                alt27=2;
                }
                break;
            case 32:
                {
                alt27=3;
                }
                break;
            case 33:
                {
                alt27=4;
                }
                break;
            case 34:
                {
                alt27=5;
                }
                break;
            case 35:
                {
                alt27=6;
                }
                break;
            case 36:
                {
                alt27=7;
                }
                break;
            case 37:
                {
                alt27=8;
                }
                break;
            case 38:
                {
                alt27=9;
                }
                break;
            case 39:
                {
                alt27=10;
                }
                break;
            case 40:
                {
                alt27=11;
                }
                break;
            case 93:
                {
                alt27=12;
                }
                break;
            case 94:
                {
                alt27=13;
                }
                break;
            case 95:
                {
                alt27=14;
                }
                break;
            case 96:
                {
                alt27=15;
                }
                break;
            case 97:
                {
                alt27=16;
                }
                break;
            case 98:
                {
                alt27=17;
                }
                break;
            case 99:
                {
                alt27=18;
                }
                break;
            case 41:
                {
                alt27=19;
                }
                break;
            case 100:
                {
                alt27=20;
                }
                break;
            case 101:
                {
                alt27=21;
                }
                break;
            case 102:
                {
                alt27=22;
                }
                break;
            case 103:
                {
                alt27=23;
                }
                break;
            case 104:
                {
                alt27=24;
                }
                break;
            case 105:
                {
                alt27=25;
                }
                break;
            case 106:
                {
                alt27=26;
                }
                break;
            case 107:
                {
                alt27=27;
                }
                break;
            case 108:
                {
                alt27=28;
                }
                break;
            case 109:
                {
                alt27=29;
                }
                break;
            case 110:
                {
                alt27=30;
                }
                break;
            case 111:
                {
                alt27=31;
                }
                break;
            case 112:
                {
                alt27=32;
                }
                break;
            case 113:
                {
                alt27=33;
                }
                break;
            case 115:
                {
                alt27=34;
                }
                break;
            case 116:
                {
                alt27=35;
                }
                break;
            case 117:
                {
                alt27=36;
                }
                break;
            case 118:
                {
                alt27=37;
                }
                break;
            case 119:
                {
                alt27=38;
                }
                break;
            case 120:
                {
                alt27=39;
                }
                break;
            case 121:
                {
                alt27=40;
                }
                break;
            case 122:
                {
                alt27=41;
                }
                break;
            case 123:
                {
                alt27=42;
                }
                break;
            case 124:
                {
                alt27=43;
                }
                break;
            case 125:
                {
                alt27=44;
                }
                break;
            case 126:
                {
                alt27=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalXContext.g:1717:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:1723:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXContext.g:1729:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXContext.g:1735:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXContext.g:1741:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXContext.g:1747:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXContext.g:1753:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXContext.g:1759:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXContext.g:1765:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXContext.g:1771:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXContext.g:1777:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXContext.g:1783:3: kw= '{'
                    {
                    kw=(Token)match(input,93,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXContext.g:1789:3: kw= '}'
                    {
                    kw=(Token)match(input,94,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXContext.g:1795:3: kw= '\\u21A6'
                    {
                    kw=(Token)match(input,95,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXContext.g:1801:3: kw= '\\u2205'
                    {
                    kw=(Token)match(input,96,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXContext.g:1807:3: kw= '\\u2229'
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXContext.g:1813:3: kw= '\\u222A'
                    {
                    kw=(Token)match(input,98,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXContext.g:1819:3: kw= '\\u2216'
                    {
                    kw=(Token)match(input,99,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXContext.g:1825:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXContext.g:1831:3: kw= '['
                    {
                    kw=(Token)match(input,100,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXContext.g:1837:3: kw= ']'
                    {
                    kw=(Token)match(input,101,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXContext.g:1843:3: kw= '\\uE103'
                    {
                    kw=(Token)match(input,102,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXContext.g:1849:3: kw= '\\u2218'
                    {
                    kw=(Token)match(input,103,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXContext.g:1855:3: kw= ';'
                    {
                    kw=(Token)match(input,104,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXContext.g:1861:3: kw= '\\u2297'
                    {
                    kw=(Token)match(input,105,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXContext.g:1867:3: kw= '\\u2225'
                    {
                    kw=(Token)match(input,106,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXContext.g:1873:3: kw= '\\u223C'
                    {
                    kw=(Token)match(input,107,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXContext.g:1879:3: kw= '\\u25C1'
                    {
                    kw=(Token)match(input,108,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXContext.g:1885:3: kw= '\\u2A64'
                    {
                    kw=(Token)match(input,109,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXContext.g:1891:3: kw= '\\u25B7'
                    {
                    kw=(Token)match(input,110,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXContext.g:1897:3: kw= '\\u2A65'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalXContext.g:1903:3: kw= '\\u03BB'
                    {
                    kw=(Token)match(input,112,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalXContext.g:1909:3: (kw= '%' kw= '\\u22C2' )
                    {
                    // InternalXContext.g:1909:3: (kw= '%' kw= '\\u22C2' )
                    // InternalXContext.g:1910:4: kw= '%' kw= '\\u22C2'
                    {
                    kw=(Token)match(input,113,FollowSets000.FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0());
                    			
                    kw=(Token)match(input,114,FollowSets000.FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalXContext.g:1922:3: kw= '\\u22C3'
                    {
                    kw=(Token)match(input,115,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalXContext.g:1928:3: kw= '\\u2223'
                    {
                    kw=(Token)match(input,116,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalXContext.g:1934:3: kw= '\\u2025'
                    {
                    kw=(Token)match(input,117,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalXContext.g:1940:3: kw= '+'
                    {
                    kw=(Token)match(input,118,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalXContext.g:1946:3: kw= '\\u2212'
                    {
                    kw=(Token)match(input,119,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalXContext.g:1952:3: kw= '-'
                    {
                    kw=(Token)match(input,120,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalXContext.g:1958:3: kw= '\\u2217'
                    {
                    kw=(Token)match(input,121,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalXContext.g:1964:3: kw= '*'
                    {
                    kw=(Token)match(input,122,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalXContext.g:1970:3: kw= '\\u00F7'
                    {
                    kw=(Token)match(input,123,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalXContext.g:1976:3: kw= '/'
                    {
                    kw=(Token)match(input,124,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalXContext.g:1982:3: kw= '^'
                    {
                    kw=(Token)match(input,125,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalXContext.g:1988:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,126,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:1997:1: entryRuleXRecord returns [EObject current=null] : iv_ruleXRecord= ruleXRecord EOF ;
    public final EObject entryRuleXRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRecord = null;


        try {
            // InternalXContext.g:1997:48: (iv_ruleXRecord= ruleXRecord EOF )
            // InternalXContext.g:1998:2: iv_ruleXRecord= ruleXRecord EOF
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
    // InternalXContext.g:2004:1: ruleXRecord returns [EObject current=null] : ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'record' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )? ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )* otherlv_10= 'end' ) ;
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
            // InternalXContext.g:2010:2: ( ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'record' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )? ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )* otherlv_10= 'end' ) )
            // InternalXContext.g:2011:2: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'record' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )? ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )* otherlv_10= 'end' )
            {
            // InternalXContext.g:2011:2: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'record' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )? ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )* otherlv_10= 'end' )
            // InternalXContext.g:2012:3: () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'record' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )? ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )* otherlv_10= 'end'
            {
            // InternalXContext.g:2012:3: ()
            // InternalXContext.g:2013:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXRecordAccess().getRecordAction_0(),
            					current);
            			

            }

            // InternalXContext.g:2019:3: ( (lv_extended_1_0= 'extended' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==127) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXContext.g:2020:4: (lv_extended_1_0= 'extended' )
                    {
                    // InternalXContext.g:2020:4: (lv_extended_1_0= 'extended' )
                    // InternalXContext.g:2021:5: lv_extended_1_0= 'extended'
                    {
                    lv_extended_1_0=(Token)match(input,127,FollowSets000.FOLLOW_25); 

                    					newLeafNode(lv_extended_1_0, grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXRecordRule());
                    					}
                    					setWithLastConsumed(current, "extended", lv_extended_1_0 != null, "extended");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,128,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXRecordAccess().getRecordKeyword_2());
            		
            // InternalXContext.g:2037:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXContext.g:2038:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXContext.g:2038:4: (lv_name_3_0= RULE_ID )
            // InternalXContext.g:2039:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

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

            // InternalXContext.g:2055:3: (otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==129) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXContext.g:2056:4: otherlv_4= 'inherits' ( (lv_inheritsNames_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,129,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getXRecordAccess().getInheritsKeyword_4_0());
                    			
                    // InternalXContext.g:2060:4: ( (lv_inheritsNames_5_0= RULE_ID ) )
                    // InternalXContext.g:2061:5: (lv_inheritsNames_5_0= RULE_ID )
                    {
                    // InternalXContext.g:2061:5: (lv_inheritsNames_5_0= RULE_ID )
                    // InternalXContext.g:2062:6: lv_inheritsNames_5_0= RULE_ID
                    {
                    lv_inheritsNames_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_27); 

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

            // InternalXContext.g:2079:3: ( (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) ) | (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) ) )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==130) ) {
                    alt30=1;
                }
                else if ( (LA30_0==131) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalXContext.g:2080:4: (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) )
            	    {
            	    // InternalXContext.g:2080:4: (otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) ) )
            	    // InternalXContext.g:2081:5: otherlv_6= 'field' ( (lv_fields_7_0= ruleField ) )
            	    {
            	    otherlv_6=(Token)match(input,130,FollowSets000.FOLLOW_7); 

            	    					newLeafNode(otherlv_6, grammarAccess.getXRecordAccess().getFieldKeyword_5_0_0());
            	    				
            	    // InternalXContext.g:2085:5: ( (lv_fields_7_0= ruleField ) )
            	    // InternalXContext.g:2086:6: (lv_fields_7_0= ruleField )
            	    {
            	    // InternalXContext.g:2086:6: (lv_fields_7_0= ruleField )
            	    // InternalXContext.g:2087:7: lv_fields_7_0= ruleField
            	    {

            	    							newCompositeNode(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_5_0_1_0());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_27);
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
            	    // InternalXContext.g:2106:4: (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) )
            	    {
            	    // InternalXContext.g:2106:4: (otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) ) )
            	    // InternalXContext.g:2107:5: otherlv_8= 'constraint' ( (lv_constraints_9_0= ruleXConstraint ) )
            	    {
            	    otherlv_8=(Token)match(input,131,FollowSets000.FOLLOW_8); 

            	    					newLeafNode(otherlv_8, grammarAccess.getXRecordAccess().getConstraintKeyword_5_1_0());
            	    				
            	    // InternalXContext.g:2111:5: ( (lv_constraints_9_0= ruleXConstraint ) )
            	    // InternalXContext.g:2112:6: (lv_constraints_9_0= ruleXConstraint )
            	    {
            	    // InternalXContext.g:2112:6: (lv_constraints_9_0= ruleXConstraint )
            	    // InternalXContext.g:2113:7: lv_constraints_9_0= ruleXConstraint
            	    {

            	    							newCompositeNode(grammarAccess.getXRecordAccess().getConstraintsXConstraintParserRuleCall_5_1_1_0());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_27);
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
            	    break loop30;
                }
            } while (true);

            otherlv_10=(Token)match(input,132,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:2140:1: entryRuleFieldType returns [String current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final String entryRuleFieldType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldType = null;


        try {
            // InternalXContext.g:2140:49: (iv_ruleFieldType= ruleFieldType EOF )
            // InternalXContext.g:2141:2: iv_ruleFieldType= ruleFieldType EOF
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
    // InternalXContext.g:2147:1: ruleFieldType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleFieldType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalXContext.g:2153:2: ( (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD ) )
            // InternalXContext.g:2154:2: (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD )
            {
            // InternalXContext.g:2154:2: (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=42 && LA31_0<=45)||(LA31_0>=48 && LA31_0<=66)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalXContext.g:2155:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXContext.g:2163:3: this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD
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
    // InternalXContext.g:2177:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalXContext.g:2177:46: (iv_ruleField= ruleField EOF )
            // InternalXContext.g:2178:2: iv_ruleField= ruleField EOF
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
    // InternalXContext.g:2184:1: ruleField returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_multiplicity_4_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:2190:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) ) )
            // InternalXContext.g:2191:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) )
            {
            // InternalXContext.g:2191:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) )
            // InternalXContext.g:2192:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) )
            {
            // InternalXContext.g:2192:3: ()
            // InternalXContext.g:2193:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            // InternalXContext.g:2199:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXContext.g:2200:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:2200:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:2201:5: lv_comment_1_0= RULE_STRING
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

            // InternalXContext.g:2217:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXContext.g:2218:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXContext.g:2218:4: (lv_name_2_0= RULE_ID )
            // InternalXContext.g:2219:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); 

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

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getColonKeyword_3());
            		
            // InternalXContext.g:2239:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=133 && LA33_0<=135)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXContext.g:2240:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalXContext.g:2240:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalXContext.g:2241:5: lv_multiplicity_4_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_4_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_29);
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

            // InternalXContext.g:2258:3: ( (lv_type_5_0= ruleFieldType ) )
            // InternalXContext.g:2259:4: (lv_type_5_0= ruleFieldType )
            {
            // InternalXContext.g:2259:4: (lv_type_5_0= ruleFieldType )
            // InternalXContext.g:2260:5: lv_type_5_0= ruleFieldType
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
    // InternalXContext.g:2281:1: entryRuleXConstraint returns [EObject current=null] : iv_ruleXConstraint= ruleXConstraint EOF ;
    public final EObject entryRuleXConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstraint = null;


        try {
            // InternalXContext.g:2281:52: (iv_ruleXConstraint= ruleXConstraint EOF )
            // InternalXContext.g:2282:2: iv_ruleXConstraint= ruleXConstraint EOF
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
    // InternalXContext.g:2288:1: ruleXConstraint returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXContext.g:2294:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXContext.g:2295:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXContext.g:2295:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXContext.g:2296:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXContext.g:2296:3: ()
            // InternalXContext.g:2297:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            // InternalXContext.g:2303:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXContext.g:2304:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXContext.g:2304:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXContext.g:2305:5: lv_comment_1_0= RULE_STRING
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

            // InternalXContext.g:2321:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXContext.g:2322:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXContext.g:2322:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXContext.g:2323:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FollowSets000.FOLLOW_16); 

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

            // InternalXContext.g:2339:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXContext.g:2340:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXContext.g:2340:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXContext.g:2341:5: lv_predicate_3_0= ruleXFormula
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
    // InternalXContext.g:2362:1: ruleMultiplicity returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXContext.g:2368:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) )
            // InternalXContext.g:2369:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            {
            // InternalXContext.g:2369:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt35=1;
                }
                break;
            case 134:
                {
                alt35=2;
                }
                break;
            case 135:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalXContext.g:2370:3: (enumLiteral_0= 'one' )
                    {
                    // InternalXContext.g:2370:3: (enumLiteral_0= 'one' )
                    // InternalXContext.g:2371:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,133,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:2378:3: (enumLiteral_1= 'many' )
                    {
                    // InternalXContext.g:2378:3: (enumLiteral_1= 'many' )
                    // InternalXContext.g:2379:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,134,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:2386:3: (enumLiteral_2= 'opt' )
                    {
                    // InternalXContext.g:2386:3: (enumLiteral_2= 'opt' )
                    // InternalXContext.g:2387:4: enumLiteral_2= 'opt'
                    {
                    enumLiteral_2=(Token)match(input,135,FollowSets000.FOLLOW_2); 

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


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\1\14\uffff";
    static final String dfa_3s = "\1\4\4\uffff\1\25\7\uffff";
    static final String dfa_4s = "\1\u0080\4\uffff\1\35\7\uffff";
    static final String dfa_5s = "\1\uffff\1\13\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\11\uffff\1\2\2\3\1\4\1\7\1\12\1\uffff\1\6\2\10\2\uffff\2\13\2\14\141\uffff\2\11",
            "",
            "",
            "",
            "",
            "\1\6\2\10\2\uffff\2\13\2\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 127:3: ( (otherlv_4= 'extends' ( ( ruleQualifiedName ) )+ ) | ( (otherlv_6= 'extend' | otherlv_7= 'ext' ) ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'sets' ( (lv_orderedChildren_10_0= ruleXCarrierSet ) )+ ) | ( (lv_orderedChildren_11_0= ruleXIndividualCarrierSet ) ) | (otherlv_12= 'constants' ( (lv_orderedChildren_13_0= ruleXConstant ) )+ ) | ( (lv_orderedChildren_14_0= ruleXIndividualConstant ) ) | ( (lv_orderedChildren_15_0= ruleXRecord ) ) | (otherlv_16= 'axioms' ( (lv_orderedChildren_17_0= ruleXAxiom ) )+ ) | ( (lv_orderedChildren_18_0= ruleXIndividualAxiom ) ) | ( (lv_orderedChildren_19_0= ruleXIndividualTheorem ) ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000003CEFC012L,0x8000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000003CEFC032L,0x8000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003CEFC052L,0x8000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00037C0000000020L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xFFFFFFFFC31001A0L,0x7FFBFFFFFFFFFFFFL});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xFFFFFFFFC31001A2L,0x7FFBFFFFFFFFFFFFL});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000003FFC0000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001CL});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xFFFF3C0000000020L,0x0000000000000007L,0x00000000000000E0L});
    }


}