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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_XLABEL", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'where'", "'when'", "'then'", "'begin'", "'BOOL'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21151'", "'\\u2115'", "'\\u21191'", "'\\u2119'", "'\\u2124'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'\\u00D7'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'ordinary'", "'convergent'", "'anticipated'", "'one'", "'many'", "'opt'", "'machine'", "'end'", "'refines'", "'sees'", "'contains'", "'variables'", "'records'", "'invariants'", "'variants'", "'events'", "'includes'", "'to'", "'as'", "'event'", "'any'", "'with'", "'synchronises'", "'%'", "'\\u22C2'", "'record'", "'extends'", "'theorem'"
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
    public static final int RULE_INT=7;
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
    public static final int RULE_XLABEL=8;
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


    // $ANTLR start "entryRuleXVariable"
    // InternalXMachine.g:153:1: entryRuleXVariable : ruleXVariable EOF ;
    public final void entryRuleXVariable() throws RecognitionException {
        try {
            // InternalXMachine.g:154:1: ( ruleXVariable EOF )
            // InternalXMachine.g:155:1: ruleXVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariableRule()); 
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
    // $ANTLR end "entryRuleXVariable"


    // $ANTLR start "ruleXVariable"
    // InternalXMachine.g:162:1: ruleXVariable : ( ( rule__XVariable__Group__0 ) ) ;
    public final void ruleXVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:166:2: ( ( ( rule__XVariable__Group__0 ) ) )
            // InternalXMachine.g:167:2: ( ( rule__XVariable__Group__0 ) )
            {
            // InternalXMachine.g:167:2: ( ( rule__XVariable__Group__0 ) )
            // InternalXMachine.g:168:3: ( rule__XVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getGroup()); 
            }
            // InternalXMachine.g:169:3: ( rule__XVariable__Group__0 )
            // InternalXMachine.g:169:4: rule__XVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXVariable"


    // $ANTLR start "entryRuleXInvariant"
    // InternalXMachine.g:178:1: entryRuleXInvariant : ruleXInvariant EOF ;
    public final void entryRuleXInvariant() throws RecognitionException {
        try {
            // InternalXMachine.g:179:1: ( ruleXInvariant EOF )
            // InternalXMachine.g:180:1: ruleXInvariant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantRule()); 
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
    // $ANTLR end "entryRuleXInvariant"


    // $ANTLR start "ruleXInvariant"
    // InternalXMachine.g:187:1: ruleXInvariant : ( ( rule__XInvariant__Group__0 ) ) ;
    public final void ruleXInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:191:2: ( ( ( rule__XInvariant__Group__0 ) ) )
            // InternalXMachine.g:192:2: ( ( rule__XInvariant__Group__0 ) )
            {
            // InternalXMachine.g:192:2: ( ( rule__XInvariant__Group__0 ) )
            // InternalXMachine.g:193:3: ( rule__XInvariant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getGroup()); 
            }
            // InternalXMachine.g:194:3: ( rule__XInvariant__Group__0 )
            // InternalXMachine.g:194:4: rule__XInvariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXInvariant"


    // $ANTLR start "entryRuleXVariant"
    // InternalXMachine.g:203:1: entryRuleXVariant : ruleXVariant EOF ;
    public final void entryRuleXVariant() throws RecognitionException {
        try {
            // InternalXMachine.g:204:1: ( ruleXVariant EOF )
            // InternalXMachine.g:205:1: ruleXVariant EOF
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
    // InternalXMachine.g:212:1: ruleXVariant : ( ( rule__XVariant__Group__0 ) ) ;
    public final void ruleXVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:216:2: ( ( ( rule__XVariant__Group__0 ) ) )
            // InternalXMachine.g:217:2: ( ( rule__XVariant__Group__0 ) )
            {
            // InternalXMachine.g:217:2: ( ( rule__XVariant__Group__0 ) )
            // InternalXMachine.g:218:3: ( rule__XVariant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getGroup()); 
            }
            // InternalXMachine.g:219:3: ( rule__XVariant__Group__0 )
            // InternalXMachine.g:219:4: rule__XVariant__Group__0
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
    // InternalXMachine.g:228:1: entryRuleXEvent : ruleXEvent EOF ;
    public final void entryRuleXEvent() throws RecognitionException {
        try {
            // InternalXMachine.g:229:1: ( ruleXEvent EOF )
            // InternalXMachine.g:230:1: ruleXEvent EOF
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
    // InternalXMachine.g:237:1: ruleXEvent : ( ( rule__XEvent__Group__0 ) ) ;
    public final void ruleXEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:241:2: ( ( ( rule__XEvent__Group__0 ) ) )
            // InternalXMachine.g:242:2: ( ( rule__XEvent__Group__0 ) )
            {
            // InternalXMachine.g:242:2: ( ( rule__XEvent__Group__0 ) )
            // InternalXMachine.g:243:3: ( rule__XEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup()); 
            }
            // InternalXMachine.g:244:3: ( rule__XEvent__Group__0 )
            // InternalXMachine.g:244:4: rule__XEvent__Group__0
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
    // InternalXMachine.g:253:1: entryRuleEventSync : ruleEventSync EOF ;
    public final void entryRuleEventSync() throws RecognitionException {
        try {
            // InternalXMachine.g:254:1: ( ruleEventSync EOF )
            // InternalXMachine.g:255:1: ruleEventSync EOF
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
    // InternalXMachine.g:262:1: ruleEventSync : ( ( rule__EventSync__Group__0 ) ) ;
    public final void ruleEventSync() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:266:2: ( ( ( rule__EventSync__Group__0 ) ) )
            // InternalXMachine.g:267:2: ( ( rule__EventSync__Group__0 ) )
            {
            // InternalXMachine.g:267:2: ( ( rule__EventSync__Group__0 ) )
            // InternalXMachine.g:268:3: ( rule__EventSync__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup()); 
            }
            // InternalXMachine.g:269:3: ( rule__EventSync__Group__0 )
            // InternalXMachine.g:269:4: rule__EventSync__Group__0
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
    // InternalXMachine.g:278:1: entryRuleXParameter : ruleXParameter EOF ;
    public final void entryRuleXParameter() throws RecognitionException {
        try {
            // InternalXMachine.g:279:1: ( ruleXParameter EOF )
            // InternalXMachine.g:280:1: ruleXParameter EOF
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
    // InternalXMachine.g:287:1: ruleXParameter : ( ( rule__XParameter__Group__0 ) ) ;
    public final void ruleXParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:291:2: ( ( ( rule__XParameter__Group__0 ) ) )
            // InternalXMachine.g:292:2: ( ( rule__XParameter__Group__0 ) )
            {
            // InternalXMachine.g:292:2: ( ( rule__XParameter__Group__0 ) )
            // InternalXMachine.g:293:3: ( rule__XParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getGroup()); 
            }
            // InternalXMachine.g:294:3: ( rule__XParameter__Group__0 )
            // InternalXMachine.g:294:4: rule__XParameter__Group__0
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
    // InternalXMachine.g:303:1: entryRuleXGuard : ruleXGuard EOF ;
    public final void entryRuleXGuard() throws RecognitionException {
        try {
            // InternalXMachine.g:304:1: ( ruleXGuard EOF )
            // InternalXMachine.g:305:1: ruleXGuard EOF
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
    // InternalXMachine.g:312:1: ruleXGuard : ( ( rule__XGuard__Group__0 ) ) ;
    public final void ruleXGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:316:2: ( ( ( rule__XGuard__Group__0 ) ) )
            // InternalXMachine.g:317:2: ( ( rule__XGuard__Group__0 ) )
            {
            // InternalXMachine.g:317:2: ( ( rule__XGuard__Group__0 ) )
            // InternalXMachine.g:318:3: ( rule__XGuard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGroup()); 
            }
            // InternalXMachine.g:319:3: ( rule__XGuard__Group__0 )
            // InternalXMachine.g:319:4: rule__XGuard__Group__0
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
    // InternalXMachine.g:328:1: entryRuleXWitness : ruleXWitness EOF ;
    public final void entryRuleXWitness() throws RecognitionException {
        try {
            // InternalXMachine.g:329:1: ( ruleXWitness EOF )
            // InternalXMachine.g:330:1: ruleXWitness EOF
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
    // InternalXMachine.g:337:1: ruleXWitness : ( ( rule__XWitness__Group__0 ) ) ;
    public final void ruleXWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:341:2: ( ( ( rule__XWitness__Group__0 ) ) )
            // InternalXMachine.g:342:2: ( ( rule__XWitness__Group__0 ) )
            {
            // InternalXMachine.g:342:2: ( ( rule__XWitness__Group__0 ) )
            // InternalXMachine.g:343:3: ( rule__XWitness__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getGroup()); 
            }
            // InternalXMachine.g:344:3: ( rule__XWitness__Group__0 )
            // InternalXMachine.g:344:4: rule__XWitness__Group__0
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
    // InternalXMachine.g:353:1: entryRuleXAction : ruleXAction EOF ;
    public final void entryRuleXAction() throws RecognitionException {
        try {
            // InternalXMachine.g:354:1: ( ruleXAction EOF )
            // InternalXMachine.g:355:1: ruleXAction EOF
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
    // InternalXMachine.g:362:1: ruleXAction : ( ( rule__XAction__Group__0 ) ) ;
    public final void ruleXAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:366:2: ( ( ( rule__XAction__Group__0 ) ) )
            // InternalXMachine.g:367:2: ( ( rule__XAction__Group__0 ) )
            {
            // InternalXMachine.g:367:2: ( ( rule__XAction__Group__0 ) )
            // InternalXMachine.g:368:3: ( rule__XAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getGroup()); 
            }
            // InternalXMachine.g:369:3: ( rule__XAction__Group__0 )
            // InternalXMachine.g:369:4: rule__XAction__Group__0
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
    // InternalXMachine.g:378:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalXMachine.g:379:1: ( ruleXFormula EOF )
            // InternalXMachine.g:380:1: ruleXFormula EOF
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
    // InternalXMachine.g:387:1: ruleXFormula : ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:391:2: ( ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) )
            // InternalXMachine.g:392:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            {
            // InternalXMachine.g:392:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            // InternalXMachine.g:393:3: ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* )
            {
            // InternalXMachine.g:393:3: ( ( rule__XFormula__Alternatives ) )
            // InternalXMachine.g:394:4: ( rule__XFormula__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            }
            // InternalXMachine.g:395:4: ( rule__XFormula__Alternatives )
            // InternalXMachine.g:395:5: rule__XFormula__Alternatives
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

            // InternalXMachine.g:398:3: ( ( rule__XFormula__Alternatives )* )
            // InternalXMachine.g:399:4: ( rule__XFormula__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            }
            // InternalXMachine.g:400:4: ( rule__XFormula__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=16 && LA1_0<=113)||LA1_0==137) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXMachine.g:400:5: rule__XFormula__Alternatives
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
    // InternalXMachine.g:410:1: entryRuleEVENTB_IDENTIFIER_KEYWORD : ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final void entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        try {
            // InternalXMachine.g:411:1: ( ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXMachine.g:412:1: ruleEVENTB_IDENTIFIER_KEYWORD EOF
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
    // InternalXMachine.g:419:1: ruleEVENTB_IDENTIFIER_KEYWORD : ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) ;
    public final void ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:423:2: ( ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) )
            // InternalXMachine.g:424:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            {
            // InternalXMachine.g:424:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            // InternalXMachine.g:425:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            }
            // InternalXMachine.g:426:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            // InternalXMachine.g:426:4: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives
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
    // InternalXMachine.g:435:1: entryRuleEVENTB_PREDICATE_SYMBOLS : ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final void entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        try {
            // InternalXMachine.g:436:1: ( ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXMachine.g:437:1: ruleEVENTB_PREDICATE_SYMBOLS EOF
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
    // InternalXMachine.g:444:1: ruleEVENTB_PREDICATE_SYMBOLS : ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:448:2: ( ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) )
            // InternalXMachine.g:449:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            {
            // InternalXMachine.g:449:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            // InternalXMachine.g:450:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            }
            // InternalXMachine.g:451:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            // InternalXMachine.g:451:4: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives
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
    // InternalXMachine.g:460:1: entryRuleEVENTB_EXPRESSION_SYMBOLS : ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final void entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        try {
            // InternalXMachine.g:461:1: ( ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXMachine.g:462:1: ruleEVENTB_EXPRESSION_SYMBOLS EOF
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
    // InternalXMachine.g:469:1: ruleEVENTB_EXPRESSION_SYMBOLS : ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:473:2: ( ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) )
            // InternalXMachine.g:474:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            {
            // InternalXMachine.g:474:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            // InternalXMachine.g:475:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            }
            // InternalXMachine.g:476:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            // InternalXMachine.g:476:4: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives
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


    // $ANTLR start "entryRuleRecord"
    // InternalXMachine.g:485:1: entryRuleRecord : ruleRecord EOF ;
    public final void entryRuleRecord() throws RecognitionException {
        try {
            // InternalXMachine.g:486:1: ( ruleRecord EOF )
            // InternalXMachine.g:487:1: ruleRecord EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRecord();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordRule()); 
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
    // $ANTLR end "entryRuleRecord"


    // $ANTLR start "ruleRecord"
    // InternalXMachine.g:494:1: ruleRecord : ( ( rule__Record__Group__0 ) ) ;
    public final void ruleRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:498:2: ( ( ( rule__Record__Group__0 ) ) )
            // InternalXMachine.g:499:2: ( ( rule__Record__Group__0 ) )
            {
            // InternalXMachine.g:499:2: ( ( rule__Record__Group__0 ) )
            // InternalXMachine.g:500:3: ( rule__Record__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getGroup()); 
            }
            // InternalXMachine.g:501:3: ( rule__Record__Group__0 )
            // InternalXMachine.g:501:4: rule__Record__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecord"


    // $ANTLR start "entryRuleFieldType"
    // InternalXMachine.g:510:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // InternalXMachine.g:511:1: ( ruleFieldType EOF )
            // InternalXMachine.g:512:1: ruleFieldType EOF
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
    // InternalXMachine.g:519:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:523:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalXMachine.g:524:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalXMachine.g:524:2: ( ( rule__FieldType__Alternatives ) )
            // InternalXMachine.g:525:3: ( rule__FieldType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            }
            // InternalXMachine.g:526:3: ( rule__FieldType__Alternatives )
            // InternalXMachine.g:526:4: rule__FieldType__Alternatives
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
    // InternalXMachine.g:535:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalXMachine.g:536:1: ( ruleField EOF )
            // InternalXMachine.g:537:1: ruleField EOF
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
    // InternalXMachine.g:544:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:548:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalXMachine.g:549:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalXMachine.g:549:2: ( ( rule__Field__Group__0 ) )
            // InternalXMachine.g:550:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalXMachine.g:551:3: ( rule__Field__Group__0 )
            // InternalXMachine.g:551:4: rule__Field__Group__0
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


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:560:1: ruleXConvergence : ( ( rule__XConvergence__Alternatives ) ) ;
    public final void ruleXConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:564:1: ( ( ( rule__XConvergence__Alternatives ) ) )
            // InternalXMachine.g:565:2: ( ( rule__XConvergence__Alternatives ) )
            {
            // InternalXMachine.g:565:2: ( ( rule__XConvergence__Alternatives ) )
            // InternalXMachine.g:566:3: ( rule__XConvergence__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            }
            // InternalXMachine.g:567:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:567:4: rule__XConvergence__Alternatives
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
    // InternalXMachine.g:576:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:580:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalXMachine.g:581:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalXMachine.g:581:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalXMachine.g:582:3: ( rule__Multiplicity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            }
            // InternalXMachine.g:583:3: ( rule__Multiplicity__Alternatives )
            // InternalXMachine.g:583:4: rule__Multiplicity__Alternatives
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


    // $ANTLR start "rule__Machine__CommentAlternatives_1_0"
    // InternalXMachine.g:591:1: rule__Machine__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Machine__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:595:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ML_COMMENT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:596:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:596:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:597:3: RULE_ML_COMMENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ML_COMMENT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:602:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:602:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:603:3: RULE_SL_COMMENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_SL_COMMENT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
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
    // $ANTLR end "rule__Machine__CommentAlternatives_1_0"


    // $ANTLR start "rule__XEvent__Alternatives_4"
    // InternalXMachine.g:612:1: rule__XEvent__Alternatives_4 : ( ( ( rule__XEvent__Group_4_0__0 ) ) | ( ( rule__XEvent__Group_4_1__0 ) ) );
    public final void rule__XEvent__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:616:1: ( ( ( rule__XEvent__Group_4_0__0 ) ) | ( ( rule__XEvent__Group_4_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==122) ) {
                alt3=1;
            }
            else if ( (LA3_0==140) ) {
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
                    // InternalXMachine.g:617:2: ( ( rule__XEvent__Group_4_0__0 ) )
                    {
                    // InternalXMachine.g:617:2: ( ( rule__XEvent__Group_4_0__0 ) )
                    // InternalXMachine.g:618:3: ( rule__XEvent__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_4_0()); 
                    }
                    // InternalXMachine.g:619:3: ( rule__XEvent__Group_4_0__0 )
                    // InternalXMachine.g:619:4: rule__XEvent__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:623:2: ( ( rule__XEvent__Group_4_1__0 ) )
                    {
                    // InternalXMachine.g:623:2: ( ( rule__XEvent__Group_4_1__0 ) )
                    // InternalXMachine.g:624:3: ( rule__XEvent__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_4_1()); 
                    }
                    // InternalXMachine.g:625:3: ( rule__XEvent__Group_4_1__0 )
                    // InternalXMachine.g:625:4: rule__XEvent__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__XEvent__Alternatives_4"


    // $ANTLR start "rule__XEvent__Alternatives_7_0"
    // InternalXMachine.g:633:1: rule__XEvent__Alternatives_7_0 : ( ( 'where' ) | ( 'when' ) );
    public final void rule__XEvent__Alternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:637:1: ( ( 'where' ) | ( 'when' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
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
                    // InternalXMachine.g:638:2: ( 'where' )
                    {
                    // InternalXMachine.g:638:2: ( 'where' )
                    // InternalXMachine.g:639:3: 'where'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getWhereKeyword_7_0_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getWhereKeyword_7_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:644:2: ( 'when' )
                    {
                    // InternalXMachine.g:644:2: ( 'when' )
                    // InternalXMachine.g:645:3: 'when'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getWhenKeyword_7_0_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getWhenKeyword_7_0_1()); 
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
    // $ANTLR end "rule__XEvent__Alternatives_7_0"


    // $ANTLR start "rule__XEvent__Alternatives_8_0"
    // InternalXMachine.g:654:1: rule__XEvent__Alternatives_8_0 : ( ( 'then' ) | ( 'begin' ) );
    public final void rule__XEvent__Alternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:658:1: ( ( 'then' ) | ( 'begin' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
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
                    // InternalXMachine.g:659:2: ( 'then' )
                    {
                    // InternalXMachine.g:659:2: ( 'then' )
                    // InternalXMachine.g:660:3: 'then'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getThenKeyword_8_0_0()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getThenKeyword_8_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:665:2: ( 'begin' )
                    {
                    // InternalXMachine.g:665:2: ( 'begin' )
                    // InternalXMachine.g:666:3: 'begin'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getBeginKeyword_8_0_1()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXEventAccess().getBeginKeyword_8_0_1()); 
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


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalXMachine.g:675:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:679:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
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
                {
                alt6=1;
                }
                break;
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
                {
                alt6=2;
                }
                break;
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
            case 137:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            case RULE_INT:
                {
                alt6=5;
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
                    // InternalXMachine.g:680:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXMachine.g:680:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXMachine.g:681:3: ruleEVENTB_IDENTIFIER_KEYWORD
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
                    // InternalXMachine.g:686:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXMachine.g:686:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXMachine.g:687:3: ruleEVENTB_PREDICATE_SYMBOLS
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
                    // InternalXMachine.g:692:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXMachine.g:692:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXMachine.g:693:3: ruleEVENTB_EXPRESSION_SYMBOLS
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
                    // InternalXMachine.g:698:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:698:2: ( RULE_ID )
                    // InternalXMachine.g:699:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:704:2: ( RULE_INT )
                    {
                    // InternalXMachine.g:704:2: ( RULE_INT )
                    // InternalXMachine.g:705:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 
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
    // InternalXMachine.g:714:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:718:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
            int alt7=23;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            case 24:
                {
                alt7=9;
                }
                break;
            case 25:
                {
                alt7=10;
                }
                break;
            case 26:
                {
                alt7=11;
                }
                break;
            case 27:
                {
                alt7=12;
                }
                break;
            case 28:
                {
                alt7=13;
                }
                break;
            case 29:
                {
                alt7=14;
                }
                break;
            case 30:
                {
                alt7=15;
                }
                break;
            case 31:
                {
                alt7=16;
                }
                break;
            case 32:
                {
                alt7=17;
                }
                break;
            case 33:
                {
                alt7=18;
                }
                break;
            case 34:
                {
                alt7=19;
                }
                break;
            case 35:
                {
                alt7=20;
                }
                break;
            case 36:
                {
                alt7=21;
                }
                break;
            case 37:
                {
                alt7=22;
                }
                break;
            case 38:
                {
                alt7=23;
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
                    // InternalXMachine.g:719:2: ( 'BOOL' )
                    {
                    // InternalXMachine.g:719:2: ( 'BOOL' )
                    // InternalXMachine.g:720:3: 'BOOL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:725:2: ( 'FALSE' )
                    {
                    // InternalXMachine.g:725:2: ( 'FALSE' )
                    // InternalXMachine.g:726:3: 'FALSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:731:2: ( 'TRUE' )
                    {
                    // InternalXMachine.g:731:2: ( 'TRUE' )
                    // InternalXMachine.g:732:3: 'TRUE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:737:2: ( 'bool' )
                    {
                    // InternalXMachine.g:737:2: ( 'bool' )
                    // InternalXMachine.g:738:3: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:743:2: ( 'card' )
                    {
                    // InternalXMachine.g:743:2: ( 'card' )
                    // InternalXMachine.g:744:3: 'card'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:749:2: ( 'dom' )
                    {
                    // InternalXMachine.g:749:2: ( 'dom' )
                    // InternalXMachine.g:750:3: 'dom'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:755:2: ( 'finite' )
                    {
                    // InternalXMachine.g:755:2: ( 'finite' )
                    // InternalXMachine.g:756:3: 'finite'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:761:2: ( 'id' )
                    {
                    // InternalXMachine.g:761:2: ( 'id' )
                    // InternalXMachine.g:762:3: 'id'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:767:2: ( 'inter' )
                    {
                    // InternalXMachine.g:767:2: ( 'inter' )
                    // InternalXMachine.g:768:3: 'inter'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:773:2: ( 'max' )
                    {
                    // InternalXMachine.g:773:2: ( 'max' )
                    // InternalXMachine.g:774:3: 'max'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:779:2: ( 'min' )
                    {
                    // InternalXMachine.g:779:2: ( 'min' )
                    // InternalXMachine.g:780:3: 'min'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:785:2: ( 'mod' )
                    {
                    // InternalXMachine.g:785:2: ( 'mod' )
                    // InternalXMachine.g:786:3: 'mod'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:791:2: ( 'pred' )
                    {
                    // InternalXMachine.g:791:2: ( 'pred' )
                    // InternalXMachine.g:792:3: 'pred'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:797:2: ( 'prj1' )
                    {
                    // InternalXMachine.g:797:2: ( 'prj1' )
                    // InternalXMachine.g:798:3: 'prj1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:803:2: ( 'prj2' )
                    {
                    // InternalXMachine.g:803:2: ( 'prj2' )
                    // InternalXMachine.g:804:3: 'prj2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:809:2: ( 'ran' )
                    {
                    // InternalXMachine.g:809:2: ( 'ran' )
                    // InternalXMachine.g:810:3: 'ran'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:815:2: ( 'succ' )
                    {
                    // InternalXMachine.g:815:2: ( 'succ' )
                    // InternalXMachine.g:816:3: 'succ'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:821:2: ( 'union' )
                    {
                    // InternalXMachine.g:821:2: ( 'union' )
                    // InternalXMachine.g:822:3: 'union'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:827:2: ( '\\u21151' )
                    {
                    // InternalXMachine.g:827:2: ( '\\u21151' )
                    // InternalXMachine.g:828:3: '\\u21151'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:833:2: ( '\\u2115' )
                    {
                    // InternalXMachine.g:833:2: ( '\\u2115' )
                    // InternalXMachine.g:834:3: '\\u2115'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:839:2: ( '\\u21191' )
                    {
                    // InternalXMachine.g:839:2: ( '\\u21191' )
                    // InternalXMachine.g:840:3: '\\u21191'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:845:2: ( '\\u2119' )
                    {
                    // InternalXMachine.g:845:2: ( '\\u2119' )
                    // InternalXMachine.g:846:3: '\\u2119'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:851:2: ( '\\u2124' )
                    {
                    // InternalXMachine.g:851:2: ( '\\u2124' )
                    // InternalXMachine.g:852:3: '\\u2124'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:861:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:865:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
            int alt8=31;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt8=1;
                }
                break;
            case 40:
                {
                alt8=2;
                }
                break;
            case 41:
                {
                alt8=3;
                }
                break;
            case 42:
                {
                alt8=4;
                }
                break;
            case 43:
                {
                alt8=5;
                }
                break;
            case 44:
                {
                alt8=6;
                }
                break;
            case 45:
                {
                alt8=7;
                }
                break;
            case 46:
                {
                alt8=8;
                }
                break;
            case 47:
                {
                alt8=9;
                }
                break;
            case 48:
                {
                alt8=10;
                }
                break;
            case 49:
                {
                alt8=11;
                }
                break;
            case 50:
                {
                alt8=12;
                }
                break;
            case 51:
                {
                alt8=13;
                }
                break;
            case 52:
                {
                alt8=14;
                }
                break;
            case 53:
                {
                alt8=15;
                }
                break;
            case 54:
                {
                alt8=16;
                }
                break;
            case 55:
                {
                alt8=17;
                }
                break;
            case 56:
                {
                alt8=18;
                }
                break;
            case 57:
                {
                alt8=19;
                }
                break;
            case 58:
                {
                alt8=20;
                }
                break;
            case 59:
                {
                alt8=21;
                }
                break;
            case 60:
                {
                alt8=22;
                }
                break;
            case 61:
                {
                alt8=23;
                }
                break;
            case 62:
                {
                alt8=24;
                }
                break;
            case 63:
                {
                alt8=25;
                }
                break;
            case 64:
                {
                alt8=26;
                }
                break;
            case 65:
                {
                alt8=27;
                }
                break;
            case 66:
                {
                alt8=28;
                }
                break;
            case 67:
                {
                alt8=29;
                }
                break;
            case 68:
                {
                alt8=30;
                }
                break;
            case 69:
                {
                alt8=31;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:866:2: ( '(' )
                    {
                    // InternalXMachine.g:866:2: ( '(' )
                    // InternalXMachine.g:867:3: '('
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:872:2: ( ')' )
                    {
                    // InternalXMachine.g:872:2: ( ')' )
                    // InternalXMachine.g:873:3: ')'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:878:2: ( '\\u21D4' )
                    {
                    // InternalXMachine.g:878:2: ( '\\u21D4' )
                    // InternalXMachine.g:879:3: '\\u21D4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:884:2: ( '\\u21D2' )
                    {
                    // InternalXMachine.g:884:2: ( '\\u21D2' )
                    // InternalXMachine.g:885:3: '\\u21D2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:890:2: ( '\\u2227' )
                    {
                    // InternalXMachine.g:890:2: ( '\\u2227' )
                    // InternalXMachine.g:891:3: '\\u2227'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:896:2: ( '&' )
                    {
                    // InternalXMachine.g:896:2: ( '&' )
                    // InternalXMachine.g:897:3: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    }
                    match(input,44,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:902:2: ( '\\u2228' )
                    {
                    // InternalXMachine.g:902:2: ( '\\u2228' )
                    // InternalXMachine.g:903:3: '\\u2228'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    }
                    match(input,45,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:908:2: ( '\\u00AC' )
                    {
                    // InternalXMachine.g:908:2: ( '\\u00AC' )
                    // InternalXMachine.g:909:3: '\\u00AC'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    }
                    match(input,46,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:914:2: ( '\\u22A4' )
                    {
                    // InternalXMachine.g:914:2: ( '\\u22A4' )
                    // InternalXMachine.g:915:3: '\\u22A4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    }
                    match(input,47,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:920:2: ( '\\u22A5' )
                    {
                    // InternalXMachine.g:920:2: ( '\\u22A5' )
                    // InternalXMachine.g:921:3: '\\u22A5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    }
                    match(input,48,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:926:2: ( '\\u2200' )
                    {
                    // InternalXMachine.g:926:2: ( '\\u2200' )
                    // InternalXMachine.g:927:3: '\\u2200'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    }
                    match(input,49,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:932:2: ( '!' )
                    {
                    // InternalXMachine.g:932:2: ( '!' )
                    // InternalXMachine.g:933:3: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    }
                    match(input,50,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:938:2: ( '\\u2203' )
                    {
                    // InternalXMachine.g:938:2: ( '\\u2203' )
                    // InternalXMachine.g:939:3: '\\u2203'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    }
                    match(input,51,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:944:2: ( '#' )
                    {
                    // InternalXMachine.g:944:2: ( '#' )
                    // InternalXMachine.g:945:3: '#'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    }
                    match(input,52,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:950:2: ( ',' )
                    {
                    // InternalXMachine.g:950:2: ( ',' )
                    // InternalXMachine.g:951:3: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    }
                    match(input,53,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:956:2: ( '\\u00B7' )
                    {
                    // InternalXMachine.g:956:2: ( '\\u00B7' )
                    // InternalXMachine.g:957:3: '\\u00B7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    }
                    match(input,54,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:962:2: ( '.' )
                    {
                    // InternalXMachine.g:962:2: ( '.' )
                    // InternalXMachine.g:963:3: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    }
                    match(input,55,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:968:2: ( '=' )
                    {
                    // InternalXMachine.g:968:2: ( '=' )
                    // InternalXMachine.g:969:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    }
                    match(input,56,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:974:2: ( '\\u2260' )
                    {
                    // InternalXMachine.g:974:2: ( '\\u2260' )
                    // InternalXMachine.g:975:3: '\\u2260'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    }
                    match(input,57,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:980:2: ( '\\u2264' )
                    {
                    // InternalXMachine.g:980:2: ( '\\u2264' )
                    // InternalXMachine.g:981:3: '\\u2264'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    }
                    match(input,58,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:986:2: ( '<' )
                    {
                    // InternalXMachine.g:986:2: ( '<' )
                    // InternalXMachine.g:987:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    }
                    match(input,59,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:992:2: ( '\\u2265' )
                    {
                    // InternalXMachine.g:992:2: ( '\\u2265' )
                    // InternalXMachine.g:993:3: '\\u2265'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    }
                    match(input,60,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:998:2: ( '>' )
                    {
                    // InternalXMachine.g:998:2: ( '>' )
                    // InternalXMachine.g:999:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    }
                    match(input,61,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1004:2: ( '\\u2208' )
                    {
                    // InternalXMachine.g:1004:2: ( '\\u2208' )
                    // InternalXMachine.g:1005:3: '\\u2208'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    }
                    match(input,62,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1010:2: ( ':' )
                    {
                    // InternalXMachine.g:1010:2: ( ':' )
                    // InternalXMachine.g:1011:3: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    }
                    match(input,63,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1016:2: ( '\\u2209' )
                    {
                    // InternalXMachine.g:1016:2: ( '\\u2209' )
                    // InternalXMachine.g:1017:3: '\\u2209'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    }
                    match(input,64,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1022:2: ( '\\u2282' )
                    {
                    // InternalXMachine.g:1022:2: ( '\\u2282' )
                    // InternalXMachine.g:1023:3: '\\u2282'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    }
                    match(input,65,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1028:2: ( '\\u2284' )
                    {
                    // InternalXMachine.g:1028:2: ( '\\u2284' )
                    // InternalXMachine.g:1029:3: '\\u2284'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    }
                    match(input,66,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1034:2: ( '\\u2286' )
                    {
                    // InternalXMachine.g:1034:2: ( '\\u2286' )
                    // InternalXMachine.g:1035:3: '\\u2286'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    }
                    match(input,67,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1040:2: ( '\\u2288' )
                    {
                    // InternalXMachine.g:1040:2: ( '\\u2288' )
                    // InternalXMachine.g:1041:3: '\\u2288'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    }
                    match(input,68,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1046:2: ( 'partition' )
                    {
                    // InternalXMachine.g:1046:2: ( 'partition' )
                    // InternalXMachine.g:1047:3: 'partition'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
                    }
                    match(input,69,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1056:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1060:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
            int alt9=45;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt9=1;
                }
                break;
            case 71:
                {
                alt9=2;
                }
                break;
            case 72:
                {
                alt9=3;
                }
                break;
            case 73:
                {
                alt9=4;
                }
                break;
            case 74:
                {
                alt9=5;
                }
                break;
            case 75:
                {
                alt9=6;
                }
                break;
            case 76:
                {
                alt9=7;
                }
                break;
            case 77:
                {
                alt9=8;
                }
                break;
            case 78:
                {
                alt9=9;
                }
                break;
            case 79:
                {
                alt9=10;
                }
                break;
            case 80:
                {
                alt9=11;
                }
                break;
            case 81:
                {
                alt9=12;
                }
                break;
            case 82:
                {
                alt9=13;
                }
                break;
            case 83:
                {
                alt9=14;
                }
                break;
            case 84:
                {
                alt9=15;
                }
                break;
            case 85:
                {
                alt9=16;
                }
                break;
            case 86:
                {
                alt9=17;
                }
                break;
            case 87:
                {
                alt9=18;
                }
                break;
            case 88:
                {
                alt9=19;
                }
                break;
            case 89:
                {
                alt9=20;
                }
                break;
            case 90:
                {
                alt9=21;
                }
                break;
            case 91:
                {
                alt9=22;
                }
                break;
            case 92:
                {
                alt9=23;
                }
                break;
            case 93:
                {
                alt9=24;
                }
                break;
            case 94:
                {
                alt9=25;
                }
                break;
            case 95:
                {
                alt9=26;
                }
                break;
            case 96:
                {
                alt9=27;
                }
                break;
            case 97:
                {
                alt9=28;
                }
                break;
            case 98:
                {
                alt9=29;
                }
                break;
            case 99:
                {
                alt9=30;
                }
                break;
            case 100:
                {
                alt9=31;
                }
                break;
            case 101:
                {
                alt9=32;
                }
                break;
            case 137:
                {
                alt9=33;
                }
                break;
            case 102:
                {
                alt9=34;
                }
                break;
            case 103:
                {
                alt9=35;
                }
                break;
            case 104:
                {
                alt9=36;
                }
                break;
            case 105:
                {
                alt9=37;
                }
                break;
            case 106:
                {
                alt9=38;
                }
                break;
            case 107:
                {
                alt9=39;
                }
                break;
            case 108:
                {
                alt9=40;
                }
                break;
            case 109:
                {
                alt9=41;
                }
                break;
            case 110:
                {
                alt9=42;
                }
                break;
            case 111:
                {
                alt9=43;
                }
                break;
            case 112:
                {
                alt9=44;
                }
                break;
            case 113:
                {
                alt9=45;
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
                    // InternalXMachine.g:1061:2: ( '\\u2194' )
                    {
                    // InternalXMachine.g:1061:2: ( '\\u2194' )
                    // InternalXMachine.g:1062:3: '\\u2194'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    }
                    match(input,70,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1067:2: ( '\\uE100' )
                    {
                    // InternalXMachine.g:1067:2: ( '\\uE100' )
                    // InternalXMachine.g:1068:3: '\\uE100'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    }
                    match(input,71,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1073:2: ( '\\uE101' )
                    {
                    // InternalXMachine.g:1073:2: ( '\\uE101' )
                    // InternalXMachine.g:1074:3: '\\uE101'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    }
                    match(input,72,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:1079:2: ( '\\uE102' )
                    {
                    // InternalXMachine.g:1079:2: ( '\\uE102' )
                    // InternalXMachine.g:1080:3: '\\uE102'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    }
                    match(input,73,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:1085:2: ( '\\u21F8' )
                    {
                    // InternalXMachine.g:1085:2: ( '\\u21F8' )
                    // InternalXMachine.g:1086:3: '\\u21F8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }
                    match(input,74,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:1091:2: ( '\\u2192' )
                    {
                    // InternalXMachine.g:1091:2: ( '\\u2192' )
                    // InternalXMachine.g:1092:3: '\\u2192'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    }
                    match(input,75,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:1097:2: ( '\\u2914' )
                    {
                    // InternalXMachine.g:1097:2: ( '\\u2914' )
                    // InternalXMachine.g:1098:3: '\\u2914'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }
                    match(input,76,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:1103:2: ( '\\u21A3' )
                    {
                    // InternalXMachine.g:1103:2: ( '\\u21A3' )
                    // InternalXMachine.g:1104:3: '\\u21A3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }
                    match(input,77,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:1109:2: ( '\\u2900' )
                    {
                    // InternalXMachine.g:1109:2: ( '\\u2900' )
                    // InternalXMachine.g:1110:3: '\\u2900'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }
                    match(input,78,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:1115:2: ( '\\u21A0' )
                    {
                    // InternalXMachine.g:1115:2: ( '\\u21A0' )
                    // InternalXMachine.g:1116:3: '\\u21A0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }
                    match(input,79,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:1121:2: ( '\\u2916' )
                    {
                    // InternalXMachine.g:1121:2: ( '\\u2916' )
                    // InternalXMachine.g:1122:3: '\\u2916'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }
                    match(input,80,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:1127:2: ( '{' )
                    {
                    // InternalXMachine.g:1127:2: ( '{' )
                    // InternalXMachine.g:1128:3: '{'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    }
                    match(input,81,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:1133:2: ( '}' )
                    {
                    // InternalXMachine.g:1133:2: ( '}' )
                    // InternalXMachine.g:1134:3: '}'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    }
                    match(input,82,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:1139:2: ( '\\u21A6' )
                    {
                    // InternalXMachine.g:1139:2: ( '\\u21A6' )
                    // InternalXMachine.g:1140:3: '\\u21A6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    }
                    match(input,83,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:1145:2: ( '\\u2205' )
                    {
                    // InternalXMachine.g:1145:2: ( '\\u2205' )
                    // InternalXMachine.g:1146:3: '\\u2205'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    }
                    match(input,84,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:1151:2: ( '\\u2229' )
                    {
                    // InternalXMachine.g:1151:2: ( '\\u2229' )
                    // InternalXMachine.g:1152:3: '\\u2229'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    }
                    match(input,85,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1157:2: ( '\\u222A' )
                    {
                    // InternalXMachine.g:1157:2: ( '\\u222A' )
                    // InternalXMachine.g:1158:3: '\\u222A'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    }
                    match(input,86,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1163:2: ( '\\u2216' )
                    {
                    // InternalXMachine.g:1163:2: ( '\\u2216' )
                    // InternalXMachine.g:1164:3: '\\u2216'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    }
                    match(input,87,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1169:2: ( '\\u00D7' )
                    {
                    // InternalXMachine.g:1169:2: ( '\\u00D7' )
                    // InternalXMachine.g:1170:3: '\\u00D7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    }
                    match(input,88,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1175:2: ( '[' )
                    {
                    // InternalXMachine.g:1175:2: ( '[' )
                    // InternalXMachine.g:1176:3: '['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    }
                    match(input,89,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1181:2: ( ']' )
                    {
                    // InternalXMachine.g:1181:2: ( ']' )
                    // InternalXMachine.g:1182:3: ']'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    }
                    match(input,90,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1187:2: ( '\\uE103' )
                    {
                    // InternalXMachine.g:1187:2: ( '\\uE103' )
                    // InternalXMachine.g:1188:3: '\\uE103'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    }
                    match(input,91,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1193:2: ( '\\u2218' )
                    {
                    // InternalXMachine.g:1193:2: ( '\\u2218' )
                    // InternalXMachine.g:1194:3: '\\u2218'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    }
                    match(input,92,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1199:2: ( ';' )
                    {
                    // InternalXMachine.g:1199:2: ( ';' )
                    // InternalXMachine.g:1200:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    }
                    match(input,93,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1205:2: ( '\\u2297' )
                    {
                    // InternalXMachine.g:1205:2: ( '\\u2297' )
                    // InternalXMachine.g:1206:3: '\\u2297'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    }
                    match(input,94,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1211:2: ( '\\u2225' )
                    {
                    // InternalXMachine.g:1211:2: ( '\\u2225' )
                    // InternalXMachine.g:1212:3: '\\u2225'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    }
                    match(input,95,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1217:2: ( '\\u223C' )
                    {
                    // InternalXMachine.g:1217:2: ( '\\u223C' )
                    // InternalXMachine.g:1218:3: '\\u223C'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    }
                    match(input,96,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1223:2: ( '\\u25C1' )
                    {
                    // InternalXMachine.g:1223:2: ( '\\u25C1' )
                    // InternalXMachine.g:1224:3: '\\u25C1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    }
                    match(input,97,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1229:2: ( '\\u2A64' )
                    {
                    // InternalXMachine.g:1229:2: ( '\\u2A64' )
                    // InternalXMachine.g:1230:3: '\\u2A64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    }
                    match(input,98,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1235:2: ( '\\u25B7' )
                    {
                    // InternalXMachine.g:1235:2: ( '\\u25B7' )
                    // InternalXMachine.g:1236:3: '\\u25B7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    }
                    match(input,99,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1241:2: ( '\\u2A65' )
                    {
                    // InternalXMachine.g:1241:2: ( '\\u2A65' )
                    // InternalXMachine.g:1242:3: '\\u2A65'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    }
                    match(input,100,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // InternalXMachine.g:1247:2: ( '\\u03BB' )
                    {
                    // InternalXMachine.g:1247:2: ( '\\u03BB' )
                    // InternalXMachine.g:1248:3: '\\u03BB'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    }
                    match(input,101,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // InternalXMachine.g:1253:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalXMachine.g:1253:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalXMachine.g:1254:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    }
                    // InternalXMachine.g:1255:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalXMachine.g:1255:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
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
                    // InternalXMachine.g:1259:2: ( '\\u22C3' )
                    {
                    // InternalXMachine.g:1259:2: ( '\\u22C3' )
                    // InternalXMachine.g:1260:3: '\\u22C3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    }
                    match(input,102,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // InternalXMachine.g:1265:2: ( '\\u2223' )
                    {
                    // InternalXMachine.g:1265:2: ( '\\u2223' )
                    // InternalXMachine.g:1266:3: '\\u2223'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    }
                    match(input,103,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // InternalXMachine.g:1271:2: ( '\\u2025' )
                    {
                    // InternalXMachine.g:1271:2: ( '\\u2025' )
                    // InternalXMachine.g:1272:3: '\\u2025'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    }
                    match(input,104,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    }

                    }


                    }
                    break;
                case 37 :
                    // InternalXMachine.g:1277:2: ( '+' )
                    {
                    // InternalXMachine.g:1277:2: ( '+' )
                    // InternalXMachine.g:1278:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    }
                    match(input,105,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    }

                    }


                    }
                    break;
                case 38 :
                    // InternalXMachine.g:1283:2: ( '\\u2212' )
                    {
                    // InternalXMachine.g:1283:2: ( '\\u2212' )
                    // InternalXMachine.g:1284:3: '\\u2212'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    }
                    match(input,106,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    }

                    }


                    }
                    break;
                case 39 :
                    // InternalXMachine.g:1289:2: ( '-' )
                    {
                    // InternalXMachine.g:1289:2: ( '-' )
                    // InternalXMachine.g:1290:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    }
                    match(input,107,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    }

                    }


                    }
                    break;
                case 40 :
                    // InternalXMachine.g:1295:2: ( '\\u2217' )
                    {
                    // InternalXMachine.g:1295:2: ( '\\u2217' )
                    // InternalXMachine.g:1296:3: '\\u2217'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    }
                    match(input,108,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    }

                    }


                    }
                    break;
                case 41 :
                    // InternalXMachine.g:1301:2: ( '*' )
                    {
                    // InternalXMachine.g:1301:2: ( '*' )
                    // InternalXMachine.g:1302:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    }
                    match(input,109,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    }

                    }


                    }
                    break;
                case 42 :
                    // InternalXMachine.g:1307:2: ( '\\u00F7' )
                    {
                    // InternalXMachine.g:1307:2: ( '\\u00F7' )
                    // InternalXMachine.g:1308:3: '\\u00F7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    }
                    match(input,110,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    }

                    }


                    }
                    break;
                case 43 :
                    // InternalXMachine.g:1313:2: ( '/' )
                    {
                    // InternalXMachine.g:1313:2: ( '/' )
                    // InternalXMachine.g:1314:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    }
                    match(input,111,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    }

                    }


                    }
                    break;
                case 44 :
                    // InternalXMachine.g:1319:2: ( '^' )
                    {
                    // InternalXMachine.g:1319:2: ( '^' )
                    // InternalXMachine.g:1320:3: '^'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    }
                    match(input,112,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    }

                    }


                    }
                    break;
                case 45 :
                    // InternalXMachine.g:1325:2: ( '\\\\' )
                    {
                    // InternalXMachine.g:1325:2: ( '\\\\' )
                    // InternalXMachine.g:1326:3: '\\\\'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
                    }
                    match(input,113,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__FieldType__Alternatives"
    // InternalXMachine.g:1335:1: rule__FieldType__Alternatives : ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1339:1: ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=16 && LA10_0<=38)) ) {
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
                    // InternalXMachine.g:1340:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:1340:2: ( RULE_ID )
                    // InternalXMachine.g:1341:3: RULE_ID
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
                    // InternalXMachine.g:1346:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXMachine.g:1346:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXMachine.g:1347:3: ruleEVENTB_IDENTIFIER_KEYWORD
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
    // InternalXMachine.g:1356:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1360:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt11=1;
                }
                break;
            case 115:
                {
                alt11=2;
                }
                break;
            case 116:
                {
                alt11=3;
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
                    // InternalXMachine.g:1361:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:1361:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:1362:3: ( 'ordinary' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:1363:3: ( 'ordinary' )
                    // InternalXMachine.g:1363:4: 'ordinary'
                    {
                    match(input,114,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1367:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:1367:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:1368:3: ( 'convergent' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:1369:3: ( 'convergent' )
                    // InternalXMachine.g:1369:4: 'convergent'
                    {
                    match(input,115,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1373:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:1373:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:1374:3: ( 'anticipated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:1375:3: ( 'anticipated' )
                    // InternalXMachine.g:1375:4: 'anticipated'
                    {
                    match(input,116,FOLLOW_2); if (state.failed) return ;

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
    // InternalXMachine.g:1383:1: rule__Multiplicity__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1387:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt12=1;
                }
                break;
            case 118:
                {
                alt12=2;
                }
                break;
            case 119:
                {
                alt12=3;
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
                    // InternalXMachine.g:1388:2: ( ( 'one' ) )
                    {
                    // InternalXMachine.g:1388:2: ( ( 'one' ) )
                    // InternalXMachine.g:1389:3: ( 'one' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:1390:3: ( 'one' )
                    // InternalXMachine.g:1390:4: 'one'
                    {
                    match(input,117,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1394:2: ( ( 'many' ) )
                    {
                    // InternalXMachine.g:1394:2: ( ( 'many' ) )
                    // InternalXMachine.g:1395:3: ( 'many' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:1396:3: ( 'many' )
                    // InternalXMachine.g:1396:4: 'many'
                    {
                    match(input,118,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1400:2: ( ( 'opt' ) )
                    {
                    // InternalXMachine.g:1400:2: ( ( 'opt' ) )
                    // InternalXMachine.g:1401:3: ( 'opt' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:1402:3: ( 'opt' )
                    // InternalXMachine.g:1402:4: 'opt'
                    {
                    match(input,119,FOLLOW_2); if (state.failed) return ;

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
    // InternalXMachine.g:1410:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1414:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:1415:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
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
    // InternalXMachine.g:1422:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1426:1: ( ( () ) )
            // InternalXMachine.g:1427:1: ( () )
            {
            // InternalXMachine.g:1427:1: ( () )
            // InternalXMachine.g:1428:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            }
            // InternalXMachine.g:1429:2: ()
            // InternalXMachine.g:1429:3: 
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
    // InternalXMachine.g:1437:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1441:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:1442:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
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
    // InternalXMachine.g:1449:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__CommentAssignment_1 )? ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1453:1: ( ( ( rule__Machine__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1454:1: ( ( rule__Machine__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1454:1: ( ( rule__Machine__CommentAssignment_1 )? )
            // InternalXMachine.g:1455:2: ( rule__Machine__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:1456:2: ( rule__Machine__CommentAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ML_COMMENT && LA13_0<=RULE_SL_COMMENT)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:1456:3: rule__Machine__CommentAssignment_1
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
    // InternalXMachine.g:1464:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1468:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:1469:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
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
    // InternalXMachine.g:1476:1: rule__Machine__Group__2__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1480:1: ( ( 'machine' ) )
            // InternalXMachine.g:1481:1: ( 'machine' )
            {
            // InternalXMachine.g:1481:1: ( 'machine' )
            // InternalXMachine.g:1482:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineKeyword_2()); 
            }
            match(input,120,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1491:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1495:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:1496:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
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
    // InternalXMachine.g:1503:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__NameAssignment_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1507:1: ( ( ( rule__Machine__NameAssignment_3 ) ) )
            // InternalXMachine.g:1508:1: ( ( rule__Machine__NameAssignment_3 ) )
            {
            // InternalXMachine.g:1508:1: ( ( rule__Machine__NameAssignment_3 ) )
            // InternalXMachine.g:1509:2: ( rule__Machine__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:1510:2: ( rule__Machine__NameAssignment_3 )
            // InternalXMachine.g:1510:3: rule__Machine__NameAssignment_3
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
    // InternalXMachine.g:1518:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1522:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:1523:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
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
    // InternalXMachine.g:1530:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__UnorderedGroup_4 ) ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1534:1: ( ( ( rule__Machine__UnorderedGroup_4 ) ) )
            // InternalXMachine.g:1535:1: ( ( rule__Machine__UnorderedGroup_4 ) )
            {
            // InternalXMachine.g:1535:1: ( ( rule__Machine__UnorderedGroup_4 ) )
            // InternalXMachine.g:1536:2: ( rule__Machine__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getUnorderedGroup_4()); 
            }
            // InternalXMachine.g:1537:2: ( rule__Machine__UnorderedGroup_4 )
            // InternalXMachine.g:1537:3: rule__Machine__UnorderedGroup_4
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
    // InternalXMachine.g:1545:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1549:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:1550:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
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
    // InternalXMachine.g:1557:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1561:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:1562:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:1562:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:1563:2: ( rule__Machine__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_5()); 
            }
            // InternalXMachine.g:1564:2: ( rule__Machine__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==124) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:1564:3: rule__Machine__Group_5__0
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
    // InternalXMachine.g:1572:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1576:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXMachine.g:1577:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
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
    // InternalXMachine.g:1584:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1588:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // InternalXMachine.g:1589:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // InternalXMachine.g:1589:1: ( ( rule__Machine__Group_6__0 )? )
            // InternalXMachine.g:1590:2: ( rule__Machine__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_6()); 
            }
            // InternalXMachine.g:1591:2: ( rule__Machine__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==125) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:1591:3: rule__Machine__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_6()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:1599:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1603:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXMachine.g:1604:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
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
    // InternalXMachine.g:1611:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1615:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // InternalXMachine.g:1616:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // InternalXMachine.g:1616:1: ( ( rule__Machine__Group_7__0 )? )
            // InternalXMachine.g:1617:2: ( rule__Machine__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_7()); 
            }
            // InternalXMachine.g:1618:2: ( rule__Machine__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==126) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:1618:3: rule__Machine__Group_7__0
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
    // InternalXMachine.g:1626:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1630:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // InternalXMachine.g:1631:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Machine__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:1638:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__Group_8__0 )? ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1642:1: ( ( ( rule__Machine__Group_8__0 )? ) )
            // InternalXMachine.g:1643:1: ( ( rule__Machine__Group_8__0 )? )
            {
            // InternalXMachine.g:1643:1: ( ( rule__Machine__Group_8__0 )? )
            // InternalXMachine.g:1644:2: ( rule__Machine__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_8()); 
            }
            // InternalXMachine.g:1645:2: ( rule__Machine__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==127) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMachine.g:1645:3: rule__Machine__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_8()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Machine__Group__9"
    // InternalXMachine.g:1653:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl rule__Machine__Group__10 ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1657:1: ( rule__Machine__Group__9__Impl rule__Machine__Group__10 )
            // InternalXMachine.g:1658:2: rule__Machine__Group__9__Impl rule__Machine__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Machine__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__9"


    // $ANTLR start "rule__Machine__Group__9__Impl"
    // InternalXMachine.g:1665:1: rule__Machine__Group__9__Impl : ( ( rule__Machine__Group_9__0 )? ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1669:1: ( ( ( rule__Machine__Group_9__0 )? ) )
            // InternalXMachine.g:1670:1: ( ( rule__Machine__Group_9__0 )? )
            {
            // InternalXMachine.g:1670:1: ( ( rule__Machine__Group_9__0 )? )
            // InternalXMachine.g:1671:2: ( rule__Machine__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_9()); 
            }
            // InternalXMachine.g:1672:2: ( rule__Machine__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==128) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMachine.g:1672:3: rule__Machine__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__9__Impl"


    // $ANTLR start "rule__Machine__Group__10"
    // InternalXMachine.g:1680:1: rule__Machine__Group__10 : rule__Machine__Group__10__Impl rule__Machine__Group__11 ;
    public final void rule__Machine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1684:1: ( rule__Machine__Group__10__Impl rule__Machine__Group__11 )
            // InternalXMachine.g:1685:2: rule__Machine__Group__10__Impl rule__Machine__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Machine__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__10"


    // $ANTLR start "rule__Machine__Group__10__Impl"
    // InternalXMachine.g:1692:1: rule__Machine__Group__10__Impl : ( ( rule__Machine__Group_10__0 )? ) ;
    public final void rule__Machine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1696:1: ( ( ( rule__Machine__Group_10__0 )? ) )
            // InternalXMachine.g:1697:1: ( ( rule__Machine__Group_10__0 )? )
            {
            // InternalXMachine.g:1697:1: ( ( rule__Machine__Group_10__0 )? )
            // InternalXMachine.g:1698:2: ( rule__Machine__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_10()); 
            }
            // InternalXMachine.g:1699:2: ( rule__Machine__Group_10__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==129) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXMachine.g:1699:3: rule__Machine__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__10__Impl"


    // $ANTLR start "rule__Machine__Group__11"
    // InternalXMachine.g:1707:1: rule__Machine__Group__11 : rule__Machine__Group__11__Impl ;
    public final void rule__Machine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1711:1: ( rule__Machine__Group__11__Impl )
            // InternalXMachine.g:1712:2: rule__Machine__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__11"


    // $ANTLR start "rule__Machine__Group__11__Impl"
    // InternalXMachine.g:1718:1: rule__Machine__Group__11__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1722:1: ( ( 'end' ) )
            // InternalXMachine.g:1723:1: ( 'end' )
            {
            // InternalXMachine.g:1723:1: ( 'end' )
            // InternalXMachine.g:1724:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEndKeyword_11()); 
            }
            match(input,121,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEndKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__11__Impl"


    // $ANTLR start "rule__Machine__Group_4_1__0"
    // InternalXMachine.g:1734:1: rule__Machine__Group_4_1__0 : rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1 ;
    public final void rule__Machine__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1738:1: ( rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1 )
            // InternalXMachine.g:1739:2: rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1
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
    // InternalXMachine.g:1746:1: rule__Machine__Group_4_1__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1750:1: ( ( 'refines' ) )
            // InternalXMachine.g:1751:1: ( 'refines' )
            {
            // InternalXMachine.g:1751:1: ( 'refines' )
            // InternalXMachine.g:1752:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesKeyword_4_1_0()); 
            }
            match(input,122,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1761:1: rule__Machine__Group_4_1__1 : rule__Machine__Group_4_1__1__Impl ;
    public final void rule__Machine__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1765:1: ( rule__Machine__Group_4_1__1__Impl )
            // InternalXMachine.g:1766:2: rule__Machine__Group_4_1__1__Impl
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
    // InternalXMachine.g:1772:1: rule__Machine__Group_4_1__1__Impl : ( ( rule__Machine__RefinesAssignment_4_1_1 ) ) ;
    public final void rule__Machine__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1776:1: ( ( ( rule__Machine__RefinesAssignment_4_1_1 ) ) )
            // InternalXMachine.g:1777:1: ( ( rule__Machine__RefinesAssignment_4_1_1 ) )
            {
            // InternalXMachine.g:1777:1: ( ( rule__Machine__RefinesAssignment_4_1_1 ) )
            // InternalXMachine.g:1778:2: ( rule__Machine__RefinesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesAssignment_4_1_1()); 
            }
            // InternalXMachine.g:1779:2: ( rule__Machine__RefinesAssignment_4_1_1 )
            // InternalXMachine.g:1779:3: rule__Machine__RefinesAssignment_4_1_1
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
    // InternalXMachine.g:1788:1: rule__Machine__Group_4_2__0 : rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 ;
    public final void rule__Machine__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1792:1: ( rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 )
            // InternalXMachine.g:1793:2: rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1
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
    // InternalXMachine.g:1800:1: rule__Machine__Group_4_2__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1804:1: ( ( 'sees' ) )
            // InternalXMachine.g:1805:1: ( 'sees' )
            {
            // InternalXMachine.g:1805:1: ( 'sees' )
            // InternalXMachine.g:1806:2: 'sees'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesKeyword_4_2_0()); 
            }
            match(input,123,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1815:1: rule__Machine__Group_4_2__1 : rule__Machine__Group_4_2__1__Impl ;
    public final void rule__Machine__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1819:1: ( rule__Machine__Group_4_2__1__Impl )
            // InternalXMachine.g:1820:2: rule__Machine__Group_4_2__1__Impl
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
    // InternalXMachine.g:1826:1: rule__Machine__Group_4_2__1__Impl : ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) ) ;
    public final void rule__Machine__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1830:1: ( ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) ) )
            // InternalXMachine.g:1831:1: ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) )
            {
            // InternalXMachine.g:1831:1: ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) )
            // InternalXMachine.g:1832:2: ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* )
            {
            // InternalXMachine.g:1832:2: ( ( rule__Machine__SeesAssignment_4_2_1 ) )
            // InternalXMachine.g:1833:3: ( rule__Machine__SeesAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }
            // InternalXMachine.g:1834:3: ( rule__Machine__SeesAssignment_4_2_1 )
            // InternalXMachine.g:1834:4: rule__Machine__SeesAssignment_4_2_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__SeesAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }

            }

            // InternalXMachine.g:1837:2: ( ( rule__Machine__SeesAssignment_4_2_1 )* )
            // InternalXMachine.g:1838:3: ( rule__Machine__SeesAssignment_4_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }
            // InternalXMachine.g:1839:3: ( rule__Machine__SeesAssignment_4_2_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXMachine.g:1839:4: rule__Machine__SeesAssignment_4_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__SeesAssignment_4_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalXMachine.g:1849:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1853:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:1854:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
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
    // InternalXMachine.g:1861:1: rule__Machine__Group_5__0__Impl : ( 'contains' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1865:1: ( ( 'contains' ) )
            // InternalXMachine.g:1866:1: ( 'contains' )
            {
            // InternalXMachine.g:1866:1: ( 'contains' )
            // InternalXMachine.g:1867:2: 'contains'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getContainsKeyword_5_0()); 
            }
            match(input,124,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1876:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1880:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:1881:2: rule__Machine__Group_5__1__Impl
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
    // InternalXMachine.g:1887:1: rule__Machine__Group_5__1__Impl : ( ( ( rule__Machine__ExtensionsAssignment_5_1 ) ) ( ( rule__Machine__ExtensionsAssignment_5_1 )* ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1891:1: ( ( ( ( rule__Machine__ExtensionsAssignment_5_1 ) ) ( ( rule__Machine__ExtensionsAssignment_5_1 )* ) ) )
            // InternalXMachine.g:1892:1: ( ( ( rule__Machine__ExtensionsAssignment_5_1 ) ) ( ( rule__Machine__ExtensionsAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:1892:1: ( ( ( rule__Machine__ExtensionsAssignment_5_1 ) ) ( ( rule__Machine__ExtensionsAssignment_5_1 )* ) )
            // InternalXMachine.g:1893:2: ( ( rule__Machine__ExtensionsAssignment_5_1 ) ) ( ( rule__Machine__ExtensionsAssignment_5_1 )* )
            {
            // InternalXMachine.g:1893:2: ( ( rule__Machine__ExtensionsAssignment_5_1 ) )
            // InternalXMachine.g:1894:3: ( rule__Machine__ExtensionsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsAssignment_5_1()); 
            }
            // InternalXMachine.g:1895:3: ( rule__Machine__ExtensionsAssignment_5_1 )
            // InternalXMachine.g:1895:4: rule__Machine__ExtensionsAssignment_5_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__ExtensionsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getExtensionsAssignment_5_1()); 
            }

            }

            // InternalXMachine.g:1898:2: ( ( rule__Machine__ExtensionsAssignment_5_1 )* )
            // InternalXMachine.g:1899:3: ( rule__Machine__ExtensionsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsAssignment_5_1()); 
            }
            // InternalXMachine.g:1900:3: ( rule__Machine__ExtensionsAssignment_5_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXMachine.g:1900:4: rule__Machine__ExtensionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__ExtensionsAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getExtensionsAssignment_5_1()); 
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


    // $ANTLR start "rule__Machine__Group_6__0"
    // InternalXMachine.g:1910:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1914:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalXMachine.g:1915:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0"


    // $ANTLR start "rule__Machine__Group_6__0__Impl"
    // InternalXMachine.g:1922:1: rule__Machine__Group_6__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1926:1: ( ( 'variables' ) )
            // InternalXMachine.g:1927:1: ( 'variables' )
            {
            // InternalXMachine.g:1927:1: ( 'variables' )
            // InternalXMachine.g:1928:2: 'variables'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesKeyword_6_0()); 
            }
            match(input,125,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariablesKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0__Impl"


    // $ANTLR start "rule__Machine__Group_6__1"
    // InternalXMachine.g:1937:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1941:1: ( rule__Machine__Group_6__1__Impl )
            // InternalXMachine.g:1942:2: rule__Machine__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__1"


    // $ANTLR start "rule__Machine__Group_6__1__Impl"
    // InternalXMachine.g:1948:1: rule__Machine__Group_6__1__Impl : ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1952:1: ( ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) ) )
            // InternalXMachine.g:1953:1: ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:1953:1: ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) )
            // InternalXMachine.g:1954:2: ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* )
            {
            // InternalXMachine.g:1954:2: ( ( rule__Machine__VariablesAssignment_6_1 ) )
            // InternalXMachine.g:1955:3: ( rule__Machine__VariablesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
            }
            // InternalXMachine.g:1956:3: ( rule__Machine__VariablesAssignment_6_1 )
            // InternalXMachine.g:1956:4: rule__Machine__VariablesAssignment_6_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__VariablesAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
            }

            }

            // InternalXMachine.g:1959:2: ( ( rule__Machine__VariablesAssignment_6_1 )* )
            // InternalXMachine.g:1960:3: ( rule__Machine__VariablesAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
            }
            // InternalXMachine.g:1961:3: ( rule__Machine__VariablesAssignment_6_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXMachine.g:1961:4: rule__Machine__VariablesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__VariablesAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
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
    // $ANTLR end "rule__Machine__Group_6__1__Impl"


    // $ANTLR start "rule__Machine__Group_7__0"
    // InternalXMachine.g:1971:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1975:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:1976:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalXMachine.g:1983:1: rule__Machine__Group_7__0__Impl : ( 'records' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1987:1: ( ( 'records' ) )
            // InternalXMachine.g:1988:1: ( 'records' )
            {
            // InternalXMachine.g:1988:1: ( 'records' )
            // InternalXMachine.g:1989:2: 'records'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRecordsKeyword_7_0()); 
            }
            match(input,126,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1998:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2002:1: ( rule__Machine__Group_7__1__Impl )
            // InternalXMachine.g:2003:2: rule__Machine__Group_7__1__Impl
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
    // InternalXMachine.g:2009:1: rule__Machine__Group_7__1__Impl : ( ( ( rule__Machine__ExtensionsAssignment_7_1 ) ) ( ( rule__Machine__ExtensionsAssignment_7_1 )* ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2013:1: ( ( ( ( rule__Machine__ExtensionsAssignment_7_1 ) ) ( ( rule__Machine__ExtensionsAssignment_7_1 )* ) ) )
            // InternalXMachine.g:2014:1: ( ( ( rule__Machine__ExtensionsAssignment_7_1 ) ) ( ( rule__Machine__ExtensionsAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:2014:1: ( ( ( rule__Machine__ExtensionsAssignment_7_1 ) ) ( ( rule__Machine__ExtensionsAssignment_7_1 )* ) )
            // InternalXMachine.g:2015:2: ( ( rule__Machine__ExtensionsAssignment_7_1 ) ) ( ( rule__Machine__ExtensionsAssignment_7_1 )* )
            {
            // InternalXMachine.g:2015:2: ( ( rule__Machine__ExtensionsAssignment_7_1 ) )
            // InternalXMachine.g:2016:3: ( rule__Machine__ExtensionsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsAssignment_7_1()); 
            }
            // InternalXMachine.g:2017:3: ( rule__Machine__ExtensionsAssignment_7_1 )
            // InternalXMachine.g:2017:4: rule__Machine__ExtensionsAssignment_7_1
            {
            pushFollow(FOLLOW_10);
            rule__Machine__ExtensionsAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getExtensionsAssignment_7_1()); 
            }

            }

            // InternalXMachine.g:2020:2: ( ( rule__Machine__ExtensionsAssignment_7_1 )* )
            // InternalXMachine.g:2021:3: ( rule__Machine__ExtensionsAssignment_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsAssignment_7_1()); 
            }
            // InternalXMachine.g:2022:3: ( rule__Machine__ExtensionsAssignment_7_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==139) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXMachine.g:2022:4: rule__Machine__ExtensionsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Machine__ExtensionsAssignment_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getExtensionsAssignment_7_1()); 
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


    // $ANTLR start "rule__Machine__Group_8__0"
    // InternalXMachine.g:2032:1: rule__Machine__Group_8__0 : rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 ;
    public final void rule__Machine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2036:1: ( rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 )
            // InternalXMachine.g:2037:2: rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__Machine__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__0"


    // $ANTLR start "rule__Machine__Group_8__0__Impl"
    // InternalXMachine.g:2044:1: rule__Machine__Group_8__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2048:1: ( ( 'invariants' ) )
            // InternalXMachine.g:2049:1: ( 'invariants' )
            {
            // InternalXMachine.g:2049:1: ( 'invariants' )
            // InternalXMachine.g:2050:2: 'invariants'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsKeyword_8_0()); 
            }
            match(input,127,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__0__Impl"


    // $ANTLR start "rule__Machine__Group_8__1"
    // InternalXMachine.g:2059:1: rule__Machine__Group_8__1 : rule__Machine__Group_8__1__Impl ;
    public final void rule__Machine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2063:1: ( rule__Machine__Group_8__1__Impl )
            // InternalXMachine.g:2064:2: rule__Machine__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__1"


    // $ANTLR start "rule__Machine__Group_8__1__Impl"
    // InternalXMachine.g:2070:1: rule__Machine__Group_8__1__Impl : ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) ) ;
    public final void rule__Machine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2074:1: ( ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) ) )
            // InternalXMachine.g:2075:1: ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:2075:1: ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) )
            // InternalXMachine.g:2076:2: ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* )
            {
            // InternalXMachine.g:2076:2: ( ( rule__Machine__InvariantsAssignment_8_1 ) )
            // InternalXMachine.g:2077:3: ( rule__Machine__InvariantsAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 
            }
            // InternalXMachine.g:2078:3: ( rule__Machine__InvariantsAssignment_8_1 )
            // InternalXMachine.g:2078:4: rule__Machine__InvariantsAssignment_8_1
            {
            pushFollow(FOLLOW_12);
            rule__Machine__InvariantsAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 
            }

            }

            // InternalXMachine.g:2081:2: ( ( rule__Machine__InvariantsAssignment_8_1 )* )
            // InternalXMachine.g:2082:3: ( rule__Machine__InvariantsAssignment_8_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 
            }
            // InternalXMachine.g:2083:3: ( rule__Machine__InvariantsAssignment_8_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_XLABEL||LA24_0==141) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXMachine.g:2083:4: rule__Machine__InvariantsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Machine__InvariantsAssignment_8_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 
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
    // $ANTLR end "rule__Machine__Group_8__1__Impl"


    // $ANTLR start "rule__Machine__Group_9__0"
    // InternalXMachine.g:2093:1: rule__Machine__Group_9__0 : rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 ;
    public final void rule__Machine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2097:1: ( rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 )
            // InternalXMachine.g:2098:2: rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__Machine__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__0"


    // $ANTLR start "rule__Machine__Group_9__0__Impl"
    // InternalXMachine.g:2105:1: rule__Machine__Group_9__0__Impl : ( 'variants' ) ;
    public final void rule__Machine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2109:1: ( ( 'variants' ) )
            // InternalXMachine.g:2110:1: ( 'variants' )
            {
            // InternalXMachine.g:2110:1: ( 'variants' )
            // InternalXMachine.g:2111:2: 'variants'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsKeyword_9_0()); 
            }
            match(input,128,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__0__Impl"


    // $ANTLR start "rule__Machine__Group_9__1"
    // InternalXMachine.g:2120:1: rule__Machine__Group_9__1 : rule__Machine__Group_9__1__Impl ;
    public final void rule__Machine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2124:1: ( rule__Machine__Group_9__1__Impl )
            // InternalXMachine.g:2125:2: rule__Machine__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__1"


    // $ANTLR start "rule__Machine__Group_9__1__Impl"
    // InternalXMachine.g:2131:1: rule__Machine__Group_9__1__Impl : ( ( ( rule__Machine__VariantsAssignment_9_1 ) ) ( ( rule__Machine__VariantsAssignment_9_1 )* ) ) ;
    public final void rule__Machine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2135:1: ( ( ( ( rule__Machine__VariantsAssignment_9_1 ) ) ( ( rule__Machine__VariantsAssignment_9_1 )* ) ) )
            // InternalXMachine.g:2136:1: ( ( ( rule__Machine__VariantsAssignment_9_1 ) ) ( ( rule__Machine__VariantsAssignment_9_1 )* ) )
            {
            // InternalXMachine.g:2136:1: ( ( ( rule__Machine__VariantsAssignment_9_1 ) ) ( ( rule__Machine__VariantsAssignment_9_1 )* ) )
            // InternalXMachine.g:2137:2: ( ( rule__Machine__VariantsAssignment_9_1 ) ) ( ( rule__Machine__VariantsAssignment_9_1 )* )
            {
            // InternalXMachine.g:2137:2: ( ( rule__Machine__VariantsAssignment_9_1 ) )
            // InternalXMachine.g:2138:3: ( rule__Machine__VariantsAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsAssignment_9_1()); 
            }
            // InternalXMachine.g:2139:3: ( rule__Machine__VariantsAssignment_9_1 )
            // InternalXMachine.g:2139:4: rule__Machine__VariantsAssignment_9_1
            {
            pushFollow(FOLLOW_14);
            rule__Machine__VariantsAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsAssignment_9_1()); 
            }

            }

            // InternalXMachine.g:2142:2: ( ( rule__Machine__VariantsAssignment_9_1 )* )
            // InternalXMachine.g:2143:3: ( rule__Machine__VariantsAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsAssignment_9_1()); 
            }
            // InternalXMachine.g:2144:3: ( rule__Machine__VariantsAssignment_9_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_XLABEL) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXMachine.g:2144:4: rule__Machine__VariantsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Machine__VariantsAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsAssignment_9_1()); 
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
    // $ANTLR end "rule__Machine__Group_9__1__Impl"


    // $ANTLR start "rule__Machine__Group_10__0"
    // InternalXMachine.g:2154:1: rule__Machine__Group_10__0 : rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1 ;
    public final void rule__Machine__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2158:1: ( rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1 )
            // InternalXMachine.g:2159:2: rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1
            {
            pushFollow(FOLLOW_15);
            rule__Machine__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__0"


    // $ANTLR start "rule__Machine__Group_10__0__Impl"
    // InternalXMachine.g:2166:1: rule__Machine__Group_10__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2170:1: ( ( 'events' ) )
            // InternalXMachine.g:2171:1: ( 'events' )
            {
            // InternalXMachine.g:2171:1: ( 'events' )
            // InternalXMachine.g:2172:2: 'events'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsKeyword_10_0()); 
            }
            match(input,129,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__0__Impl"


    // $ANTLR start "rule__Machine__Group_10__1"
    // InternalXMachine.g:2181:1: rule__Machine__Group_10__1 : rule__Machine__Group_10__1__Impl ;
    public final void rule__Machine__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2185:1: ( rule__Machine__Group_10__1__Impl )
            // InternalXMachine.g:2186:2: rule__Machine__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__1"


    // $ANTLR start "rule__Machine__Group_10__1__Impl"
    // InternalXMachine.g:2192:1: rule__Machine__Group_10__1__Impl : ( ( ( rule__Machine__EventsAssignment_10_1 ) ) ( ( rule__Machine__EventsAssignment_10_1 )* ) ) ;
    public final void rule__Machine__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2196:1: ( ( ( ( rule__Machine__EventsAssignment_10_1 ) ) ( ( rule__Machine__EventsAssignment_10_1 )* ) ) )
            // InternalXMachine.g:2197:1: ( ( ( rule__Machine__EventsAssignment_10_1 ) ) ( ( rule__Machine__EventsAssignment_10_1 )* ) )
            {
            // InternalXMachine.g:2197:1: ( ( ( rule__Machine__EventsAssignment_10_1 ) ) ( ( rule__Machine__EventsAssignment_10_1 )* ) )
            // InternalXMachine.g:2198:2: ( ( rule__Machine__EventsAssignment_10_1 ) ) ( ( rule__Machine__EventsAssignment_10_1 )* )
            {
            // InternalXMachine.g:2198:2: ( ( rule__Machine__EventsAssignment_10_1 ) )
            // InternalXMachine.g:2199:3: ( rule__Machine__EventsAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsAssignment_10_1()); 
            }
            // InternalXMachine.g:2200:3: ( rule__Machine__EventsAssignment_10_1 )
            // InternalXMachine.g:2200:4: rule__Machine__EventsAssignment_10_1
            {
            pushFollow(FOLLOW_16);
            rule__Machine__EventsAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsAssignment_10_1()); 
            }

            }

            // InternalXMachine.g:2203:2: ( ( rule__Machine__EventsAssignment_10_1 )* )
            // InternalXMachine.g:2204:3: ( rule__Machine__EventsAssignment_10_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsAssignment_10_1()); 
            }
            // InternalXMachine.g:2205:3: ( rule__Machine__EventsAssignment_10_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=114 && LA26_0<=116)||LA26_0==133) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXMachine.g:2205:4: rule__Machine__EventsAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Machine__EventsAssignment_10_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsAssignment_10_1()); 
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
    // $ANTLR end "rule__Machine__Group_10__1__Impl"


    // $ANTLR start "rule__MContains__Group__0"
    // InternalXMachine.g:2215:1: rule__MContains__Group__0 : rule__MContains__Group__0__Impl rule__MContains__Group__1 ;
    public final void rule__MContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2219:1: ( rule__MContains__Group__0__Impl rule__MContains__Group__1 )
            // InternalXMachine.g:2220:2: rule__MContains__Group__0__Impl rule__MContains__Group__1
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
    // InternalXMachine.g:2227:1: rule__MContains__Group__0__Impl : ( () ) ;
    public final void rule__MContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2231:1: ( ( () ) )
            // InternalXMachine.g:2232:1: ( () )
            {
            // InternalXMachine.g:2232:1: ( () )
            // InternalXMachine.g:2233:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getContainmentAction_0()); 
            }
            // InternalXMachine.g:2234:2: ()
            // InternalXMachine.g:2234:3: 
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
    // InternalXMachine.g:2242:1: rule__MContains__Group__1 : rule__MContains__Group__1__Impl rule__MContains__Group__2 ;
    public final void rule__MContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2246:1: ( rule__MContains__Group__1__Impl rule__MContains__Group__2 )
            // InternalXMachine.g:2247:2: rule__MContains__Group__1__Impl rule__MContains__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__MContains__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MContains__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:2254:1: rule__MContains__Group__1__Impl : ( ( rule__MContains__NameAssignment_1 ) ) ;
    public final void rule__MContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2258:1: ( ( ( rule__MContains__NameAssignment_1 ) ) )
            // InternalXMachine.g:2259:1: ( ( rule__MContains__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2259:1: ( ( rule__MContains__NameAssignment_1 ) )
            // InternalXMachine.g:2260:2: ( rule__MContains__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:2261:2: ( rule__MContains__NameAssignment_1 )
            // InternalXMachine.g:2261:3: rule__MContains__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MContains__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MContains__Group__2"
    // InternalXMachine.g:2269:1: rule__MContains__Group__2 : rule__MContains__Group__2__Impl rule__MContains__Group__3 ;
    public final void rule__MContains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2273:1: ( rule__MContains__Group__2__Impl rule__MContains__Group__3 )
            // InternalXMachine.g:2274:2: rule__MContains__Group__2__Impl rule__MContains__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MContains__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MContains__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__Group__2"


    // $ANTLR start "rule__MContains__Group__2__Impl"
    // InternalXMachine.g:2281:1: rule__MContains__Group__2__Impl : ( ':' ) ;
    public final void rule__MContains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2285:1: ( ( ':' ) )
            // InternalXMachine.g:2286:1: ( ':' )
            {
            // InternalXMachine.g:2286:1: ( ':' )
            // InternalXMachine.g:2287:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getColonKeyword_2()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__Group__2__Impl"


    // $ANTLR start "rule__MContains__Group__3"
    // InternalXMachine.g:2296:1: rule__MContains__Group__3 : rule__MContains__Group__3__Impl ;
    public final void rule__MContains__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2300:1: ( rule__MContains__Group__3__Impl )
            // InternalXMachine.g:2301:2: rule__MContains__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MContains__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__Group__3"


    // $ANTLR start "rule__MContains__Group__3__Impl"
    // InternalXMachine.g:2307:1: rule__MContains__Group__3__Impl : ( ( rule__MContains__ExtensionAssignment_3 ) ) ;
    public final void rule__MContains__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2311:1: ( ( ( rule__MContains__ExtensionAssignment_3 ) ) )
            // InternalXMachine.g:2312:1: ( ( rule__MContains__ExtensionAssignment_3 ) )
            {
            // InternalXMachine.g:2312:1: ( ( rule__MContains__ExtensionAssignment_3 ) )
            // InternalXMachine.g:2313:2: ( rule__MContains__ExtensionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionAssignment_3()); 
            }
            // InternalXMachine.g:2314:2: ( rule__MContains__ExtensionAssignment_3 )
            // InternalXMachine.g:2314:3: rule__MContains__ExtensionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MContains__ExtensionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getExtensionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__Group__3__Impl"


    // $ANTLR start "rule__MIncludes__Group__0"
    // InternalXMachine.g:2323:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2327:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:2328:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalXMachine.g:2335:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2339:1: ( ( () ) )
            // InternalXMachine.g:2340:1: ( () )
            {
            // InternalXMachine.g:2340:1: ( () )
            // InternalXMachine.g:2341:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            }
            // InternalXMachine.g:2342:2: ()
            // InternalXMachine.g:2342:3: 
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
    // InternalXMachine.g:2350:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2354:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:2355:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2362:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2366:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:2367:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:2367:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:2368:2: ( rule__MIncludes__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2369:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:2369:3: rule__MIncludes__Group_1__0
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
    // InternalXMachine.g:2377:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2381:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:2382:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2389:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2393:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:2394:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:2394:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:2395:2: ( rule__MIncludes__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            }
            // InternalXMachine.g:2396:2: ( rule__MIncludes__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==131) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:2396:3: rule__MIncludes__Group_2__0
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
    // InternalXMachine.g:2404:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2408:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:2409:2: rule__MIncludes__Group__3__Impl
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
    // InternalXMachine.g:2415:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2419:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:2420:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:2420:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:2421:2: ( rule__MIncludes__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            }
            // InternalXMachine.g:2422:2: ( rule__MIncludes__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==132) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:2422:3: rule__MIncludes__Group_3__0
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
    // InternalXMachine.g:2431:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2435:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:2436:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
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
    // InternalXMachine.g:2443:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2447:1: ( ( 'includes' ) )
            // InternalXMachine.g:2448:1: ( 'includes' )
            {
            // InternalXMachine.g:2448:1: ( 'includes' )
            // InternalXMachine.g:2449:2: 'includes'
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
    // InternalXMachine.g:2458:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2462:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:2463:2: rule__MIncludes__Group_1__1__Impl
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
    // InternalXMachine.g:2469:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2473:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:2474:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:2474:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:2475:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            }
            // InternalXMachine.g:2476:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:2476:3: rule__MIncludes__AbstractMachineAssignment_1_1
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
    // InternalXMachine.g:2485:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2489:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:2490:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
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
    // InternalXMachine.g:2497:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2501:1: ( ( 'to' ) )
            // InternalXMachine.g:2502:1: ( 'to' )
            {
            // InternalXMachine.g:2502:1: ( 'to' )
            // InternalXMachine.g:2503:2: 'to'
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
    // InternalXMachine.g:2512:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2516:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:2517:2: rule__MIncludes__Group_2__1__Impl
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
    // InternalXMachine.g:2523:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2527:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:2528:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:2528:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:2529:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            }
            // InternalXMachine.g:2530:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:2530:3: rule__MIncludes__ConcreteMachineAssignment_2_1
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
    // InternalXMachine.g:2539:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2543:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:2544:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
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
    // InternalXMachine.g:2551:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2555:1: ( ( 'as' ) )
            // InternalXMachine.g:2556:1: ( 'as' )
            {
            // InternalXMachine.g:2556:1: ( 'as' )
            // InternalXMachine.g:2557:2: 'as'
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
    // InternalXMachine.g:2566:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2570:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:2571:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
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
    // InternalXMachine.g:2578:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2582:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:2583:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:2583:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:2584:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            }
            // InternalXMachine.g:2585:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:2585:3: rule__MIncludes__PrefixesAssignment_3_1
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
    // InternalXMachine.g:2593:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2597:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:2598:2: rule__MIncludes__Group_3__2__Impl
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
    // InternalXMachine.g:2604:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2608:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:2609:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:2609:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:2610:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            }
            // InternalXMachine.g:2611:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXMachine.g:2611:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalXMachine.g:2620:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2624:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:2625:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2632:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2636:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2637:1: ( RULE_ID )
            {
            // InternalXMachine.g:2637:1: ( RULE_ID )
            // InternalXMachine.g:2638:2: RULE_ID
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
    // InternalXMachine.g:2647:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2651:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:2652:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXMachine.g:2658:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2662:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:2663:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:2663:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:2664:2: ( rule__QualifiedName__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2665:2: ( rule__QualifiedName__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:2665:3: rule__QualifiedName__Group_1__0
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
    // InternalXMachine.g:2674:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2678:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:2679:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXMachine.g:2686:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2690:1: ( ( '.' ) )
            // InternalXMachine.g:2691:1: ( '.' )
            {
            // InternalXMachine.g:2691:1: ( '.' )
            // InternalXMachine.g:2692:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2701:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2705:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:2706:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXMachine.g:2712:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2716:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2717:1: ( RULE_ID )
            {
            // InternalXMachine.g:2717:1: ( RULE_ID )
            // InternalXMachine.g:2718:2: RULE_ID
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


    // $ANTLR start "rule__XVariable__Group__0"
    // InternalXMachine.g:2728:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2732:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:2733:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__0"


    // $ANTLR start "rule__XVariable__Group__0__Impl"
    // InternalXMachine.g:2740:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2744:1: ( ( () ) )
            // InternalXMachine.g:2745:1: ( () )
            {
            // InternalXMachine.g:2745:1: ( () )
            // InternalXMachine.g:2746:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            }
            // InternalXMachine.g:2747:2: ()
            // InternalXMachine.g:2747:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__0__Impl"


    // $ANTLR start "rule__XVariable__Group__1"
    // InternalXMachine.g:2755:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2759:1: ( rule__XVariable__Group__1__Impl )
            // InternalXMachine.g:2760:2: rule__XVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__1"


    // $ANTLR start "rule__XVariable__Group__1__Impl"
    // InternalXMachine.g:2766:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__NameAssignment_1 ) ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2770:1: ( ( ( rule__XVariable__NameAssignment_1 ) ) )
            // InternalXMachine.g:2771:1: ( ( rule__XVariable__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2771:1: ( ( rule__XVariable__NameAssignment_1 ) )
            // InternalXMachine.g:2772:2: ( rule__XVariable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:2773:2: ( rule__XVariable__NameAssignment_1 )
            // InternalXMachine.g:2773:3: rule__XVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__Group__1__Impl"


    // $ANTLR start "rule__XInvariant__Group__0"
    // InternalXMachine.g:2782:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2786:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:2787:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__XInvariant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__0"


    // $ANTLR start "rule__XInvariant__Group__0__Impl"
    // InternalXMachine.g:2794:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2798:1: ( ( () ) )
            // InternalXMachine.g:2799:1: ( () )
            {
            // InternalXMachine.g:2799:1: ( () )
            // InternalXMachine.g:2800:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:2801:2: ()
            // InternalXMachine.g:2801:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__0__Impl"


    // $ANTLR start "rule__XInvariant__Group__1"
    // InternalXMachine.g:2809:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2813:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:2814:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XInvariant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__1"


    // $ANTLR start "rule__XInvariant__Group__1__Impl"
    // InternalXMachine.g:2821:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__TheoremAssignment_1 )? ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2825:1: ( ( ( rule__XInvariant__TheoremAssignment_1 )? ) )
            // InternalXMachine.g:2826:1: ( ( rule__XInvariant__TheoremAssignment_1 )? )
            {
            // InternalXMachine.g:2826:1: ( ( rule__XInvariant__TheoremAssignment_1 )? )
            // InternalXMachine.g:2827:2: ( rule__XInvariant__TheoremAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremAssignment_1()); 
            }
            // InternalXMachine.g:2828:2: ( rule__XInvariant__TheoremAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==141) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXMachine.g:2828:3: rule__XInvariant__TheoremAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariant__TheoremAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getTheoremAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__1__Impl"


    // $ANTLR start "rule__XInvariant__Group__2"
    // InternalXMachine.g:2836:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2840:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:2841:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__XInvariant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__2"


    // $ANTLR start "rule__XInvariant__Group__2__Impl"
    // InternalXMachine.g:2848:1: rule__XInvariant__Group__2__Impl : ( ( rule__XInvariant__NameAssignment_2 ) ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2852:1: ( ( ( rule__XInvariant__NameAssignment_2 ) ) )
            // InternalXMachine.g:2853:1: ( ( rule__XInvariant__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2853:1: ( ( rule__XInvariant__NameAssignment_2 ) )
            // InternalXMachine.g:2854:2: ( rule__XInvariant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:2855:2: ( rule__XInvariant__NameAssignment_2 )
            // InternalXMachine.g:2855:3: rule__XInvariant__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__2__Impl"


    // $ANTLR start "rule__XInvariant__Group__3"
    // InternalXMachine.g:2863:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2867:1: ( rule__XInvariant__Group__3__Impl )
            // InternalXMachine.g:2868:2: rule__XInvariant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__3"


    // $ANTLR start "rule__XInvariant__Group__3__Impl"
    // InternalXMachine.g:2874:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__PredicateAssignment_3 ) ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2878:1: ( ( ( rule__XInvariant__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:2879:1: ( ( rule__XInvariant__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:2879:1: ( ( rule__XInvariant__PredicateAssignment_3 ) )
            // InternalXMachine.g:2880:2: ( rule__XInvariant__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:2881:2: ( rule__XInvariant__PredicateAssignment_3 )
            // InternalXMachine.g:2881:3: rule__XInvariant__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__PredicateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getPredicateAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__Group__3__Impl"


    // $ANTLR start "rule__XVariant__Group__0"
    // InternalXMachine.g:2890:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2894:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:2895:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXMachine.g:2902:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2906:1: ( ( () ) )
            // InternalXMachine.g:2907:1: ( () )
            {
            // InternalXMachine.g:2907:1: ( () )
            // InternalXMachine.g:2908:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            }
            // InternalXMachine.g:2909:2: ()
            // InternalXMachine.g:2909:3: 
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
    // InternalXMachine.g:2917:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl rule__XVariant__Group__2 ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2921:1: ( rule__XVariant__Group__1__Impl rule__XVariant__Group__2 )
            // InternalXMachine.g:2922:2: rule__XVariant__Group__1__Impl rule__XVariant__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:2929:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__NameAssignment_1 ) ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2933:1: ( ( ( rule__XVariant__NameAssignment_1 ) ) )
            // InternalXMachine.g:2934:1: ( ( rule__XVariant__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2934:1: ( ( rule__XVariant__NameAssignment_1 ) )
            // InternalXMachine.g:2935:2: ( rule__XVariant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:2936:2: ( rule__XVariant__NameAssignment_1 )
            // InternalXMachine.g:2936:3: rule__XVariant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:2944:1: rule__XVariant__Group__2 : rule__XVariant__Group__2__Impl ;
    public final void rule__XVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2948:1: ( rule__XVariant__Group__2__Impl )
            // InternalXMachine.g:2949:2: rule__XVariant__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:2955:1: rule__XVariant__Group__2__Impl : ( ( rule__XVariant__ExpressionAssignment_2 ) ) ;
    public final void rule__XVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2959:1: ( ( ( rule__XVariant__ExpressionAssignment_2 ) ) )
            // InternalXMachine.g:2960:1: ( ( rule__XVariant__ExpressionAssignment_2 ) )
            {
            // InternalXMachine.g:2960:1: ( ( rule__XVariant__ExpressionAssignment_2 ) )
            // InternalXMachine.g:2961:2: ( rule__XVariant__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionAssignment_2()); 
            }
            // InternalXMachine.g:2962:2: ( rule__XVariant__ExpressionAssignment_2 )
            // InternalXMachine.g:2962:3: rule__XVariant__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__Group__0"
    // InternalXMachine.g:2971:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2975:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:2976:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalXMachine.g:2983:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2987:1: ( ( () ) )
            // InternalXMachine.g:2988:1: ( () )
            {
            // InternalXMachine.g:2988:1: ( () )
            // InternalXMachine.g:2989:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventAction_0()); 
            }
            // InternalXMachine.g:2990:2: ()
            // InternalXMachine.g:2990:3: 
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
    // InternalXMachine.g:2998:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3002:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:3003:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXMachine.g:3010:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__ConvergenceAssignment_1 )? ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3014:1: ( ( ( rule__XEvent__ConvergenceAssignment_1 )? ) )
            // InternalXMachine.g:3015:1: ( ( rule__XEvent__ConvergenceAssignment_1 )? )
            {
            // InternalXMachine.g:3015:1: ( ( rule__XEvent__ConvergenceAssignment_1 )? )
            // InternalXMachine.g:3016:2: ( rule__XEvent__ConvergenceAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getConvergenceAssignment_1()); 
            }
            // InternalXMachine.g:3017:2: ( rule__XEvent__ConvergenceAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=114 && LA32_0<=116)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXMachine.g:3017:3: rule__XEvent__ConvergenceAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ConvergenceAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getConvergenceAssignment_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3025:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3029:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:3030:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:3037:1: rule__XEvent__Group__2__Impl : ( 'event' ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3041:1: ( ( 'event' ) )
            // InternalXMachine.g:3042:1: ( 'event' )
            {
            // InternalXMachine.g:3042:1: ( 'event' )
            // InternalXMachine.g:3043:2: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventKeyword_2()); 
            }
            match(input,133,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getEventKeyword_2()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3052:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3056:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:3057:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3064:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__NameAssignment_3 ) ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3068:1: ( ( ( rule__XEvent__NameAssignment_3 ) ) )
            // InternalXMachine.g:3069:1: ( ( rule__XEvent__NameAssignment_3 ) )
            {
            // InternalXMachine.g:3069:1: ( ( rule__XEvent__NameAssignment_3 ) )
            // InternalXMachine.g:3070:2: ( rule__XEvent__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:3071:2: ( rule__XEvent__NameAssignment_3 )
            // InternalXMachine.g:3071:3: rule__XEvent__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getNameAssignment_3()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3079:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3083:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:3084:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3091:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__Alternatives_4 )? ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3095:1: ( ( ( rule__XEvent__Alternatives_4 )? ) )
            // InternalXMachine.g:3096:1: ( ( rule__XEvent__Alternatives_4 )? )
            {
            // InternalXMachine.g:3096:1: ( ( rule__XEvent__Alternatives_4 )? )
            // InternalXMachine.g:3097:2: ( rule__XEvent__Alternatives_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_4()); 
            }
            // InternalXMachine.g:3098:2: ( rule__XEvent__Alternatives_4 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==122||LA33_0==140) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXMachine.g:3098:3: rule__XEvent__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Alternatives_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAlternatives_4()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3106:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3110:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:3111:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3118:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Group_5__0 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3122:1: ( ( ( rule__XEvent__Group_5__0 )? ) )
            // InternalXMachine.g:3123:1: ( ( rule__XEvent__Group_5__0 )? )
            {
            // InternalXMachine.g:3123:1: ( ( rule__XEvent__Group_5__0 )? )
            // InternalXMachine.g:3124:2: ( rule__XEvent__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_5()); 
            }
            // InternalXMachine.g:3125:2: ( rule__XEvent__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==134) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXMachine.g:3125:3: rule__XEvent__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_5()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3133:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl rule__XEvent__Group__7 ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3137:1: ( rule__XEvent__Group__6__Impl rule__XEvent__Group__7 )
            // InternalXMachine.g:3138:2: rule__XEvent__Group__6__Impl rule__XEvent__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3145:1: rule__XEvent__Group__6__Impl : ( ( rule__XEvent__ExtensionsAssignment_6 )* ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3149:1: ( ( ( rule__XEvent__ExtensionsAssignment_6 )* ) )
            // InternalXMachine.g:3150:1: ( ( rule__XEvent__ExtensionsAssignment_6 )* )
            {
            // InternalXMachine.g:3150:1: ( ( rule__XEvent__ExtensionsAssignment_6 )* )
            // InternalXMachine.g:3151:2: ( rule__XEvent__ExtensionsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtensionsAssignment_6()); 
            }
            // InternalXMachine.g:3152:2: ( rule__XEvent__ExtensionsAssignment_6 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==136) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXMachine.g:3152:3: rule__XEvent__ExtensionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__XEvent__ExtensionsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtensionsAssignment_6()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3160:1: rule__XEvent__Group__7 : rule__XEvent__Group__7__Impl rule__XEvent__Group__8 ;
    public final void rule__XEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3164:1: ( rule__XEvent__Group__7__Impl rule__XEvent__Group__8 )
            // InternalXMachine.g:3165:2: rule__XEvent__Group__7__Impl rule__XEvent__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3172:1: rule__XEvent__Group__7__Impl : ( ( rule__XEvent__Group_7__0 )? ) ;
    public final void rule__XEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3176:1: ( ( ( rule__XEvent__Group_7__0 )? ) )
            // InternalXMachine.g:3177:1: ( ( rule__XEvent__Group_7__0 )? )
            {
            // InternalXMachine.g:3177:1: ( ( rule__XEvent__Group_7__0 )? )
            // InternalXMachine.g:3178:2: ( rule__XEvent__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_7()); 
            }
            // InternalXMachine.g:3179:2: ( rule__XEvent__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=12 && LA36_0<=13)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXMachine.g:3179:3: rule__XEvent__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGroup_7()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3187:1: rule__XEvent__Group__8 : rule__XEvent__Group__8__Impl rule__XEvent__Group__9 ;
    public final void rule__XEvent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3191:1: ( rule__XEvent__Group__8__Impl rule__XEvent__Group__9 )
            // InternalXMachine.g:3192:2: rule__XEvent__Group__8__Impl rule__XEvent__Group__9
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3199:1: rule__XEvent__Group__8__Impl : ( ( rule__XEvent__Group_8__0 )? ) ;
    public final void rule__XEvent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3203:1: ( ( ( rule__XEvent__Group_8__0 )? ) )
            // InternalXMachine.g:3204:1: ( ( rule__XEvent__Group_8__0 )? )
            {
            // InternalXMachine.g:3204:1: ( ( rule__XEvent__Group_8__0 )? )
            // InternalXMachine.g:3205:2: ( rule__XEvent__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_8()); 
            }
            // InternalXMachine.g:3206:2: ( rule__XEvent__Group_8__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=14 && LA37_0<=15)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXMachine.g:3206:3: rule__XEvent__Group_8__0
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
    // InternalXMachine.g:3214:1: rule__XEvent__Group__9 : rule__XEvent__Group__9__Impl rule__XEvent__Group__10 ;
    public final void rule__XEvent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3218:1: ( rule__XEvent__Group__9__Impl rule__XEvent__Group__10 )
            // InternalXMachine.g:3219:2: rule__XEvent__Group__9__Impl rule__XEvent__Group__10
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3226:1: rule__XEvent__Group__9__Impl : ( ( rule__XEvent__Group_9__0 )? ) ;
    public final void rule__XEvent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3230:1: ( ( ( rule__XEvent__Group_9__0 )? ) )
            // InternalXMachine.g:3231:1: ( ( rule__XEvent__Group_9__0 )? )
            {
            // InternalXMachine.g:3231:1: ( ( rule__XEvent__Group_9__0 )? )
            // InternalXMachine.g:3232:2: ( rule__XEvent__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_9()); 
            }
            // InternalXMachine.g:3233:2: ( rule__XEvent__Group_9__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==135) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXMachine.g:3233:3: rule__XEvent__Group_9__0
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
    // InternalXMachine.g:3241:1: rule__XEvent__Group__10 : rule__XEvent__Group__10__Impl ;
    public final void rule__XEvent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3245:1: ( rule__XEvent__Group__10__Impl )
            // InternalXMachine.g:3246:2: rule__XEvent__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:3252:1: rule__XEvent__Group__10__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3256:1: ( ( 'end' ) )
            // InternalXMachine.g:3257:1: ( 'end' )
            {
            // InternalXMachine.g:3257:1: ( 'end' )
            // InternalXMachine.g:3258:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEndKeyword_10()); 
            }
            match(input,121,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getEndKeyword_10()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__Group_4_0__0"
    // InternalXMachine.g:3268:1: rule__XEvent__Group_4_0__0 : rule__XEvent__Group_4_0__0__Impl rule__XEvent__Group_4_0__1 ;
    public final void rule__XEvent__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3272:1: ( rule__XEvent__Group_4_0__0__Impl rule__XEvent__Group_4_0__1 )
            // InternalXMachine.g:3273:2: rule__XEvent__Group_4_0__0__Impl rule__XEvent__Group_4_0__1
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_0__0"


    // $ANTLR start "rule__XEvent__Group_4_0__0__Impl"
    // InternalXMachine.g:3280:1: rule__XEvent__Group_4_0__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3284:1: ( ( 'refines' ) )
            // InternalXMachine.g:3285:1: ( 'refines' )
            {
            // InternalXMachine.g:3285:1: ( 'refines' )
            // InternalXMachine.g:3286:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesKeyword_4_0_0()); 
            }
            match(input,122,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_4_0__1"
    // InternalXMachine.g:3295:1: rule__XEvent__Group_4_0__1 : rule__XEvent__Group_4_0__1__Impl ;
    public final void rule__XEvent__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3299:1: ( rule__XEvent__Group_4_0__1__Impl )
            // InternalXMachine.g:3300:2: rule__XEvent__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_0__1"


    // $ANTLR start "rule__XEvent__Group_4_0__1__Impl"
    // InternalXMachine.g:3306:1: rule__XEvent__Group_4_0__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) ) ;
    public final void rule__XEvent__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3310:1: ( ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) ) )
            // InternalXMachine.g:3311:1: ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) )
            {
            // InternalXMachine.g:3311:1: ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) )
            // InternalXMachine.g:3312:2: ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* )
            {
            // InternalXMachine.g:3312:2: ( ( rule__XEvent__RefinesAssignment_4_0_1 ) )
            // InternalXMachine.g:3313:3: ( rule__XEvent__RefinesAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_4_0_1()); 
            }
            // InternalXMachine.g:3314:3: ( rule__XEvent__RefinesAssignment_4_0_1 )
            // InternalXMachine.g:3314:4: rule__XEvent__RefinesAssignment_4_0_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__RefinesAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_4_0_1()); 
            }

            }

            // InternalXMachine.g:3317:2: ( ( rule__XEvent__RefinesAssignment_4_0_1 )* )
            // InternalXMachine.g:3318:3: ( rule__XEvent__RefinesAssignment_4_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_4_0_1()); 
            }
            // InternalXMachine.g:3319:3: ( rule__XEvent__RefinesAssignment_4_0_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:3319:4: rule__XEvent__RefinesAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__RefinesAssignment_4_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_4_0_1()); 
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
    // $ANTLR end "rule__XEvent__Group_4_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_4_1__0"
    // InternalXMachine.g:3329:1: rule__XEvent__Group_4_1__0 : rule__XEvent__Group_4_1__0__Impl rule__XEvent__Group_4_1__1 ;
    public final void rule__XEvent__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3333:1: ( rule__XEvent__Group_4_1__0__Impl rule__XEvent__Group_4_1__1 )
            // InternalXMachine.g:3334:2: rule__XEvent__Group_4_1__0__Impl rule__XEvent__Group_4_1__1
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_1__0"


    // $ANTLR start "rule__XEvent__Group_4_1__0__Impl"
    // InternalXMachine.g:3341:1: rule__XEvent__Group_4_1__0__Impl : ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) ) ;
    public final void rule__XEvent__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3345:1: ( ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) ) )
            // InternalXMachine.g:3346:1: ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) )
            {
            // InternalXMachine.g:3346:1: ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) )
            // InternalXMachine.g:3347:2: ( rule__XEvent__ExtendedAssignment_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedAssignment_4_1_0()); 
            }
            // InternalXMachine.g:3348:2: ( rule__XEvent__ExtendedAssignment_4_1_0 )
            // InternalXMachine.g:3348:3: rule__XEvent__ExtendedAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__ExtendedAssignment_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedAssignment_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_1__0__Impl"


    // $ANTLR start "rule__XEvent__Group_4_1__1"
    // InternalXMachine.g:3356:1: rule__XEvent__Group_4_1__1 : rule__XEvent__Group_4_1__1__Impl ;
    public final void rule__XEvent__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3360:1: ( rule__XEvent__Group_4_1__1__Impl )
            // InternalXMachine.g:3361:2: rule__XEvent__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_1__1"


    // $ANTLR start "rule__XEvent__Group_4_1__1__Impl"
    // InternalXMachine.g:3367:1: rule__XEvent__Group_4_1__1__Impl : ( ( rule__XEvent__RefinesAssignment_4_1_1 ) ) ;
    public final void rule__XEvent__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3371:1: ( ( ( rule__XEvent__RefinesAssignment_4_1_1 ) ) )
            // InternalXMachine.g:3372:1: ( ( rule__XEvent__RefinesAssignment_4_1_1 ) )
            {
            // InternalXMachine.g:3372:1: ( ( rule__XEvent__RefinesAssignment_4_1_1 ) )
            // InternalXMachine.g:3373:2: ( rule__XEvent__RefinesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1_1()); 
            }
            // InternalXMachine.g:3374:2: ( rule__XEvent__RefinesAssignment_4_1_1 )
            // InternalXMachine.g:3374:3: rule__XEvent__RefinesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__RefinesAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4_1__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5__0"
    // InternalXMachine.g:3383:1: rule__XEvent__Group_5__0 : rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 ;
    public final void rule__XEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3387:1: ( rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 )
            // InternalXMachine.g:3388:2: rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__0"


    // $ANTLR start "rule__XEvent__Group_5__0__Impl"
    // InternalXMachine.g:3395:1: rule__XEvent__Group_5__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3399:1: ( ( 'any' ) )
            // InternalXMachine.g:3400:1: ( 'any' )
            {
            // InternalXMachine.g:3400:1: ( 'any' )
            // InternalXMachine.g:3401:2: 'any'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAnyKeyword_5_0()); 
            }
            match(input,134,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAnyKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5__1"
    // InternalXMachine.g:3410:1: rule__XEvent__Group_5__1 : rule__XEvent__Group_5__1__Impl ;
    public final void rule__XEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3414:1: ( rule__XEvent__Group_5__1__Impl )
            // InternalXMachine.g:3415:2: rule__XEvent__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5__1"


    // $ANTLR start "rule__XEvent__Group_5__1__Impl"
    // InternalXMachine.g:3421:1: rule__XEvent__Group_5__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3425:1: ( ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) ) )
            // InternalXMachine.g:3426:1: ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:3426:1: ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) )
            // InternalXMachine.g:3427:2: ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* )
            {
            // InternalXMachine.g:3427:2: ( ( rule__XEvent__ParametersAssignment_5_1 ) )
            // InternalXMachine.g:3428:3: ( rule__XEvent__ParametersAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersAssignment_5_1()); 
            }
            // InternalXMachine.g:3429:3: ( rule__XEvent__ParametersAssignment_5_1 )
            // InternalXMachine.g:3429:4: rule__XEvent__ParametersAssignment_5_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__ParametersAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getParametersAssignment_5_1()); 
            }

            }

            // InternalXMachine.g:3432:2: ( ( rule__XEvent__ParametersAssignment_5_1 )* )
            // InternalXMachine.g:3433:3: ( rule__XEvent__ParametersAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersAssignment_5_1()); 
            }
            // InternalXMachine.g:3434:3: ( rule__XEvent__ParametersAssignment_5_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalXMachine.g:3434:4: rule__XEvent__ParametersAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__ParametersAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getParametersAssignment_5_1()); 
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
    // $ANTLR end "rule__XEvent__Group_5__1__Impl"


    // $ANTLR start "rule__XEvent__Group_7__0"
    // InternalXMachine.g:3444:1: rule__XEvent__Group_7__0 : rule__XEvent__Group_7__0__Impl rule__XEvent__Group_7__1 ;
    public final void rule__XEvent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3448:1: ( rule__XEvent__Group_7__0__Impl rule__XEvent__Group_7__1 )
            // InternalXMachine.g:3449:2: rule__XEvent__Group_7__0__Impl rule__XEvent__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__XEvent__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_7__0"


    // $ANTLR start "rule__XEvent__Group_7__0__Impl"
    // InternalXMachine.g:3456:1: rule__XEvent__Group_7__0__Impl : ( ( rule__XEvent__Alternatives_7_0 ) ) ;
    public final void rule__XEvent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3460:1: ( ( ( rule__XEvent__Alternatives_7_0 ) ) )
            // InternalXMachine.g:3461:1: ( ( rule__XEvent__Alternatives_7_0 ) )
            {
            // InternalXMachine.g:3461:1: ( ( rule__XEvent__Alternatives_7_0 ) )
            // InternalXMachine.g:3462:2: ( rule__XEvent__Alternatives_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_7_0()); 
            }
            // InternalXMachine.g:3463:2: ( rule__XEvent__Alternatives_7_0 )
            // InternalXMachine.g:3463:3: rule__XEvent__Alternatives_7_0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Alternatives_7_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getAlternatives_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_7__0__Impl"


    // $ANTLR start "rule__XEvent__Group_7__1"
    // InternalXMachine.g:3471:1: rule__XEvent__Group_7__1 : rule__XEvent__Group_7__1__Impl ;
    public final void rule__XEvent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3475:1: ( rule__XEvent__Group_7__1__Impl )
            // InternalXMachine.g:3476:2: rule__XEvent__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_7__1"


    // $ANTLR start "rule__XEvent__Group_7__1__Impl"
    // InternalXMachine.g:3482:1: rule__XEvent__Group_7__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) ) ;
    public final void rule__XEvent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3486:1: ( ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) ) )
            // InternalXMachine.g:3487:1: ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:3487:1: ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) )
            // InternalXMachine.g:3488:2: ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* )
            {
            // InternalXMachine.g:3488:2: ( ( rule__XEvent__GuardsAssignment_7_1 ) )
            // InternalXMachine.g:3489:3: ( rule__XEvent__GuardsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
            }
            // InternalXMachine.g:3490:3: ( rule__XEvent__GuardsAssignment_7_1 )
            // InternalXMachine.g:3490:4: rule__XEvent__GuardsAssignment_7_1
            {
            pushFollow(FOLLOW_12);
            rule__XEvent__GuardsAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
            }

            }

            // InternalXMachine.g:3493:2: ( ( rule__XEvent__GuardsAssignment_7_1 )* )
            // InternalXMachine.g:3494:3: ( rule__XEvent__GuardsAssignment_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
            }
            // InternalXMachine.g:3495:3: ( rule__XEvent__GuardsAssignment_7_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_XLABEL||LA41_0==141) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalXMachine.g:3495:4: rule__XEvent__GuardsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__XEvent__GuardsAssignment_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
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
    // $ANTLR end "rule__XEvent__Group_7__1__Impl"


    // $ANTLR start "rule__XEvent__Group_8__0"
    // InternalXMachine.g:3505:1: rule__XEvent__Group_8__0 : rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 ;
    public final void rule__XEvent__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3509:1: ( rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 )
            // InternalXMachine.g:3510:2: rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXMachine.g:3517:1: rule__XEvent__Group_8__0__Impl : ( ( rule__XEvent__Alternatives_8_0 ) ) ;
    public final void rule__XEvent__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3521:1: ( ( ( rule__XEvent__Alternatives_8_0 ) ) )
            // InternalXMachine.g:3522:1: ( ( rule__XEvent__Alternatives_8_0 ) )
            {
            // InternalXMachine.g:3522:1: ( ( rule__XEvent__Alternatives_8_0 ) )
            // InternalXMachine.g:3523:2: ( rule__XEvent__Alternatives_8_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_8_0()); 
            }
            // InternalXMachine.g:3524:2: ( rule__XEvent__Alternatives_8_0 )
            // InternalXMachine.g:3524:3: rule__XEvent__Alternatives_8_0
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
    // InternalXMachine.g:3532:1: rule__XEvent__Group_8__1 : rule__XEvent__Group_8__1__Impl ;
    public final void rule__XEvent__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3536:1: ( rule__XEvent__Group_8__1__Impl )
            // InternalXMachine.g:3537:2: rule__XEvent__Group_8__1__Impl
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
    // InternalXMachine.g:3543:1: rule__XEvent__Group_8__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) ) ;
    public final void rule__XEvent__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3547:1: ( ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) ) )
            // InternalXMachine.g:3548:1: ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:3548:1: ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) )
            // InternalXMachine.g:3549:2: ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* )
            {
            // InternalXMachine.g:3549:2: ( ( rule__XEvent__ActionsAssignment_8_1 ) )
            // InternalXMachine.g:3550:3: ( rule__XEvent__ActionsAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
            }
            // InternalXMachine.g:3551:3: ( rule__XEvent__ActionsAssignment_8_1 )
            // InternalXMachine.g:3551:4: rule__XEvent__ActionsAssignment_8_1
            {
            pushFollow(FOLLOW_14);
            rule__XEvent__ActionsAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
            }

            }

            // InternalXMachine.g:3554:2: ( ( rule__XEvent__ActionsAssignment_8_1 )* )
            // InternalXMachine.g:3555:3: ( rule__XEvent__ActionsAssignment_8_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
            }
            // InternalXMachine.g:3556:3: ( rule__XEvent__ActionsAssignment_8_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_XLABEL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalXMachine.g:3556:4: rule__XEvent__ActionsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__XEvent__ActionsAssignment_8_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
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
    // InternalXMachine.g:3566:1: rule__XEvent__Group_9__0 : rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 ;
    public final void rule__XEvent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3570:1: ( rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 )
            // InternalXMachine.g:3571:2: rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXMachine.g:3578:1: rule__XEvent__Group_9__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3582:1: ( ( 'with' ) )
            // InternalXMachine.g:3583:1: ( 'with' )
            {
            // InternalXMachine.g:3583:1: ( 'with' )
            // InternalXMachine.g:3584:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWithKeyword_9_0()); 
            }
            match(input,135,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWithKeyword_9_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3593:1: rule__XEvent__Group_9__1 : rule__XEvent__Group_9__1__Impl ;
    public final void rule__XEvent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3597:1: ( rule__XEvent__Group_9__1__Impl )
            // InternalXMachine.g:3598:2: rule__XEvent__Group_9__1__Impl
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
    // InternalXMachine.g:3604:1: rule__XEvent__Group_9__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) ) ;
    public final void rule__XEvent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3608:1: ( ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) ) )
            // InternalXMachine.g:3609:1: ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) )
            {
            // InternalXMachine.g:3609:1: ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) )
            // InternalXMachine.g:3610:2: ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* )
            {
            // InternalXMachine.g:3610:2: ( ( rule__XEvent__WitnessesAssignment_9_1 ) )
            // InternalXMachine.g:3611:3: ( rule__XEvent__WitnessesAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
            }
            // InternalXMachine.g:3612:3: ( rule__XEvent__WitnessesAssignment_9_1 )
            // InternalXMachine.g:3612:4: rule__XEvent__WitnessesAssignment_9_1
            {
            pushFollow(FOLLOW_14);
            rule__XEvent__WitnessesAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
            }

            }

            // InternalXMachine.g:3615:2: ( ( rule__XEvent__WitnessesAssignment_9_1 )* )
            // InternalXMachine.g:3616:3: ( rule__XEvent__WitnessesAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
            }
            // InternalXMachine.g:3617:3: ( rule__XEvent__WitnessesAssignment_9_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_XLABEL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXMachine.g:3617:4: rule__XEvent__WitnessesAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__XEvent__WitnessesAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
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


    // $ANTLR start "rule__EventSync__Group__0"
    // InternalXMachine.g:3627:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3631:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:3632:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalXMachine.g:3639:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3643:1: ( ( () ) )
            // InternalXMachine.g:3644:1: ( () )
            {
            // InternalXMachine.g:3644:1: ( () )
            // InternalXMachine.g:3645:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:3646:2: ()
            // InternalXMachine.g:3646:3: 
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
    // InternalXMachine.g:3654:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3658:1: ( rule__EventSync__Group__1__Impl )
            // InternalXMachine.g:3659:2: rule__EventSync__Group__1__Impl
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
    // InternalXMachine.g:3665:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3669:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:3670:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3670:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:3671:2: ( rule__EventSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3672:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:3672:3: rule__EventSync__Group_1__0
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
    // InternalXMachine.g:3681:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3685:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:3686:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
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
    // InternalXMachine.g:3693:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3697:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:3698:1: ( 'synchronises' )
            {
            // InternalXMachine.g:3698:1: ( 'synchronises' )
            // InternalXMachine.g:3699:2: 'synchronises'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            }
            match(input,136,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3708:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3712:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:3713:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
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
    // InternalXMachine.g:3720:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3724:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:3725:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:3725:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:3726:2: ( rule__EventSync__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            }
            // InternalXMachine.g:3727:2: ( rule__EventSync__Group_1_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==55) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:3727:3: rule__EventSync__Group_1_1__0
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
    // InternalXMachine.g:3735:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3739:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:3740:2: rule__EventSync__Group_1__2__Impl
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
    // InternalXMachine.g:3746:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3750:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:3751:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:3751:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:3752:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            }
            // InternalXMachine.g:3753:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:3753:3: rule__EventSync__SynchronisedEventAssignment_1_2
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
    // InternalXMachine.g:3762:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3766:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:3767:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:3774:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3778:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:3779:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:3779:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:3780:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            }
            // InternalXMachine.g:3781:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:3781:3: rule__EventSync__PrefixAssignment_1_1_0
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
    // InternalXMachine.g:3789:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3793:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:3794:2: rule__EventSync__Group_1_1__1__Impl
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
    // InternalXMachine.g:3800:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3804:1: ( ( '.' ) )
            // InternalXMachine.g:3805:1: ( '.' )
            {
            // InternalXMachine.g:3805:1: ( '.' )
            // InternalXMachine.g:3806:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3816:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3820:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:3821:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalXMachine.g:3828:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3832:1: ( ( () ) )
            // InternalXMachine.g:3833:1: ( () )
            {
            // InternalXMachine.g:3833:1: ( () )
            // InternalXMachine.g:3834:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            }
            // InternalXMachine.g:3835:2: ()
            // InternalXMachine.g:3835:3: 
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
    // InternalXMachine.g:3843:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3847:1: ( rule__XParameter__Group__1__Impl )
            // InternalXMachine.g:3848:2: rule__XParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:3854:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__NameAssignment_1 ) ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3858:1: ( ( ( rule__XParameter__NameAssignment_1 ) ) )
            // InternalXMachine.g:3859:1: ( ( rule__XParameter__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3859:1: ( ( rule__XParameter__NameAssignment_1 ) )
            // InternalXMachine.g:3860:2: ( rule__XParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:3861:2: ( rule__XParameter__NameAssignment_1 )
            // InternalXMachine.g:3861:3: rule__XParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__XGuard__Group__0"
    // InternalXMachine.g:3870:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3874:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:3875:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalXMachine.g:3882:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3886:1: ( ( () ) )
            // InternalXMachine.g:3887:1: ( () )
            {
            // InternalXMachine.g:3887:1: ( () )
            // InternalXMachine.g:3888:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            }
            // InternalXMachine.g:3889:2: ()
            // InternalXMachine.g:3889:3: 
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
    // InternalXMachine.g:3897:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3901:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:3902:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalXMachine.g:3909:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__TheoremAssignment_1 )? ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3913:1: ( ( ( rule__XGuard__TheoremAssignment_1 )? ) )
            // InternalXMachine.g:3914:1: ( ( rule__XGuard__TheoremAssignment_1 )? )
            {
            // InternalXMachine.g:3914:1: ( ( rule__XGuard__TheoremAssignment_1 )? )
            // InternalXMachine.g:3915:2: ( rule__XGuard__TheoremAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremAssignment_1()); 
            }
            // InternalXMachine.g:3916:2: ( rule__XGuard__TheoremAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==141) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:3916:3: rule__XGuard__TheoremAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__TheoremAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremAssignment_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3924:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3928:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:3929:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:3936:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__NameAssignment_2 ) ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3940:1: ( ( ( rule__XGuard__NameAssignment_2 ) ) )
            // InternalXMachine.g:3941:1: ( ( rule__XGuard__NameAssignment_2 ) )
            {
            // InternalXMachine.g:3941:1: ( ( rule__XGuard__NameAssignment_2 ) )
            // InternalXMachine.g:3942:2: ( rule__XGuard__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:3943:2: ( rule__XGuard__NameAssignment_2 )
            // InternalXMachine.g:3943:3: rule__XGuard__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:3951:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3955:1: ( rule__XGuard__Group__3__Impl )
            // InternalXMachine.g:3956:2: rule__XGuard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:3962:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__PredicateAssignment_3 ) ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3966:1: ( ( ( rule__XGuard__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:3967:1: ( ( rule__XGuard__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:3967:1: ( ( rule__XGuard__PredicateAssignment_3 ) )
            // InternalXMachine.g:3968:2: ( rule__XGuard__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:3969:2: ( rule__XGuard__PredicateAssignment_3 )
            // InternalXMachine.g:3969:3: rule__XGuard__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__PredicateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getPredicateAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__XWitness__Group__0"
    // InternalXMachine.g:3978:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3982:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:3983:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXMachine.g:3990:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3994:1: ( ( () ) )
            // InternalXMachine.g:3995:1: ( () )
            {
            // InternalXMachine.g:3995:1: ( () )
            // InternalXMachine.g:3996:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            }
            // InternalXMachine.g:3997:2: ()
            // InternalXMachine.g:3997:3: 
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
    // InternalXMachine.g:4005:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4009:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:4010:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:4017:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__NameAssignment_1 ) ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4021:1: ( ( ( rule__XWitness__NameAssignment_1 ) ) )
            // InternalXMachine.g:4022:1: ( ( rule__XWitness__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4022:1: ( ( rule__XWitness__NameAssignment_1 ) )
            // InternalXMachine.g:4023:2: ( rule__XWitness__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4024:2: ( rule__XWitness__NameAssignment_1 )
            // InternalXMachine.g:4024:3: rule__XWitness__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4032:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4036:1: ( rule__XWitness__Group__2__Impl )
            // InternalXMachine.g:4037:2: rule__XWitness__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:4043:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__PredicateAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4047:1: ( ( ( rule__XWitness__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:4048:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:4048:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            // InternalXMachine.g:4049:2: ( rule__XWitness__PredicateAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            }
            // InternalXMachine.g:4050:2: ( rule__XWitness__PredicateAssignment_2 )
            // InternalXMachine.g:4050:3: rule__XWitness__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__PredicateAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__XAction__Group__0"
    // InternalXMachine.g:4059:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4063:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:4064:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXMachine.g:4071:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4075:1: ( ( () ) )
            // InternalXMachine.g:4076:1: ( () )
            {
            // InternalXMachine.g:4076:1: ( () )
            // InternalXMachine.g:4077:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAction_0()); 
            }
            // InternalXMachine.g:4078:2: ()
            // InternalXMachine.g:4078:3: 
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
    // InternalXMachine.g:4086:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4090:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:4091:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalXMachine.g:4098:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__NameAssignment_1 ) ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4102:1: ( ( ( rule__XAction__NameAssignment_1 ) ) )
            // InternalXMachine.g:4103:1: ( ( rule__XAction__NameAssignment_1 ) )
            {
            // InternalXMachine.g:4103:1: ( ( rule__XAction__NameAssignment_1 ) )
            // InternalXMachine.g:4104:2: ( rule__XAction__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:4105:2: ( rule__XAction__NameAssignment_1 )
            // InternalXMachine.g:4105:3: rule__XAction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XAction__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4113:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4117:1: ( rule__XAction__Group__2__Impl )
            // InternalXMachine.g:4118:2: rule__XAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:4124:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__ActionAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4128:1: ( ( ( rule__XAction__ActionAssignment_2 ) ) )
            // InternalXMachine.g:4129:1: ( ( rule__XAction__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:4129:1: ( ( rule__XAction__ActionAssignment_2 ) )
            // InternalXMachine.g:4130:2: ( rule__XAction__ActionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            }
            // InternalXMachine.g:4131:2: ( rule__XAction__ActionAssignment_2 )
            // InternalXMachine.g:4131:3: rule__XAction__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAction__ActionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0"
    // InternalXMachine.g:4140:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4144:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalXMachine.g:4145:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalXMachine.g:4152:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4156:1: ( ( '%' ) )
            // InternalXMachine.g:4157:1: ( '%' )
            {
            // InternalXMachine.g:4157:1: ( '%' )
            // InternalXMachine.g:4158:2: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            }
            match(input,137,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4167:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4171:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalXMachine.g:4172:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
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
    // InternalXMachine.g:4178:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4182:1: ( ( '\\u22C2' ) )
            // InternalXMachine.g:4183:1: ( '\\u22C2' )
            {
            // InternalXMachine.g:4183:1: ( '\\u22C2' )
            // InternalXMachine.g:4184:2: '\\u22C2'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            }
            match(input,138,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Record__Group__0"
    // InternalXMachine.g:4194:1: rule__Record__Group__0 : rule__Record__Group__0__Impl rule__Record__Group__1 ;
    public final void rule__Record__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4198:1: ( rule__Record__Group__0__Impl rule__Record__Group__1 )
            // InternalXMachine.g:4199:2: rule__Record__Group__0__Impl rule__Record__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Record__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Record__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__0"


    // $ANTLR start "rule__Record__Group__0__Impl"
    // InternalXMachine.g:4206:1: rule__Record__Group__0__Impl : ( () ) ;
    public final void rule__Record__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4210:1: ( ( () ) )
            // InternalXMachine.g:4211:1: ( () )
            {
            // InternalXMachine.g:4211:1: ( () )
            // InternalXMachine.g:4212:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getRecordAction_0()); 
            }
            // InternalXMachine.g:4213:2: ()
            // InternalXMachine.g:4213:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getRecordAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__0__Impl"


    // $ANTLR start "rule__Record__Group__1"
    // InternalXMachine.g:4221:1: rule__Record__Group__1 : rule__Record__Group__1__Impl rule__Record__Group__2 ;
    public final void rule__Record__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4225:1: ( rule__Record__Group__1__Impl rule__Record__Group__2 )
            // InternalXMachine.g:4226:2: rule__Record__Group__1__Impl rule__Record__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Record__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Record__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__1"


    // $ANTLR start "rule__Record__Group__1__Impl"
    // InternalXMachine.g:4233:1: rule__Record__Group__1__Impl : ( 'record' ) ;
    public final void rule__Record__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4237:1: ( ( 'record' ) )
            // InternalXMachine.g:4238:1: ( 'record' )
            {
            // InternalXMachine.g:4238:1: ( 'record' )
            // InternalXMachine.g:4239:2: 'record'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getRecordKeyword_1()); 
            }
            match(input,139,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getRecordKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__1__Impl"


    // $ANTLR start "rule__Record__Group__2"
    // InternalXMachine.g:4248:1: rule__Record__Group__2 : rule__Record__Group__2__Impl rule__Record__Group__3 ;
    public final void rule__Record__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4252:1: ( rule__Record__Group__2__Impl rule__Record__Group__3 )
            // InternalXMachine.g:4253:2: rule__Record__Group__2__Impl rule__Record__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Record__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Record__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__2"


    // $ANTLR start "rule__Record__Group__2__Impl"
    // InternalXMachine.g:4260:1: rule__Record__Group__2__Impl : ( ( rule__Record__NameAssignment_2 ) ) ;
    public final void rule__Record__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4264:1: ( ( ( rule__Record__NameAssignment_2 ) ) )
            // InternalXMachine.g:4265:1: ( ( rule__Record__NameAssignment_2 ) )
            {
            // InternalXMachine.g:4265:1: ( ( rule__Record__NameAssignment_2 ) )
            // InternalXMachine.g:4266:2: ( rule__Record__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:4267:2: ( rule__Record__NameAssignment_2 )
            // InternalXMachine.g:4267:3: rule__Record__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Record__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__2__Impl"


    // $ANTLR start "rule__Record__Group__3"
    // InternalXMachine.g:4275:1: rule__Record__Group__3 : rule__Record__Group__3__Impl rule__Record__Group__4 ;
    public final void rule__Record__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4279:1: ( rule__Record__Group__3__Impl rule__Record__Group__4 )
            // InternalXMachine.g:4280:2: rule__Record__Group__3__Impl rule__Record__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Record__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Record__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__3"


    // $ANTLR start "rule__Record__Group__3__Impl"
    // InternalXMachine.g:4287:1: rule__Record__Group__3__Impl : ( ( rule__Record__Group_3__0 ) ) ;
    public final void rule__Record__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4291:1: ( ( ( rule__Record__Group_3__0 ) ) )
            // InternalXMachine.g:4292:1: ( ( rule__Record__Group_3__0 ) )
            {
            // InternalXMachine.g:4292:1: ( ( rule__Record__Group_3__0 ) )
            // InternalXMachine.g:4293:2: ( rule__Record__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getGroup_3()); 
            }
            // InternalXMachine.g:4294:2: ( rule__Record__Group_3__0 )
            // InternalXMachine.g:4294:3: rule__Record__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__3__Impl"


    // $ANTLR start "rule__Record__Group__4"
    // InternalXMachine.g:4302:1: rule__Record__Group__4 : rule__Record__Group__4__Impl ;
    public final void rule__Record__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4306:1: ( rule__Record__Group__4__Impl )
            // InternalXMachine.g:4307:2: rule__Record__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__4"


    // $ANTLR start "rule__Record__Group__4__Impl"
    // InternalXMachine.g:4313:1: rule__Record__Group__4__Impl : ( ( rule__Record__Group_4__0 )? ) ;
    public final void rule__Record__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4317:1: ( ( ( rule__Record__Group_4__0 )? ) )
            // InternalXMachine.g:4318:1: ( ( rule__Record__Group_4__0 )? )
            {
            // InternalXMachine.g:4318:1: ( ( rule__Record__Group_4__0 )? )
            // InternalXMachine.g:4319:2: ( rule__Record__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getGroup_4()); 
            }
            // InternalXMachine.g:4320:2: ( rule__Record__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:4320:3: rule__Record__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Record__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__4__Impl"


    // $ANTLR start "rule__Record__Group_3__0"
    // InternalXMachine.g:4329:1: rule__Record__Group_3__0 : rule__Record__Group_3__0__Impl rule__Record__Group_3__1 ;
    public final void rule__Record__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4333:1: ( rule__Record__Group_3__0__Impl rule__Record__Group_3__1 )
            // InternalXMachine.g:4334:2: rule__Record__Group_3__0__Impl rule__Record__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Record__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Record__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__0"


    // $ANTLR start "rule__Record__Group_3__0__Impl"
    // InternalXMachine.g:4341:1: rule__Record__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Record__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4345:1: ( ( 'extends' ) )
            // InternalXMachine.g:4346:1: ( 'extends' )
            {
            // InternalXMachine.g:4346:1: ( 'extends' )
            // InternalXMachine.g:4347:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getExtendsKeyword_3_0()); 
            }
            match(input,140,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getExtendsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__0__Impl"


    // $ANTLR start "rule__Record__Group_3__1"
    // InternalXMachine.g:4356:1: rule__Record__Group_3__1 : rule__Record__Group_3__1__Impl ;
    public final void rule__Record__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4360:1: ( rule__Record__Group_3__1__Impl )
            // InternalXMachine.g:4361:2: rule__Record__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__1"


    // $ANTLR start "rule__Record__Group_3__1__Impl"
    // InternalXMachine.g:4367:1: rule__Record__Group_3__1__Impl : ( ( rule__Record__SubsetsAssignment_3_1 ) ) ;
    public final void rule__Record__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4371:1: ( ( ( rule__Record__SubsetsAssignment_3_1 ) ) )
            // InternalXMachine.g:4372:1: ( ( rule__Record__SubsetsAssignment_3_1 ) )
            {
            // InternalXMachine.g:4372:1: ( ( rule__Record__SubsetsAssignment_3_1 ) )
            // InternalXMachine.g:4373:2: ( rule__Record__SubsetsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getSubsetsAssignment_3_1()); 
            }
            // InternalXMachine.g:4374:2: ( rule__Record__SubsetsAssignment_3_1 )
            // InternalXMachine.g:4374:3: rule__Record__SubsetsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Record__SubsetsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getSubsetsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__1__Impl"


    // $ANTLR start "rule__Record__Group_4__0"
    // InternalXMachine.g:4383:1: rule__Record__Group_4__0 : rule__Record__Group_4__0__Impl rule__Record__Group_4__1 ;
    public final void rule__Record__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4387:1: ( rule__Record__Group_4__0__Impl rule__Record__Group_4__1 )
            // InternalXMachine.g:4388:2: rule__Record__Group_4__0__Impl rule__Record__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Record__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Record__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_4__0"


    // $ANTLR start "rule__Record__Group_4__0__Impl"
    // InternalXMachine.g:4395:1: rule__Record__Group_4__0__Impl : ( ( rule__Record__FieldsAssignment_4_0 ) ) ;
    public final void rule__Record__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4399:1: ( ( ( rule__Record__FieldsAssignment_4_0 ) ) )
            // InternalXMachine.g:4400:1: ( ( rule__Record__FieldsAssignment_4_0 ) )
            {
            // InternalXMachine.g:4400:1: ( ( rule__Record__FieldsAssignment_4_0 ) )
            // InternalXMachine.g:4401:2: ( rule__Record__FieldsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getFieldsAssignment_4_0()); 
            }
            // InternalXMachine.g:4402:2: ( rule__Record__FieldsAssignment_4_0 )
            // InternalXMachine.g:4402:3: rule__Record__FieldsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Record__FieldsAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getFieldsAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_4__0__Impl"


    // $ANTLR start "rule__Record__Group_4__1"
    // InternalXMachine.g:4410:1: rule__Record__Group_4__1 : rule__Record__Group_4__1__Impl ;
    public final void rule__Record__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4414:1: ( rule__Record__Group_4__1__Impl )
            // InternalXMachine.g:4415:2: rule__Record__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_4__1"


    // $ANTLR start "rule__Record__Group_4__1__Impl"
    // InternalXMachine.g:4421:1: rule__Record__Group_4__1__Impl : ( ( rule__Record__FieldsAssignment_4_1 )* ) ;
    public final void rule__Record__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4425:1: ( ( ( rule__Record__FieldsAssignment_4_1 )* ) )
            // InternalXMachine.g:4426:1: ( ( rule__Record__FieldsAssignment_4_1 )* )
            {
            // InternalXMachine.g:4426:1: ( ( rule__Record__FieldsAssignment_4_1 )* )
            // InternalXMachine.g:4427:2: ( rule__Record__FieldsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getFieldsAssignment_4_1()); 
            }
            // InternalXMachine.g:4428:2: ( rule__Record__FieldsAssignment_4_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalXMachine.g:4428:3: rule__Record__FieldsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Record__FieldsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getFieldsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_4__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalXMachine.g:4437:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4441:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalXMachine.g:4442:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalXMachine.g:4449:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4453:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalXMachine.g:4454:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalXMachine.g:4454:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalXMachine.g:4455:2: ( rule__Field__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            }
            // InternalXMachine.g:4456:2: ( rule__Field__NameAssignment_0 )
            // InternalXMachine.g:4456:3: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalXMachine.g:4464:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4468:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalXMachine.g:4469:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalXMachine.g:4476:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4480:1: ( ( ':' ) )
            // InternalXMachine.g:4481:1: ( ':' )
            {
            // InternalXMachine.g:4481:1: ( ':' )
            // InternalXMachine.g:4482:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4491:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4495:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalXMachine.g:4496:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalXMachine.g:4503:1: rule__Field__Group__2__Impl : ( ( rule__Field__MultiplicityAssignment_2 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4507:1: ( ( ( rule__Field__MultiplicityAssignment_2 )? ) )
            // InternalXMachine.g:4508:1: ( ( rule__Field__MultiplicityAssignment_2 )? )
            {
            // InternalXMachine.g:4508:1: ( ( rule__Field__MultiplicityAssignment_2 )? )
            // InternalXMachine.g:4509:2: ( rule__Field__MultiplicityAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMultiplicityAssignment_2()); 
            }
            // InternalXMachine.g:4510:2: ( rule__Field__MultiplicityAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=117 && LA48_0<=119)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:4510:3: rule__Field__MultiplicityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__MultiplicityAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMultiplicityAssignment_2()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4518:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4522:1: ( rule__Field__Group__3__Impl )
            // InternalXMachine.g:4523:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:4529:1: rule__Field__Group__3__Impl : ( ( rule__Field__TypeAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4533:1: ( ( ( rule__Field__TypeAssignment_3 ) ) )
            // InternalXMachine.g:4534:1: ( ( rule__Field__TypeAssignment_3 ) )
            {
            // InternalXMachine.g:4534:1: ( ( rule__Field__TypeAssignment_3 ) )
            // InternalXMachine.g:4535:2: ( rule__Field__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            }
            // InternalXMachine.g:4536:2: ( rule__Field__TypeAssignment_3 )
            // InternalXMachine.g:4536:3: rule__Field__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Machine__UnorderedGroup_4"
    // InternalXMachine.g:4545:1: rule__Machine__UnorderedGroup_4 : ( rule__Machine__UnorderedGroup_4__0 )? ;
    public final void rule__Machine__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_4());
        	
        try {
            // InternalXMachine.g:4550:1: ( ( rule__Machine__UnorderedGroup_4__0 )? )
            // InternalXMachine.g:4551:2: ( rule__Machine__UnorderedGroup_4__0 )?
            {
            // InternalXMachine.g:4551:2: ( rule__Machine__UnorderedGroup_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 130 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 122 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt49=1;
            }
            else if ( LA49_0 == 123 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXMachine.g:4551:2: rule__Machine__UnorderedGroup_4__0
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
    // InternalXMachine.g:4559:1: rule__Machine__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__Machine__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:4564:1: ( ( ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) ) )
            // InternalXMachine.g:4565:3: ( ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) )
            {
            // InternalXMachine.g:4565:3: ( ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) )
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 130 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 122 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt51=2;
            }
            else if ( LA51_0 == 123 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt51=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalXMachine.g:4566:3: ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) )
                    {
                    // InternalXMachine.g:4566:3: ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) )
                    // InternalXMachine.g:4567:4: {...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalXMachine.g:4567:103: ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) )
                    // InternalXMachine.g:4568:5: ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalXMachine.g:4574:5: ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) )
                    // InternalXMachine.g:4575:6: ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* )
                    {
                    // InternalXMachine.g:4575:6: ( ( rule__Machine__ExtensionsAssignment_4_0 ) )
                    // InternalXMachine.g:4576:7: ( rule__Machine__ExtensionsAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getExtensionsAssignment_4_0()); 
                    }
                    // InternalXMachine.g:4577:7: ( rule__Machine__ExtensionsAssignment_4_0 )
                    // InternalXMachine.g:4577:8: rule__Machine__ExtensionsAssignment_4_0
                    {
                    pushFollow(FOLLOW_28);
                    rule__Machine__ExtensionsAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getExtensionsAssignment_4_0()); 
                    }

                    }

                    // InternalXMachine.g:4580:6: ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* )
                    // InternalXMachine.g:4581:7: ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getExtensionsAssignment_4_0()); 
                    }
                    // InternalXMachine.g:4582:7: ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==130) ) {
                            int LA50_1 = input.LA(2);

                            if ( (LA50_1==RULE_ID) ) {
                                int LA50_3 = input.LA(3);

                                if ( (synpred1_InternalXMachine()) ) {
                                    alt50=1;
                                }


                            }


                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalXMachine.g:4582:8: ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0
                    	    {
                    	    pushFollow(FOLLOW_28);
                    	    rule__Machine__ExtensionsAssignment_4_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getExtensionsAssignment_4_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:4588:3: ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) )
                    {
                    // InternalXMachine.g:4588:3: ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) )
                    // InternalXMachine.g:4589:4: {...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalXMachine.g:4589:103: ( ( ( rule__Machine__Group_4_1__0 ) ) )
                    // InternalXMachine.g:4590:5: ( ( rule__Machine__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalXMachine.g:4596:5: ( ( rule__Machine__Group_4_1__0 ) )
                    // InternalXMachine.g:4597:6: ( rule__Machine__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_4_1()); 
                    }
                    // InternalXMachine.g:4598:6: ( rule__Machine__Group_4_1__0 )
                    // InternalXMachine.g:4598:7: rule__Machine__Group_4_1__0
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
                    // InternalXMachine.g:4603:3: ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) )
                    {
                    // InternalXMachine.g:4603:3: ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) )
                    // InternalXMachine.g:4604:4: {...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalXMachine.g:4604:103: ( ( ( rule__Machine__Group_4_2__0 ) ) )
                    // InternalXMachine.g:4605:5: ( ( rule__Machine__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalXMachine.g:4611:5: ( ( rule__Machine__Group_4_2__0 ) )
                    // InternalXMachine.g:4612:6: ( rule__Machine__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_4_2()); 
                    }
                    // InternalXMachine.g:4613:6: ( rule__Machine__Group_4_2__0 )
                    // InternalXMachine.g:4613:7: rule__Machine__Group_4_2__0
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
    // InternalXMachine.g:4626:1: rule__Machine__UnorderedGroup_4__0 : rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )? ;
    public final void rule__Machine__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4630:1: ( rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )? )
            // InternalXMachine.g:4631:2: rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_29);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:4632:2: ( rule__Machine__UnorderedGroup_4__1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 130 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 122 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt52=1;
            }
            else if ( LA52_0 == 123 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXMachine.g:4632:2: rule__Machine__UnorderedGroup_4__1
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
    // InternalXMachine.g:4638:1: rule__Machine__UnorderedGroup_4__1 : rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )? ;
    public final void rule__Machine__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4642:1: ( rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )? )
            // InternalXMachine.g:4643:2: rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_29);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:4644:2: ( rule__Machine__UnorderedGroup_4__2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 130 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 122 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt53=1;
            }
            else if ( LA53_0 == 123 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXMachine.g:4644:2: rule__Machine__UnorderedGroup_4__2
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
    // InternalXMachine.g:4650:1: rule__Machine__UnorderedGroup_4__2 : rule__Machine__UnorderedGroup_4__Impl ;
    public final void rule__Machine__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4654:1: ( rule__Machine__UnorderedGroup_4__Impl )
            // InternalXMachine.g:4655:2: rule__Machine__UnorderedGroup_4__Impl
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
    // InternalXMachine.g:4662:1: rule__Machine__CommentAssignment_1 : ( ( rule__Machine__CommentAlternatives_1_0 ) ) ;
    public final void rule__Machine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4666:1: ( ( ( rule__Machine__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:4667:2: ( ( rule__Machine__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:4667:2: ( ( rule__Machine__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:4668:3: ( rule__Machine__CommentAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCommentAlternatives_1_0()); 
            }
            // InternalXMachine.g:4669:3: ( rule__Machine__CommentAlternatives_1_0 )
            // InternalXMachine.g:4669:4: rule__Machine__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__CommentAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getCommentAlternatives_1_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:4677:1: rule__Machine__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4681:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4682:2: ( RULE_ID )
            {
            // InternalXMachine.g:4682:2: ( RULE_ID )
            // InternalXMachine.g:4683:3: RULE_ID
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


    // $ANTLR start "rule__Machine__ExtensionsAssignment_4_0"
    // InternalXMachine.g:4692:1: rule__Machine__ExtensionsAssignment_4_0 : ( ruleMIncludes ) ;
    public final void rule__Machine__ExtensionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4696:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:4697:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:4697:2: ( ruleMIncludes )
            // InternalXMachine.g:4698:3: ruleMIncludes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMIncludes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_4_0"


    // $ANTLR start "rule__Machine__RefinesAssignment_4_1_1"
    // InternalXMachine.g:4707:1: rule__Machine__RefinesAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4711:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4712:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4712:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4713:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_1_0()); 
            }
            // InternalXMachine.g:4714:3: ( RULE_ID )
            // InternalXMachine.g:4715:4: RULE_ID
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
    // InternalXMachine.g:4726:1: rule__Machine__SeesAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4730:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4731:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4731:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4732:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesContextCrossReference_4_2_1_0()); 
            }
            // InternalXMachine.g:4733:3: ( RULE_ID )
            // InternalXMachine.g:4734:4: RULE_ID
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


    // $ANTLR start "rule__Machine__ExtensionsAssignment_5_1"
    // InternalXMachine.g:4745:1: rule__Machine__ExtensionsAssignment_5_1 : ( ruleMContains ) ;
    public final void rule__Machine__ExtensionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4749:1: ( ( ruleMContains ) )
            // InternalXMachine.g:4750:2: ( ruleMContains )
            {
            // InternalXMachine.g:4750:2: ( ruleMContains )
            // InternalXMachine.g:4751:3: ruleMContains
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsMContainsParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMContains();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getExtensionsMContainsParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_5_1"


    // $ANTLR start "rule__Machine__VariablesAssignment_6_1"
    // InternalXMachine.g:4760:1: rule__Machine__VariablesAssignment_6_1 : ( ruleXVariable ) ;
    public final void rule__Machine__VariablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4764:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:4765:2: ( ruleXVariable )
            {
            // InternalXMachine.g:4765:2: ( ruleXVariable )
            // InternalXMachine.g:4766:3: ruleXVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariablesAssignment_6_1"


    // $ANTLR start "rule__Machine__ExtensionsAssignment_7_1"
    // InternalXMachine.g:4775:1: rule__Machine__ExtensionsAssignment_7_1 : ( ruleRecord ) ;
    public final void rule__Machine__ExtensionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4779:1: ( ( ruleRecord ) )
            // InternalXMachine.g:4780:2: ( ruleRecord )
            {
            // InternalXMachine.g:4780:2: ( ruleRecord )
            // InternalXMachine.g:4781:3: ruleRecord
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsRecordParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRecord();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getExtensionsRecordParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_7_1"


    // $ANTLR start "rule__Machine__InvariantsAssignment_8_1"
    // InternalXMachine.g:4790:1: rule__Machine__InvariantsAssignment_8_1 : ( ruleXInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4794:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:4795:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:4795:2: ( ruleXInvariant )
            // InternalXMachine.g:4796:3: ruleXInvariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__InvariantsAssignment_8_1"


    // $ANTLR start "rule__Machine__VariantsAssignment_9_1"
    // InternalXMachine.g:4805:1: rule__Machine__VariantsAssignment_9_1 : ( ruleXVariant ) ;
    public final void rule__Machine__VariantsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4809:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:4810:2: ( ruleXVariant )
            {
            // InternalXMachine.g:4810:2: ( ruleXVariant )
            // InternalXMachine.g:4811:3: ruleXVariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsXVariantParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXVariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsXVariantParserRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariantsAssignment_9_1"


    // $ANTLR start "rule__Machine__EventsAssignment_10_1"
    // InternalXMachine.g:4820:1: rule__Machine__EventsAssignment_10_1 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4824:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4825:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4825:2: ( ruleXEvent )
            // InternalXMachine.g:4826:3: ruleXEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_10_1"


    // $ANTLR start "rule__MContains__NameAssignment_1"
    // InternalXMachine.g:4835:1: rule__MContains__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MContains__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4839:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4840:2: ( RULE_ID )
            {
            // InternalXMachine.g:4840:2: ( RULE_ID )
            // InternalXMachine.g:4841:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__NameAssignment_1"


    // $ANTLR start "rule__MContains__ExtensionAssignment_3"
    // InternalXMachine.g:4850:1: rule__MContains__ExtensionAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MContains__ExtensionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4854:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:4855:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:4855:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:4856:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionDiagramCrossReference_3_0()); 
            }
            // InternalXMachine.g:4857:3: ( ruleQualifiedName )
            // InternalXMachine.g:4858:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionDiagramQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getExtensionDiagramQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMContainsAccess().getExtensionDiagramCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MContains__ExtensionAssignment_3"


    // $ANTLR start "rule__MIncludes__AbstractMachineAssignment_1_1"
    // InternalXMachine.g:4869:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4873:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:4874:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:4874:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:4875:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            }
            // InternalXMachine.g:4876:3: ( ruleQualifiedName )
            // InternalXMachine.g:4877:4: ruleQualifiedName
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
    // InternalXMachine.g:4888:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4892:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4893:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4893:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4894:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            }
            // InternalXMachine.g:4895:3: ( RULE_ID )
            // InternalXMachine.g:4896:4: RULE_ID
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
    // InternalXMachine.g:4907:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4911:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4912:2: ( RULE_ID )
            {
            // InternalXMachine.g:4912:2: ( RULE_ID )
            // InternalXMachine.g:4913:3: RULE_ID
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
    // InternalXMachine.g:4922:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4926:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4927:2: ( RULE_ID )
            {
            // InternalXMachine.g:4927:2: ( RULE_ID )
            // InternalXMachine.g:4928:3: RULE_ID
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


    // $ANTLR start "rule__XVariable__NameAssignment_1"
    // InternalXMachine.g:4937:1: rule__XVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4941:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4942:2: ( RULE_ID )
            {
            // InternalXMachine.g:4942:2: ( RULE_ID )
            // InternalXMachine.g:4943:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariable__NameAssignment_1"


    // $ANTLR start "rule__XInvariant__TheoremAssignment_1"
    // InternalXMachine.g:4952:1: rule__XInvariant__TheoremAssignment_1 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4956:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:4957:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:4957:2: ( ( 'theorem' ) )
            // InternalXMachine.g:4958:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            }
            // InternalXMachine.g:4959:3: ( 'theorem' )
            // InternalXMachine.g:4960:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            }
            match(input,141,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__TheoremAssignment_1"


    // $ANTLR start "rule__XInvariant__NameAssignment_2"
    // InternalXMachine.g:4971:1: rule__XInvariant__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XInvariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4975:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4976:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4976:2: ( RULE_XLABEL )
            // InternalXMachine.g:4977:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__NameAssignment_2"


    // $ANTLR start "rule__XInvariant__PredicateAssignment_3"
    // InternalXMachine.g:4986:1: rule__XInvariant__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XInvariant__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4990:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:4991:2: ( ruleXFormula )
            {
            // InternalXMachine.g:4991:2: ( ruleXFormula )
            // InternalXMachine.g:4992:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXInvariantAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__PredicateAssignment_3"


    // $ANTLR start "rule__XVariant__NameAssignment_1"
    // InternalXMachine.g:5001:1: rule__XVariant__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XVariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5005:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5006:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5006:2: ( RULE_XLABEL )
            // InternalXMachine.g:5007:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__NameAssignment_1"


    // $ANTLR start "rule__XVariant__ExpressionAssignment_2"
    // InternalXMachine.g:5016:1: rule__XVariant__ExpressionAssignment_2 : ( ruleXFormula ) ;
    public final void rule__XVariant__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5020:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:5021:2: ( ruleXFormula )
            {
            // InternalXMachine.g:5021:2: ( ruleXFormula )
            // InternalXMachine.g:5022:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionXFormulaParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXVariantAccess().getExpressionXFormulaParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__ExpressionAssignment_2"


    // $ANTLR start "rule__XEvent__ConvergenceAssignment_1"
    // InternalXMachine.g:5031:1: rule__XEvent__ConvergenceAssignment_1 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5035:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:5036:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:5036:2: ( ruleXConvergence )
            // InternalXMachine.g:5037:3: ruleXConvergence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXConvergence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ConvergenceAssignment_1"


    // $ANTLR start "rule__XEvent__NameAssignment_3"
    // InternalXMachine.g:5046:1: rule__XEvent__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5050:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5051:2: ( RULE_ID )
            {
            // InternalXMachine.g:5051:2: ( RULE_ID )
            // InternalXMachine.g:5052:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__NameAssignment_3"


    // $ANTLR start "rule__XEvent__RefinesAssignment_4_0_1"
    // InternalXMachine.g:5061:1: rule__XEvent__RefinesAssignment_4_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5065:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5066:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5066:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5067:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_0_1_0()); 
            }
            // InternalXMachine.g:5068:3: ( RULE_ID )
            // InternalXMachine.g:5069:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__RefinesAssignment_4_0_1"


    // $ANTLR start "rule__XEvent__ExtendedAssignment_4_1_0"
    // InternalXMachine.g:5080:1: rule__XEvent__ExtendedAssignment_4_1_0 : ( ( 'extends' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5084:1: ( ( ( 'extends' ) ) )
            // InternalXMachine.g:5085:2: ( ( 'extends' ) )
            {
            // InternalXMachine.g:5085:2: ( ( 'extends' ) )
            // InternalXMachine.g:5086:3: ( 'extends' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0()); 
            }
            // InternalXMachine.g:5087:3: ( 'extends' )
            // InternalXMachine.g:5088:4: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0()); 
            }
            match(input,140,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtendedAssignment_4_1_0"


    // $ANTLR start "rule__XEvent__RefinesAssignment_4_1_1"
    // InternalXMachine.g:5099:1: rule__XEvent__RefinesAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5103:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5104:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5104:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5105:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_1_0()); 
            }
            // InternalXMachine.g:5106:3: ( RULE_ID )
            // InternalXMachine.g:5107:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__RefinesAssignment_4_1_1"


    // $ANTLR start "rule__XEvent__ParametersAssignment_5_1"
    // InternalXMachine.g:5118:1: rule__XEvent__ParametersAssignment_5_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5122:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:5123:2: ( ruleXParameter )
            {
            // InternalXMachine.g:5123:2: ( ruleXParameter )
            // InternalXMachine.g:5124:3: ruleXParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ParametersAssignment_5_1"


    // $ANTLR start "rule__XEvent__ExtensionsAssignment_6"
    // InternalXMachine.g:5133:1: rule__XEvent__ExtensionsAssignment_6 : ( ruleEventSync ) ;
    public final void rule__XEvent__ExtensionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5137:1: ( ( ruleEventSync ) )
            // InternalXMachine.g:5138:2: ( ruleEventSync )
            {
            // InternalXMachine.g:5138:2: ( ruleEventSync )
            // InternalXMachine.g:5139:3: ruleEventSync
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtensionsEventSyncParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventSync();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getExtensionsEventSyncParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtensionsAssignment_6"


    // $ANTLR start "rule__XEvent__GuardsAssignment_7_1"
    // InternalXMachine.g:5148:1: rule__XEvent__GuardsAssignment_7_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5152:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:5153:2: ( ruleXGuard )
            {
            // InternalXMachine.g:5153:2: ( ruleXGuard )
            // InternalXMachine.g:5154:3: ruleXGuard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__GuardsAssignment_7_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_8_1"
    // InternalXMachine.g:5163:1: rule__XEvent__ActionsAssignment_8_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5167:1: ( ( ruleXAction ) )
            // InternalXMachine.g:5168:2: ( ruleXAction )
            {
            // InternalXMachine.g:5168:2: ( ruleXAction )
            // InternalXMachine.g:5169:3: ruleXAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_8_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_9_1"
    // InternalXMachine.g:5178:1: rule__XEvent__WitnessesAssignment_9_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5182:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:5183:2: ( ruleXWitness )
            {
            // InternalXMachine.g:5183:2: ( ruleXWitness )
            // InternalXMachine.g:5184:3: ruleXWitness
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_9_1"


    // $ANTLR start "rule__EventSync__PrefixAssignment_1_1_0"
    // InternalXMachine.g:5193:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5197:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5198:2: ( RULE_ID )
            {
            // InternalXMachine.g:5198:2: ( RULE_ID )
            // InternalXMachine.g:5199:3: RULE_ID
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
    // InternalXMachine.g:5208:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5212:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5213:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5213:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5214:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            }
            // InternalXMachine.g:5215:3: ( RULE_ID )
            // InternalXMachine.g:5216:4: RULE_ID
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


    // $ANTLR start "rule__XParameter__NameAssignment_1"
    // InternalXMachine.g:5227:1: rule__XParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5231:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5232:2: ( RULE_ID )
            {
            // InternalXMachine.g:5232:2: ( RULE_ID )
            // InternalXMachine.g:5233:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XParameter__NameAssignment_1"


    // $ANTLR start "rule__XGuard__TheoremAssignment_1"
    // InternalXMachine.g:5242:1: rule__XGuard__TheoremAssignment_1 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5246:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:5247:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:5247:2: ( ( 'theorem' ) )
            // InternalXMachine.g:5248:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0()); 
            }
            // InternalXMachine.g:5249:3: ( 'theorem' )
            // InternalXMachine.g:5250:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0()); 
            }
            match(input,141,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__TheoremAssignment_1"


    // $ANTLR start "rule__XGuard__NameAssignment_2"
    // InternalXMachine.g:5261:1: rule__XGuard__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5265:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5266:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5266:2: ( RULE_XLABEL )
            // InternalXMachine.g:5267:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__NameAssignment_2"


    // $ANTLR start "rule__XGuard__PredicateAssignment_3"
    // InternalXMachine.g:5276:1: rule__XGuard__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XGuard__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5280:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:5281:2: ( ruleXFormula )
            {
            // InternalXMachine.g:5281:2: ( ruleXFormula )
            // InternalXMachine.g:5282:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXGuardAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__PredicateAssignment_3"


    // $ANTLR start "rule__XWitness__NameAssignment_1"
    // InternalXMachine.g:5291:1: rule__XWitness__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5295:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5296:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5296:2: ( RULE_XLABEL )
            // InternalXMachine.g:5297:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__NameAssignment_1"


    // $ANTLR start "rule__XWitness__PredicateAssignment_2"
    // InternalXMachine.g:5306:1: rule__XWitness__PredicateAssignment_2 : ( ruleXFormula ) ;
    public final void rule__XWitness__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5310:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:5311:2: ( ruleXFormula )
            {
            // InternalXMachine.g:5311:2: ( ruleXFormula )
            // InternalXMachine.g:5312:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateXFormulaParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXWitnessAccess().getPredicateXFormulaParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XWitness__PredicateAssignment_2"


    // $ANTLR start "rule__XAction__NameAssignment_1"
    // InternalXMachine.g:5321:1: rule__XAction__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5325:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:5326:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:5326:2: ( RULE_XLABEL )
            // InternalXMachine.g:5327:3: RULE_XLABEL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }
            match(input,RULE_XLABEL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__NameAssignment_1"


    // $ANTLR start "rule__XAction__ActionAssignment_2"
    // InternalXMachine.g:5336:1: rule__XAction__ActionAssignment_2 : ( ruleXFormula ) ;
    public final void rule__XAction__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5340:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:5341:2: ( ruleXFormula )
            {
            // InternalXMachine.g:5341:2: ( ruleXFormula )
            // InternalXMachine.g:5342:3: ruleXFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionXFormulaParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXActionAccess().getActionXFormulaParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAction__ActionAssignment_2"


    // $ANTLR start "rule__Record__NameAssignment_2"
    // InternalXMachine.g:5351:1: rule__Record__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Record__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5355:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5356:2: ( RULE_ID )
            {
            // InternalXMachine.g:5356:2: ( RULE_ID )
            // InternalXMachine.g:5357:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__NameAssignment_2"


    // $ANTLR start "rule__Record__SubsetsAssignment_3_1"
    // InternalXMachine.g:5366:1: rule__Record__SubsetsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Record__SubsetsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5370:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:5371:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:5371:2: ( ( RULE_ID ) )
            // InternalXMachine.g:5372:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getSubsetsRecordCrossReference_3_1_0()); 
            }
            // InternalXMachine.g:5373:3: ( RULE_ID )
            // InternalXMachine.g:5374:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getSubsetsRecordIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getSubsetsRecordIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getSubsetsRecordCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__SubsetsAssignment_3_1"


    // $ANTLR start "rule__Record__FieldsAssignment_4_0"
    // InternalXMachine.g:5385:1: rule__Record__FieldsAssignment_4_0 : ( ruleField ) ;
    public final void rule__Record__FieldsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5389:1: ( ( ruleField ) )
            // InternalXMachine.g:5390:2: ( ruleField )
            {
            // InternalXMachine.g:5390:2: ( ruleField )
            // InternalXMachine.g:5391:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getFieldsFieldParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getFieldsFieldParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__FieldsAssignment_4_0"


    // $ANTLR start "rule__Record__FieldsAssignment_4_1"
    // InternalXMachine.g:5400:1: rule__Record__FieldsAssignment_4_1 : ( ruleField ) ;
    public final void rule__Record__FieldsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5404:1: ( ( ruleField ) )
            // InternalXMachine.g:5405:2: ( ruleField )
            {
            // InternalXMachine.g:5405:2: ( ruleField )
            // InternalXMachine.g:5406:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getFieldsFieldParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getFieldsFieldParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__FieldsAssignment_4_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // InternalXMachine.g:5415:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5419:1: ( ( RULE_ID ) )
            // InternalXMachine.g:5420:2: ( RULE_ID )
            {
            // InternalXMachine.g:5420:2: ( RULE_ID )
            // InternalXMachine.g:5421:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__MultiplicityAssignment_2"
    // InternalXMachine.g:5430:1: rule__Field__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__Field__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5434:1: ( ( ruleMultiplicity ) )
            // InternalXMachine.g:5435:2: ( ruleMultiplicity )
            {
            // InternalXMachine.g:5435:2: ( ruleMultiplicity )
            // InternalXMachine.g:5436:3: ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__MultiplicityAssignment_2"


    // $ANTLR start "rule__Field__TypeAssignment_3"
    // InternalXMachine.g:5445:1: rule__Field__TypeAssignment_3 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:5449:1: ( ( ruleFieldType ) )
            // InternalXMachine.g:5450:2: ( ruleFieldType )
            {
            // InternalXMachine.g:5450:2: ( ruleFieldType )
            // InternalXMachine.g:5451:3: ruleFieldType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_3"

    // $ANTLR start synpred1_InternalXMachine
    public final void synpred1_InternalXMachine_fragment() throws RecognitionException {   
        // InternalXMachine.g:4582:8: ( rule__Machine__ExtensionsAssignment_4_0 )
        // InternalXMachine.g:4582:9: rule__Machine__ExtensionsAssignment_4_0
        {
        pushFollow(FOLLOW_2);
        rule__Machine__ExtensionsAssignment_4_0();

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFFF00C2L,0x0003FFFFFFFFFFFFL,0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L,0x0100000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0xF200000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x001C000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x001C000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xFFFFFFFFFFFF00C0L,0x0003FFFFFFFFFFFFL,0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000000F000L,0x0600000000000000L,0x00000000000011C0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007FFFFF0040L,0x00E0000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x0C00000000000000L,0x0000000000000004L});

}
