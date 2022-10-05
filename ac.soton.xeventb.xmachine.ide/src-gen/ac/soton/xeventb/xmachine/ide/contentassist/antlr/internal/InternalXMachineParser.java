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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_UNTRANSLATED_TOKEN", "RULE_STRING", "RULE_XLABEL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'\\u00D7'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'invariant'", "'where'", "'when'", "'then'", "'begin'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21191'", "'\\u2119'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'ordinary'", "'convergent'", "'anticipated'", "'one'", "'many'", "'opt'", "'machine'", "'end'", "'refines'", "'sees'", "'contains'", "'variables'", "'invariants'", "'records'", "'includes'", "'to'", "'as'", "'variable'", "'variant'", "'event'", "'any'", "'with'", "'synchronises'", "'%'", "'\\u22C2'", "'record'", "'inherits'", "'field'", "'constraint'", "'theorem'", "'extends'", "'extended'", "'refined'"
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


    // $ANTLR start "entryRuleXGroupVariable"
    // InternalXMachine.g:153:1: entryRuleXGroupVariable : ruleXGroupVariable EOF ;
    public final void entryRuleXGroupVariable() throws RecognitionException {
        try {
            // InternalXMachine.g:154:1: ( ruleXGroupVariable EOF )
            // InternalXMachine.g:155:1: ruleXGroupVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXGroupVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupVariableRule()); 
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
    // $ANTLR end "entryRuleXGroupVariable"


    // $ANTLR start "ruleXGroupVariable"
    // InternalXMachine.g:162:1: ruleXGroupVariable : ( ( rule__XGroupVariable__Group__0 ) ) ;
    public final void ruleXGroupVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:166:2: ( ( ( rule__XGroupVariable__Group__0 ) ) )
            // InternalXMachine.g:167:2: ( ( rule__XGroupVariable__Group__0 ) )
            {
            // InternalXMachine.g:167:2: ( ( rule__XGroupVariable__Group__0 ) )
            // InternalXMachine.g:168:3: ( rule__XGroupVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupVariableAccess().getGroup()); 
            }
            // InternalXMachine.g:169:3: ( rule__XGroupVariable__Group__0 )
            // InternalXMachine.g:169:4: rule__XGroupVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGroupVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGroupVariable"


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


    // $ANTLR start "entryRuleXGroupInvariant"
    // InternalXMachine.g:278:1: entryRuleXGroupInvariant : ruleXGroupInvariant EOF ;
    public final void entryRuleXGroupInvariant() throws RecognitionException {
        try {
            // InternalXMachine.g:279:1: ( ruleXGroupInvariant EOF )
            // InternalXMachine.g:280:1: ruleXGroupInvariant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupInvariantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXGroupInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupInvariantRule()); 
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
    // $ANTLR end "entryRuleXGroupInvariant"


    // $ANTLR start "ruleXGroupInvariant"
    // InternalXMachine.g:287:1: ruleXGroupInvariant : ( ( rule__XGroupInvariant__Group__0 ) ) ;
    public final void ruleXGroupInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:291:2: ( ( ( rule__XGroupInvariant__Group__0 ) ) )
            // InternalXMachine.g:292:2: ( ( rule__XGroupInvariant__Group__0 ) )
            {
            // InternalXMachine.g:292:2: ( ( rule__XGroupInvariant__Group__0 ) )
            // InternalXMachine.g:293:3: ( rule__XGroupInvariant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupInvariantAccess().getGroup()); 
            }
            // InternalXMachine.g:294:3: ( rule__XGroupInvariant__Group__0 )
            // InternalXMachine.g:294:4: rule__XGroupInvariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGroupInvariant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupInvariantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGroupInvariant"


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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_UNTRANSLATED_TOKEN)||(LA1_0>=13 && LA1_0<=28)||(LA1_0>=34 && LA1_0<=115)||LA1_0==139) ) {
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
            case 127:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 133:
                    {
                    alt2=2;
                    }
                    break;
                case 134:
                    {
                    alt2=6;
                    }
                    break;
                case 29:
                case 145:
                    {
                    alt2=4;
                    }
                    break;
                case 116:
                case 117:
                case 118:
                case 135:
                    {
                    alt2=7;
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
            case 133:
                {
                alt2=2;
                }
                break;
            case 128:
                {
                alt2=3;
                }
                break;
            case 29:
            case 145:
                {
                alt2=4;
                }
                break;
            case 141:
            case 147:
            case 148:
                {
                alt2=5;
                }
                break;
            case 134:
                {
                alt2=6;
                }
                break;
            case 116:
            case 117:
            case 118:
            case 135:
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


    // $ANTLR start "rule__XTYPEOPERATOR__Alternatives"
    // InternalXMachine.g:792:1: rule__XTYPEOPERATOR__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '\\u00D7' ) );
    public final void rule__XTYPEOPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:796:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '\\u00D7' ) )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 20:
                {
                alt3=8;
                }
                break;
            case 21:
                {
                alt3=9;
                }
                break;
            case 22:
                {
                alt3=10;
                }
                break;
            case 23:
                {
                alt3=11;
                }
                break;
            case 24:
                {
                alt3=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:797:2: ( '\\u2194' )
                    {
                    // InternalXMachine.g:797:2: ( '\\u2194' )
                    // InternalXMachine.g:798:3: '\\u2194'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:803:2: ( '\\uE100' )
                    {
                    // InternalXMachine.g:803:2: ( '\\uE100' )
                    // InternalXMachine.g:804:3: '\\uE100'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:809:2: ( '\\uE101' )
                    {
                    // InternalXMachine.g:809:2: ( '\\uE101' )
                    // InternalXMachine.g:810:3: '\\uE101'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:815:2: ( '\\uE102' )
                    {
                    // InternalXMachine.g:815:2: ( '\\uE102' )
                    // InternalXMachine.g:816:3: '\\uE102'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:821:2: ( '\\u21F8' )
                    {
                    // InternalXMachine.g:821:2: ( '\\u21F8' )
                    // InternalXMachine.g:822:3: '\\u21F8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:827:2: ( '\\u2192' )
                    {
                    // InternalXMachine.g:827:2: ( '\\u2192' )
                    // InternalXMachine.g:828:3: '\\u2192'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:833:2: ( '\\u2914' )
                    {
                    // InternalXMachine.g:833:2: ( '\\u2914' )
                    // InternalXMachine.g:834:3: '\\u2914'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:839:2: ( '\\u21A3' )
                    {
                    // InternalXMachine.g:839:2: ( '\\u21A3' )
                    // InternalXMachine.g:840:3: '\\u21A3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:845:2: ( '\\u2900' )
                    {
                    // InternalXMachine.g:845:2: ( '\\u2900' )
                    // InternalXMachine.g:846:3: '\\u2900'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:851:2: ( '\\u21A0' )
                    {
                    // InternalXMachine.g:851:2: ( '\\u21A0' )
                    // InternalXMachine.g:852:3: '\\u21A0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:857:2: ( '\\u2916' )
                    {
                    // InternalXMachine.g:857:2: ( '\\u2916' )
                    // InternalXMachine.g:858:3: '\\u2916'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:863:2: ( '\\u00D7' )
                    {
                    // InternalXMachine.g:863:2: ( '\\u00D7' )
                    // InternalXMachine.g:864:3: '\\u00D7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_11()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:873:1: rule__XTypePrimitive__Alternatives : ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) );
    public final void rule__XTypePrimitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:877:1: ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            case 28:
                {
                alt4=5;
                }
                break;
            case 53:
                {
                alt4=6;
                }
                break;
            case 52:
                {
                alt4=7;
                }
                break;
            case 51:
                {
                alt4=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:878:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:878:2: ( RULE_ID )
                    // InternalXMachine.g:879:3: RULE_ID
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
                    // InternalXMachine.g:884:2: ( 'BOOL' )
                    {
                    // InternalXMachine.g:884:2: ( 'BOOL' )
                    // InternalXMachine.g:885:3: 'BOOL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:890:2: ( '\\u21151' )
                    {
                    // InternalXMachine.g:890:2: ( '\\u21151' )
                    // InternalXMachine.g:891:3: '\\u21151'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:896:2: ( '\\u2115' )
                    {
                    // InternalXMachine.g:896:2: ( '\\u2115' )
                    // InternalXMachine.g:897:3: '\\u2115'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:902:2: ( '\\u2124' )
                    {
                    // InternalXMachine.g:902:2: ( '\\u2124' )
                    // InternalXMachine.g:903:3: '\\u2124'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:908:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    {
                    // InternalXMachine.g:908:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    // InternalXMachine.g:909:3: ( rule__XTypePrimitive__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getGroup_5()); 
                    }
                    // InternalXMachine.g:910:3: ( rule__XTypePrimitive__Group_5__0 )
                    // InternalXMachine.g:910:4: rule__XTypePrimitive__Group_5__0
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
                    // InternalXMachine.g:914:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    {
                    // InternalXMachine.g:914:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    // InternalXMachine.g:915:3: ( rule__XTypePrimitive__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getGroup_6()); 
                    }
                    // InternalXMachine.g:916:3: ( rule__XTypePrimitive__Group_6__0 )
                    // InternalXMachine.g:916:4: rule__XTypePrimitive__Group_6__0
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
                    // InternalXMachine.g:920:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    {
                    // InternalXMachine.g:920:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    // InternalXMachine.g:921:3: ( rule__XTypePrimitive__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXTypePrimitiveAccess().getGroup_7()); 
                    }
                    // InternalXMachine.g:922:3: ( rule__XTypePrimitive__Group_7__0 )
                    // InternalXMachine.g:922:4: rule__XTypePrimitive__Group_7__0
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
    // InternalXMachine.g:930:1: rule__XIndividualInvariant__Alternatives_2 : ( ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) ) | ( 'invariant' ) );
    public final void rule__XIndividualInvariant__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:934:1: ( ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) ) | ( 'invariant' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==145) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
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
                    // InternalXMachine.g:935:2: ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) )
                    {
                    // InternalXMachine.g:935:2: ( ( rule__XIndividualInvariant__TheoremAssignment_2_0 ) )
                    // InternalXMachine.g:936:3: ( rule__XIndividualInvariant__TheoremAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXIndividualInvariantAccess().getTheoremAssignment_2_0()); 
                    }
                    // InternalXMachine.g:937:3: ( rule__XIndividualInvariant__TheoremAssignment_2_0 )
                    // InternalXMachine.g:937:4: rule__XIndividualInvariant__TheoremAssignment_2_0
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
                    // InternalXMachine.g:941:2: ( 'invariant' )
                    {
                    // InternalXMachine.g:941:2: ( 'invariant' )
                    // InternalXMachine.g:942:3: 'invariant'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXIndividualInvariantAccess().getInvariantKeyword_2_1()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:951:1: rule__XEvent__Alternatives_5 : ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) );
    public final void rule__XEvent__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:955:1: ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==124) ) {
                alt6=1;
            }
            else if ( (LA6_0==146) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:956:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    {
                    // InternalXMachine.g:956:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    // InternalXMachine.g:957:3: ( rule__XEvent__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_5_0()); 
                    }
                    // InternalXMachine.g:958:3: ( rule__XEvent__Group_5_0__0 )
                    // InternalXMachine.g:958:4: rule__XEvent__Group_5_0__0
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
                    // InternalXMachine.g:962:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    {
                    // InternalXMachine.g:962:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    // InternalXMachine.g:963:3: ( rule__XEvent__Group_5_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_5_1()); 
                    }
                    // InternalXMachine.g:964:3: ( rule__XEvent__Group_5_1__0 )
                    // InternalXMachine.g:964:4: rule__XEvent__Group_5_1__0
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
    // InternalXMachine.g:972:1: rule__XEvent__Alternatives_8_0 : ( ( 'where' ) | ( 'when' ) );
    public final void rule__XEvent__Alternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:976:1: ( ( 'where' ) | ( 'when' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==31) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:977:2: ( 'where' )
                    {
                    // InternalXMachine.g:977:2: ( 'where' )
                    // InternalXMachine.g:978:3: 'where'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getWhereKeyword_8_0_0()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getWhereKeyword_8_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:983:2: ( 'when' )
                    {
                    // InternalXMachine.g:983:2: ( 'when' )
                    // InternalXMachine.g:984:3: 'when'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getWhenKeyword_8_0_1()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:993:1: rule__XEvent__Alternatives_9_0 : ( ( 'then' ) | ( 'begin' ) );
    public final void rule__XEvent__Alternatives_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:997:1: ( ( 'then' ) | ( 'begin' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            else if ( (LA8_0==33) ) {
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
                    // InternalXMachine.g:998:2: ( 'then' )
                    {
                    // InternalXMachine.g:998:2: ( 'then' )
                    // InternalXMachine.g:999:3: 'then'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getThenKeyword_9_0_0()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getThenKeyword_9_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1004:2: ( 'begin' )
                    {
                    // InternalXMachine.g:1004:2: ( 'begin' )
                    // InternalXMachine.g:1005:3: 'begin'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getBeginKeyword_9_0_1()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1014:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_INT ) | ( RULE_ID ) | ( RULE_UNTRANSLATED_TOKEN ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1018:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_INT ) | ( RULE_ID ) | ( RULE_UNTRANSLATED_TOKEN ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 25:
            case 26:
            case 27:
            case 28:
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
                {
                alt9=1;
                }
                break;
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
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                {
                alt9=2;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
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
            case 139:
                {
                alt9=3;
                }
                break;
            case RULE_INT:
                {
                alt9=4;
                }
                break;
            case RULE_ID:
                {
                alt9=5;
                }
                break;
            case RULE_UNTRANSLATED_TOKEN:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:1019:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXMachine.g:1019:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXMachine.g:1020:3: ruleEVENTB_IDENTIFIER_KEYWORD
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
                    // InternalXMachine.g:1025:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXMachine.g:1025:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXMachine.g:1026:3: ruleEVENTB_PREDICATE_SYMBOLS
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
                    // InternalXMachine.g:1031:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXMachine.g:1031:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXMachine.g:1032:3: ruleEVENTB_EXPRESSION_SYMBOLS
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
                    // InternalXMachine.g:1037:2: ( RULE_INT )
                    {
                    // InternalXMachine.g:1037:2: ( RULE_INT )
                    // InternalXMachine.g:1038:3: RULE_INT
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
                    // InternalXMachine.g:1043:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:1043:2: ( RULE_ID )
                    // InternalXMachine.g:1044:3: RULE_ID
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
                    // InternalXMachine.g:1049:2: ( RULE_UNTRANSLATED_TOKEN )
                    {
                    // InternalXMachine.g:1049:2: ( RULE_UNTRANSLATED_TOKEN )
                    // InternalXMachine.g:1050:3: RULE_UNTRANSLATED_TOKEN
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
    // InternalXMachine.g:1059:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1063:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
            int alt10=23;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            case 36:
                {
                alt10=4;
                }
                break;
            case 37:
                {
                alt10=5;
                }
                break;
            case 38:
                {
                alt10=6;
                }
                break;
            case 39:
                {
                alt10=7;
                }
                break;
            case 40:
                {
                alt10=8;
                }
                break;
            case 41:
                {
                alt10=9;
                }
                break;
            case 42:
                {
                alt10=10;
                }
                break;
            case 43:
                {
                alt10=11;
                }
                break;
            case 44:
                {
                alt10=12;
                }
                break;
            case 45:
                {
                alt10=13;
                }
                break;
            case 46:
                {
                alt10=14;
                }
                break;
            case 47:
                {
                alt10=15;
                }
                break;
            case 48:
                {
                alt10=16;
                }
                break;
            case 49:
                {
                alt10=17;
                }
                break;
            case 50:
                {
                alt10=18;
                }
                break;
            case 26:
                {
                alt10=19;
                }
                break;
            case 27:
                {
                alt10=20;
                }
                break;
            case 51:
                {
                alt10=21;
                }
                break;
            case 52:
                {
                alt10=22;
                }
                break;
            case 28:
                {
                alt10=23;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalXMachine.g:1064:2: ( 'BOOL' )
                    {
                    // InternalXMachine.g:1064:2: ( 'BOOL' )
                    // InternalXMachine.g:1065:3: 'BOOL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1070:2: ( 'FALSE' )
                    {
                    // InternalXMachine.g:1070:2: ( 'FALSE' )
                    // InternalXMachine.g:1071:3: 'FALSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1076:2: ( 'TRUE' )
                    {
                    // InternalXMachine.g:1076:2: ( 'TRUE' )
                    // InternalXMachine.g:1077:3: 'TRUE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1082:2: ( 'bool' )
                    {
                    // InternalXMachine.g:1082:2: ( 'bool' )
                    // InternalXMachine.g:1083:3: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1088:2: ( 'card' )
                    {
                    // InternalXMachine.g:1088:2: ( 'card' )
                    // InternalXMachine.g:1089:3: 'card'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1094:2: ( 'dom' )
                    {
                    // InternalXMachine.g:1094:2: ( 'dom' )
                    // InternalXMachine.g:1095:3: 'dom'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1100:2: ( 'finite' )
                    {
                    // InternalXMachine.g:1100:2: ( 'finite' )
                    // InternalXMachine.g:1101:3: 'finite'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1106:2: ( 'id' )
                    {
                    // InternalXMachine.g:1106:2: ( 'id' )
                    // InternalXMachine.g:1107:3: 'id'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1112:2: ( 'inter' )
                    {
                    // InternalXMachine.g:1112:2: ( 'inter' )
                    // InternalXMachine.g:1113:3: 'inter'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1118:2: ( 'max' )
                    {
                    // InternalXMachine.g:1118:2: ( 'max' )
                    // InternalXMachine.g:1119:3: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1124:2: ( 'min' )
                    {
                    // InternalXMachine.g:1124:2: ( 'min' )
                    // InternalXMachine.g:1125:3: 'min'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1130:2: ( 'mod' )
                    {
                    // InternalXMachine.g:1130:2: ( 'mod' )
                    // InternalXMachine.g:1131:3: 'mod'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    }
                    match(input,44,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1136:2: ( 'pred' )
                    {
                    // InternalXMachine.g:1136:2: ( 'pred' )
                    // InternalXMachine.g:1137:3: 'pred'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    }
                    match(input,45,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1142:2: ( 'prj1' )
                    {
                    // InternalXMachine.g:1142:2: ( 'prj1' )
                    // InternalXMachine.g:1143:3: 'prj1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    }
                    match(input,46,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1148:2: ( 'prj2' )
                    {
                    // InternalXMachine.g:1148:2: ( 'prj2' )
                    // InternalXMachine.g:1149:3: 'prj2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    }
                    match(input,47,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1154:2: ( 'ran' )
                    {
                    // InternalXMachine.g:1154:2: ( 'ran' )
                    // InternalXMachine.g:1155:3: 'ran'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    }
                    match(input,48,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1160:2: ( 'succ' )
                    {
                    // InternalXMachine.g:1160:2: ( 'succ' )
                    // InternalXMachine.g:1161:3: 'succ'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    }
                    match(input,49,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1166:2: ( 'union' )
                    {
                    // InternalXMachine.g:1166:2: ( 'union' )
                    // InternalXMachine.g:1167:3: 'union'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    }
                    match(input,50,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1172:2: ( '\\u21151' )
                    {
                    // InternalXMachine.g:1172:2: ( '\\u21151' )
                    // InternalXMachine.g:1173:3: '\\u21151'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1178:2: ( '\\u2115' )
                    {
                    // InternalXMachine.g:1178:2: ( '\\u2115' )
                    // InternalXMachine.g:1179:3: '\\u2115'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1184:2: ( '\\u21191' )
                    {
                    // InternalXMachine.g:1184:2: ( '\\u21191' )
                    // InternalXMachine.g:1185:3: '\\u21191'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    }
                    match(input,51,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1190:2: ( '\\u2119' )
                    {
                    // InternalXMachine.g:1190:2: ( '\\u2119' )
                    // InternalXMachine.g:1191:3: '\\u2119'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    }
                    match(input,52,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1196:2: ( '\\u2124' )
                    {
                    // InternalXMachine.g:1196:2: ( '\\u2124' )
                    // InternalXMachine.g:1197:3: '\\u2124'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1206:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1210:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
            int alt11=31;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt11=1;
                }
                break;
            case 54:
                {
                alt11=2;
                }
                break;
            case 55:
                {
                alt11=3;
                }
                break;
            case 56:
                {
                alt11=4;
                }
                break;
            case 57:
                {
                alt11=5;
                }
                break;
            case 58:
                {
                alt11=6;
                }
                break;
            case 59:
                {
                alt11=7;
                }
                break;
            case 60:
                {
                alt11=8;
                }
                break;
            case 61:
                {
                alt11=9;
                }
                break;
            case 62:
                {
                alt11=10;
                }
                break;
            case 63:
                {
                alt11=11;
                }
                break;
            case 64:
                {
                alt11=12;
                }
                break;
            case 65:
                {
                alt11=13;
                }
                break;
            case 66:
                {
                alt11=14;
                }
                break;
            case 67:
                {
                alt11=15;
                }
                break;
            case 68:
                {
                alt11=16;
                }
                break;
            case 69:
                {
                alt11=17;
                }
                break;
            case 70:
                {
                alt11=18;
                }
                break;
            case 71:
                {
                alt11=19;
                }
                break;
            case 72:
                {
                alt11=20;
                }
                break;
            case 73:
                {
                alt11=21;
                }
                break;
            case 74:
                {
                alt11=22;
                }
                break;
            case 75:
                {
                alt11=23;
                }
                break;
            case 76:
                {
                alt11=24;
                }
                break;
            case 77:
                {
                alt11=25;
                }
                break;
            case 78:
                {
                alt11=26;
                }
                break;
            case 79:
                {
                alt11=27;
                }
                break;
            case 80:
                {
                alt11=28;
                }
                break;
            case 81:
                {
                alt11=29;
                }
                break;
            case 82:
                {
                alt11=30;
                }
                break;
            case 83:
                {
                alt11=31;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:1211:2: ( '(' )
                    {
                    // InternalXMachine.g:1211:2: ( '(' )
                    // InternalXMachine.g:1212:3: '('
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    }
                    match(input,53,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1217:2: ( ')' )
                    {
                    // InternalXMachine.g:1217:2: ( ')' )
                    // InternalXMachine.g:1218:3: ')'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    }
                    match(input,54,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1223:2: ( '\\u21D4' )
                    {
                    // InternalXMachine.g:1223:2: ( '\\u21D4' )
                    // InternalXMachine.g:1224:3: '\\u21D4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    }
                    match(input,55,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1229:2: ( '\\u21D2' )
                    {
                    // InternalXMachine.g:1229:2: ( '\\u21D2' )
                    // InternalXMachine.g:1230:3: '\\u21D2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    }
                    match(input,56,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1235:2: ( '\\u2227' )
                    {
                    // InternalXMachine.g:1235:2: ( '\\u2227' )
                    // InternalXMachine.g:1236:3: '\\u2227'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    }
                    match(input,57,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1241:2: ( '&' )
                    {
                    // InternalXMachine.g:1241:2: ( '&' )
                    // InternalXMachine.g:1242:3: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    }
                    match(input,58,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1247:2: ( '\\u2228' )
                    {
                    // InternalXMachine.g:1247:2: ( '\\u2228' )
                    // InternalXMachine.g:1248:3: '\\u2228'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    }
                    match(input,59,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1253:2: ( '\\u00AC' )
                    {
                    // InternalXMachine.g:1253:2: ( '\\u00AC' )
                    // InternalXMachine.g:1254:3: '\\u00AC'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    }
                    match(input,60,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1259:2: ( '\\u22A4' )
                    {
                    // InternalXMachine.g:1259:2: ( '\\u22A4' )
                    // InternalXMachine.g:1260:3: '\\u22A4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    }
                    match(input,61,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1265:2: ( '\\u22A5' )
                    {
                    // InternalXMachine.g:1265:2: ( '\\u22A5' )
                    // InternalXMachine.g:1266:3: '\\u22A5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    }
                    match(input,62,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1271:2: ( '\\u2200' )
                    {
                    // InternalXMachine.g:1271:2: ( '\\u2200' )
                    // InternalXMachine.g:1272:3: '\\u2200'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    }
                    match(input,63,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1277:2: ( '!' )
                    {
                    // InternalXMachine.g:1277:2: ( '!' )
                    // InternalXMachine.g:1278:3: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    }
                    match(input,64,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1283:2: ( '\\u2203' )
                    {
                    // InternalXMachine.g:1283:2: ( '\\u2203' )
                    // InternalXMachine.g:1284:3: '\\u2203'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    }
                    match(input,65,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1289:2: ( '#' )
                    {
                    // InternalXMachine.g:1289:2: ( '#' )
                    // InternalXMachine.g:1290:3: '#'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    }
                    match(input,66,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1295:2: ( ',' )
                    {
                    // InternalXMachine.g:1295:2: ( ',' )
                    // InternalXMachine.g:1296:3: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    }
                    match(input,67,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1301:2: ( '\\u00B7' )
                    {
                    // InternalXMachine.g:1301:2: ( '\\u00B7' )
                    // InternalXMachine.g:1302:3: '\\u00B7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    }
                    match(input,68,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1307:2: ( '.' )
                    {
                    // InternalXMachine.g:1307:2: ( '.' )
                    // InternalXMachine.g:1308:3: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    }
                    match(input,69,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1313:2: ( '=' )
                    {
                    // InternalXMachine.g:1313:2: ( '=' )
                    // InternalXMachine.g:1314:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    }
                    match(input,70,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1319:2: ( '\\u2260' )
                    {
                    // InternalXMachine.g:1319:2: ( '\\u2260' )
                    // InternalXMachine.g:1320:3: '\\u2260'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    }
                    match(input,71,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1325:2: ( '\\u2264' )
                    {
                    // InternalXMachine.g:1325:2: ( '\\u2264' )
                    // InternalXMachine.g:1326:3: '\\u2264'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    }
                    match(input,72,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1331:2: ( '<' )
                    {
                    // InternalXMachine.g:1331:2: ( '<' )
                    // InternalXMachine.g:1332:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    }
                    match(input,73,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1337:2: ( '\\u2265' )
                    {
                    // InternalXMachine.g:1337:2: ( '\\u2265' )
                    // InternalXMachine.g:1338:3: '\\u2265'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    }
                    match(input,74,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1343:2: ( '>' )
                    {
                    // InternalXMachine.g:1343:2: ( '>' )
                    // InternalXMachine.g:1344:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    }
                    match(input,75,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1349:2: ( '\\u2208' )
                    {
                    // InternalXMachine.g:1349:2: ( '\\u2208' )
                    // InternalXMachine.g:1350:3: '\\u2208'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    }
                    match(input,76,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1355:2: ( ':' )
                    {
                    // InternalXMachine.g:1355:2: ( ':' )
                    // InternalXMachine.g:1356:3: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    }
                    match(input,77,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1361:2: ( '\\u2209' )
                    {
                    // InternalXMachine.g:1361:2: ( '\\u2209' )
                    // InternalXMachine.g:1362:3: '\\u2209'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    }
                    match(input,78,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1367:2: ( '\\u2282' )
                    {
                    // InternalXMachine.g:1367:2: ( '\\u2282' )
                    // InternalXMachine.g:1368:3: '\\u2282'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    }
                    match(input,79,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1373:2: ( '\\u2284' )
                    {
                    // InternalXMachine.g:1373:2: ( '\\u2284' )
                    // InternalXMachine.g:1374:3: '\\u2284'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    }
                    match(input,80,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1379:2: ( '\\u2286' )
                    {
                    // InternalXMachine.g:1379:2: ( '\\u2286' )
                    // InternalXMachine.g:1380:3: '\\u2286'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    }
                    match(input,81,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1385:2: ( '\\u2288' )
                    {
                    // InternalXMachine.g:1385:2: ( '\\u2288' )
                    // InternalXMachine.g:1386:3: '\\u2288'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    }
                    match(input,82,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1391:2: ( 'partition' )
                    {
                    // InternalXMachine.g:1391:2: ( 'partition' )
                    // InternalXMachine.g:1392:3: 'partition'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
                    }
                    match(input,83,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1401:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1405:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
            int alt12=45;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt12=1;
                }
                break;
            case 14:
                {
                alt12=2;
                }
                break;
            case 15:
                {
                alt12=3;
                }
                break;
            case 16:
                {
                alt12=4;
                }
                break;
            case 17:
                {
                alt12=5;
                }
                break;
            case 18:
                {
                alt12=6;
                }
                break;
            case 19:
                {
                alt12=7;
                }
                break;
            case 20:
                {
                alt12=8;
                }
                break;
            case 21:
                {
                alt12=9;
                }
                break;
            case 22:
                {
                alt12=10;
                }
                break;
            case 23:
                {
                alt12=11;
                }
                break;
            case 84:
                {
                alt12=12;
                }
                break;
            case 85:
                {
                alt12=13;
                }
                break;
            case 86:
                {
                alt12=14;
                }
                break;
            case 87:
                {
                alt12=15;
                }
                break;
            case 88:
                {
                alt12=16;
                }
                break;
            case 89:
                {
                alt12=17;
                }
                break;
            case 90:
                {
                alt12=18;
                }
                break;
            case 24:
                {
                alt12=19;
                }
                break;
            case 91:
                {
                alt12=20;
                }
                break;
            case 92:
                {
                alt12=21;
                }
                break;
            case 93:
                {
                alt12=22;
                }
                break;
            case 94:
                {
                alt12=23;
                }
                break;
            case 95:
                {
                alt12=24;
                }
                break;
            case 96:
                {
                alt12=25;
                }
                break;
            case 97:
                {
                alt12=26;
                }
                break;
            case 98:
                {
                alt12=27;
                }
                break;
            case 99:
                {
                alt12=28;
                }
                break;
            case 100:
                {
                alt12=29;
                }
                break;
            case 101:
                {
                alt12=30;
                }
                break;
            case 102:
                {
                alt12=31;
                }
                break;
            case 103:
                {
                alt12=32;
                }
                break;
            case 139:
                {
                alt12=33;
                }
                break;
            case 104:
                {
                alt12=34;
                }
                break;
            case 105:
                {
                alt12=35;
                }
                break;
            case 106:
                {
                alt12=36;
                }
                break;
            case 107:
                {
                alt12=37;
                }
                break;
            case 108:
                {
                alt12=38;
                }
                break;
            case 109:
                {
                alt12=39;
                }
                break;
            case 110:
                {
                alt12=40;
                }
                break;
            case 111:
                {
                alt12=41;
                }
                break;
            case 112:
                {
                alt12=42;
                }
                break;
            case 113:
                {
                alt12=43;
                }
                break;
            case 114:
                {
                alt12=44;
                }
                break;
            case 115:
                {
                alt12=45;
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
                    // InternalXMachine.g:1406:2: ( '\\u2194' )
                    {
                    // InternalXMachine.g:1406:2: ( '\\u2194' )
                    // InternalXMachine.g:1407:3: '\\u2194'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1412:2: ( '\\uE100' )
                    {
                    // InternalXMachine.g:1412:2: ( '\\uE100' )
                    // InternalXMachine.g:1413:3: '\\uE100'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1418:2: ( '\\uE101' )
                    {
                    // InternalXMachine.g:1418:2: ( '\\uE101' )
                    // InternalXMachine.g:1419:3: '\\uE101'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1424:2: ( '\\uE102' )
                    {
                    // InternalXMachine.g:1424:2: ( '\\uE102' )
                    // InternalXMachine.g:1425:3: '\\uE102'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1430:2: ( '\\u21F8' )
                    {
                    // InternalXMachine.g:1430:2: ( '\\u21F8' )
                    // InternalXMachine.g:1431:3: '\\u21F8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1436:2: ( '\\u2192' )
                    {
                    // InternalXMachine.g:1436:2: ( '\\u2192' )
                    // InternalXMachine.g:1437:3: '\\u2192'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1442:2: ( '\\u2914' )
                    {
                    // InternalXMachine.g:1442:2: ( '\\u2914' )
                    // InternalXMachine.g:1443:3: '\\u2914'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1448:2: ( '\\u21A3' )
                    {
                    // InternalXMachine.g:1448:2: ( '\\u21A3' )
                    // InternalXMachine.g:1449:3: '\\u21A3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1454:2: ( '\\u2900' )
                    {
                    // InternalXMachine.g:1454:2: ( '\\u2900' )
                    // InternalXMachine.g:1455:3: '\\u2900'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1460:2: ( '\\u21A0' )
                    {
                    // InternalXMachine.g:1460:2: ( '\\u21A0' )
                    // InternalXMachine.g:1461:3: '\\u21A0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1466:2: ( '\\u2916' )
                    {
                    // InternalXMachine.g:1466:2: ( '\\u2916' )
                    // InternalXMachine.g:1467:3: '\\u2916'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1472:2: ( '{' )
                    {
                    // InternalXMachine.g:1472:2: ( '{' )
                    // InternalXMachine.g:1473:3: '{'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    }
                    match(input,84,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1478:2: ( '}' )
                    {
                    // InternalXMachine.g:1478:2: ( '}' )
                    // InternalXMachine.g:1479:3: '}'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    }
                    match(input,85,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1484:2: ( '\\u21A6' )
                    {
                    // InternalXMachine.g:1484:2: ( '\\u21A6' )
                    // InternalXMachine.g:1485:3: '\\u21A6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    }
                    match(input,86,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1490:2: ( '\\u2205' )
                    {
                    // InternalXMachine.g:1490:2: ( '\\u2205' )
                    // InternalXMachine.g:1491:3: '\\u2205'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    }
                    match(input,87,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1496:2: ( '\\u2229' )
                    {
                    // InternalXMachine.g:1496:2: ( '\\u2229' )
                    // InternalXMachine.g:1497:3: '\\u2229'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    }
                    match(input,88,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1502:2: ( '\\u222A' )
                    {
                    // InternalXMachine.g:1502:2: ( '\\u222A' )
                    // InternalXMachine.g:1503:3: '\\u222A'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    }
                    match(input,89,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1508:2: ( '\\u2216' )
                    {
                    // InternalXMachine.g:1508:2: ( '\\u2216' )
                    // InternalXMachine.g:1509:3: '\\u2216'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    }
                    match(input,90,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1514:2: ( '\\u00D7' )
                    {
                    // InternalXMachine.g:1514:2: ( '\\u00D7' )
                    // InternalXMachine.g:1515:3: '\\u00D7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1520:2: ( '[' )
                    {
                    // InternalXMachine.g:1520:2: ( '[' )
                    // InternalXMachine.g:1521:3: '['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    }
                    match(input,91,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1526:2: ( ']' )
                    {
                    // InternalXMachine.g:1526:2: ( ']' )
                    // InternalXMachine.g:1527:3: ']'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    }
                    match(input,92,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1532:2: ( '\\uE103' )
                    {
                    // InternalXMachine.g:1532:2: ( '\\uE103' )
                    // InternalXMachine.g:1533:3: '\\uE103'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    }
                    match(input,93,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1538:2: ( '\\u2218' )
                    {
                    // InternalXMachine.g:1538:2: ( '\\u2218' )
                    // InternalXMachine.g:1539:3: '\\u2218'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    }
                    match(input,94,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1544:2: ( ';' )
                    {
                    // InternalXMachine.g:1544:2: ( ';' )
                    // InternalXMachine.g:1545:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    }
                    match(input,95,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1550:2: ( '\\u2297' )
                    {
                    // InternalXMachine.g:1550:2: ( '\\u2297' )
                    // InternalXMachine.g:1551:3: '\\u2297'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    }
                    match(input,96,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1556:2: ( '\\u2225' )
                    {
                    // InternalXMachine.g:1556:2: ( '\\u2225' )
                    // InternalXMachine.g:1557:3: '\\u2225'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    }
                    match(input,97,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1562:2: ( '\\u223C' )
                    {
                    // InternalXMachine.g:1562:2: ( '\\u223C' )
                    // InternalXMachine.g:1563:3: '\\u223C'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    }
                    match(input,98,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1568:2: ( '\\u25C1' )
                    {
                    // InternalXMachine.g:1568:2: ( '\\u25C1' )
                    // InternalXMachine.g:1569:3: '\\u25C1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    }
                    match(input,99,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1574:2: ( '\\u2A64' )
                    {
                    // InternalXMachine.g:1574:2: ( '\\u2A64' )
                    // InternalXMachine.g:1575:3: '\\u2A64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    }
                    match(input,100,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1580:2: ( '\\u25B7' )
                    {
                    // InternalXMachine.g:1580:2: ( '\\u25B7' )
                    // InternalXMachine.g:1581:3: '\\u25B7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    }
                    match(input,101,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1586:2: ( '\\u2A65' )
                    {
                    // InternalXMachine.g:1586:2: ( '\\u2A65' )
                    // InternalXMachine.g:1587:3: '\\u2A65'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    }
                    match(input,102,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalXMachine.g:1592:2: ( '\\u03BB' )
                    {
                    // InternalXMachine.g:1592:2: ( '\\u03BB' )
                    // InternalXMachine.g:1593:3: '\\u03BB'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    }
                    match(input,103,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalXMachine.g:1598:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalXMachine.g:1598:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalXMachine.g:1599:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    }
                    // InternalXMachine.g:1600:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalXMachine.g:1600:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
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
                    // InternalXMachine.g:1604:2: ( '\\u22C3' )
                    {
                    // InternalXMachine.g:1604:2: ( '\\u22C3' )
                    // InternalXMachine.g:1605:3: '\\u22C3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    }
                    match(input,104,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalXMachine.g:1610:2: ( '\\u2223' )
                    {
                    // InternalXMachine.g:1610:2: ( '\\u2223' )
                    // InternalXMachine.g:1611:3: '\\u2223'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    }
                    match(input,105,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalXMachine.g:1616:2: ( '\\u2025' )
                    {
                    // InternalXMachine.g:1616:2: ( '\\u2025' )
                    // InternalXMachine.g:1617:3: '\\u2025'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    }
                    match(input,106,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalXMachine.g:1622:2: ( '+' )
                    {
                    // InternalXMachine.g:1622:2: ( '+' )
                    // InternalXMachine.g:1623:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    }
                    match(input,107,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalXMachine.g:1628:2: ( '\\u2212' )
                    {
                    // InternalXMachine.g:1628:2: ( '\\u2212' )
                    // InternalXMachine.g:1629:3: '\\u2212'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    }
                    match(input,108,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalXMachine.g:1634:2: ( '-' )
                    {
                    // InternalXMachine.g:1634:2: ( '-' )
                    // InternalXMachine.g:1635:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    }
                    match(input,109,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalXMachine.g:1640:2: ( '\\u2217' )
                    {
                    // InternalXMachine.g:1640:2: ( '\\u2217' )
                    // InternalXMachine.g:1641:3: '\\u2217'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    }
                    match(input,110,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalXMachine.g:1646:2: ( '*' )
                    {
                    // InternalXMachine.g:1646:2: ( '*' )
                    // InternalXMachine.g:1647:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    }
                    match(input,111,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalXMachine.g:1652:2: ( '\\u00F7' )
                    {
                    // InternalXMachine.g:1652:2: ( '\\u00F7' )
                    // InternalXMachine.g:1653:3: '\\u00F7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    }
                    match(input,112,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalXMachine.g:1658:2: ( '/' )
                    {
                    // InternalXMachine.g:1658:2: ( '/' )
                    // InternalXMachine.g:1659:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    }
                    match(input,113,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalXMachine.g:1664:2: ( '^' )
                    {
                    // InternalXMachine.g:1664:2: ( '^' )
                    // InternalXMachine.g:1665:3: '^'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    }
                    match(input,114,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalXMachine.g:1670:2: ( '\\\\' )
                    {
                    // InternalXMachine.g:1670:2: ( '\\\\' )
                    // InternalXMachine.g:1671:3: '\\\\'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
                    }
                    match(input,115,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__XRecord__Alternatives_1"
    // InternalXMachine.g:1680:1: rule__XRecord__Alternatives_1 : ( ( ( rule__XRecord__ExtendedAssignment_1_0 ) ) | ( ( rule__XRecord__RefinedAssignment_1_1 ) ) );
    public final void rule__XRecord__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1684:1: ( ( ( rule__XRecord__ExtendedAssignment_1_0 ) ) | ( ( rule__XRecord__RefinedAssignment_1_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==147) ) {
                alt13=1;
            }
            else if ( (LA13_0==148) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:1685:2: ( ( rule__XRecord__ExtendedAssignment_1_0 ) )
                    {
                    // InternalXMachine.g:1685:2: ( ( rule__XRecord__ExtendedAssignment_1_0 ) )
                    // InternalXMachine.g:1686:3: ( rule__XRecord__ExtendedAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getExtendedAssignment_1_0()); 
                    }
                    // InternalXMachine.g:1687:3: ( rule__XRecord__ExtendedAssignment_1_0 )
                    // InternalXMachine.g:1687:4: rule__XRecord__ExtendedAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__ExtendedAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getExtendedAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1691:2: ( ( rule__XRecord__RefinedAssignment_1_1 ) )
                    {
                    // InternalXMachine.g:1691:2: ( ( rule__XRecord__RefinedAssignment_1_1 ) )
                    // InternalXMachine.g:1692:3: ( rule__XRecord__RefinedAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getRefinedAssignment_1_1()); 
                    }
                    // InternalXMachine.g:1693:3: ( rule__XRecord__RefinedAssignment_1_1 )
                    // InternalXMachine.g:1693:4: rule__XRecord__RefinedAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__RefinedAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getRefinedAssignment_1_1()); 
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
    // $ANTLR end "rule__XRecord__Alternatives_1"


    // $ANTLR start "rule__XRecord__Alternatives_5"
    // InternalXMachine.g:1701:1: rule__XRecord__Alternatives_5 : ( ( ( rule__XRecord__Group_5_0__0 ) ) | ( ( rule__XRecord__Group_5_1__0 ) ) );
    public final void rule__XRecord__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1705:1: ( ( ( rule__XRecord__Group_5_0__0 ) ) | ( ( rule__XRecord__Group_5_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==143) ) {
                alt14=1;
            }
            else if ( (LA14_0==144) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:1706:2: ( ( rule__XRecord__Group_5_0__0 ) )
                    {
                    // InternalXMachine.g:1706:2: ( ( rule__XRecord__Group_5_0__0 ) )
                    // InternalXMachine.g:1707:3: ( rule__XRecord__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getGroup_5_0()); 
                    }
                    // InternalXMachine.g:1708:3: ( rule__XRecord__Group_5_0__0 )
                    // InternalXMachine.g:1708:4: rule__XRecord__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getGroup_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1712:2: ( ( rule__XRecord__Group_5_1__0 ) )
                    {
                    // InternalXMachine.g:1712:2: ( ( rule__XRecord__Group_5_1__0 ) )
                    // InternalXMachine.g:1713:3: ( rule__XRecord__Group_5_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXRecordAccess().getGroup_5_1()); 
                    }
                    // InternalXMachine.g:1714:3: ( rule__XRecord__Group_5_1__0 )
                    // InternalXMachine.g:1714:4: rule__XRecord__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__Group_5_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXRecordAccess().getGroup_5_1()); 
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
    // $ANTLR end "rule__XRecord__Alternatives_5"


    // $ANTLR start "rule__FieldType__Alternatives"
    // InternalXMachine.g:1722:1: rule__FieldType__Alternatives : ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1726:1: ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=25 && LA15_0<=28)||(LA15_0>=34 && LA15_0<=52)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:1727:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:1727:2: ( RULE_ID )
                    // InternalXMachine.g:1728:3: RULE_ID
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
                    // InternalXMachine.g:1733:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXMachine.g:1733:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXMachine.g:1734:3: ruleEVENTB_IDENTIFIER_KEYWORD
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
    // InternalXMachine.g:1743:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1747:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt16=1;
                }
                break;
            case 117:
                {
                alt16=2;
                }
                break;
            case 118:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:1748:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:1748:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:1749:3: ( 'ordinary' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:1750:3: ( 'ordinary' )
                    // InternalXMachine.g:1750:4: 'ordinary'
                    {
                    match(input,116,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1754:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:1754:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:1755:3: ( 'convergent' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:1756:3: ( 'convergent' )
                    // InternalXMachine.g:1756:4: 'convergent'
                    {
                    match(input,117,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1760:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:1760:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:1761:3: ( 'anticipated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:1762:3: ( 'anticipated' )
                    // InternalXMachine.g:1762:4: 'anticipated'
                    {
                    match(input,118,FOLLOW_2); if (state.failed) return ;

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
    // InternalXMachine.g:1770:1: rule__Multiplicity__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1774:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt17=1;
                }
                break;
            case 120:
                {
                alt17=2;
                }
                break;
            case 121:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:1775:2: ( ( 'one' ) )
                    {
                    // InternalXMachine.g:1775:2: ( ( 'one' ) )
                    // InternalXMachine.g:1776:3: ( 'one' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:1777:3: ( 'one' )
                    // InternalXMachine.g:1777:4: 'one'
                    {
                    match(input,119,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1781:2: ( ( 'many' ) )
                    {
                    // InternalXMachine.g:1781:2: ( ( 'many' ) )
                    // InternalXMachine.g:1782:3: ( 'many' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:1783:3: ( 'many' )
                    // InternalXMachine.g:1783:4: 'many'
                    {
                    match(input,120,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1787:2: ( ( 'opt' ) )
                    {
                    // InternalXMachine.g:1787:2: ( ( 'opt' ) )
                    // InternalXMachine.g:1788:3: ( 'opt' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:1789:3: ( 'opt' )
                    // InternalXMachine.g:1789:4: 'opt'
                    {
                    match(input,121,FOLLOW_2); if (state.failed) return ;

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
    // InternalXMachine.g:1797:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1801:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:1802:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
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
    // InternalXMachine.g:1809:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1813:1: ( ( () ) )
            // InternalXMachine.g:1814:1: ( () )
            {
            // InternalXMachine.g:1814:1: ( () )
            // InternalXMachine.g:1815:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            }
            // InternalXMachine.g:1816:2: ()
            // InternalXMachine.g:1816:3: 
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
    // InternalXMachine.g:1824:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1828:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:1829:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
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
    // InternalXMachine.g:1836:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__CommentAssignment_1 )? ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1840:1: ( ( ( rule__Machine__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1841:1: ( ( rule__Machine__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1841:1: ( ( rule__Machine__CommentAssignment_1 )? )
            // InternalXMachine.g:1842:2: ( rule__Machine__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:1843:2: ( rule__Machine__CommentAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:1843:3: rule__Machine__CommentAssignment_1
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
    // InternalXMachine.g:1851:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1855:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:1856:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
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
    // InternalXMachine.g:1863:1: rule__Machine__Group__2__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1867:1: ( ( 'machine' ) )
            // InternalXMachine.g:1868:1: ( 'machine' )
            {
            // InternalXMachine.g:1868:1: ( 'machine' )
            // InternalXMachine.g:1869:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineKeyword_2()); 
            }
            match(input,122,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1878:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1882:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:1883:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
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
    // InternalXMachine.g:1890:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__NameAssignment_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1894:1: ( ( ( rule__Machine__NameAssignment_3 ) ) )
            // InternalXMachine.g:1895:1: ( ( rule__Machine__NameAssignment_3 ) )
            {
            // InternalXMachine.g:1895:1: ( ( rule__Machine__NameAssignment_3 ) )
            // InternalXMachine.g:1896:2: ( rule__Machine__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:1897:2: ( rule__Machine__NameAssignment_3 )
            // InternalXMachine.g:1897:3: rule__Machine__NameAssignment_3
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
    // InternalXMachine.g:1905:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1909:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:1910:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
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
    // InternalXMachine.g:1917:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__UnorderedGroup_4 ) ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1921:1: ( ( ( rule__Machine__UnorderedGroup_4 ) ) )
            // InternalXMachine.g:1922:1: ( ( rule__Machine__UnorderedGroup_4 ) )
            {
            // InternalXMachine.g:1922:1: ( ( rule__Machine__UnorderedGroup_4 ) )
            // InternalXMachine.g:1923:2: ( rule__Machine__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getUnorderedGroup_4()); 
            }
            // InternalXMachine.g:1924:2: ( rule__Machine__UnorderedGroup_4 )
            // InternalXMachine.g:1924:3: rule__Machine__UnorderedGroup_4
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
    // InternalXMachine.g:1932:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1936:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:1937:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
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
    // InternalXMachine.g:1944:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1948:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:1949:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:1949:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:1950:2: ( rule__Machine__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_5()); 
            }
            // InternalXMachine.g:1951:2: ( rule__Machine__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==126) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:1951:3: rule__Machine__Group_5__0
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
    // InternalXMachine.g:1959:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1963:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXMachine.g:1964:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
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
    // InternalXMachine.g:1971:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Alternatives_6 )* ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1975:1: ( ( ( rule__Machine__Alternatives_6 )* ) )
            // InternalXMachine.g:1976:1: ( ( rule__Machine__Alternatives_6 )* )
            {
            // InternalXMachine.g:1976:1: ( ( rule__Machine__Alternatives_6 )* )
            // InternalXMachine.g:1977:2: ( rule__Machine__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getAlternatives_6()); 
            }
            // InternalXMachine.g:1978:2: ( rule__Machine__Alternatives_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING||LA20_0==29||(LA20_0>=116 && LA20_0<=118)||(LA20_0>=127 && LA20_0<=128)||(LA20_0>=133 && LA20_0<=135)||LA20_0==141||LA20_0==145||(LA20_0>=147 && LA20_0<=148)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXMachine.g:1978:3: rule__Machine__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__Alternatives_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalXMachine.g:1986:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1990:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXMachine.g:1991:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
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
    // InternalXMachine.g:1998:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2002:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // InternalXMachine.g:2003:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // InternalXMachine.g:2003:1: ( ( rule__Machine__Group_7__0 )? )
            // InternalXMachine.g:2004:2: ( rule__Machine__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_7()); 
            }
            // InternalXMachine.g:2005:2: ( rule__Machine__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==129) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:2005:3: rule__Machine__Group_7__0
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
    // InternalXMachine.g:2013:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2017:1: ( rule__Machine__Group__8__Impl )
            // InternalXMachine.g:2018:2: rule__Machine__Group__8__Impl
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
    // InternalXMachine.g:2024:1: rule__Machine__Group__8__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2028:1: ( ( 'end' ) )
            // InternalXMachine.g:2029:1: ( 'end' )
            {
            // InternalXMachine.g:2029:1: ( 'end' )
            // InternalXMachine.g:2030:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEndKeyword_8()); 
            }
            match(input,123,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2040:1: rule__Machine__Group_4_1__0 : rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1 ;
    public final void rule__Machine__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2044:1: ( rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1 )
            // InternalXMachine.g:2045:2: rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1
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
    // InternalXMachine.g:2052:1: rule__Machine__Group_4_1__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2056:1: ( ( 'refines' ) )
            // InternalXMachine.g:2057:1: ( 'refines' )
            {
            // InternalXMachine.g:2057:1: ( 'refines' )
            // InternalXMachine.g:2058:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesKeyword_4_1_0()); 
            }
            match(input,124,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2067:1: rule__Machine__Group_4_1__1 : rule__Machine__Group_4_1__1__Impl ;
    public final void rule__Machine__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2071:1: ( rule__Machine__Group_4_1__1__Impl )
            // InternalXMachine.g:2072:2: rule__Machine__Group_4_1__1__Impl
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
    // InternalXMachine.g:2078:1: rule__Machine__Group_4_1__1__Impl : ( ( rule__Machine__RefinesAssignment_4_1_1 ) ) ;
    public final void rule__Machine__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2082:1: ( ( ( rule__Machine__RefinesAssignment_4_1_1 ) ) )
            // InternalXMachine.g:2083:1: ( ( rule__Machine__RefinesAssignment_4_1_1 ) )
            {
            // InternalXMachine.g:2083:1: ( ( rule__Machine__RefinesAssignment_4_1_1 ) )
            // InternalXMachine.g:2084:2: ( rule__Machine__RefinesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesAssignment_4_1_1()); 
            }
            // InternalXMachine.g:2085:2: ( rule__Machine__RefinesAssignment_4_1_1 )
            // InternalXMachine.g:2085:3: rule__Machine__RefinesAssignment_4_1_1
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
    // InternalXMachine.g:2094:1: rule__Machine__Group_4_2__0 : rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 ;
    public final void rule__Machine__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2098:1: ( rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 )
            // InternalXMachine.g:2099:2: rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1
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
    // InternalXMachine.g:2106:1: rule__Machine__Group_4_2__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2110:1: ( ( 'sees' ) )
            // InternalXMachine.g:2111:1: ( 'sees' )
            {
            // InternalXMachine.g:2111:1: ( 'sees' )
            // InternalXMachine.g:2112:2: 'sees'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesKeyword_4_2_0()); 
            }
            match(input,125,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2121:1: rule__Machine__Group_4_2__1 : rule__Machine__Group_4_2__1__Impl ;
    public final void rule__Machine__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2125:1: ( rule__Machine__Group_4_2__1__Impl )
            // InternalXMachine.g:2126:2: rule__Machine__Group_4_2__1__Impl
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
    // InternalXMachine.g:2132:1: rule__Machine__Group_4_2__1__Impl : ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) ) ;
    public final void rule__Machine__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2136:1: ( ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) ) )
            // InternalXMachine.g:2137:1: ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) )
            {
            // InternalXMachine.g:2137:1: ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) )
            // InternalXMachine.g:2138:2: ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* )
            {
            // InternalXMachine.g:2138:2: ( ( rule__Machine__SeesAssignment_4_2_1 ) )
            // InternalXMachine.g:2139:3: ( rule__Machine__SeesAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }
            // InternalXMachine.g:2140:3: ( rule__Machine__SeesAssignment_4_2_1 )
            // InternalXMachine.g:2140:4: rule__Machine__SeesAssignment_4_2_1
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

            // InternalXMachine.g:2143:2: ( ( rule__Machine__SeesAssignment_4_2_1 )* )
            // InternalXMachine.g:2144:3: ( rule__Machine__SeesAssignment_4_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }
            // InternalXMachine.g:2145:3: ( rule__Machine__SeesAssignment_4_2_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXMachine.g:2145:4: rule__Machine__SeesAssignment_4_2_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Machine__SeesAssignment_4_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalXMachine.g:2155:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2159:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:2160:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
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
    // InternalXMachine.g:2167:1: rule__Machine__Group_5__0__Impl : ( 'contains' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2171:1: ( ( 'contains' ) )
            // InternalXMachine.g:2172:1: ( 'contains' )
            {
            // InternalXMachine.g:2172:1: ( 'contains' )
            // InternalXMachine.g:2173:2: 'contains'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getContainsKeyword_5_0()); 
            }
            match(input,126,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2182:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2186:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:2187:2: rule__Machine__Group_5__1__Impl
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
    // InternalXMachine.g:2193:1: rule__Machine__Group_5__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2197:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) ) )
            // InternalXMachine.g:2198:1: ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:2198:1: ( ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* ) )
            // InternalXMachine.g:2199:2: ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* )
            {
            // InternalXMachine.g:2199:2: ( ( rule__Machine__OrderedChildrenAssignment_5_1 ) )
            // InternalXMachine.g:2200:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_5_1()); 
            }
            // InternalXMachine.g:2201:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )
            // InternalXMachine.g:2201:4: rule__Machine__OrderedChildrenAssignment_5_1
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

            // InternalXMachine.g:2204:2: ( ( rule__Machine__OrderedChildrenAssignment_5_1 )* )
            // InternalXMachine.g:2205:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_5_1()); 
            }
            // InternalXMachine.g:2206:3: ( rule__Machine__OrderedChildrenAssignment_5_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXMachine.g:2206:4: rule__Machine__OrderedChildrenAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Machine__OrderedChildrenAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalXMachine.g:2216:1: rule__Machine__Group_6_0__0 : rule__Machine__Group_6_0__0__Impl rule__Machine__Group_6_0__1 ;
    public final void rule__Machine__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2220:1: ( rule__Machine__Group_6_0__0__Impl rule__Machine__Group_6_0__1 )
            // InternalXMachine.g:2221:2: rule__Machine__Group_6_0__0__Impl rule__Machine__Group_6_0__1
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
    // InternalXMachine.g:2228:1: rule__Machine__Group_6_0__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2232:1: ( ( 'variables' ) )
            // InternalXMachine.g:2233:1: ( 'variables' )
            {
            // InternalXMachine.g:2233:1: ( 'variables' )
            // InternalXMachine.g:2234:2: 'variables'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesKeyword_6_0_0()); 
            }
            match(input,127,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariablesKeyword_6_0_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:2243:1: rule__Machine__Group_6_0__1 : rule__Machine__Group_6_0__1__Impl ;
    public final void rule__Machine__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2247:1: ( rule__Machine__Group_6_0__1__Impl )
            // InternalXMachine.g:2248:2: rule__Machine__Group_6_0__1__Impl
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
    // InternalXMachine.g:2254:1: rule__Machine__Group_6_0__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) ) ;
    public final void rule__Machine__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2258:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) ) )
            // InternalXMachine.g:2259:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) )
            {
            // InternalXMachine.g:2259:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* ) )
            // InternalXMachine.g:2260:2: ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* )
            {
            // InternalXMachine.g:2260:2: ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 ) )
            // InternalXMachine.g:2261:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_0_1()); 
            }
            // InternalXMachine.g:2262:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )
            // InternalXMachine.g:2262:4: rule__Machine__OrderedChildrenAssignment_6_0_1
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

            // InternalXMachine.g:2265:2: ( ( rule__Machine__OrderedChildrenAssignment_6_0_1 )* )
            // InternalXMachine.g:2266:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_0_1()); 
            }
            // InternalXMachine.g:2267:3: ( rule__Machine__OrderedChildrenAssignment_6_0_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_ID) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXMachine.g:2267:4: rule__Machine__OrderedChildrenAssignment_6_0_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Machine__OrderedChildrenAssignment_6_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalXMachine.g:2277:1: rule__Machine__Group_6_2__0 : rule__Machine__Group_6_2__0__Impl rule__Machine__Group_6_2__1 ;
    public final void rule__Machine__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2281:1: ( rule__Machine__Group_6_2__0__Impl rule__Machine__Group_6_2__1 )
            // InternalXMachine.g:2282:2: rule__Machine__Group_6_2__0__Impl rule__Machine__Group_6_2__1
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
    // InternalXMachine.g:2289:1: rule__Machine__Group_6_2__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2293:1: ( ( 'invariants' ) )
            // InternalXMachine.g:2294:1: ( 'invariants' )
            {
            // InternalXMachine.g:2294:1: ( 'invariants' )
            // InternalXMachine.g:2295:2: 'invariants'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsKeyword_6_2_0()); 
            }
            match(input,128,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsKeyword_6_2_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:2304:1: rule__Machine__Group_6_2__1 : rule__Machine__Group_6_2__1__Impl ;
    public final void rule__Machine__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2308:1: ( rule__Machine__Group_6_2__1__Impl )
            // InternalXMachine.g:2309:2: rule__Machine__Group_6_2__1__Impl
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
    // InternalXMachine.g:2315:1: rule__Machine__Group_6_2__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) ) ;
    public final void rule__Machine__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2319:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) ) )
            // InternalXMachine.g:2320:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) )
            {
            // InternalXMachine.g:2320:1: ( ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* ) )
            // InternalXMachine.g:2321:2: ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* )
            {
            // InternalXMachine.g:2321:2: ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 ) )
            // InternalXMachine.g:2322:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_2_1()); 
            }
            // InternalXMachine.g:2323:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )
            // InternalXMachine.g:2323:4: rule__Machine__OrderedChildrenAssignment_6_2_1
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

            // InternalXMachine.g:2326:2: ( ( rule__Machine__OrderedChildrenAssignment_6_2_1 )* )
            // InternalXMachine.g:2327:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_6_2_1()); 
            }
            // InternalXMachine.g:2328:3: ( rule__Machine__OrderedChildrenAssignment_6_2_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==RULE_XLABEL) ) {
                        alt25=1;
                    }


                }
                else if ( (LA25_0==RULE_XLABEL) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXMachine.g:2328:4: rule__Machine__OrderedChildrenAssignment_6_2_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Machine__OrderedChildrenAssignment_6_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalXMachine.g:2338:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2342:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:2343:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
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
    // InternalXMachine.g:2350:1: rule__Machine__Group_7__0__Impl : ( 'records' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2354:1: ( ( 'records' ) )
            // InternalXMachine.g:2355:1: ( 'records' )
            {
            // InternalXMachine.g:2355:1: ( 'records' )
            // InternalXMachine.g:2356:2: 'records'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRecordsKeyword_7_0()); 
            }
            match(input,129,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRecordsKeyword_7_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:2365:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2369:1: ( rule__Machine__Group_7__1__Impl )
            // InternalXMachine.g:2370:2: rule__Machine__Group_7__1__Impl
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
    // InternalXMachine.g:2376:1: rule__Machine__Group_7__1__Impl : ( ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2380:1: ( ( ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* ) ) )
            // InternalXMachine.g:2381:1: ( ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:2381:1: ( ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* ) )
            // InternalXMachine.g:2382:2: ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) ) ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* )
            {
            // InternalXMachine.g:2382:2: ( ( rule__Machine__OrderedChildrenAssignment_7_1 ) )
            // InternalXMachine.g:2383:3: ( rule__Machine__OrderedChildrenAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_7_1()); 
            }
            // InternalXMachine.g:2384:3: ( rule__Machine__OrderedChildrenAssignment_7_1 )
            // InternalXMachine.g:2384:4: rule__Machine__OrderedChildrenAssignment_7_1
            {
            pushFollow(FOLLOW_15);
            rule__Machine__OrderedChildrenAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_7_1()); 
            }

            }

            // InternalXMachine.g:2387:2: ( ( rule__Machine__OrderedChildrenAssignment_7_1 )* )
            // InternalXMachine.g:2388:3: ( rule__Machine__OrderedChildrenAssignment_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_7_1()); 
            }
            // InternalXMachine.g:2389:3: ( rule__Machine__OrderedChildrenAssignment_7_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==141||(LA26_0>=147 && LA26_0<=148)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXMachine.g:2389:4: rule__Machine__OrderedChildrenAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Machine__OrderedChildrenAssignment_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalXMachine.g:2399:1: rule__MContains__Group__0 : rule__MContains__Group__0__Impl rule__MContains__Group__1 ;
    public final void rule__MContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2403:1: ( rule__MContains__Group__0__Impl rule__MContains__Group__1 )
            // InternalXMachine.g:2404:2: rule__MContains__Group__0__Impl rule__MContains__Group__1
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
    // InternalXMachine.g:2411:1: rule__MContains__Group__0__Impl : ( () ) ;
    public final void rule__MContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2415:1: ( ( () ) )
            // InternalXMachine.g:2416:1: ( () )
            {
            // InternalXMachine.g:2416:1: ( () )
            // InternalXMachine.g:2417:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getContainmentAction_0()); 
            }
            // InternalXMachine.g:2418:2: ()
            // InternalXMachine.g:2418:3: 
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
    // InternalXMachine.g:2426:1: rule__MContains__Group__1 : rule__MContains__Group__1__Impl ;
    public final void rule__MContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2430:1: ( rule__MContains__Group__1__Impl )
            // InternalXMachine.g:2431:2: rule__MContains__Group__1__Impl
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
    // InternalXMachine.g:2437:1: rule__MContains__Group__1__Impl : ( ( rule__MContains__ExtensionAssignment_1 ) ) ;
    public final void rule__MContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2441:1: ( ( ( rule__MContains__ExtensionAssignment_1 ) ) )
            // InternalXMachine.g:2442:1: ( ( rule__MContains__ExtensionAssignment_1 ) )
            {
            // InternalXMachine.g:2442:1: ( ( rule__MContains__ExtensionAssignment_1 ) )
            // InternalXMachine.g:2443:2: ( rule__MContains__ExtensionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionAssignment_1()); 
            }
            // InternalXMachine.g:2444:2: ( rule__MContains__ExtensionAssignment_1 )
            // InternalXMachine.g:2444:3: rule__MContains__ExtensionAssignment_1
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
    // InternalXMachine.g:2453:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2457:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:2458:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalXMachine.g:2465:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2469:1: ( ( () ) )
            // InternalXMachine.g:2470:1: ( () )
            {
            // InternalXMachine.g:2470:1: ( () )
            // InternalXMachine.g:2471:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            }
            // InternalXMachine.g:2472:2: ()
            // InternalXMachine.g:2472:3: 
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
    // InternalXMachine.g:2480:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2484:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:2485:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalXMachine.g:2492:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2496:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:2497:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:2497:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:2498:2: ( rule__MIncludes__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2499:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:2499:3: rule__MIncludes__Group_1__0
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
    // InternalXMachine.g:2507:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2511:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:2512:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalXMachine.g:2519:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2523:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:2524:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:2524:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:2525:2: ( rule__MIncludes__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            }
            // InternalXMachine.g:2526:2: ( rule__MIncludes__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==131) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:2526:3: rule__MIncludes__Group_2__0
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
    // InternalXMachine.g:2534:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2538:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:2539:2: rule__MIncludes__Group__3__Impl
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
    // InternalXMachine.g:2545:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2549:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:2550:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:2550:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:2551:2: ( rule__MIncludes__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            }
            // InternalXMachine.g:2552:2: ( rule__MIncludes__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==132) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:2552:3: rule__MIncludes__Group_3__0
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
    // InternalXMachine.g:2561:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2565:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:2566:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
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
    // InternalXMachine.g:2573:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2577:1: ( ( 'includes' ) )
            // InternalXMachine.g:2578:1: ( 'includes' )
            {
            // InternalXMachine.g:2578:1: ( 'includes' )
            // InternalXMachine.g:2579:2: 'includes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            }
            match(input,130,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2588:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2592:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:2593:2: rule__MIncludes__Group_1__1__Impl
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
    // InternalXMachine.g:2599:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2603:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:2604:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:2604:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:2605:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            }
            // InternalXMachine.g:2606:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:2606:3: rule__MIncludes__AbstractMachineAssignment_1_1
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
    // InternalXMachine.g:2615:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2619:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:2620:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
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
    // InternalXMachine.g:2627:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2631:1: ( ( 'to' ) )
            // InternalXMachine.g:2632:1: ( 'to' )
            {
            // InternalXMachine.g:2632:1: ( 'to' )
            // InternalXMachine.g:2633:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            }
            match(input,131,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2642:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2646:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:2647:2: rule__MIncludes__Group_2__1__Impl
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
    // InternalXMachine.g:2653:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2657:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:2658:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:2658:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:2659:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            }
            // InternalXMachine.g:2660:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:2660:3: rule__MIncludes__ConcreteMachineAssignment_2_1
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
    // InternalXMachine.g:2669:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2673:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:2674:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
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
    // InternalXMachine.g:2681:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2685:1: ( ( 'as' ) )
            // InternalXMachine.g:2686:1: ( 'as' )
            {
            // InternalXMachine.g:2686:1: ( 'as' )
            // InternalXMachine.g:2687:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            }
            match(input,132,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2696:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2700:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:2701:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
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
    // InternalXMachine.g:2708:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2712:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:2713:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:2713:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:2714:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            }
            // InternalXMachine.g:2715:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:2715:3: rule__MIncludes__PrefixesAssignment_3_1
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
    // InternalXMachine.g:2723:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2727:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:2728:2: rule__MIncludes__Group_3__2__Impl
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
    // InternalXMachine.g:2734:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2738:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:2739:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:2739:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:2740:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            }
            // InternalXMachine.g:2741:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXMachine.g:2741:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MIncludes__PrefixesAssignment_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalXMachine.g:2750:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2754:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:2755:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:2762:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2766:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2767:1: ( RULE_ID )
            {
            // InternalXMachine.g:2767:1: ( RULE_ID )
            // InternalXMachine.g:2768:2: RULE_ID
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
    // InternalXMachine.g:2777:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2781:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:2782:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXMachine.g:2788:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2792:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:2793:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:2793:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:2794:2: ( rule__QualifiedName__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2795:2: ( rule__QualifiedName__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==69) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:2795:3: rule__QualifiedName__Group_1__0
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
    // InternalXMachine.g:2804:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2808:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:2809:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXMachine.g:2816:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2820:1: ( ( '.' ) )
            // InternalXMachine.g:2821:1: ( '.' )
            {
            // InternalXMachine.g:2821:1: ( '.' )
            // InternalXMachine.g:2822:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2831:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2835:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:2836:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXMachine.g:2842:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2846:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2847:1: ( RULE_ID )
            {
            // InternalXMachine.g:2847:1: ( RULE_ID )
            // InternalXMachine.g:2848:2: RULE_ID
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


    // $ANTLR start "rule__XGroupVariable__Group__0"
    // InternalXMachine.g:2858:1: rule__XGroupVariable__Group__0 : rule__XGroupVariable__Group__0__Impl rule__XGroupVariable__Group__1 ;
    public final void rule__XGroupVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2862:1: ( rule__XGroupVariable__Group__0__Impl rule__XGroupVariable__Group__1 )
            // InternalXMachine.g:2863:2: rule__XGroupVariable__Group__0__Impl rule__XGroupVariable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XGroupVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroupVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupVariable__Group__0"


    // $ANTLR start "rule__XGroupVariable__Group__0__Impl"
    // InternalXMachine.g:2870:1: rule__XGroupVariable__Group__0__Impl : ( () ) ;
    public final void rule__XGroupVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2874:1: ( ( () ) )
            // InternalXMachine.g:2875:1: ( () )
            {
            // InternalXMachine.g:2875:1: ( () )
            // InternalXMachine.g:2876:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupVariableAccess().getVariableAction_0()); 
            }
            // InternalXMachine.g:2877:2: ()
            // InternalXMachine.g:2877:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupVariableAccess().getVariableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupVariable__Group__0__Impl"


    // $ANTLR start "rule__XGroupVariable__Group__1"
    // InternalXMachine.g:2885:1: rule__XGroupVariable__Group__1 : rule__XGroupVariable__Group__1__Impl rule__XGroupVariable__Group__2 ;
    public final void rule__XGroupVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2889:1: ( rule__XGroupVariable__Group__1__Impl rule__XGroupVariable__Group__2 )
            // InternalXMachine.g:2890:2: rule__XGroupVariable__Group__1__Impl rule__XGroupVariable__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__XGroupVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroupVariable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupVariable__Group__1"


    // $ANTLR start "rule__XGroupVariable__Group__1__Impl"
    // InternalXMachine.g:2897:1: rule__XGroupVariable__Group__1__Impl : ( ( rule__XGroupVariable__CommentAssignment_1 )? ) ;
    public final void rule__XGroupVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2901:1: ( ( ( rule__XGroupVariable__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2902:1: ( ( rule__XGroupVariable__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2902:1: ( ( rule__XGroupVariable__CommentAssignment_1 )? )
            // InternalXMachine.g:2903:2: ( rule__XGroupVariable__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupVariableAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:2904:2: ( rule__XGroupVariable__CommentAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXMachine.g:2904:3: rule__XGroupVariable__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGroupVariable__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupVariableAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupVariable__Group__1__Impl"


    // $ANTLR start "rule__XGroupVariable__Group__2"
    // InternalXMachine.g:2912:1: rule__XGroupVariable__Group__2 : rule__XGroupVariable__Group__2__Impl ;
    public final void rule__XGroupVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2916:1: ( rule__XGroupVariable__Group__2__Impl )
            // InternalXMachine.g:2917:2: rule__XGroupVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroupVariable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupVariable__Group__2"


    // $ANTLR start "rule__XGroupVariable__Group__2__Impl"
    // InternalXMachine.g:2923:1: rule__XGroupVariable__Group__2__Impl : ( ( rule__XGroupVariable__NameAssignment_2 ) ) ;
    public final void rule__XGroupVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2927:1: ( ( ( rule__XGroupVariable__NameAssignment_2 ) ) )
            // InternalXMachine.g:2928:1: ( ( rule__XGroupVariable__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2928:1: ( ( rule__XGroupVariable__NameAssignment_2 ) )
            // InternalXMachine.g:2929:2: ( rule__XGroupVariable__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupVariableAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:2930:2: ( rule__XGroupVariable__NameAssignment_2 )
            // InternalXMachine.g:2930:3: rule__XGroupVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGroupVariable__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupVariableAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupVariable__Group__2__Impl"


    // $ANTLR start "rule__XIndividualVariable__Group__0"
    // InternalXMachine.g:2939:1: rule__XIndividualVariable__Group__0 : rule__XIndividualVariable__Group__0__Impl rule__XIndividualVariable__Group__1 ;
    public final void rule__XIndividualVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2943:1: ( rule__XIndividualVariable__Group__0__Impl rule__XIndividualVariable__Group__1 )
            // InternalXMachine.g:2944:2: rule__XIndividualVariable__Group__0__Impl rule__XIndividualVariable__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2951:1: rule__XIndividualVariable__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2955:1: ( ( () ) )
            // InternalXMachine.g:2956:1: ( () )
            {
            // InternalXMachine.g:2956:1: ( () )
            // InternalXMachine.g:2957:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getTypedVariableAction_0()); 
            }
            // InternalXMachine.g:2958:2: ()
            // InternalXMachine.g:2958:3: 
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
    // InternalXMachine.g:2966:1: rule__XIndividualVariable__Group__1 : rule__XIndividualVariable__Group__1__Impl rule__XIndividualVariable__Group__2 ;
    public final void rule__XIndividualVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2970:1: ( rule__XIndividualVariable__Group__1__Impl rule__XIndividualVariable__Group__2 )
            // InternalXMachine.g:2971:2: rule__XIndividualVariable__Group__1__Impl rule__XIndividualVariable__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2978:1: rule__XIndividualVariable__Group__1__Impl : ( ( rule__XIndividualVariable__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2982:1: ( ( ( rule__XIndividualVariable__CommentAssignment_1 )? ) )
            // InternalXMachine.g:2983:1: ( ( rule__XIndividualVariable__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:2983:1: ( ( rule__XIndividualVariable__CommentAssignment_1 )? )
            // InternalXMachine.g:2984:2: ( rule__XIndividualVariable__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:2985:2: ( rule__XIndividualVariable__CommentAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXMachine.g:2985:3: rule__XIndividualVariable__CommentAssignment_1
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
    // InternalXMachine.g:2993:1: rule__XIndividualVariable__Group__2 : rule__XIndividualVariable__Group__2__Impl rule__XIndividualVariable__Group__3 ;
    public final void rule__XIndividualVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2997:1: ( rule__XIndividualVariable__Group__2__Impl rule__XIndividualVariable__Group__3 )
            // InternalXMachine.g:2998:2: rule__XIndividualVariable__Group__2__Impl rule__XIndividualVariable__Group__3
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
    // InternalXMachine.g:3005:1: rule__XIndividualVariable__Group__2__Impl : ( 'variable' ) ;
    public final void rule__XIndividualVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3009:1: ( ( 'variable' ) )
            // InternalXMachine.g:3010:1: ( 'variable' )
            {
            // InternalXMachine.g:3010:1: ( 'variable' )
            // InternalXMachine.g:3011:2: 'variable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getVariableKeyword_2()); 
            }
            match(input,133,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXIndividualVariableAccess().getVariableKeyword_2()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3020:1: rule__XIndividualVariable__Group__3 : rule__XIndividualVariable__Group__3__Impl rule__XIndividualVariable__Group__4 ;
    public final void rule__XIndividualVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3024:1: ( rule__XIndividualVariable__Group__3__Impl rule__XIndividualVariable__Group__4 )
            // InternalXMachine.g:3025:2: rule__XIndividualVariable__Group__3__Impl rule__XIndividualVariable__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:3032:1: rule__XIndividualVariable__Group__3__Impl : ( ( rule__XIndividualVariable__NameAssignment_3 ) ) ;
    public final void rule__XIndividualVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3036:1: ( ( ( rule__XIndividualVariable__NameAssignment_3 ) ) )
            // InternalXMachine.g:3037:1: ( ( rule__XIndividualVariable__NameAssignment_3 ) )
            {
            // InternalXMachine.g:3037:1: ( ( rule__XIndividualVariable__NameAssignment_3 ) )
            // InternalXMachine.g:3038:2: ( rule__XIndividualVariable__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:3039:2: ( rule__XIndividualVariable__NameAssignment_3 )
            // InternalXMachine.g:3039:3: rule__XIndividualVariable__NameAssignment_3
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
    // InternalXMachine.g:3047:1: rule__XIndividualVariable__Group__4 : rule__XIndividualVariable__Group__4__Impl rule__XIndividualVariable__Group__5 ;
    public final void rule__XIndividualVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3051:1: ( rule__XIndividualVariable__Group__4__Impl rule__XIndividualVariable__Group__5 )
            // InternalXMachine.g:3052:2: rule__XIndividualVariable__Group__4__Impl rule__XIndividualVariable__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:3059:1: rule__XIndividualVariable__Group__4__Impl : ( ( rule__XIndividualVariable__Group_4__0 )? ) ;
    public final void rule__XIndividualVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3063:1: ( ( ( rule__XIndividualVariable__Group_4__0 )? ) )
            // InternalXMachine.g:3064:1: ( ( rule__XIndividualVariable__Group_4__0 )? )
            {
            // InternalXMachine.g:3064:1: ( ( rule__XIndividualVariable__Group_4__0 )? )
            // InternalXMachine.g:3065:2: ( rule__XIndividualVariable__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getGroup_4()); 
            }
            // InternalXMachine.g:3066:2: ( rule__XIndividualVariable__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==77) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXMachine.g:3066:3: rule__XIndividualVariable__Group_4__0
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
    // InternalXMachine.g:3074:1: rule__XIndividualVariable__Group__5 : rule__XIndividualVariable__Group__5__Impl ;
    public final void rule__XIndividualVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3078:1: ( rule__XIndividualVariable__Group__5__Impl )
            // InternalXMachine.g:3079:2: rule__XIndividualVariable__Group__5__Impl
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
    // InternalXMachine.g:3085:1: rule__XIndividualVariable__Group__5__Impl : ( ( rule__XIndividualVariable__Group_5__0 )? ) ;
    public final void rule__XIndividualVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3089:1: ( ( ( rule__XIndividualVariable__Group_5__0 )? ) )
            // InternalXMachine.g:3090:1: ( ( rule__XIndividualVariable__Group_5__0 )? )
            {
            // InternalXMachine.g:3090:1: ( ( rule__XIndividualVariable__Group_5__0 )? )
            // InternalXMachine.g:3091:2: ( rule__XIndividualVariable__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getGroup_5()); 
            }
            // InternalXMachine.g:3092:2: ( rule__XIndividualVariable__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==70) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXMachine.g:3092:3: rule__XIndividualVariable__Group_5__0
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
    // InternalXMachine.g:3101:1: rule__XIndividualVariable__Group_4__0 : rule__XIndividualVariable__Group_4__0__Impl rule__XIndividualVariable__Group_4__1 ;
    public final void rule__XIndividualVariable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3105:1: ( rule__XIndividualVariable__Group_4__0__Impl rule__XIndividualVariable__Group_4__1 )
            // InternalXMachine.g:3106:2: rule__XIndividualVariable__Group_4__0__Impl rule__XIndividualVariable__Group_4__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:3113:1: rule__XIndividualVariable__Group_4__0__Impl : ( ':' ) ;
    public final void rule__XIndividualVariable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3117:1: ( ( ':' ) )
            // InternalXMachine.g:3118:1: ( ':' )
            {
            // InternalXMachine.g:3118:1: ( ':' )
            // InternalXMachine.g:3119:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getColonKeyword_4_0()); 
            }
            match(input,77,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3128:1: rule__XIndividualVariable__Group_4__1 : rule__XIndividualVariable__Group_4__1__Impl ;
    public final void rule__XIndividualVariable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3132:1: ( rule__XIndividualVariable__Group_4__1__Impl )
            // InternalXMachine.g:3133:2: rule__XIndividualVariable__Group_4__1__Impl
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
    // InternalXMachine.g:3139:1: rule__XIndividualVariable__Group_4__1__Impl : ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) ) ;
    public final void rule__XIndividualVariable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3143:1: ( ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) ) )
            // InternalXMachine.g:3144:1: ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) )
            {
            // InternalXMachine.g:3144:1: ( ( rule__XIndividualVariable__TypeAssignment_4_1 ) )
            // InternalXMachine.g:3145:2: ( rule__XIndividualVariable__TypeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getTypeAssignment_4_1()); 
            }
            // InternalXMachine.g:3146:2: ( rule__XIndividualVariable__TypeAssignment_4_1 )
            // InternalXMachine.g:3146:3: rule__XIndividualVariable__TypeAssignment_4_1
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
    // InternalXMachine.g:3155:1: rule__XIndividualVariable__Group_5__0 : rule__XIndividualVariable__Group_5__0__Impl rule__XIndividualVariable__Group_5__1 ;
    public final void rule__XIndividualVariable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3159:1: ( rule__XIndividualVariable__Group_5__0__Impl rule__XIndividualVariable__Group_5__1 )
            // InternalXMachine.g:3160:2: rule__XIndividualVariable__Group_5__0__Impl rule__XIndividualVariable__Group_5__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3167:1: rule__XIndividualVariable__Group_5__0__Impl : ( '=' ) ;
    public final void rule__XIndividualVariable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3171:1: ( ( '=' ) )
            // InternalXMachine.g:3172:1: ( '=' )
            {
            // InternalXMachine.g:3172:1: ( '=' )
            // InternalXMachine.g:3173:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getEqualsSignKeyword_5_0()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3182:1: rule__XIndividualVariable__Group_5__1 : rule__XIndividualVariable__Group_5__1__Impl ;
    public final void rule__XIndividualVariable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3186:1: ( rule__XIndividualVariable__Group_5__1__Impl )
            // InternalXMachine.g:3187:2: rule__XIndividualVariable__Group_5__1__Impl
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
    // InternalXMachine.g:3193:1: rule__XIndividualVariable__Group_5__1__Impl : ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) ) ;
    public final void rule__XIndividualVariable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3197:1: ( ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) ) )
            // InternalXMachine.g:3198:1: ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) )
            {
            // InternalXMachine.g:3198:1: ( ( rule__XIndividualVariable__ValueAssignment_5_1 ) )
            // InternalXMachine.g:3199:2: ( rule__XIndividualVariable__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualVariableAccess().getValueAssignment_5_1()); 
            }
            // InternalXMachine.g:3200:2: ( rule__XIndividualVariable__ValueAssignment_5_1 )
            // InternalXMachine.g:3200:3: rule__XIndividualVariable__ValueAssignment_5_1
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
    // InternalXMachine.g:3209:1: rule__XType__Group__0 : rule__XType__Group__0__Impl rule__XType__Group__1 ;
    public final void rule__XType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3213:1: ( rule__XType__Group__0__Impl rule__XType__Group__1 )
            // InternalXMachine.g:3214:2: rule__XType__Group__0__Impl rule__XType__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalXMachine.g:3221:1: rule__XType__Group__0__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3225:1: ( ( ruleXTypePrimitive ) )
            // InternalXMachine.g:3226:1: ( ruleXTypePrimitive )
            {
            // InternalXMachine.g:3226:1: ( ruleXTypePrimitive )
            // InternalXMachine.g:3227:2: ruleXTypePrimitive
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
    // InternalXMachine.g:3236:1: rule__XType__Group__1 : rule__XType__Group__1__Impl ;
    public final void rule__XType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3240:1: ( rule__XType__Group__1__Impl )
            // InternalXMachine.g:3241:2: rule__XType__Group__1__Impl
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
    // InternalXMachine.g:3247:1: rule__XType__Group__1__Impl : ( ( rule__XType__Group_1__0 )* ) ;
    public final void rule__XType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3251:1: ( ( ( rule__XType__Group_1__0 )* ) )
            // InternalXMachine.g:3252:1: ( ( rule__XType__Group_1__0 )* )
            {
            // InternalXMachine.g:3252:1: ( ( rule__XType__Group_1__0 )* )
            // InternalXMachine.g:3253:2: ( rule__XType__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypeAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3254:2: ( rule__XType__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=13 && LA35_0<=24)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXMachine.g:3254:3: rule__XType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__XType__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalXMachine.g:3263:1: rule__XType__Group_1__0 : rule__XType__Group_1__0__Impl rule__XType__Group_1__1 ;
    public final void rule__XType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3267:1: ( rule__XType__Group_1__0__Impl rule__XType__Group_1__1 )
            // InternalXMachine.g:3268:2: rule__XType__Group_1__0__Impl rule__XType__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:3275:1: rule__XType__Group_1__0__Impl : ( ruleXTYPEOPERATOR ) ;
    public final void rule__XType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3279:1: ( ( ruleXTYPEOPERATOR ) )
            // InternalXMachine.g:3280:1: ( ruleXTYPEOPERATOR )
            {
            // InternalXMachine.g:3280:1: ( ruleXTYPEOPERATOR )
            // InternalXMachine.g:3281:2: ruleXTYPEOPERATOR
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
    // InternalXMachine.g:3290:1: rule__XType__Group_1__1 : rule__XType__Group_1__1__Impl ;
    public final void rule__XType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3294:1: ( rule__XType__Group_1__1__Impl )
            // InternalXMachine.g:3295:2: rule__XType__Group_1__1__Impl
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
    // InternalXMachine.g:3301:1: rule__XType__Group_1__1__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3305:1: ( ( ruleXTypePrimitive ) )
            // InternalXMachine.g:3306:1: ( ruleXTypePrimitive )
            {
            // InternalXMachine.g:3306:1: ( ruleXTypePrimitive )
            // InternalXMachine.g:3307:2: ruleXTypePrimitive
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
    // InternalXMachine.g:3317:1: rule__XTypePrimitive__Group_5__0 : rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 ;
    public final void rule__XTypePrimitive__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3321:1: ( rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 )
            // InternalXMachine.g:3322:2: rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:3329:1: rule__XTypePrimitive__Group_5__0__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3333:1: ( ( '(' ) )
            // InternalXMachine.g:3334:1: ( '(' )
            {
            // InternalXMachine.g:3334:1: ( '(' )
            // InternalXMachine.g:3335:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3344:1: rule__XTypePrimitive__Group_5__1 : rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 ;
    public final void rule__XTypePrimitive__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3348:1: ( rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 )
            // InternalXMachine.g:3349:2: rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalXMachine.g:3356:1: rule__XTypePrimitive__Group_5__1__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3360:1: ( ( ruleXType ) )
            // InternalXMachine.g:3361:1: ( ruleXType )
            {
            // InternalXMachine.g:3361:1: ( ruleXType )
            // InternalXMachine.g:3362:2: ruleXType
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
    // InternalXMachine.g:3371:1: rule__XTypePrimitive__Group_5__2 : rule__XTypePrimitive__Group_5__2__Impl ;
    public final void rule__XTypePrimitive__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3375:1: ( rule__XTypePrimitive__Group_5__2__Impl )
            // InternalXMachine.g:3376:2: rule__XTypePrimitive__Group_5__2__Impl
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
    // InternalXMachine.g:3382:1: rule__XTypePrimitive__Group_5__2__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3386:1: ( ( ')' ) )
            // InternalXMachine.g:3387:1: ( ')' )
            {
            // InternalXMachine.g:3387:1: ( ')' )
            // InternalXMachine.g:3388:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3398:1: rule__XTypePrimitive__Group_6__0 : rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 ;
    public final void rule__XTypePrimitive__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3402:1: ( rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 )
            // InternalXMachine.g:3403:2: rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalXMachine.g:3410:1: rule__XTypePrimitive__Group_6__0__Impl : ( '\\u2119' ) ;
    public final void rule__XTypePrimitive__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3414:1: ( ( '\\u2119' ) )
            // InternalXMachine.g:3415:1: ( '\\u2119' )
            {
            // InternalXMachine.g:3415:1: ( '\\u2119' )
            // InternalXMachine.g:3416:2: '\\u2119'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3425:1: rule__XTypePrimitive__Group_6__1 : rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 ;
    public final void rule__XTypePrimitive__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3429:1: ( rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 )
            // InternalXMachine.g:3430:2: rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:3437:1: rule__XTypePrimitive__Group_6__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3441:1: ( ( '(' ) )
            // InternalXMachine.g:3442:1: ( '(' )
            {
            // InternalXMachine.g:3442:1: ( '(' )
            // InternalXMachine.g:3443:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3452:1: rule__XTypePrimitive__Group_6__2 : rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 ;
    public final void rule__XTypePrimitive__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3456:1: ( rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 )
            // InternalXMachine.g:3457:2: rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalXMachine.g:3464:1: rule__XTypePrimitive__Group_6__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3468:1: ( ( ruleXType ) )
            // InternalXMachine.g:3469:1: ( ruleXType )
            {
            // InternalXMachine.g:3469:1: ( ruleXType )
            // InternalXMachine.g:3470:2: ruleXType
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
    // InternalXMachine.g:3479:1: rule__XTypePrimitive__Group_6__3 : rule__XTypePrimitive__Group_6__3__Impl ;
    public final void rule__XTypePrimitive__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3483:1: ( rule__XTypePrimitive__Group_6__3__Impl )
            // InternalXMachine.g:3484:2: rule__XTypePrimitive__Group_6__3__Impl
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
    // InternalXMachine.g:3490:1: rule__XTypePrimitive__Group_6__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3494:1: ( ( ')' ) )
            // InternalXMachine.g:3495:1: ( ')' )
            {
            // InternalXMachine.g:3495:1: ( ')' )
            // InternalXMachine.g:3496:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3506:1: rule__XTypePrimitive__Group_7__0 : rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 ;
    public final void rule__XTypePrimitive__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3510:1: ( rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 )
            // InternalXMachine.g:3511:2: rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalXMachine.g:3518:1: rule__XTypePrimitive__Group_7__0__Impl : ( '\\u21191' ) ;
    public final void rule__XTypePrimitive__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3522:1: ( ( '\\u21191' ) )
            // InternalXMachine.g:3523:1: ( '\\u21191' )
            {
            // InternalXMachine.g:3523:1: ( '\\u21191' )
            // InternalXMachine.g:3524:2: '\\u21191'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3533:1: rule__XTypePrimitive__Group_7__1 : rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 ;
    public final void rule__XTypePrimitive__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3537:1: ( rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 )
            // InternalXMachine.g:3538:2: rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:3545:1: rule__XTypePrimitive__Group_7__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3549:1: ( ( '(' ) )
            // InternalXMachine.g:3550:1: ( '(' )
            {
            // InternalXMachine.g:3550:1: ( '(' )
            // InternalXMachine.g:3551:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3560:1: rule__XTypePrimitive__Group_7__2 : rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 ;
    public final void rule__XTypePrimitive__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3564:1: ( rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 )
            // InternalXMachine.g:3565:2: rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalXMachine.g:3572:1: rule__XTypePrimitive__Group_7__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3576:1: ( ( ruleXType ) )
            // InternalXMachine.g:3577:1: ( ruleXType )
            {
            // InternalXMachine.g:3577:1: ( ruleXType )
            // InternalXMachine.g:3578:2: ruleXType
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
    // InternalXMachine.g:3587:1: rule__XTypePrimitive__Group_7__3 : rule__XTypePrimitive__Group_7__3__Impl ;
    public final void rule__XTypePrimitive__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3591:1: ( rule__XTypePrimitive__Group_7__3__Impl )
            // InternalXMachine.g:3592:2: rule__XTypePrimitive__Group_7__3__Impl
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
    // InternalXMachine.g:3598:1: rule__XTypePrimitive__Group_7__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3602:1: ( ( ')' ) )
            // InternalXMachine.g:3603:1: ( ')' )
            {
            // InternalXMachine.g:3603:1: ( ')' )
            // InternalXMachine.g:3604:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_7_3()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__XGroupInvariant__Group__0"
    // InternalXMachine.g:3614:1: rule__XGroupInvariant__Group__0 : rule__XGroupInvariant__Group__0__Impl rule__XGroupInvariant__Group__1 ;
    public final void rule__XGroupInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3618:1: ( rule__XGroupInvariant__Group__0__Impl rule__XGroupInvariant__Group__1 )
            // InternalXMachine.g:3619:2: rule__XGroupInvariant__Group__0__Impl rule__XGroupInvariant__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__XGroupInvariant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroupInvariant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__Group__0"


    // $ANTLR start "rule__XGroupInvariant__Group__0__Impl"
    // InternalXMachine.g:3626:1: rule__XGroupInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XGroupInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3630:1: ( ( () ) )
            // InternalXMachine.g:3631:1: ( () )
            {
            // InternalXMachine.g:3631:1: ( () )
            // InternalXMachine.g:3632:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:3633:2: ()
            // InternalXMachine.g:3633:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupInvariantAccess().getInvariantAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__Group__0__Impl"


    // $ANTLR start "rule__XGroupInvariant__Group__1"
    // InternalXMachine.g:3641:1: rule__XGroupInvariant__Group__1 : rule__XGroupInvariant__Group__1__Impl rule__XGroupInvariant__Group__2 ;
    public final void rule__XGroupInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3645:1: ( rule__XGroupInvariant__Group__1__Impl rule__XGroupInvariant__Group__2 )
            // InternalXMachine.g:3646:2: rule__XGroupInvariant__Group__1__Impl rule__XGroupInvariant__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__XGroupInvariant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroupInvariant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__Group__1"


    // $ANTLR start "rule__XGroupInvariant__Group__1__Impl"
    // InternalXMachine.g:3653:1: rule__XGroupInvariant__Group__1__Impl : ( ( rule__XGroupInvariant__CommentAssignment_1 )? ) ;
    public final void rule__XGroupInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3657:1: ( ( ( rule__XGroupInvariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:3658:1: ( ( rule__XGroupInvariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:3658:1: ( ( rule__XGroupInvariant__CommentAssignment_1 )? )
            // InternalXMachine.g:3659:2: ( rule__XGroupInvariant__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupInvariantAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:3660:2: ( rule__XGroupInvariant__CommentAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXMachine.g:3660:3: rule__XGroupInvariant__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGroupInvariant__CommentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupInvariantAccess().getCommentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__Group__1__Impl"


    // $ANTLR start "rule__XGroupInvariant__Group__2"
    // InternalXMachine.g:3668:1: rule__XGroupInvariant__Group__2 : rule__XGroupInvariant__Group__2__Impl rule__XGroupInvariant__Group__3 ;
    public final void rule__XGroupInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3672:1: ( rule__XGroupInvariant__Group__2__Impl rule__XGroupInvariant__Group__3 )
            // InternalXMachine.g:3673:2: rule__XGroupInvariant__Group__2__Impl rule__XGroupInvariant__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__XGroupInvariant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XGroupInvariant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__Group__2"


    // $ANTLR start "rule__XGroupInvariant__Group__2__Impl"
    // InternalXMachine.g:3680:1: rule__XGroupInvariant__Group__2__Impl : ( ( rule__XGroupInvariant__NameAssignment_2 ) ) ;
    public final void rule__XGroupInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3684:1: ( ( ( rule__XGroupInvariant__NameAssignment_2 ) ) )
            // InternalXMachine.g:3685:1: ( ( rule__XGroupInvariant__NameAssignment_2 ) )
            {
            // InternalXMachine.g:3685:1: ( ( rule__XGroupInvariant__NameAssignment_2 ) )
            // InternalXMachine.g:3686:2: ( rule__XGroupInvariant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupInvariantAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:3687:2: ( rule__XGroupInvariant__NameAssignment_2 )
            // InternalXMachine.g:3687:3: rule__XGroupInvariant__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGroupInvariant__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupInvariantAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__Group__2__Impl"


    // $ANTLR start "rule__XGroupInvariant__Group__3"
    // InternalXMachine.g:3695:1: rule__XGroupInvariant__Group__3 : rule__XGroupInvariant__Group__3__Impl ;
    public final void rule__XGroupInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3699:1: ( rule__XGroupInvariant__Group__3__Impl )
            // InternalXMachine.g:3700:2: rule__XGroupInvariant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroupInvariant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__Group__3"


    // $ANTLR start "rule__XGroupInvariant__Group__3__Impl"
    // InternalXMachine.g:3706:1: rule__XGroupInvariant__Group__3__Impl : ( ( rule__XGroupInvariant__PredicateAssignment_3 ) ) ;
    public final void rule__XGroupInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3710:1: ( ( ( rule__XGroupInvariant__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:3711:1: ( ( rule__XGroupInvariant__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:3711:1: ( ( rule__XGroupInvariant__PredicateAssignment_3 ) )
            // InternalXMachine.g:3712:2: ( rule__XGroupInvariant__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupInvariantAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:3713:2: ( rule__XGroupInvariant__PredicateAssignment_3 )
            // InternalXMachine.g:3713:3: rule__XGroupInvariant__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XGroupInvariant__PredicateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupInvariantAccess().getPredicateAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__Group__3__Impl"


    // $ANTLR start "rule__XIndividualInvariant__Group__0"
    // InternalXMachine.g:3722:1: rule__XIndividualInvariant__Group__0 : rule__XIndividualInvariant__Group__0__Impl rule__XIndividualInvariant__Group__1 ;
    public final void rule__XIndividualInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3726:1: ( rule__XIndividualInvariant__Group__0__Impl rule__XIndividualInvariant__Group__1 )
            // InternalXMachine.g:3727:2: rule__XIndividualInvariant__Group__0__Impl rule__XIndividualInvariant__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalXMachine.g:3734:1: rule__XIndividualInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3738:1: ( ( () ) )
            // InternalXMachine.g:3739:1: ( () )
            {
            // InternalXMachine.g:3739:1: ( () )
            // InternalXMachine.g:3740:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:3741:2: ()
            // InternalXMachine.g:3741:3: 
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
    // InternalXMachine.g:3749:1: rule__XIndividualInvariant__Group__1 : rule__XIndividualInvariant__Group__1__Impl rule__XIndividualInvariant__Group__2 ;
    public final void rule__XIndividualInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3753:1: ( rule__XIndividualInvariant__Group__1__Impl rule__XIndividualInvariant__Group__2 )
            // InternalXMachine.g:3754:2: rule__XIndividualInvariant__Group__1__Impl rule__XIndividualInvariant__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalXMachine.g:3761:1: rule__XIndividualInvariant__Group__1__Impl : ( ( rule__XIndividualInvariant__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3765:1: ( ( ( rule__XIndividualInvariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:3766:1: ( ( rule__XIndividualInvariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:3766:1: ( ( rule__XIndividualInvariant__CommentAssignment_1 )? )
            // InternalXMachine.g:3767:2: ( rule__XIndividualInvariant__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:3768:2: ( rule__XIndividualInvariant__CommentAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXMachine.g:3768:3: rule__XIndividualInvariant__CommentAssignment_1
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
    // InternalXMachine.g:3776:1: rule__XIndividualInvariant__Group__2 : rule__XIndividualInvariant__Group__2__Impl rule__XIndividualInvariant__Group__3 ;
    public final void rule__XIndividualInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3780:1: ( rule__XIndividualInvariant__Group__2__Impl rule__XIndividualInvariant__Group__3 )
            // InternalXMachine.g:3781:2: rule__XIndividualInvariant__Group__2__Impl rule__XIndividualInvariant__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalXMachine.g:3788:1: rule__XIndividualInvariant__Group__2__Impl : ( ( rule__XIndividualInvariant__Alternatives_2 ) ) ;
    public final void rule__XIndividualInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3792:1: ( ( ( rule__XIndividualInvariant__Alternatives_2 ) ) )
            // InternalXMachine.g:3793:1: ( ( rule__XIndividualInvariant__Alternatives_2 ) )
            {
            // InternalXMachine.g:3793:1: ( ( rule__XIndividualInvariant__Alternatives_2 ) )
            // InternalXMachine.g:3794:2: ( rule__XIndividualInvariant__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getAlternatives_2()); 
            }
            // InternalXMachine.g:3795:2: ( rule__XIndividualInvariant__Alternatives_2 )
            // InternalXMachine.g:3795:3: rule__XIndividualInvariant__Alternatives_2
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
    // InternalXMachine.g:3803:1: rule__XIndividualInvariant__Group__3 : rule__XIndividualInvariant__Group__3__Impl rule__XIndividualInvariant__Group__4 ;
    public final void rule__XIndividualInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3807:1: ( rule__XIndividualInvariant__Group__3__Impl rule__XIndividualInvariant__Group__4 )
            // InternalXMachine.g:3808:2: rule__XIndividualInvariant__Group__3__Impl rule__XIndividualInvariant__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3815:1: rule__XIndividualInvariant__Group__3__Impl : ( ( rule__XIndividualInvariant__NameAssignment_3 ) ) ;
    public final void rule__XIndividualInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3819:1: ( ( ( rule__XIndividualInvariant__NameAssignment_3 ) ) )
            // InternalXMachine.g:3820:1: ( ( rule__XIndividualInvariant__NameAssignment_3 ) )
            {
            // InternalXMachine.g:3820:1: ( ( rule__XIndividualInvariant__NameAssignment_3 ) )
            // InternalXMachine.g:3821:2: ( rule__XIndividualInvariant__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:3822:2: ( rule__XIndividualInvariant__NameAssignment_3 )
            // InternalXMachine.g:3822:3: rule__XIndividualInvariant__NameAssignment_3
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
    // InternalXMachine.g:3830:1: rule__XIndividualInvariant__Group__4 : rule__XIndividualInvariant__Group__4__Impl ;
    public final void rule__XIndividualInvariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3834:1: ( rule__XIndividualInvariant__Group__4__Impl )
            // InternalXMachine.g:3835:2: rule__XIndividualInvariant__Group__4__Impl
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
    // InternalXMachine.g:3841:1: rule__XIndividualInvariant__Group__4__Impl : ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) ) ;
    public final void rule__XIndividualInvariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3845:1: ( ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) ) )
            // InternalXMachine.g:3846:1: ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) )
            {
            // InternalXMachine.g:3846:1: ( ( rule__XIndividualInvariant__PredicateAssignment_4 ) )
            // InternalXMachine.g:3847:2: ( rule__XIndividualInvariant__PredicateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getPredicateAssignment_4()); 
            }
            // InternalXMachine.g:3848:2: ( rule__XIndividualInvariant__PredicateAssignment_4 )
            // InternalXMachine.g:3848:3: rule__XIndividualInvariant__PredicateAssignment_4
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
    // InternalXMachine.g:3857:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3861:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:3862:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalXMachine.g:3869:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3873:1: ( ( () ) )
            // InternalXMachine.g:3874:1: ( () )
            {
            // InternalXMachine.g:3874:1: ( () )
            // InternalXMachine.g:3875:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            }
            // InternalXMachine.g:3876:2: ()
            // InternalXMachine.g:3876:3: 
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
    // InternalXMachine.g:3884:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl rule__XVariant__Group__2 ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3888:1: ( rule__XVariant__Group__1__Impl rule__XVariant__Group__2 )
            // InternalXMachine.g:3889:2: rule__XVariant__Group__1__Impl rule__XVariant__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalXMachine.g:3896:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__CommentAssignment_1 )? ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3900:1: ( ( ( rule__XVariant__CommentAssignment_1 )? ) )
            // InternalXMachine.g:3901:1: ( ( rule__XVariant__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:3901:1: ( ( rule__XVariant__CommentAssignment_1 )? )
            // InternalXMachine.g:3902:2: ( rule__XVariant__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:3903:2: ( rule__XVariant__CommentAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXMachine.g:3903:3: rule__XVariant__CommentAssignment_1
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
    // InternalXMachine.g:3911:1: rule__XVariant__Group__2 : rule__XVariant__Group__2__Impl rule__XVariant__Group__3 ;
    public final void rule__XVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3915:1: ( rule__XVariant__Group__2__Impl rule__XVariant__Group__3 )
            // InternalXMachine.g:3916:2: rule__XVariant__Group__2__Impl rule__XVariant__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalXMachine.g:3923:1: rule__XVariant__Group__2__Impl : ( 'variant' ) ;
    public final void rule__XVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3927:1: ( ( 'variant' ) )
            // InternalXMachine.g:3928:1: ( 'variant' )
            {
            // InternalXMachine.g:3928:1: ( 'variant' )
            // InternalXMachine.g:3929:2: 'variant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantKeyword_2()); 
            }
            match(input,134,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3938:1: rule__XVariant__Group__3 : rule__XVariant__Group__3__Impl rule__XVariant__Group__4 ;
    public final void rule__XVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3942:1: ( rule__XVariant__Group__3__Impl rule__XVariant__Group__4 )
            // InternalXMachine.g:3943:2: rule__XVariant__Group__3__Impl rule__XVariant__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3950:1: rule__XVariant__Group__3__Impl : ( ( rule__XVariant__NameAssignment_3 ) ) ;
    public final void rule__XVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3954:1: ( ( ( rule__XVariant__NameAssignment_3 ) ) )
            // InternalXMachine.g:3955:1: ( ( rule__XVariant__NameAssignment_3 ) )
            {
            // InternalXMachine.g:3955:1: ( ( rule__XVariant__NameAssignment_3 ) )
            // InternalXMachine.g:3956:2: ( rule__XVariant__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:3957:2: ( rule__XVariant__NameAssignment_3 )
            // InternalXMachine.g:3957:3: rule__XVariant__NameAssignment_3
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
    // InternalXMachine.g:3965:1: rule__XVariant__Group__4 : rule__XVariant__Group__4__Impl ;
    public final void rule__XVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3969:1: ( rule__XVariant__Group__4__Impl )
            // InternalXMachine.g:3970:2: rule__XVariant__Group__4__Impl
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
    // InternalXMachine.g:3976:1: rule__XVariant__Group__4__Impl : ( ( rule__XVariant__ExpressionAssignment_4 ) ) ;
    public final void rule__XVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3980:1: ( ( ( rule__XVariant__ExpressionAssignment_4 ) ) )
            // InternalXMachine.g:3981:1: ( ( rule__XVariant__ExpressionAssignment_4 ) )
            {
            // InternalXMachine.g:3981:1: ( ( rule__XVariant__ExpressionAssignment_4 ) )
            // InternalXMachine.g:3982:2: ( rule__XVariant__ExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionAssignment_4()); 
            }
            // InternalXMachine.g:3983:2: ( rule__XVariant__ExpressionAssignment_4 )
            // InternalXMachine.g:3983:3: rule__XVariant__ExpressionAssignment_4
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
    // InternalXMachine.g:3992:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3996:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:3997:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalXMachine.g:4004:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4008:1: ( ( () ) )
            // InternalXMachine.g:4009:1: ( () )
            {
            // InternalXMachine.g:4009:1: ( () )
            // InternalXMachine.g:4010:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventAction_0()); 
            }
            // InternalXMachine.g:4011:2: ()
            // InternalXMachine.g:4011:3: 
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
    // InternalXMachine.g:4019:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4023:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:4024:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalXMachine.g:4031:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__CommentAssignment_1 )? ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4035:1: ( ( ( rule__XEvent__CommentAssignment_1 )? ) )
            // InternalXMachine.g:4036:1: ( ( rule__XEvent__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:4036:1: ( ( rule__XEvent__CommentAssignment_1 )? )
            // InternalXMachine.g:4037:2: ( rule__XEvent__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:4038:2: ( rule__XEvent__CommentAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXMachine.g:4038:3: rule__XEvent__CommentAssignment_1
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
    // InternalXMachine.g:4046:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4050:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:4051:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalXMachine.g:4058:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__ConvergenceAssignment_2 )? ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4062:1: ( ( ( rule__XEvent__ConvergenceAssignment_2 )? ) )
            // InternalXMachine.g:4063:1: ( ( rule__XEvent__ConvergenceAssignment_2 )? )
            {
            // InternalXMachine.g:4063:1: ( ( rule__XEvent__ConvergenceAssignment_2 )? )
            // InternalXMachine.g:4064:2: ( rule__XEvent__ConvergenceAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getConvergenceAssignment_2()); 
            }
            // InternalXMachine.g:4065:2: ( rule__XEvent__ConvergenceAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=116 && LA40_0<=118)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:4065:3: rule__XEvent__ConvergenceAssignment_2
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
    // InternalXMachine.g:4073:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4077:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:4078:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
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
    // InternalXMachine.g:4085:1: rule__XEvent__Group__3__Impl : ( 'event' ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4089:1: ( ( 'event' ) )
            // InternalXMachine.g:4090:1: ( 'event' )
            {
            // InternalXMachine.g:4090:1: ( 'event' )
            // InternalXMachine.g:4091:2: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventKeyword_3()); 
            }
            match(input,135,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4100:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4104:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:4105:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalXMachine.g:4112:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__NameAssignment_4 ) ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4116:1: ( ( ( rule__XEvent__NameAssignment_4 ) ) )
            // InternalXMachine.g:4117:1: ( ( rule__XEvent__NameAssignment_4 ) )
            {
            // InternalXMachine.g:4117:1: ( ( rule__XEvent__NameAssignment_4 ) )
            // InternalXMachine.g:4118:2: ( rule__XEvent__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameAssignment_4()); 
            }
            // InternalXMachine.g:4119:2: ( rule__XEvent__NameAssignment_4 )
            // InternalXMachine.g:4119:3: rule__XEvent__NameAssignment_4
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
    // InternalXMachine.g:4127:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4131:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:4132:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalXMachine.g:4139:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Alternatives_5 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4143:1: ( ( ( rule__XEvent__Alternatives_5 )? ) )
            // InternalXMachine.g:4144:1: ( ( rule__XEvent__Alternatives_5 )? )
            {
            // InternalXMachine.g:4144:1: ( ( rule__XEvent__Alternatives_5 )? )
            // InternalXMachine.g:4145:2: ( rule__XEvent__Alternatives_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_5()); 
            }
            // InternalXMachine.g:4146:2: ( rule__XEvent__Alternatives_5 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==124||LA41_0==146) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:4146:3: rule__XEvent__Alternatives_5
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
    // InternalXMachine.g:4154:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl rule__XEvent__Group__7 ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4158:1: ( rule__XEvent__Group__6__Impl rule__XEvent__Group__7 )
            // InternalXMachine.g:4159:2: rule__XEvent__Group__6__Impl rule__XEvent__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalXMachine.g:4166:1: rule__XEvent__Group__6__Impl : ( ( rule__XEvent__Group_6__0 )? ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4170:1: ( ( ( rule__XEvent__Group_6__0 )? ) )
            // InternalXMachine.g:4171:1: ( ( rule__XEvent__Group_6__0 )? )
            {
            // InternalXMachine.g:4171:1: ( ( rule__XEvent__Group_6__0 )? )
            // InternalXMachine.g:4172:2: ( rule__XEvent__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_6()); 
            }
            // InternalXMachine.g:4173:2: ( rule__XEvent__Group_6__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==136) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:4173:3: rule__XEvent__Group_6__0
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
    // InternalXMachine.g:4181:1: rule__XEvent__Group__7 : rule__XEvent__Group__7__Impl rule__XEvent__Group__8 ;
    public final void rule__XEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4185:1: ( rule__XEvent__Group__7__Impl rule__XEvent__Group__8 )
            // InternalXMachine.g:4186:2: rule__XEvent__Group__7__Impl rule__XEvent__Group__8
            {
            pushFollow(FOLLOW_31);
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
    // InternalXMachine.g:4193:1: rule__XEvent__Group__7__Impl : ( ( rule__XEvent__OrderedChildrenAssignment_7 )* ) ;
    public final void rule__XEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4197:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_7 )* ) )
            // InternalXMachine.g:4198:1: ( ( rule__XEvent__OrderedChildrenAssignment_7 )* )
            {
            // InternalXMachine.g:4198:1: ( ( rule__XEvent__OrderedChildrenAssignment_7 )* )
            // InternalXMachine.g:4199:2: ( rule__XEvent__OrderedChildrenAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_7()); 
            }
            // InternalXMachine.g:4200:2: ( rule__XEvent__OrderedChildrenAssignment_7 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==138) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXMachine.g:4200:3: rule__XEvent__OrderedChildrenAssignment_7
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__XEvent__OrderedChildrenAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalXMachine.g:4208:1: rule__XEvent__Group__8 : rule__XEvent__Group__8__Impl rule__XEvent__Group__9 ;
    public final void rule__XEvent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4212:1: ( rule__XEvent__Group__8__Impl rule__XEvent__Group__9 )
            // InternalXMachine.g:4213:2: rule__XEvent__Group__8__Impl rule__XEvent__Group__9
            {
            pushFollow(FOLLOW_31);
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
    // InternalXMachine.g:4220:1: rule__XEvent__Group__8__Impl : ( ( rule__XEvent__Group_8__0 )? ) ;
    public final void rule__XEvent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4224:1: ( ( ( rule__XEvent__Group_8__0 )? ) )
            // InternalXMachine.g:4225:1: ( ( rule__XEvent__Group_8__0 )? )
            {
            // InternalXMachine.g:4225:1: ( ( rule__XEvent__Group_8__0 )? )
            // InternalXMachine.g:4226:2: ( rule__XEvent__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_8()); 
            }
            // InternalXMachine.g:4227:2: ( rule__XEvent__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=30 && LA44_0<=31)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:4227:3: rule__XEvent__Group_8__0
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
    // InternalXMachine.g:4235:1: rule__XEvent__Group__9 : rule__XEvent__Group__9__Impl rule__XEvent__Group__10 ;
    public final void rule__XEvent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4239:1: ( rule__XEvent__Group__9__Impl rule__XEvent__Group__10 )
            // InternalXMachine.g:4240:2: rule__XEvent__Group__9__Impl rule__XEvent__Group__10
            {
            pushFollow(FOLLOW_31);
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
    // InternalXMachine.g:4247:1: rule__XEvent__Group__9__Impl : ( ( rule__XEvent__Group_9__0 )? ) ;
    public final void rule__XEvent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4251:1: ( ( ( rule__XEvent__Group_9__0 )? ) )
            // InternalXMachine.g:4252:1: ( ( rule__XEvent__Group_9__0 )? )
            {
            // InternalXMachine.g:4252:1: ( ( rule__XEvent__Group_9__0 )? )
            // InternalXMachine.g:4253:2: ( rule__XEvent__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_9()); 
            }
            // InternalXMachine.g:4254:2: ( rule__XEvent__Group_9__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=32 && LA45_0<=33)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:4254:3: rule__XEvent__Group_9__0
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
    // InternalXMachine.g:4262:1: rule__XEvent__Group__10 : rule__XEvent__Group__10__Impl rule__XEvent__Group__11 ;
    public final void rule__XEvent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4266:1: ( rule__XEvent__Group__10__Impl rule__XEvent__Group__11 )
            // InternalXMachine.g:4267:2: rule__XEvent__Group__10__Impl rule__XEvent__Group__11
            {
            pushFollow(FOLLOW_31);
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
    // InternalXMachine.g:4274:1: rule__XEvent__Group__10__Impl : ( ( rule__XEvent__Group_10__0 )? ) ;
    public final void rule__XEvent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4278:1: ( ( ( rule__XEvent__Group_10__0 )? ) )
            // InternalXMachine.g:4279:1: ( ( rule__XEvent__Group_10__0 )? )
            {
            // InternalXMachine.g:4279:1: ( ( rule__XEvent__Group_10__0 )? )
            // InternalXMachine.g:4280:2: ( rule__XEvent__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_10()); 
            }
            // InternalXMachine.g:4281:2: ( rule__XEvent__Group_10__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==137) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:4281:3: rule__XEvent__Group_10__0
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
    // InternalXMachine.g:4289:1: rule__XEvent__Group__11 : rule__XEvent__Group__11__Impl ;
    public final void rule__XEvent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4293:1: ( rule__XEvent__Group__11__Impl )
            // InternalXMachine.g:4294:2: rule__XEvent__Group__11__Impl
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
    // InternalXMachine.g:4300:1: rule__XEvent__Group__11__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4304:1: ( ( 'end' ) )
            // InternalXMachine.g:4305:1: ( 'end' )
            {
            // InternalXMachine.g:4305:1: ( 'end' )
            // InternalXMachine.g:4306:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEndKeyword_11()); 
            }
            match(input,123,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4316:1: rule__XEvent__Group_5_0__0 : rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 ;
    public final void rule__XEvent__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4320:1: ( rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 )
            // InternalXMachine.g:4321:2: rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1
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
    // InternalXMachine.g:4328:1: rule__XEvent__Group_5_0__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4332:1: ( ( 'refines' ) )
            // InternalXMachine.g:4333:1: ( 'refines' )
            {
            // InternalXMachine.g:4333:1: ( 'refines' )
            // InternalXMachine.g:4334:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesKeyword_5_0_0()); 
            }
            match(input,124,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4343:1: rule__XEvent__Group_5_0__1 : rule__XEvent__Group_5_0__1__Impl ;
    public final void rule__XEvent__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4347:1: ( rule__XEvent__Group_5_0__1__Impl )
            // InternalXMachine.g:4348:2: rule__XEvent__Group_5_0__1__Impl
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
    // InternalXMachine.g:4354:1: rule__XEvent__Group_5_0__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) ) ;
    public final void rule__XEvent__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4358:1: ( ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) ) )
            // InternalXMachine.g:4359:1: ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) )
            {
            // InternalXMachine.g:4359:1: ( ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* ) )
            // InternalXMachine.g:4360:2: ( ( rule__XEvent__RefinesAssignment_5_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_5_0_1 )* )
            {
            // InternalXMachine.g:4360:2: ( ( rule__XEvent__RefinesAssignment_5_0_1 ) )
            // InternalXMachine.g:4361:3: ( rule__XEvent__RefinesAssignment_5_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_0_1()); 
            }
            // InternalXMachine.g:4362:3: ( rule__XEvent__RefinesAssignment_5_0_1 )
            // InternalXMachine.g:4362:4: rule__XEvent__RefinesAssignment_5_0_1
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

            // InternalXMachine.g:4365:2: ( ( rule__XEvent__RefinesAssignment_5_0_1 )* )
            // InternalXMachine.g:4366:3: ( rule__XEvent__RefinesAssignment_5_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_0_1()); 
            }
            // InternalXMachine.g:4367:3: ( rule__XEvent__RefinesAssignment_5_0_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalXMachine.g:4367:4: rule__XEvent__RefinesAssignment_5_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XEvent__RefinesAssignment_5_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalXMachine.g:4377:1: rule__XEvent__Group_5_1__0 : rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 ;
    public final void rule__XEvent__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4381:1: ( rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 )
            // InternalXMachine.g:4382:2: rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1
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
    // InternalXMachine.g:4389:1: rule__XEvent__Group_5_1__0__Impl : ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) ) ;
    public final void rule__XEvent__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4393:1: ( ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) ) )
            // InternalXMachine.g:4394:1: ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) )
            {
            // InternalXMachine.g:4394:1: ( ( rule__XEvent__ExtendedAssignment_5_1_0 ) )
            // InternalXMachine.g:4395:2: ( rule__XEvent__ExtendedAssignment_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedAssignment_5_1_0()); 
            }
            // InternalXMachine.g:4396:2: ( rule__XEvent__ExtendedAssignment_5_1_0 )
            // InternalXMachine.g:4396:3: rule__XEvent__ExtendedAssignment_5_1_0
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
    // InternalXMachine.g:4404:1: rule__XEvent__Group_5_1__1 : rule__XEvent__Group_5_1__1__Impl ;
    public final void rule__XEvent__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4408:1: ( rule__XEvent__Group_5_1__1__Impl )
            // InternalXMachine.g:4409:2: rule__XEvent__Group_5_1__1__Impl
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
    // InternalXMachine.g:4415:1: rule__XEvent__Group_5_1__1__Impl : ( ( rule__XEvent__RefinesAssignment_5_1_1 ) ) ;
    public final void rule__XEvent__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4419:1: ( ( ( rule__XEvent__RefinesAssignment_5_1_1 ) ) )
            // InternalXMachine.g:4420:1: ( ( rule__XEvent__RefinesAssignment_5_1_1 ) )
            {
            // InternalXMachine.g:4420:1: ( ( rule__XEvent__RefinesAssignment_5_1_1 ) )
            // InternalXMachine.g:4421:2: ( rule__XEvent__RefinesAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_5_1_1()); 
            }
            // InternalXMachine.g:4422:2: ( rule__XEvent__RefinesAssignment_5_1_1 )
            // InternalXMachine.g:4422:3: rule__XEvent__RefinesAssignment_5_1_1
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
    // InternalXMachine.g:4431:1: rule__XEvent__Group_6__0 : rule__XEvent__Group_6__0__Impl rule__XEvent__Group_6__1 ;
    public final void rule__XEvent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4435:1: ( rule__XEvent__Group_6__0__Impl rule__XEvent__Group_6__1 )
            // InternalXMachine.g:4436:2: rule__XEvent__Group_6__0__Impl rule__XEvent__Group_6__1
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
    // InternalXMachine.g:4443:1: rule__XEvent__Group_6__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4447:1: ( ( 'any' ) )
            // InternalXMachine.g:4448:1: ( 'any' )
            {
            // InternalXMachine.g:4448:1: ( 'any' )
            // InternalXMachine.g:4449:2: 'any'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAnyKeyword_6_0()); 
            }
            match(input,136,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4458:1: rule__XEvent__Group_6__1 : rule__XEvent__Group_6__1__Impl ;
    public final void rule__XEvent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4462:1: ( rule__XEvent__Group_6__1__Impl )
            // InternalXMachine.g:4463:2: rule__XEvent__Group_6__1__Impl
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
    // InternalXMachine.g:4469:1: rule__XEvent__Group_6__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) ) ;
    public final void rule__XEvent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4473:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) ) )
            // InternalXMachine.g:4474:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:4474:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* ) )
            // InternalXMachine.g:4475:2: ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* )
            {
            // InternalXMachine.g:4475:2: ( ( rule__XEvent__OrderedChildrenAssignment_6_1 ) )
            // InternalXMachine.g:4476:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_6_1()); 
            }
            // InternalXMachine.g:4477:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )
            // InternalXMachine.g:4477:4: rule__XEvent__OrderedChildrenAssignment_6_1
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

            // InternalXMachine.g:4480:2: ( ( rule__XEvent__OrderedChildrenAssignment_6_1 )* )
            // InternalXMachine.g:4481:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_6_1()); 
            }
            // InternalXMachine.g:4482:3: ( rule__XEvent__OrderedChildrenAssignment_6_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID||LA48_0==RULE_STRING) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalXMachine.g:4482:4: rule__XEvent__OrderedChildrenAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__XEvent__OrderedChildrenAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalXMachine.g:4492:1: rule__XEvent__Group_8__0 : rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 ;
    public final void rule__XEvent__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4496:1: ( rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 )
            // InternalXMachine.g:4497:2: rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalXMachine.g:4504:1: rule__XEvent__Group_8__0__Impl : ( ( rule__XEvent__Alternatives_8_0 ) ) ;
    public final void rule__XEvent__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4508:1: ( ( ( rule__XEvent__Alternatives_8_0 ) ) )
            // InternalXMachine.g:4509:1: ( ( rule__XEvent__Alternatives_8_0 ) )
            {
            // InternalXMachine.g:4509:1: ( ( rule__XEvent__Alternatives_8_0 ) )
            // InternalXMachine.g:4510:2: ( rule__XEvent__Alternatives_8_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_8_0()); 
            }
            // InternalXMachine.g:4511:2: ( rule__XEvent__Alternatives_8_0 )
            // InternalXMachine.g:4511:3: rule__XEvent__Alternatives_8_0
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
    // InternalXMachine.g:4519:1: rule__XEvent__Group_8__1 : rule__XEvent__Group_8__1__Impl ;
    public final void rule__XEvent__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4523:1: ( rule__XEvent__Group_8__1__Impl )
            // InternalXMachine.g:4524:2: rule__XEvent__Group_8__1__Impl
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
    // InternalXMachine.g:4530:1: rule__XEvent__Group_8__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) ) ;
    public final void rule__XEvent__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4534:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) ) )
            // InternalXMachine.g:4535:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:4535:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* ) )
            // InternalXMachine.g:4536:2: ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* )
            {
            // InternalXMachine.g:4536:2: ( ( rule__XEvent__OrderedChildrenAssignment_8_1 ) )
            // InternalXMachine.g:4537:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_8_1()); 
            }
            // InternalXMachine.g:4538:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )
            // InternalXMachine.g:4538:4: rule__XEvent__OrderedChildrenAssignment_8_1
            {
            pushFollow(FOLLOW_34);
            rule__XEvent__OrderedChildrenAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_8_1()); 
            }

            }

            // InternalXMachine.g:4541:2: ( ( rule__XEvent__OrderedChildrenAssignment_8_1 )* )
            // InternalXMachine.g:4542:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_8_1()); 
            }
            // InternalXMachine.g:4543:3: ( rule__XEvent__OrderedChildrenAssignment_8_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_XLABEL)||LA49_0==145) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalXMachine.g:4543:4: rule__XEvent__OrderedChildrenAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__XEvent__OrderedChildrenAssignment_8_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalXMachine.g:4553:1: rule__XEvent__Group_9__0 : rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 ;
    public final void rule__XEvent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4557:1: ( rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 )
            // InternalXMachine.g:4558:2: rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1
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
    // InternalXMachine.g:4565:1: rule__XEvent__Group_9__0__Impl : ( ( rule__XEvent__Alternatives_9_0 ) ) ;
    public final void rule__XEvent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4569:1: ( ( ( rule__XEvent__Alternatives_9_0 ) ) )
            // InternalXMachine.g:4570:1: ( ( rule__XEvent__Alternatives_9_0 ) )
            {
            // InternalXMachine.g:4570:1: ( ( rule__XEvent__Alternatives_9_0 ) )
            // InternalXMachine.g:4571:2: ( rule__XEvent__Alternatives_9_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_9_0()); 
            }
            // InternalXMachine.g:4572:2: ( rule__XEvent__Alternatives_9_0 )
            // InternalXMachine.g:4572:3: rule__XEvent__Alternatives_9_0
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
    // InternalXMachine.g:4580:1: rule__XEvent__Group_9__1 : rule__XEvent__Group_9__1__Impl ;
    public final void rule__XEvent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4584:1: ( rule__XEvent__Group_9__1__Impl )
            // InternalXMachine.g:4585:2: rule__XEvent__Group_9__1__Impl
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
    // InternalXMachine.g:4591:1: rule__XEvent__Group_9__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) ) ;
    public final void rule__XEvent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4595:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) ) )
            // InternalXMachine.g:4596:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) )
            {
            // InternalXMachine.g:4596:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* ) )
            // InternalXMachine.g:4597:2: ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* )
            {
            // InternalXMachine.g:4597:2: ( ( rule__XEvent__OrderedChildrenAssignment_9_1 ) )
            // InternalXMachine.g:4598:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_9_1()); 
            }
            // InternalXMachine.g:4599:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )
            // InternalXMachine.g:4599:4: rule__XEvent__OrderedChildrenAssignment_9_1
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

            // InternalXMachine.g:4602:2: ( ( rule__XEvent__OrderedChildrenAssignment_9_1 )* )
            // InternalXMachine.g:4603:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_9_1()); 
            }
            // InternalXMachine.g:4604:3: ( rule__XEvent__OrderedChildrenAssignment_9_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_XLABEL)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalXMachine.g:4604:4: rule__XEvent__OrderedChildrenAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XEvent__OrderedChildrenAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalXMachine.g:4614:1: rule__XEvent__Group_10__0 : rule__XEvent__Group_10__0__Impl rule__XEvent__Group_10__1 ;
    public final void rule__XEvent__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4618:1: ( rule__XEvent__Group_10__0__Impl rule__XEvent__Group_10__1 )
            // InternalXMachine.g:4619:2: rule__XEvent__Group_10__0__Impl rule__XEvent__Group_10__1
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
    // InternalXMachine.g:4626:1: rule__XEvent__Group_10__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4630:1: ( ( 'with' ) )
            // InternalXMachine.g:4631:1: ( 'with' )
            {
            // InternalXMachine.g:4631:1: ( 'with' )
            // InternalXMachine.g:4632:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWithKeyword_10_0()); 
            }
            match(input,137,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4641:1: rule__XEvent__Group_10__1 : rule__XEvent__Group_10__1__Impl ;
    public final void rule__XEvent__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4645:1: ( rule__XEvent__Group_10__1__Impl )
            // InternalXMachine.g:4646:2: rule__XEvent__Group_10__1__Impl
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
    // InternalXMachine.g:4652:1: rule__XEvent__Group_10__1__Impl : ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) ) ;
    public final void rule__XEvent__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4656:1: ( ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) ) )
            // InternalXMachine.g:4657:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) )
            {
            // InternalXMachine.g:4657:1: ( ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* ) )
            // InternalXMachine.g:4658:2: ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) ) ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* )
            {
            // InternalXMachine.g:4658:2: ( ( rule__XEvent__OrderedChildrenAssignment_10_1 ) )
            // InternalXMachine.g:4659:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_10_1()); 
            }
            // InternalXMachine.g:4660:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )
            // InternalXMachine.g:4660:4: rule__XEvent__OrderedChildrenAssignment_10_1
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

            // InternalXMachine.g:4663:2: ( ( rule__XEvent__OrderedChildrenAssignment_10_1 )* )
            // InternalXMachine.g:4664:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getOrderedChildrenAssignment_10_1()); 
            }
            // InternalXMachine.g:4665:3: ( rule__XEvent__OrderedChildrenAssignment_10_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_XLABEL)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalXMachine.g:4665:4: rule__XEvent__OrderedChildrenAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XEvent__OrderedChildrenAssignment_10_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalXMachine.g:4675:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4679:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:4680:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalXMachine.g:4687:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4691:1: ( ( () ) )
            // InternalXMachine.g:4692:1: ( () )
            {
            // InternalXMachine.g:4692:1: ( () )
            // InternalXMachine.g:4693:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:4694:2: ()
            // InternalXMachine.g:4694:3: 
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
    // InternalXMachine.g:4702:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4706:1: ( rule__EventSync__Group__1__Impl )
            // InternalXMachine.g:4707:2: rule__EventSync__Group__1__Impl
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
    // InternalXMachine.g:4713:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4717:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:4718:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:4718:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:4719:2: ( rule__EventSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:4720:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:4720:3: rule__EventSync__Group_1__0
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
    // InternalXMachine.g:4729:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4733:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:4734:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
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
    // InternalXMachine.g:4741:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4745:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:4746:1: ( 'synchronises' )
            {
            // InternalXMachine.g:4746:1: ( 'synchronises' )
            // InternalXMachine.g:4747:2: 'synchronises'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            }
            match(input,138,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4756:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4760:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:4761:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
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
    // InternalXMachine.g:4768:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4772:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:4773:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:4773:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:4774:2: ( rule__EventSync__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            }
            // InternalXMachine.g:4775:2: ( rule__EventSync__Group_1_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==69) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalXMachine.g:4775:3: rule__EventSync__Group_1_1__0
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
    // InternalXMachine.g:4783:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4787:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:4788:2: rule__EventSync__Group_1__2__Impl
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
    // InternalXMachine.g:4794:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4798:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:4799:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:4799:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:4800:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            }
            // InternalXMachine.g:4801:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:4801:3: rule__EventSync__SynchronisedEventAssignment_1_2
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
    // InternalXMachine.g:4810:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4814:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:4815:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:4822:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4826:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:4827:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:4827:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:4828:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            }
            // InternalXMachine.g:4829:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:4829:3: rule__EventSync__PrefixAssignment_1_1_0
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
    // InternalXMachine.g:4837:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4841:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:4842:2: rule__EventSync__Group_1_1__1__Impl
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
    // InternalXMachine.g:4848:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4852:1: ( ( '.' ) )
            // InternalXMachine.g:4853:1: ( '.' )
            {
            // InternalXMachine.g:4853:1: ( '.' )
            // InternalXMachine.g:4854:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4864:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4868:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:4869:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
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
    // InternalXMachine.g:4876:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4880:1: ( ( () ) )
            // InternalXMachine.g:4881:1: ( () )
            {
            // InternalXMachine.g:4881:1: ( () )
            // InternalXMachine.g:4882:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            }
            // InternalXMachine.g:4883:2: ()
            // InternalXMachine.g:4883:3: 
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
    // InternalXMachine.g:4891:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl rule__XParameter__Group__2 ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4895:1: ( rule__XParameter__Group__1__Impl rule__XParameter__Group__2 )
            // InternalXMachine.g:4896:2: rule__XParameter__Group__1__Impl rule__XParameter__Group__2
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
    // InternalXMachine.g:4903:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__CommentAssignment_1 )? ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4907:1: ( ( ( rule__XParameter__CommentAssignment_1 )? ) )
            // InternalXMachine.g:4908:1: ( ( rule__XParameter__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:4908:1: ( ( rule__XParameter__CommentAssignment_1 )? )
            // InternalXMachine.g:4909:2: ( rule__XParameter__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:4910:2: ( rule__XParameter__CommentAssignment_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXMachine.g:4910:3: rule__XParameter__CommentAssignment_1
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
    // InternalXMachine.g:4918:1: rule__XParameter__Group__2 : rule__XParameter__Group__2__Impl ;
    public final void rule__XParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4922:1: ( rule__XParameter__Group__2__Impl )
            // InternalXMachine.g:4923:2: rule__XParameter__Group__2__Impl
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
    // InternalXMachine.g:4929:1: rule__XParameter__Group__2__Impl : ( ( rule__XParameter__NameAssignment_2 ) ) ;
    public final void rule__XParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4933:1: ( ( ( rule__XParameter__NameAssignment_2 ) ) )
            // InternalXMachine.g:4934:1: ( ( rule__XParameter__NameAssignment_2 ) )
            {
            // InternalXMachine.g:4934:1: ( ( rule__XParameter__NameAssignment_2 ) )
            // InternalXMachine.g:4935:2: ( rule__XParameter__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:4936:2: ( rule__XParameter__NameAssignment_2 )
            // InternalXMachine.g:4936:3: rule__XParameter__NameAssignment_2
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
    // InternalXMachine.g:4945:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4949:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:4950:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalXMachine.g:4957:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4961:1: ( ( () ) )
            // InternalXMachine.g:4962:1: ( () )
            {
            // InternalXMachine.g:4962:1: ( () )
            // InternalXMachine.g:4963:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            }
            // InternalXMachine.g:4964:2: ()
            // InternalXMachine.g:4964:3: 
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
    // InternalXMachine.g:4972:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4976:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:4977:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalXMachine.g:4984:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__CommentAssignment_1 )? ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4988:1: ( ( ( rule__XGuard__CommentAssignment_1 )? ) )
            // InternalXMachine.g:4989:1: ( ( rule__XGuard__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:4989:1: ( ( rule__XGuard__CommentAssignment_1 )? )
            // InternalXMachine.g:4990:2: ( rule__XGuard__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:4991:2: ( rule__XGuard__CommentAssignment_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalXMachine.g:4991:3: rule__XGuard__CommentAssignment_1
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
    // InternalXMachine.g:4999:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5003:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:5004:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalXMachine.g:5011:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__TheoremAssignment_2 )? ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5015:1: ( ( ( rule__XGuard__TheoremAssignment_2 )? ) )
            // InternalXMachine.g:5016:1: ( ( rule__XGuard__TheoremAssignment_2 )? )
            {
            // InternalXMachine.g:5016:1: ( ( rule__XGuard__TheoremAssignment_2 )? )
            // InternalXMachine.g:5017:2: ( rule__XGuard__TheoremAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremAssignment_2()); 
            }
            // InternalXMachine.g:5018:2: ( rule__XGuard__TheoremAssignment_2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==145) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalXMachine.g:5018:3: rule__XGuard__TheoremAssignment_2
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
    // InternalXMachine.g:5026:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl rule__XGuard__Group__4 ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5030:1: ( rule__XGuard__Group__3__Impl rule__XGuard__Group__4 )
            // InternalXMachine.g:5031:2: rule__XGuard__Group__3__Impl rule__XGuard__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:5038:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__NameAssignment_3 ) ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5042:1: ( ( ( rule__XGuard__NameAssignment_3 ) ) )
            // InternalXMachine.g:5043:1: ( ( rule__XGuard__NameAssignment_3 ) )
            {
            // InternalXMachine.g:5043:1: ( ( rule__XGuard__NameAssignment_3 ) )
            // InternalXMachine.g:5044:2: ( rule__XGuard__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:5045:2: ( rule__XGuard__NameAssignment_3 )
            // InternalXMachine.g:5045:3: rule__XGuard__NameAssignment_3
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
    // InternalXMachine.g:5053:1: rule__XGuard__Group__4 : rule__XGuard__Group__4__Impl ;
    public final void rule__XGuard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5057:1: ( rule__XGuard__Group__4__Impl )
            // InternalXMachine.g:5058:2: rule__XGuard__Group__4__Impl
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
    // InternalXMachine.g:5064:1: rule__XGuard__Group__4__Impl : ( ( rule__XGuard__PredicateAssignment_4 ) ) ;
    public final void rule__XGuard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5068:1: ( ( ( rule__XGuard__PredicateAssignment_4 ) ) )
            // InternalXMachine.g:5069:1: ( ( rule__XGuard__PredicateAssignment_4 ) )
            {
            // InternalXMachine.g:5069:1: ( ( rule__XGuard__PredicateAssignment_4 ) )
            // InternalXMachine.g:5070:2: ( rule__XGuard__PredicateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateAssignment_4()); 
            }
            // InternalXMachine.g:5071:2: ( rule__XGuard__PredicateAssignment_4 )
            // InternalXMachine.g:5071:3: rule__XGuard__PredicateAssignment_4
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
    // InternalXMachine.g:5080:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5084:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:5085:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
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
    // InternalXMachine.g:5092:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5096:1: ( ( () ) )
            // InternalXMachine.g:5097:1: ( () )
            {
            // InternalXMachine.g:5097:1: ( () )
            // InternalXMachine.g:5098:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            }
            // InternalXMachine.g:5099:2: ()
            // InternalXMachine.g:5099:3: 
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
    // InternalXMachine.g:5107:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5111:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:5112:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
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
    // InternalXMachine.g:5119:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__CommentAssignment_1 )? ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5123:1: ( ( ( rule__XWitness__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5124:1: ( ( rule__XWitness__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5124:1: ( ( rule__XWitness__CommentAssignment_1 )? )
            // InternalXMachine.g:5125:2: ( rule__XWitness__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5126:2: ( rule__XWitness__CommentAssignment_1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalXMachine.g:5126:3: rule__XWitness__CommentAssignment_1
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
    // InternalXMachine.g:5134:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl rule__XWitness__Group__3 ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5138:1: ( rule__XWitness__Group__2__Impl rule__XWitness__Group__3 )
            // InternalXMachine.g:5139:2: rule__XWitness__Group__2__Impl rule__XWitness__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:5146:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__NameAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5150:1: ( ( ( rule__XWitness__NameAssignment_2 ) ) )
            // InternalXMachine.g:5151:1: ( ( rule__XWitness__NameAssignment_2 ) )
            {
            // InternalXMachine.g:5151:1: ( ( rule__XWitness__NameAssignment_2 ) )
            // InternalXMachine.g:5152:2: ( rule__XWitness__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:5153:2: ( rule__XWitness__NameAssignment_2 )
            // InternalXMachine.g:5153:3: rule__XWitness__NameAssignment_2
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
    // InternalXMachine.g:5161:1: rule__XWitness__Group__3 : rule__XWitness__Group__3__Impl ;
    public final void rule__XWitness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5165:1: ( rule__XWitness__Group__3__Impl )
            // InternalXMachine.g:5166:2: rule__XWitness__Group__3__Impl
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
    // InternalXMachine.g:5172:1: rule__XWitness__Group__3__Impl : ( ( rule__XWitness__PredicateAssignment_3 ) ) ;
    public final void rule__XWitness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5176:1: ( ( ( rule__XWitness__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:5177:1: ( ( rule__XWitness__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:5177:1: ( ( rule__XWitness__PredicateAssignment_3 ) )
            // InternalXMachine.g:5178:2: ( rule__XWitness__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:5179:2: ( rule__XWitness__PredicateAssignment_3 )
            // InternalXMachine.g:5179:3: rule__XWitness__PredicateAssignment_3
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
    // InternalXMachine.g:5188:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5192:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:5193:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
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
    // InternalXMachine.g:5200:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5204:1: ( ( () ) )
            // InternalXMachine.g:5205:1: ( () )
            {
            // InternalXMachine.g:5205:1: ( () )
            // InternalXMachine.g:5206:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAction_0()); 
            }
            // InternalXMachine.g:5207:2: ()
            // InternalXMachine.g:5207:3: 
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
    // InternalXMachine.g:5215:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5219:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:5220:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
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
    // InternalXMachine.g:5227:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__CommentAssignment_1 )? ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5231:1: ( ( ( rule__XAction__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5232:1: ( ( rule__XAction__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5232:1: ( ( rule__XAction__CommentAssignment_1 )? )
            // InternalXMachine.g:5233:2: ( rule__XAction__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5234:2: ( rule__XAction__CommentAssignment_1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalXMachine.g:5234:3: rule__XAction__CommentAssignment_1
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
    // InternalXMachine.g:5242:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl rule__XAction__Group__3 ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5246:1: ( rule__XAction__Group__2__Impl rule__XAction__Group__3 )
            // InternalXMachine.g:5247:2: rule__XAction__Group__2__Impl rule__XAction__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:5254:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__NameAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5258:1: ( ( ( rule__XAction__NameAssignment_2 ) ) )
            // InternalXMachine.g:5259:1: ( ( rule__XAction__NameAssignment_2 ) )
            {
            // InternalXMachine.g:5259:1: ( ( rule__XAction__NameAssignment_2 ) )
            // InternalXMachine.g:5260:2: ( rule__XAction__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:5261:2: ( rule__XAction__NameAssignment_2 )
            // InternalXMachine.g:5261:3: rule__XAction__NameAssignment_2
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
    // InternalXMachine.g:5269:1: rule__XAction__Group__3 : rule__XAction__Group__3__Impl ;
    public final void rule__XAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5273:1: ( rule__XAction__Group__3__Impl )
            // InternalXMachine.g:5274:2: rule__XAction__Group__3__Impl
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
    // InternalXMachine.g:5280:1: rule__XAction__Group__3__Impl : ( ( rule__XAction__ActionAssignment_3 ) ) ;
    public final void rule__XAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5284:1: ( ( ( rule__XAction__ActionAssignment_3 ) ) )
            // InternalXMachine.g:5285:1: ( ( rule__XAction__ActionAssignment_3 ) )
            {
            // InternalXMachine.g:5285:1: ( ( rule__XAction__ActionAssignment_3 ) )
            // InternalXMachine.g:5286:2: ( rule__XAction__ActionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAssignment_3()); 
            }
            // InternalXMachine.g:5287:2: ( rule__XAction__ActionAssignment_3 )
            // InternalXMachine.g:5287:3: rule__XAction__ActionAssignment_3
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
    // InternalXMachine.g:5296:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5300:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalXMachine.g:5301:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalXMachine.g:5308:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5312:1: ( ( '%' ) )
            // InternalXMachine.g:5313:1: ( '%' )
            {
            // InternalXMachine.g:5313:1: ( '%' )
            // InternalXMachine.g:5314:2: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            }
            match(input,139,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:5323:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5327:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalXMachine.g:5328:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
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
    // InternalXMachine.g:5334:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5338:1: ( ( '\\u22C2' ) )
            // InternalXMachine.g:5339:1: ( '\\u22C2' )
            {
            // InternalXMachine.g:5339:1: ( '\\u22C2' )
            // InternalXMachine.g:5340:2: '\\u22C2'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            }
            match(input,140,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:5350:1: rule__XRecord__Group__0 : rule__XRecord__Group__0__Impl rule__XRecord__Group__1 ;
    public final void rule__XRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5354:1: ( rule__XRecord__Group__0__Impl rule__XRecord__Group__1 )
            // InternalXMachine.g:5355:2: rule__XRecord__Group__0__Impl rule__XRecord__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:5362:1: rule__XRecord__Group__0__Impl : ( () ) ;
    public final void rule__XRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5366:1: ( ( () ) )
            // InternalXMachine.g:5367:1: ( () )
            {
            // InternalXMachine.g:5367:1: ( () )
            // InternalXMachine.g:5368:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getRecordAction_0()); 
            }
            // InternalXMachine.g:5369:2: ()
            // InternalXMachine.g:5369:3: 
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
    // InternalXMachine.g:5377:1: rule__XRecord__Group__1 : rule__XRecord__Group__1__Impl rule__XRecord__Group__2 ;
    public final void rule__XRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5381:1: ( rule__XRecord__Group__1__Impl rule__XRecord__Group__2 )
            // InternalXMachine.g:5382:2: rule__XRecord__Group__1__Impl rule__XRecord__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalXMachine.g:5389:1: rule__XRecord__Group__1__Impl : ( ( rule__XRecord__Alternatives_1 )? ) ;
    public final void rule__XRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5393:1: ( ( ( rule__XRecord__Alternatives_1 )? ) )
            // InternalXMachine.g:5394:1: ( ( rule__XRecord__Alternatives_1 )? )
            {
            // InternalXMachine.g:5394:1: ( ( rule__XRecord__Alternatives_1 )? )
            // InternalXMachine.g:5395:2: ( rule__XRecord__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_1()); 
            }
            // InternalXMachine.g:5396:2: ( rule__XRecord__Alternatives_1 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=147 && LA58_0<=148)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalXMachine.g:5396:3: rule__XRecord__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__Alternatives_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getAlternatives_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:5404:1: rule__XRecord__Group__2 : rule__XRecord__Group__2__Impl rule__XRecord__Group__3 ;
    public final void rule__XRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5408:1: ( rule__XRecord__Group__2__Impl rule__XRecord__Group__3 )
            // InternalXMachine.g:5409:2: rule__XRecord__Group__2__Impl rule__XRecord__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:5416:1: rule__XRecord__Group__2__Impl : ( 'record' ) ;
    public final void rule__XRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5420:1: ( ( 'record' ) )
            // InternalXMachine.g:5421:1: ( 'record' )
            {
            // InternalXMachine.g:5421:1: ( 'record' )
            // InternalXMachine.g:5422:2: 'record'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getRecordKeyword_2()); 
            }
            match(input,141,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getRecordKeyword_2()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:5431:1: rule__XRecord__Group__3 : rule__XRecord__Group__3__Impl rule__XRecord__Group__4 ;
    public final void rule__XRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5435:1: ( rule__XRecord__Group__3__Impl rule__XRecord__Group__4 )
            // InternalXMachine.g:5436:2: rule__XRecord__Group__3__Impl rule__XRecord__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalXMachine.g:5443:1: rule__XRecord__Group__3__Impl : ( ( rule__XRecord__NameAssignment_3 ) ) ;
    public final void rule__XRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5447:1: ( ( ( rule__XRecord__NameAssignment_3 ) ) )
            // InternalXMachine.g:5448:1: ( ( rule__XRecord__NameAssignment_3 ) )
            {
            // InternalXMachine.g:5448:1: ( ( rule__XRecord__NameAssignment_3 ) )
            // InternalXMachine.g:5449:2: ( rule__XRecord__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:5450:2: ( rule__XRecord__NameAssignment_3 )
            // InternalXMachine.g:5450:3: rule__XRecord__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getNameAssignment_3()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:5458:1: rule__XRecord__Group__4 : rule__XRecord__Group__4__Impl rule__XRecord__Group__5 ;
    public final void rule__XRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5462:1: ( rule__XRecord__Group__4__Impl rule__XRecord__Group__5 )
            // InternalXMachine.g:5463:2: rule__XRecord__Group__4__Impl rule__XRecord__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalXMachine.g:5470:1: rule__XRecord__Group__4__Impl : ( ( rule__XRecord__Group_4__0 )? ) ;
    public final void rule__XRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5474:1: ( ( ( rule__XRecord__Group_4__0 )? ) )
            // InternalXMachine.g:5475:1: ( ( rule__XRecord__Group_4__0 )? )
            {
            // InternalXMachine.g:5475:1: ( ( rule__XRecord__Group_4__0 )? )
            // InternalXMachine.g:5476:2: ( rule__XRecord__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getGroup_4()); 
            }
            // InternalXMachine.g:5477:2: ( rule__XRecord__Group_4__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==142) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalXMachine.g:5477:3: rule__XRecord__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getGroup_4()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:5485:1: rule__XRecord__Group__5 : rule__XRecord__Group__5__Impl rule__XRecord__Group__6 ;
    public final void rule__XRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5489:1: ( rule__XRecord__Group__5__Impl rule__XRecord__Group__6 )
            // InternalXMachine.g:5490:2: rule__XRecord__Group__5__Impl rule__XRecord__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalXMachine.g:5497:1: rule__XRecord__Group__5__Impl : ( ( rule__XRecord__Alternatives_5 )* ) ;
    public final void rule__XRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5501:1: ( ( ( rule__XRecord__Alternatives_5 )* ) )
            // InternalXMachine.g:5502:1: ( ( rule__XRecord__Alternatives_5 )* )
            {
            // InternalXMachine.g:5502:1: ( ( rule__XRecord__Alternatives_5 )* )
            // InternalXMachine.g:5503:2: ( rule__XRecord__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getAlternatives_5()); 
            }
            // InternalXMachine.g:5504:2: ( rule__XRecord__Alternatives_5 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=143 && LA60_0<=144)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalXMachine.g:5504:3: rule__XRecord__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__XRecord__Alternatives_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getAlternatives_5()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:5512:1: rule__XRecord__Group__6 : rule__XRecord__Group__6__Impl ;
    public final void rule__XRecord__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5516:1: ( rule__XRecord__Group__6__Impl )
            // InternalXMachine.g:5517:2: rule__XRecord__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:5523:1: rule__XRecord__Group__6__Impl : ( 'end' ) ;
    public final void rule__XRecord__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5527:1: ( ( 'end' ) )
            // InternalXMachine.g:5528:1: ( 'end' )
            {
            // InternalXMachine.g:5528:1: ( 'end' )
            // InternalXMachine.g:5529:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getEndKeyword_6()); 
            }
            match(input,123,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getEndKeyword_6()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__XRecord__Group_4__0"
    // InternalXMachine.g:5539:1: rule__XRecord__Group_4__0 : rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1 ;
    public final void rule__XRecord__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5543:1: ( rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1 )
            // InternalXMachine.g:5544:2: rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__XRecord__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_4__0"


    // $ANTLR start "rule__XRecord__Group_4__0__Impl"
    // InternalXMachine.g:5551:1: rule__XRecord__Group_4__0__Impl : ( 'inherits' ) ;
    public final void rule__XRecord__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5555:1: ( ( 'inherits' ) )
            // InternalXMachine.g:5556:1: ( 'inherits' )
            {
            // InternalXMachine.g:5556:1: ( 'inherits' )
            // InternalXMachine.g:5557:2: 'inherits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getInheritsKeyword_4_0()); 
            }
            match(input,142,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getInheritsKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_4__0__Impl"


    // $ANTLR start "rule__XRecord__Group_4__1"
    // InternalXMachine.g:5566:1: rule__XRecord__Group_4__1 : rule__XRecord__Group_4__1__Impl ;
    public final void rule__XRecord__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5570:1: ( rule__XRecord__Group_4__1__Impl )
            // InternalXMachine.g:5571:2: rule__XRecord__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_4__1"


    // $ANTLR start "rule__XRecord__Group_4__1__Impl"
    // InternalXMachine.g:5577:1: rule__XRecord__Group_4__1__Impl : ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) ) ;
    public final void rule__XRecord__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5581:1: ( ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) ) )
            // InternalXMachine.g:5582:1: ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) )
            {
            // InternalXMachine.g:5582:1: ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) )
            // InternalXMachine.g:5583:2: ( rule__XRecord__InheritsNamesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getInheritsNamesAssignment_4_1()); 
            }
            // InternalXMachine.g:5584:2: ( rule__XRecord__InheritsNamesAssignment_4_1 )
            // InternalXMachine.g:5584:3: rule__XRecord__InheritsNamesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__InheritsNamesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getInheritsNamesAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_4__1__Impl"


    // $ANTLR start "rule__XRecord__Group_5_0__0"
    // InternalXMachine.g:5593:1: rule__XRecord__Group_5_0__0 : rule__XRecord__Group_5_0__0__Impl rule__XRecord__Group_5_0__1 ;
    public final void rule__XRecord__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5597:1: ( rule__XRecord__Group_5_0__0__Impl rule__XRecord__Group_5_0__1 )
            // InternalXMachine.g:5598:2: rule__XRecord__Group_5_0__0__Impl rule__XRecord__Group_5_0__1
            {
            pushFollow(FOLLOW_10);
            rule__XRecord__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5_0__0"


    // $ANTLR start "rule__XRecord__Group_5_0__0__Impl"
    // InternalXMachine.g:5605:1: rule__XRecord__Group_5_0__0__Impl : ( 'field' ) ;
    public final void rule__XRecord__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5609:1: ( ( 'field' ) )
            // InternalXMachine.g:5610:1: ( 'field' )
            {
            // InternalXMachine.g:5610:1: ( 'field' )
            // InternalXMachine.g:5611:2: 'field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getFieldKeyword_5_0_0()); 
            }
            match(input,143,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getFieldKeyword_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5_0__0__Impl"


    // $ANTLR start "rule__XRecord__Group_5_0__1"
    // InternalXMachine.g:5620:1: rule__XRecord__Group_5_0__1 : rule__XRecord__Group_5_0__1__Impl ;
    public final void rule__XRecord__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5624:1: ( rule__XRecord__Group_5_0__1__Impl )
            // InternalXMachine.g:5625:2: rule__XRecord__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5_0__1"


    // $ANTLR start "rule__XRecord__Group_5_0__1__Impl"
    // InternalXMachine.g:5631:1: rule__XRecord__Group_5_0__1__Impl : ( ( rule__XRecord__FieldsAssignment_5_0_1 ) ) ;
    public final void rule__XRecord__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5635:1: ( ( ( rule__XRecord__FieldsAssignment_5_0_1 ) ) )
            // InternalXMachine.g:5636:1: ( ( rule__XRecord__FieldsAssignment_5_0_1 ) )
            {
            // InternalXMachine.g:5636:1: ( ( rule__XRecord__FieldsAssignment_5_0_1 ) )
            // InternalXMachine.g:5637:2: ( rule__XRecord__FieldsAssignment_5_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getFieldsAssignment_5_0_1()); 
            }
            // InternalXMachine.g:5638:2: ( rule__XRecord__FieldsAssignment_5_0_1 )
            // InternalXMachine.g:5638:3: rule__XRecord__FieldsAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__FieldsAssignment_5_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getFieldsAssignment_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5_0__1__Impl"


    // $ANTLR start "rule__XRecord__Group_5_1__0"
    // InternalXMachine.g:5647:1: rule__XRecord__Group_5_1__0 : rule__XRecord__Group_5_1__0__Impl rule__XRecord__Group_5_1__1 ;
    public final void rule__XRecord__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5651:1: ( rule__XRecord__Group_5_1__0__Impl rule__XRecord__Group_5_1__1 )
            // InternalXMachine.g:5652:2: rule__XRecord__Group_5_1__0__Impl rule__XRecord__Group_5_1__1
            {
            pushFollow(FOLLOW_12);
            rule__XRecord__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5_1__0"


    // $ANTLR start "rule__XRecord__Group_5_1__0__Impl"
    // InternalXMachine.g:5659:1: rule__XRecord__Group_5_1__0__Impl : ( 'constraint' ) ;
    public final void rule__XRecord__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5663:1: ( ( 'constraint' ) )
            // InternalXMachine.g:5664:1: ( 'constraint' )
            {
            // InternalXMachine.g:5664:1: ( 'constraint' )
            // InternalXMachine.g:5665:2: 'constraint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getConstraintKeyword_5_1_0()); 
            }
            match(input,144,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getConstraintKeyword_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5_1__0__Impl"


    // $ANTLR start "rule__XRecord__Group_5_1__1"
    // InternalXMachine.g:5674:1: rule__XRecord__Group_5_1__1 : rule__XRecord__Group_5_1__1__Impl ;
    public final void rule__XRecord__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5678:1: ( rule__XRecord__Group_5_1__1__Impl )
            // InternalXMachine.g:5679:2: rule__XRecord__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5_1__1"


    // $ANTLR start "rule__XRecord__Group_5_1__1__Impl"
    // InternalXMachine.g:5685:1: rule__XRecord__Group_5_1__1__Impl : ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) ) ;
    public final void rule__XRecord__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5689:1: ( ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) ) )
            // InternalXMachine.g:5690:1: ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) )
            {
            // InternalXMachine.g:5690:1: ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) )
            // InternalXMachine.g:5691:2: ( rule__XRecord__ConstraintsAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getConstraintsAssignment_5_1_1()); 
            }
            // InternalXMachine.g:5692:2: ( rule__XRecord__ConstraintsAssignment_5_1_1 )
            // InternalXMachine.g:5692:3: rule__XRecord__ConstraintsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__ConstraintsAssignment_5_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getConstraintsAssignment_5_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_5_1__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalXMachine.g:5701:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5705:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalXMachine.g:5706:2: rule__Field__Group__0__Impl rule__Field__Group__1
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
    // InternalXMachine.g:5713:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5717:1: ( ( () ) )
            // InternalXMachine.g:5718:1: ( () )
            {
            // InternalXMachine.g:5718:1: ( () )
            // InternalXMachine.g:5719:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            }
            // InternalXMachine.g:5720:2: ()
            // InternalXMachine.g:5720:3: 
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
    // InternalXMachine.g:5728:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5732:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalXMachine.g:5733:2: rule__Field__Group__1__Impl rule__Field__Group__2
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
    // InternalXMachine.g:5740:1: rule__Field__Group__1__Impl : ( ( rule__Field__CommentAssignment_1 )? ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5744:1: ( ( ( rule__Field__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5745:1: ( ( rule__Field__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5745:1: ( ( rule__Field__CommentAssignment_1 )? )
            // InternalXMachine.g:5746:2: ( rule__Field__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5747:2: ( rule__Field__CommentAssignment_1 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_STRING) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalXMachine.g:5747:3: rule__Field__CommentAssignment_1
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
    // InternalXMachine.g:5755:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5759:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalXMachine.g:5760:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalXMachine.g:5767:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5771:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalXMachine.g:5772:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalXMachine.g:5772:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalXMachine.g:5773:2: ( rule__Field__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:5774:2: ( rule__Field__NameAssignment_2 )
            // InternalXMachine.g:5774:3: rule__Field__NameAssignment_2
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
    // InternalXMachine.g:5782:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5786:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalXMachine.g:5787:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalXMachine.g:5794:1: rule__Field__Group__3__Impl : ( ':' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5798:1: ( ( ':' ) )
            // InternalXMachine.g:5799:1: ( ':' )
            {
            // InternalXMachine.g:5799:1: ( ':' )
            // InternalXMachine.g:5800:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getColonKeyword_3()); 
            }
            match(input,77,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:5809:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5813:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalXMachine.g:5814:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalXMachine.g:5821:1: rule__Field__Group__4__Impl : ( ( rule__Field__MultiplicityAssignment_4 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5825:1: ( ( ( rule__Field__MultiplicityAssignment_4 )? ) )
            // InternalXMachine.g:5826:1: ( ( rule__Field__MultiplicityAssignment_4 )? )
            {
            // InternalXMachine.g:5826:1: ( ( rule__Field__MultiplicityAssignment_4 )? )
            // InternalXMachine.g:5827:2: ( rule__Field__MultiplicityAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMultiplicityAssignment_4()); 
            }
            // InternalXMachine.g:5828:2: ( rule__Field__MultiplicityAssignment_4 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=119 && LA62_0<=121)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXMachine.g:5828:3: rule__Field__MultiplicityAssignment_4
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
    // InternalXMachine.g:5836:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5840:1: ( rule__Field__Group__5__Impl )
            // InternalXMachine.g:5841:2: rule__Field__Group__5__Impl
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
    // InternalXMachine.g:5847:1: rule__Field__Group__5__Impl : ( ( rule__Field__TypeAssignment_5 ) ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5851:1: ( ( ( rule__Field__TypeAssignment_5 ) ) )
            // InternalXMachine.g:5852:1: ( ( rule__Field__TypeAssignment_5 ) )
            {
            // InternalXMachine.g:5852:1: ( ( rule__Field__TypeAssignment_5 ) )
            // InternalXMachine.g:5853:2: ( rule__Field__TypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_5()); 
            }
            // InternalXMachine.g:5854:2: ( rule__Field__TypeAssignment_5 )
            // InternalXMachine.g:5854:3: rule__Field__TypeAssignment_5
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
    // InternalXMachine.g:5863:1: rule__XConstraint__Group__0 : rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1 ;
    public final void rule__XConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5867:1: ( rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1 )
            // InternalXMachine.g:5868:2: rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1
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
    // InternalXMachine.g:5875:1: rule__XConstraint__Group__0__Impl : ( () ) ;
    public final void rule__XConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5879:1: ( ( () ) )
            // InternalXMachine.g:5880:1: ( () )
            {
            // InternalXMachine.g:5880:1: ( () )
            // InternalXMachine.g:5881:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getConstraintAction_0()); 
            }
            // InternalXMachine.g:5882:2: ()
            // InternalXMachine.g:5882:3: 
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
    // InternalXMachine.g:5890:1: rule__XConstraint__Group__1 : rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2 ;
    public final void rule__XConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5894:1: ( rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2 )
            // InternalXMachine.g:5895:2: rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2
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
    // InternalXMachine.g:5902:1: rule__XConstraint__Group__1__Impl : ( ( rule__XConstraint__CommentAssignment_1 )? ) ;
    public final void rule__XConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5906:1: ( ( ( rule__XConstraint__CommentAssignment_1 )? ) )
            // InternalXMachine.g:5907:1: ( ( rule__XConstraint__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:5907:1: ( ( rule__XConstraint__CommentAssignment_1 )? )
            // InternalXMachine.g:5908:2: ( rule__XConstraint__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:5909:2: ( rule__XConstraint__CommentAssignment_1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXMachine.g:5909:3: rule__XConstraint__CommentAssignment_1
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
    // InternalXMachine.g:5917:1: rule__XConstraint__Group__2 : rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3 ;
    public final void rule__XConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5921:1: ( rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3 )
            // InternalXMachine.g:5922:2: rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:5929:1: rule__XConstraint__Group__2__Impl : ( ( rule__XConstraint__NameAssignment_2 ) ) ;
    public final void rule__XConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5933:1: ( ( ( rule__XConstraint__NameAssignment_2 ) ) )
            // InternalXMachine.g:5934:1: ( ( rule__XConstraint__NameAssignment_2 ) )
            {
            // InternalXMachine.g:5934:1: ( ( rule__XConstraint__NameAssignment_2 ) )
            // InternalXMachine.g:5935:2: ( rule__XConstraint__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:5936:2: ( rule__XConstraint__NameAssignment_2 )
            // InternalXMachine.g:5936:3: rule__XConstraint__NameAssignment_2
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
    // InternalXMachine.g:5944:1: rule__XConstraint__Group__3 : rule__XConstraint__Group__3__Impl ;
    public final void rule__XConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5948:1: ( rule__XConstraint__Group__3__Impl )
            // InternalXMachine.g:5949:2: rule__XConstraint__Group__3__Impl
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
    // InternalXMachine.g:5955:1: rule__XConstraint__Group__3__Impl : ( ( rule__XConstraint__PredicateAssignment_3 ) ) ;
    public final void rule__XConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5959:1: ( ( ( rule__XConstraint__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:5960:1: ( ( rule__XConstraint__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:5960:1: ( ( rule__XConstraint__PredicateAssignment_3 ) )
            // InternalXMachine.g:5961:2: ( rule__XConstraint__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConstraintAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:5962:2: ( rule__XConstraint__PredicateAssignment_3 )
            // InternalXMachine.g:5962:3: rule__XConstraint__PredicateAssignment_3
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
    // InternalXMachine.g:5971:1: rule__Machine__UnorderedGroup_4 : ( rule__Machine__UnorderedGroup_4__0 )? ;
    public final void rule__Machine__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_4());
        	
        try {
            // InternalXMachine.g:5976:1: ( ( rule__Machine__UnorderedGroup_4__0 )? )
            // InternalXMachine.g:5977:2: ( rule__Machine__UnorderedGroup_4__0 )?
            {
            // InternalXMachine.g:5977:2: ( rule__Machine__UnorderedGroup_4__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( LA64_0 == 130 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt64=1;
            }
            else if ( LA64_0 == 124 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt64=1;
            }
            else if ( LA64_0 == 125 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXMachine.g:5977:2: rule__Machine__UnorderedGroup_4__0
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
    // InternalXMachine.g:5985:1: rule__Machine__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__Machine__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:5990:1: ( ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) ) )
            // InternalXMachine.g:5991:3: ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) )
            {
            // InternalXMachine.g:5991:3: ( ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) )
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( LA66_0 == 130 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt66=1;
            }
            else if ( LA66_0 == 124 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt66=2;
            }
            else if ( LA66_0 == 125 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt66=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalXMachine.g:5992:3: ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) )
                    {
                    // InternalXMachine.g:5992:3: ({...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) ) )
                    // InternalXMachine.g:5993:4: {...}? => ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalXMachine.g:5993:103: ( ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) ) )
                    // InternalXMachine.g:5994:5: ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalXMachine.g:6000:5: ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* ) )
                    // InternalXMachine.g:6001:6: ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) ) ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* )
                    {
                    // InternalXMachine.g:6001:6: ( ( rule__Machine__OrderedChildrenAssignment_4_0 ) )
                    // InternalXMachine.g:6002:7: ( rule__Machine__OrderedChildrenAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_4_0()); 
                    }
                    // InternalXMachine.g:6003:7: ( rule__Machine__OrderedChildrenAssignment_4_0 )
                    // InternalXMachine.g:6003:8: rule__Machine__OrderedChildrenAssignment_4_0
                    {
                    pushFollow(FOLLOW_41);
                    rule__Machine__OrderedChildrenAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_4_0()); 
                    }

                    }

                    // InternalXMachine.g:6006:6: ( ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )* )
                    // InternalXMachine.g:6007:7: ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getOrderedChildrenAssignment_4_0()); 
                    }
                    // InternalXMachine.g:6008:7: ( ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0 )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==130) ) {
                            int LA65_1 = input.LA(2);

                            if ( (LA65_1==RULE_ID) ) {
                                int LA65_3 = input.LA(3);

                                if ( (synpred1_InternalXMachine()) ) {
                                    alt65=1;
                                }


                            }


                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalXMachine.g:6008:8: ( rule__Machine__OrderedChildrenAssignment_4_0 )=> rule__Machine__OrderedChildrenAssignment_4_0
                    	    {
                    	    pushFollow(FOLLOW_41);
                    	    rule__Machine__OrderedChildrenAssignment_4_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
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
                    // InternalXMachine.g:6014:3: ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) )
                    {
                    // InternalXMachine.g:6014:3: ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) )
                    // InternalXMachine.g:6015:4: {...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalXMachine.g:6015:103: ( ( ( rule__Machine__Group_4_1__0 ) ) )
                    // InternalXMachine.g:6016:5: ( ( rule__Machine__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalXMachine.g:6022:5: ( ( rule__Machine__Group_4_1__0 ) )
                    // InternalXMachine.g:6023:6: ( rule__Machine__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_4_1()); 
                    }
                    // InternalXMachine.g:6024:6: ( rule__Machine__Group_4_1__0 )
                    // InternalXMachine.g:6024:7: rule__Machine__Group_4_1__0
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
                    // InternalXMachine.g:6029:3: ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) )
                    {
                    // InternalXMachine.g:6029:3: ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) )
                    // InternalXMachine.g:6030:4: {...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalXMachine.g:6030:103: ( ( ( rule__Machine__Group_4_2__0 ) ) )
                    // InternalXMachine.g:6031:5: ( ( rule__Machine__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalXMachine.g:6037:5: ( ( rule__Machine__Group_4_2__0 ) )
                    // InternalXMachine.g:6038:6: ( rule__Machine__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_4_2()); 
                    }
                    // InternalXMachine.g:6039:6: ( rule__Machine__Group_4_2__0 )
                    // InternalXMachine.g:6039:7: rule__Machine__Group_4_2__0
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
    // InternalXMachine.g:6052:1: rule__Machine__UnorderedGroup_4__0 : rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )? ;
    public final void rule__Machine__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6056:1: ( rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )? )
            // InternalXMachine.g:6057:2: rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_42);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:6058:2: ( rule__Machine__UnorderedGroup_4__1 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( LA67_0 == 130 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt67=1;
            }
            else if ( LA67_0 == 124 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt67=1;
            }
            else if ( LA67_0 == 125 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXMachine.g:6058:2: rule__Machine__UnorderedGroup_4__1
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
    // InternalXMachine.g:6064:1: rule__Machine__UnorderedGroup_4__1 : rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )? ;
    public final void rule__Machine__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6068:1: ( rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )? )
            // InternalXMachine.g:6069:2: rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_42);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:6070:2: ( rule__Machine__UnorderedGroup_4__2 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( LA68_0 == 130 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt68=1;
            }
            else if ( LA68_0 == 124 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt68=1;
            }
            else if ( LA68_0 == 125 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXMachine.g:6070:2: rule__Machine__UnorderedGroup_4__2
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
    // InternalXMachine.g:6076:1: rule__Machine__UnorderedGroup_4__2 : rule__Machine__UnorderedGroup_4__Impl ;
    public final void rule__Machine__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6080:1: ( rule__Machine__UnorderedGroup_4__Impl )
            // InternalXMachine.g:6081:2: rule__Machine__UnorderedGroup_4__Impl
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
    // InternalXMachine.g:6088:1: rule__Machine__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Machine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6092:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6093:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6093:2: ( RULE_STRING )
            // InternalXMachine.g:6094:3: RULE_STRING
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
    // InternalXMachine.g:6103:1: rule__Machine__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6107:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6108:2: ( RULE_ID )
            {
            // InternalXMachine.g:6108:2: ( RULE_ID )
            // InternalXMachine.g:6109:3: RULE_ID
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
    // InternalXMachine.g:6118:1: rule__Machine__OrderedChildrenAssignment_4_0 : ( ruleMIncludes ) ;
    public final void rule__Machine__OrderedChildrenAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6122:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:6123:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:6123:2: ( ruleMIncludes )
            // InternalXMachine.g:6124:3: ruleMIncludes
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
    // InternalXMachine.g:6133:1: rule__Machine__RefinesAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6137:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6138:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6138:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6139:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_1_0()); 
            }
            // InternalXMachine.g:6140:3: ( RULE_ID )
            // InternalXMachine.g:6141:4: RULE_ID
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
    // InternalXMachine.g:6152:1: rule__Machine__SeesAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6156:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6157:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6157:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6158:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesContextCrossReference_4_2_1_0()); 
            }
            // InternalXMachine.g:6159:3: ( RULE_ID )
            // InternalXMachine.g:6160:4: RULE_ID
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
    // InternalXMachine.g:6171:1: rule__Machine__OrderedChildrenAssignment_5_1 : ( ruleMContains ) ;
    public final void rule__Machine__OrderedChildrenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6175:1: ( ( ruleMContains ) )
            // InternalXMachine.g:6176:2: ( ruleMContains )
            {
            // InternalXMachine.g:6176:2: ( ruleMContains )
            // InternalXMachine.g:6177:3: ruleMContains
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
    // InternalXMachine.g:6186:1: rule__Machine__OrderedChildrenAssignment_6_0_1 : ( ruleXGroupVariable ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6190:1: ( ( ruleXGroupVariable ) )
            // InternalXMachine.g:6191:2: ( ruleXGroupVariable )
            {
            // InternalXMachine.g:6191:2: ( ruleXGroupVariable )
            // InternalXMachine.g:6192:3: ruleXGroupVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXGroupVariableParserRuleCall_6_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXGroupVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXGroupVariableParserRuleCall_6_0_1_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:6201:1: rule__Machine__OrderedChildrenAssignment_6_1 : ( ruleXIndividualVariable ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6205:1: ( ( ruleXIndividualVariable ) )
            // InternalXMachine.g:6206:2: ( ruleXIndividualVariable )
            {
            // InternalXMachine.g:6206:2: ( ruleXIndividualVariable )
            // InternalXMachine.g:6207:3: ruleXIndividualVariable
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
    // InternalXMachine.g:6216:1: rule__Machine__OrderedChildrenAssignment_6_2_1 : ( ruleXGroupInvariant ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6220:1: ( ( ruleXGroupInvariant ) )
            // InternalXMachine.g:6221:2: ( ruleXGroupInvariant )
            {
            // InternalXMachine.g:6221:2: ( ruleXGroupInvariant )
            // InternalXMachine.g:6222:3: ruleXGroupInvariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXGroupInvariantParserRuleCall_6_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXGroupInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXGroupInvariantParserRuleCall_6_2_1_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:6231:1: rule__Machine__OrderedChildrenAssignment_6_3 : ( ruleXIndividualInvariant ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6235:1: ( ( ruleXIndividualInvariant ) )
            // InternalXMachine.g:6236:2: ( ruleXIndividualInvariant )
            {
            // InternalXMachine.g:6236:2: ( ruleXIndividualInvariant )
            // InternalXMachine.g:6237:3: ruleXIndividualInvariant
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
    // InternalXMachine.g:6246:1: rule__Machine__OrderedChildrenAssignment_6_4 : ( ruleXRecord ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6250:1: ( ( ruleXRecord ) )
            // InternalXMachine.g:6251:2: ( ruleXRecord )
            {
            // InternalXMachine.g:6251:2: ( ruleXRecord )
            // InternalXMachine.g:6252:3: ruleXRecord
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
    // InternalXMachine.g:6261:1: rule__Machine__OrderedChildrenAssignment_6_5 : ( ruleXVariant ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6265:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:6266:2: ( ruleXVariant )
            {
            // InternalXMachine.g:6266:2: ( ruleXVariant )
            // InternalXMachine.g:6267:3: ruleXVariant
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
    // InternalXMachine.g:6276:1: rule__Machine__OrderedChildrenAssignment_6_6 : ( ruleXEvent ) ;
    public final void rule__Machine__OrderedChildrenAssignment_6_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6280:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:6281:2: ( ruleXEvent )
            {
            // InternalXMachine.g:6281:2: ( ruleXEvent )
            // InternalXMachine.g:6282:3: ruleXEvent
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
    // InternalXMachine.g:6291:1: rule__Machine__OrderedChildrenAssignment_7_1 : ( ruleXRecord ) ;
    public final void rule__Machine__OrderedChildrenAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6295:1: ( ( ruleXRecord ) )
            // InternalXMachine.g:6296:2: ( ruleXRecord )
            {
            // InternalXMachine.g:6296:2: ( ruleXRecord )
            // InternalXMachine.g:6297:3: ruleXRecord
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOrderedChildrenXRecordParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXRecord();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOrderedChildrenXRecordParserRuleCall_7_1_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:6306:1: rule__MContains__ExtensionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MContains__ExtensionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6310:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:6311:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:6311:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:6312:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionDiagramOwnerCrossReference_1_0()); 
            }
            // InternalXMachine.g:6313:3: ( ruleQualifiedName )
            // InternalXMachine.g:6314:4: ruleQualifiedName
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
    // InternalXMachine.g:6325:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6329:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:6330:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:6330:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:6331:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            }
            // InternalXMachine.g:6332:3: ( ruleQualifiedName )
            // InternalXMachine.g:6333:4: ruleQualifiedName
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
    // InternalXMachine.g:6344:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6348:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6349:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6349:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6350:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            }
            // InternalXMachine.g:6351:3: ( RULE_ID )
            // InternalXMachine.g:6352:4: RULE_ID
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
    // InternalXMachine.g:6363:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6367:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6368:2: ( RULE_ID )
            {
            // InternalXMachine.g:6368:2: ( RULE_ID )
            // InternalXMachine.g:6369:3: RULE_ID
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
    // InternalXMachine.g:6378:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6382:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6383:2: ( RULE_ID )
            {
            // InternalXMachine.g:6383:2: ( RULE_ID )
            // InternalXMachine.g:6384:3: RULE_ID
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


    // $ANTLR start "rule__XGroupVariable__CommentAssignment_1"
    // InternalXMachine.g:6393:1: rule__XGroupVariable__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XGroupVariable__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6397:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6398:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6398:2: ( RULE_STRING )
            // InternalXMachine.g:6399:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupVariableAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupVariableAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupVariable__CommentAssignment_1"


    // $ANTLR start "rule__XGroupVariable__NameAssignment_2"
    // InternalXMachine.g:6408:1: rule__XGroupVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XGroupVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6412:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6413:2: ( RULE_ID )
            {
            // InternalXMachine.g:6413:2: ( RULE_ID )
            // InternalXMachine.g:6414:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupVariable__NameAssignment_2"


    // $ANTLR start "rule__XIndividualVariable__CommentAssignment_1"
    // InternalXMachine.g:6423:1: rule__XIndividualVariable__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualVariable__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6427:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6428:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6428:2: ( RULE_STRING )
            // InternalXMachine.g:6429:3: RULE_STRING
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
    // InternalXMachine.g:6438:1: rule__XIndividualVariable__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XIndividualVariable__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6442:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6443:2: ( RULE_ID )
            {
            // InternalXMachine.g:6443:2: ( RULE_ID )
            // InternalXMachine.g:6444:3: RULE_ID
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
    // InternalXMachine.g:6453:1: rule__XIndividualVariable__TypeAssignment_4_1 : ( ruleXType ) ;
    public final void rule__XIndividualVariable__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6457:1: ( ( ruleXType ) )
            // InternalXMachine.g:6458:2: ( ruleXType )
            {
            // InternalXMachine.g:6458:2: ( ruleXType )
            // InternalXMachine.g:6459:3: ruleXType
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
    // InternalXMachine.g:6468:1: rule__XIndividualVariable__ValueAssignment_5_1 : ( ruleXFormula ) ;
    public final void rule__XIndividualVariable__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6472:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6473:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6473:2: ( ruleXFormula )
            // InternalXMachine.g:6474:3: ruleXFormula
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


    // $ANTLR start "rule__XGroupInvariant__CommentAssignment_1"
    // InternalXMachine.g:6483:1: rule__XGroupInvariant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XGroupInvariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6487:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6488:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6488:2: ( RULE_STRING )
            // InternalXMachine.g:6489:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupInvariantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupInvariantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__CommentAssignment_1"


    // $ANTLR start "rule__XGroupInvariant__NameAssignment_2"
    // InternalXMachine.g:6498:1: rule__XGroupInvariant__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XGroupInvariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6502:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:6503:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:6503:2: ( RULE_XLABEL )
            // InternalXMachine.g:6504:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupInvariantAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupInvariantAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__NameAssignment_2"


    // $ANTLR start "rule__XGroupInvariant__PredicateAssignment_3"
    // InternalXMachine.g:6513:1: rule__XGroupInvariant__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XGroupInvariant__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6517:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6518:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6518:2: ( ruleXFormula )
            // InternalXMachine.g:6519:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGroupInvariantAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGroupInvariantAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGroupInvariant__PredicateAssignment_3"


    // $ANTLR start "rule__XIndividualInvariant__CommentAssignment_1"
    // InternalXMachine.g:6528:1: rule__XIndividualInvariant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualInvariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6532:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6533:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6533:2: ( RULE_STRING )
            // InternalXMachine.g:6534:3: RULE_STRING
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
    // InternalXMachine.g:6543:1: rule__XIndividualInvariant__TheoremAssignment_2_0 : ( ( 'theorem' ) ) ;
    public final void rule__XIndividualInvariant__TheoremAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6547:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:6548:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:6548:2: ( ( 'theorem' ) )
            // InternalXMachine.g:6549:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getTheoremTheoremKeyword_2_0_0()); 
            }
            // InternalXMachine.g:6550:3: ( 'theorem' )
            // InternalXMachine.g:6551:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXIndividualInvariantAccess().getTheoremTheoremKeyword_2_0_0()); 
            }
            match(input,145,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:6562:1: rule__XIndividualInvariant__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XIndividualInvariant__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6566:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:6567:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:6567:2: ( RULE_XLABEL )
            // InternalXMachine.g:6568:3: RULE_XLABEL
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
    // InternalXMachine.g:6577:1: rule__XIndividualInvariant__PredicateAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XIndividualInvariant__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6581:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6582:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6582:2: ( ruleXFormula )
            // InternalXMachine.g:6583:3: ruleXFormula
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
    // InternalXMachine.g:6592:1: rule__XVariant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XVariant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6596:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6597:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6597:2: ( RULE_STRING )
            // InternalXMachine.g:6598:3: RULE_STRING
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
    // InternalXMachine.g:6607:1: rule__XVariant__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XVariant__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6611:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:6612:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:6612:2: ( RULE_XLABEL )
            // InternalXMachine.g:6613:3: RULE_XLABEL
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
    // InternalXMachine.g:6622:1: rule__XVariant__ExpressionAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XVariant__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6626:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6627:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6627:2: ( ruleXFormula )
            // InternalXMachine.g:6628:3: ruleXFormula
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
    // InternalXMachine.g:6637:1: rule__XEvent__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XEvent__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6641:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6642:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6642:2: ( RULE_STRING )
            // InternalXMachine.g:6643:3: RULE_STRING
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
    // InternalXMachine.g:6652:1: rule__XEvent__ConvergenceAssignment_2 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6656:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:6657:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:6657:2: ( ruleXConvergence )
            // InternalXMachine.g:6658:3: ruleXConvergence
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
    // InternalXMachine.g:6667:1: rule__XEvent__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6671:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6672:2: ( RULE_ID )
            {
            // InternalXMachine.g:6672:2: ( RULE_ID )
            // InternalXMachine.g:6673:3: RULE_ID
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
    // InternalXMachine.g:6682:1: rule__XEvent__RefinesAssignment_5_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6686:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6687:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6687:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6688:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_0_1_0()); 
            }
            // InternalXMachine.g:6689:3: ( RULE_ID )
            // InternalXMachine.g:6690:4: RULE_ID
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
    // InternalXMachine.g:6701:1: rule__XEvent__ExtendedAssignment_5_1_0 : ( ( 'extends' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6705:1: ( ( ( 'extends' ) ) )
            // InternalXMachine.g:6706:2: ( ( 'extends' ) )
            {
            // InternalXMachine.g:6706:2: ( ( 'extends' ) )
            // InternalXMachine.g:6707:3: ( 'extends' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_5_1_0_0()); 
            }
            // InternalXMachine.g:6708:3: ( 'extends' )
            // InternalXMachine.g:6709:4: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_5_1_0_0()); 
            }
            match(input,146,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:6720:1: rule__XEvent__RefinesAssignment_5_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6724:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6725:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6725:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6726:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_5_1_1_0()); 
            }
            // InternalXMachine.g:6727:3: ( RULE_ID )
            // InternalXMachine.g:6728:4: RULE_ID
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
    // InternalXMachine.g:6739:1: rule__XEvent__OrderedChildrenAssignment_6_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6743:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:6744:2: ( ruleXParameter )
            {
            // InternalXMachine.g:6744:2: ( ruleXParameter )
            // InternalXMachine.g:6745:3: ruleXParameter
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
    // InternalXMachine.g:6754:1: rule__XEvent__OrderedChildrenAssignment_7 : ( ruleEventSync ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6758:1: ( ( ruleEventSync ) )
            // InternalXMachine.g:6759:2: ( ruleEventSync )
            {
            // InternalXMachine.g:6759:2: ( ruleEventSync )
            // InternalXMachine.g:6760:3: ruleEventSync
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
    // InternalXMachine.g:6769:1: rule__XEvent__OrderedChildrenAssignment_8_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6773:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:6774:2: ( ruleXGuard )
            {
            // InternalXMachine.g:6774:2: ( ruleXGuard )
            // InternalXMachine.g:6775:3: ruleXGuard
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
    // InternalXMachine.g:6784:1: rule__XEvent__OrderedChildrenAssignment_9_1 : ( ruleXAction ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6788:1: ( ( ruleXAction ) )
            // InternalXMachine.g:6789:2: ( ruleXAction )
            {
            // InternalXMachine.g:6789:2: ( ruleXAction )
            // InternalXMachine.g:6790:3: ruleXAction
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
    // InternalXMachine.g:6799:1: rule__XEvent__OrderedChildrenAssignment_10_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__OrderedChildrenAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6803:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:6804:2: ( ruleXWitness )
            {
            // InternalXMachine.g:6804:2: ( ruleXWitness )
            // InternalXMachine.g:6805:3: ruleXWitness
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
    // InternalXMachine.g:6814:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6818:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6819:2: ( RULE_ID )
            {
            // InternalXMachine.g:6819:2: ( RULE_ID )
            // InternalXMachine.g:6820:3: RULE_ID
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
    // InternalXMachine.g:6829:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6833:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:6834:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:6834:2: ( ( RULE_ID ) )
            // InternalXMachine.g:6835:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            }
            // InternalXMachine.g:6836:3: ( RULE_ID )
            // InternalXMachine.g:6837:4: RULE_ID
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
    // InternalXMachine.g:6848:1: rule__XParameter__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XParameter__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6852:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6853:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6853:2: ( RULE_STRING )
            // InternalXMachine.g:6854:3: RULE_STRING
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
    // InternalXMachine.g:6863:1: rule__XParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6867:1: ( ( RULE_ID ) )
            // InternalXMachine.g:6868:2: ( RULE_ID )
            {
            // InternalXMachine.g:6868:2: ( RULE_ID )
            // InternalXMachine.g:6869:3: RULE_ID
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
    // InternalXMachine.g:6878:1: rule__XGuard__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XGuard__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6882:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6883:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6883:2: ( RULE_STRING )
            // InternalXMachine.g:6884:3: RULE_STRING
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
    // InternalXMachine.g:6893:1: rule__XGuard__TheoremAssignment_2 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6897:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:6898:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:6898:2: ( ( 'theorem' ) )
            // InternalXMachine.g:6899:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_2_0()); 
            }
            // InternalXMachine.g:6900:3: ( 'theorem' )
            // InternalXMachine.g:6901:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_2_0()); 
            }
            match(input,145,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:6912:1: rule__XGuard__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6916:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:6917:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:6917:2: ( RULE_XLABEL )
            // InternalXMachine.g:6918:3: RULE_XLABEL
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
    // InternalXMachine.g:6927:1: rule__XGuard__PredicateAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XGuard__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6931:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6932:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6932:2: ( ruleXFormula )
            // InternalXMachine.g:6933:3: ruleXFormula
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
    // InternalXMachine.g:6942:1: rule__XWitness__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XWitness__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6946:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6947:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6947:2: ( RULE_STRING )
            // InternalXMachine.g:6948:3: RULE_STRING
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
    // InternalXMachine.g:6957:1: rule__XWitness__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6961:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:6962:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:6962:2: ( RULE_XLABEL )
            // InternalXMachine.g:6963:3: RULE_XLABEL
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
    // InternalXMachine.g:6972:1: rule__XWitness__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XWitness__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6976:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:6977:2: ( ruleXFormula )
            {
            // InternalXMachine.g:6977:2: ( ruleXFormula )
            // InternalXMachine.g:6978:3: ruleXFormula
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
    // InternalXMachine.g:6987:1: rule__XAction__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XAction__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:6991:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:6992:2: ( RULE_STRING )
            {
            // InternalXMachine.g:6992:2: ( RULE_STRING )
            // InternalXMachine.g:6993:3: RULE_STRING
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
    // InternalXMachine.g:7002:1: rule__XAction__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7006:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7007:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7007:2: ( RULE_XLABEL )
            // InternalXMachine.g:7008:3: RULE_XLABEL
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
    // InternalXMachine.g:7017:1: rule__XAction__ActionAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XAction__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7021:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7022:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7022:2: ( ruleXFormula )
            // InternalXMachine.g:7023:3: ruleXFormula
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


    // $ANTLR start "rule__XRecord__ExtendedAssignment_1_0"
    // InternalXMachine.g:7032:1: rule__XRecord__ExtendedAssignment_1_0 : ( ( 'extended' ) ) ;
    public final void rule__XRecord__ExtendedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7036:1: ( ( ( 'extended' ) ) )
            // InternalXMachine.g:7037:2: ( ( 'extended' ) )
            {
            // InternalXMachine.g:7037:2: ( ( 'extended' ) )
            // InternalXMachine.g:7038:3: ( 'extended' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0_0()); 
            }
            // InternalXMachine.g:7039:3: ( 'extended' )
            // InternalXMachine.g:7040:4: 'extended'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0_0()); 
            }
            match(input,147,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__ExtendedAssignment_1_0"


    // $ANTLR start "rule__XRecord__RefinedAssignment_1_1"
    // InternalXMachine.g:7051:1: rule__XRecord__RefinedAssignment_1_1 : ( ( 'refined' ) ) ;
    public final void rule__XRecord__RefinedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7055:1: ( ( ( 'refined' ) ) )
            // InternalXMachine.g:7056:2: ( ( 'refined' ) )
            {
            // InternalXMachine.g:7056:2: ( ( 'refined' ) )
            // InternalXMachine.g:7057:3: ( 'refined' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getRefinedRefinedKeyword_1_1_0()); 
            }
            // InternalXMachine.g:7058:3: ( 'refined' )
            // InternalXMachine.g:7059:4: 'refined'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getRefinedRefinedKeyword_1_1_0()); 
            }
            match(input,148,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getRefinedRefinedKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getRefinedRefinedKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__RefinedAssignment_1_1"


    // $ANTLR start "rule__XRecord__NameAssignment_3"
    // InternalXMachine.g:7070:1: rule__XRecord__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XRecord__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7074:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7075:2: ( RULE_ID )
            {
            // InternalXMachine.g:7075:2: ( RULE_ID )
            // InternalXMachine.g:7076:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__NameAssignment_3"


    // $ANTLR start "rule__XRecord__InheritsNamesAssignment_4_1"
    // InternalXMachine.g:7085:1: rule__XRecord__InheritsNamesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__XRecord__InheritsNamesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7089:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7090:2: ( RULE_ID )
            {
            // InternalXMachine.g:7090:2: ( RULE_ID )
            // InternalXMachine.g:7091:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getInheritsNamesIDTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getInheritsNamesIDTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__InheritsNamesAssignment_4_1"


    // $ANTLR start "rule__XRecord__FieldsAssignment_5_0_1"
    // InternalXMachine.g:7100:1: rule__XRecord__FieldsAssignment_5_0_1 : ( ruleField ) ;
    public final void rule__XRecord__FieldsAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7104:1: ( ( ruleField ) )
            // InternalXMachine.g:7105:2: ( ruleField )
            {
            // InternalXMachine.g:7105:2: ( ruleField )
            // InternalXMachine.g:7106:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_5_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_5_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__FieldsAssignment_5_0_1"


    // $ANTLR start "rule__XRecord__ConstraintsAssignment_5_1_1"
    // InternalXMachine.g:7115:1: rule__XRecord__ConstraintsAssignment_5_1_1 : ( ruleXConstraint ) ;
    public final void rule__XRecord__ConstraintsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7119:1: ( ( ruleXConstraint ) )
            // InternalXMachine.g:7120:2: ( ruleXConstraint )
            {
            // InternalXMachine.g:7120:2: ( ruleXConstraint )
            // InternalXMachine.g:7121:3: ruleXConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXRecordAccess().getConstraintsXConstraintParserRuleCall_5_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXRecordAccess().getConstraintsXConstraintParserRuleCall_5_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__ConstraintsAssignment_5_1_1"


    // $ANTLR start "rule__Field__CommentAssignment_1"
    // InternalXMachine.g:7130:1: rule__Field__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Field__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7134:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7135:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7135:2: ( RULE_STRING )
            // InternalXMachine.g:7136:3: RULE_STRING
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
    // InternalXMachine.g:7145:1: rule__Field__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7149:1: ( ( RULE_ID ) )
            // InternalXMachine.g:7150:2: ( RULE_ID )
            {
            // InternalXMachine.g:7150:2: ( RULE_ID )
            // InternalXMachine.g:7151:3: RULE_ID
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
    // InternalXMachine.g:7160:1: rule__Field__MultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Field__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7164:1: ( ( ruleMultiplicity ) )
            // InternalXMachine.g:7165:2: ( ruleMultiplicity )
            {
            // InternalXMachine.g:7165:2: ( ruleMultiplicity )
            // InternalXMachine.g:7166:3: ruleMultiplicity
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
    // InternalXMachine.g:7175:1: rule__Field__TypeAssignment_5 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7179:1: ( ( ruleFieldType ) )
            // InternalXMachine.g:7180:2: ( ruleFieldType )
            {
            // InternalXMachine.g:7180:2: ( ruleFieldType )
            // InternalXMachine.g:7181:3: ruleFieldType
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
    // InternalXMachine.g:7190:1: rule__XConstraint__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XConstraint__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7194:1: ( ( RULE_STRING ) )
            // InternalXMachine.g:7195:2: ( RULE_STRING )
            {
            // InternalXMachine.g:7195:2: ( RULE_STRING )
            // InternalXMachine.g:7196:3: RULE_STRING
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
    // InternalXMachine.g:7205:1: rule__XConstraint__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XConstraint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7209:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:7210:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:7210:2: ( RULE_XLABEL )
            // InternalXMachine.g:7211:3: RULE_XLABEL
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
    // InternalXMachine.g:7220:1: rule__XConstraint__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XConstraint__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:7224:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:7225:2: ( ruleXFormula )
            {
            // InternalXMachine.g:7225:2: ( ruleXFormula )
            // InternalXMachine.g:7226:3: ruleXFormula
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
        // InternalXMachine.g:6008:8: ( rule__Machine__OrderedChildrenAssignment_4_0 )
        // InternalXMachine.g:6008:9: rule__Machine__OrderedChildrenAssignment_4_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFC1FFFE072L,0x000FFFFFFFFFFFFFL,0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L,0x0400000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000080L,0xC870000000000000L,0x00000000001A20E3L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000082L,0x8070000000000000L,0x00000000001A20E1L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000182000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000182000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x003800001E000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xFFFFFFFC1FFFE070L,0x000FFFFFFFFFFFFFL,0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001FFE000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001FFE002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000080L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000080L,0x8070000000000000L,0x00000000001A20E1L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000003C0000000L,0x1800000000000000L,0x0000000000040700L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000182L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x001FFFFC1E000010L,0x0380000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x3000000000000000L,0x0000000000000004L});

}
