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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_XLABEL", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'refines'", "'sees'", "'contains'", "'variables'", "'records'", "'invariants'", "'variants'", "'events'", "'end'", "':'", "'includes'", "'to'", "'as'", "'.'", "'theorem'", "'event'", "'extends'", "'any'", "'where'", "'when'", "'then'", "'begin'", "'with'", "'synchronises'", "'BOOL'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21151'", "'\\u2115'", "'\\u21191'", "'\\u2119'", "'\\u2124'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'\\u00D7'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'%'", "'\\u22C2'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'record'", "'ordinary'", "'convergent'", "'anticipated'", "'one'", "'many'", "'opt'"
    };
    public static final int T__50=50;
    public static final int T__140=140;
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
    public static final int RULE_ID=6;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=4;
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
    public static final int RULE_XLABEL=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
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
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=5;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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
    // InternalXMachine.g:72:1: ruleMachine returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_extensions_11_0= ruleMContains ) )+ )? (otherlv_12= 'variables' ( (lv_variables_13_0= ruleXVariable ) )+ )? (otherlv_14= 'records' ( (lv_extensions_15_0= ruleRecord ) )+ )? (otherlv_16= 'invariants' ( (lv_invariants_17_0= ruleXInvariant ) )+ )? (otherlv_18= 'variants' ( (lv_variants_19_0= ruleXVariant ) )+ )? (otherlv_20= 'events' ( (lv_events_21_0= ruleXEvent ) )+ )? otherlv_22= 'end' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_extensions_5_0 = null;

        EObject lv_extensions_11_0 = null;

        EObject lv_variables_13_0 = null;

        EObject lv_extensions_15_0 = null;

        EObject lv_invariants_17_0 = null;

        EObject lv_variants_19_0 = null;

        EObject lv_events_21_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:78:2: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_extensions_11_0= ruleMContains ) )+ )? (otherlv_12= 'variables' ( (lv_variables_13_0= ruleXVariable ) )+ )? (otherlv_14= 'records' ( (lv_extensions_15_0= ruleRecord ) )+ )? (otherlv_16= 'invariants' ( (lv_invariants_17_0= ruleXInvariant ) )+ )? (otherlv_18= 'variants' ( (lv_variants_19_0= ruleXVariant ) )+ )? (otherlv_20= 'events' ( (lv_events_21_0= ruleXEvent ) )+ )? otherlv_22= 'end' ) )
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_extensions_11_0= ruleMContains ) )+ )? (otherlv_12= 'variables' ( (lv_variables_13_0= ruleXVariable ) )+ )? (otherlv_14= 'records' ( (lv_extensions_15_0= ruleRecord ) )+ )? (otherlv_16= 'invariants' ( (lv_invariants_17_0= ruleXInvariant ) )+ )? (otherlv_18= 'variants' ( (lv_variants_19_0= ruleXVariant ) )+ )? (otherlv_20= 'events' ( (lv_events_21_0= ruleXEvent ) )+ )? otherlv_22= 'end' )
            {
            // InternalXMachine.g:79:2: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_extensions_11_0= ruleMContains ) )+ )? (otherlv_12= 'variables' ( (lv_variables_13_0= ruleXVariable ) )+ )? (otherlv_14= 'records' ( (lv_extensions_15_0= ruleRecord ) )+ )? (otherlv_16= 'invariants' ( (lv_invariants_17_0= ruleXInvariant ) )+ )? (otherlv_18= 'variants' ( (lv_variants_19_0= ruleXVariant ) )+ )? (otherlv_20= 'events' ( (lv_events_21_0= ruleXEvent ) )+ )? otherlv_22= 'end' )
            // InternalXMachine.g:80:3: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? otherlv_2= 'machine' ( (lv_name_3_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) ) (otherlv_10= 'contains' ( (lv_extensions_11_0= ruleMContains ) )+ )? (otherlv_12= 'variables' ( (lv_variables_13_0= ruleXVariable ) )+ )? (otherlv_14= 'records' ( (lv_extensions_15_0= ruleRecord ) )+ )? (otherlv_16= 'invariants' ( (lv_invariants_17_0= ruleXInvariant ) )+ )? (otherlv_18= 'variants' ( (lv_variants_19_0= ruleXVariant ) )+ )? (otherlv_20= 'events' ( (lv_events_21_0= ruleXEvent ) )+ )? otherlv_22= 'end'
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

            // InternalXMachine.g:144:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) ) )
            // InternalXMachine.g:145:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) )
            {
            // InternalXMachine.g:145:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* ) )
            // InternalXMachine.g:146:5: ( ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            				
            // InternalXMachine.g:149:5: ( ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )* )
            // InternalXMachine.g:150:6: ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )*
            {
            // InternalXMachine.g:150:6: ( ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) ) )*
            loop5:
            do {
                int alt5=4;
                int LA5_0 = input.LA(1);

                if ( LA5_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                    alt5=3;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXMachine.g:151:4: ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) )
            	    {
            	    // InternalXMachine.g:151:4: ({...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ ) )
            	    // InternalXMachine.g:152:5: {...}? => ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalXMachine.g:152:104: ( ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+ )
            	    // InternalXMachine.g:153:6: ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalXMachine.g:156:9: ({...}? => ( (lv_extensions_5_0= ruleMIncludes ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==23) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalXMachine.g:156:10: {...}? => ( (lv_extensions_5_0= ruleMIncludes ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleMachine", "true");
            	    	    }
            	    	    // InternalXMachine.g:156:19: ( (lv_extensions_5_0= ruleMIncludes ) )
            	    	    // InternalXMachine.g:156:20: (lv_extensions_5_0= ruleMIncludes )
            	    	    {
            	    	    // InternalXMachine.g:156:20: (lv_extensions_5_0= ruleMIncludes )
            	    	    // InternalXMachine.g:157:10: lv_extensions_5_0= ruleMIncludes
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_extensions_5_0=ruleMIncludes();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMachineRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"extensions",
            	    	    											lv_extensions_5_0,
            	    	    											"ac.soton.xeventb.xmachine.XMachine.MIncludes");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:179:4: ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalXMachine.g:179:4: ({...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    // InternalXMachine.g:180:5: {...}? => ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalXMachine.g:180:104: ( ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    // InternalXMachine.g:181:6: ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalXMachine.g:184:9: ({...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) ) )
            	    // InternalXMachine.g:184:10: {...}? => (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "true");
            	    }
            	    // InternalXMachine.g:184:19: (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) ) )
            	    // InternalXMachine.g:184:20: otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,13,FOLLOW_4); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getRefinesKeyword_4_1_0());
            	    								
            	    // InternalXMachine.g:188:9: ( (otherlv_7= RULE_ID ) )
            	    // InternalXMachine.g:189:10: (otherlv_7= RULE_ID )
            	    {
            	    // InternalXMachine.g:189:10: (otherlv_7= RULE_ID )
            	    // InternalXMachine.g:190:11: otherlv_7= RULE_ID
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
            	    // InternalXMachine.g:207:4: ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) )
            	    {
            	    // InternalXMachine.g:207:4: ({...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) ) )
            	    // InternalXMachine.g:208:5: {...}? => ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalXMachine.g:208:104: ( ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) ) )
            	    // InternalXMachine.g:209:6: ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalXMachine.g:212:9: ({...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ ) )
            	    // InternalXMachine.g:212:10: {...}? => (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMachine", "true");
            	    }
            	    // InternalXMachine.g:212:19: (otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+ )
            	    // InternalXMachine.g:212:20: otherlv_8= 'sees' ( (otherlv_9= RULE_ID ) )+
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getSeesKeyword_4_2_0());
            	    								
            	    // InternalXMachine.g:216:9: ( (otherlv_9= RULE_ID ) )+
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
            	    	    // InternalXMachine.g:217:10: (otherlv_9= RULE_ID )
            	    	    {
            	    	    // InternalXMachine.g:217:10: (otherlv_9= RULE_ID )
            	    	    // InternalXMachine.g:218:11: otherlv_9= RULE_ID
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
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            				

            }

            // InternalXMachine.g:242:3: (otherlv_10= 'contains' ( (lv_extensions_11_0= ruleMContains ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:243:4: otherlv_10= 'contains' ( (lv_extensions_11_0= ruleMContains ) )+
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getContainsKeyword_5_0());
                    			
                    // InternalXMachine.g:247:4: ( (lv_extensions_11_0= ruleMContains ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXMachine.g:248:5: (lv_extensions_11_0= ruleMContains )
                    	    {
                    	    // InternalXMachine.g:248:5: (lv_extensions_11_0= ruleMContains )
                    	    // InternalXMachine.g:249:6: lv_extensions_11_0= ruleMContains
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getExtensionsMContainsParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_extensions_11_0=ruleMContains();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"extensions",
                    	    							lv_extensions_11_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.MContains");
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

            // InternalXMachine.g:267:3: (otherlv_12= 'variables' ( (lv_variables_13_0= ruleXVariable ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:268:4: otherlv_12= 'variables' ( (lv_variables_13_0= ruleXVariable ) )+
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getMachineAccess().getVariablesKeyword_6_0());
                    			
                    // InternalXMachine.g:272:4: ( (lv_variables_13_0= ruleXVariable ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalXMachine.g:273:5: (lv_variables_13_0= ruleXVariable )
                    	    {
                    	    // InternalXMachine.g:273:5: (lv_variables_13_0= ruleXVariable )
                    	    // InternalXMachine.g:274:6: lv_variables_13_0= ruleXVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_variables_13_0=ruleXVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_13_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XVariable");
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

            // InternalXMachine.g:292:3: (otherlv_14= 'records' ( (lv_extensions_15_0= ruleRecord ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:293:4: otherlv_14= 'records' ( (lv_extensions_15_0= ruleRecord ) )+
                    {
                    otherlv_14=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getMachineAccess().getRecordsKeyword_7_0());
                    			
                    // InternalXMachine.g:297:4: ( (lv_extensions_15_0= ruleRecord ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==135) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalXMachine.g:298:5: (lv_extensions_15_0= ruleRecord )
                    	    {
                    	    // InternalXMachine.g:298:5: (lv_extensions_15_0= ruleRecord )
                    	    // InternalXMachine.g:299:6: lv_extensions_15_0= ruleRecord
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getExtensionsRecordParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_extensions_15_0=ruleRecord();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"extensions",
                    	    							lv_extensions_15_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.Record");
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
                    break;

            }

            // InternalXMachine.g:317:3: (otherlv_16= 'invariants' ( (lv_invariants_17_0= ruleXInvariant ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:318:4: otherlv_16= 'invariants' ( (lv_invariants_17_0= ruleXInvariant ) )+
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getMachineAccess().getInvariantsKeyword_8_0());
                    			
                    // InternalXMachine.g:322:4: ( (lv_invariants_17_0= ruleXInvariant ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_XLABEL||LA12_0==27) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalXMachine.g:323:5: (lv_invariants_17_0= ruleXInvariant )
                    	    {
                    	    // InternalXMachine.g:323:5: (lv_invariants_17_0= ruleXInvariant )
                    	    // InternalXMachine.g:324:6: lv_invariants_17_0= ruleXInvariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_invariants_17_0=ruleXInvariant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"invariants",
                    	    							lv_invariants_17_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XInvariant");
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

            // InternalXMachine.g:342:3: (otherlv_18= 'variants' ( (lv_variants_19_0= ruleXVariant ) )+ )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:343:4: otherlv_18= 'variants' ( (lv_variants_19_0= ruleXVariant ) )+
                    {
                    otherlv_18=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getMachineAccess().getVariantsKeyword_9_0());
                    			
                    // InternalXMachine.g:347:4: ( (lv_variants_19_0= ruleXVariant ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_XLABEL) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalXMachine.g:348:5: (lv_variants_19_0= ruleXVariant )
                    	    {
                    	    // InternalXMachine.g:348:5: (lv_variants_19_0= ruleXVariant )
                    	    // InternalXMachine.g:349:6: lv_variants_19_0= ruleXVariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getVariantsXVariantParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_variants_19_0=ruleXVariant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variants",
                    	    							lv_variants_19_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XVariant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:367:3: (otherlv_20= 'events' ( (lv_events_21_0= ruleXEvent ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:368:4: otherlv_20= 'events' ( (lv_events_21_0= ruleXEvent ) )+
                    {
                    otherlv_20=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_20, grammarAccess.getMachineAccess().getEventsKeyword_10_0());
                    			
                    // InternalXMachine.g:372:4: ( (lv_events_21_0= ruleXEvent ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==28||(LA16_0>=136 && LA16_0<=138)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalXMachine.g:373:5: (lv_events_21_0= ruleXEvent )
                    	    {
                    	    // InternalXMachine.g:373:5: (lv_events_21_0= ruleXEvent )
                    	    // InternalXMachine.g:374:6: lv_events_21_0= ruleXEvent
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_events_21_0=ruleXEvent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"events",
                    	    							lv_events_21_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XEvent");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getMachineAccess().getEndKeyword_11());
            		

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
    // InternalXMachine.g:400:1: entryRuleMContains returns [EObject current=null] : iv_ruleMContains= ruleMContains EOF ;
    public final EObject entryRuleMContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMContains = null;


        try {
            // InternalXMachine.g:400:50: (iv_ruleMContains= ruleMContains EOF )
            // InternalXMachine.g:401:2: iv_ruleMContains= ruleMContains EOF
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
    // InternalXMachine.g:407:1: ruleMContains returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleMContains() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:413:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalXMachine.g:414:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalXMachine.g:414:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:415:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:415:3: ()
            // InternalXMachine.g:416:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMContainsAccess().getContainmentAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:422:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:423:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:423:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:424:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMContainsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMContainsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMContainsAccess().getColonKeyword_2());
            		
            // InternalXMachine.g:444:3: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:445:4: ( ruleQualifiedName )
            {
            // InternalXMachine.g:445:4: ( ruleQualifiedName )
            // InternalXMachine.g:446:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMContainsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMContainsAccess().getExtensionDiagramCrossReference_3_0());
            				
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
    // InternalXMachine.g:464:1: entryRuleMIncludes returns [EObject current=null] : iv_ruleMIncludes= ruleMIncludes EOF ;
    public final EObject entryRuleMIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMIncludes = null;


        try {
            // InternalXMachine.g:464:50: (iv_ruleMIncludes= ruleMIncludes EOF )
            // InternalXMachine.g:465:2: iv_ruleMIncludes= ruleMIncludes EOF
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
    // InternalXMachine.g:471:1: ruleMIncludes returns [EObject current=null] : ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) ;
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
            // InternalXMachine.g:477:2: ( ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) )
            // InternalXMachine.g:478:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            {
            // InternalXMachine.g:478:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            // InternalXMachine.g:479:3: () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            {
            // InternalXMachine.g:479:3: ()
            // InternalXMachine.g:480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMIncludesAccess().getMachineInclusionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:486:3: (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:487:4: otherlv_1= 'includes' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0());
            			
            // InternalXMachine.g:491:4: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:492:5: ( ruleQualifiedName )
            {
            // InternalXMachine.g:492:5: ( ruleQualifiedName )
            // InternalXMachine.g:493:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getMIncludesRule());
            						}
            					

            						newCompositeNode(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0());
            					
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalXMachine.g:508:3: (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:509:4: otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getMIncludesAccess().getToKeyword_2_0());
                    			
                    // InternalXMachine.g:513:4: ( (otherlv_4= RULE_ID ) )
                    // InternalXMachine.g:514:5: (otherlv_4= RULE_ID )
                    {
                    // InternalXMachine.g:514:5: (otherlv_4= RULE_ID )
                    // InternalXMachine.g:515:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMIncludesRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_4, grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:527:3: (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:528:4: otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getMIncludesAccess().getAsKeyword_3_0());
                    			
                    // InternalXMachine.g:532:4: ( (lv_prefixes_6_0= RULE_ID ) )
                    // InternalXMachine.g:533:5: (lv_prefixes_6_0= RULE_ID )
                    {
                    // InternalXMachine.g:533:5: (lv_prefixes_6_0= RULE_ID )
                    // InternalXMachine.g:534:6: lv_prefixes_6_0= RULE_ID
                    {
                    lv_prefixes_6_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

                    // InternalXMachine.g:550:4: ( (lv_prefixes_7_0= RULE_ID ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalXMachine.g:551:5: (lv_prefixes_7_0= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:551:5: (lv_prefixes_7_0= RULE_ID )
                    	    // InternalXMachine.g:552:6: lv_prefixes_7_0= RULE_ID
                    	    {
                    	    lv_prefixes_7_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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
                    	    break loop19;
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
    // InternalXMachine.g:573:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXMachine.g:573:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXMachine.g:574:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalXMachine.g:580:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:586:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalXMachine.g:587:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalXMachine.g:587:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalXMachine.g:588:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXMachine.g:595:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:596:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,26,FOLLOW_4); 

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
    // InternalXMachine.g:613:1: entryRuleXVariable returns [EObject current=null] : iv_ruleXVariable= ruleXVariable EOF ;
    public final EObject entryRuleXVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariable = null;


        try {
            // InternalXMachine.g:613:50: (iv_ruleXVariable= ruleXVariable EOF )
            // InternalXMachine.g:614:2: iv_ruleXVariable= ruleXVariable EOF
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
    // InternalXMachine.g:620:1: ruleXVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:626:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:627:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:627:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:628:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:628:3: ()
            // InternalXMachine.g:629:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:635:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:636:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:636:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:637:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariableRule());
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
    // $ANTLR end "ruleXVariable"


    // $ANTLR start "entryRuleXInvariant"
    // InternalXMachine.g:657:1: entryRuleXInvariant returns [EObject current=null] : iv_ruleXInvariant= ruleXInvariant EOF ;
    public final EObject entryRuleXInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXInvariant = null;


        try {
            // InternalXMachine.g:657:51: (iv_ruleXInvariant= ruleXInvariant EOF )
            // InternalXMachine.g:658:2: iv_ruleXInvariant= ruleXInvariant EOF
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
    // InternalXMachine.g:664:1: ruleXInvariant returns [EObject current=null] : ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_theorem_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:670:2: ( ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:671:2: ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:671:2: ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:672:3: () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:672:3: ()
            // InternalXMachine.g:673:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:679:3: ( (lv_theorem_1_0= 'theorem' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:680:4: (lv_theorem_1_0= 'theorem' )
                    {
                    // InternalXMachine.g:680:4: (lv_theorem_1_0= 'theorem' )
                    // InternalXMachine.g:681:5: lv_theorem_1_0= 'theorem'
                    {
                    lv_theorem_1_0=(Token)match(input,27,FOLLOW_13); 

                    					newLeafNode(lv_theorem_1_0, grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXInvariantRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:693:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:694:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:694:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:695:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:711:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXMachine.g:712:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXMachine.g:712:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXMachine.g:713:5: lv_predicate_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXInvariantAccess().getPredicateXFormulaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXInvariantRule());
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
    // $ANTLR end "ruleXInvariant"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:734:1: entryRuleXVariant returns [EObject current=null] : iv_ruleXVariant= ruleXVariant EOF ;
    public final EObject entryRuleXVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariant = null;


        try {
            // InternalXMachine.g:734:49: (iv_ruleXVariant= ruleXVariant EOF )
            // InternalXMachine.g:735:2: iv_ruleXVariant= ruleXVariant EOF
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
    // InternalXMachine.g:741:1: ruleXVariant returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_expression_2_0= ruleXFormula ) ) ) ;
    public final EObject ruleXVariant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:747:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_expression_2_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:748:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_expression_2_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:748:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_expression_2_0= ruleXFormula ) ) )
            // InternalXMachine.g:749:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_expression_2_0= ruleXFormula ) )
            {
            // InternalXMachine.g:749:3: ()
            // InternalXMachine.g:750:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXVariantAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:756:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:757:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:757:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:758:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXVariantAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXVariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:774:3: ( (lv_expression_2_0= ruleXFormula ) )
            // InternalXMachine.g:775:4: (lv_expression_2_0= ruleXFormula )
            {
            // InternalXMachine.g:775:4: (lv_expression_2_0= ruleXFormula )
            // InternalXMachine.g:776:5: lv_expression_2_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXVariantAccess().getExpressionXFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXVariantRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
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
    // InternalXMachine.g:797:1: entryRuleXEvent returns [EObject current=null] : iv_ruleXEvent= ruleXEvent EOF ;
    public final EObject entryRuleXEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEvent = null;


        try {
            // InternalXMachine.g:797:47: (iv_ruleXEvent= ruleXEvent EOF )
            // InternalXMachine.g:798:2: iv_ruleXEvent= ruleXEvent EOF
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
    // InternalXMachine.g:804:1: ruleXEvent returns [EObject current=null] : ( () ( (lv_convergence_1_0= ruleXConvergence ) )? otherlv_2= 'event' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )? ( (lv_extensions_10_0= ruleEventSync ) )* ( (otherlv_11= 'where' | otherlv_12= 'when' ) ( (lv_guards_13_0= ruleXGuard ) )+ )? ( (otherlv_14= 'then' | otherlv_15= 'begin' ) ( (lv_actions_16_0= ruleXAction ) )+ )? (otherlv_17= 'with' ( (lv_witnesses_18_0= ruleXWitness ) )+ )? otherlv_19= 'end' ) ;
    public final EObject ruleXEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_extended_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_convergence_1_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_extensions_10_0 = null;

        EObject lv_guards_13_0 = null;

        EObject lv_actions_16_0 = null;

        EObject lv_witnesses_18_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:810:2: ( ( () ( (lv_convergence_1_0= ruleXConvergence ) )? otherlv_2= 'event' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )? ( (lv_extensions_10_0= ruleEventSync ) )* ( (otherlv_11= 'where' | otherlv_12= 'when' ) ( (lv_guards_13_0= ruleXGuard ) )+ )? ( (otherlv_14= 'then' | otherlv_15= 'begin' ) ( (lv_actions_16_0= ruleXAction ) )+ )? (otherlv_17= 'with' ( (lv_witnesses_18_0= ruleXWitness ) )+ )? otherlv_19= 'end' ) )
            // InternalXMachine.g:811:2: ( () ( (lv_convergence_1_0= ruleXConvergence ) )? otherlv_2= 'event' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )? ( (lv_extensions_10_0= ruleEventSync ) )* ( (otherlv_11= 'where' | otherlv_12= 'when' ) ( (lv_guards_13_0= ruleXGuard ) )+ )? ( (otherlv_14= 'then' | otherlv_15= 'begin' ) ( (lv_actions_16_0= ruleXAction ) )+ )? (otherlv_17= 'with' ( (lv_witnesses_18_0= ruleXWitness ) )+ )? otherlv_19= 'end' )
            {
            // InternalXMachine.g:811:2: ( () ( (lv_convergence_1_0= ruleXConvergence ) )? otherlv_2= 'event' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )? ( (lv_extensions_10_0= ruleEventSync ) )* ( (otherlv_11= 'where' | otherlv_12= 'when' ) ( (lv_guards_13_0= ruleXGuard ) )+ )? ( (otherlv_14= 'then' | otherlv_15= 'begin' ) ( (lv_actions_16_0= ruleXAction ) )+ )? (otherlv_17= 'with' ( (lv_witnesses_18_0= ruleXWitness ) )+ )? otherlv_19= 'end' )
            // InternalXMachine.g:812:3: () ( (lv_convergence_1_0= ruleXConvergence ) )? otherlv_2= 'event' ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )? (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )? ( (lv_extensions_10_0= ruleEventSync ) )* ( (otherlv_11= 'where' | otherlv_12= 'when' ) ( (lv_guards_13_0= ruleXGuard ) )+ )? ( (otherlv_14= 'then' | otherlv_15= 'begin' ) ( (lv_actions_16_0= ruleXAction ) )+ )? (otherlv_17= 'with' ( (lv_witnesses_18_0= ruleXWitness ) )+ )? otherlv_19= 'end'
            {
            // InternalXMachine.g:812:3: ()
            // InternalXMachine.g:813:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:819:3: ( (lv_convergence_1_0= ruleXConvergence ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=136 && LA23_0<=138)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:820:4: (lv_convergence_1_0= ruleXConvergence )
                    {
                    // InternalXMachine.g:820:4: (lv_convergence_1_0= ruleXConvergence )
                    // InternalXMachine.g:821:5: lv_convergence_1_0= ruleXConvergence
                    {

                    					newCompositeNode(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_convergence_1_0=ruleXConvergence();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getXEventRule());
                    					}
                    					set(
                    						current,
                    						"convergence",
                    						lv_convergence_1_0,
                    						"ac.soton.xeventb.xmachine.XMachine.XConvergence");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getXEventAccess().getEventKeyword_2());
            		
            // InternalXMachine.g:842:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXMachine.g:843:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXMachine.g:843:4: (lv_name_3_0= RULE_ID )
            // InternalXMachine.g:844:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_3_0, grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:860:3: ( (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ ) | ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) ) )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            else if ( (LA25_0==29) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:861:4: (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ )
                    {
                    // InternalXMachine.g:861:4: (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+ )
                    // InternalXMachine.g:862:5: otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )+
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getXEventAccess().getRefinesKeyword_4_0_0());
                    				
                    // InternalXMachine.g:866:5: ( (otherlv_5= RULE_ID ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalXMachine.g:867:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalXMachine.g:867:6: (otherlv_5= RULE_ID )
                    	    // InternalXMachine.g:868:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getXEventRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_0_1_0());
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:881:4: ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalXMachine.g:881:4: ( ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) ) )
                    // InternalXMachine.g:882:5: ( (lv_extended_6_0= 'extends' ) ) ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalXMachine.g:882:5: ( (lv_extended_6_0= 'extends' ) )
                    // InternalXMachine.g:883:6: (lv_extended_6_0= 'extends' )
                    {
                    // InternalXMachine.g:883:6: (lv_extended_6_0= 'extends' )
                    // InternalXMachine.g:884:7: lv_extended_6_0= 'extends'
                    {
                    lv_extended_6_0=(Token)match(input,29,FOLLOW_4); 

                    							newLeafNode(lv_extended_6_0, grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getXEventRule());
                    							}
                    							setWithLastConsumed(current, "extended", true, "extends");
                    						

                    }


                    }

                    // InternalXMachine.g:896:5: ( (otherlv_7= RULE_ID ) )
                    // InternalXMachine.g:897:6: (otherlv_7= RULE_ID )
                    {
                    // InternalXMachine.g:897:6: (otherlv_7= RULE_ID )
                    // InternalXMachine.g:898:7: otherlv_7= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getXEventRule());
                    							}
                    						
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_26); 

                    							newLeafNode(otherlv_7, grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalXMachine.g:911:3: (otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+ )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:912:4: otherlv_8= 'any' ( (lv_parameters_9_0= ruleXParameter ) )+
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getXEventAccess().getAnyKeyword_5_0());
                    			
                    // InternalXMachine.g:916:4: ( (lv_parameters_9_0= ruleXParameter ) )+
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
                    	    // InternalXMachine.g:917:5: (lv_parameters_9_0= ruleXParameter )
                    	    {
                    	    // InternalXMachine.g:917:5: (lv_parameters_9_0= ruleXParameter )
                    	    // InternalXMachine.g:918:6: lv_parameters_9_0= ruleXParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_parameters_9_0=ruleXParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_9_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XParameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            // InternalXMachine.g:936:3: ( (lv_extensions_10_0= ruleEventSync ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==36) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalXMachine.g:937:4: (lv_extensions_10_0= ruleEventSync )
            	    {
            	    // InternalXMachine.g:937:4: (lv_extensions_10_0= ruleEventSync )
            	    // InternalXMachine.g:938:5: lv_extensions_10_0= ruleEventSync
            	    {

            	    					newCompositeNode(grammarAccess.getXEventAccess().getExtensionsEventSyncParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_extensions_10_0=ruleEventSync();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_10_0,
            	    						"ac.soton.xeventb.xmachine.XMachine.EventSync");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalXMachine.g:955:3: ( (otherlv_11= 'where' | otherlv_12= 'when' ) ( (lv_guards_13_0= ruleXGuard ) )+ )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=31 && LA31_0<=32)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXMachine.g:956:4: (otherlv_11= 'where' | otherlv_12= 'when' ) ( (lv_guards_13_0= ruleXGuard ) )+
                    {
                    // InternalXMachine.g:956:4: (otherlv_11= 'where' | otherlv_12= 'when' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==31) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==32) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalXMachine.g:957:5: otherlv_11= 'where'
                            {
                            otherlv_11=(Token)match(input,31,FOLLOW_11); 

                            					newLeafNode(otherlv_11, grammarAccess.getXEventAccess().getWhereKeyword_7_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:962:5: otherlv_12= 'when'
                            {
                            otherlv_12=(Token)match(input,32,FOLLOW_11); 

                            					newLeafNode(otherlv_12, grammarAccess.getXEventAccess().getWhenKeyword_7_0_1());
                            				

                            }
                            break;

                    }

                    // InternalXMachine.g:967:4: ( (lv_guards_13_0= ruleXGuard ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_XLABEL||LA30_0==27) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalXMachine.g:968:5: (lv_guards_13_0= ruleXGuard )
                    	    {
                    	    // InternalXMachine.g:968:5: (lv_guards_13_0= ruleXGuard )
                    	    // InternalXMachine.g:969:6: lv_guards_13_0= ruleXGuard
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
                    	    lv_guards_13_0=ruleXGuard();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
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
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    }
                    break;

            }

            // InternalXMachine.g:987:3: ( (otherlv_14= 'then' | otherlv_15= 'begin' ) ( (lv_actions_16_0= ruleXAction ) )+ )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=33 && LA34_0<=34)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXMachine.g:988:4: (otherlv_14= 'then' | otherlv_15= 'begin' ) ( (lv_actions_16_0= ruleXAction ) )+
                    {
                    // InternalXMachine.g:988:4: (otherlv_14= 'then' | otherlv_15= 'begin' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==33) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==34) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalXMachine.g:989:5: otherlv_14= 'then'
                            {
                            otherlv_14=(Token)match(input,33,FOLLOW_13); 

                            					newLeafNode(otherlv_14, grammarAccess.getXEventAccess().getThenKeyword_8_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXMachine.g:994:5: otherlv_15= 'begin'
                            {
                            otherlv_15=(Token)match(input,34,FOLLOW_13); 

                            					newLeafNode(otherlv_15, grammarAccess.getXEventAccess().getBeginKeyword_8_0_1());
                            				

                            }
                            break;

                    }

                    // InternalXMachine.g:999:4: ( (lv_actions_16_0= ruleXAction ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_XLABEL) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalXMachine.g:1000:5: (lv_actions_16_0= ruleXAction )
                    	    {
                    	    // InternalXMachine.g:1000:5: (lv_actions_16_0= ruleXAction )
                    	    // InternalXMachine.g:1001:6: lv_actions_16_0= ruleXAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_actions_16_0=ruleXAction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"actions",
                    	    							lv_actions_16_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XAction");
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

            // InternalXMachine.g:1019:3: (otherlv_17= 'with' ( (lv_witnesses_18_0= ruleXWitness ) )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXMachine.g:1020:4: otherlv_17= 'with' ( (lv_witnesses_18_0= ruleXWitness ) )+
                    {
                    otherlv_17=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getXEventAccess().getWithKeyword_9_0());
                    			
                    // InternalXMachine.g:1024:4: ( (lv_witnesses_18_0= ruleXWitness ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_XLABEL) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalXMachine.g:1025:5: (lv_witnesses_18_0= ruleXWitness )
                    	    {
                    	    // InternalXMachine.g:1025:5: (lv_witnesses_18_0= ruleXWitness )
                    	    // InternalXMachine.g:1026:6: lv_witnesses_18_0= ruleXWitness
                    	    {

                    	    						newCompositeNode(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_witnesses_18_0=ruleXWitness();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"witnesses",
                    	    							lv_witnesses_18_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.XWitness");
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

            otherlv_19=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getXEventAccess().getEndKeyword_10());
            		

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
    // InternalXMachine.g:1052:1: entryRuleEventSync returns [EObject current=null] : iv_ruleEventSync= ruleEventSync EOF ;
    public final EObject entryRuleEventSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSync = null;


        try {
            // InternalXMachine.g:1052:50: (iv_ruleEventSync= ruleEventSync EOF )
            // InternalXMachine.g:1053:2: iv_ruleEventSync= ruleEventSync EOF
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
    // InternalXMachine.g:1059:1: ruleEventSync returns [EObject current=null] : ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleEventSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXMachine.g:1065:2: ( ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalXMachine.g:1066:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalXMachine.g:1066:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            // InternalXMachine.g:1067:3: () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalXMachine.g:1067:3: ()
            // InternalXMachine.g:1068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1074:3: (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:1075:4: otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0());
            			
            // InternalXMachine.g:1079:4: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==26) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalXMachine.g:1080:5: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalXMachine.g:1080:5: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalXMachine.g:1081:6: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalXMachine.g:1081:6: (lv_prefix_2_0= RULE_ID )
                    // InternalXMachine.g:1082:7: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

                    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1());
                    				

                    }
                    break;

            }

            // InternalXMachine.g:1103:4: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:1104:5: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:1104:5: (otherlv_4= RULE_ID )
            // InternalXMachine.g:1105:6: otherlv_4= RULE_ID
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
    // InternalXMachine.g:1121:1: entryRuleXParameter returns [EObject current=null] : iv_ruleXParameter= ruleXParameter EOF ;
    public final EObject entryRuleXParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParameter = null;


        try {
            // InternalXMachine.g:1121:51: (iv_ruleXParameter= ruleXParameter EOF )
            // InternalXMachine.g:1122:2: iv_ruleXParameter= ruleXParameter EOF
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
    // InternalXMachine.g:1128:1: ruleXParameter returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleXParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXMachine.g:1134:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXMachine.g:1135:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXMachine.g:1135:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXMachine.g:1136:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXMachine.g:1136:3: ()
            // InternalXMachine.g:1137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXMachine.g:1144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXMachine.g:1144:4: (lv_name_1_0= RULE_ID )
            // InternalXMachine.g:1145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXParameterRule());
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
    // $ANTLR end "ruleXParameter"


    // $ANTLR start "entryRuleXGuard"
    // InternalXMachine.g:1165:1: entryRuleXGuard returns [EObject current=null] : iv_ruleXGuard= ruleXGuard EOF ;
    public final EObject entryRuleXGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGuard = null;


        try {
            // InternalXMachine.g:1165:47: (iv_ruleXGuard= ruleXGuard EOF )
            // InternalXMachine.g:1166:2: iv_ruleXGuard= ruleXGuard EOF
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
    // InternalXMachine.g:1172:1: ruleXGuard returns [EObject current=null] : ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleXGuard() throws RecognitionException {
        EObject current = null;

        Token lv_theorem_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1178:2: ( ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1179:2: ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1179:2: ( () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) ) )
            // InternalXMachine.g:1180:3: () ( (lv_theorem_1_0= 'theorem' ) )? ( (lv_name_2_0= RULE_XLABEL ) ) ( (lv_predicate_3_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1180:3: ()
            // InternalXMachine.g:1181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXGuardAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1187:3: ( (lv_theorem_1_0= 'theorem' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==27) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXMachine.g:1188:4: (lv_theorem_1_0= 'theorem' )
                    {
                    // InternalXMachine.g:1188:4: (lv_theorem_1_0= 'theorem' )
                    // InternalXMachine.g:1189:5: lv_theorem_1_0= 'theorem'
                    {
                    lv_theorem_1_0=(Token)match(input,27,FOLLOW_13); 

                    					newLeafNode(lv_theorem_1_0, grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXGuardRule());
                    					}
                    					setWithLastConsumed(current, "theorem", true, "theorem");
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:1201:3: ( (lv_name_2_0= RULE_XLABEL ) )
            // InternalXMachine.g:1202:4: (lv_name_2_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1202:4: (lv_name_2_0= RULE_XLABEL )
            // InternalXMachine.g:1203:5: lv_name_2_0= RULE_XLABEL
            {
            lv_name_2_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

            					newLeafNode(lv_name_2_0, grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGuardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1219:3: ( (lv_predicate_3_0= ruleXFormula ) )
            // InternalXMachine.g:1220:4: (lv_predicate_3_0= ruleXFormula )
            {
            // InternalXMachine.g:1220:4: (lv_predicate_3_0= ruleXFormula )
            // InternalXMachine.g:1221:5: lv_predicate_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXGuardAccess().getPredicateXFormulaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXGuardRule());
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
    // $ANTLR end "ruleXGuard"


    // $ANTLR start "entryRuleXWitness"
    // InternalXMachine.g:1242:1: entryRuleXWitness returns [EObject current=null] : iv_ruleXWitness= ruleXWitness EOF ;
    public final EObject entryRuleXWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWitness = null;


        try {
            // InternalXMachine.g:1242:49: (iv_ruleXWitness= ruleXWitness EOF )
            // InternalXMachine.g:1243:2: iv_ruleXWitness= ruleXWitness EOF
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
    // InternalXMachine.g:1249:1: ruleXWitness returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXFormula ) ) ) ;
    public final EObject ruleXWitness() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1255:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1256:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1256:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXFormula ) ) )
            // InternalXMachine.g:1257:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_predicate_2_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1257:3: ()
            // InternalXMachine.g:1258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXWitnessAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1264:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1265:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1265:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1266:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXWitnessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1282:3: ( (lv_predicate_2_0= ruleXFormula ) )
            // InternalXMachine.g:1283:4: (lv_predicate_2_0= ruleXFormula )
            {
            // InternalXMachine.g:1283:4: (lv_predicate_2_0= ruleXFormula )
            // InternalXMachine.g:1284:5: lv_predicate_2_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXWitnessAccess().getPredicateXFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_2_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXWitnessRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
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
    // InternalXMachine.g:1305:1: entryRuleXAction returns [EObject current=null] : iv_ruleXAction= ruleXAction EOF ;
    public final EObject entryRuleXAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAction = null;


        try {
            // InternalXMachine.g:1305:48: (iv_ruleXAction= ruleXAction EOF )
            // InternalXMachine.g:1306:2: iv_ruleXAction= ruleXAction EOF
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
    // InternalXMachine.g:1312:1: ruleXAction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXFormula ) ) ) ;
    public final EObject ruleXAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1318:2: ( ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXFormula ) ) ) )
            // InternalXMachine.g:1319:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXFormula ) ) )
            {
            // InternalXMachine.g:1319:2: ( () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXFormula ) ) )
            // InternalXMachine.g:1320:3: () ( (lv_name_1_0= RULE_XLABEL ) ) ( (lv_action_2_0= ruleXFormula ) )
            {
            // InternalXMachine.g:1320:3: ()
            // InternalXMachine.g:1321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalXMachine.g:1327:3: ( (lv_name_1_0= RULE_XLABEL ) )
            // InternalXMachine.g:1328:4: (lv_name_1_0= RULE_XLABEL )
            {
            // InternalXMachine.g:1328:4: (lv_name_1_0= RULE_XLABEL )
            // InternalXMachine.g:1329:5: lv_name_1_0= RULE_XLABEL
            {
            lv_name_1_0=(Token)match(input,RULE_XLABEL,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.xmachine.XMachine.XLABEL");
            				

            }


            }

            // InternalXMachine.g:1345:3: ( (lv_action_2_0= ruleXFormula ) )
            // InternalXMachine.g:1346:4: (lv_action_2_0= ruleXFormula )
            {
            // InternalXMachine.g:1346:4: (lv_action_2_0= ruleXFormula )
            // InternalXMachine.g:1347:5: lv_action_2_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getXActionAccess().getActionXFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_2_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
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
    // InternalXMachine.g:1368:1: entryRuleXFormula returns [String current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final String entryRuleXFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXFormula = null;


        try {
            // InternalXMachine.g:1368:48: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalXMachine.g:1369:2: iv_ruleXFormula= ruleXFormula EOF
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
    // InternalXMachine.g:1375:1: ruleXFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+ ;
    public final AntlrDatatypeRuleToken ruleXFormula() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_3=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_0 = null;

        AntlrDatatypeRuleToken this_EVENTB_PREDICATE_SYMBOLS_1 = null;

        AntlrDatatypeRuleToken this_EVENTB_EXPRESSION_SYMBOLS_2 = null;



        	enterRule();

        try {
            // InternalXMachine.g:1381:2: ( (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+ )
            // InternalXMachine.g:1382:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+
            {
            // InternalXMachine.g:1382:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+
            int cnt39=0;
            loop39:
            do {
                int alt39=6;
                switch ( input.LA(1) ) {
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
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    {
                    alt39=1;
                    }
                    break;
                case 22:
                case 26:
                case 60:
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
                case 87:
                case 88:
                    {
                    alt39=2;
                    }
                    break;
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
                    {
                    alt39=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt39=4;
                    }
                    break;
                case RULE_INT:
                    {
                    alt39=5;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:1383:3: this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_33);
            	    this_EVENTB_IDENTIFIER_KEYWORD_0=ruleEVENTB_IDENTIFIER_KEYWORD();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_IDENTIFIER_KEYWORD_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalXMachine.g:1394:3: this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1());
            	    		
            	    pushFollow(FOLLOW_33);
            	    this_EVENTB_PREDICATE_SYMBOLS_1=ruleEVENTB_PREDICATE_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_PREDICATE_SYMBOLS_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalXMachine.g:1405:3: this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_33);
            	    this_EVENTB_EXPRESSION_SYMBOLS_2=ruleEVENTB_EXPRESSION_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_EXPRESSION_SYMBOLS_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalXMachine.g:1416:3: this_ID_3= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            	    			current.merge(this_ID_3);
            	    		

            	    			newLeafNode(this_ID_3, grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalXMachine.g:1424:3: this_INT_4= RULE_INT
            	    {
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_33); 

            	    			current.merge(this_INT_4);
            	    		

            	    			newLeafNode(this_INT_4, grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4());
            	    		

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


            	leaveRule();

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
    // InternalXMachine.g:1435:1: entryRuleEVENTB_IDENTIFIER_KEYWORD returns [String current=null] : iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final String entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_IDENTIFIER_KEYWORD = null;


        try {
            // InternalXMachine.g:1435:65: (iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXMachine.g:1436:2: iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF
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
    // InternalXMachine.g:1442:1: ruleEVENTB_IDENTIFIER_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:1448:2: ( (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) )
            // InternalXMachine.g:1449:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            {
            // InternalXMachine.g:1449:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            int alt40=23;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt40=1;
                }
                break;
            case 38:
                {
                alt40=2;
                }
                break;
            case 39:
                {
                alt40=3;
                }
                break;
            case 40:
                {
                alt40=4;
                }
                break;
            case 41:
                {
                alt40=5;
                }
                break;
            case 42:
                {
                alt40=6;
                }
                break;
            case 43:
                {
                alt40=7;
                }
                break;
            case 44:
                {
                alt40=8;
                }
                break;
            case 45:
                {
                alt40=9;
                }
                break;
            case 46:
                {
                alt40=10;
                }
                break;
            case 47:
                {
                alt40=11;
                }
                break;
            case 48:
                {
                alt40=12;
                }
                break;
            case 49:
                {
                alt40=13;
                }
                break;
            case 50:
                {
                alt40=14;
                }
                break;
            case 51:
                {
                alt40=15;
                }
                break;
            case 52:
                {
                alt40=16;
                }
                break;
            case 53:
                {
                alt40=17;
                }
                break;
            case 54:
                {
                alt40=18;
                }
                break;
            case 55:
                {
                alt40=19;
                }
                break;
            case 56:
                {
                alt40=20;
                }
                break;
            case 57:
                {
                alt40=21;
                }
                break;
            case 58:
                {
                alt40=22;
                }
                break;
            case 59:
                {
                alt40=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:1450:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1456:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1462:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1468:3: kw= 'bool'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1474:3: kw= 'card'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1480:3: kw= 'dom'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1486:3: kw= 'finite'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1492:3: kw= 'id'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1498:3: kw= 'inter'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1504:3: kw= 'max'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1510:3: kw= 'min'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1516:3: kw= 'mod'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1522:3: kw= 'pred'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1528:3: kw= 'prj1'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1534:3: kw= 'prj2'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1540:3: kw= 'ran'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1546:3: kw= 'succ'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1552:3: kw= 'union'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1558:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1564:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1570:3: kw= '\\u21191'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1576:3: kw= '\\u2119'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1582:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

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
    // InternalXMachine.g:1591:1: entryRuleEVENTB_PREDICATE_SYMBOLS returns [String current=null] : iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final String entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_PREDICATE_SYMBOLS = null;


        try {
            // InternalXMachine.g:1591:64: (iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXMachine.g:1592:2: iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF
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
    // InternalXMachine.g:1598:1: ruleEVENTB_PREDICATE_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:1604:2: ( (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) )
            // InternalXMachine.g:1605:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            {
            // InternalXMachine.g:1605:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            int alt41=31;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt41=1;
                }
                break;
            case 61:
                {
                alt41=2;
                }
                break;
            case 62:
                {
                alt41=3;
                }
                break;
            case 63:
                {
                alt41=4;
                }
                break;
            case 64:
                {
                alt41=5;
                }
                break;
            case 65:
                {
                alt41=6;
                }
                break;
            case 66:
                {
                alt41=7;
                }
                break;
            case 67:
                {
                alt41=8;
                }
                break;
            case 68:
                {
                alt41=9;
                }
                break;
            case 69:
                {
                alt41=10;
                }
                break;
            case 70:
                {
                alt41=11;
                }
                break;
            case 71:
                {
                alt41=12;
                }
                break;
            case 72:
                {
                alt41=13;
                }
                break;
            case 73:
                {
                alt41=14;
                }
                break;
            case 74:
                {
                alt41=15;
                }
                break;
            case 75:
                {
                alt41=16;
                }
                break;
            case 26:
                {
                alt41=17;
                }
                break;
            case 76:
                {
                alt41=18;
                }
                break;
            case 77:
                {
                alt41=19;
                }
                break;
            case 78:
                {
                alt41=20;
                }
                break;
            case 79:
                {
                alt41=21;
                }
                break;
            case 80:
                {
                alt41=22;
                }
                break;
            case 81:
                {
                alt41=23;
                }
                break;
            case 82:
                {
                alt41=24;
                }
                break;
            case 22:
                {
                alt41=25;
                }
                break;
            case 83:
                {
                alt41=26;
                }
                break;
            case 84:
                {
                alt41=27;
                }
                break;
            case 85:
                {
                alt41=28;
                }
                break;
            case 86:
                {
                alt41=29;
                }
                break;
            case 87:
                {
                alt41=30;
                }
                break;
            case 88:
                {
                alt41=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:1606:3: kw= '('
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1612:3: kw= ')'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1618:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1624:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1630:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1636:3: kw= '&'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1642:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1648:3: kw= '\\u00AC'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1654:3: kw= '\\u22A4'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1660:3: kw= '\\u22A5'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1666:3: kw= '\\u2200'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1672:3: kw= '!'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1678:3: kw= '\\u2203'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1684:3: kw= '#'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1690:3: kw= ','
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1696:3: kw= '\\u00B7'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1702:3: kw= '.'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1708:3: kw= '='
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1714:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1720:3: kw= '\\u2264'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1726:3: kw= '<'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1732:3: kw= '\\u2265'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1738:3: kw= '>'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1744:3: kw= '\\u2208'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1750:3: kw= ':'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1756:3: kw= '\\u2209'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1762:3: kw= '\\u2282'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1768:3: kw= '\\u2284'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1774:3: kw= '\\u2286'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1780:3: kw= '\\u2288'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1786:3: kw= 'partition'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

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
    // InternalXMachine.g:1795:1: entryRuleEVENTB_EXPRESSION_SYMBOLS returns [String current=null] : iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final String entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_EXPRESSION_SYMBOLS = null;


        try {
            // InternalXMachine.g:1795:65: (iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXMachine.g:1796:2: iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF
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
    // InternalXMachine.g:1802:1: ruleEVENTB_EXPRESSION_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXMachine.g:1808:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) )
            // InternalXMachine.g:1809:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            {
            // InternalXMachine.g:1809:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            int alt42=45;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt42=1;
                }
                break;
            case 90:
                {
                alt42=2;
                }
                break;
            case 91:
                {
                alt42=3;
                }
                break;
            case 92:
                {
                alt42=4;
                }
                break;
            case 93:
                {
                alt42=5;
                }
                break;
            case 94:
                {
                alt42=6;
                }
                break;
            case 95:
                {
                alt42=7;
                }
                break;
            case 96:
                {
                alt42=8;
                }
                break;
            case 97:
                {
                alt42=9;
                }
                break;
            case 98:
                {
                alt42=10;
                }
                break;
            case 99:
                {
                alt42=11;
                }
                break;
            case 100:
                {
                alt42=12;
                }
                break;
            case 101:
                {
                alt42=13;
                }
                break;
            case 102:
                {
                alt42=14;
                }
                break;
            case 103:
                {
                alt42=15;
                }
                break;
            case 104:
                {
                alt42=16;
                }
                break;
            case 105:
                {
                alt42=17;
                }
                break;
            case 106:
                {
                alt42=18;
                }
                break;
            case 107:
                {
                alt42=19;
                }
                break;
            case 108:
                {
                alt42=20;
                }
                break;
            case 109:
                {
                alt42=21;
                }
                break;
            case 110:
                {
                alt42=22;
                }
                break;
            case 111:
                {
                alt42=23;
                }
                break;
            case 112:
                {
                alt42=24;
                }
                break;
            case 113:
                {
                alt42=25;
                }
                break;
            case 114:
                {
                alt42=26;
                }
                break;
            case 115:
                {
                alt42=27;
                }
                break;
            case 116:
                {
                alt42=28;
                }
                break;
            case 117:
                {
                alt42=29;
                }
                break;
            case 118:
                {
                alt42=30;
                }
                break;
            case 119:
                {
                alt42=31;
                }
                break;
            case 120:
                {
                alt42=32;
                }
                break;
            case 121:
                {
                alt42=33;
                }
                break;
            case 123:
                {
                alt42=34;
                }
                break;
            case 124:
                {
                alt42=35;
                }
                break;
            case 125:
                {
                alt42=36;
                }
                break;
            case 126:
                {
                alt42=37;
                }
                break;
            case 127:
                {
                alt42=38;
                }
                break;
            case 128:
                {
                alt42=39;
                }
                break;
            case 129:
                {
                alt42=40;
                }
                break;
            case 130:
                {
                alt42=41;
                }
                break;
            case 131:
                {
                alt42=42;
                }
                break;
            case 132:
                {
                alt42=43;
                }
                break;
            case 133:
                {
                alt42=44;
                }
                break;
            case 134:
                {
                alt42=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:1810:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1816:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1822:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1828:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1834:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1840:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1846:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1852:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1858:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1864:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1870:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1876:3: kw= '{'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1882:3: kw= '}'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1888:3: kw= '\\u21A6'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1894:3: kw= '\\u2205'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1900:3: kw= '\\u2229'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1906:3: kw= '\\u222A'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1912:3: kw= '\\u2216'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1918:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,107,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1924:3: kw= '['
                    {
                    kw=(Token)match(input,108,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1930:3: kw= ']'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1936:3: kw= '\\uE103'
                    {
                    kw=(Token)match(input,110,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1942:3: kw= '\\u2218'
                    {
                    kw=(Token)match(input,111,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1948:3: kw= ';'
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1954:3: kw= '\\u2297'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1960:3: kw= '\\u2225'
                    {
                    kw=(Token)match(input,114,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1966:3: kw= '\\u223C'
                    {
                    kw=(Token)match(input,115,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1972:3: kw= '\\u25C1'
                    {
                    kw=(Token)match(input,116,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1978:3: kw= '\\u2A64'
                    {
                    kw=(Token)match(input,117,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1984:3: kw= '\\u25B7'
                    {
                    kw=(Token)match(input,118,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1990:3: kw= '\\u2A65'
                    {
                    kw=(Token)match(input,119,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalXMachine.g:1996:3: kw= '\\u03BB'
                    {
                    kw=(Token)match(input,120,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalXMachine.g:2002:3: (kw= '%' kw= '\\u22C2' )
                    {
                    // InternalXMachine.g:2002:3: (kw= '%' kw= '\\u22C2' )
                    // InternalXMachine.g:2003:4: kw= '%' kw= '\\u22C2'
                    {
                    kw=(Token)match(input,121,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0());
                    			
                    kw=(Token)match(input,122,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalXMachine.g:2015:3: kw= '\\u22C3'
                    {
                    kw=(Token)match(input,123,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalXMachine.g:2021:3: kw= '\\u2223'
                    {
                    kw=(Token)match(input,124,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalXMachine.g:2027:3: kw= '\\u2025'
                    {
                    kw=(Token)match(input,125,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalXMachine.g:2033:3: kw= '+'
                    {
                    kw=(Token)match(input,126,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalXMachine.g:2039:3: kw= '\\u2212'
                    {
                    kw=(Token)match(input,127,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalXMachine.g:2045:3: kw= '-'
                    {
                    kw=(Token)match(input,128,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalXMachine.g:2051:3: kw= '\\u2217'
                    {
                    kw=(Token)match(input,129,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalXMachine.g:2057:3: kw= '*'
                    {
                    kw=(Token)match(input,130,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalXMachine.g:2063:3: kw= '\\u00F7'
                    {
                    kw=(Token)match(input,131,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalXMachine.g:2069:3: kw= '/'
                    {
                    kw=(Token)match(input,132,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalXMachine.g:2075:3: kw= '^'
                    {
                    kw=(Token)match(input,133,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalXMachine.g:2081:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,134,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRecord"
    // InternalXMachine.g:2090:1: entryRuleRecord returns [EObject current=null] : iv_ruleRecord= ruleRecord EOF ;
    public final EObject entryRuleRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecord = null;


        try {
            // InternalXMachine.g:2090:47: (iv_ruleRecord= ruleRecord EOF )
            // InternalXMachine.g:2091:2: iv_ruleRecord= ruleRecord EOF
            {
             newCompositeNode(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecord=ruleRecord();

            state._fsp--;

             current =iv_ruleRecord; 
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
    // $ANTLR end "entryRuleRecord"


    // $ANTLR start "ruleRecord"
    // InternalXMachine.g:2097:1: ruleRecord returns [EObject current=null] : ( () otherlv_1= 'record' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )? ) ;
    public final EObject ruleRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_fields_5_0 = null;

        EObject lv_fields_6_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2103:2: ( ( () otherlv_1= 'record' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )? ) )
            // InternalXMachine.g:2104:2: ( () otherlv_1= 'record' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )? )
            {
            // InternalXMachine.g:2104:2: ( () otherlv_1= 'record' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )? )
            // InternalXMachine.g:2105:3: () otherlv_1= 'record' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )?
            {
            // InternalXMachine.g:2105:3: ()
            // InternalXMachine.g:2106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecordAccess().getRecordAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,135,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordAccess().getRecordKeyword_1());
            		
            // InternalXMachine.g:2116:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXMachine.g:2117:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXMachine.g:2117:4: (lv_name_2_0= RULE_ID )
            // InternalXMachine.g:2118:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            // InternalXMachine.g:2134:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            // InternalXMachine.g:2135:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_3=(Token)match(input,29,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getRecordAccess().getExtendsKeyword_3_0());
            			
            // InternalXMachine.g:2139:4: ( (otherlv_4= RULE_ID ) )
            // InternalXMachine.g:2140:5: (otherlv_4= RULE_ID )
            {
            // InternalXMachine.g:2140:5: (otherlv_4= RULE_ID )
            // InternalXMachine.g:2141:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRecordRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_20); 

            						newLeafNode(otherlv_4, grammarAccess.getRecordAccess().getSubsetsRecordCrossReference_3_1_0());
            					

            }


            }


            }

            // InternalXMachine.g:2153:3: ( ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:2154:4: ( (lv_fields_5_0= ruleField ) ) ( (lv_fields_6_0= ruleField ) )*
                    {
                    // InternalXMachine.g:2154:4: ( (lv_fields_5_0= ruleField ) )
                    // InternalXMachine.g:2155:5: (lv_fields_5_0= ruleField )
                    {
                    // InternalXMachine.g:2155:5: (lv_fields_5_0= ruleField )
                    // InternalXMachine.g:2156:6: lv_fields_5_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getRecordAccess().getFieldsFieldParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_fields_5_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecordRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_5_0,
                    							"ac.soton.xeventb.xmachine.XMachine.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMachine.g:2173:4: ( (lv_fields_6_0= ruleField ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_ID) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalXMachine.g:2174:5: (lv_fields_6_0= ruleField )
                    	    {
                    	    // InternalXMachine.g:2174:5: (lv_fields_6_0= ruleField )
                    	    // InternalXMachine.g:2175:6: lv_fields_6_0= ruleField
                    	    {

                    	    						newCompositeNode(grammarAccess.getRecordAccess().getFieldsFieldParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_fields_6_0=ruleField();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRecordRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fields",
                    	    							lv_fields_6_0,
                    	    							"ac.soton.xeventb.xmachine.XMachine.Field");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
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
    // $ANTLR end "ruleRecord"


    // $ANTLR start "entryRuleFieldType"
    // InternalXMachine.g:2197:1: entryRuleFieldType returns [String current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final String entryRuleFieldType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldType = null;


        try {
            // InternalXMachine.g:2197:49: (iv_ruleFieldType= ruleFieldType EOF )
            // InternalXMachine.g:2198:2: iv_ruleFieldType= ruleFieldType EOF
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
    // InternalXMachine.g:2204:1: ruleFieldType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleFieldType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2210:2: ( (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD ) )
            // InternalXMachine.g:2211:2: (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD )
            {
            // InternalXMachine.g:2211:2: (this_ID_0= RULE_ID | this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=37 && LA45_0<=59)) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:2212:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2220:3: this_EVENTB_IDENTIFIER_KEYWORD_1= ruleEVENTB_IDENTIFIER_KEYWORD
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
    // InternalXMachine.g:2234:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalXMachine.g:2234:46: (iv_ruleField= ruleField EOF )
            // InternalXMachine.g:2235:2: iv_ruleField= ruleField EOF
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
    // InternalXMachine.g:2241:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_type_3_0= ruleFieldType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_multiplicity_2_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalXMachine.g:2247:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_type_3_0= ruleFieldType ) ) ) )
            // InternalXMachine.g:2248:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_type_3_0= ruleFieldType ) ) )
            {
            // InternalXMachine.g:2248:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_type_3_0= ruleFieldType ) ) )
            // InternalXMachine.g:2249:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_type_3_0= ruleFieldType ) )
            {
            // InternalXMachine.g:2249:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXMachine.g:2250:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXMachine.g:2250:4: (lv_name_0_0= RULE_ID )
            // InternalXMachine.g:2251:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.xeventb.xmachine.XMachine.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalXMachine.g:2271:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=139 && LA46_0<=141)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:2272:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    {
                    // InternalXMachine.g:2272:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    // InternalXMachine.g:2273:5: lv_multiplicity_2_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_36);
                    lv_multiplicity_2_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_2_0,
                    						"ac.soton.xeventb.xmachine.XMachine.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalXMachine.g:2290:3: ( (lv_type_3_0= ruleFieldType ) )
            // InternalXMachine.g:2291:4: (lv_type_3_0= ruleFieldType )
            {
            // InternalXMachine.g:2291:4: (lv_type_3_0= ruleFieldType )
            // InternalXMachine.g:2292:5: lv_type_3_0= ruleFieldType
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


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:2313:1: ruleXConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleXConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:2319:2: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalXMachine.g:2320:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalXMachine.g:2320:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt47=1;
                }
                break;
            case 137:
                {
                alt47=2;
                }
                break;
            case 138:
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
                    // InternalXMachine.g:2321:3: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalXMachine.g:2321:3: (enumLiteral_0= 'ordinary' )
                    // InternalXMachine.g:2322:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2329:3: (enumLiteral_1= 'convergent' )
                    {
                    // InternalXMachine.g:2329:3: (enumLiteral_1= 'convergent' )
                    // InternalXMachine.g:2330:4: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,137,FOLLOW_2); 

                    				current = grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2337:3: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalXMachine.g:2337:3: (enumLiteral_2= 'anticipated' )
                    // InternalXMachine.g:2338:4: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,138,FOLLOW_2); 

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
    // InternalXMachine.g:2348:1: ruleMultiplicity returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXMachine.g:2354:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) ) )
            // InternalXMachine.g:2355:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            {
            // InternalXMachine.g:2355:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) | (enumLiteral_2= 'opt' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 139:
                {
                alt48=1;
                }
                break;
            case 140:
                {
                alt48=2;
                }
                break;
            case 141:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:2356:3: (enumLiteral_0= 'one' )
                    {
                    // InternalXMachine.g:2356:3: (enumLiteral_0= 'one' )
                    // InternalXMachine.g:2357:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,139,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2364:3: (enumLiteral_1= 'many' )
                    {
                    // InternalXMachine.g:2364:3: (enumLiteral_1= 'many' )
                    // InternalXMachine.g:2365:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,140,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2372:3: (enumLiteral_2= 'opt' )
                    {
                    // InternalXMachine.g:2372:3: (enumLiteral_2= 'opt' )
                    // InternalXMachine.g:2373:4: enumLiteral_2= 'opt'
                    {
                    enumLiteral_2=(Token)match(input,141,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000BFE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000BFE040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003F0040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E0040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C0000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008380080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010200000L,0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xFFFFFFE004400140L,0xFBFFFFFFFFFFFFFFL,0x000000000000007FL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001FE0202000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001FC0200040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001FC0200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001F80200040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001F80200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000E08200080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800200080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xFFFFFFE004400142L,0xFBFFFFFFFFFFFFFFL,0x000000000000007FL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0FFFFFE000000040L,0x0000000000000000L,0x0000000000003800L});

}
