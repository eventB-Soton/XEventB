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

@SuppressWarnings("all")
public class InternalXMachineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_XLABEL", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'BOOL'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21151'", "'\\u2115'", "'\\u21191'", "'\\u2119'", "'\\u2124'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'\\u00D7'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'includes'", "'to'", "'as'", "'begin'", "'with'", "'when'", "'then'", "'any'", "'where'", "'synchronises'", "'%'", "'\\u22C2'", "'theorem'", "'extended'"
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
             before(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getMachineRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getMachineAccess().getGroup()); 
            // InternalXMachine.g:69:3: ( rule__Machine__Group__0 )
            // InternalXMachine.g:69:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMIncludes"
    // InternalXMachine.g:78:1: entryRuleMIncludes : ruleMIncludes EOF ;
    public final void entryRuleMIncludes() throws RecognitionException {
        try {
            // InternalXMachine.g:79:1: ( ruleMIncludes EOF )
            // InternalXMachine.g:80:1: ruleMIncludes EOF
            {
             before(grammarAccess.getMIncludesRule()); 
            pushFollow(FOLLOW_1);
            ruleMIncludes();

            state._fsp--;

             after(grammarAccess.getMIncludesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:87:1: ruleMIncludes : ( ( rule__MIncludes__Group__0 ) ) ;
    public final void ruleMIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:91:2: ( ( ( rule__MIncludes__Group__0 ) ) )
            // InternalXMachine.g:92:2: ( ( rule__MIncludes__Group__0 ) )
            {
            // InternalXMachine.g:92:2: ( ( rule__MIncludes__Group__0 ) )
            // InternalXMachine.g:93:3: ( rule__MIncludes__Group__0 )
            {
             before(grammarAccess.getMIncludesAccess().getGroup()); 
            // InternalXMachine.g:94:3: ( rule__MIncludes__Group__0 )
            // InternalXMachine.g:94:4: rule__MIncludes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getGroup()); 

            }


            }

        }
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
    // InternalXMachine.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXMachine.g:104:1: ( ruleQualifiedName EOF )
            // InternalXMachine.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXMachine.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXMachine.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXMachine.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalXMachine.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalXMachine.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
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
    // InternalXMachine.g:128:1: entryRuleXVariable : ruleXVariable EOF ;
    public final void entryRuleXVariable() throws RecognitionException {
        try {
            // InternalXMachine.g:129:1: ( ruleXVariable EOF )
            // InternalXMachine.g:130:1: ruleXVariable EOF
            {
             before(grammarAccess.getXVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariable();

            state._fsp--;

             after(grammarAccess.getXVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:137:1: ruleXVariable : ( ( rule__XVariable__Group__0 ) ) ;
    public final void ruleXVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:141:2: ( ( ( rule__XVariable__Group__0 ) ) )
            // InternalXMachine.g:142:2: ( ( rule__XVariable__Group__0 ) )
            {
            // InternalXMachine.g:142:2: ( ( rule__XVariable__Group__0 ) )
            // InternalXMachine.g:143:3: ( rule__XVariable__Group__0 )
            {
             before(grammarAccess.getXVariableAccess().getGroup()); 
            // InternalXMachine.g:144:3: ( rule__XVariable__Group__0 )
            // InternalXMachine.g:144:4: rule__XVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariableAccess().getGroup()); 

            }


            }

        }
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
    // InternalXMachine.g:153:1: entryRuleXInvariant : ruleXInvariant EOF ;
    public final void entryRuleXInvariant() throws RecognitionException {
        try {
            // InternalXMachine.g:154:1: ( ruleXInvariant EOF )
            // InternalXMachine.g:155:1: ruleXInvariant EOF
            {
             before(grammarAccess.getXInvariantRule()); 
            pushFollow(FOLLOW_1);
            ruleXInvariant();

            state._fsp--;

             after(grammarAccess.getXInvariantRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:162:1: ruleXInvariant : ( ( rule__XInvariant__Group__0 ) ) ;
    public final void ruleXInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:166:2: ( ( ( rule__XInvariant__Group__0 ) ) )
            // InternalXMachine.g:167:2: ( ( rule__XInvariant__Group__0 ) )
            {
            // InternalXMachine.g:167:2: ( ( rule__XInvariant__Group__0 ) )
            // InternalXMachine.g:168:3: ( rule__XInvariant__Group__0 )
            {
             before(grammarAccess.getXInvariantAccess().getGroup()); 
            // InternalXMachine.g:169:3: ( rule__XInvariant__Group__0 )
            // InternalXMachine.g:169:4: rule__XInvariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getGroup()); 

            }


            }

        }
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
    // InternalXMachine.g:178:1: entryRuleXVariant : ruleXVariant EOF ;
    public final void entryRuleXVariant() throws RecognitionException {
        try {
            // InternalXMachine.g:179:1: ( ruleXVariant EOF )
            // InternalXMachine.g:180:1: ruleXVariant EOF
            {
             before(grammarAccess.getXVariantRule()); 
            pushFollow(FOLLOW_1);
            ruleXVariant();

            state._fsp--;

             after(grammarAccess.getXVariantRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:187:1: ruleXVariant : ( ( rule__XVariant__Group__0 ) ) ;
    public final void ruleXVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:191:2: ( ( ( rule__XVariant__Group__0 ) ) )
            // InternalXMachine.g:192:2: ( ( rule__XVariant__Group__0 ) )
            {
            // InternalXMachine.g:192:2: ( ( rule__XVariant__Group__0 ) )
            // InternalXMachine.g:193:3: ( rule__XVariant__Group__0 )
            {
             before(grammarAccess.getXVariantAccess().getGroup()); 
            // InternalXMachine.g:194:3: ( rule__XVariant__Group__0 )
            // InternalXMachine.g:194:4: rule__XVariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXVariantAccess().getGroup()); 

            }


            }

        }
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
    // InternalXMachine.g:203:1: entryRuleXEvent : ruleXEvent EOF ;
    public final void entryRuleXEvent() throws RecognitionException {
        try {
            // InternalXMachine.g:204:1: ( ruleXEvent EOF )
            // InternalXMachine.g:205:1: ruleXEvent EOF
            {
             before(grammarAccess.getXEventRule()); 
            pushFollow(FOLLOW_1);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getXEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:212:1: ruleXEvent : ( ( rule__XEvent__Group__0 ) ) ;
    public final void ruleXEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:216:2: ( ( ( rule__XEvent__Group__0 ) ) )
            // InternalXMachine.g:217:2: ( ( rule__XEvent__Group__0 ) )
            {
            // InternalXMachine.g:217:2: ( ( rule__XEvent__Group__0 ) )
            // InternalXMachine.g:218:3: ( rule__XEvent__Group__0 )
            {
             before(grammarAccess.getXEventAccess().getGroup()); 
            // InternalXMachine.g:219:3: ( rule__XEvent__Group__0 )
            // InternalXMachine.g:219:4: rule__XEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGroup()); 

            }


            }

        }
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
    // InternalXMachine.g:228:1: entryRuleEventSync : ruleEventSync EOF ;
    public final void entryRuleEventSync() throws RecognitionException {
        try {
            // InternalXMachine.g:229:1: ( ruleEventSync EOF )
            // InternalXMachine.g:230:1: ruleEventSync EOF
            {
             before(grammarAccess.getEventSyncRule()); 
            pushFollow(FOLLOW_1);
            ruleEventSync();

            state._fsp--;

             after(grammarAccess.getEventSyncRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:237:1: ruleEventSync : ( ( rule__EventSync__Group__0 ) ) ;
    public final void ruleEventSync() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:241:2: ( ( ( rule__EventSync__Group__0 ) ) )
            // InternalXMachine.g:242:2: ( ( rule__EventSync__Group__0 ) )
            {
            // InternalXMachine.g:242:2: ( ( rule__EventSync__Group__0 ) )
            // InternalXMachine.g:243:3: ( rule__EventSync__Group__0 )
            {
             before(grammarAccess.getEventSyncAccess().getGroup()); 
            // InternalXMachine.g:244:3: ( rule__EventSync__Group__0 )
            // InternalXMachine.g:244:4: rule__EventSync__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getGroup()); 

            }


            }

        }
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
    // InternalXMachine.g:253:1: entryRuleXParameter : ruleXParameter EOF ;
    public final void entryRuleXParameter() throws RecognitionException {
        try {
            // InternalXMachine.g:254:1: ( ruleXParameter EOF )
            // InternalXMachine.g:255:1: ruleXParameter EOF
            {
             before(grammarAccess.getXParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleXParameter();

            state._fsp--;

             after(grammarAccess.getXParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:262:1: ruleXParameter : ( ( rule__XParameter__Group__0 ) ) ;
    public final void ruleXParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:266:2: ( ( ( rule__XParameter__Group__0 ) ) )
            // InternalXMachine.g:267:2: ( ( rule__XParameter__Group__0 ) )
            {
            // InternalXMachine.g:267:2: ( ( rule__XParameter__Group__0 ) )
            // InternalXMachine.g:268:3: ( rule__XParameter__Group__0 )
            {
             before(grammarAccess.getXParameterAccess().getGroup()); 
            // InternalXMachine.g:269:3: ( rule__XParameter__Group__0 )
            // InternalXMachine.g:269:4: rule__XParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXParameterAccess().getGroup()); 

            }


            }

        }
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
    // InternalXMachine.g:278:1: entryRuleXGuard : ruleXGuard EOF ;
    public final void entryRuleXGuard() throws RecognitionException {
        try {
            // InternalXMachine.g:279:1: ( ruleXGuard EOF )
            // InternalXMachine.g:280:1: ruleXGuard EOF
            {
             before(grammarAccess.getXGuardRule()); 
            pushFollow(FOLLOW_1);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXGuardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:287:1: ruleXGuard : ( ( rule__XGuard__Group__0 ) ) ;
    public final void ruleXGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:291:2: ( ( ( rule__XGuard__Group__0 ) ) )
            // InternalXMachine.g:292:2: ( ( rule__XGuard__Group__0 ) )
            {
            // InternalXMachine.g:292:2: ( ( rule__XGuard__Group__0 ) )
            // InternalXMachine.g:293:3: ( rule__XGuard__Group__0 )
            {
             before(grammarAccess.getXGuardAccess().getGroup()); 
            // InternalXMachine.g:294:3: ( rule__XGuard__Group__0 )
            // InternalXMachine.g:294:4: rule__XGuard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getGroup()); 

            }


            }

        }
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
    // InternalXMachine.g:303:1: entryRuleXWitness : ruleXWitness EOF ;
    public final void entryRuleXWitness() throws RecognitionException {
        try {
            // InternalXMachine.g:304:1: ( ruleXWitness EOF )
            // InternalXMachine.g:305:1: ruleXWitness EOF
            {
             before(grammarAccess.getXWitnessRule()); 
            pushFollow(FOLLOW_1);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXWitnessRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:312:1: ruleXWitness : ( ( rule__XWitness__Group__0 ) ) ;
    public final void ruleXWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:316:2: ( ( ( rule__XWitness__Group__0 ) ) )
            // InternalXMachine.g:317:2: ( ( rule__XWitness__Group__0 ) )
            {
            // InternalXMachine.g:317:2: ( ( rule__XWitness__Group__0 ) )
            // InternalXMachine.g:318:3: ( rule__XWitness__Group__0 )
            {
             before(grammarAccess.getXWitnessAccess().getGroup()); 
            // InternalXMachine.g:319:3: ( rule__XWitness__Group__0 )
            // InternalXMachine.g:319:4: rule__XWitness__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getGroup()); 

            }


            }

        }
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
    // InternalXMachine.g:328:1: entryRuleXAction : ruleXAction EOF ;
    public final void entryRuleXAction() throws RecognitionException {
        try {
            // InternalXMachine.g:329:1: ( ruleXAction EOF )
            // InternalXMachine.g:330:1: ruleXAction EOF
            {
             before(grammarAccess.getXActionRule()); 
            pushFollow(FOLLOW_1);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:337:1: ruleXAction : ( ( rule__XAction__Group__0 ) ) ;
    public final void ruleXAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:341:2: ( ( ( rule__XAction__Group__0 ) ) )
            // InternalXMachine.g:342:2: ( ( rule__XAction__Group__0 ) )
            {
            // InternalXMachine.g:342:2: ( ( rule__XAction__Group__0 ) )
            // InternalXMachine.g:343:3: ( rule__XAction__Group__0 )
            {
             before(grammarAccess.getXActionAccess().getGroup()); 
            // InternalXMachine.g:344:3: ( rule__XAction__Group__0 )
            // InternalXMachine.g:344:4: rule__XAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleXPredicate"
    // InternalXMachine.g:353:1: entryRuleXPredicate : ruleXPredicate EOF ;
    public final void entryRuleXPredicate() throws RecognitionException {
        try {
            // InternalXMachine.g:354:1: ( ruleXPredicate EOF )
            // InternalXMachine.g:355:1: ruleXPredicate EOF
            {
             before(grammarAccess.getXPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleXPredicate"


    // $ANTLR start "ruleXPredicate"
    // InternalXMachine.g:362:1: ruleXPredicate : ( ( ( rule__XPredicate__Alternatives ) ) ( ( rule__XPredicate__Alternatives )* ) ) ;
    public final void ruleXPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:366:2: ( ( ( ( rule__XPredicate__Alternatives ) ) ( ( rule__XPredicate__Alternatives )* ) ) )
            // InternalXMachine.g:367:2: ( ( ( rule__XPredicate__Alternatives ) ) ( ( rule__XPredicate__Alternatives )* ) )
            {
            // InternalXMachine.g:367:2: ( ( ( rule__XPredicate__Alternatives ) ) ( ( rule__XPredicate__Alternatives )* ) )
            // InternalXMachine.g:368:3: ( ( rule__XPredicate__Alternatives ) ) ( ( rule__XPredicate__Alternatives )* )
            {
            // InternalXMachine.g:368:3: ( ( rule__XPredicate__Alternatives ) )
            // InternalXMachine.g:369:4: ( rule__XPredicate__Alternatives )
            {
             before(grammarAccess.getXPredicateAccess().getAlternatives()); 
            // InternalXMachine.g:370:4: ( rule__XPredicate__Alternatives )
            // InternalXMachine.g:370:5: rule__XPredicate__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__XPredicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXPredicateAccess().getAlternatives()); 

            }

            // InternalXMachine.g:373:3: ( ( rule__XPredicate__Alternatives )* )
            // InternalXMachine.g:374:4: ( rule__XPredicate__Alternatives )*
            {
             before(grammarAccess.getXPredicateAccess().getAlternatives()); 
            // InternalXMachine.g:375:4: ( rule__XPredicate__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=12 && LA1_0<=109)||LA1_0==131) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXMachine.g:375:5: rule__XPredicate__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__XPredicate__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getXPredicateAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXPredicate"


    // $ANTLR start "entryRuleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXMachine.g:385:1: entryRuleEVENTB_IDENTIFIER_KEYWORD : ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final void entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        try {
            // InternalXMachine.g:386:1: ( ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXMachine.g:387:1: ruleEVENTB_IDENTIFIER_KEYWORD EOF
            {
             before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            pushFollow(FOLLOW_1);
            ruleEVENTB_IDENTIFIER_KEYWORD();

            state._fsp--;

             after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:394:1: ruleEVENTB_IDENTIFIER_KEYWORD : ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) ;
    public final void ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:398:2: ( ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) )
            // InternalXMachine.g:399:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            {
            // InternalXMachine.g:399:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            // InternalXMachine.g:400:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            {
             before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            // InternalXMachine.g:401:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            // InternalXMachine.g:401:4: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalXMachine.g:410:1: entryRuleEVENTB_PREDICATE_SYMBOLS : ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final void entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        try {
            // InternalXMachine.g:411:1: ( ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXMachine.g:412:1: ruleEVENTB_PREDICATE_SYMBOLS EOF
            {
             before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            pushFollow(FOLLOW_1);
            ruleEVENTB_PREDICATE_SYMBOLS();

            state._fsp--;

             after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:419:1: ruleEVENTB_PREDICATE_SYMBOLS : ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:423:2: ( ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) )
            // InternalXMachine.g:424:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            {
            // InternalXMachine.g:424:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            // InternalXMachine.g:425:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            // InternalXMachine.g:426:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            // InternalXMachine.g:426:4: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_PREDICATE_SYMBOLS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalXMachine.g:435:1: entryRuleEVENTB_EXPRESSION_SYMBOLS : ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final void entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        try {
            // InternalXMachine.g:436:1: ( ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXMachine.g:437:1: ruleEVENTB_EXPRESSION_SYMBOLS EOF
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            pushFollow(FOLLOW_1);
            ruleEVENTB_EXPRESSION_SYMBOLS();

            state._fsp--;

             after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXMachine.g:444:1: ruleEVENTB_EXPRESSION_SYMBOLS : ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:448:2: ( ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) )
            // InternalXMachine.g:449:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            {
            // InternalXMachine.g:449:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            // InternalXMachine.g:450:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            // InternalXMachine.g:451:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            // InternalXMachine.g:451:4: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalXMachine.g:460:1: ruleXConvergence : ( ( rule__XConvergence__Alternatives ) ) ;
    public final void ruleXConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:464:1: ( ( ( rule__XConvergence__Alternatives ) ) )
            // InternalXMachine.g:465:2: ( ( rule__XConvergence__Alternatives ) )
            {
            // InternalXMachine.g:465:2: ( ( rule__XConvergence__Alternatives ) )
            // InternalXMachine.g:466:3: ( rule__XConvergence__Alternatives )
            {
             before(grammarAccess.getXConvergenceAccess().getAlternatives()); 
            // InternalXMachine.g:467:3: ( rule__XConvergence__Alternatives )
            // InternalXMachine.g:467:4: rule__XConvergence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XConvergence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXConvergenceAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalXMachine.g:475:1: rule__Machine__CommentAlternatives_1_0 : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Machine__CommentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:479:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ML_COMMENT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:480:2: ( RULE_ML_COMMENT )
                    {
                    // InternalXMachine.g:480:2: ( RULE_ML_COMMENT )
                    // InternalXMachine.g:481:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getMachineAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:486:2: ( RULE_SL_COMMENT )
                    {
                    // InternalXMachine.g:486:2: ( RULE_SL_COMMENT )
                    // InternalXMachine.g:487:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getMachineAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 

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


    // $ANTLR start "rule__XEvent__Alternatives_5"
    // InternalXMachine.g:496:1: rule__XEvent__Alternatives_5 : ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) | ( ( rule__XEvent__Group_5_2__0 ) ) );
    public final void rule__XEvent__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:500:1: ( ( ( rule__XEvent__Group_5_0__0 ) ) | ( ( rule__XEvent__Group_5_1__0 ) ) | ( ( rule__XEvent__Group_5_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 124:
            case 125:
                {
                alt3=1;
                }
                break;
            case 126:
                {
                alt3=2;
                }
                break;
            case 128:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXMachine.g:501:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    {
                    // InternalXMachine.g:501:2: ( ( rule__XEvent__Group_5_0__0 ) )
                    // InternalXMachine.g:502:3: ( rule__XEvent__Group_5_0__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_0()); 
                    // InternalXMachine.g:503:3: ( rule__XEvent__Group_5_0__0 )
                    // InternalXMachine.g:503:4: rule__XEvent__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:507:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    {
                    // InternalXMachine.g:507:2: ( ( rule__XEvent__Group_5_1__0 ) )
                    // InternalXMachine.g:508:3: ( rule__XEvent__Group_5_1__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_1()); 
                    // InternalXMachine.g:509:3: ( rule__XEvent__Group_5_1__0 )
                    // InternalXMachine.g:509:4: rule__XEvent__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:513:2: ( ( rule__XEvent__Group_5_2__0 ) )
                    {
                    // InternalXMachine.g:513:2: ( ( rule__XEvent__Group_5_2__0 ) )
                    // InternalXMachine.g:514:3: ( rule__XEvent__Group_5_2__0 )
                    {
                     before(grammarAccess.getXEventAccess().getGroup_5_2()); 
                    // InternalXMachine.g:515:3: ( rule__XEvent__Group_5_2__0 )
                    // InternalXMachine.g:515:4: rule__XEvent__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getGroup_5_2()); 

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


    // $ANTLR start "rule__XPredicate__Alternatives"
    // InternalXMachine.g:523:1: rule__XPredicate__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__XPredicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:527:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 12:
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
                {
                alt4=1;
                }
                break;
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
                {
                alt4=2;
                }
                break;
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
            case 131:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            case RULE_INT:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXMachine.g:528:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXMachine.g:528:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXMachine.g:529:3: ruleEVENTB_IDENTIFIER_KEYWORD
                    {
                     before(grammarAccess.getXPredicateAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_IDENTIFIER_KEYWORD();

                    state._fsp--;

                     after(grammarAccess.getXPredicateAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:534:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXMachine.g:534:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXMachine.g:535:3: ruleEVENTB_PREDICATE_SYMBOLS
                    {
                     before(grammarAccess.getXPredicateAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_PREDICATE_SYMBOLS();

                    state._fsp--;

                     after(grammarAccess.getXPredicateAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:540:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXMachine.g:540:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXMachine.g:541:3: ruleEVENTB_EXPRESSION_SYMBOLS
                    {
                     before(grammarAccess.getXPredicateAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_EXPRESSION_SYMBOLS();

                    state._fsp--;

                     after(grammarAccess.getXPredicateAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:546:2: ( RULE_ID )
                    {
                    // InternalXMachine.g:546:2: ( RULE_ID )
                    // InternalXMachine.g:547:3: RULE_ID
                    {
                     before(grammarAccess.getXPredicateAccess().getIDTerminalRuleCall_3()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getXPredicateAccess().getIDTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:552:2: ( RULE_INT )
                    {
                    // InternalXMachine.g:552:2: ( RULE_INT )
                    // InternalXMachine.g:553:3: RULE_INT
                    {
                     before(grammarAccess.getXPredicateAccess().getINTTerminalRuleCall_4()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getXPredicateAccess().getINTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__XPredicate__Alternatives"


    // $ANTLR start "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives"
    // InternalXMachine.g:562:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:566:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
            int alt5=23;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
                {
                alt5=6;
                }
                break;
            case 18:
                {
                alt5=7;
                }
                break;
            case 19:
                {
                alt5=8;
                }
                break;
            case 20:
                {
                alt5=9;
                }
                break;
            case 21:
                {
                alt5=10;
                }
                break;
            case 22:
                {
                alt5=11;
                }
                break;
            case 23:
                {
                alt5=12;
                }
                break;
            case 24:
                {
                alt5=13;
                }
                break;
            case 25:
                {
                alt5=14;
                }
                break;
            case 26:
                {
                alt5=15;
                }
                break;
            case 27:
                {
                alt5=16;
                }
                break;
            case 28:
                {
                alt5=17;
                }
                break;
            case 29:
                {
                alt5=18;
                }
                break;
            case 30:
                {
                alt5=19;
                }
                break;
            case 31:
                {
                alt5=20;
                }
                break;
            case 32:
                {
                alt5=21;
                }
                break;
            case 33:
                {
                alt5=22;
                }
                break;
            case 34:
                {
                alt5=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXMachine.g:567:2: ( 'BOOL' )
                    {
                    // InternalXMachine.g:567:2: ( 'BOOL' )
                    // InternalXMachine.g:568:3: 'BOOL'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:573:2: ( 'FALSE' )
                    {
                    // InternalXMachine.g:573:2: ( 'FALSE' )
                    // InternalXMachine.g:574:3: 'FALSE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:579:2: ( 'TRUE' )
                    {
                    // InternalXMachine.g:579:2: ( 'TRUE' )
                    // InternalXMachine.g:580:3: 'TRUE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:585:2: ( 'bool' )
                    {
                    // InternalXMachine.g:585:2: ( 'bool' )
                    // InternalXMachine.g:586:3: 'bool'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:591:2: ( 'card' )
                    {
                    // InternalXMachine.g:591:2: ( 'card' )
                    // InternalXMachine.g:592:3: 'card'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:597:2: ( 'dom' )
                    {
                    // InternalXMachine.g:597:2: ( 'dom' )
                    // InternalXMachine.g:598:3: 'dom'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:603:2: ( 'finite' )
                    {
                    // InternalXMachine.g:603:2: ( 'finite' )
                    // InternalXMachine.g:604:3: 'finite'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:609:2: ( 'id' )
                    {
                    // InternalXMachine.g:609:2: ( 'id' )
                    // InternalXMachine.g:610:3: 'id'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:615:2: ( 'inter' )
                    {
                    // InternalXMachine.g:615:2: ( 'inter' )
                    // InternalXMachine.g:616:3: 'inter'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:621:2: ( 'max' )
                    {
                    // InternalXMachine.g:621:2: ( 'max' )
                    // InternalXMachine.g:622:3: 'max'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:627:2: ( 'min' )
                    {
                    // InternalXMachine.g:627:2: ( 'min' )
                    // InternalXMachine.g:628:3: 'min'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:633:2: ( 'mod' )
                    {
                    // InternalXMachine.g:633:2: ( 'mod' )
                    // InternalXMachine.g:634:3: 'mod'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:639:2: ( 'pred' )
                    {
                    // InternalXMachine.g:639:2: ( 'pred' )
                    // InternalXMachine.g:640:3: 'pred'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:645:2: ( 'prj1' )
                    {
                    // InternalXMachine.g:645:2: ( 'prj1' )
                    // InternalXMachine.g:646:3: 'prj1'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:651:2: ( 'prj2' )
                    {
                    // InternalXMachine.g:651:2: ( 'prj2' )
                    // InternalXMachine.g:652:3: 'prj2'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:657:2: ( 'ran' )
                    {
                    // InternalXMachine.g:657:2: ( 'ran' )
                    // InternalXMachine.g:658:3: 'ran'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:663:2: ( 'succ' )
                    {
                    // InternalXMachine.g:663:2: ( 'succ' )
                    // InternalXMachine.g:664:3: 'succ'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:669:2: ( 'union' )
                    {
                    // InternalXMachine.g:669:2: ( 'union' )
                    // InternalXMachine.g:670:3: 'union'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:675:2: ( '\\u21151' )
                    {
                    // InternalXMachine.g:675:2: ( '\\u21151' )
                    // InternalXMachine.g:676:3: '\\u21151'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:681:2: ( '\\u2115' )
                    {
                    // InternalXMachine.g:681:2: ( '\\u2115' )
                    // InternalXMachine.g:682:3: '\\u2115'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:687:2: ( '\\u21191' )
                    {
                    // InternalXMachine.g:687:2: ( '\\u21191' )
                    // InternalXMachine.g:688:3: '\\u21191'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:693:2: ( '\\u2119' )
                    {
                    // InternalXMachine.g:693:2: ( '\\u2119' )
                    // InternalXMachine.g:694:3: '\\u2119'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:699:2: ( '\\u2124' )
                    {
                    // InternalXMachine.g:699:2: ( '\\u2124' )
                    // InternalXMachine.g:700:3: '\\u2124'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 

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
    // InternalXMachine.g:709:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:713:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
            int alt6=31;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 38:
                {
                alt6=4;
                }
                break;
            case 39:
                {
                alt6=5;
                }
                break;
            case 40:
                {
                alt6=6;
                }
                break;
            case 41:
                {
                alt6=7;
                }
                break;
            case 42:
                {
                alt6=8;
                }
                break;
            case 43:
                {
                alt6=9;
                }
                break;
            case 44:
                {
                alt6=10;
                }
                break;
            case 45:
                {
                alt6=11;
                }
                break;
            case 46:
                {
                alt6=12;
                }
                break;
            case 47:
                {
                alt6=13;
                }
                break;
            case 48:
                {
                alt6=14;
                }
                break;
            case 49:
                {
                alt6=15;
                }
                break;
            case 50:
                {
                alt6=16;
                }
                break;
            case 51:
                {
                alt6=17;
                }
                break;
            case 52:
                {
                alt6=18;
                }
                break;
            case 53:
                {
                alt6=19;
                }
                break;
            case 54:
                {
                alt6=20;
                }
                break;
            case 55:
                {
                alt6=21;
                }
                break;
            case 56:
                {
                alt6=22;
                }
                break;
            case 57:
                {
                alt6=23;
                }
                break;
            case 58:
                {
                alt6=24;
                }
                break;
            case 59:
                {
                alt6=25;
                }
                break;
            case 60:
                {
                alt6=26;
                }
                break;
            case 61:
                {
                alt6=27;
                }
                break;
            case 62:
                {
                alt6=28;
                }
                break;
            case 63:
                {
                alt6=29;
                }
                break;
            case 64:
                {
                alt6=30;
                }
                break;
            case 65:
                {
                alt6=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXMachine.g:714:2: ( '(' )
                    {
                    // InternalXMachine.g:714:2: ( '(' )
                    // InternalXMachine.g:715:3: '('
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:720:2: ( ')' )
                    {
                    // InternalXMachine.g:720:2: ( ')' )
                    // InternalXMachine.g:721:3: ')'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:726:2: ( '\\u21D4' )
                    {
                    // InternalXMachine.g:726:2: ( '\\u21D4' )
                    // InternalXMachine.g:727:3: '\\u21D4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:732:2: ( '\\u21D2' )
                    {
                    // InternalXMachine.g:732:2: ( '\\u21D2' )
                    // InternalXMachine.g:733:3: '\\u21D2'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:738:2: ( '\\u2227' )
                    {
                    // InternalXMachine.g:738:2: ( '\\u2227' )
                    // InternalXMachine.g:739:3: '\\u2227'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:744:2: ( '&' )
                    {
                    // InternalXMachine.g:744:2: ( '&' )
                    // InternalXMachine.g:745:3: '&'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:750:2: ( '\\u2228' )
                    {
                    // InternalXMachine.g:750:2: ( '\\u2228' )
                    // InternalXMachine.g:751:3: '\\u2228'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:756:2: ( '\\u00AC' )
                    {
                    // InternalXMachine.g:756:2: ( '\\u00AC' )
                    // InternalXMachine.g:757:3: '\\u00AC'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:762:2: ( '\\u22A4' )
                    {
                    // InternalXMachine.g:762:2: ( '\\u22A4' )
                    // InternalXMachine.g:763:3: '\\u22A4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:768:2: ( '\\u22A5' )
                    {
                    // InternalXMachine.g:768:2: ( '\\u22A5' )
                    // InternalXMachine.g:769:3: '\\u22A5'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:774:2: ( '\\u2200' )
                    {
                    // InternalXMachine.g:774:2: ( '\\u2200' )
                    // InternalXMachine.g:775:3: '\\u2200'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:780:2: ( '!' )
                    {
                    // InternalXMachine.g:780:2: ( '!' )
                    // InternalXMachine.g:781:3: '!'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:786:2: ( '\\u2203' )
                    {
                    // InternalXMachine.g:786:2: ( '\\u2203' )
                    // InternalXMachine.g:787:3: '\\u2203'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:792:2: ( '#' )
                    {
                    // InternalXMachine.g:792:2: ( '#' )
                    // InternalXMachine.g:793:3: '#'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:798:2: ( ',' )
                    {
                    // InternalXMachine.g:798:2: ( ',' )
                    // InternalXMachine.g:799:3: ','
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:804:2: ( '\\u00B7' )
                    {
                    // InternalXMachine.g:804:2: ( '\\u00B7' )
                    // InternalXMachine.g:805:3: '\\u00B7'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:810:2: ( '.' )
                    {
                    // InternalXMachine.g:810:2: ( '.' )
                    // InternalXMachine.g:811:3: '.'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:816:2: ( '=' )
                    {
                    // InternalXMachine.g:816:2: ( '=' )
                    // InternalXMachine.g:817:3: '='
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:822:2: ( '\\u2260' )
                    {
                    // InternalXMachine.g:822:2: ( '\\u2260' )
                    // InternalXMachine.g:823:3: '\\u2260'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:828:2: ( '\\u2264' )
                    {
                    // InternalXMachine.g:828:2: ( '\\u2264' )
                    // InternalXMachine.g:829:3: '\\u2264'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:834:2: ( '<' )
                    {
                    // InternalXMachine.g:834:2: ( '<' )
                    // InternalXMachine.g:835:3: '<'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:840:2: ( '\\u2265' )
                    {
                    // InternalXMachine.g:840:2: ( '\\u2265' )
                    // InternalXMachine.g:841:3: '\\u2265'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:846:2: ( '>' )
                    {
                    // InternalXMachine.g:846:2: ( '>' )
                    // InternalXMachine.g:847:3: '>'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:852:2: ( '\\u2208' )
                    {
                    // InternalXMachine.g:852:2: ( '\\u2208' )
                    // InternalXMachine.g:853:3: '\\u2208'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:858:2: ( ':' )
                    {
                    // InternalXMachine.g:858:2: ( ':' )
                    // InternalXMachine.g:859:3: ':'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:864:2: ( '\\u2209' )
                    {
                    // InternalXMachine.g:864:2: ( '\\u2209' )
                    // InternalXMachine.g:865:3: '\\u2209'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:870:2: ( '\\u2282' )
                    {
                    // InternalXMachine.g:870:2: ( '\\u2282' )
                    // InternalXMachine.g:871:3: '\\u2282'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:876:2: ( '\\u2284' )
                    {
                    // InternalXMachine.g:876:2: ( '\\u2284' )
                    // InternalXMachine.g:877:3: '\\u2284'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:882:2: ( '\\u2286' )
                    {
                    // InternalXMachine.g:882:2: ( '\\u2286' )
                    // InternalXMachine.g:883:3: '\\u2286'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:888:2: ( '\\u2288' )
                    {
                    // InternalXMachine.g:888:2: ( '\\u2288' )
                    // InternalXMachine.g:889:3: '\\u2288'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:894:2: ( 'partition' )
                    {
                    // InternalXMachine.g:894:2: ( 'partition' )
                    // InternalXMachine.g:895:3: 'partition'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 

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
    // InternalXMachine.g:904:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:908:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
            int alt7=45;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt7=1;
                }
                break;
            case 67:
                {
                alt7=2;
                }
                break;
            case 68:
                {
                alt7=3;
                }
                break;
            case 69:
                {
                alt7=4;
                }
                break;
            case 70:
                {
                alt7=5;
                }
                break;
            case 71:
                {
                alt7=6;
                }
                break;
            case 72:
                {
                alt7=7;
                }
                break;
            case 73:
                {
                alt7=8;
                }
                break;
            case 74:
                {
                alt7=9;
                }
                break;
            case 75:
                {
                alt7=10;
                }
                break;
            case 76:
                {
                alt7=11;
                }
                break;
            case 77:
                {
                alt7=12;
                }
                break;
            case 78:
                {
                alt7=13;
                }
                break;
            case 79:
                {
                alt7=14;
                }
                break;
            case 80:
                {
                alt7=15;
                }
                break;
            case 81:
                {
                alt7=16;
                }
                break;
            case 82:
                {
                alt7=17;
                }
                break;
            case 83:
                {
                alt7=18;
                }
                break;
            case 84:
                {
                alt7=19;
                }
                break;
            case 85:
                {
                alt7=20;
                }
                break;
            case 86:
                {
                alt7=21;
                }
                break;
            case 87:
                {
                alt7=22;
                }
                break;
            case 88:
                {
                alt7=23;
                }
                break;
            case 89:
                {
                alt7=24;
                }
                break;
            case 90:
                {
                alt7=25;
                }
                break;
            case 91:
                {
                alt7=26;
                }
                break;
            case 92:
                {
                alt7=27;
                }
                break;
            case 93:
                {
                alt7=28;
                }
                break;
            case 94:
                {
                alt7=29;
                }
                break;
            case 95:
                {
                alt7=30;
                }
                break;
            case 96:
                {
                alt7=31;
                }
                break;
            case 97:
                {
                alt7=32;
                }
                break;
            case 131:
                {
                alt7=33;
                }
                break;
            case 98:
                {
                alt7=34;
                }
                break;
            case 99:
                {
                alt7=35;
                }
                break;
            case 100:
                {
                alt7=36;
                }
                break;
            case 101:
                {
                alt7=37;
                }
                break;
            case 102:
                {
                alt7=38;
                }
                break;
            case 103:
                {
                alt7=39;
                }
                break;
            case 104:
                {
                alt7=40;
                }
                break;
            case 105:
                {
                alt7=41;
                }
                break;
            case 106:
                {
                alt7=42;
                }
                break;
            case 107:
                {
                alt7=43;
                }
                break;
            case 108:
                {
                alt7=44;
                }
                break;
            case 109:
                {
                alt7=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:909:2: ( '\\u2194' )
                    {
                    // InternalXMachine.g:909:2: ( '\\u2194' )
                    // InternalXMachine.g:910:3: '\\u2194'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:915:2: ( '\\uE100' )
                    {
                    // InternalXMachine.g:915:2: ( '\\uE100' )
                    // InternalXMachine.g:916:3: '\\uE100'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:921:2: ( '\\uE101' )
                    {
                    // InternalXMachine.g:921:2: ( '\\uE101' )
                    // InternalXMachine.g:922:3: '\\uE101'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXMachine.g:927:2: ( '\\uE102' )
                    {
                    // InternalXMachine.g:927:2: ( '\\uE102' )
                    // InternalXMachine.g:928:3: '\\uE102'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    match(input,69,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXMachine.g:933:2: ( '\\u21F8' )
                    {
                    // InternalXMachine.g:933:2: ( '\\u21F8' )
                    // InternalXMachine.g:934:3: '\\u21F8'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    match(input,70,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXMachine.g:939:2: ( '\\u2192' )
                    {
                    // InternalXMachine.g:939:2: ( '\\u2192' )
                    // InternalXMachine.g:940:3: '\\u2192'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    match(input,71,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXMachine.g:945:2: ( '\\u2914' )
                    {
                    // InternalXMachine.g:945:2: ( '\\u2914' )
                    // InternalXMachine.g:946:3: '\\u2914'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    match(input,72,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXMachine.g:951:2: ( '\\u21A3' )
                    {
                    // InternalXMachine.g:951:2: ( '\\u21A3' )
                    // InternalXMachine.g:952:3: '\\u21A3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,73,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXMachine.g:957:2: ( '\\u2900' )
                    {
                    // InternalXMachine.g:957:2: ( '\\u2900' )
                    // InternalXMachine.g:958:3: '\\u2900'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,74,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXMachine.g:963:2: ( '\\u21A0' )
                    {
                    // InternalXMachine.g:963:2: ( '\\u21A0' )
                    // InternalXMachine.g:964:3: '\\u21A0'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    match(input,75,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXMachine.g:969:2: ( '\\u2916' )
                    {
                    // InternalXMachine.g:969:2: ( '\\u2916' )
                    // InternalXMachine.g:970:3: '\\u2916'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    match(input,76,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXMachine.g:975:2: ( '{' )
                    {
                    // InternalXMachine.g:975:2: ( '{' )
                    // InternalXMachine.g:976:3: '{'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    match(input,77,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXMachine.g:981:2: ( '}' )
                    {
                    // InternalXMachine.g:981:2: ( '}' )
                    // InternalXMachine.g:982:3: '}'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    match(input,78,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXMachine.g:987:2: ( '\\u21A6' )
                    {
                    // InternalXMachine.g:987:2: ( '\\u21A6' )
                    // InternalXMachine.g:988:3: '\\u21A6'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    match(input,79,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXMachine.g:993:2: ( '\\u2205' )
                    {
                    // InternalXMachine.g:993:2: ( '\\u2205' )
                    // InternalXMachine.g:994:3: '\\u2205'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    match(input,80,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXMachine.g:999:2: ( '\\u2229' )
                    {
                    // InternalXMachine.g:999:2: ( '\\u2229' )
                    // InternalXMachine.g:1000:3: '\\u2229'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    match(input,81,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXMachine.g:1005:2: ( '\\u222A' )
                    {
                    // InternalXMachine.g:1005:2: ( '\\u222A' )
                    // InternalXMachine.g:1006:3: '\\u222A'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    match(input,82,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXMachine.g:1011:2: ( '\\u2216' )
                    {
                    // InternalXMachine.g:1011:2: ( '\\u2216' )
                    // InternalXMachine.g:1012:3: '\\u2216'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    match(input,83,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXMachine.g:1017:2: ( '\\u00D7' )
                    {
                    // InternalXMachine.g:1017:2: ( '\\u00D7' )
                    // InternalXMachine.g:1018:3: '\\u00D7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    match(input,84,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXMachine.g:1023:2: ( '[' )
                    {
                    // InternalXMachine.g:1023:2: ( '[' )
                    // InternalXMachine.g:1024:3: '['
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    match(input,85,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXMachine.g:1029:2: ( ']' )
                    {
                    // InternalXMachine.g:1029:2: ( ']' )
                    // InternalXMachine.g:1030:3: ']'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    match(input,86,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXMachine.g:1035:2: ( '\\uE103' )
                    {
                    // InternalXMachine.g:1035:2: ( '\\uE103' )
                    // InternalXMachine.g:1036:3: '\\uE103'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    match(input,87,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXMachine.g:1041:2: ( '\\u2218' )
                    {
                    // InternalXMachine.g:1041:2: ( '\\u2218' )
                    // InternalXMachine.g:1042:3: '\\u2218'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    match(input,88,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalXMachine.g:1047:2: ( ';' )
                    {
                    // InternalXMachine.g:1047:2: ( ';' )
                    // InternalXMachine.g:1048:3: ';'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    match(input,89,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalXMachine.g:1053:2: ( '\\u2297' )
                    {
                    // InternalXMachine.g:1053:2: ( '\\u2297' )
                    // InternalXMachine.g:1054:3: '\\u2297'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    match(input,90,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalXMachine.g:1059:2: ( '\\u2225' )
                    {
                    // InternalXMachine.g:1059:2: ( '\\u2225' )
                    // InternalXMachine.g:1060:3: '\\u2225'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    match(input,91,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalXMachine.g:1065:2: ( '\\u223C' )
                    {
                    // InternalXMachine.g:1065:2: ( '\\u223C' )
                    // InternalXMachine.g:1066:3: '\\u223C'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    match(input,92,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalXMachine.g:1071:2: ( '\\u25C1' )
                    {
                    // InternalXMachine.g:1071:2: ( '\\u25C1' )
                    // InternalXMachine.g:1072:3: '\\u25C1'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    match(input,93,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalXMachine.g:1077:2: ( '\\u2A64' )
                    {
                    // InternalXMachine.g:1077:2: ( '\\u2A64' )
                    // InternalXMachine.g:1078:3: '\\u2A64'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    match(input,94,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalXMachine.g:1083:2: ( '\\u25B7' )
                    {
                    // InternalXMachine.g:1083:2: ( '\\u25B7' )
                    // InternalXMachine.g:1084:3: '\\u25B7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    match(input,95,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalXMachine.g:1089:2: ( '\\u2A65' )
                    {
                    // InternalXMachine.g:1089:2: ( '\\u2A65' )
                    // InternalXMachine.g:1090:3: '\\u2A65'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    match(input,96,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalXMachine.g:1095:2: ( '\\u03BB' )
                    {
                    // InternalXMachine.g:1095:2: ( '\\u03BB' )
                    // InternalXMachine.g:1096:3: '\\u03BB'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    match(input,97,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalXMachine.g:1101:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalXMachine.g:1101:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalXMachine.g:1102:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    // InternalXMachine.g:1103:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalXMachine.g:1103:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalXMachine.g:1107:2: ( '\\u22C3' )
                    {
                    // InternalXMachine.g:1107:2: ( '\\u22C3' )
                    // InternalXMachine.g:1108:3: '\\u22C3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    match(input,98,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalXMachine.g:1113:2: ( '\\u2223' )
                    {
                    // InternalXMachine.g:1113:2: ( '\\u2223' )
                    // InternalXMachine.g:1114:3: '\\u2223'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    match(input,99,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalXMachine.g:1119:2: ( '\\u2025' )
                    {
                    // InternalXMachine.g:1119:2: ( '\\u2025' )
                    // InternalXMachine.g:1120:3: '\\u2025'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    match(input,100,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalXMachine.g:1125:2: ( '+' )
                    {
                    // InternalXMachine.g:1125:2: ( '+' )
                    // InternalXMachine.g:1126:3: '+'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    match(input,101,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalXMachine.g:1131:2: ( '\\u2212' )
                    {
                    // InternalXMachine.g:1131:2: ( '\\u2212' )
                    // InternalXMachine.g:1132:3: '\\u2212'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    match(input,102,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalXMachine.g:1137:2: ( '-' )
                    {
                    // InternalXMachine.g:1137:2: ( '-' )
                    // InternalXMachine.g:1138:3: '-'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    match(input,103,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalXMachine.g:1143:2: ( '\\u2217' )
                    {
                    // InternalXMachine.g:1143:2: ( '\\u2217' )
                    // InternalXMachine.g:1144:3: '\\u2217'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    match(input,104,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalXMachine.g:1149:2: ( '*' )
                    {
                    // InternalXMachine.g:1149:2: ( '*' )
                    // InternalXMachine.g:1150:3: '*'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    match(input,105,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalXMachine.g:1155:2: ( '\\u00F7' )
                    {
                    // InternalXMachine.g:1155:2: ( '\\u00F7' )
                    // InternalXMachine.g:1156:3: '\\u00F7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    match(input,106,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalXMachine.g:1161:2: ( '/' )
                    {
                    // InternalXMachine.g:1161:2: ( '/' )
                    // InternalXMachine.g:1162:3: '/'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    match(input,107,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalXMachine.g:1167:2: ( '^' )
                    {
                    // InternalXMachine.g:1167:2: ( '^' )
                    // InternalXMachine.g:1168:3: '^'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    match(input,108,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalXMachine.g:1173:2: ( '\\\\' )
                    {
                    // InternalXMachine.g:1173:2: ( '\\\\' )
                    // InternalXMachine.g:1174:3: '\\\\'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
                    match(input,109,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 

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
    // InternalXMachine.g:1183:1: rule__XConvergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__XConvergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1187:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt8=1;
                }
                break;
            case 111:
                {
                alt8=2;
                }
                break;
            case 112:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXMachine.g:1188:2: ( ( 'ordinary' ) )
                    {
                    // InternalXMachine.g:1188:2: ( ( 'ordinary' ) )
                    // InternalXMachine.g:1189:3: ( 'ordinary' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    // InternalXMachine.g:1190:3: ( 'ordinary' )
                    // InternalXMachine.g:1190:4: 'ordinary'
                    {
                    match(input,110,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:1194:2: ( ( 'convergent' ) )
                    {
                    // InternalXMachine.g:1194:2: ( ( 'convergent' ) )
                    // InternalXMachine.g:1195:3: ( 'convergent' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    // InternalXMachine.g:1196:3: ( 'convergent' )
                    // InternalXMachine.g:1196:4: 'convergent'
                    {
                    match(input,111,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMachine.g:1200:2: ( ( 'anticipated' ) )
                    {
                    // InternalXMachine.g:1200:2: ( ( 'anticipated' ) )
                    // InternalXMachine.g:1201:3: ( 'anticipated' )
                    {
                     before(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    // InternalXMachine.g:1202:3: ( 'anticipated' )
                    // InternalXMachine.g:1202:4: 'anticipated'
                    {
                    match(input,112,FOLLOW_2); 

                    }

                     after(grammarAccess.getXConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 

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
    // InternalXMachine.g:1210:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1214:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXMachine.g:1215:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1222:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1226:1: ( ( () ) )
            // InternalXMachine.g:1227:1: ( () )
            {
            // InternalXMachine.g:1227:1: ( () )
            // InternalXMachine.g:1228:2: ()
            {
             before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            // InternalXMachine.g:1229:2: ()
            // InternalXMachine.g:1229:3: 
            {
            }

             after(grammarAccess.getMachineAccess().getMachineAction_0()); 

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
    // InternalXMachine.g:1237:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1241:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXMachine.g:1242:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1249:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__CommentAssignment_1 )? ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1253:1: ( ( ( rule__Machine__CommentAssignment_1 )? ) )
            // InternalXMachine.g:1254:1: ( ( rule__Machine__CommentAssignment_1 )? )
            {
            // InternalXMachine.g:1254:1: ( ( rule__Machine__CommentAssignment_1 )? )
            // InternalXMachine.g:1255:2: ( rule__Machine__CommentAssignment_1 )?
            {
             before(grammarAccess.getMachineAccess().getCommentAssignment_1()); 
            // InternalXMachine.g:1256:2: ( rule__Machine__CommentAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ML_COMMENT && LA9_0<=RULE_SL_COMMENT)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMachine.g:1256:3: rule__Machine__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getCommentAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1264:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1268:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXMachine.g:1269:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1276:1: rule__Machine__Group__2__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1280:1: ( ( 'machine' ) )
            // InternalXMachine.g:1281:1: ( 'machine' )
            {
            // InternalXMachine.g:1281:1: ( 'machine' )
            // InternalXMachine.g:1282:2: 'machine'
            {
             before(grammarAccess.getMachineAccess().getMachineKeyword_2()); 
            match(input,113,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getMachineKeyword_2()); 

            }


            }

        }
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
    // InternalXMachine.g:1291:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1295:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXMachine.g:1296:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__4();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1303:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__NameAssignment_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1307:1: ( ( ( rule__Machine__NameAssignment_3 ) ) )
            // InternalXMachine.g:1308:1: ( ( rule__Machine__NameAssignment_3 ) )
            {
            // InternalXMachine.g:1308:1: ( ( rule__Machine__NameAssignment_3 ) )
            // InternalXMachine.g:1309:2: ( rule__Machine__NameAssignment_3 )
            {
             before(grammarAccess.getMachineAccess().getNameAssignment_3()); 
            // InternalXMachine.g:1310:2: ( rule__Machine__NameAssignment_3 )
            // InternalXMachine.g:1310:3: rule__Machine__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalXMachine.g:1318:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1322:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXMachine.g:1323:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__5();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1330:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__ExtensionsAssignment_4 )* ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1334:1: ( ( ( rule__Machine__ExtensionsAssignment_4 )* ) )
            // InternalXMachine.g:1335:1: ( ( rule__Machine__ExtensionsAssignment_4 )* )
            {
            // InternalXMachine.g:1335:1: ( ( rule__Machine__ExtensionsAssignment_4 )* )
            // InternalXMachine.g:1336:2: ( rule__Machine__ExtensionsAssignment_4 )*
            {
             before(grammarAccess.getMachineAccess().getExtensionsAssignment_4()); 
            // InternalXMachine.g:1337:2: ( rule__Machine__ExtensionsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==121) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXMachine.g:1337:3: rule__Machine__ExtensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Machine__ExtensionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getExtensionsAssignment_4()); 

            }


            }

        }
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
    // InternalXMachine.g:1345:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1349:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXMachine.g:1350:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__6();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1357:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1361:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // InternalXMachine.g:1362:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // InternalXMachine.g:1362:1: ( ( rule__Machine__Group_5__0 )? )
            // InternalXMachine.g:1363:2: ( rule__Machine__Group_5__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_5()); 
            // InternalXMachine.g:1364:2: ( rule__Machine__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==115) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:1364:3: rule__Machine__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalXMachine.g:1372:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1376:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXMachine.g:1377:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__7();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1384:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1388:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // InternalXMachine.g:1389:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // InternalXMachine.g:1389:1: ( ( rule__Machine__Group_6__0 )? )
            // InternalXMachine.g:1390:2: ( rule__Machine__Group_6__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_6()); 
            // InternalXMachine.g:1391:2: ( rule__Machine__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==116) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXMachine.g:1391:3: rule__Machine__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalXMachine.g:1399:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1403:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXMachine.g:1404:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__8();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1411:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1415:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // InternalXMachine.g:1416:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // InternalXMachine.g:1416:1: ( ( rule__Machine__Group_7__0 )? )
            // InternalXMachine.g:1417:2: ( rule__Machine__Group_7__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_7()); 
            // InternalXMachine.g:1418:2: ( rule__Machine__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==117) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXMachine.g:1418:3: rule__Machine__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalXMachine.g:1426:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1430:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // InternalXMachine.g:1431:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__9();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1438:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__Group_8__0 )? ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1442:1: ( ( ( rule__Machine__Group_8__0 )? ) )
            // InternalXMachine.g:1443:1: ( ( rule__Machine__Group_8__0 )? )
            {
            // InternalXMachine.g:1443:1: ( ( rule__Machine__Group_8__0 )? )
            // InternalXMachine.g:1444:2: ( rule__Machine__Group_8__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_8()); 
            // InternalXMachine.g:1445:2: ( rule__Machine__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==118) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMachine.g:1445:3: rule__Machine__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalXMachine.g:1453:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl rule__Machine__Group__10 ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1457:1: ( rule__Machine__Group__9__Impl rule__Machine__Group__10 )
            // InternalXMachine.g:1458:2: rule__Machine__Group__9__Impl rule__Machine__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__10();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1465:1: rule__Machine__Group__9__Impl : ( ( rule__Machine__Group_9__0 )? ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1469:1: ( ( ( rule__Machine__Group_9__0 )? ) )
            // InternalXMachine.g:1470:1: ( ( rule__Machine__Group_9__0 )? )
            {
            // InternalXMachine.g:1470:1: ( ( rule__Machine__Group_9__0 )? )
            // InternalXMachine.g:1471:2: ( rule__Machine__Group_9__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_9()); 
            // InternalXMachine.g:1472:2: ( rule__Machine__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==119) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXMachine.g:1472:3: rule__Machine__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalXMachine.g:1480:1: rule__Machine__Group__10 : rule__Machine__Group__10__Impl rule__Machine__Group__11 ;
    public final void rule__Machine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1484:1: ( rule__Machine__Group__10__Impl rule__Machine__Group__11 )
            // InternalXMachine.g:1485:2: rule__Machine__Group__10__Impl rule__Machine__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Machine__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__11();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1492:1: rule__Machine__Group__10__Impl : ( ( rule__Machine__Group_10__0 )? ) ;
    public final void rule__Machine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1496:1: ( ( ( rule__Machine__Group_10__0 )? ) )
            // InternalXMachine.g:1497:1: ( ( rule__Machine__Group_10__0 )? )
            {
            // InternalXMachine.g:1497:1: ( ( rule__Machine__Group_10__0 )? )
            // InternalXMachine.g:1498:2: ( rule__Machine__Group_10__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_10()); 
            // InternalXMachine.g:1499:2: ( rule__Machine__Group_10__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==120) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMachine.g:1499:3: rule__Machine__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_10()); 

            }


            }

        }
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
    // InternalXMachine.g:1507:1: rule__Machine__Group__11 : rule__Machine__Group__11__Impl ;
    public final void rule__Machine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1511:1: ( rule__Machine__Group__11__Impl )
            // InternalXMachine.g:1512:2: rule__Machine__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__11__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1518:1: rule__Machine__Group__11__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1522:1: ( ( 'end' ) )
            // InternalXMachine.g:1523:1: ( 'end' )
            {
            // InternalXMachine.g:1523:1: ( 'end' )
            // InternalXMachine.g:1524:2: 'end'
            {
             before(grammarAccess.getMachineAccess().getEndKeyword_11()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getEndKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Machine__Group_5__0"
    // InternalXMachine.g:1534:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1538:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // InternalXMachine.g:1539:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1546:1: rule__Machine__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1550:1: ( ( 'refines' ) )
            // InternalXMachine.g:1551:1: ( 'refines' )
            {
            // InternalXMachine.g:1551:1: ( 'refines' )
            // InternalXMachine.g:1552:2: 'refines'
            {
             before(grammarAccess.getMachineAccess().getRefinesKeyword_5_0()); 
            match(input,115,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRefinesKeyword_5_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1561:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1565:1: ( rule__Machine__Group_5__1__Impl )
            // InternalXMachine.g:1566:2: rule__Machine__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1572:1: rule__Machine__Group_5__1__Impl : ( ( rule__Machine__RefinesAssignment_5_1 ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1576:1: ( ( ( rule__Machine__RefinesAssignment_5_1 ) ) )
            // InternalXMachine.g:1577:1: ( ( rule__Machine__RefinesAssignment_5_1 ) )
            {
            // InternalXMachine.g:1577:1: ( ( rule__Machine__RefinesAssignment_5_1 ) )
            // InternalXMachine.g:1578:2: ( rule__Machine__RefinesAssignment_5_1 )
            {
             before(grammarAccess.getMachineAccess().getRefinesAssignment_5_1()); 
            // InternalXMachine.g:1579:2: ( rule__Machine__RefinesAssignment_5_1 )
            // InternalXMachine.g:1579:3: rule__Machine__RefinesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__RefinesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getRefinesAssignment_5_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1588:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1592:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalXMachine.g:1593:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1600:1: rule__Machine__Group_6__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1604:1: ( ( 'sees' ) )
            // InternalXMachine.g:1605:1: ( 'sees' )
            {
            // InternalXMachine.g:1605:1: ( 'sees' )
            // InternalXMachine.g:1606:2: 'sees'
            {
             before(grammarAccess.getMachineAccess().getSeesKeyword_6_0()); 
            match(input,116,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getSeesKeyword_6_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1615:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1619:1: ( rule__Machine__Group_6__1__Impl )
            // InternalXMachine.g:1620:2: rule__Machine__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1626:1: rule__Machine__Group_6__1__Impl : ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1630:1: ( ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) ) )
            // InternalXMachine.g:1631:1: ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) )
            {
            // InternalXMachine.g:1631:1: ( ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* ) )
            // InternalXMachine.g:1632:2: ( ( rule__Machine__SeesAssignment_6_1 ) ) ( ( rule__Machine__SeesAssignment_6_1 )* )
            {
            // InternalXMachine.g:1632:2: ( ( rule__Machine__SeesAssignment_6_1 ) )
            // InternalXMachine.g:1633:3: ( rule__Machine__SeesAssignment_6_1 )
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 
            // InternalXMachine.g:1634:3: ( rule__Machine__SeesAssignment_6_1 )
            // InternalXMachine.g:1634:4: rule__Machine__SeesAssignment_6_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__SeesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 

            }

            // InternalXMachine.g:1637:2: ( ( rule__Machine__SeesAssignment_6_1 )* )
            // InternalXMachine.g:1638:3: ( rule__Machine__SeesAssignment_6_1 )*
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 
            // InternalXMachine.g:1639:3: ( rule__Machine__SeesAssignment_6_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXMachine.g:1639:4: rule__Machine__SeesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__SeesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getSeesAssignment_6_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:1649:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1653:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalXMachine.g:1654:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1661:1: rule__Machine__Group_7__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1665:1: ( ( 'variables' ) )
            // InternalXMachine.g:1666:1: ( 'variables' )
            {
            // InternalXMachine.g:1666:1: ( 'variables' )
            // InternalXMachine.g:1667:2: 'variables'
            {
             before(grammarAccess.getMachineAccess().getVariablesKeyword_7_0()); 
            match(input,117,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getVariablesKeyword_7_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1676:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1680:1: ( rule__Machine__Group_7__1__Impl )
            // InternalXMachine.g:1681:2: rule__Machine__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1687:1: rule__Machine__Group_7__1__Impl : ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1691:1: ( ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) ) )
            // InternalXMachine.g:1692:1: ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) )
            {
            // InternalXMachine.g:1692:1: ( ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* ) )
            // InternalXMachine.g:1693:2: ( ( rule__Machine__VariablesAssignment_7_1 ) ) ( ( rule__Machine__VariablesAssignment_7_1 )* )
            {
            // InternalXMachine.g:1693:2: ( ( rule__Machine__VariablesAssignment_7_1 ) )
            // InternalXMachine.g:1694:3: ( rule__Machine__VariablesAssignment_7_1 )
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 
            // InternalXMachine.g:1695:3: ( rule__Machine__VariablesAssignment_7_1 )
            // InternalXMachine.g:1695:4: rule__Machine__VariablesAssignment_7_1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__VariablesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 

            }

            // InternalXMachine.g:1698:2: ( ( rule__Machine__VariablesAssignment_7_1 )* )
            // InternalXMachine.g:1699:3: ( rule__Machine__VariablesAssignment_7_1 )*
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 
            // InternalXMachine.g:1700:3: ( rule__Machine__VariablesAssignment_7_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXMachine.g:1700:4: rule__Machine__VariablesAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__VariablesAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getVariablesAssignment_7_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:1710:1: rule__Machine__Group_8__0 : rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 ;
    public final void rule__Machine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1714:1: ( rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 )
            // InternalXMachine.g:1715:2: rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__Machine__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_8__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1722:1: rule__Machine__Group_8__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1726:1: ( ( 'invariants' ) )
            // InternalXMachine.g:1727:1: ( 'invariants' )
            {
            // InternalXMachine.g:1727:1: ( 'invariants' )
            // InternalXMachine.g:1728:2: 'invariants'
            {
             before(grammarAccess.getMachineAccess().getInvariantsKeyword_8_0()); 
            match(input,118,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getInvariantsKeyword_8_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1737:1: rule__Machine__Group_8__1 : rule__Machine__Group_8__1__Impl ;
    public final void rule__Machine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1741:1: ( rule__Machine__Group_8__1__Impl )
            // InternalXMachine.g:1742:2: rule__Machine__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_8__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1748:1: rule__Machine__Group_8__1__Impl : ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) ) ;
    public final void rule__Machine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1752:1: ( ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) ) )
            // InternalXMachine.g:1753:1: ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) )
            {
            // InternalXMachine.g:1753:1: ( ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* ) )
            // InternalXMachine.g:1754:2: ( ( rule__Machine__InvariantsAssignment_8_1 ) ) ( ( rule__Machine__InvariantsAssignment_8_1 )* )
            {
            // InternalXMachine.g:1754:2: ( ( rule__Machine__InvariantsAssignment_8_1 ) )
            // InternalXMachine.g:1755:3: ( rule__Machine__InvariantsAssignment_8_1 )
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 
            // InternalXMachine.g:1756:3: ( rule__Machine__InvariantsAssignment_8_1 )
            // InternalXMachine.g:1756:4: rule__Machine__InvariantsAssignment_8_1
            {
            pushFollow(FOLLOW_10);
            rule__Machine__InvariantsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 

            }

            // InternalXMachine.g:1759:2: ( ( rule__Machine__InvariantsAssignment_8_1 )* )
            // InternalXMachine.g:1760:3: ( rule__Machine__InvariantsAssignment_8_1 )*
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 
            // InternalXMachine.g:1761:3: ( rule__Machine__InvariantsAssignment_8_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_XLABEL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXMachine.g:1761:4: rule__Machine__InvariantsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Machine__InvariantsAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_8_1()); 

            }


            }


            }

        }
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
    // InternalXMachine.g:1771:1: rule__Machine__Group_9__0 : rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 ;
    public final void rule__Machine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1775:1: ( rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 )
            // InternalXMachine.g:1776:2: rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1
            {
            pushFollow(FOLLOW_11);
            rule__Machine__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_9__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1783:1: rule__Machine__Group_9__0__Impl : ( 'variant' ) ;
    public final void rule__Machine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1787:1: ( ( 'variant' ) )
            // InternalXMachine.g:1788:1: ( 'variant' )
            {
            // InternalXMachine.g:1788:1: ( 'variant' )
            // InternalXMachine.g:1789:2: 'variant'
            {
             before(grammarAccess.getMachineAccess().getVariantKeyword_9_0()); 
            match(input,119,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getVariantKeyword_9_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1798:1: rule__Machine__Group_9__1 : rule__Machine__Group_9__1__Impl ;
    public final void rule__Machine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1802:1: ( rule__Machine__Group_9__1__Impl )
            // InternalXMachine.g:1803:2: rule__Machine__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_9__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1809:1: rule__Machine__Group_9__1__Impl : ( ( rule__Machine__VariantAssignment_9_1 ) ) ;
    public final void rule__Machine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1813:1: ( ( ( rule__Machine__VariantAssignment_9_1 ) ) )
            // InternalXMachine.g:1814:1: ( ( rule__Machine__VariantAssignment_9_1 ) )
            {
            // InternalXMachine.g:1814:1: ( ( rule__Machine__VariantAssignment_9_1 ) )
            // InternalXMachine.g:1815:2: ( rule__Machine__VariantAssignment_9_1 )
            {
             before(grammarAccess.getMachineAccess().getVariantAssignment_9_1()); 
            // InternalXMachine.g:1816:2: ( rule__Machine__VariantAssignment_9_1 )
            // InternalXMachine.g:1816:3: rule__Machine__VariantAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__VariantAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariantAssignment_9_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1825:1: rule__Machine__Group_10__0 : rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1 ;
    public final void rule__Machine__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1829:1: ( rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1 )
            // InternalXMachine.g:1830:2: rule__Machine__Group_10__0__Impl rule__Machine__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1837:1: rule__Machine__Group_10__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1841:1: ( ( 'events' ) )
            // InternalXMachine.g:1842:1: ( 'events' )
            {
            // InternalXMachine.g:1842:1: ( 'events' )
            // InternalXMachine.g:1843:2: 'events'
            {
             before(grammarAccess.getMachineAccess().getEventsKeyword_10_0()); 
            match(input,120,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getEventsKeyword_10_0()); 

            }


            }

        }
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
    // InternalXMachine.g:1852:1: rule__Machine__Group_10__1 : rule__Machine__Group_10__1__Impl rule__Machine__Group_10__2 ;
    public final void rule__Machine__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1856:1: ( rule__Machine__Group_10__1__Impl rule__Machine__Group_10__2 )
            // InternalXMachine.g:1857:2: rule__Machine__Group_10__1__Impl rule__Machine__Group_10__2
            {
            pushFollow(FOLLOW_5);
            rule__Machine__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1864:1: rule__Machine__Group_10__1__Impl : ( ( rule__Machine__EventsAssignment_10_1 ) ) ;
    public final void rule__Machine__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1868:1: ( ( ( rule__Machine__EventsAssignment_10_1 ) ) )
            // InternalXMachine.g:1869:1: ( ( rule__Machine__EventsAssignment_10_1 ) )
            {
            // InternalXMachine.g:1869:1: ( ( rule__Machine__EventsAssignment_10_1 ) )
            // InternalXMachine.g:1870:2: ( rule__Machine__EventsAssignment_10_1 )
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_10_1()); 
            // InternalXMachine.g:1871:2: ( rule__Machine__EventsAssignment_10_1 )
            // InternalXMachine.g:1871:3: rule__Machine__EventsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__EventsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getEventsAssignment_10_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Machine__Group_10__2"
    // InternalXMachine.g:1879:1: rule__Machine__Group_10__2 : rule__Machine__Group_10__2__Impl ;
    public final void rule__Machine__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1883:1: ( rule__Machine__Group_10__2__Impl )
            // InternalXMachine.g:1884:2: rule__Machine__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__2"


    // $ANTLR start "rule__Machine__Group_10__2__Impl"
    // InternalXMachine.g:1890:1: rule__Machine__Group_10__2__Impl : ( ( rule__Machine__EventsAssignment_10_2 )* ) ;
    public final void rule__Machine__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1894:1: ( ( ( rule__Machine__EventsAssignment_10_2 )* ) )
            // InternalXMachine.g:1895:1: ( ( rule__Machine__EventsAssignment_10_2 )* )
            {
            // InternalXMachine.g:1895:1: ( ( rule__Machine__EventsAssignment_10_2 )* )
            // InternalXMachine.g:1896:2: ( rule__Machine__EventsAssignment_10_2 )*
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_10_2()); 
            // InternalXMachine.g:1897:2: ( rule__Machine__EventsAssignment_10_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXMachine.g:1897:3: rule__Machine__EventsAssignment_10_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Machine__EventsAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getEventsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_10__2__Impl"


    // $ANTLR start "rule__MIncludes__Group__0"
    // InternalXMachine.g:1906:1: rule__MIncludes__Group__0 : rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 ;
    public final void rule__MIncludes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1910:1: ( rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1 )
            // InternalXMachine.g:1911:2: rule__MIncludes__Group__0__Impl rule__MIncludes__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MIncludes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1918:1: rule__MIncludes__Group__0__Impl : ( () ) ;
    public final void rule__MIncludes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1922:1: ( ( () ) )
            // InternalXMachine.g:1923:1: ( () )
            {
            // InternalXMachine.g:1923:1: ( () )
            // InternalXMachine.g:1924:2: ()
            {
             before(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 
            // InternalXMachine.g:1925:2: ()
            // InternalXMachine.g:1925:3: 
            {
            }

             after(grammarAccess.getMIncludesAccess().getMachineInclusionAction_0()); 

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
    // InternalXMachine.g:1933:1: rule__MIncludes__Group__1 : rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 ;
    public final void rule__MIncludes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1937:1: ( rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2 )
            // InternalXMachine.g:1938:2: rule__MIncludes__Group__1__Impl rule__MIncludes__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__MIncludes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1945:1: rule__MIncludes__Group__1__Impl : ( ( rule__MIncludes__Group_1__0 ) ) ;
    public final void rule__MIncludes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1949:1: ( ( ( rule__MIncludes__Group_1__0 ) ) )
            // InternalXMachine.g:1950:1: ( ( rule__MIncludes__Group_1__0 ) )
            {
            // InternalXMachine.g:1950:1: ( ( rule__MIncludes__Group_1__0 ) )
            // InternalXMachine.g:1951:2: ( rule__MIncludes__Group_1__0 )
            {
             before(grammarAccess.getMIncludesAccess().getGroup_1()); 
            // InternalXMachine.g:1952:2: ( rule__MIncludes__Group_1__0 )
            // InternalXMachine.g:1952:3: rule__MIncludes__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalXMachine.g:1960:1: rule__MIncludes__Group__2 : rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 ;
    public final void rule__MIncludes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1964:1: ( rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3 )
            // InternalXMachine.g:1965:2: rule__MIncludes__Group__2__Impl rule__MIncludes__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__MIncludes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1972:1: rule__MIncludes__Group__2__Impl : ( ( rule__MIncludes__Group_2__0 )? ) ;
    public final void rule__MIncludes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1976:1: ( ( ( rule__MIncludes__Group_2__0 )? ) )
            // InternalXMachine.g:1977:1: ( ( rule__MIncludes__Group_2__0 )? )
            {
            // InternalXMachine.g:1977:1: ( ( rule__MIncludes__Group_2__0 )? )
            // InternalXMachine.g:1978:2: ( rule__MIncludes__Group_2__0 )?
            {
             before(grammarAccess.getMIncludesAccess().getGroup_2()); 
            // InternalXMachine.g:1979:2: ( rule__MIncludes__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==122) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMachine.g:1979:3: rule__MIncludes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MIncludes__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMIncludesAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalXMachine.g:1987:1: rule__MIncludes__Group__3 : rule__MIncludes__Group__3__Impl ;
    public final void rule__MIncludes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:1991:1: ( rule__MIncludes__Group__3__Impl )
            // InternalXMachine.g:1992:2: rule__MIncludes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:1998:1: rule__MIncludes__Group__3__Impl : ( ( rule__MIncludes__Group_3__0 )? ) ;
    public final void rule__MIncludes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2002:1: ( ( ( rule__MIncludes__Group_3__0 )? ) )
            // InternalXMachine.g:2003:1: ( ( rule__MIncludes__Group_3__0 )? )
            {
            // InternalXMachine.g:2003:1: ( ( rule__MIncludes__Group_3__0 )? )
            // InternalXMachine.g:2004:2: ( rule__MIncludes__Group_3__0 )?
            {
             before(grammarAccess.getMIncludesAccess().getGroup_3()); 
            // InternalXMachine.g:2005:2: ( rule__MIncludes__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==123) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMachine.g:2005:3: rule__MIncludes__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MIncludes__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMIncludesAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalXMachine.g:2014:1: rule__MIncludes__Group_1__0 : rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 ;
    public final void rule__MIncludes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2018:1: ( rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1 )
            // InternalXMachine.g:2019:2: rule__MIncludes__Group_1__0__Impl rule__MIncludes__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__MIncludes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2026:1: rule__MIncludes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__MIncludes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2030:1: ( ( 'includes' ) )
            // InternalXMachine.g:2031:1: ( 'includes' )
            {
            // InternalXMachine.g:2031:1: ( 'includes' )
            // InternalXMachine.g:2032:2: 'includes'
            {
             before(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 
            match(input,121,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getIncludesKeyword_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2041:1: rule__MIncludes__Group_1__1 : rule__MIncludes__Group_1__1__Impl ;
    public final void rule__MIncludes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2045:1: ( rule__MIncludes__Group_1__1__Impl )
            // InternalXMachine.g:2046:2: rule__MIncludes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2052:1: rule__MIncludes__Group_1__1__Impl : ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) ;
    public final void rule__MIncludes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2056:1: ( ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) ) )
            // InternalXMachine.g:2057:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            {
            // InternalXMachine.g:2057:1: ( ( rule__MIncludes__AbstractMachineAssignment_1_1 ) )
            // InternalXMachine.g:2058:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 
            // InternalXMachine.g:2059:2: ( rule__MIncludes__AbstractMachineAssignment_1_1 )
            // InternalXMachine.g:2059:3: rule__MIncludes__AbstractMachineAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__AbstractMachineAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getAbstractMachineAssignment_1_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2068:1: rule__MIncludes__Group_2__0 : rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 ;
    public final void rule__MIncludes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2072:1: ( rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1 )
            // InternalXMachine.g:2073:2: rule__MIncludes__Group_2__0__Impl rule__MIncludes__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__MIncludes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2080:1: rule__MIncludes__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__MIncludes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2084:1: ( ( 'to' ) )
            // InternalXMachine.g:2085:1: ( 'to' )
            {
            // InternalXMachine.g:2085:1: ( 'to' )
            // InternalXMachine.g:2086:2: 'to'
            {
             before(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 
            match(input,122,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getToKeyword_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2095:1: rule__MIncludes__Group_2__1 : rule__MIncludes__Group_2__1__Impl ;
    public final void rule__MIncludes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2099:1: ( rule__MIncludes__Group_2__1__Impl )
            // InternalXMachine.g:2100:2: rule__MIncludes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2106:1: rule__MIncludes__Group_2__1__Impl : ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) ;
    public final void rule__MIncludes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2110:1: ( ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) ) )
            // InternalXMachine.g:2111:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            {
            // InternalXMachine.g:2111:1: ( ( rule__MIncludes__ConcreteMachineAssignment_2_1 ) )
            // InternalXMachine.g:2112:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 
            // InternalXMachine.g:2113:2: ( rule__MIncludes__ConcreteMachineAssignment_2_1 )
            // InternalXMachine.g:2113:3: rule__MIncludes__ConcreteMachineAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__ConcreteMachineAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getConcreteMachineAssignment_2_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2122:1: rule__MIncludes__Group_3__0 : rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 ;
    public final void rule__MIncludes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2126:1: ( rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1 )
            // InternalXMachine.g:2127:2: rule__MIncludes__Group_3__0__Impl rule__MIncludes__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__MIncludes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2134:1: rule__MIncludes__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__MIncludes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2138:1: ( ( 'as' ) )
            // InternalXMachine.g:2139:1: ( 'as' )
            {
            // InternalXMachine.g:2139:1: ( 'as' )
            // InternalXMachine.g:2140:2: 'as'
            {
             before(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 
            match(input,123,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getAsKeyword_3_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2149:1: rule__MIncludes__Group_3__1 : rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 ;
    public final void rule__MIncludes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2153:1: ( rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2 )
            // InternalXMachine.g:2154:2: rule__MIncludes__Group_3__1__Impl rule__MIncludes__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__MIncludes__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2161:1: rule__MIncludes__Group_3__1__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) ;
    public final void rule__MIncludes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2165:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_1 ) ) )
            // InternalXMachine.g:2166:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            {
            // InternalXMachine.g:2166:1: ( ( rule__MIncludes__PrefixesAssignment_3_1 ) )
            // InternalXMachine.g:2167:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 
            // InternalXMachine.g:2168:2: ( rule__MIncludes__PrefixesAssignment_3_1 )
            // InternalXMachine.g:2168:3: rule__MIncludes__PrefixesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__PrefixesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2176:1: rule__MIncludes__Group_3__2 : rule__MIncludes__Group_3__2__Impl ;
    public final void rule__MIncludes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2180:1: ( rule__MIncludes__Group_3__2__Impl )
            // InternalXMachine.g:2181:2: rule__MIncludes__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MIncludes__Group_3__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2187:1: rule__MIncludes__Group_3__2__Impl : ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) ;
    public final void rule__MIncludes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2191:1: ( ( ( rule__MIncludes__PrefixesAssignment_3_2 )* ) )
            // InternalXMachine.g:2192:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            {
            // InternalXMachine.g:2192:1: ( ( rule__MIncludes__PrefixesAssignment_3_2 )* )
            // InternalXMachine.g:2193:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 
            // InternalXMachine.g:2194:2: ( rule__MIncludes__PrefixesAssignment_3_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXMachine.g:2194:3: rule__MIncludes__PrefixesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MIncludes__PrefixesAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMIncludesAccess().getPrefixesAssignment_3_2()); 

            }


            }

        }
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
    // InternalXMachine.g:2203:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2207:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXMachine.g:2208:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2215:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2219:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2220:1: ( RULE_ID )
            {
            // InternalXMachine.g:2220:1: ( RULE_ID )
            // InternalXMachine.g:2221:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2230:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2234:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXMachine.g:2235:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2241:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2245:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalXMachine.g:2246:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalXMachine.g:2246:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalXMachine.g:2247:2: ( rule__QualifiedName__Group_1__0 )?
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXMachine.g:2248:2: ( rule__QualifiedName__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMachine.g:2248:3: rule__QualifiedName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2257:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2261:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXMachine.g:2262:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2269:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2273:1: ( ( '.' ) )
            // InternalXMachine.g:2274:1: ( '.' )
            {
            // InternalXMachine.g:2274:1: ( '.' )
            // InternalXMachine.g:2275:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2284:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2288:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXMachine.g:2289:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2295:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2299:1: ( ( RULE_ID ) )
            // InternalXMachine.g:2300:1: ( RULE_ID )
            {
            // InternalXMachine.g:2300:1: ( RULE_ID )
            // InternalXMachine.g:2301:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2311:1: rule__XVariable__Group__0 : rule__XVariable__Group__0__Impl rule__XVariable__Group__1 ;
    public final void rule__XVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2315:1: ( rule__XVariable__Group__0__Impl rule__XVariable__Group__1 )
            // InternalXMachine.g:2316:2: rule__XVariable__Group__0__Impl rule__XVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariable__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2323:1: rule__XVariable__Group__0__Impl : ( () ) ;
    public final void rule__XVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2327:1: ( ( () ) )
            // InternalXMachine.g:2328:1: ( () )
            {
            // InternalXMachine.g:2328:1: ( () )
            // InternalXMachine.g:2329:2: ()
            {
             before(grammarAccess.getXVariableAccess().getVariableAction_0()); 
            // InternalXMachine.g:2330:2: ()
            // InternalXMachine.g:2330:3: 
            {
            }

             after(grammarAccess.getXVariableAccess().getVariableAction_0()); 

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
    // InternalXMachine.g:2338:1: rule__XVariable__Group__1 : rule__XVariable__Group__1__Impl ;
    public final void rule__XVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2342:1: ( rule__XVariable__Group__1__Impl )
            // InternalXMachine.g:2343:2: rule__XVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2349:1: rule__XVariable__Group__1__Impl : ( ( rule__XVariable__NameAssignment_1 ) ) ;
    public final void rule__XVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2353:1: ( ( ( rule__XVariable__NameAssignment_1 ) ) )
            // InternalXMachine.g:2354:1: ( ( rule__XVariable__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2354:1: ( ( rule__XVariable__NameAssignment_1 ) )
            // InternalXMachine.g:2355:2: ( rule__XVariable__NameAssignment_1 )
            {
             before(grammarAccess.getXVariableAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2356:2: ( rule__XVariable__NameAssignment_1 )
            // InternalXMachine.g:2356:3: rule__XVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariableAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2365:1: rule__XInvariant__Group__0 : rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 ;
    public final void rule__XInvariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2369:1: ( rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1 )
            // InternalXMachine.g:2370:2: rule__XInvariant__Group__0__Impl rule__XInvariant__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XInvariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2377:1: rule__XInvariant__Group__0__Impl : ( () ) ;
    public final void rule__XInvariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2381:1: ( ( () ) )
            // InternalXMachine.g:2382:1: ( () )
            {
            // InternalXMachine.g:2382:1: ( () )
            // InternalXMachine.g:2383:2: ()
            {
             before(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 
            // InternalXMachine.g:2384:2: ()
            // InternalXMachine.g:2384:3: 
            {
            }

             after(grammarAccess.getXInvariantAccess().getInvariantAction_0()); 

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
    // InternalXMachine.g:2392:1: rule__XInvariant__Group__1 : rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 ;
    public final void rule__XInvariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2396:1: ( rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2 )
            // InternalXMachine.g:2397:2: rule__XInvariant__Group__1__Impl rule__XInvariant__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XInvariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2404:1: rule__XInvariant__Group__1__Impl : ( ( rule__XInvariant__NameAssignment_1 ) ) ;
    public final void rule__XInvariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2408:1: ( ( ( rule__XInvariant__NameAssignment_1 ) ) )
            // InternalXMachine.g:2409:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2409:1: ( ( rule__XInvariant__NameAssignment_1 ) )
            // InternalXMachine.g:2410:2: ( rule__XInvariant__NameAssignment_1 )
            {
             before(grammarAccess.getXInvariantAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2411:2: ( rule__XInvariant__NameAssignment_1 )
            // InternalXMachine.g:2411:3: rule__XInvariant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2419:1: rule__XInvariant__Group__2 : rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 ;
    public final void rule__XInvariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2423:1: ( rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3 )
            // InternalXMachine.g:2424:2: rule__XInvariant__Group__2__Impl rule__XInvariant__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__XInvariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2431:1: rule__XInvariant__Group__2__Impl : ( ( rule__XInvariant__PredicateAssignment_2 ) ) ;
    public final void rule__XInvariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2435:1: ( ( ( rule__XInvariant__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:2436:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:2436:1: ( ( rule__XInvariant__PredicateAssignment_2 ) )
            // InternalXMachine.g:2437:2: ( rule__XInvariant__PredicateAssignment_2 )
            {
             before(grammarAccess.getXInvariantAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:2438:2: ( rule__XInvariant__PredicateAssignment_2 )
            // InternalXMachine.g:2438:3: rule__XInvariant__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXInvariantAccess().getPredicateAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:2446:1: rule__XInvariant__Group__3 : rule__XInvariant__Group__3__Impl ;
    public final void rule__XInvariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2450:1: ( rule__XInvariant__Group__3__Impl )
            // InternalXMachine.g:2451:2: rule__XInvariant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XInvariant__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2457:1: rule__XInvariant__Group__3__Impl : ( ( rule__XInvariant__TheoremAssignment_3 )? ) ;
    public final void rule__XInvariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2461:1: ( ( ( rule__XInvariant__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:2462:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:2462:1: ( ( rule__XInvariant__TheoremAssignment_3 )? )
            // InternalXMachine.g:2463:2: ( rule__XInvariant__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXInvariantAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:2464:2: ( rule__XInvariant__TheoremAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==133) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMachine.g:2464:3: rule__XInvariant__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XInvariant__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXInvariantAccess().getTheoremAssignment_3()); 

            }


            }

        }
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
    // InternalXMachine.g:2473:1: rule__XVariant__Group__0 : rule__XVariant__Group__0__Impl rule__XVariant__Group__1 ;
    public final void rule__XVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2477:1: ( rule__XVariant__Group__0__Impl rule__XVariant__Group__1 )
            // InternalXMachine.g:2478:2: rule__XVariant__Group__0__Impl rule__XVariant__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__XVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XVariant__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2485:1: rule__XVariant__Group__0__Impl : ( () ) ;
    public final void rule__XVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2489:1: ( ( () ) )
            // InternalXMachine.g:2490:1: ( () )
            {
            // InternalXMachine.g:2490:1: ( () )
            // InternalXMachine.g:2491:2: ()
            {
             before(grammarAccess.getXVariantAccess().getVariantAction_0()); 
            // InternalXMachine.g:2492:2: ()
            // InternalXMachine.g:2492:3: 
            {
            }

             after(grammarAccess.getXVariantAccess().getVariantAction_0()); 

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
    // InternalXMachine.g:2500:1: rule__XVariant__Group__1 : rule__XVariant__Group__1__Impl ;
    public final void rule__XVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2504:1: ( rule__XVariant__Group__1__Impl )
            // InternalXMachine.g:2505:2: rule__XVariant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2511:1: rule__XVariant__Group__1__Impl : ( ( rule__XVariant__ExpressionAssignment_1 ) ) ;
    public final void rule__XVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2515:1: ( ( ( rule__XVariant__ExpressionAssignment_1 ) ) )
            // InternalXMachine.g:2516:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            {
            // InternalXMachine.g:2516:1: ( ( rule__XVariant__ExpressionAssignment_1 ) )
            // InternalXMachine.g:2517:2: ( rule__XVariant__ExpressionAssignment_1 )
            {
             before(grammarAccess.getXVariantAccess().getExpressionAssignment_1()); 
            // InternalXMachine.g:2518:2: ( rule__XVariant__ExpressionAssignment_1 )
            // InternalXMachine.g:2518:3: rule__XVariant__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XVariant__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXVariantAccess().getExpressionAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__Group__0"
    // InternalXMachine.g:2527:1: rule__XEvent__Group__0 : rule__XEvent__Group__0__Impl rule__XEvent__Group__1 ;
    public final void rule__XEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2531:1: ( rule__XEvent__Group__0__Impl rule__XEvent__Group__1 )
            // InternalXMachine.g:2532:2: rule__XEvent__Group__0__Impl rule__XEvent__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2539:1: rule__XEvent__Group__0__Impl : ( () ) ;
    public final void rule__XEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2543:1: ( ( () ) )
            // InternalXMachine.g:2544:1: ( () )
            {
            // InternalXMachine.g:2544:1: ( () )
            // InternalXMachine.g:2545:2: ()
            {
             before(grammarAccess.getXEventAccess().getEventAction_0()); 
            // InternalXMachine.g:2546:2: ()
            // InternalXMachine.g:2546:3: 
            {
            }

             after(grammarAccess.getXEventAccess().getEventAction_0()); 

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
    // InternalXMachine.g:2554:1: rule__XEvent__Group__1 : rule__XEvent__Group__1__Impl rule__XEvent__Group__2 ;
    public final void rule__XEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2558:1: ( rule__XEvent__Group__1__Impl rule__XEvent__Group__2 )
            // InternalXMachine.g:2559:2: rule__XEvent__Group__1__Impl rule__XEvent__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__XEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2566:1: rule__XEvent__Group__1__Impl : ( ( rule__XEvent__NameAssignment_1 ) ) ;
    public final void rule__XEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2570:1: ( ( ( rule__XEvent__NameAssignment_1 ) ) )
            // InternalXMachine.g:2571:1: ( ( rule__XEvent__NameAssignment_1 ) )
            {
            // InternalXMachine.g:2571:1: ( ( rule__XEvent__NameAssignment_1 ) )
            // InternalXMachine.g:2572:2: ( rule__XEvent__NameAssignment_1 )
            {
             before(grammarAccess.getXEventAccess().getNameAssignment_1()); 
            // InternalXMachine.g:2573:2: ( rule__XEvent__NameAssignment_1 )
            // InternalXMachine.g:2573:3: rule__XEvent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:2581:1: rule__XEvent__Group__2 : rule__XEvent__Group__2__Impl rule__XEvent__Group__3 ;
    public final void rule__XEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2585:1: ( rule__XEvent__Group__2__Impl rule__XEvent__Group__3 )
            // InternalXMachine.g:2586:2: rule__XEvent__Group__2__Impl rule__XEvent__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__XEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2593:1: rule__XEvent__Group__2__Impl : ( ( rule__XEvent__UnorderedGroup_2 ) ) ;
    public final void rule__XEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2597:1: ( ( ( rule__XEvent__UnorderedGroup_2 ) ) )
            // InternalXMachine.g:2598:1: ( ( rule__XEvent__UnorderedGroup_2 ) )
            {
            // InternalXMachine.g:2598:1: ( ( rule__XEvent__UnorderedGroup_2 ) )
            // InternalXMachine.g:2599:2: ( rule__XEvent__UnorderedGroup_2 )
            {
             before(grammarAccess.getXEventAccess().getUnorderedGroup_2()); 
            // InternalXMachine.g:2600:2: ( rule__XEvent__UnorderedGroup_2 )
            // InternalXMachine.g:2600:3: rule__XEvent__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getUnorderedGroup_2()); 

            }


            }

        }
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
    // InternalXMachine.g:2608:1: rule__XEvent__Group__3 : rule__XEvent__Group__3__Impl rule__XEvent__Group__4 ;
    public final void rule__XEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2612:1: ( rule__XEvent__Group__3__Impl rule__XEvent__Group__4 )
            // InternalXMachine.g:2613:2: rule__XEvent__Group__3__Impl rule__XEvent__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__XEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__4();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2620:1: rule__XEvent__Group__3__Impl : ( ( rule__XEvent__ExtensionsAssignment_3 )* ) ;
    public final void rule__XEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2624:1: ( ( ( rule__XEvent__ExtensionsAssignment_3 )* ) )
            // InternalXMachine.g:2625:1: ( ( rule__XEvent__ExtensionsAssignment_3 )* )
            {
            // InternalXMachine.g:2625:1: ( ( rule__XEvent__ExtensionsAssignment_3 )* )
            // InternalXMachine.g:2626:2: ( rule__XEvent__ExtensionsAssignment_3 )*
            {
             before(grammarAccess.getXEventAccess().getExtensionsAssignment_3()); 
            // InternalXMachine.g:2627:2: ( rule__XEvent__ExtensionsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==130) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXMachine.g:2627:3: rule__XEvent__ExtensionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__XEvent__ExtensionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getExtensionsAssignment_3()); 

            }


            }

        }
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
    // InternalXMachine.g:2635:1: rule__XEvent__Group__4 : rule__XEvent__Group__4__Impl rule__XEvent__Group__5 ;
    public final void rule__XEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2639:1: ( rule__XEvent__Group__4__Impl rule__XEvent__Group__5 )
            // InternalXMachine.g:2640:2: rule__XEvent__Group__4__Impl rule__XEvent__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__XEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__5();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2647:1: rule__XEvent__Group__4__Impl : ( ( rule__XEvent__Group_4__0 )? ) ;
    public final void rule__XEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2651:1: ( ( ( rule__XEvent__Group_4__0 )? ) )
            // InternalXMachine.g:2652:1: ( ( rule__XEvent__Group_4__0 )? )
            {
            // InternalXMachine.g:2652:1: ( ( rule__XEvent__Group_4__0 )? )
            // InternalXMachine.g:2653:2: ( rule__XEvent__Group_4__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_4()); 
            // InternalXMachine.g:2654:2: ( rule__XEvent__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==115) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXMachine.g:2654:3: rule__XEvent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalXMachine.g:2662:1: rule__XEvent__Group__5 : rule__XEvent__Group__5__Impl rule__XEvent__Group__6 ;
    public final void rule__XEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2666:1: ( rule__XEvent__Group__5__Impl rule__XEvent__Group__6 )
            // InternalXMachine.g:2667:2: rule__XEvent__Group__5__Impl rule__XEvent__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__XEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group__6();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2674:1: rule__XEvent__Group__5__Impl : ( ( rule__XEvent__Alternatives_5 )? ) ;
    public final void rule__XEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2678:1: ( ( ( rule__XEvent__Alternatives_5 )? ) )
            // InternalXMachine.g:2679:1: ( ( rule__XEvent__Alternatives_5 )? )
            {
            // InternalXMachine.g:2679:1: ( ( rule__XEvent__Alternatives_5 )? )
            // InternalXMachine.g:2680:2: ( rule__XEvent__Alternatives_5 )?
            {
             before(grammarAccess.getXEventAccess().getAlternatives_5()); 
            // InternalXMachine.g:2681:2: ( rule__XEvent__Alternatives_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=124 && LA28_0<=126)||LA28_0==128) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXMachine.g:2681:3: rule__XEvent__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getAlternatives_5()); 

            }


            }

        }
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
    // InternalXMachine.g:2689:1: rule__XEvent__Group__6 : rule__XEvent__Group__6__Impl ;
    public final void rule__XEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2693:1: ( rule__XEvent__Group__6__Impl )
            // InternalXMachine.g:2694:2: rule__XEvent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2700:1: rule__XEvent__Group__6__Impl : ( 'end' ) ;
    public final void rule__XEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2704:1: ( ( 'end' ) )
            // InternalXMachine.g:2705:1: ( 'end' )
            {
            // InternalXMachine.g:2705:1: ( 'end' )
            // InternalXMachine.g:2706:2: 'end'
            {
             before(grammarAccess.getXEventAccess().getEndKeyword_6()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getEndKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__Group_4__0"
    // InternalXMachine.g:2716:1: rule__XEvent__Group_4__0 : rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1 ;
    public final void rule__XEvent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2720:1: ( rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1 )
            // InternalXMachine.g:2721:2: rule__XEvent__Group_4__0__Impl rule__XEvent__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4__0"


    // $ANTLR start "rule__XEvent__Group_4__0__Impl"
    // InternalXMachine.g:2728:1: rule__XEvent__Group_4__0__Impl : ( 'refines' ) ;
    public final void rule__XEvent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2732:1: ( ( 'refines' ) )
            // InternalXMachine.g:2733:1: ( 'refines' )
            {
            // InternalXMachine.g:2733:1: ( 'refines' )
            // InternalXMachine.g:2734:2: 'refines'
            {
             before(grammarAccess.getXEventAccess().getRefinesKeyword_4_0()); 
            match(input,115,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getRefinesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4__0__Impl"


    // $ANTLR start "rule__XEvent__Group_4__1"
    // InternalXMachine.g:2743:1: rule__XEvent__Group_4__1 : rule__XEvent__Group_4__1__Impl ;
    public final void rule__XEvent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2747:1: ( rule__XEvent__Group_4__1__Impl )
            // InternalXMachine.g:2748:2: rule__XEvent__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4__1"


    // $ANTLR start "rule__XEvent__Group_4__1__Impl"
    // InternalXMachine.g:2754:1: rule__XEvent__Group_4__1__Impl : ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) ) ;
    public final void rule__XEvent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2758:1: ( ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) ) )
            // InternalXMachine.g:2759:1: ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) )
            {
            // InternalXMachine.g:2759:1: ( ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* ) )
            // InternalXMachine.g:2760:2: ( ( rule__XEvent__RefinesAssignment_4_1 ) ) ( ( rule__XEvent__RefinesAssignment_4_1 )* )
            {
            // InternalXMachine.g:2760:2: ( ( rule__XEvent__RefinesAssignment_4_1 ) )
            // InternalXMachine.g:2761:3: ( rule__XEvent__RefinesAssignment_4_1 )
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 
            // InternalXMachine.g:2762:3: ( rule__XEvent__RefinesAssignment_4_1 )
            // InternalXMachine.g:2762:4: rule__XEvent__RefinesAssignment_4_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__RefinesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 

            }

            // InternalXMachine.g:2765:2: ( ( rule__XEvent__RefinesAssignment_4_1 )* )
            // InternalXMachine.g:2766:3: ( rule__XEvent__RefinesAssignment_4_1 )*
            {
             before(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 
            // InternalXMachine.g:2767:3: ( rule__XEvent__RefinesAssignment_4_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXMachine.g:2767:4: rule__XEvent__RefinesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__RefinesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getRefinesAssignment_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_4__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0__0"
    // InternalXMachine.g:2777:1: rule__XEvent__Group_5_0__0 : rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 ;
    public final void rule__XEvent__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2781:1: ( rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1 )
            // InternalXMachine.g:2782:2: rule__XEvent__Group_5_0__0__Impl rule__XEvent__Group_5_0__1
            {
            pushFollow(FOLLOW_19);
            rule__XEvent__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2789:1: rule__XEvent__Group_5_0__0__Impl : ( ( rule__XEvent__Group_5_0_0__0 )? ) ;
    public final void rule__XEvent__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2793:1: ( ( ( rule__XEvent__Group_5_0_0__0 )? ) )
            // InternalXMachine.g:2794:1: ( ( rule__XEvent__Group_5_0_0__0 )? )
            {
            // InternalXMachine.g:2794:1: ( ( rule__XEvent__Group_5_0_0__0 )? )
            // InternalXMachine.g:2795:2: ( rule__XEvent__Group_5_0_0__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_0_0()); 
            // InternalXMachine.g:2796:2: ( rule__XEvent__Group_5_0_0__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==125) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXMachine.g:2796:3: rule__XEvent__Group_5_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_0_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2804:1: rule__XEvent__Group_5_0__1 : rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2 ;
    public final void rule__XEvent__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2808:1: ( rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2 )
            // InternalXMachine.g:2809:2: rule__XEvent__Group_5_0__1__Impl rule__XEvent__Group_5_0__2
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2816:1: rule__XEvent__Group_5_0__1__Impl : ( 'begin' ) ;
    public final void rule__XEvent__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2820:1: ( ( 'begin' ) )
            // InternalXMachine.g:2821:1: ( 'begin' )
            {
            // InternalXMachine.g:2821:1: ( 'begin' )
            // InternalXMachine.g:2822:2: 'begin'
            {
             before(grammarAccess.getXEventAccess().getBeginKeyword_5_0_1()); 
            match(input,124,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getBeginKeyword_5_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__Group_5_0__2"
    // InternalXMachine.g:2831:1: rule__XEvent__Group_5_0__2 : rule__XEvent__Group_5_0__2__Impl ;
    public final void rule__XEvent__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2835:1: ( rule__XEvent__Group_5_0__2__Impl )
            // InternalXMachine.g:2836:2: rule__XEvent__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0__2"


    // $ANTLR start "rule__XEvent__Group_5_0__2__Impl"
    // InternalXMachine.g:2842:1: rule__XEvent__Group_5_0__2__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) ) ;
    public final void rule__XEvent__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2846:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) ) )
            // InternalXMachine.g:2847:1: ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) )
            {
            // InternalXMachine.g:2847:1: ( ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* ) )
            // InternalXMachine.g:2848:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 ) ) ( ( rule__XEvent__ActionsAssignment_5_0_2 )* )
            {
            // InternalXMachine.g:2848:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 ) )
            // InternalXMachine.g:2849:3: ( rule__XEvent__ActionsAssignment_5_0_2 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 
            // InternalXMachine.g:2850:3: ( rule__XEvent__ActionsAssignment_5_0_2 )
            // InternalXMachine.g:2850:4: rule__XEvent__ActionsAssignment_5_0_2
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_5_0_2();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 

            }

            // InternalXMachine.g:2853:2: ( ( rule__XEvent__ActionsAssignment_5_0_2 )* )
            // InternalXMachine.g:2854:3: ( rule__XEvent__ActionsAssignment_5_0_2 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 
            // InternalXMachine.g:2855:3: ( rule__XEvent__ActionsAssignment_5_0_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_XLABEL) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXMachine.g:2855:4: rule__XEvent__ActionsAssignment_5_0_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_5_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_0_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0__2__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0_0__0"
    // InternalXMachine.g:2865:1: rule__XEvent__Group_5_0_0__0 : rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1 ;
    public final void rule__XEvent__Group_5_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2869:1: ( rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1 )
            // InternalXMachine.g:2870:2: rule__XEvent__Group_5_0_0__0__Impl rule__XEvent__Group_5_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0_0__0"


    // $ANTLR start "rule__XEvent__Group_5_0_0__0__Impl"
    // InternalXMachine.g:2877:1: rule__XEvent__Group_5_0_0__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2881:1: ( ( 'with' ) )
            // InternalXMachine.g:2882:1: ( 'with' )
            {
            // InternalXMachine.g:2882:1: ( 'with' )
            // InternalXMachine.g:2883:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_0_0_0()); 
            match(input,125,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_5_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0_0__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_0_0__1"
    // InternalXMachine.g:2892:1: rule__XEvent__Group_5_0_0__1 : rule__XEvent__Group_5_0_0__1__Impl ;
    public final void rule__XEvent__Group_5_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2896:1: ( rule__XEvent__Group_5_0_0__1__Impl )
            // InternalXMachine.g:2897:2: rule__XEvent__Group_5_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0_0__1"


    // $ANTLR start "rule__XEvent__Group_5_0_0__1__Impl"
    // InternalXMachine.g:2903:1: rule__XEvent__Group_5_0_0__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) ) ;
    public final void rule__XEvent__Group_5_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2907:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) ) )
            // InternalXMachine.g:2908:1: ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) )
            {
            // InternalXMachine.g:2908:1: ( ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* ) )
            // InternalXMachine.g:2909:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* )
            {
            // InternalXMachine.g:2909:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 ) )
            // InternalXMachine.g:2910:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 
            // InternalXMachine.g:2911:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )
            // InternalXMachine.g:2911:4: rule__XEvent__WitnessesAssignment_5_0_0_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_5_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 

            }

            // InternalXMachine.g:2914:2: ( ( rule__XEvent__WitnessesAssignment_5_0_0_1 )* )
            // InternalXMachine.g:2915:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 
            // InternalXMachine.g:2916:3: ( rule__XEvent__WitnessesAssignment_5_0_0_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_XLABEL) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXMachine.g:2916:4: rule__XEvent__WitnessesAssignment_5_0_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_5_0_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_0_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_0_0__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__0"
    // InternalXMachine.g:2926:1: rule__XEvent__Group_5_1__0 : rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 ;
    public final void rule__XEvent__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2930:1: ( rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1 )
            // InternalXMachine.g:2931:2: rule__XEvent__Group_5_1__0__Impl rule__XEvent__Group_5_1__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2938:1: rule__XEvent__Group_5_1__0__Impl : ( 'when' ) ;
    public final void rule__XEvent__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2942:1: ( ( 'when' ) )
            // InternalXMachine.g:2943:1: ( 'when' )
            {
            // InternalXMachine.g:2943:1: ( 'when' )
            // InternalXMachine.g:2944:2: 'when'
            {
             before(grammarAccess.getXEventAccess().getWhenKeyword_5_1_0()); 
            match(input,126,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWhenKeyword_5_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:2953:1: rule__XEvent__Group_5_1__1 : rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2 ;
    public final void rule__XEvent__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2957:1: ( rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2 )
            // InternalXMachine.g:2958:2: rule__XEvent__Group_5_1__1__Impl rule__XEvent__Group_5_1__2
            {
            pushFollow(FOLLOW_20);
            rule__XEvent__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:2965:1: rule__XEvent__Group_5_1__1__Impl : ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2969:1: ( ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) ) )
            // InternalXMachine.g:2970:1: ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) )
            {
            // InternalXMachine.g:2970:1: ( ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* ) )
            // InternalXMachine.g:2971:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 ) ) ( ( rule__XEvent__GuardsAssignment_5_1_1 )* )
            {
            // InternalXMachine.g:2971:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 ) )
            // InternalXMachine.g:2972:3: ( rule__XEvent__GuardsAssignment_5_1_1 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 
            // InternalXMachine.g:2973:3: ( rule__XEvent__GuardsAssignment_5_1_1 )
            // InternalXMachine.g:2973:4: rule__XEvent__GuardsAssignment_5_1_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 

            }

            // InternalXMachine.g:2976:2: ( ( rule__XEvent__GuardsAssignment_5_1_1 )* )
            // InternalXMachine.g:2977:3: ( rule__XEvent__GuardsAssignment_5_1_1 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 
            // InternalXMachine.g:2978:3: ( rule__XEvent__GuardsAssignment_5_1_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_XLABEL) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXMachine.g:2978:4: rule__XEvent__GuardsAssignment_5_1_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_5_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_1_1()); 

            }


            }


            }

        }
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


    // $ANTLR start "rule__XEvent__Group_5_1__2"
    // InternalXMachine.g:2987:1: rule__XEvent__Group_5_1__2 : rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3 ;
    public final void rule__XEvent__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:2991:1: ( rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3 )
            // InternalXMachine.g:2992:2: rule__XEvent__Group_5_1__2__Impl rule__XEvent__Group_5_1__3
            {
            pushFollow(FOLLOW_20);
            rule__XEvent__Group_5_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__2"


    // $ANTLR start "rule__XEvent__Group_5_1__2__Impl"
    // InternalXMachine.g:2999:1: rule__XEvent__Group_5_1__2__Impl : ( ( rule__XEvent__Group_5_1_2__0 )? ) ;
    public final void rule__XEvent__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3003:1: ( ( ( rule__XEvent__Group_5_1_2__0 )? ) )
            // InternalXMachine.g:3004:1: ( ( rule__XEvent__Group_5_1_2__0 )? )
            {
            // InternalXMachine.g:3004:1: ( ( rule__XEvent__Group_5_1_2__0 )? )
            // InternalXMachine.g:3005:2: ( rule__XEvent__Group_5_1_2__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_1_2()); 
            // InternalXMachine.g:3006:2: ( rule__XEvent__Group_5_1_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==125) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXMachine.g:3006:3: rule__XEvent__Group_5_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__2__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1__3"
    // InternalXMachine.g:3014:1: rule__XEvent__Group_5_1__3 : rule__XEvent__Group_5_1__3__Impl ;
    public final void rule__XEvent__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3018:1: ( rule__XEvent__Group_5_1__3__Impl )
            // InternalXMachine.g:3019:2: rule__XEvent__Group_5_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__3"


    // $ANTLR start "rule__XEvent__Group_5_1__3__Impl"
    // InternalXMachine.g:3025:1: rule__XEvent__Group_5_1__3__Impl : ( ( rule__XEvent__Group_5_1_3__0 )? ) ;
    public final void rule__XEvent__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3029:1: ( ( ( rule__XEvent__Group_5_1_3__0 )? ) )
            // InternalXMachine.g:3030:1: ( ( rule__XEvent__Group_5_1_3__0 )? )
            {
            // InternalXMachine.g:3030:1: ( ( rule__XEvent__Group_5_1_3__0 )? )
            // InternalXMachine.g:3031:2: ( rule__XEvent__Group_5_1_3__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_1_3()); 
            // InternalXMachine.g:3032:2: ( rule__XEvent__Group_5_1_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==127) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXMachine.g:3032:3: rule__XEvent__Group_5_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1__3__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_2__0"
    // InternalXMachine.g:3041:1: rule__XEvent__Group_5_1_2__0 : rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1 ;
    public final void rule__XEvent__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3045:1: ( rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1 )
            // InternalXMachine.g:3046:2: rule__XEvent__Group_5_1_2__0__Impl rule__XEvent__Group_5_1_2__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_2__0"


    // $ANTLR start "rule__XEvent__Group_5_1_2__0__Impl"
    // InternalXMachine.g:3053:1: rule__XEvent__Group_5_1_2__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3057:1: ( ( 'with' ) )
            // InternalXMachine.g:3058:1: ( 'with' )
            {
            // InternalXMachine.g:3058:1: ( 'with' )
            // InternalXMachine.g:3059:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_1_2_0()); 
            match(input,125,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_5_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_2__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_2__1"
    // InternalXMachine.g:3068:1: rule__XEvent__Group_5_1_2__1 : rule__XEvent__Group_5_1_2__1__Impl ;
    public final void rule__XEvent__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3072:1: ( rule__XEvent__Group_5_1_2__1__Impl )
            // InternalXMachine.g:3073:2: rule__XEvent__Group_5_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_2__1"


    // $ANTLR start "rule__XEvent__Group_5_1_2__1__Impl"
    // InternalXMachine.g:3079:1: rule__XEvent__Group_5_1_2__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3083:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) ) )
            // InternalXMachine.g:3084:1: ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) )
            {
            // InternalXMachine.g:3084:1: ( ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* ) )
            // InternalXMachine.g:3085:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* )
            {
            // InternalXMachine.g:3085:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 ) )
            // InternalXMachine.g:3086:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 
            // InternalXMachine.g:3087:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )
            // InternalXMachine.g:3087:4: rule__XEvent__WitnessesAssignment_5_1_2_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_5_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 

            }

            // InternalXMachine.g:3090:2: ( ( rule__XEvent__WitnessesAssignment_5_1_2_1 )* )
            // InternalXMachine.g:3091:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 
            // InternalXMachine.g:3092:3: ( rule__XEvent__WitnessesAssignment_5_1_2_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_XLABEL) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXMachine.g:3092:4: rule__XEvent__WitnessesAssignment_5_1_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_5_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_1_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_2__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_3__0"
    // InternalXMachine.g:3102:1: rule__XEvent__Group_5_1_3__0 : rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1 ;
    public final void rule__XEvent__Group_5_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3106:1: ( rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1 )
            // InternalXMachine.g:3107:2: rule__XEvent__Group_5_1_3__0__Impl rule__XEvent__Group_5_1_3__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_3__0"


    // $ANTLR start "rule__XEvent__Group_5_1_3__0__Impl"
    // InternalXMachine.g:3114:1: rule__XEvent__Group_5_1_3__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_5_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3118:1: ( ( 'then' ) )
            // InternalXMachine.g:3119:1: ( 'then' )
            {
            // InternalXMachine.g:3119:1: ( 'then' )
            // InternalXMachine.g:3120:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_5_1_3_0()); 
            match(input,127,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getThenKeyword_5_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_3__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_1_3__1"
    // InternalXMachine.g:3129:1: rule__XEvent__Group_5_1_3__1 : rule__XEvent__Group_5_1_3__1__Impl ;
    public final void rule__XEvent__Group_5_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3133:1: ( rule__XEvent__Group_5_1_3__1__Impl )
            // InternalXMachine.g:3134:2: rule__XEvent__Group_5_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_3__1"


    // $ANTLR start "rule__XEvent__Group_5_1_3__1__Impl"
    // InternalXMachine.g:3140:1: rule__XEvent__Group_5_1_3__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) ) ;
    public final void rule__XEvent__Group_5_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3144:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) ) )
            // InternalXMachine.g:3145:1: ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) )
            {
            // InternalXMachine.g:3145:1: ( ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* ) )
            // InternalXMachine.g:3146:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* )
            {
            // InternalXMachine.g:3146:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 ) )
            // InternalXMachine.g:3147:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 
            // InternalXMachine.g:3148:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )
            // InternalXMachine.g:3148:4: rule__XEvent__ActionsAssignment_5_1_3_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_5_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 

            }

            // InternalXMachine.g:3151:2: ( ( rule__XEvent__ActionsAssignment_5_1_3_1 )* )
            // InternalXMachine.g:3152:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 
            // InternalXMachine.g:3153:3: ( rule__XEvent__ActionsAssignment_5_1_3_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_XLABEL) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXMachine.g:3153:4: rule__XEvent__ActionsAssignment_5_1_3_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_5_1_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_1_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_1_3__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__0"
    // InternalXMachine.g:3163:1: rule__XEvent__Group_5_2__0 : rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1 ;
    public final void rule__XEvent__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3167:1: ( rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1 )
            // InternalXMachine.g:3168:2: rule__XEvent__Group_5_2__0__Impl rule__XEvent__Group_5_2__1
            {
            pushFollow(FOLLOW_5);
            rule__XEvent__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__0"


    // $ANTLR start "rule__XEvent__Group_5_2__0__Impl"
    // InternalXMachine.g:3175:1: rule__XEvent__Group_5_2__0__Impl : ( 'any' ) ;
    public final void rule__XEvent__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3179:1: ( ( 'any' ) )
            // InternalXMachine.g:3180:1: ( 'any' )
            {
            // InternalXMachine.g:3180:1: ( 'any' )
            // InternalXMachine.g:3181:2: 'any'
            {
             before(grammarAccess.getXEventAccess().getAnyKeyword_5_2_0()); 
            match(input,128,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getAnyKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__1"
    // InternalXMachine.g:3190:1: rule__XEvent__Group_5_2__1 : rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2 ;
    public final void rule__XEvent__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3194:1: ( rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2 )
            // InternalXMachine.g:3195:2: rule__XEvent__Group_5_2__1__Impl rule__XEvent__Group_5_2__2
            {
            pushFollow(FOLLOW_21);
            rule__XEvent__Group_5_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__1"


    // $ANTLR start "rule__XEvent__Group_5_2__1__Impl"
    // InternalXMachine.g:3202:1: rule__XEvent__Group_5_2__1__Impl : ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3206:1: ( ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) ) )
            // InternalXMachine.g:3207:1: ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) )
            {
            // InternalXMachine.g:3207:1: ( ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* ) )
            // InternalXMachine.g:3208:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 ) ) ( ( rule__XEvent__ParametersAssignment_5_2_1 )* )
            {
            // InternalXMachine.g:3208:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 ) )
            // InternalXMachine.g:3209:3: ( rule__XEvent__ParametersAssignment_5_2_1 )
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 
            // InternalXMachine.g:3210:3: ( rule__XEvent__ParametersAssignment_5_2_1 )
            // InternalXMachine.g:3210:4: rule__XEvent__ParametersAssignment_5_2_1
            {
            pushFollow(FOLLOW_8);
            rule__XEvent__ParametersAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 

            }

            // InternalXMachine.g:3213:2: ( ( rule__XEvent__ParametersAssignment_5_2_1 )* )
            // InternalXMachine.g:3214:3: ( rule__XEvent__ParametersAssignment_5_2_1 )*
            {
             before(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 
            // InternalXMachine.g:3215:3: ( rule__XEvent__ParametersAssignment_5_2_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalXMachine.g:3215:4: rule__XEvent__ParametersAssignment_5_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XEvent__ParametersAssignment_5_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getParametersAssignment_5_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__2"
    // InternalXMachine.g:3224:1: rule__XEvent__Group_5_2__2 : rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3 ;
    public final void rule__XEvent__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3228:1: ( rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3 )
            // InternalXMachine.g:3229:2: rule__XEvent__Group_5_2__2__Impl rule__XEvent__Group_5_2__3
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__2"


    // $ANTLR start "rule__XEvent__Group_5_2__2__Impl"
    // InternalXMachine.g:3236:1: rule__XEvent__Group_5_2__2__Impl : ( 'where' ) ;
    public final void rule__XEvent__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3240:1: ( ( 'where' ) )
            // InternalXMachine.g:3241:1: ( 'where' )
            {
            // InternalXMachine.g:3241:1: ( 'where' )
            // InternalXMachine.g:3242:2: 'where'
            {
             before(grammarAccess.getXEventAccess().getWhereKeyword_5_2_2()); 
            match(input,129,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWhereKeyword_5_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__2__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__3"
    // InternalXMachine.g:3251:1: rule__XEvent__Group_5_2__3 : rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4 ;
    public final void rule__XEvent__Group_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3255:1: ( rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4 )
            // InternalXMachine.g:3256:2: rule__XEvent__Group_5_2__3__Impl rule__XEvent__Group_5_2__4
            {
            pushFollow(FOLLOW_20);
            rule__XEvent__Group_5_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__3"


    // $ANTLR start "rule__XEvent__Group_5_2__3__Impl"
    // InternalXMachine.g:3263:1: rule__XEvent__Group_5_2__3__Impl : ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) ) ;
    public final void rule__XEvent__Group_5_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3267:1: ( ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) ) )
            // InternalXMachine.g:3268:1: ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) )
            {
            // InternalXMachine.g:3268:1: ( ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* ) )
            // InternalXMachine.g:3269:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 ) ) ( ( rule__XEvent__GuardsAssignment_5_2_3 )* )
            {
            // InternalXMachine.g:3269:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 ) )
            // InternalXMachine.g:3270:3: ( rule__XEvent__GuardsAssignment_5_2_3 )
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 
            // InternalXMachine.g:3271:3: ( rule__XEvent__GuardsAssignment_5_2_3 )
            // InternalXMachine.g:3271:4: rule__XEvent__GuardsAssignment_5_2_3
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__GuardsAssignment_5_2_3();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 

            }

            // InternalXMachine.g:3274:2: ( ( rule__XEvent__GuardsAssignment_5_2_3 )* )
            // InternalXMachine.g:3275:3: ( rule__XEvent__GuardsAssignment_5_2_3 )*
            {
             before(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 
            // InternalXMachine.g:3276:3: ( rule__XEvent__GuardsAssignment_5_2_3 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_XLABEL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalXMachine.g:3276:4: rule__XEvent__GuardsAssignment_5_2_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__GuardsAssignment_5_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getGuardsAssignment_5_2_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__3__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__4"
    // InternalXMachine.g:3285:1: rule__XEvent__Group_5_2__4 : rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5 ;
    public final void rule__XEvent__Group_5_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3289:1: ( rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5 )
            // InternalXMachine.g:3290:2: rule__XEvent__Group_5_2__4__Impl rule__XEvent__Group_5_2__5
            {
            pushFollow(FOLLOW_20);
            rule__XEvent__Group_5_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__4"


    // $ANTLR start "rule__XEvent__Group_5_2__4__Impl"
    // InternalXMachine.g:3297:1: rule__XEvent__Group_5_2__4__Impl : ( ( rule__XEvent__Group_5_2_4__0 )? ) ;
    public final void rule__XEvent__Group_5_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3301:1: ( ( ( rule__XEvent__Group_5_2_4__0 )? ) )
            // InternalXMachine.g:3302:1: ( ( rule__XEvent__Group_5_2_4__0 )? )
            {
            // InternalXMachine.g:3302:1: ( ( rule__XEvent__Group_5_2_4__0 )? )
            // InternalXMachine.g:3303:2: ( rule__XEvent__Group_5_2_4__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_2_4()); 
            // InternalXMachine.g:3304:2: ( rule__XEvent__Group_5_2_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==125) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXMachine.g:3304:3: rule__XEvent__Group_5_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__4__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2__5"
    // InternalXMachine.g:3312:1: rule__XEvent__Group_5_2__5 : rule__XEvent__Group_5_2__5__Impl ;
    public final void rule__XEvent__Group_5_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3316:1: ( rule__XEvent__Group_5_2__5__Impl )
            // InternalXMachine.g:3317:2: rule__XEvent__Group_5_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__5"


    // $ANTLR start "rule__XEvent__Group_5_2__5__Impl"
    // InternalXMachine.g:3323:1: rule__XEvent__Group_5_2__5__Impl : ( ( rule__XEvent__Group_5_2_5__0 )? ) ;
    public final void rule__XEvent__Group_5_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3327:1: ( ( ( rule__XEvent__Group_5_2_5__0 )? ) )
            // InternalXMachine.g:3328:1: ( ( rule__XEvent__Group_5_2_5__0 )? )
            {
            // InternalXMachine.g:3328:1: ( ( rule__XEvent__Group_5_2_5__0 )? )
            // InternalXMachine.g:3329:2: ( rule__XEvent__Group_5_2_5__0 )?
            {
             before(grammarAccess.getXEventAccess().getGroup_5_2_5()); 
            // InternalXMachine.g:3330:2: ( rule__XEvent__Group_5_2_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==127) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXMachine.g:3330:3: rule__XEvent__Group_5_2_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__Group_5_2_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXEventAccess().getGroup_5_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2__5__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_4__0"
    // InternalXMachine.g:3339:1: rule__XEvent__Group_5_2_4__0 : rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1 ;
    public final void rule__XEvent__Group_5_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3343:1: ( rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1 )
            // InternalXMachine.g:3344:2: rule__XEvent__Group_5_2_4__0__Impl rule__XEvent__Group_5_2_4__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_4__0"


    // $ANTLR start "rule__XEvent__Group_5_2_4__0__Impl"
    // InternalXMachine.g:3351:1: rule__XEvent__Group_5_2_4__0__Impl : ( 'with' ) ;
    public final void rule__XEvent__Group_5_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3355:1: ( ( 'with' ) )
            // InternalXMachine.g:3356:1: ( 'with' )
            {
            // InternalXMachine.g:3356:1: ( 'with' )
            // InternalXMachine.g:3357:2: 'with'
            {
             before(grammarAccess.getXEventAccess().getWithKeyword_5_2_4_0()); 
            match(input,125,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getWithKeyword_5_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_4__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_4__1"
    // InternalXMachine.g:3366:1: rule__XEvent__Group_5_2_4__1 : rule__XEvent__Group_5_2_4__1__Impl ;
    public final void rule__XEvent__Group_5_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3370:1: ( rule__XEvent__Group_5_2_4__1__Impl )
            // InternalXMachine.g:3371:2: rule__XEvent__Group_5_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_4__1"


    // $ANTLR start "rule__XEvent__Group_5_2_4__1__Impl"
    // InternalXMachine.g:3377:1: rule__XEvent__Group_5_2_4__1__Impl : ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3381:1: ( ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) ) )
            // InternalXMachine.g:3382:1: ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) )
            {
            // InternalXMachine.g:3382:1: ( ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* ) )
            // InternalXMachine.g:3383:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) ) ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* )
            {
            // InternalXMachine.g:3383:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 ) )
            // InternalXMachine.g:3384:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 
            // InternalXMachine.g:3385:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )
            // InternalXMachine.g:3385:4: rule__XEvent__WitnessesAssignment_5_2_4_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__WitnessesAssignment_5_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 

            }

            // InternalXMachine.g:3388:2: ( ( rule__XEvent__WitnessesAssignment_5_2_4_1 )* )
            // InternalXMachine.g:3389:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )*
            {
             before(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 
            // InternalXMachine.g:3390:3: ( rule__XEvent__WitnessesAssignment_5_2_4_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_XLABEL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalXMachine.g:3390:4: rule__XEvent__WitnessesAssignment_5_2_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__WitnessesAssignment_5_2_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getWitnessesAssignment_5_2_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_4__1__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_5__0"
    // InternalXMachine.g:3400:1: rule__XEvent__Group_5_2_5__0 : rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1 ;
    public final void rule__XEvent__Group_5_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3404:1: ( rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1 )
            // InternalXMachine.g:3405:2: rule__XEvent__Group_5_2_5__0__Impl rule__XEvent__Group_5_2_5__1
            {
            pushFollow(FOLLOW_9);
            rule__XEvent__Group_5_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_5__0"


    // $ANTLR start "rule__XEvent__Group_5_2_5__0__Impl"
    // InternalXMachine.g:3412:1: rule__XEvent__Group_5_2_5__0__Impl : ( 'then' ) ;
    public final void rule__XEvent__Group_5_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3416:1: ( ( 'then' ) )
            // InternalXMachine.g:3417:1: ( 'then' )
            {
            // InternalXMachine.g:3417:1: ( 'then' )
            // InternalXMachine.g:3418:2: 'then'
            {
             before(grammarAccess.getXEventAccess().getThenKeyword_5_2_5_0()); 
            match(input,127,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getThenKeyword_5_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_5__0__Impl"


    // $ANTLR start "rule__XEvent__Group_5_2_5__1"
    // InternalXMachine.g:3427:1: rule__XEvent__Group_5_2_5__1 : rule__XEvent__Group_5_2_5__1__Impl ;
    public final void rule__XEvent__Group_5_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3431:1: ( rule__XEvent__Group_5_2_5__1__Impl )
            // InternalXMachine.g:3432:2: rule__XEvent__Group_5_2_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__Group_5_2_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_5__1"


    // $ANTLR start "rule__XEvent__Group_5_2_5__1__Impl"
    // InternalXMachine.g:3438:1: rule__XEvent__Group_5_2_5__1__Impl : ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) ) ;
    public final void rule__XEvent__Group_5_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3442:1: ( ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) ) )
            // InternalXMachine.g:3443:1: ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) )
            {
            // InternalXMachine.g:3443:1: ( ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* ) )
            // InternalXMachine.g:3444:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) ) ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* )
            {
            // InternalXMachine.g:3444:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 ) )
            // InternalXMachine.g:3445:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 
            // InternalXMachine.g:3446:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )
            // InternalXMachine.g:3446:4: rule__XEvent__ActionsAssignment_5_2_5_1
            {
            pushFollow(FOLLOW_10);
            rule__XEvent__ActionsAssignment_5_2_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 

            }

            // InternalXMachine.g:3449:2: ( ( rule__XEvent__ActionsAssignment_5_2_5_1 )* )
            // InternalXMachine.g:3450:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )*
            {
             before(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 
            // InternalXMachine.g:3451:3: ( rule__XEvent__ActionsAssignment_5_2_5_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_XLABEL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXMachine.g:3451:4: rule__XEvent__ActionsAssignment_5_2_5_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__XEvent__ActionsAssignment_5_2_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getXEventAccess().getActionsAssignment_5_2_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__Group_5_2_5__1__Impl"


    // $ANTLR start "rule__EventSync__Group__0"
    // InternalXMachine.g:3461:1: rule__EventSync__Group__0 : rule__EventSync__Group__0__Impl rule__EventSync__Group__1 ;
    public final void rule__EventSync__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3465:1: ( rule__EventSync__Group__0__Impl rule__EventSync__Group__1 )
            // InternalXMachine.g:3466:2: rule__EventSync__Group__0__Impl rule__EventSync__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__EventSync__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3473:1: rule__EventSync__Group__0__Impl : ( () ) ;
    public final void rule__EventSync__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3477:1: ( ( () ) )
            // InternalXMachine.g:3478:1: ( () )
            {
            // InternalXMachine.g:3478:1: ( () )
            // InternalXMachine.g:3479:2: ()
            {
             before(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 
            // InternalXMachine.g:3480:2: ()
            // InternalXMachine.g:3480:3: 
            {
            }

             after(grammarAccess.getEventSyncAccess().getEventSynchronisationAction_0()); 

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
    // InternalXMachine.g:3488:1: rule__EventSync__Group__1 : rule__EventSync__Group__1__Impl ;
    public final void rule__EventSync__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3492:1: ( rule__EventSync__Group__1__Impl )
            // InternalXMachine.g:3493:2: rule__EventSync__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3499:1: rule__EventSync__Group__1__Impl : ( ( rule__EventSync__Group_1__0 ) ) ;
    public final void rule__EventSync__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3503:1: ( ( ( rule__EventSync__Group_1__0 ) ) )
            // InternalXMachine.g:3504:1: ( ( rule__EventSync__Group_1__0 ) )
            {
            // InternalXMachine.g:3504:1: ( ( rule__EventSync__Group_1__0 ) )
            // InternalXMachine.g:3505:2: ( rule__EventSync__Group_1__0 )
            {
             before(grammarAccess.getEventSyncAccess().getGroup_1()); 
            // InternalXMachine.g:3506:2: ( rule__EventSync__Group_1__0 )
            // InternalXMachine.g:3506:3: rule__EventSync__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3515:1: rule__EventSync__Group_1__0 : rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 ;
    public final void rule__EventSync__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3519:1: ( rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1 )
            // InternalXMachine.g:3520:2: rule__EventSync__Group_1__0__Impl rule__EventSync__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__EventSync__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3527:1: rule__EventSync__Group_1__0__Impl : ( 'synchronises' ) ;
    public final void rule__EventSync__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3531:1: ( ( 'synchronises' ) )
            // InternalXMachine.g:3532:1: ( 'synchronises' )
            {
            // InternalXMachine.g:3532:1: ( 'synchronises' )
            // InternalXMachine.g:3533:2: 'synchronises'
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 
            match(input,130,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getSynchronisesKeyword_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3542:1: rule__EventSync__Group_1__1 : rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 ;
    public final void rule__EventSync__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3546:1: ( rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2 )
            // InternalXMachine.g:3547:2: rule__EventSync__Group_1__1__Impl rule__EventSync__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__EventSync__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3554:1: rule__EventSync__Group_1__1__Impl : ( ( rule__EventSync__Group_1_1__0 )? ) ;
    public final void rule__EventSync__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3558:1: ( ( ( rule__EventSync__Group_1_1__0 )? ) )
            // InternalXMachine.g:3559:1: ( ( rule__EventSync__Group_1_1__0 )? )
            {
            // InternalXMachine.g:3559:1: ( ( rule__EventSync__Group_1_1__0 )? )
            // InternalXMachine.g:3560:2: ( rule__EventSync__Group_1_1__0 )?
            {
             before(grammarAccess.getEventSyncAccess().getGroup_1_1()); 
            // InternalXMachine.g:3561:2: ( rule__EventSync__Group_1_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==51) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalXMachine.g:3561:3: rule__EventSync__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventSync__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventSyncAccess().getGroup_1_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3569:1: rule__EventSync__Group_1__2 : rule__EventSync__Group_1__2__Impl ;
    public final void rule__EventSync__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3573:1: ( rule__EventSync__Group_1__2__Impl )
            // InternalXMachine.g:3574:2: rule__EventSync__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3580:1: rule__EventSync__Group_1__2__Impl : ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) ;
    public final void rule__EventSync__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3584:1: ( ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) ) )
            // InternalXMachine.g:3585:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            {
            // InternalXMachine.g:3585:1: ( ( rule__EventSync__SynchronisedEventAssignment_1_2 ) )
            // InternalXMachine.g:3586:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 
            // InternalXMachine.g:3587:2: ( rule__EventSync__SynchronisedEventAssignment_1_2 )
            // InternalXMachine.g:3587:3: rule__EventSync__SynchronisedEventAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__SynchronisedEventAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getSynchronisedEventAssignment_1_2()); 

            }


            }

        }
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
    // InternalXMachine.g:3596:1: rule__EventSync__Group_1_1__0 : rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 ;
    public final void rule__EventSync__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3600:1: ( rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1 )
            // InternalXMachine.g:3601:2: rule__EventSync__Group_1_1__0__Impl rule__EventSync__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__EventSync__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_1__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3608:1: rule__EventSync__Group_1_1__0__Impl : ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) ;
    public final void rule__EventSync__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3612:1: ( ( ( rule__EventSync__PrefixAssignment_1_1_0 ) ) )
            // InternalXMachine.g:3613:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            {
            // InternalXMachine.g:3613:1: ( ( rule__EventSync__PrefixAssignment_1_1_0 ) )
            // InternalXMachine.g:3614:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            {
             before(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 
            // InternalXMachine.g:3615:2: ( rule__EventSync__PrefixAssignment_1_1_0 )
            // InternalXMachine.g:3615:3: rule__EventSync__PrefixAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__PrefixAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEventSyncAccess().getPrefixAssignment_1_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:3623:1: rule__EventSync__Group_1_1__1 : rule__EventSync__Group_1_1__1__Impl ;
    public final void rule__EventSync__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3627:1: ( rule__EventSync__Group_1_1__1__Impl )
            // InternalXMachine.g:3628:2: rule__EventSync__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSync__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3634:1: rule__EventSync__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__EventSync__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3638:1: ( ( '.' ) )
            // InternalXMachine.g:3639:1: ( '.' )
            {
            // InternalXMachine.g:3639:1: ( '.' )
            // InternalXMachine.g:3640:2: '.'
            {
             before(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getFullStopKeyword_1_1_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3650:1: rule__XParameter__Group__0 : rule__XParameter__Group__0__Impl rule__XParameter__Group__1 ;
    public final void rule__XParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3654:1: ( rule__XParameter__Group__0__Impl rule__XParameter__Group__1 )
            // InternalXMachine.g:3655:2: rule__XParameter__Group__0__Impl rule__XParameter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XParameter__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3662:1: rule__XParameter__Group__0__Impl : ( () ) ;
    public final void rule__XParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3666:1: ( ( () ) )
            // InternalXMachine.g:3667:1: ( () )
            {
            // InternalXMachine.g:3667:1: ( () )
            // InternalXMachine.g:3668:2: ()
            {
             before(grammarAccess.getXParameterAccess().getParameterAction_0()); 
            // InternalXMachine.g:3669:2: ()
            // InternalXMachine.g:3669:3: 
            {
            }

             after(grammarAccess.getXParameterAccess().getParameterAction_0()); 

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
    // InternalXMachine.g:3677:1: rule__XParameter__Group__1 : rule__XParameter__Group__1__Impl ;
    public final void rule__XParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3681:1: ( rule__XParameter__Group__1__Impl )
            // InternalXMachine.g:3682:2: rule__XParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3688:1: rule__XParameter__Group__1__Impl : ( ( rule__XParameter__NameAssignment_1 ) ) ;
    public final void rule__XParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3692:1: ( ( ( rule__XParameter__NameAssignment_1 ) ) )
            // InternalXMachine.g:3693:1: ( ( rule__XParameter__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3693:1: ( ( rule__XParameter__NameAssignment_1 ) )
            // InternalXMachine.g:3694:2: ( rule__XParameter__NameAssignment_1 )
            {
             before(grammarAccess.getXParameterAccess().getNameAssignment_1()); 
            // InternalXMachine.g:3695:2: ( rule__XParameter__NameAssignment_1 )
            // InternalXMachine.g:3695:3: rule__XParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXParameterAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3704:1: rule__XGuard__Group__0 : rule__XGuard__Group__0__Impl rule__XGuard__Group__1 ;
    public final void rule__XGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3708:1: ( rule__XGuard__Group__0__Impl rule__XGuard__Group__1 )
            // InternalXMachine.g:3709:2: rule__XGuard__Group__0__Impl rule__XGuard__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XGuard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3716:1: rule__XGuard__Group__0__Impl : ( () ) ;
    public final void rule__XGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3720:1: ( ( () ) )
            // InternalXMachine.g:3721:1: ( () )
            {
            // InternalXMachine.g:3721:1: ( () )
            // InternalXMachine.g:3722:2: ()
            {
             before(grammarAccess.getXGuardAccess().getGuardAction_0()); 
            // InternalXMachine.g:3723:2: ()
            // InternalXMachine.g:3723:3: 
            {
            }

             after(grammarAccess.getXGuardAccess().getGuardAction_0()); 

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
    // InternalXMachine.g:3731:1: rule__XGuard__Group__1 : rule__XGuard__Group__1__Impl rule__XGuard__Group__2 ;
    public final void rule__XGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3735:1: ( rule__XGuard__Group__1__Impl rule__XGuard__Group__2 )
            // InternalXMachine.g:3736:2: rule__XGuard__Group__1__Impl rule__XGuard__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XGuard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3743:1: rule__XGuard__Group__1__Impl : ( ( rule__XGuard__NameAssignment_1 ) ) ;
    public final void rule__XGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3747:1: ( ( ( rule__XGuard__NameAssignment_1 ) ) )
            // InternalXMachine.g:3748:1: ( ( rule__XGuard__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3748:1: ( ( rule__XGuard__NameAssignment_1 ) )
            // InternalXMachine.g:3749:2: ( rule__XGuard__NameAssignment_1 )
            {
             before(grammarAccess.getXGuardAccess().getNameAssignment_1()); 
            // InternalXMachine.g:3750:2: ( rule__XGuard__NameAssignment_1 )
            // InternalXMachine.g:3750:3: rule__XGuard__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3758:1: rule__XGuard__Group__2 : rule__XGuard__Group__2__Impl rule__XGuard__Group__3 ;
    public final void rule__XGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3762:1: ( rule__XGuard__Group__2__Impl rule__XGuard__Group__3 )
            // InternalXMachine.g:3763:2: rule__XGuard__Group__2__Impl rule__XGuard__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__XGuard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGuard__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3770:1: rule__XGuard__Group__2__Impl : ( ( rule__XGuard__PredicateAssignment_2 ) ) ;
    public final void rule__XGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3774:1: ( ( ( rule__XGuard__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:3775:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:3775:1: ( ( rule__XGuard__PredicateAssignment_2 ) )
            // InternalXMachine.g:3776:2: ( rule__XGuard__PredicateAssignment_2 )
            {
             before(grammarAccess.getXGuardAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:3777:2: ( rule__XGuard__PredicateAssignment_2 )
            // InternalXMachine.g:3777:3: rule__XGuard__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXGuardAccess().getPredicateAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:3785:1: rule__XGuard__Group__3 : rule__XGuard__Group__3__Impl ;
    public final void rule__XGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3789:1: ( rule__XGuard__Group__3__Impl )
            // InternalXMachine.g:3790:2: rule__XGuard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGuard__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3796:1: rule__XGuard__Group__3__Impl : ( ( rule__XGuard__TheoremAssignment_3 )? ) ;
    public final void rule__XGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3800:1: ( ( ( rule__XGuard__TheoremAssignment_3 )? ) )
            // InternalXMachine.g:3801:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            {
            // InternalXMachine.g:3801:1: ( ( rule__XGuard__TheoremAssignment_3 )? )
            // InternalXMachine.g:3802:2: ( rule__XGuard__TheoremAssignment_3 )?
            {
             before(grammarAccess.getXGuardAccess().getTheoremAssignment_3()); 
            // InternalXMachine.g:3803:2: ( rule__XGuard__TheoremAssignment_3 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==133) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXMachine.g:3803:3: rule__XGuard__TheoremAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XGuard__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXGuardAccess().getTheoremAssignment_3()); 

            }


            }

        }
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
    // InternalXMachine.g:3812:1: rule__XWitness__Group__0 : rule__XWitness__Group__0__Impl rule__XWitness__Group__1 ;
    public final void rule__XWitness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3816:1: ( rule__XWitness__Group__0__Impl rule__XWitness__Group__1 )
            // InternalXMachine.g:3817:2: rule__XWitness__Group__0__Impl rule__XWitness__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XWitness__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitness__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3824:1: rule__XWitness__Group__0__Impl : ( () ) ;
    public final void rule__XWitness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3828:1: ( ( () ) )
            // InternalXMachine.g:3829:1: ( () )
            {
            // InternalXMachine.g:3829:1: ( () )
            // InternalXMachine.g:3830:2: ()
            {
             before(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 
            // InternalXMachine.g:3831:2: ()
            // InternalXMachine.g:3831:3: 
            {
            }

             after(grammarAccess.getXWitnessAccess().getWitnessAction_0()); 

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
    // InternalXMachine.g:3839:1: rule__XWitness__Group__1 : rule__XWitness__Group__1__Impl rule__XWitness__Group__2 ;
    public final void rule__XWitness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3843:1: ( rule__XWitness__Group__1__Impl rule__XWitness__Group__2 )
            // InternalXMachine.g:3844:2: rule__XWitness__Group__1__Impl rule__XWitness__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XWitness__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XWitness__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3851:1: rule__XWitness__Group__1__Impl : ( ( rule__XWitness__NameAssignment_1 ) ) ;
    public final void rule__XWitness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3855:1: ( ( ( rule__XWitness__NameAssignment_1 ) ) )
            // InternalXMachine.g:3856:1: ( ( rule__XWitness__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3856:1: ( ( rule__XWitness__NameAssignment_1 ) )
            // InternalXMachine.g:3857:2: ( rule__XWitness__NameAssignment_1 )
            {
             before(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 
            // InternalXMachine.g:3858:2: ( rule__XWitness__NameAssignment_1 )
            // InternalXMachine.g:3858:3: rule__XWitness__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3866:1: rule__XWitness__Group__2 : rule__XWitness__Group__2__Impl ;
    public final void rule__XWitness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3870:1: ( rule__XWitness__Group__2__Impl )
            // InternalXMachine.g:3871:2: rule__XWitness__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3877:1: rule__XWitness__Group__2__Impl : ( ( rule__XWitness__PredicateAssignment_2 ) ) ;
    public final void rule__XWitness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3881:1: ( ( ( rule__XWitness__PredicateAssignment_2 ) ) )
            // InternalXMachine.g:3882:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            {
            // InternalXMachine.g:3882:1: ( ( rule__XWitness__PredicateAssignment_2 ) )
            // InternalXMachine.g:3883:2: ( rule__XWitness__PredicateAssignment_2 )
            {
             before(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 
            // InternalXMachine.g:3884:2: ( rule__XWitness__PredicateAssignment_2 )
            // InternalXMachine.g:3884:3: rule__XWitness__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XWitness__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXWitnessAccess().getPredicateAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:3893:1: rule__XAction__Group__0 : rule__XAction__Group__0__Impl rule__XAction__Group__1 ;
    public final void rule__XAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3897:1: ( rule__XAction__Group__0__Impl rule__XAction__Group__1 )
            // InternalXMachine.g:3898:2: rule__XAction__Group__0__Impl rule__XAction__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__XAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAction__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3905:1: rule__XAction__Group__0__Impl : ( () ) ;
    public final void rule__XAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3909:1: ( ( () ) )
            // InternalXMachine.g:3910:1: ( () )
            {
            // InternalXMachine.g:3910:1: ( () )
            // InternalXMachine.g:3911:2: ()
            {
             before(grammarAccess.getXActionAccess().getActionAction_0()); 
            // InternalXMachine.g:3912:2: ()
            // InternalXMachine.g:3912:3: 
            {
            }

             after(grammarAccess.getXActionAccess().getActionAction_0()); 

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
    // InternalXMachine.g:3920:1: rule__XAction__Group__1 : rule__XAction__Group__1__Impl rule__XAction__Group__2 ;
    public final void rule__XAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3924:1: ( rule__XAction__Group__1__Impl rule__XAction__Group__2 )
            // InternalXMachine.g:3925:2: rule__XAction__Group__1__Impl rule__XAction__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XAction__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3932:1: rule__XAction__Group__1__Impl : ( ( rule__XAction__NameAssignment_1 ) ) ;
    public final void rule__XAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3936:1: ( ( ( rule__XAction__NameAssignment_1 ) ) )
            // InternalXMachine.g:3937:1: ( ( rule__XAction__NameAssignment_1 ) )
            {
            // InternalXMachine.g:3937:1: ( ( rule__XAction__NameAssignment_1 ) )
            // InternalXMachine.g:3938:2: ( rule__XAction__NameAssignment_1 )
            {
             before(grammarAccess.getXActionAccess().getNameAssignment_1()); 
            // InternalXMachine.g:3939:2: ( rule__XAction__NameAssignment_1 )
            // InternalXMachine.g:3939:3: rule__XAction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XAction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXMachine.g:3947:1: rule__XAction__Group__2 : rule__XAction__Group__2__Impl ;
    public final void rule__XAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3951:1: ( rule__XAction__Group__2__Impl )
            // InternalXMachine.g:3952:2: rule__XAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XAction__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3958:1: rule__XAction__Group__2__Impl : ( ( rule__XAction__ActionAssignment_2 ) ) ;
    public final void rule__XAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3962:1: ( ( ( rule__XAction__ActionAssignment_2 ) ) )
            // InternalXMachine.g:3963:1: ( ( rule__XAction__ActionAssignment_2 ) )
            {
            // InternalXMachine.g:3963:1: ( ( rule__XAction__ActionAssignment_2 ) )
            // InternalXMachine.g:3964:2: ( rule__XAction__ActionAssignment_2 )
            {
             before(grammarAccess.getXActionAccess().getActionAssignment_2()); 
            // InternalXMachine.g:3965:2: ( rule__XAction__ActionAssignment_2 )
            // InternalXMachine.g:3965:3: rule__XAction__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XAction__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXActionAccess().getActionAssignment_2()); 

            }


            }

        }
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
    // InternalXMachine.g:3974:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3978:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalXMachine.g:3979:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FOLLOW_23);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:3986:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:3990:1: ( ( '%' ) )
            // InternalXMachine.g:3991:1: ( '%' )
            {
            // InternalXMachine.g:3991:1: ( '%' )
            // InternalXMachine.g:3992:2: '%'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            match(input,131,FOLLOW_2); 
             after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4001:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4005:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalXMachine.g:4006:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXMachine.g:4012:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4016:1: ( ( '\\u22C2' ) )
            // InternalXMachine.g:4017:1: ( '\\u22C2' )
            {
            // InternalXMachine.g:4017:1: ( '\\u22C2' )
            // InternalXMachine.g:4018:2: '\\u22C2'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            match(input,132,FOLLOW_2); 
             after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XEvent__UnorderedGroup_2"
    // InternalXMachine.g:4028:1: rule__XEvent__UnorderedGroup_2 : ( rule__XEvent__UnorderedGroup_2__0 )? ;
    public final void rule__XEvent__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getXEventAccess().getUnorderedGroup_2());
        	
        try {
            // InternalXMachine.g:4033:1: ( ( rule__XEvent__UnorderedGroup_2__0 )? )
            // InternalXMachine.g:4034:2: ( rule__XEvent__UnorderedGroup_2__0 )?
            {
            // InternalXMachine.g:4034:2: ( rule__XEvent__UnorderedGroup_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 134 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 >= 110 && LA46_0 <= 112 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXMachine.g:4034:2: rule__XEvent__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_2__0();

                    state._fsp--;


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

            	getUnorderedGroupHelper().leave(grammarAccess.getXEventAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_2"


    // $ANTLR start "rule__XEvent__UnorderedGroup_2__Impl"
    // InternalXMachine.g:4042:1: rule__XEvent__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) ) ;
    public final void rule__XEvent__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXMachine.g:4047:1: ( ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) ) )
            // InternalXMachine.g:4048:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) )
            {
            // InternalXMachine.g:4048:3: ( ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 134 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 >= 110 && LA47_0 <= 112 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalXMachine.g:4049:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) )
                    {
                    // InternalXMachine.g:4049:3: ({...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) ) )
                    // InternalXMachine.g:4050:4: {...}? => ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalXMachine.g:4050:102: ( ( ( rule__XEvent__ExtendedAssignment_2_0 ) ) )
                    // InternalXMachine.g:4051:5: ( ( rule__XEvent__ExtendedAssignment_2_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXMachine.g:4057:5: ( ( rule__XEvent__ExtendedAssignment_2_0 ) )
                    // InternalXMachine.g:4058:6: ( rule__XEvent__ExtendedAssignment_2_0 )
                    {
                     before(grammarAccess.getXEventAccess().getExtendedAssignment_2_0()); 
                    // InternalXMachine.g:4059:6: ( rule__XEvent__ExtendedAssignment_2_0 )
                    // InternalXMachine.g:4059:7: rule__XEvent__ExtendedAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ExtendedAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getExtendedAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXMachine.g:4064:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) )
                    {
                    // InternalXMachine.g:4064:3: ({...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) ) )
                    // InternalXMachine.g:4065:4: {...}? => ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__XEvent__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalXMachine.g:4065:102: ( ( ( rule__XEvent__ConvergenceAssignment_2_1 ) ) )
                    // InternalXMachine.g:4066:5: ( ( rule__XEvent__ConvergenceAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXMachine.g:4072:5: ( ( rule__XEvent__ConvergenceAssignment_2_1 ) )
                    // InternalXMachine.g:4073:6: ( rule__XEvent__ConvergenceAssignment_2_1 )
                    {
                     before(grammarAccess.getXEventAccess().getConvergenceAssignment_2_1()); 
                    // InternalXMachine.g:4074:6: ( rule__XEvent__ConvergenceAssignment_2_1 )
                    // InternalXMachine.g:4074:7: rule__XEvent__ConvergenceAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__ConvergenceAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXEventAccess().getConvergenceAssignment_2_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getXEventAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__XEvent__UnorderedGroup_2__0"
    // InternalXMachine.g:4087:1: rule__XEvent__UnorderedGroup_2__0 : rule__XEvent__UnorderedGroup_2__Impl ( rule__XEvent__UnorderedGroup_2__1 )? ;
    public final void rule__XEvent__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4091:1: ( rule__XEvent__UnorderedGroup_2__Impl ( rule__XEvent__UnorderedGroup_2__1 )? )
            // InternalXMachine.g:4092:2: rule__XEvent__UnorderedGroup_2__Impl ( rule__XEvent__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_24);
            rule__XEvent__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalXMachine.g:4093:2: ( rule__XEvent__UnorderedGroup_2__1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 134 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 >= 110 && LA48_0 <= 112 && getUnorderedGroupHelper().canSelect(grammarAccess.getXEventAccess().getUnorderedGroup_2(), 1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXMachine.g:4093:2: rule__XEvent__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XEvent__UnorderedGroup_2__1();

                    state._fsp--;


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
    // $ANTLR end "rule__XEvent__UnorderedGroup_2__0"


    // $ANTLR start "rule__XEvent__UnorderedGroup_2__1"
    // InternalXMachine.g:4099:1: rule__XEvent__UnorderedGroup_2__1 : rule__XEvent__UnorderedGroup_2__Impl ;
    public final void rule__XEvent__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4103:1: ( rule__XEvent__UnorderedGroup_2__Impl )
            // InternalXMachine.g:4104:2: rule__XEvent__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XEvent__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__UnorderedGroup_2__1"


    // $ANTLR start "rule__Machine__CommentAssignment_1"
    // InternalXMachine.g:4111:1: rule__Machine__CommentAssignment_1 : ( ( rule__Machine__CommentAlternatives_1_0 ) ) ;
    public final void rule__Machine__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4115:1: ( ( ( rule__Machine__CommentAlternatives_1_0 ) ) )
            // InternalXMachine.g:4116:2: ( ( rule__Machine__CommentAlternatives_1_0 ) )
            {
            // InternalXMachine.g:4116:2: ( ( rule__Machine__CommentAlternatives_1_0 ) )
            // InternalXMachine.g:4117:3: ( rule__Machine__CommentAlternatives_1_0 )
            {
             before(grammarAccess.getMachineAccess().getCommentAlternatives_1_0()); 
            // InternalXMachine.g:4118:3: ( rule__Machine__CommentAlternatives_1_0 )
            // InternalXMachine.g:4118:4: rule__Machine__CommentAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__CommentAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getCommentAlternatives_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4126:1: rule__Machine__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4130:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4131:2: ( RULE_ID )
            {
            // InternalXMachine.g:4131:2: ( RULE_ID )
            // InternalXMachine.g:4132:3: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Machine__ExtensionsAssignment_4"
    // InternalXMachine.g:4141:1: rule__Machine__ExtensionsAssignment_4 : ( ruleMIncludes ) ;
    public final void rule__Machine__ExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4145:1: ( ( ruleMIncludes ) )
            // InternalXMachine.g:4146:2: ( ruleMIncludes )
            {
            // InternalXMachine.g:4146:2: ( ruleMIncludes )
            // InternalXMachine.g:4147:3: ruleMIncludes
            {
             before(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMIncludes();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getExtensionsMIncludesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ExtensionsAssignment_4"


    // $ANTLR start "rule__Machine__RefinesAssignment_5_1"
    // InternalXMachine.g:4156:1: rule__Machine__RefinesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4160:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4161:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4161:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4162:3: ( RULE_ID )
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_5_1_0()); 
            // InternalXMachine.g:4163:3: ( RULE_ID )
            // InternalXMachine.g:4164:4: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRefinesMachineIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__RefinesAssignment_5_1"


    // $ANTLR start "rule__Machine__SeesAssignment_6_1"
    // InternalXMachine.g:4175:1: rule__Machine__SeesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Machine__SeesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4179:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4180:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4180:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4181:3: ( RULE_ID )
            {
             before(grammarAccess.getMachineAccess().getSeesContextCrossReference_6_1_0()); 
            // InternalXMachine.g:4182:3: ( RULE_ID )
            // InternalXMachine.g:4183:4: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getSeesContextIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getSeesContextCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__SeesAssignment_6_1"


    // $ANTLR start "rule__Machine__VariablesAssignment_7_1"
    // InternalXMachine.g:4194:1: rule__Machine__VariablesAssignment_7_1 : ( ruleXVariable ) ;
    public final void rule__Machine__VariablesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4198:1: ( ( ruleXVariable ) )
            // InternalXMachine.g:4199:2: ( ruleXVariable )
            {
            // InternalXMachine.g:4199:2: ( ruleXVariable )
            // InternalXMachine.g:4200:3: ruleXVariable
            {
             before(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXVariable();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariablesXVariableParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariablesAssignment_7_1"


    // $ANTLR start "rule__Machine__InvariantsAssignment_8_1"
    // InternalXMachine.g:4209:1: rule__Machine__InvariantsAssignment_8_1 : ( ruleXInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4213:1: ( ( ruleXInvariant ) )
            // InternalXMachine.g:4214:2: ( ruleXInvariant )
            {
            // InternalXMachine.g:4214:2: ( ruleXInvariant )
            // InternalXMachine.g:4215:3: ruleXInvariant
            {
             before(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXInvariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getInvariantsXInvariantParserRuleCall_8_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Machine__VariantAssignment_9_1"
    // InternalXMachine.g:4224:1: rule__Machine__VariantAssignment_9_1 : ( ruleXVariant ) ;
    public final void rule__Machine__VariantAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4228:1: ( ( ruleXVariant ) )
            // InternalXMachine.g:4229:2: ( ruleXVariant )
            {
            // InternalXMachine.g:4229:2: ( ruleXVariant )
            // InternalXMachine.g:4230:3: ruleXVariant
            {
             before(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXVariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariantXVariantParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariantAssignment_9_1"


    // $ANTLR start "rule__Machine__EventsAssignment_10_1"
    // InternalXMachine.g:4239:1: rule__Machine__EventsAssignment_10_1 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4243:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4244:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4244:2: ( ruleXEvent )
            // InternalXMachine.g:4245:3: ruleXEvent
            {
             before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Machine__EventsAssignment_10_2"
    // InternalXMachine.g:4254:1: rule__Machine__EventsAssignment_10_2 : ( ruleXEvent ) ;
    public final void rule__Machine__EventsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4258:1: ( ( ruleXEvent ) )
            // InternalXMachine.g:4259:2: ( ruleXEvent )
            {
            // InternalXMachine.g:4259:2: ( ruleXEvent )
            // InternalXMachine.g:4260:3: ruleXEvent
            {
             before(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXEvent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsXEventParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_10_2"


    // $ANTLR start "rule__MIncludes__AbstractMachineAssignment_1_1"
    // InternalXMachine.g:4269:1: rule__MIncludes__AbstractMachineAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MIncludes__AbstractMachineAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4273:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXMachine.g:4274:2: ( ( ruleQualifiedName ) )
            {
            // InternalXMachine.g:4274:2: ( ( ruleQualifiedName ) )
            // InternalXMachine.g:4275:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 
            // InternalXMachine.g:4276:3: ( ruleQualifiedName )
            // InternalXMachine.g:4277:4: ruleQualifiedName
            {
             before(grammarAccess.getMIncludesAccess().getAbstractMachineMachineQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMIncludesAccess().getAbstractMachineMachineQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getMIncludesAccess().getAbstractMachineMachineCrossReference_1_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4288:1: rule__MIncludes__ConcreteMachineAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MIncludes__ConcreteMachineAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4292:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4293:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4293:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4294:3: ( RULE_ID )
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 
            // InternalXMachine.g:4295:3: ( RULE_ID )
            // InternalXMachine.g:4296:4: RULE_ID
            {
             before(grammarAccess.getMIncludesAccess().getConcreteMachineMachineIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getConcreteMachineMachineIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMIncludesAccess().getConcreteMachineMachineCrossReference_2_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4307:1: rule__MIncludes__PrefixesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4311:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4312:2: ( RULE_ID )
            {
            // InternalXMachine.g:4312:2: ( RULE_ID )
            // InternalXMachine.g:4313:3: RULE_ID
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4322:1: rule__MIncludes__PrefixesAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__MIncludes__PrefixesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4326:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4327:2: ( RULE_ID )
            {
            // InternalXMachine.g:4327:2: ( RULE_ID )
            // InternalXMachine.g:4328:3: RULE_ID
            {
             before(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMIncludesAccess().getPrefixesIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4337:1: rule__XVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4341:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4342:2: ( RULE_ID )
            {
            // InternalXMachine.g:4342:2: ( RULE_ID )
            // InternalXMachine.g:4343:3: RULE_ID
            {
             before(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__XInvariant__NameAssignment_1"
    // InternalXMachine.g:4352:1: rule__XInvariant__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XInvariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4356:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4357:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4357:2: ( RULE_XLABEL )
            // InternalXMachine.g:4358:3: RULE_XLABEL
            {
             before(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__NameAssignment_1"


    // $ANTLR start "rule__XInvariant__PredicateAssignment_2"
    // InternalXMachine.g:4367:1: rule__XInvariant__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XInvariant__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4371:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4372:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4372:2: ( ruleXPredicate )
            // InternalXMachine.g:4373:3: ruleXPredicate
            {
             before(grammarAccess.getXInvariantAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXInvariantAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__PredicateAssignment_2"


    // $ANTLR start "rule__XInvariant__TheoremAssignment_3"
    // InternalXMachine.g:4382:1: rule__XInvariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XInvariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4386:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:4387:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:4387:2: ( ( 'theorem' ) )
            // InternalXMachine.g:4388:3: ( 'theorem' )
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:4389:3: ( 'theorem' )
            // InternalXMachine.g:4390:4: 'theorem'
            {
             before(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,133,FOLLOW_2); 
             after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXInvariantAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XInvariant__TheoremAssignment_3"


    // $ANTLR start "rule__XVariant__ExpressionAssignment_1"
    // InternalXMachine.g:4401:1: rule__XVariant__ExpressionAssignment_1 : ( ruleXPredicate ) ;
    public final void rule__XVariant__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4405:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4406:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4406:2: ( ruleXPredicate )
            // InternalXMachine.g:4407:3: ruleXPredicate
            {
             before(grammarAccess.getXVariantAccess().getExpressionXPredicateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXVariantAccess().getExpressionXPredicateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XVariant__ExpressionAssignment_1"


    // $ANTLR start "rule__XEvent__NameAssignment_1"
    // InternalXMachine.g:4416:1: rule__XEvent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XEvent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4420:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4421:2: ( RULE_ID )
            {
            // InternalXMachine.g:4421:2: ( RULE_ID )
            // InternalXMachine.g:4422:3: RULE_ID
            {
             before(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__NameAssignment_1"


    // $ANTLR start "rule__XEvent__ExtendedAssignment_2_0"
    // InternalXMachine.g:4431:1: rule__XEvent__ExtendedAssignment_2_0 : ( ( 'extended' ) ) ;
    public final void rule__XEvent__ExtendedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4435:1: ( ( ( 'extended' ) ) )
            // InternalXMachine.g:4436:2: ( ( 'extended' ) )
            {
            // InternalXMachine.g:4436:2: ( ( 'extended' ) )
            // InternalXMachine.g:4437:3: ( 'extended' )
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 
            // InternalXMachine.g:4438:3: ( 'extended' )
            // InternalXMachine.g:4439:4: 'extended'
            {
             before(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 
            match(input,134,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 

            }

             after(grammarAccess.getXEventAccess().getExtendedExtendedKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtendedAssignment_2_0"


    // $ANTLR start "rule__XEvent__ConvergenceAssignment_2_1"
    // InternalXMachine.g:4450:1: rule__XEvent__ConvergenceAssignment_2_1 : ( ruleXConvergence ) ;
    public final void rule__XEvent__ConvergenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4454:1: ( ( ruleXConvergence ) )
            // InternalXMachine.g:4455:2: ( ruleXConvergence )
            {
            // InternalXMachine.g:4455:2: ( ruleXConvergence )
            // InternalXMachine.g:4456:3: ruleXConvergence
            {
             before(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXConvergence();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getConvergenceXConvergenceEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ConvergenceAssignment_2_1"


    // $ANTLR start "rule__XEvent__ExtensionsAssignment_3"
    // InternalXMachine.g:4465:1: rule__XEvent__ExtensionsAssignment_3 : ( ruleEventSync ) ;
    public final void rule__XEvent__ExtensionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4469:1: ( ( ruleEventSync ) )
            // InternalXMachine.g:4470:2: ( ruleEventSync )
            {
            // InternalXMachine.g:4470:2: ( ruleEventSync )
            // InternalXMachine.g:4471:3: ruleEventSync
            {
             before(grammarAccess.getXEventAccess().getExtensionsEventSyncParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEventSync();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getExtensionsEventSyncParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ExtensionsAssignment_3"


    // $ANTLR start "rule__XEvent__RefinesAssignment_4_1"
    // InternalXMachine.g:4480:1: rule__XEvent__RefinesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__XEvent__RefinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4484:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4485:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4485:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4486:3: ( RULE_ID )
            {
             before(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_0()); 
            // InternalXMachine.g:4487:3: ( RULE_ID )
            // InternalXMachine.g:4488:4: RULE_ID
            {
             before(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXEventAccess().getRefinesEventIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getXEventAccess().getRefinesEventCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__RefinesAssignment_4_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_5_0_0_1"
    // InternalXMachine.g:4499:1: rule__XEvent__WitnessesAssignment_5_0_0_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4503:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4504:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4504:2: ( ruleXWitness )
            // InternalXMachine.g:4505:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_5_0_0_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_5_0_2"
    // InternalXMachine.g:4514:1: rule__XEvent__ActionsAssignment_5_0_2 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4518:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4519:2: ( ruleXAction )
            {
            // InternalXMachine.g:4519:2: ( ruleXAction )
            // InternalXMachine.g:4520:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_5_0_2"


    // $ANTLR start "rule__XEvent__GuardsAssignment_5_1_1"
    // InternalXMachine.g:4529:1: rule__XEvent__GuardsAssignment_5_1_1 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4533:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:4534:2: ( ruleXGuard )
            {
            // InternalXMachine.g:4534:2: ( ruleXGuard )
            // InternalXMachine.g:4535:3: ruleXGuard
            {
             before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__GuardsAssignment_5_1_1"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_5_1_2_1"
    // InternalXMachine.g:4544:1: rule__XEvent__WitnessesAssignment_5_1_2_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4548:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4549:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4549:2: ( ruleXWitness )
            // InternalXMachine.g:4550:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_5_1_2_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_5_1_3_1"
    // InternalXMachine.g:4559:1: rule__XEvent__ActionsAssignment_5_1_3_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4563:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4564:2: ( ruleXAction )
            {
            // InternalXMachine.g:4564:2: ( ruleXAction )
            // InternalXMachine.g:4565:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_5_1_3_1"


    // $ANTLR start "rule__XEvent__ParametersAssignment_5_2_1"
    // InternalXMachine.g:4574:1: rule__XEvent__ParametersAssignment_5_2_1 : ( ruleXParameter ) ;
    public final void rule__XEvent__ParametersAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4578:1: ( ( ruleXParameter ) )
            // InternalXMachine.g:4579:2: ( ruleXParameter )
            {
            // InternalXMachine.g:4579:2: ( ruleXParameter )
            // InternalXMachine.g:4580:3: ruleXParameter
            {
             before(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXParameter();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getParametersXParameterParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ParametersAssignment_5_2_1"


    // $ANTLR start "rule__XEvent__GuardsAssignment_5_2_3"
    // InternalXMachine.g:4589:1: rule__XEvent__GuardsAssignment_5_2_3 : ( ruleXGuard ) ;
    public final void rule__XEvent__GuardsAssignment_5_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4593:1: ( ( ruleXGuard ) )
            // InternalXMachine.g:4594:2: ( ruleXGuard )
            {
            // InternalXMachine.g:4594:2: ( ruleXGuard )
            // InternalXMachine.g:4595:3: ruleXGuard
            {
             before(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXGuard();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getGuardsXGuardParserRuleCall_5_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__GuardsAssignment_5_2_3"


    // $ANTLR start "rule__XEvent__WitnessesAssignment_5_2_4_1"
    // InternalXMachine.g:4604:1: rule__XEvent__WitnessesAssignment_5_2_4_1 : ( ruleXWitness ) ;
    public final void rule__XEvent__WitnessesAssignment_5_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4608:1: ( ( ruleXWitness ) )
            // InternalXMachine.g:4609:2: ( ruleXWitness )
            {
            // InternalXMachine.g:4609:2: ( ruleXWitness )
            // InternalXMachine.g:4610:3: ruleXWitness
            {
             before(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXWitness();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getWitnessesXWitnessParserRuleCall_5_2_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__WitnessesAssignment_5_2_4_1"


    // $ANTLR start "rule__XEvent__ActionsAssignment_5_2_5_1"
    // InternalXMachine.g:4619:1: rule__XEvent__ActionsAssignment_5_2_5_1 : ( ruleXAction ) ;
    public final void rule__XEvent__ActionsAssignment_5_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4623:1: ( ( ruleXAction ) )
            // InternalXMachine.g:4624:2: ( ruleXAction )
            {
            // InternalXMachine.g:4624:2: ( ruleXAction )
            // InternalXMachine.g:4625:3: ruleXAction
            {
             before(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_2_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXAction();

            state._fsp--;

             after(grammarAccess.getXEventAccess().getActionsXActionParserRuleCall_5_2_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XEvent__ActionsAssignment_5_2_5_1"


    // $ANTLR start "rule__EventSync__PrefixAssignment_1_1_0"
    // InternalXMachine.g:4634:1: rule__EventSync__PrefixAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__EventSync__PrefixAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4638:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4639:2: ( RULE_ID )
            {
            // InternalXMachine.g:4639:2: ( RULE_ID )
            // InternalXMachine.g:4640:3: RULE_ID
            {
             before(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getPrefixIDTerminalRuleCall_1_1_0_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4649:1: rule__EventSync__SynchronisedEventAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventSync__SynchronisedEventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4653:1: ( ( ( RULE_ID ) ) )
            // InternalXMachine.g:4654:2: ( ( RULE_ID ) )
            {
            // InternalXMachine.g:4654:2: ( ( RULE_ID ) )
            // InternalXMachine.g:4655:3: ( RULE_ID )
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 
            // InternalXMachine.g:4656:3: ( RULE_ID )
            // InternalXMachine.g:4657:4: RULE_ID
            {
             before(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getEventSyncAccess().getSynchronisedEventEventCrossReference_1_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4668:1: rule__XParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4672:1: ( ( RULE_ID ) )
            // InternalXMachine.g:4673:2: ( RULE_ID )
            {
            // InternalXMachine.g:4673:2: ( RULE_ID )
            // InternalXMachine.g:4674:3: RULE_ID
            {
             before(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__XGuard__NameAssignment_1"
    // InternalXMachine.g:4683:1: rule__XGuard__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XGuard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4687:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4688:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4688:2: ( RULE_XLABEL )
            // InternalXMachine.g:4689:3: RULE_XLABEL
            {
             before(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__NameAssignment_1"


    // $ANTLR start "rule__XGuard__PredicateAssignment_2"
    // InternalXMachine.g:4698:1: rule__XGuard__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XGuard__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4702:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4703:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4703:2: ( ruleXPredicate )
            // InternalXMachine.g:4704:3: ruleXPredicate
            {
             before(grammarAccess.getXGuardAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXGuardAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__PredicateAssignment_2"


    // $ANTLR start "rule__XGuard__TheoremAssignment_3"
    // InternalXMachine.g:4713:1: rule__XGuard__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__XGuard__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4717:1: ( ( ( 'theorem' ) ) )
            // InternalXMachine.g:4718:2: ( ( 'theorem' ) )
            {
            // InternalXMachine.g:4718:2: ( ( 'theorem' ) )
            // InternalXMachine.g:4719:3: ( 'theorem' )
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            // InternalXMachine.g:4720:3: ( 'theorem' )
            // InternalXMachine.g:4721:4: 'theorem'
            {
             before(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,133,FOLLOW_2); 
             after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getXGuardAccess().getTheoremTheoremKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGuard__TheoremAssignment_3"


    // $ANTLR start "rule__XWitness__NameAssignment_1"
    // InternalXMachine.g:4732:1: rule__XWitness__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XWitness__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4736:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4737:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4737:2: ( RULE_XLABEL )
            // InternalXMachine.g:4738:3: RULE_XLABEL
            {
             before(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXWitnessAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4747:1: rule__XWitness__PredicateAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XWitness__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4751:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4752:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4752:2: ( ruleXPredicate )
            // InternalXMachine.g:4753:3: ruleXPredicate
            {
             before(grammarAccess.getXWitnessAccess().getPredicateXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXWitnessAccess().getPredicateXPredicateParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4762:1: rule__XAction__NameAssignment_1 : ( RULE_XLABEL ) ;
    public final void rule__XAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4766:1: ( ( RULE_XLABEL ) )
            // InternalXMachine.g:4767:2: ( RULE_XLABEL )
            {
            // InternalXMachine.g:4767:2: ( RULE_XLABEL )
            // InternalXMachine.g:4768:3: RULE_XLABEL
            {
             before(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXActionAccess().getNameXLABELTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXMachine.g:4777:1: rule__XAction__ActionAssignment_2 : ( ruleXPredicate ) ;
    public final void rule__XAction__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMachine.g:4781:1: ( ( ruleXPredicate ) )
            // InternalXMachine.g:4782:2: ( ruleXPredicate )
            {
            // InternalXMachine.g:4782:2: ( ruleXPredicate )
            // InternalXMachine.g:4783:3: ruleXPredicate
            {
             before(grammarAccess.getXActionAccess().getActionXPredicateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXPredicate();

            state._fsp--;

             after(grammarAccess.getXActionAccess().getActionXPredicateParserRuleCall_2_0()); 

            }


            }

        }
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFFFF0C2L,0x00003FFFFFFFFFFFL,0x0000000000000008L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L,0x0002000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x03FC000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xFFFFFFFFFFFFF0C0L,0x00003FFFFFFFFFFFL,0x0000000000000008L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0001C00000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x700C000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0001C00000000000L,0x0000000000000040L});

}
