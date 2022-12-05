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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_UNTRANSLATED_TOKEN", "RULE_STRING", "RULE_XLABEL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'variables'", "'vars'", "'invariants'", "'invs'", "'variable'", "'var'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'\\u00D7'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'invariant'", "'where'", "'when'", "'then'", "'begin'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21191'", "'\\u2119'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'extended'", "'ext'", "'refined'", "'ref'", "'record'", "'rec'", "'inherits'", "'ihr'", "'field'", "'fld'", "'ordinary'", "'convergent'", "'anticipated'", "'one'", "'many'", "'opt'", "'machine'", "'refines'", "'sees'", "'contains'", "'includes'", "'to'", "'as'", "'variant'", "'event'", "'end'", "'any'", "'with'", "'synchronises'", "'%'", "'\\u22C2'", "'constraint'", "'theorem'", "'extends'"
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
    public static final int RULE_XLABEL=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int RULE_UNTRANSLATED_TOKEN=6;
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_UNTRANSLATED_TOKEN)||(LA1_0>=19 && LA1_0<=34)||(LA1_0>=40 && LA1_0<=121)||LA1_0==151) ) {
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


    // $ANTLR start "entryRuleFieldType"
    // InternalXMachine.g:635:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // InternalXMachine.g:636:1: ( ruleFieldType EOF )
            // InternalXMachine.g:637:1: ruleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldTypeRule()); 
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
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalXMachine.g:644:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:648:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalXMachine.g:649:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalXMachine.g:649:2: ( ( rule__FieldType__Alternatives ) )
            // InternalXMachine.g:650:3: ( rule__FieldType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            }
            // InternalXMachine.g:651:3: ( rule__FieldType__Alternatives )
            // InternalXMachine.g:651:4: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleField"
    // InternalXMachine.g:660:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalXMachine.g:661:1: ( ruleField EOF )
            // InternalXMachine.g:662:1: ruleField EOF
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
    // InternalXMachine.g:669:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:673:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalXMachine.g:674:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalXMachine.g:674:2: ( ( rule__Field__Group__0 ) )
            // InternalXMachine.g:675:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalXMachine.g:676:3: ( rule__Field__Group__0 )
            // InternalXMachine.g:676:4: rule__Field__Group__0
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
    // InternalXMachine.g:685:1: entryRuleXConstraint : ruleXConstraint EOF ;
    public final void entryRuleXConstraint() throws RecognitionException {
        try {
            // InternalXMachine.g:686:1: ( ruleXConstraint EOF )
            // InternalXMachine.g:687:1: ruleXConstraint EOF
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
    // InternalXMachine.g:694:1: ruleXConstraint : ( ( rule__XConstraint__Group__0 ) ) ;
    public final void ruleXConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:698:2: ( ( ( rule__XConstraint__Group__0 ) ) )
            // InternalXMachine.g:699:2: ( ( rule__XConstraint__Group__0 ) )
            {
            // InternalXMachine.g:699:2: ( ( rule__XConstraint__Group__0 ) )
            // InternalXMachine.g:700:3: ( rule__XConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getGroup()); 
            }
            // InternalXMachine.g:701:3: ( rule__XConstraint__Group__0 )
            // InternalXMachine.g:701:4: rule__XConstraint__Group__0
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
    // InternalXMachine.g:710:1: ruleXConvergence : ( ( rule__XConvergence__Alternatives ) ) ;
    public final void ruleXConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:714:1: ( ( ( rule__XConvergence__Alternatives ) ) )
            // InternalXMachine.g:715:2: ( ( rule__XConvergence__Alternatives ) )
            {
            // InternalXMachine.g:715:2: ( ( rule__XConvergence__Alternatives ) )
            // InternalXMachine.g:716:3: ( rule__XConvergence__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            }
            // InternalXMachine.g:717:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:717:4: rule__XConvergence__Alternatives
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
    // InternalXMachine.g:726:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:730:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalXMachine.g:731:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalXMachine.g:731:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalXMachine.g:732:3: ( rule__Multiplicity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            }
            // InternalXMachine.g:733:3: ( rule__Multiplicity__Alternatives )
            // InternalXMachine.g:733:4: rule__Multiplicity__Alternatives
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
    // InternalXMachine.g:741:1: rule__Machine__Alternatives_6 : ( ( ( rule__Machine__Group_6_0__0 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_1 ) ) | ( ( rule__Machine__Group_6_2__0 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_3 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_4 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_5 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_6 ) ) );
    public final void rule__Machine__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:745:1: ( ( ( rule__Machine__Group_6_0__0 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_1 ) ) | ( ( rule__Machine__Group_6_2__0 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_3 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_4 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_5 ) ) | ( ( rule__Machine__OrderedChildrenAssignment_6_6 ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 132:
                case 133:
                case 134:
                case 146:
                    {
                    alt2=7;
                    }
                    break;
                case 145:
                    {
                    alt2=6;
                    }
                    break;
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                    {
                    alt2=5;
                    }
                    break;
                case 35:
                case 154:
                    {
                    alt2=4;
                    }
                    break;
                case 17:
                case 18:
                    {
                    alt2=2;
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
            case 17:
            case 18:
                {
                alt2=2;
                }
                break;
            case 15:
            case 16:
                {
                alt2=3;
                }
                break;
            case 35:
            case 154:
                {
                alt2=4;
                }
                break;
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
                {
                alt2=5;
                }
                break;
            case 145:
                {
                alt2=6;
                }
                break;
            case 132:
            case 133:
            case 134:
            case 146:
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
                    // InternalXMachine.g:746:2: ( ( rule__Machine__Group_6_0__0 ) )
                    {
                    // InternalXMachine.g:746:2: ( ( rule__Machine__Group_6_0__0 ) )
                    // InternalXMachine.g:747:3: ( rule__Machine__Group_6_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_6_0()); 
                    }
                    // InternalXMachine.g:748:3: ( rule__Machine__Group_6_0__0 )
                    // InternalXMachine.g:748:4: rule__Machine__Group_6_0__0
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
                    // InternalXMachine.g:752:2: ( ( rule__Machine__OrderedChildrenAssignment_6_1 ) )
                    {
                    // InternalXMachine.g:752:2: ( ( rule__Machine__OrderedChildrenAssignment_6_1 ) )
                    // InternalXMachine.g:753:3: ( rule__Machine__OrderedChildrenAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_1()); 
                    }
                    // InternalXMachine.g:754:3: ( rule__Machine__OrderedChildrenAssignment_6_1 )
                    // InternalXMachine.g:754:4: rule__Machine__OrderedChildrenAssignment_6_1
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
                    // InternalXMachine.g:758:2: ( ( rule__Machine__Group_6_2__0 ) )
                    {
                    // InternalXMachine.g:758:2: ( ( rule__Machine__Group_6_2__0 ) )
                    // InternalXMachine.g:759:3: ( rule__Machine__Group_6_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_6_2()); 
                    }
                    // InternalXMachine.g:760:3: ( rule__Machine__Group_6_2__0 )
                    // InternalXMachine.g:760:4: rule__Machine__Group_6_2__0
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
                    // InternalXMachine.g:764:2: ( ( rule__Machine__OrderedChildrenAssignment_6_3 ) )
                    {
                    // InternalXMachine.g:764:2: ( ( rule__Machine__OrderedChildrenAssignment_6_3 ) )
                    // InternalXMachine.g:765:3: ( rule__Machine__OrderedChildrenAssignment_6_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_3()); 
                    }
                    // InternalXMachine.g:766:3: ( rule__Machine__OrderedChildrenAssignment_6_3 )
                    // InternalXMachine.g:766:4: rule__Machine__OrderedChildrenAssignment_6_3
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
                    // InternalXMachine.g:770:2: ( ( rule__Machine__OrderedChildrenAssignment_6_4 ) )
                    {
                    // InternalXMachine.g:770:2: ( ( rule__Machine__OrderedChildrenAssignment_6_4 ) )
                    // InternalXMachine.g:771:3: ( rule__Machine__OrderedChildrenAssignment_6_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_4()); 
                    }
                    // InternalXMachine.g:772:3: ( rule__Machine__OrderedChildrenAssignment_6_4 )
                    // InternalXMachine.g:772:4: rule__Machine__OrderedChildrenAssignment_6_4
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
                    // InternalXMachine.g:776:2: ( ( rule__Machine__OrderedChildrenAssignment_6_5 ) )
                    {
                    // InternalXMachine.g:776:2: ( ( rule__Machine__OrderedChildrenAssignment_6_5 ) )
                    // InternalXMachine.g:777:3: ( rule__Machine__OrderedChildrenAssignment_6_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_5()); 
                    }
                    // InternalXMachine.g:778:3: ( rule__Machine__OrderedChildrenAssignment_6_5 )
                    // InternalXMachine.g:778:4: rule__Machine__OrderedChildrenAssignment_6_5
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
                    // InternalXMachine.g:782:2: ( ( rule__Machine__OrderedChildrenAssignment_6_6 ) )
                    {
                    // InternalXMachine.g:782:2: ( ( rule__Machine__OrderedChildrenAssignment_6_6 ) )
                    // InternalXMachine.g:783:3: ( rule__Machine__OrderedChildrenAssignment_6_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_6()); 
                    }
                    // InternalXMachine.g:784:3: ( rule__Machine__OrderedChildrenAssignment_6_6 )
                    // InternalXMachine.g:784:4: rule__Machine__OrderedChildrenAssignment_6_6
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
    // InternalXMachine.g:792:1: rule__Machine__Alternatives_6_0_0 : ( ( 'variables' ) | ( 'vars' ) );
    public final void rule__Machine__Alternatives_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:796:1: ( ( 'variables' ) | ( 'vars' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
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
                    // InternalXMachine.g:797:2: ( 'variables' )
                    {
                    // InternalXMachine.g:797:2: ( 'variables' )
                    // InternalXMachine.g:798:3: 'variables'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getVariablesKeyword_6_0_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getVariablesKeyword_6_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:803:2: ( 'vars' )
                    {
                    // InternalXMachine.g:803:2: ( 'vars' )
                    // InternalXMachine.g:804:3: 'vars'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getVarsKeyword_6_0_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:813:1: rule__Machine__Alternatives_6_2_0 : ( ( 'invariants' ) | ( 'invs' ) );
    public final void rule__Machine__Alternatives_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:817:1: ( ( 'invariants' ) | ( 'invs' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
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
                    // InternalXMachine.g:818:2: ( 'invariants' )
                    {
                    // InternalXMachine.g:818:2: ( 'invariants' )
                    // InternalXMachine.g:819:3: 'invariants'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getInvariantsKeyword_6_2_0_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getInvariantsKeyword_6_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:824:2: ( 'invs' )
                    {
                    // InternalXMachine.g:824:2: ( 'invs' )
                    // InternalXMachine.g:825:3: 'invs'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getInvsKeyword_6_2_0_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:834:1: rule__XIndividualVariable__Alternatives_2 : ( ( 'variable' ) | ( 'var' ) );
    public final void rule__XIndividualVariable__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:838:1: ( ( 'variable' ) | ( 'var' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
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
                    // InternalXMachine.g:839:2: ( 'variable' )
                    {
                    // InternalXMachine.g:839:2: ( 'variable' )
                    // InternalXMachine.g:840:3: 'variable'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXIndividualVariableAccess().getVariableKeyword_2_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXIndividualVariableAccess().getVariableKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:845:2: ( 'var' )
                    {
                    // InternalXMachine.g:845:2: ( 'var' )
                    // InternalXMachine.g:846:3: 'var'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXIndividualVariableAccess().getVarKeyword_2_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:855:1: rule__XTYPEOPERATOR__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '\\u00D7' ) );
    public final void rule__XTYPEOPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:859:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '\\u00D7' ) )
            int alt6=12;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            case 26:
                {
                alt6=8;
                }
                break;
            case 27:
                {
                alt6=9;
                }
                break;
            case 28:
                {
                alt6=10;
                }
                break;
            case 29:
                {
                alt6=11;
                }
                break;
            case 30:
                {
                alt6=12;
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
                    // InternalXMachine.g:860:2: ( '\\u2194' )
                    {
                    // InternalXMachine.g:860:2: ( '\\u2194' )
                    // InternalXMachine.g:861:3: '\\u2194'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:866:2: ( '\\uE100' )
                    {
                    // InternalXMachine.g:866:2: ( '\\uE100' )
                    // InternalXMachine.g:867:3: '\\uE100'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:872:2: ( '\\uE101' )
                    {
                    // InternalXMachine.g:872:2: ( '\\uE101' )
                    // InternalXMachine.g:873:3: '\\uE101'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:878:2: ( '\\uE102' )
                    {
                    // InternalXMachine.g:878:2: ( '\\uE102' )
                    // InternalXMachine.g:879:3: '\\uE102'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:884:2: ( '\\u21F8' )
                    {
                    // InternalXMachine.g:884:2: ( '\\u21F8' )
                    // InternalXMachine.g:885:3: '\\u21F8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:890:2: ( '\\u2192' )
                    {
                    // InternalXMachine.g:890:2: ( '\\u2192' )
                    // InternalXMachine.g:891:3: '\\u2192'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:896:2: ( '\\u2914' )
                    {
                    // InternalXMachine.g:896:2: ( '\\u2914' )
                    // InternalXMachine.g:897:3: '\\u2914'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:902:2: ( '\\u21A3' )
                    {
                    // InternalXMachine.g:902:2: ( '\\u21A3' )
                    // InternalXMachine.g:903:3: '\\u21A3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:908:2: ( '\\u2900' )
                    {
                    // InternalXMachine.g:908:2: ( '\\u2900' )
                    // InternalXMachine.g:909:3: '\\u2900'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:914:2: ( '\\u21A0' )
                    {
                    // InternalXMachine.g:914:2: ( '\\u21A0' )
                    // InternalXMachine.g:915:3: '\\u21A0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:920:2: ( '\\u2916' )
                    {
                    // InternalXMachine.g:920:2: ( '\\u2916' )
                    // InternalXMachine.g:921:3: '\\u2916'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:926:2: ( '\\u00D7' )
                    {
                    // InternalXMachine.g:926:2: ( '\\u00D7' )
                    // InternalXMachine.g:927:3: '\\u00D7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_11()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_11()); 
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
    // InternalXMachine.g:936:1: rule__XTypePrimitive__Alternatives : ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) );
    public final void rule__XTypePrimitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:940:1: ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            case 33:
                {
                alt7=4;
                }
                break;
            case 34:
                {
                alt7=5;
                }
                break;
            case 59:
                {
                alt7=6;
                }
                break;
            case 58:
                {
                alt7=7;
                }
                break;
            case 57:
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
                    // InternalXMachine.g:941:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:941:2: ( RULE_ID )
                    // InternalXMachine.g:942:3: RULE_ID
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
                    // InternalXMachine.g:947:2: ( 'BOOL' )
                    {
                    // InternalXMachine.g:947:2: ( 'BOOL' )
                    // InternalXMachine.g:948:3: 'BOOL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:953:2: ( '\\u21151' )
                    {
                    // InternalXMachine.g:953:2: ( '\\u21151' )
                    // InternalXMachine.g:954:3: '\\u21151'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:959:2: ( '\\u2115' )
                    {
                    // InternalXMachine.g:959:2: ( '\\u2115' )
                    // InternalXMachine.g:960:3: '\\u2115'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:965:2: ( '\\u2124' )
                    {
                    // InternalXMachine.g:965:2: ( '\\u2124' )
                    // InternalXMachine.g:966:3: '\\u2124'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:971:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    {
                    // InternalXMachine.g:971:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    // InternalXMachine.g:972:3: ( rule__XTypePrimitive__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getGroup_5()); 
                    }
                    // InternalXMachine.g:973:3: ( rule__XTypePrimitive__Group_5__0 )
                    // InternalXMachine.g:973:4: rule__XTypePrimitive__Group_5__0
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
                    // InternalXMachine.g:977:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    {
                    // InternalXMachine.g:977:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    // InternalXMachine.g:978:3: ( rule__XTypePrimitive__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getGroup_6()); 
                    }
                    // InternalXMachine.g:979:3: ( rule__XTypePrimitive__Group_6__0 )
                    // InternalXMachine.g:979:4: rule__XTypePrimitive__Group_6__0
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
                    // InternalXMachine.g:983:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    {
                    // InternalXMachine.g:983:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    // InternalXMachine.g:984:3: ( rule__XTypePrimitive__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getGroup_7()); 
                    }
                    // InternalXMachine.g:985:3: ( rule__XTypePrimitive__Group_7__0 )
                    // InternalXMachine.g:985:4: rule__XTypePrimitive__Group_7__0
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
    // InternalXMachine.g:993:1: rule__XIndividualInvariant__Alternatives_2 : ( ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) ) | ( 'invariant' ) );
    public final void rule__XIndividualInvariant__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:997:1: ( ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) ) | ( 'invariant' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==154) ) {
                alt8=1;
            }
            else if ( (LA8_0==35) ) {
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
                    // InternalXMachine.g:998:2: ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) )
                    {
                    // InternalXMachine.g:998:2: ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) )
                    // InternalXMachine.g:999:3: ( rule__XIndividualInvariant__TheoremAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXIndividualInvariantAccess().getTheoremAssignment_2_0()); 
                    }
                    // InternalXMachine.g:1000:3: ( rule__XIndividualInvariant__TheoremAssignment_2_0 )
                    // InternalXMachine.g:1000:4: rule__XIndividualInvariant__TheoremAssignment_2_0
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
                    // InternalXMachine.g:1004:2: ( 'invariant' )
                    {
                    // InternalXMachine.g:1004:2: ( 'invariant' )
                    // InternalXMachine.g:1005:3: 'invariant'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXIndividualInvariantAccess().getInvariantKeyword_2_1()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1014:1: rule__XEvent__Alternatives_5 : ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) );
    public final void rule__XEvent__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1018:1: ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==139) ) {
                alt9=1;
            }
            else if ( (LA9_0==155) ) {
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
                    // InternalXMachine.g:1019:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    {
                    // InternalXMachine.g:1019:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    // InternalXMachine.g:1020:3: ( rule__XEvent__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_5_0()); 
                    }
                    // InternalXMachine.g:1021:3: ( rule__XEvent__Group_5_0__0 )
                    // InternalXMachine.g:1021:4: rule__XEvent__Group_5_0__0
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
                    // InternalXMachine.g:1025:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    {
                    // InternalXMachine.g:1025:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    // InternalXMachine.g:1026:3: ( rule__XEvent__Group_5_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_5_1()); 
                    }
                    // InternalXMachine.g:1027:3: ( rule__XEvent__Group_5_1__0 )
                    // InternalXMachine.g:1027:4: rule__XEvent__Group_5_1__0
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
    // InternalXMachine.g:1035:1: rule__XEvent__Alternatives_8_0 : ( ( 'where' ) | ( 'when' ) );
    public final void rule__XEvent__Alternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1039:1: ( ( 'where' ) | ( 'when' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            else if ( (LA10_0==37) ) {
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
                    // InternalXMachine.g:1040:2: ( 'where' )
                    {
                    // InternalXMachine.g:1040:2: ( 'where' )
                    // InternalXMachine.g:1041:3: 'where'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getWhereKeyword_8_0_0()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getWhereKeyword_8_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1046:2: ( 'when' )
                    {
                    // InternalXMachine.g:1046:2: ( 'when' )
                    // InternalXMachine.g:1047:3: 'when'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getWhenKeyword_8_0_1()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1056:1: rule__XEvent__Alternatives_9_0 : ( ( 'then' ) | ( 'begin' ) );
    public final void rule__XEvent__Alternatives_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1060:1: ( ( 'then' ) | ( 'begin' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            else if ( (LA11_0==39) ) {
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
                    // InternalXMachine.g:1061:2: ( 'then' )
                    {
                    // InternalXMachine.g:1061:2: ( 'then' )
                    // InternalXMachine.g:1062:3: 'then'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getThenKeyword_9_0_0()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getThenKeyword_9_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1067:2: ( 'begin' )
                    {
                    // InternalXMachine.g:1067:2: ( 'begin' )
                    // InternalXMachine.g:1068:3: 'begin'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getBeginKeyword_9_0_1()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1077:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_INT ) | ( RULE_ID ) | ( RULE_UNTRANSLATED_TOKEN ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1081:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_INT ) | ( RULE_ID ) | ( RULE_UNTRANSLATED_TOKEN ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
            case 33:
            case 34:
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
                {
                alt12=1;
                }
                break;
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
            case 86:
            case 87:
            case 88:
            case 89:
                {
                alt12=2;
                }
                break;
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
            case 151:
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
            case RULE_UNTRANSLATED_TOKEN:
                {
                alt12=6;
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
                    // InternalXMachine.g:1082:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXMachine.g:1082:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXMachine.g:1083:3: ruleEVENTB_IDENTIFIER_KEYWORD
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
                    // InternalXMachine.g:1088:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXMachine.g:1088:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXMachine.g:1089:3: ruleEVENTB_PREDICATE_SYMBOLS
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
                    // InternalXMachine.g:1094:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXMachine.g:1094:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXMachine.g:1095:3: ruleEVENTB_EXPRESSION_SYMBOLS
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
                    // InternalXMachine.g:1100:2: ( RULE_INT )
                    {
                    // InternalXMachine.g:1100:2: ( RULE_INT )
                    // InternalXMachine.g:1101:3: RULE_INT
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
                    // InternalXMachine.g:1106:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:1106:2: ( RULE_ID )
                    // InternalXMachine.g:1107:3: RULE_ID
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
                case 6 :
                    // InternalXMachine.g:1112:2: ( RULE_UNTRANSLATED_TOKEN )
                    {
                    // InternalXMachine.g:1112:2: ( RULE_UNTRANSLATED_TOKEN )
                    // InternalXMachine.g:1113:3: RULE_UNTRANSLATED_TOKEN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getUNTRANSLATED_TOKENTerminalRuleCall_5()); 
                    }
                    match(input,RULE_UNTRANSLATED_TOKEN,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getUNTRANSLATED_TOKENTerminalRuleCall_5()); 
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
    // InternalXMachine.g:1122:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1126:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
            int alt13=23;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt13=1;
                }
                break;
            case 40:
                {
                alt13=2;
                }
                break;
            case 41:
                {
                alt13=3;
                }
                break;
            case 42:
                {
                alt13=4;
                }
                break;
            case 43:
                {
                alt13=5;
                }
                break;
            case 44:
                {
                alt13=6;
                }
                break;
            case 45:
                {
                alt13=7;
                }
                break;
            case 46:
                {
                alt13=8;
                }
                break;
            case 47:
                {
                alt13=9;
                }
                break;
            case 48:
                {
                alt13=10;
                }
                break;
            case 49:
                {
                alt13=11;
                }
                break;
            case 50:
                {
                alt13=12;
                }
                break;
            case 51:
                {
                alt13=13;
                }
                break;
            case 52:
                {
                alt13=14;
                }
                break;
            case 53:
                {
                alt13=15;
                }
                break;
            case 54:
                {
                alt13=16;
                }
                break;
            case 55:
                {
                alt13=17;
                }
                break;
            case 56:
                {
                alt13=18;
                }
                break;
            case 32:
                {
                alt13=19;
                }
                break;
            case 33:
                {
                alt13=20;
                }
                break;
            case 57:
                {
                alt13=21;
                }
                break;
            case 58:
                {
                alt13=22;
                }
                break;
            case 34:
                {
                alt13=23;
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
                    // InternalXMachine.g:1127:2: ( 'BOOL' )
                    {
                    // InternalXMachine.g:1127:2: ( 'BOOL' )
                    // InternalXMachine.g:1128:3: 'BOOL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1133:2: ( 'FALSE' )
                    {
                    // InternalXMachine.g:1133:2: ( 'FALSE' )
                    // InternalXMachine.g:1134:3: 'FALSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1139:2: ( 'TRUE' )
                    {
                    // InternalXMachine.g:1139:2: ( 'TRUE' )
                    // InternalXMachine.g:1140:3: 'TRUE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1145:2: ( 'bool' )
                    {
                    // InternalXMachine.g:1145:2: ( 'bool' )
                    // InternalXMachine.g:1146:3: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1151:2: ( 'card' )
                    {
                    // InternalXMachine.g:1151:2: ( 'card' )
                    // InternalXMachine.g:1152:3: 'card'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1157:2: ( 'dom' )
                    {
                    // InternalXMachine.g:1157:2: ( 'dom' )
                    // InternalXMachine.g:1158:3: 'dom'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    }
                    match(input,44,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1163:2: ( 'finite' )
                    {
                    // InternalXMachine.g:1163:2: ( 'finite' )
                    // InternalXMachine.g:1164:3: 'finite'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    }
                    match(input,45,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1169:2: ( 'id' )
                    {
                    // InternalXMachine.g:1169:2: ( 'id' )
                    // InternalXMachine.g:1170:3: 'id'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    }
                    match(input,46,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1175:2: ( 'inter' )
                    {
                    // InternalXMachine.g:1175:2: ( 'inter' )
                    // InternalXMachine.g:1176:3: 'inter'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    }
                    match(input,47,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1181:2: ( 'max' )
                    {
                    // InternalXMachine.g:1181:2: ( 'max' )
                    // InternalXMachine.g:1182:3: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    }
                    match(input,48,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1187:2: ( 'min' )
                    {
                    // InternalXMachine.g:1187:2: ( 'min' )
                    // InternalXMachine.g:1188:3: 'min'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    }
                    match(input,49,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1193:2: ( 'mod' )
                    {
                    // InternalXMachine.g:1193:2: ( 'mod' )
                    // InternalXMachine.g:1194:3: 'mod'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    }
                    match(input,50,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1199:2: ( 'pred' )
                    {
                    // InternalXMachine.g:1199:2: ( 'pred' )
                    // InternalXMachine.g:1200:3: 'pred'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    }
                    match(input,51,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1205:2: ( 'prj1' )
                    {
                    // InternalXMachine.g:1205:2: ( 'prj1' )
                    // InternalXMachine.g:1206:3: 'prj1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    }
                    match(input,52,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1211:2: ( 'prj2' )
                    {
                    // InternalXMachine.g:1211:2: ( 'prj2' )
                    // InternalXMachine.g:1212:3: 'prj2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    }
                    match(input,53,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1217:2: ( 'ran' )
                    {
                    // InternalXMachine.g:1217:2: ( 'ran' )
                    // InternalXMachine.g:1218:3: 'ran'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    }
                    match(input,54,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1223:2: ( 'succ' )
                    {
                    // InternalXMachine.g:1223:2: ( 'succ' )
                    // InternalXMachine.g:1224:3: 'succ'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    }
                    match(input,55,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1229:2: ( 'union' )
                    {
                    // InternalXMachine.g:1229:2: ( 'union' )
                    // InternalXMachine.g:1230:3: 'union'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    }
                    match(input,56,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1235:2: ( '\\u21151' )
                    {
                    // InternalXMachine.g:1235:2: ( '\\u21151' )
                    // InternalXMachine.g:1236:3: '\\u21151'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1241:2: ( '\\u2115' )
                    {
                    // InternalXMachine.g:1241:2: ( '\\u2115' )
                    // InternalXMachine.g:1242:3: '\\u2115'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1247:2: ( '\\u21191' )
                    {
                    // InternalXMachine.g:1247:2: ( '\\u21191' )
                    // InternalXMachine.g:1248:3: '\\u21191'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    }
                    match(input,57,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1253:2: ( '\\u2119' )
                    {
                    // InternalXMachine.g:1253:2: ( '\\u2119' )
                    // InternalXMachine.g:1254:3: '\\u2119'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    }
                    match(input,58,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1259:2: ( '\\u2124' )
                    {
                    // InternalXMachine.g:1259:2: ( '\\u2124' )
                    // InternalXMachine.g:1260:3: '\\u2124'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
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
    // InternalXMachine.g:1269:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1273:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
            int alt14=31;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt14=1;
                }
                break;
            case 60:
                {
                alt14=2;
                }
                break;
            case 61:
                {
                alt14=3;
                }
                break;
            case 62:
                {
                alt14=4;
                }
                break;
            case 63:
                {
                alt14=5;
                }
                break;
            case 64:
                {
                alt14=6;
                }
                break;
            case 65:
                {
                alt14=7;
                }
                break;
            case 66:
                {
                alt14=8;
                }
                break;
            case 67:
                {
                alt14=9;
                }
                break;
            case 68:
                {
                alt14=10;
                }
                break;
            case 69:
                {
                alt14=11;
                }
                break;
            case 70:
                {
                alt14=12;
                }
                break;
            case 71:
                {
                alt14=13;
                }
                break;
            case 72:
                {
                alt14=14;
                }
                break;
            case 73:
                {
                alt14=15;
                }
                break;
            case 74:
                {
                alt14=16;
                }
                break;
            case 75:
                {
                alt14=17;
                }
                break;
            case 76:
                {
                alt14=18;
                }
                break;
            case 77:
                {
                alt14=19;
                }
                break;
            case 78:
                {
                alt14=20;
                }
                break;
            case 79:
                {
                alt14=21;
                }
                break;
            case 80:
                {
                alt14=22;
                }
                break;
            case 81:
                {
                alt14=23;
                }
                break;
            case 82:
                {
                alt14=24;
                }
                break;
            case 83:
                {
                alt14=25;
                }
                break;
            case 84:
                {
                alt14=26;
                }
                break;
            case 85:
                {
                alt14=27;
                }
                break;
            case 86:
                {
                alt14=28;
                }
                break;
            case 87:
                {
                alt14=29;
                }
                break;
            case 88:
                {
                alt14=30;
                }
                break;
            case 89:
                {
                alt14=31;
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
                    // InternalXMachine.g:1274:2: ( '(' )
                    {
                    // InternalXMachine.g:1274:2: ( '(' )
                    // InternalXMachine.g:1275:3: '('
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    }
                    match(input,59,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1280:2: ( ')' )
                    {
                    // InternalXMachine.g:1280:2: ( ')' )
                    // InternalXMachine.g:1281:3: ')'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    }
                    match(input,60,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1286:2: ( '\\u21D4' )
                    {
                    // InternalXMachine.g:1286:2: ( '\\u21D4' )
                    // InternalXMachine.g:1287:3: '\\u21D4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    }
                    match(input,61,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1292:2: ( '\\u21D2' )
                    {
                    // InternalXMachine.g:1292:2: ( '\\u21D2' )
                    // InternalXMachine.g:1293:3: '\\u21D2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    }
                    match(input,62,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1298:2: ( '\\u2227' )
                    {
                    // InternalXMachine.g:1298:2: ( '\\u2227' )
                    // InternalXMachine.g:1299:3: '\\u2227'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    }
                    match(input,63,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1304:2: ( '&' )
                    {
                    // InternalXMachine.g:1304:2: ( '&' )
                    // InternalXMachine.g:1305:3: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    }
                    match(input,64,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1310:2: ( '\\u2228' )
                    {
                    // InternalXMachine.g:1310:2: ( '\\u2228' )
                    // InternalXMachine.g:1311:3: '\\u2228'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    }
                    match(input,65,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1316:2: ( '\\u00AC' )
                    {
                    // InternalXMachine.g:1316:2: ( '\\u00AC' )
                    // InternalXMachine.g:1317:3: '\\u00AC'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    }
                    match(input,66,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1322:2: ( '\\u22A4' )
                    {
                    // InternalXMachine.g:1322:2: ( '\\u22A4' )
                    // InternalXMachine.g:1323:3: '\\u22A4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    }
                    match(input,67,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1328:2: ( '\\u22A5' )
                    {
                    // InternalXMachine.g:1328:2: ( '\\u22A5' )
                    // InternalXMachine.g:1329:3: '\\u22A5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    }
                    match(input,68,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1334:2: ( '\\u2200' )
                    {
                    // InternalXMachine.g:1334:2: ( '\\u2200' )
                    // InternalXMachine.g:1335:3: '\\u2200'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    }
                    match(input,69,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1340:2: ( '!' )
                    {
                    // InternalXMachine.g:1340:2: ( '!' )
                    // InternalXMachine.g:1341:3: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    }
                    match(input,70,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1346:2: ( '\\u2203' )
                    {
                    // InternalXMachine.g:1346:2: ( '\\u2203' )
                    // InternalXMachine.g:1347:3: '\\u2203'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    }
                    match(input,71,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1352:2: ( '#' )
                    {
                    // InternalXMachine.g:1352:2: ( '#' )
                    // InternalXMachine.g:1353:3: '#'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    }
                    match(input,72,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1358:2: ( ',' )
                    {
                    // InternalXMachine.g:1358:2: ( ',' )
                    // InternalXMachine.g:1359:3: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    }
                    match(input,73,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1364:2: ( '\\u00B7' )
                    {
                    // InternalXMachine.g:1364:2: ( '\\u00B7' )
                    // InternalXMachine.g:1365:3: '\\u00B7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    }
                    match(input,74,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1370:2: ( '.' )
                    {
                    // InternalXMachine.g:1370:2: ( '.' )
                    // InternalXMachine.g:1371:3: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    }
                    match(input,75,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1376:2: ( '=' )
                    {
                    // InternalXMachine.g:1376:2: ( '=' )
                    // InternalXMachine.g:1377:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    }
                    match(input,76,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1382:2: ( '\\u2260' )
                    {
                    // InternalXMachine.g:1382:2: ( '\\u2260' )
                    // InternalXMachine.g:1383:3: '\\u2260'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    }
                    match(input,77,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1388:2: ( '\\u2264' )
                    {
                    // InternalXMachine.g:1388:2: ( '\\u2264' )
                    // InternalXMachine.g:1389:3: '\\u2264'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    }
                    match(input,78,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1394:2: ( '<' )
                    {
                    // InternalXMachine.g:1394:2: ( '<' )
                    // InternalXMachine.g:1395:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    }
                    match(input,79,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1400:2: ( '\\u2265' )
                    {
                    // InternalXMachine.g:1400:2: ( '\\u2265' )
                    // InternalXMachine.g:1401:3: '\\u2265'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    }
                    match(input,80,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1406:2: ( '>' )
                    {
                    // InternalXMachine.g:1406:2: ( '>' )
                    // InternalXMachine.g:1407:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    }
                    match(input,81,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1412:2: ( '\\u2208' )
                    {
                    // InternalXMachine.g:1412:2: ( '\\u2208' )
                    // InternalXMachine.g:1413:3: '\\u2208'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    }
                    match(input,82,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1418:2: ( ':' )
                    {
                    // InternalXMachine.g:1418:2: ( ':' )
                    // InternalXMachine.g:1419:3: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    }
                    match(input,83,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1424:2: ( '\\u2209' )
                    {
                    // InternalXMachine.g:1424:2: ( '\\u2209' )
                    // InternalXMachine.g:1425:3: '\\u2209'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    }
                    match(input,84,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1430:2: ( '\\u2282' )
                    {
                    // InternalXMachine.g:1430:2: ( '\\u2282' )
                    // InternalXMachine.g:1431:3: '\\u2282'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    }
                    match(input,85,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1436:2: ( '\\u2284' )
                    {
                    // InternalXMachine.g:1436:2: ( '\\u2284' )
                    // InternalXMachine.g:1437:3: '\\u2284'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    }
                    match(input,86,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1442:2: ( '\\u2286' )
                    {
                    // InternalXMachine.g:1442:2: ( '\\u2286' )
                    // InternalXMachine.g:1443:3: '\\u2286'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    }
                    match(input,87,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1448:2: ( '\\u2288' )
                    {
                    // InternalXMachine.g:1448:2: ( '\\u2288' )
                    // InternalXMachine.g:1449:3: '\\u2288'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    }
                    match(input,88,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1454:2: ( 'partition' )
                    {
                    // InternalXMachine.g:1454:2: ( 'partition' )
                    // InternalXMachine.g:1455:3: 'partition'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
                    }
                    match(input,89,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
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
    // InternalXMachine.g:1464:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1468:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
            int alt15=45;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt15=1;
                }
                break;
            case 20:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            case 22:
                {
                alt15=4;
                }
                break;
            case 23:
                {
                alt15=5;
                }
                break;
            case 24:
                {
                alt15=6;
                }
                break;
            case 25:
                {
                alt15=7;
                }
                break;
            case 26:
                {
                alt15=8;
                }
                break;
            case 27:
                {
                alt15=9;
                }
                break;
            case 28:
                {
                alt15=10;
                }
                break;
            case 29:
                {
                alt15=11;
                }
                break;
            case 90:
                {
                alt15=12;
                }
                break;
            case 91:
                {
                alt15=13;
                }
                break;
            case 92:
                {
                alt15=14;
                }
                break;
            case 93:
                {
                alt15=15;
                }
                break;
            case 94:
                {
                alt15=16;
                }
                break;
            case 95:
                {
                alt15=17;
                }
                break;
            case 96:
                {
                alt15=18;
                }
                break;
            case 30:
                {
                alt15=19;
                }
                break;
            case 97:
                {
                alt15=20;
                }
                break;
            case 98:
                {
                alt15=21;
                }
                break;
            case 99:
                {
                alt15=22;
                }
                break;
            case 100:
                {
                alt15=23;
                }
                break;
            case 101:
                {
                alt15=24;
                }
                break;
            case 102:
                {
                alt15=25;
                }
                break;
            case 103:
                {
                alt15=26;
                }
                break;
            case 104:
                {
                alt15=27;
                }
                break;
            case 105:
                {
                alt15=28;
                }
                break;
            case 106:
                {
                alt15=29;
                }
                break;
            case 107:
                {
                alt15=30;
                }
                break;
            case 108:
                {
                alt15=31;
                }
                break;
            case 109:
                {
                alt15=32;
                }
                break;
            case 151:
                {
                alt15=33;
                }
                break;
            case 110:
                {
                alt15=34;
                }
                break;
            case 111:
                {
                alt15=35;
                }
                break;
            case 112:
                {
                alt15=36;
                }
                break;
            case 113:
                {
                alt15=37;
                }
                break;
            case 114:
                {
                alt15=38;
                }
                break;
            case 115:
                {
                alt15=39;
                }
                break;
            case 116:
                {
                alt15=40;
                }
                break;
            case 117:
                {
                alt15=41;
                }
                break;
            case 118:
                {
                alt15=42;
                }
                break;
            case 119:
                {
                alt15=43;
                }
                break;
            case 120:
                {
                alt15=44;
                }
                break;
            case 121:
                {
                alt15=45;
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
                    // InternalXMachine.g:1469:2: ( '\\u2194' )
                    {
                    // InternalXMachine.g:1469:2: ( '\\u2194' )
                    // InternalXMachine.g:1470:3: '\\u2194'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1475:2: ( '\\uE100' )
                    {
                    // InternalXMachine.g:1475:2: ( '\\uE100' )
                    // InternalXMachine.g:1476:3: '\\uE100'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1481:2: ( '\\uE101' )
                    {
                    // InternalXMachine.g:1481:2: ( '\\uE101' )
                    // InternalXMachine.g:1482:3: '\\uE101'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1487:2: ( '\\uE102' )
                    {
                    // InternalXMachine.g:1487:2: ( '\\uE102' )
                    // InternalXMachine.g:1488:3: '\\uE102'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1493:2: ( '\\u21F8' )
                    {
                    // InternalXMachine.g:1493:2: ( '\\u21F8' )
                    // InternalXMachine.g:1494:3: '\\u21F8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1499:2: ( '\\u2192' )
                    {
                    // InternalXMachine.g:1499:2: ( '\\u2192' )
                    // InternalXMachine.g:1500:3: '\\u2192'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1505:2: ( '\\u2914' )
                    {
                    // InternalXMachine.g:1505:2: ( '\\u2914' )
                    // InternalXMachine.g:1506:3: '\\u2914'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1511:2: ( '\\u21A3' )
                    {
                    // InternalXMachine.g:1511:2: ( '\\u21A3' )
                    // InternalXMachine.g:1512:3: '\\u21A3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1517:2: ( '\\u2900' )
                    {
                    // InternalXMachine.g:1517:2: ( '\\u2900' )
                    // InternalXMachine.g:1518:3: '\\u2900'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1523:2: ( '\\u21A0' )
                    {
                    // InternalXMachine.g:1523:2: ( '\\u21A0' )
                    // InternalXMachine.g:1524:3: '\\u21A0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1529:2: ( '\\u2916' )
                    {
                    // InternalXMachine.g:1529:2: ( '\\u2916' )
                    // InternalXMachine.g:1530:3: '\\u2916'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1535:2: ( '{' )
                    {
                    // InternalXMachine.g:1535:2: ( '{' )
                    // InternalXMachine.g:1536:3: '{'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    }
                    match(input,90,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1541:2: ( '}' )
                    {
                    // InternalXMachine.g:1541:2: ( '}' )
                    // InternalXMachine.g:1542:3: '}'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    }
                    match(input,91,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1547:2: ( '\\u21A6' )
                    {
                    // InternalXMachine.g:1547:2: ( '\\u21A6' )
                    // InternalXMachine.g:1548:3: '\\u21A6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    }
                    match(input,92,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1553:2: ( '\\u2205' )
                    {
                    // InternalXMachine.g:1553:2: ( '\\u2205' )
                    // InternalXMachine.g:1554:3: '\\u2205'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    }
                    match(input,93,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1559:2: ( '\\u2229' )
                    {
                    // InternalXMachine.g:1559:2: ( '\\u2229' )
                    // InternalXMachine.g:1560:3: '\\u2229'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    }
                    match(input,94,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1565:2: ( '\\u222A' )
                    {
                    // InternalXMachine.g:1565:2: ( '\\u222A' )
                    // InternalXMachine.g:1566:3: '\\u222A'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    }
                    match(input,95,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1571:2: ( '\\u2216' )
                    {
                    // InternalXMachine.g:1571:2: ( '\\u2216' )
                    // InternalXMachine.g:1572:3: '\\u2216'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    }
                    match(input,96,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1577:2: ( '\\u00D7' )
                    {
                    // InternalXMachine.g:1577:2: ( '\\u00D7' )
                    // InternalXMachine.g:1578:3: '\\u00D7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1583:2: ( '[' )
                    {
                    // InternalXMachine.g:1583:2: ( '[' )
                    // InternalXMachine.g:1584:3: '['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    }
                    match(input,97,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1589:2: ( ']' )
                    {
                    // InternalXMachine.g:1589:2: ( ']' )
                    // InternalXMachine.g:1590:3: ']'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    }
                    match(input,98,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1595:2: ( '\\uE103' )
                    {
                    // InternalXMachine.g:1595:2: ( '\\uE103' )
                    // InternalXMachine.g:1596:3: '\\uE103'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    }
                    match(input,99,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1601:2: ( '\\u2218' )
                    {
                    // InternalXMachine.g:1601:2: ( '\\u2218' )
                    // InternalXMachine.g:1602:3: '\\u2218'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    }
                    match(input,100,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1607:2: ( ';' )
                    {
                    // InternalXMachine.g:1607:2: ( ';' )
                    // InternalXMachine.g:1608:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    }
                    match(input,101,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1613:2: ( '\\u2297' )
                    {
                    // InternalXMachine.g:1613:2: ( '\\u2297' )
                    // InternalXMachine.g:1614:3: '\\u2297'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    }
                    match(input,102,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1619:2: ( '\\u2225' )
                    {
                    // InternalXMachine.g:1619:2: ( '\\u2225' )
                    // InternalXMachine.g:1620:3: '\\u2225'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    }
                    match(input,103,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1625:2: ( '\\u223C' )
                    {
                    // InternalXMachine.g:1625:2: ( '\\u223C' )
                    // InternalXMachine.g:1626:3: '\\u223C'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    }
                    match(input,104,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1631:2: ( '\\u25C1' )
                    {
                    // InternalXMachine.g:1631:2: ( '\\u25C1' )
                    // InternalXMachine.g:1632:3: '\\u25C1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    }
                    match(input,105,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1637:2: ( '\\u2A64' )
                    {
                    // InternalXMachine.g:1637:2: ( '\\u2A64' )
                    // InternalXMachine.g:1638:3: '\\u2A64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    }
                    match(input,106,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1643:2: ( '\\u25B7' )
                    {
                    // InternalXMachine.g:1643:2: ( '\\u25B7' )
                    // InternalXMachine.g:1644:3: '\\u25B7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    }
                    match(input,107,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1649:2: ( '\\u2A65' )
                    {
                    // InternalXMachine.g:1649:2: ( '\\u2A65' )
                    // InternalXMachine.g:1650:3: '\\u2A65'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    }
                    match(input,108,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalXMachine.g:1655:2: ( '\\u03BB' )
                    {
                    // InternalXMachine.g:1655:2: ( '\\u03BB' )
                    // InternalXMachine.g:1656:3: '\\u03BB'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    }
                    match(input,109,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalXMachine.g:1661:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalXMachine.g:1661:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalXMachine.g:1662:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    }
                    // InternalXMachine.g:1663:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalXMachine.g:1663:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // InternalXMachine.g:1667:2: ( '\\u22C3' )
                    {
                    // InternalXMachine.g:1667:2: ( '\\u22C3' )
                    // InternalXMachine.g:1668:3: '\\u22C3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    }
                    match(input,110,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalXMachine.g:1673:2: ( '\\u2223' )
                    {
                    // InternalXMachine.g:1673:2: ( '\\u2223' )
                    // InternalXMachine.g:1674:3: '\\u2223'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    }
                    match(input,111,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalXMachine.g:1679:2: ( '\\u2025' )
                    {
                    // InternalXMachine.g:1679:2: ( '\\u2025' )
                    // InternalXMachine.g:1680:3: '\\u2025'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    }
                    match(input,112,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalXMachine.g:1685:2: ( '+' )
                    {
                    // InternalXMachine.g:1685:2: ( '+' )
                    // InternalXMachine.g:1686:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    }
                    match(input,113,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalXMachine.g:1691:2: ( '\\u2212' )
                    {
                    // InternalXMachine.g:1691:2: ( '\\u2212' )
                    // InternalXMachine.g:1692:3: '\\u2212'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    }
                    match(input,114,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalXMachine.g:1697:2: ( '-' )
                    {
                    // InternalXMachine.g:1697:2: ( '-' )
                    // InternalXMachine.g:1698:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    }
                    match(input,115,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalXMachine.g:1703:2: ( '\\u2217' )
                    {
                    // InternalXMachine.g:1703:2: ( '\\u2217' )
                    // InternalXMachine.g:1704:3: '\\u2217'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    }
                    match(input,116,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalXMachine.g:1709:2: ( '*' )
                    {
                    // InternalXMachine.g:1709:2: ( '*' )
                    // InternalXMachine.g:1710:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    }
                    match(input,117,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalXMachine.g:1715:2: ( '\\u00F7' )
                    {
                    // InternalXMachine.g:1715:2: ( '\\u00F7' )
                    // InternalXMachine.g:1716:3: '\\u00F7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    }
                    match(input,118,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalXMachine.g:1721:2: ( '/' )
                    {
                    // InternalXMachine.g:1721:2: ( '/' )
                    // InternalXMachine.g:1722:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    }
                    match(input,119,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalXMachine.g:1727:2: ( '^' )
                    {
                    // InternalXMachine.g:1727:2: ( '^' )
                    // InternalXMachine.g:1728:3: '^'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    }
                    match(input,120,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalXMachine.g:1733:2: ( '\\\\' )
                    {
                    // InternalXMachine.g:1733:2: ( '\\\\' )
                    // InternalXMachine.g:1734:3: '\\\\'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
                    }
                    match(input,121,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
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
    // InternalXMachine.g:1743:1: rule__XRecord__Alternatives_2 : ( ( ( rule__XRecord__ExtendedAssignment_2_0 ) ) | ( ( rule__XRecord__RefinedAssignment_2_1 ) ) );
    public final void rule__XRecord__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1747:1: ( ( ( rule__XRecord__ExtendedAssignment_2_0 ) ) | ( ( rule__XRecord__RefinedAssignment_2_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=122 && LA16_0<=123)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=124 && LA16_0<=125)) ) {
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
                    // InternalXMachine.g:1748:2: ( ( rule__XRecord__ExtendedAssignment_2_0 ) )
                    {
                    // InternalXMachine.g:1748:2: ( ( rule__XRecord__ExtendedAssignment_2_0 ) )
                    // InternalXMachine.g:1749:3: ( rule__XRecord__ExtendedAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getExtendedAssignment_2_0()); 
                    }
                    // InternalXMachine.g:1750:3: ( rule__XRecord__ExtendedAssignment_2_0 )
                    // InternalXMachine.g:1750:4: rule__XRecord__ExtendedAssignment_2_0
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
                    // InternalXMachine.g:1754:2: ( ( rule__XRecord__RefinedAssignment_2_1 ) )
                    {
                    // InternalXMachine.g:1754:2: ( ( rule__XRecord__RefinedAssignment_2_1 ) )
                    // InternalXMachine.g:1755:3: ( rule__XRecord__RefinedAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRefinedAssignment_2_1()); 
                    }
                    // InternalXMachine.g:1756:3: ( rule__XRecord__RefinedAssignment_2_1 )
                    // InternalXMachine.g:1756:4: rule__XRecord__RefinedAssignment_2_1
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
    // InternalXMachine.g:1764:1: rule__XRecord__ExtendedAlternatives_2_0_0 : ( ( 'extended' ) | ( 'ext' ) );
    public final void rule__XRecord__ExtendedAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1768:1: ( ( 'extended' ) | ( 'ext' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==122) ) {
                alt17=1;
            }
            else if ( (LA17_0==123) ) {
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
                    // InternalXMachine.g:1769:2: ( 'extended' )
                    {
                    // InternalXMachine.g:1769:2: ( 'extended' )
                    // InternalXMachine.g:1770:3: 'extended'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_2_0_0_0()); 
                    }
                    match(input,122,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1775:2: ( 'ext' )
                    {
                    // InternalXMachine.g:1775:2: ( 'ext' )
                    // InternalXMachine.g:1776:3: 'ext'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getExtendedExtKeyword_2_0_0_1()); 
                    }
                    match(input,123,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1785:1: rule__XRecord__RefinedAlternatives_2_1_0 : ( ( 'refined' ) | ( 'ref' ) );
    public final void rule__XRecord__RefinedAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1789:1: ( ( 'refined' ) | ( 'ref' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==124) ) {
                alt18=1;
            }
            else if ( (LA18_0==125) ) {
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
                    // InternalXMachine.g:1790:2: ( 'refined' )
                    {
                    // InternalXMachine.g:1790:2: ( 'refined' )
                    // InternalXMachine.g:1791:3: 'refined'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRefinedRefinedKeyword_2_1_0_0()); 
                    }
                    match(input,124,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getRefinedRefinedKeyword_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1796:2: ( 'ref' )
                    {
                    // InternalXMachine.g:1796:2: ( 'ref' )
                    // InternalXMachine.g:1797:3: 'ref'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRefinedRefKeyword_2_1_0_1()); 
                    }
                    match(input,125,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1806:1: rule__XRecord__Alternatives_3 : ( ( 'record' ) | ( 'rec' ) );
    public final void rule__XRecord__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1810:1: ( ( 'record' ) | ( 'rec' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==126) ) {
                alt19=1;
            }
            else if ( (LA19_0==127) ) {
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
                    // InternalXMachine.g:1811:2: ( 'record' )
                    {
                    // InternalXMachine.g:1811:2: ( 'record' )
                    // InternalXMachine.g:1812:3: 'record'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRecordKeyword_3_0()); 
                    }
                    match(input,126,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getRecordKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1817:2: ( 'rec' )
                    {
                    // InternalXMachine.g:1817:2: ( 'rec' )
                    // InternalXMachine.g:1818:3: 'rec'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRecKeyword_3_1()); 
                    }
                    match(input,127,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1827:1: rule__XRecord__Alternatives_5_0 : ( ( 'inherits' ) | ( 'ihr' ) );
    public final void rule__XRecord__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1831:1: ( ( 'inherits' ) | ( 'ihr' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==128) ) {
                alt20=1;
            }
            else if ( (LA20_0==129) ) {
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
                    // InternalXMachine.g:1832:2: ( 'inherits' )
                    {
                    // InternalXMachine.g:1832:2: ( 'inherits' )
                    // InternalXMachine.g:1833:3: 'inherits'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getInheritsKeyword_5_0_0()); 
                    }
                    match(input,128,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getInheritsKeyword_5_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1838:2: ( 'ihr' )
                    {
                    // InternalXMachine.g:1838:2: ( 'ihr' )
                    // InternalXMachine.g:1839:3: 'ihr'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getIhrKeyword_5_0_1()); 
                    }
                    match(input,129,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1848:1: rule__XRecord__Alternatives_6 : ( ( ( rule__XRecord__Group_6_0__0 ) ) | ( ( rule__XRecord__Group_6_1__0 ) ) );
    public final void rule__XRecord__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1852:1: ( ( ( rule__XRecord__Group_6_0__0 ) ) | ( ( rule__XRecord__Group_6_1__0 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=130 && LA21_0<=131)) ) {
                alt21=1;
            }
            else if ( (LA21_0==153) ) {
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
                    // InternalXMachine.g:1853:2: ( ( rule__XRecord__Group_6_0__0 ) )
                    {
                    // InternalXMachine.g:1853:2: ( ( rule__XRecord__Group_6_0__0 ) )
                    // InternalXMachine.g:1854:3: ( rule__XRecord__Group_6_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getGroup_6_0()); 
                    }
                    // InternalXMachine.g:1855:3: ( rule__XRecord__Group_6_0__0 )
                    // InternalXMachine.g:1855:4: rule__XRecord__Group_6_0__0
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
                    // InternalXMachine.g:1859:2: ( ( rule__XRecord__Group_6_1__0 ) )
                    {
                    // InternalXMachine.g:1859:2: ( ( rule__XRecord__Group_6_1__0 ) )
                    // InternalXMachine.g:1860:3: ( rule__XRecord__Group_6_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getGroup_6_1()); 
                    }
                    // InternalXMachine.g:1861:3: ( rule__XRecord__Group_6_1__0 )
                    // InternalXMachine.g:1861:4: rule__XRecord__Group_6_1__0
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
    // InternalXMachine.g:1869:1: rule__XRecord__Alternatives_6_0_0 : ( ( 'field' ) | ( 'fld' ) );
    public final void rule__XRecord__Alternatives_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1873:1: ( ( 'field' ) | ( 'fld' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==130) ) {
                alt22=1;
            }
            else if ( (LA22_0==131) ) {
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
                    // InternalXMachine.g:1874:2: ( 'field' )
                    {
                    // InternalXMachine.g:1874:2: ( 'field' )
                    // InternalXMachine.g:1875:3: 'field'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getFieldKeyword_6_0_0_0()); 
                    }
                    match(input,130,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getFieldKeyword_6_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1880:2: ( 'fld' )
                    {
                    // InternalXMachine.g:1880:2: ( 'fld' )
                    // InternalXMachine.g:1881:3: 'fld'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getFldKeyword_6_0_0_1()); 
                    }
                    match(input,131,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__FieldType__Alternatives"
    // InternalXMachine.g:1890:1: rule__FieldType__Alternatives : ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1894:1: ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=31 && LA23_0<=34)||(LA23_0>=40 && LA23_0<=58)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:1895:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:1895:2: ( RULE_ID )
                    // InternalXMachine.g:1896:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1901:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXMachine.g:1901:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXMachine.g:1902:3: ruleEVENTB_IDENTIFIER_KEYWORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldTypeAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_IDENTIFIER_KEYWORD();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldTypeAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_1()); 
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
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__XConvergence__Alternatives"
    // InternalXMachine.g:1911:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1915:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt24=1;
                }
                break;
            case 133:
                {
                alt24=2;
                }
                break;
            case 134:
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
                    // InternalXMachine.g:1916:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:1916:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:1917:3: ( 'ordinary' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:1918:3: ( 'ordinary' )
                    // InternalXMachine.g:1918:4: 'ordinary'
                    {
                    match(input,132,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1922:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:1922:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:1923:3: ( 'convergent' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:1924:3: ( 'convergent' )
                    // InternalXMachine.g:1924:4: 'convergent'
                    {
                    match(input,133,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1928:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:1928:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:1929:3: ( 'anticipated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:1930:3: ( 'anticipated' )
                    // InternalXMachine.g:1930:4: 'anticipated'
                    {
                    match(input,134,FOLLOW_2); if (state.failed) return ;

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
    // InternalXMachine.g:1938:1: rule__Multiplicity__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1942:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 135:
                {
                alt25=1;
                }
                break;
            case 136:
                {
                alt25=2;
                }
                break;
            case 137:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:1943:2: ( ( 'one' ) )
                    {
                    // InternalXMachine.g:1943:2: ( ( 'one' ) )
                    // InternalXMachine.g:1944:3: ( 'one' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:1945:3: ( 'one' )
                    // InternalXMachine.g:1945:4: 'one'
                    {
                    match(input,135,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1949:2: ( ( 'many' ) )
                    {
                    // InternalXMachine.g:1949:2: ( ( 'many' ) )
                    // InternalXMachine.g:1950:3: ( 'many' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:1951:3: ( 'many' )
                    // InternalXMachine.g:1951:4: 'many'
                    {
                    match(input,136,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1955:2: ( ( 'opt' ) )
                    {
                    // InternalXMachine.g:1955:2: ( ( 'opt' ) )
                    // InternalXMachine.g:1956:3: ( 'opt' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:1957:3: ( 'opt' )
                    // InternalXMachine.g:1957:4: 'opt'
                    {
                    match(input,137,FOLLOW_2); if (state.failed) return ;

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
    // InternalXMachine.g:1965:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1969:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:1970:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
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
    // InternalXMachine.g:1977:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1981:1: ( ( () ) )
            // InternalXMachine.g:1982:1: ( () )
            {
            // InternalXMachine.g:1982:1: ( () )
            // InternalXMachine.g:1983:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            }
            // InternalXMachine.g:1984:2: ()
            // InternalXMachine.g:1984:3: 
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
    // InternalXMachine.g:1992:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1996:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:1997:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
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
    // InternalXMachine.g:2004:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__CommentAssignment_1 )? ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2008:1: ( ( ( rule__Machine__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2009:1: ( ( rule__Machine__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2009:1: ( ( rule__Machine__CommentAssignment_1 )? )
            // InternalXMachine.g:2010:2: ( rule__Machine__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:2011:2: ( rule__Machine__CommentAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXMachine.g:2011:3: rule__Machine__CommentAssignment_1
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
    // InternalXMachine.g:2019:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2023:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:2024:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
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
    // InternalXMachine.g:2031:1: rule__Machine__Group__2__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2035:1: ( ( 'machine' ) )
            // InternalXMachine.g:2036:1: ( 'machine' )
            {
            // InternalXMachine.g:2036:1: ( 'machine' )
            // InternalXMachine.g:2037:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineKeyword_2()); 
            }
            match(input,138,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2046:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2050:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:2051:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
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
    // InternalXMachine.g:2058:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__NameAssignment_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2062:1: ( ( ( rule__Machine__NameAssignment_3 ) ) )
            // InternalXMachine.g:2063:1: ( ( rule__Machine__NameAssignment_3 ) )
            {
            // InternalXMachine.g:2063:1: ( ( rule__Machine__NameAssignment_3 ) )
            // InternalXMachine.g:2064:2: ( rule__Machine__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:2065:2: ( rule__Machine__NameAssignment_3 )
            // InternalXMachine.g:2065:3: rule__Machine__NameAssignment_3
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
    // InternalXMachine.g:2073:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2077:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:2078:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
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
    // InternalXMachine.g:2085:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__UnorderedGroup_4 ) ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2089:1: ( ( ( rule__Machine__UnorderedGroup_4 ) ) )
            // InternalXMachine.g:2090:1: ( ( rule__Machine__UnorderedGroup_4 ) )
            {
            // InternalXMachine.g:2090:1: ( ( rule__Machine__UnorderedGroup_4 ) )
            // InternalXMachine.g:2091:2: ( rule__Machine__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getUnorderedGroup_4()); 
            }
            // InternalXMachine.g:2092:2: ( rule__Machine__UnorderedGroup_4 )
            // InternalXMachine.g:2092:3: rule__Machine__UnorderedGroup_4
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
    // InternalXMachine.g:2100:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2104:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:2105:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
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
    // InternalXMachine.g:2112:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2116:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:2117:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:2117:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:2118:2: ( rule__Machine__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_5()); 
            }
            // InternalXMachine.g:2119:2: ( rule__Machine__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==141) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:2119:3: rule__Machine__Group_5__0
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
    // InternalXMachine.g:2127:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2131:1: ( rule__Machine__Group__6__Impl )
            // InternalXMachine.g:2132:2: rule__Machine__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__6__Impl();

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
    // InternalXMachine.g:2138:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Alternatives_6 )* ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2142:1: ( ( ( rule__Machine__Alternatives_6 )* ) )
            // InternalXMachine.g:2143:1: ( ( rule__Machine__Alternatives_6 )* )
            {
            // InternalXMachine.g:2143:1: ( ( rule__Machine__Alternatives_6 )* )
            // InternalXMachine.g:2144:2: ( rule__Machine__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getAlternatives_6()); 
            }
            // InternalXMachine.g:2145:2: ( rule__Machine__Alternatives_6 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_STRING||(LA28_0>=13 && LA28_0<=18)||LA28_0==35||(LA28_0>=122 && LA28_0<=127)||(LA28_0>=132 && LA28_0<=134)||(LA28_0>=145 && LA28_0<=146)||LA28_0==154) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalXMachine.g:2145:3: rule__Machine__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__Alternatives_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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


    // $ANTLR start "rule__Machine__Group_4_1__0"
    // InternalXMachine.g:2154:1: rule__Machine__Group_4_1__0 : rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1 ;
    public final void rule__Machine__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2158:1: ( rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1 )
            // InternalXMachine.g:2159:2: rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1
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
    // InternalXMachine.g:2166:1: rule__Machine__Group_4_1__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2170:1: ( ( 'refines' ) )
            // InternalXMachine.g:2171:1: ( 'refines' )
            {
            // InternalXMachine.g:2171:1: ( 'refines' )
            // InternalXMachine.g:2172:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesKeyword_4_1_0()); 
            }
            match(input,139,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2181:1: rule__Machine__Group_4_1__1 : rule__Machine__Group_4_1__1__Impl ;
    public final void rule__Machine__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2185:1: ( rule__Machine__Group_4_1__1__Impl )
            // InternalXMachine.g:2186:2: rule__Machine__Group_4_1__1__Impl
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
    // InternalXMachine.g:2192:1: rule__Machine__Group_4_1__1__Impl : ( ( rule__Machine__RefinesAssignment_4_1_1 ) ) ;
    public final void rule__Machine__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2196:1: ( ( ( rule__Machine__RefinesAssignment_4_1_1 ) ) )
            // InternalXMachine.g:2197:1: ( ( rule__Machine__RefinesAssignment_4_1_1 ) )
            {
            // InternalXMachine.g:2197:1: ( ( rule__Machine__RefinesAssignment_4_1_1 ) )
            // InternalXMachine.g:2198:2: ( rule__Machine__RefinesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesAssignment_4_1_1()); 
            }
            // InternalXMachine.g:2199:2: ( rule__Machine__RefinesAssignment_4_1_1 )
            // InternalXMachine.g:2199:3: rule__Machine__RefinesAssignment_4_1_1
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
    // InternalXMachine.g:2208:1: rule__Machine__Group_4_2__0 : rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 ;
    public final void rule__Machine__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2212:1: ( rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 )
            // InternalXMachine.g:2213:2: rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1
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
    // InternalXMachine.g:2220:1: rule__Machine__Group_4_2__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2224:1: ( ( 'sees' ) )
            // InternalXMachine.g:2225:1: ( 'sees' )
            {
            // InternalXMachine.g:2225:1: ( 'sees' )
            // InternalXMachine.g:2226:2: 'sees'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesKeyword_4_2_0()); 
            }
            match(input,140,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2235:1: rule__Machine__Group_4_2__1 : rule__Machine__Group_4_2__1__Impl ;
    public final void rule__Machine__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2239:1: ( rule__Machine__Group_4_2__1__Impl )
            // InternalXMachine.g:2240:2: rule__Machine__Group_4_2__1__Impl
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
    // InternalXMachine.g:2246:1: rule__Machine__Group_4_2__1__Impl : ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) ) ;
    public final void rule__Machine__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2250:1: ( ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) ) )
            // InternalXMachine.g:2251:1: ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) )
            {
            // InternalXMachine.g:2251:1: ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) )
            // InternalXMachine.g:2252:2: ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* )
            {
            // InternalXMachine.g:2252:2: ( ( rule__Machine__SeesAssignment_4_2_1 ) )
            // InternalXMachine.g:2253:3: ( rule__Machine__SeesAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }
            // InternalXMachine.g:2254:3: ( rule__Machine__SeesAssignment_4_2_1 )
            // InternalXMachine.g:2254:4: rule__Machine__SeesAssignment_4_2_1
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

            // InternalXMachine.g:2257:2: ( ( rule__Machine__SeesAssignment_4_2_1 )* )
            // InternalXMachine.g:2258:3: ( rule__Machine__SeesAssignment_4_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }
            // InternalXMachine.g:2259:3: ( rule__Machine__SeesAssignment_4_2_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXMachine.g:2259:4: rule__Machine__SeesAssignment_4_2_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Machine__SeesAssignment_4_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalXMachine.g:2269:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2273:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:2274:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
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
    // InternalXMachine.g:2281:1: rule__Machine__Group_5__0__Impl : ( 'contains' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2285:1: ( ( 'contains' ) )
            // InternalXMachine.g:2286:1: ( 'contains' )
            {
            // InternalXMachine.g:2286:1: ( 'contains' )
            // InternalXMachine.g:2287:2: 'contains'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getContainsKeyword_5_0()); 
            }
            match(input,141,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2296:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2300:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:2301:2: rule__Machine__Group_5__1__Impl
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
    // InternalXMachine.g:2307:1: rule__Machine__Group_5__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2311:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) ) )
            // InternalXMachine.g:2312:1: ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:2312:1: ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) )
            // InternalXMachine.g:2313:2: ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* )
            {
            // InternalXMachine.g:2313:2: ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) )
            // InternalXMachine.g:2314:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_5_1()); 
            }
            // InternalXMachine.g:2315:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )
            // InternalXMachine.g:2315:4: rule__Machine__OrderedChildrenAssignment_5_1
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

            // InternalXMachine.g:2318:2: ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* )
            // InternalXMachine.g:2319:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_5_1()); 
            }
            // InternalXMachine.g:2320:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalXMachine.g:2320:4: rule__Machine__OrderedChildrenAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Machine__OrderedChildrenAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalXMachine.g:2330:1: rule__Machine__Group_6_0__0 : rule__Machine__Group_6_0__0__Impl rule__Machine__Group_6_0__1 ;
    public final void rule__Machine__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2334:1: ( rule__Machine__Group_6_0__0__Impl rule__Machine__Group_6_0__1 )
            // InternalXMachine.g:2335:2: rule__Machine__Group_6_0__0__Impl rule__Machine__Group_6_0__1
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
    // InternalXMachine.g:2342:1: rule__Machine__Group_6_0__0__Impl : ( ( rule__Machine__Alternatives_6_0_0 ) ) ;
    public final void rule__Machine__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2346:1: ( ( ( rule__Machine__Alternatives_6_0_0 ) ) )
            // InternalXMachine.g:2347:1: ( ( rule__Machine__Alternatives_6_0_0 ) )
            {
            // InternalXMachine.g:2347:1: ( ( rule__Machine__Alternatives_6_0_0 ) )
            // InternalXMachine.g:2348:2: ( rule__Machine__Alternatives_6_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getAlternatives_6_0_0()); 
            }
            // InternalXMachine.g:2349:2: ( rule__Machine__Alternatives_6_0_0 )
            // InternalXMachine.g:2349:3: rule__Machine__Alternatives_6_0_0
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
    // InternalXMachine.g:2357:1: rule__Machine__Group_6_0__1 : rule__Machine__Group_6_0__1__Impl ;
    public final void rule__Machine__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2361:1: ( rule__Machine__Group_6_0__1__Impl )
            // InternalXMachine.g:2362:2: rule__Machine__Group_6_0__1__Impl
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
    // InternalXMachine.g:2368:1: rule__Machine__Group_6_0__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) ) ;
    public final void rule__Machine__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2372:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) ) )
            // InternalXMachine.g:2373:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) )
            {
            // InternalXMachine.g:2373:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) )
            // InternalXMachine.g:2374:2: ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* )
            {
            // InternalXMachine.g:2374:2: ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) )
            // InternalXMachine.g:2375:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_0_1()); 
            }
            // InternalXMachine.g:2376:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )
            // InternalXMachine.g:2376:4: rule__Machine__OrderedChildrenAssignment_6_0_1
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

            // InternalXMachine.g:2379:2: ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* )
            // InternalXMachine.g:2380:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_0_1()); 
            }
            // InternalXMachine.g:2381:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STRING) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==RULE_ID) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXMachine.g:2381:4: rule__Machine__OrderedChildrenAssignment_6_0_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Machine__OrderedChildrenAssignment_6_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalXMachine.g:2391:1: rule__Machine__Group_6_2__0 : rule__Machine__Group_6_2__0__Impl rule__Machine__Group_6_2__1 ;
    public final void rule__Machine__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2395:1: ( rule__Machine__Group_6_2__0__Impl rule__Machine__Group_6_2__1 )
            // InternalXMachine.g:2396:2: rule__Machine__Group_6_2__0__Impl rule__Machine__Group_6_2__1
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
    // InternalXMachine.g:2403:1: rule__Machine__Group_6_2__0__Impl : ( ( rule__Machine__Alternatives_6_2_0 ) ) ;
    public final void rule__Machine__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2407:1: ( ( ( rule__Machine__Alternatives_6_2_0 ) ) )
            // InternalXMachine.g:2408:1: ( ( rule__Machine__Alternatives_6_2_0 ) )
            {
            // InternalXMachine.g:2408:1: ( ( rule__Machine__Alternatives_6_2_0 ) )
            // InternalXMachine.g:2409:2: ( rule__Machine__Alternatives_6_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getAlternatives_6_2_0()); 
            }
            // InternalXMachine.g:2410:2: ( rule__Machine__Alternatives_6_2_0 )
            // InternalXMachine.g:2410:3: rule__Machine__Alternatives_6_2_0
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
    // InternalXMachine.g:2418:1: rule__Machine__Group_6_2__1 : rule__Machine__Group_6_2__1__Impl ;
    public final void rule__Machine__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2422:1: ( rule__Machine__Group_6_2__1__Impl )
            // InternalXMachine.g:2423:2: rule__Machine__Group_6_2__1__Impl
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
    // InternalXMachine.g:2429:1: rule__Machine__Group_6_2__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) ) ;
    public final void rule__Machine__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2433:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) ) )
            // InternalXMachine.g:2434:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) )
            {
            // InternalXMachine.g:2434:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) )
            // InternalXMachine.g:2435:2: ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* )
            {
            // InternalXMachine.g:2435:2: ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) )
            // InternalXMachine.g:2436:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_2_1()); 
            }
            // InternalXMachine.g:2437:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )
            // InternalXMachine.g:2437:4: rule__Machine__OrderedChildrenAssignment_6_2_1
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

            // InternalXMachine.g:2440:2: ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* )
            // InternalXMachine.g:2441:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_2_1()); 
            }
            // InternalXMachine.g:2442:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_STRING) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_XLABEL) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==RULE_XLABEL) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXMachine.g:2442:4: rule__Machine__OrderedChildrenAssignment_6_2_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Machine__OrderedChildrenAssignment_6_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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


    // $ANTLR start "rule__MContains__Group__0"
    // InternalXMachine.g:2452:1: rule__MContains__Group__0 : rule__MContains__Group__0__Impl rule__MContains__Group__1 ;
    public final void rule__MContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2456:1: ( rule__MContains__Group__0__Impl rule__MContains__Group__1 )
            // InternalXMachine.g:2457:2: rule__MContains__Group__0__Impl rule__MContains__Group__1
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
    // InternalXMachine.g:2464:1: rule__MContains__Group__0__Impl : ( () ) ;
    public final void rule__MContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2468:1: ( ( () ) )
            // InternalXMachine.g:2469:1: ( () )
            {
            // InternalXMachine.g:2469:1: ( () )
            // InternalXMachine.g:2470:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getContainmentAction_0()); 
            }
            // InternalXMachine.g:2471:2: ()
            // InternalXMachine.g:2471:3: 
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
    // InternalXMachine.g:2479:1: rule__MContains__Group__1 : rule__MContains__Group__1__Impl ;
    public final void rule__MContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2483:1: ( rule__MContains__Group__1__Impl )
            // InternalXMachine.g:2484:2: rule__MContains__Group__1__Impl
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
    // InternalXMachine.g:2490:1: rule__MContains__Group__1__Impl : ( ( rule__MContains__ExtensionAssignment_1 ) ) ;
    public final void rule__MContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2494:1: ( ( ( rule__MContains__ExtensionAssignment_1 ) ) )
            // InternalXMachine.g:2495:1: ( ( rule__MContains__ExtensionAssignment_1 ) )
            {
            // InternalXMachine.g:2495:1: ( ( rule__MContains__ExtensionAssignment_1 ) )
            // InternalXMachine.g:2496:2: ( rule__MContains__ExtensionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionAssignment_1()); 
            }
            // InternalXMachine.g:2497:2: ( rule__MContains__ExtensionAssignment_1 )
            // InternalXMachine.g:2497:3: rule__MContains__ExtensionAssignment_1
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
    // InternalXMachine.g:2506:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2510:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:2511:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:2518:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2522:1: ( ( () ) )
            // InternalXMachine.g:2523:1: ( () )
            {
            // InternalXMachine.g:2523:1: ( () )
            // InternalXMachine.g:2524:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            }
            // InternalXMachine.g:2525:2: ()
            // InternalXMachine.g:2525:3: 
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
    // InternalXMachine.g:2533:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2537:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:2538:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXMachine.g:2545:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2549:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:2550:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:2550:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:2551:2: ( rule__MIncludes__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2552:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:2552:3: rule__MIncludes__Group_1__0
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
    // InternalXMachine.g:2560:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2564:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:2565:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalXMachine.g:2572:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2576:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:2577:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:2577:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:2578:2: ( rule__MIncludes__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            }
            // InternalXMachine.g:2579:2: ( rule__MIncludes__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==143) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXMachine.g:2579:3: rule__MIncludes__Group_2__0
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
    // InternalXMachine.g:2587:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2591:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:2592:2: rule__MIncludes__Group__3__Impl
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
    // InternalXMachine.g:2598:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2602:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:2603:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:2603:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:2604:2: ( rule__MIncludes__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            }
            // InternalXMachine.g:2605:2: ( rule__MIncludes__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==144) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXMachine.g:2605:3: rule__MIncludes__Group_3__0
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
    // InternalXMachine.g:2614:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2618:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:2619:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
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
    // InternalXMachine.g:2626:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2630:1: ( ( 'includes' ) )
            // InternalXMachine.g:2631:1: ( 'includes' )
            {
            // InternalXMachine.g:2631:1: ( 'includes' )
            // InternalXMachine.g:2632:2: 'includes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            }
            match(input,142,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2641:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2645:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:2646:2: rule__MIncludes__Group_1__1__Impl
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
    // InternalXMachine.g:2652:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2656:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:2657:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:2657:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:2658:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            }
            // InternalXMachine.g:2659:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:2659:3: rule__MIncludes__AbstractMachineAssignment_1_1
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
    // InternalXMachine.g:2668:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2672:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:2673:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
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
    // InternalXMachine.g:2680:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2684:1: ( ( 'to' ) )
            // InternalXMachine.g:2685:1: ( 'to' )
            {
            // InternalXMachine.g:2685:1: ( 'to' )
            // InternalXMachine.g:2686:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            }
            match(input,143,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2695:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2699:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:2700:2: rule__MIncludes__Group_2__1__Impl
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
    // InternalXMachine.g:2706:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2710:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:2711:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:2711:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:2712:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            }
            // InternalXMachine.g:2713:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:2713:3: rule__MIncludes__ConcreteMachineAssignment_2_1
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
    // InternalXMachine.g:2722:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2726:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:2727:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
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
    // InternalXMachine.g:2734:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2738:1: ( ( 'as' ) )
            // InternalXMachine.g:2739:1: ( 'as' )
            {
            // InternalXMachine.g:2739:1: ( 'as' )
            // InternalXMachine.g:2740:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            }
            match(input,144,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2749:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2753:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:2754:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
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
    // InternalXMachine.g:2761:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2765:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:2766:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:2766:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:2767:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            }
            // InternalXMachine.g:2768:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:2768:3: rule__MIncludes__PrefixesAssignment_3_1
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
    // InternalXMachine.g:2776:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2780:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:2781:2: rule__MIncludes__Group_3__2__Impl
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
    // InternalXMachine.g:2787:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2791:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:2792:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:2792:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:2793:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            }
            // InternalXMachine.g:2794:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXMachine.g:2794:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MIncludes__PrefixesAssignment_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalXMachine.g:2803:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2807:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:2808:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalXMachine.g:2815:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2819:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2820:1: ( RULE_ID )
            {
            // InternalXMachine.g:2820:1: ( RULE_ID )
            // InternalXMachine.g:2821:2: RULE_ID
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
    // InternalXMachine.g:2830:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2834:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:2835:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXMachine.g:2841:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2845:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:2846:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:2846:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:2847:2: ( rule__QualifiedName__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2848:2: ( rule__QualifiedName__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==75) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXMachine.g:2848:3: rule__QualifiedName__Group_1__0
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
    // InternalXMachine.g:2857:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2861:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:2862:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXMachine.g:2869:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2873:1: ( ( '.' ) )
            // InternalXMachine.g:2874:1: ( '.' )
            {
            // InternalXMachine.g:2874:1: ( '.' )
            // InternalXMachine.g:2875:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2884:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2888:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:2889:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXMachine.g:2895:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2899:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2900:1: ( RULE_ID )
            {
            // InternalXMachine.g:2900:1: ( RULE_ID )
            // InternalXMachine.g:2901:2: RULE_ID
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
    // InternalXMachine.g:2911:1: rule__XMultipleVariable__Group__0 : rule__XMultipleVariable__Group__0__Impl rule__XMultipleVariable__Group__1 ;
    public final void rule__XMultipleVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2915:1: ( rule__XMultipleVariable__Group__0__Impl rule__XMultipleVariable__Group__1 )
            // InternalXMachine.g:2916:2: rule__XMultipleVariable__Group__0__Impl rule__XMultipleVariable__Group__1
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
    // InternalXMachine.g:2923:1: rule__XMultipleVariable__Group__0__Impl : ( () ) ;
    public final void rule__XMultipleVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2927:1: ( ( () ) )
            // InternalXMachine.g:2928:1: ( () )
            {
            // InternalXMachine.g:2928:1: ( () )
            // InternalXMachine.g:2929:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleVariableAccess().getVariableAction_0()); 
            }
            // InternalXMachine.g:2930:2: ()
            // InternalXMachine.g:2930:3: 
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
    // InternalXMachine.g:2938:1: rule__XMultipleVariable__Group__1 : rule__XMultipleVariable__Group__1__Impl rule__XMultipleVariable__Group__2 ;
    public final void rule__XMultipleVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2942:1: ( rule__XMultipleVariable__Group__1__Impl rule__XMultipleVariable__Group__2 )
            // InternalXMachine.g:2943:2: rule__XMultipleVariable__Group__1__Impl rule__XMultipleVariable__Group__2
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
    // InternalXMachine.g:2950:1: rule__XMultipleVariable__Group__1__Impl : ( ( rule__XMultipleVariable__CommentAssignment_1 )? ) ;
    public final void rule__XMultipleVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2954:1: ( ( ( rule__XMultipleVariable__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2955:1: ( ( rule__XMultipleVariable__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2955:1: ( ( rule__XMultipleVariable__CommentAssignment_1 )? )
            // InternalXMachine.g:2956:2: ( rule__XMultipleVariable__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleVariableAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:2957:2: ( rule__XMultipleVariable__CommentAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXMachine.g:2957:3: rule__XMultipleVariable__CommentAssignment_1
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
    // InternalXMachine.g:2965:1: rule__XMultipleVariable__Group__2 : rule__XMultipleVariable__Group__2__Impl ;
    public final void rule__XMultipleVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2969:1: ( rule__XMultipleVariable__Group__2__Impl )
            // InternalXMachine.g:2970:2: rule__XMultipleVariable__Group__2__Impl
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
    // InternalXMachine.g:2976:1: rule__XMultipleVariable__Group__2__Impl : ( ( rule__XMultipleVariable__NameAssignment_2 ) ) ;
    public final void rule__XMultipleVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2980:1: ( ( ( rule__XMultipleVariable__NameAssignment_2 ) ) )
            // InternalXMachine.g:2981:1: ( ( rule__XMultipleVariable__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2981:1: ( ( rule__XMultipleVariable__NameAssignment_2 ) )
            // InternalXMachine.g:2982:2: ( rule__XMultipleVariable__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleVariableAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:2983:2: ( rule__XMultipleVariable__NameAssignment_2 )
            // InternalXMachine.g:2983:3: rule__XMultipleVariable__NameAssignment_2
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
    // InternalXMachine.g:2992:1: rule__XIndividualVariable__Group__0 : rule__XIndividualVariable__Group__0__Impl rule__XIndividualVariable__Group__1 ;
    public final void rule__XIndividualVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2996:1: ( rule__XIndividualVariable__Group__0__Impl rule__XIndividualVariable__Group__1 )
            // InternalXMachine.g:2997:2: rule__XIndividualVariable__Group__0__Impl rule__XIndividualVariable__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalXMachine.g:3004:1: rule__XIndividualVariable__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3008:1: ( ( () ) )
            // InternalXMachine.g:3009:1: ( () )
            {
            // InternalXMachine.g:3009:1: ( () )
            // InternalXMachine.g:3010:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getTypedVariableAction_0()); 
            }
            // InternalXMachine.g:3011:2: ()
            // InternalXMachine.g:3011:3: 
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
    // InternalXMachine.g:3019:1: rule__XIndividualVariable__Group__1 : rule__XIndividualVariable__Group__1__Impl rule__XIndividualVariable__Group__2 ;
    public final void rule__XIndividualVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3023:1: ( rule__XIndividualVariable__Group__1__Impl rule__XIndividualVariable__Group__2 )
            // InternalXMachine.g:3024:2: rule__XIndividualVariable__Group__1__Impl rule__XIndividualVariable__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalXMachine.g:3031:1: rule__XIndividualVariable__Group__1__Impl : ( ( rule__XIndividualVariable__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3035:1: ( ( ( rule__XIndividualVariable__CommentAssignment_1 )? ) )
            // InternalXMachine.g:3036:1: ( ( rule__XIndividualVariable__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:3036:1: ( ( rule__XIndividualVariable__CommentAssignment_1 )? )
            // InternalXMachine.g:3037:2: ( rule__XIndividualVariable__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:3038:2: ( rule__XIndividualVariable__CommentAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXMachine.g:3038:3: rule__XIndividualVariable__CommentAssignment_1
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
    // InternalXMachine.g:3046:1: rule__XIndividualVariable__Group__2 : rule__XIndividualVariable__Group__2__Impl rule__XIndividualVariable__Group__3 ;
    public final void rule__XIndividualVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3050:1: ( rule__XIndividualVariable__Group__2__Impl rule__XIndividualVariable__Group__3 )
            // InternalXMachine.g:3051:2: rule__XIndividualVariable__Group__2__Impl rule__XIndividualVariable__Group__3
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
    // InternalXMachine.g:3058:1: rule__XIndividualVariable__Group__2__Impl : ( ( rule__XIndividualVariable__Alternatives_2 ) ) ;
    public final void rule__XIndividualVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3062:1: ( ( ( rule__XIndividualVariable__Alternatives_2 ) ) )
            // InternalXMachine.g:3063:1: ( ( rule__XIndividualVariable__Alternatives_2 ) )
            {
            // InternalXMachine.g:3063:1: ( ( rule__XIndividualVariable__Alternatives_2 ) )
            // InternalXMachine.g:3064:2: ( rule__XIndividualVariable__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getAlternatives_2()); 
            }
            // InternalXMachine.g:3065:2: ( rule__XIndividualVariable__Alternatives_2 )
            // InternalXMachine.g:3065:3: rule__XIndividualVariable__Alternatives_2
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
    // InternalXMachine.g:3073:1: rule__XIndividualVariable__Group__3 : rule__XIndividualVariable__Group__3__Impl rule__XIndividualVariable__Group__4 ;
    public final void rule__XIndividualVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3077:1: ( rule__XIndividualVariable__Group__3__Impl rule__XIndividualVariable__Group__4 )
            // InternalXMachine.g:3078:2: rule__XIndividualVariable__Group__3__Impl rule__XIndividualVariable__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:3085:1: rule__XIndividualVariable__Group__3__Impl : ( ( rule__XIndividualVariable__NameAssignment_3 ) ) ;
    public final void rule__XIndividualVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3089:1: ( ( ( rule__XIndividualVariable__NameAssignment_3 ) ) )
            // InternalXMachine.g:3090:1: ( ( rule__XIndividualVariable__NameAssignment_3 ) )
            {
            // InternalXMachine.g:3090:1: ( ( rule__XIndividualVariable__NameAssignment_3 ) )
            // InternalXMachine.g:3091:2: ( rule__XIndividualVariable__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:3092:2: ( rule__XIndividualVariable__NameAssignment_3 )
            // InternalXMachine.g:3092:3: rule__XIndividualVariable__NameAssignment_3
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
    // InternalXMachine.g:3100:1: rule__XIndividualVariable__Group__4 : rule__XIndividualVariable__Group__4__Impl rule__XIndividualVariable__Group__5 ;
    public final void rule__XIndividualVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3104:1: ( rule__XIndividualVariable__Group__4__Impl rule__XIndividualVariable__Group__5 )
            // InternalXMachine.g:3105:2: rule__XIndividualVariable__Group__4__Impl rule__XIndividualVariable__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:3112:1: rule__XIndividualVariable__Group__4__Impl : ( ( rule__XIndividualVariable__Group_4__0 )? ) ;
    public final void rule__XIndividualVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3116:1: ( ( ( rule__XIndividualVariable__Group_4__0 )? ) )
            // InternalXMachine.g:3117:1: ( ( rule__XIndividualVariable__Group_4__0 )? )
            {
            // InternalXMachine.g:3117:1: ( ( rule__XIndividualVariable__Group_4__0 )? )
            // InternalXMachine.g:3118:2: ( rule__XIndividualVariable__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getGroup_4()); 
            }
            // InternalXMachine.g:3119:2: ( rule__XIndividualVariable__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==83) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXMachine.g:3119:3: rule__XIndividualVariable__Group_4__0
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
    // InternalXMachine.g:3127:1: rule__XIndividualVariable__Group__5 : rule__XIndividualVariable__Group__5__Impl ;
    public final void rule__XIndividualVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3131:1: ( rule__XIndividualVariable__Group__5__Impl )
            // InternalXMachine.g:3132:2: rule__XIndividualVariable__Group__5__Impl
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
    // InternalXMachine.g:3138:1: rule__XIndividualVariable__Group__5__Impl : ( ( rule__XIndividualVariable__Group_5__0 )? ) ;
    public final void rule__XIndividualVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3142:1: ( ( ( rule__XIndividualVariable__Group_5__0 )? ) )
            // InternalXMachine.g:3143:1: ( ( rule__XIndividualVariable__Group_5__0 )? )
            {
            // InternalXMachine.g:3143:1: ( ( rule__XIndividualVariable__Group_5__0 )? )
            // InternalXMachine.g:3144:2: ( rule__XIndividualVariable__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getGroup_5()); 
            }
            // InternalXMachine.g:3145:2: ( rule__XIndividualVariable__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==76) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:3145:3: rule__XIndividualVariable__Group_5__0
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
    // InternalXMachine.g:3154:1: rule__XIndividualVariable__Group_4__0 : rule__XIndividualVariable__Group_4__0__Impl rule__XIndividualVariable__Group_4__1 ;
    public final void rule__XIndividualVariable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3158:1: ( rule__XIndividualVariable__Group_4__0__Impl rule__XIndividualVariable__Group_4__1 )
            // InternalXMachine.g:3159:2: rule__XIndividualVariable__Group_4__0__Impl rule__XIndividualVariable__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:3166:1: rule__XIndividualVariable__Group_4__0__Impl : ( ':' ) ;
    public final void rule__XIndividualVariable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3170:1: ( ( ':' ) )
            // InternalXMachine.g:3171:1: ( ':' )
            {
            // InternalXMachine.g:3171:1: ( ':' )
            // InternalXMachine.g:3172:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getColonKeyword_4_0()); 
            }
            match(input,83,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3181:1: rule__XIndividualVariable__Group_4__1 : rule__XIndividualVariable__Group_4__1__Impl ;
    public final void rule__XIndividualVariable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3185:1: ( rule__XIndividualVariable__Group_4__1__Impl )
            // InternalXMachine.g:3186:2: rule__XIndividualVariable__Group_4__1__Impl
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
    // InternalXMachine.g:3192:1: rule__XIndividualVariable__Group_4__1__Impl : ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) ) ;
    public final void rule__XIndividualVariable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3196:1: ( ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) ) )
            // InternalXMachine.g:3197:1: ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) )
            {
            // InternalXMachine.g:3197:1: ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) )
            // InternalXMachine.g:3198:2: ( rule__XIndividualVariable__TypeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getTypeAssignment_4_1()); 
            }
            // InternalXMachine.g:3199:2: ( rule__XIndividualVariable__TypeAssignment_4_1 )
            // InternalXMachine.g:3199:3: rule__XIndividualVariable__TypeAssignment_4_1
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
    // InternalXMachine.g:3208:1: rule__XIndividualVariable__Group_5__0 : rule__XIndividualVariable__Group_5__0__Impl rule__XIndividualVariable__Group_5__1 ;
    public final void rule__XIndividualVariable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3212:1: ( rule__XIndividualVariable__Group_5__0__Impl rule__XIndividualVariable__Group_5__1 )
            // InternalXMachine.g:3213:2: rule__XIndividualVariable__Group_5__0__Impl rule__XIndividualVariable__Group_5__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:3220:1: rule__XIndividualVariable__Group_5__0__Impl : ( '=' ) ;
    public final void rule__XIndividualVariable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3224:1: ( ( '=' ) )
            // InternalXMachine.g:3225:1: ( '=' )
            {
            // InternalXMachine.g:3225:1: ( '=' )
            // InternalXMachine.g:3226:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getEqualsSignKeyword_5_0()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3235:1: rule__XIndividualVariable__Group_5__1 : rule__XIndividualVariable__Group_5__1__Impl ;
    public final void rule__XIndividualVariable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3239:1: ( rule__XIndividualVariable__Group_5__1__Impl )
            // InternalXMachine.g:3240:2: rule__XIndividualVariable__Group_5__1__Impl
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
    // InternalXMachine.g:3246:1: rule__XIndividualVariable__Group_5__1__Impl : ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) ) ;
    public final void rule__XIndividualVariable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3250:1: ( ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) ) )
            // InternalXMachine.g:3251:1: ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) )
            {
            // InternalXMachine.g:3251:1: ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) )
            // InternalXMachine.g:3252:2: ( rule__XIndividualVariable__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getValueAssignment_5_1()); 
            }
            // InternalXMachine.g:3253:2: ( rule__XIndividualVariable__ValueAssignment_5_1 )
            // InternalXMachine.g:3253:3: rule__XIndividualVariable__ValueAssignment_5_1
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
    // InternalXMachine.g:3262:1: rule__XType__Group__0 : rule__XType__Group__0__Impl rule__XType__Group__1 ;
    public final void rule__XType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3266:1: ( rule__XType__Group__0__Impl rule__XType__Group__1 )
            // InternalXMachine.g:3267:2: rule__XType__Group__0__Impl rule__XType__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:3274:1: rule__XType__Group__0__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3278:1: ( ( ruleXTypePrimitive ) )
            // InternalXMachine.g:3279:1: ( ruleXTypePrimitive )
            {
            // InternalXMachine.g:3279:1: ( ruleXTypePrimitive )
            // InternalXMachine.g:3280:2: ruleXTypePrimitive
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
    // InternalXMachine.g:3289:1: rule__XType__Group__1 : rule__XType__Group__1__Impl ;
    public final void rule__XType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3293:1: ( rule__XType__Group__1__Impl )
            // InternalXMachine.g:3294:2: rule__XType__Group__1__Impl
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
    // InternalXMachine.g:3300:1: rule__XType__Group__1__Impl : ( ( rule__XType__Group_1__0 )* ) ;
    public final void rule__XType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3304:1: ( ( ( rule__XType__Group_1__0 )* ) )
            // InternalXMachine.g:3305:1: ( ( rule__XType__Group_1__0 )* )
            {
            // InternalXMachine.g:3305:1: ( ( rule__XType__Group_1__0 )* )
            // InternalXMachine.g:3306:2: ( rule__XType__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypeAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3307:2: ( rule__XType__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=19 && LA41_0<=30)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalXMachine.g:3307:3: rule__XType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__XType__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalXMachine.g:3316:1: rule__XType__Group_1__0 : rule__XType__Group_1__0__Impl rule__XType__Group_1__1 ;
    public final void rule__XType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3320:1: ( rule__XType__Group_1__0__Impl rule__XType__Group_1__1 )
            // InternalXMachine.g:3321:2: rule__XType__Group_1__0__Impl rule__XType__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:3328:1: rule__XType__Group_1__0__Impl : ( ruleXTYPEOPERATOR ) ;
    public final void rule__XType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3332:1: ( ( ruleXTYPEOPERATOR ) )
            // InternalXMachine.g:3333:1: ( ruleXTYPEOPERATOR )
            {
            // InternalXMachine.g:3333:1: ( ruleXTYPEOPERATOR )
            // InternalXMachine.g:3334:2: ruleXTYPEOPERATOR
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
    // InternalXMachine.g:3343:1: rule__XType__Group_1__1 : rule__XType__Group_1__1__Impl ;
    public final void rule__XType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3347:1: ( rule__XType__Group_1__1__Impl )
            // InternalXMachine.g:3348:2: rule__XType__Group_1__1__Impl
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
    // InternalXMachine.g:3354:1: rule__XType__Group_1__1__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3358:1: ( ( ruleXTypePrimitive ) )
            // InternalXMachine.g:3359:1: ( ruleXTypePrimitive )
            {
            // InternalXMachine.g:3359:1: ( ruleXTypePrimitive )
            // InternalXMachine.g:3360:2: ruleXTypePrimitive
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
    // InternalXMachine.g:3370:1: rule__XTypePrimitive__Group_5__0 : rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 ;
    public final void rule__XTypePrimitive__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3374:1: ( rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 )
            // InternalXMachine.g:3375:2: rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:3382:1: rule__XTypePrimitive__Group_5__0__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3386:1: ( ( '(' ) )
            // InternalXMachine.g:3387:1: ( '(' )
            {
            // InternalXMachine.g:3387:1: ( '(' )
            // InternalXMachine.g:3388:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3397:1: rule__XTypePrimitive__Group_5__1 : rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 ;
    public final void rule__XTypePrimitive__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3401:1: ( rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 )
            // InternalXMachine.g:3402:2: rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalXMachine.g:3409:1: rule__XTypePrimitive__Group_5__1__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3413:1: ( ( ruleXType ) )
            // InternalXMachine.g:3414:1: ( ruleXType )
            {
            // InternalXMachine.g:3414:1: ( ruleXType )
            // InternalXMachine.g:3415:2: ruleXType
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
    // InternalXMachine.g:3424:1: rule__XTypePrimitive__Group_5__2 : rule__XTypePrimitive__Group_5__2__Impl ;
    public final void rule__XTypePrimitive__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3428:1: ( rule__XTypePrimitive__Group_5__2__Impl )
            // InternalXMachine.g:3429:2: rule__XTypePrimitive__Group_5__2__Impl
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
    // InternalXMachine.g:3435:1: rule__XTypePrimitive__Group_5__2__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3439:1: ( ( ')' ) )
            // InternalXMachine.g:3440:1: ( ')' )
            {
            // InternalXMachine.g:3440:1: ( ')' )
            // InternalXMachine.g:3441:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3451:1: rule__XTypePrimitive__Group_6__0 : rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 ;
    public final void rule__XTypePrimitive__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3455:1: ( rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 )
            // InternalXMachine.g:3456:2: rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:3463:1: rule__XTypePrimitive__Group_6__0__Impl : ( '\\u2119' ) ;
    public final void rule__XTypePrimitive__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3467:1: ( ( '\\u2119' ) )
            // InternalXMachine.g:3468:1: ( '\\u2119' )
            {
            // InternalXMachine.g:3468:1: ( '\\u2119' )
            // InternalXMachine.g:3469:2: '\\u2119'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3478:1: rule__XTypePrimitive__Group_6__1 : rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 ;
    public final void rule__XTypePrimitive__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3482:1: ( rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 )
            // InternalXMachine.g:3483:2: rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:3490:1: rule__XTypePrimitive__Group_6__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3494:1: ( ( '(' ) )
            // InternalXMachine.g:3495:1: ( '(' )
            {
            // InternalXMachine.g:3495:1: ( '(' )
            // InternalXMachine.g:3496:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3505:1: rule__XTypePrimitive__Group_6__2 : rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 ;
    public final void rule__XTypePrimitive__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3509:1: ( rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 )
            // InternalXMachine.g:3510:2: rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalXMachine.g:3517:1: rule__XTypePrimitive__Group_6__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3521:1: ( ( ruleXType ) )
            // InternalXMachine.g:3522:1: ( ruleXType )
            {
            // InternalXMachine.g:3522:1: ( ruleXType )
            // InternalXMachine.g:3523:2: ruleXType
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
    // InternalXMachine.g:3532:1: rule__XTypePrimitive__Group_6__3 : rule__XTypePrimitive__Group_6__3__Impl ;
    public final void rule__XTypePrimitive__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3536:1: ( rule__XTypePrimitive__Group_6__3__Impl )
            // InternalXMachine.g:3537:2: rule__XTypePrimitive__Group_6__3__Impl
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
    // InternalXMachine.g:3543:1: rule__XTypePrimitive__Group_6__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3547:1: ( ( ')' ) )
            // InternalXMachine.g:3548:1: ( ')' )
            {
            // InternalXMachine.g:3548:1: ( ')' )
            // InternalXMachine.g:3549:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3559:1: rule__XTypePrimitive__Group_7__0 : rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 ;
    public final void rule__XTypePrimitive__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3563:1: ( rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 )
            // InternalXMachine.g:3564:2: rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:3571:1: rule__XTypePrimitive__Group_7__0__Impl : ( '\\u21191' ) ;
    public final void rule__XTypePrimitive__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3575:1: ( ( '\\u21191' ) )
            // InternalXMachine.g:3576:1: ( '\\u21191' )
            {
            // InternalXMachine.g:3576:1: ( '\\u21191' )
            // InternalXMachine.g:3577:2: '\\u21191'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3586:1: rule__XTypePrimitive__Group_7__1 : rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 ;
    public final void rule__XTypePrimitive__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3590:1: ( rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 )
            // InternalXMachine.g:3591:2: rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:3598:1: rule__XTypePrimitive__Group_7__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3602:1: ( ( '(' ) )
            // InternalXMachine.g:3603:1: ( '(' )
            {
            // InternalXMachine.g:3603:1: ( '(' )
            // InternalXMachine.g:3604:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3613:1: rule__XTypePrimitive__Group_7__2 : rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 ;
    public final void rule__XTypePrimitive__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3617:1: ( rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 )
            // InternalXMachine.g:3618:2: rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalXMachine.g:3625:1: rule__XTypePrimitive__Group_7__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3629:1: ( ( ruleXType ) )
            // InternalXMachine.g:3630:1: ( ruleXType )
            {
            // InternalXMachine.g:3630:1: ( ruleXType )
            // InternalXMachine.g:3631:2: ruleXType
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
    // InternalXMachine.g:3640:1: rule__XTypePrimitive__Group_7__3 : rule__XTypePrimitive__Group_7__3__Impl ;
    public final void rule__XTypePrimitive__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3644:1: ( rule__XTypePrimitive__Group_7__3__Impl )
            // InternalXMachine.g:3645:2: rule__XTypePrimitive__Group_7__3__Impl
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
    // InternalXMachine.g:3651:1: rule__XTypePrimitive__Group_7__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3655:1: ( ( ')' ) )
            // InternalXMachine.g:3656:1: ( ')' )
            {
            // InternalXMachine.g:3656:1: ( ')' )
            // InternalXMachine.g:3657:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_7_3()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3667:1: rule__XMultipleInvariant__Group__0 : rule__XMultipleInvariant__Group__0__Impl rule__XMultipleInvariant__Group__1 ;
    public final void rule__XMultipleInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3671:1: ( rule__XMultipleInvariant__Group__0__Impl rule__XMultipleInvariant__Group__1 )
            // InternalXMachine.g:3672:2: rule__XMultipleInvariant__Group__0__Impl rule__XMultipleInvariant__Group__1
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
    // InternalXMachine.g:3679:1: rule__XMultipleInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XMultipleInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3683:1: ( ( () ) )
            // InternalXMachine.g:3684:1: ( () )
            {
            // InternalXMachine.g:3684:1: ( () )
            // InternalXMachine.g:3685:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:3686:2: ()
            // InternalXMachine.g:3686:3: 
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
    // InternalXMachine.g:3694:1: rule__XMultipleInvariant__Group__1 : rule__XMultipleInvariant__Group__1__Impl rule__XMultipleInvariant__Group__2 ;
    public final void rule__XMultipleInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3698:1: ( rule__XMultipleInvariant__Group__1__Impl rule__XMultipleInvariant__Group__2 )
            // InternalXMachine.g:3699:2: rule__XMultipleInvariant__Group__1__Impl rule__XMultipleInvariant__Group__2
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
    // InternalXMachine.g:3706:1: rule__XMultipleInvariant__Group__1__Impl : ( ( rule__XMultipleInvariant__CommentAssignment_1 )? ) ;
    public final void rule__XMultipleInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3710:1: ( ( ( rule__XMultipleInvariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:3711:1: ( ( rule__XMultipleInvariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:3711:1: ( ( rule__XMultipleInvariant__CommentAssignment_1 )? )
            // InternalXMachine.g:3712:2: ( rule__XMultipleInvariant__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:3713:2: ( rule__XMultipleInvariant__CommentAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:3713:3: rule__XMultipleInvariant__CommentAssignment_1
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
    // InternalXMachine.g:3721:1: rule__XMultipleInvariant__Group__2 : rule__XMultipleInvariant__Group__2__Impl rule__XMultipleInvariant__Group__3 ;
    public final void rule__XMultipleInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3725:1: ( rule__XMultipleInvariant__Group__2__Impl rule__XMultipleInvariant__Group__3 )
            // InternalXMachine.g:3726:2: rule__XMultipleInvariant__Group__2__Impl rule__XMultipleInvariant__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:3733:1: rule__XMultipleInvariant__Group__2__Impl : ( ( rule__XMultipleInvariant__NameAssignment_2 ) ) ;
    public final void rule__XMultipleInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3737:1: ( ( ( rule__XMultipleInvariant__NameAssignment_2 ) ) )
            // InternalXMachine.g:3738:1: ( ( rule__XMultipleInvariant__NameAssignment_2 ) )
            {
            // InternalXMachine.g:3738:1: ( ( rule__XMultipleInvariant__NameAssignment_2 ) )
            // InternalXMachine.g:3739:2: ( rule__XMultipleInvariant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:3740:2: ( rule__XMultipleInvariant__NameAssignment_2 )
            // InternalXMachine.g:3740:3: rule__XMultipleInvariant__NameAssignment_2
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
    // InternalXMachine.g:3748:1: rule__XMultipleInvariant__Group__3 : rule__XMultipleInvariant__Group__3__Impl ;
    public final void rule__XMultipleInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3752:1: ( rule__XMultipleInvariant__Group__3__Impl )
            // InternalXMachine.g:3753:2: rule__XMultipleInvariant__Group__3__Impl
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
    // InternalXMachine.g:3759:1: rule__XMultipleInvariant__Group__3__Impl : ( ( rule__XMultipleInvariant__PredicateAssignment_3 ) ) ;
    public final void rule__XMultipleInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3763:1: ( ( ( rule__XMultipleInvariant__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:3764:1: ( ( rule__XMultipleInvariant__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:3764:1: ( ( rule__XMultipleInvariant__PredicateAssignment_3 ) )
            // InternalXMachine.g:3765:2: ( rule__XMultipleInvariant__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMultipleInvariantAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:3766:2: ( rule__XMultipleInvariant__PredicateAssignment_3 )
            // InternalXMachine.g:3766:3: rule__XMultipleInvariant__PredicateAssignment_3
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
    // InternalXMachine.g:3775:1: rule__XIndividualInvariant__Group__0 : rule__XIndividualInvariant__Group__0__Impl rule__XIndividualInvariant__Group__1 ;
    public final void rule__XIndividualInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3779:1: ( rule__XIndividualInvariant__Group__0__Impl rule__XIndividualInvariant__Group__1 )
            // InternalXMachine.g:3780:2: rule__XIndividualInvariant__Group__0__Impl rule__XIndividualInvariant__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalXMachine.g:3787:1: rule__XIndividualInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3791:1: ( ( () ) )
            // InternalXMachine.g:3792:1: ( () )
            {
            // InternalXMachine.g:3792:1: ( () )
            // InternalXMachine.g:3793:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:3794:2: ()
            // InternalXMachine.g:3794:3: 
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
    // InternalXMachine.g:3802:1: rule__XIndividualInvariant__Group__1 : rule__XIndividualInvariant__Group__1__Impl rule__XIndividualInvariant__Group__2 ;
    public final void rule__XIndividualInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3806:1: ( rule__XIndividualInvariant__Group__1__Impl rule__XIndividualInvariant__Group__2 )
            // InternalXMachine.g:3807:2: rule__XIndividualInvariant__Group__1__Impl rule__XIndividualInvariant__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalXMachine.g:3814:1: rule__XIndividualInvariant__Group__1__Impl : ( ( rule__XIndividualInvariant__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3818:1: ( ( ( rule__XIndividualInvariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:3819:1: ( ( rule__XIndividualInvariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:3819:1: ( ( rule__XIndividualInvariant__CommentAssignment_1 )? )
            // InternalXMachine.g:3820:2: ( rule__XIndividualInvariant__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:3821:2: ( rule__XIndividualInvariant__CommentAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXMachine.g:3821:3: rule__XIndividualInvariant__CommentAssignment_1
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
    // InternalXMachine.g:3829:1: rule__XIndividualInvariant__Group__2 : rule__XIndividualInvariant__Group__2__Impl rule__XIndividualInvariant__Group__3 ;
    public final void rule__XIndividualInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3833:1: ( rule__XIndividualInvariant__Group__2__Impl rule__XIndividualInvariant__Group__3 )
            // InternalXMachine.g:3834:2: rule__XIndividualInvariant__Group__2__Impl rule__XIndividualInvariant__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalXMachine.g:3841:1: rule__XIndividualInvariant__Group__2__Impl : ( ( rule__XIndividualInvariant__Alternatives_2 ) ) ;
    public final void rule__XIndividualInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3845:1: ( ( ( rule__XIndividualInvariant__Alternatives_2 ) ) )
            // InternalXMachine.g:3846:1: ( ( rule__XIndividualInvariant__Alternatives_2 ) )
            {
            // InternalXMachine.g:3846:1: ( ( rule__XIndividualInvariant__Alternatives_2 ) )
            // InternalXMachine.g:3847:2: ( rule__XIndividualInvariant__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getAlternatives_2()); 
            }
            // InternalXMachine.g:3848:2: ( rule__XIndividualInvariant__Alternatives_2 )
            // InternalXMachine.g:3848:3: rule__XIndividualInvariant__Alternatives_2
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
    // InternalXMachine.g:3856:1: rule__XIndividualInvariant__Group__3 : rule__XIndividualInvariant__Group__3__Impl rule__XIndividualInvariant__Group__4 ;
    public final void rule__XIndividualInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3860:1: ( rule__XIndividualInvariant__Group__3__Impl rule__XIndividualInvariant__Group__4 )
            // InternalXMachine.g:3861:2: rule__XIndividualInvariant__Group__3__Impl rule__XIndividualInvariant__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:3868:1: rule__XIndividualInvariant__Group__3__Impl : ( ( rule__XIndividualInvariant__NameAssignment_3 ) ) ;
    public final void rule__XIndividualInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3872:1: ( ( ( rule__XIndividualInvariant__NameAssignment_3 ) ) )
            // InternalXMachine.g:3873:1: ( ( rule__XIndividualInvariant__NameAssignment_3 ) )
            {
            // InternalXMachine.g:3873:1: ( ( rule__XIndividualInvariant__NameAssignment_3 ) )
            // InternalXMachine.g:3874:2: ( rule__XIndividualInvariant__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:3875:2: ( rule__XIndividualInvariant__NameAssignment_3 )
            // InternalXMachine.g:3875:3: rule__XIndividualInvariant__NameAssignment_3
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
    // InternalXMachine.g:3883:1: rule__XIndividualInvariant__Group__4 : rule__XIndividualInvariant__Group__4__Impl ;
    public final void rule__XIndividualInvariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3887:1: ( rule__XIndividualInvariant__Group__4__Impl )
            // InternalXMachine.g:3888:2: rule__XIndividualInvariant__Group__4__Impl
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
    // InternalXMachine.g:3894:1: rule__XIndividualInvariant__Group__4__Impl : ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) ) ;
    public final void rule__XIndividualInvariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3898:1: ( ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) ) )
            // InternalXMachine.g:3899:1: ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) )
            {
            // InternalXMachine.g:3899:1: ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) )
            // InternalXMachine.g:3900:2: ( rule__XIndividualInvariant__PredicateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getPredicateAssignment_4()); 
            }
            // InternalXMachine.g:3901:2: ( rule__XIndividualInvariant__PredicateAssignment_4 )
            // InternalXMachine.g:3901:3: rule__XIndividualInvariant__PredicateAssignment_4
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
    // InternalXMachine.g:3910:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3914:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:3915:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalXMachine.g:3922:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3926:1: ( ( () ) )
            // InternalXMachine.g:3927:1: ( () )
            {
            // InternalXMachine.g:3927:1: ( () )
            // InternalXMachine.g:3928:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            }
            // InternalXMachine.g:3929:2: ()
            // InternalXMachine.g:3929:3: 
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
    // InternalXMachine.g:3937:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl rule__XVariant__Group__2 ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3941:1: ( rule__XVariant__Group__1__Impl rule__XVariant__Group__2 )
            // InternalXMachine.g:3942:2: rule__XVariant__Group__1__Impl rule__XVariant__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalXMachine.g:3949:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__CommentAssignment_1 )? ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3953:1: ( ( ( rule__XVariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:3954:1: ( ( rule__XVariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:3954:1: ( ( rule__XVariant__CommentAssignment_1 )? )
            // InternalXMachine.g:3955:2: ( rule__XVariant__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:3956:2: ( rule__XVariant__CommentAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:3956:3: rule__XVariant__CommentAssignment_1
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
    // InternalXMachine.g:3964:1: rule__XVariant__Group__2 : rule__XVariant__Group__2__Impl rule__XVariant__Group__3 ;
    public final void rule__XVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3968:1: ( rule__XVariant__Group__2__Impl rule__XVariant__Group__3 )
            // InternalXMachine.g:3969:2: rule__XVariant__Group__2__Impl rule__XVariant__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalXMachine.g:3976:1: rule__XVariant__Group__2__Impl : ( 'variant' ) ;
    public final void rule__XVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3980:1: ( ( 'variant' ) )
            // InternalXMachine.g:3981:1: ( 'variant' )
            {
            // InternalXMachine.g:3981:1: ( 'variant' )
            // InternalXMachine.g:3982:2: 'variant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantKeyword_2()); 
            }
            match(input,145,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3991:1: rule__XVariant__Group__3 : rule__XVariant__Group__3__Impl rule__XVariant__Group__4 ;
    public final void rule__XVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3995:1: ( rule__XVariant__Group__3__Impl rule__XVariant__Group__4 )
            // InternalXMachine.g:3996:2: rule__XVariant__Group__3__Impl rule__XVariant__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:4003:1: rule__XVariant__Group__3__Impl : ( ( rule__XVariant__NameAssignment_3 ) ) ;
    public final void rule__XVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4007:1: ( ( ( rule__XVariant__NameAssignment_3 ) ) )
            // InternalXMachine.g:4008:1: ( ( rule__XVariant__NameAssignment_3 ) )
            {
            // InternalXMachine.g:4008:1: ( ( rule__XVariant__NameAssignment_3 ) )
            // InternalXMachine.g:4009:2: ( rule__XVariant__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:4010:2: ( rule__XVariant__NameAssignment_3 )
            // InternalXMachine.g:4010:3: rule__XVariant__NameAssignment_3
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
    // InternalXMachine.g:4018:1: rule__XVariant__Group__4 : rule__XVariant__Group__4__Impl ;
    public final void rule__XVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4022:1: ( rule__XVariant__Group__4__Impl )
            // InternalXMachine.g:4023:2: rule__XVariant__Group__4__Impl
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
    // InternalXMachine.g:4029:1: rule__XVariant__Group__4__Impl : ( ( rule__XVariant__ExpressionAssignment_4 ) ) ;
    public final void rule__XVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4033:1: ( ( ( rule__XVariant__ExpressionAssignment_4 ) ) )
            // InternalXMachine.g:4034:1: ( ( rule__XVariant__ExpressionAssignment_4 ) )
            {
            // InternalXMachine.g:4034:1: ( ( rule__XVariant__ExpressionAssignment_4 ) )
            // InternalXMachine.g:4035:2: ( rule__XVariant__ExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionAssignment_4()); 
            }
            // InternalXMachine.g:4036:2: ( rule__XVariant__ExpressionAssignment_4 )
            // InternalXMachine.g:4036:3: rule__XVariant__ExpressionAssignment_4
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
    // InternalXMachine.g:4045:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4049:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:4050:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalXMachine.g:4057:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4061:1: ( ( () ) )
            // InternalXMachine.g:4062:1: ( () )
            {
            // InternalXMachine.g:4062:1: ( () )
            // InternalXMachine.g:4063:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventAction_0()); 
            }
            // InternalXMachine.g:4064:2: ()
            // InternalXMachine.g:4064:3: 
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
    // InternalXMachine.g:4072:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4076:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:4077:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalXMachine.g:4084:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__CommentAssignment_1 )? ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4088:1: ( ( ( rule__XEvent__CommentAssignment_1 )? ) )
            // InternalXMachine.g:4089:1: ( ( rule__XEvent__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:4089:1: ( ( rule__XEvent__CommentAssignment_1 )? )
            // InternalXMachine.g:4090:2: ( rule__XEvent__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:4091:2: ( rule__XEvent__CommentAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:4091:3: rule__XEvent__CommentAssignment_1
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
    // InternalXMachine.g:4099:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4103:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:4104:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalXMachine.g:4111:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__ConvergenceAssignment_2 )? ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4115:1: ( ( ( rule__XEvent__ConvergenceAssignment_2 )? ) )
            // InternalXMachine.g:4116:1: ( ( rule__XEvent__ConvergenceAssignment_2 )? )
            {
            // InternalXMachine.g:4116:1: ( ( rule__XEvent__ConvergenceAssignment_2 )? )
            // InternalXMachine.g:4117:2: ( rule__XEvent__ConvergenceAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getConvergenceAssignment_2()); 
            }
            // InternalXMachine.g:4118:2: ( rule__XEvent__ConvergenceAssignment_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=132 && LA46_0<=134)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:4118:3: rule__XEvent__ConvergenceAssignment_2
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
    // InternalXMachine.g:4126:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4130:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:4131:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
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
    // InternalXMachine.g:4138:1: rule__XEvent__Group__3__Impl : ( 'event' ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4142:1: ( ( 'event' ) )
            // InternalXMachine.g:4143:1: ( 'event' )
            {
            // InternalXMachine.g:4143:1: ( 'event' )
            // InternalXMachine.g:4144:2: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventKeyword_3()); 
            }
            match(input,146,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4153:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4157:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:4158:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
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
    // InternalXMachine.g:4165:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__NameAssignment_4 ) ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4169:1: ( ( ( rule__XEvent__NameAssignment_4 ) ) )
            // InternalXMachine.g:4170:1: ( ( rule__XEvent__NameAssignment_4 ) )
            {
            // InternalXMachine.g:4170:1: ( ( rule__XEvent__NameAssignment_4 ) )
            // InternalXMachine.g:4171:2: ( rule__XEvent__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameAssignment_4()); 
            }
            // InternalXMachine.g:4172:2: ( rule__XEvent__NameAssignment_4 )
            // InternalXMachine.g:4172:3: rule__XEvent__NameAssignment_4
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
    // InternalXMachine.g:4180:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4184:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:4185:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
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
    // InternalXMachine.g:4192:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Alternatives_5 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4196:1: ( ( ( rule__XEvent__Alternatives_5 )? ) )
            // InternalXMachine.g:4197:1: ( ( rule__XEvent__Alternatives_5 )? )
            {
            // InternalXMachine.g:4197:1: ( ( rule__XEvent__Alternatives_5 )? )
            // InternalXMachine.g:4198:2: ( rule__XEvent__Alternatives_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_5()); 
            }
            // InternalXMachine.g:4199:2: ( rule__XEvent__Alternatives_5 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==139||LA47_0==155) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:4199:3: rule__XEvent__Alternatives_5
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
    // InternalXMachine.g:4207:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl rule__XEvent__Group__7 ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4211:1: ( rule__XEvent__Group__6__Impl rule__XEvent__Group__7 )
            // InternalXMachine.g:4212:2: rule__XEvent__Group__6__Impl rule__XEvent__Group__7
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
    // InternalXMachine.g:4219:1: rule__XEvent__Group__6__Impl : ( ( rule__XEvent__Group_6__0 )? ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4223:1: ( ( ( rule__XEvent__Group_6__0 )? ) )
            // InternalXMachine.g:4224:1: ( ( rule__XEvent__Group_6__0 )? )
            {
            // InternalXMachine.g:4224:1: ( ( rule__XEvent__Group_6__0 )? )
            // InternalXMachine.g:4225:2: ( rule__XEvent__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6()); 
            }
            // InternalXMachine.g:4226:2: ( rule__XEvent__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==148) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:4226:3: rule__XEvent__Group_6__0
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
    // InternalXMachine.g:4234:1: rule__XEvent__Group__7 : rule__XEvent__Group__7__Impl rule__XEvent__Group__8 ;
    public final void rule__XEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4238:1: ( rule__XEvent__Group__7__Impl rule__XEvent__Group__8 )
            // InternalXMachine.g:4239:2: rule__XEvent__Group__7__Impl rule__XEvent__Group__8
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
    // InternalXMachine.g:4246:1: rule__XEvent__Group__7__Impl : ( ( rule__XEvent__OrderedChildrenAssignment_7 )* ) ;
    public final void rule__XEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4250:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_7 )* ) )
            // InternalXMachine.g:4251:1: ( ( rule__XEvent__OrderedChildrenAssignment_7 )* )
            {
            // InternalXMachine.g:4251:1: ( ( rule__XEvent__OrderedChildrenAssignment_7 )* )
            // InternalXMachine.g:4252:2: ( rule__XEvent__OrderedChildrenAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_7()); 
            }
            // InternalXMachine.g:4253:2: ( rule__XEvent__OrderedChildrenAssignment_7 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==150) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalXMachine.g:4253:3: rule__XEvent__OrderedChildrenAssignment_7
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__XEvent__OrderedChildrenAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalXMachine.g:4261:1: rule__XEvent__Group__8 : rule__XEvent__Group__8__Impl rule__XEvent__Group__9 ;
    public final void rule__XEvent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4265:1: ( rule__XEvent__Group__8__Impl rule__XEvent__Group__9 )
            // InternalXMachine.g:4266:2: rule__XEvent__Group__8__Impl rule__XEvent__Group__9
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
    // InternalXMachine.g:4273:1: rule__XEvent__Group__8__Impl : ( ( rule__XEvent__Group_8__0 )? ) ;
    public final void rule__XEvent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4277:1: ( ( ( rule__XEvent__Group_8__0 )? ) )
            // InternalXMachine.g:4278:1: ( ( rule__XEvent__Group_8__0 )? )
            {
            // InternalXMachine.g:4278:1: ( ( rule__XEvent__Group_8__0 )? )
            // InternalXMachine.g:4279:2: ( rule__XEvent__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_8()); 
            }
            // InternalXMachine.g:4280:2: ( rule__XEvent__Group_8__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=36 && LA50_0<=37)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXMachine.g:4280:3: rule__XEvent__Group_8__0
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
    // InternalXMachine.g:4288:1: rule__XEvent__Group__9 : rule__XEvent__Group__9__Impl rule__XEvent__Group__10 ;
    public final void rule__XEvent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4292:1: ( rule__XEvent__Group__9__Impl rule__XEvent__Group__10 )
            // InternalXMachine.g:4293:2: rule__XEvent__Group__9__Impl rule__XEvent__Group__10
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
    // InternalXMachine.g:4300:1: rule__XEvent__Group__9__Impl : ( ( rule__XEvent__Group_9__0 )? ) ;
    public final void rule__XEvent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4304:1: ( ( ( rule__XEvent__Group_9__0 )? ) )
            // InternalXMachine.g:4305:1: ( ( rule__XEvent__Group_9__0 )? )
            {
            // InternalXMachine.g:4305:1: ( ( rule__XEvent__Group_9__0 )? )
            // InternalXMachine.g:4306:2: ( rule__XEvent__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_9()); 
            }
            // InternalXMachine.g:4307:2: ( rule__XEvent__Group_9__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=38 && LA51_0<=39)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXMachine.g:4307:3: rule__XEvent__Group_9__0
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
    // InternalXMachine.g:4315:1: rule__XEvent__Group__10 : rule__XEvent__Group__10__Impl rule__XEvent__Group__11 ;
    public final void rule__XEvent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4319:1: ( rule__XEvent__Group__10__Impl rule__XEvent__Group__11 )
            // InternalXMachine.g:4320:2: rule__XEvent__Group__10__Impl rule__XEvent__Group__11
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
    // InternalXMachine.g:4327:1: rule__XEvent__Group__10__Impl : ( ( rule__XEvent__Group_10__0 )? ) ;
    public final void rule__XEvent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4331:1: ( ( ( rule__XEvent__Group_10__0 )? ) )
            // InternalXMachine.g:4332:1: ( ( rule__XEvent__Group_10__0 )? )
            {
            // InternalXMachine.g:4332:1: ( ( rule__XEvent__Group_10__0 )? )
            // InternalXMachine.g:4333:2: ( rule__XEvent__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_10()); 
            }
            // InternalXMachine.g:4334:2: ( rule__XEvent__Group_10__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==149) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXMachine.g:4334:3: rule__XEvent__Group_10__0
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
    // InternalXMachine.g:4342:1: rule__XEvent__Group__11 : rule__XEvent__Group__11__Impl ;
    public final void rule__XEvent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4346:1: ( rule__XEvent__Group__11__Impl )
            // InternalXMachine.g:4347:2: rule__XEvent__Group__11__Impl
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
    // InternalXMachine.g:4353:1: rule__XEvent__Group__11__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4357:1: ( ( 'end' ) )
            // InternalXMachine.g:4358:1: ( 'end' )
            {
            // InternalXMachine.g:4358:1: ( 'end' )
            // InternalXMachine.g:4359:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEndKeyword_11()); 
            }
            match(input,147,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4369:1: rule__XEvent__Group_5_0__0 : rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 ;
    public final void rule__XEvent__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4373:1: ( rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 )
            // InternalXMachine.g:4374:2: rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1
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
    // InternalXMachine.g:4381:1: rule__XEvent__Group_5_0__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4385:1: ( ( 'refines' ) )
            // InternalXMachine.g:4386:1: ( 'refines' )
            {
            // InternalXMachine.g:4386:1: ( 'refines' )
            // InternalXMachine.g:4387:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesKeyword_5_0_0()); 
            }
            match(input,139,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4396:1: rule__XEvent__Group_5_0__1 : rule__XEvent__Group_5_0__1__Impl ;
    public final void rule__XEvent__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4400:1: ( rule__XEvent__Group_5_0__1__Impl )
            // InternalXMachine.g:4401:2: rule__XEvent__Group_5_0__1__Impl
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
    // InternalXMachine.g:4407:1: rule__XEvent__Group_5_0__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) ) ;
    public final void rule__XEvent__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4411:1: ( ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) ) )
            // InternalXMachine.g:4412:1: ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) )
            {
            // InternalXMachine.g:4412:1: ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) )
            // InternalXMachine.g:4413:2: ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* )
            {
            // InternalXMachine.g:4413:2: ( ( rule__XEvent__RefinesAssignment_5_0_1 ) )
            // InternalXMachine.g:4414:3: ( rule__XEvent__RefinesAssignment_5_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_0_1()); 
            }
            // InternalXMachine.g:4415:3: ( rule__XEvent__RefinesAssignment_5_0_1 )
            // InternalXMachine.g:4415:4: rule__XEvent__RefinesAssignment_5_0_1
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

            // InternalXMachine.g:4418:2: ( ( rule__XEvent__RefinesAssignment_5_0_1 )* )
            // InternalXMachine.g:4419:3: ( rule__XEvent__RefinesAssignment_5_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_0_1()); 
            }
            // InternalXMachine.g:4420:3: ( rule__XEvent__RefinesAssignment_5_0_1 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalXMachine.g:4420:4: rule__XEvent__RefinesAssignment_5_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__RefinesAssignment_5_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalXMachine.g:4430:1: rule__XEvent__Group_5_1__0 : rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 ;
    public final void rule__XEvent__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4434:1: ( rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 )
            // InternalXMachine.g:4435:2: rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1
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
    // InternalXMachine.g:4442:1: rule__XEvent__Group_5_1__0__Impl : ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) ) ;
    public final void rule__XEvent__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4446:1: ( ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) ) )
            // InternalXMachine.g:4447:1: ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) )
            {
            // InternalXMachine.g:4447:1: ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) )
            // InternalXMachine.g:4448:2: ( rule__XEvent__ExtendedAssignment_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedAssignment_5_1_0()); 
            }
            // InternalXMachine.g:4449:2: ( rule__XEvent__ExtendedAssignment_5_1_0 )
            // InternalXMachine.g:4449:3: rule__XEvent__ExtendedAssignment_5_1_0
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
    // InternalXMachine.g:4457:1: rule__XEvent__Group_5_1__1 : rule__XEvent__Group_5_1__1__Impl ;
    public final void rule__XEvent__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4461:1: ( rule__XEvent__Group_5_1__1__Impl )
            // InternalXMachine.g:4462:2: rule__XEvent__Group_5_1__1__Impl
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
    // InternalXMachine.g:4468:1: rule__XEvent__Group_5_1__1__Impl : ( ( rule__XEvent__RefinesAssignment_5_1_1 ) ) ;
    public final void rule__XEvent__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4472:1: ( ( ( rule__XEvent__RefinesAssignment_5_1_1 ) ) )
            // InternalXMachine.g:4473:1: ( ( rule__XEvent__RefinesAssignment_5_1_1 ) )
            {
            // InternalXMachine.g:4473:1: ( ( rule__XEvent__RefinesAssignment_5_1_1 ) )
            // InternalXMachine.g:4474:2: ( rule__XEvent__RefinesAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1_1()); 
            }
            // InternalXMachine.g:4475:2: ( rule__XEvent__RefinesAssignment_5_1_1 )
            // InternalXMachine.g:4475:3: rule__XEvent__RefinesAssignment_5_1_1
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
    // InternalXMachine.g:4484:1: rule__XEvent__Group_6__0 : rule__XEvent__Group_6__0__Impl rule__XEvent__Group_6__1 ;
    public final void rule__XEvent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4488:1: ( rule__XEvent__Group_6__0__Impl rule__XEvent__Group_6__1 )
            // InternalXMachine.g:4489:2: rule__XEvent__Group_6__0__Impl rule__XEvent__Group_6__1
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
    // InternalXMachine.g:4496:1: rule__XEvent__Group_6__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4500:1: ( ( 'any' ) )
            // InternalXMachine.g:4501:1: ( 'any' )
            {
            // InternalXMachine.g:4501:1: ( 'any' )
            // InternalXMachine.g:4502:2: 'any'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAnyKeyword_6_0()); 
            }
            match(input,148,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4511:1: rule__XEvent__Group_6__1 : rule__XEvent__Group_6__1__Impl ;
    public final void rule__XEvent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4515:1: ( rule__XEvent__Group_6__1__Impl )
            // InternalXMachine.g:4516:2: rule__XEvent__Group_6__1__Impl
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
    // InternalXMachine.g:4522:1: rule__XEvent__Group_6__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) ) ;
    public final void rule__XEvent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4526:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) ) )
            // InternalXMachine.g:4527:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:4527:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) )
            // InternalXMachine.g:4528:2: ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* )
            {
            // InternalXMachine.g:4528:2: ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) )
            // InternalXMachine.g:4529:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_6_1()); 
            }
            // InternalXMachine.g:4530:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )
            // InternalXMachine.g:4530:4: rule__XEvent__OrderedChildrenAssignment_6_1
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

            // InternalXMachine.g:4533:2: ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* )
            // InternalXMachine.g:4534:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_6_1()); 
            }
            // InternalXMachine.g:4535:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID||LA54_0==RULE_STRING) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalXMachine.g:4535:4: rule__XEvent__OrderedChildrenAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__XEvent__OrderedChildrenAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalXMachine.g:4545:1: rule__XEvent__Group_8__0 : rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 ;
    public final void rule__XEvent__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4549:1: ( rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 )
            // InternalXMachine.g:4550:2: rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1
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
    // InternalXMachine.g:4557:1: rule__XEvent__Group_8__0__Impl : ( ( rule__XEvent__Alternatives_8_0 ) ) ;
    public final void rule__XEvent__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4561:1: ( ( ( rule__XEvent__Alternatives_8_0 ) ) )
            // InternalXMachine.g:4562:1: ( ( rule__XEvent__Alternatives_8_0 ) )
            {
            // InternalXMachine.g:4562:1: ( ( rule__XEvent__Alternatives_8_0 ) )
            // InternalXMachine.g:4563:2: ( rule__XEvent__Alternatives_8_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_8_0()); 
            }
            // InternalXMachine.g:4564:2: ( rule__XEvent__Alternatives_8_0 )
            // InternalXMachine.g:4564:3: rule__XEvent__Alternatives_8_0
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
    // InternalXMachine.g:4572:1: rule__XEvent__Group_8__1 : rule__XEvent__Group_8__1__Impl ;
    public final void rule__XEvent__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4576:1: ( rule__XEvent__Group_8__1__Impl )
            // InternalXMachine.g:4577:2: rule__XEvent__Group_8__1__Impl
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
    // InternalXMachine.g:4583:1: rule__XEvent__Group_8__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) ) ;
    public final void rule__XEvent__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4587:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) ) )
            // InternalXMachine.g:4588:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:4588:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) )
            // InternalXMachine.g:4589:2: ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* )
            {
            // InternalXMachine.g:4589:2: ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) )
            // InternalXMachine.g:4590:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_8_1()); 
            }
            // InternalXMachine.g:4591:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )
            // InternalXMachine.g:4591:4: rule__XEvent__OrderedChildrenAssignment_8_1
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

            // InternalXMachine.g:4594:2: ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* )
            // InternalXMachine.g:4595:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_8_1()); 
            }
            // InternalXMachine.g:4596:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_XLABEL)||LA55_0==154) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalXMachine.g:4596:4: rule__XEvent__OrderedChildrenAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__XEvent__OrderedChildrenAssignment_8_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalXMachine.g:4606:1: rule__XEvent__Group_9__0 : rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 ;
    public final void rule__XEvent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4610:1: ( rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 )
            // InternalXMachine.g:4611:2: rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1
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
    // InternalXMachine.g:4618:1: rule__XEvent__Group_9__0__Impl : ( ( rule__XEvent__Alternatives_9_0 ) ) ;
    public final void rule__XEvent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4622:1: ( ( ( rule__XEvent__Alternatives_9_0 ) ) )
            // InternalXMachine.g:4623:1: ( ( rule__XEvent__Alternatives_9_0 ) )
            {
            // InternalXMachine.g:4623:1: ( ( rule__XEvent__Alternatives_9_0 ) )
            // InternalXMachine.g:4624:2: ( rule__XEvent__Alternatives_9_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_9_0()); 
            }
            // InternalXMachine.g:4625:2: ( rule__XEvent__Alternatives_9_0 )
            // InternalXMachine.g:4625:3: rule__XEvent__Alternatives_9_0
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
    // InternalXMachine.g:4633:1: rule__XEvent__Group_9__1 : rule__XEvent__Group_9__1__Impl ;
    public final void rule__XEvent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4637:1: ( rule__XEvent__Group_9__1__Impl )
            // InternalXMachine.g:4638:2: rule__XEvent__Group_9__1__Impl
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
    // InternalXMachine.g:4644:1: rule__XEvent__Group_9__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) ) ;
    public final void rule__XEvent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4648:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) ) )
            // InternalXMachine.g:4649:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) )
            {
            // InternalXMachine.g:4649:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) )
            // InternalXMachine.g:4650:2: ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* )
            {
            // InternalXMachine.g:4650:2: ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) )
            // InternalXMachine.g:4651:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_9_1()); 
            }
            // InternalXMachine.g:4652:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )
            // InternalXMachine.g:4652:4: rule__XEvent__OrderedChildrenAssignment_9_1
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

            // InternalXMachine.g:4655:2: ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* )
            // InternalXMachine.g:4656:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_9_1()); 
            }
            // InternalXMachine.g:4657:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_XLABEL)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalXMachine.g:4657:4: rule__XEvent__OrderedChildrenAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XEvent__OrderedChildrenAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalXMachine.g:4667:1: rule__XEvent__Group_10__0 : rule__XEvent__Group_10__0__Impl rule__XEvent__Group_10__1 ;
    public final void rule__XEvent__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4671:1: ( rule__XEvent__Group_10__0__Impl rule__XEvent__Group_10__1 )
            // InternalXMachine.g:4672:2: rule__XEvent__Group_10__0__Impl rule__XEvent__Group_10__1
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
    // InternalXMachine.g:4679:1: rule__XEvent__Group_10__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4683:1: ( ( 'with' ) )
            // InternalXMachine.g:4684:1: ( 'with' )
            {
            // InternalXMachine.g:4684:1: ( 'with' )
            // InternalXMachine.g:4685:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWithKeyword_10_0()); 
            }
            match(input,149,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4694:1: rule__XEvent__Group_10__1 : rule__XEvent__Group_10__1__Impl ;
    public final void rule__XEvent__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4698:1: ( rule__XEvent__Group_10__1__Impl )
            // InternalXMachine.g:4699:2: rule__XEvent__Group_10__1__Impl
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
    // InternalXMachine.g:4705:1: rule__XEvent__Group_10__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) ) ;
    public final void rule__XEvent__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4709:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) ) )
            // InternalXMachine.g:4710:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) )
            {
            // InternalXMachine.g:4710:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) )
            // InternalXMachine.g:4711:2: ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* )
            {
            // InternalXMachine.g:4711:2: ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) )
            // InternalXMachine.g:4712:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_10_1()); 
            }
            // InternalXMachine.g:4713:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )
            // InternalXMachine.g:4713:4: rule__XEvent__OrderedChildrenAssignment_10_1
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

            // InternalXMachine.g:4716:2: ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* )
            // InternalXMachine.g:4717:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_10_1()); 
            }
            // InternalXMachine.g:4718:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_XLABEL)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalXMachine.g:4718:4: rule__XEvent__OrderedChildrenAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XEvent__OrderedChildrenAssignment_10_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalXMachine.g:4728:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4732:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:4733:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
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
    // InternalXMachine.g:4740:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4744:1: ( ( () ) )
            // InternalXMachine.g:4745:1: ( () )
            {
            // InternalXMachine.g:4745:1: ( () )
            // InternalXMachine.g:4746:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:4747:2: ()
            // InternalXMachine.g:4747:3: 
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
    // InternalXMachine.g:4755:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4759:1: ( rule__EventSync__Group__1__Impl )
            // InternalXMachine.g:4760:2: rule__EventSync__Group__1__Impl
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
    // InternalXMachine.g:4766:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4770:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:4771:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:4771:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:4772:2: ( rule__EventSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:4773:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:4773:3: rule__EventSync__Group_1__0
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
    // InternalXMachine.g:4782:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4786:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:4787:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
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
    // InternalXMachine.g:4794:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4798:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:4799:1: ( 'synchronises' )
            {
            // InternalXMachine.g:4799:1: ( 'synchronises' )
            // InternalXMachine.g:4800:2: 'synchronises'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            }
            match(input,150,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4809:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4813:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:4814:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
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
    // InternalXMachine.g:4821:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4825:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:4826:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:4826:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:4827:2: ( rule__EventSync__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            }
            // InternalXMachine.g:4828:2: ( rule__EventSync__Group_1_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==75) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // InternalXMachine.g:4828:3: rule__EventSync__Group_1_1__0
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
    // InternalXMachine.g:4836:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4840:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:4841:2: rule__EventSync__Group_1__2__Impl
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
    // InternalXMachine.g:4847:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4851:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:4852:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:4852:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:4853:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            }
            // InternalXMachine.g:4854:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:4854:3: rule__EventSync__SynchronisedEventAssignment_1_2
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
    // InternalXMachine.g:4863:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4867:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:4868:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalXMachine.g:4875:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4879:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:4880:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:4880:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:4881:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            }
            // InternalXMachine.g:4882:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:4882:3: rule__EventSync__PrefixAssignment_1_1_0
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
    // InternalXMachine.g:4890:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4894:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:4895:2: rule__EventSync__Group_1_1__1__Impl
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
    // InternalXMachine.g:4901:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4905:1: ( ( '.' ) )
            // InternalXMachine.g:4906:1: ( '.' )
            {
            // InternalXMachine.g:4906:1: ( '.' )
            // InternalXMachine.g:4907:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4917:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4921:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:4922:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
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
    // InternalXMachine.g:4929:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4933:1: ( ( () ) )
            // InternalXMachine.g:4934:1: ( () )
            {
            // InternalXMachine.g:4934:1: ( () )
            // InternalXMachine.g:4935:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            }
            // InternalXMachine.g:4936:2: ()
            // InternalXMachine.g:4936:3: 
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
    // InternalXMachine.g:4944:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl rule__XParameter__Group__2 ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4948:1: ( rule__XParameter__Group__1__Impl rule__XParameter__Group__2 )
            // InternalXMachine.g:4949:2: rule__XParameter__Group__1__Impl rule__XParameter__Group__2
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
    // InternalXMachine.g:4956:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__CommentAssignment_1 )? ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4960:1: ( ( ( rule__XParameter__CommentAssignment_1 )? ) )
            // InternalXMachine.g:4961:1: ( ( rule__XParameter__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:4961:1: ( ( rule__XParameter__CommentAssignment_1 )? )
            // InternalXMachine.g:4962:2: ( rule__XParameter__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:4963:2: ( rule__XParameter__CommentAssignment_1 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalXMachine.g:4963:3: rule__XParameter__CommentAssignment_1
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
    // InternalXMachine.g:4971:1: rule__XParameter__Group__2 : rule__XParameter__Group__2__Impl ;
    public final void rule__XParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4975:1: ( rule__XParameter__Group__2__Impl )
            // InternalXMachine.g:4976:2: rule__XParameter__Group__2__Impl
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
    // InternalXMachine.g:4982:1: rule__XParameter__Group__2__Impl : ( ( rule__XParameter__NameAssignment_2 ) ) ;
    public final void rule__XParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4986:1: ( ( ( rule__XParameter__NameAssignment_2 ) ) )
            // InternalXMachine.g:4987:1: ( ( rule__XParameter__NameAssignment_2 ) )
            {
            // InternalXMachine.g:4987:1: ( ( rule__XParameter__NameAssignment_2 ) )
            // InternalXMachine.g:4988:2: ( rule__XParameter__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:4989:2: ( rule__XParameter__NameAssignment_2 )
            // InternalXMachine.g:4989:3: rule__XParameter__NameAssignment_2
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
    // InternalXMachine.g:4998:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5002:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:5003:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
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
    // InternalXMachine.g:5010:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5014:1: ( ( () ) )
            // InternalXMachine.g:5015:1: ( () )
            {
            // InternalXMachine.g:5015:1: ( () )
            // InternalXMachine.g:5016:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            }
            // InternalXMachine.g:5017:2: ()
            // InternalXMachine.g:5017:3: 
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
    // InternalXMachine.g:5025:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5029:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:5030:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
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
    // InternalXMachine.g:5037:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__CommentAssignment_1 )? ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5041:1: ( ( ( rule__XGuard__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5042:1: ( ( rule__XGuard__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5042:1: ( ( rule__XGuard__CommentAssignment_1 )? )
            // InternalXMachine.g:5043:2: ( rule__XGuard__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5044:2: ( rule__XGuard__CommentAssignment_1 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalXMachine.g:5044:3: rule__XGuard__CommentAssignment_1
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
    // InternalXMachine.g:5052:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5056:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:5057:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
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
    // InternalXMachine.g:5064:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__TheoremAssignment_2 )? ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5068:1: ( ( ( rule__XGuard__TheoremAssignment_2 )? ) )
            // InternalXMachine.g:5069:1: ( ( rule__XGuard__TheoremAssignment_2 )? )
            {
            // InternalXMachine.g:5069:1: ( ( rule__XGuard__TheoremAssignment_2 )? )
            // InternalXMachine.g:5070:2: ( rule__XGuard__TheoremAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremAssignment_2()); 
            }
            // InternalXMachine.g:5071:2: ( rule__XGuard__TheoremAssignment_2 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==154) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalXMachine.g:5071:3: rule__XGuard__TheoremAssignment_2
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
    // InternalXMachine.g:5079:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl rule__XGuard__Group__4 ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5083:1: ( rule__XGuard__Group__3__Impl rule__XGuard__Group__4 )
            // InternalXMachine.g:5084:2: rule__XGuard__Group__3__Impl rule__XGuard__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:5091:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__NameAssignment_3 ) ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5095:1: ( ( ( rule__XGuard__NameAssignment_3 ) ) )
            // InternalXMachine.g:5096:1: ( ( rule__XGuard__NameAssignment_3 ) )
            {
            // InternalXMachine.g:5096:1: ( ( rule__XGuard__NameAssignment_3 ) )
            // InternalXMachine.g:5097:2: ( rule__XGuard__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:5098:2: ( rule__XGuard__NameAssignment_3 )
            // InternalXMachine.g:5098:3: rule__XGuard__NameAssignment_3
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
    // InternalXMachine.g:5106:1: rule__XGuard__Group__4 : rule__XGuard__Group__4__Impl ;
    public final void rule__XGuard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5110:1: ( rule__XGuard__Group__4__Impl )
            // InternalXMachine.g:5111:2: rule__XGuard__Group__4__Impl
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
    // InternalXMachine.g:5117:1: rule__XGuard__Group__4__Impl : ( ( rule__XGuard__PredicateAssignment_4 ) ) ;
    public final void rule__XGuard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5121:1: ( ( ( rule__XGuard__PredicateAssignment_4 ) ) )
            // InternalXMachine.g:5122:1: ( ( rule__XGuard__PredicateAssignment_4 ) )
            {
            // InternalXMachine.g:5122:1: ( ( rule__XGuard__PredicateAssignment_4 ) )
            // InternalXMachine.g:5123:2: ( rule__XGuard__PredicateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateAssignment_4()); 
            }
            // InternalXMachine.g:5124:2: ( rule__XGuard__PredicateAssignment_4 )
            // InternalXMachine.g:5124:3: rule__XGuard__PredicateAssignment_4
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
    // InternalXMachine.g:5133:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5137:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:5138:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
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
    // InternalXMachine.g:5145:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5149:1: ( ( () ) )
            // InternalXMachine.g:5150:1: ( () )
            {
            // InternalXMachine.g:5150:1: ( () )
            // InternalXMachine.g:5151:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            }
            // InternalXMachine.g:5152:2: ()
            // InternalXMachine.g:5152:3: 
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
    // InternalXMachine.g:5160:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5164:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:5165:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
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
    // InternalXMachine.g:5172:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__CommentAssignment_1 )? ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5176:1: ( ( ( rule__XWitness__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5177:1: ( ( rule__XWitness__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5177:1: ( ( rule__XWitness__CommentAssignment_1 )? )
            // InternalXMachine.g:5178:2: ( rule__XWitness__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5179:2: ( rule__XWitness__CommentAssignment_1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_STRING) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXMachine.g:5179:3: rule__XWitness__CommentAssignment_1
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
    // InternalXMachine.g:5187:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl rule__XWitness__Group__3 ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5191:1: ( rule__XWitness__Group__2__Impl rule__XWitness__Group__3 )
            // InternalXMachine.g:5192:2: rule__XWitness__Group__2__Impl rule__XWitness__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:5199:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__NameAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5203:1: ( ( ( rule__XWitness__NameAssignment_2 ) ) )
            // InternalXMachine.g:5204:1: ( ( rule__XWitness__NameAssignment_2 ) )
            {
            // InternalXMachine.g:5204:1: ( ( rule__XWitness__NameAssignment_2 ) )
            // InternalXMachine.g:5205:2: ( rule__XWitness__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:5206:2: ( rule__XWitness__NameAssignment_2 )
            // InternalXMachine.g:5206:3: rule__XWitness__NameAssignment_2
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
    // InternalXMachine.g:5214:1: rule__XWitness__Group__3 : rule__XWitness__Group__3__Impl ;
    public final void rule__XWitness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5218:1: ( rule__XWitness__Group__3__Impl )
            // InternalXMachine.g:5219:2: rule__XWitness__Group__3__Impl
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
    // InternalXMachine.g:5225:1: rule__XWitness__Group__3__Impl : ( ( rule__XWitness__PredicateAssignment_3 ) ) ;
    public final void rule__XWitness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5229:1: ( ( ( rule__XWitness__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:5230:1: ( ( rule__XWitness__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:5230:1: ( ( rule__XWitness__PredicateAssignment_3 ) )
            // InternalXMachine.g:5231:2: ( rule__XWitness__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:5232:2: ( rule__XWitness__PredicateAssignment_3 )
            // InternalXMachine.g:5232:3: rule__XWitness__PredicateAssignment_3
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
    // InternalXMachine.g:5241:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5245:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:5246:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
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
    // InternalXMachine.g:5253:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5257:1: ( ( () ) )
            // InternalXMachine.g:5258:1: ( () )
            {
            // InternalXMachine.g:5258:1: ( () )
            // InternalXMachine.g:5259:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAction_0()); 
            }
            // InternalXMachine.g:5260:2: ()
            // InternalXMachine.g:5260:3: 
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
    // InternalXMachine.g:5268:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5272:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:5273:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
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
    // InternalXMachine.g:5280:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__CommentAssignment_1 )? ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5284:1: ( ( ( rule__XAction__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5285:1: ( ( rule__XAction__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5285:1: ( ( rule__XAction__CommentAssignment_1 )? )
            // InternalXMachine.g:5286:2: ( rule__XAction__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5287:2: ( rule__XAction__CommentAssignment_1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXMachine.g:5287:3: rule__XAction__CommentAssignment_1
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
    // InternalXMachine.g:5295:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl rule__XAction__Group__3 ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5299:1: ( rule__XAction__Group__2__Impl rule__XAction__Group__3 )
            // InternalXMachine.g:5300:2: rule__XAction__Group__2__Impl rule__XAction__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:5307:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__NameAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5311:1: ( ( ( rule__XAction__NameAssignment_2 ) ) )
            // InternalXMachine.g:5312:1: ( ( rule__XAction__NameAssignment_2 ) )
            {
            // InternalXMachine.g:5312:1: ( ( rule__XAction__NameAssignment_2 ) )
            // InternalXMachine.g:5313:2: ( rule__XAction__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:5314:2: ( rule__XAction__NameAssignment_2 )
            // InternalXMachine.g:5314:3: rule__XAction__NameAssignment_2
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
    // InternalXMachine.g:5322:1: rule__XAction__Group__3 : rule__XAction__Group__3__Impl ;
    public final void rule__XAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5326:1: ( rule__XAction__Group__3__Impl )
            // InternalXMachine.g:5327:2: rule__XAction__Group__3__Impl
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
    // InternalXMachine.g:5333:1: rule__XAction__Group__3__Impl : ( ( rule__XAction__ActionAssignment_3 ) ) ;
    public final void rule__XAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5337:1: ( ( ( rule__XAction__ActionAssignment_3 ) ) )
            // InternalXMachine.g:5338:1: ( ( rule__XAction__ActionAssignment_3 ) )
            {
            // InternalXMachine.g:5338:1: ( ( rule__XAction__ActionAssignment_3 ) )
            // InternalXMachine.g:5339:2: ( rule__XAction__ActionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAssignment_3()); 
            }
            // InternalXMachine.g:5340:2: ( rule__XAction__ActionAssignment_3 )
            // InternalXMachine.g:5340:3: rule__XAction__ActionAssignment_3
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


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0"
    // InternalXMachine.g:5349:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5353:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalXMachine.g:5354:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FOLLOW_34);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1();

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
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl"
    // InternalXMachine.g:5361:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5365:1: ( ( '%' ) )
            // InternalXMachine.g:5366:1: ( '%' )
            {
            // InternalXMachine.g:5366:1: ( '%' )
            // InternalXMachine.g:5367:2: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            }
            match(input,151,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
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
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1"
    // InternalXMachine.g:5376:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5380:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalXMachine.g:5381:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl();

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
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl"
    // InternalXMachine.g:5387:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5391:1: ( ( '\\u22C2' ) )
            // InternalXMachine.g:5392:1: ( '\\u22C2' )
            {
            // InternalXMachine.g:5392:1: ( '\\u22C2' )
            // InternalXMachine.g:5393:2: '\\u22C2'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            }
            match(input,152,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
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
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl"


    // $ANTLR start "rule__XRecord__Group__0"
    // InternalXMachine.g:5403:1: rule__XRecord__Group__0 : rule__XRecord__Group__0__Impl rule__XRecord__Group__1 ;
    public final void rule__XRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5407:1: ( rule__XRecord__Group__0__Impl rule__XRecord__Group__1 )
            // InternalXMachine.g:5408:2: rule__XRecord__Group__0__Impl rule__XRecord__Group__1
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
    // InternalXMachine.g:5415:1: rule__XRecord__Group__0__Impl : ( () ) ;
    public final void rule__XRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5419:1: ( ( () ) )
            // InternalXMachine.g:5420:1: ( () )
            {
            // InternalXMachine.g:5420:1: ( () )
            // InternalXMachine.g:5421:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getRecordAction_0()); 
            }
            // InternalXMachine.g:5422:2: ()
            // InternalXMachine.g:5422:3: 
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
    // InternalXMachine.g:5430:1: rule__XRecord__Group__1 : rule__XRecord__Group__1__Impl rule__XRecord__Group__2 ;
    public final void rule__XRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5434:1: ( rule__XRecord__Group__1__Impl rule__XRecord__Group__2 )
            // InternalXMachine.g:5435:2: rule__XRecord__Group__1__Impl rule__XRecord__Group__2
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
    // InternalXMachine.g:5442:1: rule__XRecord__Group__1__Impl : ( ( rule__XRecord__CommentAssignment_1 )? ) ;
    public final void rule__XRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5446:1: ( ( ( rule__XRecord__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5447:1: ( ( rule__XRecord__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5447:1: ( ( rule__XRecord__CommentAssignment_1 )? )
            // InternalXMachine.g:5448:2: ( rule__XRecord__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5449:2: ( rule__XRecord__CommentAssignment_1 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_STRING) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXMachine.g:5449:3: rule__XRecord__CommentAssignment_1
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
    // InternalXMachine.g:5457:1: rule__XRecord__Group__2 : rule__XRecord__Group__2__Impl rule__XRecord__Group__3 ;
    public final void rule__XRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5461:1: ( rule__XRecord__Group__2__Impl rule__XRecord__Group__3 )
            // InternalXMachine.g:5462:2: rule__XRecord__Group__2__Impl rule__XRecord__Group__3
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
    // InternalXMachine.g:5469:1: rule__XRecord__Group__2__Impl : ( ( rule__XRecord__Alternatives_2 )? ) ;
    public final void rule__XRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5473:1: ( ( ( rule__XRecord__Alternatives_2 )? ) )
            // InternalXMachine.g:5474:1: ( ( rule__XRecord__Alternatives_2 )? )
            {
            // InternalXMachine.g:5474:1: ( ( rule__XRecord__Alternatives_2 )? )
            // InternalXMachine.g:5475:2: ( rule__XRecord__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_2()); 
            }
            // InternalXMachine.g:5476:2: ( rule__XRecord__Alternatives_2 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=122 && LA65_0<=125)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXMachine.g:5476:3: rule__XRecord__Alternatives_2
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
    // InternalXMachine.g:5484:1: rule__XRecord__Group__3 : rule__XRecord__Group__3__Impl rule__XRecord__Group__4 ;
    public final void rule__XRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5488:1: ( rule__XRecord__Group__3__Impl rule__XRecord__Group__4 )
            // InternalXMachine.g:5489:2: rule__XRecord__Group__3__Impl rule__XRecord__Group__4
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
    // InternalXMachine.g:5496:1: rule__XRecord__Group__3__Impl : ( ( rule__XRecord__Alternatives_3 ) ) ;
    public final void rule__XRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5500:1: ( ( ( rule__XRecord__Alternatives_3 ) ) )
            // InternalXMachine.g:5501:1: ( ( rule__XRecord__Alternatives_3 ) )
            {
            // InternalXMachine.g:5501:1: ( ( rule__XRecord__Alternatives_3 ) )
            // InternalXMachine.g:5502:2: ( rule__XRecord__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_3()); 
            }
            // InternalXMachine.g:5503:2: ( rule__XRecord__Alternatives_3 )
            // InternalXMachine.g:5503:3: rule__XRecord__Alternatives_3
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
    // InternalXMachine.g:5511:1: rule__XRecord__Group__4 : rule__XRecord__Group__4__Impl rule__XRecord__Group__5 ;
    public final void rule__XRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5515:1: ( rule__XRecord__Group__4__Impl rule__XRecord__Group__5 )
            // InternalXMachine.g:5516:2: rule__XRecord__Group__4__Impl rule__XRecord__Group__5
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
    // InternalXMachine.g:5523:1: rule__XRecord__Group__4__Impl : ( ( rule__XRecord__NameAssignment_4 ) ) ;
    public final void rule__XRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5527:1: ( ( ( rule__XRecord__NameAssignment_4 ) ) )
            // InternalXMachine.g:5528:1: ( ( rule__XRecord__NameAssignment_4 ) )
            {
            // InternalXMachine.g:5528:1: ( ( rule__XRecord__NameAssignment_4 ) )
            // InternalXMachine.g:5529:2: ( rule__XRecord__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getNameAssignment_4()); 
            }
            // InternalXMachine.g:5530:2: ( rule__XRecord__NameAssignment_4 )
            // InternalXMachine.g:5530:3: rule__XRecord__NameAssignment_4
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
    // InternalXMachine.g:5538:1: rule__XRecord__Group__5 : rule__XRecord__Group__5__Impl rule__XRecord__Group__6 ;
    public final void rule__XRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5542:1: ( rule__XRecord__Group__5__Impl rule__XRecord__Group__6 )
            // InternalXMachine.g:5543:2: rule__XRecord__Group__5__Impl rule__XRecord__Group__6
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
    // InternalXMachine.g:5550:1: rule__XRecord__Group__5__Impl : ( ( rule__XRecord__Group_5__0 )? ) ;
    public final void rule__XRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5554:1: ( ( ( rule__XRecord__Group_5__0 )? ) )
            // InternalXMachine.g:5555:1: ( ( rule__XRecord__Group_5__0 )? )
            {
            // InternalXMachine.g:5555:1: ( ( rule__XRecord__Group_5__0 )? )
            // InternalXMachine.g:5556:2: ( rule__XRecord__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getGroup_5()); 
            }
            // InternalXMachine.g:5557:2: ( rule__XRecord__Group_5__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=128 && LA66_0<=129)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalXMachine.g:5557:3: rule__XRecord__Group_5__0
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
    // InternalXMachine.g:5565:1: rule__XRecord__Group__6 : rule__XRecord__Group__6__Impl rule__XRecord__Group__7 ;
    public final void rule__XRecord__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5569:1: ( rule__XRecord__Group__6__Impl rule__XRecord__Group__7 )
            // InternalXMachine.g:5570:2: rule__XRecord__Group__6__Impl rule__XRecord__Group__7
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
    // InternalXMachine.g:5577:1: rule__XRecord__Group__6__Impl : ( ( rule__XRecord__Alternatives_6 )* ) ;
    public final void rule__XRecord__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5581:1: ( ( ( rule__XRecord__Alternatives_6 )* ) )
            // InternalXMachine.g:5582:1: ( ( rule__XRecord__Alternatives_6 )* )
            {
            // InternalXMachine.g:5582:1: ( ( rule__XRecord__Alternatives_6 )* )
            // InternalXMachine.g:5583:2: ( rule__XRecord__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_6()); 
            }
            // InternalXMachine.g:5584:2: ( rule__XRecord__Alternatives_6 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=130 && LA67_0<=131)||LA67_0==153) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalXMachine.g:5584:3: rule__XRecord__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__XRecord__Alternatives_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // InternalXMachine.g:5592:1: rule__XRecord__Group__7 : rule__XRecord__Group__7__Impl ;
    public final void rule__XRecord__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5596:1: ( rule__XRecord__Group__7__Impl )
            // InternalXMachine.g:5597:2: rule__XRecord__Group__7__Impl
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
    // InternalXMachine.g:5603:1: rule__XRecord__Group__7__Impl : ( 'end' ) ;
    public final void rule__XRecord__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5607:1: ( ( 'end' ) )
            // InternalXMachine.g:5608:1: ( 'end' )
            {
            // InternalXMachine.g:5608:1: ( 'end' )
            // InternalXMachine.g:5609:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getEndKeyword_7()); 
            }
            match(input,147,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:5619:1: rule__XRecord__Group_5__0 : rule__XRecord__Group_5__0__Impl rule__XRecord__Group_5__1 ;
    public final void rule__XRecord__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5623:1: ( rule__XRecord__Group_5__0__Impl rule__XRecord__Group_5__1 )
            // InternalXMachine.g:5624:2: rule__XRecord__Group_5__0__Impl rule__XRecord__Group_5__1
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
    // InternalXMachine.g:5631:1: rule__XRecord__Group_5__0__Impl : ( ( rule__XRecord__Alternatives_5_0 ) ) ;
    public final void rule__XRecord__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5635:1: ( ( ( rule__XRecord__Alternatives_5_0 ) ) )
            // InternalXMachine.g:5636:1: ( ( rule__XRecord__Alternatives_5_0 ) )
            {
            // InternalXMachine.g:5636:1: ( ( rule__XRecord__Alternatives_5_0 ) )
            // InternalXMachine.g:5637:2: ( rule__XRecord__Alternatives_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_5_0()); 
            }
            // InternalXMachine.g:5638:2: ( rule__XRecord__Alternatives_5_0 )
            // InternalXMachine.g:5638:3: rule__XRecord__Alternatives_5_0
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
    // InternalXMachine.g:5646:1: rule__XRecord__Group_5__1 : rule__XRecord__Group_5__1__Impl ;
    public final void rule__XRecord__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5650:1: ( rule__XRecord__Group_5__1__Impl )
            // InternalXMachine.g:5651:2: rule__XRecord__Group_5__1__Impl
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
    // InternalXMachine.g:5657:1: rule__XRecord__Group_5__1__Impl : ( ( rule__XRecord__InheritsNamesAssignment_5_1 ) ) ;
    public final void rule__XRecord__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5661:1: ( ( ( rule__XRecord__InheritsNamesAssignment_5_1 ) ) )
            // InternalXMachine.g:5662:1: ( ( rule__XRecord__InheritsNamesAssignment_5_1 ) )
            {
            // InternalXMachine.g:5662:1: ( ( rule__XRecord__InheritsNamesAssignment_5_1 ) )
            // InternalXMachine.g:5663:2: ( rule__XRecord__InheritsNamesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getInheritsNamesAssignment_5_1()); 
            }
            // InternalXMachine.g:5664:2: ( rule__XRecord__InheritsNamesAssignment_5_1 )
            // InternalXMachine.g:5664:3: rule__XRecord__InheritsNamesAssignment_5_1
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
    // InternalXMachine.g:5673:1: rule__XRecord__Group_6_0__0 : rule__XRecord__Group_6_0__0__Impl rule__XRecord__Group_6_0__1 ;
    public final void rule__XRecord__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5677:1: ( rule__XRecord__Group_6_0__0__Impl rule__XRecord__Group_6_0__1 )
            // InternalXMachine.g:5678:2: rule__XRecord__Group_6_0__0__Impl rule__XRecord__Group_6_0__1
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
    // InternalXMachine.g:5685:1: rule__XRecord__Group_6_0__0__Impl : ( ( rule__XRecord__Alternatives_6_0_0 ) ) ;
    public final void rule__XRecord__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5689:1: ( ( ( rule__XRecord__Alternatives_6_0_0 ) ) )
            // InternalXMachine.g:5690:1: ( ( rule__XRecord__Alternatives_6_0_0 ) )
            {
            // InternalXMachine.g:5690:1: ( ( rule__XRecord__Alternatives_6_0_0 ) )
            // InternalXMachine.g:5691:2: ( rule__XRecord__Alternatives_6_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_6_0_0()); 
            }
            // InternalXMachine.g:5692:2: ( rule__XRecord__Alternatives_6_0_0 )
            // InternalXMachine.g:5692:3: rule__XRecord__Alternatives_6_0_0
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
    // InternalXMachine.g:5700:1: rule__XRecord__Group_6_0__1 : rule__XRecord__Group_6_0__1__Impl ;
    public final void rule__XRecord__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5704:1: ( rule__XRecord__Group_6_0__1__Impl )
            // InternalXMachine.g:5705:2: rule__XRecord__Group_6_0__1__Impl
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
    // InternalXMachine.g:5711:1: rule__XRecord__Group_6_0__1__Impl : ( ( rule__XRecord__FieldsAssignment_6_0_1 ) ) ;
    public final void rule__XRecord__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5715:1: ( ( ( rule__XRecord__FieldsAssignment_6_0_1 ) ) )
            // InternalXMachine.g:5716:1: ( ( rule__XRecord__FieldsAssignment_6_0_1 ) )
            {
            // InternalXMachine.g:5716:1: ( ( rule__XRecord__FieldsAssignment_6_0_1 ) )
            // InternalXMachine.g:5717:2: ( rule__XRecord__FieldsAssignment_6_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getFieldsAssignment_6_0_1()); 
            }
            // InternalXMachine.g:5718:2: ( rule__XRecord__FieldsAssignment_6_0_1 )
            // InternalXMachine.g:5718:3: rule__XRecord__FieldsAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__FieldsAssignment_6_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getFieldsAssignment_6_0_1()); 
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
    // InternalXMachine.g:5727:1: rule__XRecord__Group_6_1__0 : rule__XRecord__Group_6_1__0__Impl rule__XRecord__Group_6_1__1 ;
    public final void rule__XRecord__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5731:1: ( rule__XRecord__Group_6_1__0__Impl rule__XRecord__Group_6_1__1 )
            // InternalXMachine.g:5732:2: rule__XRecord__Group_6_1__0__Impl rule__XRecord__Group_6_1__1
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
    // InternalXMachine.g:5739:1: rule__XRecord__Group_6_1__0__Impl : ( 'constraint' ) ;
    public final void rule__XRecord__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5743:1: ( ( 'constraint' ) )
            // InternalXMachine.g:5744:1: ( 'constraint' )
            {
            // InternalXMachine.g:5744:1: ( 'constraint' )
            // InternalXMachine.g:5745:2: 'constraint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getConstraintKeyword_6_1_0()); 
            }
            match(input,153,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:5754:1: rule__XRecord__Group_6_1__1 : rule__XRecord__Group_6_1__1__Impl ;
    public final void rule__XRecord__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5758:1: ( rule__XRecord__Group_6_1__1__Impl )
            // InternalXMachine.g:5759:2: rule__XRecord__Group_6_1__1__Impl
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
    // InternalXMachine.g:5765:1: rule__XRecord__Group_6_1__1__Impl : ( ( rule__XRecord__ConstraintsAssignment_6_1_1 ) ) ;
    public final void rule__XRecord__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5769:1: ( ( ( rule__XRecord__ConstraintsAssignment_6_1_1 ) ) )
            // InternalXMachine.g:5770:1: ( ( rule__XRecord__ConstraintsAssignment_6_1_1 ) )
            {
            // InternalXMachine.g:5770:1: ( ( rule__XRecord__ConstraintsAssignment_6_1_1 ) )
            // InternalXMachine.g:5771:2: ( rule__XRecord__ConstraintsAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getConstraintsAssignment_6_1_1()); 
            }
            // InternalXMachine.g:5772:2: ( rule__XRecord__ConstraintsAssignment_6_1_1 )
            // InternalXMachine.g:5772:3: rule__XRecord__ConstraintsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__ConstraintsAssignment_6_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getConstraintsAssignment_6_1_1()); 
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
    // InternalXMachine.g:5781:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5785:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalXMachine.g:5786:2: rule__Field__Group__0__Impl rule__Field__Group__1
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
    // InternalXMachine.g:5793:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5797:1: ( ( () ) )
            // InternalXMachine.g:5798:1: ( () )
            {
            // InternalXMachine.g:5798:1: ( () )
            // InternalXMachine.g:5799:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            }
            // InternalXMachine.g:5800:2: ()
            // InternalXMachine.g:5800:3: 
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
    // InternalXMachine.g:5808:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5812:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalXMachine.g:5813:2: rule__Field__Group__1__Impl rule__Field__Group__2
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
    // InternalXMachine.g:5820:1: rule__Field__Group__1__Impl : ( ( rule__Field__CommentAssignment_1 )? ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5824:1: ( ( ( rule__Field__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5825:1: ( ( rule__Field__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5825:1: ( ( rule__Field__CommentAssignment_1 )? )
            // InternalXMachine.g:5826:2: ( rule__Field__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5827:2: ( rule__Field__CommentAssignment_1 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXMachine.g:5827:3: rule__Field__CommentAssignment_1
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
    // InternalXMachine.g:5835:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5839:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalXMachine.g:5840:2: rule__Field__Group__2__Impl rule__Field__Group__3
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
    // InternalXMachine.g:5847:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5851:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalXMachine.g:5852:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalXMachine.g:5852:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalXMachine.g:5853:2: ( rule__Field__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:5854:2: ( rule__Field__NameAssignment_2 )
            // InternalXMachine.g:5854:3: rule__Field__NameAssignment_2
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
    // InternalXMachine.g:5862:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5866:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalXMachine.g:5867:2: rule__Field__Group__3__Impl rule__Field__Group__4
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
    // InternalXMachine.g:5874:1: rule__Field__Group__3__Impl : ( ':' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5878:1: ( ( ':' ) )
            // InternalXMachine.g:5879:1: ( ':' )
            {
            // InternalXMachine.g:5879:1: ( ':' )
            // InternalXMachine.g:5880:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getColonKeyword_3()); 
            }
            match(input,83,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:5889:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5893:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalXMachine.g:5894:2: rule__Field__Group__4__Impl rule__Field__Group__5
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
    // InternalXMachine.g:5901:1: rule__Field__Group__4__Impl : ( ( rule__Field__MultiplicityAssignment_4 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5905:1: ( ( ( rule__Field__MultiplicityAssignment_4 )? ) )
            // InternalXMachine.g:5906:1: ( ( rule__Field__MultiplicityAssignment_4 )? )
            {
            // InternalXMachine.g:5906:1: ( ( rule__Field__MultiplicityAssignment_4 )? )
            // InternalXMachine.g:5907:2: ( rule__Field__MultiplicityAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMultiplicityAssignment_4()); 
            }
            // InternalXMachine.g:5908:2: ( rule__Field__MultiplicityAssignment_4 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=135 && LA69_0<=137)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalXMachine.g:5908:3: rule__Field__MultiplicityAssignment_4
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
    // InternalXMachine.g:5916:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5920:1: ( rule__Field__Group__5__Impl )
            // InternalXMachine.g:5921:2: rule__Field__Group__5__Impl
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
    // InternalXMachine.g:5927:1: rule__Field__Group__5__Impl : ( ( rule__Field__TypeAssignment_5 ) ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5931:1: ( ( ( rule__Field__TypeAssignment_5 ) ) )
            // InternalXMachine.g:5932:1: ( ( rule__Field__TypeAssignment_5 ) )
            {
            // InternalXMachine.g:5932:1: ( ( rule__Field__TypeAssignment_5 ) )
            // InternalXMachine.g:5933:2: ( rule__Field__TypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_5()); 
            }
            // InternalXMachine.g:5934:2: ( rule__Field__TypeAssignment_5 )
            // InternalXMachine.g:5934:3: rule__Field__TypeAssignment_5
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
    // InternalXMachine.g:5943:1: rule__XConstraint__Group__0 : rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1 ;
    public final void rule__XConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5947:1: ( rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1 )
            // InternalXMachine.g:5948:2: rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1
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
    // InternalXMachine.g:5955:1: rule__XConstraint__Group__0__Impl : ( () ) ;
    public final void rule__XConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5959:1: ( ( () ) )
            // InternalXMachine.g:5960:1: ( () )
            {
            // InternalXMachine.g:5960:1: ( () )
            // InternalXMachine.g:5961:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getConstraintAction_0()); 
            }
            // InternalXMachine.g:5962:2: ()
            // InternalXMachine.g:5962:3: 
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
    // InternalXMachine.g:5970:1: rule__XConstraint__Group__1 : rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2 ;
    public final void rule__XConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5974:1: ( rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2 )
            // InternalXMachine.g:5975:2: rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2
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
    // InternalXMachine.g:5982:1: rule__XConstraint__Group__1__Impl : ( ( rule__XConstraint__CommentAssignment_1 )? ) ;
    public final void rule__XConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5986:1: ( ( ( rule__XConstraint__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5987:1: ( ( rule__XConstraint__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5987:1: ( ( rule__XConstraint__CommentAssignment_1 )? )
            // InternalXMachine.g:5988:2: ( rule__XConstraint__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5989:2: ( rule__XConstraint__CommentAssignment_1 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_STRING) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXMachine.g:5989:3: rule__XConstraint__CommentAssignment_1
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
    // InternalXMachine.g:5997:1: rule__XConstraint__Group__2 : rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3 ;
    public final void rule__XConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6001:1: ( rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3 )
            // InternalXMachine.g:6002:2: rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:6009:1: rule__XConstraint__Group__2__Impl : ( ( rule__XConstraint__NameAssignment_2 ) ) ;
    public final void rule__XConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6013:1: ( ( ( rule__XConstraint__NameAssignment_2 ) ) )
            // InternalXMachine.g:6014:1: ( ( rule__XConstraint__NameAssignment_2 ) )
            {
            // InternalXMachine.g:6014:1: ( ( rule__XConstraint__NameAssignment_2 ) )
            // InternalXMachine.g:6015:2: ( rule__XConstraint__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:6016:2: ( rule__XConstraint__NameAssignment_2 )
            // InternalXMachine.g:6016:3: rule__XConstraint__NameAssignment_2
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
    // InternalXMachine.g:6024:1: rule__XConstraint__Group__3 : rule__XConstraint__Group__3__Impl ;
    public final void rule__XConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6028:1: ( rule__XConstraint__Group__3__Impl )
            // InternalXMachine.g:6029:2: rule__XConstraint__Group__3__Impl
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
    // InternalXMachine.g:6035:1: rule__XConstraint__Group__3__Impl : ( ( rule__XConstraint__PredicateAssignment_3 ) ) ;
    public final void rule__XConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6039:1: ( ( ( rule__XConstraint__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:6040:1: ( ( rule__XConstraint__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:6040:1: ( ( rule__XConstraint__PredicateAssignment_3 ) )
            // InternalXMachine.g:6041:2: ( rule__XConstraint__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:6042:2: ( rule__XConstraint__PredicateAssignment_3 )
            // InternalXMachine.g:6042:3: rule__XConstraint__PredicateAssignment_3
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
    // InternalXMachine.g:6051:1: rule__Machine__UnorderedGroup_4 : ( rule__Machine__UnorderedGroup_4__0 )? ;
    public final void rule__Machine__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_4());
        	
        try {
            // InternalXMachine.g:6056:1: ( ( rule__Machine__UnorderedGroup_4__0 )? )
            // InternalXMachine.g:6057:2: ( rule__Machine__UnorderedGroup_4__0 )?
            {
            // InternalXMachine.g:6057:2: ( rule__Machine__UnorderedGroup_4__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( LA71_0 == 142 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt71=1;
            }
            else if ( LA71_0 == 139 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt71=1;
            }
            else if ( LA71_0 == 140 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalXMachine.g:6057:2: rule__Machine__UnorderedGroup_4__0
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
    // InternalXMachine.g:6065:1: rule__Machine__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__Machine__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:6070:1: ( ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) ) )
            // InternalXMachine.g:6071:3: ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) )
            {
            // InternalXMachine.g:6071:3: ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) )
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( LA73_0 == 142 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt73=1;
            }
            else if ( LA73_0 == 139 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt73=2;
            }
            else if ( LA73_0 == 140 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt73=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalXMachine.g:6072:3: ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) )
                    {
                    // InternalXMachine.g:6072:3: ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) )
                    // InternalXMachine.g:6073:4: {...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalXMachine.g:6073:103: ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) )
                    // InternalXMachine.g:6074:5: ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalXMachine.g:6080:5: ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) )
                    // InternalXMachine.g:6081:6: ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* )
                    {
                    // InternalXMachine.g:6081:6: ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) )
                    // InternalXMachine.g:6082:7: ( rule__Machine__OrderedChildrenAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_4_0()); 
                    }
                    // InternalXMachine.g:6083:7: ( rule__Machine__OrderedChildrenAssignment_4_0 )
                    // InternalXMachine.g:6083:8: rule__Machine__OrderedChildrenAssignment_4_0
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

                    // InternalXMachine.g:6086:6: ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* )
                    // InternalXMachine.g:6087:7: ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_4_0()); 
                    }
                    // InternalXMachine.g:6088:7: ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==142) ) {
                            int LA72_1 = input.LA(2);

                            if ( (LA72_1==RULE_ID) ) {
                                int LA72_3 = input.LA(3);

                                if ( (synpred1_InternalXMachine()) ) {
                                    alt72=1;
                                }


                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalXMachine.g:6088:8: ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0
                    	    {
                    	    pushFollow(FOLLOW_40);
                    	    rule__Machine__OrderedChildrenAssignment_4_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
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
                    // InternalXMachine.g:6094:3: ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) )
                    {
                    // InternalXMachine.g:6094:3: ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) )
                    // InternalXMachine.g:6095:4: {...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalXMachine.g:6095:103: ( ( ( rule__Machine__Group_4_1__0 ) ) )
                    // InternalXMachine.g:6096:5: ( ( rule__Machine__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalXMachine.g:6102:5: ( ( rule__Machine__Group_4_1__0 ) )
                    // InternalXMachine.g:6103:6: ( rule__Machine__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_4_1()); 
                    }
                    // InternalXMachine.g:6104:6: ( rule__Machine__Group_4_1__0 )
                    // InternalXMachine.g:6104:7: rule__Machine__Group_4_1__0
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
                    // InternalXMachine.g:6109:3: ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) )
                    {
                    // InternalXMachine.g:6109:3: ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) )
                    // InternalXMachine.g:6110:4: {...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalXMachine.g:6110:103: ( ( ( rule__Machine__Group_4_2__0 ) ) )
                    // InternalXMachine.g:6111:5: ( ( rule__Machine__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalXMachine.g:6117:5: ( ( rule__Machine__Group_4_2__0 ) )
                    // InternalXMachine.g:6118:6: ( rule__Machine__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_4_2()); 
                    }
                    // InternalXMachine.g:6119:6: ( rule__Machine__Group_4_2__0 )
                    // InternalXMachine.g:6119:7: rule__Machine__Group_4_2__0
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
    // InternalXMachine.g:6132:1: rule__Machine__UnorderedGroup_4__0 : rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )? ;
    public final void rule__Machine__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6136:1: ( rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )? )
            // InternalXMachine.g:6137:2: rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_41);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:6138:2: ( rule__Machine__UnorderedGroup_4__1 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( LA74_0 == 142 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt74=1;
            }
            else if ( LA74_0 == 139 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt74=1;
            }
            else if ( LA74_0 == 140 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalXMachine.g:6138:2: rule__Machine__UnorderedGroup_4__1
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
    // InternalXMachine.g:6144:1: rule__Machine__UnorderedGroup_4__1 : rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )? ;
    public final void rule__Machine__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6148:1: ( rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )? )
            // InternalXMachine.g:6149:2: rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_41);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:6150:2: ( rule__Machine__UnorderedGroup_4__2 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( LA75_0 == 142 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt75=1;
            }
            else if ( LA75_0 == 139 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt75=1;
            }
            else if ( LA75_0 == 140 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalXMachine.g:6150:2: rule__Machine__UnorderedGroup_4__2
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
    // InternalXMachine.g:6156:1: rule__Machine__UnorderedGroup_4__2 : rule__Machine__UnorderedGroup_4__Impl ;
    public final void rule__Machine__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6160:1: ( rule__Machine__UnorderedGroup_4__Impl )
            // InternalXMachine.g:6161:2: rule__Machine__UnorderedGroup_4__Impl
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
    // InternalXMachine.g:6168:1: rule__Machine__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Machine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6172:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6173:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6173:2: ( RULE_STRING )
            // InternalXMachine.g:6174:3: RULE_STRING
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
    // InternalXMachine.g:6183:1: rule__Machine__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6187:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6188:2: ( RULE_ID )
            {
            // InternalXMachine.g:6188:2: ( RULE_ID )
            // InternalXMachine.g:6189:3: RULE_ID
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
    // InternalXMachine.g:6198:1: rule__Machine__OrderedChildrenAssignment_4_0 : ( ruleMIncludes ) ;
    public final void rule__Machine__OrderedChildrenAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6202:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:6203:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:6203:2: ( ruleMIncludes )
            // InternalXMachine.g:6204:3: ruleMIncludes
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
    // InternalXMachine.g:6213:1: rule__Machine__RefinesAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6217:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6218:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6218:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6219:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_1_0()); 
            }
            // InternalXMachine.g:6220:3: ( RULE_ID )
            // InternalXMachine.g:6221:4: RULE_ID
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
    // InternalXMachine.g:6232:1: rule__Machine__SeesAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6236:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6237:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6237:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6238:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesContextCrossReference_4_2_1_0()); 
            }
            // InternalXMachine.g:6239:3: ( RULE_ID )
            // InternalXMachine.g:6240:4: RULE_ID
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
    // InternalXMachine.g:6251:1: rule__Machine__OrderedChildrenAssignment_5_1 : ( ruleMContains ) ;
    public final void rule__Machine__OrderedChildrenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6255:1: ( ( ruleMContains ) )
            // InternalXMachine.g:6256:2: ( ruleMContains )
            {
            // InternalXMachine.g:6256:2: ( ruleMContains )
            // InternalXMachine.g:6257:3: ruleMContains
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
    // InternalXMachine.g:6266:1: rule__Machine__OrderedChildrenAssignment_6_0_1 : ( ruleXMultipleVariable ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6270:1: ( ( ruleXMultipleVariable ) )
            // InternalXMachine.g:6271:2: ( ruleXMultipleVariable )
            {
            // InternalXMachine.g:6271:2: ( ruleXMultipleVariable )
            // InternalXMachine.g:6272:3: ruleXMultipleVariable
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
    // InternalXMachine.g:6281:1: rule__Machine__OrderedChildrenAssignment_6_1 : ( ruleXIndividualVariable ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6285:1: ( ( ruleXIndividualVariable ) )
            // InternalXMachine.g:6286:2: ( ruleXIndividualVariable )
            {
            // InternalXMachine.g:6286:2: ( ruleXIndividualVariable )
            // InternalXMachine.g:6287:3: ruleXIndividualVariable
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
    // InternalXMachine.g:6296:1: rule__Machine__OrderedChildrenAssignment_6_2_1 : ( ruleXMultipleInvariant ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6300:1: ( ( ruleXMultipleInvariant ) )
            // InternalXMachine.g:6301:2: ( ruleXMultipleInvariant )
            {
            // InternalXMachine.g:6301:2: ( ruleXMultipleInvariant )
            // InternalXMachine.g:6302:3: ruleXMultipleInvariant
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
    // InternalXMachine.g:6311:1: rule__Machine__OrderedChildrenAssignment_6_3 : ( ruleXIndividualInvariant ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6315:1: ( ( ruleXIndividualInvariant ) )
            // InternalXMachine.g:6316:2: ( ruleXIndividualInvariant )
            {
            // InternalXMachine.g:6316:2: ( ruleXIndividualInvariant )
            // InternalXMachine.g:6317:3: ruleXIndividualInvariant
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
    // InternalXMachine.g:6326:1: rule__Machine__OrderedChildrenAssignment_6_4 : ( ruleXRecord ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6330:1: ( ( ruleXRecord ) )
            // InternalXMachine.g:6331:2: ( ruleXRecord )
            {
            // InternalXMachine.g:6331:2: ( ruleXRecord )
            // InternalXMachine.g:6332:3: ruleXRecord
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
    // InternalXMachine.g:6341:1: rule__Machine__OrderedChildrenAssignment_6_5 : ( ruleXVariant ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6345:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:6346:2: ( ruleXVariant )
            {
            // InternalXMachine.g:6346:2: ( ruleXVariant )
            // InternalXMachine.g:6347:3: ruleXVariant
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
    // InternalXMachine.g:6356:1: rule__Machine__OrderedChildrenAssignment_6_6 : ( ruleXEvent ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6360:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:6361:2: ( ruleXEvent )
            {
            // InternalXMachine.g:6361:2: ( ruleXEvent )
            // InternalXMachine.g:6362:3: ruleXEvent
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


    // $ANTLR start "rule__MContains__ExtensionAssignment_1"
    // InternalXMachine.g:6371:1: rule__MContains__ExtensionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MContains__ExtensionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6375:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:6376:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:6376:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:6377:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionDiagramOwnerCrossReference_1_0()); 
            }
            // InternalXMachine.g:6378:3: ( ruleQualifiedName )
            // InternalXMachine.g:6379:4: ruleQualifiedName
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
    // InternalXMachine.g:6390:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6394:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:6395:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:6395:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:6396:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            }
            // InternalXMachine.g:6397:3: ( ruleQualifiedName )
            // InternalXMachine.g:6398:4: ruleQualifiedName
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
    // InternalXMachine.g:6409:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6413:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6414:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6414:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6415:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            }
            // InternalXMachine.g:6416:3: ( RULE_ID )
            // InternalXMachine.g:6417:4: RULE_ID
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
    // InternalXMachine.g:6428:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6432:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6433:2: ( RULE_ID )
            {
            // InternalXMachine.g:6433:2: ( RULE_ID )
            // InternalXMachine.g:6434:3: RULE_ID
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
    // InternalXMachine.g:6443:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6447:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6448:2: ( RULE_ID )
            {
            // InternalXMachine.g:6448:2: ( RULE_ID )
            // InternalXMachine.g:6449:3: RULE_ID
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
    // InternalXMachine.g:6458:1: rule__XMultipleVariable__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XMultipleVariable__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6462:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6463:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6463:2: ( RULE_STRING )
            // InternalXMachine.g:6464:3: RULE_STRING
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
    // InternalXMachine.g:6473:1: rule__XMultipleVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XMultipleVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6477:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6478:2: ( RULE_ID )
            {
            // InternalXMachine.g:6478:2: ( RULE_ID )
            // InternalXMachine.g:6479:3: RULE_ID
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
    // InternalXMachine.g:6488:1: rule__XIndividualVariable__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualVariable__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6492:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6493:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6493:2: ( RULE_STRING )
            // InternalXMachine.g:6494:3: RULE_STRING
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
    // InternalXMachine.g:6503:1: rule__XIndividualVariable__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XIndividualVariable__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6507:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6508:2: ( RULE_ID )
            {
            // InternalXMachine.g:6508:2: ( RULE_ID )
            // InternalXMachine.g:6509:3: RULE_ID
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
    // InternalXMachine.g:6518:1: rule__XIndividualVariable__TypeAssignment_4_1 : ( ruleXType ) ;
    public final void rule__XIndividualVariable__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6522:1: ( ( ruleXType ) )
            // InternalXMachine.g:6523:2: ( ruleXType )
            {
            // InternalXMachine.g:6523:2: ( ruleXType )
            // InternalXMachine.g:6524:3: ruleXType
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
    // InternalXMachine.g:6533:1: rule__XIndividualVariable__ValueAssignment_5_1 : ( ruleXFormula ) ;
    public final void rule__XIndividualVariable__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6537:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6538:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6538:2: ( ruleXFormula )
            // InternalXMachine.g:6539:3: ruleXFormula
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
    // InternalXMachine.g:6548:1: rule__XMultipleInvariant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XMultipleInvariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6552:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6553:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6553:2: ( RULE_STRING )
            // InternalXMachine.g:6554:3: RULE_STRING
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
    // InternalXMachine.g:6563:1: rule__XMultipleInvariant__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XMultipleInvariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6567:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:6568:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:6568:2: ( RULE_XLABEL )
            // InternalXMachine.g:6569:3: RULE_XLABEL
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
    // InternalXMachine.g:6578:1: rule__XMultipleInvariant__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XMultipleInvariant__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6582:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6583:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6583:2: ( ruleXFormula )
            // InternalXMachine.g:6584:3: ruleXFormula
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
    // InternalXMachine.g:6593:1: rule__XIndividualInvariant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualInvariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6597:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6598:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6598:2: ( RULE_STRING )
            // InternalXMachine.g:6599:3: RULE_STRING
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
    // InternalXMachine.g:6608:1: rule__XIndividualInvariant__TheoremAssignment_2_0 : ( ( 'theorem' ) ) ;
    public final void rule__XIndividualInvariant__TheoremAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6612:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:6613:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:6613:2: ( ( 'theorem' ) )
            // InternalXMachine.g:6614:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getTheoremTheoremKeyword_2_0_0()); 
            }
            // InternalXMachine.g:6615:3: ( 'theorem' )
            // InternalXMachine.g:6616:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getTheoremTheoremKeyword_2_0_0()); 
            }
            match(input,154,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:6627:1: rule__XIndividualInvariant__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XIndividualInvariant__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6631:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:6632:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:6632:2: ( RULE_XLABEL )
            // InternalXMachine.g:6633:3: RULE_XLABEL
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
    // InternalXMachine.g:6642:1: rule__XIndividualInvariant__PredicateAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XIndividualInvariant__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6646:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6647:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6647:2: ( ruleXFormula )
            // InternalXMachine.g:6648:3: ruleXFormula
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
    // InternalXMachine.g:6657:1: rule__XVariant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XVariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6661:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6662:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6662:2: ( RULE_STRING )
            // InternalXMachine.g:6663:3: RULE_STRING
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
    // InternalXMachine.g:6672:1: rule__XVariant__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XVariant__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6676:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:6677:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:6677:2: ( RULE_XLABEL )
            // InternalXMachine.g:6678:3: RULE_XLABEL
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
    // InternalXMachine.g:6687:1: rule__XVariant__ExpressionAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XVariant__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6691:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6692:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6692:2: ( ruleXFormula )
            // InternalXMachine.g:6693:3: ruleXFormula
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
    // InternalXMachine.g:6702:1: rule__XEvent__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XEvent__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6706:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6707:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6707:2: ( RULE_STRING )
            // InternalXMachine.g:6708:3: RULE_STRING
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
    // InternalXMachine.g:6717:1: rule__XEvent__ConvergenceAssignment_2 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6721:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:6722:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:6722:2: ( ruleXConvergence )
            // InternalXMachine.g:6723:3: ruleXConvergence
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
    // InternalXMachine.g:6732:1: rule__XEvent__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6736:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6737:2: ( RULE_ID )
            {
            // InternalXMachine.g:6737:2: ( RULE_ID )
            // InternalXMachine.g:6738:3: RULE_ID
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
    // InternalXMachine.g:6747:1: rule__XEvent__RefinesAssignment_5_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6751:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6752:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6752:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6753:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_0_1_0()); 
            }
            // InternalXMachine.g:6754:3: ( RULE_ID )
            // InternalXMachine.g:6755:4: RULE_ID
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
    // InternalXMachine.g:6766:1: rule__XEvent__ExtendedAssignment_5_1_0 : ( ( 'extends' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6770:1: ( ( ( 'extends' ) ) )
            // InternalXMachine.g:6771:2: ( ( 'extends' ) )
            {
            // InternalXMachine.g:6771:2: ( ( 'extends' ) )
            // InternalXMachine.g:6772:3: ( 'extends' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_5_1_0_0()); 
            }
            // InternalXMachine.g:6773:3: ( 'extends' )
            // InternalXMachine.g:6774:4: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_5_1_0_0()); 
            }
            match(input,155,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:6785:1: rule__XEvent__RefinesAssignment_5_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6789:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6790:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6790:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6791:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_1_0()); 
            }
            // InternalXMachine.g:6792:3: ( RULE_ID )
            // InternalXMachine.g:6793:4: RULE_ID
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
    // InternalXMachine.g:6804:1: rule__XEvent__OrderedChildrenAssignment_6_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6808:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:6809:2: ( ruleXParameter )
            {
            // InternalXMachine.g:6809:2: ( ruleXParameter )
            // InternalXMachine.g:6810:3: ruleXParameter
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
    // InternalXMachine.g:6819:1: rule__XEvent__OrderedChildrenAssignment_7 : ( ruleEventSync ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6823:1: ( ( ruleEventSync ) )
            // InternalXMachine.g:6824:2: ( ruleEventSync )
            {
            // InternalXMachine.g:6824:2: ( ruleEventSync )
            // InternalXMachine.g:6825:3: ruleEventSync
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
    // InternalXMachine.g:6834:1: rule__XEvent__OrderedChildrenAssignment_8_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6838:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:6839:2: ( ruleXGuard )
            {
            // InternalXMachine.g:6839:2: ( ruleXGuard )
            // InternalXMachine.g:6840:3: ruleXGuard
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
    // InternalXMachine.g:6849:1: rule__XEvent__OrderedChildrenAssignment_9_1 : ( ruleXAction ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6853:1: ( ( ruleXAction ) )
            // InternalXMachine.g:6854:2: ( ruleXAction )
            {
            // InternalXMachine.g:6854:2: ( ruleXAction )
            // InternalXMachine.g:6855:3: ruleXAction
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
    // InternalXMachine.g:6864:1: rule__XEvent__OrderedChildrenAssignment_10_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6868:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:6869:2: ( ruleXWitness )
            {
            // InternalXMachine.g:6869:2: ( ruleXWitness )
            // InternalXMachine.g:6870:3: ruleXWitness
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
    // InternalXMachine.g:6879:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6883:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6884:2: ( RULE_ID )
            {
            // InternalXMachine.g:6884:2: ( RULE_ID )
            // InternalXMachine.g:6885:3: RULE_ID
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
    // InternalXMachine.g:6894:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6898:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6899:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6899:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6900:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            }
            // InternalXMachine.g:6901:3: ( RULE_ID )
            // InternalXMachine.g:6902:4: RULE_ID
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
    // InternalXMachine.g:6913:1: rule__XParameter__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XParameter__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6917:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6918:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6918:2: ( RULE_STRING )
            // InternalXMachine.g:6919:3: RULE_STRING
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
    // InternalXMachine.g:6928:1: rule__XParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6932:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6933:2: ( RULE_ID )
            {
            // InternalXMachine.g:6933:2: ( RULE_ID )
            // InternalXMachine.g:6934:3: RULE_ID
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
    // InternalXMachine.g:6943:1: rule__XGuard__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XGuard__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6947:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6948:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6948:2: ( RULE_STRING )
            // InternalXMachine.g:6949:3: RULE_STRING
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
    // InternalXMachine.g:6958:1: rule__XGuard__TheoremAssignment_2 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6962:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:6963:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:6963:2: ( ( 'theorem' ) )
            // InternalXMachine.g:6964:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_2_0()); 
            }
            // InternalXMachine.g:6965:3: ( 'theorem' )
            // InternalXMachine.g:6966:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_2_0()); 
            }
            match(input,154,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:6977:1: rule__XGuard__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6981:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:6982:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:6982:2: ( RULE_XLABEL )
            // InternalXMachine.g:6983:3: RULE_XLABEL
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
    // InternalXMachine.g:6992:1: rule__XGuard__PredicateAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XGuard__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6996:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6997:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6997:2: ( ruleXFormula )
            // InternalXMachine.g:6998:3: ruleXFormula
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
    // InternalXMachine.g:7007:1: rule__XWitness__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XWitness__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7011:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7012:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7012:2: ( RULE_STRING )
            // InternalXMachine.g:7013:3: RULE_STRING
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
    // InternalXMachine.g:7022:1: rule__XWitness__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7026:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7027:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7027:2: ( RULE_XLABEL )
            // InternalXMachine.g:7028:3: RULE_XLABEL
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
    // InternalXMachine.g:7037:1: rule__XWitness__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XWitness__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7041:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7042:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7042:2: ( ruleXFormula )
            // InternalXMachine.g:7043:3: ruleXFormula
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
    // InternalXMachine.g:7052:1: rule__XAction__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XAction__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7056:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7057:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7057:2: ( RULE_STRING )
            // InternalXMachine.g:7058:3: RULE_STRING
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
    // InternalXMachine.g:7067:1: rule__XAction__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7071:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7072:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7072:2: ( RULE_XLABEL )
            // InternalXMachine.g:7073:3: RULE_XLABEL
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
    // InternalXMachine.g:7082:1: rule__XAction__ActionAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XAction__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7086:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7087:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7087:2: ( ruleXFormula )
            // InternalXMachine.g:7088:3: ruleXFormula
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
    // InternalXMachine.g:7097:1: rule__XRecord__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XRecord__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7101:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7102:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7102:2: ( RULE_STRING )
            // InternalXMachine.g:7103:3: RULE_STRING
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
    // InternalXMachine.g:7112:1: rule__XRecord__ExtendedAssignment_2_0 : ( ( rule__XRecord__ExtendedAlternatives_2_0_0 ) ) ;
    public final void rule__XRecord__ExtendedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7116:1: ( ( ( rule__XRecord__ExtendedAlternatives_2_0_0 ) ) )
            // InternalXMachine.g:7117:2: ( ( rule__XRecord__ExtendedAlternatives_2_0_0 ) )
            {
            // InternalXMachine.g:7117:2: ( ( rule__XRecord__ExtendedAlternatives_2_0_0 ) )
            // InternalXMachine.g:7118:3: ( rule__XRecord__ExtendedAlternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getExtendedAlternatives_2_0_0()); 
            }
            // InternalXMachine.g:7119:3: ( rule__XRecord__ExtendedAlternatives_2_0_0 )
            // InternalXMachine.g:7119:4: rule__XRecord__ExtendedAlternatives_2_0_0
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
    // InternalXMachine.g:7127:1: rule__XRecord__RefinedAssignment_2_1 : ( ( rule__XRecord__RefinedAlternatives_2_1_0 ) ) ;
    public final void rule__XRecord__RefinedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7131:1: ( ( ( rule__XRecord__RefinedAlternatives_2_1_0 ) ) )
            // InternalXMachine.g:7132:2: ( ( rule__XRecord__RefinedAlternatives_2_1_0 ) )
            {
            // InternalXMachine.g:7132:2: ( ( rule__XRecord__RefinedAlternatives_2_1_0 ) )
            // InternalXMachine.g:7133:3: ( rule__XRecord__RefinedAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getRefinedAlternatives_2_1_0()); 
            }
            // InternalXMachine.g:7134:3: ( rule__XRecord__RefinedAlternatives_2_1_0 )
            // InternalXMachine.g:7134:4: rule__XRecord__RefinedAlternatives_2_1_0
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
    // InternalXMachine.g:7142:1: rule__XRecord__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__XRecord__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7146:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7147:2: ( RULE_ID )
            {
            // InternalXMachine.g:7147:2: ( RULE_ID )
            // InternalXMachine.g:7148:3: RULE_ID
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
    // InternalXMachine.g:7157:1: rule__XRecord__InheritsNamesAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__XRecord__InheritsNamesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7161:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7162:2: ( RULE_ID )
            {
            // InternalXMachine.g:7162:2: ( RULE_ID )
            // InternalXMachine.g:7163:3: RULE_ID
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


    // $ANTLR start "rule__XRecord__FieldsAssignment_6_0_1"
    // InternalXMachine.g:7172:1: rule__XRecord__FieldsAssignment_6_0_1 : ( ruleField ) ;
    public final void rule__XRecord__FieldsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7176:1: ( ( ruleField ) )
            // InternalXMachine.g:7177:2: ( ruleField )
            {
            // InternalXMachine.g:7177:2: ( ruleField )
            // InternalXMachine.g:7178:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_6_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_6_0_1_0()); 
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
    // $ANTLR end "rule__XRecord__FieldsAssignment_6_0_1"


    // $ANTLR start "rule__XRecord__ConstraintsAssignment_6_1_1"
    // InternalXMachine.g:7187:1: rule__XRecord__ConstraintsAssignment_6_1_1 : ( ruleXConstraint ) ;
    public final void rule__XRecord__ConstraintsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7191:1: ( ( ruleXConstraint ) )
            // InternalXMachine.g:7192:2: ( ruleXConstraint )
            {
            // InternalXMachine.g:7192:2: ( ruleXConstraint )
            // InternalXMachine.g:7193:3: ruleXConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getConstraintsXConstraintParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getConstraintsXConstraintParserRuleCall_6_1_1_0()); 
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
    // $ANTLR end "rule__XRecord__ConstraintsAssignment_6_1_1"


    // $ANTLR start "rule__Field__CommentAssignment_1"
    // InternalXMachine.g:7202:1: rule__Field__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Field__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7206:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7207:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7207:2: ( RULE_STRING )
            // InternalXMachine.g:7208:3: RULE_STRING
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
    // InternalXMachine.g:7217:1: rule__Field__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7221:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7222:2: ( RULE_ID )
            {
            // InternalXMachine.g:7222:2: ( RULE_ID )
            // InternalXMachine.g:7223:3: RULE_ID
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
    // InternalXMachine.g:7232:1: rule__Field__MultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Field__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7236:1: ( ( ruleMultiplicity ) )
            // InternalXMachine.g:7237:2: ( ruleMultiplicity )
            {
            // InternalXMachine.g:7237:2: ( ruleMultiplicity )
            // InternalXMachine.g:7238:3: ruleMultiplicity
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
    // InternalXMachine.g:7247:1: rule__Field__TypeAssignment_5 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7251:1: ( ( ruleFieldType ) )
            // InternalXMachine.g:7252:2: ( ruleFieldType )
            {
            // InternalXMachine.g:7252:2: ( ruleFieldType )
            // InternalXMachine.g:7253:3: ruleFieldType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_5_0()); 
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
    // InternalXMachine.g:7262:1: rule__XConstraint__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XConstraint__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7266:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7267:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7267:2: ( RULE_STRING )
            // InternalXMachine.g:7268:3: RULE_STRING
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
    // InternalXMachine.g:7277:1: rule__XConstraint__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XConstraint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7281:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7282:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7282:2: ( RULE_XLABEL )
            // InternalXMachine.g:7283:3: RULE_XLABEL
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
    // InternalXMachine.g:7292:1: rule__XConstraint__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XConstraint__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7296:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7297:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7297:2: ( ruleXFormula )
            // InternalXMachine.g:7298:3: ruleXFormula
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
        // InternalXMachine.g:6088:8: ( rule__Machine__OrderedChildrenAssignment_4_0 )
        // InternalXMachine.g:6088:9: rule__Machine__OrderedChildrenAssignment_4_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFF07FFF80072L,0x03FFFFFFFFFFFFFFL,0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000005800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000080007E080L,0xFC00000000000000L,0x0000000004062070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000080007E082L,0xFC00000000000000L,0x0000000004060070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000060080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000081000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0E00000780000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xFFFFFF07FFF80070L,0x03FFFFFFFFFFFFFFL,0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000007FF80000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000007FF80002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000080L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000080007E080L,0xFC00000000000000L,0x0000000004060070L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000F000000000L,0x0000000000000000L,0x0000000008780800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000182L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000080L,0xFC00000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000208000FL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000200000CL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x07FFFF0780000010L,0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000005800L});

}
