package ac.soton.xeventb.xmachine.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalXMachineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_XLABEL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'variables'", "'vars'", "'invariants'", "'invs'", "'variable'", "'var'", "'\\u2194'", "'<->'", "'\\uE100'", "'<<->'", "'\\uE101'", "'<->>'", "'\\uE102'", "'<<->>'", "'\\u21F8'", "'+->'", "'\\u2192'", "'-->'", "'\\u2914'", "'>+>'", "'\\u21A3'", "'>->'", "'\\u2900'", "'+>>'", "'\\u21A0'", "'->>'", "'\\u2916'", "'>->>'", "'\\u00D7'", "'**'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'invariant'", "'where'", "'when'", "'then'", "'begin'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'NAT1'", "'NAT'", "'\\u21191'", "'POW1'", "'\\u2119'", "'POW'", "'INT'", "'('", "')'", "'\\u21D4'", "'<=>'", "'\\u21D2'", "'=>'", "'\\u2227'", "'&'", "'\\u2228'", "'or'", "'\\u00AC'", "'not'", "'\\u22A4'", "'true'", "'\\u22A5'", "'false'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'/='", "'\\u2264'", "'=<'", "'<'", "'\\u2265'", "'>='", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'/:'", "'\\u2282'", "'<<:'", "'\\u2284'", "'/<<:'", "'\\u2286'", "'<:'", "'\\u2288'", "'/<:'", "'partition'", "'{'", "'}'", "'\\u21A6'", "',,'", "'|->'", "'\\u2205'", "'{}'", "'\\u2229'", "'/\\\\'", "'\\u222A'", "'\\\\/'", "'\\u2216'", "'\\\\'", "'['", "']'", "'\\uE103'", "'<+'", "'\\u2218'", "'circ'", "';'", "'\\u2297'", "'><'", "'\\u2225'", "'||'", "'\\u223C'", "'~'", "'\\u25C1'", "'<|'", "'\\u2A64'", "'<<|'", "'\\u25B7'", "'|>'", "'\\u2A65'", "'|>>'", "'\\u03BB'", "'INTER'", "'\\u22C3'", "'UNION'", "'\\u2223'", "'|'", "'\\u2025'", "'..'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'extended'", "'ext'", "'refined'", "'ref'", "'record'", "'rec'", "'inherits'", "'ihr'", "'field'", "'fld'", "'ordinary'", "'convergent'", "'anticipated'", "'one'", "'many'", "'opt'", "'machine'", "'end'", "'refines'", "'sees'", "'contains'", "'events'", "'includes'", "'to'", "'as'", "'variant'", "'event'", "'any'", "'with'", "'synchronises'", "'%'", "'\\u22C2'", "'constraint'", "'theorem'", "'extends'"
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
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
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
    public static final int RULE_XLABEL=7;
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
    public static final int RULE_STRING=6;
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

    	public void setGrammarAccess(XMachineGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMachine"
    // InternalXMachine.g:53:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // InternalXMachine.g:54:1: ( ruleMachine EOF )
            // InternalXMachine.g:55:1: ruleMachine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalXMachine.g:62:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:66:2: ( ( ( rule__Machine__Group__0 ) ) )
            // InternalXMachine.g:67:2: ( ( rule__Machine__Group__0 ) )
            {
            // InternalXMachine.g:67:2: ( ( rule__Machine__Group__0 ) )
            // InternalXMachine.g:68:3: ( rule__Machine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup()); 
            }
            // InternalXMachine.g:69:3: ( rule__Machine__Group__0 )
            // InternalXMachine.g:69:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleMContains"
    // InternalXMachine.g:78:1: entryRuleMContains : ruleMContains EOF ;
    public final void entryRuleMContains() throws RecognitionException {
        try {
            // InternalXMachine.g:79:1: ( ruleMContains EOF )
            // InternalXMachine.g:80:1: ruleMContains EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMContains();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMContains"


    // $ANTLR start "ruleMContains"
    // InternalXMachine.g:87:1: ruleMContains : ( ( rule__MContains__Group__0 ) ) ;
    public final void ruleMContains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:91:2: ( ( ( rule__MContains__Group__0 ) ) )
            // InternalXMachine.g:92:2: ( ( rule__MContains__Group__0 ) )
            {
            // InternalXMachine.g:92:2: ( ( rule__MContains__Group__0 ) )
            // InternalXMachine.g:93:3: ( rule__MContains__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getGroup()); 
            }
            // InternalXMachine.g:94:3: ( rule__MContains__Group__0 )
            // InternalXMachine.g:94:4: rule__MContains__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MContains__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMContains"


    // $ANTLR start "entryRuleMIncludes"
    // InternalXMachine.g:103:1: entryRuleMIncludes : ruleMIncludes EOF ;
    public final void entryRuleMIncludes() throws RecognitionException {
        try {
            // InternalXMachine.g:104:1: ( ruleMIncludes EOF )
            // InternalXMachine.g:105:1: ruleMIncludes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMIncludes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMIncludes"


    // $ANTLR start "ruleMIncludes"
    // InternalXMachine.g:112:1: ruleMIncludes : ( ( rule__MIncludes__Group__0 ) ) ;
    public final void ruleMIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:116:2: ( ( ( rule__MIncludes__Group__0 ) ) )
            // InternalXMachine.g:117:2: ( ( rule__MIncludes__Group__0 ) )
            {
            // InternalXMachine.g:117:2: ( ( rule__MIncludes__Group__0 ) )
            // InternalXMachine.g:118:3: ( rule__MIncludes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup()); 
            }
            // InternalXMachine.g:119:3: ( rule__MIncludes__Group__0 )
            // InternalXMachine.g:119:4: rule__MIncludes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMIncludes"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXMachine.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXMachine.g:129:1: ( ruleQualifiedName EOF )
            // InternalXMachine.g:130:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXMachine.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXMachine.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXMachine.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXMachine.g:143:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalXMachine.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalXMachine.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleXMultipleVariable"
    // InternalXMachine.g:153:1: entryRuleXMultipleVariable : ruleXMultipleVariable EOF ;
    public final void entryRuleXMultipleVariable() throws RecognitionException {
        try {
            // InternalXMachine.g:154:1: ( ruleXMultipleVariable EOF )
            // InternalXMachine.g:155:1: ruleXMultipleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXMultipleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXMultipleVariable"


    // $ANTLR start "ruleXMultipleVariable"
    // InternalXMachine.g:162:1: ruleXMultipleVariable : ( ( rule__XMultipleVariable__Group__0 ) ) ;
    public final void ruleXMultipleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:166:2: ( ( ( rule__XMultipleVariable__Group__0 ) ) )
            // InternalXMachine.g:167:2: ( ( rule__XMultipleVariable__Group__0 ) )
            {
            // InternalXMachine.g:167:2: ( ( rule__XMultipleVariable__Group__0 ) )
            // InternalXMachine.g:168:3: ( rule__XMultipleVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleVariableAccess().getGroup()); 
            }
            // InternalXMachine.g:169:3: ( rule__XMultipleVariable__Group__0 )
            // InternalXMachine.g:169:4: rule__XMultipleVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XMultipleVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXMultipleVariable"


    // $ANTLR start "entryRuleXIndividualVariable"
    // InternalXMachine.g:178:1: entryRuleXIndividualVariable : ruleXIndividualVariable EOF ;
    public final void entryRuleXIndividualVariable() throws RecognitionException {
        try {
            // InternalXMachine.g:179:1: ( ruleXIndividualVariable EOF )
            // InternalXMachine.g:180:1: ruleXIndividualVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXIndividualVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXIndividualVariable"


    // $ANTLR start "ruleXIndividualVariable"
    // InternalXMachine.g:187:1: ruleXIndividualVariable : ( ( rule__XIndividualVariable__Group__0 ) ) ;
    public final void ruleXIndividualVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:191:2: ( ( ( rule__XIndividualVariable__Group__0 ) ) )
            // InternalXMachine.g:192:2: ( ( rule__XIndividualVariable__Group__0 ) )
            {
            // InternalXMachine.g:192:2: ( ( rule__XIndividualVariable__Group__0 ) )
            // InternalXMachine.g:193:3: ( rule__XIndividualVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getGroup()); 
            }
            // InternalXMachine.g:194:3: ( rule__XIndividualVariable__Group__0 )
            // InternalXMachine.g:194:4: rule__XIndividualVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXIndividualVariable"


    // $ANTLR start "entryRuleXType"
    // InternalXMachine.g:203:1: entryRuleXType : ruleXType EOF ;
    public final void entryRuleXType() throws RecognitionException {
        try {
            // InternalXMachine.g:204:1: ( ruleXType EOF )
            // InternalXMachine.g:205:1: ruleXType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXType"


    // $ANTLR start "ruleXType"
    // InternalXMachine.g:212:1: ruleXType : ( ( rule__XType__Group__0 ) ) ;
    public final void ruleXType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:216:2: ( ( ( rule__XType__Group__0 ) ) )
            // InternalXMachine.g:217:2: ( ( rule__XType__Group__0 ) )
            {
            // InternalXMachine.g:217:2: ( ( rule__XType__Group__0 ) )
            // InternalXMachine.g:218:3: ( rule__XType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypeAccess().getGroup()); 
            }
            // InternalXMachine.g:219:3: ( rule__XType__Group__0 )
            // InternalXMachine.g:219:4: rule__XType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXType"


    // $ANTLR start "entryRuleXTYPEOPERATOR"
    // InternalXMachine.g:228:1: entryRuleXTYPEOPERATOR : ruleXTYPEOPERATOR EOF ;
    public final void entryRuleXTYPEOPERATOR() throws RecognitionException {
        try {
            // InternalXMachine.g:229:1: ( ruleXTYPEOPERATOR EOF )
            // InternalXMachine.g:230:1: ruleXTYPEOPERATOR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTYPEOPERATORRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXTYPEOPERATOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTYPEOPERATORRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXTYPEOPERATOR"


    // $ANTLR start "ruleXTYPEOPERATOR"
    // InternalXMachine.g:237:1: ruleXTYPEOPERATOR : ( ( rule__XTYPEOPERATOR__Alternatives ) ) ;
    public final void ruleXTYPEOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:241:2: ( ( ( rule__XTYPEOPERATOR__Alternatives ) ) )
            // InternalXMachine.g:242:2: ( ( rule__XTYPEOPERATOR__Alternatives ) )
            {
            // InternalXMachine.g:242:2: ( ( rule__XTYPEOPERATOR__Alternatives ) )
            // InternalXMachine.g:243:3: ( rule__XTYPEOPERATOR__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTYPEOPERATORAccess().getAlternatives()); 
            }
            // InternalXMachine.g:244:3: ( rule__XTYPEOPERATOR__Alternatives )
            // InternalXMachine.g:244:4: rule__XTYPEOPERATOR__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XTYPEOPERATOR__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTYPEOPERATORAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXTYPEOPERATOR"


    // $ANTLR start "entryRuleXTypePrimitive"
    // InternalXMachine.g:253:1: entryRuleXTypePrimitive : ruleXTypePrimitive EOF ;
    public final void entryRuleXTypePrimitive() throws RecognitionException {
        try {
            // InternalXMachine.g:254:1: ( ruleXTypePrimitive EOF )
            // InternalXMachine.g:255:1: ruleXTypePrimitive EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXTypePrimitive();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXTypePrimitive"


    // $ANTLR start "ruleXTypePrimitive"
    // InternalXMachine.g:262:1: ruleXTypePrimitive : ( ( rule__XTypePrimitive__Alternatives ) ) ;
    public final void ruleXTypePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:266:2: ( ( ( rule__XTypePrimitive__Alternatives ) ) )
            // InternalXMachine.g:267:2: ( ( rule__XTypePrimitive__Alternatives ) )
            {
            // InternalXMachine.g:267:2: ( ( rule__XTypePrimitive__Alternatives ) )
            // InternalXMachine.g:268:3: ( rule__XTypePrimitive__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getAlternatives()); 
            }
            // InternalXMachine.g:269:3: ( rule__XTypePrimitive__Alternatives )
            // InternalXMachine.g:269:4: rule__XTypePrimitive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXTypePrimitive"


    // $ANTLR start "entryRuleXMultipleInvariant"
    // InternalXMachine.g:278:1: entryRuleXMultipleInvariant : ruleXMultipleInvariant EOF ;
    public final void entryRuleXMultipleInvariant() throws RecognitionException {
        try {
            // InternalXMachine.g:279:1: ( ruleXMultipleInvariant EOF )
            // InternalXMachine.g:280:1: ruleXMultipleInvariant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXMultipleInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleInvariantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXMultipleInvariant"


    // $ANTLR start "ruleXMultipleInvariant"
    // InternalXMachine.g:287:1: ruleXMultipleInvariant : ( ( rule__XMultipleInvariant__Group__0 ) ) ;
    public final void ruleXMultipleInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:291:2: ( ( ( rule__XMultipleInvariant__Group__0 ) ) )
            // InternalXMachine.g:292:2: ( ( rule__XMultipleInvariant__Group__0 ) )
            {
            // InternalXMachine.g:292:2: ( ( rule__XMultipleInvariant__Group__0 ) )
            // InternalXMachine.g:293:3: ( rule__XMultipleInvariant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getGroup()); 
            }
            // InternalXMachine.g:294:3: ( rule__XMultipleInvariant__Group__0 )
            // InternalXMachine.g:294:4: rule__XMultipleInvariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XMultipleInvariant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleInvariantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXMultipleInvariant"


    // $ANTLR start "entryRuleXIndividualInvariant"
    // InternalXMachine.g:303:1: entryRuleXIndividualInvariant : ruleXIndividualInvariant EOF ;
    public final void entryRuleXIndividualInvariant() throws RecognitionException {
        try {
            // InternalXMachine.g:304:1: ( ruleXIndividualInvariant EOF )
            // InternalXMachine.g:305:1: ruleXIndividualInvariant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXIndividualInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXIndividualInvariant"


    // $ANTLR start "ruleXIndividualInvariant"
    // InternalXMachine.g:312:1: ruleXIndividualInvariant : ( ( rule__XIndividualInvariant__Group__0 ) ) ;
    public final void ruleXIndividualInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:316:2: ( ( ( rule__XIndividualInvariant__Group__0 ) ) )
            // InternalXMachine.g:317:2: ( ( rule__XIndividualInvariant__Group__0 ) )
            {
            // InternalXMachine.g:317:2: ( ( rule__XIndividualInvariant__Group__0 ) )
            // InternalXMachine.g:318:3: ( rule__XIndividualInvariant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getGroup()); 
            }
            // InternalXMachine.g:319:3: ( rule__XIndividualInvariant__Group__0 )
            // InternalXMachine.g:319:4: rule__XIndividualInvariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualInvariant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXIndividualInvariant"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:328:1: entryRuleXVariant : ruleXVariant EOF ;
    public final void entryRuleXVariant() throws RecognitionException {
        try {
            // InternalXMachine.g:329:1: ( ruleXVariant EOF )
            // InternalXMachine.g:330:1: ruleXVariant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXVariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXVariant"


    // $ANTLR start "ruleXVariant"
    // InternalXMachine.g:337:1: ruleXVariant : ( ( rule__XVariant__Group__0 ) ) ;
    public final void ruleXVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:341:2: ( ( ( rule__XVariant__Group__0 ) ) )
            // InternalXMachine.g:342:2: ( ( rule__XVariant__Group__0 ) )
            {
            // InternalXMachine.g:342:2: ( ( rule__XVariant__Group__0 ) )
            // InternalXMachine.g:343:3: ( rule__XVariant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getGroup()); 
            }
            // InternalXMachine.g:344:3: ( rule__XVariant__Group__0 )
            // InternalXMachine.g:344:4: rule__XVariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariant"


    // $ANTLR start "entryRuleXEvent"
    // InternalXMachine.g:353:1: entryRuleXEvent : ruleXEvent EOF ;
    public final void entryRuleXEvent() throws RecognitionException {
        try {
            // InternalXMachine.g:354:1: ( ruleXEvent EOF )
            // InternalXMachine.g:355:1: ruleXEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXEvent"


    // $ANTLR start "ruleXEvent"
    // InternalXMachine.g:362:1: ruleXEvent : ( ( rule__XEvent__Group__0 ) ) ;
    public final void ruleXEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:366:2: ( ( ( rule__XEvent__Group__0 ) ) )
            // InternalXMachine.g:367:2: ( ( rule__XEvent__Group__0 ) )
            {
            // InternalXMachine.g:367:2: ( ( rule__XEvent__Group__0 ) )
            // InternalXMachine.g:368:3: ( rule__XEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup()); 
            }
            // InternalXMachine.g:369:3: ( rule__XEvent__Group__0 )
            // InternalXMachine.g:369:4: rule__XEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXEvent"


    // $ANTLR start "entryRuleEventSync"
    // InternalXMachine.g:378:1: entryRuleEventSync : ruleEventSync EOF ;
    public final void entryRuleEventSync() throws RecognitionException {
        try {
            // InternalXMachine.g:379:1: ( ruleEventSync EOF )
            // InternalXMachine.g:380:1: ruleEventSync EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventSync();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventSync"


    // $ANTLR start "ruleEventSync"
    // InternalXMachine.g:387:1: ruleEventSync : ( ( rule__EventSync__Group__0 ) ) ;
    public final void ruleEventSync() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:391:2: ( ( ( rule__EventSync__Group__0 ) ) )
            // InternalXMachine.g:392:2: ( ( rule__EventSync__Group__0 ) )
            {
            // InternalXMachine.g:392:2: ( ( rule__EventSync__Group__0 ) )
            // InternalXMachine.g:393:3: ( rule__EventSync__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup()); 
            }
            // InternalXMachine.g:394:3: ( rule__EventSync__Group__0 )
            // InternalXMachine.g:394:4: rule__EventSync__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventSync"


    // $ANTLR start "entryRuleXParameter"
    // InternalXMachine.g:403:1: entryRuleXParameter : ruleXParameter EOF ;
    public final void entryRuleXParameter() throws RecognitionException {
        try {
            // InternalXMachine.g:404:1: ( ruleXParameter EOF )
            // InternalXMachine.g:405:1: ruleXParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXParameter"


    // $ANTLR start "ruleXParameter"
    // InternalXMachine.g:412:1: ruleXParameter : ( ( rule__XParameter__Group__0 ) ) ;
    public final void ruleXParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:416:2: ( ( ( rule__XParameter__Group__0 ) ) )
            // InternalXMachine.g:417:2: ( ( rule__XParameter__Group__0 ) )
            {
            // InternalXMachine.g:417:2: ( ( rule__XParameter__Group__0 ) )
            // InternalXMachine.g:418:3: ( rule__XParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getGroup()); 
            }
            // InternalXMachine.g:419:3: ( rule__XParameter__Group__0 )
            // InternalXMachine.g:419:4: rule__XParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXParameter"


    // $ANTLR start "entryRuleXGuard"
    // InternalXMachine.g:428:1: entryRuleXGuard : ruleXGuard EOF ;
    public final void entryRuleXGuard() throws RecognitionException {
        try {
            // InternalXMachine.g:429:1: ( ruleXGuard EOF )
            // InternalXMachine.g:430:1: ruleXGuard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXGuard"


    // $ANTLR start "ruleXGuard"
    // InternalXMachine.g:437:1: ruleXGuard : ( ( rule__XGuard__Group__0 ) ) ;
    public final void ruleXGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:441:2: ( ( ( rule__XGuard__Group__0 ) ) )
            // InternalXMachine.g:442:2: ( ( rule__XGuard__Group__0 ) )
            {
            // InternalXMachine.g:442:2: ( ( rule__XGuard__Group__0 ) )
            // InternalXMachine.g:443:3: ( rule__XGuard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGroup()); 
            }
            // InternalXMachine.g:444:3: ( rule__XGuard__Group__0 )
            // InternalXMachine.g:444:4: rule__XGuard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGuard"


    // $ANTLR start "entryRuleXWitness"
    // InternalXMachine.g:453:1: entryRuleXWitness : ruleXWitness EOF ;
    public final void entryRuleXWitness() throws RecognitionException {
        try {
            // InternalXMachine.g:454:1: ( ruleXWitness EOF )
            // InternalXMachine.g:455:1: ruleXWitness EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXWitness();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXWitness"


    // $ANTLR start "ruleXWitness"
    // InternalXMachine.g:462:1: ruleXWitness : ( ( rule__XWitness__Group__0 ) ) ;
    public final void ruleXWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:466:2: ( ( ( rule__XWitness__Group__0 ) ) )
            // InternalXMachine.g:467:2: ( ( rule__XWitness__Group__0 ) )
            {
            // InternalXMachine.g:467:2: ( ( rule__XWitness__Group__0 ) )
            // InternalXMachine.g:468:3: ( rule__XWitness__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getGroup()); 
            }
            // InternalXMachine.g:469:3: ( rule__XWitness__Group__0 )
            // InternalXMachine.g:469:4: rule__XWitness__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXWitness"


    // $ANTLR start "entryRuleXAction"
    // InternalXMachine.g:478:1: entryRuleXAction : ruleXAction EOF ;
    public final void entryRuleXAction() throws RecognitionException {
        try {
            // InternalXMachine.g:479:1: ( ruleXAction EOF )
            // InternalXMachine.g:480:1: ruleXAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXAction"


    // $ANTLR start "ruleXAction"
    // InternalXMachine.g:487:1: ruleXAction : ( ( rule__XAction__Group__0 ) ) ;
    public final void ruleXAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:491:2: ( ( ( rule__XAction__Group__0 ) ) )
            // InternalXMachine.g:492:2: ( ( rule__XAction__Group__0 ) )
            {
            // InternalXMachine.g:492:2: ( ( rule__XAction__Group__0 ) )
            // InternalXMachine.g:493:3: ( rule__XAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getGroup()); 
            }
            // InternalXMachine.g:494:3: ( rule__XAction__Group__0 )
            // InternalXMachine.g:494:4: rule__XAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXAction"


    // $ANTLR start "entryRuleXFormula"
    // InternalXMachine.g:503:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalXMachine.g:504:1: ( ruleXFormula EOF )
            // InternalXMachine.g:505:1: ruleXFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormulaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormulaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalXMachine.g:512:1: ruleXFormula : ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:516:2: ( ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) )
            // InternalXMachine.g:517:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            {
            // InternalXMachine.g:517:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            // InternalXMachine.g:518:3: ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* )
            {
            // InternalXMachine.g:518:3: ( ( rule__XFormula__Alternatives ) )
            // InternalXMachine.g:519:4: ( rule__XFormula__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            }
            // InternalXMachine.g:520:4: ( rule__XFormula__Alternatives )
            // InternalXMachine.g:520:5: rule__XFormula__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__XFormula__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormulaAccess().getAlternatives()); 
            }

            }

            // InternalXMachine.g:523:3: ( ( rule__XFormula__Alternatives )* )
            // InternalXMachine.g:524:4: ( rule__XFormula__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            }
            // InternalXMachine.g:525:4: ( rule__XFormula__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=18 && LA1_0<=45)||(LA1_0>=51 && LA1_0<=169)||LA1_0==200) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXMachine.g:525:5: rule__XFormula__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__XFormula__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFormulaAccess().getAlternatives()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXMachine.g:535:1: entryRuleEVENTB_IDENTIFIER_KEYWORD : ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final void entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        try {
            // InternalXMachine.g:536:1: ( ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXMachine.g:537:1: ruleEVENTB_IDENTIFIER_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEVENTB_IDENTIFIER_KEYWORD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "ruleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXMachine.g:544:1: ruleEVENTB_IDENTIFIER_KEYWORD : ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) ;
    public final void ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:548:2: ( ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) )
            // InternalXMachine.g:549:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            {
            // InternalXMachine.g:549:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            // InternalXMachine.g:550:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            }
            // InternalXMachine.g:551:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            // InternalXMachine.g:551:4: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "entryRuleEVENTB_PREDICATE_SYMBOLS"
    // InternalXMachine.g:560:1: entryRuleEVENTB_PREDICATE_SYMBOLS : ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final void entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        try {
            // InternalXMachine.g:561:1: ( ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXMachine.g:562:1: ruleEVENTB_PREDICATE_SYMBOLS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEVENTB_PREDICATE_SYMBOLS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "ruleEVENTB_PREDICATE_SYMBOLS"
    // InternalXMachine.g:569:1: ruleEVENTB_PREDICATE_SYMBOLS : ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:573:2: ( ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) )
            // InternalXMachine.g:574:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            {
            // InternalXMachine.g:574:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            // InternalXMachine.g:575:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            }
            // InternalXMachine.g:576:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            // InternalXMachine.g:576:4: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_PREDICATE_SYMBOLS__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "entryRuleEVENTB_EXPRESSION_SYMBOLS"
    // InternalXMachine.g:585:1: entryRuleEVENTB_EXPRESSION_SYMBOLS : ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final void entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        try {
            // InternalXMachine.g:586:1: ( ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXMachine.g:587:1: ruleEVENTB_EXPRESSION_SYMBOLS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEVENTB_EXPRESSION_SYMBOLS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "ruleEVENTB_EXPRESSION_SYMBOLS"
    // InternalXMachine.g:594:1: ruleEVENTB_EXPRESSION_SYMBOLS : ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:598:2: ( ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) )
            // InternalXMachine.g:599:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            {
            // InternalXMachine.g:599:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            // InternalXMachine.g:600:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            }
            // InternalXMachine.g:601:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            // InternalXMachine.g:601:4: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "entryRuleXRecord"
    // InternalXMachine.g:610:1: entryRuleXRecord : ruleXRecord EOF ;
    public final void entryRuleXRecord() throws RecognitionException {
        try {
            // InternalXMachine.g:611:1: ( ruleXRecord EOF )
            // InternalXMachine.g:612:1: ruleXRecord EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXRecord();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXRecord"


    // $ANTLR start "ruleXRecord"
    // InternalXMachine.g:619:1: ruleXRecord : ( ( rule__XRecord__Group__0 ) ) ;
    public final void ruleXRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:623:2: ( ( ( rule__XRecord__Group__0 ) ) )
            // InternalXMachine.g:624:2: ( ( rule__XRecord__Group__0 ) )
            {
            // InternalXMachine.g:624:2: ( ( rule__XRecord__Group__0 ) )
            // InternalXMachine.g:625:3: ( rule__XRecord__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getGroup()); 
            }
            // InternalXMachine.g:626:3: ( rule__XRecord__Group__0 )
            // InternalXMachine.g:626:4: rule__XRecord__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXRecord"


    // $ANTLR start "entryRuleField"
    // InternalXMachine.g:635:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalXMachine.g:636:1: ( ruleField EOF )
            // InternalXMachine.g:637:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalXMachine.g:644:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:648:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalXMachine.g:649:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalXMachine.g:649:2: ( ( rule__Field__Group__0 ) )
            // InternalXMachine.g:650:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalXMachine.g:651:3: ( rule__Field__Group__0 )
            // InternalXMachine.g:651:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleXConstraint"
    // InternalXMachine.g:660:1: entryRuleXConstraint : ruleXConstraint EOF ;
    public final void entryRuleXConstraint() throws RecognitionException {
        try {
            // InternalXMachine.g:661:1: ( ruleXConstraint EOF )
            // InternalXMachine.g:662:1: ruleXConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConstraintRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXConstraint"


    // $ANTLR start "ruleXConstraint"
    // InternalXMachine.g:669:1: ruleXConstraint : ( ( rule__XConstraint__Group__0 ) ) ;
    public final void ruleXConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:673:2: ( ( ( rule__XConstraint__Group__0 ) ) )
            // InternalXMachine.g:674:2: ( ( rule__XConstraint__Group__0 ) )
            {
            // InternalXMachine.g:674:2: ( ( rule__XConstraint__Group__0 ) )
            // InternalXMachine.g:675:3: ( rule__XConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getGroup()); 
            }
            // InternalXMachine.g:676:3: ( rule__XConstraint__Group__0 )
            // InternalXMachine.g:676:4: rule__XConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXConstraint"


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:685:1: ruleXConvergence : ( ( rule__XConvergence__Alternatives ) ) ;
    public final void ruleXConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:689:1: ( ( ( rule__XConvergence__Alternatives ) ) )
            // InternalXMachine.g:690:2: ( ( rule__XConvergence__Alternatives ) )
            {
            // InternalXMachine.g:690:2: ( ( rule__XConvergence__Alternatives ) )
            // InternalXMachine.g:691:3: ( rule__XConvergence__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            }
            // InternalXMachine.g:692:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:692:4: rule__XConvergence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XConvergence__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXConvergence"


    // $ANTLR start "ruleMultiplicity"
    // InternalXMachine.g:701:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:705:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalXMachine.g:706:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalXMachine.g:706:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalXMachine.g:707:3: ( rule__Multiplicity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            }
            // InternalXMachine.g:708:3: ( rule__Multiplicity__Alternatives )
            // InternalXMachine.g:708:4: rule__Multiplicity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "rule__Machine__Alternatives_6"
    // InternalXMachine.g:716:1: rule__Machine__Alternatives_6 : ( ( ( rule__Machine__Group_6_0__0 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_1 ) ) | ( ( rule__Machine__Group_6_2__0 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_3 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_4 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_5 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_6 ) ) );
    public final void rule__Machine__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:720:1: ( ( ( rule__Machine__Group_6_0__0 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_1 ) ) | ( ( rule__Machine__Group_6_2__0 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_3 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_4 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_5 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_6 ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 16:
                case 17:
                    {
                    alt2=2;
                    }
                    break;
                case 180:
                case 181:
                case 182:
                case 196:
                    {
                    alt2=7;
                    }
                    break;
                case 195:
                    {
                    alt2=6;
                    }
                    break;
                case 170:
                case 171:
                case 172:
                case 173:
                case 174:
                case 175:
                    {
                    alt2=5;
                    }
                    break;
                case 46:
                case 203:
                    {
                    alt2=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case 16:
            case 17:
                {
                alt2=2;
                }
                break;
            case 14:
            case 15:
                {
                alt2=3;
                }
                break;
            case 46:
            case 203:
                {
                alt2=4;
                }
                break;
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
                {
                alt2=5;
                }
                break;
            case 195:
                {
                alt2=6;
                }
                break;
            case 180:
            case 181:
            case 182:
            case 196:
                {
                alt2=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:721:2: ( ( rule__Machine__Group_6_0__0 ) )
                    {
                    // InternalXMachine.g:721:2: ( ( rule__Machine__Group_6_0__0 ) )
                    // InternalXMachine.g:722:3: ( rule__Machine__Group_6_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_6_0()); 
                    }
                    // InternalXMachine.g:723:3: ( rule__Machine__Group_6_0__0 )
                    // InternalXMachine.g:723:4: rule__Machine__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_6_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getGroup_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:727:2: ( ( rule__Machine__OrderedChildrenAssignment_6_1 ) )
                    {
                    // InternalXMachine.g:727:2: ( ( rule__Machine__OrderedChildrenAssignment_6_1 ) )
                    // InternalXMachine.g:728:3: ( rule__Machine__OrderedChildrenAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_1()); 
                    }
                    // InternalXMachine.g:729:3: ( rule__Machine__OrderedChildrenAssignment_6_1 )
                    // InternalXMachine.g:729:4: rule__Machine__OrderedChildrenAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__OrderedChildrenAssignment_6_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:733:2: ( ( rule__Machine__Group_6_2__0 ) )
                    {
                    // InternalXMachine.g:733:2: ( ( rule__Machine__Group_6_2__0 ) )
                    // InternalXMachine.g:734:3: ( rule__Machine__Group_6_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_6_2()); 
                    }
                    // InternalXMachine.g:735:3: ( rule__Machine__Group_6_2__0 )
                    // InternalXMachine.g:735:4: rule__Machine__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_6_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getGroup_6_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:739:2: ( ( rule__Machine__OrderedChildrenAssignment_6_3 ) )
                    {
                    // InternalXMachine.g:739:2: ( ( rule__Machine__OrderedChildrenAssignment_6_3 ) )
                    // InternalXMachine.g:740:3: ( rule__Machine__OrderedChildrenAssignment_6_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_3()); 
                    }
                    // InternalXMachine.g:741:3: ( rule__Machine__OrderedChildrenAssignment_6_3 )
                    // InternalXMachine.g:741:4: rule__Machine__OrderedChildrenAssignment_6_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__OrderedChildrenAssignment_6_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:745:2: ( ( rule__Machine__OrderedChildrenAssignment_6_4 ) )
                    {
                    // InternalXMachine.g:745:2: ( ( rule__Machine__OrderedChildrenAssignment_6_4 ) )
                    // InternalXMachine.g:746:3: ( rule__Machine__OrderedChildrenAssignment_6_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_4()); 
                    }
                    // InternalXMachine.g:747:3: ( rule__Machine__OrderedChildrenAssignment_6_4 )
                    // InternalXMachine.g:747:4: rule__Machine__OrderedChildrenAssignment_6_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__OrderedChildrenAssignment_6_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:751:2: ( ( rule__Machine__OrderedChildrenAssignment_6_5 ) )
                    {
                    // InternalXMachine.g:751:2: ( ( rule__Machine__OrderedChildrenAssignment_6_5 ) )
                    // InternalXMachine.g:752:3: ( rule__Machine__OrderedChildrenAssignment_6_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_5()); 
                    }
                    // InternalXMachine.g:753:3: ( rule__Machine__OrderedChildrenAssignment_6_5 )
                    // InternalXMachine.g:753:4: rule__Machine__OrderedChildrenAssignment_6_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__OrderedChildrenAssignment_6_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:757:2: ( ( rule__Machine__OrderedChildrenAssignment_6_6 ) )
                    {
                    // InternalXMachine.g:757:2: ( ( rule__Machine__OrderedChildrenAssignment_6_6 ) )
                    // InternalXMachine.g:758:3: ( rule__Machine__OrderedChildrenAssignment_6_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_6()); 
                    }
                    // InternalXMachine.g:759:3: ( rule__Machine__OrderedChildrenAssignment_6_6 )
                    // InternalXMachine.g:759:4: rule__Machine__OrderedChildrenAssignment_6_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__OrderedChildrenAssignment_6_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Alternatives_6"


    // $ANTLR start "rule__Machine__Alternatives_6_0_0"
    // InternalXMachine.g:767:1: rule__Machine__Alternatives_6_0_0 : ( ( 'variables' ) | ( 'vars' ) );
    public final void rule__Machine__Alternatives_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:771:1: ( ( 'variables' ) | ( 'vars' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:772:2: ( 'variables' )
                    {
                    // InternalXMachine.g:772:2: ( 'variables' )
                    // InternalXMachine.g:773:3: 'variables'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getVariablesKeyword_6_0_0_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getVariablesKeyword_6_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:778:2: ( 'vars' )
                    {
                    // InternalXMachine.g:778:2: ( 'vars' )
                    // InternalXMachine.g:779:3: 'vars'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getVarsKeyword_6_0_0_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getVarsKeyword_6_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Alternatives_6_0_0"


    // $ANTLR start "rule__Machine__Alternatives_6_2_0"
    // InternalXMachine.g:788:1: rule__Machine__Alternatives_6_2_0 : ( ( 'invariants' ) | ( 'invs' ) );
    public final void rule__Machine__Alternatives_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:792:1: ( ( 'invariants' ) | ( 'invs' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:793:2: ( 'invariants' )
                    {
                    // InternalXMachine.g:793:2: ( 'invariants' )
                    // InternalXMachine.g:794:3: 'invariants'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getInvariantsKeyword_6_2_0_0()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getInvariantsKeyword_6_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:799:2: ( 'invs' )
                    {
                    // InternalXMachine.g:799:2: ( 'invs' )
                    // InternalXMachine.g:800:3: 'invs'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getInvsKeyword_6_2_0_1()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getInvsKeyword_6_2_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Alternatives_6_2_0"


    // $ANTLR start "rule__XIndividualVariable__Alternatives_2"
    // InternalXMachine.g:809:1: rule__XIndividualVariable__Alternatives_2 : ( ( 'variable' ) | ( 'var' ) );
    public final void rule__XIndividualVariable__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:813:1: ( ( 'variable' ) | ( 'var' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:814:2: ( 'variable' )
                    {
                    // InternalXMachine.g:814:2: ( 'variable' )
                    // InternalXMachine.g:815:3: 'variable'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXIndividualVariableAccess().getVariableKeyword_2_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXIndividualVariableAccess().getVariableKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:820:2: ( 'var' )
                    {
                    // InternalXMachine.g:820:2: ( 'var' )
                    // InternalXMachine.g:821:3: 'var'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXIndividualVariableAccess().getVarKeyword_2_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXIndividualVariableAccess().getVarKeyword_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Alternatives_2"


    // $ANTLR start "rule__XTYPEOPERATOR__Alternatives"
    // InternalXMachine.g:830:1: rule__XTYPEOPERATOR__Alternatives : ( ( '\\u2194' ) | ( '<->' ) | ( '\\uE100' ) | ( '<<->' ) | ( '\\uE101' ) | ( '<->>' ) | ( '\\uE102' ) | ( '<<->>' ) | ( '\\u21F8' ) | ( '+->' ) | ( '\\u2192' ) | ( '-->' ) | ( '\\u2914' ) | ( '>+>' ) | ( '\\u21A3' ) | ( '>->' ) | ( '\\u2900' ) | ( '+>>' ) | ( '\\u21A0' ) | ( '->>' ) | ( '\\u2916' ) | ( '>->>' ) | ( '\\u00D7' ) | ( '**' ) );
    public final void rule__XTYPEOPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:834:1: ( ( '\\u2194' ) | ( '<->' ) | ( '\\uE100' ) | ( '<<->' ) | ( '\\uE101' ) | ( '<->>' ) | ( '\\uE102' ) | ( '<<->>' ) | ( '\\u21F8' ) | ( '+->' ) | ( '\\u2192' ) | ( '-->' ) | ( '\\u2914' ) | ( '>+>' ) | ( '\\u21A3' ) | ( '>->' ) | ( '\\u2900' ) | ( '+>>' ) | ( '\\u21A0' ) | ( '->>' ) | ( '\\u2916' ) | ( '>->>' ) | ( '\\u00D7' ) | ( '**' ) )
            int alt6=24;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            case 23:
                {
                alt6=6;
                }
                break;
            case 24:
                {
                alt6=7;
                }
                break;
            case 25:
                {
                alt6=8;
                }
                break;
            case 26:
                {
                alt6=9;
                }
                break;
            case 27:
                {
                alt6=10;
                }
                break;
            case 28:
                {
                alt6=11;
                }
                break;
            case 29:
                {
                alt6=12;
                }
                break;
            case 30:
                {
                alt6=13;
                }
                break;
            case 31:
                {
                alt6=14;
                }
                break;
            case 32:
                {
                alt6=15;
                }
                break;
            case 33:
                {
                alt6=16;
                }
                break;
            case 34:
                {
                alt6=17;
                }
                break;
            case 35:
                {
                alt6=18;
                }
                break;
            case 36:
                {
                alt6=19;
                }
                break;
            case 37:
                {
                alt6=20;
                }
                break;
            case 38:
                {
                alt6=21;
                }
                break;
            case 39:
                {
                alt6=22;
                }
                break;
            case 40:
                {
                alt6=23;
                }
                break;
            case 41:
                {
                alt6=24;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:835:2: ( '\\u2194' )
                    {
                    // InternalXMachine.g:835:2: ( '\\u2194' )
                    // InternalXMachine.g:836:3: '\\u2194'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:841:2: ( '<->' )
                    {
                    // InternalXMachine.g:841:2: ( '<->' )
                    // InternalXMachine.g:842:3: '<->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:847:2: ( '\\uE100' )
                    {
                    // InternalXMachine.g:847:2: ( '\\uE100' )
                    // InternalXMachine.g:848:3: '\\uE100'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_2()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:853:2: ( '<<->' )
                    {
                    // InternalXMachine.g:853:2: ( '<<->' )
                    // InternalXMachine.g:854:3: '<<->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:859:2: ( '\\uE101' )
                    {
                    // InternalXMachine.g:859:2: ( '\\uE101' )
                    // InternalXMachine.g:860:3: '\\uE101'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_4()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:865:2: ( '<->>' )
                    {
                    // InternalXMachine.g:865:2: ( '<->>' )
                    // InternalXMachine.g:866:3: '<->>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_5()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:871:2: ( '\\uE102' )
                    {
                    // InternalXMachine.g:871:2: ( '\\uE102' )
                    // InternalXMachine.g:872:3: '\\uE102'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_6()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:877:2: ( '<<->>' )
                    {
                    // InternalXMachine.g:877:2: ( '<<->>' )
                    // InternalXMachine.g:878:3: '<<->>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_7()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:883:2: ( '\\u21F8' )
                    {
                    // InternalXMachine.g:883:2: ( '\\u21F8' )
                    // InternalXMachine.g:884:3: '\\u21F8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_8()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:889:2: ( '+->' )
                    {
                    // InternalXMachine.g:889:2: ( '+->' )
                    // InternalXMachine.g:890:3: '+->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPlusSignHyphenMinusGreaterThanSignKeyword_9()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPlusSignHyphenMinusGreaterThanSignKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:895:2: ( '\\u2192' )
                    {
                    // InternalXMachine.g:895:2: ( '\\u2192' )
                    // InternalXMachine.g:896:3: '\\u2192'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_10()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:901:2: ( '-->' )
                    {
                    // InternalXMachine.g:901:2: ( '-->' )
                    // InternalXMachine.g:902:3: '-->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_11()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:907:2: ( '\\u2914' )
                    {
                    // InternalXMachine.g:907:2: ( '\\u2914' )
                    // InternalXMachine.g:908:3: '\\u2914'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_12()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:913:2: ( '>+>' )
                    {
                    // InternalXMachine.g:913:2: ( '>+>' )
                    // InternalXMachine.g:914:3: '>+>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getGreaterThanSignPlusSignGreaterThanSignKeyword_13()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getGreaterThanSignPlusSignGreaterThanSignKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:919:2: ( '\\u21A3' )
                    {
                    // InternalXMachine.g:919:2: ( '\\u21A3' )
                    // InternalXMachine.g:920:3: '\\u21A3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_14()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:925:2: ( '>->' )
                    {
                    // InternalXMachine.g:925:2: ( '>->' )
                    // InternalXMachine.g:926:3: '>->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getGreaterThanSignHyphenMinusGreaterThanSignKeyword_15()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getGreaterThanSignHyphenMinusGreaterThanSignKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:931:2: ( '\\u2900' )
                    {
                    // InternalXMachine.g:931:2: ( '\\u2900' )
                    // InternalXMachine.g:932:3: '\\u2900'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_16()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:937:2: ( '+>>' )
                    {
                    // InternalXMachine.g:937:2: ( '+>>' )
                    // InternalXMachine.g:938:3: '+>>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPlusSignGreaterThanSignGreaterThanSignKeyword_17()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPlusSignGreaterThanSignGreaterThanSignKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:943:2: ( '\\u21A0' )
                    {
                    // InternalXMachine.g:943:2: ( '\\u21A0' )
                    // InternalXMachine.g:944:3: '\\u21A0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_18()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:949:2: ( '->>' )
                    {
                    // InternalXMachine.g:949:2: ( '->>' )
                    // InternalXMachine.g:950:3: '->>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_19()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:955:2: ( '\\u2916' )
                    {
                    // InternalXMachine.g:955:2: ( '\\u2916' )
                    // InternalXMachine.g:956:3: '\\u2916'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_20()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:961:2: ( '>->>' )
                    {
                    // InternalXMachine.g:961:2: ( '>->>' )
                    // InternalXMachine.g:962:3: '>->>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getGreaterThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_21()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getGreaterThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:967:2: ( '\\u00D7' )
                    {
                    // InternalXMachine.g:967:2: ( '\\u00D7' )
                    // InternalXMachine.g:968:3: '\\u00D7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_22()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:973:2: ( '**' )
                    {
                    // InternalXMachine.g:973:2: ( '**' )
                    // InternalXMachine.g:974:3: '**'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getAsteriskAsteriskKeyword_23()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getAsteriskAsteriskKeyword_23()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTYPEOPERATOR__Alternatives"


    // $ANTLR start "rule__XTypePrimitive__Alternatives"
    // InternalXMachine.g:983:1: rule__XTypePrimitive__Alternatives : ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) );
    public final void rule__XTypePrimitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:987:1: ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 42:
                {
                alt7=2;
                }
                break;
            case 43:
                {
                alt7=3;
                }
                break;
            case 44:
                {
                alt7=4;
                }
                break;
            case 45:
                {
                alt7=5;
                }
                break;
            case 75:
                {
                alt7=6;
                }
                break;
            case 72:
                {
                alt7=7;
                }
                break;
            case 70:
                {
                alt7=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:988:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:988:2: ( RULE_ID )
                    // InternalXMachine.g:989:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:994:2: ( 'BOOL' )
                    {
                    // InternalXMachine.g:994:2: ( 'BOOL' )
                    // InternalXMachine.g:995:3: 'BOOL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1000:2: ( '\\u21151' )
                    {
                    // InternalXMachine.g:1000:2: ( '\\u21151' )
                    // InternalXMachine.g:1001:3: '\\u21151'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1006:2: ( '\\u2115' )
                    {
                    // InternalXMachine.g:1006:2: ( '\\u2115' )
                    // InternalXMachine.g:1007:3: '\\u2115'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 
                    }
                    match(input,44,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1012:2: ( '\\u2124' )
                    {
                    // InternalXMachine.g:1012:2: ( '\\u2124' )
                    // InternalXMachine.g:1013:3: '\\u2124'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 
                    }
                    match(input,45,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1018:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    {
                    // InternalXMachine.g:1018:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    // InternalXMachine.g:1019:3: ( rule__XTypePrimitive__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getGroup_5()); 
                    }
                    // InternalXMachine.g:1020:3: ( rule__XTypePrimitive__Group_5__0 )
                    // InternalXMachine.g:1020:4: rule__XTypePrimitive__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XTypePrimitive__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1024:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    {
                    // InternalXMachine.g:1024:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    // InternalXMachine.g:1025:3: ( rule__XTypePrimitive__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getGroup_6()); 
                    }
                    // InternalXMachine.g:1026:3: ( rule__XTypePrimitive__Group_6__0 )
                    // InternalXMachine.g:1026:4: rule__XTypePrimitive__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XTypePrimitive__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1030:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    {
                    // InternalXMachine.g:1030:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    // InternalXMachine.g:1031:3: ( rule__XTypePrimitive__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getGroup_7()); 
                    }
                    // InternalXMachine.g:1032:3: ( rule__XTypePrimitive__Group_7__0 )
                    // InternalXMachine.g:1032:4: rule__XTypePrimitive__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XTypePrimitive__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Alternatives"


    // $ANTLR start "rule__XIndividualInvariant__Alternatives_2"
    // InternalXMachine.g:1040:1: rule__XIndividualInvariant__Alternatives_2 : ( ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) ) | ( 'invariant' ) );
    public final void rule__XIndividualInvariant__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1044:1: ( ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) ) | ( 'invariant' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==203) ) {
                alt8=1;
            }
            else if ( (LA8_0==46) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:1045:2: ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) )
                    {
                    // InternalXMachine.g:1045:2: ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) )
                    // InternalXMachine.g:1046:3: ( rule__XIndividualInvariant__TheoremAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXIndividualInvariantAccess().getTheoremAssignment_2_0()); 
                    }
                    // InternalXMachine.g:1047:3: ( rule__XIndividualInvariant__TheoremAssignment_2_0 )
                    // InternalXMachine.g:1047:4: rule__XIndividualInvariant__TheoremAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XIndividualInvariant__TheoremAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXIndividualInvariantAccess().getTheoremAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1051:2: ( 'invariant' )
                    {
                    // InternalXMachine.g:1051:2: ( 'invariant' )
                    // InternalXMachine.g:1052:3: 'invariant'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXIndividualInvariantAccess().getInvariantKeyword_2_1()); 
                    }
                    match(input,46,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXIndividualInvariantAccess().getInvariantKeyword_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Alternatives_2"


    // $ANTLR start "rule__XEvent__Alternatives_5"
    // InternalXMachine.g:1061:1: rule__XEvent__Alternatives_5 : ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) );
    public final void rule__XEvent__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1065:1: ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==188) ) {
                alt9=1;
            }
            else if ( (LA9_0==204) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:1066:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    {
                    // InternalXMachine.g:1066:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    // InternalXMachine.g:1067:3: ( rule__XEvent__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_5_0()); 
                    }
                    // InternalXMachine.g:1068:3: ( rule__XEvent__Group_5_0__0 )
                    // InternalXMachine.g:1068:4: rule__XEvent__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getGroup_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1072:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    {
                    // InternalXMachine.g:1072:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    // InternalXMachine.g:1073:3: ( rule__XEvent__Group_5_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_5_1()); 
                    }
                    // InternalXMachine.g:1074:3: ( rule__XEvent__Group_5_1__0 )
                    // InternalXMachine.g:1074:4: rule__XEvent__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getGroup_5_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Alternatives_5"


    // $ANTLR start "rule__XEvent__Alternatives_8_0"
    // InternalXMachine.g:1082:1: rule__XEvent__Alternatives_8_0 : ( ( 'where' ) | ( 'when' ) );
    public final void rule__XEvent__Alternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1086:1: ( ( 'where' ) | ( 'when' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==47) ) {
                alt10=1;
            }
            else if ( (LA10_0==48) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:1087:2: ( 'where' )
                    {
                    // InternalXMachine.g:1087:2: ( 'where' )
                    // InternalXMachine.g:1088:3: 'where'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getWhereKeyword_8_0_0()); 
                    }
                    match(input,47,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getWhereKeyword_8_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1093:2: ( 'when' )
                    {
                    // InternalXMachine.g:1093:2: ( 'when' )
                    // InternalXMachine.g:1094:3: 'when'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getWhenKeyword_8_0_1()); 
                    }
                    match(input,48,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getWhenKeyword_8_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Alternatives_8_0"


    // $ANTLR start "rule__XEvent__Alternatives_9_0"
    // InternalXMachine.g:1103:1: rule__XEvent__Alternatives_9_0 : ( ( 'then' ) | ( 'begin' ) );
    public final void rule__XEvent__Alternatives_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1107:1: ( ( 'then' ) | ( 'begin' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==49) ) {
                alt11=1;
            }
            else if ( (LA11_0==50) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:1108:2: ( 'then' )
                    {
                    // InternalXMachine.g:1108:2: ( 'then' )
                    // InternalXMachine.g:1109:3: 'then'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getThenKeyword_9_0_0()); 
                    }
                    match(input,49,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getThenKeyword_9_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1114:2: ( 'begin' )
                    {
                    // InternalXMachine.g:1114:2: ( 'begin' )
                    // InternalXMachine.g:1115:3: 'begin'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getBeginKeyword_9_0_1()); 
                    }
                    match(input,50,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getBeginKeyword_9_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Alternatives_9_0"


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalXMachine.g:1124:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_INT ) | ( RULE_ID ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1128:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_INT ) | ( RULE_ID ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
            case 44:
            case 45:
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
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt12=1;
                }
                break;
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
                {
                alt12=2;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
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
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
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
            case 200:
                {
                alt12=3;
                }
                break;
            case RULE_INT:
                {
                alt12=4;
                }
                break;
            case RULE_ID:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalXMachine.g:1129:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXMachine.g:1129:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXMachine.g:1130:3: ruleEVENTB_IDENTIFIER_KEYWORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_IDENTIFIER_KEYWORD();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1135:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXMachine.g:1135:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXMachine.g:1136:3: ruleEVENTB_PREDICATE_SYMBOLS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_PREDICATE_SYMBOLS();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1141:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXMachine.g:1141:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXMachine.g:1142:3: ruleEVENTB_EXPRESSION_SYMBOLS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_EXPRESSION_SYMBOLS();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1147:2: ( RULE_INT )
                    {
                    // InternalXMachine.g:1147:2: ( RULE_INT )
                    // InternalXMachine.g:1148:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_3()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1153:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:1153:2: ( RULE_ID )
                    // InternalXMachine.g:1154:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_4()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormula__Alternatives"


    // $ANTLR start "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives"
    // InternalXMachine.g:1163:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( 'NAT1' ) | ( '\\u2115' ) | ( 'NAT' ) | ( '\\u21191' ) | ( 'POW1' ) | ( '\\u2119' ) | ( 'POW' ) | ( '\\u2124' ) | ( 'INT' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1167:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( 'NAT1' ) | ( '\\u2115' ) | ( 'NAT' ) | ( '\\u21191' ) | ( 'POW1' ) | ( '\\u2119' ) | ( 'POW' ) | ( '\\u2124' ) | ( 'INT' ) )
            int alt13=28;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 51:
                {
                alt13=2;
                }
                break;
            case 52:
                {
                alt13=3;
                }
                break;
            case 53:
                {
                alt13=4;
                }
                break;
            case 54:
                {
                alt13=5;
                }
                break;
            case 55:
                {
                alt13=6;
                }
                break;
            case 56:
                {
                alt13=7;
                }
                break;
            case 57:
                {
                alt13=8;
                }
                break;
            case 58:
                {
                alt13=9;
                }
                break;
            case 59:
                {
                alt13=10;
                }
                break;
            case 60:
                {
                alt13=11;
                }
                break;
            case 61:
                {
                alt13=12;
                }
                break;
            case 62:
                {
                alt13=13;
                }
                break;
            case 63:
                {
                alt13=14;
                }
                break;
            case 64:
                {
                alt13=15;
                }
                break;
            case 65:
                {
                alt13=16;
                }
                break;
            case 66:
                {
                alt13=17;
                }
                break;
            case 67:
                {
                alt13=18;
                }
                break;
            case 43:
                {
                alt13=19;
                }
                break;
            case 68:
                {
                alt13=20;
                }
                break;
            case 44:
                {
                alt13=21;
                }
                break;
            case 69:
                {
                alt13=22;
                }
                break;
            case 70:
                {
                alt13=23;
                }
                break;
            case 71:
                {
                alt13=24;
                }
                break;
            case 72:
                {
                alt13=25;
                }
                break;
            case 73:
                {
                alt13=26;
                }
                break;
            case 45:
                {
                alt13=27;
                }
                break;
            case 74:
                {
                alt13=28;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:1168:2: ( 'BOOL' )
                    {
                    // InternalXMachine.g:1168:2: ( 'BOOL' )
                    // InternalXMachine.g:1169:3: 'BOOL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1174:2: ( 'FALSE' )
                    {
                    // InternalXMachine.g:1174:2: ( 'FALSE' )
                    // InternalXMachine.g:1175:3: 'FALSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    }
                    match(input,51,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1180:2: ( 'TRUE' )
                    {
                    // InternalXMachine.g:1180:2: ( 'TRUE' )
                    // InternalXMachine.g:1181:3: 'TRUE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    }
                    match(input,52,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1186:2: ( 'bool' )
                    {
                    // InternalXMachine.g:1186:2: ( 'bool' )
                    // InternalXMachine.g:1187:3: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    }
                    match(input,53,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1192:2: ( 'card' )
                    {
                    // InternalXMachine.g:1192:2: ( 'card' )
                    // InternalXMachine.g:1193:3: 'card'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    }
                    match(input,54,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1198:2: ( 'dom' )
                    {
                    // InternalXMachine.g:1198:2: ( 'dom' )
                    // InternalXMachine.g:1199:3: 'dom'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    }
                    match(input,55,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1204:2: ( 'finite' )
                    {
                    // InternalXMachine.g:1204:2: ( 'finite' )
                    // InternalXMachine.g:1205:3: 'finite'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    }
                    match(input,56,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1210:2: ( 'id' )
                    {
                    // InternalXMachine.g:1210:2: ( 'id' )
                    // InternalXMachine.g:1211:3: 'id'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    }
                    match(input,57,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1216:2: ( 'inter' )
                    {
                    // InternalXMachine.g:1216:2: ( 'inter' )
                    // InternalXMachine.g:1217:3: 'inter'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    }
                    match(input,58,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1222:2: ( 'max' )
                    {
                    // InternalXMachine.g:1222:2: ( 'max' )
                    // InternalXMachine.g:1223:3: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    }
                    match(input,59,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1228:2: ( 'min' )
                    {
                    // InternalXMachine.g:1228:2: ( 'min' )
                    // InternalXMachine.g:1229:3: 'min'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    }
                    match(input,60,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1234:2: ( 'mod' )
                    {
                    // InternalXMachine.g:1234:2: ( 'mod' )
                    // InternalXMachine.g:1235:3: 'mod'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    }
                    match(input,61,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1240:2: ( 'pred' )
                    {
                    // InternalXMachine.g:1240:2: ( 'pred' )
                    // InternalXMachine.g:1241:3: 'pred'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    }
                    match(input,62,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1246:2: ( 'prj1' )
                    {
                    // InternalXMachine.g:1246:2: ( 'prj1' )
                    // InternalXMachine.g:1247:3: 'prj1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    }
                    match(input,63,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1252:2: ( 'prj2' )
                    {
                    // InternalXMachine.g:1252:2: ( 'prj2' )
                    // InternalXMachine.g:1253:3: 'prj2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    }
                    match(input,64,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1258:2: ( 'ran' )
                    {
                    // InternalXMachine.g:1258:2: ( 'ran' )
                    // InternalXMachine.g:1259:3: 'ran'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    }
                    match(input,65,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1264:2: ( 'succ' )
                    {
                    // InternalXMachine.g:1264:2: ( 'succ' )
                    // InternalXMachine.g:1265:3: 'succ'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    }
                    match(input,66,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1270:2: ( 'union' )
                    {
                    // InternalXMachine.g:1270:2: ( 'union' )
                    // InternalXMachine.g:1271:3: 'union'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    }
                    match(input,67,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1276:2: ( '\\u21151' )
                    {
                    // InternalXMachine.g:1276:2: ( '\\u21151' )
                    // InternalXMachine.g:1277:3: '\\u21151'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1282:2: ( 'NAT1' )
                    {
                    // InternalXMachine.g:1282:2: ( 'NAT1' )
                    // InternalXMachine.g:1283:3: 'NAT1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getNAT1Keyword_19()); 
                    }
                    match(input,68,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getNAT1Keyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1288:2: ( '\\u2115' )
                    {
                    // InternalXMachine.g:1288:2: ( '\\u2115' )
                    // InternalXMachine.g:1289:3: '\\u2115'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_20()); 
                    }
                    match(input,44,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1294:2: ( 'NAT' )
                    {
                    // InternalXMachine.g:1294:2: ( 'NAT' )
                    // InternalXMachine.g:1295:3: 'NAT'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getNATKeyword_21()); 
                    }
                    match(input,69,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getNATKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1300:2: ( '\\u21191' )
                    {
                    // InternalXMachine.g:1300:2: ( '\\u21191' )
                    // InternalXMachine.g:1301:3: '\\u21191'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_22()); 
                    }
                    match(input,70,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1306:2: ( 'POW1' )
                    {
                    // InternalXMachine.g:1306:2: ( 'POW1' )
                    // InternalXMachine.g:1307:3: 'POW1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPOW1Keyword_23()); 
                    }
                    match(input,71,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPOW1Keyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1312:2: ( '\\u2119' )
                    {
                    // InternalXMachine.g:1312:2: ( '\\u2119' )
                    // InternalXMachine.g:1313:3: '\\u2119'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_24()); 
                    }
                    match(input,72,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1318:2: ( 'POW' )
                    {
                    // InternalXMachine.g:1318:2: ( 'POW' )
                    // InternalXMachine.g:1319:3: 'POW'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPOWKeyword_25()); 
                    }
                    match(input,73,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPOWKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1324:2: ( '\\u2124' )
                    {
                    // InternalXMachine.g:1324:2: ( '\\u2124' )
                    // InternalXMachine.g:1325:3: '\\u2124'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_26()); 
                    }
                    match(input,45,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1330:2: ( 'INT' )
                    {
                    // InternalXMachine.g:1330:2: ( 'INT' )
                    // InternalXMachine.g:1331:3: 'INT'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getINTKeyword_27()); 
                    }
                    match(input,74,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getINTKeyword_27()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives"


    // $ANTLR start "rule__EVENTB_PREDICATE_SYMBOLS__Alternatives"
    // InternalXMachine.g:1340:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '<=>' ) | ( '\\u21D2' ) | ( '=>' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( 'or' ) | ( '\\u00AC' ) | ( 'not' ) | ( '\\u22A4' ) | ( 'true' ) | ( '\\u22A5' ) | ( 'false' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '/=' ) | ( '\\u2264' ) | ( '=<' ) | ( '<' ) | ( '\\u2265' ) | ( '>=' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '/:' ) | ( '\\u2282' ) | ( '<<:' ) | ( '\\u2284' ) | ( '/<<:' ) | ( '\\u2286' ) | ( '<:' ) | ( '\\u2288' ) | ( '/<:' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1344:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '<=>' ) | ( '\\u21D2' ) | ( '=>' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( 'or' ) | ( '\\u00AC' ) | ( 'not' ) | ( '\\u22A4' ) | ( 'true' ) | ( '\\u22A5' ) | ( 'false' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '/=' ) | ( '\\u2264' ) | ( '=<' ) | ( '<' ) | ( '\\u2265' ) | ( '>=' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '/:' ) | ( '\\u2282' ) | ( '<<:' ) | ( '\\u2284' ) | ( '/<<:' ) | ( '\\u2286' ) | ( '<:' ) | ( '\\u2288' ) | ( '/<:' ) | ( 'partition' ) )
            int alt14=45;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt14=1;
                }
                break;
            case 76:
                {
                alt14=2;
                }
                break;
            case 77:
                {
                alt14=3;
                }
                break;
            case 78:
                {
                alt14=4;
                }
                break;
            case 79:
                {
                alt14=5;
                }
                break;
            case 80:
                {
                alt14=6;
                }
                break;
            case 81:
                {
                alt14=7;
                }
                break;
            case 82:
                {
                alt14=8;
                }
                break;
            case 83:
                {
                alt14=9;
                }
                break;
            case 84:
                {
                alt14=10;
                }
                break;
            case 85:
                {
                alt14=11;
                }
                break;
            case 86:
                {
                alt14=12;
                }
                break;
            case 87:
                {
                alt14=13;
                }
                break;
            case 88:
                {
                alt14=14;
                }
                break;
            case 89:
                {
                alt14=15;
                }
                break;
            case 90:
                {
                alt14=16;
                }
                break;
            case 91:
                {
                alt14=17;
                }
                break;
            case 92:
                {
                alt14=18;
                }
                break;
            case 93:
                {
                alt14=19;
                }
                break;
            case 94:
                {
                alt14=20;
                }
                break;
            case 95:
                {
                alt14=21;
                }
                break;
            case 96:
                {
                alt14=22;
                }
                break;
            case 97:
                {
                alt14=23;
                }
                break;
            case 98:
                {
                alt14=24;
                }
                break;
            case 99:
                {
                alt14=25;
                }
                break;
            case 100:
                {
                alt14=26;
                }
                break;
            case 101:
                {
                alt14=27;
                }
                break;
            case 102:
                {
                alt14=28;
                }
                break;
            case 103:
                {
                alt14=29;
                }
                break;
            case 104:
                {
                alt14=30;
                }
                break;
            case 105:
                {
                alt14=31;
                }
                break;
            case 106:
                {
                alt14=32;
                }
                break;
            case 107:
                {
                alt14=33;
                }
                break;
            case 108:
                {
                alt14=34;
                }
                break;
            case 109:
                {
                alt14=35;
                }
                break;
            case 110:
                {
                alt14=36;
                }
                break;
            case 111:
                {
                alt14=37;
                }
                break;
            case 112:
                {
                alt14=38;
                }
                break;
            case 113:
                {
                alt14=39;
                }
                break;
            case 114:
                {
                alt14=40;
                }
                break;
            case 115:
                {
                alt14=41;
                }
                break;
            case 116:
                {
                alt14=42;
                }
                break;
            case 117:
                {
                alt14=43;
                }
                break;
            case 118:
                {
                alt14=44;
                }
                break;
            case 119:
                {
                alt14=45;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:1345:2: ( '(' )
                    {
                    // InternalXMachine.g:1345:2: ( '(' )
                    // InternalXMachine.g:1346:3: '('
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    }
                    match(input,75,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1351:2: ( ')' )
                    {
                    // InternalXMachine.g:1351:2: ( ')' )
                    // InternalXMachine.g:1352:3: ')'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    }
                    match(input,76,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1357:2: ( '\\u21D4' )
                    {
                    // InternalXMachine.g:1357:2: ( '\\u21D4' )
                    // InternalXMachine.g:1358:3: '\\u21D4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    }
                    match(input,77,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1363:2: ( '<=>' )
                    {
                    // InternalXMachine.g:1363:2: ( '<=>' )
                    // InternalXMachine.g:1364:3: '<=>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_3()); 
                    }
                    match(input,78,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1369:2: ( '\\u21D2' )
                    {
                    // InternalXMachine.g:1369:2: ( '\\u21D2' )
                    // InternalXMachine.g:1370:3: '\\u21D2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_4()); 
                    }
                    match(input,79,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1375:2: ( '=>' )
                    {
                    // InternalXMachine.g:1375:2: ( '=>' )
                    // InternalXMachine.g:1376:3: '=>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignGreaterThanSignKeyword_5()); 
                    }
                    match(input,80,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignGreaterThanSignKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1381:2: ( '\\u2227' )
                    {
                    // InternalXMachine.g:1381:2: ( '\\u2227' )
                    // InternalXMachine.g:1382:3: '\\u2227'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_6()); 
                    }
                    match(input,81,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1387:2: ( '&' )
                    {
                    // InternalXMachine.g:1387:2: ( '&' )
                    // InternalXMachine.g:1388:3: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_7()); 
                    }
                    match(input,82,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1393:2: ( '\\u2228' )
                    {
                    // InternalXMachine.g:1393:2: ( '\\u2228' )
                    // InternalXMachine.g:1394:3: '\\u2228'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_8()); 
                    }
                    match(input,83,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1399:2: ( 'or' )
                    {
                    // InternalXMachine.g:1399:2: ( 'or' )
                    // InternalXMachine.g:1400:3: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getOrKeyword_9()); 
                    }
                    match(input,84,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getOrKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1405:2: ( '\\u00AC' )
                    {
                    // InternalXMachine.g:1405:2: ( '\\u00AC' )
                    // InternalXMachine.g:1406:3: '\\u00AC'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_10()); 
                    }
                    match(input,85,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1411:2: ( 'not' )
                    {
                    // InternalXMachine.g:1411:2: ( 'not' )
                    // InternalXMachine.g:1412:3: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotKeyword_11()); 
                    }
                    match(input,86,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1417:2: ( '\\u22A4' )
                    {
                    // InternalXMachine.g:1417:2: ( '\\u22A4' )
                    // InternalXMachine.g:1418:3: '\\u22A4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_12()); 
                    }
                    match(input,87,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1423:2: ( 'true' )
                    {
                    // InternalXMachine.g:1423:2: ( 'true' )
                    // InternalXMachine.g:1424:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getTrueKeyword_13()); 
                    }
                    match(input,88,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getTrueKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1429:2: ( '\\u22A5' )
                    {
                    // InternalXMachine.g:1429:2: ( '\\u22A5' )
                    // InternalXMachine.g:1430:3: '\\u22A5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_14()); 
                    }
                    match(input,89,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1435:2: ( 'false' )
                    {
                    // InternalXMachine.g:1435:2: ( 'false' )
                    // InternalXMachine.g:1436:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFalseKeyword_15()); 
                    }
                    match(input,90,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFalseKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1441:2: ( '\\u2200' )
                    {
                    // InternalXMachine.g:1441:2: ( '\\u2200' )
                    // InternalXMachine.g:1442:3: '\\u2200'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_16()); 
                    }
                    match(input,91,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1447:2: ( '!' )
                    {
                    // InternalXMachine.g:1447:2: ( '!' )
                    // InternalXMachine.g:1448:3: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_17()); 
                    }
                    match(input,92,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1453:2: ( '\\u2203' )
                    {
                    // InternalXMachine.g:1453:2: ( '\\u2203' )
                    // InternalXMachine.g:1454:3: '\\u2203'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_18()); 
                    }
                    match(input,93,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1459:2: ( '#' )
                    {
                    // InternalXMachine.g:1459:2: ( '#' )
                    // InternalXMachine.g:1460:3: '#'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_19()); 
                    }
                    match(input,94,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1465:2: ( ',' )
                    {
                    // InternalXMachine.g:1465:2: ( ',' )
                    // InternalXMachine.g:1466:3: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_20()); 
                    }
                    match(input,95,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1471:2: ( '\\u00B7' )
                    {
                    // InternalXMachine.g:1471:2: ( '\\u00B7' )
                    // InternalXMachine.g:1472:3: '\\u00B7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_21()); 
                    }
                    match(input,96,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1477:2: ( '.' )
                    {
                    // InternalXMachine.g:1477:2: ( '.' )
                    // InternalXMachine.g:1478:3: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_22()); 
                    }
                    match(input,97,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1483:2: ( '=' )
                    {
                    // InternalXMachine.g:1483:2: ( '=' )
                    // InternalXMachine.g:1484:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_23()); 
                    }
                    match(input,98,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1489:2: ( '\\u2260' )
                    {
                    // InternalXMachine.g:1489:2: ( '\\u2260' )
                    // InternalXMachine.g:1490:3: '\\u2260'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_24()); 
                    }
                    match(input,99,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1495:2: ( '/=' )
                    {
                    // InternalXMachine.g:1495:2: ( '/=' )
                    // InternalXMachine.g:1496:3: '/='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusEqualsSignKeyword_25()); 
                    }
                    match(input,100,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusEqualsSignKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1501:2: ( '\\u2264' )
                    {
                    // InternalXMachine.g:1501:2: ( '\\u2264' )
                    // InternalXMachine.g:1502:3: '\\u2264'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_26()); 
                    }
                    match(input,101,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1507:2: ( '=<' )
                    {
                    // InternalXMachine.g:1507:2: ( '=<' )
                    // InternalXMachine.g:1508:3: '=<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignLessThanSignKeyword_27()); 
                    }
                    match(input,102,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignLessThanSignKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1513:2: ( '<' )
                    {
                    // InternalXMachine.g:1513:2: ( '<' )
                    // InternalXMachine.g:1514:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_28()); 
                    }
                    match(input,103,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1519:2: ( '\\u2265' )
                    {
                    // InternalXMachine.g:1519:2: ( '\\u2265' )
                    // InternalXMachine.g:1520:3: '\\u2265'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_29()); 
                    }
                    match(input,104,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1525:2: ( '>=' )
                    {
                    // InternalXMachine.g:1525:2: ( '>=' )
                    // InternalXMachine.g:1526:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignEqualsSignKeyword_30()); 
                    }
                    match(input,105,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignEqualsSignKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalXMachine.g:1531:2: ( '>' )
                    {
                    // InternalXMachine.g:1531:2: ( '>' )
                    // InternalXMachine.g:1532:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_31()); 
                    }
                    match(input,106,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalXMachine.g:1537:2: ( '\\u2208' )
                    {
                    // InternalXMachine.g:1537:2: ( '\\u2208' )
                    // InternalXMachine.g:1538:3: '\\u2208'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_32()); 
                    }
                    match(input,107,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // InternalXMachine.g:1543:2: ( ':' )
                    {
                    // InternalXMachine.g:1543:2: ( ':' )
                    // InternalXMachine.g:1544:3: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_33()); 
                    }
                    match(input,108,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalXMachine.g:1549:2: ( '\\u2209' )
                    {
                    // InternalXMachine.g:1549:2: ( '\\u2209' )
                    // InternalXMachine.g:1550:3: '\\u2209'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_34()); 
                    }
                    match(input,109,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalXMachine.g:1555:2: ( '/:' )
                    {
                    // InternalXMachine.g:1555:2: ( '/:' )
                    // InternalXMachine.g:1556:3: '/:'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusColonKeyword_35()); 
                    }
                    match(input,110,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusColonKeyword_35()); 
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalXMachine.g:1561:2: ( '\\u2282' )
                    {
                    // InternalXMachine.g:1561:2: ( '\\u2282' )
                    // InternalXMachine.g:1562:3: '\\u2282'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_36()); 
                    }
                    match(input,111,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_36()); 
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalXMachine.g:1567:2: ( '<<:' )
                    {
                    // InternalXMachine.g:1567:2: ( '<<:' )
                    // InternalXMachine.g:1568:3: '<<:'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignLessThanSignColonKeyword_37()); 
                    }
                    match(input,112,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignLessThanSignColonKeyword_37()); 
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalXMachine.g:1573:2: ( '\\u2284' )
                    {
                    // InternalXMachine.g:1573:2: ( '\\u2284' )
                    // InternalXMachine.g:1574:3: '\\u2284'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_38()); 
                    }
                    match(input,113,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_38()); 
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalXMachine.g:1579:2: ( '/<<:' )
                    {
                    // InternalXMachine.g:1579:2: ( '/<<:' )
                    // InternalXMachine.g:1580:3: '/<<:'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusLessThanSignLessThanSignColonKeyword_39()); 
                    }
                    match(input,114,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusLessThanSignLessThanSignColonKeyword_39()); 
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalXMachine.g:1585:2: ( '\\u2286' )
                    {
                    // InternalXMachine.g:1585:2: ( '\\u2286' )
                    // InternalXMachine.g:1586:3: '\\u2286'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_40()); 
                    }
                    match(input,115,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_40()); 
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalXMachine.g:1591:2: ( '<:' )
                    {
                    // InternalXMachine.g:1591:2: ( '<:' )
                    // InternalXMachine.g:1592:3: '<:'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignColonKeyword_41()); 
                    }
                    match(input,116,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignColonKeyword_41()); 
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalXMachine.g:1597:2: ( '\\u2288' )
                    {
                    // InternalXMachine.g:1597:2: ( '\\u2288' )
                    // InternalXMachine.g:1598:3: '\\u2288'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_42()); 
                    }
                    match(input,117,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_42()); 
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalXMachine.g:1603:2: ( '/<:' )
                    {
                    // InternalXMachine.g:1603:2: ( '/<:' )
                    // InternalXMachine.g:1604:3: '/<:'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusLessThanSignColonKeyword_43()); 
                    }
                    match(input,118,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSolidusLessThanSignColonKeyword_43()); 
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalXMachine.g:1609:2: ( 'partition' )
                    {
                    // InternalXMachine.g:1609:2: ( 'partition' )
                    // InternalXMachine.g:1610:3: 'partition'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_44()); 
                    }
                    match(input,119,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_44()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_PREDICATE_SYMBOLS__Alternatives"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives"
    // InternalXMachine.g:1619:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '<->' ) | ( '\\uE100' ) | ( '<<->' ) | ( '\\uE101' ) | ( '<->>' ) | ( '\\uE102' ) | ( '<<->>' ) | ( '\\u21F8' ) | ( '+->' ) | ( '\\u2192' ) | ( '-->' ) | ( '\\u2914' ) | ( '>+>' ) | ( '\\u21A3' ) | ( '>->' ) | ( '\\u2900' ) | ( '+>>' ) | ( '\\u21A0' ) | ( '->>' ) | ( '\\u2916' ) | ( '>->>' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( ',,' ) | ( '|->' ) | ( '\\u2205' ) | ( '{}' ) | ( '\\u2229' ) | ( '/\\\\' ) | ( '\\u222A' ) | ( '\\\\/' ) | ( '\\u2216' ) | ( '\\\\' ) | ( '\\u00D7' ) | ( '**' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '<+' ) | ( '\\u2218' ) | ( 'circ' ) | ( ';' ) | ( '\\u2297' ) | ( '><' ) | ( '\\u2225' ) | ( '||' ) | ( '\\u223C' ) | ( '~' ) | ( '\\u25C1' ) | ( '<|' ) | ( '\\u2A64' ) | ( '<<|' ) | ( '\\u25B7' ) | ( '|>' ) | ( '\\u2A65' ) | ( '|>>' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0 ) ) | ( 'INTER' ) | ( '\\u22C3' ) | ( 'UNION' ) | ( '\\u2223' ) | ( '|' ) | ( '\\u2025' ) | ( '..' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1623:1: ( ( '\\u2194' ) | ( '<->' ) | ( '\\uE100' ) | ( '<<->' ) | ( '\\uE101' ) | ( '<->>' ) | ( '\\uE102' ) | ( '<<->>' ) | ( '\\u21F8' ) | ( '+->' ) | ( '\\u2192' ) | ( '-->' ) | ( '\\u2914' ) | ( '>+>' ) | ( '\\u21A3' ) | ( '>->' ) | ( '\\u2900' ) | ( '+>>' ) | ( '\\u21A0' ) | ( '->>' ) | ( '\\u2916' ) | ( '>->>' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( ',,' ) | ( '|->' ) | ( '\\u2205' ) | ( '{}' ) | ( '\\u2229' ) | ( '/\\\\' ) | ( '\\u222A' ) | ( '\\\\/' ) | ( '\\u2216' ) | ( '\\\\' ) | ( '\\u00D7' ) | ( '**' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '<+' ) | ( '\\u2218' ) | ( 'circ' ) | ( ';' ) | ( '\\u2297' ) | ( '><' ) | ( '\\u2225' ) | ( '||' ) | ( '\\u223C' ) | ( '~' ) | ( '\\u25C1' ) | ( '<|' ) | ( '\\u2A64' ) | ( '<<|' ) | ( '\\u25B7' ) | ( '|>' ) | ( '\\u2A65' ) | ( '|>>' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0 ) ) | ( 'INTER' ) | ( '\\u22C3' ) | ( 'UNION' ) | ( '\\u2223' ) | ( '|' ) | ( '\\u2025' ) | ( '..' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) )
            int alt15=75;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt15=1;
                }
                break;
            case 19:
                {
                alt15=2;
                }
                break;
            case 20:
                {
                alt15=3;
                }
                break;
            case 21:
                {
                alt15=4;
                }
                break;
            case 22:
                {
                alt15=5;
                }
                break;
            case 23:
                {
                alt15=6;
                }
                break;
            case 24:
                {
                alt15=7;
                }
                break;
            case 25:
                {
                alt15=8;
                }
                break;
            case 26:
                {
                alt15=9;
                }
                break;
            case 27:
                {
                alt15=10;
                }
                break;
            case 28:
                {
                alt15=11;
                }
                break;
            case 29:
                {
                alt15=12;
                }
                break;
            case 30:
                {
                alt15=13;
                }
                break;
            case 31:
                {
                alt15=14;
                }
                break;
            case 32:
                {
                alt15=15;
                }
                break;
            case 33:
                {
                alt15=16;
                }
                break;
            case 34:
                {
                alt15=17;
                }
                break;
            case 35:
                {
                alt15=18;
                }
                break;
            case 36:
                {
                alt15=19;
                }
                break;
            case 37:
                {
                alt15=20;
                }
                break;
            case 38:
                {
                alt15=21;
                }
                break;
            case 39:
                {
                alt15=22;
                }
                break;
            case 120:
                {
                alt15=23;
                }
                break;
            case 121:
                {
                alt15=24;
                }
                break;
            case 122:
                {
                alt15=25;
                }
                break;
            case 123:
                {
                alt15=26;
                }
                break;
            case 124:
                {
                alt15=27;
                }
                break;
            case 125:
                {
                alt15=28;
                }
                break;
            case 126:
                {
                alt15=29;
                }
                break;
            case 127:
                {
                alt15=30;
                }
                break;
            case 128:
                {
                alt15=31;
                }
                break;
            case 129:
                {
                alt15=32;
                }
                break;
            case 130:
                {
                alt15=33;
                }
                break;
            case 131:
                {
                alt15=34;
                }
                break;
            case 132:
                {
                alt15=35;
                }
                break;
            case 40:
                {
                alt15=36;
                }
                break;
            case 41:
                {
                alt15=37;
                }
                break;
            case 133:
                {
                alt15=38;
                }
                break;
            case 134:
                {
                alt15=39;
                }
                break;
            case 135:
                {
                alt15=40;
                }
                break;
            case 136:
                {
                alt15=41;
                }
                break;
            case 137:
                {
                alt15=42;
                }
                break;
            case 138:
                {
                alt15=43;
                }
                break;
            case 139:
                {
                alt15=44;
                }
                break;
            case 140:
                {
                alt15=45;
                }
                break;
            case 141:
                {
                alt15=46;
                }
                break;
            case 142:
                {
                alt15=47;
                }
                break;
            case 143:
                {
                alt15=48;
                }
                break;
            case 144:
                {
                alt15=49;
                }
                break;
            case 145:
                {
                alt15=50;
                }
                break;
            case 146:
                {
                alt15=51;
                }
                break;
            case 147:
                {
                alt15=52;
                }
                break;
            case 148:
                {
                alt15=53;
                }
                break;
            case 149:
                {
                alt15=54;
                }
                break;
            case 150:
                {
                alt15=55;
                }
                break;
            case 151:
                {
                alt15=56;
                }
                break;
            case 152:
                {
                alt15=57;
                }
                break;
            case 153:
                {
                alt15=58;
                }
                break;
            case 154:
                {
                alt15=59;
                }
                break;
            case 200:
                {
                alt15=60;
                }
                break;
            case 155:
                {
                alt15=61;
                }
                break;
            case 156:
                {
                alt15=62;
                }
                break;
            case 157:
                {
                alt15=63;
                }
                break;
            case 158:
                {
                alt15=64;
                }
                break;
            case 159:
                {
                alt15=65;
                }
                break;
            case 160:
                {
                alt15=66;
                }
                break;
            case 161:
                {
                alt15=67;
                }
                break;
            case 162:
                {
                alt15=68;
                }
                break;
            case 163:
                {
                alt15=69;
                }
                break;
            case 164:
                {
                alt15=70;
                }
                break;
            case 165:
                {
                alt15=71;
                }
                break;
            case 166:
                {
                alt15=72;
                }
                break;
            case 167:
                {
                alt15=73;
                }
                break;
            case 168:
                {
                alt15=74;
                }
                break;
            case 169:
                {
                alt15=75;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:1624:2: ( '\\u2194' )
                    {
                    // InternalXMachine.g:1624:2: ( '\\u2194' )
                    // InternalXMachine.g:1625:3: '\\u2194'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1630:2: ( '<->' )
                    {
                    // InternalXMachine.g:1630:2: ( '<->' )
                    // InternalXMachine.g:1631:3: '<->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1636:2: ( '\\uE100' )
                    {
                    // InternalXMachine.g:1636:2: ( '\\uE100' )
                    // InternalXMachine.g:1637:3: '\\uE100'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_2()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1642:2: ( '<<->' )
                    {
                    // InternalXMachine.g:1642:2: ( '<<->' )
                    // InternalXMachine.g:1643:3: '<<->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1648:2: ( '\\uE101' )
                    {
                    // InternalXMachine.g:1648:2: ( '\\uE101' )
                    // InternalXMachine.g:1649:3: '\\uE101'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_4()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1654:2: ( '<->>' )
                    {
                    // InternalXMachine.g:1654:2: ( '<->>' )
                    // InternalXMachine.g:1655:3: '<->>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_5()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1660:2: ( '\\uE102' )
                    {
                    // InternalXMachine.g:1660:2: ( '\\uE102' )
                    // InternalXMachine.g:1661:3: '\\uE102'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_6()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1666:2: ( '<<->>' )
                    {
                    // InternalXMachine.g:1666:2: ( '<<->>' )
                    // InternalXMachine.g:1667:3: '<<->>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_7()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignLessThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1672:2: ( '\\u21F8' )
                    {
                    // InternalXMachine.g:1672:2: ( '\\u21F8' )
                    // InternalXMachine.g:1673:3: '\\u21F8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_8()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1678:2: ( '+->' )
                    {
                    // InternalXMachine.g:1678:2: ( '+->' )
                    // InternalXMachine.g:1679:3: '+->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignHyphenMinusGreaterThanSignKeyword_9()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignHyphenMinusGreaterThanSignKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1684:2: ( '\\u2192' )
                    {
                    // InternalXMachine.g:1684:2: ( '\\u2192' )
                    // InternalXMachine.g:1685:3: '\\u2192'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_10()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1690:2: ( '-->' )
                    {
                    // InternalXMachine.g:1690:2: ( '-->' )
                    // InternalXMachine.g:1691:3: '-->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_11()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1696:2: ( '\\u2914' )
                    {
                    // InternalXMachine.g:1696:2: ( '\\u2914' )
                    // InternalXMachine.g:1697:3: '\\u2914'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_12()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1702:2: ( '>+>' )
                    {
                    // InternalXMachine.g:1702:2: ( '>+>' )
                    // InternalXMachine.g:1703:3: '>+>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignPlusSignGreaterThanSignKeyword_13()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignPlusSignGreaterThanSignKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1708:2: ( '\\u21A3' )
                    {
                    // InternalXMachine.g:1708:2: ( '\\u21A3' )
                    // InternalXMachine.g:1709:3: '\\u21A3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_14()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1714:2: ( '>->' )
                    {
                    // InternalXMachine.g:1714:2: ( '>->' )
                    // InternalXMachine.g:1715:3: '>->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignHyphenMinusGreaterThanSignKeyword_15()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignHyphenMinusGreaterThanSignKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1720:2: ( '\\u2900' )
                    {
                    // InternalXMachine.g:1720:2: ( '\\u2900' )
                    // InternalXMachine.g:1721:3: '\\u2900'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_16()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1726:2: ( '+>>' )
                    {
                    // InternalXMachine.g:1726:2: ( '+>>' )
                    // InternalXMachine.g:1727:3: '+>>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignGreaterThanSignGreaterThanSignKeyword_17()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignGreaterThanSignGreaterThanSignKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1732:2: ( '\\u21A0' )
                    {
                    // InternalXMachine.g:1732:2: ( '\\u21A0' )
                    // InternalXMachine.g:1733:3: '\\u21A0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_18()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1738:2: ( '->>' )
                    {
                    // InternalXMachine.g:1738:2: ( '->>' )
                    // InternalXMachine.g:1739:3: '->>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_19()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1744:2: ( '\\u2916' )
                    {
                    // InternalXMachine.g:1744:2: ( '\\u2916' )
                    // InternalXMachine.g:1745:3: '\\u2916'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_20()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1750:2: ( '>->>' )
                    {
                    // InternalXMachine.g:1750:2: ( '>->>' )
                    // InternalXMachine.g:1751:3: '>->>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_21()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignHyphenMinusGreaterThanSignGreaterThanSignKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1756:2: ( '{' )
                    {
                    // InternalXMachine.g:1756:2: ( '{' )
                    // InternalXMachine.g:1757:3: '{'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_22()); 
                    }
                    match(input,120,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1762:2: ( '}' )
                    {
                    // InternalXMachine.g:1762:2: ( '}' )
                    // InternalXMachine.g:1763:3: '}'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_23()); 
                    }
                    match(input,121,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1768:2: ( '\\u21A6' )
                    {
                    // InternalXMachine.g:1768:2: ( '\\u21A6' )
                    // InternalXMachine.g:1769:3: '\\u21A6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_24()); 
                    }
                    match(input,122,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1774:2: ( ',,' )
                    {
                    // InternalXMachine.g:1774:2: ( ',,' )
                    // InternalXMachine.g:1775:3: ',,'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCommaCommaKeyword_25()); 
                    }
                    match(input,123,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCommaCommaKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1780:2: ( '|->' )
                    {
                    // InternalXMachine.g:1780:2: ( '|->' )
                    // InternalXMachine.g:1781:3: '|->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_26()); 
                    }
                    match(input,124,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1786:2: ( '\\u2205' )
                    {
                    // InternalXMachine.g:1786:2: ( '\\u2205' )
                    // InternalXMachine.g:1787:3: '\\u2205'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_27()); 
                    }
                    match(input,125,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1792:2: ( '{}' )
                    {
                    // InternalXMachine.g:1792:2: ( '{}' )
                    // InternalXMachine.g:1793:3: '{}'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketRightCurlyBracketKeyword_28()); 
                    }
                    match(input,126,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketRightCurlyBracketKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1798:2: ( '\\u2229' )
                    {
                    // InternalXMachine.g:1798:2: ( '\\u2229' )
                    // InternalXMachine.g:1799:3: '\\u2229'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_29()); 
                    }
                    match(input,127,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1804:2: ( '/\\\\' )
                    {
                    // InternalXMachine.g:1804:2: ( '/\\\\' )
                    // InternalXMachine.g:1805:3: '/\\\\'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusReverseSolidusKeyword_30()); 
                    }
                    match(input,128,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusReverseSolidusKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalXMachine.g:1810:2: ( '\\u222A' )
                    {
                    // InternalXMachine.g:1810:2: ( '\\u222A' )
                    // InternalXMachine.g:1811:3: '\\u222A'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_31()); 
                    }
                    match(input,129,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalXMachine.g:1816:2: ( '\\\\/' )
                    {
                    // InternalXMachine.g:1816:2: ( '\\\\/' )
                    // InternalXMachine.g:1817:3: '\\\\/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getReverseSolidusSolidusKeyword_32()); 
                    }
                    match(input,130,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getReverseSolidusSolidusKeyword_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // InternalXMachine.g:1822:2: ( '\\u2216' )
                    {
                    // InternalXMachine.g:1822:2: ( '\\u2216' )
                    // InternalXMachine.g:1823:3: '\\u2216'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_33()); 
                    }
                    match(input,131,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalXMachine.g:1828:2: ( '\\\\' )
                    {
                    // InternalXMachine.g:1828:2: ( '\\\\' )
                    // InternalXMachine.g:1829:3: '\\\\'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_34()); 
                    }
                    match(input,132,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalXMachine.g:1834:2: ( '\\u00D7' )
                    {
                    // InternalXMachine.g:1834:2: ( '\\u00D7' )
                    // InternalXMachine.g:1835:3: '\\u00D7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_35()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_35()); 
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalXMachine.g:1840:2: ( '**' )
                    {
                    // InternalXMachine.g:1840:2: ( '**' )
                    // InternalXMachine.g:1841:3: '**'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskAsteriskKeyword_36()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskAsteriskKeyword_36()); 
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalXMachine.g:1846:2: ( '[' )
                    {
                    // InternalXMachine.g:1846:2: ( '[' )
                    // InternalXMachine.g:1847:3: '['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_37()); 
                    }
                    match(input,133,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_37()); 
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalXMachine.g:1852:2: ( ']' )
                    {
                    // InternalXMachine.g:1852:2: ( ']' )
                    // InternalXMachine.g:1853:3: ']'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_38()); 
                    }
                    match(input,134,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_38()); 
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalXMachine.g:1858:2: ( '\\uE103' )
                    {
                    // InternalXMachine.g:1858:2: ( '\\uE103' )
                    // InternalXMachine.g:1859:3: '\\uE103'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_39()); 
                    }
                    match(input,135,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_39()); 
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalXMachine.g:1864:2: ( '<+' )
                    {
                    // InternalXMachine.g:1864:2: ( '<+' )
                    // InternalXMachine.g:1865:3: '<+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignPlusSignKeyword_40()); 
                    }
                    match(input,136,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignPlusSignKeyword_40()); 
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalXMachine.g:1870:2: ( '\\u2218' )
                    {
                    // InternalXMachine.g:1870:2: ( '\\u2218' )
                    // InternalXMachine.g:1871:3: '\\u2218'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_41()); 
                    }
                    match(input,137,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_41()); 
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalXMachine.g:1876:2: ( 'circ' )
                    {
                    // InternalXMachine.g:1876:2: ( 'circ' )
                    // InternalXMachine.g:1877:3: 'circ'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircKeyword_42()); 
                    }
                    match(input,138,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircKeyword_42()); 
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalXMachine.g:1882:2: ( ';' )
                    {
                    // InternalXMachine.g:1882:2: ( ';' )
                    // InternalXMachine.g:1883:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_43()); 
                    }
                    match(input,139,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_43()); 
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalXMachine.g:1888:2: ( '\\u2297' )
                    {
                    // InternalXMachine.g:1888:2: ( '\\u2297' )
                    // InternalXMachine.g:1889:3: '\\u2297'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_44()); 
                    }
                    match(input,140,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_44()); 
                    }

                    }


                    }
                    break;
                case 46 :
                    // InternalXMachine.g:1894:2: ( '><' )
                    {
                    // InternalXMachine.g:1894:2: ( '><' )
                    // InternalXMachine.g:1895:3: '><'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignLessThanSignKeyword_45()); 
                    }
                    match(input,141,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreaterThanSignLessThanSignKeyword_45()); 
                    }

                    }


                    }
                    break;
                case 47 :
                    // InternalXMachine.g:1900:2: ( '\\u2225' )
                    {
                    // InternalXMachine.g:1900:2: ( '\\u2225' )
                    // InternalXMachine.g:1901:3: '\\u2225'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_46()); 
                    }
                    match(input,142,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_46()); 
                    }

                    }


                    }
                    break;
                case 48 :
                    // InternalXMachine.g:1906:2: ( '||' )
                    {
                    // InternalXMachine.g:1906:2: ( '||' )
                    // InternalXMachine.g:1907:3: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineVerticalLineKeyword_47()); 
                    }
                    match(input,143,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineVerticalLineKeyword_47()); 
                    }

                    }


                    }
                    break;
                case 49 :
                    // InternalXMachine.g:1912:2: ( '\\u223C' )
                    {
                    // InternalXMachine.g:1912:2: ( '\\u223C' )
                    // InternalXMachine.g:1913:3: '\\u223C'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_48()); 
                    }
                    match(input,144,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_48()); 
                    }

                    }


                    }
                    break;
                case 50 :
                    // InternalXMachine.g:1918:2: ( '~' )
                    {
                    // InternalXMachine.g:1918:2: ( '~' )
                    // InternalXMachine.g:1919:3: '~'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeKeyword_49()); 
                    }
                    match(input,145,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeKeyword_49()); 
                    }

                    }


                    }
                    break;
                case 51 :
                    // InternalXMachine.g:1924:2: ( '\\u25C1' )
                    {
                    // InternalXMachine.g:1924:2: ( '\\u25C1' )
                    // InternalXMachine.g:1925:3: '\\u25C1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_50()); 
                    }
                    match(input,146,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_50()); 
                    }

                    }


                    }
                    break;
                case 52 :
                    // InternalXMachine.g:1930:2: ( '<|' )
                    {
                    // InternalXMachine.g:1930:2: ( '<|' )
                    // InternalXMachine.g:1931:3: '<|'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignVerticalLineKeyword_51()); 
                    }
                    match(input,147,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignVerticalLineKeyword_51()); 
                    }

                    }


                    }
                    break;
                case 53 :
                    // InternalXMachine.g:1936:2: ( '\\u2A64' )
                    {
                    // InternalXMachine.g:1936:2: ( '\\u2A64' )
                    // InternalXMachine.g:1937:3: '\\u2A64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_52()); 
                    }
                    match(input,148,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_52()); 
                    }

                    }


                    }
                    break;
                case 54 :
                    // InternalXMachine.g:1942:2: ( '<<|' )
                    {
                    // InternalXMachine.g:1942:2: ( '<<|' )
                    // InternalXMachine.g:1943:3: '<<|'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignLessThanSignVerticalLineKeyword_53()); 
                    }
                    match(input,149,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLessThanSignLessThanSignVerticalLineKeyword_53()); 
                    }

                    }


                    }
                    break;
                case 55 :
                    // InternalXMachine.g:1948:2: ( '\\u25B7' )
                    {
                    // InternalXMachine.g:1948:2: ( '\\u25B7' )
                    // InternalXMachine.g:1949:3: '\\u25B7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_54()); 
                    }
                    match(input,150,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_54()); 
                    }

                    }


                    }
                    break;
                case 56 :
                    // InternalXMachine.g:1954:2: ( '|>' )
                    {
                    // InternalXMachine.g:1954:2: ( '|>' )
                    // InternalXMachine.g:1955:3: '|>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineGreaterThanSignKeyword_55()); 
                    }
                    match(input,151,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineGreaterThanSignKeyword_55()); 
                    }

                    }


                    }
                    break;
                case 57 :
                    // InternalXMachine.g:1960:2: ( '\\u2A65' )
                    {
                    // InternalXMachine.g:1960:2: ( '\\u2A65' )
                    // InternalXMachine.g:1961:3: '\\u2A65'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_56()); 
                    }
                    match(input,152,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_56()); 
                    }

                    }


                    }
                    break;
                case 58 :
                    // InternalXMachine.g:1966:2: ( '|>>' )
                    {
                    // InternalXMachine.g:1966:2: ( '|>>' )
                    // InternalXMachine.g:1967:3: '|>>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineGreaterThanSignGreaterThanSignKeyword_57()); 
                    }
                    match(input,153,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineGreaterThanSignGreaterThanSignKeyword_57()); 
                    }

                    }


                    }
                    break;
                case 59 :
                    // InternalXMachine.g:1972:2: ( '\\u03BB' )
                    {
                    // InternalXMachine.g:1972:2: ( '\\u03BB' )
                    // InternalXMachine.g:1973:3: '\\u03BB'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_58()); 
                    }
                    match(input,154,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_58()); 
                    }

                    }


                    }
                    break;
                case 60 :
                    // InternalXMachine.g:1978:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0 ) )
                    {
                    // InternalXMachine.g:1978:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0 ) )
                    // InternalXMachine.g:1979:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_59()); 
                    }
                    // InternalXMachine.g:1980:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0 )
                    // InternalXMachine.g:1980:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_59()); 
                    }

                    }


                    }
                    break;
                case 61 :
                    // InternalXMachine.g:1984:2: ( 'INTER' )
                    {
                    // InternalXMachine.g:1984:2: ( 'INTER' )
                    // InternalXMachine.g:1985:3: 'INTER'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getINTERKeyword_60()); 
                    }
                    match(input,155,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getINTERKeyword_60()); 
                    }

                    }


                    }
                    break;
                case 62 :
                    // InternalXMachine.g:1990:2: ( '\\u22C3' )
                    {
                    // InternalXMachine.g:1990:2: ( '\\u22C3' )
                    // InternalXMachine.g:1991:3: '\\u22C3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_61()); 
                    }
                    match(input,156,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_61()); 
                    }

                    }


                    }
                    break;
                case 63 :
                    // InternalXMachine.g:1996:2: ( 'UNION' )
                    {
                    // InternalXMachine.g:1996:2: ( 'UNION' )
                    // InternalXMachine.g:1997:3: 'UNION'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUNIONKeyword_62()); 
                    }
                    match(input,157,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUNIONKeyword_62()); 
                    }

                    }


                    }
                    break;
                case 64 :
                    // InternalXMachine.g:2002:2: ( '\\u2223' )
                    {
                    // InternalXMachine.g:2002:2: ( '\\u2223' )
                    // InternalXMachine.g:2003:3: '\\u2223'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_63()); 
                    }
                    match(input,158,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_63()); 
                    }

                    }


                    }
                    break;
                case 65 :
                    // InternalXMachine.g:2008:2: ( '|' )
                    {
                    // InternalXMachine.g:2008:2: ( '|' )
                    // InternalXMachine.g:2009:3: '|'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineKeyword_64()); 
                    }
                    match(input,159,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getVerticalLineKeyword_64()); 
                    }

                    }


                    }
                    break;
                case 66 :
                    // InternalXMachine.g:2014:2: ( '\\u2025' )
                    {
                    // InternalXMachine.g:2014:2: ( '\\u2025' )
                    // InternalXMachine.g:2015:3: '\\u2025'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_65()); 
                    }
                    match(input,160,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_65()); 
                    }

                    }


                    }
                    break;
                case 67 :
                    // InternalXMachine.g:2020:2: ( '..' )
                    {
                    // InternalXMachine.g:2020:2: ( '..' )
                    // InternalXMachine.g:2021:3: '..'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getFullStopFullStopKeyword_66()); 
                    }
                    match(input,161,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getFullStopFullStopKeyword_66()); 
                    }

                    }


                    }
                    break;
                case 68 :
                    // InternalXMachine.g:2026:2: ( '+' )
                    {
                    // InternalXMachine.g:2026:2: ( '+' )
                    // InternalXMachine.g:2027:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_67()); 
                    }
                    match(input,162,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_67()); 
                    }

                    }


                    }
                    break;
                case 69 :
                    // InternalXMachine.g:2032:2: ( '\\u2212' )
                    {
                    // InternalXMachine.g:2032:2: ( '\\u2212' )
                    // InternalXMachine.g:2033:3: '\\u2212'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_68()); 
                    }
                    match(input,163,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_68()); 
                    }

                    }


                    }
                    break;
                case 70 :
                    // InternalXMachine.g:2038:2: ( '-' )
                    {
                    // InternalXMachine.g:2038:2: ( '-' )
                    // InternalXMachine.g:2039:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_69()); 
                    }
                    match(input,164,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_69()); 
                    }

                    }


                    }
                    break;
                case 71 :
                    // InternalXMachine.g:2044:2: ( '\\u2217' )
                    {
                    // InternalXMachine.g:2044:2: ( '\\u2217' )
                    // InternalXMachine.g:2045:3: '\\u2217'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_70()); 
                    }
                    match(input,165,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_70()); 
                    }

                    }


                    }
                    break;
                case 72 :
                    // InternalXMachine.g:2050:2: ( '*' )
                    {
                    // InternalXMachine.g:2050:2: ( '*' )
                    // InternalXMachine.g:2051:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_71()); 
                    }
                    match(input,166,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_71()); 
                    }

                    }


                    }
                    break;
                case 73 :
                    // InternalXMachine.g:2056:2: ( '\\u00F7' )
                    {
                    // InternalXMachine.g:2056:2: ( '\\u00F7' )
                    // InternalXMachine.g:2057:3: '\\u00F7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_72()); 
                    }
                    match(input,167,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_72()); 
                    }

                    }


                    }
                    break;
                case 74 :
                    // InternalXMachine.g:2062:2: ( '/' )
                    {
                    // InternalXMachine.g:2062:2: ( '/' )
                    // InternalXMachine.g:2063:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_73()); 
                    }
                    match(input,168,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_73()); 
                    }

                    }


                    }
                    break;
                case 75 :
                    // InternalXMachine.g:2068:2: ( '^' )
                    {
                    // InternalXMachine.g:2068:2: ( '^' )
                    // InternalXMachine.g:2069:3: '^'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_74()); 
                    }
                    match(input,169,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_74()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives"


    // $ANTLR start "rule__XRecord__Alternatives_2"
    // InternalXMachine.g:2078:1: rule__XRecord__Alternatives_2 : ( ( ( rule__XRecord__ExtendedAssignment_2_0 ) ) | ( ( rule__XRecord__RefinedAssignment_2_1 ) ) );
    public final void rule__XRecord__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2082:1: ( ( ( rule__XRecord__ExtendedAssignment_2_0 ) ) | ( ( rule__XRecord__RefinedAssignment_2_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=170 && LA16_0<=171)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=172 && LA16_0<=173)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:2083:2: ( ( rule__XRecord__ExtendedAssignment_2_0 ) )
                    {
                    // InternalXMachine.g:2083:2: ( ( rule__XRecord__ExtendedAssignment_2_0 ) )
                    // InternalXMachine.g:2084:3: ( rule__XRecord__ExtendedAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getExtendedAssignment_2_0()); 
                    }
                    // InternalXMachine.g:2085:3: ( rule__XRecord__ExtendedAssignment_2_0 )
                    // InternalXMachine.g:2085:4: rule__XRecord__ExtendedAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__ExtendedAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getExtendedAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2089:2: ( ( rule__XRecord__RefinedAssignment_2_1 ) )
                    {
                    // InternalXMachine.g:2089:2: ( ( rule__XRecord__RefinedAssignment_2_1 ) )
                    // InternalXMachine.g:2090:3: ( rule__XRecord__RefinedAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRefinedAssignment_2_1()); 
                    }
                    // InternalXMachine.g:2091:3: ( rule__XRecord__RefinedAssignment_2_1 )
                    // InternalXMachine.g:2091:4: rule__XRecord__RefinedAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__RefinedAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getRefinedAssignment_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Alternatives_2"


    // $ANTLR start "rule__XRecord__ExtendedAlternatives_2_0_0"
    // InternalXMachine.g:2099:1: rule__XRecord__ExtendedAlternatives_2_0_0 : ( ( 'extended' ) | ( 'ext' ) );
    public final void rule__XRecord__ExtendedAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2103:1: ( ( 'extended' ) | ( 'ext' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==170) ) {
                alt17=1;
            }
            else if ( (LA17_0==171) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:2104:2: ( 'extended' )
                    {
                    // InternalXMachine.g:2104:2: ( 'extended' )
                    // InternalXMachine.g:2105:3: 'extended'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_2_0_0_0()); 
                    }
                    match(input,170,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2110:2: ( 'ext' )
                    {
                    // InternalXMachine.g:2110:2: ( 'ext' )
                    // InternalXMachine.g:2111:3: 'ext'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getExtendedExtKeyword_2_0_0_1()); 
                    }
                    match(input,171,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getExtendedExtKeyword_2_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__ExtendedAlternatives_2_0_0"


    // $ANTLR start "rule__XRecord__RefinedAlternatives_2_1_0"
    // InternalXMachine.g:2120:1: rule__XRecord__RefinedAlternatives_2_1_0 : ( ( 'refined' ) | ( 'ref' ) );
    public final void rule__XRecord__RefinedAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2124:1: ( ( 'refined' ) | ( 'ref' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==172) ) {
                alt18=1;
            }
            else if ( (LA18_0==173) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:2125:2: ( 'refined' )
                    {
                    // InternalXMachine.g:2125:2: ( 'refined' )
                    // InternalXMachine.g:2126:3: 'refined'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRefinedRefinedKeyword_2_1_0_0()); 
                    }
                    match(input,172,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getRefinedRefinedKeyword_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2131:2: ( 'ref' )
                    {
                    // InternalXMachine.g:2131:2: ( 'ref' )
                    // InternalXMachine.g:2132:3: 'ref'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRefinedRefKeyword_2_1_0_1()); 
                    }
                    match(input,173,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getRefinedRefKeyword_2_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__RefinedAlternatives_2_1_0"


    // $ANTLR start "rule__XRecord__Alternatives_3"
    // InternalXMachine.g:2141:1: rule__XRecord__Alternatives_3 : ( ( 'record' ) | ( 'rec' ) );
    public final void rule__XRecord__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2145:1: ( ( 'record' ) | ( 'rec' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==174) ) {
                alt19=1;
            }
            else if ( (LA19_0==175) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:2146:2: ( 'record' )
                    {
                    // InternalXMachine.g:2146:2: ( 'record' )
                    // InternalXMachine.g:2147:3: 'record'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRecordKeyword_3_0()); 
                    }
                    match(input,174,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getRecordKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2152:2: ( 'rec' )
                    {
                    // InternalXMachine.g:2152:2: ( 'rec' )
                    // InternalXMachine.g:2153:3: 'rec'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRecKeyword_3_1()); 
                    }
                    match(input,175,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getRecKeyword_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Alternatives_3"


    // $ANTLR start "rule__XRecord__Alternatives_5_0"
    // InternalXMachine.g:2162:1: rule__XRecord__Alternatives_5_0 : ( ( 'inherits' ) | ( 'ihr' ) );
    public final void rule__XRecord__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2166:1: ( ( 'inherits' ) | ( 'ihr' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==176) ) {
                alt20=1;
            }
            else if ( (LA20_0==177) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalXMachine.g:2167:2: ( 'inherits' )
                    {
                    // InternalXMachine.g:2167:2: ( 'inherits' )
                    // InternalXMachine.g:2168:3: 'inherits'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getInheritsKeyword_5_0_0()); 
                    }
                    match(input,176,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getInheritsKeyword_5_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2173:2: ( 'ihr' )
                    {
                    // InternalXMachine.g:2173:2: ( 'ihr' )
                    // InternalXMachine.g:2174:3: 'ihr'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getIhrKeyword_5_0_1()); 
                    }
                    match(input,177,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getIhrKeyword_5_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Alternatives_5_0"


    // $ANTLR start "rule__XRecord__Alternatives_6"
    // InternalXMachine.g:2183:1: rule__XRecord__Alternatives_6 : ( ( ( rule__XRecord__Group_6_0__0 ) ) | ( ( rule__XRecord__Group_6_1__0 ) ) );
    public final void rule__XRecord__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2187:1: ( ( ( rule__XRecord__Group_6_0__0 ) ) | ( ( rule__XRecord__Group_6_1__0 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=178 && LA21_0<=179)) ) {
                alt21=1;
            }
            else if ( (LA21_0==202) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:2188:2: ( ( rule__XRecord__Group_6_0__0 ) )
                    {
                    // InternalXMachine.g:2188:2: ( ( rule__XRecord__Group_6_0__0 ) )
                    // InternalXMachine.g:2189:3: ( rule__XRecord__Group_6_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getGroup_6_0()); 
                    }
                    // InternalXMachine.g:2190:3: ( rule__XRecord__Group_6_0__0 )
                    // InternalXMachine.g:2190:4: rule__XRecord__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__Group_6_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getGroup_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2194:2: ( ( rule__XRecord__Group_6_1__0 ) )
                    {
                    // InternalXMachine.g:2194:2: ( ( rule__XRecord__Group_6_1__0 ) )
                    // InternalXMachine.g:2195:3: ( rule__XRecord__Group_6_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getGroup_6_1()); 
                    }
                    // InternalXMachine.g:2196:3: ( rule__XRecord__Group_6_1__0 )
                    // InternalXMachine.g:2196:4: rule__XRecord__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__Group_6_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getGroup_6_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Alternatives_6"


    // $ANTLR start "rule__XRecord__Alternatives_6_0_0"
    // InternalXMachine.g:2204:1: rule__XRecord__Alternatives_6_0_0 : ( ( 'field' ) | ( 'fld' ) );
    public final void rule__XRecord__Alternatives_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2208:1: ( ( 'field' ) | ( 'fld' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==178) ) {
                alt22=1;
            }
            else if ( (LA22_0==179) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:2209:2: ( 'field' )
                    {
                    // InternalXMachine.g:2209:2: ( 'field' )
                    // InternalXMachine.g:2210:3: 'field'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getFieldKeyword_6_0_0_0()); 
                    }
                    match(input,178,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getFieldKeyword_6_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2215:2: ( 'fld' )
                    {
                    // InternalXMachine.g:2215:2: ( 'fld' )
                    // InternalXMachine.g:2216:3: 'fld'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getFldKeyword_6_0_0_1()); 
                    }
                    match(input,179,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getFldKeyword_6_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Alternatives_6_0_0"


    // $ANTLR start "rule__XConvergence__Alternatives"
    // InternalXMachine.g:2225:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2229:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 180:
                {
                alt23=1;
                }
                break;
            case 181:
                {
                alt23=2;
                }
                break;
            case 182:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:2230:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:2230:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:2231:3: ( 'ordinary' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:2232:3: ( 'ordinary' )
                    // InternalXMachine.g:2232:4: 'ordinary'
                    {
                    match(input,180,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2236:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:2236:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:2237:3: ( 'convergent' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:2238:3: ( 'convergent' )
                    // InternalXMachine.g:2238:4: 'convergent'
                    {
                    match(input,181,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2242:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:2242:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:2243:3: ( 'anticipated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:2244:3: ( 'anticipated' )
                    // InternalXMachine.g:2244:4: 'anticipated'
                    {
                    match(input,182,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConvergence__Alternatives"


    // $ANTLR start "rule__Multiplicity__Alternatives"
    // InternalXMachine.g:2252:1: rule__Multiplicity__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2256:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 183:
                {
                alt24=1;
                }
                break;
            case 184:
                {
                alt24=2;
                }
                break;
            case 185:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:2257:2: ( ( 'one' ) )
                    {
                    // InternalXMachine.g:2257:2: ( ( 'one' ) )
                    // InternalXMachine.g:2258:3: ( 'one' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:2259:3: ( 'one' )
                    // InternalXMachine.g:2259:4: 'one'
                    {
                    match(input,183,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:2263:2: ( ( 'many' ) )
                    {
                    // InternalXMachine.g:2263:2: ( ( 'many' ) )
                    // InternalXMachine.g:2264:3: ( 'many' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:2265:3: ( 'many' )
                    // InternalXMachine.g:2265:4: 'many'
                    {
                    match(input,184,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:2269:2: ( ( 'opt' ) )
                    {
                    // InternalXMachine.g:2269:2: ( ( 'opt' ) )
                    // InternalXMachine.g:2270:3: ( 'opt' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:2271:3: ( 'opt' )
                    // InternalXMachine.g:2271:4: 'opt'
                    {
                    match(input,185,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Alternatives"


    // $ANTLR start "rule__Machine__Group__0"
    // InternalXMachine.g:2279:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2283:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:2284:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // InternalXMachine.g:2291:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2295:1: ( ( () ) )
            // InternalXMachine.g:2296:1: ( () )
            {
            // InternalXMachine.g:2296:1: ( () )
            // InternalXMachine.g:2297:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            }
            // InternalXMachine.g:2298:2: ()
            // InternalXMachine.g:2298:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getMachineAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // InternalXMachine.g:2306:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2310:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:2311:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // InternalXMachine.g:2318:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__CommentAssignment_1 )? ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2322:1: ( ( ( rule__Machine__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2323:1: ( ( rule__Machine__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2323:1: ( ( rule__Machine__CommentAssignment_1 )? )
            // InternalXMachine.g:2324:2: ( rule__Machine__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:2325:2: ( rule__Machine__CommentAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:2325:3: rule__Machine__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // InternalXMachine.g:2333:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2337:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:2338:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // InternalXMachine.g:2345:1: rule__Machine__Group__2__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2349:1: ( ( 'machine' ) )
            // InternalXMachine.g:2350:1: ( 'machine' )
            {
            // InternalXMachine.g:2350:1: ( 'machine' )
            // InternalXMachine.g:2351:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineKeyword_2()); 
            }
            match(input,186,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getMachineKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // InternalXMachine.g:2360:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2364:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:2365:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // InternalXMachine.g:2372:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__NameAssignment_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2376:1: ( ( ( rule__Machine__NameAssignment_3 ) ) )
            // InternalXMachine.g:2377:1: ( ( rule__Machine__NameAssignment_3 ) )
            {
            // InternalXMachine.g:2377:1: ( ( rule__Machine__NameAssignment_3 ) )
            // InternalXMachine.g:2378:2: ( rule__Machine__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:2379:2: ( rule__Machine__NameAssignment_3 )
            // InternalXMachine.g:2379:3: rule__Machine__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__4"
    // InternalXMachine.g:2387:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2391:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:2392:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Machine__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4"


    // $ANTLR start "rule__Machine__Group__4__Impl"
    // InternalXMachine.g:2399:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__UnorderedGroup_4 ) ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2403:1: ( ( ( rule__Machine__UnorderedGroup_4 ) ) )
            // InternalXMachine.g:2404:1: ( ( rule__Machine__UnorderedGroup_4 ) )
            {
            // InternalXMachine.g:2404:1: ( ( rule__Machine__UnorderedGroup_4 ) )
            // InternalXMachine.g:2405:2: ( rule__Machine__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getUnorderedGroup_4()); 
            }
            // InternalXMachine.g:2406:2: ( rule__Machine__UnorderedGroup_4 )
            // InternalXMachine.g:2406:3: rule__Machine__UnorderedGroup_4
            {
            pushFollow(FOLLOW_2);
            rule__Machine__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4__Impl"


    // $ANTLR start "rule__Machine__Group__5"
    // InternalXMachine.g:2414:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2418:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:2419:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Machine__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5"


    // $ANTLR start "rule__Machine__Group__5__Impl"
    // InternalXMachine.g:2426:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2430:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:2431:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:2431:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:2432:2: ( rule__Machine__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_5()); 
            }
            // InternalXMachine.g:2433:2: ( rule__Machine__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==190) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXMachine.g:2433:3: rule__Machine__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5__Impl"


    // $ANTLR start "rule__Machine__Group__6"
    // InternalXMachine.g:2441:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2445:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXMachine.g:2446:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Machine__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6"


    // $ANTLR start "rule__Machine__Group__6__Impl"
    // InternalXMachine.g:2453:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Alternatives_6 )* ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2457:1: ( ( ( rule__Machine__Alternatives_6 )* ) )
            // InternalXMachine.g:2458:1: ( ( rule__Machine__Alternatives_6 )* )
            {
            // InternalXMachine.g:2458:1: ( ( rule__Machine__Alternatives_6 )* )
            // InternalXMachine.g:2459:2: ( rule__Machine__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getAlternatives_6()); 
            }
            // InternalXMachine.g:2460:2: ( rule__Machine__Alternatives_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STRING||(LA27_0>=12 && LA27_0<=17)||LA27_0==46||(LA27_0>=170 && LA27_0<=175)||(LA27_0>=180 && LA27_0<=182)||(LA27_0>=195 && LA27_0<=196)||LA27_0==203) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalXMachine.g:2460:3: rule__Machine__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__Alternatives_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getAlternatives_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6__Impl"


    // $ANTLR start "rule__Machine__Group__7"
    // InternalXMachine.g:2468:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2472:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXMachine.g:2473:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Machine__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7"


    // $ANTLR start "rule__Machine__Group__7__Impl"
    // InternalXMachine.g:2480:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2484:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // InternalXMachine.g:2485:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // InternalXMachine.g:2485:1: ( ( rule__Machine__Group_7__0 )? )
            // InternalXMachine.g:2486:2: ( rule__Machine__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_7()); 
            }
            // InternalXMachine.g:2487:2: ( rule__Machine__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==191) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:2487:3: rule__Machine__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7__Impl"


    // $ANTLR start "rule__Machine__Group__8"
    // InternalXMachine.g:2495:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2499:1: ( rule__Machine__Group__8__Impl )
            // InternalXMachine.g:2500:2: rule__Machine__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8"


    // $ANTLR start "rule__Machine__Group__8__Impl"
    // InternalXMachine.g:2506:1: rule__Machine__Group__8__Impl : ( ( 'end' )? ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2510:1: ( ( ( 'end' )? ) )
            // InternalXMachine.g:2511:1: ( ( 'end' )? )
            {
            // InternalXMachine.g:2511:1: ( ( 'end' )? )
            // InternalXMachine.g:2512:2: ( 'end' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEndKeyword_8()); 
            }
            // InternalXMachine.g:2513:2: ( 'end' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==187) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXMachine.g:2513:3: 'end'
                    {
                    match(input,187,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEndKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8__Impl"


    // $ANTLR start "rule__Machine__Group_4_1__0"
    // InternalXMachine.g:2522:1: rule__Machine__Group_4_1__0 : rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1 ;
    public final void rule__Machine__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2526:1: ( rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1 )
            // InternalXMachine.g:2527:2: rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_1__0"


    // $ANTLR start "rule__Machine__Group_4_1__0__Impl"
    // InternalXMachine.g:2534:1: rule__Machine__Group_4_1__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2538:1: ( ( 'refines' ) )
            // InternalXMachine.g:2539:1: ( 'refines' )
            {
            // InternalXMachine.g:2539:1: ( 'refines' )
            // InternalXMachine.g:2540:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesKeyword_4_1_0()); 
            }
            match(input,188,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRefinesKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_1__0__Impl"


    // $ANTLR start "rule__Machine__Group_4_1__1"
    // InternalXMachine.g:2549:1: rule__Machine__Group_4_1__1 : rule__Machine__Group_4_1__1__Impl ;
    public final void rule__Machine__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2553:1: ( rule__Machine__Group_4_1__1__Impl )
            // InternalXMachine.g:2554:2: rule__Machine__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_1__1"


    // $ANTLR start "rule__Machine__Group_4_1__1__Impl"
    // InternalXMachine.g:2560:1: rule__Machine__Group_4_1__1__Impl : ( ( rule__Machine__RefinesAssignment_4_1_1 ) ) ;
    public final void rule__Machine__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2564:1: ( ( ( rule__Machine__RefinesAssignment_4_1_1 ) ) )
            // InternalXMachine.g:2565:1: ( ( rule__Machine__RefinesAssignment_4_1_1 ) )
            {
            // InternalXMachine.g:2565:1: ( ( rule__Machine__RefinesAssignment_4_1_1 ) )
            // InternalXMachine.g:2566:2: ( rule__Machine__RefinesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesAssignment_4_1_1()); 
            }
            // InternalXMachine.g:2567:2: ( rule__Machine__RefinesAssignment_4_1_1 )
            // InternalXMachine.g:2567:3: rule__Machine__RefinesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__RefinesAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRefinesAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_1__1__Impl"


    // $ANTLR start "rule__Machine__Group_4_2__0"
    // InternalXMachine.g:2576:1: rule__Machine__Group_4_2__0 : rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 ;
    public final void rule__Machine__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2580:1: ( rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 )
            // InternalXMachine.g:2581:2: rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_2__0"


    // $ANTLR start "rule__Machine__Group_4_2__0__Impl"
    // InternalXMachine.g:2588:1: rule__Machine__Group_4_2__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2592:1: ( ( 'sees' ) )
            // InternalXMachine.g:2593:1: ( 'sees' )
            {
            // InternalXMachine.g:2593:1: ( 'sees' )
            // InternalXMachine.g:2594:2: 'sees'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesKeyword_4_2_0()); 
            }
            match(input,189,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_2__0__Impl"


    // $ANTLR start "rule__Machine__Group_4_2__1"
    // InternalXMachine.g:2603:1: rule__Machine__Group_4_2__1 : rule__Machine__Group_4_2__1__Impl ;
    public final void rule__Machine__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2607:1: ( rule__Machine__Group_4_2__1__Impl )
            // InternalXMachine.g:2608:2: rule__Machine__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_2__1"


    // $ANTLR start "rule__Machine__Group_4_2__1__Impl"
    // InternalXMachine.g:2614:1: rule__Machine__Group_4_2__1__Impl : ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) ) ;
    public final void rule__Machine__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2618:1: ( ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) ) )
            // InternalXMachine.g:2619:1: ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) )
            {
            // InternalXMachine.g:2619:1: ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) )
            // InternalXMachine.g:2620:2: ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* )
            {
            // InternalXMachine.g:2620:2: ( ( rule__Machine__SeesAssignment_4_2_1 ) )
            // InternalXMachine.g:2621:3: ( rule__Machine__SeesAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }
            // InternalXMachine.g:2622:3: ( rule__Machine__SeesAssignment_4_2_1 )
            // InternalXMachine.g:2622:4: rule__Machine__SeesAssignment_4_2_1
            {
            pushFollow(FOLLOW_9);
            rule__Machine__SeesAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }

            }

            // InternalXMachine.g:2625:2: ( ( rule__Machine__SeesAssignment_4_2_1 )* )
            // InternalXMachine.g:2626:3: ( rule__Machine__SeesAssignment_4_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }
            // InternalXMachine.g:2627:3: ( rule__Machine__SeesAssignment_4_2_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalXMachine.g:2627:4: rule__Machine__SeesAssignment_4_2_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Machine__SeesAssignment_4_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_2__1__Impl"


    // $ANTLR start "rule__Machine__Group_5__0"
    // InternalXMachine.g:2637:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2641:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:2642:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__0"


    // $ANTLR start "rule__Machine__Group_5__0__Impl"
    // InternalXMachine.g:2649:1: rule__Machine__Group_5__0__Impl : ( 'contains' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2653:1: ( ( 'contains' ) )
            // InternalXMachine.g:2654:1: ( 'contains' )
            {
            // InternalXMachine.g:2654:1: ( 'contains' )
            // InternalXMachine.g:2655:2: 'contains'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getContainsKeyword_5_0()); 
            }
            match(input,190,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getContainsKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__0__Impl"


    // $ANTLR start "rule__Machine__Group_5__1"
    // InternalXMachine.g:2664:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2668:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:2669:2: rule__Machine__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__1"


    // $ANTLR start "rule__Machine__Group_5__1__Impl"
    // InternalXMachine.g:2675:1: rule__Machine__Group_5__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2679:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) ) )
            // InternalXMachine.g:2680:1: ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:2680:1: ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) )
            // InternalXMachine.g:2681:2: ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* )
            {
            // InternalXMachine.g:2681:2: ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) )
            // InternalXMachine.g:2682:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_5_1()); 
            }
            // InternalXMachine.g:2683:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )
            // InternalXMachine.g:2683:4: rule__Machine__OrderedChildrenAssignment_5_1
            {
            pushFollow(FOLLOW_9);
            rule__Machine__OrderedChildrenAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_5_1()); 
            }

            }

            // InternalXMachine.g:2686:2: ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* )
            // InternalXMachine.g:2687:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_5_1()); 
            }
            // InternalXMachine.g:2688:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXMachine.g:2688:4: rule__Machine__OrderedChildrenAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Machine__OrderedChildrenAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_5_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__1__Impl"


    // $ANTLR start "rule__Machine__Group_6_0__0"
    // InternalXMachine.g:2698:1: rule__Machine__Group_6_0__0 : rule__Machine__Group_6_0__0__Impl rule__Machine__Group_6_0__1 ;
    public final void rule__Machine__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2702:1: ( rule__Machine__Group_6_0__0__Impl rule__Machine__Group_6_0__1 )
            // InternalXMachine.g:2703:2: rule__Machine__Group_6_0__0__Impl rule__Machine__Group_6_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Machine__Group_6_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6_0__0"


    // $ANTLR start "rule__Machine__Group_6_0__0__Impl"
    // InternalXMachine.g:2710:1: rule__Machine__Group_6_0__0__Impl : ( ( rule__Machine__Alternatives_6_0_0 ) ) ;
    public final void rule__Machine__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2714:1: ( ( ( rule__Machine__Alternatives_6_0_0 ) ) )
            // InternalXMachine.g:2715:1: ( ( rule__Machine__Alternatives_6_0_0 ) )
            {
            // InternalXMachine.g:2715:1: ( ( rule__Machine__Alternatives_6_0_0 ) )
            // InternalXMachine.g:2716:2: ( rule__Machine__Alternatives_6_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getAlternatives_6_0_0()); 
            }
            // InternalXMachine.g:2717:2: ( rule__Machine__Alternatives_6_0_0 )
            // InternalXMachine.g:2717:3: rule__Machine__Alternatives_6_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Alternatives_6_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getAlternatives_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6_0__0__Impl"


    // $ANTLR start "rule__Machine__Group_6_0__1"
    // InternalXMachine.g:2725:1: rule__Machine__Group_6_0__1 : rule__Machine__Group_6_0__1__Impl ;
    public final void rule__Machine__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2729:1: ( rule__Machine__Group_6_0__1__Impl )
            // InternalXMachine.g:2730:2: rule__Machine__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6_0__1"


    // $ANTLR start "rule__Machine__Group_6_0__1__Impl"
    // InternalXMachine.g:2736:1: rule__Machine__Group_6_0__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) ) ;
    public final void rule__Machine__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2740:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) ) )
            // InternalXMachine.g:2741:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) )
            {
            // InternalXMachine.g:2741:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) )
            // InternalXMachine.g:2742:2: ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* )
            {
            // InternalXMachine.g:2742:2: ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) )
            // InternalXMachine.g:2743:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_0_1()); 
            }
            // InternalXMachine.g:2744:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )
            // InternalXMachine.g:2744:4: rule__Machine__OrderedChildrenAssignment_6_0_1
            {
            pushFollow(FOLLOW_11);
            rule__Machine__OrderedChildrenAssignment_6_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_0_1()); 
            }

            }

            // InternalXMachine.g:2747:2: ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* )
            // InternalXMachine.g:2748:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_0_1()); 
            }
            // InternalXMachine.g:2749:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_STRING) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_ID) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXMachine.g:2749:4: rule__Machine__OrderedChildrenAssignment_6_0_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Machine__OrderedChildrenAssignment_6_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_0_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6_0__1__Impl"


    // $ANTLR start "rule__Machine__Group_6_2__0"
    // InternalXMachine.g:2759:1: rule__Machine__Group_6_2__0 : rule__Machine__Group_6_2__0__Impl rule__Machine__Group_6_2__1 ;
    public final void rule__Machine__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2763:1: ( rule__Machine__Group_6_2__0__Impl rule__Machine__Group_6_2__1 )
            // InternalXMachine.g:2764:2: rule__Machine__Group_6_2__0__Impl rule__Machine__Group_6_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Machine__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6_2__0"


    // $ANTLR start "rule__Machine__Group_6_2__0__Impl"
    // InternalXMachine.g:2771:1: rule__Machine__Group_6_2__0__Impl : ( ( rule__Machine__Alternatives_6_2_0 ) ) ;
    public final void rule__Machine__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2775:1: ( ( ( rule__Machine__Alternatives_6_2_0 ) ) )
            // InternalXMachine.g:2776:1: ( ( rule__Machine__Alternatives_6_2_0 ) )
            {
            // InternalXMachine.g:2776:1: ( ( rule__Machine__Alternatives_6_2_0 ) )
            // InternalXMachine.g:2777:2: ( rule__Machine__Alternatives_6_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getAlternatives_6_2_0()); 
            }
            // InternalXMachine.g:2778:2: ( rule__Machine__Alternatives_6_2_0 )
            // InternalXMachine.g:2778:3: rule__Machine__Alternatives_6_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Alternatives_6_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getAlternatives_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6_2__0__Impl"


    // $ANTLR start "rule__Machine__Group_6_2__1"
    // InternalXMachine.g:2786:1: rule__Machine__Group_6_2__1 : rule__Machine__Group_6_2__1__Impl ;
    public final void rule__Machine__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2790:1: ( rule__Machine__Group_6_2__1__Impl )
            // InternalXMachine.g:2791:2: rule__Machine__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6_2__1"


    // $ANTLR start "rule__Machine__Group_6_2__1__Impl"
    // InternalXMachine.g:2797:1: rule__Machine__Group_6_2__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) ) ;
    public final void rule__Machine__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2801:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) ) )
            // InternalXMachine.g:2802:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) )
            {
            // InternalXMachine.g:2802:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) )
            // InternalXMachine.g:2803:2: ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* )
            {
            // InternalXMachine.g:2803:2: ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) )
            // InternalXMachine.g:2804:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_2_1()); 
            }
            // InternalXMachine.g:2805:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )
            // InternalXMachine.g:2805:4: rule__Machine__OrderedChildrenAssignment_6_2_1
            {
            pushFollow(FOLLOW_13);
            rule__Machine__OrderedChildrenAssignment_6_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_2_1()); 
            }

            }

            // InternalXMachine.g:2808:2: ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* )
            // InternalXMachine.g:2809:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_2_1()); 
            }
            // InternalXMachine.g:2810:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==RULE_XLABEL) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==RULE_XLABEL) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXMachine.g:2810:4: rule__Machine__OrderedChildrenAssignment_6_2_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Machine__OrderedChildrenAssignment_6_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_2_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6_2__1__Impl"


    // $ANTLR start "rule__Machine__Group_7__0"
    // InternalXMachine.g:2820:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2824:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:2825:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__Machine__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__0"


    // $ANTLR start "rule__Machine__Group_7__0__Impl"
    // InternalXMachine.g:2832:1: rule__Machine__Group_7__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2836:1: ( ( 'events' ) )
            // InternalXMachine.g:2837:1: ( 'events' )
            {
            // InternalXMachine.g:2837:1: ( 'events' )
            // InternalXMachine.g:2838:2: 'events'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsKeyword_7_0()); 
            }
            match(input,191,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__0__Impl"


    // $ANTLR start "rule__Machine__Group_7__1"
    // InternalXMachine.g:2847:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2851:1: ( rule__Machine__Group_7__1__Impl )
            // InternalXMachine.g:2852:2: rule__Machine__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__1"


    // $ANTLR start "rule__Machine__Group_7__1__Impl"
    // InternalXMachine.g:2858:1: rule__Machine__Group_7__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2862:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* ) ) )
            // InternalXMachine.g:2863:1: ( ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:2863:1: ( ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* ) )
            // InternalXMachine.g:2864:2: ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* )
            {
            // InternalXMachine.g:2864:2: ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) )
            // InternalXMachine.g:2865:3: ( rule__Machine__OrderedChildrenAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_7_1()); 
            }
            // InternalXMachine.g:2866:3: ( rule__Machine__OrderedChildrenAssignment_7_1 )
            // InternalXMachine.g:2866:4: rule__Machine__OrderedChildrenAssignment_7_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__OrderedChildrenAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_7_1()); 
            }

            }

            // InternalXMachine.g:2869:2: ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* )
            // InternalXMachine.g:2870:3: ( rule__Machine__OrderedChildrenAssignment_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_7_1()); 
            }
            // InternalXMachine.g:2871:3: ( rule__Machine__OrderedChildrenAssignment_7_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_STRING||(LA34_0>=180 && LA34_0<=182)||LA34_0==196) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXMachine.g:2871:4: rule__Machine__OrderedChildrenAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__OrderedChildrenAssignment_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_7_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__1__Impl"


    // $ANTLR start "rule__MContains__Group__0"
    // InternalXMachine.g:2881:1: rule__MContains__Group__0 : rule__MContains__Group__0__Impl rule__MContains__Group__1 ;
    public final void rule__MContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2885:1: ( rule__MContains__Group__0__Impl rule__MContains__Group__1 )
            // InternalXMachine.g:2886:2: rule__MContains__Group__0__Impl rule__MContains__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MContains__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MContains__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__Group__0"


    // $ANTLR start "rule__MContains__Group__0__Impl"
    // InternalXMachine.g:2893:1: rule__MContains__Group__0__Impl : ( () ) ;
    public final void rule__MContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2897:1: ( ( () ) )
            // InternalXMachine.g:2898:1: ( () )
            {
            // InternalXMachine.g:2898:1: ( () )
            // InternalXMachine.g:2899:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getContainmentAction_0()); 
            }
            // InternalXMachine.g:2900:2: ()
            // InternalXMachine.g:2900:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getContainmentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__Group__0__Impl"


    // $ANTLR start "rule__MContains__Group__1"
    // InternalXMachine.g:2908:1: rule__MContains__Group__1 : rule__MContains__Group__1__Impl ;
    public final void rule__MContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2912:1: ( rule__MContains__Group__1__Impl )
            // InternalXMachine.g:2913:2: rule__MContains__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MContains__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__Group__1"


    // $ANTLR start "rule__MContains__Group__1__Impl"
    // InternalXMachine.g:2919:1: rule__MContains__Group__1__Impl : ( ( rule__MContains__ExtensionAssignment_1 ) ) ;
    public final void rule__MContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2923:1: ( ( ( rule__MContains__ExtensionAssignment_1 ) ) )
            // InternalXMachine.g:2924:1: ( ( rule__MContains__ExtensionAssignment_1 ) )
            {
            // InternalXMachine.g:2924:1: ( ( rule__MContains__ExtensionAssignment_1 ) )
            // InternalXMachine.g:2925:2: ( rule__MContains__ExtensionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionAssignment_1()); 
            }
            // InternalXMachine.g:2926:2: ( rule__MContains__ExtensionAssignment_1 )
            // InternalXMachine.g:2926:3: rule__MContains__ExtensionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MContains__ExtensionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getExtensionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__Group__1__Impl"


    // $ANTLR start "rule__MIncludes__Group__0"
    // InternalXMachine.g:2935:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2939:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:2940:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__MIncludes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__0"


    // $ANTLR start "rule__MIncludes__Group__0__Impl"
    // InternalXMachine.g:2947:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2951:1: ( ( () ) )
            // InternalXMachine.g:2952:1: ( () )
            {
            // InternalXMachine.g:2952:1: ( () )
            // InternalXMachine.g:2953:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            }
            // InternalXMachine.g:2954:2: ()
            // InternalXMachine.g:2954:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__0__Impl"


    // $ANTLR start "rule__MIncludes__Group__1"
    // InternalXMachine.g:2962:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2966:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:2967:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MIncludes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__1"


    // $ANTLR start "rule__MIncludes__Group__1__Impl"
    // InternalXMachine.g:2974:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2978:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:2979:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:2979:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:2980:2: ( rule__MIncludes__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2981:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:2981:3: rule__MIncludes__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__1__Impl"


    // $ANTLR start "rule__MIncludes__Group__2"
    // InternalXMachine.g:2989:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2993:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:2994:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__MIncludes__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__2"


    // $ANTLR start "rule__MIncludes__Group__2__Impl"
    // InternalXMachine.g:3001:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3005:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:3006:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:3006:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:3007:2: ( rule__MIncludes__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            }
            // InternalXMachine.g:3008:2: ( rule__MIncludes__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==193) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXMachine.g:3008:3: rule__MIncludes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MIncludes__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__2__Impl"


    // $ANTLR start "rule__MIncludes__Group__3"
    // InternalXMachine.g:3016:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3020:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:3021:2: rule__MIncludes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__3"


    // $ANTLR start "rule__MIncludes__Group__3__Impl"
    // InternalXMachine.g:3027:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3031:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:3032:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:3032:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:3033:2: ( rule__MIncludes__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            }
            // InternalXMachine.g:3034:2: ( rule__MIncludes__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==194) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXMachine.g:3034:3: rule__MIncludes__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MIncludes__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group__3__Impl"


    // $ANTLR start "rule__MIncludes__Group_1__0"
    // InternalXMachine.g:3043:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3047:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:3048:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__MIncludes__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_1__0"


    // $ANTLR start "rule__MIncludes__Group_1__0__Impl"
    // InternalXMachine.g:3055:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3059:1: ( ( 'includes' ) )
            // InternalXMachine.g:3060:1: ( 'includes' )
            {
            // InternalXMachine.g:3060:1: ( 'includes' )
            // InternalXMachine.g:3061:2: 'includes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            }
            match(input,192,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_1__0__Impl"


    // $ANTLR start "rule__MIncludes__Group_1__1"
    // InternalXMachine.g:3070:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3074:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:3075:2: rule__MIncludes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_1__1"


    // $ANTLR start "rule__MIncludes__Group_1__1__Impl"
    // InternalXMachine.g:3081:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3085:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:3086:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:3086:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:3087:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            }
            // InternalXMachine.g:3088:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:3088:3: rule__MIncludes__AbstractMachineAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__AbstractMachineAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_1__1__Impl"


    // $ANTLR start "rule__MIncludes__Group_2__0"
    // InternalXMachine.g:3097:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3101:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:3102:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__MIncludes__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_2__0"


    // $ANTLR start "rule__MIncludes__Group_2__0__Impl"
    // InternalXMachine.g:3109:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3113:1: ( ( 'to' ) )
            // InternalXMachine.g:3114:1: ( 'to' )
            {
            // InternalXMachine.g:3114:1: ( 'to' )
            // InternalXMachine.g:3115:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            }
            match(input,193,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_2__0__Impl"


    // $ANTLR start "rule__MIncludes__Group_2__1"
    // InternalXMachine.g:3124:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3128:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:3129:2: rule__MIncludes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_2__1"


    // $ANTLR start "rule__MIncludes__Group_2__1__Impl"
    // InternalXMachine.g:3135:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3139:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:3140:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:3140:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:3141:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            }
            // InternalXMachine.g:3142:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:3142:3: rule__MIncludes__ConcreteMachineAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__ConcreteMachineAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_2__1__Impl"


    // $ANTLR start "rule__MIncludes__Group_3__0"
    // InternalXMachine.g:3151:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3155:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:3156:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__MIncludes__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__0"


    // $ANTLR start "rule__MIncludes__Group_3__0__Impl"
    // InternalXMachine.g:3163:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3167:1: ( ( 'as' ) )
            // InternalXMachine.g:3168:1: ( 'as' )
            {
            // InternalXMachine.g:3168:1: ( 'as' )
            // InternalXMachine.g:3169:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            }
            match(input,194,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__0__Impl"


    // $ANTLR start "rule__MIncludes__Group_3__1"
    // InternalXMachine.g:3178:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3182:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:3183:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__MIncludes__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__1"


    // $ANTLR start "rule__MIncludes__Group_3__1__Impl"
    // InternalXMachine.g:3190:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3194:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:3195:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:3195:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:3196:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            }
            // InternalXMachine.g:3197:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:3197:3: rule__MIncludes__PrefixesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__PrefixesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__1__Impl"


    // $ANTLR start "rule__MIncludes__Group_3__2"
    // InternalXMachine.g:3205:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3209:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:3210:2: rule__MIncludes__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__2"


    // $ANTLR start "rule__MIncludes__Group_3__2__Impl"
    // InternalXMachine.g:3216:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3220:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:3221:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:3221:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:3222:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            }
            // InternalXMachine.g:3223:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXMachine.g:3223:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MIncludes__PrefixesAssignment_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__Group_3__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXMachine.g:3232:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3236:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:3237:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalXMachine.g:3244:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3248:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3249:1: ( RULE_ID )
            {
            // InternalXMachine.g:3249:1: ( RULE_ID )
            // InternalXMachine.g:3250:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalXMachine.g:3259:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3263:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:3264:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalXMachine.g:3270:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3274:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:3275:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:3275:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:3276:2: ( rule__QualifiedName__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3277:2: ( rule__QualifiedName__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==97) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXMachine.g:3277:3: rule__QualifiedName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalXMachine.g:3286:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3290:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:3291:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalXMachine.g:3298:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3302:1: ( ( '.' ) )
            // InternalXMachine.g:3303:1: ( '.' )
            {
            // InternalXMachine.g:3303:1: ( '.' )
            // InternalXMachine.g:3304:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,97,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalXMachine.g:3313:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3317:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:3318:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalXMachine.g:3324:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3328:1: ( ( RULE_ID ) )
            // InternalXMachine.g:3329:1: ( RULE_ID )
            {
            // InternalXMachine.g:3329:1: ( RULE_ID )
            // InternalXMachine.g:3330:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__XMultipleVariable__Group__0"
    // InternalXMachine.g:3340:1: rule__XMultipleVariable__Group__0 : rule__XMultipleVariable__Group__0__Impl rule__XMultipleVariable__Group__1 ;
    public final void rule__XMultipleVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3344:1: ( rule__XMultipleVariable__Group__0__Impl rule__XMultipleVariable__Group__1 )
            // InternalXMachine.g:3345:2: rule__XMultipleVariable__Group__0__Impl rule__XMultipleVariable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XMultipleVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XMultipleVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleVariable__Group__0"


    // $ANTLR start "rule__XMultipleVariable__Group__0__Impl"
    // InternalXMachine.g:3352:1: rule__XMultipleVariable__Group__0__Impl : ( () ) ;
    public final void rule__XMultipleVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3356:1: ( ( () ) )
            // InternalXMachine.g:3357:1: ( () )
            {
            // InternalXMachine.g:3357:1: ( () )
            // InternalXMachine.g:3358:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleVariableAccess().getVariableAction_0()); 
            }
            // InternalXMachine.g:3359:2: ()
            // InternalXMachine.g:3359:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleVariableAccess().getVariableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleVariable__Group__0__Impl"


    // $ANTLR start "rule__XMultipleVariable__Group__1"
    // InternalXMachine.g:3367:1: rule__XMultipleVariable__Group__1 : rule__XMultipleVariable__Group__1__Impl rule__XMultipleVariable__Group__2 ;
    public final void rule__XMultipleVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3371:1: ( rule__XMultipleVariable__Group__1__Impl rule__XMultipleVariable__Group__2 )
            // InternalXMachine.g:3372:2: rule__XMultipleVariable__Group__1__Impl rule__XMultipleVariable__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__XMultipleVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XMultipleVariable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleVariable__Group__1"


    // $ANTLR start "rule__XMultipleVariable__Group__1__Impl"
    // InternalXMachine.g:3379:1: rule__XMultipleVariable__Group__1__Impl : ( ( rule__XMultipleVariable__CommentAssignment_1 )? ) ;
    public final void rule__XMultipleVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3383:1: ( ( ( rule__XMultipleVariable__CommentAssignment_1 )? ) )
            // InternalXMachine.g:3384:1: ( ( rule__XMultipleVariable__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:3384:1: ( ( rule__XMultipleVariable__CommentAssignment_1 )? )
            // InternalXMachine.g:3385:2: ( rule__XMultipleVariable__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleVariableAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:3386:2: ( rule__XMultipleVariable__CommentAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXMachine.g:3386:3: rule__XMultipleVariable__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XMultipleVariable__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleVariableAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleVariable__Group__1__Impl"


    // $ANTLR start "rule__XMultipleVariable__Group__2"
    // InternalXMachine.g:3394:1: rule__XMultipleVariable__Group__2 : rule__XMultipleVariable__Group__2__Impl ;
    public final void rule__XMultipleVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3398:1: ( rule__XMultipleVariable__Group__2__Impl )
            // InternalXMachine.g:3399:2: rule__XMultipleVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMultipleVariable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleVariable__Group__2"


    // $ANTLR start "rule__XMultipleVariable__Group__2__Impl"
    // InternalXMachine.g:3405:1: rule__XMultipleVariable__Group__2__Impl : ( ( rule__XMultipleVariable__NameAssignment_2 ) ) ;
    public final void rule__XMultipleVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3409:1: ( ( ( rule__XMultipleVariable__NameAssignment_2 ) ) )
            // InternalXMachine.g:3410:1: ( ( rule__XMultipleVariable__NameAssignment_2 ) )
            {
            // InternalXMachine.g:3410:1: ( ( rule__XMultipleVariable__NameAssignment_2 ) )
            // InternalXMachine.g:3411:2: ( rule__XMultipleVariable__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleVariableAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:3412:2: ( rule__XMultipleVariable__NameAssignment_2 )
            // InternalXMachine.g:3412:3: rule__XMultipleVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XMultipleVariable__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleVariableAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleVariable__Group__2__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group__0"
    // InternalXMachine.g:3421:1: rule__XIndividualVariable__Group__0 : rule__XIndividualVariable__Group__0__Impl rule__XIndividualVariable__Group__1 ;
    public final void rule__XIndividualVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3425:1: ( rule__XIndividualVariable__Group__0__Impl rule__XIndividualVariable__Group__1 )
            // InternalXMachine.g:3426:2: rule__XIndividualVariable__Group__0__Impl rule__XIndividualVariable__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__XIndividualVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__0"


    // $ANTLR start "rule__XIndividualVariable__Group__0__Impl"
    // InternalXMachine.g:3433:1: rule__XIndividualVariable__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3437:1: ( ( () ) )
            // InternalXMachine.g:3438:1: ( () )
            {
            // InternalXMachine.g:3438:1: ( () )
            // InternalXMachine.g:3439:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getTypedVariableAction_0()); 
            }
            // InternalXMachine.g:3440:2: ()
            // InternalXMachine.g:3440:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getTypedVariableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__0__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group__1"
    // InternalXMachine.g:3448:1: rule__XIndividualVariable__Group__1 : rule__XIndividualVariable__Group__1__Impl rule__XIndividualVariable__Group__2 ;
    public final void rule__XIndividualVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3452:1: ( rule__XIndividualVariable__Group__1__Impl rule__XIndividualVariable__Group__2 )
            // InternalXMachine.g:3453:2: rule__XIndividualVariable__Group__1__Impl rule__XIndividualVariable__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__XIndividualVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__1"


    // $ANTLR start "rule__XIndividualVariable__Group__1__Impl"
    // InternalXMachine.g:3460:1: rule__XIndividualVariable__Group__1__Impl : ( ( rule__XIndividualVariable__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3464:1: ( ( ( rule__XIndividualVariable__CommentAssignment_1 )? ) )
            // InternalXMachine.g:3465:1: ( ( rule__XIndividualVariable__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:3465:1: ( ( rule__XIndividualVariable__CommentAssignment_1 )? )
            // InternalXMachine.g:3466:2: ( rule__XIndividualVariable__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:3467:2: ( rule__XIndividualVariable__CommentAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:3467:3: rule__XIndividualVariable__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XIndividualVariable__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__1__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group__2"
    // InternalXMachine.g:3475:1: rule__XIndividualVariable__Group__2 : rule__XIndividualVariable__Group__2__Impl rule__XIndividualVariable__Group__3 ;
    public final void rule__XIndividualVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3479:1: ( rule__XIndividualVariable__Group__2__Impl rule__XIndividualVariable__Group__3 )
            // InternalXMachine.g:3480:2: rule__XIndividualVariable__Group__2__Impl rule__XIndividualVariable__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__XIndividualVariable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__2"


    // $ANTLR start "rule__XIndividualVariable__Group__2__Impl"
    // InternalXMachine.g:3487:1: rule__XIndividualVariable__Group__2__Impl : ( ( rule__XIndividualVariable__Alternatives_2 ) ) ;
    public final void rule__XIndividualVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3491:1: ( ( ( rule__XIndividualVariable__Alternatives_2 ) ) )
            // InternalXMachine.g:3492:1: ( ( rule__XIndividualVariable__Alternatives_2 ) )
            {
            // InternalXMachine.g:3492:1: ( ( rule__XIndividualVariable__Alternatives_2 ) )
            // InternalXMachine.g:3493:2: ( rule__XIndividualVariable__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getAlternatives_2()); 
            }
            // InternalXMachine.g:3494:2: ( rule__XIndividualVariable__Alternatives_2 )
            // InternalXMachine.g:3494:3: rule__XIndividualVariable__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__2__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group__3"
    // InternalXMachine.g:3502:1: rule__XIndividualVariable__Group__3 : rule__XIndividualVariable__Group__3__Impl rule__XIndividualVariable__Group__4 ;
    public final void rule__XIndividualVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3506:1: ( rule__XIndividualVariable__Group__3__Impl rule__XIndividualVariable__Group__4 )
            // InternalXMachine.g:3507:2: rule__XIndividualVariable__Group__3__Impl rule__XIndividualVariable__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__XIndividualVariable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__3"


    // $ANTLR start "rule__XIndividualVariable__Group__3__Impl"
    // InternalXMachine.g:3514:1: rule__XIndividualVariable__Group__3__Impl : ( ( rule__XIndividualVariable__NameAssignment_3 ) ) ;
    public final void rule__XIndividualVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3518:1: ( ( ( rule__XIndividualVariable__NameAssignment_3 ) ) )
            // InternalXMachine.g:3519:1: ( ( rule__XIndividualVariable__NameAssignment_3 ) )
            {
            // InternalXMachine.g:3519:1: ( ( rule__XIndividualVariable__NameAssignment_3 ) )
            // InternalXMachine.g:3520:2: ( rule__XIndividualVariable__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:3521:2: ( rule__XIndividualVariable__NameAssignment_3 )
            // InternalXMachine.g:3521:3: rule__XIndividualVariable__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__3__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group__4"
    // InternalXMachine.g:3529:1: rule__XIndividualVariable__Group__4 : rule__XIndividualVariable__Group__4__Impl rule__XIndividualVariable__Group__5 ;
    public final void rule__XIndividualVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3533:1: ( rule__XIndividualVariable__Group__4__Impl rule__XIndividualVariable__Group__5 )
            // InternalXMachine.g:3534:2: rule__XIndividualVariable__Group__4__Impl rule__XIndividualVariable__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__XIndividualVariable__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__4"


    // $ANTLR start "rule__XIndividualVariable__Group__4__Impl"
    // InternalXMachine.g:3541:1: rule__XIndividualVariable__Group__4__Impl : ( ( rule__XIndividualVariable__Group_4__0 )? ) ;
    public final void rule__XIndividualVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3545:1: ( ( ( rule__XIndividualVariable__Group_4__0 )? ) )
            // InternalXMachine.g:3546:1: ( ( rule__XIndividualVariable__Group_4__0 )? )
            {
            // InternalXMachine.g:3546:1: ( ( rule__XIndividualVariable__Group_4__0 )? )
            // InternalXMachine.g:3547:2: ( rule__XIndividualVariable__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getGroup_4()); 
            }
            // InternalXMachine.g:3548:2: ( rule__XIndividualVariable__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==108) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:3548:3: rule__XIndividualVariable__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XIndividualVariable__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__4__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group__5"
    // InternalXMachine.g:3556:1: rule__XIndividualVariable__Group__5 : rule__XIndividualVariable__Group__5__Impl ;
    public final void rule__XIndividualVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3560:1: ( rule__XIndividualVariable__Group__5__Impl )
            // InternalXMachine.g:3561:2: rule__XIndividualVariable__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__5"


    // $ANTLR start "rule__XIndividualVariable__Group__5__Impl"
    // InternalXMachine.g:3567:1: rule__XIndividualVariable__Group__5__Impl : ( ( rule__XIndividualVariable__Group_5__0 )? ) ;
    public final void rule__XIndividualVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3571:1: ( ( ( rule__XIndividualVariable__Group_5__0 )? ) )
            // InternalXMachine.g:3572:1: ( ( rule__XIndividualVariable__Group_5__0 )? )
            {
            // InternalXMachine.g:3572:1: ( ( rule__XIndividualVariable__Group_5__0 )? )
            // InternalXMachine.g:3573:2: ( rule__XIndividualVariable__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getGroup_5()); 
            }
            // InternalXMachine.g:3574:2: ( rule__XIndividualVariable__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==98) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:3574:3: rule__XIndividualVariable__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XIndividualVariable__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group__5__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group_4__0"
    // InternalXMachine.g:3583:1: rule__XIndividualVariable__Group_4__0 : rule__XIndividualVariable__Group_4__0__Impl rule__XIndividualVariable__Group_4__1 ;
    public final void rule__XIndividualVariable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3587:1: ( rule__XIndividualVariable__Group_4__0__Impl rule__XIndividualVariable__Group_4__1 )
            // InternalXMachine.g:3588:2: rule__XIndividualVariable__Group_4__0__Impl rule__XIndividualVariable__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__XIndividualVariable__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group_4__0"


    // $ANTLR start "rule__XIndividualVariable__Group_4__0__Impl"
    // InternalXMachine.g:3595:1: rule__XIndividualVariable__Group_4__0__Impl : ( ':' ) ;
    public final void rule__XIndividualVariable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3599:1: ( ( ':' ) )
            // InternalXMachine.g:3600:1: ( ':' )
            {
            // InternalXMachine.g:3600:1: ( ':' )
            // InternalXMachine.g:3601:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getColonKeyword_4_0()); 
            }
            match(input,108,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getColonKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group_4__0__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group_4__1"
    // InternalXMachine.g:3610:1: rule__XIndividualVariable__Group_4__1 : rule__XIndividualVariable__Group_4__1__Impl ;
    public final void rule__XIndividualVariable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3614:1: ( rule__XIndividualVariable__Group_4__1__Impl )
            // InternalXMachine.g:3615:2: rule__XIndividualVariable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group_4__1"


    // $ANTLR start "rule__XIndividualVariable__Group_4__1__Impl"
    // InternalXMachine.g:3621:1: rule__XIndividualVariable__Group_4__1__Impl : ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) ) ;
    public final void rule__XIndividualVariable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3625:1: ( ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) ) )
            // InternalXMachine.g:3626:1: ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) )
            {
            // InternalXMachine.g:3626:1: ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) )
            // InternalXMachine.g:3627:2: ( rule__XIndividualVariable__TypeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getTypeAssignment_4_1()); 
            }
            // InternalXMachine.g:3628:2: ( rule__XIndividualVariable__TypeAssignment_4_1 )
            // InternalXMachine.g:3628:3: rule__XIndividualVariable__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__TypeAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getTypeAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group_4__1__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group_5__0"
    // InternalXMachine.g:3637:1: rule__XIndividualVariable__Group_5__0 : rule__XIndividualVariable__Group_5__0__Impl rule__XIndividualVariable__Group_5__1 ;
    public final void rule__XIndividualVariable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3641:1: ( rule__XIndividualVariable__Group_5__0__Impl rule__XIndividualVariable__Group_5__1 )
            // InternalXMachine.g:3642:2: rule__XIndividualVariable__Group_5__0__Impl rule__XIndividualVariable__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__XIndividualVariable__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group_5__0"


    // $ANTLR start "rule__XIndividualVariable__Group_5__0__Impl"
    // InternalXMachine.g:3649:1: rule__XIndividualVariable__Group_5__0__Impl : ( '=' ) ;
    public final void rule__XIndividualVariable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3653:1: ( ( '=' ) )
            // InternalXMachine.g:3654:1: ( '=' )
            {
            // InternalXMachine.g:3654:1: ( '=' )
            // InternalXMachine.g:3655:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getEqualsSignKeyword_5_0()); 
            }
            match(input,98,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getEqualsSignKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group_5__0__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group_5__1"
    // InternalXMachine.g:3664:1: rule__XIndividualVariable__Group_5__1 : rule__XIndividualVariable__Group_5__1__Impl ;
    public final void rule__XIndividualVariable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3668:1: ( rule__XIndividualVariable__Group_5__1__Impl )
            // InternalXMachine.g:3669:2: rule__XIndividualVariable__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group_5__1"


    // $ANTLR start "rule__XIndividualVariable__Group_5__1__Impl"
    // InternalXMachine.g:3675:1: rule__XIndividualVariable__Group_5__1__Impl : ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) ) ;
    public final void rule__XIndividualVariable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3679:1: ( ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) ) )
            // InternalXMachine.g:3680:1: ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) )
            {
            // InternalXMachine.g:3680:1: ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) )
            // InternalXMachine.g:3681:2: ( rule__XIndividualVariable__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getValueAssignment_5_1()); 
            }
            // InternalXMachine.g:3682:2: ( rule__XIndividualVariable__ValueAssignment_5_1 )
            // InternalXMachine.g:3682:3: rule__XIndividualVariable__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualVariable__ValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getValueAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__Group_5__1__Impl"


    // $ANTLR start "rule__XType__Group__0"
    // InternalXMachine.g:3691:1: rule__XType__Group__0 : rule__XType__Group__0__Impl rule__XType__Group__1 ;
    public final void rule__XType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3695:1: ( rule__XType__Group__0__Impl rule__XType__Group__1 )
            // InternalXMachine.g:3696:2: rule__XType__Group__0__Impl rule__XType__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__XType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XType__Group__0"


    // $ANTLR start "rule__XType__Group__0__Impl"
    // InternalXMachine.g:3703:1: rule__XType__Group__0__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3707:1: ( ( ruleXTypePrimitive ) )
            // InternalXMachine.g:3708:1: ( ruleXTypePrimitive )
            {
            // InternalXMachine.g:3708:1: ( ruleXTypePrimitive )
            // InternalXMachine.g:3709:2: ruleXTypePrimitive
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXTypePrimitive();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XType__Group__0__Impl"


    // $ANTLR start "rule__XType__Group__1"
    // InternalXMachine.g:3718:1: rule__XType__Group__1 : rule__XType__Group__1__Impl ;
    public final void rule__XType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3722:1: ( rule__XType__Group__1__Impl )
            // InternalXMachine.g:3723:2: rule__XType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XType__Group__1"


    // $ANTLR start "rule__XType__Group__1__Impl"
    // InternalXMachine.g:3729:1: rule__XType__Group__1__Impl : ( ( rule__XType__Group_1__0 )* ) ;
    public final void rule__XType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3733:1: ( ( ( rule__XType__Group_1__0 )* ) )
            // InternalXMachine.g:3734:1: ( ( rule__XType__Group_1__0 )* )
            {
            // InternalXMachine.g:3734:1: ( ( rule__XType__Group_1__0 )* )
            // InternalXMachine.g:3735:2: ( rule__XType__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypeAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3736:2: ( rule__XType__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=18 && LA43_0<=41)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXMachine.g:3736:3: rule__XType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__XType__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypeAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XType__Group__1__Impl"


    // $ANTLR start "rule__XType__Group_1__0"
    // InternalXMachine.g:3745:1: rule__XType__Group_1__0 : rule__XType__Group_1__0__Impl rule__XType__Group_1__1 ;
    public final void rule__XType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3749:1: ( rule__XType__Group_1__0__Impl rule__XType__Group_1__1 )
            // InternalXMachine.g:3750:2: rule__XType__Group_1__0__Impl rule__XType__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__XType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XType__Group_1__0"


    // $ANTLR start "rule__XType__Group_1__0__Impl"
    // InternalXMachine.g:3757:1: rule__XType__Group_1__0__Impl : ( ruleXTYPEOPERATOR ) ;
    public final void rule__XType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3761:1: ( ( ruleXTYPEOPERATOR ) )
            // InternalXMachine.g:3762:1: ( ruleXTYPEOPERATOR )
            {
            // InternalXMachine.g:3762:1: ( ruleXTYPEOPERATOR )
            // InternalXMachine.g:3763:2: ruleXTYPEOPERATOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypeAccess().getXTYPEOPERATORParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXTYPEOPERATOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypeAccess().getXTYPEOPERATORParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XType__Group_1__0__Impl"


    // $ANTLR start "rule__XType__Group_1__1"
    // InternalXMachine.g:3772:1: rule__XType__Group_1__1 : rule__XType__Group_1__1__Impl ;
    public final void rule__XType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3776:1: ( rule__XType__Group_1__1__Impl )
            // InternalXMachine.g:3777:2: rule__XType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XType__Group_1__1"


    // $ANTLR start "rule__XType__Group_1__1__Impl"
    // InternalXMachine.g:3783:1: rule__XType__Group_1__1__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3787:1: ( ( ruleXTypePrimitive ) )
            // InternalXMachine.g:3788:1: ( ruleXTypePrimitive )
            {
            // InternalXMachine.g:3788:1: ( ruleXTypePrimitive )
            // InternalXMachine.g:3789:2: ruleXTypePrimitive
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleXTypePrimitive();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XType__Group_1__1__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_5__0"
    // InternalXMachine.g:3799:1: rule__XTypePrimitive__Group_5__0 : rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 ;
    public final void rule__XTypePrimitive__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3803:1: ( rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 )
            // InternalXMachine.g:3804:2: rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__XTypePrimitive__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_5__0"


    // $ANTLR start "rule__XTypePrimitive__Group_5__0__Impl"
    // InternalXMachine.g:3811:1: rule__XTypePrimitive__Group_5__0__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3815:1: ( ( '(' ) )
            // InternalXMachine.g:3816:1: ( '(' )
            {
            // InternalXMachine.g:3816:1: ( '(' )
            // InternalXMachine.g:3817:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_5__0__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_5__1"
    // InternalXMachine.g:3826:1: rule__XTypePrimitive__Group_5__1 : rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 ;
    public final void rule__XTypePrimitive__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3830:1: ( rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 )
            // InternalXMachine.g:3831:2: rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2
            {
            pushFollow(FOLLOW_24);
            rule__XTypePrimitive__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_5__1"


    // $ANTLR start "rule__XTypePrimitive__Group_5__1__Impl"
    // InternalXMachine.g:3838:1: rule__XTypePrimitive__Group_5__1__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3842:1: ( ( ruleXType ) )
            // InternalXMachine.g:3843:1: ( ruleXType )
            {
            // InternalXMachine.g:3843:1: ( ruleXType )
            // InternalXMachine.g:3844:2: ruleXType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleXType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_5__1__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_5__2"
    // InternalXMachine.g:3853:1: rule__XTypePrimitive__Group_5__2 : rule__XTypePrimitive__Group_5__2__Impl ;
    public final void rule__XTypePrimitive__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3857:1: ( rule__XTypePrimitive__Group_5__2__Impl )
            // InternalXMachine.g:3858:2: rule__XTypePrimitive__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_5__2"


    // $ANTLR start "rule__XTypePrimitive__Group_5__2__Impl"
    // InternalXMachine.g:3864:1: rule__XTypePrimitive__Group_5__2__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3868:1: ( ( ')' ) )
            // InternalXMachine.g:3869:1: ( ')' )
            {
            // InternalXMachine.g:3869:1: ( ')' )
            // InternalXMachine.g:3870:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_5__2__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_6__0"
    // InternalXMachine.g:3880:1: rule__XTypePrimitive__Group_6__0 : rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 ;
    public final void rule__XTypePrimitive__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3884:1: ( rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 )
            // InternalXMachine.g:3885:2: rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1
            {
            pushFollow(FOLLOW_25);
            rule__XTypePrimitive__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_6__0"


    // $ANTLR start "rule__XTypePrimitive__Group_6__0__Impl"
    // InternalXMachine.g:3892:1: rule__XTypePrimitive__Group_6__0__Impl : ( '\\u2119' ) ;
    public final void rule__XTypePrimitive__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3896:1: ( ( '\\u2119' ) )
            // InternalXMachine.g:3897:1: ( '\\u2119' )
            {
            // InternalXMachine.g:3897:1: ( '\\u2119' )
            // InternalXMachine.g:3898:2: '\\u2119'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0()); 
            }
            match(input,72,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_6__0__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_6__1"
    // InternalXMachine.g:3907:1: rule__XTypePrimitive__Group_6__1 : rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 ;
    public final void rule__XTypePrimitive__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3911:1: ( rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 )
            // InternalXMachine.g:3912:2: rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2
            {
            pushFollow(FOLLOW_20);
            rule__XTypePrimitive__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_6__1"


    // $ANTLR start "rule__XTypePrimitive__Group_6__1__Impl"
    // InternalXMachine.g:3919:1: rule__XTypePrimitive__Group_6__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3923:1: ( ( '(' ) )
            // InternalXMachine.g:3924:1: ( '(' )
            {
            // InternalXMachine.g:3924:1: ( '(' )
            // InternalXMachine.g:3925:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_6__1__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_6__2"
    // InternalXMachine.g:3934:1: rule__XTypePrimitive__Group_6__2 : rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 ;
    public final void rule__XTypePrimitive__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3938:1: ( rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 )
            // InternalXMachine.g:3939:2: rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3
            {
            pushFollow(FOLLOW_24);
            rule__XTypePrimitive__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_6__2"


    // $ANTLR start "rule__XTypePrimitive__Group_6__2__Impl"
    // InternalXMachine.g:3946:1: rule__XTypePrimitive__Group_6__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3950:1: ( ( ruleXType ) )
            // InternalXMachine.g:3951:1: ( ruleXType )
            {
            // InternalXMachine.g:3951:1: ( ruleXType )
            // InternalXMachine.g:3952:2: ruleXType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_6_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleXType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_6__2__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_6__3"
    // InternalXMachine.g:3961:1: rule__XTypePrimitive__Group_6__3 : rule__XTypePrimitive__Group_6__3__Impl ;
    public final void rule__XTypePrimitive__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3965:1: ( rule__XTypePrimitive__Group_6__3__Impl )
            // InternalXMachine.g:3966:2: rule__XTypePrimitive__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_6__3"


    // $ANTLR start "rule__XTypePrimitive__Group_6__3__Impl"
    // InternalXMachine.g:3972:1: rule__XTypePrimitive__Group_6__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3976:1: ( ( ')' ) )
            // InternalXMachine.g:3977:1: ( ')' )
            {
            // InternalXMachine.g:3977:1: ( ')' )
            // InternalXMachine.g:3978:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_6__3__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_7__0"
    // InternalXMachine.g:3988:1: rule__XTypePrimitive__Group_7__0 : rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 ;
    public final void rule__XTypePrimitive__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3992:1: ( rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 )
            // InternalXMachine.g:3993:2: rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1
            {
            pushFollow(FOLLOW_25);
            rule__XTypePrimitive__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_7__0"


    // $ANTLR start "rule__XTypePrimitive__Group_7__0__Impl"
    // InternalXMachine.g:4000:1: rule__XTypePrimitive__Group_7__0__Impl : ( '\\u21191' ) ;
    public final void rule__XTypePrimitive__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4004:1: ( ( '\\u21191' ) )
            // InternalXMachine.g:4005:1: ( '\\u21191' )
            {
            // InternalXMachine.g:4005:1: ( '\\u21191' )
            // InternalXMachine.g:4006:2: '\\u21191'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_7__0__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_7__1"
    // InternalXMachine.g:4015:1: rule__XTypePrimitive__Group_7__1 : rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 ;
    public final void rule__XTypePrimitive__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4019:1: ( rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 )
            // InternalXMachine.g:4020:2: rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__XTypePrimitive__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_7__1"


    // $ANTLR start "rule__XTypePrimitive__Group_7__1__Impl"
    // InternalXMachine.g:4027:1: rule__XTypePrimitive__Group_7__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4031:1: ( ( '(' ) )
            // InternalXMachine.g:4032:1: ( '(' )
            {
            // InternalXMachine.g:4032:1: ( '(' )
            // InternalXMachine.g:4033:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_7__1__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_7__2"
    // InternalXMachine.g:4042:1: rule__XTypePrimitive__Group_7__2 : rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 ;
    public final void rule__XTypePrimitive__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4046:1: ( rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 )
            // InternalXMachine.g:4047:2: rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3
            {
            pushFollow(FOLLOW_24);
            rule__XTypePrimitive__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_7__2"


    // $ANTLR start "rule__XTypePrimitive__Group_7__2__Impl"
    // InternalXMachine.g:4054:1: rule__XTypePrimitive__Group_7__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4058:1: ( ( ruleXType ) )
            // InternalXMachine.g:4059:1: ( ruleXType )
            {
            // InternalXMachine.g:4059:1: ( ruleXType )
            // InternalXMachine.g:4060:2: ruleXType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_7_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleXType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_7__2__Impl"


    // $ANTLR start "rule__XTypePrimitive__Group_7__3"
    // InternalXMachine.g:4069:1: rule__XTypePrimitive__Group_7__3 : rule__XTypePrimitive__Group_7__3__Impl ;
    public final void rule__XTypePrimitive__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4073:1: ( rule__XTypePrimitive__Group_7__3__Impl )
            // InternalXMachine.g:4074:2: rule__XTypePrimitive__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XTypePrimitive__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_7__3"


    // $ANTLR start "rule__XTypePrimitive__Group_7__3__Impl"
    // InternalXMachine.g:4080:1: rule__XTypePrimitive__Group_7__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4084:1: ( ( ')' ) )
            // InternalXMachine.g:4085:1: ( ')' )
            {
            // InternalXMachine.g:4085:1: ( ')' )
            // InternalXMachine.g:4086:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_7_3()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypePrimitive__Group_7__3__Impl"


    // $ANTLR start "rule__XMultipleInvariant__Group__0"
    // InternalXMachine.g:4096:1: rule__XMultipleInvariant__Group__0 : rule__XMultipleInvariant__Group__0__Impl rule__XMultipleInvariant__Group__1 ;
    public final void rule__XMultipleInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4100:1: ( rule__XMultipleInvariant__Group__0__Impl rule__XMultipleInvariant__Group__1 )
            // InternalXMachine.g:4101:2: rule__XMultipleInvariant__Group__0__Impl rule__XMultipleInvariant__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__XMultipleInvariant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XMultipleInvariant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__Group__0"


    // $ANTLR start "rule__XMultipleInvariant__Group__0__Impl"
    // InternalXMachine.g:4108:1: rule__XMultipleInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XMultipleInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4112:1: ( ( () ) )
            // InternalXMachine.g:4113:1: ( () )
            {
            // InternalXMachine.g:4113:1: ( () )
            // InternalXMachine.g:4114:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:4115:2: ()
            // InternalXMachine.g:4115:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleInvariantAccess().getInvariantAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__Group__0__Impl"


    // $ANTLR start "rule__XMultipleInvariant__Group__1"
    // InternalXMachine.g:4123:1: rule__XMultipleInvariant__Group__1 : rule__XMultipleInvariant__Group__1__Impl rule__XMultipleInvariant__Group__2 ;
    public final void rule__XMultipleInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4127:1: ( rule__XMultipleInvariant__Group__1__Impl rule__XMultipleInvariant__Group__2 )
            // InternalXMachine.g:4128:2: rule__XMultipleInvariant__Group__1__Impl rule__XMultipleInvariant__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__XMultipleInvariant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XMultipleInvariant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__Group__1"


    // $ANTLR start "rule__XMultipleInvariant__Group__1__Impl"
    // InternalXMachine.g:4135:1: rule__XMultipleInvariant__Group__1__Impl : ( ( rule__XMultipleInvariant__CommentAssignment_1 )? ) ;
    public final void rule__XMultipleInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4139:1: ( ( ( rule__XMultipleInvariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:4140:1: ( ( rule__XMultipleInvariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:4140:1: ( ( rule__XMultipleInvariant__CommentAssignment_1 )? )
            // InternalXMachine.g:4141:2: ( rule__XMultipleInvariant__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:4142:2: ( rule__XMultipleInvariant__CommentAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:4142:3: rule__XMultipleInvariant__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XMultipleInvariant__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleInvariantAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__Group__1__Impl"


    // $ANTLR start "rule__XMultipleInvariant__Group__2"
    // InternalXMachine.g:4150:1: rule__XMultipleInvariant__Group__2 : rule__XMultipleInvariant__Group__2__Impl rule__XMultipleInvariant__Group__3 ;
    public final void rule__XMultipleInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4154:1: ( rule__XMultipleInvariant__Group__2__Impl rule__XMultipleInvariant__Group__3 )
            // InternalXMachine.g:4155:2: rule__XMultipleInvariant__Group__2__Impl rule__XMultipleInvariant__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__XMultipleInvariant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XMultipleInvariant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__Group__2"


    // $ANTLR start "rule__XMultipleInvariant__Group__2__Impl"
    // InternalXMachine.g:4162:1: rule__XMultipleInvariant__Group__2__Impl : ( ( rule__XMultipleInvariant__NameAssignment_2 ) ) ;
    public final void rule__XMultipleInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4166:1: ( ( ( rule__XMultipleInvariant__NameAssignment_2 ) ) )
            // InternalXMachine.g:4167:1: ( ( rule__XMultipleInvariant__NameAssignment_2 ) )
            {
            // InternalXMachine.g:4167:1: ( ( rule__XMultipleInvariant__NameAssignment_2 ) )
            // InternalXMachine.g:4168:2: ( rule__XMultipleInvariant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:4169:2: ( rule__XMultipleInvariant__NameAssignment_2 )
            // InternalXMachine.g:4169:3: rule__XMultipleInvariant__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XMultipleInvariant__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleInvariantAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__Group__2__Impl"


    // $ANTLR start "rule__XMultipleInvariant__Group__3"
    // InternalXMachine.g:4177:1: rule__XMultipleInvariant__Group__3 : rule__XMultipleInvariant__Group__3__Impl ;
    public final void rule__XMultipleInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4181:1: ( rule__XMultipleInvariant__Group__3__Impl )
            // InternalXMachine.g:4182:2: rule__XMultipleInvariant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMultipleInvariant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__Group__3"


    // $ANTLR start "rule__XMultipleInvariant__Group__3__Impl"
    // InternalXMachine.g:4188:1: rule__XMultipleInvariant__Group__3__Impl : ( ( rule__XMultipleInvariant__PredicateAssignment_3 ) ) ;
    public final void rule__XMultipleInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4192:1: ( ( ( rule__XMultipleInvariant__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:4193:1: ( ( rule__XMultipleInvariant__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:4193:1: ( ( rule__XMultipleInvariant__PredicateAssignment_3 ) )
            // InternalXMachine.g:4194:2: ( rule__XMultipleInvariant__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:4195:2: ( rule__XMultipleInvariant__PredicateAssignment_3 )
            // InternalXMachine.g:4195:3: rule__XMultipleInvariant__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XMultipleInvariant__PredicateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleInvariantAccess().getPredicateAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__Group__3__Impl"


    // $ANTLR start "rule__XIndividualInvariant__Group__0"
    // InternalXMachine.g:4204:1: rule__XIndividualInvariant__Group__0 : rule__XIndividualInvariant__Group__0__Impl rule__XIndividualInvariant__Group__1 ;
    public final void rule__XIndividualInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4208:1: ( rule__XIndividualInvariant__Group__0__Impl rule__XIndividualInvariant__Group__1 )
            // InternalXMachine.g:4209:2: rule__XIndividualInvariant__Group__0__Impl rule__XIndividualInvariant__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__XIndividualInvariant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualInvariant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Group__0"


    // $ANTLR start "rule__XIndividualInvariant__Group__0__Impl"
    // InternalXMachine.g:4216:1: rule__XIndividualInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4220:1: ( ( () ) )
            // InternalXMachine.g:4221:1: ( () )
            {
            // InternalXMachine.g:4221:1: ( () )
            // InternalXMachine.g:4222:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:4223:2: ()
            // InternalXMachine.g:4223:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getInvariantAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Group__0__Impl"


    // $ANTLR start "rule__XIndividualInvariant__Group__1"
    // InternalXMachine.g:4231:1: rule__XIndividualInvariant__Group__1 : rule__XIndividualInvariant__Group__1__Impl rule__XIndividualInvariant__Group__2 ;
    public final void rule__XIndividualInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4235:1: ( rule__XIndividualInvariant__Group__1__Impl rule__XIndividualInvariant__Group__2 )
            // InternalXMachine.g:4236:2: rule__XIndividualInvariant__Group__1__Impl rule__XIndividualInvariant__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__XIndividualInvariant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualInvariant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Group__1"


    // $ANTLR start "rule__XIndividualInvariant__Group__1__Impl"
    // InternalXMachine.g:4243:1: rule__XIndividualInvariant__Group__1__Impl : ( ( rule__XIndividualInvariant__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4247:1: ( ( ( rule__XIndividualInvariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:4248:1: ( ( rule__XIndividualInvariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:4248:1: ( ( rule__XIndividualInvariant__CommentAssignment_1 )? )
            // InternalXMachine.g:4249:2: ( rule__XIndividualInvariant__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:4250:2: ( rule__XIndividualInvariant__CommentAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:4250:3: rule__XIndividualInvariant__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XIndividualInvariant__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Group__1__Impl"


    // $ANTLR start "rule__XIndividualInvariant__Group__2"
    // InternalXMachine.g:4258:1: rule__XIndividualInvariant__Group__2 : rule__XIndividualInvariant__Group__2__Impl rule__XIndividualInvariant__Group__3 ;
    public final void rule__XIndividualInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4262:1: ( rule__XIndividualInvariant__Group__2__Impl rule__XIndividualInvariant__Group__3 )
            // InternalXMachine.g:4263:2: rule__XIndividualInvariant__Group__2__Impl rule__XIndividualInvariant__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__XIndividualInvariant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualInvariant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Group__2"


    // $ANTLR start "rule__XIndividualInvariant__Group__2__Impl"
    // InternalXMachine.g:4270:1: rule__XIndividualInvariant__Group__2__Impl : ( ( rule__XIndividualInvariant__Alternatives_2 ) ) ;
    public final void rule__XIndividualInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4274:1: ( ( ( rule__XIndividualInvariant__Alternatives_2 ) ) )
            // InternalXMachine.g:4275:1: ( ( rule__XIndividualInvariant__Alternatives_2 ) )
            {
            // InternalXMachine.g:4275:1: ( ( rule__XIndividualInvariant__Alternatives_2 ) )
            // InternalXMachine.g:4276:2: ( rule__XIndividualInvariant__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getAlternatives_2()); 
            }
            // InternalXMachine.g:4277:2: ( rule__XIndividualInvariant__Alternatives_2 )
            // InternalXMachine.g:4277:3: rule__XIndividualInvariant__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualInvariant__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Group__2__Impl"


    // $ANTLR start "rule__XIndividualInvariant__Group__3"
    // InternalXMachine.g:4285:1: rule__XIndividualInvariant__Group__3 : rule__XIndividualInvariant__Group__3__Impl rule__XIndividualInvariant__Group__4 ;
    public final void rule__XIndividualInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4289:1: ( rule__XIndividualInvariant__Group__3__Impl rule__XIndividualInvariant__Group__4 )
            // InternalXMachine.g:4290:2: rule__XIndividualInvariant__Group__3__Impl rule__XIndividualInvariant__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__XIndividualInvariant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XIndividualInvariant__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Group__3"


    // $ANTLR start "rule__XIndividualInvariant__Group__3__Impl"
    // InternalXMachine.g:4297:1: rule__XIndividualInvariant__Group__3__Impl : ( ( rule__XIndividualInvariant__NameAssignment_3 ) ) ;
    public final void rule__XIndividualInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4301:1: ( ( ( rule__XIndividualInvariant__NameAssignment_3 ) ) )
            // InternalXMachine.g:4302:1: ( ( rule__XIndividualInvariant__NameAssignment_3 ) )
            {
            // InternalXMachine.g:4302:1: ( ( rule__XIndividualInvariant__NameAssignment_3 ) )
            // InternalXMachine.g:4303:2: ( rule__XIndividualInvariant__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:4304:2: ( rule__XIndividualInvariant__NameAssignment_3 )
            // InternalXMachine.g:4304:3: rule__XIndividualInvariant__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualInvariant__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Group__3__Impl"


    // $ANTLR start "rule__XIndividualInvariant__Group__4"
    // InternalXMachine.g:4312:1: rule__XIndividualInvariant__Group__4 : rule__XIndividualInvariant__Group__4__Impl ;
    public final void rule__XIndividualInvariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4316:1: ( rule__XIndividualInvariant__Group__4__Impl )
            // InternalXMachine.g:4317:2: rule__XIndividualInvariant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualInvariant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Group__4"


    // $ANTLR start "rule__XIndividualInvariant__Group__4__Impl"
    // InternalXMachine.g:4323:1: rule__XIndividualInvariant__Group__4__Impl : ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) ) ;
    public final void rule__XIndividualInvariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4327:1: ( ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) ) )
            // InternalXMachine.g:4328:1: ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) )
            {
            // InternalXMachine.g:4328:1: ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) )
            // InternalXMachine.g:4329:2: ( rule__XIndividualInvariant__PredicateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getPredicateAssignment_4()); 
            }
            // InternalXMachine.g:4330:2: ( rule__XIndividualInvariant__PredicateAssignment_4 )
            // InternalXMachine.g:4330:3: rule__XIndividualInvariant__PredicateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XIndividualInvariant__PredicateAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getPredicateAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__Group__4__Impl"


    // $ANTLR start "rule__XVariant__Group__0"
    // InternalXMachine.g:4339:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4343:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:4344:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__XVariant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__0"


    // $ANTLR start "rule__XVariant__Group__0__Impl"
    // InternalXMachine.g:4351:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4355:1: ( ( () ) )
            // InternalXMachine.g:4356:1: ( () )
            {
            // InternalXMachine.g:4356:1: ( () )
            // InternalXMachine.g:4357:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            }
            // InternalXMachine.g:4358:2: ()
            // InternalXMachine.g:4358:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__0__Impl"


    // $ANTLR start "rule__XVariant__Group__1"
    // InternalXMachine.g:4366:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl rule__XVariant__Group__2 ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4370:1: ( rule__XVariant__Group__1__Impl rule__XVariant__Group__2 )
            // InternalXMachine.g:4371:2: rule__XVariant__Group__1__Impl rule__XVariant__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__XVariant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__1"


    // $ANTLR start "rule__XVariant__Group__1__Impl"
    // InternalXMachine.g:4378:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__CommentAssignment_1 )? ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4382:1: ( ( ( rule__XVariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:4383:1: ( ( rule__XVariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:4383:1: ( ( rule__XVariant__CommentAssignment_1 )? )
            // InternalXMachine.g:4384:2: ( rule__XVariant__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:4385:2: ( rule__XVariant__CommentAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:4385:3: rule__XVariant__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XVariant__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__1__Impl"


    // $ANTLR start "rule__XVariant__Group__2"
    // InternalXMachine.g:4393:1: rule__XVariant__Group__2 : rule__XVariant__Group__2__Impl rule__XVariant__Group__3 ;
    public final void rule__XVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4397:1: ( rule__XVariant__Group__2__Impl rule__XVariant__Group__3 )
            // InternalXMachine.g:4398:2: rule__XVariant__Group__2__Impl rule__XVariant__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__XVariant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__2"


    // $ANTLR start "rule__XVariant__Group__2__Impl"
    // InternalXMachine.g:4405:1: rule__XVariant__Group__2__Impl : ( 'variant' ) ;
    public final void rule__XVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4409:1: ( ( 'variant' ) )
            // InternalXMachine.g:4410:1: ( 'variant' )
            {
            // InternalXMachine.g:4410:1: ( 'variant' )
            // InternalXMachine.g:4411:2: 'variant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantKeyword_2()); 
            }
            match(input,195,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getVariantKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__2__Impl"


    // $ANTLR start "rule__XVariant__Group__3"
    // InternalXMachine.g:4420:1: rule__XVariant__Group__3 : rule__XVariant__Group__3__Impl rule__XVariant__Group__4 ;
    public final void rule__XVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4424:1: ( rule__XVariant__Group__3__Impl rule__XVariant__Group__4 )
            // InternalXMachine.g:4425:2: rule__XVariant__Group__3__Impl rule__XVariant__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__XVariant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__3"


    // $ANTLR start "rule__XVariant__Group__3__Impl"
    // InternalXMachine.g:4432:1: rule__XVariant__Group__3__Impl : ( ( rule__XVariant__NameAssignment_3 ) ) ;
    public final void rule__XVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4436:1: ( ( ( rule__XVariant__NameAssignment_3 ) ) )
            // InternalXMachine.g:4437:1: ( ( rule__XVariant__NameAssignment_3 ) )
            {
            // InternalXMachine.g:4437:1: ( ( rule__XVariant__NameAssignment_3 ) )
            // InternalXMachine.g:4438:2: ( rule__XVariant__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:4439:2: ( rule__XVariant__NameAssignment_3 )
            // InternalXMachine.g:4439:3: rule__XVariant__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__3__Impl"


    // $ANTLR start "rule__XVariant__Group__4"
    // InternalXMachine.g:4447:1: rule__XVariant__Group__4 : rule__XVariant__Group__4__Impl ;
    public final void rule__XVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4451:1: ( rule__XVariant__Group__4__Impl )
            // InternalXMachine.g:4452:2: rule__XVariant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__4"


    // $ANTLR start "rule__XVariant__Group__4__Impl"
    // InternalXMachine.g:4458:1: rule__XVariant__Group__4__Impl : ( ( rule__XVariant__ExpressionAssignment_4 ) ) ;
    public final void rule__XVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4462:1: ( ( ( rule__XVariant__ExpressionAssignment_4 ) ) )
            // InternalXMachine.g:4463:1: ( ( rule__XVariant__ExpressionAssignment_4 ) )
            {
            // InternalXMachine.g:4463:1: ( ( rule__XVariant__ExpressionAssignment_4 ) )
            // InternalXMachine.g:4464:2: ( rule__XVariant__ExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionAssignment_4()); 
            }
            // InternalXMachine.g:4465:2: ( rule__XVariant__ExpressionAssignment_4 )
            // InternalXMachine.g:4465:3: rule__XVariant__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__ExpressionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getExpressionAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__Group__4__Impl"


    // $ANTLR start "rule__XEvent__Group__0"
    // InternalXMachine.g:4474:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4478:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:4479:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__XEvent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__0"


    // $ANTLR start "rule__XEvent__Group__0__Impl"
    // InternalXMachine.g:4486:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4490:1: ( ( () ) )
            // InternalXMachine.g:4491:1: ( () )
            {
            // InternalXMachine.g:4491:1: ( () )
            // InternalXMachine.g:4492:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventAction_0()); 
            }
            // InternalXMachine.g:4493:2: ()
            // InternalXMachine.g:4493:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getEventAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__0__Impl"


    // $ANTLR start "rule__XEvent__Group__1"
    // InternalXMachine.g:4501:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4505:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:4506:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__XEvent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__1"


    // $ANTLR start "rule__XEvent__Group__1__Impl"
    // InternalXMachine.g:4513:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__CommentAssignment_1 )? ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4517:1: ( ( ( rule__XEvent__CommentAssignment_1 )? ) )
            // InternalXMachine.g:4518:1: ( ( rule__XEvent__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:4518:1: ( ( rule__XEvent__CommentAssignment_1 )? )
            // InternalXMachine.g:4519:2: ( rule__XEvent__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:4520:2: ( rule__XEvent__CommentAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:4520:3: rule__XEvent__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__1__Impl"


    // $ANTLR start "rule__XEvent__Group__2"
    // InternalXMachine.g:4528:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4532:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:4533:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__XEvent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__2"


    // $ANTLR start "rule__XEvent__Group__2__Impl"
    // InternalXMachine.g:4540:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__ConvergenceAssignment_2 )? ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4544:1: ( ( ( rule__XEvent__ConvergenceAssignment_2 )? ) )
            // InternalXMachine.g:4545:1: ( ( rule__XEvent__ConvergenceAssignment_2 )? )
            {
            // InternalXMachine.g:4545:1: ( ( rule__XEvent__ConvergenceAssignment_2 )? )
            // InternalXMachine.g:4546:2: ( rule__XEvent__ConvergenceAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getConvergenceAssignment_2()); 
            }
            // InternalXMachine.g:4547:2: ( rule__XEvent__ConvergenceAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=180 && LA48_0<=182)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:4547:3: rule__XEvent__ConvergenceAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ConvergenceAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getConvergenceAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__2__Impl"


    // $ANTLR start "rule__XEvent__Group__3"
    // InternalXMachine.g:4555:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4559:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:4560:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__3"


    // $ANTLR start "rule__XEvent__Group__3__Impl"
    // InternalXMachine.g:4567:1: rule__XEvent__Group__3__Impl : ( 'event' ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4571:1: ( ( 'event' ) )
            // InternalXMachine.g:4572:1: ( 'event' )
            {
            // InternalXMachine.g:4572:1: ( 'event' )
            // InternalXMachine.g:4573:2: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventKeyword_3()); 
            }
            match(input,196,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getEventKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__3__Impl"


    // $ANTLR start "rule__XEvent__Group__4"
    // InternalXMachine.g:4582:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4586:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:4587:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__4"


    // $ANTLR start "rule__XEvent__Group__4__Impl"
    // InternalXMachine.g:4594:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__NameAssignment_4 ) ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4598:1: ( ( ( rule__XEvent__NameAssignment_4 ) ) )
            // InternalXMachine.g:4599:1: ( ( rule__XEvent__NameAssignment_4 ) )
            {
            // InternalXMachine.g:4599:1: ( ( rule__XEvent__NameAssignment_4 ) )
            // InternalXMachine.g:4600:2: ( rule__XEvent__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameAssignment_4()); 
            }
            // InternalXMachine.g:4601:2: ( rule__XEvent__NameAssignment_4 )
            // InternalXMachine.g:4601:3: rule__XEvent__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__4__Impl"


    // $ANTLR start "rule__XEvent__Group__5"
    // InternalXMachine.g:4609:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4613:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:4614:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__5"


    // $ANTLR start "rule__XEvent__Group__5__Impl"
    // InternalXMachine.g:4621:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Alternatives_5 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4625:1: ( ( ( rule__XEvent__Alternatives_5 )? ) )
            // InternalXMachine.g:4626:1: ( ( rule__XEvent__Alternatives_5 )? )
            {
            // InternalXMachine.g:4626:1: ( ( rule__XEvent__Alternatives_5 )? )
            // InternalXMachine.g:4627:2: ( rule__XEvent__Alternatives_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_5()); 
            }
            // InternalXMachine.g:4628:2: ( rule__XEvent__Alternatives_5 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==188||LA49_0==204) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXMachine.g:4628:3: rule__XEvent__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Alternatives_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAlternatives_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__5__Impl"


    // $ANTLR start "rule__XEvent__Group__6"
    // InternalXMachine.g:4636:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl rule__XEvent__Group__7 ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4640:1: ( rule__XEvent__Group__6__Impl rule__XEvent__Group__7 )
            // InternalXMachine.g:4641:2: rule__XEvent__Group__6__Impl rule__XEvent__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__6"


    // $ANTLR start "rule__XEvent__Group__6__Impl"
    // InternalXMachine.g:4648:1: rule__XEvent__Group__6__Impl : ( ( rule__XEvent__Group_6__0 )? ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4652:1: ( ( ( rule__XEvent__Group_6__0 )? ) )
            // InternalXMachine.g:4653:1: ( ( rule__XEvent__Group_6__0 )? )
            {
            // InternalXMachine.g:4653:1: ( ( rule__XEvent__Group_6__0 )? )
            // InternalXMachine.g:4654:2: ( rule__XEvent__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6()); 
            }
            // InternalXMachine.g:4655:2: ( rule__XEvent__Group_6__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==197) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXMachine.g:4655:3: rule__XEvent__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__6__Impl"


    // $ANTLR start "rule__XEvent__Group__7"
    // InternalXMachine.g:4663:1: rule__XEvent__Group__7 : rule__XEvent__Group__7__Impl rule__XEvent__Group__8 ;
    public final void rule__XEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4667:1: ( rule__XEvent__Group__7__Impl rule__XEvent__Group__8 )
            // InternalXMachine.g:4668:2: rule__XEvent__Group__7__Impl rule__XEvent__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__7"


    // $ANTLR start "rule__XEvent__Group__7__Impl"
    // InternalXMachine.g:4675:1: rule__XEvent__Group__7__Impl : ( ( rule__XEvent__OrderedChildrenAssignment_7 )* ) ;
    public final void rule__XEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4679:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_7 )* ) )
            // InternalXMachine.g:4680:1: ( ( rule__XEvent__OrderedChildrenAssignment_7 )* )
            {
            // InternalXMachine.g:4680:1: ( ( rule__XEvent__OrderedChildrenAssignment_7 )* )
            // InternalXMachine.g:4681:2: ( rule__XEvent__OrderedChildrenAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_7()); 
            }
            // InternalXMachine.g:4682:2: ( rule__XEvent__OrderedChildrenAssignment_7 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==199) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalXMachine.g:4682:3: rule__XEvent__OrderedChildrenAssignment_7
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__XEvent__OrderedChildrenAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__7__Impl"


    // $ANTLR start "rule__XEvent__Group__8"
    // InternalXMachine.g:4690:1: rule__XEvent__Group__8 : rule__XEvent__Group__8__Impl rule__XEvent__Group__9 ;
    public final void rule__XEvent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4694:1: ( rule__XEvent__Group__8__Impl rule__XEvent__Group__9 )
            // InternalXMachine.g:4695:2: rule__XEvent__Group__8__Impl rule__XEvent__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__8"


    // $ANTLR start "rule__XEvent__Group__8__Impl"
    // InternalXMachine.g:4702:1: rule__XEvent__Group__8__Impl : ( ( rule__XEvent__Group_8__0 )? ) ;
    public final void rule__XEvent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4706:1: ( ( ( rule__XEvent__Group_8__0 )? ) )
            // InternalXMachine.g:4707:1: ( ( rule__XEvent__Group_8__0 )? )
            {
            // InternalXMachine.g:4707:1: ( ( rule__XEvent__Group_8__0 )? )
            // InternalXMachine.g:4708:2: ( rule__XEvent__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_8()); 
            }
            // InternalXMachine.g:4709:2: ( rule__XEvent__Group_8__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=47 && LA52_0<=48)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXMachine.g:4709:3: rule__XEvent__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__8__Impl"


    // $ANTLR start "rule__XEvent__Group__9"
    // InternalXMachine.g:4717:1: rule__XEvent__Group__9 : rule__XEvent__Group__9__Impl rule__XEvent__Group__10 ;
    public final void rule__XEvent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4721:1: ( rule__XEvent__Group__9__Impl rule__XEvent__Group__10 )
            // InternalXMachine.g:4722:2: rule__XEvent__Group__9__Impl rule__XEvent__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__9"


    // $ANTLR start "rule__XEvent__Group__9__Impl"
    // InternalXMachine.g:4729:1: rule__XEvent__Group__9__Impl : ( ( rule__XEvent__Group_9__0 )? ) ;
    public final void rule__XEvent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4733:1: ( ( ( rule__XEvent__Group_9__0 )? ) )
            // InternalXMachine.g:4734:1: ( ( rule__XEvent__Group_9__0 )? )
            {
            // InternalXMachine.g:4734:1: ( ( rule__XEvent__Group_9__0 )? )
            // InternalXMachine.g:4735:2: ( rule__XEvent__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_9()); 
            }
            // InternalXMachine.g:4736:2: ( rule__XEvent__Group_9__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=49 && LA53_0<=50)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXMachine.g:4736:3: rule__XEvent__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__9__Impl"


    // $ANTLR start "rule__XEvent__Group__10"
    // InternalXMachine.g:4744:1: rule__XEvent__Group__10 : rule__XEvent__Group__10__Impl rule__XEvent__Group__11 ;
    public final void rule__XEvent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4748:1: ( rule__XEvent__Group__10__Impl rule__XEvent__Group__11 )
            // InternalXMachine.g:4749:2: rule__XEvent__Group__10__Impl rule__XEvent__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__XEvent__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__10"


    // $ANTLR start "rule__XEvent__Group__10__Impl"
    // InternalXMachine.g:4756:1: rule__XEvent__Group__10__Impl : ( ( rule__XEvent__Group_10__0 )? ) ;
    public final void rule__XEvent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4760:1: ( ( ( rule__XEvent__Group_10__0 )? ) )
            // InternalXMachine.g:4761:1: ( ( rule__XEvent__Group_10__0 )? )
            {
            // InternalXMachine.g:4761:1: ( ( rule__XEvent__Group_10__0 )? )
            // InternalXMachine.g:4762:2: ( rule__XEvent__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_10()); 
            }
            // InternalXMachine.g:4763:2: ( rule__XEvent__Group_10__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==198) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalXMachine.g:4763:3: rule__XEvent__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__10__Impl"


    // $ANTLR start "rule__XEvent__Group__11"
    // InternalXMachine.g:4771:1: rule__XEvent__Group__11 : rule__XEvent__Group__11__Impl ;
    public final void rule__XEvent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4775:1: ( rule__XEvent__Group__11__Impl )
            // InternalXMachine.g:4776:2: rule__XEvent__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__11"


    // $ANTLR start "rule__XEvent__Group__11__Impl"
    // InternalXMachine.g:4782:1: rule__XEvent__Group__11__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4786:1: ( ( 'end' ) )
            // InternalXMachine.g:4787:1: ( 'end' )
            {
            // InternalXMachine.g:4787:1: ( 'end' )
            // InternalXMachine.g:4788:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEndKeyword_11()); 
            }
            match(input,187,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getEndKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group__11__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0__0"
    // InternalXMachine.g:4798:1: rule__XEvent__Group_5_0__0 : rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 ;
    public final void rule__XEvent__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4802:1: ( rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 )
            // InternalXMachine.g:4803:2: rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0__0"


    // $ANTLR start "rule__XEvent__Group_5_0__0__Impl"
    // InternalXMachine.g:4810:1: rule__XEvent__Group_5_0__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4814:1: ( ( 'refines' ) )
            // InternalXMachine.g:4815:1: ( 'refines' )
            {
            // InternalXMachine.g:4815:1: ( 'refines' )
            // InternalXMachine.g:4816:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesKeyword_5_0_0()); 
            }
            match(input,188,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesKeyword_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0__1"
    // InternalXMachine.g:4825:1: rule__XEvent__Group_5_0__1 : rule__XEvent__Group_5_0__1__Impl ;
    public final void rule__XEvent__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4829:1: ( rule__XEvent__Group_5_0__1__Impl )
            // InternalXMachine.g:4830:2: rule__XEvent__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0__1"


    // $ANTLR start "rule__XEvent__Group_5_0__1__Impl"
    // InternalXMachine.g:4836:1: rule__XEvent__Group_5_0__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) ) ;
    public final void rule__XEvent__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4840:1: ( ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) ) )
            // InternalXMachine.g:4841:1: ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) )
            {
            // InternalXMachine.g:4841:1: ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) )
            // InternalXMachine.g:4842:2: ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* )
            {
            // InternalXMachine.g:4842:2: ( ( rule__XEvent__RefinesAssignment_5_0_1 ) )
            // InternalXMachine.g:4843:3: ( rule__XEvent__RefinesAssignment_5_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_0_1()); 
            }
            // InternalXMachine.g:4844:3: ( rule__XEvent__RefinesAssignment_5_0_1 )
            // InternalXMachine.g:4844:4: rule__XEvent__RefinesAssignment_5_0_1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__RefinesAssignment_5_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_5_0_1()); 
            }

            }

            // InternalXMachine.g:4847:2: ( ( rule__XEvent__RefinesAssignment_5_0_1 )* )
            // InternalXMachine.g:4848:3: ( rule__XEvent__RefinesAssignment_5_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_0_1()); 
            }
            // InternalXMachine.g:4849:3: ( rule__XEvent__RefinesAssignment_5_0_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalXMachine.g:4849:4: rule__XEvent__RefinesAssignment_5_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__RefinesAssignment_5_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_5_0_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__0"
    // InternalXMachine.g:4859:1: rule__XEvent__Group_5_1__0 : rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 ;
    public final void rule__XEvent__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4863:1: ( rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 )
            // InternalXMachine.g:4864:2: rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__0"


    // $ANTLR start "rule__XEvent__Group_5_1__0__Impl"
    // InternalXMachine.g:4871:1: rule__XEvent__Group_5_1__0__Impl : ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) ) ;
    public final void rule__XEvent__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4875:1: ( ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) ) )
            // InternalXMachine.g:4876:1: ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) )
            {
            // InternalXMachine.g:4876:1: ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) )
            // InternalXMachine.g:4877:2: ( rule__XEvent__ExtendedAssignment_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedAssignment_5_1_0()); 
            }
            // InternalXMachine.g:4878:2: ( rule__XEvent__ExtendedAssignment_5_1_0 )
            // InternalXMachine.g:4878:3: rule__XEvent__ExtendedAssignment_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__ExtendedAssignment_5_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedAssignment_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__1"
    // InternalXMachine.g:4886:1: rule__XEvent__Group_5_1__1 : rule__XEvent__Group_5_1__1__Impl ;
    public final void rule__XEvent__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4890:1: ( rule__XEvent__Group_5_1__1__Impl )
            // InternalXMachine.g:4891:2: rule__XEvent__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__1"


    // $ANTLR start "rule__XEvent__Group_5_1__1__Impl"
    // InternalXMachine.g:4897:1: rule__XEvent__Group_5_1__1__Impl : ( ( rule__XEvent__RefinesAssignment_5_1_1 ) ) ;
    public final void rule__XEvent__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4901:1: ( ( ( rule__XEvent__RefinesAssignment_5_1_1 ) ) )
            // InternalXMachine.g:4902:1: ( ( rule__XEvent__RefinesAssignment_5_1_1 ) )
            {
            // InternalXMachine.g:4902:1: ( ( rule__XEvent__RefinesAssignment_5_1_1 ) )
            // InternalXMachine.g:4903:2: ( rule__XEvent__RefinesAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1_1()); 
            }
            // InternalXMachine.g:4904:2: ( rule__XEvent__RefinesAssignment_5_1_1 )
            // InternalXMachine.g:4904:3: rule__XEvent__RefinesAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__RefinesAssignment_5_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_5_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__1__Impl"


    // $ANTLR start "rule__XEvent__Group_6__0"
    // InternalXMachine.g:4913:1: rule__XEvent__Group_6__0 : rule__XEvent__Group_6__0__Impl rule__XEvent__Group_6__1 ;
    public final void rule__XEvent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4917:1: ( rule__XEvent__Group_6__0__Impl rule__XEvent__Group_6__1 )
            // InternalXMachine.g:4918:2: rule__XEvent__Group_6__0__Impl rule__XEvent__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6__0"


    // $ANTLR start "rule__XEvent__Group_6__0__Impl"
    // InternalXMachine.g:4925:1: rule__XEvent__Group_6__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4929:1: ( ( 'any' ) )
            // InternalXMachine.g:4930:1: ( 'any' )
            {
            // InternalXMachine.g:4930:1: ( 'any' )
            // InternalXMachine.g:4931:2: 'any'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAnyKeyword_6_0()); 
            }
            match(input,197,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAnyKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6__0__Impl"


    // $ANTLR start "rule__XEvent__Group_6__1"
    // InternalXMachine.g:4940:1: rule__XEvent__Group_6__1 : rule__XEvent__Group_6__1__Impl ;
    public final void rule__XEvent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4944:1: ( rule__XEvent__Group_6__1__Impl )
            // InternalXMachine.g:4945:2: rule__XEvent__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6__1"


    // $ANTLR start "rule__XEvent__Group_6__1__Impl"
    // InternalXMachine.g:4951:1: rule__XEvent__Group_6__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) ) ;
    public final void rule__XEvent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4955:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) ) )
            // InternalXMachine.g:4956:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:4956:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) )
            // InternalXMachine.g:4957:2: ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* )
            {
            // InternalXMachine.g:4957:2: ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) )
            // InternalXMachine.g:4958:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_6_1()); 
            }
            // InternalXMachine.g:4959:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )
            // InternalXMachine.g:4959:4: rule__XEvent__OrderedChildrenAssignment_6_1
            {
            pushFollow(FOLLOW_11);
            rule__XEvent__OrderedChildrenAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_6_1()); 
            }

            }

            // InternalXMachine.g:4962:2: ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* )
            // InternalXMachine.g:4963:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_6_1()); 
            }
            // InternalXMachine.g:4964:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID||LA56_0==RULE_STRING) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalXMachine.g:4964:4: rule__XEvent__OrderedChildrenAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__XEvent__OrderedChildrenAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_6_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_6__1__Impl"


    // $ANTLR start "rule__XEvent__Group_8__0"
    // InternalXMachine.g:4974:1: rule__XEvent__Group_8__0 : rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 ;
    public final void rule__XEvent__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4978:1: ( rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 )
            // InternalXMachine.g:4979:2: rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1
            {
            pushFollow(FOLLOW_31);
            rule__XEvent__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_8__0"


    // $ANTLR start "rule__XEvent__Group_8__0__Impl"
    // InternalXMachine.g:4986:1: rule__XEvent__Group_8__0__Impl : ( ( rule__XEvent__Alternatives_8_0 ) ) ;
    public final void rule__XEvent__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4990:1: ( ( ( rule__XEvent__Alternatives_8_0 ) ) )
            // InternalXMachine.g:4991:1: ( ( rule__XEvent__Alternatives_8_0 ) )
            {
            // InternalXMachine.g:4991:1: ( ( rule__XEvent__Alternatives_8_0 ) )
            // InternalXMachine.g:4992:2: ( rule__XEvent__Alternatives_8_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_8_0()); 
            }
            // InternalXMachine.g:4993:2: ( rule__XEvent__Alternatives_8_0 )
            // InternalXMachine.g:4993:3: rule__XEvent__Alternatives_8_0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Alternatives_8_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAlternatives_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_8__0__Impl"


    // $ANTLR start "rule__XEvent__Group_8__1"
    // InternalXMachine.g:5001:1: rule__XEvent__Group_8__1 : rule__XEvent__Group_8__1__Impl ;
    public final void rule__XEvent__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5005:1: ( rule__XEvent__Group_8__1__Impl )
            // InternalXMachine.g:5006:2: rule__XEvent__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_8__1"


    // $ANTLR start "rule__XEvent__Group_8__1__Impl"
    // InternalXMachine.g:5012:1: rule__XEvent__Group_8__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) ) ;
    public final void rule__XEvent__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5016:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) ) )
            // InternalXMachine.g:5017:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:5017:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) )
            // InternalXMachine.g:5018:2: ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* )
            {
            // InternalXMachine.g:5018:2: ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) )
            // InternalXMachine.g:5019:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_8_1()); 
            }
            // InternalXMachine.g:5020:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )
            // InternalXMachine.g:5020:4: rule__XEvent__OrderedChildrenAssignment_8_1
            {
            pushFollow(FOLLOW_32);
            rule__XEvent__OrderedChildrenAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_8_1()); 
            }

            }

            // InternalXMachine.g:5023:2: ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* )
            // InternalXMachine.g:5024:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_8_1()); 
            }
            // InternalXMachine.g:5025:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_XLABEL)||LA57_0==203) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalXMachine.g:5025:4: rule__XEvent__OrderedChildrenAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__XEvent__OrderedChildrenAssignment_8_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_8_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_8__1__Impl"


    // $ANTLR start "rule__XEvent__Group_9__0"
    // InternalXMachine.g:5035:1: rule__XEvent__Group_9__0 : rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 ;
    public final void rule__XEvent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5039:1: ( rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 )
            // InternalXMachine.g:5040:2: rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1
            {
            pushFollow(FOLLOW_12);
            rule__XEvent__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_9__0"


    // $ANTLR start "rule__XEvent__Group_9__0__Impl"
    // InternalXMachine.g:5047:1: rule__XEvent__Group_9__0__Impl : ( ( rule__XEvent__Alternatives_9_0 ) ) ;
    public final void rule__XEvent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5051:1: ( ( ( rule__XEvent__Alternatives_9_0 ) ) )
            // InternalXMachine.g:5052:1: ( ( rule__XEvent__Alternatives_9_0 ) )
            {
            // InternalXMachine.g:5052:1: ( ( rule__XEvent__Alternatives_9_0 ) )
            // InternalXMachine.g:5053:2: ( rule__XEvent__Alternatives_9_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_9_0()); 
            }
            // InternalXMachine.g:5054:2: ( rule__XEvent__Alternatives_9_0 )
            // InternalXMachine.g:5054:3: rule__XEvent__Alternatives_9_0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Alternatives_9_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAlternatives_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_9__0__Impl"


    // $ANTLR start "rule__XEvent__Group_9__1"
    // InternalXMachine.g:5062:1: rule__XEvent__Group_9__1 : rule__XEvent__Group_9__1__Impl ;
    public final void rule__XEvent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5066:1: ( rule__XEvent__Group_9__1__Impl )
            // InternalXMachine.g:5067:2: rule__XEvent__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_9__1"


    // $ANTLR start "rule__XEvent__Group_9__1__Impl"
    // InternalXMachine.g:5073:1: rule__XEvent__Group_9__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) ) ;
    public final void rule__XEvent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5077:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) ) )
            // InternalXMachine.g:5078:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) )
            {
            // InternalXMachine.g:5078:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) )
            // InternalXMachine.g:5079:2: ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* )
            {
            // InternalXMachine.g:5079:2: ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) )
            // InternalXMachine.g:5080:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_9_1()); 
            }
            // InternalXMachine.g:5081:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )
            // InternalXMachine.g:5081:4: rule__XEvent__OrderedChildrenAssignment_9_1
            {
            pushFollow(FOLLOW_13);
            rule__XEvent__OrderedChildrenAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_9_1()); 
            }

            }

            // InternalXMachine.g:5084:2: ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* )
            // InternalXMachine.g:5085:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_9_1()); 
            }
            // InternalXMachine.g:5086:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_XLABEL)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalXMachine.g:5086:4: rule__XEvent__OrderedChildrenAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XEvent__OrderedChildrenAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_9_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_9__1__Impl"


    // $ANTLR start "rule__XEvent__Group_10__0"
    // InternalXMachine.g:5096:1: rule__XEvent__Group_10__0 : rule__XEvent__Group_10__0__Impl rule__XEvent__Group_10__1 ;
    public final void rule__XEvent__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5100:1: ( rule__XEvent__Group_10__0__Impl rule__XEvent__Group_10__1 )
            // InternalXMachine.g:5101:2: rule__XEvent__Group_10__0__Impl rule__XEvent__Group_10__1
            {
            pushFollow(FOLLOW_12);
            rule__XEvent__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_10__0"


    // $ANTLR start "rule__XEvent__Group_10__0__Impl"
    // InternalXMachine.g:5108:1: rule__XEvent__Group_10__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5112:1: ( ( 'with' ) )
            // InternalXMachine.g:5113:1: ( 'with' )
            {
            // InternalXMachine.g:5113:1: ( 'with' )
            // InternalXMachine.g:5114:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWithKeyword_10_0()); 
            }
            match(input,198,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWithKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_10__0__Impl"


    // $ANTLR start "rule__XEvent__Group_10__1"
    // InternalXMachine.g:5123:1: rule__XEvent__Group_10__1 : rule__XEvent__Group_10__1__Impl ;
    public final void rule__XEvent__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5127:1: ( rule__XEvent__Group_10__1__Impl )
            // InternalXMachine.g:5128:2: rule__XEvent__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_10__1"


    // $ANTLR start "rule__XEvent__Group_10__1__Impl"
    // InternalXMachine.g:5134:1: rule__XEvent__Group_10__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) ) ;
    public final void rule__XEvent__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5138:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) ) )
            // InternalXMachine.g:5139:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) )
            {
            // InternalXMachine.g:5139:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) )
            // InternalXMachine.g:5140:2: ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* )
            {
            // InternalXMachine.g:5140:2: ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) )
            // InternalXMachine.g:5141:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_10_1()); 
            }
            // InternalXMachine.g:5142:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )
            // InternalXMachine.g:5142:4: rule__XEvent__OrderedChildrenAssignment_10_1
            {
            pushFollow(FOLLOW_13);
            rule__XEvent__OrderedChildrenAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_10_1()); 
            }

            }

            // InternalXMachine.g:5145:2: ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* )
            // InternalXMachine.g:5146:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_10_1()); 
            }
            // InternalXMachine.g:5147:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_XLABEL)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalXMachine.g:5147:4: rule__XEvent__OrderedChildrenAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XEvent__OrderedChildrenAssignment_10_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_10_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_10__1__Impl"


    // $ANTLR start "rule__EventSync__Group__0"
    // InternalXMachine.g:5157:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5161:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:5162:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__EventSync__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group__0"


    // $ANTLR start "rule__EventSync__Group__0__Impl"
    // InternalXMachine.g:5169:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5173:1: ( ( () ) )
            // InternalXMachine.g:5174:1: ( () )
            {
            // InternalXMachine.g:5174:1: ( () )
            // InternalXMachine.g:5175:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:5176:2: ()
            // InternalXMachine.g:5176:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group__0__Impl"


    // $ANTLR start "rule__EventSync__Group__1"
    // InternalXMachine.g:5184:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5188:1: ( rule__EventSync__Group__1__Impl )
            // InternalXMachine.g:5189:2: rule__EventSync__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group__1"


    // $ANTLR start "rule__EventSync__Group__1__Impl"
    // InternalXMachine.g:5195:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5199:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:5200:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:5200:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:5201:2: ( rule__EventSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:5202:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:5202:3: rule__EventSync__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group__1__Impl"


    // $ANTLR start "rule__EventSync__Group_1__0"
    // InternalXMachine.g:5211:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5215:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:5216:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__EventSync__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__0"


    // $ANTLR start "rule__EventSync__Group_1__0__Impl"
    // InternalXMachine.g:5223:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5227:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:5228:1: ( 'synchronises' )
            {
            // InternalXMachine.g:5228:1: ( 'synchronises' )
            // InternalXMachine.g:5229:2: 'synchronises'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            }
            match(input,199,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__0__Impl"


    // $ANTLR start "rule__EventSync__Group_1__1"
    // InternalXMachine.g:5238:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5242:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:5243:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__EventSync__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__1"


    // $ANTLR start "rule__EventSync__Group_1__1__Impl"
    // InternalXMachine.g:5250:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5254:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:5255:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:5255:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:5256:2: ( rule__EventSync__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            }
            // InternalXMachine.g:5257:2: ( rule__EventSync__Group_1_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==97) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalXMachine.g:5257:3: rule__EventSync__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventSync__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__1__Impl"


    // $ANTLR start "rule__EventSync__Group_1__2"
    // InternalXMachine.g:5265:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5269:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:5270:2: rule__EventSync__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__2"


    // $ANTLR start "rule__EventSync__Group_1__2__Impl"
    // InternalXMachine.g:5276:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5280:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:5281:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:5281:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:5282:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            }
            // InternalXMachine.g:5283:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:5283:3: rule__EventSync__SynchronisedEventAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__SynchronisedEventAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1__2__Impl"


    // $ANTLR start "rule__EventSync__Group_1_1__0"
    // InternalXMachine.g:5292:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5296:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:5297:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__EventSync__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_1__0"


    // $ANTLR start "rule__EventSync__Group_1_1__0__Impl"
    // InternalXMachine.g:5304:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5308:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:5309:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:5309:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:5310:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            }
            // InternalXMachine.g:5311:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:5311:3: rule__EventSync__PrefixAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__PrefixAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_1__0__Impl"


    // $ANTLR start "rule__EventSync__Group_1_1__1"
    // InternalXMachine.g:5319:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5323:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:5324:2: rule__EventSync__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_1__1"


    // $ANTLR start "rule__EventSync__Group_1_1__1__Impl"
    // InternalXMachine.g:5330:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5334:1: ( ( '.' ) )
            // InternalXMachine.g:5335:1: ( '.' )
            {
            // InternalXMachine.g:5335:1: ( '.' )
            // InternalXMachine.g:5336:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,97,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__Group_1_1__1__Impl"


    // $ANTLR start "rule__XParameter__Group__0"
    // InternalXMachine.g:5346:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5350:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:5351:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__0"


    // $ANTLR start "rule__XParameter__Group__0__Impl"
    // InternalXMachine.g:5358:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5362:1: ( ( () ) )
            // InternalXMachine.g:5363:1: ( () )
            {
            // InternalXMachine.g:5363:1: ( () )
            // InternalXMachine.g:5364:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            }
            // InternalXMachine.g:5365:2: ()
            // InternalXMachine.g:5365:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__0__Impl"


    // $ANTLR start "rule__XParameter__Group__1"
    // InternalXMachine.g:5373:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl rule__XParameter__Group__2 ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5377:1: ( rule__XParameter__Group__1__Impl rule__XParameter__Group__2 )
            // InternalXMachine.g:5378:2: rule__XParameter__Group__1__Impl rule__XParameter__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__XParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__1"


    // $ANTLR start "rule__XParameter__Group__1__Impl"
    // InternalXMachine.g:5385:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__CommentAssignment_1 )? ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5389:1: ( ( ( rule__XParameter__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5390:1: ( ( rule__XParameter__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5390:1: ( ( rule__XParameter__CommentAssignment_1 )? )
            // InternalXMachine.g:5391:2: ( rule__XParameter__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5392:2: ( rule__XParameter__CommentAssignment_1 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_STRING) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalXMachine.g:5392:3: rule__XParameter__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XParameter__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__1__Impl"


    // $ANTLR start "rule__XParameter__Group__2"
    // InternalXMachine.g:5400:1: rule__XParameter__Group__2 : rule__XParameter__Group__2__Impl ;
    public final void rule__XParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5404:1: ( rule__XParameter__Group__2__Impl )
            // InternalXMachine.g:5405:2: rule__XParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__2"


    // $ANTLR start "rule__XParameter__Group__2__Impl"
    // InternalXMachine.g:5411:1: rule__XParameter__Group__2__Impl : ( ( rule__XParameter__NameAssignment_2 ) ) ;
    public final void rule__XParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5415:1: ( ( ( rule__XParameter__NameAssignment_2 ) ) )
            // InternalXMachine.g:5416:1: ( ( rule__XParameter__NameAssignment_2 ) )
            {
            // InternalXMachine.g:5416:1: ( ( rule__XParameter__NameAssignment_2 ) )
            // InternalXMachine.g:5417:2: ( rule__XParameter__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:5418:2: ( rule__XParameter__NameAssignment_2 )
            // InternalXMachine.g:5418:3: rule__XParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__Group__2__Impl"


    // $ANTLR start "rule__XGuard__Group__0"
    // InternalXMachine.g:5427:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5431:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:5432:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__XGuard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__0"


    // $ANTLR start "rule__XGuard__Group__0__Impl"
    // InternalXMachine.g:5439:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5443:1: ( ( () ) )
            // InternalXMachine.g:5444:1: ( () )
            {
            // InternalXMachine.g:5444:1: ( () )
            // InternalXMachine.g:5445:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            }
            // InternalXMachine.g:5446:2: ()
            // InternalXMachine.g:5446:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__0__Impl"


    // $ANTLR start "rule__XGuard__Group__1"
    // InternalXMachine.g:5454:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5458:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:5459:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__XGuard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__1"


    // $ANTLR start "rule__XGuard__Group__1__Impl"
    // InternalXMachine.g:5466:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__CommentAssignment_1 )? ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5470:1: ( ( ( rule__XGuard__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5471:1: ( ( rule__XGuard__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5471:1: ( ( rule__XGuard__CommentAssignment_1 )? )
            // InternalXMachine.g:5472:2: ( rule__XGuard__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5473:2: ( rule__XGuard__CommentAssignment_1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_STRING) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXMachine.g:5473:3: rule__XGuard__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__1__Impl"


    // $ANTLR start "rule__XGuard__Group__2"
    // InternalXMachine.g:5481:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5485:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:5486:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__XGuard__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__2"


    // $ANTLR start "rule__XGuard__Group__2__Impl"
    // InternalXMachine.g:5493:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__TheoremAssignment_2 )? ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5497:1: ( ( ( rule__XGuard__TheoremAssignment_2 )? ) )
            // InternalXMachine.g:5498:1: ( ( rule__XGuard__TheoremAssignment_2 )? )
            {
            // InternalXMachine.g:5498:1: ( ( rule__XGuard__TheoremAssignment_2 )? )
            // InternalXMachine.g:5499:2: ( rule__XGuard__TheoremAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremAssignment_2()); 
            }
            // InternalXMachine.g:5500:2: ( rule__XGuard__TheoremAssignment_2 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==203) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXMachine.g:5500:3: rule__XGuard__TheoremAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__TheoremAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__2__Impl"


    // $ANTLR start "rule__XGuard__Group__3"
    // InternalXMachine.g:5508:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl rule__XGuard__Group__4 ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5512:1: ( rule__XGuard__Group__3__Impl rule__XGuard__Group__4 )
            // InternalXMachine.g:5513:2: rule__XGuard__Group__3__Impl rule__XGuard__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__XGuard__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__3"


    // $ANTLR start "rule__XGuard__Group__3__Impl"
    // InternalXMachine.g:5520:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__NameAssignment_3 ) ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5524:1: ( ( ( rule__XGuard__NameAssignment_3 ) ) )
            // InternalXMachine.g:5525:1: ( ( rule__XGuard__NameAssignment_3 ) )
            {
            // InternalXMachine.g:5525:1: ( ( rule__XGuard__NameAssignment_3 ) )
            // InternalXMachine.g:5526:2: ( rule__XGuard__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:5527:2: ( rule__XGuard__NameAssignment_3 )
            // InternalXMachine.g:5527:3: rule__XGuard__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__3__Impl"


    // $ANTLR start "rule__XGuard__Group__4"
    // InternalXMachine.g:5535:1: rule__XGuard__Group__4 : rule__XGuard__Group__4__Impl ;
    public final void rule__XGuard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5539:1: ( rule__XGuard__Group__4__Impl )
            // InternalXMachine.g:5540:2: rule__XGuard__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__4"


    // $ANTLR start "rule__XGuard__Group__4__Impl"
    // InternalXMachine.g:5546:1: rule__XGuard__Group__4__Impl : ( ( rule__XGuard__PredicateAssignment_4 ) ) ;
    public final void rule__XGuard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5550:1: ( ( ( rule__XGuard__PredicateAssignment_4 ) ) )
            // InternalXMachine.g:5551:1: ( ( rule__XGuard__PredicateAssignment_4 ) )
            {
            // InternalXMachine.g:5551:1: ( ( rule__XGuard__PredicateAssignment_4 ) )
            // InternalXMachine.g:5552:2: ( rule__XGuard__PredicateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateAssignment_4()); 
            }
            // InternalXMachine.g:5553:2: ( rule__XGuard__PredicateAssignment_4 )
            // InternalXMachine.g:5553:3: rule__XGuard__PredicateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__PredicateAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getPredicateAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__Group__4__Impl"


    // $ANTLR start "rule__XWitness__Group__0"
    // InternalXMachine.g:5562:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5566:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:5567:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__XWitness__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__0"


    // $ANTLR start "rule__XWitness__Group__0__Impl"
    // InternalXMachine.g:5574:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5578:1: ( ( () ) )
            // InternalXMachine.g:5579:1: ( () )
            {
            // InternalXMachine.g:5579:1: ( () )
            // InternalXMachine.g:5580:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            }
            // InternalXMachine.g:5581:2: ()
            // InternalXMachine.g:5581:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__0__Impl"


    // $ANTLR start "rule__XWitness__Group__1"
    // InternalXMachine.g:5589:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5593:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:5594:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__XWitness__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__1"


    // $ANTLR start "rule__XWitness__Group__1__Impl"
    // InternalXMachine.g:5601:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__CommentAssignment_1 )? ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5605:1: ( ( ( rule__XWitness__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5606:1: ( ( rule__XWitness__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5606:1: ( ( rule__XWitness__CommentAssignment_1 )? )
            // InternalXMachine.g:5607:2: ( rule__XWitness__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5608:2: ( rule__XWitness__CommentAssignment_1 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_STRING) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXMachine.g:5608:3: rule__XWitness__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XWitness__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__1__Impl"


    // $ANTLR start "rule__XWitness__Group__2"
    // InternalXMachine.g:5616:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl rule__XWitness__Group__3 ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5620:1: ( rule__XWitness__Group__2__Impl rule__XWitness__Group__3 )
            // InternalXMachine.g:5621:2: rule__XWitness__Group__2__Impl rule__XWitness__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__XWitness__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__2"


    // $ANTLR start "rule__XWitness__Group__2__Impl"
    // InternalXMachine.g:5628:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__NameAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5632:1: ( ( ( rule__XWitness__NameAssignment_2 ) ) )
            // InternalXMachine.g:5633:1: ( ( rule__XWitness__NameAssignment_2 ) )
            {
            // InternalXMachine.g:5633:1: ( ( rule__XWitness__NameAssignment_2 ) )
            // InternalXMachine.g:5634:2: ( rule__XWitness__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:5635:2: ( rule__XWitness__NameAssignment_2 )
            // InternalXMachine.g:5635:3: rule__XWitness__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__2__Impl"


    // $ANTLR start "rule__XWitness__Group__3"
    // InternalXMachine.g:5643:1: rule__XWitness__Group__3 : rule__XWitness__Group__3__Impl ;
    public final void rule__XWitness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5647:1: ( rule__XWitness__Group__3__Impl )
            // InternalXMachine.g:5648:2: rule__XWitness__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__3"


    // $ANTLR start "rule__XWitness__Group__3__Impl"
    // InternalXMachine.g:5654:1: rule__XWitness__Group__3__Impl : ( ( rule__XWitness__PredicateAssignment_3 ) ) ;
    public final void rule__XWitness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5658:1: ( ( ( rule__XWitness__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:5659:1: ( ( rule__XWitness__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:5659:1: ( ( rule__XWitness__PredicateAssignment_3 ) )
            // InternalXMachine.g:5660:2: ( rule__XWitness__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:5661:2: ( rule__XWitness__PredicateAssignment_3 )
            // InternalXMachine.g:5661:3: rule__XWitness__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__PredicateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getPredicateAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__Group__3__Impl"


    // $ANTLR start "rule__XAction__Group__0"
    // InternalXMachine.g:5670:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5674:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:5675:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__XAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__0"


    // $ANTLR start "rule__XAction__Group__0__Impl"
    // InternalXMachine.g:5682:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5686:1: ( ( () ) )
            // InternalXMachine.g:5687:1: ( () )
            {
            // InternalXMachine.g:5687:1: ( () )
            // InternalXMachine.g:5688:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAction_0()); 
            }
            // InternalXMachine.g:5689:2: ()
            // InternalXMachine.g:5689:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getActionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__0__Impl"


    // $ANTLR start "rule__XAction__Group__1"
    // InternalXMachine.g:5697:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5701:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:5702:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__XAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XAction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__1"


    // $ANTLR start "rule__XAction__Group__1__Impl"
    // InternalXMachine.g:5709:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__CommentAssignment_1 )? ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5713:1: ( ( ( rule__XAction__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5714:1: ( ( rule__XAction__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5714:1: ( ( rule__XAction__CommentAssignment_1 )? )
            // InternalXMachine.g:5715:2: ( rule__XAction__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5716:2: ( rule__XAction__CommentAssignment_1 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_STRING) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXMachine.g:5716:3: rule__XAction__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XAction__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__1__Impl"


    // $ANTLR start "rule__XAction__Group__2"
    // InternalXMachine.g:5724:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl rule__XAction__Group__3 ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5728:1: ( rule__XAction__Group__2__Impl rule__XAction__Group__3 )
            // InternalXMachine.g:5729:2: rule__XAction__Group__2__Impl rule__XAction__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__XAction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XAction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__2"


    // $ANTLR start "rule__XAction__Group__2__Impl"
    // InternalXMachine.g:5736:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__NameAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5740:1: ( ( ( rule__XAction__NameAssignment_2 ) ) )
            // InternalXMachine.g:5741:1: ( ( rule__XAction__NameAssignment_2 ) )
            {
            // InternalXMachine.g:5741:1: ( ( rule__XAction__NameAssignment_2 ) )
            // InternalXMachine.g:5742:2: ( rule__XAction__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:5743:2: ( rule__XAction__NameAssignment_2 )
            // InternalXMachine.g:5743:3: rule__XAction__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAction__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__2__Impl"


    // $ANTLR start "rule__XAction__Group__3"
    // InternalXMachine.g:5751:1: rule__XAction__Group__3 : rule__XAction__Group__3__Impl ;
    public final void rule__XAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5755:1: ( rule__XAction__Group__3__Impl )
            // InternalXMachine.g:5756:2: rule__XAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__3"


    // $ANTLR start "rule__XAction__Group__3__Impl"
    // InternalXMachine.g:5762:1: rule__XAction__Group__3__Impl : ( ( rule__XAction__ActionAssignment_3 ) ) ;
    public final void rule__XAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5766:1: ( ( ( rule__XAction__ActionAssignment_3 ) ) )
            // InternalXMachine.g:5767:1: ( ( rule__XAction__ActionAssignment_3 ) )
            {
            // InternalXMachine.g:5767:1: ( ( rule__XAction__ActionAssignment_3 ) )
            // InternalXMachine.g:5768:2: ( rule__XAction__ActionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAssignment_3()); 
            }
            // InternalXMachine.g:5769:2: ( rule__XAction__ActionAssignment_3 )
            // InternalXMachine.g:5769:3: rule__XAction__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XAction__ActionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getActionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__Group__3__Impl"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0"
    // InternalXMachine.g:5778:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5782:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1 )
            // InternalXMachine.g:5783:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1
            {
            pushFollow(FOLLOW_34);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0__Impl"
    // InternalXMachine.g:5790:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5794:1: ( ( '%' ) )
            // InternalXMachine.g:5795:1: ( '%' )
            {
            // InternalXMachine.g:5795:1: ( '%' )
            // InternalXMachine.g:5796:2: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_59_0()); 
            }
            match(input,200,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_59_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__0__Impl"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1"
    // InternalXMachine.g:5805:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5809:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1__Impl )
            // InternalXMachine.g:5810:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1__Impl"
    // InternalXMachine.g:5816:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5820:1: ( ( '\\u22C2' ) )
            // InternalXMachine.g:5821:1: ( '\\u22C2' )
            {
            // InternalXMachine.g:5821:1: ( '\\u22C2' )
            // InternalXMachine.g:5822:2: '\\u22C2'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_59_1()); 
            }
            match(input,201,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_59_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_59__1__Impl"


    // $ANTLR start "rule__XRecord__Group__0"
    // InternalXMachine.g:5832:1: rule__XRecord__Group__0 : rule__XRecord__Group__0__Impl rule__XRecord__Group__1 ;
    public final void rule__XRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5836:1: ( rule__XRecord__Group__0__Impl rule__XRecord__Group__1 )
            // InternalXMachine.g:5837:2: rule__XRecord__Group__0__Impl rule__XRecord__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__XRecord__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__0"


    // $ANTLR start "rule__XRecord__Group__0__Impl"
    // InternalXMachine.g:5844:1: rule__XRecord__Group__0__Impl : ( () ) ;
    public final void rule__XRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5848:1: ( ( () ) )
            // InternalXMachine.g:5849:1: ( () )
            {
            // InternalXMachine.g:5849:1: ( () )
            // InternalXMachine.g:5850:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getRecordAction_0()); 
            }
            // InternalXMachine.g:5851:2: ()
            // InternalXMachine.g:5851:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getRecordAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__0__Impl"


    // $ANTLR start "rule__XRecord__Group__1"
    // InternalXMachine.g:5859:1: rule__XRecord__Group__1 : rule__XRecord__Group__1__Impl rule__XRecord__Group__2 ;
    public final void rule__XRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5863:1: ( rule__XRecord__Group__1__Impl rule__XRecord__Group__2 )
            // InternalXMachine.g:5864:2: rule__XRecord__Group__1__Impl rule__XRecord__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__XRecord__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__1"


    // $ANTLR start "rule__XRecord__Group__1__Impl"
    // InternalXMachine.g:5871:1: rule__XRecord__Group__1__Impl : ( ( rule__XRecord__CommentAssignment_1 )? ) ;
    public final void rule__XRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5875:1: ( ( ( rule__XRecord__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5876:1: ( ( rule__XRecord__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5876:1: ( ( rule__XRecord__CommentAssignment_1 )? )
            // InternalXMachine.g:5877:2: ( rule__XRecord__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5878:2: ( rule__XRecord__CommentAssignment_1 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_STRING) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalXMachine.g:5878:3: rule__XRecord__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__1__Impl"


    // $ANTLR start "rule__XRecord__Group__2"
    // InternalXMachine.g:5886:1: rule__XRecord__Group__2 : rule__XRecord__Group__2__Impl rule__XRecord__Group__3 ;
    public final void rule__XRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5890:1: ( rule__XRecord__Group__2__Impl rule__XRecord__Group__3 )
            // InternalXMachine.g:5891:2: rule__XRecord__Group__2__Impl rule__XRecord__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__XRecord__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__2"


    // $ANTLR start "rule__XRecord__Group__2__Impl"
    // InternalXMachine.g:5898:1: rule__XRecord__Group__2__Impl : ( ( rule__XRecord__Alternatives_2 )? ) ;
    public final void rule__XRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5902:1: ( ( ( rule__XRecord__Alternatives_2 )? ) )
            // InternalXMachine.g:5903:1: ( ( rule__XRecord__Alternatives_2 )? )
            {
            // InternalXMachine.g:5903:1: ( ( rule__XRecord__Alternatives_2 )? )
            // InternalXMachine.g:5904:2: ( rule__XRecord__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_2()); 
            }
            // InternalXMachine.g:5905:2: ( rule__XRecord__Alternatives_2 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=170 && LA67_0<=173)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXMachine.g:5905:3: rule__XRecord__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__Alternatives_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__2__Impl"


    // $ANTLR start "rule__XRecord__Group__3"
    // InternalXMachine.g:5913:1: rule__XRecord__Group__3 : rule__XRecord__Group__3__Impl rule__XRecord__Group__4 ;
    public final void rule__XRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5917:1: ( rule__XRecord__Group__3__Impl rule__XRecord__Group__4 )
            // InternalXMachine.g:5918:2: rule__XRecord__Group__3__Impl rule__XRecord__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__XRecord__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__3"


    // $ANTLR start "rule__XRecord__Group__3__Impl"
    // InternalXMachine.g:5925:1: rule__XRecord__Group__3__Impl : ( ( rule__XRecord__Alternatives_3 ) ) ;
    public final void rule__XRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5929:1: ( ( ( rule__XRecord__Alternatives_3 ) ) )
            // InternalXMachine.g:5930:1: ( ( rule__XRecord__Alternatives_3 ) )
            {
            // InternalXMachine.g:5930:1: ( ( rule__XRecord__Alternatives_3 ) )
            // InternalXMachine.g:5931:2: ( rule__XRecord__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_3()); 
            }
            // InternalXMachine.g:5932:2: ( rule__XRecord__Alternatives_3 )
            // InternalXMachine.g:5932:3: rule__XRecord__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__3__Impl"


    // $ANTLR start "rule__XRecord__Group__4"
    // InternalXMachine.g:5940:1: rule__XRecord__Group__4 : rule__XRecord__Group__4__Impl rule__XRecord__Group__5 ;
    public final void rule__XRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5944:1: ( rule__XRecord__Group__4__Impl rule__XRecord__Group__5 )
            // InternalXMachine.g:5945:2: rule__XRecord__Group__4__Impl rule__XRecord__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__XRecord__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__4"


    // $ANTLR start "rule__XRecord__Group__4__Impl"
    // InternalXMachine.g:5952:1: rule__XRecord__Group__4__Impl : ( ( rule__XRecord__NameAssignment_4 ) ) ;
    public final void rule__XRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5956:1: ( ( ( rule__XRecord__NameAssignment_4 ) ) )
            // InternalXMachine.g:5957:1: ( ( rule__XRecord__NameAssignment_4 ) )
            {
            // InternalXMachine.g:5957:1: ( ( rule__XRecord__NameAssignment_4 ) )
            // InternalXMachine.g:5958:2: ( rule__XRecord__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getNameAssignment_4()); 
            }
            // InternalXMachine.g:5959:2: ( rule__XRecord__NameAssignment_4 )
            // InternalXMachine.g:5959:3: rule__XRecord__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__4__Impl"


    // $ANTLR start "rule__XRecord__Group__5"
    // InternalXMachine.g:5967:1: rule__XRecord__Group__5 : rule__XRecord__Group__5__Impl rule__XRecord__Group__6 ;
    public final void rule__XRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5971:1: ( rule__XRecord__Group__5__Impl rule__XRecord__Group__6 )
            // InternalXMachine.g:5972:2: rule__XRecord__Group__5__Impl rule__XRecord__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__XRecord__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__5"


    // $ANTLR start "rule__XRecord__Group__5__Impl"
    // InternalXMachine.g:5979:1: rule__XRecord__Group__5__Impl : ( ( rule__XRecord__Group_5__0 )? ) ;
    public final void rule__XRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5983:1: ( ( ( rule__XRecord__Group_5__0 )? ) )
            // InternalXMachine.g:5984:1: ( ( rule__XRecord__Group_5__0 )? )
            {
            // InternalXMachine.g:5984:1: ( ( rule__XRecord__Group_5__0 )? )
            // InternalXMachine.g:5985:2: ( rule__XRecord__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getGroup_5()); 
            }
            // InternalXMachine.g:5986:2: ( rule__XRecord__Group_5__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=176 && LA68_0<=177)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXMachine.g:5986:3: rule__XRecord__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__5__Impl"


    // $ANTLR start "rule__XRecord__Group__6"
    // InternalXMachine.g:5994:1: rule__XRecord__Group__6 : rule__XRecord__Group__6__Impl rule__XRecord__Group__7 ;
    public final void rule__XRecord__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5998:1: ( rule__XRecord__Group__6__Impl rule__XRecord__Group__7 )
            // InternalXMachine.g:5999:2: rule__XRecord__Group__6__Impl rule__XRecord__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__XRecord__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__6"


    // $ANTLR start "rule__XRecord__Group__6__Impl"
    // InternalXMachine.g:6006:1: rule__XRecord__Group__6__Impl : ( ( rule__XRecord__Alternatives_6 )* ) ;
    public final void rule__XRecord__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6010:1: ( ( ( rule__XRecord__Alternatives_6 )* ) )
            // InternalXMachine.g:6011:1: ( ( rule__XRecord__Alternatives_6 )* )
            {
            // InternalXMachine.g:6011:1: ( ( rule__XRecord__Alternatives_6 )* )
            // InternalXMachine.g:6012:2: ( rule__XRecord__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_6()); 
            }
            // InternalXMachine.g:6013:2: ( rule__XRecord__Alternatives_6 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=178 && LA69_0<=179)||LA69_0==202) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalXMachine.g:6013:3: rule__XRecord__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__XRecord__Alternatives_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getAlternatives_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__6__Impl"


    // $ANTLR start "rule__XRecord__Group__7"
    // InternalXMachine.g:6021:1: rule__XRecord__Group__7 : rule__XRecord__Group__7__Impl ;
    public final void rule__XRecord__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6025:1: ( rule__XRecord__Group__7__Impl )
            // InternalXMachine.g:6026:2: rule__XRecord__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__7"


    // $ANTLR start "rule__XRecord__Group__7__Impl"
    // InternalXMachine.g:6032:1: rule__XRecord__Group__7__Impl : ( 'end' ) ;
    public final void rule__XRecord__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6036:1: ( ( 'end' ) )
            // InternalXMachine.g:6037:1: ( 'end' )
            {
            // InternalXMachine.g:6037:1: ( 'end' )
            // InternalXMachine.g:6038:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getEndKeyword_7()); 
            }
            match(input,187,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getEndKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group__7__Impl"


    // $ANTLR start "rule__XRecord__Group_5__0"
    // InternalXMachine.g:6048:1: rule__XRecord__Group_5__0 : rule__XRecord__Group_5__0__Impl rule__XRecord__Group_5__1 ;
    public final void rule__XRecord__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6052:1: ( rule__XRecord__Group_5__0__Impl rule__XRecord__Group_5__1 )
            // InternalXMachine.g:6053:2: rule__XRecord__Group_5__0__Impl rule__XRecord__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__XRecord__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5__0"


    // $ANTLR start "rule__XRecord__Group_5__0__Impl"
    // InternalXMachine.g:6060:1: rule__XRecord__Group_5__0__Impl : ( ( rule__XRecord__Alternatives_5_0 ) ) ;
    public final void rule__XRecord__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6064:1: ( ( ( rule__XRecord__Alternatives_5_0 ) ) )
            // InternalXMachine.g:6065:1: ( ( rule__XRecord__Alternatives_5_0 ) )
            {
            // InternalXMachine.g:6065:1: ( ( rule__XRecord__Alternatives_5_0 ) )
            // InternalXMachine.g:6066:2: ( rule__XRecord__Alternatives_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_5_0()); 
            }
            // InternalXMachine.g:6067:2: ( rule__XRecord__Alternatives_5_0 )
            // InternalXMachine.g:6067:3: rule__XRecord__Alternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Alternatives_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getAlternatives_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5__0__Impl"


    // $ANTLR start "rule__XRecord__Group_5__1"
    // InternalXMachine.g:6075:1: rule__XRecord__Group_5__1 : rule__XRecord__Group_5__1__Impl ;
    public final void rule__XRecord__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6079:1: ( rule__XRecord__Group_5__1__Impl )
            // InternalXMachine.g:6080:2: rule__XRecord__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5__1"


    // $ANTLR start "rule__XRecord__Group_5__1__Impl"
    // InternalXMachine.g:6086:1: rule__XRecord__Group_5__1__Impl : ( ( rule__XRecord__InheritsNamesAssignment_5_1 ) ) ;
    public final void rule__XRecord__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6090:1: ( ( ( rule__XRecord__InheritsNamesAssignment_5_1 ) ) )
            // InternalXMachine.g:6091:1: ( ( rule__XRecord__InheritsNamesAssignment_5_1 ) )
            {
            // InternalXMachine.g:6091:1: ( ( rule__XRecord__InheritsNamesAssignment_5_1 ) )
            // InternalXMachine.g:6092:2: ( rule__XRecord__InheritsNamesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getInheritsNamesAssignment_5_1()); 
            }
            // InternalXMachine.g:6093:2: ( rule__XRecord__InheritsNamesAssignment_5_1 )
            // InternalXMachine.g:6093:3: rule__XRecord__InheritsNamesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__InheritsNamesAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getInheritsNamesAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5__1__Impl"


    // $ANTLR start "rule__XRecord__Group_6_0__0"
    // InternalXMachine.g:6102:1: rule__XRecord__Group_6_0__0 : rule__XRecord__Group_6_0__0__Impl rule__XRecord__Group_6_0__1 ;
    public final void rule__XRecord__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6106:1: ( rule__XRecord__Group_6_0__0__Impl rule__XRecord__Group_6_0__1 )
            // InternalXMachine.g:6107:2: rule__XRecord__Group_6_0__0__Impl rule__XRecord__Group_6_0__1
            {
            pushFollow(FOLLOW_10);
            rule__XRecord__Group_6_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_6_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_6_0__0"


    // $ANTLR start "rule__XRecord__Group_6_0__0__Impl"
    // InternalXMachine.g:6114:1: rule__XRecord__Group_6_0__0__Impl : ( ( rule__XRecord__Alternatives_6_0_0 ) ) ;
    public final void rule__XRecord__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6118:1: ( ( ( rule__XRecord__Alternatives_6_0_0 ) ) )
            // InternalXMachine.g:6119:1: ( ( rule__XRecord__Alternatives_6_0_0 ) )
            {
            // InternalXMachine.g:6119:1: ( ( rule__XRecord__Alternatives_6_0_0 ) )
            // InternalXMachine.g:6120:2: ( rule__XRecord__Alternatives_6_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_6_0_0()); 
            }
            // InternalXMachine.g:6121:2: ( rule__XRecord__Alternatives_6_0_0 )
            // InternalXMachine.g:6121:3: rule__XRecord__Alternatives_6_0_0
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Alternatives_6_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getAlternatives_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_6_0__0__Impl"


    // $ANTLR start "rule__XRecord__Group_6_0__1"
    // InternalXMachine.g:6129:1: rule__XRecord__Group_6_0__1 : rule__XRecord__Group_6_0__1__Impl ;
    public final void rule__XRecord__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6133:1: ( rule__XRecord__Group_6_0__1__Impl )
            // InternalXMachine.g:6134:2: rule__XRecord__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_6_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_6_0__1"


    // $ANTLR start "rule__XRecord__Group_6_0__1__Impl"
    // InternalXMachine.g:6140:1: rule__XRecord__Group_6_0__1__Impl : ( ( rule__XRecord__OrderedChildrenAssignment_6_0_1 ) ) ;
    public final void rule__XRecord__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6144:1: ( ( ( rule__XRecord__OrderedChildrenAssignment_6_0_1 ) ) )
            // InternalXMachine.g:6145:1: ( ( rule__XRecord__OrderedChildrenAssignment_6_0_1 ) )
            {
            // InternalXMachine.g:6145:1: ( ( rule__XRecord__OrderedChildrenAssignment_6_0_1 ) )
            // InternalXMachine.g:6146:2: ( rule__XRecord__OrderedChildrenAssignment_6_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getOrderedChildrenAssignment_6_0_1()); 
            }
            // InternalXMachine.g:6147:2: ( rule__XRecord__OrderedChildrenAssignment_6_0_1 )
            // InternalXMachine.g:6147:3: rule__XRecord__OrderedChildrenAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__OrderedChildrenAssignment_6_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getOrderedChildrenAssignment_6_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_6_0__1__Impl"


    // $ANTLR start "rule__XRecord__Group_6_1__0"
    // InternalXMachine.g:6156:1: rule__XRecord__Group_6_1__0 : rule__XRecord__Group_6_1__0__Impl rule__XRecord__Group_6_1__1 ;
    public final void rule__XRecord__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6160:1: ( rule__XRecord__Group_6_1__0__Impl rule__XRecord__Group_6_1__1 )
            // InternalXMachine.g:6161:2: rule__XRecord__Group_6_1__0__Impl rule__XRecord__Group_6_1__1
            {
            pushFollow(FOLLOW_12);
            rule__XRecord__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_6_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_6_1__0"


    // $ANTLR start "rule__XRecord__Group_6_1__0__Impl"
    // InternalXMachine.g:6168:1: rule__XRecord__Group_6_1__0__Impl : ( 'constraint' ) ;
    public final void rule__XRecord__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6172:1: ( ( 'constraint' ) )
            // InternalXMachine.g:6173:1: ( 'constraint' )
            {
            // InternalXMachine.g:6173:1: ( 'constraint' )
            // InternalXMachine.g:6174:2: 'constraint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getConstraintKeyword_6_1_0()); 
            }
            match(input,202,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getConstraintKeyword_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_6_1__0__Impl"


    // $ANTLR start "rule__XRecord__Group_6_1__1"
    // InternalXMachine.g:6183:1: rule__XRecord__Group_6_1__1 : rule__XRecord__Group_6_1__1__Impl ;
    public final void rule__XRecord__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6187:1: ( rule__XRecord__Group_6_1__1__Impl )
            // InternalXMachine.g:6188:2: rule__XRecord__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_6_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_6_1__1"


    // $ANTLR start "rule__XRecord__Group_6_1__1__Impl"
    // InternalXMachine.g:6194:1: rule__XRecord__Group_6_1__1__Impl : ( ( rule__XRecord__OrderedChildrenAssignment_6_1_1 ) ) ;
    public final void rule__XRecord__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6198:1: ( ( ( rule__XRecord__OrderedChildrenAssignment_6_1_1 ) ) )
            // InternalXMachine.g:6199:1: ( ( rule__XRecord__OrderedChildrenAssignment_6_1_1 ) )
            {
            // InternalXMachine.g:6199:1: ( ( rule__XRecord__OrderedChildrenAssignment_6_1_1 ) )
            // InternalXMachine.g:6200:2: ( rule__XRecord__OrderedChildrenAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getOrderedChildrenAssignment_6_1_1()); 
            }
            // InternalXMachine.g:6201:2: ( rule__XRecord__OrderedChildrenAssignment_6_1_1 )
            // InternalXMachine.g:6201:3: rule__XRecord__OrderedChildrenAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__OrderedChildrenAssignment_6_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getOrderedChildrenAssignment_6_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_6_1__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalXMachine.g:6210:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6214:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalXMachine.g:6215:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalXMachine.g:6222:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6226:1: ( ( () ) )
            // InternalXMachine.g:6227:1: ( () )
            {
            // InternalXMachine.g:6227:1: ( () )
            // InternalXMachine.g:6228:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            }
            // InternalXMachine.g:6229:2: ()
            // InternalXMachine.g:6229:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getFieldAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalXMachine.g:6237:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6241:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalXMachine.g:6242:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalXMachine.g:6249:1: rule__Field__Group__1__Impl : ( ( rule__Field__CommentAssignment_1 )? ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6253:1: ( ( ( rule__Field__CommentAssignment_1 )? ) )
            // InternalXMachine.g:6254:1: ( ( rule__Field__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:6254:1: ( ( rule__Field__CommentAssignment_1 )? )
            // InternalXMachine.g:6255:2: ( rule__Field__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:6256:2: ( rule__Field__CommentAssignment_1 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_STRING) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXMachine.g:6256:3: rule__Field__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalXMachine.g:6264:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6268:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalXMachine.g:6269:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalXMachine.g:6276:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6280:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalXMachine.g:6281:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalXMachine.g:6281:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalXMachine.g:6282:2: ( rule__Field__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:6283:2: ( rule__Field__NameAssignment_2 )
            // InternalXMachine.g:6283:3: rule__Field__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalXMachine.g:6291:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6295:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalXMachine.g:6296:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalXMachine.g:6303:1: rule__Field__Group__3__Impl : ( ':' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6307:1: ( ( ':' ) )
            // InternalXMachine.g:6308:1: ( ':' )
            {
            // InternalXMachine.g:6308:1: ( ':' )
            // InternalXMachine.g:6309:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getColonKeyword_3()); 
            }
            match(input,108,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // InternalXMachine.g:6318:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6322:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalXMachine.g:6323:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalXMachine.g:6330:1: rule__Field__Group__4__Impl : ( ( rule__Field__MultiplicityAssignment_4 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6334:1: ( ( ( rule__Field__MultiplicityAssignment_4 )? ) )
            // InternalXMachine.g:6335:1: ( ( rule__Field__MultiplicityAssignment_4 )? )
            {
            // InternalXMachine.g:6335:1: ( ( rule__Field__MultiplicityAssignment_4 )? )
            // InternalXMachine.g:6336:2: ( rule__Field__MultiplicityAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMultiplicityAssignment_4()); 
            }
            // InternalXMachine.g:6337:2: ( rule__Field__MultiplicityAssignment_4 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=183 && LA71_0<=185)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalXMachine.g:6337:3: rule__Field__MultiplicityAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__MultiplicityAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMultiplicityAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // InternalXMachine.g:6345:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6349:1: ( rule__Field__Group__5__Impl )
            // InternalXMachine.g:6350:2: rule__Field__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // InternalXMachine.g:6356:1: rule__Field__Group__5__Impl : ( ( rule__Field__TypeAssignment_5 ) ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6360:1: ( ( ( rule__Field__TypeAssignment_5 ) ) )
            // InternalXMachine.g:6361:1: ( ( rule__Field__TypeAssignment_5 ) )
            {
            // InternalXMachine.g:6361:1: ( ( rule__Field__TypeAssignment_5 ) )
            // InternalXMachine.g:6362:2: ( rule__Field__TypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_5()); 
            }
            // InternalXMachine.g:6363:2: ( rule__Field__TypeAssignment_5 )
            // InternalXMachine.g:6363:3: rule__Field__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__XConstraint__Group__0"
    // InternalXMachine.g:6372:1: rule__XConstraint__Group__0 : rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1 ;
    public final void rule__XConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6376:1: ( rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1 )
            // InternalXMachine.g:6377:2: rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__XConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__Group__0"


    // $ANTLR start "rule__XConstraint__Group__0__Impl"
    // InternalXMachine.g:6384:1: rule__XConstraint__Group__0__Impl : ( () ) ;
    public final void rule__XConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6388:1: ( ( () ) )
            // InternalXMachine.g:6389:1: ( () )
            {
            // InternalXMachine.g:6389:1: ( () )
            // InternalXMachine.g:6390:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getConstraintAction_0()); 
            }
            // InternalXMachine.g:6391:2: ()
            // InternalXMachine.g:6391:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConstraintAccess().getConstraintAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__Group__0__Impl"


    // $ANTLR start "rule__XConstraint__Group__1"
    // InternalXMachine.g:6399:1: rule__XConstraint__Group__1 : rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2 ;
    public final void rule__XConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6403:1: ( rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2 )
            // InternalXMachine.g:6404:2: rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__XConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XConstraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__Group__1"


    // $ANTLR start "rule__XConstraint__Group__1__Impl"
    // InternalXMachine.g:6411:1: rule__XConstraint__Group__1__Impl : ( ( rule__XConstraint__CommentAssignment_1 )? ) ;
    public final void rule__XConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6415:1: ( ( ( rule__XConstraint__CommentAssignment_1 )? ) )
            // InternalXMachine.g:6416:1: ( ( rule__XConstraint__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:6416:1: ( ( rule__XConstraint__CommentAssignment_1 )? )
            // InternalXMachine.g:6417:2: ( rule__XConstraint__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:6418:2: ( rule__XConstraint__CommentAssignment_1 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_STRING) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalXMachine.g:6418:3: rule__XConstraint__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XConstraint__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConstraintAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__Group__1__Impl"


    // $ANTLR start "rule__XConstraint__Group__2"
    // InternalXMachine.g:6426:1: rule__XConstraint__Group__2 : rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3 ;
    public final void rule__XConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6430:1: ( rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3 )
            // InternalXMachine.g:6431:2: rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__XConstraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XConstraint__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__Group__2"


    // $ANTLR start "rule__XConstraint__Group__2__Impl"
    // InternalXMachine.g:6438:1: rule__XConstraint__Group__2__Impl : ( ( rule__XConstraint__NameAssignment_2 ) ) ;
    public final void rule__XConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6442:1: ( ( ( rule__XConstraint__NameAssignment_2 ) ) )
            // InternalXMachine.g:6443:1: ( ( rule__XConstraint__NameAssignment_2 ) )
            {
            // InternalXMachine.g:6443:1: ( ( rule__XConstraint__NameAssignment_2 ) )
            // InternalXMachine.g:6444:2: ( rule__XConstraint__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:6445:2: ( rule__XConstraint__NameAssignment_2 )
            // InternalXMachine.g:6445:3: rule__XConstraint__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XConstraint__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConstraintAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__Group__2__Impl"


    // $ANTLR start "rule__XConstraint__Group__3"
    // InternalXMachine.g:6453:1: rule__XConstraint__Group__3 : rule__XConstraint__Group__3__Impl ;
    public final void rule__XConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6457:1: ( rule__XConstraint__Group__3__Impl )
            // InternalXMachine.g:6458:2: rule__XConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XConstraint__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__Group__3"


    // $ANTLR start "rule__XConstraint__Group__3__Impl"
    // InternalXMachine.g:6464:1: rule__XConstraint__Group__3__Impl : ( ( rule__XConstraint__PredicateAssignment_3 ) ) ;
    public final void rule__XConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6468:1: ( ( ( rule__XConstraint__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:6469:1: ( ( rule__XConstraint__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:6469:1: ( ( rule__XConstraint__PredicateAssignment_3 ) )
            // InternalXMachine.g:6470:2: ( rule__XConstraint__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:6471:2: ( rule__XConstraint__PredicateAssignment_3 )
            // InternalXMachine.g:6471:3: rule__XConstraint__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XConstraint__PredicateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConstraintAccess().getPredicateAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__Group__3__Impl"


    // $ANTLR start "rule__Machine__UnorderedGroup_4"
    // InternalXMachine.g:6480:1: rule__Machine__UnorderedGroup_4 : ( rule__Machine__UnorderedGroup_4__0 )? ;
    public final void rule__Machine__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_4());
        	
        try {
            // InternalXMachine.g:6485:1: ( ( rule__Machine__UnorderedGroup_4__0 )? )
            // InternalXMachine.g:6486:2: ( rule__Machine__UnorderedGroup_4__0 )?
            {
            // InternalXMachine.g:6486:2: ( rule__Machine__UnorderedGroup_4__0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( LA73_0 == 192 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt73=1;
            }
            else if ( LA73_0 == 188 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt73=1;
            }
            else if ( LA73_0 == 189 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalXMachine.g:6486:2: rule__Machine__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__UnorderedGroup_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__UnorderedGroup_4"


    // $ANTLR start "rule__Machine__UnorderedGroup_4__Impl"
    // InternalXMachine.g:6494:1: rule__Machine__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__Machine__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:6499:1: ( ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) ) )
            // InternalXMachine.g:6500:3: ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) )
            {
            // InternalXMachine.g:6500:3: ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) )
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( LA75_0 == 192 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt75=1;
            }
            else if ( LA75_0 == 188 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt75=2;
            }
            else if ( LA75_0 == 189 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt75=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalXMachine.g:6501:3: ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) )
                    {
                    // InternalXMachine.g:6501:3: ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) )
                    // InternalXMachine.g:6502:4: {...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalXMachine.g:6502:103: ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) )
                    // InternalXMachine.g:6503:5: ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalXMachine.g:6509:5: ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) )
                    // InternalXMachine.g:6510:6: ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* )
                    {
                    // InternalXMachine.g:6510:6: ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) )
                    // InternalXMachine.g:6511:7: ( rule__Machine__OrderedChildrenAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_4_0()); 
                    }
                    // InternalXMachine.g:6512:7: ( rule__Machine__OrderedChildrenAssignment_4_0 )
                    // InternalXMachine.g:6512:8: rule__Machine__OrderedChildrenAssignment_4_0
                    {
                    pushFollow(FOLLOW_40);
                    rule__Machine__OrderedChildrenAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_4_0()); 
                    }

                    }

                    // InternalXMachine.g:6515:6: ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* )
                    // InternalXMachine.g:6516:7: ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_4_0()); 
                    }
                    // InternalXMachine.g:6517:7: ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==192) ) {
                            int LA74_1 = input.LA(2);

                            if ( (LA74_1==RULE_ID) ) {
                                int LA74_3 = input.LA(3);

                                if ( (synpred1_InternalXMachine()) ) {
                                    alt74=1;
                                }


                            }


                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalXMachine.g:6517:8: ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0
                    	    {
                    	    pushFollow(FOLLOW_40);
                    	    rule__Machine__OrderedChildrenAssignment_4_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_4_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:6523:3: ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) )
                    {
                    // InternalXMachine.g:6523:3: ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) )
                    // InternalXMachine.g:6524:4: {...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalXMachine.g:6524:103: ( ( ( rule__Machine__Group_4_1__0 ) ) )
                    // InternalXMachine.g:6525:5: ( ( rule__Machine__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalXMachine.g:6531:5: ( ( rule__Machine__Group_4_1__0 ) )
                    // InternalXMachine.g:6532:6: ( rule__Machine__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_4_1()); 
                    }
                    // InternalXMachine.g:6533:6: ( rule__Machine__Group_4_1__0 )
                    // InternalXMachine.g:6533:7: rule__Machine__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getGroup_4_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:6538:3: ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) )
                    {
                    // InternalXMachine.g:6538:3: ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) )
                    // InternalXMachine.g:6539:4: {...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalXMachine.g:6539:103: ( ( ( rule__Machine__Group_4_2__0 ) ) )
                    // InternalXMachine.g:6540:5: ( ( rule__Machine__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalXMachine.g:6546:5: ( ( rule__Machine__Group_4_2__0 ) )
                    // InternalXMachine.g:6547:6: ( rule__Machine__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_4_2()); 
                    }
                    // InternalXMachine.g:6548:6: ( rule__Machine__Group_4_2__0 )
                    // InternalXMachine.g:6548:7: rule__Machine__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getGroup_4_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMachineAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Machine__UnorderedGroup_4__0"
    // InternalXMachine.g:6561:1: rule__Machine__UnorderedGroup_4__0 : rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )? ;
    public final void rule__Machine__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6565:1: ( rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )? )
            // InternalXMachine.g:6566:2: rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_41);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:6567:2: ( rule__Machine__UnorderedGroup_4__1 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( LA76_0 == 192 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt76=1;
            }
            else if ( LA76_0 == 188 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt76=1;
            }
            else if ( LA76_0 == 189 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalXMachine.g:6567:2: rule__Machine__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__UnorderedGroup_4__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__UnorderedGroup_4__0"


    // $ANTLR start "rule__Machine__UnorderedGroup_4__1"
    // InternalXMachine.g:6573:1: rule__Machine__UnorderedGroup_4__1 : rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )? ;
    public final void rule__Machine__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6577:1: ( rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )? )
            // InternalXMachine.g:6578:2: rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_41);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:6579:2: ( rule__Machine__UnorderedGroup_4__2 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( LA77_0 == 192 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt77=1;
            }
            else if ( LA77_0 == 188 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt77=1;
            }
            else if ( LA77_0 == 189 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalXMachine.g:6579:2: rule__Machine__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__UnorderedGroup_4__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__UnorderedGroup_4__1"


    // $ANTLR start "rule__Machine__UnorderedGroup_4__2"
    // InternalXMachine.g:6585:1: rule__Machine__UnorderedGroup_4__2 : rule__Machine__UnorderedGroup_4__Impl ;
    public final void rule__Machine__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6589:1: ( rule__Machine__UnorderedGroup_4__Impl )
            // InternalXMachine.g:6590:2: rule__Machine__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__UnorderedGroup_4__2"


    // $ANTLR start "rule__Machine__CommentAssignment_1"
    // InternalXMachine.g:6597:1: rule__Machine__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Machine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6601:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6602:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6602:2: ( RULE_STRING )
            // InternalXMachine.g:6603:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__CommentAssignment_1"


    // $ANTLR start "rule__Machine__NameAssignment_3"
    // InternalXMachine.g:6612:1: rule__Machine__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6616:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6617:2: ( RULE_ID )
            {
            // InternalXMachine.g:6617:2: ( RULE_ID )
            // InternalXMachine.g:6618:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__NameAssignment_3"


    // $ANTLR start "rule__Machine__OrderedChildrenAssignment_4_0"
    // InternalXMachine.g:6627:1: rule__Machine__OrderedChildrenAssignment_4_0 : ( ruleMIncludes ) ;
    public final void rule__Machine__OrderedChildrenAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6631:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:6632:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:6632:2: ( ruleMIncludes )
            // InternalXMachine.g:6633:3: ruleMIncludes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenMIncludesParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMIncludes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenMIncludesParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OrderedChildrenAssignment_4_0"


    // $ANTLR start "rule__Machine__RefinesAssignment_4_1_1"
    // InternalXMachine.g:6642:1: rule__Machine__RefinesAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6646:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6647:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6647:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6648:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_1_0()); 
            }
            // InternalXMachine.g:6649:3: ( RULE_ID )
            // InternalXMachine.g:6650:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_4_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_4_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__RefinesAssignment_4_1_1"


    // $ANTLR start "rule__Machine__SeesAssignment_4_2_1"
    // InternalXMachine.g:6661:1: rule__Machine__SeesAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6665:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6666:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6666:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6667:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesContextCrossReference_4_2_1_0()); 
            }
            // InternalXMachine.g:6668:3: ( RULE_ID )
            // InternalXMachine.g:6669:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_4_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_4_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesContextCrossReference_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__SeesAssignment_4_2_1"


    // $ANTLR start "rule__Machine__OrderedChildrenAssignment_5_1"
    // InternalXMachine.g:6680:1: rule__Machine__OrderedChildrenAssignment_5_1 : ( ruleMContains ) ;
    public final void rule__Machine__OrderedChildrenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6684:1: ( ( ruleMContains ) )
            // InternalXMachine.g:6685:2: ( ruleMContains )
            {
            // InternalXMachine.g:6685:2: ( ruleMContains )
            // InternalXMachine.g:6686:3: ruleMContains
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenMContainsParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMContains();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenMContainsParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OrderedChildrenAssignment_5_1"


    // $ANTLR start "rule__Machine__OrderedChildrenAssignment_6_0_1"
    // InternalXMachine.g:6695:1: rule__Machine__OrderedChildrenAssignment_6_0_1 : ( ruleXMultipleVariable ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6699:1: ( ( ruleXMultipleVariable ) )
            // InternalXMachine.g:6700:2: ( ruleXMultipleVariable )
            {
            // InternalXMachine.g:6700:2: ( ruleXMultipleVariable )
            // InternalXMachine.g:6701:3: ruleXMultipleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXMultipleVariableParserRuleCall_6_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXMultipleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXMultipleVariableParserRuleCall_6_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OrderedChildrenAssignment_6_0_1"


    // $ANTLR start "rule__Machine__OrderedChildrenAssignment_6_1"
    // InternalXMachine.g:6710:1: rule__Machine__OrderedChildrenAssignment_6_1 : ( ruleXIndividualVariable ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6714:1: ( ( ruleXIndividualVariable ) )
            // InternalXMachine.g:6715:2: ( ruleXIndividualVariable )
            {
            // InternalXMachine.g:6715:2: ( ruleXIndividualVariable )
            // InternalXMachine.g:6716:3: ruleXIndividualVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXIndividualVariableParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXIndividualVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXIndividualVariableParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OrderedChildrenAssignment_6_1"


    // $ANTLR start "rule__Machine__OrderedChildrenAssignment_6_2_1"
    // InternalXMachine.g:6725:1: rule__Machine__OrderedChildrenAssignment_6_2_1 : ( ruleXMultipleInvariant ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6729:1: ( ( ruleXMultipleInvariant ) )
            // InternalXMachine.g:6730:2: ( ruleXMultipleInvariant )
            {
            // InternalXMachine.g:6730:2: ( ruleXMultipleInvariant )
            // InternalXMachine.g:6731:3: ruleXMultipleInvariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXMultipleInvariantParserRuleCall_6_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXMultipleInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXMultipleInvariantParserRuleCall_6_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OrderedChildrenAssignment_6_2_1"


    // $ANTLR start "rule__Machine__OrderedChildrenAssignment_6_3"
    // InternalXMachine.g:6740:1: rule__Machine__OrderedChildrenAssignment_6_3 : ( ruleXIndividualInvariant ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6744:1: ( ( ruleXIndividualInvariant ) )
            // InternalXMachine.g:6745:2: ( ruleXIndividualInvariant )
            {
            // InternalXMachine.g:6745:2: ( ruleXIndividualInvariant )
            // InternalXMachine.g:6746:3: ruleXIndividualInvariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXIndividualInvariantParserRuleCall_6_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXIndividualInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXIndividualInvariantParserRuleCall_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OrderedChildrenAssignment_6_3"


    // $ANTLR start "rule__Machine__OrderedChildrenAssignment_6_4"
    // InternalXMachine.g:6755:1: rule__Machine__OrderedChildrenAssignment_6_4 : ( ruleXRecord ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6759:1: ( ( ruleXRecord ) )
            // InternalXMachine.g:6760:2: ( ruleXRecord )
            {
            // InternalXMachine.g:6760:2: ( ruleXRecord )
            // InternalXMachine.g:6761:3: ruleXRecord
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXRecordParserRuleCall_6_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXRecord();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXRecordParserRuleCall_6_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OrderedChildrenAssignment_6_4"


    // $ANTLR start "rule__Machine__OrderedChildrenAssignment_6_5"
    // InternalXMachine.g:6770:1: rule__Machine__OrderedChildrenAssignment_6_5 : ( ruleXVariant ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6774:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:6775:2: ( ruleXVariant )
            {
            // InternalXMachine.g:6775:2: ( ruleXVariant )
            // InternalXMachine.g:6776:3: ruleXVariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXVariantParserRuleCall_6_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXVariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXVariantParserRuleCall_6_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OrderedChildrenAssignment_6_5"


    // $ANTLR start "rule__Machine__OrderedChildrenAssignment_6_6"
    // InternalXMachine.g:6785:1: rule__Machine__OrderedChildrenAssignment_6_6 : ( ruleXEvent ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6789:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:6790:2: ( ruleXEvent )
            {
            // InternalXMachine.g:6790:2: ( ruleXEvent )
            // InternalXMachine.g:6791:3: ruleXEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXEventParserRuleCall_6_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXEventParserRuleCall_6_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OrderedChildrenAssignment_6_6"


    // $ANTLR start "rule__Machine__OrderedChildrenAssignment_7_1"
    // InternalXMachine.g:6800:1: rule__Machine__OrderedChildrenAssignment_7_1 : ( ruleXEvent ) ;
    public final void rule__Machine__OrderedChildrenAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6804:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:6805:2: ( ruleXEvent )
            {
            // InternalXMachine.g:6805:2: ( ruleXEvent )
            // InternalXMachine.g:6806:3: ruleXEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXEventParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXEventParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__OrderedChildrenAssignment_7_1"


    // $ANTLR start "rule__MContains__ExtensionAssignment_1"
    // InternalXMachine.g:6815:1: rule__MContains__ExtensionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MContains__ExtensionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6819:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:6820:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:6820:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:6821:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionDiagramOwnerCrossReference_1_0()); 
            }
            // InternalXMachine.g:6822:3: ( ruleQualifiedName )
            // InternalXMachine.g:6823:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionDiagramOwnerQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getExtensionDiagramOwnerQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getExtensionDiagramOwnerCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__ExtensionAssignment_1"


    // $ANTLR start "rule__MIncludes__AbstractMachineAssignment_1_1"
    // InternalXMachine.g:6834:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6838:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:6839:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:6839:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:6840:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            }
            // InternalXMachine.g:6841:3: ( ruleQualifiedName )
            // InternalXMachine.g:6842:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineQualifiedNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getAbstractMachineMachineQualifiedNameParserRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__AbstractMachineAssignment_1_1"


    // $ANTLR start "rule__MIncludes__ConcreteMachineAssignment_2_1"
    // InternalXMachine.g:6853:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6857:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6858:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6858:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6859:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            }
            // InternalXMachine.g:6860:3: ( RULE_ID )
            // InternalXMachine.g:6861:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getConcreteMachineMachineIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__ConcreteMachineAssignment_2_1"


    // $ANTLR start "rule__MIncludes__PrefixesAssignment_3_1"
    // InternalXMachine.g:6872:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6876:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6877:2: ( RULE_ID )
            {
            // InternalXMachine.g:6877:2: ( RULE_ID )
            // InternalXMachine.g:6878:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__PrefixesAssignment_3_1"


    // $ANTLR start "rule__MIncludes__PrefixesAssignment_3_2"
    // InternalXMachine.g:6887:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6891:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6892:2: ( RULE_ID )
            {
            // InternalXMachine.g:6892:2: ( RULE_ID )
            // InternalXMachine.g:6893:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MIncludes__PrefixesAssignment_3_2"


    // $ANTLR start "rule__XMultipleVariable__CommentAssignment_1"
    // InternalXMachine.g:6902:1: rule__XMultipleVariable__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XMultipleVariable__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6906:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6907:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6907:2: ( RULE_STRING )
            // InternalXMachine.g:6908:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleVariableAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleVariableAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleVariable__CommentAssignment_1"


    // $ANTLR start "rule__XMultipleVariable__NameAssignment_2"
    // InternalXMachine.g:6917:1: rule__XMultipleVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XMultipleVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6921:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6922:2: ( RULE_ID )
            {
            // InternalXMachine.g:6922:2: ( RULE_ID )
            // InternalXMachine.g:6923:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleVariable__NameAssignment_2"


    // $ANTLR start "rule__XIndividualVariable__CommentAssignment_1"
    // InternalXMachine.g:6932:1: rule__XIndividualVariable__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualVariable__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6936:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6937:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6937:2: ( RULE_STRING )
            // InternalXMachine.g:6938:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__CommentAssignment_1"


    // $ANTLR start "rule__XIndividualVariable__NameAssignment_3"
    // InternalXMachine.g:6947:1: rule__XIndividualVariable__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XIndividualVariable__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6951:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6952:2: ( RULE_ID )
            {
            // InternalXMachine.g:6952:2: ( RULE_ID )
            // InternalXMachine.g:6953:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__NameAssignment_3"


    // $ANTLR start "rule__XIndividualVariable__TypeAssignment_4_1"
    // InternalXMachine.g:6962:1: rule__XIndividualVariable__TypeAssignment_4_1 : ( ruleXType ) ;
    public final void rule__XIndividualVariable__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6966:1: ( ( ruleXType ) )
            // InternalXMachine.g:6967:2: ( ruleXType )
            {
            // InternalXMachine.g:6967:2: ( ruleXType )
            // InternalXMachine.g:6968:3: ruleXType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getTypeXTypeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getTypeXTypeParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__TypeAssignment_4_1"


    // $ANTLR start "rule__XIndividualVariable__ValueAssignment_5_1"
    // InternalXMachine.g:6977:1: rule__XIndividualVariable__ValueAssignment_5_1 : ( ruleXFormula ) ;
    public final void rule__XIndividualVariable__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6981:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6982:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6982:2: ( ruleXFormula )
            // InternalXMachine.g:6983:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getValueXFormulaParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getValueXFormulaParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualVariable__ValueAssignment_5_1"


    // $ANTLR start "rule__XMultipleInvariant__CommentAssignment_1"
    // InternalXMachine.g:6992:1: rule__XMultipleInvariant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XMultipleInvariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6996:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6997:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6997:2: ( RULE_STRING )
            // InternalXMachine.g:6998:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleInvariantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__CommentAssignment_1"


    // $ANTLR start "rule__XMultipleInvariant__NameAssignment_2"
    // InternalXMachine.g:7007:1: rule__XMultipleInvariant__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XMultipleInvariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7011:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7012:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7012:2: ( RULE_XLABEL )
            // InternalXMachine.g:7013:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleInvariantAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__NameAssignment_2"


    // $ANTLR start "rule__XMultipleInvariant__PredicateAssignment_3"
    // InternalXMachine.g:7022:1: rule__XMultipleInvariant__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XMultipleInvariant__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7026:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7027:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7027:2: ( ruleXFormula )
            // InternalXMachine.g:7028:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMultipleInvariantAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMultipleInvariant__PredicateAssignment_3"


    // $ANTLR start "rule__XIndividualInvariant__CommentAssignment_1"
    // InternalXMachine.g:7037:1: rule__XIndividualInvariant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualInvariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7041:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7042:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7042:2: ( RULE_STRING )
            // InternalXMachine.g:7043:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__CommentAssignment_1"


    // $ANTLR start "rule__XIndividualInvariant__TheoremAssignment_2_0"
    // InternalXMachine.g:7052:1: rule__XIndividualInvariant__TheoremAssignment_2_0 : ( ( 'theorem' ) ) ;
    public final void rule__XIndividualInvariant__TheoremAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7056:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:7057:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:7057:2: ( ( 'theorem' ) )
            // InternalXMachine.g:7058:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getTheoremTheoremKeyword_2_0_0()); 
            }
            // InternalXMachine.g:7059:3: ( 'theorem' )
            // InternalXMachine.g:7060:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getTheoremTheoremKeyword_2_0_0()); 
            }
            match(input,203,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getTheoremTheoremKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getTheoremTheoremKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__TheoremAssignment_2_0"


    // $ANTLR start "rule__XIndividualInvariant__NameAssignment_3"
    // InternalXMachine.g:7071:1: rule__XIndividualInvariant__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XIndividualInvariant__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7075:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7076:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7076:2: ( RULE_XLABEL )
            // InternalXMachine.g:7077:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getNameXLABELTerminalRuleCall_3_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getNameXLABELTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__NameAssignment_3"


    // $ANTLR start "rule__XIndividualInvariant__PredicateAssignment_4"
    // InternalXMachine.g:7086:1: rule__XIndividualInvariant__PredicateAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XIndividualInvariant__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7090:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7091:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7091:2: ( ruleXFormula )
            // InternalXMachine.g:7092:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getPredicateXFormulaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualInvariantAccess().getPredicateXFormulaParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualInvariant__PredicateAssignment_4"


    // $ANTLR start "rule__XVariant__CommentAssignment_1"
    // InternalXMachine.g:7101:1: rule__XVariant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XVariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7105:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7106:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7106:2: ( RULE_STRING )
            // InternalXMachine.g:7107:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__CommentAssignment_1"


    // $ANTLR start "rule__XVariant__NameAssignment_3"
    // InternalXMachine.g:7116:1: rule__XVariant__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XVariant__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7120:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7121:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7121:2: ( RULE_XLABEL )
            // InternalXMachine.g:7122:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getNameXLABELTerminalRuleCall_3_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getNameXLABELTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__NameAssignment_3"


    // $ANTLR start "rule__XVariant__ExpressionAssignment_4"
    // InternalXMachine.g:7131:1: rule__XVariant__ExpressionAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XVariant__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7135:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7136:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7136:2: ( ruleXFormula )
            // InternalXMachine.g:7137:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionXFormulaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getExpressionXFormulaParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__ExpressionAssignment_4"


    // $ANTLR start "rule__XEvent__CommentAssignment_1"
    // InternalXMachine.g:7146:1: rule__XEvent__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XEvent__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7150:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7151:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7151:2: ( RULE_STRING )
            // InternalXMachine.g:7152:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__CommentAssignment_1"


    // $ANTLR start "rule__XEvent__ConvergenceAssignment_2"
    // InternalXMachine.g:7161:1: rule__XEvent__ConvergenceAssignment_2 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7165:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:7166:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:7166:2: ( ruleXConvergence )
            // InternalXMachine.g:7167:3: ruleXConvergence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXConvergence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ConvergenceAssignment_2"


    // $ANTLR start "rule__XEvent__NameAssignment_4"
    // InternalXMachine.g:7176:1: rule__XEvent__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7180:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7181:2: ( RULE_ID )
            {
            // InternalXMachine.g:7181:2: ( RULE_ID )
            // InternalXMachine.g:7182:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__NameAssignment_4"


    // $ANTLR start "rule__XEvent__RefinesAssignment_5_0_1"
    // InternalXMachine.g:7191:1: rule__XEvent__RefinesAssignment_5_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7195:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:7196:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:7196:2: ( ( RULE_ID ) )
            // InternalXMachine.g:7197:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_0_1_0()); 
            }
            // InternalXMachine.g:7198:3: ( RULE_ID )
            // InternalXMachine.g:7199:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_5_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_5_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__RefinesAssignment_5_0_1"


    // $ANTLR start "rule__XEvent__ExtendedAssignment_5_1_0"
    // InternalXMachine.g:7210:1: rule__XEvent__ExtendedAssignment_5_1_0 : ( ( 'extends' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7214:1: ( ( ( 'extends' ) ) )
            // InternalXMachine.g:7215:2: ( ( 'extends' ) )
            {
            // InternalXMachine.g:7215:2: ( ( 'extends' ) )
            // InternalXMachine.g:7216:3: ( 'extends' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_5_1_0_0()); 
            }
            // InternalXMachine.g:7217:3: ( 'extends' )
            // InternalXMachine.g:7218:4: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_5_1_0_0()); 
            }
            match(input,204,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_5_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_5_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtendedAssignment_5_1_0"


    // $ANTLR start "rule__XEvent__RefinesAssignment_5_1_1"
    // InternalXMachine.g:7229:1: rule__XEvent__RefinesAssignment_5_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7233:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:7234:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:7234:2: ( ( RULE_ID ) )
            // InternalXMachine.g:7235:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_1_0()); 
            }
            // InternalXMachine.g:7236:3: ( RULE_ID )
            // InternalXMachine.g:7237:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_5_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_5_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__RefinesAssignment_5_1_1"


    // $ANTLR start "rule__XEvent__OrderedChildrenAssignment_6_1"
    // InternalXMachine.g:7248:1: rule__XEvent__OrderedChildrenAssignment_6_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7252:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:7253:2: ( ruleXParameter )
            {
            // InternalXMachine.g:7253:2: ( ruleXParameter )
            // InternalXMachine.g:7254:3: ruleXParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenXParameterParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenXParameterParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__OrderedChildrenAssignment_6_1"


    // $ANTLR start "rule__XEvent__OrderedChildrenAssignment_7"
    // InternalXMachine.g:7263:1: rule__XEvent__OrderedChildrenAssignment_7 : ( ruleEventSync ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7267:1: ( ( ruleEventSync ) )
            // InternalXMachine.g:7268:2: ( ruleEventSync )
            {
            // InternalXMachine.g:7268:2: ( ruleEventSync )
            // InternalXMachine.g:7269:3: ruleEventSync
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenEventSyncParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventSync();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenEventSyncParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__OrderedChildrenAssignment_7"


    // $ANTLR start "rule__XEvent__OrderedChildrenAssignment_8_1"
    // InternalXMachine.g:7278:1: rule__XEvent__OrderedChildrenAssignment_8_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7282:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:7283:2: ( ruleXGuard )
            {
            // InternalXMachine.g:7283:2: ( ruleXGuard )
            // InternalXMachine.g:7284:3: ruleXGuard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenXGuardParserRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenXGuardParserRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__OrderedChildrenAssignment_8_1"


    // $ANTLR start "rule__XEvent__OrderedChildrenAssignment_9_1"
    // InternalXMachine.g:7293:1: rule__XEvent__OrderedChildrenAssignment_9_1 : ( ruleXAction ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7297:1: ( ( ruleXAction ) )
            // InternalXMachine.g:7298:2: ( ruleXAction )
            {
            // InternalXMachine.g:7298:2: ( ruleXAction )
            // InternalXMachine.g:7299:3: ruleXAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenXActionParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenXActionParserRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__OrderedChildrenAssignment_9_1"


    // $ANTLR start "rule__XEvent__OrderedChildrenAssignment_10_1"
    // InternalXMachine.g:7308:1: rule__XEvent__OrderedChildrenAssignment_10_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7312:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:7313:2: ( ruleXWitness )
            {
            // InternalXMachine.g:7313:2: ( ruleXWitness )
            // InternalXMachine.g:7314:3: ruleXWitness
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenXWitnessParserRuleCall_10_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenXWitnessParserRuleCall_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__OrderedChildrenAssignment_10_1"


    // $ANTLR start "rule__EventSync__PrefixAssignment_1_1_0"
    // InternalXMachine.g:7323:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7327:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7328:2: ( RULE_ID )
            {
            // InternalXMachine.g:7328:2: ( RULE_ID )
            // InternalXMachine.g:7329:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__PrefixAssignment_1_1_0"


    // $ANTLR start "rule__EventSync__SynchronisedEventAssignment_1_2"
    // InternalXMachine.g:7338:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7342:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:7343:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:7343:2: ( ( RULE_ID ) )
            // InternalXMachine.g:7344:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            }
            // InternalXMachine.g:7345:3: ( RULE_ID )
            // InternalXMachine.g:7346:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSync__SynchronisedEventAssignment_1_2"


    // $ANTLR start "rule__XParameter__CommentAssignment_1"
    // InternalXMachine.g:7357:1: rule__XParameter__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XParameter__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7361:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7362:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7362:2: ( RULE_STRING )
            // InternalXMachine.g:7363:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__CommentAssignment_1"


    // $ANTLR start "rule__XParameter__NameAssignment_2"
    // InternalXMachine.g:7372:1: rule__XParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7376:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7377:2: ( RULE_ID )
            {
            // InternalXMachine.g:7377:2: ( RULE_ID )
            // InternalXMachine.g:7378:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__NameAssignment_2"


    // $ANTLR start "rule__XGuard__CommentAssignment_1"
    // InternalXMachine.g:7387:1: rule__XGuard__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XGuard__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7391:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7392:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7392:2: ( RULE_STRING )
            // InternalXMachine.g:7393:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__CommentAssignment_1"


    // $ANTLR start "rule__XGuard__TheoremAssignment_2"
    // InternalXMachine.g:7402:1: rule__XGuard__TheoremAssignment_2 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7406:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:7407:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:7407:2: ( ( 'theorem' ) )
            // InternalXMachine.g:7408:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_2_0()); 
            }
            // InternalXMachine.g:7409:3: ( 'theorem' )
            // InternalXMachine.g:7410:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_2_0()); 
            }
            match(input,203,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__TheoremAssignment_2"


    // $ANTLR start "rule__XGuard__NameAssignment_3"
    // InternalXMachine.g:7421:1: rule__XGuard__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7425:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7426:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7426:2: ( RULE_XLABEL )
            // InternalXMachine.g:7427:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_3_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__NameAssignment_3"


    // $ANTLR start "rule__XGuard__PredicateAssignment_4"
    // InternalXMachine.g:7436:1: rule__XGuard__PredicateAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XGuard__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7440:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7441:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7441:2: ( ruleXFormula )
            // InternalXMachine.g:7442:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateXFormulaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getPredicateXFormulaParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__PredicateAssignment_4"


    // $ANTLR start "rule__XWitness__CommentAssignment_1"
    // InternalXMachine.g:7451:1: rule__XWitness__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XWitness__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7455:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7456:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7456:2: ( RULE_STRING )
            // InternalXMachine.g:7457:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__CommentAssignment_1"


    // $ANTLR start "rule__XWitness__NameAssignment_2"
    // InternalXMachine.g:7466:1: rule__XWitness__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7470:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7471:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7471:2: ( RULE_XLABEL )
            // InternalXMachine.g:7472:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__NameAssignment_2"


    // $ANTLR start "rule__XWitness__PredicateAssignment_3"
    // InternalXMachine.g:7481:1: rule__XWitness__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XWitness__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7485:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7486:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7486:2: ( ruleXFormula )
            // InternalXMachine.g:7487:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__PredicateAssignment_3"


    // $ANTLR start "rule__XAction__CommentAssignment_1"
    // InternalXMachine.g:7496:1: rule__XAction__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XAction__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7500:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7501:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7501:2: ( RULE_STRING )
            // InternalXMachine.g:7502:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__CommentAssignment_1"


    // $ANTLR start "rule__XAction__NameAssignment_2"
    // InternalXMachine.g:7511:1: rule__XAction__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7515:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7516:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7516:2: ( RULE_XLABEL )
            // InternalXMachine.g:7517:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__NameAssignment_2"


    // $ANTLR start "rule__XAction__ActionAssignment_3"
    // InternalXMachine.g:7526:1: rule__XAction__ActionAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XAction__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7530:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7531:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7531:2: ( ruleXFormula )
            // InternalXMachine.g:7532:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionXFormulaParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getActionXFormulaParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__ActionAssignment_3"


    // $ANTLR start "rule__XRecord__CommentAssignment_1"
    // InternalXMachine.g:7541:1: rule__XRecord__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XRecord__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7545:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7546:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7546:2: ( RULE_STRING )
            // InternalXMachine.g:7547:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__CommentAssignment_1"


    // $ANTLR start "rule__XRecord__ExtendedAssignment_2_0"
    // InternalXMachine.g:7556:1: rule__XRecord__ExtendedAssignment_2_0 : ( ( rule__XRecord__ExtendedAlternatives_2_0_0 ) ) ;
    public final void rule__XRecord__ExtendedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7560:1: ( ( ( rule__XRecord__ExtendedAlternatives_2_0_0 ) ) )
            // InternalXMachine.g:7561:2: ( ( rule__XRecord__ExtendedAlternatives_2_0_0 ) )
            {
            // InternalXMachine.g:7561:2: ( ( rule__XRecord__ExtendedAlternatives_2_0_0 ) )
            // InternalXMachine.g:7562:3: ( rule__XRecord__ExtendedAlternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getExtendedAlternatives_2_0_0()); 
            }
            // InternalXMachine.g:7563:3: ( rule__XRecord__ExtendedAlternatives_2_0_0 )
            // InternalXMachine.g:7563:4: rule__XRecord__ExtendedAlternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__ExtendedAlternatives_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getExtendedAlternatives_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__ExtendedAssignment_2_0"


    // $ANTLR start "rule__XRecord__RefinedAssignment_2_1"
    // InternalXMachine.g:7571:1: rule__XRecord__RefinedAssignment_2_1 : ( ( rule__XRecord__RefinedAlternatives_2_1_0 ) ) ;
    public final void rule__XRecord__RefinedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7575:1: ( ( ( rule__XRecord__RefinedAlternatives_2_1_0 ) ) )
            // InternalXMachine.g:7576:2: ( ( rule__XRecord__RefinedAlternatives_2_1_0 ) )
            {
            // InternalXMachine.g:7576:2: ( ( rule__XRecord__RefinedAlternatives_2_1_0 ) )
            // InternalXMachine.g:7577:3: ( rule__XRecord__RefinedAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getRefinedAlternatives_2_1_0()); 
            }
            // InternalXMachine.g:7578:3: ( rule__XRecord__RefinedAlternatives_2_1_0 )
            // InternalXMachine.g:7578:4: rule__XRecord__RefinedAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__RefinedAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getRefinedAlternatives_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__RefinedAssignment_2_1"


    // $ANTLR start "rule__XRecord__NameAssignment_4"
    // InternalXMachine.g:7586:1: rule__XRecord__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__XRecord__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7590:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7591:2: ( RULE_ID )
            {
            // InternalXMachine.g:7591:2: ( RULE_ID )
            // InternalXMachine.g:7592:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__NameAssignment_4"


    // $ANTLR start "rule__XRecord__InheritsNamesAssignment_5_1"
    // InternalXMachine.g:7601:1: rule__XRecord__InheritsNamesAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__XRecord__InheritsNamesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7605:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7606:2: ( RULE_ID )
            {
            // InternalXMachine.g:7606:2: ( RULE_ID )
            // InternalXMachine.g:7607:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getInheritsNamesIDTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getInheritsNamesIDTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__InheritsNamesAssignment_5_1"


    // $ANTLR start "rule__XRecord__OrderedChildrenAssignment_6_0_1"
    // InternalXMachine.g:7616:1: rule__XRecord__OrderedChildrenAssignment_6_0_1 : ( ruleField ) ;
    public final void rule__XRecord__OrderedChildrenAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7620:1: ( ( ruleField ) )
            // InternalXMachine.g:7621:2: ( ruleField )
            {
            // InternalXMachine.g:7621:2: ( ruleField )
            // InternalXMachine.g:7622:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getOrderedChildrenFieldParserRuleCall_6_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getOrderedChildrenFieldParserRuleCall_6_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__OrderedChildrenAssignment_6_0_1"


    // $ANTLR start "rule__XRecord__OrderedChildrenAssignment_6_1_1"
    // InternalXMachine.g:7631:1: rule__XRecord__OrderedChildrenAssignment_6_1_1 : ( ruleXConstraint ) ;
    public final void rule__XRecord__OrderedChildrenAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7635:1: ( ( ruleXConstraint ) )
            // InternalXMachine.g:7636:2: ( ruleXConstraint )
            {
            // InternalXMachine.g:7636:2: ( ruleXConstraint )
            // InternalXMachine.g:7637:3: ruleXConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getOrderedChildrenXConstraintParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getOrderedChildrenXConstraintParserRuleCall_6_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__OrderedChildrenAssignment_6_1_1"


    // $ANTLR start "rule__Field__CommentAssignment_1"
    // InternalXMachine.g:7646:1: rule__Field__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Field__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7650:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7651:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7651:2: ( RULE_STRING )
            // InternalXMachine.g:7652:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__CommentAssignment_1"


    // $ANTLR start "rule__Field__NameAssignment_2"
    // InternalXMachine.g:7661:1: rule__Field__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7665:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7666:2: ( RULE_ID )
            {
            // InternalXMachine.g:7666:2: ( RULE_ID )
            // InternalXMachine.g:7667:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_2"


    // $ANTLR start "rule__Field__MultiplicityAssignment_4"
    // InternalXMachine.g:7676:1: rule__Field__MultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Field__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7680:1: ( ( ruleMultiplicity ) )
            // InternalXMachine.g:7681:2: ( ruleMultiplicity )
            {
            // InternalXMachine.g:7681:2: ( ruleMultiplicity )
            // InternalXMachine.g:7682:3: ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__MultiplicityAssignment_4"


    // $ANTLR start "rule__Field__TypeAssignment_5"
    // InternalXMachine.g:7691:1: rule__Field__TypeAssignment_5 : ( ruleXType ) ;
    public final void rule__Field__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7695:1: ( ( ruleXType ) )
            // InternalXMachine.g:7696:2: ( ruleXType )
            {
            // InternalXMachine.g:7696:2: ( ruleXType )
            // InternalXMachine.g:7697:3: ruleXType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeXTypeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeXTypeParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_5"


    // $ANTLR start "rule__XConstraint__CommentAssignment_1"
    // InternalXMachine.g:7706:1: rule__XConstraint__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XConstraint__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7710:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7711:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7711:2: ( RULE_STRING )
            // InternalXMachine.g:7712:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConstraintAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__CommentAssignment_1"


    // $ANTLR start "rule__XConstraint__NameAssignment_2"
    // InternalXMachine.g:7721:1: rule__XConstraint__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XConstraint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7725:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7726:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7726:2: ( RULE_XLABEL )
            // InternalXMachine.g:7727:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConstraintAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__NameAssignment_2"


    // $ANTLR start "rule__XConstraint__PredicateAssignment_3"
    // InternalXMachine.g:7736:1: rule__XConstraint__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XConstraint__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7740:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7741:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7741:2: ( ruleXFormula )
            // InternalXMachine.g:7742:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXConstraintAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstraint__PredicateAssignment_3"

    // $ANTLR start synpred1_InternalXMachine
    public final void synpred1_InternalXMachine_fragment() throws RecognitionException {   
        // InternalXMachine.g:6517:8: ( rule__Machine__OrderedChildrenAssignment_4_0 )
        // InternalXMachine.g:6517:9: rule__Machine__OrderedChildrenAssignment_4_0
        {
        pushFollow(FOLLOW_2);
        rule__Machine__OrderedChildrenAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalXMachine

    // Delegated rules

    public final boolean synpred1_InternalXMachine() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalXMachine_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFF83FFFFFFC0032L,0xFFFFFFFFFFFFFFFFL,0x000003FFFFFFFFFFL,0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000040000003F040L,0x0000000000000000L,0xC870FC0000000000L,0x0000000000000818L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000040000003F042L,0x0000000000000000L,0x0070FC0000000000L,0x0000000000000818L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000040000003F040L,0x0000000000000000L,0x0070FC0000000000L,0x0000000000000818L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000100400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00003C0000000010L,0x0000000000000940L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xFFF83FFFFFFC0030L,0xFFFFFFFFFFFFFFFFL,0x000003FFFFFFFFFFL,0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000003FFFFFC0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000003FFFFFC0002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000040L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0007800000000000L,0x0000000000000000L,0x1800000000000000L,0x00000000000010E0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000000C0L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000000C2L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000FC0000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x080F000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000C000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00003C0000000010L,0x0000000000000940L,0x0380000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x3000000000000000L,0x0000000000000001L});

}
