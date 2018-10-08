package ac.soton.xeventb.camillex.parser.antlr.internal;

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
import ac.soton.xeventb.camillex.services.EventBComponentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventBComponentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LABEL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'machine'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'end'", "'includes'", "'to'", "'as'", "'theorem'", "'extended'", "'with'", "'begin'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'BOOL'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21151'", "'\\u2115'", "'\\u21191'", "'\\u2119'", "'\\u2124'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'\\u00D7'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'%'", "'\\u22C2'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'context'", "'extends'", "'sets'", "'constants'", "'axioms'", "'ordinary'", "'convergent'", "'anticipated'"
    };
    public static final int T__50=50;
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
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_LABEL=5;
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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


        public InternalEventBComponentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEventBComponentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEventBComponentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEventBComponent.g"; }



     	private EventBComponentGrammarAccess grammarAccess;

        public InternalEventBComponentParser(TokenStream input, EventBComponentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EventBComponent";
       	}

       	@Override
       	protected EventBComponentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEventBComponent"
    // InternalEventBComponent.g:65:1: entryRuleEventBComponent returns [EObject current=null] : iv_ruleEventBComponent= ruleEventBComponent EOF ;
    public final EObject entryRuleEventBComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventBComponent = null;


        try {
            // InternalEventBComponent.g:65:56: (iv_ruleEventBComponent= ruleEventBComponent EOF )
            // InternalEventBComponent.g:66:2: iv_ruleEventBComponent= ruleEventBComponent EOF
            {
             newCompositeNode(grammarAccess.getEventBComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventBComponent=ruleEventBComponent();

            state._fsp--;

             current =iv_ruleEventBComponent; 
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
    // $ANTLR end "entryRuleEventBComponent"


    // $ANTLR start "ruleEventBComponent"
    // InternalEventBComponent.g:72:1: ruleEventBComponent returns [EObject current=null] : (this_Machine_0= ruleMachine | this_Context_1= ruleContext ) ;
    public final EObject ruleEventBComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Machine_0 = null;

        EObject this_Context_1 = null;



        	enterRule();

        try {
            // InternalEventBComponent.g:78:2: ( (this_Machine_0= ruleMachine | this_Context_1= ruleContext ) )
            // InternalEventBComponent.g:79:2: (this_Machine_0= ruleMachine | this_Context_1= ruleContext )
            {
            // InternalEventBComponent.g:79:2: (this_Machine_0= ruleMachine | this_Context_1= ruleContext )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==132) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEventBComponent.g:80:3: this_Machine_0= ruleMachine
                    {

                    			newCompositeNode(grammarAccess.getEventBComponentAccess().getMachineParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Machine_0=ruleMachine();

                    state._fsp--;


                    			current = this_Machine_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEventBComponent.g:89:3: this_Context_1= ruleContext
                    {

                    			newCompositeNode(grammarAccess.getEventBComponentAccess().getContextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Context_1=ruleContext();

                    state._fsp--;


                    			current = this_Context_1;
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
    // $ANTLR end "ruleEventBComponent"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEventBComponent.g:101:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEventBComponent.g:101:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEventBComponent.g:102:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalEventBComponent.g:108:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:114:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalEventBComponent.g:115:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalEventBComponent.g:115:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalEventBComponent.g:116:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalEventBComponent.g:123:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEventBComponent.g:124:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,12,FOLLOW_4); 

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


    // $ANTLR start "entryRuleMachine"
    // InternalEventBComponent.g:141:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalEventBComponent.g:141:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalEventBComponent.g:142:2: iv_ruleMachine= ruleMachine EOF
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
    // InternalEventBComponent.g:148:1: ruleMachine returns [EObject current=null] : ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) ( (lv_extensions_3_0= ruleIncludes ) )* (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'variables' ( (lv_variables_9_0= ruleVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleEvent ) ) ( (lv_events_16_0= ruleEvent ) )* )? otherlv_17= 'end' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        EObject lv_extensions_3_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_invariants_11_0 = null;

        EObject lv_variant_13_0 = null;

        EObject lv_events_15_0 = null;

        EObject lv_events_16_0 = null;



        	enterRule();

        try {
            // InternalEventBComponent.g:154:2: ( ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) ( (lv_extensions_3_0= ruleIncludes ) )* (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'variables' ( (lv_variables_9_0= ruleVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleEvent ) ) ( (lv_events_16_0= ruleEvent ) )* )? otherlv_17= 'end' ) )
            // InternalEventBComponent.g:155:2: ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) ( (lv_extensions_3_0= ruleIncludes ) )* (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'variables' ( (lv_variables_9_0= ruleVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleEvent ) ) ( (lv_events_16_0= ruleEvent ) )* )? otherlv_17= 'end' )
            {
            // InternalEventBComponent.g:155:2: ( () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) ( (lv_extensions_3_0= ruleIncludes ) )* (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'variables' ( (lv_variables_9_0= ruleVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleEvent ) ) ( (lv_events_16_0= ruleEvent ) )* )? otherlv_17= 'end' )
            // InternalEventBComponent.g:156:3: () otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) ( (lv_extensions_3_0= ruleIncludes ) )* (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )? (otherlv_8= 'variables' ( (lv_variables_9_0= ruleVariable ) )+ )? (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleInvariant ) )+ )? (otherlv_12= 'variant' ( (lv_variant_13_0= ruleVariant ) ) )? (otherlv_14= 'events' ( (lv_events_15_0= ruleEvent ) ) ( (lv_events_16_0= ruleEvent ) )* )? otherlv_17= 'end'
            {
            // InternalEventBComponent.g:156:3: ()
            // InternalEventBComponent.g:157:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMachineAccess().getMachineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMachineAccess().getMachineKeyword_1());
            		
            // InternalEventBComponent.g:167:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEventBComponent.g:168:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEventBComponent.g:168:4: (lv_name_2_0= RULE_ID )
            // InternalEventBComponent.g:169:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.camillex.EventBComponent.ID");
            				

            }


            }

            // InternalEventBComponent.g:185:3: ( (lv_extensions_3_0= ruleIncludes ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEventBComponent.g:186:4: (lv_extensions_3_0= ruleIncludes )
            	    {
            	    // InternalEventBComponent.g:186:4: (lv_extensions_3_0= ruleIncludes )
            	    // InternalEventBComponent.g:187:5: lv_extensions_3_0= ruleIncludes
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getExtensionsIncludesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_extensions_3_0=ruleIncludes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_3_0,
            	    						"ac.soton.xeventb.camillex.EventBComponent.Includes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalEventBComponent.g:204:3: (otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEventBComponent.g:205:4: otherlv_4= 'refines' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getRefinesKeyword_4_0());
                    			
                    // InternalEventBComponent.g:209:4: ( (otherlv_5= RULE_ID ) )
                    // InternalEventBComponent.g:210:5: (otherlv_5= RULE_ID )
                    {
                    // InternalEventBComponent.g:210:5: (otherlv_5= RULE_ID )
                    // InternalEventBComponent.g:211:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMachineRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventBComponent.g:223:3: (otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEventBComponent.g:224:4: otherlv_6= 'sees' ( (otherlv_7= RULE_ID ) )+
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getSeesKeyword_5_0());
                    			
                    // InternalEventBComponent.g:228:4: ( (otherlv_7= RULE_ID ) )+
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
                    	    // InternalEventBComponent.g:229:5: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalEventBComponent.g:229:5: (otherlv_7= RULE_ID )
                    	    // InternalEventBComponent.g:230:6: otherlv_7= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMachineRule());
                    	    						}
                    	    					
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getSeesContextCrossReference_5_1_0());
                    	    					

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

            // InternalEventBComponent.g:242:3: (otherlv_8= 'variables' ( (lv_variables_9_0= ruleVariable ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEventBComponent.g:243:4: otherlv_8= 'variables' ( (lv_variables_9_0= ruleVariable ) )+
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getVariablesKeyword_6_0());
                    			
                    // InternalEventBComponent.g:247:4: ( (lv_variables_9_0= ruleVariable ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEventBComponent.g:248:5: (lv_variables_9_0= ruleVariable )
                    	    {
                    	    // InternalEventBComponent.g:248:5: (lv_variables_9_0= ruleVariable )
                    	    // InternalEventBComponent.g:249:6: lv_variables_9_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_variables_9_0=ruleVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_9_0,
                    	    							"ac.soton.xeventb.camillex.EventBComponent.Variable");
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

            // InternalEventBComponent.g:267:3: (otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleInvariant ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEventBComponent.g:268:4: otherlv_10= 'invariants' ( (lv_invariants_11_0= ruleInvariant ) )+
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getInvariantsKeyword_7_0());
                    			
                    // InternalEventBComponent.g:272:4: ( (lv_invariants_11_0= ruleInvariant ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_LABEL) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalEventBComponent.g:273:5: (lv_invariants_11_0= ruleInvariant )
                    	    {
                    	    // InternalEventBComponent.g:273:5: (lv_invariants_11_0= ruleInvariant )
                    	    // InternalEventBComponent.g:274:6: lv_invariants_11_0= ruleInvariant
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_invariants_11_0=ruleInvariant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"invariants",
                    	    							lv_invariants_11_0,
                    	    							"ac.soton.xeventb.camillex.EventBComponent.Invariant");
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

            // InternalEventBComponent.g:292:3: (otherlv_12= 'variant' ( (lv_variant_13_0= ruleVariant ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEventBComponent.g:293:4: otherlv_12= 'variant' ( (lv_variant_13_0= ruleVariant ) )
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getMachineAccess().getVariantKeyword_8_0());
                    			
                    // InternalEventBComponent.g:297:4: ( (lv_variant_13_0= ruleVariant ) )
                    // InternalEventBComponent.g:298:5: (lv_variant_13_0= ruleVariant )
                    {
                    // InternalEventBComponent.g:298:5: (lv_variant_13_0= ruleVariant )
                    // InternalEventBComponent.g:299:6: lv_variant_13_0= ruleVariant
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getVariantVariantParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_variant_13_0=ruleVariant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						set(
                    							current,
                    							"variant",
                    							lv_variant_13_0,
                    							"ac.soton.xeventb.camillex.EventBComponent.Variant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventBComponent.g:317:3: (otherlv_14= 'events' ( (lv_events_15_0= ruleEvent ) ) ( (lv_events_16_0= ruleEvent ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEventBComponent.g:318:4: otherlv_14= 'events' ( (lv_events_15_0= ruleEvent ) ) ( (lv_events_16_0= ruleEvent ) )*
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getMachineAccess().getEventsKeyword_9_0());
                    			
                    // InternalEventBComponent.g:322:4: ( (lv_events_15_0= ruleEvent ) )
                    // InternalEventBComponent.g:323:5: (lv_events_15_0= ruleEvent )
                    {
                    // InternalEventBComponent.g:323:5: (lv_events_15_0= ruleEvent )
                    // InternalEventBComponent.g:324:6: lv_events_15_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_events_15_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_15_0,
                    							"ac.soton.xeventb.camillex.EventBComponent.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventBComponent.g:341:4: ( (lv_events_16_0= ruleEvent ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEventBComponent.g:342:5: (lv_events_16_0= ruleEvent )
                    	    {
                    	    // InternalEventBComponent.g:342:5: (lv_events_16_0= ruleEvent )
                    	    // InternalEventBComponent.g:343:6: lv_events_16_0= ruleEvent
                    	    {

                    	    						newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_events_16_0=ruleEvent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"events",
                    	    							lv_events_16_0,
                    	    							"ac.soton.xeventb.camillex.EventBComponent.Event");
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

            otherlv_17=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getMachineAccess().getEndKeyword_10());
            		

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


    // $ANTLR start "entryRuleIncludes"
    // InternalEventBComponent.g:369:1: entryRuleIncludes returns [EObject current=null] : iv_ruleIncludes= ruleIncludes EOF ;
    public final EObject entryRuleIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludes = null;


        try {
            // InternalEventBComponent.g:369:49: (iv_ruleIncludes= ruleIncludes EOF )
            // InternalEventBComponent.g:370:2: iv_ruleIncludes= ruleIncludes EOF
            {
             newCompositeNode(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncludes=ruleIncludes();

            state._fsp--;

             current =iv_ruleIncludes; 
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
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // InternalEventBComponent.g:376:1: ruleIncludes returns [EObject current=null] : ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) ;
    public final EObject ruleIncludes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_prefixes_6_0=null;
        Token lv_prefixes_7_0=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:382:2: ( ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? ) )
            // InternalEventBComponent.g:383:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            {
            // InternalEventBComponent.g:383:2: ( () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )? )
            // InternalEventBComponent.g:384:3: () (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) ) (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            {
            // InternalEventBComponent.g:384:3: ()
            // InternalEventBComponent.g:385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIncludesAccess().getMachineInclusionAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:391:3: (otherlv_1= 'includes' ( ( ruleQualifiedName ) ) )
            // InternalEventBComponent.g:392:4: otherlv_1= 'includes' ( ( ruleQualifiedName ) )
            {
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getIncludesAccess().getIncludesKeyword_1_0());
            			
            // InternalEventBComponent.g:396:4: ( ( ruleQualifiedName ) )
            // InternalEventBComponent.g:397:5: ( ruleQualifiedName )
            {
            // InternalEventBComponent.g:397:5: ( ruleQualifiedName )
            // InternalEventBComponent.g:398:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getIncludesRule());
            						}
            					

            						newCompositeNode(grammarAccess.getIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0());
            					
            pushFollow(FOLLOW_14);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalEventBComponent.g:413:3: (otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEventBComponent.g:414:4: otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getIncludesAccess().getToKeyword_2_0());
                    			
                    // InternalEventBComponent.g:418:4: ( (otherlv_4= RULE_ID ) )
                    // InternalEventBComponent.g:419:5: (otherlv_4= RULE_ID )
                    {
                    // InternalEventBComponent.g:419:5: (otherlv_4= RULE_ID )
                    // InternalEventBComponent.g:420:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIncludesRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_4, grammarAccess.getIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventBComponent.g:432:3: (otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEventBComponent.g:433:4: otherlv_5= 'as' ( (lv_prefixes_6_0= RULE_ID ) ) ( (lv_prefixes_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getIncludesAccess().getAsKeyword_3_0());
                    			
                    // InternalEventBComponent.g:437:4: ( (lv_prefixes_6_0= RULE_ID ) )
                    // InternalEventBComponent.g:438:5: (lv_prefixes_6_0= RULE_ID )
                    {
                    // InternalEventBComponent.g:438:5: (lv_prefixes_6_0= RULE_ID )
                    // InternalEventBComponent.g:439:6: lv_prefixes_6_0= RULE_ID
                    {
                    lv_prefixes_6_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_prefixes_6_0, grammarAccess.getIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIncludesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"prefixes",
                    							lv_prefixes_6_0,
                    							"ac.soton.xeventb.camillex.EventBComponent.ID");
                    					

                    }


                    }

                    // InternalEventBComponent.g:455:4: ( (lv_prefixes_7_0= RULE_ID ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalEventBComponent.g:456:5: (lv_prefixes_7_0= RULE_ID )
                    	    {
                    	    // InternalEventBComponent.g:456:5: (lv_prefixes_7_0= RULE_ID )
                    	    // InternalEventBComponent.g:457:6: lv_prefixes_7_0= RULE_ID
                    	    {
                    	    lv_prefixes_7_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    						newLeafNode(lv_prefixes_7_0, grammarAccess.getIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getIncludesRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"prefixes",
                    	    							lv_prefixes_7_0,
                    	    							"ac.soton.xeventb.camillex.EventBComponent.ID");
                    	    					

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
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRuleVariable"
    // InternalEventBComponent.g:478:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEventBComponent.g:478:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEventBComponent.g:479:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalEventBComponent.g:485:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:491:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEventBComponent.g:492:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEventBComponent.g:492:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEventBComponent.g:493:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalEventBComponent.g:493:3: ()
            // InternalEventBComponent.g:494:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:500:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEventBComponent.g:501:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEventBComponent.g:501:4: (lv_name_1_0= RULE_ID )
            // InternalEventBComponent.g:502:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.ID");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInvariant"
    // InternalEventBComponent.g:522:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // InternalEventBComponent.g:522:50: (iv_ruleInvariant= ruleInvariant EOF )
            // InternalEventBComponent.g:523:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
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
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // InternalEventBComponent.g:529:1: ruleInvariant returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalEventBComponent.g:535:2: ( ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalEventBComponent.g:536:2: ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalEventBComponent.g:536:2: ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalEventBComponent.g:537:3: () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalEventBComponent.g:537:3: ()
            // InternalEventBComponent.g:538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:544:3: ( (lv_name_1_0= RULE_LABEL ) )
            // InternalEventBComponent.g:545:4: (lv_name_1_0= RULE_LABEL )
            {
            // InternalEventBComponent.g:545:4: (lv_name_1_0= RULE_LABEL )
            // InternalEventBComponent.g:546:5: lv_name_1_0= RULE_LABEL
            {
            lv_name_1_0=(Token)match(input,RULE_LABEL,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInvariantAccess().getNameLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.LABEL");
            				

            }


            }

            // InternalEventBComponent.g:562:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalEventBComponent.g:563:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalEventBComponent.g:563:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalEventBComponent.g:564:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getInvariantAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvariantRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.camillex.EventBComponent.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventBComponent.g:581:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEventBComponent.g:582:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalEventBComponent.g:582:4: (lv_theorem_3_0= 'theorem' )
                    // InternalEventBComponent.g:583:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInvariantRule());
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
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRuleVariant"
    // InternalEventBComponent.g:599:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // InternalEventBComponent.g:599:48: (iv_ruleVariant= ruleVariant EOF )
            // InternalEventBComponent.g:600:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant; 
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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // InternalEventBComponent.g:606:1: ruleVariant returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleXPredicate ) ) ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalEventBComponent.g:612:2: ( ( () ( (lv_expression_1_0= ruleXPredicate ) ) ) )
            // InternalEventBComponent.g:613:2: ( () ( (lv_expression_1_0= ruleXPredicate ) ) )
            {
            // InternalEventBComponent.g:613:2: ( () ( (lv_expression_1_0= ruleXPredicate ) ) )
            // InternalEventBComponent.g:614:3: () ( (lv_expression_1_0= ruleXPredicate ) )
            {
            // InternalEventBComponent.g:614:3: ()
            // InternalEventBComponent.g:615:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariantAccess().getVariantAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:621:3: ( (lv_expression_1_0= ruleXPredicate ) )
            // InternalEventBComponent.g:622:4: (lv_expression_1_0= ruleXPredicate )
            {
            // InternalEventBComponent.g:622:4: (lv_expression_1_0= ruleXPredicate )
            // InternalEventBComponent.g:623:5: lv_expression_1_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getVariantAccess().getExpressionXPredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.XPredicate");
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
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleEvent"
    // InternalEventBComponent.g:644:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalEventBComponent.g:644:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalEventBComponent.g:645:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalEventBComponent.g:651:1: ruleEvent returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+ )? ) )? otherlv_26= 'end' ) ;
    public final EObject ruleEvent() throws RecognitionException {
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
            // InternalEventBComponent.g:657:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+ )? ) )? otherlv_26= 'end' ) )
            // InternalEventBComponent.g:658:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+ )? ) )? otherlv_26= 'end' )
            {
            // InternalEventBComponent.g:658:2: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+ )? ) )? otherlv_26= 'end' )
            // InternalEventBComponent.g:659:3: () ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )* ) ) ) ( (lv_extensions_5_0= ruleEventSync ) )* (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )? ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+ )? ) )? otherlv_26= 'end'
            {
            // InternalEventBComponent.g:659:3: ()
            // InternalEventBComponent.g:660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:666:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEventBComponent.g:667:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEventBComponent.g:667:4: (lv_name_1_0= RULE_ID )
            // InternalEventBComponent.g:668:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.ID");
            				

            }


            }

            // InternalEventBComponent.g:684:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )* ) ) )
            // InternalEventBComponent.g:685:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )* ) )
            {
            // InternalEventBComponent.g:685:4: ( ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )* ) )
            // InternalEventBComponent.g:686:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEventAccess().getUnorderedGroup_2());
            				
            // InternalEventBComponent.g:689:5: ( ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )* )
            // InternalEventBComponent.g:690:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )*
            {
            // InternalEventBComponent.g:690:6: ( ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( LA18_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_2(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 >= 137 && LA18_0 <= 139 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_2(), 1) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEventBComponent.g:691:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    {
            	    // InternalEventBComponent.g:691:4: ({...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) ) )
            	    // InternalEventBComponent.g:692:5: {...}? => ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalEventBComponent.g:692:102: ( ({...}? => ( (lv_extended_3_0= 'extended' ) ) ) )
            	    // InternalEventBComponent.g:693:6: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalEventBComponent.g:696:9: ({...}? => ( (lv_extended_3_0= 'extended' ) ) )
            	    // InternalEventBComponent.g:696:10: {...}? => ( (lv_extended_3_0= 'extended' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "true");
            	    }
            	    // InternalEventBComponent.g:696:19: ( (lv_extended_3_0= 'extended' ) )
            	    // InternalEventBComponent.g:696:20: (lv_extended_3_0= 'extended' )
            	    {
            	    // InternalEventBComponent.g:696:20: (lv_extended_3_0= 'extended' )
            	    // InternalEventBComponent.g:697:10: lv_extended_3_0= 'extended'
            	    {
            	    lv_extended_3_0=(Token)match(input,25,FOLLOW_18); 

            	    										newLeafNode(lv_extended_3_0, grammarAccess.getEventAccess().getExtendedExtendedKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEventRule());
            	    										}
            	    										setWithLastConsumed(current, "extended", true, "extended");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEventBComponent.g:714:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) )
            	    {
            	    // InternalEventBComponent.g:714:4: ({...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) ) )
            	    // InternalEventBComponent.g:715:5: {...}? => ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalEventBComponent.g:715:102: ( ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) ) )
            	    // InternalEventBComponent.g:716:6: ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalEventBComponent.g:719:9: ({...}? => ( (lv_convergence_4_0= ruleConvergence ) ) )
            	    // InternalEventBComponent.g:719:10: {...}? => ( (lv_convergence_4_0= ruleConvergence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "true");
            	    }
            	    // InternalEventBComponent.g:719:19: ( (lv_convergence_4_0= ruleConvergence ) )
            	    // InternalEventBComponent.g:719:20: (lv_convergence_4_0= ruleConvergence )
            	    {
            	    // InternalEventBComponent.g:719:20: (lv_convergence_4_0= ruleConvergence )
            	    // InternalEventBComponent.g:720:10: lv_convergence_4_0= ruleConvergence
            	    {

            	    										newCompositeNode(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_18);
            	    lv_convergence_4_0=ruleConvergence();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEventRule());
            	    										}
            	    										set(
            	    											current,
            	    											"convergence",
            	    											lv_convergence_4_0,
            	    											"ac.soton.xeventb.camillex.EventBComponent.Convergence");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEventAccess().getUnorderedGroup_2());
            				

            }

            // InternalEventBComponent.g:749:3: ( (lv_extensions_5_0= ruleEventSync ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEventBComponent.g:750:4: (lv_extensions_5_0= ruleEventSync )
            	    {
            	    // InternalEventBComponent.g:750:4: (lv_extensions_5_0= ruleEventSync )
            	    // InternalEventBComponent.g:751:5: lv_extensions_5_0= ruleEventSync
            	    {

            	    					newCompositeNode(grammarAccess.getEventAccess().getExtensionsEventSyncParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_extensions_5_0=ruleEventSync();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_5_0,
            	    						"ac.soton.xeventb.camillex.EventBComponent.EventSync");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalEventBComponent.g:768:3: (otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEventBComponent.g:769:4: otherlv_6= 'refines' ( (otherlv_7= RULE_ID ) )+
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getRefinesKeyword_4_0());
                    			
                    // InternalEventBComponent.g:773:4: ( (otherlv_7= RULE_ID ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalEventBComponent.g:774:5: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalEventBComponent.g:774:5: (otherlv_7= RULE_ID )
                    	    // InternalEventBComponent.g:775:6: otherlv_7= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEventRule());
                    	    						}
                    	    					
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_20); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getEventAccess().getRefinesEventCrossReference_4_1_0());
                    	    					

                    	    }


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
                    break;

            }

            // InternalEventBComponent.g:787:3: ( ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleAction ) )+ ) | (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+ )? ) | (otherlv_18= 'any' ( (lv_parameters_19_0= ruleParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+ )? ) )?
            int alt36=4;
            switch ( input.LA(1) ) {
                case 26:
                case 27:
                    {
                    alt36=1;
                    }
                    break;
                case 28:
                    {
                    alt36=2;
                    }
                    break;
                case 30:
                    {
                    alt36=3;
                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // InternalEventBComponent.g:788:4: ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleAction ) )+ )
                    {
                    // InternalEventBComponent.g:788:4: ( (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleAction ) )+ )
                    // InternalEventBComponent.g:789:5: (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+ )? otherlv_10= 'begin' ( (lv_actions_11_0= ruleAction ) )+
                    {
                    // InternalEventBComponent.g:789:5: (otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+ )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==26) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalEventBComponent.g:790:6: otherlv_8= 'with' ( (lv_witnesses_9_0= ruleWitness ) )+
                            {
                            otherlv_8=(Token)match(input,26,FOLLOW_9); 

                            						newLeafNode(otherlv_8, grammarAccess.getEventAccess().getWithKeyword_5_0_0_0());
                            					
                            // InternalEventBComponent.g:794:6: ( (lv_witnesses_9_0= ruleWitness ) )+
                            int cnt22=0;
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_LABEL) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalEventBComponent.g:795:7: (lv_witnesses_9_0= ruleWitness )
                            	    {
                            	    // InternalEventBComponent.g:795:7: (lv_witnesses_9_0= ruleWitness )
                            	    // InternalEventBComponent.g:796:8: lv_witnesses_9_0= ruleWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_5_0_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_21);
                            	    lv_witnesses_9_0=ruleWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_9_0,
                            	    									"ac.soton.xeventb.camillex.EventBComponent.Witness");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt22 >= 1 ) break loop22;
                                        EarlyExitException eee =
                                            new EarlyExitException(22, input);
                                        throw eee;
                                }
                                cnt22++;
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,27,FOLLOW_9); 

                    					newLeafNode(otherlv_10, grammarAccess.getEventAccess().getBeginKeyword_5_0_1());
                    				
                    // InternalEventBComponent.g:818:5: ( (lv_actions_11_0= ruleAction ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_LABEL) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalEventBComponent.g:819:6: (lv_actions_11_0= ruleAction )
                    	    {
                    	    // InternalEventBComponent.g:819:6: (lv_actions_11_0= ruleAction )
                    	    // InternalEventBComponent.g:820:7: lv_actions_11_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_5_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_actions_11_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_11_0,
                    	    								"ac.soton.xeventb.camillex.EventBComponent.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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
                    // InternalEventBComponent.g:839:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+ )? )
                    {
                    // InternalEventBComponent.g:839:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+ )? )
                    // InternalEventBComponent.g:840:5: otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) )+ (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+ )? (otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+ )?
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_9); 

                    					newLeafNode(otherlv_12, grammarAccess.getEventAccess().getWhenKeyword_5_1_0());
                    				
                    // InternalEventBComponent.g:844:5: ( (lv_guards_13_0= ruleGuard ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_LABEL) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalEventBComponent.g:845:6: (lv_guards_13_0= ruleGuard )
                    	    {
                    	    // InternalEventBComponent.g:845:6: (lv_guards_13_0= ruleGuard )
                    	    // InternalEventBComponent.g:846:7: lv_guards_13_0= ruleGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_guards_13_0=ruleGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_13_0,
                    	    								"ac.soton.xeventb.camillex.EventBComponent.Guard");
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

                    // InternalEventBComponent.g:863:5: (otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+ )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==26) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalEventBComponent.g:864:6: otherlv_14= 'with' ( (lv_witnesses_15_0= ruleWitness ) )+
                            {
                            otherlv_14=(Token)match(input,26,FOLLOW_9); 

                            						newLeafNode(otherlv_14, grammarAccess.getEventAccess().getWithKeyword_5_1_2_0());
                            					
                            // InternalEventBComponent.g:868:6: ( (lv_witnesses_15_0= ruleWitness ) )+
                            int cnt26=0;
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==RULE_LABEL) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalEventBComponent.g:869:7: (lv_witnesses_15_0= ruleWitness )
                            	    {
                            	    // InternalEventBComponent.g:869:7: (lv_witnesses_15_0= ruleWitness )
                            	    // InternalEventBComponent.g:870:8: lv_witnesses_15_0= ruleWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_5_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_24);
                            	    lv_witnesses_15_0=ruleWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_15_0,
                            	    									"ac.soton.xeventb.camillex.EventBComponent.Witness");
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

                    // InternalEventBComponent.g:888:5: (otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+ )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==29) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalEventBComponent.g:889:6: otherlv_16= 'then' ( (lv_actions_17_0= ruleAction ) )+
                            {
                            otherlv_16=(Token)match(input,29,FOLLOW_9); 

                            						newLeafNode(otherlv_16, grammarAccess.getEventAccess().getThenKeyword_5_1_3_0());
                            					
                            // InternalEventBComponent.g:893:6: ( (lv_actions_17_0= ruleAction ) )+
                            int cnt28=0;
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==RULE_LABEL) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // InternalEventBComponent.g:894:7: (lv_actions_17_0= ruleAction )
                            	    {
                            	    // InternalEventBComponent.g:894:7: (lv_actions_17_0= ruleAction )
                            	    // InternalEventBComponent.g:895:8: lv_actions_17_0= ruleAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_5_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_22);
                            	    lv_actions_17_0=ruleAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_17_0,
                            	    									"ac.soton.xeventb.camillex.EventBComponent.Action");
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


                    }


                    }
                    break;
                case 3 :
                    // InternalEventBComponent.g:915:4: (otherlv_18= 'any' ( (lv_parameters_19_0= ruleParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+ )? )
                    {
                    // InternalEventBComponent.g:915:4: (otherlv_18= 'any' ( (lv_parameters_19_0= ruleParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+ )? )
                    // InternalEventBComponent.g:916:5: otherlv_18= 'any' ( (lv_parameters_19_0= ruleParameter ) )+ otherlv_20= 'where' ( (lv_guards_21_0= ruleGuard ) )+ (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+ )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+ )?
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_4); 

                    					newLeafNode(otherlv_18, grammarAccess.getEventAccess().getAnyKeyword_5_2_0());
                    				
                    // InternalEventBComponent.g:920:5: ( (lv_parameters_19_0= ruleParameter ) )+
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
                    	    // InternalEventBComponent.g:921:6: (lv_parameters_19_0= ruleParameter )
                    	    {
                    	    // InternalEventBComponent.g:921:6: (lv_parameters_19_0= ruleParameter )
                    	    // InternalEventBComponent.g:922:7: lv_parameters_19_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_parameters_19_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_19_0,
                    	    								"ac.soton.xeventb.camillex.EventBComponent.Parameter");
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

                    otherlv_20=(Token)match(input,31,FOLLOW_9); 

                    					newLeafNode(otherlv_20, grammarAccess.getEventAccess().getWhereKeyword_5_2_2());
                    				
                    // InternalEventBComponent.g:943:5: ( (lv_guards_21_0= ruleGuard ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_LABEL) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalEventBComponent.g:944:6: (lv_guards_21_0= ruleGuard )
                    	    {
                    	    // InternalEventBComponent.g:944:6: (lv_guards_21_0= ruleGuard )
                    	    // InternalEventBComponent.g:945:7: lv_guards_21_0= ruleGuard
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_5_2_3_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_guards_21_0=ruleGuard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guards",
                    	    								lv_guards_21_0,
                    	    								"ac.soton.xeventb.camillex.EventBComponent.Guard");
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

                    // InternalEventBComponent.g:962:5: (otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+ )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==26) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalEventBComponent.g:963:6: otherlv_22= 'with' ( (lv_witnesses_23_0= ruleWitness ) )+
                            {
                            otherlv_22=(Token)match(input,26,FOLLOW_9); 

                            						newLeafNode(otherlv_22, grammarAccess.getEventAccess().getWithKeyword_5_2_4_0());
                            					
                            // InternalEventBComponent.g:967:6: ( (lv_witnesses_23_0= ruleWitness ) )+
                            int cnt32=0;
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==RULE_LABEL) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // InternalEventBComponent.g:968:7: (lv_witnesses_23_0= ruleWitness )
                            	    {
                            	    // InternalEventBComponent.g:968:7: (lv_witnesses_23_0= ruleWitness )
                            	    // InternalEventBComponent.g:969:8: lv_witnesses_23_0= ruleWitness
                            	    {

                            	    								newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_5_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_24);
                            	    lv_witnesses_23_0=ruleWitness();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"witnesses",
                            	    									lv_witnesses_23_0,
                            	    									"ac.soton.xeventb.camillex.EventBComponent.Witness");
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

                    // InternalEventBComponent.g:987:5: (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+ )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==29) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalEventBComponent.g:988:6: otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) )+
                            {
                            otherlv_24=(Token)match(input,29,FOLLOW_9); 

                            						newLeafNode(otherlv_24, grammarAccess.getEventAccess().getThenKeyword_5_2_5_0());
                            					
                            // InternalEventBComponent.g:992:6: ( (lv_actions_25_0= ruleAction ) )+
                            int cnt34=0;
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==RULE_LABEL) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalEventBComponent.g:993:7: (lv_actions_25_0= ruleAction )
                            	    {
                            	    // InternalEventBComponent.g:993:7: (lv_actions_25_0= ruleAction )
                            	    // InternalEventBComponent.g:994:8: lv_actions_25_0= ruleAction
                            	    {

                            	    								newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_5_2_5_1_0());
                            	    							
                            	    pushFollow(FOLLOW_22);
                            	    lv_actions_25_0=ruleAction();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEventRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"actions",
                            	    									lv_actions_25_0,
                            	    									"ac.soton.xeventb.camillex.EventBComponent.Action");
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

            }

            otherlv_26=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getEventAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEventSync"
    // InternalEventBComponent.g:1022:1: entryRuleEventSync returns [EObject current=null] : iv_ruleEventSync= ruleEventSync EOF ;
    public final EObject entryRuleEventSync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSync = null;


        try {
            // InternalEventBComponent.g:1022:50: (iv_ruleEventSync= ruleEventSync EOF )
            // InternalEventBComponent.g:1023:2: iv_ruleEventSync= ruleEventSync EOF
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
    // InternalEventBComponent.g:1029:1: ruleEventSync returns [EObject current=null] : ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleEventSync() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:1035:2: ( ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalEventBComponent.g:1036:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalEventBComponent.g:1036:2: ( () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) ) )
            // InternalEventBComponent.g:1037:3: () (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalEventBComponent.g:1037:3: ()
            // InternalEventBComponent.g:1038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:1044:3: (otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) ) )
            // InternalEventBComponent.g:1045:4: otherlv_1= 'synchronises' ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )? ( (otherlv_4= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0());
            			
            // InternalEventBComponent.g:1049:4: ( ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==12) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalEventBComponent.g:1050:5: ( (lv_prefix_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // InternalEventBComponent.g:1050:5: ( (lv_prefix_2_0= RULE_ID ) )
                    // InternalEventBComponent.g:1051:6: (lv_prefix_2_0= RULE_ID )
                    {
                    // InternalEventBComponent.g:1051:6: (lv_prefix_2_0= RULE_ID )
                    // InternalEventBComponent.g:1052:7: lv_prefix_2_0= RULE_ID
                    {
                    lv_prefix_2_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    							newLeafNode(lv_prefix_2_0, grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEventSyncRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"prefix",
                    								lv_prefix_2_0,
                    								"ac.soton.xeventb.camillex.EventBComponent.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1());
                    				

                    }
                    break;

            }

            // InternalEventBComponent.g:1073:4: ( (otherlv_4= RULE_ID ) )
            // InternalEventBComponent.g:1074:5: (otherlv_4= RULE_ID )
            {
            // InternalEventBComponent.g:1074:5: (otherlv_4= RULE_ID )
            // InternalEventBComponent.g:1075:6: otherlv_4= RULE_ID
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


    // $ANTLR start "entryRuleParameter"
    // InternalEventBComponent.g:1091:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalEventBComponent.g:1091:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalEventBComponent.g:1092:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalEventBComponent.g:1098:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:1104:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEventBComponent.g:1105:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEventBComponent.g:1105:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEventBComponent.g:1106:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalEventBComponent.g:1106:3: ()
            // InternalEventBComponent.g:1107:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:1113:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEventBComponent.g:1114:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEventBComponent.g:1114:4: (lv_name_1_0= RULE_ID )
            // InternalEventBComponent.g:1115:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.ID");
            				

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleGuard"
    // InternalEventBComponent.g:1135:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalEventBComponent.g:1135:46: (iv_ruleGuard= ruleGuard EOF )
            // InternalEventBComponent.g:1136:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalEventBComponent.g:1142:1: ruleGuard returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalEventBComponent.g:1148:2: ( ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalEventBComponent.g:1149:2: ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalEventBComponent.g:1149:2: ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalEventBComponent.g:1150:3: () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalEventBComponent.g:1150:3: ()
            // InternalEventBComponent.g:1151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGuardAccess().getGuardAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:1157:3: ( (lv_name_1_0= RULE_LABEL ) )
            // InternalEventBComponent.g:1158:4: (lv_name_1_0= RULE_LABEL )
            {
            // InternalEventBComponent.g:1158:4: (lv_name_1_0= RULE_LABEL )
            // InternalEventBComponent.g:1159:5: lv_name_1_0= RULE_LABEL
            {
            lv_name_1_0=(Token)match(input,RULE_LABEL,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGuardAccess().getNameLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.LABEL");
            				

            }


            }

            // InternalEventBComponent.g:1175:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalEventBComponent.g:1176:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalEventBComponent.g:1176:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalEventBComponent.g:1177:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getGuardAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.camillex.EventBComponent.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventBComponent.g:1194:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEventBComponent.g:1195:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalEventBComponent.g:1195:4: (lv_theorem_3_0= 'theorem' )
                    // InternalEventBComponent.g:1196:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getGuardAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGuardRule());
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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleWitness"
    // InternalEventBComponent.g:1212:1: entryRuleWitness returns [EObject current=null] : iv_ruleWitness= ruleWitness EOF ;
    public final EObject entryRuleWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWitness = null;


        try {
            // InternalEventBComponent.g:1212:48: (iv_ruleWitness= ruleWitness EOF )
            // InternalEventBComponent.g:1213:2: iv_ruleWitness= ruleWitness EOF
            {
             newCompositeNode(grammarAccess.getWitnessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWitness=ruleWitness();

            state._fsp--;

             current =iv_ruleWitness; 
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
    // $ANTLR end "entryRuleWitness"


    // $ANTLR start "ruleWitness"
    // InternalEventBComponent.g:1219:1: ruleWitness returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ) ;
    public final EObject ruleWitness() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalEventBComponent.g:1225:2: ( ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ) )
            // InternalEventBComponent.g:1226:2: ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) )
            {
            // InternalEventBComponent.g:1226:2: ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) )
            // InternalEventBComponent.g:1227:3: () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) )
            {
            // InternalEventBComponent.g:1227:3: ()
            // InternalEventBComponent.g:1228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWitnessAccess().getWitnessAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:1234:3: ( (lv_name_1_0= RULE_LABEL ) )
            // InternalEventBComponent.g:1235:4: (lv_name_1_0= RULE_LABEL )
            {
            // InternalEventBComponent.g:1235:4: (lv_name_1_0= RULE_LABEL )
            // InternalEventBComponent.g:1236:5: lv_name_1_0= RULE_LABEL
            {
            lv_name_1_0=(Token)match(input,RULE_LABEL,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWitnessAccess().getNameLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWitnessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.LABEL");
            				

            }


            }

            // InternalEventBComponent.g:1252:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalEventBComponent.g:1253:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalEventBComponent.g:1253:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalEventBComponent.g:1254:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getWitnessAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWitnessRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.camillex.EventBComponent.XPredicate");
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
    // $ANTLR end "ruleWitness"


    // $ANTLR start "entryRuleAction"
    // InternalEventBComponent.g:1275:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalEventBComponent.g:1275:47: (iv_ruleAction= ruleAction EOF )
            // InternalEventBComponent.g:1276:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalEventBComponent.g:1282:1: ruleAction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalEventBComponent.g:1288:2: ( ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) ) )
            // InternalEventBComponent.g:1289:2: ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) )
            {
            // InternalEventBComponent.g:1289:2: ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_action_2_0= ruleXPredicate ) ) )
            // InternalEventBComponent.g:1290:3: () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_action_2_0= ruleXPredicate ) )
            {
            // InternalEventBComponent.g:1290:3: ()
            // InternalEventBComponent.g:1291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:1297:3: ( (lv_name_1_0= RULE_LABEL ) )
            // InternalEventBComponent.g:1298:4: (lv_name_1_0= RULE_LABEL )
            {
            // InternalEventBComponent.g:1298:4: (lv_name_1_0= RULE_LABEL )
            // InternalEventBComponent.g:1299:5: lv_name_1_0= RULE_LABEL
            {
            lv_name_1_0=(Token)match(input,RULE_LABEL,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.LABEL");
            				

            }


            }

            // InternalEventBComponent.g:1315:3: ( (lv_action_2_0= ruleXPredicate ) )
            // InternalEventBComponent.g:1316:4: (lv_action_2_0= ruleXPredicate )
            {
            // InternalEventBComponent.g:1316:4: (lv_action_2_0= ruleXPredicate )
            // InternalEventBComponent.g:1317:5: lv_action_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActionXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"ac.soton.xeventb.camillex.EventBComponent.XPredicate");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleXPredicate"
    // InternalEventBComponent.g:1338:1: entryRuleXPredicate returns [String current=null] : iv_ruleXPredicate= ruleXPredicate EOF ;
    public final String entryRuleXPredicate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXPredicate = null;


        try {
            // InternalEventBComponent.g:1338:50: (iv_ruleXPredicate= ruleXPredicate EOF )
            // InternalEventBComponent.g:1339:2: iv_ruleXPredicate= ruleXPredicate EOF
            {
             newCompositeNode(grammarAccess.getXPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXPredicate=ruleXPredicate();

            state._fsp--;

             current =iv_ruleXPredicate.getText(); 
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
    // $ANTLR end "entryRuleXPredicate"


    // $ANTLR start "ruleXPredicate"
    // InternalEventBComponent.g:1345:1: ruleXPredicate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+ ;
    public final AntlrDatatypeRuleToken ruleXPredicate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_3=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_EVENTB_IDENTIFIER_KEYWORD_0 = null;

        AntlrDatatypeRuleToken this_EVENTB_PREDICATE_SYMBOLS_1 = null;

        AntlrDatatypeRuleToken this_EVENTB_EXPRESSION_SYMBOLS_2 = null;



        	enterRule();

        try {
            // InternalEventBComponent.g:1351:2: ( (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+ )
            // InternalEventBComponent.g:1352:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+
            {
            // InternalEventBComponent.g:1352:2: (this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD | this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS | this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS | this_ID_3= RULE_ID | this_INT_4= RULE_INT )+
            int cnt39=0;
            loop39:
            do {
                int alt39=6;
                switch ( input.LA(1) ) {
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
                case 54:
                case 55:
                    {
                    alt39=1;
                    }
                    break;
                case 12:
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
                    {
                    alt39=2;
                    }
                    break;
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
            	    // InternalEventBComponent.g:1353:3: this_EVENTB_IDENTIFIER_KEYWORD_0= ruleEVENTB_IDENTIFIER_KEYWORD
            	    {

            	    			newCompositeNode(grammarAccess.getXPredicateAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_27);
            	    this_EVENTB_IDENTIFIER_KEYWORD_0=ruleEVENTB_IDENTIFIER_KEYWORD();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_IDENTIFIER_KEYWORD_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalEventBComponent.g:1364:3: this_EVENTB_PREDICATE_SYMBOLS_1= ruleEVENTB_PREDICATE_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXPredicateAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1());
            	    		
            	    pushFollow(FOLLOW_27);
            	    this_EVENTB_PREDICATE_SYMBOLS_1=ruleEVENTB_PREDICATE_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_PREDICATE_SYMBOLS_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalEventBComponent.g:1375:3: this_EVENTB_EXPRESSION_SYMBOLS_2= ruleEVENTB_EXPRESSION_SYMBOLS
            	    {

            	    			newCompositeNode(grammarAccess.getXPredicateAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_27);
            	    this_EVENTB_EXPRESSION_SYMBOLS_2=ruleEVENTB_EXPRESSION_SYMBOLS();

            	    state._fsp--;


            	    			current.merge(this_EVENTB_EXPRESSION_SYMBOLS_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalEventBComponent.g:1386:3: this_ID_3= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    			current.merge(this_ID_3);
            	    		

            	    			newLeafNode(this_ID_3, grammarAccess.getXPredicateAccess().getIDTerminalRuleCall_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalEventBComponent.g:1394:3: this_INT_4= RULE_INT
            	    {
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_27); 

            	    			current.merge(this_INT_4);
            	    		

            	    			newLeafNode(this_INT_4, grammarAccess.getXPredicateAccess().getINTTerminalRuleCall_4());
            	    		

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
    // $ANTLR end "ruleXPredicate"


    // $ANTLR start "entryRuleEVENTB_IDENTIFIER_KEYWORD"
    // InternalEventBComponent.g:1405:1: entryRuleEVENTB_IDENTIFIER_KEYWORD returns [String current=null] : iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final String entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_IDENTIFIER_KEYWORD = null;


        try {
            // InternalEventBComponent.g:1405:65: (iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalEventBComponent.g:1406:2: iv_ruleEVENTB_IDENTIFIER_KEYWORD= ruleEVENTB_IDENTIFIER_KEYWORD EOF
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
    // InternalEventBComponent.g:1412:1: ruleEVENTB_IDENTIFIER_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:1418:2: ( (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' ) )
            // InternalEventBComponent.g:1419:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            {
            // InternalEventBComponent.g:1419:2: (kw= 'BOOL' | kw= 'FALSE' | kw= 'TRUE' | kw= 'bool' | kw= 'card' | kw= 'dom' | kw= 'finite' | kw= 'id' | kw= 'inter' | kw= 'max' | kw= 'min' | kw= 'mod' | kw= 'pred' | kw= 'prj1' | kw= 'prj2' | kw= 'ran' | kw= 'succ' | kw= 'union' | kw= '\\u21151' | kw= '\\u2115' | kw= '\\u21191' | kw= '\\u2119' | kw= '\\u2124' )
            int alt40=23;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt40=1;
                }
                break;
            case 34:
                {
                alt40=2;
                }
                break;
            case 35:
                {
                alt40=3;
                }
                break;
            case 36:
                {
                alt40=4;
                }
                break;
            case 37:
                {
                alt40=5;
                }
                break;
            case 38:
                {
                alt40=6;
                }
                break;
            case 39:
                {
                alt40=7;
                }
                break;
            case 40:
                {
                alt40=8;
                }
                break;
            case 41:
                {
                alt40=9;
                }
                break;
            case 42:
                {
                alt40=10;
                }
                break;
            case 43:
                {
                alt40=11;
                }
                break;
            case 44:
                {
                alt40=12;
                }
                break;
            case 45:
                {
                alt40=13;
                }
                break;
            case 46:
                {
                alt40=14;
                }
                break;
            case 47:
                {
                alt40=15;
                }
                break;
            case 48:
                {
                alt40=16;
                }
                break;
            case 49:
                {
                alt40=17;
                }
                break;
            case 50:
                {
                alt40=18;
                }
                break;
            case 51:
                {
                alt40=19;
                }
                break;
            case 52:
                {
                alt40=20;
                }
                break;
            case 53:
                {
                alt40=21;
                }
                break;
            case 54:
                {
                alt40=22;
                }
                break;
            case 55:
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
                    // InternalEventBComponent.g:1420:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEventBComponent.g:1426:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalEventBComponent.g:1432:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalEventBComponent.g:1438:3: kw= 'bool'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalEventBComponent.g:1444:3: kw= 'card'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalEventBComponent.g:1450:3: kw= 'dom'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalEventBComponent.g:1456:3: kw= 'finite'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalEventBComponent.g:1462:3: kw= 'id'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalEventBComponent.g:1468:3: kw= 'inter'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalEventBComponent.g:1474:3: kw= 'max'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalEventBComponent.g:1480:3: kw= 'min'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalEventBComponent.g:1486:3: kw= 'mod'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalEventBComponent.g:1492:3: kw= 'pred'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalEventBComponent.g:1498:3: kw= 'prj1'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalEventBComponent.g:1504:3: kw= 'prj2'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalEventBComponent.g:1510:3: kw= 'ran'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalEventBComponent.g:1516:3: kw= 'succ'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalEventBComponent.g:1522:3: kw= 'union'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalEventBComponent.g:1528:3: kw= '\\u21151'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalEventBComponent.g:1534:3: kw= '\\u2115'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalEventBComponent.g:1540:3: kw= '\\u21191'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalEventBComponent.g:1546:3: kw= '\\u2119'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalEventBComponent.g:1552:3: kw= '\\u2124'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalEventBComponent.g:1561:1: entryRuleEVENTB_PREDICATE_SYMBOLS returns [String current=null] : iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final String entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_PREDICATE_SYMBOLS = null;


        try {
            // InternalEventBComponent.g:1561:64: (iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalEventBComponent.g:1562:2: iv_ruleEVENTB_PREDICATE_SYMBOLS= ruleEVENTB_PREDICATE_SYMBOLS EOF
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
    // InternalEventBComponent.g:1568:1: ruleEVENTB_PREDICATE_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:1574:2: ( (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' ) )
            // InternalEventBComponent.g:1575:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            {
            // InternalEventBComponent.g:1575:2: (kw= '(' | kw= ')' | kw= '\\u21D4' | kw= '\\u21D2' | kw= '\\u2227' | kw= '&' | kw= '\\u2228' | kw= '\\u00AC' | kw= '\\u22A4' | kw= '\\u22A5' | kw= '\\u2200' | kw= '!' | kw= '\\u2203' | kw= '#' | kw= ',' | kw= '\\u00B7' | kw= '.' | kw= '=' | kw= '\\u2260' | kw= '\\u2264' | kw= '<' | kw= '\\u2265' | kw= '>' | kw= '\\u2208' | kw= ':' | kw= '\\u2209' | kw= '\\u2282' | kw= '\\u2284' | kw= '\\u2286' | kw= '\\u2288' | kw= 'partition' )
            int alt41=31;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt41=1;
                }
                break;
            case 57:
                {
                alt41=2;
                }
                break;
            case 58:
                {
                alt41=3;
                }
                break;
            case 59:
                {
                alt41=4;
                }
                break;
            case 60:
                {
                alt41=5;
                }
                break;
            case 61:
                {
                alt41=6;
                }
                break;
            case 62:
                {
                alt41=7;
                }
                break;
            case 63:
                {
                alt41=8;
                }
                break;
            case 64:
                {
                alt41=9;
                }
                break;
            case 65:
                {
                alt41=10;
                }
                break;
            case 66:
                {
                alt41=11;
                }
                break;
            case 67:
                {
                alt41=12;
                }
                break;
            case 68:
                {
                alt41=13;
                }
                break;
            case 69:
                {
                alt41=14;
                }
                break;
            case 70:
                {
                alt41=15;
                }
                break;
            case 71:
                {
                alt41=16;
                }
                break;
            case 12:
                {
                alt41=17;
                }
                break;
            case 72:
                {
                alt41=18;
                }
                break;
            case 73:
                {
                alt41=19;
                }
                break;
            case 74:
                {
                alt41=20;
                }
                break;
            case 75:
                {
                alt41=21;
                }
                break;
            case 76:
                {
                alt41=22;
                }
                break;
            case 77:
                {
                alt41=23;
                }
                break;
            case 78:
                {
                alt41=24;
                }
                break;
            case 79:
                {
                alt41=25;
                }
                break;
            case 80:
                {
                alt41=26;
                }
                break;
            case 81:
                {
                alt41=27;
                }
                break;
            case 82:
                {
                alt41=28;
                }
                break;
            case 83:
                {
                alt41=29;
                }
                break;
            case 84:
                {
                alt41=30;
                }
                break;
            case 85:
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
                    // InternalEventBComponent.g:1576:3: kw= '('
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEventBComponent.g:1582:3: kw= ')'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalEventBComponent.g:1588:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalEventBComponent.g:1594:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalEventBComponent.g:1600:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalEventBComponent.g:1606:3: kw= '&'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalEventBComponent.g:1612:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalEventBComponent.g:1618:3: kw= '\\u00AC'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalEventBComponent.g:1624:3: kw= '\\u22A4'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalEventBComponent.g:1630:3: kw= '\\u22A5'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalEventBComponent.g:1636:3: kw= '\\u2200'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalEventBComponent.g:1642:3: kw= '!'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalEventBComponent.g:1648:3: kw= '\\u2203'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalEventBComponent.g:1654:3: kw= '#'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalEventBComponent.g:1660:3: kw= ','
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalEventBComponent.g:1666:3: kw= '\\u00B7'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalEventBComponent.g:1672:3: kw= '.'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalEventBComponent.g:1678:3: kw= '='
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalEventBComponent.g:1684:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalEventBComponent.g:1690:3: kw= '\\u2264'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalEventBComponent.g:1696:3: kw= '<'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalEventBComponent.g:1702:3: kw= '\\u2265'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalEventBComponent.g:1708:3: kw= '>'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalEventBComponent.g:1714:3: kw= '\\u2208'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalEventBComponent.g:1720:3: kw= ':'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalEventBComponent.g:1726:3: kw= '\\u2209'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalEventBComponent.g:1732:3: kw= '\\u2282'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalEventBComponent.g:1738:3: kw= '\\u2284'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalEventBComponent.g:1744:3: kw= '\\u2286'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalEventBComponent.g:1750:3: kw= '\\u2288'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalEventBComponent.g:1756:3: kw= 'partition'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

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
    // InternalEventBComponent.g:1765:1: entryRuleEVENTB_EXPRESSION_SYMBOLS returns [String current=null] : iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final String entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEVENTB_EXPRESSION_SYMBOLS = null;


        try {
            // InternalEventBComponent.g:1765:65: (iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalEventBComponent.g:1766:2: iv_ruleEVENTB_EXPRESSION_SYMBOLS= ruleEVENTB_EXPRESSION_SYMBOLS EOF
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
    // InternalEventBComponent.g:1772:1: ruleEVENTB_EXPRESSION_SYMBOLS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) ;
    public final AntlrDatatypeRuleToken ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:1778:2: ( (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' ) )
            // InternalEventBComponent.g:1779:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            {
            // InternalEventBComponent.g:1779:2: (kw= '\\u2194' | kw= '\\uE100' | kw= '\\uE101' | kw= '\\uE102' | kw= '\\u21F8' | kw= '\\u2192' | kw= '\\u2914' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' | kw= '\\u2916' | kw= '{' | kw= '}' | kw= '\\u21A6' | kw= '\\u2205' | kw= '\\u2229' | kw= '\\u222A' | kw= '\\u2216' | kw= '\\u00D7' | kw= '[' | kw= ']' | kw= '\\uE103' | kw= '\\u2218' | kw= ';' | kw= '\\u2297' | kw= '\\u2225' | kw= '\\u223C' | kw= '\\u25C1' | kw= '\\u2A64' | kw= '\\u25B7' | kw= '\\u2A65' | kw= '\\u03BB' | (kw= '%' kw= '\\u22C2' ) | kw= '\\u22C3' | kw= '\\u2223' | kw= '\\u2025' | kw= '+' | kw= '\\u2212' | kw= '-' | kw= '\\u2217' | kw= '*' | kw= '\\u00F7' | kw= '/' | kw= '^' | kw= '\\\\' )
            int alt42=45;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt42=1;
                }
                break;
            case 87:
                {
                alt42=2;
                }
                break;
            case 88:
                {
                alt42=3;
                }
                break;
            case 89:
                {
                alt42=4;
                }
                break;
            case 90:
                {
                alt42=5;
                }
                break;
            case 91:
                {
                alt42=6;
                }
                break;
            case 92:
                {
                alt42=7;
                }
                break;
            case 93:
                {
                alt42=8;
                }
                break;
            case 94:
                {
                alt42=9;
                }
                break;
            case 95:
                {
                alt42=10;
                }
                break;
            case 96:
                {
                alt42=11;
                }
                break;
            case 97:
                {
                alt42=12;
                }
                break;
            case 98:
                {
                alt42=13;
                }
                break;
            case 99:
                {
                alt42=14;
                }
                break;
            case 100:
                {
                alt42=15;
                }
                break;
            case 101:
                {
                alt42=16;
                }
                break;
            case 102:
                {
                alt42=17;
                }
                break;
            case 103:
                {
                alt42=18;
                }
                break;
            case 104:
                {
                alt42=19;
                }
                break;
            case 105:
                {
                alt42=20;
                }
                break;
            case 106:
                {
                alt42=21;
                }
                break;
            case 107:
                {
                alt42=22;
                }
                break;
            case 108:
                {
                alt42=23;
                }
                break;
            case 109:
                {
                alt42=24;
                }
                break;
            case 110:
                {
                alt42=25;
                }
                break;
            case 111:
                {
                alt42=26;
                }
                break;
            case 112:
                {
                alt42=27;
                }
                break;
            case 113:
                {
                alt42=28;
                }
                break;
            case 114:
                {
                alt42=29;
                }
                break;
            case 115:
                {
                alt42=30;
                }
                break;
            case 116:
                {
                alt42=31;
                }
                break;
            case 117:
                {
                alt42=32;
                }
                break;
            case 118:
                {
                alt42=33;
                }
                break;
            case 120:
                {
                alt42=34;
                }
                break;
            case 121:
                {
                alt42=35;
                }
                break;
            case 122:
                {
                alt42=36;
                }
                break;
            case 123:
                {
                alt42=37;
                }
                break;
            case 124:
                {
                alt42=38;
                }
                break;
            case 125:
                {
                alt42=39;
                }
                break;
            case 126:
                {
                alt42=40;
                }
                break;
            case 127:
                {
                alt42=41;
                }
                break;
            case 128:
                {
                alt42=42;
                }
                break;
            case 129:
                {
                alt42=43;
                }
                break;
            case 130:
                {
                alt42=44;
                }
                break;
            case 131:
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
                    // InternalEventBComponent.g:1780:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEventBComponent.g:1786:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalEventBComponent.g:1792:3: kw= '\\uE101'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalEventBComponent.g:1798:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalEventBComponent.g:1804:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalEventBComponent.g:1810:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalEventBComponent.g:1816:3: kw= '\\u2914'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalEventBComponent.g:1822:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalEventBComponent.g:1828:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalEventBComponent.g:1834:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalEventBComponent.g:1840:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalEventBComponent.g:1846:3: kw= '{'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalEventBComponent.g:1852:3: kw= '}'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalEventBComponent.g:1858:3: kw= '\\u21A6'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalEventBComponent.g:1864:3: kw= '\\u2205'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalEventBComponent.g:1870:3: kw= '\\u2229'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalEventBComponent.g:1876:3: kw= '\\u222A'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalEventBComponent.g:1882:3: kw= '\\u2216'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalEventBComponent.g:1888:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalEventBComponent.g:1894:3: kw= '['
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalEventBComponent.g:1900:3: kw= ']'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalEventBComponent.g:1906:3: kw= '\\uE103'
                    {
                    kw=(Token)match(input,107,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalEventBComponent.g:1912:3: kw= '\\u2218'
                    {
                    kw=(Token)match(input,108,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalEventBComponent.g:1918:3: kw= ';'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalEventBComponent.g:1924:3: kw= '\\u2297'
                    {
                    kw=(Token)match(input,110,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalEventBComponent.g:1930:3: kw= '\\u2225'
                    {
                    kw=(Token)match(input,111,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalEventBComponent.g:1936:3: kw= '\\u223C'
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalEventBComponent.g:1942:3: kw= '\\u25C1'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalEventBComponent.g:1948:3: kw= '\\u2A64'
                    {
                    kw=(Token)match(input,114,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalEventBComponent.g:1954:3: kw= '\\u25B7'
                    {
                    kw=(Token)match(input,115,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalEventBComponent.g:1960:3: kw= '\\u2A65'
                    {
                    kw=(Token)match(input,116,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalEventBComponent.g:1966:3: kw= '\\u03BB'
                    {
                    kw=(Token)match(input,117,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalEventBComponent.g:1972:3: (kw= '%' kw= '\\u22C2' )
                    {
                    // InternalEventBComponent.g:1972:3: (kw= '%' kw= '\\u22C2' )
                    // InternalEventBComponent.g:1973:4: kw= '%' kw= '\\u22C2'
                    {
                    kw=(Token)match(input,118,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0());
                    			
                    kw=(Token)match(input,119,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalEventBComponent.g:1985:3: kw= '\\u22C3'
                    {
                    kw=(Token)match(input,120,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalEventBComponent.g:1991:3: kw= '\\u2223'
                    {
                    kw=(Token)match(input,121,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalEventBComponent.g:1997:3: kw= '\\u2025'
                    {
                    kw=(Token)match(input,122,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalEventBComponent.g:2003:3: kw= '+'
                    {
                    kw=(Token)match(input,123,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalEventBComponent.g:2009:3: kw= '\\u2212'
                    {
                    kw=(Token)match(input,124,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalEventBComponent.g:2015:3: kw= '-'
                    {
                    kw=(Token)match(input,125,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalEventBComponent.g:2021:3: kw= '\\u2217'
                    {
                    kw=(Token)match(input,126,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalEventBComponent.g:2027:3: kw= '*'
                    {
                    kw=(Token)match(input,127,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalEventBComponent.g:2033:3: kw= '\\u00F7'
                    {
                    kw=(Token)match(input,128,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalEventBComponent.g:2039:3: kw= '/'
                    {
                    kw=(Token)match(input,129,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalEventBComponent.g:2045:3: kw= '^'
                    {
                    kw=(Token)match(input,130,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalEventBComponent.g:2051:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,131,FOLLOW_2); 

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


    // $ANTLR start "entryRuleContext"
    // InternalEventBComponent.g:2060:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalEventBComponent.g:2060:48: (iv_ruleContext= ruleContext EOF )
            // InternalEventBComponent.g:2061:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalEventBComponent.g:2067:1: ruleContext returns [EObject current=null] : ( () otherlv_1= 'context' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) )+ )? (otherlv_5= 'sets' ( (lv_sets_6_0= ruleCarrierSet ) )+ )? (otherlv_7= 'constants' ( (lv_constants_8_0= ruleConstant ) )+ )? (otherlv_9= 'axioms' ( (lv_axioms_10_0= ruleAxiom ) )+ )? otherlv_11= 'end' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_sets_6_0 = null;

        EObject lv_constants_8_0 = null;

        EObject lv_axioms_10_0 = null;



        	enterRule();

        try {
            // InternalEventBComponent.g:2073:2: ( ( () otherlv_1= 'context' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) )+ )? (otherlv_5= 'sets' ( (lv_sets_6_0= ruleCarrierSet ) )+ )? (otherlv_7= 'constants' ( (lv_constants_8_0= ruleConstant ) )+ )? (otherlv_9= 'axioms' ( (lv_axioms_10_0= ruleAxiom ) )+ )? otherlv_11= 'end' ) )
            // InternalEventBComponent.g:2074:2: ( () otherlv_1= 'context' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) )+ )? (otherlv_5= 'sets' ( (lv_sets_6_0= ruleCarrierSet ) )+ )? (otherlv_7= 'constants' ( (lv_constants_8_0= ruleConstant ) )+ )? (otherlv_9= 'axioms' ( (lv_axioms_10_0= ruleAxiom ) )+ )? otherlv_11= 'end' )
            {
            // InternalEventBComponent.g:2074:2: ( () otherlv_1= 'context' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) )+ )? (otherlv_5= 'sets' ( (lv_sets_6_0= ruleCarrierSet ) )+ )? (otherlv_7= 'constants' ( (lv_constants_8_0= ruleConstant ) )+ )? (otherlv_9= 'axioms' ( (lv_axioms_10_0= ruleAxiom ) )+ )? otherlv_11= 'end' )
            // InternalEventBComponent.g:2075:3: () otherlv_1= 'context' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) )+ )? (otherlv_5= 'sets' ( (lv_sets_6_0= ruleCarrierSet ) )+ )? (otherlv_7= 'constants' ( (lv_constants_8_0= ruleConstant ) )+ )? (otherlv_9= 'axioms' ( (lv_axioms_10_0= ruleAxiom ) )+ )? otherlv_11= 'end'
            {
            // InternalEventBComponent.g:2075:3: ()
            // InternalEventBComponent.g:2076:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContextAccess().getContextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,132,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContextAccess().getContextKeyword_1());
            		
            // InternalEventBComponent.g:2086:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEventBComponent.g:2087:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEventBComponent.g:2087:4: (lv_name_2_0= RULE_ID )
            // InternalEventBComponent.g:2088:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_2_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xeventb.camillex.EventBComponent.ID");
            				

            }


            }

            // InternalEventBComponent.g:2104:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) )+ )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==133) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEventBComponent.g:2105:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )+
                    {
                    otherlv_3=(Token)match(input,133,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getContextAccess().getExtendsKeyword_3_0());
                    			
                    // InternalEventBComponent.g:2109:4: ( ( ruleQualifiedName ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_ID) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalEventBComponent.g:2110:5: ( ruleQualifiedName )
                    	    {
                    	    // InternalEventBComponent.g:2110:5: ( ruleQualifiedName )
                    	    // InternalEventBComponent.g:2111:6: ruleQualifiedName
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getContextRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getContextAccess().getExtendsContextCrossReference_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    ruleQualifiedName();

                    	    state._fsp--;


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

            // InternalEventBComponent.g:2126:3: (otherlv_5= 'sets' ( (lv_sets_6_0= ruleCarrierSet ) )+ )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==134) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEventBComponent.g:2127:4: otherlv_5= 'sets' ( (lv_sets_6_0= ruleCarrierSet ) )+
                    {
                    otherlv_5=(Token)match(input,134,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getContextAccess().getSetsKeyword_4_0());
                    			
                    // InternalEventBComponent.g:2131:4: ( (lv_sets_6_0= ruleCarrierSet ) )+
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
                    	    // InternalEventBComponent.g:2132:5: (lv_sets_6_0= ruleCarrierSet )
                    	    {
                    	    // InternalEventBComponent.g:2132:5: (lv_sets_6_0= ruleCarrierSet )
                    	    // InternalEventBComponent.g:2133:6: lv_sets_6_0= ruleCarrierSet
                    	    {

                    	    						newCompositeNode(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_sets_6_0=ruleCarrierSet();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sets",
                    	    							lv_sets_6_0,
                    	    							"ac.soton.xeventb.camillex.EventBComponent.CarrierSet");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            // InternalEventBComponent.g:2151:3: (otherlv_7= 'constants' ( (lv_constants_8_0= ruleConstant ) )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==135) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEventBComponent.g:2152:4: otherlv_7= 'constants' ( (lv_constants_8_0= ruleConstant ) )+
                    {
                    otherlv_7=(Token)match(input,135,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getContextAccess().getConstantsKeyword_5_0());
                    			
                    // InternalEventBComponent.g:2156:4: ( (lv_constants_8_0= ruleConstant ) )+
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
                    	    // InternalEventBComponent.g:2157:5: (lv_constants_8_0= ruleConstant )
                    	    {
                    	    // InternalEventBComponent.g:2157:5: (lv_constants_8_0= ruleConstant )
                    	    // InternalEventBComponent.g:2158:6: lv_constants_8_0= ruleConstant
                    	    {

                    	    						newCompositeNode(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_constants_8_0=ruleConstant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constants",
                    	    							lv_constants_8_0,
                    	    							"ac.soton.xeventb.camillex.EventBComponent.Constant");
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

            // InternalEventBComponent.g:2176:3: (otherlv_9= 'axioms' ( (lv_axioms_10_0= ruleAxiom ) )+ )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==136) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEventBComponent.g:2177:4: otherlv_9= 'axioms' ( (lv_axioms_10_0= ruleAxiom ) )+
                    {
                    otherlv_9=(Token)match(input,136,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getContextAccess().getAxiomsKeyword_6_0());
                    			
                    // InternalEventBComponent.g:2181:4: ( (lv_axioms_10_0= ruleAxiom ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_LABEL) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalEventBComponent.g:2182:5: (lv_axioms_10_0= ruleAxiom )
                    	    {
                    	    // InternalEventBComponent.g:2182:5: (lv_axioms_10_0= ruleAxiom )
                    	    // InternalEventBComponent.g:2183:6: lv_axioms_10_0= ruleAxiom
                    	    {

                    	    						newCompositeNode(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_axioms_10_0=ruleAxiom();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"axioms",
                    	    							lv_axioms_10_0,
                    	    							"ac.soton.xeventb.camillex.EventBComponent.Axiom");
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
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getContextAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleCarrierSet"
    // InternalEventBComponent.g:2209:1: entryRuleCarrierSet returns [EObject current=null] : iv_ruleCarrierSet= ruleCarrierSet EOF ;
    public final EObject entryRuleCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarrierSet = null;


        try {
            // InternalEventBComponent.g:2209:51: (iv_ruleCarrierSet= ruleCarrierSet EOF )
            // InternalEventBComponent.g:2210:2: iv_ruleCarrierSet= ruleCarrierSet EOF
            {
             newCompositeNode(grammarAccess.getCarrierSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarrierSet=ruleCarrierSet();

            state._fsp--;

             current =iv_ruleCarrierSet; 
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
    // $ANTLR end "entryRuleCarrierSet"


    // $ANTLR start "ruleCarrierSet"
    // InternalEventBComponent.g:2216:1: ruleCarrierSet returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCarrierSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:2222:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEventBComponent.g:2223:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEventBComponent.g:2223:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEventBComponent.g:2224:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalEventBComponent.g:2224:3: ()
            // InternalEventBComponent.g:2225:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCarrierSetAccess().getCarrierSetAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:2231:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEventBComponent.g:2232:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEventBComponent.g:2232:4: (lv_name_1_0= RULE_ID )
            // InternalEventBComponent.g:2233:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCarrierSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCarrierSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.ID");
            				

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
    // $ANTLR end "ruleCarrierSet"


    // $ANTLR start "entryRuleConstant"
    // InternalEventBComponent.g:2253:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalEventBComponent.g:2253:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalEventBComponent.g:2254:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalEventBComponent.g:2260:1: ruleConstant returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:2266:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEventBComponent.g:2267:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEventBComponent.g:2267:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEventBComponent.g:2268:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalEventBComponent.g:2268:3: ()
            // InternalEventBComponent.g:2269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantAccess().getConstantAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:2275:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEventBComponent.g:2276:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEventBComponent.g:2276:4: (lv_name_1_0= RULE_ID )
            // InternalEventBComponent.g:2277:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.ID");
            				

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleAxiom"
    // InternalEventBComponent.g:2297:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // InternalEventBComponent.g:2297:46: (iv_ruleAxiom= ruleAxiom EOF )
            // InternalEventBComponent.g:2298:2: iv_ruleAxiom= ruleAxiom EOF
            {
             newCompositeNode(grammarAccess.getAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;

             current =iv_ruleAxiom; 
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
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // InternalEventBComponent.g:2304:1: ruleAxiom returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) ;
    public final EObject ruleAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_theorem_3_0=null;
        AntlrDatatypeRuleToken lv_predicate_2_0 = null;



        	enterRule();

        try {
            // InternalEventBComponent.g:2310:2: ( ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? ) )
            // InternalEventBComponent.g:2311:2: ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            {
            // InternalEventBComponent.g:2311:2: ( () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )? )
            // InternalEventBComponent.g:2312:3: () ( (lv_name_1_0= RULE_LABEL ) ) ( (lv_predicate_2_0= ruleXPredicate ) ) ( (lv_theorem_3_0= 'theorem' ) )?
            {
            // InternalEventBComponent.g:2312:3: ()
            // InternalEventBComponent.g:2313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAxiomAccess().getAxiomAction_0(),
            					current);
            			

            }

            // InternalEventBComponent.g:2319:3: ( (lv_name_1_0= RULE_LABEL ) )
            // InternalEventBComponent.g:2320:4: (lv_name_1_0= RULE_LABEL )
            {
            // InternalEventBComponent.g:2320:4: (lv_name_1_0= RULE_LABEL )
            // InternalEventBComponent.g:2321:5: lv_name_1_0= RULE_LABEL
            {
            lv_name_1_0=(Token)match(input,RULE_LABEL,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAxiomAccess().getNameLABELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.camillex.EventBComponent.LABEL");
            				

            }


            }

            // InternalEventBComponent.g:2337:3: ( (lv_predicate_2_0= ruleXPredicate ) )
            // InternalEventBComponent.g:2338:4: (lv_predicate_2_0= ruleXPredicate )
            {
            // InternalEventBComponent.g:2338:4: (lv_predicate_2_0= ruleXPredicate )
            // InternalEventBComponent.g:2339:5: lv_predicate_2_0= ruleXPredicate
            {

            					newCompositeNode(grammarAccess.getAxiomAccess().getPredicateXPredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_predicate_2_0=ruleXPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAxiomRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"ac.soton.xeventb.camillex.EventBComponent.XPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventBComponent.g:2356:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==24) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalEventBComponent.g:2357:4: (lv_theorem_3_0= 'theorem' )
                    {
                    // InternalEventBComponent.g:2357:4: (lv_theorem_3_0= 'theorem' )
                    // InternalEventBComponent.g:2358:5: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_theorem_3_0, grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAxiomRule());
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
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "ruleConvergence"
    // InternalEventBComponent.g:2374:1: ruleConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEventBComponent.g:2380:2: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // InternalEventBComponent.g:2381:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // InternalEventBComponent.g:2381:2: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 137:
                {
                alt52=1;
                }
                break;
            case 138:
                {
                alt52=2;
                }
                break;
            case 139:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalEventBComponent.g:2382:3: (enumLiteral_0= 'ordinary' )
                    {
                    // InternalEventBComponent.g:2382:3: (enumLiteral_0= 'ordinary' )
                    // InternalEventBComponent.g:2383:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,137,FOLLOW_2); 

                    				current = grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEventBComponent.g:2390:3: (enumLiteral_1= 'convergent' )
                    {
                    // InternalEventBComponent.g:2390:3: (enumLiteral_1= 'convergent' )
                    // InternalEventBComponent.g:2391:4: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,138,FOLLOW_2); 

                    				current = grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEventBComponent.g:2398:3: (enumLiteral_2= 'anticipated' )
                    {
                    // InternalEventBComponent.g:2398:3: (enumLiteral_2= 'anticipated' )
                    // InternalEventBComponent.g:2399:4: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,139,FOLLOW_2); 

                    				current = grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleConvergence"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003FC000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001F0010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001E0010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xFFFFFFFE00001050L,0xFF7FFFFFFFFFFFFFL,0x000000000000000FL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000015E104000L,0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000015C104000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000005C100010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000024100020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020100020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xFFFFFFFE00001052L,0xFF7FFFFFFFFFFFFFL,0x000000000000000FL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100010L,0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100010L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100010L,0x0000000000000000L,0x0000000000000100L});

}
