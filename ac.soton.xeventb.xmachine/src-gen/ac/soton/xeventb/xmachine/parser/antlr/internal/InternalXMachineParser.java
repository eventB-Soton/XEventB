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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'refines'", "'sees'", "'contains'", "'variables'", "'vars'", "'invariants'", "'invs'", "'events'", "'end'", "'includes'", "'to'", "'as'", "'.'", "'variable'", "'var'", "':'", "'='", "'\\u2194'", "'<->'", "'\\uE100'", "'<<->'", "'\\uE101'", "'<->>'", "'\\uE102'", "'<<->>'", "'\\u21F8'", "'+->'", "'\\u2192'", "'-->'", "'\\u2914'", "'>+>'", "'\\u21A3'", "'>->'", "'\\u2900'", "'+>>'", "'\\u21A0'", "'->>'", "'\\u2916'", "'>->>'", "'\\u00D7'", "'**'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'('", "')'", "'\\u2119'", "'\\u21191'", "'theorem'", "'invariant'", "'variant'", "'event'", "'extends'", "'any'", "'where'", "'when'", "'then'", "'begin'", "'with'", "'synchronises'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'NAT1'", "'NAT'", "'POW1'", "'POW'", "'INT'", "'\\u21D4'", "'<=>'", "'\\u21D2'", "'=>'", "'\\u2227'", "'&'", "'\\u2228'", "'or'", "'\\u00AC'", "'not'", "'\\u22A4'", "'true'", "'\\u22A5'", "'false'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'\\u2260'", "'/='", "'\\u2264'", "'=<'", "'<'", "'\\u2265'", "'>='", "'>'", "'\\u2208'", "'\\u2209'", "'/:'", "'\\u2282'", "'<<:'", "'\\u2284'", "'/<<:'", "'\\u2286'", "'<:'", "'\\u2288'", "'/<:'", "'partition'", "'{'", "'}'", "'\\u21A6'", "',,'", "'|->'", "'\\u2205'", "'{}'", "'\\u2229'", "'/\\\\'", "'\\u222A'", "'\\\\/'", "'\\u2216'", "'\\\\'", "'['", "']'", "'\\uE103'", "'<+'", "'\\u2218'", "'circ'", "';'", "'\\u2297'", "'><'", "'\\u2225'", "'||'", "'\\u223C'", "'~'", "'\\u25C1'", "'<|'", "'\\u2A64'", "'<<|'", "'\\u25B7'", "'|>'", "'\\u2A65'", "'|>>'", "'\\u03BB'", "'%'", "'\\u22C2'", "'INTER'", "'\\u22C3'", "'UNION'", "'\\u2223'", "'|'", "'\\u2025'", "'..'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'extended'", "'ext'", "'refined'", "'ref'", "'record'", "'rec'", "'inherits'", "'ihr'", "'field'", "'fld'", "'constraint'", "'ordinary'", "'convergent'", "'anticipated'", "'one'", "'many'", "'opt'"
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
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
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
    public static final int T__100=100;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__203=203;
    public static final int T__202=202;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__204=204;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__119=119;
    public static final int T__118=118;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__108=108;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int T__103=103;
    public static final int T__106=106;
    public static final int T__105=105;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__201=201;
    public static final int T__200=200;
    public static final int T__91=91;
    public static final int T__188=188;
    public static final int T__92=92;
    public static final int T__187=187;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__189=189;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__90=90;
    public static final int T__185=185;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int RULE_XLABEL=6;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__199=199;
    public static final int T__81=81;
    public static final int T__198=198;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int RULE_WS=10;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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
    // InternalXMachine.g:72:1: ruleMachine returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )? ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )* (otherlv_23= 'events' ( (lv_orderedChildren_24_0= ruleXEvent ) )+ )? (otherlv_25= 'end' )? ) ;
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
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_orderedChildren_5_0 = null;

        EObject lv_orderedChildren_11_0 = null;

        EObject lv_orderedChildren_14_0 = null;

        EObject lv_orderedChildren_15_0 = null;

        EObject lv_orderedChildren_18_0 = null;

        EObject lv_orderedChildren_19_0 = null;

        EObject lv_orderedChildren_20_0 = null;

        EObject lv_orderedChildren_21_0 = null;

        EObject lv_orderedChildren_22_0 = null;

        EObject lv_orderedChildren_24_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:78:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )? ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )* (otherlv_23= 'events' ( (lv_orderedChildren_24_0= ruleXEvent ) )+ )? (otherlv_25= 'end' )? ) )
            // InternalXMachine.g:79:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )? ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )* (otherlv_23= 'events' ( (lv_orderedChildren_24_0= ruleXEvent ) )+ )? (otherlv_25= 'end' )? )
            {
            // InternalXMachine.g:79:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )? ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )* (otherlv_23= 'events' ( (lv_orderedChildren_24_0= ruleXEvent ) )+ )? (otherlv_25= 'end' )? )
            // InternalXMachine.g:80:3: () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderedChildren_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+ )? ( ( (otherlv_12= 'variables' | otherlv_13= 'vars' ) ( (lv_orderedChildren_14_0= ruleXMultipleVariable ) )+ ) | ( (lv_orderedChildren_15_0= ruleXIndividualVariable ) ) | ( (otherlv_16= 'invariants' | otherlv_17= 'invs' ) ( (lv_orderedChildren_18_0= ruleXMultipleInvariant ) )+ ) | ( (lv_orderedChildren_19_0= ruleXIndividualInvariant ) ) | ( (lv_orderedChildren_20_0= ruleXRecord ) ) | ( (lv_orderedChildren_21_0= ruleXVariant ) ) | ( (lv_orderedChildren_22_0= ruleXEvent ) ) )* (otherlv_23= 'events' ( (lv_orderedChildren_24_0= ruleXEvent ) )+ )? (otherlv_25= 'end' )?
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

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

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

                if ( LA4_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
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

            	        if ( (LA2_0==22) ) {
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
            	    otherlv_6=(Token)match(input,13,FOLLOW_4); 

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
            	    otherlv_8=(Token)match(input,14,FOLLOW_4); 

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

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:226:4: otherlv_10= 'contains' ( (lv_orderedChildren_11_0= ruleMContains ) )+
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_4); 

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

            	    if ( (LA7_0==16) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==17) ) {
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
            	            otherlv_12=(Token)match(input,16,FOLLOW_8); 

            	            						newLeafNode(otherlv_12, grammarAccess.getMachineAccess().getVariablesKeyword_6_0_0_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalXMachine.g:258:6: otherlv_13= 'vars'
            	            {
            	            otherlv_13=(Token)match(input,17,FOLLOW_8); 

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

            	    if ( (LA9_0==18) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==19) ) {
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
            	            otherlv_16=(Token)match(input,18,FOLLOW_10); 

            	            						newLeafNode(otherlv_16, grammarAccess.getMachineAccess().getInvariantsKeyword_6_2_0_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalXMachine.g:311:6: otherlv_17= 'invs'
            	            {
            	            otherlv_17=(Token)match(input,19,FOLLOW_10); 

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

            // InternalXMachine.g:417:3: (otherlv_23= 'events' ( (lv_orderedChildren_24_0= ruleXEvent ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:418:4: otherlv_23= 'events' ( (lv_orderedChildren_24_0= ruleXEvent ) )+
                    {
                    otherlv_23=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_23, grammarAccess.getMachineAccess().getEventsKeyword_7_0());
                    			
                    // InternalXMachine.g:422:4: ( (lv_orderedChildren_24_0= ruleXEvent ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_STRING||LA12_0==65||(LA12_0>=199 && LA12_0<=201)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalXMachine.g:423:5: (lv_orderedChildren_24_0= ruleXEvent )
                    	    {
                    	    // InternalXMachine.g:423:5: (lv_orderedChildren_24_0= ruleXEvent )
                    	    // InternalXMachine.g:424:6: lv_orderedChildren_24_0= ruleXEvent
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getOrderedChildrenXEventParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_orderedChildren_24_0=ruleXEvent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"orderedChildren",
                    	    							lv_orderedChildren_24_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XEvent");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:442:3: (otherlv_25= 'end' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:443:4: otherlv_25= 'end'
                    {
                    otherlv_25=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getMachineAccess().getEndKeyword_8());
                    			

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleMContains"
    // InternalXMachine.g:452:1: entryRuleMContains returns [EObject current=null] : iv_ruleMContains= ruleMContains EOF ;
    public final EObject entryRuleMContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMContains = null;


        try {
            // InternalXMachine.g:452:50: (iv_ruleMContains= ruleMContains EOF )
            // InternalXMachine.g:453:2: iv_ruleMContains= ruleMContains EOF
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
    // InternalXMachine.g:459:1: ruleMContains returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleMContains() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalXMachine.g:465:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalXMachine.g:466:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalXMachine.g:466:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:467:3: () ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:467:3: ()
            // InternalXMachine.g:468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMContainsAccess().getContainmentAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:474:3: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:475:4: ( ruleQualifiedName )
            {
            // InternalXMachine.g:475:4: ( ruleQualifiedName )
            // InternalXMachine.g:476:5: ruleQualifiedName
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
    // InternalXMachine.g:494:1: entryRuleMIncludes returns [EObject current=null] : iv_ruleMIncludes= ruleMIncludes EOF ;
    public final EObject entryRuleMIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIncludes = null;


        try {
            // InternalXMachine.g:494:50: (iv_ruleMIncludes= ruleMIncludes EOF )
            // InternalXMachine.g:495:2: iv_ruleMIncludes= ruleMIncludes EOF
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
    // InternalXMachine.g:501:1: ruleMIncludes returns [EObject current=null] : ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) ;
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
            // InternalXMachine.g:507:2: ( ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) )
            // InternalXMachine.g:508:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            {
            // InternalXMachine.g:508:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            // InternalXMachine.g:509:3: () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            {
            // InternalXMachine.g:509:3: ()
            // InternalXMachine.g:510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMIncludesAccess().getMachineInclusionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:516:3: (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:517:4: otherlv_1= 'includes' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0());
            			
            // InternalXMachine.g:521:4: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:522:5: ( ruleQualifiedName )
            {
            // InternalXMachine.g:522:5: ( ruleQualifiedName )
            // InternalXMachine.g:523:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getMIncludesRule());
            						}
            					

            						newCompositeNode(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0());
            					
            pushFollow(FOLLOW_14);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalXMachine.g:538:3: (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:539:4: otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getMIncludesAccess().getToKeyword_2_0());
                    			
                    // InternalXMachine.g:543:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXMachine.g:544:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXMachine.g:544:5: (otherlv_4= RULE_ID )
                    // InternalXMachine.g:545:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMIncludesRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_4, grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:557:3: (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:558:4: otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getMIncludesAccess().getAsKeyword_3_0());
                    			
                    // InternalXMachine.g:562:4: ( (lv_prefixes_6_0= RULE_ID ) )
                    // InternalXMachine.g:563:5: (lv_prefixes_6_0= RULE_ID )
                    {
                    // InternalXMachine.g:563:5: (lv_prefixes_6_0= RULE_ID )
                    // InternalXMachine.g:564:6: lv_prefixes_6_0= RULE_ID
                    {
                    lv_prefixes_6_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

                    // InternalXMachine.g:580:4: ( (lv_prefixes_7_0= RULE_ID ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalXMachine.g:581:5: (lv_prefixes_7_0= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:581:5: (lv_prefixes_7_0= RULE_ID )
                    	    // InternalXMachine.g:582:6: lv_prefixes_7_0= RULE_ID
                    	    {
                    	    lv_prefixes_7_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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
                    	    break loop16;
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
    // InternalXMachine.g:603:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXMachine.g:603:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXMachine.g:604:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXMachine.g:610:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:616:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalXMachine.g:617:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalXMachine.g:617:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalXMachine.g:618:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXMachine.g:625:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:626:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,25,FOLLOW_4); 

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
    // InternalXMachine.g:643:1: entryRuleXMultipleVariable returns [EObject current=null] : iv_ruleXMultipleVariable= ruleXMultipleVariable EOF ;
    public final EObject entryRuleXMultipleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultipleVariable = null;


        try {
            // InternalXMachine.g:643:58: (iv_ruleXMultipleVariable= ruleXMultipleVariable EOF )
            // InternalXMachine.g:644:2: iv_ruleXMultipleVariable= ruleXMultipleVariable EOF
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
    // InternalXMachine.g:650:1: ruleXMultipleVariable returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXMultipleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:656:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:657:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:657:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:658:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:658:3: ()
            // InternalXMachine.g:659:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXMultipleVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:665:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:666:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:666:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:667:5: lv_comment_1_0= RULE_STRING
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

            // InternalXMachine.g:683:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:684:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:684:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:685:5: lv_name_2_0= RULE_ID
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
    // InternalXMachine.g:705:1: entryRuleXIndividualVariable returns [EObject current=null] : iv_ruleXIndividualVariable= ruleXIndividualVariable EOF ;
    public final EObject entryRuleXIndividualVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIndividualVariable = null;


        try {
            // InternalXMachine.g:705:60: (iv_ruleXIndividualVariable= ruleXIndividualVariable EOF )
            // InternalXMachine.g:706:2: iv_ruleXIndividualVariable= ruleXIndividualVariable EOF
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
    // InternalXMachine.g:712:1: ruleXIndividualVariable returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'variable' | otherlv_3= 'var' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? ) ;
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
            // InternalXMachine.g:718:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'variable' | otherlv_3= 'var' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? ) )
            // InternalXMachine.g:719:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'variable' | otherlv_3= 'var' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? )
            {
            // InternalXMachine.g:719:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'variable' | otherlv_3= 'var' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )? )
            // InternalXMachine.g:720:3: () ( (lv_comment_1_0= RULE_STRING ) )? (otherlv_2= 'variable' | otherlv_3= 'var' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )? (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )?
            {
            // InternalXMachine.g:720:3: ()
            // InternalXMachine.g:721:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXIndividualVariableAccess().getTypedVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:727:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:728:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:728:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:729:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

            // InternalXMachine.g:745:3: (otherlv_2= 'variable' | otherlv_3= 'var' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            else if ( (LA21_0==27) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:746:4: otherlv_2= 'variable'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getXIndividualVariableAccess().getVariableKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:751:4: otherlv_3= 'var'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getXIndividualVariableAccess().getVarKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalXMachine.g:756:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalXMachine.g:757:4: (lv_name_4_0= RULE_ID )
            {
            // InternalXMachine.g:757:4: (lv_name_4_0= RULE_ID )
            // InternalXMachine.g:758:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalXMachine.g:774:3: (otherlv_5= ':' ( (lv_type_6_0= ruleXType ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:775:4: otherlv_5= ':' ( (lv_type_6_0= ruleXType ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getXIndividualVariableAccess().getColonKeyword_4_0());
                    			
                    // InternalXMachine.g:779:4: ( (lv_type_6_0= ruleXType ) )
                    // InternalXMachine.g:780:5: (lv_type_6_0= ruleXType )
                    {
                    // InternalXMachine.g:780:5: (lv_type_6_0= ruleXType )
                    // InternalXMachine.g:781:6: lv_type_6_0= ruleXType
                    {

                    						newCompositeNode(grammarAccess.getXIndividualVariableAccess().getTypeXTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

            // InternalXMachine.g:799:3: (otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:800:4: otherlv_7= '=' ( (lv_value_8_0= ruleXFormula ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getXIndividualVariableAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalXMachine.g:804:4: ( (lv_value_8_0= ruleXFormula ) )
                    // InternalXMachine.g:805:5: (lv_value_8_0= ruleXFormula )
                    {
                    // InternalXMachine.g:805:5: (lv_value_8_0= ruleXFormula )
                    // InternalXMachine.g:806:6: lv_value_8_0= ruleXFormula
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
    // InternalXMachine.g:828:1: entryRuleXType returns [String current=null] : iv_ruleXType= ruleXType EOF ;
    public final String entryRuleXType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXType = null;


        try {
            // InternalXMachine.g:828:45: (iv_ruleXType= ruleXType EOF )
            // InternalXMachine.g:829:2: iv_ruleXType= ruleXType EOF
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
    // InternalXMachine.g:835:1: ruleXType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* ) ;
    public final AntlrDatatypeRuleToken ruleXType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_XTypePrimitive_0 = null;

        AntlrDatatypeRuleToken this_XTYPEOPERATOR_1 = null;

        AntlrDatatypeRuleToken this_XTypePrimitive_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:841:2: ( (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* ) )
            // InternalXMachine.g:842:2: (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* )
            {
            // InternalXMachine.g:842:2: (this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )* )
            // InternalXMachine.g:843:3: this_XTypePrimitive_0= ruleXTypePrimitive (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )*
            {

            			newCompositeNode(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_XTypePrimitive_0=ruleXTypePrimitive();

            state._fsp--;


            			current.merge(this_XTypePrimitive_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXMachine.g:853:3: (this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=30 && LA24_0<=53)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXMachine.g:854:4: this_XTYPEOPERATOR_1= ruleXTYPEOPERATOR this_XTypePrimitive_2= ruleXTypePrimitive
            	    {

            	    				newCompositeNode(grammarAccess.getXTypeAccess().getXTYPEOPERATORParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_20);
            	    this_XTYPEOPERATOR_1=ruleXTYPEOPERATOR();

            	    state._fsp--;


            	    				current.merge(this_XTYPEOPERATOR_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_23);
            	    this_XTypePrimitive_2=ruleXTypePrimitive();

            	    state._fsp--;


            	    				current.merge(this_XTypePrimitive_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalXMachine.g:879:1: entryRuleXTYPEOPERATOR returns [String current=null] : iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF ;
    public final String entryRuleXTYPEOPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXTYPEOPERATOR = null;


        try {
            // InternalXMachine.g:879:53: (iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF )
            // InternalXMachine.g:880:2: iv_ruleXTYPEOPERATOR= ruleXTYPEOPERATOR EOF
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
    // InternalXMachine.g:886:1: ruleXTYPEOPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '<->' | kw= '\\uE100' | kw= '<<->' | kw= '\\uE101' | kw= '<->>' | kw= '\\uE102' | kw= '<<->>' | kw= '\\u21F8' | kw= '+->' | kw= '\\u2192' | kw= '-->' | kw= '\\u2914' | kw= '>+>' | kw= '\\u21A3' | kw= '>->' | kw= '\\u2900' | kw= '+>>' | kw= '\\u21A0' | kw= '->>' | kw= '\\u2916' | kw= '>->>' | kw= '\\u00D7' | kw= '**' ) ;
    public final AntlrDatatypeRuleToken ruleXTYPEOPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:892:2: ( (kw= '\\u2194' | kw= '<->' | kw= '\\uE100' | kw= '<<->' | kw= '\\uE101' | kw= '<->>' | kw= '\\uE102' | kw= '<<->>' | kw= '\\u21F8' | kw= '+->' | kw= '\\u2192' | kw= '-->' | kw= '\\u2914' | kw= '>+>' | kw= '\\u21A3' | kw= '>->' | kw= '\\u2900' | kw= '+>>' | kw= '\\u21A0' | kw= '->>' | kw= '\\u2916' | kw= '>->>' | kw= '\\u00D7' | kw= '**' ) )
            // InternalXMachine.g:893:2: (kw= '\\u2194' | kw= '<->' | kw= '\\uE100' | kw= '<<->' | kw= '\\uE101' | kw= '<->>' | kw= '\\uE102' | kw= '<<->>' | kw= '\\u21F8' | kw= '+->' | kw= '\\u2192' | kw= '-->' | kw= '\\u2914' | kw= '>+>' | kw= '\\u21A3' | kw= '>->' | kw= '\\u2900' | kw= '+>>' | kw= '\\u21A0' | kw= '->>' | kw= '\\u2916' | kw= '>->>' | kw= '\\u00D7' | kw= '**' )
            {
            // InternalXMachine.g:893:2: (kw= '\\u2194' | kw= '<->' | kw= '\\uE100' | kw= '<<->' | kw= '\\uE101' | kw= '<->>' | kw= '\\uE102' | kw= '<<->>' | kw= '\\u21F8' | kw= '+->' | kw= '\\u2192' | kw= '-->' | kw= '\\u2914' | kw= '>+>' | kw= '\\u21A3' | kw= '>->' | kw= '\\u2900' | kw= '+>>' | kw= '\\u21A0' | kw= '->>' | kw= '\\u2916' | kw= '>->>' | kw= '\\u00D7' | kw= '**' )
            int alt25=24;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt25=1;
                }
                break;
            case 31:
                {
                alt25=2;
                }
                break;
            case 32:
                {
                alt25=3;
                }
                break;
            case 33:
                {
                alt25=4;
                }
                break;
            case 34:
                {
                alt25=5;
                }
                break;
            case 35:
                {
                alt25=6;
                }
                break;
            case 36:
                {
                alt25=7;
                }
                break;
            case 37:
                {
                alt25=8;
                }
                break;
            case 38:
                {
                alt25=9;
                }
                break;
            case 39:
                {
                alt25=10;
                }
                break;
            case 40:
                {
                alt25=11;
                }
                break;
            case 41:
                {
                alt25=12;
                }
                break;
            case 42:
                {
                alt25=13;
                }
                break;
            case 43:
                {
                alt25=14;
                }
                break;
            case 44:
                {
                alt25=15;
                }
                break;
            case 45:
                {
                alt25=16;
                }
                break;
            case 46:
                {
                alt25=17;
                }
                break;
            case 47:
                {
                alt25=18;
                }
                break;
            case 48:
                {
                alt25=19;
                }
                break;
            case 49:
                {
                alt25=20;
                }
                break;
            case 50:
                {
                alt25=21;
                }
                break;
            case 51:
                {
                alt25=22;
                }
                break;
            case 52:
                {
                alt25=23;
                }
                break;
            case 53:
                {
                alt25=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:894:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:900:3: kw= '<->'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:906:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:912:3: kw= '<<->'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:918:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:924:3: kw= '<->>'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:930:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:936:3: kw= '<<->>'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:942:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:948:3: kw= '+->'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPlusSignHyphenMinusGreaterThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:954:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:960:3: kw= '-->'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:966:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:972:3: kw= '>+>'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getGreaterThanSignPlusSignGreaterThanSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:978:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:984:3: kw= '>->'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getGreaterThanSignHyphenMinusGreaterThanSignKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:990:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:996:3: kw= '+>>'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getPlusSignGreaterThanSignGreaterThanSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1002:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1008:3: kw= '->>'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1014:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1020:3: kw= '>->>'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getGreaterThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1026:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1032:3: kw= '**'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTYPEOPERATORAccess().getAsteriskAsteriskKeyword_23());
                    		

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
    // InternalXMachine.g:1041:1: entryRuleXTypePrimitive returns [String current=null] : iv_ruleXTypePrimitive= ruleXTypePrimitive EOF ;
    public final String entryRuleXTypePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXTypePrimitive = null;


        try {
            // InternalXMachine.g:1041:54: (iv_ruleXTypePrimitive= ruleXTypePrimitive EOF )
            // InternalXMachine.g:1042:2: iv_ruleXTypePrimitive= ruleXTypePrimitive EOF
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
    // InternalXMachine.g:1048:1: ruleXTypePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleXTypePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_XType_6 = null;

        AntlrDatatypeRuleToken this_XType_10 = null;

        AntlrDatatypeRuleToken this_XType_14 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1054:2: ( (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) ) )
            // InternalXMachine.g:1055:2: (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) )
            {
            // InternalXMachine.g:1055:2: (this_ID_0= RULE_ID | kw= 'BOOL' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u2124' | (kw= '(' this_XType_6= ruleXType kw= ')' ) | (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' ) | (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' ) )
            int alt26=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt26=1;
                }
                break;
            case 54:
                {
                alt26=2;
                }
                break;
            case 55:
                {
                alt26=3;
                }
                break;
            case 56:
                {
                alt26=4;
                }
                break;
            case 57:
                {
                alt26=5;
                }
                break;
            case 58:
                {
                alt26=6;
                }
                break;
            case 60:
                {
                alt26=7;
                }
                break;
            case 61:
                {
                alt26=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalXMachine.g:1056:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1064:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1070:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1076:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1082:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1088:3: (kw= '(' this_XType_6= ruleXType kw= ')' )
                    {
                    // InternalXMachine.g:1088:3: (kw= '(' this_XType_6= ruleXType kw= ')' )
                    // InternalXMachine.g:1089:4: kw= '(' this_XType_6= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,58,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_24);
                    this_XType_6=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,59,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1111:3: (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' )
                    {
                    // InternalXMachine.g:1111:3: (kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')' )
                    // InternalXMachine.g:1112:4: kw= '\\u2119' kw= '(' this_XType_10= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,60,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0());
                    			
                    kw=(Token)match(input,58,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_6_2());
                    			
                    pushFollow(FOLLOW_24);
                    this_XType_10=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_10);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,59,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1139:3: (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' )
                    {
                    // InternalXMachine.g:1139:3: (kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')' )
                    // InternalXMachine.g:1140:4: kw= '\\u21191' kw= '(' this_XType_14= ruleXType kw= ')'
                    {
                    kw=(Token)match(input,61,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0());
                    			
                    kw=(Token)match(input,58,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1());
                    			

                    				newCompositeNode(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_7_2());
                    			
                    pushFollow(FOLLOW_24);
                    this_XType_14=ruleXType();

                    state._fsp--;


                    				current.merge(this_XType_14);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,59,FOLLOW_2); 

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
    // InternalXMachine.g:1170:1: entryRuleXMultipleInvariant returns [EObject current=null] : iv_ruleXMultipleInvariant= ruleXMultipleInvariant EOF ;
    public final EObject entryRuleXMultipleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultipleInvariant = null;


        try {
            // InternalXMachine.g:1170:59: (iv_ruleXMultipleInvariant= ruleXMultipleInvariant EOF )
            // InternalXMachine.g:1171:2: iv_ruleXMultipleInvariant= ruleXMultipleInvariant EOF
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
    // InternalXMachine.g:1177:1: ruleXMultipleInvariant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXMultipleInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1183:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1184:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1184:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:1185:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1185:3: ()
            // InternalXMachine.g:1186:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXMultipleInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1192:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:1193:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1193:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1194:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalXMachine.g:1210:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:1211:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1211:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:1212:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

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

            // InternalXMachine.g:1228:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXMachine.g:1229:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXMachine.g:1229:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXMachine.g:1230:5: lv_predicate_3_0= ruleXFormula
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
    // InternalXMachine.g:1251:1: entryRuleXIndividualInvariant returns [EObject current=null] : iv_ruleXIndividualInvariant= ruleXIndividualInvariant EOF ;
    public final EObject entryRuleXIndividualInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIndividualInvariant = null;


        try {
            // InternalXMachine.g:1251:61: (iv_ruleXIndividualInvariant= ruleXIndividualInvariant EOF )
            // InternalXMachine.g:1252:2: iv_ruleXIndividualInvariant= ruleXIndividualInvariant EOF
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
    // InternalXMachine.g:1258:1: ruleXIndividualInvariant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) ) ;
    public final EObject ruleXIndividualInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_theorem_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        AntlrDatatypeRuleToken lv_predicate_5_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1264:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1265:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1265:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) ) )
            // InternalXMachine.g:1266:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' ) ( (lv_name_4_0= RULE_XLABEL ) ) ( (lv_predicate_5_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1266:3: ()
            // InternalXMachine.g:1267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXIndividualInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1273:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:1274:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1274:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1275:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            // InternalXMachine.g:1291:3: ( ( (lv_theorem_2_0= 'theorem' ) ) | otherlv_3= 'invariant' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==62) ) {
                alt29=1;
            }
            else if ( (LA29_0==63) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalXMachine.g:1292:4: ( (lv_theorem_2_0= 'theorem' ) )
                    {
                    // InternalXMachine.g:1292:4: ( (lv_theorem_2_0= 'theorem' ) )
                    // InternalXMachine.g:1293:5: (lv_theorem_2_0= 'theorem' )
                    {
                    // InternalXMachine.g:1293:5: (lv_theorem_2_0= 'theorem' )
                    // InternalXMachine.g:1294:6: lv_theorem_2_0= 'theorem'
                    {
                    lv_theorem_2_0=(Token)match(input,62,FOLLOW_26); 

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
                    // InternalXMachine.g:1307:4: otherlv_3= 'invariant'
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getXIndividualInvariantAccess().getInvariantKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalXMachine.g:1312:3: ( (lv_name_4_0= RULE_XLABEL ) )
            // InternalXMachine.g:1313:4: (lv_name_4_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1313:4: (lv_name_4_0= RULE_XLABEL )
            // InternalXMachine.g:1314:5: lv_name_4_0= RULE_XLABEL
            {
            lv_name_4_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

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

            // InternalXMachine.g:1330:3: ( (lv_predicate_5_0= ruleXFormula ) )
            // InternalXMachine.g:1331:4: (lv_predicate_5_0= ruleXFormula )
            {
            // InternalXMachine.g:1331:4: (lv_predicate_5_0= ruleXFormula )
            // InternalXMachine.g:1332:5: lv_predicate_5_0= ruleXFormula
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
    // InternalXMachine.g:1353:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:1353:49: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:1354:2: iv_ruleXVariant= ruleXVariant EOF
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
    // InternalXMachine.g:1360:1: ruleXVariant returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'variant' ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_expression_4_0= ruleXFormula ) ) ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1366:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'variant' ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_expression_4_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1367:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'variant' ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_expression_4_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1367:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'variant' ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_expression_4_0= ruleXFormula ) ) )
            // InternalXMachine.g:1368:3: () ( (lv_comment_1_0= RULE_STRING ) )? otherlv_2= 'variant' ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_expression_4_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1368:3: ()
            // InternalXMachine.g:1369:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1375:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:1376:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1376:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1377:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

            otherlv_2=(Token)match(input,64,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getXVariantAccess().getVariantKeyword_2());
            		
            // InternalXMachine.g:1397:3: ( (lv_name_3_0= RULE_XLABEL ) )
            // InternalXMachine.g:1398:4: (lv_name_3_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1398:4: (lv_name_3_0= RULE_XLABEL )
            // InternalXMachine.g:1399:5: lv_name_3_0= RULE_XLABEL
            {
            lv_name_3_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

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

            // InternalXMachine.g:1415:3: ( (lv_expression_4_0= ruleXFormula ) )
            // InternalXMachine.g:1416:4: (lv_expression_4_0= ruleXFormula )
            {
            // InternalXMachine.g:1416:4: (lv_expression_4_0= ruleXFormula )
            // InternalXMachine.g:1417:5: lv_expression_4_0= ruleXFormula
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
    // InternalXMachine.g:1438:1: entryRuleXEvent returns [EObject current=null] : iv_ruleXEvent= ruleXEvent EOF ;
    public final EObject entryRuleXEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEvent = null;


        try {
            // InternalXMachine.g:1438:47: (iv_ruleXEvent= ruleXEvent EOF )
            // InternalXMachine.g:1439:2: iv_ruleXEvent= ruleXEvent EOF
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
    // InternalXMachine.g:1445:1: ruleXEvent returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_convergence_2_0= ruleXConvergence ) )? otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )? (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )? ( (lv_orderedChildren_11_0= ruleEventSync ) )* ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )? ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )? (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )? otherlv_20= 'end' ) ;
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
            // InternalXMachine.g:1451:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_convergence_2_0= ruleXConvergence ) )? otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )? (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )? ( (lv_orderedChildren_11_0= ruleEventSync ) )* ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )? ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )? (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )? otherlv_20= 'end' ) )
            // InternalXMachine.g:1452:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_convergence_2_0= ruleXConvergence ) )? otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )? (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )? ( (lv_orderedChildren_11_0= ruleEventSync ) )* ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )? ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )? (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )? otherlv_20= 'end' )
            {
            // InternalXMachine.g:1452:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_convergence_2_0= ruleXConvergence ) )? otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )? (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )? ( (lv_orderedChildren_11_0= ruleEventSync ) )* ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )? ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )? (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )? otherlv_20= 'end' )
            // InternalXMachine.g:1453:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_convergence_2_0= ruleXConvergence ) )? otherlv_3= 'event' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )? (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )? ( (lv_orderedChildren_11_0= ruleEventSync ) )* ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )? ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )? (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )? otherlv_20= 'end'
            {
            // InternalXMachine.g:1453:3: ()
            // InternalXMachine.g:1454:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1460:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXMachine.g:1461:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1461:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1462:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            // InternalXMachine.g:1478:3: ( (lv_convergence_2_0= ruleXConvergence ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=199 && LA32_0<=201)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXMachine.g:1479:4: (lv_convergence_2_0= ruleXConvergence )
                    {
                    // InternalXMachine.g:1479:4: (lv_convergence_2_0= ruleXConvergence )
                    // InternalXMachine.g:1480:5: lv_convergence_2_0= ruleXConvergence
                    {

                    					newCompositeNode(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,65,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getXEventAccess().getEventKeyword_3());
            		
            // InternalXMachine.g:1501:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalXMachine.g:1502:4: (lv_name_4_0= RULE_ID )
            {
            // InternalXMachine.g:1502:4: (lv_name_4_0= RULE_ID )
            // InternalXMachine.g:1503:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            // InternalXMachine.g:1519:3: ( (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ ) | ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) ) )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==13) ) {
                alt34=1;
            }
            else if ( (LA34_0==66) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // InternalXMachine.g:1520:4: (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ )
                    {
                    // InternalXMachine.g:1520:4: (otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+ )
                    // InternalXMachine.g:1521:5: otherlv_5= 'refines' ( (otherlv_6= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getXEventAccess().getRefinesKeyword_5_0_0());
                    				
                    // InternalXMachine.g:1525:5: ( (otherlv_6= RULE_ID ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalXMachine.g:1526:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:1526:6: (otherlv_6= RULE_ID )
                    	    // InternalXMachine.g:1527:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getXEventRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_0_1_0());
                    	    						

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
                    // InternalXMachine.g:1540:4: ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalXMachine.g:1540:4: ( ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) ) )
                    // InternalXMachine.g:1541:5: ( (lv_extended_7_0= 'extends' ) ) ( (otherlv_8= RULE_ID ) )
                    {
                    // InternalXMachine.g:1541:5: ( (lv_extended_7_0= 'extends' ) )
                    // InternalXMachine.g:1542:6: (lv_extended_7_0= 'extends' )
                    {
                    // InternalXMachine.g:1542:6: (lv_extended_7_0= 'extends' )
                    // InternalXMachine.g:1543:7: lv_extended_7_0= 'extends'
                    {
                    lv_extended_7_0=(Token)match(input,66,FOLLOW_4); 

                    							newLeafNode(lv_extended_7_0, grammarAccess.getXEventAccess().getExtendedExtendsKeyword_5_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getXEventRule());
                    							}
                    							setWithLastConsumed(current, "extended", lv_extended_7_0 != null, "extends");
                    						

                    }


                    }

                    // InternalXMachine.g:1555:5: ( (otherlv_8= RULE_ID ) )
                    // InternalXMachine.g:1556:6: (otherlv_8= RULE_ID )
                    {
                    // InternalXMachine.g:1556:6: (otherlv_8= RULE_ID )
                    // InternalXMachine.g:1557:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getXEventRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_33); 

                    							newLeafNode(otherlv_8, grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:1570:3: (otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==67) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXMachine.g:1571:4: otherlv_9= 'any' ( (lv_orderedChildren_10_0= ruleXParameter ) )+
                    {
                    otherlv_9=(Token)match(input,67,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getXEventAccess().getAnyKeyword_6_0());
                    			
                    // InternalXMachine.g:1575:4: ( (lv_orderedChildren_10_0= ruleXParameter ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalXMachine.g:1576:5: (lv_orderedChildren_10_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:1576:5: (lv_orderedChildren_10_0= ruleXParameter )
                    	    // InternalXMachine.g:1577:6: lv_orderedChildren_10_0= ruleXParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getOrderedChildrenXParameterParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_34);
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

            // InternalXMachine.g:1595:3: ( (lv_orderedChildren_11_0= ruleEventSync ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==73) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXMachine.g:1596:4: (lv_orderedChildren_11_0= ruleEventSync )
            	    {
            	    // InternalXMachine.g:1596:4: (lv_orderedChildren_11_0= ruleEventSync )
            	    // InternalXMachine.g:1597:5: lv_orderedChildren_11_0= ruleEventSync
            	    {

            	    					newCompositeNode(grammarAccess.getXEventAccess().getOrderedChildrenEventSyncParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop37;
                }
            } while (true);

            // InternalXMachine.g:1614:3: ( (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+ )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=68 && LA40_0<=69)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:1615:4: (otherlv_12= 'where' | otherlv_13= 'when' ) ( (lv_orderedChildren_14_0= ruleXGuard ) )+
                    {
                    // InternalXMachine.g:1615:4: (otherlv_12= 'where' | otherlv_13= 'when' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==68) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==69) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalXMachine.g:1616:5: otherlv_12= 'where'
                            {
                            otherlv_12=(Token)match(input,68,FOLLOW_36); 

                            					newLeafNode(otherlv_12, grammarAccess.getXEventAccess().getWhereKeyword_8_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:1621:5: otherlv_13= 'when'
                            {
                            otherlv_13=(Token)match(input,69,FOLLOW_36); 

                            					newLeafNode(otherlv_13, grammarAccess.getXEventAccess().getWhenKeyword_8_0_1());
                            				

                            }
                            break;

                    }

                    // InternalXMachine.g:1626:4: ( (lv_orderedChildren_14_0= ruleXGuard ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_STRING||LA39_0==RULE_XLABEL||LA39_0==62) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalXMachine.g:1627:5: (lv_orderedChildren_14_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:1627:5: (lv_orderedChildren_14_0= ruleXGuard )
                    	    // InternalXMachine.g:1628:6: lv_orderedChildren_14_0= ruleXGuard
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getOrderedChildrenXGuardParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_37);
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

            // InternalXMachine.g:1646:3: ( (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+ )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=70 && LA43_0<=71)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXMachine.g:1647:4: (otherlv_15= 'then' | otherlv_16= 'begin' ) ( (lv_orderedChildren_17_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:1647:4: (otherlv_15= 'then' | otherlv_16= 'begin' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==70) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==71) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalXMachine.g:1648:5: otherlv_15= 'then'
                            {
                            otherlv_15=(Token)match(input,70,FOLLOW_10); 

                            					newLeafNode(otherlv_15, grammarAccess.getXEventAccess().getThenKeyword_9_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:1653:5: otherlv_16= 'begin'
                            {
                            otherlv_16=(Token)match(input,71,FOLLOW_10); 

                            					newLeafNode(otherlv_16, grammarAccess.getXEventAccess().getBeginKeyword_9_0_1());
                            				

                            }
                            break;

                    }

                    // InternalXMachine.g:1658:4: ( (lv_orderedChildren_17_0= ruleXAction ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_STRING||LA42_0==RULE_XLABEL) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalXMachine.g:1659:5: (lv_orderedChildren_17_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1659:5: (lv_orderedChildren_17_0= ruleXAction )
                    	    // InternalXMachine.g:1660:6: lv_orderedChildren_17_0= ruleXAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getOrderedChildrenXActionParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_38);
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
                    	    if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:1678:3: (otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+ )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==72) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:1679:4: otherlv_18= 'with' ( (lv_orderedChildren_19_0= ruleXWitness ) )+
                    {
                    otherlv_18=(Token)match(input,72,FOLLOW_10); 

                    				newLeafNode(otherlv_18, grammarAccess.getXEventAccess().getWithKeyword_10_0());
                    			
                    // InternalXMachine.g:1683:4: ( (lv_orderedChildren_19_0= ruleXWitness ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_STRING||LA44_0==RULE_XLABEL) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalXMachine.g:1684:5: (lv_orderedChildren_19_0= ruleXWitness )
                    	    {
                    	    // InternalXMachine.g:1684:5: (lv_orderedChildren_19_0= ruleXWitness )
                    	    // InternalXMachine.g:1685:6: lv_orderedChildren_19_0= ruleXWitness
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getOrderedChildrenXWitnessParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
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
                    	    if ( cnt44 >= 1 ) break loop44;
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXMachine.g:1711:1: entryRuleEventSync returns [EObject current=null] : iv_ruleEventSync= ruleEventSync EOF ;
    public final EObject entryRuleEventSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSync = null;


        try {
            // InternalXMachine.g:1711:50: (iv_ruleEventSync= ruleEventSync EOF )
            // InternalXMachine.g:1712:2: iv_ruleEventSync= ruleEventSync EOF
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
    // InternalXMachine.g:1718:1: ruleEventSync returns [EObject current=null] : ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleEventSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXMachine.g:1724:2: ( ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalXMachine.g:1725:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalXMachine.g:1725:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            // InternalXMachine.g:1726:3: () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalXMachine.g:1726:3: ()
            // InternalXMachine.g:1727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1733:3: (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:1734:4: otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,73,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0());
            			
            // InternalXMachine.g:1738:4: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==25) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:1739:5: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalXMachine.g:1739:5: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalXMachine.g:1740:6: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalXMachine.g:1740:6: (lv_prefix_2_0= RULE_ID )
                    // InternalXMachine.g:1741:7: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

                    otherlv_3=(Token)match(input,25,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1());
                    				

                    }
                    break;

            }

            // InternalXMachine.g:1762:4: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:1763:5: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:1763:5: (otherlv_4= RULE_ID )
            // InternalXMachine.g:1764:6: otherlv_4= RULE_ID
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
    // InternalXMachine.g:1780:1: entryRuleXParameter returns [EObject current=null] : iv_ruleXParameter= ruleXParameter EOF ;
    public final EObject entryRuleXParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameter = null;


        try {
            // InternalXMachine.g:1780:51: (iv_ruleXParameter= ruleXParameter EOF )
            // InternalXMachine.g:1781:2: iv_ruleXParameter= ruleXParameter EOF
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
    // InternalXMachine.g:1787:1: ruleXParameter returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameter() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1793:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalXMachine.g:1794:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:1794:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalXMachine.g:1795:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalXMachine.g:1795:3: ()
            // InternalXMachine.g:1796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1802:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:1803:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1803:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1804:5: lv_comment_1_0= RULE_STRING
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

            // InternalXMachine.g:1820:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:1821:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:1821:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:1822:5: lv_name_2_0= RULE_ID
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
    // InternalXMachine.g:1842:1: entryRuleXGuard returns [EObject current=null] : iv_ruleXGuard= ruleXGuard EOF ;
    public final EObject entryRuleXGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuard = null;


        try {
            // InternalXMachine.g:1842:47: (iv_ruleXGuard= ruleXGuard EOF )
            // InternalXMachine.g:1843:2: iv_ruleXGuard= ruleXGuard EOF
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
    // InternalXMachine.g:1849:1: ruleXGuard returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) ) ;
    public final EObject ruleXGuard() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_theorem_2_0=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_4_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1855:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1856:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1856:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) ) )
            // InternalXMachine.g:1857:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_name_3_0= RULE_XLABEL ) ) ( (lv_predicate_4_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1857:3: ()
            // InternalXMachine.g:1858:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1864:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:1865:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1865:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1866:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalXMachine.g:1882:3: ( (lv_theorem_2_0= 'theorem' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==62) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXMachine.g:1883:4: (lv_theorem_2_0= 'theorem' )
                    {
                    // InternalXMachine.g:1883:4: (lv_theorem_2_0= 'theorem' )
                    // InternalXMachine.g:1884:5: lv_theorem_2_0= 'theorem'
                    {
                    lv_theorem_2_0=(Token)match(input,62,FOLLOW_26); 

                    					newLeafNode(lv_theorem_2_0, grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardRule());
                    					}
                    					setWithLastConsumed(current, "theorem", lv_theorem_2_0 != null, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1896:3: ( (lv_name_3_0= RULE_XLABEL ) )
            // InternalXMachine.g:1897:4: (lv_name_3_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1897:4: (lv_name_3_0= RULE_XLABEL )
            // InternalXMachine.g:1898:5: lv_name_3_0= RULE_XLABEL
            {
            lv_name_3_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

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

            // InternalXMachine.g:1914:3: ( (lv_predicate_4_0= ruleXFormula ) )
            // InternalXMachine.g:1915:4: (lv_predicate_4_0= ruleXFormula )
            {
            // InternalXMachine.g:1915:4: (lv_predicate_4_0= ruleXFormula )
            // InternalXMachine.g:1916:5: lv_predicate_4_0= ruleXFormula
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
    // InternalXMachine.g:1937:1: entryRuleXWitness returns [EObject current=null] : iv_ruleXWitness= ruleXWitness EOF ;
    public final EObject entryRuleXWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitness = null;


        try {
            // InternalXMachine.g:1937:49: (iv_ruleXWitness= ruleXWitness EOF )
            // InternalXMachine.g:1938:2: iv_ruleXWitness= ruleXWitness EOF
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
    // InternalXMachine.g:1944:1: ruleXWitness returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXWitness() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1950:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1951:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1951:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:1952:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1952:3: ()
            // InternalXMachine.g:1953:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1959:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXMachine.g:1960:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:1960:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:1961:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalXMachine.g:1977:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:1978:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1978:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:1979:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

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

            // InternalXMachine.g:1995:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXMachine.g:1996:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXMachine.g:1996:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXMachine.g:1997:5: lv_predicate_3_0= ruleXFormula
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
    // InternalXMachine.g:2018:1: entryRuleXAction returns [EObject current=null] : iv_ruleXAction= ruleXAction EOF ;
    public final EObject entryRuleXAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAction = null;


        try {
            // InternalXMachine.g:2018:48: (iv_ruleXAction= ruleXAction EOF )
            // InternalXMachine.g:2019:2: iv_ruleXAction= ruleXAction EOF
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
    // InternalXMachine.g:2025:1: ruleXAction returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXAction() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2031:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:2032:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:2032:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:2033:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_action_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:2033:3: ()
            // InternalXMachine.g:2034:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:2040:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXMachine.g:2041:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:2041:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:2042:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalXMachine.g:2058:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:2059:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:2059:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:2060:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

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

            // InternalXMachine.g:2076:3: ( (lv_action_3_0= ruleXFormula ) )
            // InternalXMachine.g:2077:4: (lv_action_3_0= ruleXFormula )
            {
            // InternalXMachine.g:2077:4: (lv_action_3_0= ruleXFormula )
            // InternalXMachine.g:2078:5: lv_action_3_0= ruleXFormula
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
    // InternalXMachine.g:2099:1: entryRuleXFormula returns [String current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final String entryRuleXFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXFormula = null;


        try {
            // InternalXMachine.g:2099:48: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalXMachine.g:2100:2: iv_ruleXFormula= ruleXFormula EOF
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
    // InternalXMachine.g:2106:1: ruleXFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_INT_3= RULE_INT | this_ID_4= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleXFormula() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_3=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_0 = null;

        AntlrDatatypeRuleToken this_EVENTB_PREDICATE_SYMBOLS_1 = null;

        AntlrDatatypeRuleToken this_EVENTB_EXPRESSION_SYMBOLS_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2112:2: ( (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_INT_3= RULE_INT | this_ID_4= RULE_ID )+ )
            // InternalXMachine.g:2113:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_INT_3= RULE_INT | this_ID_4= RULE_ID )+
            {
            // InternalXMachine.g:2113:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_INT_3= RULE_INT | this_ID_4= RULE_ID )+
            int cnt52=0;
            loop52:
            do {
                int alt52=6;
                switch ( input.LA(1) ) {
                case 54:
                case 55:
                case 56:
                case 57:
                case 60:
                case 61:
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
                case 93:
                case 94:
                case 95:
                    {
                    alt52=1;
                    }
                    break;
                case 25:
                case 28:
                case 29:
                case 58:
                case 59:
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
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 132:
                case 133:
                case 134:
                case 135:
                    {
                    alt52=2;
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
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 169:
                case 170:
                case 171:
                case 173:
                case 174:
                case 175:
                case 176:
                case 177:
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 185:
                case 186:
                case 187:
                    {
                    alt52=3;
                    }
                    break;
                case RULE_INT:
                    {
                    alt52=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt52=5;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // InternalXMachine.g:2114:3: this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_42);
            	    this_EVENTB_IDENTIFIER_KEYWORD_0=ruleEVENTB_IDENTIFIER_KEYWORD();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_IDENTIFIER_KEYWORD_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:2125:3: this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1());
            	    		
            	    pushFollow(FOLLOW_42);
            	    this_EVENTB_PREDICATE_SYMBOLS_1=ruleEVENTB_PREDICATE_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_PREDICATE_SYMBOLS_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalXMachine.g:2136:3: this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_42);
            	    this_EVENTB_EXPRESSION_SYMBOLS_2=ruleEVENTB_EXPRESSION_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_EXPRESSION_SYMBOLS_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalXMachine.g:2147:3: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_42); 

            	    			current.merge(this_INT_3);
            	    		

            	    			newLeafNode(this_INT_3, grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalXMachine.g:2155:3: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_42); 

            	    			current.merge(this_ID_4);
            	    		

            	    			newLeafNode(this_ID_4, grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_4());
            	    		

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
    // InternalXMachine.g:2166:1: entryRuleEVENTB_IDENTIFIER_KEYWORD returns [String current=null] : iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final String entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_IDENTIFIER_KEYWORD = null;


        try {
            // InternalXMachine.g:2166:65: (iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXMachine.g:2167:2: iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF
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
    // InternalXMachine.g:2173:1: ruleEVENTB_IDENTIFIER_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= 'NAT1' | kw= '\\u2115' | kw= 'NAT' | kw= '\\u21191' | kw= 'POW1' | kw= '\\u2119' | kw= 'POW' | kw= '\\u2124' | kw= 'INT' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:2179:2: ( (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= 'NAT1' | kw= '\\u2115' | kw= 'NAT' | kw= '\\u21191' | kw= 'POW1' | kw= '\\u2119' | kw= 'POW' | kw= '\\u2124' | kw= 'INT' ) )
            // InternalXMachine.g:2180:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= 'NAT1' | kw= '\\u2115' | kw= 'NAT' | kw= '\\u21191' | kw= 'POW1' | kw= '\\u2119' | kw= 'POW' | kw= '\\u2124' | kw= 'INT' )
            {
            // InternalXMachine.g:2180:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= 'NAT1' | kw= '\\u2115' | kw= 'NAT' | kw= '\\u21191' | kw= 'POW1' | kw= '\\u2119' | kw= 'POW' | kw= '\\u2124' | kw= 'INT' )
            int alt53=28;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt53=1;
                }
                break;
            case 74:
                {
                alt53=2;
                }
                break;
            case 75:
                {
                alt53=3;
                }
                break;
            case 76:
                {
                alt53=4;
                }
                break;
            case 77:
                {
                alt53=5;
                }
                break;
            case 78:
                {
                alt53=6;
                }
                break;
            case 79:
                {
                alt53=7;
                }
                break;
            case 80:
                {
                alt53=8;
                }
                break;
            case 81:
                {
                alt53=9;
                }
                break;
            case 82:
                {
                alt53=10;
                }
                break;
            case 83:
                {
                alt53=11;
                }
                break;
            case 84:
                {
                alt53=12;
                }
                break;
            case 85:
                {
                alt53=13;
                }
                break;
            case 86:
                {
                alt53=14;
                }
                break;
            case 87:
                {
                alt53=15;
                }
                break;
            case 88:
                {
                alt53=16;
                }
                break;
            case 89:
                {
                alt53=17;
                }
                break;
            case 90:
                {
                alt53=18;
                }
                break;
            case 55:
                {
                alt53=19;
                }
                break;
            case 91:
                {
                alt53=20;
                }
                break;
            case 56:
                {
                alt53=21;
                }
                break;
            case 92:
                {
                alt53=22;
                }
                break;
            case 61:
                {
                alt53=23;
                }
                break;
            case 93:
                {
                alt53=24;
                }
                break;
            case 60:
                {
                alt53=25;
                }
                break;
            case 94:
                {
                alt53=26;
                }
                break;
            case 57:
                {
                alt53=27;
                }
                break;
            case 95:
                {
                alt53=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalXMachine.g:2181:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2187:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2193:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:2199:3: kw= 'bool'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:2205:3: kw= 'card'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:2211:3: kw= 'dom'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:2217:3: kw= 'finite'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:2223:3: kw= 'id'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:2229:3: kw= 'inter'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:2235:3: kw= 'max'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:2241:3: kw= 'min'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:2247:3: kw= 'mod'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:2253:3: kw= 'pred'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:2259:3: kw= 'prj1'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:2265:3: kw= 'prj2'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:2271:3: kw= 'ran'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:2277:3: kw= 'succ'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:2283:3: kw= 'union'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:2289:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:2295:3: kw= 'NAT1'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getNAT1Keyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:2301:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:2307:3: kw= 'NAT'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getNATKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:2313:3: kw= '\\u21191'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXMachine.g:2319:3: kw= 'POW1'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPOW1Keyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXMachine.g:2325:3: kw= '\\u2119'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXMachine.g:2331:3: kw= 'POW'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPOWKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXMachine.g:2337:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXMachine.g:2343:3: kw= 'INT'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getINTKeyword_27());
                    		

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
    // InternalXMachine.g:2352:1: entryRuleEVENTB_PREDICATE_SYMBOLS returns [String current=null] : iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final String entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_PREDICATE_SYMBOLS = null;


        try {
            // InternalXMachine.g:2352:64: (iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXMachine.g:2353:2: iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF
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
    // InternalXMachine.g:2359:1: ruleEVENTB_PREDICATE_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '<=>' | kw= '\\u21D2' | kw= '=>' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= 'or' | kw= '\\u00AC' | kw= 'not' | kw= '\\u22A4' | kw= 'true' | kw= '\\u22A5' | kw= 'false' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '/=' | kw= '\\u2264' | kw= '=<' | kw= '<' | kw= '\\u2265' | kw= '>=' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '/:' | kw= '\\u2282' | kw= '<<:' | kw= '\\u2284' | kw= '/<<:' | kw= '\\u2286' | kw= '<:' | kw= '\\u2288' | kw= '/<:' | kw= 'partition' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:2365:2: ( (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '<=>' | kw= '\\u21D2' | kw= '=>' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= 'or' | kw= '\\u00AC' | kw= 'not' | kw= '\\u22A4' | kw= 'true' | kw= '\\u22A5' | kw= 'false' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '/=' | kw= '\\u2264' | kw= '=<' | kw= '<' | kw= '\\u2265' | kw= '>=' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '/:' | kw= '\\u2282' | kw= '<<:' | kw= '\\u2284' | kw= '/<<:' | kw= '\\u2286' | kw= '<:' | kw= '\\u2288' | kw= '/<:' | kw= 'partition' ) )
            // InternalXMachine.g:2366:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '<=>' | kw= '\\u21D2' | kw= '=>' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= 'or' | kw= '\\u00AC' | kw= 'not' | kw= '\\u22A4' | kw= 'true' | kw= '\\u22A5' | kw= 'false' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '/=' | kw= '\\u2264' | kw= '=<' | kw= '<' | kw= '\\u2265' | kw= '>=' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '/:' | kw= '\\u2282' | kw= '<<:' | kw= '\\u2284' | kw= '/<<:' | kw= '\\u2286' | kw= '<:' | kw= '\\u2288' | kw= '/<:' | kw= 'partition' )
            {
            // InternalXMachine.g:2366:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '<=>' | kw= '\\u21D2' | kw= '=>' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= 'or' | kw= '\\u00AC' | kw= 'not' | kw= '\\u22A4' | kw= 'true' | kw= '\\u22A5' | kw= 'false' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '/=' | kw= '\\u2264' | kw= '=<' | kw= '<' | kw= '\\u2265' | kw= '>=' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '/:' | kw= '\\u2282' | kw= '<<:' | kw= '\\u2284' | kw= '/<<:' | kw= '\\u2286' | kw= '<:' | kw= '\\u2288' | kw= '/<:' | kw= 'partition' )
            int alt54=45;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt54=1;
                }
                break;
            case 59:
                {
                alt54=2;
                }
                break;
            case 96:
                {
                alt54=3;
                }
                break;
            case 97:
                {
                alt54=4;
                }
                break;
            case 98:
                {
                alt54=5;
                }
                break;
            case 99:
                {
                alt54=6;
                }
                break;
            case 100:
                {
                alt54=7;
                }
                break;
            case 101:
                {
                alt54=8;
                }
                break;
            case 102:
                {
                alt54=9;
                }
                break;
            case 103:
                {
                alt54=10;
                }
                break;
            case 104:
                {
                alt54=11;
                }
                break;
            case 105:
                {
                alt54=12;
                }
                break;
            case 106:
                {
                alt54=13;
                }
                break;
            case 107:
                {
                alt54=14;
                }
                break;
            case 108:
                {
                alt54=15;
                }
                break;
            case 109:
                {
                alt54=16;
                }
                break;
            case 110:
                {
                alt54=17;
                }
                break;
            case 111:
                {
                alt54=18;
                }
                break;
            case 112:
                {
                alt54=19;
                }
                break;
            case 113:
                {
                alt54=20;
                }
                break;
            case 114:
                {
                alt54=21;
                }
                break;
            case 115:
                {
                alt54=22;
                }
                break;
            case 25:
                {
                alt54=23;
                }
                break;
            case 29:
                {
                alt54=24;
                }
                break;
            case 116:
                {
                alt54=25;
                }
                break;
            case 117:
                {
                alt54=26;
                }
                break;
            case 118:
                {
                alt54=27;
                }
                break;
            case 119:
                {
                alt54=28;
                }
                break;
            case 120:
                {
                alt54=29;
                }
                break;
            case 121:
                {
                alt54=30;
                }
                break;
            case 122:
                {
                alt54=31;
                }
                break;
            case 123:
                {
                alt54=32;
                }
                break;
            case 124:
                {
                alt54=33;
                }
                break;
            case 28:
                {
                alt54=34;
                }
                break;
            case 125:
                {
                alt54=35;
                }
                break;
            case 126:
                {
                alt54=36;
                }
                break;
            case 127:
                {
                alt54=37;
                }
                break;
            case 128:
                {
                alt54=38;
                }
                break;
            case 129:
                {
                alt54=39;
                }
                break;
            case 130:
                {
                alt54=40;
                }
                break;
            case 131:
                {
                alt54=41;
                }
                break;
            case 132:
                {
                alt54=42;
                }
                break;
            case 133:
                {
                alt54=43;
                }
                break;
            case 134:
                {
                alt54=44;
                }
                break;
            case 135:
                {
                alt54=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalXMachine.g:2367:3: kw= '('
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2373:3: kw= ')'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2379:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:2385:3: kw= '<=>'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:2391:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:2397:3: kw= '=>'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignGreaterThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:2403:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:2409:3: kw= '&'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:2415:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:2421:3: kw= 'or'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getOrKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:2427:3: kw= '\\u00AC'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:2433:3: kw= 'not'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:2439:3: kw= '\\u22A4'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:2445:3: kw= 'true'
                    {
                    kw=(Token)match(input,107,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getTrueKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:2451:3: kw= '\\u22A5'
                    {
                    kw=(Token)match(input,108,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:2457:3: kw= 'false'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFalseKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:2463:3: kw= '\\u2200'
                    {
                    kw=(Token)match(input,110,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:2469:3: kw= '!'
                    {
                    kw=(Token)match(input,111,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:2475:3: kw= '\\u2203'
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:2481:3: kw= '#'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:2487:3: kw= ','
                    {
                    kw=(Token)match(input,114,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:2493:3: kw= '\\u00B7'
                    {
                    kw=(Token)match(input,115,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:2499:3: kw= '.'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXMachine.g:2505:3: kw= '='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXMachine.g:2511:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,116,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXMachine.g:2517:3: kw= '/='
                    {
                    kw=(Token)match(input,117,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusEqualsSignKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXMachine.g:2523:3: kw= '\\u2264'
                    {
                    kw=(Token)match(input,118,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXMachine.g:2529:3: kw= '=<'
                    {
                    kw=(Token)match(input,119,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignLessThanSignKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXMachine.g:2535:3: kw= '<'
                    {
                    kw=(Token)match(input,120,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXMachine.g:2541:3: kw= '\\u2265'
                    {
                    kw=(Token)match(input,121,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXMachine.g:2547:3: kw= '>='
                    {
                    kw=(Token)match(input,122,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignEqualsSignKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalXMachine.g:2553:3: kw= '>'
                    {
                    kw=(Token)match(input,123,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalXMachine.g:2559:3: kw= '\\u2208'
                    {
                    kw=(Token)match(input,124,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalXMachine.g:2565:3: kw= ':'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalXMachine.g:2571:3: kw= '\\u2209'
                    {
                    kw=(Token)match(input,125,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalXMachine.g:2577:3: kw= '/:'
                    {
                    kw=(Token)match(input,126,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusColonKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalXMachine.g:2583:3: kw= '\\u2282'
                    {
                    kw=(Token)match(input,127,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalXMachine.g:2589:3: kw= '<<:'
                    {
                    kw=(Token)match(input,128,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignLessThanSignColonKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalXMachine.g:2595:3: kw= '\\u2284'
                    {
                    kw=(Token)match(input,129,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalXMachine.g:2601:3: kw= '/<<:'
                    {
                    kw=(Token)match(input,130,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusLessThanSignLessThanSignColonKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalXMachine.g:2607:3: kw= '\\u2286'
                    {
                    kw=(Token)match(input,131,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalXMachine.g:2613:3: kw= '<:'
                    {
                    kw=(Token)match(input,132,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignColonKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalXMachine.g:2619:3: kw= '\\u2288'
                    {
                    kw=(Token)match(input,133,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalXMachine.g:2625:3: kw= '/<:'
                    {
                    kw=(Token)match(input,134,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusLessThanSignColonKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalXMachine.g:2631:3: kw= 'partition'
                    {
                    kw=(Token)match(input,135,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_44());
                    		

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
    // InternalXMachine.g:2640:1: entryRuleEVENTB_EXPRESSION_SYMBOLS returns [String current=null] : iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final String entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_EXPRESSION_SYMBOLS = null;


        try {
            // InternalXMachine.g:2640:65: (iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXMachine.g:2641:2: iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF
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
    // InternalXMachine.g:2647:1: ruleEVENTB_EXPRESSION_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '<->' | kw= '\\uE100' | kw= '<<->' | kw= '\\uE101' | kw= '<->>' | kw= '\\uE102' | kw= '<<->>' | kw= '\\u21F8' | kw= '+->' | kw= '\\u2192' | kw= '-->' | kw= '\\u2914' | kw= '>+>' | kw= '\\u21A3' | kw= '>->' | kw= '\\u2900' | kw= '+>>' | kw= '\\u21A0' | kw= '->>' | kw= '\\u2916' | kw= '>->>' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= ',,' | kw= '|->' | kw= '\\u2205' | kw= '{}' | kw= '\\u2229' | kw= '/\\\\' | kw= '\\u222A' | kw= '\\\\/' | kw= '\\u2216' | kw= '\\\\' | kw= '\\u00D7' | kw= '**' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '<+' | kw= '\\u2218' | kw= 'circ' | kw= ';' | kw= '\\u2297' | kw= '><' | kw= '\\u2225' | kw= '||' | kw= '\\u223C' | kw= '~' | kw= '\\u25C1' | kw= '<|' | kw= '\\u2A64' | kw= '<<|' | kw= '\\u25B7' | kw= '|>' | kw= '\\u2A65' | kw= '|>>' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= 'INTER' | kw= '\\u22C3' | kw= 'UNION' | kw= '\\u2223' | kw= '|' | kw= '\\u2025' | kw= '..' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:2653:2: ( (kw= '\\u2194' | kw= '<->' | kw= '\\uE100' | kw= '<<->' | kw= '\\uE101' | kw= '<->>' | kw= '\\uE102' | kw= '<<->>' | kw= '\\u21F8' | kw= '+->' | kw= '\\u2192' | kw= '-->' | kw= '\\u2914' | kw= '>+>' | kw= '\\u21A3' | kw= '>->' | kw= '\\u2900' | kw= '+>>' | kw= '\\u21A0' | kw= '->>' | kw= '\\u2916' | kw= '>->>' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= ',,' | kw= '|->' | kw= '\\u2205' | kw= '{}' | kw= '\\u2229' | kw= '/\\\\' | kw= '\\u222A' | kw= '\\\\/' | kw= '\\u2216' | kw= '\\\\' | kw= '\\u00D7' | kw= '**' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '<+' | kw= '\\u2218' | kw= 'circ' | kw= ';' | kw= '\\u2297' | kw= '><' | kw= '\\u2225' | kw= '||' | kw= '\\u223C' | kw= '~' | kw= '\\u25C1' | kw= '<|' | kw= '\\u2A64' | kw= '<<|' | kw= '\\u25B7' | kw= '|>' | kw= '\\u2A65' | kw= '|>>' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= 'INTER' | kw= '\\u22C3' | kw= 'UNION' | kw= '\\u2223' | kw= '|' | kw= '\\u2025' | kw= '..' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' ) )
            // InternalXMachine.g:2654:2: (kw= '\\u2194' | kw= '<->' | kw= '\\uE100' | kw= '<<->' | kw= '\\uE101' | kw= '<->>' | kw= '\\uE102' | kw= '<<->>' | kw= '\\u21F8' | kw= '+->' | kw= '\\u2192' | kw= '-->' | kw= '\\u2914' | kw= '>+>' | kw= '\\u21A3' | kw= '>->' | kw= '\\u2900' | kw= '+>>' | kw= '\\u21A0' | kw= '->>' | kw= '\\u2916' | kw= '>->>' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= ',,' | kw= '|->' | kw= '\\u2205' | kw= '{}' | kw= '\\u2229' | kw= '/\\\\' | kw= '\\u222A' | kw= '\\\\/' | kw= '\\u2216' | kw= '\\\\' | kw= '\\u00D7' | kw= '**' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '<+' | kw= '\\u2218' | kw= 'circ' | kw= ';' | kw= '\\u2297' | kw= '><' | kw= '\\u2225' | kw= '||' | kw= '\\u223C' | kw= '~' | kw= '\\u25C1' | kw= '<|' | kw= '\\u2A64' | kw= '<<|' | kw= '\\u25B7' | kw= '|>' | kw= '\\u2A65' | kw= '|>>' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= 'INTER' | kw= '\\u22C3' | kw= 'UNION' | kw= '\\u2223' | kw= '|' | kw= '\\u2025' | kw= '..' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' )
            {
            // InternalXMachine.g:2654:2: (kw= '\\u2194' | kw= '<->' | kw= '\\uE100' | kw= '<<->' | kw= '\\uE101' | kw= '<->>' | kw= '\\uE102' | kw= '<<->>' | kw= '\\u21F8' | kw= '+->' | kw= '\\u2192' | kw= '-->' | kw= '\\u2914' | kw= '>+>' | kw= '\\u21A3' | kw= '>->' | kw= '\\u2900' | kw= '+>>' | kw= '\\u21A0' | kw= '->>' | kw= '\\u2916' | kw= '>->>' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= ',,' | kw= '|->' | kw= '\\u2205' | kw= '{}' | kw= '\\u2229' | kw= '/\\\\' | kw= '\\u222A' | kw= '\\\\/' | kw= '\\u2216' | kw= '\\\\' | kw= '\\u00D7' | kw= '**' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '<+' | kw= '\\u2218' | kw= 'circ' | kw= ';' | kw= '\\u2297' | kw= '><' | kw= '\\u2225' | kw= '||' | kw= '\\u223C' | kw= '~' | kw= '\\u25C1' | kw= '<|' | kw= '\\u2A64' | kw= '<<|' | kw= '\\u25B7' | kw= '|>' | kw= '\\u2A65' | kw= '|>>' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= 'INTER' | kw= '\\u22C3' | kw= 'UNION' | kw= '\\u2223' | kw= '|' | kw= '\\u2025' | kw= '..' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' )
            int alt55=75;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt55=1;
                }
                break;
            case 31:
                {
                alt55=2;
                }
                break;
            case 32:
                {
                alt55=3;
                }
                break;
            case 33:
                {
                alt55=4;
                }
                break;
            case 34:
                {
                alt55=5;
                }
                break;
            case 35:
                {
                alt55=6;
                }
                break;
            case 36:
                {
                alt55=7;
                }
                break;
            case 37:
                {
                alt55=8;
                }
                break;
            case 38:
                {
                alt55=9;
                }
                break;
            case 39:
                {
                alt55=10;
                }
                break;
            case 40:
                {
                alt55=11;
                }
                break;
            case 41:
                {
                alt55=12;
                }
                break;
            case 42:
                {
                alt55=13;
                }
                break;
            case 43:
                {
                alt55=14;
                }
                break;
            case 44:
                {
                alt55=15;
                }
                break;
            case 45:
                {
                alt55=16;
                }
                break;
            case 46:
                {
                alt55=17;
                }
                break;
            case 47:
                {
                alt55=18;
                }
                break;
            case 48:
                {
                alt55=19;
                }
                break;
            case 49:
                {
                alt55=20;
                }
                break;
            case 50:
                {
                alt55=21;
                }
                break;
            case 51:
                {
                alt55=22;
                }
                break;
            case 136:
                {
                alt55=23;
                }
                break;
            case 137:
                {
                alt55=24;
                }
                break;
            case 138:
                {
                alt55=25;
                }
                break;
            case 139:
                {
                alt55=26;
                }
                break;
            case 140:
                {
                alt55=27;
                }
                break;
            case 141:
                {
                alt55=28;
                }
                break;
            case 142:
                {
                alt55=29;
                }
                break;
            case 143:
                {
                alt55=30;
                }
                break;
            case 144:
                {
                alt55=31;
                }
                break;
            case 145:
                {
                alt55=32;
                }
                break;
            case 146:
                {
                alt55=33;
                }
                break;
            case 147:
                {
                alt55=34;
                }
                break;
            case 148:
                {
                alt55=35;
                }
                break;
            case 52:
                {
                alt55=36;
                }
                break;
            case 53:
                {
                alt55=37;
                }
                break;
            case 149:
                {
                alt55=38;
                }
                break;
            case 150:
                {
                alt55=39;
                }
                break;
            case 151:
                {
                alt55=40;
                }
                break;
            case 152:
                {
                alt55=41;
                }
                break;
            case 153:
                {
                alt55=42;
                }
                break;
            case 154:
                {
                alt55=43;
                }
                break;
            case 155:
                {
                alt55=44;
                }
                break;
            case 156:
                {
                alt55=45;
                }
                break;
            case 157:
                {
                alt55=46;
                }
                break;
            case 158:
                {
                alt55=47;
                }
                break;
            case 159:
                {
                alt55=48;
                }
                break;
            case 160:
                {
                alt55=49;
                }
                break;
            case 161:
                {
                alt55=50;
                }
                break;
            case 162:
                {
                alt55=51;
                }
                break;
            case 163:
                {
                alt55=52;
                }
                break;
            case 164:
                {
                alt55=53;
                }
                break;
            case 165:
                {
                alt55=54;
                }
                break;
            case 166:
                {
                alt55=55;
                }
                break;
            case 167:
                {
                alt55=56;
                }
                break;
            case 168:
                {
                alt55=57;
                }
                break;
            case 169:
                {
                alt55=58;
                }
                break;
            case 170:
                {
                alt55=59;
                }
                break;
            case 171:
                {
                alt55=60;
                }
                break;
            case 173:
                {
                alt55=61;
                }
                break;
            case 174:
                {
                alt55=62;
                }
                break;
            case 175:
                {
                alt55=63;
                }
                break;
            case 176:
                {
                alt55=64;
                }
                break;
            case 177:
                {
                alt55=65;
                }
                break;
            case 178:
                {
                alt55=66;
                }
                break;
            case 179:
                {
                alt55=67;
                }
                break;
            case 180:
                {
                alt55=68;
                }
                break;
            case 181:
                {
                alt55=69;
                }
                break;
            case 182:
                {
                alt55=70;
                }
                break;
            case 183:
                {
                alt55=71;
                }
                break;
            case 184:
                {
                alt55=72;
                }
                break;
            case 185:
                {
                alt55=73;
                }
                break;
            case 186:
                {
                alt55=74;
                }
                break;
            case 187:
                {
                alt55=75;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalXMachine.g:2655:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2661:3: kw= '<->'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2667:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:2673:3: kw= '<<->'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:2679:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:2685:3: kw= '<->>'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:2691:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:2697:3: kw= '<<->>'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:2703:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:2709:3: kw= '+->'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignHyphenMinusGreaterThanSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:2715:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:2721:3: kw= '-->'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:2727:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:2733:3: kw= '>+>'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignPlusSignGreaterThanSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:2739:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:2745:3: kw= '>->'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignHyphenMinusGreaterThanSignKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:2751:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:2757:3: kw= '+>>'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignGreaterThanSignGreaterThanSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:2763:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:2769:3: kw= '->>'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:2775:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:2781:3: kw= '>->>'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:2787:3: kw= '{'
                    {
                    kw=(Token)match(input,136,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXMachine.g:2793:3: kw= '}'
                    {
                    kw=(Token)match(input,137,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXMachine.g:2799:3: kw= '\\u21A6'
                    {
                    kw=(Token)match(input,138,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXMachine.g:2805:3: kw= ',,'
                    {
                    kw=(Token)match(input,139,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCommaCommaKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXMachine.g:2811:3: kw= '|->'
                    {
                    kw=(Token)match(input,140,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXMachine.g:2817:3: kw= '\\u2205'
                    {
                    kw=(Token)match(input,141,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXMachine.g:2823:3: kw= '{}'
                    {
                    kw=(Token)match(input,142,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketRightCurlyBracketKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXMachine.g:2829:3: kw= '\\u2229'
                    {
                    kw=(Token)match(input,143,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXMachine.g:2835:3: kw= '/\\\\'
                    {
                    kw=(Token)match(input,144,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusReverseSolidusKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalXMachine.g:2841:3: kw= '\\u222A'
                    {
                    kw=(Token)match(input,145,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalXMachine.g:2847:3: kw= '\\\\/'
                    {
                    kw=(Token)match(input,146,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getReverseSolidusSolidusKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalXMachine.g:2853:3: kw= '\\u2216'
                    {
                    kw=(Token)match(input,147,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalXMachine.g:2859:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,148,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalXMachine.g:2865:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalXMachine.g:2871:3: kw= '**'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskAsteriskKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalXMachine.g:2877:3: kw= '['
                    {
                    kw=(Token)match(input,149,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalXMachine.g:2883:3: kw= ']'
                    {
                    kw=(Token)match(input,150,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalXMachine.g:2889:3: kw= '\\uE103'
                    {
                    kw=(Token)match(input,151,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalXMachine.g:2895:3: kw= '<+'
                    {
                    kw=(Token)match(input,152,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignPlusSignKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalXMachine.g:2901:3: kw= '\\u2218'
                    {
                    kw=(Token)match(input,153,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalXMachine.g:2907:3: kw= 'circ'
                    {
                    kw=(Token)match(input,154,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalXMachine.g:2913:3: kw= ';'
                    {
                    kw=(Token)match(input,155,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalXMachine.g:2919:3: kw= '\\u2297'
                    {
                    kw=(Token)match(input,156,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalXMachine.g:2925:3: kw= '><'
                    {
                    kw=(Token)match(input,157,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignLessThanSignKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalXMachine.g:2931:3: kw= '\\u2225'
                    {
                    kw=(Token)match(input,158,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalXMachine.g:2937:3: kw= '||'
                    {
                    kw=(Token)match(input,159,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineVerticalLineKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalXMachine.g:2943:3: kw= '\\u223C'
                    {
                    kw=(Token)match(input,160,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalXMachine.g:2949:3: kw= '~'
                    {
                    kw=(Token)match(input,161,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalXMachine.g:2955:3: kw= '\\u25C1'
                    {
                    kw=(Token)match(input,162,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalXMachine.g:2961:3: kw= '<|'
                    {
                    kw=(Token)match(input,163,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignVerticalLineKeyword_51());
                    		

                    }
                    break;
                case 53 :
                    // InternalXMachine.g:2967:3: kw= '\\u2A64'
                    {
                    kw=(Token)match(input,164,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_52());
                    		

                    }
                    break;
                case 54 :
                    // InternalXMachine.g:2973:3: kw= '<<|'
                    {
                    kw=(Token)match(input,165,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignLessThanSignVerticalLineKeyword_53());
                    		

                    }
                    break;
                case 55 :
                    // InternalXMachine.g:2979:3: kw= '\\u25B7'
                    {
                    kw=(Token)match(input,166,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_54());
                    		

                    }
                    break;
                case 56 :
                    // InternalXMachine.g:2985:3: kw= '|>'
                    {
                    kw=(Token)match(input,167,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineGreaterThanSignKeyword_55());
                    		

                    }
                    break;
                case 57 :
                    // InternalXMachine.g:2991:3: kw= '\\u2A65'
                    {
                    kw=(Token)match(input,168,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_56());
                    		

                    }
                    break;
                case 58 :
                    // InternalXMachine.g:2997:3: kw= '|>>'
                    {
                    kw=(Token)match(input,169,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineGreaterThanSignGreaterThanSignKeyword_57());
                    		

                    }
                    break;
                case 59 :
                    // InternalXMachine.g:3003:3: kw= '\\u03BB'
                    {
                    kw=(Token)match(input,170,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_58());
                    		

                    }
                    break;
                case 60 :
                    // InternalXMachine.g:3009:3: (kw= '%' kw= '\\u22C2' )
                    {
                    // InternalXMachine.g:3009:3: (kw= '%' kw= '\\u22C2' )
                    // InternalXMachine.g:3010:4: kw= '%' kw= '\\u22C2'
                    {
                    kw=(Token)match(input,171,FOLLOW_43); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_59_0());
                    			
                    kw=(Token)match(input,172,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_59_1());
                    			

                    }


                    }
                    break;
                case 61 :
                    // InternalXMachine.g:3022:3: kw= 'INTER'
                    {
                    kw=(Token)match(input,173,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getINTERKeyword_60());
                    		

                    }
                    break;
                case 62 :
                    // InternalXMachine.g:3028:3: kw= '\\u22C3'
                    {
                    kw=(Token)match(input,174,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_61());
                    		

                    }
                    break;
                case 63 :
                    // InternalXMachine.g:3034:3: kw= 'UNION'
                    {
                    kw=(Token)match(input,175,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUNIONKeyword_62());
                    		

                    }
                    break;
                case 64 :
                    // InternalXMachine.g:3040:3: kw= '\\u2223'
                    {
                    kw=(Token)match(input,176,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_63());
                    		

                    }
                    break;
                case 65 :
                    // InternalXMachine.g:3046:3: kw= '|'
                    {
                    kw=(Token)match(input,177,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineKeyword_64());
                    		

                    }
                    break;
                case 66 :
                    // InternalXMachine.g:3052:3: kw= '\\u2025'
                    {
                    kw=(Token)match(input,178,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_65());
                    		

                    }
                    break;
                case 67 :
                    // InternalXMachine.g:3058:3: kw= '..'
                    {
                    kw=(Token)match(input,179,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getFullStopFullStopKeyword_66());
                    		

                    }
                    break;
                case 68 :
                    // InternalXMachine.g:3064:3: kw= '+'
                    {
                    kw=(Token)match(input,180,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_67());
                    		

                    }
                    break;
                case 69 :
                    // InternalXMachine.g:3070:3: kw= '\\u2212'
                    {
                    kw=(Token)match(input,181,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_68());
                    		

                    }
                    break;
                case 70 :
                    // InternalXMachine.g:3076:3: kw= '-'
                    {
                    kw=(Token)match(input,182,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_69());
                    		

                    }
                    break;
                case 71 :
                    // InternalXMachine.g:3082:3: kw= '\\u2217'
                    {
                    kw=(Token)match(input,183,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_70());
                    		

                    }
                    break;
                case 72 :
                    // InternalXMachine.g:3088:3: kw= '*'
                    {
                    kw=(Token)match(input,184,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_71());
                    		

                    }
                    break;
                case 73 :
                    // InternalXMachine.g:3094:3: kw= '\\u00F7'
                    {
                    kw=(Token)match(input,185,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_72());
                    		

                    }
                    break;
                case 74 :
                    // InternalXMachine.g:3100:3: kw= '/'
                    {
                    kw=(Token)match(input,186,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_73());
                    		

                    }
                    break;
                case 75 :
                    // InternalXMachine.g:3106:3: kw= '^'
                    {
                    kw=(Token)match(input,187,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_74());
                    		

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
    // InternalXMachine.g:3115:1: entryRuleXRecord returns [EObject current=null] : iv_ruleXRecord= ruleXRecord EOF ;
    public final EObject entryRuleXRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRecord = null;


        try {
            // InternalXMachine.g:3115:48: (iv_ruleXRecord= ruleXRecord EOF )
            // InternalXMachine.g:3116:2: iv_ruleXRecord= ruleXRecord EOF
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
    // InternalXMachine.g:3122:1: ruleXRecord returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )? (otherlv_4= 'record' | otherlv_5= 'rec' ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )? ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_orderedChildren_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_orderedChildren_14_0= ruleXConstraint ) ) ) )* otherlv_15= 'end' ) ;
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
        EObject lv_orderedChildren_12_0 = null;

        EObject lv_orderedChildren_14_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3128:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )? (otherlv_4= 'record' | otherlv_5= 'rec' ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )? ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_orderedChildren_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_orderedChildren_14_0= ruleXConstraint ) ) ) )* otherlv_15= 'end' ) )
            // InternalXMachine.g:3129:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )? (otherlv_4= 'record' | otherlv_5= 'rec' ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )? ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_orderedChildren_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_orderedChildren_14_0= ruleXConstraint ) ) ) )* otherlv_15= 'end' )
            {
            // InternalXMachine.g:3129:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )? (otherlv_4= 'record' | otherlv_5= 'rec' ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )? ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_orderedChildren_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_orderedChildren_14_0= ruleXConstraint ) ) ) )* otherlv_15= 'end' )
            // InternalXMachine.g:3130:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )? (otherlv_4= 'record' | otherlv_5= 'rec' ) ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )? ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_orderedChildren_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_orderedChildren_14_0= ruleXConstraint ) ) ) )* otherlv_15= 'end'
            {
            // InternalXMachine.g:3130:3: ()
            // InternalXMachine.g:3131:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXRecordAccess().getRecordAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3137:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalXMachine.g:3138:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:3138:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:3139:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            // InternalXMachine.g:3155:3: ( ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) ) | ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) ) )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=188 && LA59_0<=189)) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=190 && LA59_0<=191)) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // InternalXMachine.g:3156:4: ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) )
                    {
                    // InternalXMachine.g:3156:4: ( ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) ) )
                    // InternalXMachine.g:3157:5: ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) )
                    {
                    // InternalXMachine.g:3157:5: ( (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' ) )
                    // InternalXMachine.g:3158:6: (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' )
                    {
                    // InternalXMachine.g:3158:6: (lv_extended_2_1= 'extended' | lv_extended_2_2= 'ext' )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==188) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==189) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalXMachine.g:3159:7: lv_extended_2_1= 'extended'
                            {
                            lv_extended_2_1=(Token)match(input,188,FOLLOW_45); 

                            							newLeafNode(lv_extended_2_1, grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getXRecordRule());
                            							}
                            							setWithLastConsumed(current, "extended", lv_extended_2_1 != null, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:3170:7: lv_extended_2_2= 'ext'
                            {
                            lv_extended_2_2=(Token)match(input,189,FOLLOW_45); 

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
                    // InternalXMachine.g:3184:4: ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) )
                    {
                    // InternalXMachine.g:3184:4: ( ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) ) )
                    // InternalXMachine.g:3185:5: ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) )
                    {
                    // InternalXMachine.g:3185:5: ( (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' ) )
                    // InternalXMachine.g:3186:6: (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' )
                    {
                    // InternalXMachine.g:3186:6: (lv_refined_3_1= 'refined' | lv_refined_3_2= 'ref' )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==190) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==191) ) {
                        alt58=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalXMachine.g:3187:7: lv_refined_3_1= 'refined'
                            {
                            lv_refined_3_1=(Token)match(input,190,FOLLOW_45); 

                            							newLeafNode(lv_refined_3_1, grammarAccess.getXRecordAccess().getRefinedRefinedKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getXRecordRule());
                            							}
                            							setWithLastConsumed(current, "refined", lv_refined_3_1 != null, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:3198:7: lv_refined_3_2= 'ref'
                            {
                            lv_refined_3_2=(Token)match(input,191,FOLLOW_45); 

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

            // InternalXMachine.g:3212:3: (otherlv_4= 'record' | otherlv_5= 'rec' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==192) ) {
                alt60=1;
            }
            else if ( (LA60_0==193) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalXMachine.g:3213:4: otherlv_4= 'record'
                    {
                    otherlv_4=(Token)match(input,192,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getXRecordAccess().getRecordKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3218:4: otherlv_5= 'rec'
                    {
                    otherlv_5=(Token)match(input,193,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getXRecordAccess().getRecKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalXMachine.g:3223:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalXMachine.g:3224:4: (lv_name_6_0= RULE_ID )
            {
            // InternalXMachine.g:3224:4: (lv_name_6_0= RULE_ID )
            // InternalXMachine.g:3225:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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

            // InternalXMachine.g:3241:3: ( (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=194 && LA62_0<=195)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXMachine.g:3242:4: (otherlv_7= 'inherits' | otherlv_8= 'ihr' ) ( (lv_inheritsNames_9_0= RULE_ID ) )
                    {
                    // InternalXMachine.g:3242:4: (otherlv_7= 'inherits' | otherlv_8= 'ihr' )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==194) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==195) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalXMachine.g:3243:5: otherlv_7= 'inherits'
                            {
                            otherlv_7=(Token)match(input,194,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getXRecordAccess().getInheritsKeyword_5_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:3248:5: otherlv_8= 'ihr'
                            {
                            otherlv_8=(Token)match(input,195,FOLLOW_4); 

                            					newLeafNode(otherlv_8, grammarAccess.getXRecordAccess().getIhrKeyword_5_0_1());
                            				

                            }
                            break;

                    }

                    // InternalXMachine.g:3253:4: ( (lv_inheritsNames_9_0= RULE_ID ) )
                    // InternalXMachine.g:3254:5: (lv_inheritsNames_9_0= RULE_ID )
                    {
                    // InternalXMachine.g:3254:5: (lv_inheritsNames_9_0= RULE_ID )
                    // InternalXMachine.g:3255:6: lv_inheritsNames_9_0= RULE_ID
                    {
                    lv_inheritsNames_9_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            // InternalXMachine.g:3272:3: ( ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_orderedChildren_12_0= ruleField ) ) ) | (otherlv_13= 'constraint' ( (lv_orderedChildren_14_0= ruleXConstraint ) ) ) )*
            loop64:
            do {
                int alt64=3;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=196 && LA64_0<=197)) ) {
                    alt64=1;
                }
                else if ( (LA64_0==198) ) {
                    alt64=2;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalXMachine.g:3273:4: ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_orderedChildren_12_0= ruleField ) ) )
            	    {
            	    // InternalXMachine.g:3273:4: ( (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_orderedChildren_12_0= ruleField ) ) )
            	    // InternalXMachine.g:3274:5: (otherlv_10= 'field' | otherlv_11= 'fld' ) ( (lv_orderedChildren_12_0= ruleField ) )
            	    {
            	    // InternalXMachine.g:3274:5: (otherlv_10= 'field' | otherlv_11= 'fld' )
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==196) ) {
            	        alt63=1;
            	    }
            	    else if ( (LA63_0==197) ) {
            	        alt63=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 63, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // InternalXMachine.g:3275:6: otherlv_10= 'field'
            	            {
            	            otherlv_10=(Token)match(input,196,FOLLOW_8); 

            	            						newLeafNode(otherlv_10, grammarAccess.getXRecordAccess().getFieldKeyword_6_0_0_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalXMachine.g:3280:6: otherlv_11= 'fld'
            	            {
            	            otherlv_11=(Token)match(input,197,FOLLOW_8); 

            	            						newLeafNode(otherlv_11, grammarAccess.getXRecordAccess().getFldKeyword_6_0_0_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalXMachine.g:3285:5: ( (lv_orderedChildren_12_0= ruleField ) )
            	    // InternalXMachine.g:3286:6: (lv_orderedChildren_12_0= ruleField )
            	    {
            	    // InternalXMachine.g:3286:6: (lv_orderedChildren_12_0= ruleField )
            	    // InternalXMachine.g:3287:7: lv_orderedChildren_12_0= ruleField
            	    {

            	    							newCompositeNode(grammarAccess.getXRecordAccess().getOrderedChildrenFieldParserRuleCall_6_0_1_0());
            	    						
            	    pushFollow(FOLLOW_47);
            	    lv_orderedChildren_12_0=ruleField();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getXRecordRule());
            	    							}
            	    							add(
            	    								current,
            	    								"orderedChildren",
            	    								lv_orderedChildren_12_0,
            	    								"ac.soton.xeventb.xmachine.XMachine.Field");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:3306:4: (otherlv_13= 'constraint' ( (lv_orderedChildren_14_0= ruleXConstraint ) ) )
            	    {
            	    // InternalXMachine.g:3306:4: (otherlv_13= 'constraint' ( (lv_orderedChildren_14_0= ruleXConstraint ) ) )
            	    // InternalXMachine.g:3307:5: otherlv_13= 'constraint' ( (lv_orderedChildren_14_0= ruleXConstraint ) )
            	    {
            	    otherlv_13=(Token)match(input,198,FOLLOW_10); 

            	    					newLeafNode(otherlv_13, grammarAccess.getXRecordAccess().getConstraintKeyword_6_1_0());
            	    				
            	    // InternalXMachine.g:3311:5: ( (lv_orderedChildren_14_0= ruleXConstraint ) )
            	    // InternalXMachine.g:3312:6: (lv_orderedChildren_14_0= ruleXConstraint )
            	    {
            	    // InternalXMachine.g:3312:6: (lv_orderedChildren_14_0= ruleXConstraint )
            	    // InternalXMachine.g:3313:7: lv_orderedChildren_14_0= ruleXConstraint
            	    {

            	    							newCompositeNode(grammarAccess.getXRecordAccess().getOrderedChildrenXConstraintParserRuleCall_6_1_1_0());
            	    						
            	    pushFollow(FOLLOW_47);
            	    lv_orderedChildren_14_0=ruleXConstraint();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getXRecordRule());
            	    							}
            	    							add(
            	    								current,
            	    								"orderedChildren",
            	    								lv_orderedChildren_14_0,
            	    								"ac.soton.xeventb.xmachine.XMachine.XConstraint");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_15=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleField"
    // InternalXMachine.g:3340:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalXMachine.g:3340:46: (iv_ruleField= ruleField EOF )
            // InternalXMachine.g:3341:2: iv_ruleField= ruleField EOF
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
    // InternalXMachine.g:3347:1: ruleField returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleXType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_multiplicity_4_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3353:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleXType ) ) ) )
            // InternalXMachine.g:3354:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleXType ) ) )
            {
            // InternalXMachine.g:3354:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleXType ) ) )
            // InternalXMachine.g:3355:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( (lv_type_5_0= ruleXType ) )
            {
            // InternalXMachine.g:3355:3: ()
            // InternalXMachine.g:3356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3362:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_STRING) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXMachine.g:3363:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:3363:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:3364:5: lv_comment_1_0= RULE_STRING
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

            // InternalXMachine.g:3380:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:3381:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:3381:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:3382:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getColonKeyword_3());
            		
            // InternalXMachine.g:3402:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=202 && LA66_0<=204)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalXMachine.g:3403:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalXMachine.g:3403:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalXMachine.g:3404:5: lv_multiplicity_4_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
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

            // InternalXMachine.g:3421:3: ( (lv_type_5_0= ruleXType ) )
            // InternalXMachine.g:3422:4: (lv_type_5_0= ruleXType )
            {
            // InternalXMachine.g:3422:4: (lv_type_5_0= ruleXType )
            // InternalXMachine.g:3423:5: lv_type_5_0= ruleXType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeXTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_5_0=ruleXType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"ac.soton.xeventb.xmachine.XMachine.XType");
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
    // InternalXMachine.g:3444:1: entryRuleXConstraint returns [EObject current=null] : iv_ruleXConstraint= ruleXConstraint EOF ;
    public final EObject entryRuleXConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstraint = null;


        try {
            // InternalXMachine.g:3444:52: (iv_ruleXConstraint= ruleXConstraint EOF )
            // InternalXMachine.g:3445:2: iv_ruleXConstraint= ruleXConstraint EOF
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
    // InternalXMachine.g:3451:1: ruleXConstraint returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:3457:2: ( ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:3458:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:3458:2: ( () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:3459:3: () ( (lv_comment_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:3459:3: ()
            // InternalXMachine.g:3460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:3466:3: ( (lv_comment_1_0= RULE_STRING ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXMachine.g:3467:4: (lv_comment_1_0= RULE_STRING )
                    {
                    // InternalXMachine.g:3467:4: (lv_comment_1_0= RULE_STRING )
                    // InternalXMachine.g:3468:5: lv_comment_1_0= RULE_STRING
                    {
                    lv_comment_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalXMachine.g:3484:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:3485:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:3485:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:3486:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

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

            // InternalXMachine.g:3502:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXMachine.g:3503:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXMachine.g:3503:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXMachine.g:3504:5: lv_predicate_3_0= ruleXFormula
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
    // InternalXMachine.g:3525:1: ruleXConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleXConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:3531:2: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalXMachine.g:3532:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalXMachine.g:3532:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 199:
                {
                alt68=1;
                }
                break;
            case 200:
                {
                alt68=2;
                }
                break;
            case 201:
                {
                alt68=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalXMachine.g:3533:3: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalXMachine.g:3533:3: (enumLiteral_0= 'ordinary' )
                    // InternalXMachine.g:3534:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,199,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3541:3: (enumLiteral_1= 'convergent' )
                    {
                    // InternalXMachine.g:3541:3: (enumLiteral_1= 'convergent' )
                    // InternalXMachine.g:3542:4: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,200,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:3549:3: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalXMachine.g:3549:3: (enumLiteral_2= 'anticipated' )
                    // InternalXMachine.g:3550:4: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,201,FOLLOW_2); 

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
    // InternalXMachine.g:3560:1: ruleMultiplicity returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:3566:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) )
            // InternalXMachine.g:3567:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            {
            // InternalXMachine.g:3567:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 202:
                {
                alt69=1;
                }
                break;
            case 203:
                {
                alt69=2;
                }
                break;
            case 204:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalXMachine.g:3568:3: (enumLiteral_0= 'one' )
                    {
                    // InternalXMachine.g:3568:3: (enumLiteral_0= 'one' )
                    // InternalXMachine.g:3569:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,202,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:3576:3: (enumLiteral_1= 'many' )
                    {
                    // InternalXMachine.g:3576:3: (enumLiteral_1= 'many' )
                    // InternalXMachine.g:3577:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,203,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:3584:3: (enumLiteral_2= 'opt' )
                    {
                    // InternalXMachine.g:3584:3: (enumLiteral_2= 'opt' )
                    // InternalXMachine.g:3585:4: enumLiteral_2= 'opt'
                    {
                    enumLiteral_2=(Token)match(input,204,FOLLOW_2); 

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
    static final String dfa_3s = "\1\4\2\uffff\1\32\6\uffff";
    static final String dfa_4s = "\1\u00c9\2\uffff\1\u00c9\6\uffff";
    static final String dfa_5s = "\1\uffff\1\10\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\13\uffff\2\2\2\5\2\1\4\uffff\2\4\42\uffff\2\6\1\10\1\11\172\uffff\6\7\5\uffff\3\11",
            "",
            "",
            "\2\4\42\uffff\2\6\1\10\1\11\172\uffff\6\7\5\uffff\3\11",
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xC00000000C7FE012L,0x0000000000000003L,0xF000000000000000L,0x0000000000000383L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xC00000000C7FE032L,0x0000000000000003L,0xF000000000000000L,0x0000000000000383L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xC00000000C3F0032L,0x0000000000000003L,0xF000000000000000L,0x0000000000000383L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xC00000000C3F0012L,0x0000000000000003L,0xF000000000000000L,0x0000000000000383L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xC00000000C3F0052L,0x0000000000000003L,0xF000000000000000L,0x0000000000000383L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xC00000000C0F0010L,0x0000000000000003L,0xF000000000000000L,0x0000000000000383L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xC00000000C2F0012L,0x0000000000000003L,0xF000000000000000L,0x0000000000000383L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x37C0000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x3FFFFFFFF20000A0L,0xFFFFFFFFFFFFFC00L,0x0FFFEFFFFFFFFFFFL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x003FFFFFC0000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000202000L,0x00000000000003FCL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200020L,0x00000000000003F8L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000200000L,0x00000000000003F8L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200030L,0x00000000000003F0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200000L,0x00000000000003F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x4000000000000050L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000000000200050L,0x00000000000001C0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000200050L,0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3FFFFFFFF20000A2L,0xFFFFFFFFFFFFFC00L,0x0FFFEFFFFFFFFFFFL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x37C0000000000020L,0x0000000000000000L,0x0000000000000000L,0x0000000000001C00L});

}
