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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_UNTRANSLATED_TOKEN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'refines'", "'sees'", "'contains'", "'variables'", "'vars'", "'invariants'", "'invs'", "'includes'", "'to'", "'as'", "'.'", "'variable'", "'var'", "':'", "'='", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'\\u00D7'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'('", "')'", "'\\u2119'", "'\\u21191'", "'theorem'", "'invariant'", "'variant'", "'event'", "'extends'", "'any'", "'where'", "'when'", "'then'", "'begin'", "'with'", "'end'", "'synchronises'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'%'", "'\\u22C2'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'extended'", "'ext'", "'refined'", "'ref'", "'record'", "'rec'", "'inherits'", "'ihr'", "'field'", "'fld'", "'constraint'", "'ordinary'", "'convergent'", "'anticipated'", "'one'", "'many'", "'opt'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
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
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
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
    // InternalXMachine.g:72:1: ruleMachine returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )? ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )* ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_orderedChildren_5_0 = null;

        EObject lv_orderedChildren_11_0 = null;

        EObject lv_orderedChildren_14_0 = null;

        EObject lv_orderedChildren_15_0 = null;

        EObject lv_orderedChildren_18_0 = null;

        EObject lv_orderedChildren_19_0 = null;

        EObject lv_orderedChildren_20_0 = null;

        EObject lv_orderedChildren_21_0 = null;

        EObject lv_orderedChildren_22_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:78:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )? ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )* ) )
            // InternalXMachine.g:79:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )? ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )* )
            {
            // InternalXMachine.g:79:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )? ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )* )
            // InternalXMachine.g:80:3: () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )? ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )*
            {
            // InternalXMachine.g:80:3: ()
            // InternalXMachine.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMachineAccess().getMachineAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:87:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXMachine.g:88:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:88:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:89:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getMachineAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMachineRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getMachineKeyword_2());
            		
            // InternalXMachine.g:109:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:110:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:110:4: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:111:5: lv_name_3_0= RULE_ID
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

            // InternalXMachine.g:127:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) )
            // InternalXMachine.g:128:4: ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) )
            {
            // InternalXMachine.g:128:4: ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) )
            // InternalXMachine.g:129:5: ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            				
            // InternalXMachine.g:132:5: ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* )
            // InternalXMachine.g:133:6: ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )*
            {
            // InternalXMachine.g:133:6: ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )*
            loop4:
            do {
                int alt4=4;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                    alt4=3;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXMachine.g:134:4: ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) )
            	    {
            	    // InternalXMachine.g:134:4: ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) )
            	    // InternalXMachine.g:135:5: {...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalXMachine.g:135:104: ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ )
            	    // InternalXMachine.g:136:6: ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalXMachine.g:139:9: ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==21) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalXMachine.g:139:10: {...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleMachine", "true");
            	    	    }
            	    	    // InternalXMachine.g:139:19: ( (lv_orderedChildren_5_0= ruleMIncludes ) )
            	    	    // InternalXMachine.g:139:20: (lv_orderedChildren_5_0= ruleMIncludes )
            	    	    {
            	    	    // InternalXMachine.g:139:20: (lv_orderedChildren_5_0= ruleMIncludes )
            	    	    // InternalXMachine.g:140:10: lv_orderedChildren_5_0= ruleMIncludes
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMachineAccess().getOrderedChildrenMIncludesParserRuleCall_4_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_orderedChildren_5_0=ruleMIncludes();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMachineRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"orderedChildren",
            	    	    											lv_orderedChildren_5_0,
            	    	    											"ac.soton.xeventb.xmachine.XMachine.MIncludes");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:162:4: ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalXMachine.g:162:4: ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    // InternalXMachine.g:163:5: {...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalXMachine.g:163:104: ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    // InternalXMachine.g:164:6: ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalXMachine.g:167:9: ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) )
            	    // InternalXMachine.g:167:10: {...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "true");
            	    }
            	    // InternalXMachine.g:167:19: (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) )
            	    // InternalXMachine.g:167:20: otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getRefinesKeyword_4_1_0());
            	    								
            	    // InternalXMachine.g:171:9: ( (otherlv_7= RULE_ID ) )
            	    // InternalXMachine.g:172:10: (otherlv_7= RULE_ID )
            	    {
            	    // InternalXMachine.g:172:10: (otherlv_7= RULE_ID )
            	    // InternalXMachine.g:173:11: otherlv_7= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMachineRule());
            	    											}
            	    										
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    											newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXMachine.g:190:4: ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) )
            	    {
            	    // InternalXMachine.g:190:4: ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) )
            	    // InternalXMachine.g:191:5: {...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalXMachine.g:191:104: ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) )
            	    // InternalXMachine.g:192:6: ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalXMachine.g:195:9: ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) )
            	    // InternalXMachine.g:195:10: {...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "true");
            	    }
            	    // InternalXMachine.g:195:19: (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ )
            	    // InternalXMachine.g:195:20: otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getSeesKeyword_4_2_0());
            	    								
            	    // InternalXMachine.g:199:9: ( (otherlv_9= RULE_ID ) )+
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
            	    	    // InternalXMachine.g:200:10: (otherlv_9= RULE_ID )
            	    	    {
            	    	    // InternalXMachine.g:200:10: (otherlv_9= RULE_ID )
            	    	    // InternalXMachine.g:201:11: otherlv_9= RULE_ID
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getMachineRule());
            	    	    											}
            	    	    										
            	    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    	    											newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getSeesContextCrossReference_4_2_1_0());
            	    	    										

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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            				

            }

            // InternalXMachine.g:225:3: (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:226:4: otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getContainsKeyword_5_0());
                    			
                    // InternalXMachine.g:230:4: ( (lv_orderedChildren_11_0= ruleMContains ) )+
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
                    	    // InternalXMachine.g:231:5: (lv_orderedChildren_11_0= ruleMContains )
                    	    {
                    	    // InternalXMachine.g:231:5: (lv_orderedChildren_11_0= ruleMContains )
                    	    // InternalXMachine.g:232:6: lv_orderedChildren_11_0= ruleMContains
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getOrderedChildrenMContainsParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_orderedChildren_11_0=ruleMContains();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"orderedChildren",
                    	    							lv_orderedChildren_11_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.MContains");
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

            // InternalXMachine.g:250:3: ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )*
            loop11:
            do {
                int alt11=8;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalXMachine.g:251:4: ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ )
            	    {
            	    // InternalXMachine.g:251:4: ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ )
            	    // InternalXMachine.g:252:5: (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+
            	    {
            	    // InternalXMachine.g:252:5: (otherlv_12= 'variables' | otherlv_13= 'vars' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==17) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==18) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalXMachine.g:253:6: otherlv_12= 'variables'
            	            {
            	            otherlv_12=(Token)match(input,17,FOLLOW_8); 

            	            						newLeafNode(otherlv_12, grammarAccess.getMachineAccess().getVariablesKeyword_6_0_0_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalXMachine.g:258:6: otherlv_13= 'vars'
            	            {
            	            otherlv_13=(Token)match(input,18,FOLLOW_8); 

            	            						newLeafNode(otherlv_13, grammarAccess.getMachineAccess().getVarsKeyword_6_0_0_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalXMachine.g:263:5: ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_STRING) ) {
            	            int LA8_2 = input.LA(2);

            	            if ( (LA8_2==RULE_ID) ) {
            	                alt8=1;
            	            }


            	        }
            	        else if ( (LA8_0==RULE_ID) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalXMachine.g:264:6: (lv_orderedChildren_14_0= ruleXMultipleVariable )
            	    	    {
            	    	    // InternalXMachine.g:264:6: (lv_orderedChildren_14_0= ruleXMultipleVariable )
            	    	    // InternalXMachine.g:265:7: lv_orderedChildren_14_0= ruleXMultipleVariable
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMachineAccess().getOrderedChildrenXMultipleVariableParserRuleCall_6_0_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_orderedChildren_14_0=ruleXMultipleVariable();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMachineRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"orderedChildren",
            	    	    								lv_orderedChildren_14_0,
            	    	    								"ac.soton.xeventb.xmachine.XMachine.XMultipleVariable");
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


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:284:4: ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) )
            	    {
            	    // InternalXMachine.g:284:4: ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) )
            	    // InternalXMachine.g:285:5: (lv_orderedChildren_15_0= ruleXIndividualVariable )
            	    {
            	    // InternalXMachine.g:285:5: (lv_orderedChildren_15_0= ruleXIndividualVariable )
            	    // InternalXMachine.g:286:6: lv_orderedChildren_15_0= ruleXIndividualVariable
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getOrderedChildrenXIndividualVariableParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_orderedChildren_15_0=ruleXIndividualVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_15_0,
            	    							"ac.soton.xeventb.xmachine.XMachine.XIndividualVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXMachine.g:304:4: ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ )
            	    {
            	    // InternalXMachine.g:304:4: ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ )
            	    // InternalXMachine.g:305:5: (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+
            	    {
            	    // InternalXMachine.g:305:5: (otherlv_16= 'invariants' | otherlv_17= 'invs' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==19) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==20) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalXMachine.g:306:6: otherlv_16= 'invariants'
            	            {
            	            otherlv_16=(Token)match(input,19,FOLLOW_10); 

            	            						newLeafNode(otherlv_16, grammarAccess.getMachineAccess().getInvariantsKeyword_6_2_0_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalXMachine.g:311:6: otherlv_17= 'invs'
            	            {
            	            otherlv_17=(Token)match(input,20,FOLLOW_10); 

            	            						newLeafNode(otherlv_17, grammarAccess.getMachineAccess().getInvsKeyword_6_2_0_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalXMachine.g:316:5: ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==RULE_STRING) ) {
            	            int LA10_2 = input.LA(2);

            	            if ( (LA10_2==RULE_XLABEL) ) {
            	                alt10=1;
            	            }


            	        }
            	        else if ( (LA10_0==RULE_XLABEL) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalXMachine.g:317:6: (lv_orderedChildren_18_0= ruleXMultipleInvariant )
            	    	    {
            	    	    // InternalXMachine.g:317:6: (lv_orderedChildren_18_0= ruleXMultipleInvariant )
            	    	    // InternalXMachine.g:318:7: lv_orderedChildren_18_0= ruleXMultipleInvariant
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMachineAccess().getOrderedChildrenXMultipleInvariantParserRuleCall_6_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_orderedChildren_18_0=ruleXMultipleInvariant();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMachineRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"orderedChildren",
            	    	    								lv_orderedChildren_18_0,
            	    	    								"ac.soton.xeventb.xmachine.XMachine.XMultipleInvariant");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXMachine.g:337:4: ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) )
            	    {
            	    // InternalXMachine.g:337:4: ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) )
            	    // InternalXMachine.g:338:5: (lv_orderedChildren_19_0= ruleXIndividualInvariant )
            	    {
            	    // InternalXMachine.g:338:5: (lv_orderedChildren_19_0= ruleXIndividualInvariant )
            	    // InternalXMachine.g:339:6: lv_orderedChildren_19_0= ruleXIndividualInvariant
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getOrderedChildrenXIndividualInvariantParserRuleCall_6_3_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_orderedChildren_19_0=ruleXIndividualInvariant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_19_0,
            	    							"ac.soton.xeventb.xmachine.XMachine.XIndividualInvariant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXMachine.g:357:4: ( (lv_orderedChildren_20_0= ruleXRecord ) )
            	    {
            	    // InternalXMachine.g:357:4: ( (lv_orderedChildren_20_0= ruleXRecord ) )
            	    // InternalXMachine.g:358:5: (lv_orderedChildren_20_0= ruleXRecord )
            	    {
            	    // InternalXMachine.g:358:5: (lv_orderedChildren_20_0= ruleXRecord )
            	    // InternalXMachine.g:359:6: lv_orderedChildren_20_0= ruleXRecord
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getOrderedChildrenXRecordParserRuleCall_6_4_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_orderedChildren_20_0=ruleXRecord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_20_0,
            	    							"ac.soton.xeventb.xmachine.XMachine.XRecord");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalXMachine.g:377:4: ( (lv_orderedChildren_21_0= ruleXVariant ) )
            	    {
            	    // InternalXMachine.g:377:4: ( (lv_orderedChildren_21_0= ruleXVariant ) )
            	    // InternalXMachine.g:378:5: (lv_orderedChildren_21_0= ruleXVariant )
            	    {
            	    // InternalXMachine.g:378:5: (lv_orderedChildren_21_0= ruleXVariant )
            	    // InternalXMachine.g:379:6: lv_orderedChildren_21_0= ruleXVariant
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getOrderedChildrenXVariantParserRuleCall_6_5_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_orderedChildren_21_0=ruleXVariant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_21_0,
            	    							"ac.soton.xeventb.xmachine.XMachine.XVariant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalXMachine.g:397:4: ( (lv_orderedChildren_22_0= ruleXEvent ) )
            	    {
            	    // InternalXMachine.g:397:4: ( (lv_orderedChildren_22_0= ruleXEvent ) )
            	    // InternalXMachine.g:398:5: (lv_orderedChildren_22_0= ruleXEvent )
            	    {
            	    // InternalXMachine.g:398:5: (lv_orderedChildren_22_0= ruleXEvent )
            	    // InternalXMachine.g:399:6: lv_orderedChildren_22_0= ruleXEvent
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getOrderedChildrenXEventParserRuleCall_6_6_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_orderedChildren_22_0=ruleXEvent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderedChildren",
            	    							lv_orderedChildren_22_0,
            	    							"ac.soton.xeventb.xmachine.XMachine.XEvent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleMContains"
    // InternalXMachine.g:421:1: entryRuleMContains returns [EObject current=null] : iv_ruleMContains= ruleMContains EOF ;
    public final EObject entryRuleMContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMContains = null;


        try {
            // InternalXMachine.g:421:50: (iv_ruleMContains= ruleMContains EOF )
            // InternalXMachine.g:422:2: iv_ruleMContains= ruleMContains EOF
            {
             newCompositeNode(grammarAccess.getMContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMContains=ruleMContains();

            state._fsp--;

             current =iv_ruleMContains; 
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
    // $ANTLR end "entryRuleMContains"


    // $ANTLR start "ruleMContains"
    // InternalXMachine.g:428:1: ruleMContains returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleMContains() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalXMachine.g:434:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalXMachine.g:435:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalXMachine.g:435:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:436:3: () ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:436:3: ()
            // InternalXMachine.g:437:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMContainsAccess().getContainmentAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:443:3: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:444:4: ( ruleQualifiedName )
            {
            // InternalXMachine.g:444:4: ( ruleQualifiedName )
            // InternalXMachine.g:445:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMContainsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMContainsAccess().getExtensionDiagramOwnerCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleMContains"


    // $ANTLR start "entryRuleMIncludes"
    // InternalXMachine.g:463:1: entryRuleMIncludes returns [EObject current=null] : iv_ruleMIncludes= ruleMIncludes EOF ;
    public final EObject entryRuleMIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIncludes = null;


        try {
            // InternalXMachine.g:463:50: (iv_ruleMIncludes= ruleMIncludes EOF )
            // InternalXMachine.g:464:2: iv_ruleMIncludes= ruleMIncludes EOF
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
    // InternalXMachine.g:470:1: ruleMIncludes returns [EObject current=null] : ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) ;
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
            // InternalXMachine.g:476:2: ( ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) )
            // InternalXMachine.g:477:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            {
            // InternalXMachine.g:477:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            // InternalXMachine.g:478:3: () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            {
            // InternalXMachine.g:478:3: ()
            // InternalXMachine.g:479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMIncludesAccess().getMachineInclusionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:485:3: (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:486:4: otherlv_1= 'includes' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0());
            			
            // InternalXMachine.g:490:4: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:491:5: ( ruleQualifiedName )
            {
            // InternalXMachine.g:491:5: ( ruleQualifiedName )
            // InternalXMachine.g:492:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getMIncludesRule());
            						}
            					

            						newCompositeNode(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0());
            					
            pushFollow(FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalXMachine.g:507:3: (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXMachine.g:508:4: otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getMIncludesAccess().getToKeyword_2_0());
                    			
                    // InternalXMachine.g:512:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXMachine.g:513:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXMachine.g:513:5: (otherlv_4= RULE_ID )
                    // InternalXMachine.g:514:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMIncludesRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_4, grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:526:3: (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:527:4: otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getMIncludesAccess().getAsKeyword_3_0());
                    			
                    // InternalXMachine.g:531:4: ( (lv_prefixes_6_0= RULE_ID ) )
                    // InternalXMachine.g:532:5: (lv_prefixes_6_0= RULE_ID )
                    {
                    // InternalXMachine.g:532:5: (lv_prefixes_6_0= RULE_ID )
                    // InternalXMachine.g:533:6: lv_prefixes_6_0= RULE_ID
                    {
                    lv_prefixes_6_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

                    // InternalXMachine.g:549:4: ( (lv_prefixes_7_0= RULE_ID ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalXMachine.g:550:5: (lv_prefixes_7_0= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:550:5: (lv_prefixes_7_0= RULE_ID )
                    	    // InternalXMachine.g:551:6: lv_prefixes_7_0= RULE_ID
                    	    {
                    	    lv_prefixes_7_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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
                    	    break loop13;
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
    // InternalXMachine.g:572:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXMachine.g:572:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXMachine.g:573:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXMachine.g:579:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:585:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalXMachine.g:586:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalXMachine.g:586:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalXMachine.g:587:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXMachine.g:594:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:595:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,24,FOLLOW_4); 

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


    // $ANTLR start "entryRuleXMultipleVariable"
    // InternalXMachine.g:612:1: entryRuleXMultipleVariable returns [EObject current=null] : iv_ruleXMultipleVariable= ruleXMultipleVariable EOF ;
    public final EObject entryRuleXMultipleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultipleVariable = null;


        try {
            // InternalXMachine.g:612:58: (iv_ruleXMultipleVariable= ruleXMultipleVariable EOF )
            // InternalXMachine.g:613:2: iv_ruleXMultipleVariable= ruleXMultipleVariable EOF
            {
             newCompositeNode(grammarAccess.getXMultipleVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXMultipleVariable=ruleXMultipleVariable();

            state._fsp--;

             current =iv_ruleXMultipleVariable; 
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
    // $ANTLR end "entryRuleXMultipleVariable"


    // $ANTLR start "ruleXMultipleVariable"
    // InternalXMachine.g:619:1: ruleXMultipleVariable returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXMultipleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:625:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:626:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:626:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:627:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:627:3: ()
            // InternalXMachine.g:628:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXMultipleVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:634:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:635:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:635:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:636:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXMultipleVariableAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXMultipleVariableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:652:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:653:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:653:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:654:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXMultipleVariableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXMultipleVariableRule());
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
    // $ANTLR end "ruleXMultipleVariable"


    // $ANTLR start "entryRuleXIndividualVariable"
    // InternalXMachine.g:674:1: entryRuleXIndividualVariable returns [EObject current=null] : iv_ruleXIndividualVariable= ruleXIndividualVariable EOF ;
    public final EObject entryRuleXIndividualVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIndividualVariable = null;


        try {
            // InternalXMachine.g:674:60: (iv_ruleXIndividualVariable= ruleXIndividualVariable EOF )
            // InternalXMachine.g:675:2: iv_ruleXIndividualVariable= ruleXIndividualVariable EOF
            {
             newCompositeNode(grammarAccess.getXIndividualVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXIndividualVariable=ruleXIndividualVariable();

            state._fsp--;

             current =iv_ruleXIndividualVariable; 
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
    // $ANTLR end "entryRuleXIndividualVariable"


    // $ANTLR start "ruleXIndividualVariable"
    // InternalXMachine.g:681:1: ruleXIndividualVariable returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'variable' | otherlv_3= 'var' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? ) ;
    public final EObject ruleXIndividualVariable() throws RecognitionException {
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
            // InternalXMachine.g:687:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'variable' | otherlv_3= 'var' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? ) )
            // InternalXMachine.g:688:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'variable' | otherlv_3= 'var' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? )
            {
            // InternalXMachine.g:688:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'variable' | otherlv_3= 'var' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? )
            // InternalXMachine.g:689:3: () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'variable' | otherlv_3= 'var' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )?
            {
            // InternalXMachine.g:689:3: ()
            // InternalXMachine.g:690:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXIndividualVariableAccess().getTypedVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:696:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:697:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:697:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:698:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXIndividualVariableAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXIndividualVariableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:714:3: (otherlv_2= 'variable' | otherlv_3= 'var' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            else if ( (LA18_0==26) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:715:4: otherlv_2= 'variable'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getXIndividualVariableAccess().getVariableKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:720:4: otherlv_3= 'var'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getXIndividualVariableAccess().getVarKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalXMachine.g:725:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalXMachine.g:726:4: (lv_name_4_0= RULE_ID )
            {
            // InternalXMachine.g:726:4: (lv_name_4_0= RULE_ID )
            // InternalXMachine.g:727:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_4_0, grammarAccess.getXIndividualVariableAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXIndividualVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:743:3: (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:744:4: otherlv_5= ':' ( (lv_type_6_0= ruleXType ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getXIndividualVariableAccess().getColonKeyword_4_0());
                    			
                    // InternalXMachine.g:748:4: ( (lv_type_6_0= ruleXType ) )
                    // InternalXMachine.g:749:5: (lv_type_6_0= ruleXType )
                    {
                    // InternalXMachine.g:749:5: (lv_type_6_0= ruleXType )
                    // InternalXMachine.g:750:6: lv_type_6_0= ruleXType
                    {

                    						newCompositeNode(grammarAccess.getXIndividualVariableAccess().getTypeXTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_6_0=ruleXType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXIndividualVariableRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"ac.soton.xeventb.xmachine.XMachine.XType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:768:3: (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:769:4: otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getXIndividualVariableAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalXMachine.g:773:4: ( (lv_value_8_0= ruleXFormula ) )
                    // InternalXMachine.g:774:5: (lv_value_8_0= ruleXFormula )
                    {
                    // InternalXMachine.g:774:5: (lv_value_8_0= ruleXFormula )
                    // InternalXMachine.g:775:6: lv_value_8_0= ruleXFormula
                    {

                    						newCompositeNode(grammarAccess.getXIndividualVariableAccess().getValueXFormulaParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleXFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXIndividualVariableRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"ac.soton.xeventb.xmachine.XMachine.XFormula");
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
    // $ANTLR end "ruleXIndividualVariable"


    // $ANTLR start "entryRuleXType"
    // InternalXMachine.g:797:1: entryRuleXType returns [String current=null] : iv_ruleXType= ruleXType EOF ;
    public final String entryRuleXType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXType = null;


        try {
            // InternalXMachine.g:797:45: (iv_ruleXType= ruleXType EOF )
            // InternalXMachine.g:798:2: iv_ruleXType= ruleXType EOF
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
    // InternalXMachine.g:804:1: ruleXType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* ) ;
    public final AntlrDatatypeRuleToken ruleXType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_XTypePrimitive_0 = null;

        AntlrDatatypeRuleToken this_XTYPEOPERATOR_1 = null;

        AntlrDatatypeRuleToken this_XTypePrimitive_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:810:2: ( (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* ) )
            // InternalXMachine.g:811:2: (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* )
            {
            // InternalXMachine.g:811:2: (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* )
            // InternalXMachine.g:812:3: this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )*
            {

            			newCompositeNode(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_XTypePrimitive_0=ruleXTypePrimitive();

            state._fsp--;


            			current.merge(this_XTypePrimitive_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXMachine.g:822:3: (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=29 && LA21_0<=40)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXMachine.g:823:4: this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive
            	    {

            	    				newCompositeNode(grammarAccess.getXTypeAccess().getXTYPEOPERATORParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_18);
            	    this_XTYPEOPERATOR_1=ruleXTYPEOPERATOR();

            	    state._fsp--;


            	    				current.merge(this_XTYPEOPERATOR_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:848:1: entryRuleXTYPEOPERATOR returns [String current=null] : iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF ;
    public final String entryRuleXTYPEOPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXTYPEOPERATOR = null;


        try {
            // InternalXMachine.g:848:53: (iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF )
            // InternalXMachine.g:849:2: iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF
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
    // InternalXMachine.g:855:1: ruleXTYPEOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' ) ;
    public final AntlrDatatypeRuleToken ruleXTYPEOPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:861:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' ) )
            // InternalXMachine.g:862:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' )
            {
            // InternalXMachine.g:862:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '\\u00D7' )
            int alt22=12;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt22=1;
                }
                break;
            case 30:
                {
                alt22=2;
                }
                break;
            case 31:
                {
                alt22=3;
                }
                break;
            case 32:
                {
                alt22=4;
                }
                break;
            case 33:
                {
                alt22=5;
                }
                break;
            case 34:
                {
                alt22=6;
                }
                break;
            case 35:
                {
                alt22=7;
                }
                break;
            case 36:
                {
                alt22=8;
                }
                break;
            case 37:
                {
                alt22=9;
                }
                break;
            case 38:
                {
                alt22=10;
                }
                break;
            case 39:
                {
                alt22=11;
                }
                break;
            case 40:
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
                    // InternalXMachine.g:863:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:869:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:875:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:881:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:887:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:893:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:899:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:905:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:911:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:917:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:923:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:929:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalXMachine.g:938:1: entryRuleXTypePrimitive returns [String current=null] : iv_ruleXTypePrimitive= ruleXTypePrimitive EOF ;
    public final String entryRuleXTypePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXTypePrimitive = null;


        try {
            // InternalXMachine.g:938:54: (iv_ruleXTypePrimitive= ruleXTypePrimitive EOF )
            // InternalXMachine.g:939:2: iv_ruleXTypePrimitive= ruleXTypePrimitive EOF
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
    // InternalXMachine.g:945:1: ruleXTypePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleXTypePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_XType_6 = null;

        AntlrDatatypeRuleToken this_XType_10 = null;

        AntlrDatatypeRuleToken this_XType_14 = null;



        	enterRule();

        try {
            // InternalXMachine.g:951:2: ( (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) ) )
            // InternalXMachine.g:952:2: (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) )
            {
            // InternalXMachine.g:952:2: (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) )
            int alt23=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt23=1;
                }
                break;
            case 41:
                {
                alt23=2;
                }
                break;
            case 42:
                {
                alt23=3;
                }
                break;
            case 43:
                {
                alt23=4;
                }
                break;
            case 44:
                {
                alt23=5;
                }
                break;
            case 45:
                {
                alt23=6;
                }
                break;
            case 47:
                {
                alt23=7;
                }
                break;
            case 48:
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
                    // InternalXMachine.g:953:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:961:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:967:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:973:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:979:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:985:3: (kw= '(' this_XType_6= ruleXType kw= ')' )
                    {
                    // InternalXMachine.g:985:3: (kw= '(' this_XType_6= ruleXType kw= ')' )
                    // InternalXMachine.g:986:4: kw= '(' this_XType_6= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,45,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_XType_6=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,46,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1008:3: (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' )
                    {
                    // InternalXMachine.g:1008:3: (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' )
                    // InternalXMachine.g:1009:4: kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,47,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0());
                    			
                    kw=(Token)match(input,45,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_6_2());
                    			
                    pushFollow(FOLLOW_22);
                    this_XType_10=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_10);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,46,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1036:3: (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' )
                    {
                    // InternalXMachine.g:1036:3: (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' )
                    // InternalXMachine.g:1037:4: kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,48,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0());
                    			
                    kw=(Token)match(input,45,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_7_2());
                    			
                    pushFollow(FOLLOW_22);
                    this_XType_14=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_14);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,46,FOLLOW_2); 

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


    // $ANTLR start "entryRuleXMultipleInvariant"
    // InternalXMachine.g:1067:1: entryRuleXMultipleInvariant returns [EObject current=null] : iv_ruleXMultipleInvariant= ruleXMultipleInvariant EOF ;
    public final EObject entryRuleXMultipleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultipleInvariant = null;


        try {
            // InternalXMachine.g:1067:59: (iv_ruleXMultipleInvariant= ruleXMultipleInvariant EOF )
            // InternalXMachine.g:1068:2: iv_ruleXMultipleInvariant= ruleXMultipleInvariant EOF
            {
             newCompositeNode(grammarAccess.getXMultipleInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXMultipleInvariant=ruleXMultipleInvariant();

            state._fsp--;

             current =iv_ruleXMultipleInvariant; 
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
    // $ANTLR end "entryRuleXMultipleInvariant"


    // $ANTLR start "ruleXMultipleInvariant"
    // InternalXMachine.g:1074:1: ruleXMultipleInvariant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXMultipleInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1080:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1081:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1081:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:1082:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1082:3: ()
            // InternalXMachine.g:1083:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXMultipleInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1089:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:1090:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1090:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1091:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXMultipleInvariantAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXMultipleInvariantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1107:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:1108:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1108:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:1109:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXMultipleInvariantAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXMultipleInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1125:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXMachine.g:1126:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXMachine.g:1126:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXMachine.g:1127:5: lv_predicate_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXMultipleInvariantAccess().getPredicateXFormulaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXMultipleInvariantRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
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
    // $ANTLR end "ruleXMultipleInvariant"


    // $ANTLR start "entryRuleXIndividualInvariant"
    // InternalXMachine.g:1148:1: entryRuleXIndividualInvariant returns [EObject current=null] : iv_ruleXIndividualInvariant= ruleXIndividualInvariant EOF ;
    public final EObject entryRuleXIndividualInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIndividualInvariant = null;


        try {
            // InternalXMachine.g:1148:61: (iv_ruleXIndividualInvariant= ruleXIndividualInvariant EOF )
            // InternalXMachine.g:1149:2: iv_ruleXIndividualInvariant= ruleXIndividualInvariant EOF
            {
             newCompositeNode(grammarAccess.getXIndividualInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXIndividualInvariant=ruleXIndividualInvariant();

            state._fsp--;

             current =iv_ruleXIndividualInvariant; 
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
    // $ANTLR end "entryRuleXIndividualInvariant"


    // $ANTLR start "ruleXIndividualInvariant"
    // InternalXMachine.g:1155:1: ruleXIndividualInvariant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) ) ;
    public final EObject ruleXIndividualInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_theorem_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        AntlrDatatypeRuleToken lv_predicate_5_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1161:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1162:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1162:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) )
            // InternalXMachine.g:1163:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1163:3: ()
            // InternalXMachine.g:1164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXIndividualInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1170:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:1171:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1171:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1172:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXIndividualInvariantAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXIndividualInvariantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1188:3: ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            else if ( (LA26_0==50) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalXMachine.g:1189:4: ( (lv_theorem_2_0= 'theorem' ) )
                    {
                    // InternalXMachine.g:1189:4: ( (lv_theorem_2_0= 'theorem' ) )
                    // InternalXMachine.g:1190:5: (lv_theorem_2_0= 'theorem' )
                    {
                    // InternalXMachine.g:1190:5: (lv_theorem_2_0= 'theorem' )
                    // InternalXMachine.g:1191:6: lv_theorem_2_0= 'theorem'
                    {
                    lv_theorem_2_0=(Token)match(input,49,FOLLOW_24); 

                    						newLeafNode(lv_theorem_2_0, grammarAccess.getXIndividualInvariantAccess().getTheoremTheoremKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXIndividualInvariantRule());
                    						}
                    						setWithLastConsumed(current, "theorem", lv_theorem_2_0 != null, "theorem");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1204:4: otherlv_3= 'invariant'
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getXIndividualInvariantAccess().getInvariantKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalXMachine.g:1209:3: ( (lv_name_4_0= RULE_XLABEL ) )
            // InternalXMachine.g:1210:4: (lv_name_4_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1210:4: (lv_name_4_0= RULE_XLABEL )
            // InternalXMachine.g:1211:5: lv_name_4_0= RULE_XLABEL
            {
            lv_name_4_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_4_0, grammarAccess.getXIndividualInvariantAccess().getNameXLABELTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXIndividualInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1227:3: ( (lv_predicate_5_0= ruleXFormula ) )
            // InternalXMachine.g:1228:4: (lv_predicate_5_0= ruleXFormula )
            {
            // InternalXMachine.g:1228:4: (lv_predicate_5_0= ruleXFormula )
            // InternalXMachine.g:1229:5: lv_predicate_5_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXIndividualInvariantAccess().getPredicateXFormulaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_5_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXIndividualInvariantRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_5_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
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
    // $ANTLR end "ruleXIndividualInvariant"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:1250:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:1250:49: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:1251:2: iv_ruleXVariant= ruleXVariant EOF
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
    // InternalXMachine.g:1257:1: ruleXVariant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'variant' ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_expression_4_0= ruleXFormula ) ) ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1263:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'variant' ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_expression_4_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1264:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'variant' ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_expression_4_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1264:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'variant' ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_expression_4_0= ruleXFormula ) ) )
            // InternalXMachine.g:1265:3: () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'variant' ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_expression_4_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1265:3: ()
            // InternalXMachine.g:1266:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1272:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:1273:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1273:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1274:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXVariantAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXVariantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,51,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getXVariantAccess().getVariantKeyword_2());
            		
            // InternalXMachine.g:1294:3: ( (lv_name_3_0= RULE_XLABEL ) )
            // InternalXMachine.g:1295:4: (lv_name_3_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1295:4: (lv_name_3_0= RULE_XLABEL )
            // InternalXMachine.g:1296:5: lv_name_3_0= RULE_XLABEL
            {
            lv_name_3_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXVariantAccess().getNameXLABELTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1312:3: ( (lv_expression_4_0= ruleXFormula ) )
            // InternalXMachine.g:1313:4: (lv_expression_4_0= ruleXFormula )
            {
            // InternalXMachine.g:1313:4: (lv_expression_4_0= ruleXFormula )
            // InternalXMachine.g:1314:5: lv_expression_4_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXVariantAccess().getExpressionXFormulaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_4_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXVariantRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
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
    // $ANTLR end "ruleXVariant"


    // $ANTLR start "entryRuleXEvent"
    // InternalXMachine.g:1335:1: entryRuleXEvent returns [EObject current=null] : iv_ruleXEvent= ruleXEvent EOF ;
    public final EObject entryRuleXEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEvent = null;


        try {
            // InternalXMachine.g:1335:47: (iv_ruleXEvent= ruleXEvent EOF )
            // InternalXMachine.g:1336:2: iv_ruleXEvent= ruleXEvent EOF
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
    // InternalXMachine.g:1342:1: ruleXEvent returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_convergence_2_0= ruleXConvergence ) )? otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )? (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )? ( (lv_orderedChildren_11_0= ruleEventSync ) )* ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )? ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )? (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )? otherlv_20= 'end' ) ;
    public final EObject ruleXEvent() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_extended_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Enumerator lv_convergence_2_0 = null;

        EObject lv_orderedChildren_10_0 = null;

        EObject lv_orderedChildren_11_0 = null;

        EObject lv_orderedChildren_14_0 = null;

        EObject lv_orderedChildren_17_0 = null;

        EObject lv_orderedChildren_19_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1348:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_convergence_2_0= ruleXConvergence ) )? otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )? (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )? ( (lv_orderedChildren_11_0= ruleEventSync ) )* ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )? ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )? (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )? otherlv_20= 'end' ) )
            // InternalXMachine.g:1349:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_convergence_2_0= ruleXConvergence ) )? otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )? (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )? ( (lv_orderedChildren_11_0= ruleEventSync ) )* ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )? ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )? (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )? otherlv_20= 'end' )
            {
            // InternalXMachine.g:1349:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_convergence_2_0= ruleXConvergence ) )? otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )? (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )? ( (lv_orderedChildren_11_0= ruleEventSync ) )* ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )? ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )? (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )? otherlv_20= 'end' )
            // InternalXMachine.g:1350:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_convergence_2_0= ruleXConvergence ) )? otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )? (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )? ( (lv_orderedChildren_11_0= ruleEventSync ) )* ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )? ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )? (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )? otherlv_20= 'end'
            {
            // InternalXMachine.g:1350:3: ()
            // InternalXMachine.g:1351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1357:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:1358:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1358:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1359:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXEventAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXEventRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1375:3: ( (lv_convergence_2_0= ruleXConvergence ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=150 && LA29_0<=152)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXMachine.g:1376:4: (lv_convergence_2_0= ruleXConvergence )
                    {
                    // InternalXMachine.g:1376:4: (lv_convergence_2_0= ruleXConvergence )
                    // InternalXMachine.g:1377:5: lv_convergence_2_0= ruleXConvergence
                    {

                    					newCompositeNode(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_convergence_2_0=ruleXConvergence();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getXEventRule());
                    					}
                    					set(
                    						current,
                    						"convergence",
                    						lv_convergence_2_0,
                    						"ac.soton.xeventb.xmachine.XMachine.XConvergence");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getXEventAccess().getEventKeyword_3());
            		
            // InternalXMachine.g:1398:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalXMachine.g:1399:4: (lv_name_4_0= RULE_ID )
            {
            // InternalXMachine.g:1399:4: (lv_name_4_0= RULE_ID )
            // InternalXMachine.g:1400:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_4_0, grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:1416:3: ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            else if ( (LA31_0==53) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // InternalXMachine.g:1417:4: (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ )
                    {
                    // InternalXMachine.g:1417:4: (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ )
                    // InternalXMachine.g:1418:5: otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getXEventAccess().getRefinesKeyword_5_0_0());
                    				
                    // InternalXMachine.g:1422:5: ( (otherlv_6= RULE_ID ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalXMachine.g:1423:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:1423:6: (otherlv_6= RULE_ID )
                    	    // InternalXMachine.g:1424:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getXEventRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_30); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_0_1_0());
                    	    						

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
                    // InternalXMachine.g:1437:4: ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalXMachine.g:1437:4: ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) )
                    // InternalXMachine.g:1438:5: ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) )
                    {
                    // InternalXMachine.g:1438:5: ( (lv_extended_7_0= 'extends' ) )
                    // InternalXMachine.g:1439:6: (lv_extended_7_0= 'extends' )
                    {
                    // InternalXMachine.g:1439:6: (lv_extended_7_0= 'extends' )
                    // InternalXMachine.g:1440:7: lv_extended_7_0= 'extends'
                    {
                    lv_extended_7_0=(Token)match(input,53,FOLLOW_4); 

                    							newLeafNode(lv_extended_7_0, grammarAccess.getXEventAccess().getExtendedExtendsKeyword_5_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getXEventRule());
                    							}
                    							setWithLastConsumed(current, "extended", lv_extended_7_0 != null, "extends");
                    						

                    }


                    }

                    // InternalXMachine.g:1452:5: ( (otherlv_8= RULE_ID ) )
                    // InternalXMachine.g:1453:6: (otherlv_8= RULE_ID )
                    {
                    // InternalXMachine.g:1453:6: (otherlv_8= RULE_ID )
                    // InternalXMachine.g:1454:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getXEventRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_31); 

                    							newLeafNode(otherlv_8, grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:1467:3: (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXMachine.g:1468:4: otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getXEventAccess().getAnyKeyword_6_0());
                    			
                    // InternalXMachine.g:1472:4: ( (lv_orderedChildren_10_0= ruleXParameter ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalXMachine.g:1473:5: (lv_orderedChildren_10_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1473:5: (lv_orderedChildren_10_0= ruleXParameter )
                    	    // InternalXMachine.g:1474:6: lv_orderedChildren_10_0= ruleXParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getOrderedChildrenXParameterParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_orderedChildren_10_0=ruleXParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"orderedChildren",
                    	    							lv_orderedChildren_10_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XParameter");
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

            // InternalXMachine.g:1492:3: ( (lv_orderedChildren_11_0= ruleEventSync ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==61) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXMachine.g:1493:4: (lv_orderedChildren_11_0= ruleEventSync )
            	    {
            	    // InternalXMachine.g:1493:4: (lv_orderedChildren_11_0= ruleEventSync )
            	    // InternalXMachine.g:1494:5: lv_orderedChildren_11_0= ruleEventSync
            	    {

            	    					newCompositeNode(grammarAccess.getXEventAccess().getOrderedChildrenEventSyncParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_orderedChildren_11_0=ruleEventSync();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"orderedChildren",
            	    						lv_orderedChildren_11_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.EventSync");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalXMachine.g:1511:3: ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=55 && LA37_0<=56)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXMachine.g:1512:4: (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+
                    {
                    // InternalXMachine.g:1512:4: (otherlv_12= 'where' | otherlv_13= 'when' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==55) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==56) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalXMachine.g:1513:5: otherlv_12= 'where'
                            {
                            otherlv_12=(Token)match(input,55,FOLLOW_34); 

                            					newLeafNode(otherlv_12, grammarAccess.getXEventAccess().getWhereKeyword_8_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:1518:5: otherlv_13= 'when'
                            {
                            otherlv_13=(Token)match(input,56,FOLLOW_34); 

                            					newLeafNode(otherlv_13, grammarAccess.getXEventAccess().getWhenKeyword_8_0_1());
                            				

                            }
                            break;

                    }

                    // InternalXMachine.g:1523:4: ( (lv_orderedChildren_14_0= ruleXGuard ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_STRING||LA36_0==RULE_XLABEL||LA36_0==49) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalXMachine.g:1524:5: (lv_orderedChildren_14_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1524:5: (lv_orderedChildren_14_0= ruleXGuard )
                    	    // InternalXMachine.g:1525:6: lv_orderedChildren_14_0= ruleXGuard
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getOrderedChildrenXGuardParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_35);
                    	    lv_orderedChildren_14_0=ruleXGuard();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"orderedChildren",
                    	    							lv_orderedChildren_14_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XGuard");
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


                    }
                    break;

            }

            // InternalXMachine.g:1543:3: ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=57 && LA40_0<=58)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:1544:4: (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:1544:4: (otherlv_15= 'then' | otherlv_16= 'begin' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==57) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==58) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalXMachine.g:1545:5: otherlv_15= 'then'
                            {
                            otherlv_15=(Token)match(input,57,FOLLOW_10); 

                            					newLeafNode(otherlv_15, grammarAccess.getXEventAccess().getThenKeyword_9_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:1550:5: otherlv_16= 'begin'
                            {
                            otherlv_16=(Token)match(input,58,FOLLOW_10); 

                            					newLeafNode(otherlv_16, grammarAccess.getXEventAccess().getBeginKeyword_9_0_1());
                            				

                            }
                            break;

                    }

                    // InternalXMachine.g:1555:4: ( (lv_orderedChildren_17_0= ruleXAction ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_STRING||LA39_0==RULE_XLABEL) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalXMachine.g:1556:5: (lv_orderedChildren_17_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1556:5: (lv_orderedChildren_17_0= ruleXAction )
                    	    // InternalXMachine.g:1557:6: lv_orderedChildren_17_0= ruleXAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getOrderedChildrenXActionParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_36);
                    	    lv_orderedChildren_17_0=ruleXAction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"orderedChildren",
                    	    							lv_orderedChildren_17_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XAction");
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

            // InternalXMachine.g:1575:3: (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==59) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:1576:4: otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+
                    {
                    otherlv_18=(Token)match(input,59,FOLLOW_10); 

                    				newLeafNode(otherlv_18, grammarAccess.getXEventAccess().getWithKeyword_10_0());
                    			
                    // InternalXMachine.g:1580:4: ( (lv_orderedChildren_19_0= ruleXWitness ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_STRING||LA41_0==RULE_XLABEL) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalXMachine.g:1581:5: (lv_orderedChildren_19_0= ruleXWitness )
                    	    {
                    	    // InternalXMachine.g:1581:5: (lv_orderedChildren_19_0= ruleXWitness )
                    	    // InternalXMachine.g:1582:6: lv_orderedChildren_19_0= ruleXWitness
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getOrderedChildrenXWitnessParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_37);
                    	    lv_orderedChildren_19_0=ruleXWitness();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"orderedChildren",
                    	    							lv_orderedChildren_19_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XWitness");
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

            otherlv_20=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getXEventAccess().getEndKeyword_11());
            		

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


    // $ANTLR start "entryRuleEventSync"
    // InternalXMachine.g:1608:1: entryRuleEventSync returns [EObject current=null] : iv_ruleEventSync= ruleEventSync EOF ;
    public final EObject entryRuleEventSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSync = null;


        try {
            // InternalXMachine.g:1608:50: (iv_ruleEventSync= ruleEventSync EOF )
            // InternalXMachine.g:1609:2: iv_ruleEventSync= ruleEventSync EOF
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
    // InternalXMachine.g:1615:1: ruleEventSync returns [EObject current=null] : ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleEventSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXMachine.g:1621:2: ( ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalXMachine.g:1622:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalXMachine.g:1622:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            // InternalXMachine.g:1623:3: () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalXMachine.g:1623:3: ()
            // InternalXMachine.g:1624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1630:3: (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:1631:4: otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,61,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0());
            			
            // InternalXMachine.g:1635:4: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==24) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalXMachine.g:1636:5: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalXMachine.g:1636:5: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalXMachine.g:1637:6: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalXMachine.g:1637:6: (lv_prefix_2_0= RULE_ID )
                    // InternalXMachine.g:1638:7: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FOLLOW_38); 

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

                    otherlv_3=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1());
                    				

                    }
                    break;

            }

            // InternalXMachine.g:1659:4: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:1660:5: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:1660:5: (otherlv_4= RULE_ID )
            // InternalXMachine.g:1661:6: otherlv_4= RULE_ID
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
    // InternalXMachine.g:1677:1: entryRuleXParameter returns [EObject current=null] : iv_ruleXParameter= ruleXParameter EOF ;
    public final EObject entryRuleXParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameter = null;


        try {
            // InternalXMachine.g:1677:51: (iv_ruleXParameter= ruleXParameter EOF )
            // InternalXMachine.g:1678:2: iv_ruleXParameter= ruleXParameter EOF
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
    // InternalXMachine.g:1684:1: ruleXParameter returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameter() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1690:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:1691:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:1691:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:1692:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:1692:3: ()
            // InternalXMachine.g:1693:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1699:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:1700:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1700:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1701:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXParameterAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXParameterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1717:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:1718:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:1718:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:1719:5: lv_name_2_0= RULE_ID
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
    // $ANTLR end "ruleXParameter"


    // $ANTLR start "entryRuleXGuard"
    // InternalXMachine.g:1739:1: entryRuleXGuard returns [EObject current=null] : iv_ruleXGuard= ruleXGuard EOF ;
    public final EObject entryRuleXGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuard = null;


        try {
            // InternalXMachine.g:1739:47: (iv_ruleXGuard= ruleXGuard EOF )
            // InternalXMachine.g:1740:2: iv_ruleXGuard= ruleXGuard EOF
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
    // InternalXMachine.g:1746:1: ruleXGuard returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) ) ;
    public final EObject ruleXGuard() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_theorem_2_0=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_4_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1752:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1753:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1753:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) )
            // InternalXMachine.g:1754:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1754:3: ()
            // InternalXMachine.g:1755:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1761:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:1762:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1762:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1763:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXGuardAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1779:3: ( (lv_theorem_2_0= 'theorem' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==49) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:1780:4: (lv_theorem_2_0= 'theorem' )
                    {
                    // InternalXMachine.g:1780:4: (lv_theorem_2_0= 'theorem' )
                    // InternalXMachine.g:1781:5: lv_theorem_2_0= 'theorem'
                    {
                    lv_theorem_2_0=(Token)match(input,49,FOLLOW_24); 

                    					newLeafNode(lv_theorem_2_0, grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardRule());
                    					}
                    					setWithLastConsumed(current, "theorem", lv_theorem_2_0 != null, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1793:3: ( (lv_name_3_0= RULE_XLABEL ) )
            // InternalXMachine.g:1794:4: (lv_name_3_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1794:4: (lv_name_3_0= RULE_XLABEL )
            // InternalXMachine.g:1795:5: lv_name_3_0= RULE_XLABEL
            {
            lv_name_3_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1811:3: ( (lv_predicate_4_0= ruleXFormula ) )
            // InternalXMachine.g:1812:4: (lv_predicate_4_0= ruleXFormula )
            {
            // InternalXMachine.g:1812:4: (lv_predicate_4_0= ruleXFormula )
            // InternalXMachine.g:1813:5: lv_predicate_4_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXGuardAccess().getPredicateXFormulaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_4_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXGuardRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_4_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
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
    // $ANTLR end "ruleXGuard"


    // $ANTLR start "entryRuleXWitness"
    // InternalXMachine.g:1834:1: entryRuleXWitness returns [EObject current=null] : iv_ruleXWitness= ruleXWitness EOF ;
    public final EObject entryRuleXWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitness = null;


        try {
            // InternalXMachine.g:1834:49: (iv_ruleXWitness= ruleXWitness EOF )
            // InternalXMachine.g:1835:2: iv_ruleXWitness= ruleXWitness EOF
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
    // InternalXMachine.g:1841:1: ruleXWitness returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXWitness() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1847:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1848:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1848:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:1849:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1849:3: ()
            // InternalXMachine.g:1850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1856:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:1857:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1857:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1858:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXWitnessAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXWitnessRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1874:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:1875:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1875:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:1876:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1892:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXMachine.g:1893:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXMachine.g:1893:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXMachine.g:1894:5: lv_predicate_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXWitnessAccess().getPredicateXFormulaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXWitnessRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
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
    // $ANTLR end "ruleXWitness"


    // $ANTLR start "entryRuleXAction"
    // InternalXMachine.g:1915:1: entryRuleXAction returns [EObject current=null] : iv_ruleXAction= ruleXAction EOF ;
    public final EObject entryRuleXAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAction = null;


        try {
            // InternalXMachine.g:1915:48: (iv_ruleXAction= ruleXAction EOF )
            // InternalXMachine.g:1916:2: iv_ruleXAction= ruleXAction EOF
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
    // InternalXMachine.g:1922:1: ruleXAction returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXAction() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1928:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1929:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1929:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:1930:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1930:3: ()
            // InternalXMachine.g:1931:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1937:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:1938:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1938:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1939:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXActionAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1955:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:1956:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1956:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:1957:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1973:3: ( (lv_action_3_0= ruleXFormula ) )
            // InternalXMachine.g:1974:4: (lv_action_3_0= ruleXFormula )
            {
            // InternalXMachine.g:1974:4: (lv_action_3_0= ruleXFormula )
            // InternalXMachine.g:1975:5: lv_action_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXActionAccess().getActionXFormulaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
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
    // $ANTLR end "ruleXAction"


    // $ANTLR start "entryRuleXFormula"
    // InternalXMachine.g:1996:1: entryRuleXFormula returns [String current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final String entryRuleXFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXFormula = null;


        try {
            // InternalXMachine.g:1996:48: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalXMachine.g:1997:2: iv_ruleXFormula= ruleXFormula EOF
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
    // InternalXMachine.g:2003:1: ruleXFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_INT_3= RULE_INT | this_ID_4= RULE_ID | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+ ;
    public final AntlrDatatypeRuleToken ruleXFormula() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_3=null;
        Token this_ID_4=null;
        Token this_UNTRANSLATED_TOKEN_5=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_0 = null;

        AntlrDatatypeRuleToken this_EVENTB_PREDICATE_SYMBOLS_1 = null;

        AntlrDatatypeRuleToken this_EVENTB_EXPRESSION_SYMBOLS_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2009:2: ( (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_INT_3= RULE_INT | this_ID_4= RULE_ID | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+ )
            // InternalXMachine.g:2010:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_INT_3= RULE_INT | this_ID_4= RULE_ID | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+
            {
            // InternalXMachine.g:2010:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_INT_3= RULE_INT | this_ID_4= RULE_ID | this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN )+
            int cnt49=0;
            loop49:
            do {
                int alt49=7;
                switch ( input.LA(1) ) {
                case 41:
                case 42:
                case 43:
                case 44:
                case 47:
                case 48:
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
                    {
                    alt49=1;
                    }
                    break;
                case 24:
                case 27:
                case 28:
                case 45:
                case 46:
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
                    {
                    alt49=2;
                    }
                    break;
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
                case 40:
                case 105:
                case 106:
                case 107:
                case 108:
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
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 132:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                    {
                    alt49=3;
                    }
                    break;
                case RULE_INT:
                    {
                    alt49=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt49=5;
                    }
                    break;
                case RULE_UNTRANSLATED_TOKEN:
                    {
                    alt49=6;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // InternalXMachine.g:2011:3: this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_40);
            	    this_EVENTB_IDENTIFIER_KEYWORD_0=ruleEVENTB_IDENTIFIER_KEYWORD();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_IDENTIFIER_KEYWORD_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:2022:3: this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1());
            	    		
            	    pushFollow(FOLLOW_40);
            	    this_EVENTB_PREDICATE_SYMBOLS_1=ruleEVENTB_PREDICATE_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_PREDICATE_SYMBOLS_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalXMachine.g:2033:3: this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_40);
            	    this_EVENTB_EXPRESSION_SYMBOLS_2=ruleEVENTB_EXPRESSION_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_EXPRESSION_SYMBOLS_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalXMachine.g:2044:3: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_40); 

            	    			current.merge(this_INT_3);
            	    		

            	    			newLeafNode(this_INT_3, grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalXMachine.g:2052:3: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_40); 

            	    			current.merge(this_ID_4);
            	    		

            	    			newLeafNode(this_ID_4, grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalXMachine.g:2060:3: this_UNTRANSLATED_TOKEN_5= RULE_UNTRANSLATED_TOKEN
            	    {
            	    this_UNTRANSLATED_TOKEN_5=(Token)match(input,RULE_UNTRANSLATED_TOKEN,FOLLOW_40); 

            	    			current.merge(this_UNTRANSLATED_TOKEN_5);
            	    		

            	    			newLeafNode(this_UNTRANSLATED_TOKEN_5, grammarAccess.getXFormulaAccess().getUNTRANSLATED_TOKENTerminalRuleCall_5());
            	    		

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


    // $ANTLR start "entryRuleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXMachine.g:2071:1: entryRuleEVENTB_IDENTIFIER_KEYWORD returns [String current=null] : iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final String entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_IDENTIFIER_KEYWORD = null;


        try {
            // InternalXMachine.g:2071:65: (iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXMachine.g:2072:2: iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF
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
    // InternalXMachine.g:2078:1: ruleEVENTB_IDENTIFIER_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:2084:2: ( (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) )
            // InternalXMachine.g:2085:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            {
            // InternalXMachine.g:2085:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            int alt50=23;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt50=1;
                }
                break;
            case 62:
                {
                alt50=2;
                }
                break;
            case 63:
                {
                alt50=3;
                }
                break;
            case 64:
                {
                alt50=4;
                }
                break;
            case 65:
                {
                alt50=5;
                }
                break;
            case 66:
                {
                alt50=6;
                }
                break;
            case 67:
                {
                alt50=7;
                }
                break;
            case 68:
                {
                alt50=8;
                }
                break;
            case 69:
                {
                alt50=9;
                }
                break;
            case 70:
                {
                alt50=10;
                }
                break;
            case 71:
                {
                alt50=11;
                }
                break;
            case 72:
                {
                alt50=12;
                }
                break;
            case 73:
                {
                alt50=13;
                }
                break;
            case 74:
                {
                alt50=14;
                }
                break;
            case 75:
                {
                alt50=15;
                }
                break;
            case 76:
                {
                alt50=16;
                }
                break;
            case 77:
                {
                alt50=17;
                }
                break;
            case 78:
                {
                alt50=18;
                }
                break;
            case 42:
                {
                alt50=19;
                }
                break;
            case 43:
                {
                alt50=20;
                }
                break;
            case 48:
                {
                alt50=21;
                }
                break;
            case 47:
                {
                alt50=22;
                }
                break;
            case 44:
                {
                alt50=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalXMachine.g:2086:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2092:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2098:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:2104:3: kw= 'bool'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:2110:3: kw= 'card'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:2116:3: kw= 'dom'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:2122:3: kw= 'finite'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:2128:3: kw= 'id'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:2134:3: kw= 'inter'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:2140:3: kw= 'max'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:2146:3: kw= 'min'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:2152:3: kw= 'mod'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:2158:3: kw= 'pred'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:2164:3: kw= 'prj1'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:2170:3: kw= 'prj2'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:2176:3: kw= 'ran'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:2182:3: kw= 'succ'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:2188:3: kw= 'union'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:2194:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:2200:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:2206:3: kw= '\\u21191'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:2212:3: kw= '\\u2119'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:2218:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalXMachine.g:2227:1: entryRuleEVENTB_PREDICATE_SYMBOLS returns [String current=null] : iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final String entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_PREDICATE_SYMBOLS = null;


        try {
            // InternalXMachine.g:2227:64: (iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXMachine.g:2228:2: iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF
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
    // InternalXMachine.g:2234:1: ruleEVENTB_PREDICATE_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:2240:2: ( (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) )
            // InternalXMachine.g:2241:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            {
            // InternalXMachine.g:2241:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            int alt51=31;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt51=1;
                }
                break;
            case 46:
                {
                alt51=2;
                }
                break;
            case 79:
                {
                alt51=3;
                }
                break;
            case 80:
                {
                alt51=4;
                }
                break;
            case 81:
                {
                alt51=5;
                }
                break;
            case 82:
                {
                alt51=6;
                }
                break;
            case 83:
                {
                alt51=7;
                }
                break;
            case 84:
                {
                alt51=8;
                }
                break;
            case 85:
                {
                alt51=9;
                }
                break;
            case 86:
                {
                alt51=10;
                }
                break;
            case 87:
                {
                alt51=11;
                }
                break;
            case 88:
                {
                alt51=12;
                }
                break;
            case 89:
                {
                alt51=13;
                }
                break;
            case 90:
                {
                alt51=14;
                }
                break;
            case 91:
                {
                alt51=15;
                }
                break;
            case 92:
                {
                alt51=16;
                }
                break;
            case 24:
                {
                alt51=17;
                }
                break;
            case 28:
                {
                alt51=18;
                }
                break;
            case 93:
                {
                alt51=19;
                }
                break;
            case 94:
                {
                alt51=20;
                }
                break;
            case 95:
                {
                alt51=21;
                }
                break;
            case 96:
                {
                alt51=22;
                }
                break;
            case 97:
                {
                alt51=23;
                }
                break;
            case 98:
                {
                alt51=24;
                }
                break;
            case 27:
                {
                alt51=25;
                }
                break;
            case 99:
                {
                alt51=26;
                }
                break;
            case 100:
                {
                alt51=27;
                }
                break;
            case 101:
                {
                alt51=28;
                }
                break;
            case 102:
                {
                alt51=29;
                }
                break;
            case 103:
                {
                alt51=30;
                }
                break;
            case 104:
                {
                alt51=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalXMachine.g:2242:3: kw= '('
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2248:3: kw= ')'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2254:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:2260:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:2266:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:2272:3: kw= '&'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:2278:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:2284:3: kw= '\\u00AC'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:2290:3: kw= '\\u22A4'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:2296:3: kw= '\\u22A5'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:2302:3: kw= '\\u2200'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:2308:3: kw= '!'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:2314:3: kw= '\\u2203'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:2320:3: kw= '#'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:2326:3: kw= ','
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:2332:3: kw= '\\u00B7'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:2338:3: kw= '.'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:2344:3: kw= '='
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:2350:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:2356:3: kw= '\\u2264'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:2362:3: kw= '<'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:2368:3: kw= '\\u2265'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:2374:3: kw= '>'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXMachine.g:2380:3: kw= '\\u2208'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXMachine.g:2386:3: kw= ':'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXMachine.g:2392:3: kw= '\\u2209'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXMachine.g:2398:3: kw= '\\u2282'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXMachine.g:2404:3: kw= '\\u2284'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXMachine.g:2410:3: kw= '\\u2286'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXMachine.g:2416:3: kw= '\\u2288'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXMachine.g:2422:3: kw= 'partition'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

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
    // InternalXMachine.g:2431:1: entryRuleEVENTB_EXPRESSION_SYMBOLS returns [String current=null] : iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final String entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_EXPRESSION_SYMBOLS = null;


        try {
            // InternalXMachine.g:2431:65: (iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXMachine.g:2432:2: iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF
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
    // InternalXMachine.g:2438:1: ruleEVENTB_EXPRESSION_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:2444:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) )
            // InternalXMachine.g:2445:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            {
            // InternalXMachine.g:2445:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            int alt52=45;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt52=1;
                }
                break;
            case 30:
                {
                alt52=2;
                }
                break;
            case 31:
                {
                alt52=3;
                }
                break;
            case 32:
                {
                alt52=4;
                }
                break;
            case 33:
                {
                alt52=5;
                }
                break;
            case 34:
                {
                alt52=6;
                }
                break;
            case 35:
                {
                alt52=7;
                }
                break;
            case 36:
                {
                alt52=8;
                }
                break;
            case 37:
                {
                alt52=9;
                }
                break;
            case 38:
                {
                alt52=10;
                }
                break;
            case 39:
                {
                alt52=11;
                }
                break;
            case 105:
                {
                alt52=12;
                }
                break;
            case 106:
                {
                alt52=13;
                }
                break;
            case 107:
                {
                alt52=14;
                }
                break;
            case 108:
                {
                alt52=15;
                }
                break;
            case 109:
                {
                alt52=16;
                }
                break;
            case 110:
                {
                alt52=17;
                }
                break;
            case 111:
                {
                alt52=18;
                }
                break;
            case 40:
                {
                alt52=19;
                }
                break;
            case 112:
                {
                alt52=20;
                }
                break;
            case 113:
                {
                alt52=21;
                }
                break;
            case 114:
                {
                alt52=22;
                }
                break;
            case 115:
                {
                alt52=23;
                }
                break;
            case 116:
                {
                alt52=24;
                }
                break;
            case 117:
                {
                alt52=25;
                }
                break;
            case 118:
                {
                alt52=26;
                }
                break;
            case 119:
                {
                alt52=27;
                }
                break;
            case 120:
                {
                alt52=28;
                }
                break;
            case 121:
                {
                alt52=29;
                }
                break;
            case 122:
                {
                alt52=30;
                }
                break;
            case 123:
                {
                alt52=31;
                }
                break;
            case 124:
                {
                alt52=32;
                }
                break;
            case 125:
                {
                alt52=33;
                }
                break;
            case 127:
                {
                alt52=34;
                }
                break;
            case 128:
                {
                alt52=35;
                }
                break;
            case 129:
                {
                alt52=36;
                }
                break;
            case 130:
                {
                alt52=37;
                }
                break;
            case 131:
                {
                alt52=38;
                }
                break;
            case 132:
                {
                alt52=39;
                }
                break;
            case 133:
                {
                alt52=40;
                }
                break;
            case 134:
                {
                alt52=41;
                }
                break;
            case 135:
                {
                alt52=42;
                }
                break;
            case 136:
                {
                alt52=43;
                }
                break;
            case 137:
                {
                alt52=44;
                }
                break;
            case 138:
                {
                alt52=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalXMachine.g:2446:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2452:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2458:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:2464:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:2470:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:2476:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:2482:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:2488:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:2494:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:2500:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:2506:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:2512:3: kw= '{'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:2518:3: kw= '}'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:2524:3: kw= '\\u21A6'
                    {
                    kw=(Token)match(input,107,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:2530:3: kw= '\\u2205'
                    {
                    kw=(Token)match(input,108,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:2536:3: kw= '\\u2229'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:2542:3: kw= '\\u222A'
                    {
                    kw=(Token)match(input,110,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:2548:3: kw= '\\u2216'
                    {
                    kw=(Token)match(input,111,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:2554:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:2560:3: kw= '['
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:2566:3: kw= ']'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:2572:3: kw= '\\uE103'
                    {
                    kw=(Token)match(input,114,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:2578:3: kw= '\\u2218'
                    {
                    kw=(Token)match(input,115,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXMachine.g:2584:3: kw= ';'
                    {
                    kw=(Token)match(input,116,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXMachine.g:2590:3: kw= '\\u2297'
                    {
                    kw=(Token)match(input,117,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXMachine.g:2596:3: kw= '\\u2225'
                    {
                    kw=(Token)match(input,118,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXMachine.g:2602:3: kw= '\\u223C'
                    {
                    kw=(Token)match(input,119,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXMachine.g:2608:3: kw= '\\u25C1'
                    {
                    kw=(Token)match(input,120,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXMachine.g:2614:3: kw= '\\u2A64'
                    {
                    kw=(Token)match(input,121,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXMachine.g:2620:3: kw= '\\u25B7'
                    {
                    kw=(Token)match(input,122,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXMachine.g:2626:3: kw= '\\u2A65'
                    {
                    kw=(Token)match(input,123,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalXMachine.g:2632:3: kw= '\\u03BB'
                    {
                    kw=(Token)match(input,124,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalXMachine.g:2638:3: (kw= '%' kw= '\\u22C2' )
                    {
                    // InternalXMachine.g:2638:3: (kw= '%' kw= '\\u22C2' )
                    // InternalXMachine.g:2639:4: kw= '%' kw= '\\u22C2'
                    {
                    kw=(Token)match(input,125,FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0());
                    			
                    kw=(Token)match(input,126,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalXMachine.g:2651:3: kw= '\\u22C3'
                    {
                    kw=(Token)match(input,127,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalXMachine.g:2657:3: kw= '\\u2223'
                    {
                    kw=(Token)match(input,128,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalXMachine.g:2663:3: kw= '\\u2025'
                    {
                    kw=(Token)match(input,129,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalXMachine.g:2669:3: kw= '+'
                    {
                    kw=(Token)match(input,130,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalXMachine.g:2675:3: kw= '\\u2212'
                    {
                    kw=(Token)match(input,131,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalXMachine.g:2681:3: kw= '-'
                    {
                    kw=(Token)match(input,132,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalXMachine.g:2687:3: kw= '\\u2217'
                    {
                    kw=(Token)match(input,133,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalXMachine.g:2693:3: kw= '*'
                    {
                    kw=(Token)match(input,134,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalXMachine.g:2699:3: kw= '\\u00F7'
                    {
                    kw=(Token)match(input,135,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalXMachine.g:2705:3: kw= '/'
                    {
                    kw=(Token)match(input,136,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalXMachine.g:2711:3: kw= '^'
                    {
                    kw=(Token)match(input,137,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalXMachine.g:2717:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,138,FOLLOW_2); 

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
    // InternalXMachine.g:2726:1: entryRuleXRecord returns [EObject current=null] : iv_ruleXRecord= ruleXRecord EOF ;
    public final EObject entryRuleXRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRecord = null;


        try {
            // InternalXMachine.g:2726:48: (iv_ruleXRecord= ruleXRecord EOF )
            // InternalXMachine.g:2727:2: iv_ruleXRecord= ruleXRecord EOF
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
    // InternalXMachine.g:2733:1: ruleXRecord returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )? (otherlv_4= 'record' | otherlv_5= 'rec' ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )? ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_fields_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_constraints_14_0= ruleXConstraint ) ) ) )* otherlv_15= 'end' ) ;
    public final EObject ruleXRecord() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_extended_2_1=null;
        Token lv_extended_2_2=null;
        Token lv_refined_3_1=null;
        Token lv_refined_3_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_inheritsNames_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_fields_12_0 = null;

        EObject lv_constraints_14_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2739:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )? (otherlv_4= 'record' | otherlv_5= 'rec' ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )? ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_fields_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_constraints_14_0= ruleXConstraint ) ) ) )* otherlv_15= 'end' ) )
            // InternalXMachine.g:2740:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )? (otherlv_4= 'record' | otherlv_5= 'rec' ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )? ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_fields_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_constraints_14_0= ruleXConstraint ) ) ) )* otherlv_15= 'end' )
            {
            // InternalXMachine.g:2740:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )? (otherlv_4= 'record' | otherlv_5= 'rec' ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )? ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_fields_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_constraints_14_0= ruleXConstraint ) ) ) )* otherlv_15= 'end' )
            // InternalXMachine.g:2741:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )? (otherlv_4= 'record' | otherlv_5= 'rec' ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )? ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_fields_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_constraints_14_0= ruleXConstraint ) ) ) )* otherlv_15= 'end'
            {
            // InternalXMachine.g:2741:3: ()
            // InternalXMachine.g:2742:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXRecordAccess().getRecordAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2748:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXMachine.g:2749:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:2749:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:2750:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXRecordAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXRecordRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:2766:3: ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )?
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=139 && LA56_0<=140)) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=141 && LA56_0<=142)) ) {
                alt56=2;
            }
            switch (alt56) {
                case 1 :
                    // InternalXMachine.g:2767:4: ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) )
                    {
                    // InternalXMachine.g:2767:4: ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) )
                    // InternalXMachine.g:2768:5: ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) )
                    {
                    // InternalXMachine.g:2768:5: ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) )
                    // InternalXMachine.g:2769:6: (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' )
                    {
                    // InternalXMachine.g:2769:6: (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==139) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==140) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalXMachine.g:2770:7: lv_extended_2_1= 'extended'
                            {
                            lv_extended_2_1=(Token)match(input,139,FOLLOW_43); 

                            							newLeafNode(lv_extended_2_1, grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getXRecordRule());
                            							}
                            							setWithLastConsumed(current, "extended", lv_extended_2_1 != null, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:2781:7: lv_extended_2_2= 'ext'
                            {
                            lv_extended_2_2=(Token)match(input,140,FOLLOW_43); 

                            							newLeafNode(lv_extended_2_2, grammarAccess.getXRecordAccess().getExtendedExtKeyword_2_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getXRecordRule());
                            							}
                            							setWithLastConsumed(current, "extended", lv_extended_2_2 != null, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2795:4: ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) )
                    {
                    // InternalXMachine.g:2795:4: ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) )
                    // InternalXMachine.g:2796:5: ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) )
                    {
                    // InternalXMachine.g:2796:5: ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) )
                    // InternalXMachine.g:2797:6: (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' )
                    {
                    // InternalXMachine.g:2797:6: (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==141) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==142) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalXMachine.g:2798:7: lv_refined_3_1= 'refined'
                            {
                            lv_refined_3_1=(Token)match(input,141,FOLLOW_43); 

                            							newLeafNode(lv_refined_3_1, grammarAccess.getXRecordAccess().getRefinedRefinedKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getXRecordRule());
                            							}
                            							setWithLastConsumed(current, "refined", lv_refined_3_1 != null, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:2809:7: lv_refined_3_2= 'ref'
                            {
                            lv_refined_3_2=(Token)match(input,142,FOLLOW_43); 

                            							newLeafNode(lv_refined_3_2, grammarAccess.getXRecordAccess().getRefinedRefKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getXRecordRule());
                            							}
                            							setWithLastConsumed(current, "refined", lv_refined_3_2 != null, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:2823:3: (otherlv_4= 'record' | otherlv_5= 'rec' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==143) ) {
                alt57=1;
            }
            else if ( (LA57_0==144) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalXMachine.g:2824:4: otherlv_4= 'record'
                    {
                    otherlv_4=(Token)match(input,143,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getXRecordAccess().getRecordKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2829:4: otherlv_5= 'rec'
                    {
                    otherlv_5=(Token)match(input,144,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getXRecordAccess().getRecKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalXMachine.g:2834:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalXMachine.g:2835:4: (lv_name_6_0= RULE_ID )
            {
            // InternalXMachine.g:2835:4: (lv_name_6_0= RULE_ID )
            // InternalXMachine.g:2836:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(lv_name_6_0, grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:2852:3: ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=145 && LA59_0<=146)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalXMachine.g:2853:4: (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) )
                    {
                    // InternalXMachine.g:2853:4: (otherlv_7= 'inherits' | otherlv_8= 'ihr' )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==145) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==146) ) {
                        alt58=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalXMachine.g:2854:5: otherlv_7= 'inherits'
                            {
                            otherlv_7=(Token)match(input,145,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getXRecordAccess().getInheritsKeyword_5_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:2859:5: otherlv_8= 'ihr'
                            {
                            otherlv_8=(Token)match(input,146,FOLLOW_4); 

                            					newLeafNode(otherlv_8, grammarAccess.getXRecordAccess().getIhrKeyword_5_0_1());
                            				

                            }
                            break;

                    }

                    // InternalXMachine.g:2864:4: ( (lv_inheritsNames_9_0= RULE_ID ) )
                    // InternalXMachine.g:2865:5: (lv_inheritsNames_9_0= RULE_ID )
                    {
                    // InternalXMachine.g:2865:5: (lv_inheritsNames_9_0= RULE_ID )
                    // InternalXMachine.g:2866:6: lv_inheritsNames_9_0= RULE_ID
                    {
                    lv_inheritsNames_9_0=(Token)match(input,RULE_ID,FOLLOW_45); 

                    						newLeafNode(lv_inheritsNames_9_0, grammarAccess.getXRecordAccess().getInheritsNamesIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXRecordRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"inheritsNames",
                    							lv_inheritsNames_9_0,
                    							"ac.soton.xeventb.xmachine.XMachine.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:2883:3: ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_fields_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_constraints_14_0= ruleXConstraint ) ) ) )*
            loop61:
            do {
                int alt61=3;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=147 && LA61_0<=148)) ) {
                    alt61=1;
                }
                else if ( (LA61_0==149) ) {
                    alt61=2;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalXMachine.g:2884:4: ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_fields_12_0= ruleField ) ) )
            	    {
            	    // InternalXMachine.g:2884:4: ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_fields_12_0= ruleField ) ) )
            	    // InternalXMachine.g:2885:5: (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_fields_12_0= ruleField ) )
            	    {
            	    // InternalXMachine.g:2885:5: (otherlv_10= 'field' | otherlv_11= 'fld' )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==147) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==148) ) {
            	        alt60=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalXMachine.g:2886:6: otherlv_10= 'field'
            	            {
            	            otherlv_10=(Token)match(input,147,FOLLOW_8); 

            	            						newLeafNode(otherlv_10, grammarAccess.getXRecordAccess().getFieldKeyword_6_0_0_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalXMachine.g:2891:6: otherlv_11= 'fld'
            	            {
            	            otherlv_11=(Token)match(input,148,FOLLOW_8); 

            	            						newLeafNode(otherlv_11, grammarAccess.getXRecordAccess().getFldKeyword_6_0_0_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalXMachine.g:2896:5: ( (lv_fields_12_0= ruleField ) )
            	    // InternalXMachine.g:2897:6: (lv_fields_12_0= ruleField )
            	    {
            	    // InternalXMachine.g:2897:6: (lv_fields_12_0= ruleField )
            	    // InternalXMachine.g:2898:7: lv_fields_12_0= ruleField
            	    {

            	    							newCompositeNode(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_6_0_1_0());
            	    						
            	    pushFollow(FOLLOW_45);
            	    lv_fields_12_0=ruleField();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getXRecordRule());
            	    							}
            	    							add(
            	    								current,
            	    								"fields",
            	    								lv_fields_12_0,
            	    								"ac.soton.xeventb.xmachine.XMachine.Field");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:2917:4: (otherlv_13= 'constraint' ( (lv_constraints_14_0= ruleXConstraint ) ) )
            	    {
            	    // InternalXMachine.g:2917:4: (otherlv_13= 'constraint' ( (lv_constraints_14_0= ruleXConstraint ) ) )
            	    // InternalXMachine.g:2918:5: otherlv_13= 'constraint' ( (lv_constraints_14_0= ruleXConstraint ) )
            	    {
            	    otherlv_13=(Token)match(input,149,FOLLOW_10); 

            	    					newLeafNode(otherlv_13, grammarAccess.getXRecordAccess().getConstraintKeyword_6_1_0());
            	    				
            	    // InternalXMachine.g:2922:5: ( (lv_constraints_14_0= ruleXConstraint ) )
            	    // InternalXMachine.g:2923:6: (lv_constraints_14_0= ruleXConstraint )
            	    {
            	    // InternalXMachine.g:2923:6: (lv_constraints_14_0= ruleXConstraint )
            	    // InternalXMachine.g:2924:7: lv_constraints_14_0= ruleXConstraint
            	    {

            	    							newCompositeNode(grammarAccess.getXRecordAccess().getConstraintsXConstraintParserRuleCall_6_1_1_0());
            	    						
            	    pushFollow(FOLLOW_45);
            	    lv_constraints_14_0=ruleXConstraint();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getXRecordRule());
            	    							}
            	    							add(
            	    								current,
            	    								"constraints",
            	    								lv_constraints_14_0,
            	    								"ac.soton.xeventb.xmachine.XMachine.XConstraint");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_15=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getXRecordAccess().getEndKeyword_7());
            		

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
    // InternalXMachine.g:2951:1: entryRuleFieldType returns [String current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final String entryRuleFieldType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldType = null;


        try {
            // InternalXMachine.g:2951:49: (iv_ruleFieldType= ruleFieldType EOF )
            // InternalXMachine.g:2952:2: iv_ruleFieldType= ruleFieldType EOF
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
    // InternalXMachine.g:2958:1: ruleFieldType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleFieldType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2964:2: ( (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD ) )
            // InternalXMachine.g:2965:2: (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD )
            {
            // InternalXMachine.g:2965:2: (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=41 && LA62_0<=44)||(LA62_0>=47 && LA62_0<=48)||(LA62_0>=62 && LA62_0<=78)) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalXMachine.g:2966:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2974:3: this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD
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
    // InternalXMachine.g:2988:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalXMachine.g:2988:46: (iv_ruleField= ruleField EOF )
            // InternalXMachine.g:2989:2: iv_ruleField= ruleField EOF
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
    // InternalXMachine.g:2995:1: ruleField returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_multiplicity_4_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3001:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) ) )
            // InternalXMachine.g:3002:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) )
            {
            // InternalXMachine.g:3002:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) ) )
            // InternalXMachine.g:3003:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleFieldType ) )
            {
            // InternalXMachine.g:3003:3: ()
            // InternalXMachine.g:3004:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3010:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXMachine.g:3011:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:3011:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:3012:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getFieldAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:3028:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:3029:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:3029:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:3030:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getColonKeyword_3());
            		
            // InternalXMachine.g:3050:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=153 && LA64_0<=155)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXMachine.g:3051:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalXMachine.g:3051:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalXMachine.g:3052:5: lv_multiplicity_4_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_47);
                    lv_multiplicity_4_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_4_0,
                    						"ac.soton.xeventb.xmachine.XMachine.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:3069:3: ( (lv_type_5_0= ruleFieldType ) )
            // InternalXMachine.g:3070:4: (lv_type_5_0= ruleFieldType )
            {
            // InternalXMachine.g:3070:4: (lv_type_5_0= ruleFieldType )
            // InternalXMachine.g:3071:5: lv_type_5_0= ruleFieldType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_5_0=ruleFieldType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"ac.soton.xeventb.xmachine.XMachine.FieldType");
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
    // InternalXMachine.g:3092:1: entryRuleXConstraint returns [EObject current=null] : iv_ruleXConstraint= ruleXConstraint EOF ;
    public final EObject entryRuleXConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstraint = null;


        try {
            // InternalXMachine.g:3092:52: (iv_ruleXConstraint= ruleXConstraint EOF )
            // InternalXMachine.g:3093:2: iv_ruleXConstraint= ruleXConstraint EOF
            {
             newCompositeNode(grammarAccess.getXConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXConstraint=ruleXConstraint();

            state._fsp--;

             current =iv_ruleXConstraint; 
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
    // $ANTLR end "entryRuleXConstraint"


    // $ANTLR start "ruleXConstraint"
    // InternalXMachine.g:3099:1: ruleXConstraint returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3105:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:3106:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:3106:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:3107:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:3107:3: ()
            // InternalXMachine.g:3108:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3114:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_STRING) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXMachine.g:3115:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:3115:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:3116:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getXConstraintAccess().getCommentSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:3132:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:3133:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3133:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:3134:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXConstraintAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:3150:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXMachine.g:3151:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXMachine.g:3151:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXMachine.g:3152:5: lv_predicate_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXConstraintAccess().getPredicateXFormulaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXConstraintRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.XFormula");
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


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:3173:1: ruleXConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleXConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:3179:2: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalXMachine.g:3180:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalXMachine.g:3180:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 150:
                {
                alt66=1;
                }
                break;
            case 151:
                {
                alt66=2;
                }
                break;
            case 152:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalXMachine.g:3181:3: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalXMachine.g:3181:3: (enumLiteral_0= 'ordinary' )
                    // InternalXMachine.g:3182:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,150,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3189:3: (enumLiteral_1= 'convergent' )
                    {
                    // InternalXMachine.g:3189:3: (enumLiteral_1= 'convergent' )
                    // InternalXMachine.g:3190:4: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,151,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:3197:3: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalXMachine.g:3197:3: (enumLiteral_2= 'anticipated' )
                    // InternalXMachine.g:3198:4: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,152,FOLLOW_2); 

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


    // $ANTLR start "ruleMultiplicity"
    // InternalXMachine.g:3208:1: ruleMultiplicity returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:3214:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) )
            // InternalXMachine.g:3215:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            {
            // InternalXMachine.g:3215:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 153:
                {
                alt67=1;
                }
                break;
            case 154:
                {
                alt67=2;
                }
                break;
            case 155:
                {
                alt67=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalXMachine.g:3216:3: (enumLiteral_0= 'one' )
                    {
                    // InternalXMachine.g:3216:3: (enumLiteral_0= 'one' )
                    // InternalXMachine.g:3217:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,153,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3224:3: (enumLiteral_1= 'many' )
                    {
                    // InternalXMachine.g:3224:3: (enumLiteral_1= 'many' )
                    // InternalXMachine.g:3225:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,154,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:3232:3: (enumLiteral_2= 'opt' )
                    {
                    // InternalXMachine.g:3232:3: (enumLiteral_2= 'opt' )
                    // InternalXMachine.g:3233:4: enumLiteral_2= 'opt'
                    {
                    enumLiteral_2=(Token)match(input,155,FOLLOW_2); 

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


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\31\6\uffff";
    static final String dfa_4s = "\1\u0098\2\uffff\1\u0098\6\uffff";
    static final String dfa_5s = "\1\uffff\1\10\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\14\uffff\2\2\2\5\4\uffff\2\4\26\uffff\2\6\1\10\1\11\126\uffff\6\7\5\uffff\3\11",
            "",
            "",
            "\2\4\26\uffff\2\6\1\10\1\11\126\uffff\6\7\5\uffff\3\11",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 250:3: ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x001E0000063FC012L,0x0000000000000000L,0x0000000001C1F800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x001E0000063FC032L,0x0000000000000000L,0x0000000001C1F800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x001E0000061E0032L,0x0000000000000000L,0x0000000001C1F800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x001E0000061E0012L,0x0000000000000000L,0x0000000001C1F800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x001E0000061E0052L,0x0000000000000000L,0x0000000001C1F800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001BE0000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xC001FFFFF90001A0L,0xBFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000001FFE0000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x3FE0000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x3FC0000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x3FC0000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x3F80000000000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x3F80000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000050L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1E02000000000050L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1800000000000050L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000000000050L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC001FFFFF90001A2L,0xBFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000001F800L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xC0019E0000000020L,0x0000000000007FFFL,0x000000000E000000L});

}
