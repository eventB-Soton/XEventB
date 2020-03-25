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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_XLABEL", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'where'", "'when'", "'then'", "'begin'", "'BOOL'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21151'", "'\\u2115'", "'\\u21191'", "'\\u2119'", "'\\u2124'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'\\u00D7'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'refines'", "'sees'", "'contains'", "'variables'", "'invariants'", "'variants'", "'events'", "'includes'", "'to'", "'as'", "'event'", "'any'", "'with'", "'synchronises'", "'%'", "'\\u22C2'", "'theorem'", "'extends'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__54=54;
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=16 && LA1_0<=113)||LA1_0==133) ) {
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


    // $ANTLR start "ruleXConvergence"
    // InternalXMachine.g:485:1: ruleXConvergence : ( ( rule__XConvergence__Alternatives ) ) ;
    public final void ruleXConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:489:1: ( ( ( rule__XConvergence__Alternatives ) ) )
            // InternalXMachine.g:490:2: ( ( rule__XConvergence__Alternatives ) )
            {
            // InternalXMachine.g:490:2: ( ( rule__XConvergence__Alternatives ) )
            // InternalXMachine.g:491:3: ( rule__XConvergence__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            }
            // InternalXMachine.g:492:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:492:4: rule__XConvergence__Alternatives
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


    // $ANTLR start "rule__Machine__CommentAlternatives_1_0"
    // InternalXMachine.g:500:1: rule__Machine__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Machine__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:504:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalXMachine.g:505:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:505:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:506:3: RULE_ML_COMMENT
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
                    // InternalXMachine.g:511:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:511:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:512:3: RULE_SL_COMMENT
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
    // InternalXMachine.g:521:1: rule__XEvent__Alternatives_4 : ( ( ( rule__XEvent__Group_4_0__0 ) ) | ( ( rule__XEvent__Group_4_1__0 ) ) );
    public final void rule__XEvent__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:525:1: ( ( ( rule__XEvent__Group_4_0__0 ) ) | ( ( rule__XEvent__Group_4_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==119) ) {
                alt3=1;
            }
            else if ( (LA3_0==136) ) {
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
                    // InternalXMachine.g:526:2: ( ( rule__XEvent__Group_4_0__0 ) )
                    {
                    // InternalXMachine.g:526:2: ( ( rule__XEvent__Group_4_0__0 ) )
                    // InternalXMachine.g:527:3: ( rule__XEvent__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_4_0()); 
                    }
                    // InternalXMachine.g:528:3: ( rule__XEvent__Group_4_0__0 )
                    // InternalXMachine.g:528:4: rule__XEvent__Group_4_0__0
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
                    // InternalXMachine.g:532:2: ( ( rule__XEvent__Group_4_1__0 ) )
                    {
                    // InternalXMachine.g:532:2: ( ( rule__XEvent__Group_4_1__0 ) )
                    // InternalXMachine.g:533:3: ( rule__XEvent__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXEventAccess().getGroup_4_1()); 
                    }
                    // InternalXMachine.g:534:3: ( rule__XEvent__Group_4_1__0 )
                    // InternalXMachine.g:534:4: rule__XEvent__Group_4_1__0
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
    // InternalXMachine.g:542:1: rule__XEvent__Alternatives_7_0 : ( ( 'where' ) | ( 'when' ) );
    public final void rule__XEvent__Alternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:546:1: ( ( 'where' ) | ( 'when' ) )
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
                    // InternalXMachine.g:547:2: ( 'where' )
                    {
                    // InternalXMachine.g:547:2: ( 'where' )
                    // InternalXMachine.g:548:3: 'where'
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
                    // InternalXMachine.g:553:2: ( 'when' )
                    {
                    // InternalXMachine.g:553:2: ( 'when' )
                    // InternalXMachine.g:554:3: 'when'
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
    // InternalXMachine.g:563:1: rule__XEvent__Alternatives_8_0 : ( ( 'then' ) | ( 'begin' ) );
    public final void rule__XEvent__Alternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:567:1: ( ( 'then' ) | ( 'begin' ) )
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
                    // InternalXMachine.g:568:2: ( 'then' )
                    {
                    // InternalXMachine.g:568:2: ( 'then' )
                    // InternalXMachine.g:569:3: 'then'
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
                    // InternalXMachine.g:574:2: ( 'begin' )
                    {
                    // InternalXMachine.g:574:2: ( 'begin' )
                    // InternalXMachine.g:575:3: 'begin'
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
    // InternalXMachine.g:584:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:588:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) )
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
            case 133:
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
                    // InternalXMachine.g:589:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXMachine.g:589:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXMachine.g:590:3: ruleEVENTB_IDENTIFIER_KEYWORD
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
                    // InternalXMachine.g:595:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXMachine.g:595:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXMachine.g:596:3: ruleEVENTB_PREDICATE_SYMBOLS
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
                    // InternalXMachine.g:601:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXMachine.g:601:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXMachine.g:602:3: ruleEVENTB_EXPRESSION_SYMBOLS
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
                    // InternalXMachine.g:607:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:607:2: ( RULE_ID )
                    // InternalXMachine.g:608:3: RULE_ID
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
                    // InternalXMachine.g:613:2: ( RULE_INT )
                    {
                    // InternalXMachine.g:613:2: ( RULE_INT )
                    // InternalXMachine.g:614:3: RULE_INT
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
    // InternalXMachine.g:623:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:627:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
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
                    // InternalXMachine.g:628:2: ( 'BOOL' )
                    {
                    // InternalXMachine.g:628:2: ( 'BOOL' )
                    // InternalXMachine.g:629:3: 'BOOL'
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
                    // InternalXMachine.g:634:2: ( 'FALSE' )
                    {
                    // InternalXMachine.g:634:2: ( 'FALSE' )
                    // InternalXMachine.g:635:3: 'FALSE'
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
                    // InternalXMachine.g:640:2: ( 'TRUE' )
                    {
                    // InternalXMachine.g:640:2: ( 'TRUE' )
                    // InternalXMachine.g:641:3: 'TRUE'
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
                    // InternalXMachine.g:646:2: ( 'bool' )
                    {
                    // InternalXMachine.g:646:2: ( 'bool' )
                    // InternalXMachine.g:647:3: 'bool'
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
                    // InternalXMachine.g:652:2: ( 'card' )
                    {
                    // InternalXMachine.g:652:2: ( 'card' )
                    // InternalXMachine.g:653:3: 'card'
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
                    // InternalXMachine.g:658:2: ( 'dom' )
                    {
                    // InternalXMachine.g:658:2: ( 'dom' )
                    // InternalXMachine.g:659:3: 'dom'
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
                    // InternalXMachine.g:664:2: ( 'finite' )
                    {
                    // InternalXMachine.g:664:2: ( 'finite' )
                    // InternalXMachine.g:665:3: 'finite'
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
                    // InternalXMachine.g:670:2: ( 'id' )
                    {
                    // InternalXMachine.g:670:2: ( 'id' )
                    // InternalXMachine.g:671:3: 'id'
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
                    // InternalXMachine.g:676:2: ( 'inter' )
                    {
                    // InternalXMachine.g:676:2: ( 'inter' )
                    // InternalXMachine.g:677:3: 'inter'
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
                    // InternalXMachine.g:682:2: ( 'max' )
                    {
                    // InternalXMachine.g:682:2: ( 'max' )
                    // InternalXMachine.g:683:3: 'max'
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
                    // InternalXMachine.g:688:2: ( 'min' )
                    {
                    // InternalXMachine.g:688:2: ( 'min' )
                    // InternalXMachine.g:689:3: 'min'
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
                    // InternalXMachine.g:694:2: ( 'mod' )
                    {
                    // InternalXMachine.g:694:2: ( 'mod' )
                    // InternalXMachine.g:695:3: 'mod'
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
                    // InternalXMachine.g:700:2: ( 'pred' )
                    {
                    // InternalXMachine.g:700:2: ( 'pred' )
                    // InternalXMachine.g:701:3: 'pred'
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
                    // InternalXMachine.g:706:2: ( 'prj1' )
                    {
                    // InternalXMachine.g:706:2: ( 'prj1' )
                    // InternalXMachine.g:707:3: 'prj1'
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
                    // InternalXMachine.g:712:2: ( 'prj2' )
                    {
                    // InternalXMachine.g:712:2: ( 'prj2' )
                    // InternalXMachine.g:713:3: 'prj2'
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
                    // InternalXMachine.g:718:2: ( 'ran' )
                    {
                    // InternalXMachine.g:718:2: ( 'ran' )
                    // InternalXMachine.g:719:3: 'ran'
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
                    // InternalXMachine.g:724:2: ( 'succ' )
                    {
                    // InternalXMachine.g:724:2: ( 'succ' )
                    // InternalXMachine.g:725:3: 'succ'
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
                    // InternalXMachine.g:730:2: ( 'union' )
                    {
                    // InternalXMachine.g:730:2: ( 'union' )
                    // InternalXMachine.g:731:3: 'union'
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
                    // InternalXMachine.g:736:2: ( '\\u21151' )
                    {
                    // InternalXMachine.g:736:2: ( '\\u21151' )
                    // InternalXMachine.g:737:3: '\\u21151'
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
                    // InternalXMachine.g:742:2: ( '\\u2115' )
                    {
                    // InternalXMachine.g:742:2: ( '\\u2115' )
                    // InternalXMachine.g:743:3: '\\u2115'
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
                    // InternalXMachine.g:748:2: ( '\\u21191' )
                    {
                    // InternalXMachine.g:748:2: ( '\\u21191' )
                    // InternalXMachine.g:749:3: '\\u21191'
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
                    // InternalXMachine.g:754:2: ( '\\u2119' )
                    {
                    // InternalXMachine.g:754:2: ( '\\u2119' )
                    // InternalXMachine.g:755:3: '\\u2119'
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
                    // InternalXMachine.g:760:2: ( '\\u2124' )
                    {
                    // InternalXMachine.g:760:2: ( '\\u2124' )
                    // InternalXMachine.g:761:3: '\\u2124'
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
    // InternalXMachine.g:770:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:774:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
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
                    // InternalXMachine.g:775:2: ( '(' )
                    {
                    // InternalXMachine.g:775:2: ( '(' )
                    // InternalXMachine.g:776:3: '('
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
                    // InternalXMachine.g:781:2: ( ')' )
                    {
                    // InternalXMachine.g:781:2: ( ')' )
                    // InternalXMachine.g:782:3: ')'
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
                    // InternalXMachine.g:787:2: ( '\\u21D4' )
                    {
                    // InternalXMachine.g:787:2: ( '\\u21D4' )
                    // InternalXMachine.g:788:3: '\\u21D4'
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
                    // InternalXMachine.g:793:2: ( '\\u21D2' )
                    {
                    // InternalXMachine.g:793:2: ( '\\u21D2' )
                    // InternalXMachine.g:794:3: '\\u21D2'
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
                    // InternalXMachine.g:799:2: ( '\\u2227' )
                    {
                    // InternalXMachine.g:799:2: ( '\\u2227' )
                    // InternalXMachine.g:800:3: '\\u2227'
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
                    // InternalXMachine.g:805:2: ( '&' )
                    {
                    // InternalXMachine.g:805:2: ( '&' )
                    // InternalXMachine.g:806:3: '&'
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
                    // InternalXMachine.g:811:2: ( '\\u2228' )
                    {
                    // InternalXMachine.g:811:2: ( '\\u2228' )
                    // InternalXMachine.g:812:3: '\\u2228'
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
                    // InternalXMachine.g:817:2: ( '\\u00AC' )
                    {
                    // InternalXMachine.g:817:2: ( '\\u00AC' )
                    // InternalXMachine.g:818:3: '\\u00AC'
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
                    // InternalXMachine.g:823:2: ( '\\u22A4' )
                    {
                    // InternalXMachine.g:823:2: ( '\\u22A4' )
                    // InternalXMachine.g:824:3: '\\u22A4'
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
                    // InternalXMachine.g:829:2: ( '\\u22A5' )
                    {
                    // InternalXMachine.g:829:2: ( '\\u22A5' )
                    // InternalXMachine.g:830:3: '\\u22A5'
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
                    // InternalXMachine.g:835:2: ( '\\u2200' )
                    {
                    // InternalXMachine.g:835:2: ( '\\u2200' )
                    // InternalXMachine.g:836:3: '\\u2200'
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
                    // InternalXMachine.g:841:2: ( '!' )
                    {
                    // InternalXMachine.g:841:2: ( '!' )
                    // InternalXMachine.g:842:3: '!'
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
                    // InternalXMachine.g:847:2: ( '\\u2203' )
                    {
                    // InternalXMachine.g:847:2: ( '\\u2203' )
                    // InternalXMachine.g:848:3: '\\u2203'
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
                    // InternalXMachine.g:853:2: ( '#' )
                    {
                    // InternalXMachine.g:853:2: ( '#' )
                    // InternalXMachine.g:854:3: '#'
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
                    // InternalXMachine.g:859:2: ( ',' )
                    {
                    // InternalXMachine.g:859:2: ( ',' )
                    // InternalXMachine.g:860:3: ','
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
                    // InternalXMachine.g:865:2: ( '\\u00B7' )
                    {
                    // InternalXMachine.g:865:2: ( '\\u00B7' )
                    // InternalXMachine.g:866:3: '\\u00B7'
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
                    // InternalXMachine.g:871:2: ( '.' )
                    {
                    // InternalXMachine.g:871:2: ( '.' )
                    // InternalXMachine.g:872:3: '.'
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
                    // InternalXMachine.g:877:2: ( '=' )
                    {
                    // InternalXMachine.g:877:2: ( '=' )
                    // InternalXMachine.g:878:3: '='
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
                    // InternalXMachine.g:883:2: ( '\\u2260' )
                    {
                    // InternalXMachine.g:883:2: ( '\\u2260' )
                    // InternalXMachine.g:884:3: '\\u2260'
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
                    // InternalXMachine.g:889:2: ( '\\u2264' )
                    {
                    // InternalXMachine.g:889:2: ( '\\u2264' )
                    // InternalXMachine.g:890:3: '\\u2264'
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
                    // InternalXMachine.g:895:2: ( '<' )
                    {
                    // InternalXMachine.g:895:2: ( '<' )
                    // InternalXMachine.g:896:3: '<'
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
                    // InternalXMachine.g:901:2: ( '\\u2265' )
                    {
                    // InternalXMachine.g:901:2: ( '\\u2265' )
                    // InternalXMachine.g:902:3: '\\u2265'
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
                    // InternalXMachine.g:907:2: ( '>' )
                    {
                    // InternalXMachine.g:907:2: ( '>' )
                    // InternalXMachine.g:908:3: '>'
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
                    // InternalXMachine.g:913:2: ( '\\u2208' )
                    {
                    // InternalXMachine.g:913:2: ( '\\u2208' )
                    // InternalXMachine.g:914:3: '\\u2208'
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
                    // InternalXMachine.g:919:2: ( ':' )
                    {
                    // InternalXMachine.g:919:2: ( ':' )
                    // InternalXMachine.g:920:3: ':'
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
                    // InternalXMachine.g:925:2: ( '\\u2209' )
                    {
                    // InternalXMachine.g:925:2: ( '\\u2209' )
                    // InternalXMachine.g:926:3: '\\u2209'
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
                    // InternalXMachine.g:931:2: ( '\\u2282' )
                    {
                    // InternalXMachine.g:931:2: ( '\\u2282' )
                    // InternalXMachine.g:932:3: '\\u2282'
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
                    // InternalXMachine.g:937:2: ( '\\u2284' )
                    {
                    // InternalXMachine.g:937:2: ( '\\u2284' )
                    // InternalXMachine.g:938:3: '\\u2284'
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
                    // InternalXMachine.g:943:2: ( '\\u2286' )
                    {
                    // InternalXMachine.g:943:2: ( '\\u2286' )
                    // InternalXMachine.g:944:3: '\\u2286'
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
                    // InternalXMachine.g:949:2: ( '\\u2288' )
                    {
                    // InternalXMachine.g:949:2: ( '\\u2288' )
                    // InternalXMachine.g:950:3: '\\u2288'
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
                    // InternalXMachine.g:955:2: ( 'partition' )
                    {
                    // InternalXMachine.g:955:2: ( 'partition' )
                    // InternalXMachine.g:956:3: 'partition'
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
    // InternalXMachine.g:965:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:969:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
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
            case 133:
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
                    // InternalXMachine.g:970:2: ( '\\u2194' )
                    {
                    // InternalXMachine.g:970:2: ( '\\u2194' )
                    // InternalXMachine.g:971:3: '\\u2194'
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
                    // InternalXMachine.g:976:2: ( '\\uE100' )
                    {
                    // InternalXMachine.g:976:2: ( '\\uE100' )
                    // InternalXMachine.g:977:3: '\\uE100'
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
                    // InternalXMachine.g:982:2: ( '\\uE101' )
                    {
                    // InternalXMachine.g:982:2: ( '\\uE101' )
                    // InternalXMachine.g:983:3: '\\uE101'
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
                    // InternalXMachine.g:988:2: ( '\\uE102' )
                    {
                    // InternalXMachine.g:988:2: ( '\\uE102' )
                    // InternalXMachine.g:989:3: '\\uE102'
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
                    // InternalXMachine.g:994:2: ( '\\u21F8' )
                    {
                    // InternalXMachine.g:994:2: ( '\\u21F8' )
                    // InternalXMachine.g:995:3: '\\u21F8'
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
                    // InternalXMachine.g:1000:2: ( '\\u2192' )
                    {
                    // InternalXMachine.g:1000:2: ( '\\u2192' )
                    // InternalXMachine.g:1001:3: '\\u2192'
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
                    // InternalXMachine.g:1006:2: ( '\\u2914' )
                    {
                    // InternalXMachine.g:1006:2: ( '\\u2914' )
                    // InternalXMachine.g:1007:3: '\\u2914'
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
                    // InternalXMachine.g:1012:2: ( '\\u21A3' )
                    {
                    // InternalXMachine.g:1012:2: ( '\\u21A3' )
                    // InternalXMachine.g:1013:3: '\\u21A3'
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
                    // InternalXMachine.g:1018:2: ( '\\u2900' )
                    {
                    // InternalXMachine.g:1018:2: ( '\\u2900' )
                    // InternalXMachine.g:1019:3: '\\u2900'
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
                    // InternalXMachine.g:1024:2: ( '\\u21A0' )
                    {
                    // InternalXMachine.g:1024:2: ( '\\u21A0' )
                    // InternalXMachine.g:1025:3: '\\u21A0'
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
                    // InternalXMachine.g:1030:2: ( '\\u2916' )
                    {
                    // InternalXMachine.g:1030:2: ( '\\u2916' )
                    // InternalXMachine.g:1031:3: '\\u2916'
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
                    // InternalXMachine.g:1036:2: ( '{' )
                    {
                    // InternalXMachine.g:1036:2: ( '{' )
                    // InternalXMachine.g:1037:3: '{'
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
                    // InternalXMachine.g:1042:2: ( '}' )
                    {
                    // InternalXMachine.g:1042:2: ( '}' )
                    // InternalXMachine.g:1043:3: '}'
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
                    // InternalXMachine.g:1048:2: ( '\\u21A6' )
                    {
                    // InternalXMachine.g:1048:2: ( '\\u21A6' )
                    // InternalXMachine.g:1049:3: '\\u21A6'
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
                    // InternalXMachine.g:1054:2: ( '\\u2205' )
                    {
                    // InternalXMachine.g:1054:2: ( '\\u2205' )
                    // InternalXMachine.g:1055:3: '\\u2205'
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
                    // InternalXMachine.g:1060:2: ( '\\u2229' )
                    {
                    // InternalXMachine.g:1060:2: ( '\\u2229' )
                    // InternalXMachine.g:1061:3: '\\u2229'
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
                    // InternalXMachine.g:1066:2: ( '\\u222A' )
                    {
                    // InternalXMachine.g:1066:2: ( '\\u222A' )
                    // InternalXMachine.g:1067:3: '\\u222A'
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
                    // InternalXMachine.g:1072:2: ( '\\u2216' )
                    {
                    // InternalXMachine.g:1072:2: ( '\\u2216' )
                    // InternalXMachine.g:1073:3: '\\u2216'
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
                    // InternalXMachine.g:1078:2: ( '\\u00D7' )
                    {
                    // InternalXMachine.g:1078:2: ( '\\u00D7' )
                    // InternalXMachine.g:1079:3: '\\u00D7'
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
                    // InternalXMachine.g:1084:2: ( '[' )
                    {
                    // InternalXMachine.g:1084:2: ( '[' )
                    // InternalXMachine.g:1085:3: '['
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
                    // InternalXMachine.g:1090:2: ( ']' )
                    {
                    // InternalXMachine.g:1090:2: ( ']' )
                    // InternalXMachine.g:1091:3: ']'
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
                    // InternalXMachine.g:1096:2: ( '\\uE103' )
                    {
                    // InternalXMachine.g:1096:2: ( '\\uE103' )
                    // InternalXMachine.g:1097:3: '\\uE103'
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
                    // InternalXMachine.g:1102:2: ( '\\u2218' )
                    {
                    // InternalXMachine.g:1102:2: ( '\\u2218' )
                    // InternalXMachine.g:1103:3: '\\u2218'
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
                    // InternalXMachine.g:1108:2: ( ';' )
                    {
                    // InternalXMachine.g:1108:2: ( ';' )
                    // InternalXMachine.g:1109:3: ';'
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
                    // InternalXMachine.g:1114:2: ( '\\u2297' )
                    {
                    // InternalXMachine.g:1114:2: ( '\\u2297' )
                    // InternalXMachine.g:1115:3: '\\u2297'
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
                    // InternalXMachine.g:1120:2: ( '\\u2225' )
                    {
                    // InternalXMachine.g:1120:2: ( '\\u2225' )
                    // InternalXMachine.g:1121:3: '\\u2225'
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
                    // InternalXMachine.g:1126:2: ( '\\u223C' )
                    {
                    // InternalXMachine.g:1126:2: ( '\\u223C' )
                    // InternalXMachine.g:1127:3: '\\u223C'
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
                    // InternalXMachine.g:1132:2: ( '\\u25C1' )
                    {
                    // InternalXMachine.g:1132:2: ( '\\u25C1' )
                    // InternalXMachine.g:1133:3: '\\u25C1'
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
                    // InternalXMachine.g:1138:2: ( '\\u2A64' )
                    {
                    // InternalXMachine.g:1138:2: ( '\\u2A64' )
                    // InternalXMachine.g:1139:3: '\\u2A64'
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
                    // InternalXMachine.g:1144:2: ( '\\u25B7' )
                    {
                    // InternalXMachine.g:1144:2: ( '\\u25B7' )
                    // InternalXMachine.g:1145:3: '\\u25B7'
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
                    // InternalXMachine.g:1150:2: ( '\\u2A65' )
                    {
                    // InternalXMachine.g:1150:2: ( '\\u2A65' )
                    // InternalXMachine.g:1151:3: '\\u2A65'
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
                    // InternalXMachine.g:1156:2: ( '\\u03BB' )
                    {
                    // InternalXMachine.g:1156:2: ( '\\u03BB' )
                    // InternalXMachine.g:1157:3: '\\u03BB'
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
                    // InternalXMachine.g:1162:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalXMachine.g:1162:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalXMachine.g:1163:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    }
                    // InternalXMachine.g:1164:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalXMachine.g:1164:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
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
                    // InternalXMachine.g:1168:2: ( '\\u22C3' )
                    {
                    // InternalXMachine.g:1168:2: ( '\\u22C3' )
                    // InternalXMachine.g:1169:3: '\\u22C3'
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
                    // InternalXMachine.g:1174:2: ( '\\u2223' )
                    {
                    // InternalXMachine.g:1174:2: ( '\\u2223' )
                    // InternalXMachine.g:1175:3: '\\u2223'
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
                    // InternalXMachine.g:1180:2: ( '\\u2025' )
                    {
                    // InternalXMachine.g:1180:2: ( '\\u2025' )
                    // InternalXMachine.g:1181:3: '\\u2025'
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
                    // InternalXMachine.g:1186:2: ( '+' )
                    {
                    // InternalXMachine.g:1186:2: ( '+' )
                    // InternalXMachine.g:1187:3: '+'
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
                    // InternalXMachine.g:1192:2: ( '\\u2212' )
                    {
                    // InternalXMachine.g:1192:2: ( '\\u2212' )
                    // InternalXMachine.g:1193:3: '\\u2212'
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
                    // InternalXMachine.g:1198:2: ( '-' )
                    {
                    // InternalXMachine.g:1198:2: ( '-' )
                    // InternalXMachine.g:1199:3: '-'
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
                    // InternalXMachine.g:1204:2: ( '\\u2217' )
                    {
                    // InternalXMachine.g:1204:2: ( '\\u2217' )
                    // InternalXMachine.g:1205:3: '\\u2217'
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
                    // InternalXMachine.g:1210:2: ( '*' )
                    {
                    // InternalXMachine.g:1210:2: ( '*' )
                    // InternalXMachine.g:1211:3: '*'
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
                    // InternalXMachine.g:1216:2: ( '\\u00F7' )
                    {
                    // InternalXMachine.g:1216:2: ( '\\u00F7' )
                    // InternalXMachine.g:1217:3: '\\u00F7'
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
                    // InternalXMachine.g:1222:2: ( '/' )
                    {
                    // InternalXMachine.g:1222:2: ( '/' )
                    // InternalXMachine.g:1223:3: '/'
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
                    // InternalXMachine.g:1228:2: ( '^' )
                    {
                    // InternalXMachine.g:1228:2: ( '^' )
                    // InternalXMachine.g:1229:3: '^'
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
                    // InternalXMachine.g:1234:2: ( '\\\\' )
                    {
                    // InternalXMachine.g:1234:2: ( '\\\\' )
                    // InternalXMachine.g:1235:3: '\\\\'
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


    // $ANTLR start "rule__XConvergence__Alternatives"
    // InternalXMachine.g:1244:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1248:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt10=1;
                }
                break;
            case 115:
                {
                alt10=2;
                }
                break;
            case 116:
                {
                alt10=3;
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
                    // InternalXMachine.g:1249:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:1249:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:1250:3: ( 'ordinary' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    }
                    // InternalXMachine.g:1251:3: ( 'ordinary' )
                    // InternalXMachine.g:1251:4: 'ordinary'
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
                    // InternalXMachine.g:1255:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:1255:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:1256:3: ( 'convergent' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    }
                    // InternalXMachine.g:1257:3: ( 'convergent' )
                    // InternalXMachine.g:1257:4: 'convergent'
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
                    // InternalXMachine.g:1261:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:1261:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:1262:3: ( 'anticipated' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    }
                    // InternalXMachine.g:1263:3: ( 'anticipated' )
                    // InternalXMachine.g:1263:4: 'anticipated'
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


    // $ANTLR start "rule__Machine__Group__0"
    // InternalXMachine.g:1271:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1275:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:1276:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
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
    // InternalXMachine.g:1283:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1287:1: ( ( () ) )
            // InternalXMachine.g:1288:1: ( () )
            {
            // InternalXMachine.g:1288:1: ( () )
            // InternalXMachine.g:1289:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            }
            // InternalXMachine.g:1290:2: ()
            // InternalXMachine.g:1290:3: 
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
    // InternalXMachine.g:1298:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1302:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:1303:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
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
    // InternalXMachine.g:1310:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__CommentAssignment_1 )? ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1314:1: ( ( ( rule__Machine__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1315:1: ( ( rule__Machine__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1315:1: ( ( rule__Machine__CommentAssignment_1 )? )
            // InternalXMachine.g:1316:2: ( rule__Machine__CommentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCommentAssignment_1()); 
            }
            // InternalXMachine.g:1317:2: ( rule__Machine__CommentAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ML_COMMENT && LA11_0<=RULE_SL_COMMENT)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:1317:3: rule__Machine__CommentAssignment_1
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
    // InternalXMachine.g:1325:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1329:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:1330:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
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
    // InternalXMachine.g:1337:1: rule__Machine__Group__2__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1341:1: ( ( 'machine' ) )
            // InternalXMachine.g:1342:1: ( 'machine' )
            {
            // InternalXMachine.g:1342:1: ( 'machine' )
            // InternalXMachine.g:1343:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineKeyword_2()); 
            }
            match(input,117,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1352:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1356:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:1357:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
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
    // InternalXMachine.g:1364:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__NameAssignment_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1368:1: ( ( ( rule__Machine__NameAssignment_3 ) ) )
            // InternalXMachine.g:1369:1: ( ( rule__Machine__NameAssignment_3 ) )
            {
            // InternalXMachine.g:1369:1: ( ( rule__Machine__NameAssignment_3 ) )
            // InternalXMachine.g:1370:2: ( rule__Machine__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:1371:2: ( rule__Machine__NameAssignment_3 )
            // InternalXMachine.g:1371:3: rule__Machine__NameAssignment_3
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
    // InternalXMachine.g:1379:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1383:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:1384:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
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
    // InternalXMachine.g:1391:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__UnorderedGroup_4 ) ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1395:1: ( ( ( rule__Machine__UnorderedGroup_4 ) ) )
            // InternalXMachine.g:1396:1: ( ( rule__Machine__UnorderedGroup_4 ) )
            {
            // InternalXMachine.g:1396:1: ( ( rule__Machine__UnorderedGroup_4 ) )
            // InternalXMachine.g:1397:2: ( rule__Machine__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getUnorderedGroup_4()); 
            }
            // InternalXMachine.g:1398:2: ( rule__Machine__UnorderedGroup_4 )
            // InternalXMachine.g:1398:3: rule__Machine__UnorderedGroup_4
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
    // InternalXMachine.g:1406:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1410:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:1411:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
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
    // InternalXMachine.g:1418:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1422:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:1423:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:1423:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:1424:2: ( rule__Machine__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_5()); 
            }
            // InternalXMachine.g:1425:2: ( rule__Machine__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==121) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXMachine.g:1425:3: rule__Machine__Group_5__0
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
    // InternalXMachine.g:1433:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1437:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXMachine.g:1438:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
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
    // InternalXMachine.g:1445:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1449:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // InternalXMachine.g:1450:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // InternalXMachine.g:1450:1: ( ( rule__Machine__Group_6__0 )? )
            // InternalXMachine.g:1451:2: ( rule__Machine__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_6()); 
            }
            // InternalXMachine.g:1452:2: ( rule__Machine__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==122) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:1452:3: rule__Machine__Group_6__0
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
    // InternalXMachine.g:1460:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1464:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXMachine.g:1465:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
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
    // InternalXMachine.g:1472:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1476:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // InternalXMachine.g:1477:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // InternalXMachine.g:1477:1: ( ( rule__Machine__Group_7__0 )? )
            // InternalXMachine.g:1478:2: ( rule__Machine__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_7()); 
            }
            // InternalXMachine.g:1479:2: ( rule__Machine__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==123) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:1479:3: rule__Machine__Group_7__0
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
    // InternalXMachine.g:1487:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1491:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // InternalXMachine.g:1492:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
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
    // InternalXMachine.g:1499:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__Group_8__0 )? ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1503:1: ( ( ( rule__Machine__Group_8__0 )? ) )
            // InternalXMachine.g:1504:1: ( ( rule__Machine__Group_8__0 )? )
            {
            // InternalXMachine.g:1504:1: ( ( rule__Machine__Group_8__0 )? )
            // InternalXMachine.g:1505:2: ( rule__Machine__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_8()); 
            }
            // InternalXMachine.g:1506:2: ( rule__Machine__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==124) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:1506:3: rule__Machine__Group_8__0
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
    // InternalXMachine.g:1514:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl rule__Machine__Group__10 ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1518:1: ( rule__Machine__Group__9__Impl rule__Machine__Group__10 )
            // InternalXMachine.g:1519:2: rule__Machine__Group__9__Impl rule__Machine__Group__10
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
    // InternalXMachine.g:1526:1: rule__Machine__Group__9__Impl : ( ( rule__Machine__Group_9__0 )? ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1530:1: ( ( ( rule__Machine__Group_9__0 )? ) )
            // InternalXMachine.g:1531:1: ( ( rule__Machine__Group_9__0 )? )
            {
            // InternalXMachine.g:1531:1: ( ( rule__Machine__Group_9__0 )? )
            // InternalXMachine.g:1532:2: ( rule__Machine__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_9()); 
            }
            // InternalXMachine.g:1533:2: ( rule__Machine__Group_9__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==125) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:1533:3: rule__Machine__Group_9__0
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
    // InternalXMachine.g:1541:1: rule__Machine__Group__10 : rule__Machine__Group__10__Impl ;
    public final void rule__Machine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1545:1: ( rule__Machine__Group__10__Impl )
            // InternalXMachine.g:1546:2: rule__Machine__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalXMachine.g:1552:1: rule__Machine__Group__10__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1556:1: ( ( 'end' ) )
            // InternalXMachine.g:1557:1: ( 'end' )
            {
            // InternalXMachine.g:1557:1: ( 'end' )
            // InternalXMachine.g:1558:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEndKeyword_10()); 
            }
            match(input,118,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEndKeyword_10()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Machine__Group_4_1__0"
    // InternalXMachine.g:1568:1: rule__Machine__Group_4_1__0 : rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1 ;
    public final void rule__Machine__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1572:1: ( rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1 )
            // InternalXMachine.g:1573:2: rule__Machine__Group_4_1__0__Impl rule__Machine__Group_4_1__1
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
    // InternalXMachine.g:1580:1: rule__Machine__Group_4_1__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1584:1: ( ( 'refines' ) )
            // InternalXMachine.g:1585:1: ( 'refines' )
            {
            // InternalXMachine.g:1585:1: ( 'refines' )
            // InternalXMachine.g:1586:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesKeyword_4_1_0()); 
            }
            match(input,119,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1595:1: rule__Machine__Group_4_1__1 : rule__Machine__Group_4_1__1__Impl ;
    public final void rule__Machine__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1599:1: ( rule__Machine__Group_4_1__1__Impl )
            // InternalXMachine.g:1600:2: rule__Machine__Group_4_1__1__Impl
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
    // InternalXMachine.g:1606:1: rule__Machine__Group_4_1__1__Impl : ( ( rule__Machine__RefinesAssignment_4_1_1 ) ) ;
    public final void rule__Machine__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1610:1: ( ( ( rule__Machine__RefinesAssignment_4_1_1 ) ) )
            // InternalXMachine.g:1611:1: ( ( rule__Machine__RefinesAssignment_4_1_1 ) )
            {
            // InternalXMachine.g:1611:1: ( ( rule__Machine__RefinesAssignment_4_1_1 ) )
            // InternalXMachine.g:1612:2: ( rule__Machine__RefinesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesAssignment_4_1_1()); 
            }
            // InternalXMachine.g:1613:2: ( rule__Machine__RefinesAssignment_4_1_1 )
            // InternalXMachine.g:1613:3: rule__Machine__RefinesAssignment_4_1_1
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
    // InternalXMachine.g:1622:1: rule__Machine__Group_4_2__0 : rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 ;
    public final void rule__Machine__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1626:1: ( rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 )
            // InternalXMachine.g:1627:2: rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1
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
    // InternalXMachine.g:1634:1: rule__Machine__Group_4_2__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1638:1: ( ( 'sees' ) )
            // InternalXMachine.g:1639:1: ( 'sees' )
            {
            // InternalXMachine.g:1639:1: ( 'sees' )
            // InternalXMachine.g:1640:2: 'sees'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesKeyword_4_2_0()); 
            }
            match(input,120,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1649:1: rule__Machine__Group_4_2__1 : rule__Machine__Group_4_2__1__Impl ;
    public final void rule__Machine__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1653:1: ( rule__Machine__Group_4_2__1__Impl )
            // InternalXMachine.g:1654:2: rule__Machine__Group_4_2__1__Impl
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
    // InternalXMachine.g:1660:1: rule__Machine__Group_4_2__1__Impl : ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) ) ;
    public final void rule__Machine__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1664:1: ( ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) ) )
            // InternalXMachine.g:1665:1: ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) )
            {
            // InternalXMachine.g:1665:1: ( ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* ) )
            // InternalXMachine.g:1666:2: ( ( rule__Machine__SeesAssignment_4_2_1 ) ) ( ( rule__Machine__SeesAssignment_4_2_1 )* )
            {
            // InternalXMachine.g:1666:2: ( ( rule__Machine__SeesAssignment_4_2_1 ) )
            // InternalXMachine.g:1667:3: ( rule__Machine__SeesAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }
            // InternalXMachine.g:1668:3: ( rule__Machine__SeesAssignment_4_2_1 )
            // InternalXMachine.g:1668:4: rule__Machine__SeesAssignment_4_2_1
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

            // InternalXMachine.g:1671:2: ( ( rule__Machine__SeesAssignment_4_2_1 )* )
            // InternalXMachine.g:1672:3: ( rule__Machine__SeesAssignment_4_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesAssignment_4_2_1()); 
            }
            // InternalXMachine.g:1673:3: ( rule__Machine__SeesAssignment_4_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXMachine.g:1673:4: rule__Machine__SeesAssignment_4_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__SeesAssignment_4_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalXMachine.g:1683:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1687:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:1688:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
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
    // InternalXMachine.g:1695:1: rule__Machine__Group_5__0__Impl : ( 'contains' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1699:1: ( ( 'contains' ) )
            // InternalXMachine.g:1700:1: ( 'contains' )
            {
            // InternalXMachine.g:1700:1: ( 'contains' )
            // InternalXMachine.g:1701:2: 'contains'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getContainsKeyword_5_0()); 
            }
            match(input,121,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1710:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1714:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:1715:2: rule__Machine__Group_5__1__Impl
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
    // InternalXMachine.g:1721:1: rule__Machine__Group_5__1__Impl : ( ( ( rule__Machine__ExtensionsAssignment_5_1 ) ) ( ( rule__Machine__ExtensionsAssignment_5_1 )* ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1725:1: ( ( ( ( rule__Machine__ExtensionsAssignment_5_1 ) ) ( ( rule__Machine__ExtensionsAssignment_5_1 )* ) ) )
            // InternalXMachine.g:1726:1: ( ( ( rule__Machine__ExtensionsAssignment_5_1 ) ) ( ( rule__Machine__ExtensionsAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:1726:1: ( ( ( rule__Machine__ExtensionsAssignment_5_1 ) ) ( ( rule__Machine__ExtensionsAssignment_5_1 )* ) )
            // InternalXMachine.g:1727:2: ( ( rule__Machine__ExtensionsAssignment_5_1 ) ) ( ( rule__Machine__ExtensionsAssignment_5_1 )* )
            {
            // InternalXMachine.g:1727:2: ( ( rule__Machine__ExtensionsAssignment_5_1 ) )
            // InternalXMachine.g:1728:3: ( rule__Machine__ExtensionsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsAssignment_5_1()); 
            }
            // InternalXMachine.g:1729:3: ( rule__Machine__ExtensionsAssignment_5_1 )
            // InternalXMachine.g:1729:4: rule__Machine__ExtensionsAssignment_5_1
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

            // InternalXMachine.g:1732:2: ( ( rule__Machine__ExtensionsAssignment_5_1 )* )
            // InternalXMachine.g:1733:3: ( rule__Machine__ExtensionsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getExtensionsAssignment_5_1()); 
            }
            // InternalXMachine.g:1734:3: ( rule__Machine__ExtensionsAssignment_5_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXMachine.g:1734:4: rule__Machine__ExtensionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__ExtensionsAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalXMachine.g:1744:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1748:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalXMachine.g:1749:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
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
    // InternalXMachine.g:1756:1: rule__Machine__Group_6__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1760:1: ( ( 'variables' ) )
            // InternalXMachine.g:1761:1: ( 'variables' )
            {
            // InternalXMachine.g:1761:1: ( 'variables' )
            // InternalXMachine.g:1762:2: 'variables'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesKeyword_6_0()); 
            }
            match(input,122,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:1771:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1775:1: ( rule__Machine__Group_6__1__Impl )
            // InternalXMachine.g:1776:2: rule__Machine__Group_6__1__Impl
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
    // InternalXMachine.g:1782:1: rule__Machine__Group_6__1__Impl : ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1786:1: ( ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) ) )
            // InternalXMachine.g:1787:1: ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:1787:1: ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* ) )
            // InternalXMachine.g:1788:2: ( ( rule__Machine__VariablesAssignment_6_1 ) ) ( ( rule__Machine__VariablesAssignment_6_1 )* )
            {
            // InternalXMachine.g:1788:2: ( ( rule__Machine__VariablesAssignment_6_1 ) )
            // InternalXMachine.g:1789:3: ( rule__Machine__VariablesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
            }
            // InternalXMachine.g:1790:3: ( rule__Machine__VariablesAssignment_6_1 )
            // InternalXMachine.g:1790:4: rule__Machine__VariablesAssignment_6_1
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

            // InternalXMachine.g:1793:2: ( ( rule__Machine__VariablesAssignment_6_1 )* )
            // InternalXMachine.g:1794:3: ( rule__Machine__VariablesAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
            }
            // InternalXMachine.g:1795:3: ( rule__Machine__VariablesAssignment_6_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXMachine.g:1795:4: rule__Machine__VariablesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__VariablesAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalXMachine.g:1805:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1809:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:1810:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
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
    // InternalXMachine.g:1817:1: rule__Machine__Group_7__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1821:1: ( ( 'invariants' ) )
            // InternalXMachine.g:1822:1: ( 'invariants' )
            {
            // InternalXMachine.g:1822:1: ( 'invariants' )
            // InternalXMachine.g:1823:2: 'invariants'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsKeyword_7_0()); 
            }
            match(input,123,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsKeyword_7_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:1832:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1836:1: ( rule__Machine__Group_7__1__Impl )
            // InternalXMachine.g:1837:2: rule__Machine__Group_7__1__Impl
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
    // InternalXMachine.g:1843:1: rule__Machine__Group_7__1__Impl : ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ( ( rule__Machine__InvariantsAssignment_7_1 )* ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1847:1: ( ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ( ( rule__Machine__InvariantsAssignment_7_1 )* ) ) )
            // InternalXMachine.g:1848:1: ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ( ( rule__Machine__InvariantsAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:1848:1: ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ( ( rule__Machine__InvariantsAssignment_7_1 )* ) )
            // InternalXMachine.g:1849:2: ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ( ( rule__Machine__InvariantsAssignment_7_1 )* )
            {
            // InternalXMachine.g:1849:2: ( ( rule__Machine__InvariantsAssignment_7_1 ) )
            // InternalXMachine.g:1850:3: ( rule__Machine__InvariantsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 
            }
            // InternalXMachine.g:1851:3: ( rule__Machine__InvariantsAssignment_7_1 )
            // InternalXMachine.g:1851:4: rule__Machine__InvariantsAssignment_7_1
            {
            pushFollow(FOLLOW_10);
            rule__Machine__InvariantsAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 
            }

            }

            // InternalXMachine.g:1854:2: ( ( rule__Machine__InvariantsAssignment_7_1 )* )
            // InternalXMachine.g:1855:3: ( rule__Machine__InvariantsAssignment_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 
            }
            // InternalXMachine.g:1856:3: ( rule__Machine__InvariantsAssignment_7_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_XLABEL||LA20_0==135) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXMachine.g:1856:4: rule__Machine__InvariantsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Machine__InvariantsAssignment_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 
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
    // InternalXMachine.g:1866:1: rule__Machine__Group_8__0 : rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 ;
    public final void rule__Machine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1870:1: ( rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 )
            // InternalXMachine.g:1871:2: rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1
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
    // InternalXMachine.g:1878:1: rule__Machine__Group_8__0__Impl : ( 'variants' ) ;
    public final void rule__Machine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1882:1: ( ( 'variants' ) )
            // InternalXMachine.g:1883:1: ( 'variants' )
            {
            // InternalXMachine.g:1883:1: ( 'variants' )
            // InternalXMachine.g:1884:2: 'variants'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsKeyword_8_0()); 
            }
            match(input,124,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsKeyword_8_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:1893:1: rule__Machine__Group_8__1 : rule__Machine__Group_8__1__Impl ;
    public final void rule__Machine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1897:1: ( rule__Machine__Group_8__1__Impl )
            // InternalXMachine.g:1898:2: rule__Machine__Group_8__1__Impl
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
    // InternalXMachine.g:1904:1: rule__Machine__Group_8__1__Impl : ( ( ( rule__Machine__VariantsAssignment_8_1 ) ) ( ( rule__Machine__VariantsAssignment_8_1 )* ) ) ;
    public final void rule__Machine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1908:1: ( ( ( ( rule__Machine__VariantsAssignment_8_1 ) ) ( ( rule__Machine__VariantsAssignment_8_1 )* ) ) )
            // InternalXMachine.g:1909:1: ( ( ( rule__Machine__VariantsAssignment_8_1 ) ) ( ( rule__Machine__VariantsAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:1909:1: ( ( ( rule__Machine__VariantsAssignment_8_1 ) ) ( ( rule__Machine__VariantsAssignment_8_1 )* ) )
            // InternalXMachine.g:1910:2: ( ( rule__Machine__VariantsAssignment_8_1 ) ) ( ( rule__Machine__VariantsAssignment_8_1 )* )
            {
            // InternalXMachine.g:1910:2: ( ( rule__Machine__VariantsAssignment_8_1 ) )
            // InternalXMachine.g:1911:3: ( rule__Machine__VariantsAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsAssignment_8_1()); 
            }
            // InternalXMachine.g:1912:3: ( rule__Machine__VariantsAssignment_8_1 )
            // InternalXMachine.g:1912:4: rule__Machine__VariantsAssignment_8_1
            {
            pushFollow(FOLLOW_12);
            rule__Machine__VariantsAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsAssignment_8_1()); 
            }

            }

            // InternalXMachine.g:1915:2: ( ( rule__Machine__VariantsAssignment_8_1 )* )
            // InternalXMachine.g:1916:3: ( rule__Machine__VariantsAssignment_8_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsAssignment_8_1()); 
            }
            // InternalXMachine.g:1917:3: ( rule__Machine__VariantsAssignment_8_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_XLABEL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXMachine.g:1917:4: rule__Machine__VariantsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Machine__VariantsAssignment_8_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsAssignment_8_1()); 
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
    // InternalXMachine.g:1927:1: rule__Machine__Group_9__0 : rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 ;
    public final void rule__Machine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1931:1: ( rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 )
            // InternalXMachine.g:1932:2: rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1
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
    // InternalXMachine.g:1939:1: rule__Machine__Group_9__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1943:1: ( ( 'events' ) )
            // InternalXMachine.g:1944:1: ( 'events' )
            {
            // InternalXMachine.g:1944:1: ( 'events' )
            // InternalXMachine.g:1945:2: 'events'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsKeyword_9_0()); 
            }
            match(input,125,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsKeyword_9_0()); 
            }

            }


            }

        }
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
    // InternalXMachine.g:1954:1: rule__Machine__Group_9__1 : rule__Machine__Group_9__1__Impl ;
    public final void rule__Machine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1958:1: ( rule__Machine__Group_9__1__Impl )
            // InternalXMachine.g:1959:2: rule__Machine__Group_9__1__Impl
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
    // InternalXMachine.g:1965:1: rule__Machine__Group_9__1__Impl : ( ( ( rule__Machine__EventsAssignment_9_1 ) ) ( ( rule__Machine__EventsAssignment_9_1 )* ) ) ;
    public final void rule__Machine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1969:1: ( ( ( ( rule__Machine__EventsAssignment_9_1 ) ) ( ( rule__Machine__EventsAssignment_9_1 )* ) ) )
            // InternalXMachine.g:1970:1: ( ( ( rule__Machine__EventsAssignment_9_1 ) ) ( ( rule__Machine__EventsAssignment_9_1 )* ) )
            {
            // InternalXMachine.g:1970:1: ( ( ( rule__Machine__EventsAssignment_9_1 ) ) ( ( rule__Machine__EventsAssignment_9_1 )* ) )
            // InternalXMachine.g:1971:2: ( ( rule__Machine__EventsAssignment_9_1 ) ) ( ( rule__Machine__EventsAssignment_9_1 )* )
            {
            // InternalXMachine.g:1971:2: ( ( rule__Machine__EventsAssignment_9_1 ) )
            // InternalXMachine.g:1972:3: ( rule__Machine__EventsAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 
            }
            // InternalXMachine.g:1973:3: ( rule__Machine__EventsAssignment_9_1 )
            // InternalXMachine.g:1973:4: rule__Machine__EventsAssignment_9_1
            {
            pushFollow(FOLLOW_14);
            rule__Machine__EventsAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 
            }

            }

            // InternalXMachine.g:1976:2: ( ( rule__Machine__EventsAssignment_9_1 )* )
            // InternalXMachine.g:1977:3: ( rule__Machine__EventsAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 
            }
            // InternalXMachine.g:1978:3: ( rule__Machine__EventsAssignment_9_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=114 && LA22_0<=116)||LA22_0==129) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXMachine.g:1978:4: rule__Machine__EventsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Machine__EventsAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 
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


    // $ANTLR start "rule__MContains__Group__0"
    // InternalXMachine.g:1988:1: rule__MContains__Group__0 : rule__MContains__Group__0__Impl rule__MContains__Group__1 ;
    public final void rule__MContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1992:1: ( rule__MContains__Group__0__Impl rule__MContains__Group__1 )
            // InternalXMachine.g:1993:2: rule__MContains__Group__0__Impl rule__MContains__Group__1
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
    // InternalXMachine.g:2000:1: rule__MContains__Group__0__Impl : ( () ) ;
    public final void rule__MContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2004:1: ( ( () ) )
            // InternalXMachine.g:2005:1: ( () )
            {
            // InternalXMachine.g:2005:1: ( () )
            // InternalXMachine.g:2006:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getContainmentAction_0()); 
            }
            // InternalXMachine.g:2007:2: ()
            // InternalXMachine.g:2007:3: 
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
    // InternalXMachine.g:2015:1: rule__MContains__Group__1 : rule__MContains__Group__1__Impl rule__MContains__Group__2 ;
    public final void rule__MContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2019:1: ( rule__MContains__Group__1__Impl rule__MContains__Group__2 )
            // InternalXMachine.g:2020:2: rule__MContains__Group__1__Impl rule__MContains__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXMachine.g:2027:1: rule__MContains__Group__1__Impl : ( ( rule__MContains__NameAssignment_1 ) ) ;
    public final void rule__MContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2031:1: ( ( ( rule__MContains__NameAssignment_1 ) ) )
            // InternalXMachine.g:2032:1: ( ( rule__MContains__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2032:1: ( ( rule__MContains__NameAssignment_1 ) )
            // InternalXMachine.g:2033:2: ( rule__MContains__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:2034:2: ( rule__MContains__NameAssignment_1 )
            // InternalXMachine.g:2034:3: rule__MContains__NameAssignment_1
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
    // InternalXMachine.g:2042:1: rule__MContains__Group__2 : rule__MContains__Group__2__Impl rule__MContains__Group__3 ;
    public final void rule__MContains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2046:1: ( rule__MContains__Group__2__Impl rule__MContains__Group__3 )
            // InternalXMachine.g:2047:2: rule__MContains__Group__2__Impl rule__MContains__Group__3
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
    // InternalXMachine.g:2054:1: rule__MContains__Group__2__Impl : ( ':' ) ;
    public final void rule__MContains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2058:1: ( ( ':' ) )
            // InternalXMachine.g:2059:1: ( ':' )
            {
            // InternalXMachine.g:2059:1: ( ':' )
            // InternalXMachine.g:2060:2: ':'
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
    // InternalXMachine.g:2069:1: rule__MContains__Group__3 : rule__MContains__Group__3__Impl ;
    public final void rule__MContains__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2073:1: ( rule__MContains__Group__3__Impl )
            // InternalXMachine.g:2074:2: rule__MContains__Group__3__Impl
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
    // InternalXMachine.g:2080:1: rule__MContains__Group__3__Impl : ( ( rule__MContains__ExtensionAssignment_3 ) ) ;
    public final void rule__MContains__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2084:1: ( ( ( rule__MContains__ExtensionAssignment_3 ) ) )
            // InternalXMachine.g:2085:1: ( ( rule__MContains__ExtensionAssignment_3 ) )
            {
            // InternalXMachine.g:2085:1: ( ( rule__MContains__ExtensionAssignment_3 ) )
            // InternalXMachine.g:2086:2: ( rule__MContains__ExtensionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionAssignment_3()); 
            }
            // InternalXMachine.g:2087:2: ( rule__MContains__ExtensionAssignment_3 )
            // InternalXMachine.g:2087:3: rule__MContains__ExtensionAssignment_3
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
    // InternalXMachine.g:2096:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2100:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:2101:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
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
    // InternalXMachine.g:2108:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2112:1: ( ( () ) )
            // InternalXMachine.g:2113:1: ( () )
            {
            // InternalXMachine.g:2113:1: ( () )
            // InternalXMachine.g:2114:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            }
            // InternalXMachine.g:2115:2: ()
            // InternalXMachine.g:2115:3: 
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
    // InternalXMachine.g:2123:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2127:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:2128:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
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
    // InternalXMachine.g:2135:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2139:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:2140:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:2140:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:2141:2: ( rule__MIncludes__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2142:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:2142:3: rule__MIncludes__Group_1__0
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
    // InternalXMachine.g:2150:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2154:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:2155:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
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
    // InternalXMachine.g:2162:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2166:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:2167:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:2167:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:2168:2: ( rule__MIncludes__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            }
            // InternalXMachine.g:2169:2: ( rule__MIncludes__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==127) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXMachine.g:2169:3: rule__MIncludes__Group_2__0
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
    // InternalXMachine.g:2177:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2181:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:2182:2: rule__MIncludes__Group__3__Impl
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
    // InternalXMachine.g:2188:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2192:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:2193:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:2193:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:2194:2: ( rule__MIncludes__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            }
            // InternalXMachine.g:2195:2: ( rule__MIncludes__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==128) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:2195:3: rule__MIncludes__Group_3__0
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
    // InternalXMachine.g:2204:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2208:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:2209:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
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
    // InternalXMachine.g:2216:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2220:1: ( ( 'includes' ) )
            // InternalXMachine.g:2221:1: ( 'includes' )
            {
            // InternalXMachine.g:2221:1: ( 'includes' )
            // InternalXMachine.g:2222:2: 'includes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            }
            match(input,126,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2231:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2235:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:2236:2: rule__MIncludes__Group_1__1__Impl
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
    // InternalXMachine.g:2242:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2246:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:2247:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:2247:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:2248:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            }
            // InternalXMachine.g:2249:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:2249:3: rule__MIncludes__AbstractMachineAssignment_1_1
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
    // InternalXMachine.g:2258:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2262:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:2263:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
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
    // InternalXMachine.g:2270:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2274:1: ( ( 'to' ) )
            // InternalXMachine.g:2275:1: ( 'to' )
            {
            // InternalXMachine.g:2275:1: ( 'to' )
            // InternalXMachine.g:2276:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            }
            match(input,127,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2285:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2289:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:2290:2: rule__MIncludes__Group_2__1__Impl
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
    // InternalXMachine.g:2296:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2300:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:2301:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:2301:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:2302:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            }
            // InternalXMachine.g:2303:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:2303:3: rule__MIncludes__ConcreteMachineAssignment_2_1
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
    // InternalXMachine.g:2312:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2316:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:2317:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
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
    // InternalXMachine.g:2324:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2328:1: ( ( 'as' ) )
            // InternalXMachine.g:2329:1: ( 'as' )
            {
            // InternalXMachine.g:2329:1: ( 'as' )
            // InternalXMachine.g:2330:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            }
            match(input,128,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2339:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2343:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:2344:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
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
    // InternalXMachine.g:2351:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2355:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:2356:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:2356:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:2357:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            }
            // InternalXMachine.g:2358:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:2358:3: rule__MIncludes__PrefixesAssignment_3_1
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
    // InternalXMachine.g:2366:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2370:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:2371:2: rule__MIncludes__Group_3__2__Impl
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
    // InternalXMachine.g:2377:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2381:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:2382:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:2382:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:2383:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            }
            // InternalXMachine.g:2384:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXMachine.g:2384:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MIncludes__PrefixesAssignment_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalXMachine.g:2393:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2397:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:2398:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalXMachine.g:2405:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2409:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2410:1: ( RULE_ID )
            {
            // InternalXMachine.g:2410:1: ( RULE_ID )
            // InternalXMachine.g:2411:2: RULE_ID
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
    // InternalXMachine.g:2420:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2424:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:2425:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXMachine.g:2431:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2435:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:2436:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:2436:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:2437:2: ( rule__QualifiedName__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalXMachine.g:2438:2: ( rule__QualifiedName__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXMachine.g:2438:3: rule__QualifiedName__Group_1__0
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
    // InternalXMachine.g:2447:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2451:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:2452:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXMachine.g:2459:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2463:1: ( ( '.' ) )
            // InternalXMachine.g:2464:1: ( '.' )
            {
            // InternalXMachine.g:2464:1: ( '.' )
            // InternalXMachine.g:2465:2: '.'
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
    // InternalXMachine.g:2474:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2478:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:2479:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXMachine.g:2485:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2489:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2490:1: ( RULE_ID )
            {
            // InternalXMachine.g:2490:1: ( RULE_ID )
            // InternalXMachine.g:2491:2: RULE_ID
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
    // InternalXMachine.g:2501:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2505:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:2506:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
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
    // InternalXMachine.g:2513:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2517:1: ( ( () ) )
            // InternalXMachine.g:2518:1: ( () )
            {
            // InternalXMachine.g:2518:1: ( () )
            // InternalXMachine.g:2519:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            }
            // InternalXMachine.g:2520:2: ()
            // InternalXMachine.g:2520:3: 
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
    // InternalXMachine.g:2528:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2532:1: ( rule__XVariable__Group__1__Impl )
            // InternalXMachine.g:2533:2: rule__XVariable__Group__1__Impl
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
    // InternalXMachine.g:2539:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__NameAssignment_1 ) ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2543:1: ( ( ( rule__XVariable__NameAssignment_1 ) ) )
            // InternalXMachine.g:2544:1: ( ( rule__XVariable__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2544:1: ( ( rule__XVariable__NameAssignment_1 ) )
            // InternalXMachine.g:2545:2: ( rule__XVariable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:2546:2: ( rule__XVariable__NameAssignment_1 )
            // InternalXMachine.g:2546:3: rule__XVariable__NameAssignment_1
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
    // InternalXMachine.g:2555:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2559:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:2560:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalXMachine.g:2567:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2571:1: ( ( () ) )
            // InternalXMachine.g:2572:1: ( () )
            {
            // InternalXMachine.g:2572:1: ( () )
            // InternalXMachine.g:2573:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            }
            // InternalXMachine.g:2574:2: ()
            // InternalXMachine.g:2574:3: 
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
    // InternalXMachine.g:2582:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2586:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:2587:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalXMachine.g:2594:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__TheoremAssignment_1 )? ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2598:1: ( ( ( rule__XInvariant__TheoremAssignment_1 )? ) )
            // InternalXMachine.g:2599:1: ( ( rule__XInvariant__TheoremAssignment_1 )? )
            {
            // InternalXMachine.g:2599:1: ( ( rule__XInvariant__TheoremAssignment_1 )? )
            // InternalXMachine.g:2600:2: ( rule__XInvariant__TheoremAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremAssignment_1()); 
            }
            // InternalXMachine.g:2601:2: ( rule__XInvariant__TheoremAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==135) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:2601:3: rule__XInvariant__TheoremAssignment_1
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
    // InternalXMachine.g:2609:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2613:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:2614:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2621:1: rule__XInvariant__Group__2__Impl : ( ( rule__XInvariant__NameAssignment_2 ) ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2625:1: ( ( ( rule__XInvariant__NameAssignment_2 ) ) )
            // InternalXMachine.g:2626:1: ( ( rule__XInvariant__NameAssignment_2 ) )
            {
            // InternalXMachine.g:2626:1: ( ( rule__XInvariant__NameAssignment_2 ) )
            // InternalXMachine.g:2627:2: ( rule__XInvariant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:2628:2: ( rule__XInvariant__NameAssignment_2 )
            // InternalXMachine.g:2628:3: rule__XInvariant__NameAssignment_2
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
    // InternalXMachine.g:2636:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2640:1: ( rule__XInvariant__Group__3__Impl )
            // InternalXMachine.g:2641:2: rule__XInvariant__Group__3__Impl
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
    // InternalXMachine.g:2647:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__PredicateAssignment_3 ) ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2651:1: ( ( ( rule__XInvariant__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:2652:1: ( ( rule__XInvariant__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:2652:1: ( ( rule__XInvariant__PredicateAssignment_3 ) )
            // InternalXMachine.g:2653:2: ( rule__XInvariant__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:2654:2: ( rule__XInvariant__PredicateAssignment_3 )
            // InternalXMachine.g:2654:3: rule__XInvariant__PredicateAssignment_3
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
    // InternalXMachine.g:2663:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2667:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:2668:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalXMachine.g:2675:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2679:1: ( ( () ) )
            // InternalXMachine.g:2680:1: ( () )
            {
            // InternalXMachine.g:2680:1: ( () )
            // InternalXMachine.g:2681:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            }
            // InternalXMachine.g:2682:2: ()
            // InternalXMachine.g:2682:3: 
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
    // InternalXMachine.g:2690:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl rule__XVariant__Group__2 ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2694:1: ( rule__XVariant__Group__1__Impl rule__XVariant__Group__2 )
            // InternalXMachine.g:2695:2: rule__XVariant__Group__1__Impl rule__XVariant__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:2702:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__NameAssignment_1 ) ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2706:1: ( ( ( rule__XVariant__NameAssignment_1 ) ) )
            // InternalXMachine.g:2707:1: ( ( rule__XVariant__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2707:1: ( ( rule__XVariant__NameAssignment_1 ) )
            // InternalXMachine.g:2708:2: ( rule__XVariant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:2709:2: ( rule__XVariant__NameAssignment_1 )
            // InternalXMachine.g:2709:3: rule__XVariant__NameAssignment_1
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
    // InternalXMachine.g:2717:1: rule__XVariant__Group__2 : rule__XVariant__Group__2__Impl ;
    public final void rule__XVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2721:1: ( rule__XVariant__Group__2__Impl )
            // InternalXMachine.g:2722:2: rule__XVariant__Group__2__Impl
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
    // InternalXMachine.g:2728:1: rule__XVariant__Group__2__Impl : ( ( rule__XVariant__ExpressionAssignment_2 ) ) ;
    public final void rule__XVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2732:1: ( ( ( rule__XVariant__ExpressionAssignment_2 ) ) )
            // InternalXMachine.g:2733:1: ( ( rule__XVariant__ExpressionAssignment_2 ) )
            {
            // InternalXMachine.g:2733:1: ( ( rule__XVariant__ExpressionAssignment_2 ) )
            // InternalXMachine.g:2734:2: ( rule__XVariant__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXVariantAccess().getExpressionAssignment_2()); 
            }
            // InternalXMachine.g:2735:2: ( rule__XVariant__ExpressionAssignment_2 )
            // InternalXMachine.g:2735:3: rule__XVariant__ExpressionAssignment_2
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
    // InternalXMachine.g:2744:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2748:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:2749:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXMachine.g:2756:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2760:1: ( ( () ) )
            // InternalXMachine.g:2761:1: ( () )
            {
            // InternalXMachine.g:2761:1: ( () )
            // InternalXMachine.g:2762:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventAction_0()); 
            }
            // InternalXMachine.g:2763:2: ()
            // InternalXMachine.g:2763:3: 
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
    // InternalXMachine.g:2771:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2775:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:2776:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalXMachine.g:2783:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__ConvergenceAssignment_1 )? ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2787:1: ( ( ( rule__XEvent__ConvergenceAssignment_1 )? ) )
            // InternalXMachine.g:2788:1: ( ( rule__XEvent__ConvergenceAssignment_1 )? )
            {
            // InternalXMachine.g:2788:1: ( ( rule__XEvent__ConvergenceAssignment_1 )? )
            // InternalXMachine.g:2789:2: ( rule__XEvent__ConvergenceAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getConvergenceAssignment_1()); 
            }
            // InternalXMachine.g:2790:2: ( rule__XEvent__ConvergenceAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=114 && LA28_0<=116)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:2790:3: rule__XEvent__ConvergenceAssignment_1
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
    // InternalXMachine.g:2798:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2802:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:2803:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
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
    // InternalXMachine.g:2810:1: rule__XEvent__Group__2__Impl : ( 'event' ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2814:1: ( ( 'event' ) )
            // InternalXMachine.g:2815:1: ( 'event' )
            {
            // InternalXMachine.g:2815:1: ( 'event' )
            // InternalXMachine.g:2816:2: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEventKeyword_2()); 
            }
            match(input,129,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:2825:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2829:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:2830:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2837:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__NameAssignment_3 ) ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2841:1: ( ( ( rule__XEvent__NameAssignment_3 ) ) )
            // InternalXMachine.g:2842:1: ( ( rule__XEvent__NameAssignment_3 ) )
            {
            // InternalXMachine.g:2842:1: ( ( rule__XEvent__NameAssignment_3 ) )
            // InternalXMachine.g:2843:2: ( rule__XEvent__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getNameAssignment_3()); 
            }
            // InternalXMachine.g:2844:2: ( rule__XEvent__NameAssignment_3 )
            // InternalXMachine.g:2844:3: rule__XEvent__NameAssignment_3
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
    // InternalXMachine.g:2852:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2856:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:2857:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2864:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__Alternatives_4 )? ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2868:1: ( ( ( rule__XEvent__Alternatives_4 )? ) )
            // InternalXMachine.g:2869:1: ( ( rule__XEvent__Alternatives_4 )? )
            {
            // InternalXMachine.g:2869:1: ( ( rule__XEvent__Alternatives_4 )? )
            // InternalXMachine.g:2870:2: ( rule__XEvent__Alternatives_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_4()); 
            }
            // InternalXMachine.g:2871:2: ( rule__XEvent__Alternatives_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==119||LA29_0==136) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXMachine.g:2871:3: rule__XEvent__Alternatives_4
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
    // InternalXMachine.g:2879:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2883:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:2884:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2891:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Group_5__0 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2895:1: ( ( ( rule__XEvent__Group_5__0 )? ) )
            // InternalXMachine.g:2896:1: ( ( rule__XEvent__Group_5__0 )? )
            {
            // InternalXMachine.g:2896:1: ( ( rule__XEvent__Group_5__0 )? )
            // InternalXMachine.g:2897:2: ( rule__XEvent__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_5()); 
            }
            // InternalXMachine.g:2898:2: ( rule__XEvent__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==130) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:2898:3: rule__XEvent__Group_5__0
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
    // InternalXMachine.g:2906:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl rule__XEvent__Group__7 ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2910:1: ( rule__XEvent__Group__6__Impl rule__XEvent__Group__7 )
            // InternalXMachine.g:2911:2: rule__XEvent__Group__6__Impl rule__XEvent__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2918:1: rule__XEvent__Group__6__Impl : ( ( rule__XEvent__ExtensionsAssignment_6 )* ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2922:1: ( ( ( rule__XEvent__ExtensionsAssignment_6 )* ) )
            // InternalXMachine.g:2923:1: ( ( rule__XEvent__ExtensionsAssignment_6 )* )
            {
            // InternalXMachine.g:2923:1: ( ( rule__XEvent__ExtensionsAssignment_6 )* )
            // InternalXMachine.g:2924:2: ( rule__XEvent__ExtensionsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtensionsAssignment_6()); 
            }
            // InternalXMachine.g:2925:2: ( rule__XEvent__ExtensionsAssignment_6 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==132) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXMachine.g:2925:3: rule__XEvent__ExtensionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__XEvent__ExtensionsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalXMachine.g:2933:1: rule__XEvent__Group__7 : rule__XEvent__Group__7__Impl rule__XEvent__Group__8 ;
    public final void rule__XEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2937:1: ( rule__XEvent__Group__7__Impl rule__XEvent__Group__8 )
            // InternalXMachine.g:2938:2: rule__XEvent__Group__7__Impl rule__XEvent__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2945:1: rule__XEvent__Group__7__Impl : ( ( rule__XEvent__Group_7__0 )? ) ;
    public final void rule__XEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2949:1: ( ( ( rule__XEvent__Group_7__0 )? ) )
            // InternalXMachine.g:2950:1: ( ( rule__XEvent__Group_7__0 )? )
            {
            // InternalXMachine.g:2950:1: ( ( rule__XEvent__Group_7__0 )? )
            // InternalXMachine.g:2951:2: ( rule__XEvent__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_7()); 
            }
            // InternalXMachine.g:2952:2: ( rule__XEvent__Group_7__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=12 && LA32_0<=13)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXMachine.g:2952:3: rule__XEvent__Group_7__0
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
    // InternalXMachine.g:2960:1: rule__XEvent__Group__8 : rule__XEvent__Group__8__Impl rule__XEvent__Group__9 ;
    public final void rule__XEvent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2964:1: ( rule__XEvent__Group__8__Impl rule__XEvent__Group__9 )
            // InternalXMachine.g:2965:2: rule__XEvent__Group__8__Impl rule__XEvent__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2972:1: rule__XEvent__Group__8__Impl : ( ( rule__XEvent__Group_8__0 )? ) ;
    public final void rule__XEvent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2976:1: ( ( ( rule__XEvent__Group_8__0 )? ) )
            // InternalXMachine.g:2977:1: ( ( rule__XEvent__Group_8__0 )? )
            {
            // InternalXMachine.g:2977:1: ( ( rule__XEvent__Group_8__0 )? )
            // InternalXMachine.g:2978:2: ( rule__XEvent__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_8()); 
            }
            // InternalXMachine.g:2979:2: ( rule__XEvent__Group_8__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=14 && LA33_0<=15)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXMachine.g:2979:3: rule__XEvent__Group_8__0
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
    // InternalXMachine.g:2987:1: rule__XEvent__Group__9 : rule__XEvent__Group__9__Impl rule__XEvent__Group__10 ;
    public final void rule__XEvent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2991:1: ( rule__XEvent__Group__9__Impl rule__XEvent__Group__10 )
            // InternalXMachine.g:2992:2: rule__XEvent__Group__9__Impl rule__XEvent__Group__10
            {
            pushFollow(FOLLOW_20);
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
    // InternalXMachine.g:2999:1: rule__XEvent__Group__9__Impl : ( ( rule__XEvent__Group_9__0 )? ) ;
    public final void rule__XEvent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3003:1: ( ( ( rule__XEvent__Group_9__0 )? ) )
            // InternalXMachine.g:3004:1: ( ( rule__XEvent__Group_9__0 )? )
            {
            // InternalXMachine.g:3004:1: ( ( rule__XEvent__Group_9__0 )? )
            // InternalXMachine.g:3005:2: ( rule__XEvent__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGroup_9()); 
            }
            // InternalXMachine.g:3006:2: ( rule__XEvent__Group_9__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==131) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXMachine.g:3006:3: rule__XEvent__Group_9__0
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
    // InternalXMachine.g:3014:1: rule__XEvent__Group__10 : rule__XEvent__Group__10__Impl ;
    public final void rule__XEvent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3018:1: ( rule__XEvent__Group__10__Impl )
            // InternalXMachine.g:3019:2: rule__XEvent__Group__10__Impl
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
    // InternalXMachine.g:3025:1: rule__XEvent__Group__10__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3029:1: ( ( 'end' ) )
            // InternalXMachine.g:3030:1: ( 'end' )
            {
            // InternalXMachine.g:3030:1: ( 'end' )
            // InternalXMachine.g:3031:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getEndKeyword_10()); 
            }
            match(input,118,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3041:1: rule__XEvent__Group_4_0__0 : rule__XEvent__Group_4_0__0__Impl rule__XEvent__Group_4_0__1 ;
    public final void rule__XEvent__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3045:1: ( rule__XEvent__Group_4_0__0__Impl rule__XEvent__Group_4_0__1 )
            // InternalXMachine.g:3046:2: rule__XEvent__Group_4_0__0__Impl rule__XEvent__Group_4_0__1
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
    // InternalXMachine.g:3053:1: rule__XEvent__Group_4_0__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3057:1: ( ( 'refines' ) )
            // InternalXMachine.g:3058:1: ( 'refines' )
            {
            // InternalXMachine.g:3058:1: ( 'refines' )
            // InternalXMachine.g:3059:2: 'refines'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesKeyword_4_0_0()); 
            }
            match(input,119,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3068:1: rule__XEvent__Group_4_0__1 : rule__XEvent__Group_4_0__1__Impl ;
    public final void rule__XEvent__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3072:1: ( rule__XEvent__Group_4_0__1__Impl )
            // InternalXMachine.g:3073:2: rule__XEvent__Group_4_0__1__Impl
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
    // InternalXMachine.g:3079:1: rule__XEvent__Group_4_0__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) ) ;
    public final void rule__XEvent__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3083:1: ( ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) ) )
            // InternalXMachine.g:3084:1: ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) )
            {
            // InternalXMachine.g:3084:1: ( ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* ) )
            // InternalXMachine.g:3085:2: ( ( rule__XEvent__RefinesAssignment_4_0_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_0_1 )* )
            {
            // InternalXMachine.g:3085:2: ( ( rule__XEvent__RefinesAssignment_4_0_1 ) )
            // InternalXMachine.g:3086:3: ( rule__XEvent__RefinesAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_4_0_1()); 
            }
            // InternalXMachine.g:3087:3: ( rule__XEvent__RefinesAssignment_4_0_1 )
            // InternalXMachine.g:3087:4: rule__XEvent__RefinesAssignment_4_0_1
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

            // InternalXMachine.g:3090:2: ( ( rule__XEvent__RefinesAssignment_4_0_1 )* )
            // InternalXMachine.g:3091:3: ( rule__XEvent__RefinesAssignment_4_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_4_0_1()); 
            }
            // InternalXMachine.g:3092:3: ( rule__XEvent__RefinesAssignment_4_0_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXMachine.g:3092:4: rule__XEvent__RefinesAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__RefinesAssignment_4_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalXMachine.g:3102:1: rule__XEvent__Group_4_1__0 : rule__XEvent__Group_4_1__0__Impl rule__XEvent__Group_4_1__1 ;
    public final void rule__XEvent__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3106:1: ( rule__XEvent__Group_4_1__0__Impl rule__XEvent__Group_4_1__1 )
            // InternalXMachine.g:3107:2: rule__XEvent__Group_4_1__0__Impl rule__XEvent__Group_4_1__1
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
    // InternalXMachine.g:3114:1: rule__XEvent__Group_4_1__0__Impl : ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) ) ;
    public final void rule__XEvent__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3118:1: ( ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) ) )
            // InternalXMachine.g:3119:1: ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) )
            {
            // InternalXMachine.g:3119:1: ( ( rule__XEvent__ExtendedAssignment_4_1_0 ) )
            // InternalXMachine.g:3120:2: ( rule__XEvent__ExtendedAssignment_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedAssignment_4_1_0()); 
            }
            // InternalXMachine.g:3121:2: ( rule__XEvent__ExtendedAssignment_4_1_0 )
            // InternalXMachine.g:3121:3: rule__XEvent__ExtendedAssignment_4_1_0
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
    // InternalXMachine.g:3129:1: rule__XEvent__Group_4_1__1 : rule__XEvent__Group_4_1__1__Impl ;
    public final void rule__XEvent__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3133:1: ( rule__XEvent__Group_4_1__1__Impl )
            // InternalXMachine.g:3134:2: rule__XEvent__Group_4_1__1__Impl
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
    // InternalXMachine.g:3140:1: rule__XEvent__Group_4_1__1__Impl : ( ( rule__XEvent__RefinesAssignment_4_1_1 ) ) ;
    public final void rule__XEvent__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3144:1: ( ( ( rule__XEvent__RefinesAssignment_4_1_1 ) ) )
            // InternalXMachine.g:3145:1: ( ( rule__XEvent__RefinesAssignment_4_1_1 ) )
            {
            // InternalXMachine.g:3145:1: ( ( rule__XEvent__RefinesAssignment_4_1_1 ) )
            // InternalXMachine.g:3146:2: ( rule__XEvent__RefinesAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1_1()); 
            }
            // InternalXMachine.g:3147:2: ( rule__XEvent__RefinesAssignment_4_1_1 )
            // InternalXMachine.g:3147:3: rule__XEvent__RefinesAssignment_4_1_1
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
    // InternalXMachine.g:3156:1: rule__XEvent__Group_5__0 : rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 ;
    public final void rule__XEvent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3160:1: ( rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1 )
            // InternalXMachine.g:3161:2: rule__XEvent__Group_5__0__Impl rule__XEvent__Group_5__1
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
    // InternalXMachine.g:3168:1: rule__XEvent__Group_5__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3172:1: ( ( 'any' ) )
            // InternalXMachine.g:3173:1: ( 'any' )
            {
            // InternalXMachine.g:3173:1: ( 'any' )
            // InternalXMachine.g:3174:2: 'any'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAnyKeyword_5_0()); 
            }
            match(input,130,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3183:1: rule__XEvent__Group_5__1 : rule__XEvent__Group_5__1__Impl ;
    public final void rule__XEvent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3187:1: ( rule__XEvent__Group_5__1__Impl )
            // InternalXMachine.g:3188:2: rule__XEvent__Group_5__1__Impl
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
    // InternalXMachine.g:3194:1: rule__XEvent__Group_5__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3198:1: ( ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) ) )
            // InternalXMachine.g:3199:1: ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) )
            {
            // InternalXMachine.g:3199:1: ( ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* ) )
            // InternalXMachine.g:3200:2: ( ( rule__XEvent__ParametersAssignment_5_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_1 )* )
            {
            // InternalXMachine.g:3200:2: ( ( rule__XEvent__ParametersAssignment_5_1 ) )
            // InternalXMachine.g:3201:3: ( rule__XEvent__ParametersAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersAssignment_5_1()); 
            }
            // InternalXMachine.g:3202:3: ( rule__XEvent__ParametersAssignment_5_1 )
            // InternalXMachine.g:3202:4: rule__XEvent__ParametersAssignment_5_1
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

            // InternalXMachine.g:3205:2: ( ( rule__XEvent__ParametersAssignment_5_1 )* )
            // InternalXMachine.g:3206:3: ( rule__XEvent__ParametersAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getParametersAssignment_5_1()); 
            }
            // InternalXMachine.g:3207:3: ( rule__XEvent__ParametersAssignment_5_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXMachine.g:3207:4: rule__XEvent__ParametersAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__ParametersAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalXMachine.g:3217:1: rule__XEvent__Group_7__0 : rule__XEvent__Group_7__0__Impl rule__XEvent__Group_7__1 ;
    public final void rule__XEvent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3221:1: ( rule__XEvent__Group_7__0__Impl rule__XEvent__Group_7__1 )
            // InternalXMachine.g:3222:2: rule__XEvent__Group_7__0__Impl rule__XEvent__Group_7__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalXMachine.g:3229:1: rule__XEvent__Group_7__0__Impl : ( ( rule__XEvent__Alternatives_7_0 ) ) ;
    public final void rule__XEvent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3233:1: ( ( ( rule__XEvent__Alternatives_7_0 ) ) )
            // InternalXMachine.g:3234:1: ( ( rule__XEvent__Alternatives_7_0 ) )
            {
            // InternalXMachine.g:3234:1: ( ( rule__XEvent__Alternatives_7_0 ) )
            // InternalXMachine.g:3235:2: ( rule__XEvent__Alternatives_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_7_0()); 
            }
            // InternalXMachine.g:3236:2: ( rule__XEvent__Alternatives_7_0 )
            // InternalXMachine.g:3236:3: rule__XEvent__Alternatives_7_0
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
    // InternalXMachine.g:3244:1: rule__XEvent__Group_7__1 : rule__XEvent__Group_7__1__Impl ;
    public final void rule__XEvent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3248:1: ( rule__XEvent__Group_7__1__Impl )
            // InternalXMachine.g:3249:2: rule__XEvent__Group_7__1__Impl
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
    // InternalXMachine.g:3255:1: rule__XEvent__Group_7__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) ) ;
    public final void rule__XEvent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3259:1: ( ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) ) )
            // InternalXMachine.g:3260:1: ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:3260:1: ( ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* ) )
            // InternalXMachine.g:3261:2: ( ( rule__XEvent__GuardsAssignment_7_1 ) ) ( ( rule__XEvent__GuardsAssignment_7_1 )* )
            {
            // InternalXMachine.g:3261:2: ( ( rule__XEvent__GuardsAssignment_7_1 ) )
            // InternalXMachine.g:3262:3: ( rule__XEvent__GuardsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
            }
            // InternalXMachine.g:3263:3: ( rule__XEvent__GuardsAssignment_7_1 )
            // InternalXMachine.g:3263:4: rule__XEvent__GuardsAssignment_7_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
            }

            }

            // InternalXMachine.g:3266:2: ( ( rule__XEvent__GuardsAssignment_7_1 )* )
            // InternalXMachine.g:3267:3: ( rule__XEvent__GuardsAssignment_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getGuardsAssignment_7_1()); 
            }
            // InternalXMachine.g:3268:3: ( rule__XEvent__GuardsAssignment_7_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_XLABEL||LA37_0==135) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXMachine.g:3268:4: rule__XEvent__GuardsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalXMachine.g:3278:1: rule__XEvent__Group_8__0 : rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 ;
    public final void rule__XEvent__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3282:1: ( rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1 )
            // InternalXMachine.g:3283:2: rule__XEvent__Group_8__0__Impl rule__XEvent__Group_8__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalXMachine.g:3290:1: rule__XEvent__Group_8__0__Impl : ( ( rule__XEvent__Alternatives_8_0 ) ) ;
    public final void rule__XEvent__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3294:1: ( ( ( rule__XEvent__Alternatives_8_0 ) ) )
            // InternalXMachine.g:3295:1: ( ( rule__XEvent__Alternatives_8_0 ) )
            {
            // InternalXMachine.g:3295:1: ( ( rule__XEvent__Alternatives_8_0 ) )
            // InternalXMachine.g:3296:2: ( rule__XEvent__Alternatives_8_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getAlternatives_8_0()); 
            }
            // InternalXMachine.g:3297:2: ( rule__XEvent__Alternatives_8_0 )
            // InternalXMachine.g:3297:3: rule__XEvent__Alternatives_8_0
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
    // InternalXMachine.g:3305:1: rule__XEvent__Group_8__1 : rule__XEvent__Group_8__1__Impl ;
    public final void rule__XEvent__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3309:1: ( rule__XEvent__Group_8__1__Impl )
            // InternalXMachine.g:3310:2: rule__XEvent__Group_8__1__Impl
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
    // InternalXMachine.g:3316:1: rule__XEvent__Group_8__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) ) ;
    public final void rule__XEvent__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3320:1: ( ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) ) )
            // InternalXMachine.g:3321:1: ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:3321:1: ( ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* ) )
            // InternalXMachine.g:3322:2: ( ( rule__XEvent__ActionsAssignment_8_1 ) ) ( ( rule__XEvent__ActionsAssignment_8_1 )* )
            {
            // InternalXMachine.g:3322:2: ( ( rule__XEvent__ActionsAssignment_8_1 ) )
            // InternalXMachine.g:3323:3: ( rule__XEvent__ActionsAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
            }
            // InternalXMachine.g:3324:3: ( rule__XEvent__ActionsAssignment_8_1 )
            // InternalXMachine.g:3324:4: rule__XEvent__ActionsAssignment_8_1
            {
            pushFollow(FOLLOW_12);
            rule__XEvent__ActionsAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
            }

            }

            // InternalXMachine.g:3327:2: ( ( rule__XEvent__ActionsAssignment_8_1 )* )
            // InternalXMachine.g:3328:3: ( rule__XEvent__ActionsAssignment_8_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getActionsAssignment_8_1()); 
            }
            // InternalXMachine.g:3329:3: ( rule__XEvent__ActionsAssignment_8_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_XLABEL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalXMachine.g:3329:4: rule__XEvent__ActionsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__XEvent__ActionsAssignment_8_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalXMachine.g:3339:1: rule__XEvent__Group_9__0 : rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 ;
    public final void rule__XEvent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3343:1: ( rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1 )
            // InternalXMachine.g:3344:2: rule__XEvent__Group_9__0__Impl rule__XEvent__Group_9__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalXMachine.g:3351:1: rule__XEvent__Group_9__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3355:1: ( ( 'with' ) )
            // InternalXMachine.g:3356:1: ( 'with' )
            {
            // InternalXMachine.g:3356:1: ( 'with' )
            // InternalXMachine.g:3357:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWithKeyword_9_0()); 
            }
            match(input,131,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3366:1: rule__XEvent__Group_9__1 : rule__XEvent__Group_9__1__Impl ;
    public final void rule__XEvent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3370:1: ( rule__XEvent__Group_9__1__Impl )
            // InternalXMachine.g:3371:2: rule__XEvent__Group_9__1__Impl
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
    // InternalXMachine.g:3377:1: rule__XEvent__Group_9__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) ) ;
    public final void rule__XEvent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3381:1: ( ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) ) )
            // InternalXMachine.g:3382:1: ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) )
            {
            // InternalXMachine.g:3382:1: ( ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* ) )
            // InternalXMachine.g:3383:2: ( ( rule__XEvent__WitnessesAssignment_9_1 ) ) ( ( rule__XEvent__WitnessesAssignment_9_1 )* )
            {
            // InternalXMachine.g:3383:2: ( ( rule__XEvent__WitnessesAssignment_9_1 ) )
            // InternalXMachine.g:3384:3: ( rule__XEvent__WitnessesAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
            }
            // InternalXMachine.g:3385:3: ( rule__XEvent__WitnessesAssignment_9_1 )
            // InternalXMachine.g:3385:4: rule__XEvent__WitnessesAssignment_9_1
            {
            pushFollow(FOLLOW_12);
            rule__XEvent__WitnessesAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
            }

            }

            // InternalXMachine.g:3388:2: ( ( rule__XEvent__WitnessesAssignment_9_1 )* )
            // InternalXMachine.g:3389:3: ( rule__XEvent__WitnessesAssignment_9_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getWitnessesAssignment_9_1()); 
            }
            // InternalXMachine.g:3390:3: ( rule__XEvent__WitnessesAssignment_9_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_XLABEL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:3390:4: rule__XEvent__WitnessesAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__XEvent__WitnessesAssignment_9_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalXMachine.g:3400:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3404:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:3405:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalXMachine.g:3412:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3416:1: ( ( () ) )
            // InternalXMachine.g:3417:1: ( () )
            {
            // InternalXMachine.g:3417:1: ( () )
            // InternalXMachine.g:3418:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            }
            // InternalXMachine.g:3419:2: ()
            // InternalXMachine.g:3419:3: 
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
    // InternalXMachine.g:3427:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3431:1: ( rule__EventSync__Group__1__Impl )
            // InternalXMachine.g:3432:2: rule__EventSync__Group__1__Impl
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
    // InternalXMachine.g:3438:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3442:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:3443:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3443:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:3444:2: ( rule__EventSync__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            }
            // InternalXMachine.g:3445:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:3445:3: rule__EventSync__Group_1__0
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
    // InternalXMachine.g:3454:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3458:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:3459:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
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
    // InternalXMachine.g:3466:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3470:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:3471:1: ( 'synchronises' )
            {
            // InternalXMachine.g:3471:1: ( 'synchronises' )
            // InternalXMachine.g:3472:2: 'synchronises'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            }
            match(input,132,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3481:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3485:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:3486:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
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
    // InternalXMachine.g:3493:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3497:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:3498:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:3498:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:3499:2: ( rule__EventSync__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            }
            // InternalXMachine.g:3500:2: ( rule__EventSync__Group_1_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==55) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:3500:3: rule__EventSync__Group_1_1__0
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
    // InternalXMachine.g:3508:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3512:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:3513:2: rule__EventSync__Group_1__2__Impl
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
    // InternalXMachine.g:3519:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3523:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:3524:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:3524:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:3525:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            }
            // InternalXMachine.g:3526:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:3526:3: rule__EventSync__SynchronisedEventAssignment_1_2
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
    // InternalXMachine.g:3535:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3539:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:3540:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
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
    // InternalXMachine.g:3547:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3551:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:3552:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:3552:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:3553:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            }
            // InternalXMachine.g:3554:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:3554:3: rule__EventSync__PrefixAssignment_1_1_0
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
    // InternalXMachine.g:3562:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3566:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:3567:2: rule__EventSync__Group_1_1__1__Impl
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
    // InternalXMachine.g:3573:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3577:1: ( ( '.' ) )
            // InternalXMachine.g:3578:1: ( '.' )
            {
            // InternalXMachine.g:3578:1: ( '.' )
            // InternalXMachine.g:3579:2: '.'
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
    // InternalXMachine.g:3589:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3593:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:3594:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
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
    // InternalXMachine.g:3601:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3605:1: ( ( () ) )
            // InternalXMachine.g:3606:1: ( () )
            {
            // InternalXMachine.g:3606:1: ( () )
            // InternalXMachine.g:3607:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            }
            // InternalXMachine.g:3608:2: ()
            // InternalXMachine.g:3608:3: 
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
    // InternalXMachine.g:3616:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3620:1: ( rule__XParameter__Group__1__Impl )
            // InternalXMachine.g:3621:2: rule__XParameter__Group__1__Impl
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
    // InternalXMachine.g:3627:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__NameAssignment_1 ) ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3631:1: ( ( ( rule__XParameter__NameAssignment_1 ) ) )
            // InternalXMachine.g:3632:1: ( ( rule__XParameter__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3632:1: ( ( rule__XParameter__NameAssignment_1 ) )
            // InternalXMachine.g:3633:2: ( rule__XParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:3634:2: ( rule__XParameter__NameAssignment_1 )
            // InternalXMachine.g:3634:3: rule__XParameter__NameAssignment_1
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
    // InternalXMachine.g:3643:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3647:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:3648:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalXMachine.g:3655:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3659:1: ( ( () ) )
            // InternalXMachine.g:3660:1: ( () )
            {
            // InternalXMachine.g:3660:1: ( () )
            // InternalXMachine.g:3661:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            }
            // InternalXMachine.g:3662:2: ()
            // InternalXMachine.g:3662:3: 
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
    // InternalXMachine.g:3670:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3674:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:3675:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalXMachine.g:3682:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__TheoremAssignment_1 )? ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3686:1: ( ( ( rule__XGuard__TheoremAssignment_1 )? ) )
            // InternalXMachine.g:3687:1: ( ( rule__XGuard__TheoremAssignment_1 )? )
            {
            // InternalXMachine.g:3687:1: ( ( rule__XGuard__TheoremAssignment_1 )? )
            // InternalXMachine.g:3688:2: ( rule__XGuard__TheoremAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremAssignment_1()); 
            }
            // InternalXMachine.g:3689:2: ( rule__XGuard__TheoremAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==135) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:3689:3: rule__XGuard__TheoremAssignment_1
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
    // InternalXMachine.g:3697:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3701:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:3702:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:3709:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__NameAssignment_2 ) ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3713:1: ( ( ( rule__XGuard__NameAssignment_2 ) ) )
            // InternalXMachine.g:3714:1: ( ( rule__XGuard__NameAssignment_2 ) )
            {
            // InternalXMachine.g:3714:1: ( ( rule__XGuard__NameAssignment_2 ) )
            // InternalXMachine.g:3715:2: ( rule__XGuard__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getNameAssignment_2()); 
            }
            // InternalXMachine.g:3716:2: ( rule__XGuard__NameAssignment_2 )
            // InternalXMachine.g:3716:3: rule__XGuard__NameAssignment_2
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
    // InternalXMachine.g:3724:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3728:1: ( rule__XGuard__Group__3__Impl )
            // InternalXMachine.g:3729:2: rule__XGuard__Group__3__Impl
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
    // InternalXMachine.g:3735:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__PredicateAssignment_3 ) ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3739:1: ( ( ( rule__XGuard__PredicateAssignment_3 ) ) )
            // InternalXMachine.g:3740:1: ( ( rule__XGuard__PredicateAssignment_3 ) )
            {
            // InternalXMachine.g:3740:1: ( ( rule__XGuard__PredicateAssignment_3 ) )
            // InternalXMachine.g:3741:2: ( rule__XGuard__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getPredicateAssignment_3()); 
            }
            // InternalXMachine.g:3742:2: ( rule__XGuard__PredicateAssignment_3 )
            // InternalXMachine.g:3742:3: rule__XGuard__PredicateAssignment_3
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
    // InternalXMachine.g:3751:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3755:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:3756:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalXMachine.g:3763:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3767:1: ( ( () ) )
            // InternalXMachine.g:3768:1: ( () )
            {
            // InternalXMachine.g:3768:1: ( () )
            // InternalXMachine.g:3769:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            }
            // InternalXMachine.g:3770:2: ()
            // InternalXMachine.g:3770:3: 
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
    // InternalXMachine.g:3778:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3782:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:3783:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:3790:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__NameAssignment_1 ) ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3794:1: ( ( ( rule__XWitness__NameAssignment_1 ) ) )
            // InternalXMachine.g:3795:1: ( ( rule__XWitness__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3795:1: ( ( rule__XWitness__NameAssignment_1 ) )
            // InternalXMachine.g:3796:2: ( rule__XWitness__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:3797:2: ( rule__XWitness__NameAssignment_1 )
            // InternalXMachine.g:3797:3: rule__XWitness__NameAssignment_1
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
    // InternalXMachine.g:3805:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3809:1: ( rule__XWitness__Group__2__Impl )
            // InternalXMachine.g:3810:2: rule__XWitness__Group__2__Impl
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
    // InternalXMachine.g:3816:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__PredicateAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3820:1: ( ( ( rule__XWitness__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:3821:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:3821:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            // InternalXMachine.g:3822:2: ( rule__XWitness__PredicateAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            }
            // InternalXMachine.g:3823:2: ( rule__XWitness__PredicateAssignment_2 )
            // InternalXMachine.g:3823:3: rule__XWitness__PredicateAssignment_2
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
    // InternalXMachine.g:3832:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3836:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:3837:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalXMachine.g:3844:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3848:1: ( ( () ) )
            // InternalXMachine.g:3849:1: ( () )
            {
            // InternalXMachine.g:3849:1: ( () )
            // InternalXMachine.g:3850:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAction_0()); 
            }
            // InternalXMachine.g:3851:2: ()
            // InternalXMachine.g:3851:3: 
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
    // InternalXMachine.g:3859:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3863:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:3864:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalXMachine.g:3871:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__NameAssignment_1 ) ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3875:1: ( ( ( rule__XAction__NameAssignment_1 ) ) )
            // InternalXMachine.g:3876:1: ( ( rule__XAction__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3876:1: ( ( rule__XAction__NameAssignment_1 ) )
            // InternalXMachine.g:3877:2: ( rule__XAction__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            }
            // InternalXMachine.g:3878:2: ( rule__XAction__NameAssignment_1 )
            // InternalXMachine.g:3878:3: rule__XAction__NameAssignment_1
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
    // InternalXMachine.g:3886:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3890:1: ( rule__XAction__Group__2__Impl )
            // InternalXMachine.g:3891:2: rule__XAction__Group__2__Impl
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
    // InternalXMachine.g:3897:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__ActionAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3901:1: ( ( ( rule__XAction__ActionAssignment_2 ) ) )
            // InternalXMachine.g:3902:1: ( ( rule__XAction__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:3902:1: ( ( rule__XAction__ActionAssignment_2 ) )
            // InternalXMachine.g:3903:2: ( rule__XAction__ActionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            }
            // InternalXMachine.g:3904:2: ( rule__XAction__ActionAssignment_2 )
            // InternalXMachine.g:3904:3: rule__XAction__ActionAssignment_2
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
    // InternalXMachine.g:3913:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3917:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalXMachine.g:3918:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalXMachine.g:3925:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3929:1: ( ( '%' ) )
            // InternalXMachine.g:3930:1: ( '%' )
            {
            // InternalXMachine.g:3930:1: ( '%' )
            // InternalXMachine.g:3931:2: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            }
            match(input,133,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:3940:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3944:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalXMachine.g:3945:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
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
    // InternalXMachine.g:3951:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3955:1: ( ( '\\u22C2' ) )
            // InternalXMachine.g:3956:1: ( '\\u22C2' )
            {
            // InternalXMachine.g:3956:1: ( '\\u22C2' )
            // InternalXMachine.g:3957:2: '\\u22C2'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            }
            match(input,134,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Machine__UnorderedGroup_4"
    // InternalXMachine.g:3967:1: rule__Machine__UnorderedGroup_4 : ( rule__Machine__UnorderedGroup_4__0 )? ;
    public final void rule__Machine__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMachineAccess().getUnorderedGroup_4());
        	
        try {
            // InternalXMachine.g:3972:1: ( ( rule__Machine__UnorderedGroup_4__0 )? )
            // InternalXMachine.g:3973:2: ( rule__Machine__UnorderedGroup_4__0 )?
            {
            // InternalXMachine.g:3973:2: ( rule__Machine__UnorderedGroup_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 126 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 119 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt42=1;
            }
            else if ( LA42_0 == 120 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXMachine.g:3973:2: rule__Machine__UnorderedGroup_4__0
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
    // InternalXMachine.g:3981:1: rule__Machine__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__Machine__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:3986:1: ( ( ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) ) )
            // InternalXMachine.g:3987:3: ( ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) )
            {
            // InternalXMachine.g:3987:3: ( ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) ) )
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 126 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 119 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt44=2;
            }
            else if ( LA44_0 == 120 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt44=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:3988:3: ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) )
                    {
                    // InternalXMachine.g:3988:3: ({...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) ) )
                    // InternalXMachine.g:3989:4: {...}? => ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalXMachine.g:3989:103: ( ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) ) )
                    // InternalXMachine.g:3990:5: ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalXMachine.g:3996:5: ( ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* ) )
                    // InternalXMachine.g:3997:6: ( ( rule__Machine__ExtensionsAssignment_4_0 ) ) ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* )
                    {
                    // InternalXMachine.g:3997:6: ( ( rule__Machine__ExtensionsAssignment_4_0 ) )
                    // InternalXMachine.g:3998:7: ( rule__Machine__ExtensionsAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getExtensionsAssignment_4_0()); 
                    }
                    // InternalXMachine.g:3999:7: ( rule__Machine__ExtensionsAssignment_4_0 )
                    // InternalXMachine.g:3999:8: rule__Machine__ExtensionsAssignment_4_0
                    {
                    pushFollow(FOLLOW_24);
                    rule__Machine__ExtensionsAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMachineAccess().getExtensionsAssignment_4_0()); 
                    }

                    }

                    // InternalXMachine.g:4002:6: ( ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )* )
                    // InternalXMachine.g:4003:7: ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getExtensionsAssignment_4_0()); 
                    }
                    // InternalXMachine.g:4004:7: ( ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0 )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==126) ) {
                            int LA43_1 = input.LA(2);

                            if ( (LA43_1==RULE_ID) ) {
                                int LA43_3 = input.LA(3);

                                if ( (synpred1_InternalXMachine()) ) {
                                    alt43=1;
                                }


                            }


                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalXMachine.g:4004:8: ( rule__Machine__ExtensionsAssignment_4_0 )=> rule__Machine__ExtensionsAssignment_4_0
                    	    {
                    	    pushFollow(FOLLOW_24);
                    	    rule__Machine__ExtensionsAssignment_4_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
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
                    // InternalXMachine.g:4010:3: ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) )
                    {
                    // InternalXMachine.g:4010:3: ({...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) ) )
                    // InternalXMachine.g:4011:4: {...}? => ( ( ( rule__Machine__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalXMachine.g:4011:103: ( ( ( rule__Machine__Group_4_1__0 ) ) )
                    // InternalXMachine.g:4012:5: ( ( rule__Machine__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalXMachine.g:4018:5: ( ( rule__Machine__Group_4_1__0 ) )
                    // InternalXMachine.g:4019:6: ( rule__Machine__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_4_1()); 
                    }
                    // InternalXMachine.g:4020:6: ( rule__Machine__Group_4_1__0 )
                    // InternalXMachine.g:4020:7: rule__Machine__Group_4_1__0
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
                    // InternalXMachine.g:4025:3: ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) )
                    {
                    // InternalXMachine.g:4025:3: ({...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) ) )
                    // InternalXMachine.g:4026:4: {...}? => ( ( ( rule__Machine__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Machine__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalXMachine.g:4026:103: ( ( ( rule__Machine__Group_4_2__0 ) ) )
                    // InternalXMachine.g:4027:5: ( ( rule__Machine__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalXMachine.g:4033:5: ( ( rule__Machine__Group_4_2__0 ) )
                    // InternalXMachine.g:4034:6: ( rule__Machine__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMachineAccess().getGroup_4_2()); 
                    }
                    // InternalXMachine.g:4035:6: ( rule__Machine__Group_4_2__0 )
                    // InternalXMachine.g:4035:7: rule__Machine__Group_4_2__0
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
    // InternalXMachine.g:4048:1: rule__Machine__UnorderedGroup_4__0 : rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )? ;
    public final void rule__Machine__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4052:1: ( rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )? )
            // InternalXMachine.g:4053:2: rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_25);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:4054:2: ( rule__Machine__UnorderedGroup_4__1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 126 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 119 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt45=1;
            }
            else if ( LA45_0 == 120 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:4054:2: rule__Machine__UnorderedGroup_4__1
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
    // InternalXMachine.g:4060:1: rule__Machine__UnorderedGroup_4__1 : rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )? ;
    public final void rule__Machine__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4064:1: ( rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )? )
            // InternalXMachine.g:4065:2: rule__Machine__UnorderedGroup_4__Impl ( rule__Machine__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_25);
            rule__Machine__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalXMachine.g:4066:2: ( rule__Machine__UnorderedGroup_4__2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 126 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 119 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 == 120 && getUnorderedGroupHelper().canSelect(grammarAccess.getMachineAccess().getUnorderedGroup_4(), 2) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:4066:2: rule__Machine__UnorderedGroup_4__2
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
    // InternalXMachine.g:4072:1: rule__Machine__UnorderedGroup_4__2 : rule__Machine__UnorderedGroup_4__Impl ;
    public final void rule__Machine__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4076:1: ( rule__Machine__UnorderedGroup_4__Impl )
            // InternalXMachine.g:4077:2: rule__Machine__UnorderedGroup_4__Impl
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
    // InternalXMachine.g:4084:1: rule__Machine__CommentAssignment_1 : ( ( rule__Machine__CommentAlternatives_1_0 ) ) ;
    public final void rule__Machine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4088:1: ( ( ( rule__Machine__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:4089:2: ( ( rule__Machine__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:4089:2: ( ( rule__Machine__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:4090:3: ( rule__Machine__CommentAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCommentAlternatives_1_0()); 
            }
            // InternalXMachine.g:4091:3: ( rule__Machine__CommentAlternatives_1_0 )
            // InternalXMachine.g:4091:4: rule__Machine__CommentAlternatives_1_0
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
    // InternalXMachine.g:4099:1: rule__Machine__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4103:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4104:2: ( RULE_ID )
            {
            // InternalXMachine.g:4104:2: ( RULE_ID )
            // InternalXMachine.g:4105:3: RULE_ID
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
    // InternalXMachine.g:4114:1: rule__Machine__ExtensionsAssignment_4_0 : ( ruleMIncludes ) ;
    public final void rule__Machine__ExtensionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4118:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:4119:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:4119:2: ( ruleMIncludes )
            // InternalXMachine.g:4120:3: ruleMIncludes
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
    // InternalXMachine.g:4129:1: rule__Machine__RefinesAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4133:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4134:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4134:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4135:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_1_0()); 
            }
            // InternalXMachine.g:4136:3: ( RULE_ID )
            // InternalXMachine.g:4137:4: RULE_ID
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
    // InternalXMachine.g:4148:1: rule__Machine__SeesAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4152:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4153:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4153:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4154:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getSeesContextCrossReference_4_2_1_0()); 
            }
            // InternalXMachine.g:4155:3: ( RULE_ID )
            // InternalXMachine.g:4156:4: RULE_ID
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
    // InternalXMachine.g:4167:1: rule__Machine__ExtensionsAssignment_5_1 : ( ruleMContains ) ;
    public final void rule__Machine__ExtensionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4171:1: ( ( ruleMContains ) )
            // InternalXMachine.g:4172:2: ( ruleMContains )
            {
            // InternalXMachine.g:4172:2: ( ruleMContains )
            // InternalXMachine.g:4173:3: ruleMContains
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
    // InternalXMachine.g:4182:1: rule__Machine__VariablesAssignment_6_1 : ( ruleXVariable ) ;
    public final void rule__Machine__VariablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4186:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:4187:2: ( ruleXVariable )
            {
            // InternalXMachine.g:4187:2: ( ruleXVariable )
            // InternalXMachine.g:4188:3: ruleXVariable
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


    // $ANTLR start "rule__Machine__InvariantsAssignment_7_1"
    // InternalXMachine.g:4197:1: rule__Machine__InvariantsAssignment_7_1 : ( ruleXInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4201:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:4202:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:4202:2: ( ruleXInvariant )
            // InternalXMachine.g:4203:3: ruleXInvariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__InvariantsAssignment_7_1"


    // $ANTLR start "rule__Machine__VariantsAssignment_8_1"
    // InternalXMachine.g:4212:1: rule__Machine__VariantsAssignment_8_1 : ( ruleXVariant ) ;
    public final void rule__Machine__VariantsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4216:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:4217:2: ( ruleXVariant )
            {
            // InternalXMachine.g:4217:2: ( ruleXVariant )
            // InternalXMachine.g:4218:3: ruleXVariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getVariantsXVariantParserRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXVariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getVariantsXVariantParserRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariantsAssignment_8_1"


    // $ANTLR start "rule__Machine__EventsAssignment_9_1"
    // InternalXMachine.g:4227:1: rule__Machine__EventsAssignment_9_1 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4231:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4232:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4232:2: ( ruleXEvent )
            // InternalXMachine.g:4233:3: ruleXEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_9_1"


    // $ANTLR start "rule__MContains__NameAssignment_1"
    // InternalXMachine.g:4242:1: rule__MContains__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MContains__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4246:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4247:2: ( RULE_ID )
            {
            // InternalXMachine.g:4247:2: ( RULE_ID )
            // InternalXMachine.g:4248:3: RULE_ID
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
    // InternalXMachine.g:4257:1: rule__MContains__ExtensionAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MContains__ExtensionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4261:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:4262:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:4262:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:4263:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMContainsAccess().getExtensionDiagramCrossReference_3_0()); 
            }
            // InternalXMachine.g:4264:3: ( ruleQualifiedName )
            // InternalXMachine.g:4265:4: ruleQualifiedName
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
    // InternalXMachine.g:4276:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4280:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:4281:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:4281:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:4282:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            }
            // InternalXMachine.g:4283:3: ( ruleQualifiedName )
            // InternalXMachine.g:4284:4: ruleQualifiedName
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
    // InternalXMachine.g:4295:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4299:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4300:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4300:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4301:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            }
            // InternalXMachine.g:4302:3: ( RULE_ID )
            // InternalXMachine.g:4303:4: RULE_ID
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
    // InternalXMachine.g:4314:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4318:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4319:2: ( RULE_ID )
            {
            // InternalXMachine.g:4319:2: ( RULE_ID )
            // InternalXMachine.g:4320:3: RULE_ID
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
    // InternalXMachine.g:4329:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4333:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4334:2: ( RULE_ID )
            {
            // InternalXMachine.g:4334:2: ( RULE_ID )
            // InternalXMachine.g:4335:3: RULE_ID
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
    // InternalXMachine.g:4344:1: rule__XVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4348:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4349:2: ( RULE_ID )
            {
            // InternalXMachine.g:4349:2: ( RULE_ID )
            // InternalXMachine.g:4350:3: RULE_ID
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
    // InternalXMachine.g:4359:1: rule__XInvariant__TheoremAssignment_1 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4363:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:4364:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:4364:2: ( ( 'theorem' ) )
            // InternalXMachine.g:4365:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            }
            // InternalXMachine.g:4366:3: ( 'theorem' )
            // InternalXMachine.g:4367:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            }
            match(input,135,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4378:1: rule__XInvariant__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XInvariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4382:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4383:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4383:2: ( RULE_XLABEL )
            // InternalXMachine.g:4384:3: RULE_XLABEL
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
    // InternalXMachine.g:4393:1: rule__XInvariant__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XInvariant__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4397:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:4398:2: ( ruleXFormula )
            {
            // InternalXMachine.g:4398:2: ( ruleXFormula )
            // InternalXMachine.g:4399:3: ruleXFormula
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
    // InternalXMachine.g:4408:1: rule__XVariant__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XVariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4412:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4413:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4413:2: ( RULE_XLABEL )
            // InternalXMachine.g:4414:3: RULE_XLABEL
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
    // InternalXMachine.g:4423:1: rule__XVariant__ExpressionAssignment_2 : ( ruleXFormula ) ;
    public final void rule__XVariant__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4427:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:4428:2: ( ruleXFormula )
            {
            // InternalXMachine.g:4428:2: ( ruleXFormula )
            // InternalXMachine.g:4429:3: ruleXFormula
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
    // InternalXMachine.g:4438:1: rule__XEvent__ConvergenceAssignment_1 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4442:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:4443:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:4443:2: ( ruleXConvergence )
            // InternalXMachine.g:4444:3: ruleXConvergence
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
    // InternalXMachine.g:4453:1: rule__XEvent__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4457:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4458:2: ( RULE_ID )
            {
            // InternalXMachine.g:4458:2: ( RULE_ID )
            // InternalXMachine.g:4459:3: RULE_ID
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
    // InternalXMachine.g:4468:1: rule__XEvent__RefinesAssignment_4_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4472:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4473:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4473:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4474:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_0_1_0()); 
            }
            // InternalXMachine.g:4475:3: ( RULE_ID )
            // InternalXMachine.g:4476:4: RULE_ID
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
    // InternalXMachine.g:4487:1: rule__XEvent__ExtendedAssignment_4_1_0 : ( ( 'extends' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4491:1: ( ( ( 'extends' ) ) )
            // InternalXMachine.g:4492:2: ( ( 'extends' ) )
            {
            // InternalXMachine.g:4492:2: ( ( 'extends' ) )
            // InternalXMachine.g:4493:3: ( 'extends' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0()); 
            }
            // InternalXMachine.g:4494:3: ( 'extends' )
            // InternalXMachine.g:4495:4: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getExtendedExtendsKeyword_4_1_0_0()); 
            }
            match(input,136,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4506:1: rule__XEvent__RefinesAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4510:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4511:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4511:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4512:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_1_0()); 
            }
            // InternalXMachine.g:4513:3: ( RULE_ID )
            // InternalXMachine.g:4514:4: RULE_ID
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
    // InternalXMachine.g:4525:1: rule__XEvent__ParametersAssignment_5_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4529:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:4530:2: ( ruleXParameter )
            {
            // InternalXMachine.g:4530:2: ( ruleXParameter )
            // InternalXMachine.g:4531:3: ruleXParameter
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
    // InternalXMachine.g:4540:1: rule__XEvent__ExtensionsAssignment_6 : ( ruleEventSync ) ;
    public final void rule__XEvent__ExtensionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4544:1: ( ( ruleEventSync ) )
            // InternalXMachine.g:4545:2: ( ruleEventSync )
            {
            // InternalXMachine.g:4545:2: ( ruleEventSync )
            // InternalXMachine.g:4546:3: ruleEventSync
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
    // InternalXMachine.g:4555:1: rule__XEvent__GuardsAssignment_7_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4559:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:4560:2: ( ruleXGuard )
            {
            // InternalXMachine.g:4560:2: ( ruleXGuard )
            // InternalXMachine.g:4561:3: ruleXGuard
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
    // InternalXMachine.g:4570:1: rule__XEvent__ActionsAssignment_8_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4574:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4575:2: ( ruleXAction )
            {
            // InternalXMachine.g:4575:2: ( ruleXAction )
            // InternalXMachine.g:4576:3: ruleXAction
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
    // InternalXMachine.g:4585:1: rule__XEvent__WitnessesAssignment_9_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4589:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4590:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4590:2: ( ruleXWitness )
            // InternalXMachine.g:4591:3: ruleXWitness
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
    // InternalXMachine.g:4600:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4604:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4605:2: ( RULE_ID )
            {
            // InternalXMachine.g:4605:2: ( RULE_ID )
            // InternalXMachine.g:4606:3: RULE_ID
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
    // InternalXMachine.g:4615:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4619:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4620:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4620:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4621:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            }
            // InternalXMachine.g:4622:3: ( RULE_ID )
            // InternalXMachine.g:4623:4: RULE_ID
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
    // InternalXMachine.g:4634:1: rule__XParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4638:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4639:2: ( RULE_ID )
            {
            // InternalXMachine.g:4639:2: ( RULE_ID )
            // InternalXMachine.g:4640:3: RULE_ID
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
    // InternalXMachine.g:4649:1: rule__XGuard__TheoremAssignment_1 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4653:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:4654:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:4654:2: ( ( 'theorem' ) )
            // InternalXMachine.g:4655:3: ( 'theorem' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0()); 
            }
            // InternalXMachine.g:4656:3: ( 'theorem' )
            // InternalXMachine.g:4657:4: 'theorem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_1_0()); 
            }
            match(input,135,FOLLOW_2); if (state.failed) return ;
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
    // InternalXMachine.g:4668:1: rule__XGuard__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4672:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4673:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4673:2: ( RULE_XLABEL )
            // InternalXMachine.g:4674:3: RULE_XLABEL
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
    // InternalXMachine.g:4683:1: rule__XGuard__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XGuard__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4687:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:4688:2: ( ruleXFormula )
            {
            // InternalXMachine.g:4688:2: ( ruleXFormula )
            // InternalXMachine.g:4689:3: ruleXFormula
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
    // InternalXMachine.g:4698:1: rule__XWitness__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4702:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4703:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4703:2: ( RULE_XLABEL )
            // InternalXMachine.g:4704:3: RULE_XLABEL
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
    // InternalXMachine.g:4713:1: rule__XWitness__PredicateAssignment_2 : ( ruleXFormula ) ;
    public final void rule__XWitness__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4717:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:4718:2: ( ruleXFormula )
            {
            // InternalXMachine.g:4718:2: ( ruleXFormula )
            // InternalXMachine.g:4719:3: ruleXFormula
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
    // InternalXMachine.g:4728:1: rule__XAction__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4732:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4733:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4733:2: ( RULE_XLABEL )
            // InternalXMachine.g:4734:3: RULE_XLABEL
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
    // InternalXMachine.g:4743:1: rule__XAction__ActionAssignment_2 : ( ruleXFormula ) ;
    public final void rule__XAction__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4747:1: ( ( ruleXFormula ) )
            // InternalXMachine.g:4748:2: ( ruleXFormula )
            {
            // InternalXMachine.g:4748:2: ( ruleXFormula )
            // InternalXMachine.g:4749:3: ruleXFormula
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

    // $ANTLR start synpred1_InternalXMachine
    public final void synpred1_InternalXMachine_fragment() throws RecognitionException {   
        // InternalXMachine.g:4004:8: ( rule__Machine__ExtensionsAssignment_4_0 )
        // InternalXMachine.g:4004:9: rule__Machine__ExtensionsAssignment_4_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFFF00C2L,0x0003FFFFFFFFFFFFL,0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L,0x0020000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x4180000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x3E40000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x001C000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000002L,0x001C000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xFFFFFFFFFFFF00C0L,0x0003FFFFFFFFFFFFL,0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000F000L,0x00C0000000000000L,0x000000000000011CL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x4180000000000000L});

}
